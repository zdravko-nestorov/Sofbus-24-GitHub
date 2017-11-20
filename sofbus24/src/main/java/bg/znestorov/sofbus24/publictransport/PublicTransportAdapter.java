package bg.znestorov.sofbus24.publictransport;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.TranslatorLatinToCyrillic;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;

/**
 * Array Adapted user for set each row a station from the SKGT site
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class PublicTransportAdapter extends ArrayAdapter<StationEntity>
        implements Filterable {

    private final Activity context;
    private final FavouritesDataSource favouritesDatasource;

    private final TextView emptyList;
    private final String directionName;

    private final List<StationEntity> originalStations;
    private final String language;
    private List<StationEntity> filteredStations;
    private Filter stationsFilter;

    public PublicTransportAdapter(Activity context, TextView emptyList,
                                  String directionName, List<StationEntity> stations) {
        super(context, R.layout.activity_public_transport_list_item, stations);

        this.context = context;
        this.favouritesDatasource = new FavouritesDataSource(context);
        this.language = LanguageChange.getUserLocale(context);

        this.emptyList = emptyList;
        this.directionName = directionName;

        this.originalStations = stations;
        this.filteredStations = stations;

        this.stationsFilter = createFilter();
    }

    /**
     * Creating the elements of the ListView
     */
    @Override
    @SuppressLint("InflateParams")
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;

        // Reuse views
        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(
                    R.layout.activity_public_transport_list_item, null);

            // Configure view holder
            viewHolder = new ViewHolder();
            viewHolder.addToFavourites = (ImageView) rowView
                    .findViewById(R.id.pt_item_favourite);
            viewHolder.stationName = (TextView) rowView
                    .findViewById(R.id.pt_item_station_name);
            viewHolder.stationNumber = (TextView) rowView
                    .findViewById(R.id.pt_item_station_number);
            viewHolder.stationVBTime = (ImageView) rowView
                    .findViewById(R.id.pt_item_virtual_boards);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        // Fill the data
        StationEntity station = filteredStations.get(position);
        viewHolder.addToFavourites.setImageResource(getFavouriteImage(station));
        viewHolder.stationName.setText(Html.fromHtml(station.getName()));
        viewHolder.stationNumber.setText(String.format(
                context.getString(R.string.pt_item_station_number_text),
                station.getNumber()));

        // Set the actions over the ImageView and ImageButton
        actionsOverFavouritesImageViews(viewHolder, station);

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
        return filteredStations.isEmpty();
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

                if (isEmpty()) {
                    emptyList.setText(Html.fromHtml(String.format(
                            context.getString(R.string.pt_empty_list),
                            constraint, directionName)));
                }
            }
        };
    }

    /**
     * Get the favorites image according to this if exists in the Favorites
     * Database
     *
     * @param station the station on the current row
     * @return the station image id
     */
    private Integer getFavouriteImage(StationEntity station) {
        Integer favouriteImage;

        favouritesDatasource.open();
        if (favouritesDatasource.getStation(station) == null) {
            favouriteImage = R.drawable.ic_fav_empty;
        } else {
            favouriteImage = R.drawable.ic_fav_full;
        }
        favouritesDatasource.close();

        return favouriteImage;
    }

    /**
     * Click listeners over the addFavourites image
     *
     * @param viewHolder holder containing all elements in the layout
     * @param station    the station on the current row
     */
    private void actionsOverFavouritesImageViews(final ViewHolder viewHolder,
                                                 final StationEntity station) {

        // Add onClickListener over the addToFavourites ImageView
        viewHolder.addToFavourites.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                ActivityUtils.toggleFavouritesStation(context,
                        favouritesDatasource, station,
                        viewHolder.addToFavourites);
            }
        });

        // Add onClickListener over the VirtualBoards ImageButton
        viewHolder.stationVBTime.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                        context, null, station, null,
                        HtmlRequestCodesEnum.SINGLE_RESULT);
                retrieveVirtualBoards.getSumcInformation();
            }
        });
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        ImageView addToFavourites;
        TextView stationName;
        TextView stationNumber;
        ImageView stationVBTime;
    }
}