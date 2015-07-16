package bg.znestorov.sofbus24.schedule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.TranslatorLatinToCyrillic;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Array Adapted user for set each row a station from the Vehicles DB
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ScheduleVehicleAdapter extends ArrayAdapter<VehicleEntity> {

    private final Activity context;
    private final List<VehicleEntity> originalVehicles;
    private View emptyView;
    private TextView emptyTextView;
    private String vehicleName;
    private List<VehicleEntity> filteredVehicles;

    private boolean isPhoneDevice;
    private Filter stationsFilter;
    private String language;

    public ScheduleVehicleAdapter(Activity context, View emptyView,
                                  TextView emptyTextView, String vehicleName,
                                  List<VehicleEntity> vehicles) {
        super(context, R.layout.activity_schedule_vehicle_list_item, vehicles);

        this.context = context;
        this.isPhoneDevice = ((GlobalEntity) context.getApplicationContext())
                .isPhoneDevice();
        this.language = LanguageChange.getUserLocale(context);

        this.emptyView = emptyView;
        this.emptyTextView = emptyTextView;
        this.vehicleName = vehicleName;

        this.originalVehicles = vehicles;
        this.filteredVehicles = vehicles;

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
                    R.layout.activity_schedule_vehicle_list_item, null);

            // Configure view holder
            viewHolder = new ViewHolder();
            viewHolder.vehicleType = (ImageView) rowView
                    .findViewById(R.id.schedule_item_vehicle_type);
            viewHolder.vehicleCaption = (TextView) rowView
                    .findViewById(R.id.schedule_item_vehicle_caption);
            viewHolder.vehicleDirection = (TextView) rowView
                    .findViewById(R.id.schedule_item_vehicle_direction);
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

        VehicleEntity vehicle = filteredVehicles.get(position);
        int vehicleImage = getVehicleImage(context, vehicle);
        String vehicleCaptionText = getVehicleCaption(context, vehicle);
        String vehicleDirectionText = vehicle.getDirection();

        viewHolder.vehicleType.setImageResource(vehicleImage);
        viewHolder.vehicleCaption.setText(vehicleCaptionText);
        viewHolder.vehicleDirection.setText(vehicleDirectionText);

        return rowView;
    }

    @Override
    public VehicleEntity getItem(int position) {
        return filteredVehicles.get(position);
    }

    @Override
    public int getCount() {
        return filteredVehicles != null ? filteredVehicles.size() : 0;
    }

    @Override
    public boolean isEmpty() {
        return filteredVehicles.isEmpty();
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
                    results.values = originalVehicles;
                    results.count = originalVehicles.size();
                } else {
                    List<VehicleEntity> filterResultsData = new ArrayList<VehicleEntity>();

                    String filterString = constraint.toString().trim()
                            .toUpperCase();
                    if ("bg".equals(language)) {
                        filterString = TranslatorLatinToCyrillic.translate(
                                context, filterString);
                    } else {
                        filterString = TranslatorCyrillicToLatin.translate(
                                context, filterString);
                    }

                    String filterebleNumber;
                    String filterableDirection;

                    // Itterate over all stations and search which ones match
                    // the filter
                    for (VehicleEntity vehicle : originalVehicles) {
                        filterebleNumber = vehicle.getNumber().toUpperCase();
                        filterableDirection = vehicle.getDirection()
                                .toUpperCase();

                        if (filterebleNumber.contains(filterString)
                                || filterableDirection.contains(filterString)) {
                            filterResultsData.add(vehicle);
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
                filteredVehicles = (ArrayList<VehicleEntity>) filterResults.values;

                notifyDataSetChanged();
                setEmptyListView(constraint);
            }
        };
    }

    /**
     * Get the vehicle image according to the vehicle type
     *
     * @param context the current activity context
     * @param vehicle the vehicle on the current row
     * @return the vehicle image id
     */
    private Integer getVehicleImage(Context context, VehicleEntity vehicle) {
        Integer vehicleImage;

        switch (vehicle.getType()) {
            case BUS:
                vehicleImage = R.drawable.ic_bus;
                break;
            case TROLLEY:
                vehicleImage = R.drawable.ic_trolley;
                break;
            case TRAM:
                vehicleImage = R.drawable.ic_tram;
                break;
            default:
                vehicleImage = R.drawable.ic_bus;
                break;
        }

        return vehicleImage;
    }

    /**
     * Get the vehicle caption according to the vehicle type
     *
     * @param context the current activity context
     * @param vehicle the vehicle on the current row
     * @return the vehicle caption in format: <b>Bus №xxx</b>
     */
    public String getVehicleCaption(Context context, VehicleEntity vehicle) {
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
                    context.getString(R.string.sch_item_empty_list),
                    constraint, vehicleName)));
        } else {
            if (emptyView != null) {
                emptyView.setVisibility(View.GONE);
            }
        }
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        ImageView vehicleType;
        TextView vehicleCaption;
        TextView vehicleDirection;
    }
}