package bg.znestorov.sofbus24.virtualboards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.format.DateFormat;
import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.utils.AlphanumComparator;
import bg.znestorov.sofbus24.utils.Constants;
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
public class ProcessVirtualBoards {

    private Activity context;
    private StationsDataSource stationsDatasource;
    private String htmlResult;
    private String language;

    public ProcessVirtualBoards(Activity context, String htmlResult) {
        this.context = context;
        this.stationsDatasource = new StationsDataSource(context);
        this.htmlResult = htmlResult;
        this.language = LanguageChange.getUserLocale(context);
    }

    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public StationsDataSource getStationsDatasource() {
        return stationsDatasource;
    }

    public void setStationsDatasource(StationsDataSource stationsDatasource) {
        this.stationsDatasource = stationsDatasource;
    }

    public String getHtmlResult() {
        return htmlResult;
    }

    public void setHtmlResult(String htmlResult) {
        this.htmlResult = htmlResult;
    }

    /**
     * Get the station info from the html and format it in a
     * VirtualBoardsStation object
     *
     * @return a VirtualBoardsStation object, containing all information about
     *         the station
     */
    public VirtualBoardsStationEntity getVBSingleStationFromHtml() {
        VirtualBoardsStationEntity vbStation = new VirtualBoardsStationEntity(
                getStationFromHtml(), getSkgtTimeFromHtml(),
                getVehiclesListFromHtml());

        return vbStation;
    }

    /**
     * Get all information about the station from the html result (name, number
     * and coordinates)
     *
     * @return the station with all information from the skgt site
     */
    private StationEntity getStationFromHtml() {
        StationEntity station = new StationEntity();

        Pattern pattern = Pattern.compile(Constants.VB_REGEX_STATION_INFO);
        Matcher matcher = pattern.matcher(htmlResult);

        if (matcher.find()) {
            // Get the station name
            String stationName = matcher.group(1);
            stationName = stationName.trim();
            if (!"bg".equals(language)) {
                stationName = TranslatorCyrillicToLatin.translate(context,
                        stationName);
            }

            // Get the station number
            String stationNumber = matcher.group(2);
            stationNumber = Utils.getOnlyDigits(stationNumber);

            // Get lat and lon of the station
            stationsDatasource.open();
            StationEntity dbStation = stationsDatasource
                    .getStation(stationNumber);
            String stationLat = "";
            String stationLon = "";

            if (dbStation != null) {
                stationLat = dbStation.getLat();
                stationLon = dbStation.getLon();
            }
            stationsDatasource.close();

            // Set the station all fields
            station = new StationEntity(stationNumber, stationName, stationLat,
                    stationLon, VehicleTypeEnum.BTT, "1");
        }

        return station;
    }

    /**
     * Get time of the skgt site (when the information is extracted according to
     * their system)
     *
     * @return the skgt time
     */
    private String getSkgtTimeFromHtml() {
        String skgtTime = "";

        Pattern pattern = Pattern.compile(Constants.VB_REGEX_SKGT_TIME);
        Matcher matcher = pattern.matcher(htmlResult);

        if (matcher.find()) {
            skgtTime = matcher.group(1);
            skgtTime = skgtTime.trim();
            skgtTime = skgtTime.replaceAll(" ", ", ");
        }

        return skgtTime;
    }

