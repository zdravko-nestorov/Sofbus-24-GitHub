package bg.znestorov.sofbus24.main;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;

import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.history.HistoryAdapter;
import bg.znestorov.sofbus24.history.HistoryDeleteAllDialog;
import bg.znestorov.sofbus24.history.HistoryDeleteAllDialog.OnDeleteAllHistoryListener;
import bg.znestorov.sofbus24.history.HistoryEntity;
import bg.znestorov.sofbus24.history.HistoryOfSearches;
import bg.znestorov.sofbus24.metro.RetrieveMetroSchedule;
import bg.znestorov.sofbus24.schedule.ScheduleVehicleInfo;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.ListActivity;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;

/**
 * History activity containing information about the searches
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class History extends ListActivity implements
        OnDeleteAllHistoryListener {

    private final ArrayList<HistoryEntity> historyList = new ArrayList<HistoryEntity>();
    private Activity context;
    private ProgressBar loadingHistory;
    private View historyContent;
    private HistoryAdapter historyAdapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_history);

        // Get the current context
        context = History.this;

        // Initialize the ActionBar and the Layout fields
        initActionBar();
        initLayoutFields();
        setListAdapter();

        // Start an asynchronous task to load the data from the preferences file
        new RetrieveHistoryOfSearches().execute();
    }

    @Override
    protected void onResume() {
        super.onResume();

        refreshHistoryList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_history_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int searchesCount = historyList.size();

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_history_top:
                if (getListView() != null && searchesCount > 0) {
                    getListView().setSelectionFromTop(0, 0);
                }

                return true;
            case R.id.action_history_delete_all:
                if (searchesCount > 0) {
                    DialogFragment dialogFragment = HistoryDeleteAllDialog
                            .newInstance();
                    dialogFragment.show(getSupportFragmentManager(), "dialog");
                } else {
                    Toast.makeText(
                            context,
                            Html.fromHtml(getString(R.string.history_menu_remove_all_empty_toast)),
                            Toast.LENGTH_SHORT).show();
                }

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        HistoryEntity history = (HistoryEntity) getListAdapter().getItem(
                position);

        // Get the station number and station name of the search
        String searchNumber = Utils.getValueBetweenLast(
                history.getHistoryValue(), "(", ")").trim();
        String searchName = Utils
                .getValueBefore(history.getHistoryValue(), "(");
        VehicleTypeEnum historyType = history.getHistoryType();

        // Check the type of station and retrieve the information accordingly
        switch (historyType) {
            case METRO:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
            case BTT:

                // Get the corresponding station to the station number via the
                // stations database
                StationsDataSource stationDatasource = new StationsDataSource(
                        context);
                stationDatasource.open();
                StationEntity station = stationDatasource.getStation(searchNumber);
                stationDatasource.close();

                // Check if the station is existing in the database
                if (station == null) {
                    station = new StationEntity();
                    station.setNumber(searchNumber);
                    station.setName(searchName);
                }

                // Check what action to be taken - to retrieve METRO or PT
                // information
                if (historyType == VehicleTypeEnum.BTT) {
                    RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                            context, null, station, null,
                            HtmlRequestCodesEnum.SINGLE_RESULT);
                    retrieveVirtualBoards.getSumcInformation();
                } else {

                    // Set the metro station URL address
                    station.setCustomField(String.format(
                            Constants.METRO_STATION_URL, station.getNumber()));

                    // Getting the Metro schedule from the station URL address
                    ProgressDialog progressDialog = new ProgressDialog(context);
                    progressDialog.setMessage(Html.fromHtml(String.format(
                            getString(R.string.metro_loading_schedule),
                            station.getName(), station.getNumber())));
                    RetrieveMetroSchedule retrieveMetroSchedule = new RetrieveMetroSchedule(
                            context, progressDialog, station);
                    retrieveMetroSchedule.execute();
                }

                break;
            default:
                VehicleEntity vehicle = new VehicleEntity(searchNumber,
                        history.getHistoryType(), Utils.getValueBeforeLast(
                        history.getHistoryValue(), "(").trim());
                new ScheduleVehicleInfo(context, this).onListItemClick(vehicle,
                        getVehicleCaption(context, vehicle));

                break;
        }
    }

    /**
     * Initialize the ActionBar
     */
    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.history_title));
    }

    /**
     * Initialize the Layout fields
     */
    private void initLayoutFields() {
        loadingHistory = (ProgressBar) findViewById(R.id.history_loading);
        historyContent = findViewById(R.id.history_content);
    }

    /**
     * Set the list adapter
     */
    private void setListAdapter() {
        historyAdapter = new HistoryAdapter(context, historyList);
        setListAdapter(historyAdapter);
    }

    /**
     * Refresh the content of the history list
     */
    private void refreshHistoryList() {
        // Check if there is the ListView is already created
        ListView listView = getListView();
        if (listView != null) {

            // Start an asynchronous task to refresh the history data
            new RetrieveHistoryOfSearches().execute();

            // If there are some items in the list after the refresh, scroll the
            // ListView to the top
            if (historyList != null && historyList.size() > 0) {
                listView.setSelectionFromTop(0, 0);
            }
        }
    }

    @Override
    public void onDeleteAllHistoryClicked() {
        HistoryOfSearches.getInstance(context).clearHistoryOfSearches();
        historyList.clear();
        historyAdapter.notifyDataSetChanged();

        Toast.makeText(
                context,
                Html.fromHtml(getString(R.string.history_menu_remove_all_toast)),
                Toast.LENGTH_SHORT).show();
    }

    /**
     * Get the vehicle caption according to the vehicle type
     *
     * @param context the current activity context
     * @param vehicle the vehicle on the current row
     * @return the vehicle caption in format: <b>Bus xxx</b>
     */
    private String getVehicleCaption(Context context, VehicleEntity vehicle) {
        String vehicleCaption;

        switch (vehicle.getType()) {
            case BUS:
                vehicleCaption = String.format(
                        context.getString(R.string.sch_item_bus),
                        vehicle.getNumber());
                break;
            case TROLLEY:
                vehicleCaption = String.format(
                        context.getString(R.string.sch_item_trolley),
                        vehicle.getNumber());
                break;
            case TRAM:
                vehicleCaption = String.format(
                        context.getString(R.string.sch_item_tram),
                        vehicle.getNumber());
                break;
            default:
                vehicleCaption = String.format(
                        context.getString(R.string.sch_item_bus),
                        vehicle.getNumber());
                break;
        }

        return vehicleCaption;
    }

    @SuppressLint("StaticFieldLeak")
    private class RetrieveHistoryOfSearches extends
            AsyncTask<Void, Void, ArrayList<HistoryEntity>> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            ActivityUtils.lockScreenOrientation(context);

            loadingHistory.setVisibility(View.VISIBLE);
            historyContent.setVisibility(View.INVISIBLE);
        }

        @Override
        protected ArrayList<HistoryEntity> doInBackground(Void... params) {
            return HistoryOfSearches.getInstance(context).getHistoryOfSearches(
                    context);
        }

        @Override
        protected void onPostExecute(ArrayList<HistoryEntity> retrievedHistory) {
            super.onPostExecute(retrievedHistory);

            loadingHistory.setVisibility(View.INVISIBLE);
            historyContent.setVisibility(View.VISIBLE);

            historyList.clear();
            historyList.addAll(retrievedHistory);
            historyAdapter.notifyDataSetChanged();

            ActivityUtils.unlockScreenOrientation(context);
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            ActivityUtils.unlockScreenOrientation(context);
        }
    }
}