package bg.znestorov.sofbus24.virtualboards;

import static bg.znestorov.sofbus24.utils.Constants.VB_STATION_DETAILS_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_AIR_CONDITIONING_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_BICYCLE_MOUNT_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_DOUBLEDECKER_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_EXT_ID_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_NAME_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_ROUTE_ID_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_ROUTE_NAME_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_TIME_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_TYPE_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_WHEELCHAIR_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_WIFI_API;
import static bg.znestorov.sofbus24.utils.Utils.getAsJsonBoolean;
import static bg.znestorov.sofbus24.utils.Utils.getAsJsonString;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.format.DateFormat;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import bg.znestorov.sofbus24.databases.DroidTransDataSource;
import bg.znestorov.sofbus24.databases.VehiclesDataSource;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Process the html result, retrieved from the SKGT site in an appropriate
 * object according to the activity called it
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("DefaultLocale")
class ProcessVirtualBoardsApi {

    private Activity context;
    private StationEntity station;
    private VehicleEntity vehicle;
    private VehiclesDataSource vehicleDatasource;
    private DroidTransDataSource droidTransDatasource;
    private String jsonResult;
    private final Date currentDate;
    private final String language;

    ProcessVirtualBoardsApi(Activity context, StationEntity station, VehicleEntity vehicle, String jsonResult) {
        this.context = context;
        this.station = station;
        this.vehicle = vehicle;
        this.vehicleDatasource = new VehiclesDataSource(context);
        this.droidTransDatasource = new DroidTransDataSource(context);
        this.jsonResult = jsonResult;
        this.currentDate = new Date();
        this.language = LanguageChange.getUserLocale(context);
    }

    StationEntity getStationVehiclesFromJson() {

        JsonObject stationVehiclesJsonObject;
        try {
            stationVehiclesJsonObject = new JsonParser().parse(jsonResult).getAsJsonObject();
        } catch (Exception e) {
            return null;
        }

        // Init the list of vehicles for this station
        ArrayList<VehicleEntity> stationVehicles = getStationVehicles(stationVehiclesJsonObject);
        Collections.sort(stationVehicles);

        // Form the VirtualBoardsStationEntity using all data from the SKGT site
        return new VirtualBoardsStationEntity(station, currentDate, currentDate, stationVehicles);
    }

    /**
     * Create a list with all Vehicles that passes through this Station
     *
     * @param stationVehiclesJsonObject {@link JsonObject} with the station and vehicles information
     * @return a list of the passing vehicles through this station
     */
    private ArrayList<VehicleEntity> getStationVehicles(JsonObject stationVehiclesJsonObject) {

        ArrayList<VehicleEntity> stationVehicles = new ArrayList<>();

        for (String vehicleExtId : stationVehiclesJsonObject.keySet()) {
            // Get the vehicle from the DB/SKGT
            JsonObject vehicleJsonObject = stationVehiclesJsonObject.getAsJsonObject(vehicleExtId);
            VehicleEntity vehicle = getVehicle(vehicleJsonObject);

            // Check if we want to retrieve the information in real time for all vehicles or just
            // for a selected one (the previous section "Schedule" now will be used to retrieve
            // information about the times of arrival for a selected vehicle)
            // NOT NEEDED as it gives misleading information
            // if (this.vehicle == null || this.vehicle.getNumber().equals(vehicle.getNumber())) {
            // Add the vehicle details
            setVehicleInfo(vehicle, vehicleJsonObject);
            stationVehicles.add(vehicle);
            // }
        }

        return stationVehicles;
    }

    /**
     * Get a {@link VehicleEntity} object from the database (if exists) using the JSON result
     * from SKGT site. If the object is not available, create a temporary one with the data
     * retrieved from the SKGT request
     *
     * @param vehicleJsonObject JSON object containing the station vehicles passing
     *                          through this station
     * @return a {@link VehicleEntity} object from the DB/SKGT for the current request
     */
    private VehicleEntity getVehicle(JsonObject vehicleJsonObject) {

        // Get the Vehicle name from the current request in the appropriate language
        String name = getAsJsonString(vehicleJsonObject, VB_VEHICLE_NAME_API);

        // Get the Vehicle direction from the current request in the appropriate language
        String direction = getAsJsonString(vehicleJsonObject, VB_VEHICLE_ROUTE_NAME_API);
        String route = getAsJsonString(vehicleJsonObject, VB_VEHICLE_ROUTE_ID_API);

        // Retrieve the correct direction name
        droidTransDatasource.open();
        String dbDirection = droidTransDatasource.getVehicleDirectionViaVehicleRoute(route);
        direction = dbDirection != null ? dbDirection : direction;
        droidTransDatasource.close();

        if (!"bg".equals(language)) {
            direction = TranslatorCyrillicToLatin.translate(context, direction);
        }

        // Form the vehicle type
        VehicleTypeEnum type;
        try {
            type = VehicleTypeEnum.getVehicleType(
                    getAsJsonString(vehicleJsonObject, VB_VEHICLE_TYPE_API),
                    getAsJsonString(vehicleJsonObject, VB_VEHICLE_EXT_ID_API));
        } catch (Exception e) {
            // This case should never been reached as the vehicles always will be BUS, TRAM, TROLLEY
            type = VehicleTypeEnum.BUS;
        }

        // Retrieve the vehicle object from the DB
        List<VehicleEntity> vehicles = getDbVehicles(name, type);

        // In case the vehicle is not in the database (get the first returned vehicle),
        // create a temporary one
        VehicleEntity vehicle;
        if (vehicles != null && !vehicles.isEmpty()) {
            vehicle = vehicles.get(0);
        } else {
            vehicle = new VehicleEntity(name, type, direction);
        }

        vehicle.setDirection(direction);
        return vehicle;
    }

