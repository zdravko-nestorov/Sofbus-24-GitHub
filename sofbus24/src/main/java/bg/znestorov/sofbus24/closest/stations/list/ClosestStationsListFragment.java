package bg.znestorov.sofbus24.closest.stations.list;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

import org.xms.g.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.RefreshableListFragment;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.metro.RetrieveMetroSchedule;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.DrawableClickListener;
import bg.znestorov.sofbus24.utils.activity.SearchEditText;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;

/**
 * Fragment used to show all closest stations to the current location. It shows
 * 10 stations per page and dynamically size itself on list scroll.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ClosestStationsListFragment extends ListFragment implements
        RefreshableListFragment {

    private static final String SAVED_STATE_STATIONS_COUNT_KEY = "Closest stations count";
    private static final String SAVED_STATE_SEARCH_TEXT_KEY = "Closest Stations Search Text";
    private final List<StationEntity> searchStationList = new ArrayList<StationEntity>();
    private Activity context;
    private LatLng currentLocation;
    private StationsDataSource stationsDatasource;
    private int closestStationsCount;
    private String closestStationsSearchText = "";
    private boolean isListLoading = false;
    private boolean isListFullLoaded = false;
    private ArrayAdapter<StationEntity> closestStationsAdapter;

    public static ClosestStationsListFragment newInstance(LatLng currentLocation) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.BUNDLE_CLOSEST_STATIONS_LIST,
                currentLocation);

        ClosestStationsListFragment closestStationsListFragment = new ClosestStationsListFragment();
        closestStationsListFragment.setArguments(bundle);

        return closestStationsListFragment;
    }

    @Override
    @SuppressWarnings("StaticFieldLeak")
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Create endless ListView (has to be in this method, as it is called
        // after the view is created)
        getListView().setOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem,
                                 int visibleItemCount, final int totalItemCount) {
                // Check if the list is finished loading (if not using this, it
                // will load a lot of times in a row)
                if (!isListLoading) {

                    // Check if all of the items are already shown on the screen
                    if (totalItemCount < 10) {
                        isListFullLoaded = true;
                    } else if (view.getLastVisiblePosition() + 1 > totalItemCount - 5
                            && !isListFullLoaded) {
                        isListLoading = true;

                        // Start an AsyncTask to load the new stations from the
                        // database
                        new AsyncTask<Void, Void, List<StationEntity>>() {
                            @Override
                            protected List<StationEntity> doInBackground(
                                    Void... params) {
                                int pageToLoad = (totalItemCount + 10) / 10;
                                return loadStationsList(true, pageToLoad,
                                        closestStationsSearchText);
                            }

                            @Override
                            protected void onPostExecute(
                                    List<StationEntity> closestStations) {
                                isListLoading = false;
                                if (closestStations.size() > 0) {
                                    searchStationList.addAll(closestStations);
                                    closestStationsCount = searchStationList
                                            .size();

                                    closestStationsAdapter
                                            .notifyDataSetChanged();
                                } else {
                                    isListFullLoaded = true;
                                }
                            }

                        }.execute();
                    }
                }
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(
                R.layout.activity_closest_stations_list_fragment, container,
                false);

        // Set the context (activity) associated with this fragment
        context = getActivity();

        // Find the SearchEditText in the layout
        SearchEditText searchEditText = (SearchEditText) context
                .findViewById(R.id.cs_list_search);

        // Get Bundle arguments
        Bundle bundle = getArguments();
        currentLocation = LatLng.dynamicCast(bundle
                .get(Constants.BUNDLE_CLOSEST_STATIONS_LIST));

        // Get the already loaded stations (in case of orientation change)
        if (savedInstanceState != null) {
            closestStationsCount = savedInstanceState
                    .getInt(SAVED_STATE_STATIONS_COUNT_KEY);
            closestStationsSearchText = savedInstanceState
                    .getString(SAVED_STATE_SEARCH_TEXT_KEY);
        } else {
            closestStationsCount = 10;
            closestStationsSearchText = searchEditText.getText().toString();
        }

        // Set the actions over the SearchEditText
        actionsOverSearchEditText(searchEditText);

        // Load the closest stations
        stationsDatasource = new StationsDataSource(context);

        // Set the ArrayList to the Fragment
        setListFragmentAdapter();

        return myFragmentView;
    }

    @Override
    public void onResume() {
        super.onResume();

        if (closestStationsAdapter != null) {
            closestStationsAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onFragmentRefresh(Object obj, String emptyText) {
        closestStationsCount = 10;
        currentLocation = LatLng.dynamicCast(obj);

        setListFragmentAdapter();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt(SAVED_STATE_STATIONS_COUNT_KEY,
                closestStationsCount);
        savedInstanceState.putString(SAVED_STATE_SEARCH_TEXT_KEY,
                closestStationsSearchText);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        StationEntity station = (StationEntity) getListAdapter().getItem(
                position);

        // Getting the time of arrival of the vehicles
        String stationCustomField = station.getCustomField();
        String metroCustomField = String.format(Constants.METRO_STATION_URL,
                station.getNumber());

        // Check if the type of the station - BTT or METRO
        if (!stationCustomField.equals(metroCustomField)) {
            RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                    context, null, station, null, HtmlRequestCodesEnum.SINGLE_RESULT);
            retrieveVirtualBoards.getSumcInformation();
        } else {
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(Html.fromHtml(String.format(
                    context.getString(R.string.metro_loading_schedule),
                    station.getName(), station.getNumber())));
            RetrieveMetroSchedule retrieveMetroSchedule = new RetrieveMetroSchedule(
                    context, progressDialog, station);
            retrieveMetroSchedule.execute();
        }
    }

    /**
     * Modify the Search EditText field and activate the listeners
     *
     * @param searchEditText the search EditText
     */
    private void actionsOverSearchEditText(final SearchEditText searchEditText) {
        // TODO: Find a way to set an alphanumeric keyboard with numeric as
        // default
        searchEditText.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        searchEditText.setFilters(new InputFilter[]{ActivityUtils
                .createInputFilter()});

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
                // Check if the text is really changed or this is called because
                // of the activity started
                if (!closestStationsSearchText.equals(s.toString())) {
                    closestStationsCount = 10;
                    isListFullLoaded = false;

                    closestStationsSearchText = searchEditText.getText()
                            .toString();
                    setListFragmentAdapter();
                }
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
     * Assign an ArrayList to the ListFragment
     */
    private void setListFragmentAdapter() {
        searchStationList.clear();
        searchStationList.addAll(loadStationsList(false, closestStationsCount,
                closestStationsSearchText));

        if (closestStationsAdapter == null) {
            closestStationsAdapter = new ClosestStationsListAdapter(context,
                    currentLocation, searchStationList);
            setListAdapter(closestStationsAdapter);
        } else {
            closestStationsAdapter.notifyDataSetChanged();

            // In case of not empty list position the scroll at the beginning
            if (searchStationList.size() > 0) {
                getListView().setSelectionFromTop(0, 0);
            }
        }
    }

    /**
     * Load all stations according to the searched text ordered by their
     * position to the current location (shows as much as the stationPage
     * multiplied by 10)
     *
     * @param loadByPage         point if the method is called to load a page or a whole list
     *                           with stations
     * @param stationPageOrCount shows which part results to show (each part contains 10
     *                           stations)
     * @param searchText         the search text (if null - return all stations of the current
     *                           tab type)
     * @return all stations according to a search text ordered by their position
     * to the current location
     */
    private List<StationEntity> loadStationsList(boolean loadByPage,
                                                 int stationPageOrCount, String searchText) {
        List<StationEntity> stationsList;

        if (stationsDatasource == null) {
            stationsDatasource = new StationsDataSource(context);
        }

        stationsDatasource.open();
        if (loadByPage) {
            // Set to false at each time of new search by page
            isListFullLoaded = false;
            stationsList = stationsDatasource.getClosestStationsByPage(
                    currentLocation, stationPageOrCount, searchText);
        } else {
            stationsList = stationsDatasource.getClosestStations(
                    currentLocation, stationPageOrCount, searchText);
        }
        stationsDatasource.close();

        return stationsList;
    }
}