    /**
     * Get a list with all vehicles, passing through this station as well as
     * their times of arrival
     *
     * @return a list with all vehicles through this station
     */
    private ArrayList<VehicleEntity> getVehiclesListFromHtml() {
        ArrayList<VehicleEntity> vehiclesList = new ArrayList<VehicleEntity>();

        String[] vehiclesPartsHtml = htmlResult
                .split(Constants.VB_REGEX_VEHICLE_PARTS);

        for (int i = 0; i < vehiclesPartsHtml.length; i++) {
            VehicleTypeEnum vehicleType = getVehicleType(vehiclesPartsHtml[i]);

            // Used to order the vehicles (BUS, TROLLEY, TRAM)
            switch (vehicleType) {
                case BUS:
                    vehiclesList.addAll(0, getVehiclesByTypeFromHtml(vehicleType,
                            vehiclesPartsHtml[i]));
                    break;
                case TRAM:
                    vehiclesList.addAll(getVehiclesByTypeFromHtml(vehicleType,
                            vehiclesPartsHtml[i]));
                    break;
                default:
                    if (vehiclesList.isEmpty()) {
                        vehiclesList.addAll(getVehiclesByTypeFromHtml(vehicleType,
                                vehiclesPartsHtml[i]));
                    } else {
                        vehiclesList.addAll(1, getVehiclesByTypeFromHtml(
                                vehicleType, vehiclesPartsHtml[i]));
                    }
                    break;
            }
        }

        return vehiclesList;
    }

    /**
     * Get a list with all vehicles for the corresponding type
     *
     * @param vehicleType
     *            the type of the current vehicle
     * @param vehiclesPartHtml
     *            the part of the html code (representing one vehicle type)
     * @return a list with all information about the passing vehicles through
     *         this station
     */
    private LinkedList<VehicleEntity> getVehiclesByTypeFromHtml(
            VehicleTypeEnum vehicleType, String vehiclesPartHtml) {
        LinkedList<VehicleEntity> vehiclesList = new LinkedList<VehicleEntity>();

        Pattern pattern = Pattern.compile(Constants.VB_REGEX_VEHICLE_INFO);
        Matcher matcher = pattern.matcher(vehiclesPartHtml);

        while (matcher.find()) {

            // Get the shedule variables
            int stop;
            try {
                stop = Integer.parseInt(matcher.group(1));
            } catch (Exception e) {
                stop = -1;
            }

            int lid;
            try {
                lid = Integer.parseInt(matcher.group(2));
            } catch (Exception e) {
                lid = -1;
            }

            int vt;
            try {
                vt = Integer.parseInt(matcher.group(3));
            } catch (Exception e) {
                vt = -1;
            }

            int rid;
            try {
                rid = Integer.parseInt(matcher.group(4));
            } catch (Exception e) {
                rid = -1;
            }

            // Get and format the vehicle number
            String vehicleNumber = matcher.group(5);
            vehicleNumber = Utils.removeSpaces(vehicleNumber);

            // Get and format the vehicle times of arrival
            String vehicleTimes = matcher.group(6);
            vehicleTimes = Utils.removeSpaces(vehicleTimes);
            ArrayList<String> arrivalTimes = formatArrivalTimes(
                    vehicleTimes.split(","));

            // Sort the arrival times (sometimes the times are not ordered)
            Collections.sort(arrivalTimes, new AlphanumComparator());

            // Get and format the vehicle direction
            String vehicleDirection = matcher.group(7);
            vehicleDirection = Utils.formatDirectionName(vehicleDirection);
            if (!"bg".equals(language)) {
                vehicleDirection = TranslatorCyrillicToLatin.translate(context,
                        vehicleDirection);
            }

            // Create the vehicle and add it to the list
            VehicleEntity vehicle = new VehicleEntity(vehicleNumber,
                    vehicleType, vehicleDirection, arrivalTimes, stop, lid, vt,
                    rid);
            vehiclesList.add(vehicle);
        }

        // Sort the list via vehicle number
        Collections.sort(vehiclesList, new Comparator<VehicleEntity>() {
            @Override
            public int compare(VehicleEntity vehicle1, VehicleEntity vehicle2) {
                int vehicle1Number = Integer
                        .parseInt(Utils.getOnlyDigits(vehicle1.getNumber()));
                int vehicle2Number = Integer
                        .parseInt(Utils.getOnlyDigits(vehicle2.getNumber()));

                return vehicle1Number < vehicle2Number ? -1
                        : vehicle1Number > vehicle2Number ? 1 : 0;
            }
        });

        return vehiclesList;
    }

