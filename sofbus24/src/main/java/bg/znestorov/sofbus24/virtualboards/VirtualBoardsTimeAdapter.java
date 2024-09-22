package bg.znestorov.sofbus24.virtualboards;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.TextViewWithImages;

/**
 * Array Adapted user to set each row a vehicle with its arrival times from the
 * SKGT site
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class VirtualBoardsTimeAdapter extends ArrayAdapter<VehicleEntity>
        implements Filterable {

    private final Activity context;

    private final VirtualBoardsStationEntity vbTimeStation;
    private final String timeType;

    public VirtualBoardsTimeAdapter(Activity context,
                                    VirtualBoardsStationEntity vbTimeStation) {
        super(context, R.layout.activity_virtual_boards_time_list_item,
                vbTimeStation.getVehiclesList());

        this.context = context;
        this.vbTimeStation = vbTimeStation;

        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        this.timeType = sharedPreferences.getString(
                Constants.PREFERENCE_KEY_TIME_TYPE,
                Constants.PREFERENCE_DEFAULT_VALUE_TIME_TYPE);
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
                    R.layout.activity_virtual_boards_time_list_item, null);

            // Configure view holder
            viewHolder = new ViewHolder();
            viewHolder.vehicleImage = (ImageView) rowView
                    .findViewById(R.id.vb_time_item_image_vehicle);
            viewHolder.stationCaption = (TextView) rowView
                    .findViewById(R.id.vb_time_item_vehicle_caption);
            viewHolder.stationDirection = (TextView) rowView
                    .findViewById(R.id.vb_time_item_vehicle_direction);
            viewHolder.stationTime = (TextView) rowView
                    .findViewById(R.id.cs_list_item_vehicle_time);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        // Fill the data
        VehicleEntity stationVehicle = vbTimeStation.getVehiclesList().get(
                position);

        viewHolder.vehicleImage
                .setImageResource(getVehicleImage(stationVehicle));
        viewHolder.stationCaption.setText(getVehicleCaption(stationVehicle));
        viewHolder.stationDirection.setText(Html.fromHtml(stationVehicle
                .getDirection()));
        viewHolder.stationTime.setText(getRowTimeCaption(stationVehicle));

        return rowView;
    }

    /**
     * Choose the corresponding image from the resources according to the
     * vehicle type
     *
     * @param stationVehicle the station vehicle
     * @return the corresponding image to the vehicle
     */
    private int getVehicleImage(VehicleEntity stationVehicle) {
        int vehicleImage;

        switch (stationVehicle.getType()) {
            case BUS:
                vehicleImage = R.drawable.ic_bus;
                break;
            case TROLLEY:
                vehicleImage = R.drawable.ic_trolley;
                break;
            case TRAM:
                vehicleImage = R.drawable.ic_tram;
                break;
            case METRO1:
                vehicleImage = R.drawable.ic_metro_1;
                break;
            case METRO2:
                vehicleImage = R.drawable.ic_metro_2;
                break;
            case METRO3:
                vehicleImage = R.drawable.ic_metro_3;
                break;
            case METRO4:
                vehicleImage = R.drawable.ic_metro_4;
                break;
            default:
                vehicleImage = R.drawable.ic_metro_1;
                break;
        }

        return vehicleImage;
    }

    /**
     * Create the vehicle caption using the vehicle type and vehicle number
     *
     * @param stationVehicle the station vehicle
     * @return the vehicle caption
     */
    private String getVehicleCaption(VehicleEntity stationVehicle) {
        String vehicleCaption;
        String vehicleTypeText;

        switch (stationVehicle.getType()) {
            case BUS:
                vehicleTypeText = context.getString(R.string.vb_time_bus);
                break;
            case TROLLEY:
                vehicleTypeText = context.getString(R.string.vb_time_trolley);
                break;
            case TRAM:
                vehicleTypeText = context.getString(R.string.vb_time_tram);
                break;
            default:
                vehicleTypeText = context.getString(R.string.vb_time_metro);
                break;
        }

        vehicleCaption = String.format(vehicleTypeText,
                stationVehicle.getNumber());

        return vehicleCaption;
    }

    /**
     * Create a separated string, using the elements from the list
     *
     * @param stationVehicle the station vehicle
     * @return a separated string with the arrival times
     */
    private String getArrivalTimes(VehicleEntity stationVehicle) {
        ArrayList<String> arrivalTimesList = stationVehicle.getArrivalTimes();
        StringBuilder arrivalTimes = new StringBuilder();

        for (int i = 0; i < arrivalTimesList.size(); i++) {
            arrivalTimes
                    .append(arrivalTimesList.get(i))
                    .append(getAllExtrasImg(stationVehicle, i))
                    .append(", ");
        }

        // In very rare cases there are no results and the arrivalTimes array is
        // empty (GooglePlay bug: StringIndexOutOfBoundsException)
        if (arrivalTimes.length() > 1) {
            arrivalTimes.deleteCharAt(arrivalTimes.length() - 2).trimToSize();
        }

        if (arrivalTimes.length() == 0) {
            arrivalTimes.append("---");
        }

        return arrivalTimes.toString();
    }

    /**
     * Create a separated string, using the elements from the list
     *
     * @param stationVehicle the station vehicle
     * @return a separated string with the remaining times
     */
    private String getRemainingTimes(VehicleEntity stationVehicle) {
        ArrayList<String> arrivalTimesList = stationVehicle.getArrivalTimes();
        String currentTime = Utils.getValueAfterLast(
                vbTimeStation.getTime(context), ",").trim();
        StringBuilder arrivalTimes = new StringBuilder();

        for (int i = 0; i < arrivalTimesList.size(); i++) {
            String timeToUse = Utils.getTimeDifference(context,
                    arrivalTimesList.get(i), currentTime);
            arrivalTimes.append(timeToUse)
                    .append(getAllExtrasImg(stationVehicle, i))
                    .append(", ");
        }

        if (arrivalTimes.length() > 1) {
            arrivalTimes.deleteCharAt(arrivalTimes.length() - 2).trimToSize();
        }

        if (arrivalTimes.length() == 0) {
            arrivalTimes.append("---");
        }

        return arrivalTimes.toString();
    }

    /**
     * Create a separated string, using the elements from the list
     *
     * @param stationVehicle the station vehicle
     * @return a separated string with the both times (times of arrival and
     * remaining time)
     */
    private String getBothTimes(VehicleEntity stationVehicle) {

        ArrayList<String> arrivalTimesList = stationVehicle.getArrivalTimes();
        String currentTime = Utils.getValueAfterLast(
                vbTimeStation.getTime(context), ",").trim();
        StringBuilder bothTimes = new StringBuilder();

        for (int i = 0; i < arrivalTimesList.size(); i++) {

            String timesOfArrival = arrivalTimesList.get(i);
            String remainingTime = Utils.getTimeDifference(context,
                    arrivalTimesList.get(i), currentTime);

            bothTimes.append(timesOfArrival)
                    .append(" (")
                    .append(remainingTime)
                    .append(")")
                    .append(getAllExtrasImg(stationVehicle, i))
                    .append(", ");
        }

        if (bothTimes.length() > 1) {
            bothTimes.deleteCharAt(bothTimes.length() - 2).trimToSize();
        }

        if (bothTimes.length() == 0) {
            bothTimes.append("---");
        }

        return bothTimes.toString();
    }

    /**
     * Create the text for the last TextView of the row (containing the times of
     * arrival or remaining times)
     *
     * @param stationVehicle the station vehicle
     * @return the last TextView text of each row (containing the times of
     * arrival or remaining times)
     */
    private Spanned getRowTimeCaption(VehicleEntity stationVehicle) {
        Spanned rowTimeCaption;

        switch (timeType) {
            case Constants.PREFERENCE_DEFAULT_VALUE_TIME_TYPE:
                rowTimeCaption = Html.fromHtml(String.format(
                        context.getString(R.string.vb_time_item_remaining_time),
                        getRemainingTimes(stationVehicle)));
                break;
            case Constants.PREFERENCE_DEFAULT_VALUE_TIME_TYPE_ARRIVAL:
                rowTimeCaption = Html.fromHtml(String.format(
                        context.getString(R.string.vb_time_item_time_of_arrival),
                        getArrivalTimes(stationVehicle)));
                break;
            default:
                rowTimeCaption = Html.fromHtml(String.format(
                        context.getString(R.string.vb_time_item_both),
                        getBothTimes(stationVehicle)));
                break;
        }

        return rowTimeCaption;
    }

    /**
     * Get all vehicle's extras image resources.
     *
     * @param stationVehicle   the station vehicle
     * @param arrivalTimeIndex current arrival time index
     * @return all vehicle's extras image resources
     */
    private String getAllExtrasImg(VehicleEntity stationVehicle, int arrivalTimeIndex) {
        return getWheelchairAccessibleImg(stationVehicle, arrivalTimeIndex) +
                getAirConditioningImg(stationVehicle, arrivalTimeIndex) +
                getBicycleMountImg(stationVehicle, arrivalTimeIndex) +
                getDoubledeckerImg(stationVehicle, arrivalTimeIndex) +
                getWiFiImg(stationVehicle, arrivalTimeIndex);
    }

    /**
     * Get the wheelchair accessible vehicle's extra image resource for the provided station vehicle.
     *
     * @param stationVehicle   the station vehicle
     * @param arrivalTimeIndex current arrival time index
     * @return the wheelchair accessible vehicle's extra image resource
     */
    private String getWheelchairAccessibleImg(VehicleEntity stationVehicle, int arrivalTimeIndex) {
        return getVehicleExtraImg(stationVehicle, arrivalTimeIndex,
                stationVehicle::getIsWheelchairAccessible, "ic_vb_wheelchair",
                "vb_time_vehicle_extras_wheelchair");
    }

    /**
     * Get the air conditioning vehicle's extra image resource for the provided station vehicle.
     *
     * @param stationVehicle   the station vehicle
     * @param arrivalTimeIndex current arrival time index
     * @return the air conditioning vehicle's extra image resource
     */
    private String getAirConditioningImg(VehicleEntity stationVehicle, int arrivalTimeIndex) {
        return getVehicleExtraImg(stationVehicle, arrivalTimeIndex,
                stationVehicle::getHasAirConditioning, "ic_vb_air_conditioning",
                "vb_time_vehicle_extras_air_conditioning");
    }

    /**
     * Get the bicycle mount vehicle's extra image resource for the provided station vehicle.
     *
     * @param stationVehicle   the station vehicle
     * @param arrivalTimeIndex current arrival time index
     * @return the bicycle mount vehicle's extra image resource
     */
    private String getBicycleMountImg(VehicleEntity stationVehicle, int arrivalTimeIndex) {
        return getVehicleExtraImg(stationVehicle, arrivalTimeIndex,
                stationVehicle::getHasBicycleMount, "ic_vb_bicycle",
                "vb_time_vehicle_extras_bicycle");
    }

    /**
     * Get the Doubledecker vehicle's extra image resource for the provided station vehicle.
     *
     * @param stationVehicle   the station vehicle
     * @param arrivalTimeIndex current arrival time index
     * @return the Doubledecker vehicle's extra image resource
     */
    private String getDoubledeckerImg(VehicleEntity stationVehicle, int arrivalTimeIndex) {
        return getVehicleExtraImg(stationVehicle, arrivalTimeIndex,
                stationVehicle::getIsDoubledecker, "ic_vb_doubledecker",
                "vb_time_vehicle_extras_doubledecker");
    }

    /**
     * Get the WiFi vehicle's extra image resource for the provided station vehicle.
     *
     * @param stationVehicle   the station vehicle
     * @param arrivalTimeIndex current arrival time index
     * @return the WiFi vehicle's extra image resource
     */
    private String getWiFiImg(VehicleEntity stationVehicle, int arrivalTimeIndex) {
        return getVehicleExtraImg(stationVehicle, arrivalTimeIndex,
                stationVehicle::getHasWifi, "ic_vb_wifi",
                "vb_time_vehicle_extras_wifi");
    }

    /**
     * Get the specific vehicle's extra image resource for the provided station vehicle.
     *
     * @param stationVehicle   the station vehicle
     * @param arrivalTimeIndex current arrival time index
     * @param extrasFunc       retrieve the specific vehicle's extra function
     * @param image            vehicle's extra image resource
     * @param imageContent     vehicle's extra image content resource
     * @return the specific vehicle extra image resource
     */
    private String getVehicleExtraImg(VehicleEntity stationVehicle, int arrivalTimeIndex,
                                      Callable<List<Boolean>> extrasFunc, String image,
                                      String imageContent) {
        // Check if the specific extra is available, based on the user preferences
        if (!Utils.areAdditionalExtrasAvailable(context)) {
            return Constants.GLOBAL_PARAM_EMPTY_STRING;
        }

        // Check if the station vehicle is found
        if (stationVehicle == null) {
            return Constants.GLOBAL_PARAM_EMPTY_STRING;
        }

        // Retrieve the specific vehicle's extras
        List<Boolean> extras;
        try {
            extras = extrasFunc.call();
        } catch (Exception e) {
            return Constants.GLOBAL_PARAM_EMPTY_STRING;
        }

        // Check if the specific vehicle's extras contain an element on the requested index
        if (Utils.isEmpty(extras) || arrivalTimeIndex >= extras.size()) {
            return Constants.GLOBAL_PARAM_EMPTY_STRING;
        }

        // Check if the specific vehicle's extra is available for this vehicle
        if (!extras.get(arrivalTimeIndex)) {
            return Constants.GLOBAL_PARAM_EMPTY_STRING;
        }

        // Return the specific vehicle's extra image
        return String.format(TextViewWithImages.IMAGE_SOURCE_TEMPLATE, image, imageContent);
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        ImageView vehicleImage;
        TextView stationCaption;
        TextView stationDirection;
        TextView stationTime;
    }
}