package bg.znestorov.sofbus24.metro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.main.StationRouteMap;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.DrawableClickListener;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;
import bg.znestorov.sofbus24.utils.activity.SearchEditText;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;

/**
 * Metro Station Fragment containing information about the metro stations
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class MetroStationFragment extends ListFragment implements
        OnItemClickListener {

    private static final String BUNDLE_SEARCH_TEXT = "SEARCH TEXT";
    private Activity context;
    private SearchEditText searchEditText;
    private GridView gridViewMetroStation;
    private View emptyView;
    private TextView emptyTextView;
    private int currentDirection;
    private MetroLoadStations mls;
    private MetroStationAdapter metroStationAdapter;
    private ArrayList<StationEntity> stationsList = new ArrayList<StationEntity>();
    private String searchText;

    public static MetroStationFragment newInstance(int currentDirection) {
        MetroStationFragment metroStationFragment = new MetroStationFragment();

        Bundle bundle = new Bundle();
        bundle.putInt(Constants.BUNDLE_METRO_SCHEDULE, currentDirection);
        metroStationFragment.setArguments(bundle);

        return metroStationFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(
                R.layout.activity_metro_station_fragment, container, false);

        // Set the context (activity) associated with this fragment
        context = getActivity();

        // Get the needed fragment information
        initInformation(savedInstanceState);

        // Find all of TextView and SearchEditText tabs in the layout
        initLayoutFields(fragmentView);

        // Activate the option menu
        setHasOptionsMenu(true);

        return fragmentView;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString(BUNDLE_SEARCH_TEXT, searchText);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        StationEntity station = ((MetroStationAdapter) getListAdapter())
                .getItem(position);
        onListItemClick(station);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        StationEntity station = ((MetroStationAdapter) gridViewMetroStation
                .getAdapter()).getItem(position);
        onListItemClick(station);
    }

    /**
     * Retrieve an information about the selected metro station
     *
     * @param station the selected station
     */
    private void onListItemClick(StationEntity station) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(Html.fromHtml(String.format(
                getString(R.string.metro_loading_schedule), station.getName(),
                station.getNumber())));

        RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                context, null, station, null, HtmlRequestCodesEnum.SINGLE_RESULT);
        retrieveVirtualBoards.getSumcInformation();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        ProgressDialog progressDialog = new ProgressDialog(context);

        switch (item.getItemId()) {
            case R.id.action_metro_map_route:
                progressDialog
                        .setMessage(getString(R.string.metro_menu_map_route_loading));
                RetrieveMetroRoute retrieveMetroRoute = new RetrieveMetroRoute(
                        context, progressDialog);
                retrieveMetroRoute.execute();

                break;
            case R.id.action_metro_schedule_site:
                ActivityUtils.startWebPageActivity(context, new VehicleEntity(
                        VehicleTypeEnum.METRO));

                break;
        }

        return true;
    }

    /**
     * Initialize the MetroLoadStation object and all the data from the
     * SavedInstanceState object
     *
     * @param savedInstanceState object containing the state of the saved values
     */
    private void initInformation(Bundle savedInstanceState) {
        // Get the values from the Bundle
        if (savedInstanceState != null) {
            searchText = savedInstanceState.getString(BUNDLE_SEARCH_TEXT);
        } else {
            searchText = "";
        }

        // Get the current direction from the Bundle
        currentDirection = getArguments().getInt(
                Constants.BUNDLE_METRO_SCHEDULE);

        // Get the information about the current direction
        mls = MetroLoadStations.getInstance(context);
        stationsList = mls.getDirectionList(currentDirection);
    }

    /**
     * Initialize the layout fields and assign the appropriate listeners over
     * them (directions tabs (TextViews), SearchEditText and EmptyList
     * (TextView))
     *
     * @param fragmentView the current view of the fragment
     */
    private void initLayoutFields(View fragmentView) {
        searchEditText = (SearchEditText) fragmentView
                .findViewById(R.id.metro_station_search);
        emptyView = fragmentView
                .findViewById(R.id.metro_station_list_empty_view);
        emptyTextView = (TextView) fragmentView
                .findViewById(R.id.metro_station_list_empty_text);

        // Set on click listener over the grid view and hide the empty view in
        // the beginning (if the ListFragment uses a GridView)
        gridViewMetroStation = (GridView) fragmentView
                .findViewById(R.id.metro_station_list_grid_view);
        if (gridViewMetroStation != null) {
            gridViewMetroStation.setOnItemClickListener(this);
            emptyView.setVisibility(View.GONE);
        }

        // Use custom ArrayAdapter to show the elements in the ListView
        setAdapter();

        // Set the actions over the SearchEditText
        actionsOverSearchEditText();
    }

    /**
     * According to the current direction assign the appropriate adapter to the
     * list fragment
     */
    private void setAdapter() {
        metroStationAdapter = new MetroStationAdapter(context, this, emptyView,
                emptyTextView, mls.getDirectionName(currentDirection, false,
                false), stationsList);

        if (gridViewMetroStation == null) {
            setListAdapter(metroStationAdapter);
        } else {
            gridViewMetroStation.setAdapter(metroStationAdapter);
        }
    }

    /**
     * Modify the Search EditText field and activate the listeners
     */
    private void actionsOverSearchEditText() {
        // TODO: Find a way to set an alphanumeric keyboard with numeric as
        // default
        searchEditText.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        searchEditText.setFilters(new InputFilter[]{ActivityUtils
                .createInputFilter()});
        searchEditText.setText(searchText);

        // Add on focus listener
        searchEditText.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    ActivityUtils.hideKeyboard(context, searchEditText);
                }
            }
        });

        // Add on text changes listener
        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                searchText = searchEditText.getText().toString();
                metroStationAdapter.getFilter().filter(searchText);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
        });

        // Add a drawable listeners (search and clear icons)
        searchEditText.setDrawableClickListener(new DrawableClickListener() {
            @Override
            public void onClick(DrawablePosition target) {
                switch (target) {
                    case LEFT:
                        searchEditText.requestFocus();
                        searchEditText.setSelection(searchEditText.getText()
                                .length());
                        ActivityUtils.showKeyboard(context, searchEditText);
                        break;
                    case RIGHT:
                        searchEditText.setText("");
                        break;
                    default:
                        break;
                }
            }

        });
    }

    /**
     * Asynchronous class used for retrieving the Metro route
     *
     * @author Zdravko Nestorov
     */
    @SuppressLint("StaticFieldLeak")
    public class RetrieveMetroRoute extends AsyncTask<Void, Void, Intent> {

        private final Activity context;
        private final GlobalEntity globalContext;
        private final ProgressDialog progressDialog;

        public RetrieveMetroRoute(Activity context,
                                  ProgressDialog progressDialog) {
            this.context = context;
            this.globalContext = (GlobalEntity) context.getApplicationContext();
            this.progressDialog = progressDialog;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            createLoadingView();
        }

        @Override
        protected Intent doInBackground(Void... params) {
            Intent metroMapRouteIntent = new Intent(context,
                    StationRouteMap.class);

            VehicleEntity metroVehicle;
            switch (currentDirection) {
                case 0:
                    metroVehicle = new VehicleEntity("1", VehicleTypeEnum.METRO1,
                            mls.getDirectionName(currentDirection, false, true));
                    break;
                default:
                    metroVehicle = new VehicleEntity("1", VehicleTypeEnum.METRO2,
                            mls.getDirectionName(currentDirection, false, true));
                    break;
            }

            DirectionsEntity metroDirectionsEntity = new DirectionsEntity(
                    metroVehicle, currentDirection,
                    mls.getMetroDirectionsNames(), mls.getMetroDirectionsList());
            metroMapRouteIntent.putExtra(Constants.BUNDLE_STATION_ROUTE_MAP,
                    metroDirectionsEntity);

            return metroMapRouteIntent;
        }

        @Override
        protected void onPostExecute(Intent metroMapRouteIntent) {
            super.onPostExecute(metroMapRouteIntent);

            if (!globalContext.areServicesAvailable()) {
                GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                        .newInstance(getString(R.string.app_google_play_msg));
                googlePlayServicesErrorDialog.show(getFragmentManager(),
                        "GooglePlayServicesErrorDialog");
            } else {
                context.startActivity(metroMapRouteIntent);
            }

            dismissLoadingView();
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            dismissLoadingView();
        }

        /**
         * Create the loading view and lock the screen
         */
        private void createLoadingView() {
            ActivityUtils.lockScreenOrientation(context);

            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog
                    .setOnCancelListener(new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialog) {
                            cancel(true);
                        }
                    });
            progressDialog.show();
        }

        /**
         * Dismiss the loading view and unlock the screen
         */
        private void dismissLoadingView() {
            try {
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            } catch (Exception e) {
                /**
                 * Fixing a strange error that is happening sometimes when the
                 * dialog is dismissed. I guess sometimes activity gets finished
                 * before the dialog successfully dismisses.
                 *
                 * java.lang.IllegalArgumentException: View not attached to
                 * window manager
                 */
            }

            ActivityUtils.unlockScreenOrientation(context);
        }
    }

}