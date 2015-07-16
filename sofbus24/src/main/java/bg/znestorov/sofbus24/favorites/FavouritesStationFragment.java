package bg.znestorov.sofbus24.favorites;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockListFragment;
import com.actionbarsherlock.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.databases.FavouritesDatabaseUtils;
import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.FragmentLifecycle;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.OrderTypeEnum;
import bg.znestorov.sofbus24.entity.SortTypeEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.favorites.FavouritesDeleteAllDialog.OnDeleteAllFavouritesListener;
import bg.znestorov.sofbus24.favorites.FavouritesOrderDialog.OnOrderChoiceListener;
import bg.znestorov.sofbus24.favorites.FavouritesRemoveDialog.OnRemoveFavouritesListener;
import bg.znestorov.sofbus24.favorites.FavouritesRenameDialog.OnRenameFavouritesListener;
import bg.znestorov.sofbus24.favorites.FavouritesSortDialog.OnSortChoiceListener;
import bg.znestorov.sofbus24.favorites.FavouritesSortTypeDialog.OnSortTypeChoiceListener;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.DrawableClickListener;
import bg.znestorov.sofbus24.utils.activity.SearchEditText;

/**
 * Favourites fragment responsible for visualizing the items from Favorites DB
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesStationFragment extends SherlockListFragment implements
        FragmentLifecycle, OnDeleteAllFavouritesListener,
        OnRenameFavouritesListener, OnRemoveFavouritesListener,
        OnOrderChoiceListener, OnSortChoiceListener, OnSortTypeChoiceListener {

    private Activity context;
    private GlobalEntity globalContext;

    private StationsDataSource stationsDataSource;
    private FavouritesDataSource favouritesDatasource;

    private boolean isHomeScreenFragment;

    private GridView gridViewFavourites;
    private SearchEditText searchEditText;
    private View emptyView;
    private TextView emptyTextView;

    private List<StationEntity> favouritesStations = new ArrayList<StationEntity>();

    public static FavouritesStationFragment getInstance(
            boolean isHomeScreenFragment) {
        FavouritesStationFragment favouritesStationFragment = new FavouritesStationFragment();

        Bundle bundle = new Bundle();
        bundle.putBoolean(Constants.BUNDLE_IS_HOME_SCREEN_FRAGMENT,
                isHomeScreenFragment);
        favouritesStationFragment.setArguments(bundle);

        return favouritesStationFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LanguageChange.selectLocale(getActivity());

        View myFragmentView = getFragmentView(inflater, container);

        // Set the context (activity) associated with this fragment
        context = getActivity();
        globalContext = (GlobalEntity) context.getApplicationContext();

        // Load the Favorites datasource and fill the list view with the
        // stations from the DB
        favouritesStations.clear();
        favouritesStations.addAll(loadFavouritesList(null));

        // Actions over layout fields
        initLayoutFields(myFragmentView);
        actionsOverSearchEditText();
        setAdapter();
        setEmptyListView();

        // Activate the option menu
        setHasOptionsMenu(true);

        return myFragmentView;
    }

    @Override
    public void onResumeFragment(Activity context) {
        FavouritesStationAdapter favouritesStationAdapter = getFavouritesStationAdapter();
        if (favouritesStationAdapter != null) {
            favouritesStations.clear();
            favouritesStations.addAll(loadFavouritesList(null));
            favouritesStationAdapter.setExpandedListItemValue();
            favouritesStationAdapter.notifyDataSetChanged();

            setEmptyListView();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int favouritesCount = favouritesStations.size();

        switch (item.getItemId()) {
            case R.id.action_favourites_remove_all:
                if (favouritesCount > 0) {
                    DialogFragment dialogFragment = FavouritesDeleteAllDialog
                            .newInstance();
                    dialogFragment.setTargetFragment(this, 0);
                    dialogFragment.show(getFragmentManager(), "dialog");
                } else {
                    Toast.makeText(
                            context,
                            Html.fromHtml(getString(R.string.fav_menu_remove_all_empty_toast)),
                            Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.action_favourites_sort:
                if (favouritesCount > 0) {
                    DialogFragment dialogFragment = FavouritesSortDialog
                            .newInstance();
                    dialogFragment.setTargetFragment(this, 0);
                    dialogFragment.show(getFragmentManager(), "dialog");
                } else {
                    Toast.makeText(
                            context,
                            Html.fromHtml(getString(R.string.fav_menu_remove_all_empty_toast)),
                            Toast.LENGTH_SHORT).show();
                }

                break;
        }

        return true;
    }

    @Override
    public void onDeleteAllFavouritesClicked() {
        favouritesStations.clear();
        getFavouritesStationAdapter().notifyDataSetChanged();

        FavouritesDatabaseUtils.deleteFavouriteDatabase(context);
        Toast.makeText(context,
                Html.fromHtml(getString(R.string.fav_menu_remove_all_toast)),
                Toast.LENGTH_SHORT).show();

        filterSearchEditText();
    }

    @Override
    public void onOrderChoosed(StationEntity station, OrderTypeEnum orderType) {
        if (favouritesDatasource == null) {
            favouritesDatasource = new FavouritesDataSource(context);
        }

        favouritesDatasource.open();
        favouritesDatasource.reorderStations(station, orderType);
        favouritesDatasource.close();

        favouritesStations.clear();
        favouritesStations.addAll(loadFavouritesList(null));

        getFavouritesStationAdapter().notifyDataSetChanged();

        filterSearchEditText();
    }

    @Override
    public void onSortChoosed(SortTypeEnum sortType) {
        switch (sortType) {
            case CUSTOM:
                onSortTypeChoosed(sortType);
                break;
            default:
                DialogFragment dialogFragment = FavouritesSortTypeDialog
                        .newInstance(sortType);
                dialogFragment.setTargetFragment(this, 0);
                dialogFragment.show(getFragmentManager(), "dialog");
                break;
        }
    }

    @Override
    public void onSortTypeChoosed(SortTypeEnum sortType) {
        // Set the user choosen sort type in a preference file
        FavouritesPreferences.setFavouritesSortType(context, sortType);

        // Reorder the favourites stations
        if (favouritesDatasource == null) {
            favouritesDatasource = new FavouritesDataSource(context);
        }

        favouritesDatasource.open();
        favouritesStations.clear();
        favouritesStations.addAll(favouritesDatasource
                .getAllStationsSorted(sortType));
        favouritesDatasource.close();

        getFavouritesStationAdapter().notifyDataSetChanged();

        Toast.makeText(context,
                Html.fromHtml(getString(R.string.fav_menu_sort_success)),
                Toast.LENGTH_SHORT).show();

        filterSearchEditText();
    }

    @Override
    public void onRemoveFavouritesClicked(StationEntity station) {

        ListAdapter listAdapter = getFavouritesListAdapter();

        if (listAdapter != null) {
            if (favouritesDatasource == null) {
                favouritesDatasource = new FavouritesDataSource(context);
            }

            favouritesDatasource.open();
            favouritesDatasource.deleteStation(station);
            favouritesDatasource.close();

            favouritesStations.clear();
            favouritesStations.addAll(loadFavouritesList(null));
            getFavouritesStationAdapter().notifyDataSetChanged();

            Toast.makeText(
                    context,
                    Html.fromHtml(String.format(context
                                    .getString(R.string.app_toast_remove_favourites),
                            station.getName(), station.getNumber())),
                    Toast.LENGTH_SHORT).show();

            // Check which type of station is changed (METRO or OTHER)
            if (stationsDataSource == null) {
                stationsDataSource = new StationsDataSource(context);
            }

            stationsDataSource.open();
            StationEntity dbStation = stationsDataSource.getStation(station);
            VehicleTypeEnum stationType = dbStation != null ? dbStation
                    .getType() : VehicleTypeEnum.BTT;
            stationsDataSource.open();

            if (stationType != VehicleTypeEnum.METRO1
                    && stationType != VehicleTypeEnum.METRO2) {
                globalContext.setVbChanged(true);
            }

            filterSearchEditText();
        }
    }

    @Override
    public void onRenameFavouritesClicked(String stationName,
                                          StationEntity station) {

        ListAdapter listAdapter = getFavouritesListAdapter();

        if (listAdapter != null) {
            if (favouritesDatasource == null) {
                favouritesDatasource = new FavouritesDataSource(context);
            }

            String oldStationName = station.getName();
            String newStationName = stationName;

            station.setName(newStationName);
            updateStation(station);

            favouritesStations.clear();
            favouritesStations.addAll(loadFavouritesList(null));
            getFavouritesStationAdapter().notifyDataSetChanged();

            Toast.makeText(
                    context,
                    Html.fromHtml(String.format(context
                                    .getString(R.string.app_toast_rename_favourites),
                            oldStationName, station.getNumber(),
                            newStationName, station.getNumber())),
                    Toast.LENGTH_LONG).show();

            filterSearchEditText();
        }
    }

    /**
     * Get the FragmentView for the fragment. It depends of the activity that
     * calls that Fragment (in case of the home screen or another activity -
     * ClosestStationsMap or DroidTrans)
     *
     * @param inflater  the view inflater
     * @param container the view group
     * @return the fragment view
     */
    private View getFragmentView(LayoutInflater inflater, ViewGroup container) {

        View myFragmentView;
        isHomeScreenFragment = getArguments().getBoolean(
                Constants.BUNDLE_IS_HOME_SCREEN_FRAGMENT);

        if (isHomeScreenFragment) {
            myFragmentView = inflater.inflate(
                    R.layout.activity_favourites_fragment, container, false);
        } else {
            myFragmentView = inflater.inflate(
                    R.layout.activity_favourites_fragment_dialog, container,
                    false);
        }

        return myFragmentView;
    }

    /**
     * Get the favourites list adapter by checking if there is a GridView or a
     * ListView
     *
     * @return the Favourites ListAdapter
     */
    private ListAdapter getFavouritesListAdapter() {
        ListAdapter listAdapter;
        if (gridViewFavourites == null) {
            listAdapter = getListAdapter();
        } else {
            listAdapter = gridViewFavourites.getAdapter();
        }

        return listAdapter;
    }

    /**
     * Get the favourites station adapter by checking if there is a GridView or
     * a ListView
     *
     * @return the FavouritesStationAdapter
     */
    private FavouritesStationAdapter getFavouritesStationAdapter() {
        FavouritesStationAdapter favouritesStationAdapter;
        if (gridViewFavourites == null) {
            favouritesStationAdapter = (FavouritesStationAdapter) getListAdapter();
        } else {
            favouritesStationAdapter = (FavouritesStationAdapter) gridViewFavourites
                    .getAdapter();
        }

        return favouritesStationAdapter;
    }

    /**
     * Update the station in the DB
     *
     * @param station the station with the new params
     */
    private void updateStation(StationEntity station) {
        if (favouritesDatasource == null) {
            favouritesDatasource = new FavouritesDataSource(context);
        }

        favouritesDatasource.open();
        favouritesDatasource.updateStation(station);
        favouritesDatasource.close();
    }

    /**
     * Load all stations, marked as favorites, according to a search text (if it
     * is left as empty - all favorites stations are loaded)
     *
     * @param searchText the search text (if null - return all favorites stations)
     * @return all stations, marked as favorites, according to a search text
     */
    private List<StationEntity> loadFavouritesList(String searchText) {
        List<StationEntity> favouritesList;

        if (favouritesDatasource == null) {
            favouritesDatasource = new FavouritesDataSource(context);
        }

        favouritesDatasource.open();
        if (searchText == null) {
            favouritesList = favouritesDatasource
                    .getAllStationsSorted(FavouritesPreferences
                            .getFavouritesSortType(context));
        } else {
            favouritesList = favouritesDatasource
                    .getStationsViaSearch(searchText);
        }
        favouritesDatasource.close();

        return favouritesList;
    }

    /**
     * Initialize the Layout fields
     *
     * @param myFragmentView the layout view
     */
    private void initLayoutFields(View myFragmentView) {
        searchEditText = (SearchEditText) myFragmentView
                .findViewById(R.id.favourites_search);
        gridViewFavourites = (GridView) myFragmentView
                .findViewById(R.id.favourites_list_grid_view);
        emptyView = myFragmentView
                .findViewById(R.id.favourites_list_empty_view);
        emptyTextView = (TextView) myFragmentView
                .findViewById(R.id.favourites_list_empty_text);
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
                filterSearchEditText();
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
     * Filter the favorites list according to the text in the search box
     */
    private void filterSearchEditText() {

        if (searchEditText != null) {
            String searchText = searchEditText.getText().toString();
            getFavouritesStationAdapter().getFilter().filter(searchText);
        }
    }

    /**
     * Set the adapter with the favourites stations (on the GridView or the
     * ListView)
     */
    private void setAdapter() {
        ArrayAdapter<StationEntity> adapter = new FavouritesStationAdapter(
                context, isHomeScreenFragment, emptyView, this,
                favouritesStations);
        if (gridViewFavourites == null) {
            setListAdapter(adapter);
        } else {
            gridViewFavourites.setAdapter(adapter);
        }
    }

    /**
     * Set empty message over the GridView or the ListView
     */
    private void setEmptyListView() {
        if (gridViewFavourites == null
                || ((BaseAdapter) gridViewFavourites.getAdapter()).isEmpty()) {

            // In case of GridView (in ListView this is automatically)
            if (emptyView != null) {
                emptyView.setVisibility(View.VISIBLE);
            }
        } else {
            emptyView.setVisibility(View.GONE);
        }

        emptyTextView.setText(Html
                .fromHtml(getString(R.string.fav_item_empty_list)));
    }
}