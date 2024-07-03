package bg.znestorov.sofbus24.virtualboards;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.format.DateFormat;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.DroidTransDataSource;
import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.databases.VehiclesDataSource;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.Utils;

import static bg.znestorov.sofbus24.utils.Constants.VB_STATION_CODE_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_STATION_LINES_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_STATION_NAME_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_STATION_SKGT_TIME_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_AIR_CONDITIONING_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_ARRIVALS_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_BICYCLE_MOUNT_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_DIRECTION_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_DOUBLEDECKER_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_NAME_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_TIME_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_TYPE_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_WHEELCHAIR_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_VEHICLE_WIFI_API;
import static bg.znestorov.sofbus24.utils.Utils.getAsJsonBoolean;
import static bg.znestorov.sofbus24.utils.Utils.getAsJsonString;
import static bg.znestorov.sofbus24.utils.Utils.transformSkgtStringDateToDate;

/**
 * Process the html result, retrieved from the SKGT site in an appropriate
 * object according to the activity called it
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("DefaultLocale")
class ProcessVirtualBoardsApi {

    private final String language;
    private Activity context;
    private StationsDataSource stationsDatasource;
    private VehiclesDataSource vehicleDatasource;
    private DroidTransDataSource droidTransDatasource;
    private String jsonResult;

    ProcessVirtualBoardsApi(Activity context, String jsonResult) {
        this.context = context;
        this.stationsDatasource = new StationsDataSource(context);
        this.vehicleDatasource = new VehiclesDataSource(context);
        this.droidTransDatasource = new DroidTransDataSource(context);
        this.jsonResult = jsonResult;
        this.language = LanguageChange.getUserLocale(context);
    }

    StationEntity getStationVehiclesFromJson() {

        JsonObject stationJsonObject;
        try {
            stationJsonObject = new JsonParser().parse(jsonResult).getAsJsonObject();
        } catch (Exception e) {
            return null;
        }

        // Get the Station for this SKGT request and the SKGT time (information retrieval time)
        StationEntity station = getStation(stationJsonObject);
        String skgtTime = transformSkgtStringDateToDate(
                getAsJsonString(stationJsonObject, VB_STATION_SKGT_TIME_API));

        // Init the list of vehicles for this station
        ArrayList<VehicleEntity> stationVehicles = getStationVehicles(stationJsonObject, station);

        // Form the VirtualBoardsStationEntity using all data from the SKGT site
        return new VirtualBoardsStationEntity(station, skgtTime, stationVehicles);
    }

    /**
     * Get a {@link StationEntity} object from the database using the JSON result from SKGT site
     *
     * @return a {@link StationEntity} object from the DB for the current request
     */
    private StationEntity getStation(JsonObject stationJsonObject) {

        // Get the station code from the JSON object
        String code = getAsJsonString(stationJsonObject, VB_STATION_CODE_API);

        // Get the station from the DB
        stationsDatasource.open();
        StationEntity station = stationsDatasource.getStation(code);
        stationsDatasource.close();

        // In case the vehicle is not in the database, create a temporary one
        if (station == null) {

            // Get the Station name from the current request in the appropriate language
            String name = getAsJsonString(stationJsonObject, VB_STATION_NAME_API);
            if (!"bg".equals(language)) {
                name = TranslatorCyrillicToLatin.translate(context, name);
            }

            station = new StationEntity("-1", code, name, null, null, VehicleTypeEnum.BTT, "1");
        }

        return station;
    }

    /**
     * Create a list with all Vehicles that passes through this Station
     *
     * @param stationJsonObject {@link JsonObject} with the station and vehicles information
     * @param station           {@link StationEntity} object from the DB for the current request
     * @return a list of the passing vehicles through this station
     */
    private ArrayList<VehicleEntity> getStationVehicles(JsonObject stationJsonObject,
                                                        StationEntity station) {

        ArrayList<VehicleEntity> stationVehicles = new ArrayList<>();

        // Get the station vehicles
        JsonArray linesJsonArray = stationJsonObject.getAsJsonArray(VB_STATION_LINES_API);
        for (JsonElement lineJsonElement : linesJsonArray) {

            JsonObject linesJsonObject = lineJsonElement.getAsJsonObject();

            // Get the vehicle from the DB/SKGT and assign it all arrival information
            VehicleEntity vehicle = getVehicle(linesJsonObject, station);
            setVehicleInfo(vehicle, linesJsonObject);

            // Add the vehicle to the list of station vehicles
            stationVehicles.add(vehicle);
        }

        return stationVehicles;
    }

    /**
     * Get a {@link VehicleEntity} object from the database (if exists) using the JSON result
     * from SKGT site. If the object is not available, create a temporary one with the data
     * retrieved from the SKGT request
     *
     * @param linesJsonObject JSON object containing the station vehicles passing
     *                        through this station
     * @param station         {@link StationEntity} object from the DB for the current request
     * @return a {@link VehicleEntity} object from the DB/SKGT for the current request
     */
    private VehicleEntity getVehicle(JsonObject linesJsonObject, StationEntity station) {

        // Get the Vehicle name from the current request in the appropriate language
        String name = getAsJsonString(linesJsonObject, VB_VEHICLE_NAME_API);

        // Get the Vehicle direction from the current request in the appropriate language
        String direction = getAsJsonString(linesJsonObject, VB_VEHICLE_DIRECTION_API);
        if (!"bg".equals(language)) {
            direction = TranslatorCyrillicToLatin.translate(context, direction);
        }

        // Form the vehicle type
        VehicleTypeEnum type;
        try {
            type = VehicleTypeEnum.valueOf(
                    getAsJsonString(linesJsonObject, VB_VEHICLE_TYPE_API).toUpperCase());
        } catch (Exception e) {
            // This case should never been reached as the vehicles always will be BUS, TRAM, TROLLEY
            type = VehicleTypeEnum.BUS;
        }

        // Retrieve the vehicle object from the DB
        List<VehicleEntity> vehicles = getDbVehicles(name, type);

        // In case the vehicle is not in the database (get the first returned vehicle),
        // create a temporary one
        VehicleEntity vehicle;
        if (vehicles != null && vehicles.size() > 0) {
            vehicle = vehicles.get(0);
        } else {
            vehicle = new VehicleEntity(name, type, direction);
        }

        // Correct the vehicle direction (if needed) - depends on the station number
        droidTransDatasource.open();
        vehicle.setDirection(droidTransDatasource.getVehicleDirectionViaStationNumber(
                vehicle.getDirection(), vehicle.getNumber(), station.getNumber()));
        droidTransDatasource.close();

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

        // Check if a matching vehicle is found or vehicle's name modifications should be done
        if (vehicles == null || vehicles.size() == 0) {
            name = formatVehicleName(name);
            vehicles = vehicleDatasource.getVehiclesViaSearch(type, name);
        }

        // Close the vehicles database
        vehicleDatasource.close();
        return vehicles;
    }

    /**
     * Format the vehicle's name (number) to match the database records (latin to cyrillic).
     *
     * @param name station number
     * @return vehicle's name
     */
    private String formatVehicleName(String name) {
        // Change the bus trailing latin "TM" to cyrillic "ТМ"
        name = name.replaceAll("TM$", "-ТМ");
        // Change the electrobus leading latin "E" to cyrillic "Е"
        name = name.replaceAll("^E", "Е");

        return name;
    }

    /**
     * Set the passed {@link VehicleEntity} all the information from the current station -
     * when it will arrive, along with some additional one as hasWifi, hasWheelChair etc.
     *
     * @param vehicle         current {@link VehicleEntity} that pass through the station with
     *                        all information
     * @param linesJsonObject JSON object containing the station vehicles passing
     *                        through this station
     */
    private void setVehicleInfo(VehicleEntity vehicle, JsonObject linesJsonObject) {

        // Form the vehicle arrival parameters
        ArrayList<String> arrivalTimes = new ArrayList<>();
        ArrayList<Boolean> isWheelchairAccessible = new ArrayList<>();
        ArrayList<Boolean> hasAirConditioning = new ArrayList<>();
        ArrayList<Boolean> hasBicycleMount = new ArrayList<>();
        ArrayList<Boolean> isDoubledecker = new ArrayList<>();
        ArrayList<Boolean> hasWifi = new ArrayList<>();

        // Get the times of arrival
        JsonArray arrivalsJsonArray = linesJsonObject.getAsJsonArray(VB_VEHICLE_ARRIVALS_API);
        for (JsonElement arrivalJsonElement : arrivalsJsonArray) {

            JsonObject arrivalJsonObject = arrivalJsonElement.getAsJsonObject();

            // Fill the vehicle information only if the arrival time is after the current hour
            String arrivalTime = formatArrivalTime(getAsJsonString(arrivalJsonObject, VB_VEHICLE_TIME_API));
            if (!Utils.isEmpty(arrivalTime)) {
                arrivalTimes.add(arrivalTime);
                isWheelchairAccessible.add(getAsJsonBoolean(arrivalJsonObject, VB_VEHICLE_WHEELCHAIR_API));
                hasAirConditioning.add(getAsJsonBoolean(arrivalJsonObject, VB_VEHICLE_AIR_CONDITIONING_API));
                hasBicycleMount.add(getAsJsonBoolean(arrivalJsonObject, VB_VEHICLE_BICYCLE_MOUNT_API));
                isDoubledecker.add(getAsJsonBoolean(arrivalJsonObject, VB_VEHICLE_DOUBLEDECKER_API));
                hasWifi.add(getAsJsonBoolean(arrivalJsonObject, VB_VEHICLE_WIFI_API));
            }
        }

        // The API always returns times of arrival sorted list
        // Collections.sort(arrivalTimes, new AlphanumComparator());

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
     * @param arrivalTime an array with the arrival times
     * @return the arrival time if it is after the current hour
     */
    private String formatArrivalTime(String arrivalTime) {

        String currentTime = DateFormat.format("kk:mm", new java.util.Date()).toString();
        arrivalTime = Utils.getValueBeforeLast(arrivalTime, ":");

        String differenceTime = Utils.getTimeDifference(context, arrivalTime, currentTime);
        if (!"".equals(differenceTime) && !"---".equals(differenceTime)) {
            return arrivalTime;
        }

        return null;
    }

}