    /**
     * Get the current vehicle from the database.
     *
     * @param name station number
     * @param type station {@link VehicleTypeEnum}
     * @return current vehicle from the database
     */
    private List<VehicleEntity> getDbVehicles(String name, VehicleTypeEnum type) {
        // Open the vehicles database
        vehicleDatasource.open();

        // Try to retrieve the current vehicle, based on the API data
        List<VehicleEntity> vehicles = vehicleDatasource.getVehiclesViaSearch(type, name);

        // Close the vehicles database
        vehicleDatasource.close();
        return vehicles;
    }

    /**
     * Set the passed {@link VehicleEntity} all the information from the current station -
     * when it will arrive, along with some additional one as hasWifi, hasWheelChair etc.
     *
     * @param vehicle           current {@link VehicleEntity} that pass through the station with
     *                          all information
     * @param vehicleJsonObject JSON object containing the station vehicles passing
     *                          through this station
     */
    private void setVehicleInfo(VehicleEntity vehicle, JsonObject vehicleJsonObject) {

        // Form the vehicle arrival parameters
        ArrayList<String> arrivalTimes = new ArrayList<>();
        ArrayList<Boolean> isWheelchairAccessible = new ArrayList<>();
        ArrayList<Boolean> hasAirConditioning = new ArrayList<>();
        ArrayList<Boolean> hasBicycleMount = new ArrayList<>();
        ArrayList<Boolean> isDoubledecker = new ArrayList<>();
        ArrayList<Boolean> hasWifi = new ArrayList<>();

        // Get the times of arrival
        JsonArray vehicleDetailsJsonArray = vehicleJsonObject.getAsJsonArray(VB_STATION_DETAILS_API);
        for (JsonElement vehicleDetailsJsonElement : vehicleDetailsJsonArray) {

            JsonObject vehicleDetailsJsonObject = vehicleDetailsJsonElement.getAsJsonObject();

            // Fill the vehicle information only if the arrival time is after the current hour
            String arrivalTime = formatArrivalTime(getAsJsonString(vehicleDetailsJsonObject, VB_VEHICLE_TIME_API));
            if (!Utils.isEmpty(arrivalTime)) {
                arrivalTimes.add(arrivalTime);
                hasAirConditioning.add(getAsJsonBoolean(vehicleDetailsJsonObject, VB_VEHICLE_AIR_CONDITIONING_API));
                isWheelchairAccessible.add(getAsJsonBoolean(vehicleDetailsJsonObject, VB_VEHICLE_WHEELCHAIR_API));
                hasBicycleMount.add(getAsJsonBoolean(vehicleDetailsJsonObject, VB_VEHICLE_BICYCLE_MOUNT_API));
                isDoubledecker.add(getAsJsonBoolean(vehicleDetailsJsonObject, VB_VEHICLE_DOUBLEDECKER_API));
                hasWifi.add(getAsJsonBoolean(vehicleDetailsJsonObject, VB_VEHICLE_WIFI_API));
            }
        }

        // Add al fields to the Vehicle object
        vehicle.setArrivalTimes(arrivalTimes);
        vehicle.setIsWheelchairAccessible(isWheelchairAccessible);
        vehicle.setHasAirConditioning(hasAirConditioning);
        vehicle.setHasBicycleMount(hasBicycleMount);
        vehicle.setIsDoubledecker(isDoubledecker);
        vehicle.setHasWifi(hasWifi);
    }

    /**
     * Form the arrival time by checking each time of arrival if it is after the current
     * hour and removing the last part (seconds in the arrival time)
     *
     * @param arrivalTimeInterval the interval in minutes when the vehicle will arrive
     * @return the arrival time if it is after the current hour
     */
    private String formatArrivalTime(String arrivalTimeInterval) {
        if (arrivalTimeInterval == null || arrivalTimeInterval.isEmpty()) {
            return null;
        }

        String currentTime = DateFormat.format("kk:mm", currentDate).toString();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MINUTE, Integer.parseInt(arrivalTimeInterval));
        String arrivalTime = DateFormat.format("kk:mm", calendar.getTime()).toString();

        String differenceTime = Utils.getTimeDifference(context, arrivalTime, currentTime);
        if (!"".equals(differenceTime) && !"---".equals(differenceTime)) {
            return arrivalTime;
        }

        return null;
    }

}