package bg.znestorov.sofbus24.publictransport;

import android.app.Activity;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.PublicTransportStationEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Used to process the information from SKGT site, using REGEX and set it to a
 * DirectionsEntity entity
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class ProcessPublicTransportDirection {

    private final StationsDataSource stationDatasource;
    private final VehicleEntity vehicle;
    private final String language;
    private Activity context;
    private String htmlResult;

    public ProcessPublicTransportDirection(Activity context,
                                           VehicleEntity vehicle, String htmlResult) {
        this.context = context;
        this.stationDatasource = new StationsDataSource(context);

        this.vehicle = vehicle;
        this.htmlResult = htmlResult;

        this.language = LanguageChange.getUserLocale(context);
    }

    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public String getHtmlResult() {
        return htmlResult;
    }

    public void setHtmlResult(String htmlResult) {
        this.htmlResult = htmlResult;
    }

    public DirectionsEntity getDirectionsFromHtml() {
        DirectionsEntity ptDirectionEntity = new DirectionsEntity();

        String[] htmlDirectionsParts = htmlResult
                .split(Constants.SCHEDULE_REGEX_DIRECTION_PARTS);
        if (htmlDirectionsParts.length > 2) {
            ptDirectionEntity.setVehicle(vehicle);
            ptDirectionEntity.setVt(getDirectionsHiddenVariables("vt",
                    htmlDirectionsParts));
            ptDirectionEntity.setLid(getDirectionsHiddenVariables("lid",
                    htmlDirectionsParts));
            ptDirectionEntity.setRid(getDirectionsHiddenVariables("rid",
                    htmlDirectionsParts));
            ptDirectionEntity
                    .setDirectionsNames(getDirectionsNames(htmlDirectionsParts));
            ptDirectionEntity
                    .setDirectionsList(getDirectionsList(htmlDirectionsParts));
        }

        return ptDirectionEntity;
    }

    /**
     * Get the hidden variables for each direction (vt, lid and rid)
     *
     * @param name                variable name (vt, lid or rid)
     * @param htmlDirectionsParts an array containing all parts from the HTML result
     * @return an ArrayList containing the hidden variables
     */
    private ArrayList<String> getDirectionsHiddenVariables(String name,
                                                           String... htmlDirectionsParts) {
        ArrayList<String> hiddenVariableValues = new ArrayList<String>();
        Pattern pattern = Pattern.compile(String.format(
                Constants.SCHEDULE_REGEX_DIRECTION_HIDDEN_VARIABLE, name));

        if (htmlDirectionsParts != null) {
            for (String htmlDirectionsPart : htmlDirectionsParts) {
                Matcher matcher = pattern.matcher(htmlDirectionsPart);

                if (matcher.find()) {
                    hiddenVariableValues.add(matcher.group(1));
                }
            }
        }

        return hiddenVariableValues;
    }

    /**
     * Get the directions' names for the selected vehicle
     *
     * @param htmlDirectionsParts an array containing all parts from the HTML result
     * @return an ArrayList, containing all directions' names
     */
    private ArrayList<String> getDirectionsNames(String... htmlDirectionsParts) {
        ArrayList<String> directionsNames = new ArrayList<String>();
        Pattern pattern = Pattern
                .compile(Constants.SCHEDULE_REGEX_DIRECTION_NAME);

        for (String htmlDirectionsPart : htmlDirectionsParts) {
            Matcher matcher = pattern.matcher(htmlDirectionsPart);

            if (matcher.find()) {
                String directionName = Utils.formatDirectionName(matcher
                        .group(1));
                if (!"bg".equals(language)) {
                    directionName = TranslatorCyrillicToLatin.translate(
                            context, directionName);
                }

                directionsNames.add(directionName);
            }
        }

        return directionsNames;
    }

    /**
     * Get a list for each direction fulfilled with all stations for it
     *
     * @param htmlDirectionsParts an array containing all parts from the HTML result
     * @return and ArrayList for each direction fulfilled with an ArrayList
     * containing all stations
     */
    private ArrayList<ArrayList<StationEntity>> getDirectionsList(
            String... htmlDirectionsParts) {
        ArrayList<ArrayList<StationEntity>> ptDirectionsList = new ArrayList<ArrayList<StationEntity>>();
        Pattern pattern = Pattern
                .compile(Constants.SCHEDULE_REGEX_DIRECTION_STATION);

        stationDatasource.open();
        for (String htmlDirectionsPart : htmlDirectionsParts) {
            Matcher matcher = pattern.matcher(htmlDirectionsPart);
            ArrayList<StationEntity> ptStationsList = new ArrayList<StationEntity>();

            while (matcher.find()) {
                try {
                    // Get the station id (special number used to retrieve
                    // information) and station name
                    String stationId = matcher.group(1);
                    String stationName = matcher.group(2).trim();
                    stationName = Utils.getValueBeforeLast(stationName, "(");
                    if (!"bg".equals(language)) {
                        stationName = TranslatorCyrillicToLatin.translate(
                                context, stationName);
                    }

                    // Get the station number
                    String stationNumber = matcher.group(2).trim();
                    stationNumber = Utils.getValueAfterLast(stationNumber, "(");
                    stationNumber = Utils.getValueBefore(stationNumber, ")");
                    stationNumber = Utils.getOnlyDigits(stationNumber);

                    // Get the station coordinates from the DB (if exists)
                    StationEntity dbStation = stationDatasource
                            .getStation(stationNumber);
                    String stationLat = null;
                    String stationLon = null;

                    if (dbStation != null) {
                        stationLat = dbStation.getLat();
                        stationLon = dbStation.getLon();
                    }

                    // Get the station type
                    VehicleTypeEnum stationType = vehicle.getType();

                    // Create the PublicTransport station and add it to the list
                    PublicTransportStationEntity ptStation = new PublicTransportStationEntity(
                            new StationEntity(stationNumber, stationName,
                                    stationLat, stationLon, stationType, null),
                            stationId);
                    ptStationsList.add(ptStation);

                    // Add the NDK stations in the direction list in the correct
                    // place (([1137, 1138 - НДК-тунел], [1139 - НДК-Графити]))
                    StationEntity ndkTunnelStation = getNDKTunnelStation(ptStation
                            .getNumber());
                    if (ndkTunnelStation != null) {
                        PublicTransportStationEntity ptNDKTunnelStation = new PublicTransportStationEntity(
                                ndkTunnelStation, stationId);
                        ptStationsList.add(ptNDKTunnelStation);
                    }

                    StationEntity ndkGrafittiStation = getNDKGrafittiStation(ptStation
                            .getNumber());
                    if (ndkGrafittiStation != null) {
                        PublicTransportStationEntity ptNDKGrafittiStation = new PublicTransportStationEntity(
                                ndkGrafittiStation, stationId);
                        ptStationsList.add(ptNDKGrafittiStation);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            // Add the stations to the directions list
            if (ptStationsList.size() > 0) {
                ptDirectionsList.add(ptStationsList);
            }
        }
        stationDatasource.close();

        return ptDirectionsList;
    }

    /**
     * Check if the next station for this vehicle is the NDK Tunnel station, so
     * add it manually to the list (the station is not shown in the SUMC site as
     * it is in a tunnel and there is no GPS allowed there)
     *
     * @param currentStationNumber the current station number
     * @return the NDK Tunnel station (if it is the next one), otherwise - null
     */
    private StationEntity getNDKTunnelStation(String currentStationNumber) {

        StationEntity ndkTunnelStation = null;

        VehicleTypeEnum vehicleType = vehicle.getType();
        String vehicleNumber = vehicle.getNumber();

        if (vehicleType == VehicleTypeEnum.TRAM && "6".equals(vehicleNumber)) {

            if ("0364".equals(currentStationNumber)) {
                ndkTunnelStation = stationDatasource.getStation("1137");
            }

            if ("0400".equals(currentStationNumber)) {
                ndkTunnelStation = stationDatasource.getStation("1138");
            }
        }

        return ndkTunnelStation;
    }

    /**
     * Check if the next station for this vehicle is the NDK Grafitti station,
     * so add it manually to the list (the station is not shown in the SUMC site
     * as it is in a tunnel and there is no GPS allowed there)
     *
     * @param currentStationNumber the current station number
     * @return the NDK Grafitti station (if it is the next one), otherwise -
     * null
     */
    private StationEntity getNDKGrafittiStation(String currentStationNumber) {

        StationEntity ndkGrafittiStation = null;

        VehicleTypeEnum vehicleType = vehicle.getType();
        String vehicleNumber = vehicle.getNumber();

        if (vehicleType == VehicleTypeEnum.TROLLEY
                && ("1".equals(vehicleNumber) || "2".equals(vehicleNumber)
                || "5".equals(vehicleNumber)
                || "7".equals(vehicleNumber)
                || "8".equals(vehicleNumber) || "9"
                .equals(vehicleNumber))
                && "0363".equals(currentStationNumber)) {

            ndkGrafittiStation = stationDatasource.getStation("1139");
        }

        return ndkGrafittiStation;
    }
}