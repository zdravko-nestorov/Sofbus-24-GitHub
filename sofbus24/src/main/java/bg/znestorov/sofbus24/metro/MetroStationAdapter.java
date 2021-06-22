package bg.znestorov.sofbus24.metro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.MetroStationEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.main.StationMap;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.TranslatorLatinToCyrillic;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;

/**
 * Array Adapted user for set each row a station from the Vehicles DB
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class MetroStationAdapter extends ArrayAdapter<StationEntity> {

    private final Activity context;
    private final GlobalEntity globalContext;

    private final MetroStationFragment metroStationFragment;
    private final FavouritesDataSource favouritesDatasource;

    private final View emptyView;
    private final TextView emptyTextView;
    private final String directionName;

    private final List<StationEntity> originalStations;
    private final boolean isPhoneDevice;
    private final String language;
    private List<StationEntity> filteredStations;
    private Filter stationsFilter;

    public MetroStationAdapter(Activity context,
                               MetroStationFragment metroStationFragment, View emptyView,
                               TextView emptyTextView, String directionName,
                               List<StationEntity> stations) {
        super(context, R.layout.activity_metro_station_list_item, stations);

        this.context = context;
        this.globalContext = (GlobalEntity) context.getApplicationContext();
        this.isPhoneDevice = globalContext.isPhoneDevice();

        this.metroStationFragment = metroStationFragment;
        this.favouritesDatasource = new FavouritesDataSource(context);
        this.language = LanguageChange.getUserLocale(context);

        this.emptyView = emptyView;
        this.emptyTextView = emptyTextView;
        this.directionName = directionName;

        this.originalStations = stations;
        this.filteredStations = stations;

        this.stationsFilter = createFilter();
    }

    /**
     * Creating the elements of the ListView
     */
    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;

        // Reuse views
        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(
                    R.layout.activity_metro_station_list_item, null);

            // Configure view holder
            viewHolder = new ViewHolder();
            viewHolder.stationIcon = (ImageView) rowView
                    .findViewById(R.id.metro_item_station_icon);
            viewHolder.stationName = (TextView) rowView
                    .findViewById(R.id.metro_item_station_name);
            viewHolder.stationNumber = (TextView) rowView
                    .findViewById(R.id.metro_item_station_number);
            viewHolder.stationSettings = (ImageButton) rowView
                    .findViewById(R.id.metro_item_settings_icon);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        // In case of a tablet - put border between GridView items
        if (!isPhoneDevice) {
            rowView.setBackgroundResource(R.drawable.grid_border);
            int pixels = ActivityUtils.dpToPx(context, 8);
            rowView.setPadding(pixels, pixels, pixels, pixels);
        }

        // Fill the data
        StationEntity station = filteredStations.get(position);
        String stationName = Utils.getValueAfter(station.getName(), " ").trim();
        String stationNumber = String.format(
                context.getString(R.string.metro_item_station_number_text),
                station.getNumber());

        viewHolder.stationIcon.setImageResource(getMetroImage(station));
        viewHolder.stationName.setText(stationName);
        viewHolder.stationNumber.setText(stationNumber);

        // Actions over the settings button
        actionsOverSettingsButton(viewHolder.stationSettings, station);

        return rowView;
    }

    @Override
    public StationEntity getItem(int position) {
        return filteredStations.get(position);
    }

    @Override
    public int getCount() {
        return filteredStations != null ? filteredStations.size() : 0;
    }

    @Override
    public boolean isEmpty() {
        return filteredStations != null && filteredStations.isEmpty();
    }

    /**
     * Filter the ListView according some criteria (filter)
     *
     * @return a filter constrains data with a filtering pattern
     */
    @Override
    public Filter getFilter() {
        if (stationsFilter == null) {
            stationsFilter = createFilter();
        }

        return stationsFilter;
    }

    /**
     * Create a custom filter, so process the list on searching
     *
     * @return a custom filter
     */
    @SuppressLint("DefaultLocale")
    private Filter createFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();

                // If there's nothing to filter on, return the original data for
                // your list
                if (constraint == null || constraint.length() == 0) {
                    results.values = originalStations;
                    results.count = originalStations.size();
                } else {
                    List<StationEntity> filterResultsData = new ArrayList<StationEntity>();

                    String filterString = constraint.toString().trim()
                            .toUpperCase();
                    if ("bg".equals(language)) {
                        filterString = TranslatorLatinToCyrillic.translate(
                                context, filterString);
                    } else {
                        filterString = TranslatorCyrillicToLatin.translate(
                                context, filterString);
                    }

                    String filterableName;
                    String filterableNumber;

                    // Iterate over all stations and search which ones match
                    // the filter
                    for (StationEntity station : originalStations) {
                        filterableName = station.getName().toUpperCase();
                        filterableNumber = station.getNumber().toUpperCase();

                        if (filterableName.contains(filterString)
                                || filterableNumber.contains(filterString)) {
                            filterResultsData.add(station);
                        }
                    }

                    results.values = filterResultsData;
                    results.count = filterResultsData.size();
                }

                return results;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint,
                                          FilterResults filterResults) {
                filteredStations = (ArrayList<StationEntity>) filterResults.values;

                notifyDataSetChanged();
                setEmptyListView(constraint);
            }
        };
    }

    /**
     * Get the favorites image according to the station type
     *
     * @param station the station on the current row
     * @return the station image id
     */
    private Integer getMetroImage(StationEntity station) {
        Integer favouriteImage;
        Integer stationNumber = Integer.parseInt(station.getNumber());

        if (stationNumber <= 3000) {
            favouriteImage = R.drawable.ic_metro_2;
        } else {
            favouriteImage = R.drawable.ic_metro_1;
        }

        return favouriteImage;
    }

    /**
     * Assign a "onClickListener(...)" over the ImageButton
     *
     * @param stationSettings the settings image button
     * @param station         the station on the current row
     */
    @SuppressLint("NewApi")
    private void actionsOverSettingsButton(ImageButton stationSettings,
                                           final StationEntity station) {
        stationSettings.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.metro_item_settings_icon:
                        // Implement different types of Popup menu, because the
                        // implementation is different for HONEYCOMB and others
                        // higher than it
                        PopupMenu popup = new PopupMenu(context, v);
                        Menu menu = popup.getMenu();
                        popup.getMenuInflater().inflate(
                                R.menu.activity_metro_station_context_menu,
                                menu);
                        popup.show();

                        // Find the add/remove menu items
                        MenuItem favouritesAdd = menu
                                .findItem(R.id.menu_metro_station_add);
                        MenuItem favouritesRemove = menu
                                .findItem(R.id.menu_metro_station_remove);

                        // Check which menu item to be visible
                        favouritesDatasource.open();
                        StationEntity favouritesStation = favouritesDatasource
                                .getStation(station);
                        if (favouritesStation != null) {
                            favouritesAdd.setVisible(false);
                            favouritesRemove.setVisible(true);
                        } else {
                            favouritesAdd.setVisible(true);
                            favouritesRemove.setVisible(false);
                        }
                        favouritesDatasource.close();

                        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(
                                    MenuItem item) {
                                return menuItemClicks(item.getItemId(), station);
                            }
                        });
                }
            }
        });
    }

    /**
     * Assign different actions over each item in the menu
     *
     * @param id      the menu id
     * @param station the selected station
     * @return true
     */
    private boolean menuItemClicks(int id, StationEntity station) {
        switch (id) {
            case R.id.menu_metro_station_add:
                ActivityUtils.addToFavourites(context, favouritesDatasource,
                        station);
                break;
            case R.id.menu_metro_station_remove:
                ActivityUtils.removeFromFavourites(context, favouritesDatasource,
                        station);
                break;
            case R.id.menu_metro_station_map:
                if (!globalContext.areServicesAvailable()) {
                    GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                            .newInstance(context
                                    .getString(R.string.app_google_play_msg));
                    googlePlayServicesErrorDialog.show(
                            metroStationFragment.getFragmentManager(),
                            "GooglePlayServicesErrorDialog");
                } else {
                    Intent metroMapIntent = new Intent(context, StationMap.class);
                    metroMapIntent.putExtra(Constants.BUNDLE_STATION_MAP,
                            new MetroStationEntity(station));
                    context.startActivity(metroMapIntent);
                    break;
                }
        }

        return true;
    }

    /**
     * Set the empty list text
     *
     * @param constraint the constraint entered by the user
     */
    private void setEmptyListView(CharSequence constraint) {
        if (isEmpty()) {
            if (emptyView != null) {
                emptyView.setVisibility(View.VISIBLE);
            }

            emptyTextView.setText(Html.fromHtml(String.format(
                    context.getString(R.string.metro_item_empty_list),
                    constraint, directionName)));
        } else {
            if (emptyView != null) {
                emptyView.setVisibility(View.GONE);
            }
        }
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        ImageView stationIcon;
        TextView stationName;
        TextView stationNumber;
        ImageButton stationSettings;
    }
}