    /**
     * Transform the arrivalTimes array into a list. It is also checking for
     * each time of arrival if it is after the current hour
     *
     * @param arrivalTimes
     *            an array with the arrival times
     * @return an array list, containing all times after the current hour
     */
    private ArrayList<String> formatArrivalTimes(String[] arrivalTimes) {
        ArrayList<String> arrivalTimesList = new ArrayList<String>();
        String currentTime = DateFormat.format("kk:mm", new java.util.Date())
                .toString();

        for (int i = 0; i < arrivalTimes.length; i++) {
            String differenceTime = Utils.getTimeDifference(context,
                    arrivalTimes[i], currentTime);
            if (!"".equals(differenceTime) && !"---".equals(differenceTime)) {
                arrivalTimesList.add(arrivalTimes[i]);
            }
        }

        return arrivalTimesList;
    }

    /**
     * Get the vehicle type according to its name (Автобус, Тролейбус or
     * Трамвай)
     *
     * @param vehiclesPartHtml
     *            the part of the html code (representing one vehicle type)
     * @return the vehicle type
     */
    private VehicleTypeEnum getVehicleType(String vehiclesPartHtml) {
        VehicleTypeEnum vehicleType;
        String vehicleName = "";

        Pattern pattern = Pattern.compile(Constants.VB_REGEX_VEHICLE_TYPE);
        Matcher matcher = pattern.matcher(vehiclesPartHtml);

        if (matcher.find()) {
            vehicleName = matcher.group(1);
            vehicleName = vehicleName.trim();
            vehicleName = vehicleName.toUpperCase();
        }

        if (vehicleName.contains(Constants.VB_VEHICLE_TYPE_BUS)) {
            vehicleType = VehicleTypeEnum.BUS;
        } else if (vehicleName.contains(Constants.VB_VEHICLE_TYPE_TROLLEY)) {
            vehicleType = VehicleTypeEnum.TROLLEY;
        } else {
            vehicleType = VehicleTypeEnum.TRAM;
        }

        return vehicleType;
    }

    /**
     * Get all stations from the html result and add it to an array list
     *
     * @return a list with all stations from the skgt site
     */
    public HashMap<String, StationEntity> getMultipleStationsFromHtml() {
        HashMap<String, StationEntity> stationsMap = new LinkedHashMap<String, StationEntity>();

        Pattern pattern = Pattern
                .compile(Constants.VB_REGEX_MULTIPLE_STATION_INFO);
        Matcher matcher = pattern.matcher(htmlResult);

        while (matcher.find()) {
            // Get the station number
            String stationNumber = matcher.group(1);
            stationNumber = Utils.getOnlyDigits(stationNumber);

            // Get the station name
            String stationName = matcher.group(3);
            stationName = stationName.trim();
            if (!"bg".equals(language)) {
                stationName = TranslatorCyrillicToLatin.translate(context,
                        stationName);
            }

            // Get lat and lon of the station
            stationsDatasource.open();
            StationEntity dbStation = stationsDatasource
                    .getStation(stationNumber);
            String stationLat = "";
            String stationLon = "";

            if (dbStation != null) {
                stationLat = dbStation.getLat();
                stationLon = dbStation.getLon();
            }
            stationsDatasource.close();

            // Get the station custom field ('o' hidden variable)
            String stationCustomField = matcher.group(2);
            stationCustomField = Utils.getOnlyDigits(stationCustomField);

            // Create the station and add it to the list
            StationEntity station = new StationEntity(stationNumber,
                    stationName, stationLat, stationLon, VehicleTypeEnum.BTT,
                    stationCustomField);
            stationsMap.put(Utils.formatNumberOfDigits(stationNumber, 4),
                    station);
        }

        return stationsMap;
    }
}