package bg.znestorov.sofbus24.virtualboards;

import static bg.znestorov.sofbus24.utils.activity.ActivityUtils.setFavouritesStation;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Array Adapted user for set each row a station from the Vehicles DB
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class VirtualBoardsAdapter extends ArrayAdapter<StationEntity> {

    private final Activity context;
    private final FavouritesDataSource favouritesDatasource;
    private final List<StationEntity> stations;

    private final boolean isPhoneDevice;

    public VirtualBoardsAdapter(Activity context, List<StationEntity> stations) {
        super(context, R.layout.activity_virtual_boards_list_item, stations);

        this.context = context;
        this.isPhoneDevice = ((GlobalEntity) context.getApplicationContext())
                .isPhoneDevice();
        this.stations = stations;
        this.favouritesDatasource = new FavouritesDataSource(context);
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
                    R.layout.activity_virtual_boards_list_item, null);

            // Configure view holder
            viewHolder = new ViewHolder();
            viewHolder.addToFavourites = (ImageView) rowView
                    .findViewById(R.id.vb_item_favourite);
            viewHolder.stationName = (TextView) rowView
                    .findViewById(R.id.vb_item_station_name);
            viewHolder.stationNumber = (TextView) rowView
                    .findViewById(R.id.vb_item_station_number);
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
        StationEntity station = stations.get(position);

        // Favorites button
        setFavouritesStation(context, favouritesDatasource, station, viewHolder.addToFavourites);

        // Station name & number
        viewHolder.stationName.setText(Html.fromHtml(station.getName()));

        String stationTitle = station.isMetroStationByType()
                ? context.getString(R.string.vb_item_metro_station_number_text)
                : context.getString(R.string.vb_item_station_number_text);
        viewHolder.stationNumber.setText(String.format(
                stationTitle,
                station.getNumber()));

        // Set the actions over the ImageView
        actionsOverFavouritesImageViews(viewHolder, station);

        return rowView;
    }

    @Override
    public int getCount() {
        return stations == null ? 0 : stations.size();
    }

    /**
     * Click listeners over the addFavourites image
     *
     * @param viewHolder holder containing all elements in the layout
     * @param station    the station on the current row
     */
    private void actionsOverFavouritesImageViews(final ViewHolder viewHolder,
                                                 final StationEntity station) {
        viewHolder.addToFavourites.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                ActivityUtils.toggleFavouritesStation(context,
                        favouritesDatasource, station,
                        viewHolder.addToFavourites);

                // No need to update this fragment again (in case return from
                // other section)
                GlobalEntity globalContext = (GlobalEntity) context
                        .getApplicationContext();
                globalContext.setVbChanged(false);
            }
        });
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        ImageView addToFavourites;
        TextView stationName;
        TextView stationNumber;
    }
}