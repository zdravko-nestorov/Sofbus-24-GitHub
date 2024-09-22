package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.MapUtils;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.TranslatorLatinToCyrillic;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Stations data source class, responsible for all interactions with the
 * stations database
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class StationsDataSource {

    // Number of nearest stations
    private final Context context;
    private final String language;
    private final Sofbus24SQLite dbHelper;

    // Columns of the STATIONS Table
    private final String[] allColumns = {
            Sofbus24SQLite.COLUMN_PK_STAT_ID,
            Sofbus24SQLite.COLUMN_STAT_NUMBER,
            Sofbus24SQLite.COLUMN_STAT_NAME,
            Sofbus24SQLite.COLUMN_STAT_LATITUDE,
            Sofbus24SQLite.COLUMN_STAT_LONGITUDE,
            Sofbus24SQLite.COLUMN_STAT_TYPE,
            Sofbus24SQLite.COLUMN_STAT_SKGT_ID,
            Sofbus24SQLite.COLUMN_STAT_SKGT_TITLE,
            Sofbus24SQLite.COLUMN_STAT_SKGT_NAME,
            Sofbus24SQLite.COLUMN_STAT_SKGT_CODE,
            Sofbus24SQLite.COLUMN_STAT_SKGT_POSITION,
            Sofbus24SQLite.COLUMN_STAT_SKGT_TYPE,
            Sofbus24SQLite.COLUMN_STAT_SKGT_EXT_ID};
    // Database fields
    private SQLiteDatabase database;

    public StationsDataSource(Activity context) {
        this.context = context;
        dbHelper = new Sofbus24SQLite(context);
        language = LanguageChange.getUserLocale(context);
    }

    public void open() throws SQLException {
        database = Sofbus24DatabaseUtils.openDb(dbHelper, database);
    }

    public void close() {
        Sofbus24DatabaseUtils.closeDb(dbHelper, database);
    }

    /**
     * Check if a station exists in the DB
     *
     * @param station the input station
     * @return the station if it is found in the DB and null otherwise
     */
    public StationEntity getStation(StationEntity station) {
        // Selecting the row that contains the station data
        try (Cursor cursor = database
                .query(Sofbus24SQLite.TABLE_SOF_STAT,
                        allColumns,
                        Sofbus24SQLite.COLUMN_STAT_NUMBER + " = ? AND " + Sofbus24SQLite.COLUMN_STAT_TYPE + " = ?",
                        new String[]{station.getNumber(), VehicleTypeEnum.getStationTypeByVehicleType(station.getType()).name()},
                        null, null, null)) {

            if (cursor.getCount() > 0) {
                // Moving the cursor to the first column of the selected row
                cursor.moveToFirst();

                // Creating station object
                StationEntity foundStation = cursorToStation(cursor);
                if (station.getType() == VehicleTypeEnum.METRO
                        || station.getType() == VehicleTypeEnum.METRO1
                        || station.getType() == VehicleTypeEnum.METRO2
                        || station.getType() == VehicleTypeEnum.METRO3
                        || station.getType() == VehicleTypeEnum.METRO4) {
                    foundStation.setCustomField(String.format(
                            Constants.METRO_STATION_URL, foundStation.getNumber()));
                }

                return foundStation;
            } else {
                return null;
            }

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Check if a station exists in the DB via the station number
     *
     * @param stationNumber the input station number
     * @return the station if it is found in the DB and null otherwise
     */
    public StationEntity getStation(String stationNumber) {
        // Selecting the row that contains the station data
        try (Cursor cursor = database.query(Sofbus24SQLite.TABLE_SOF_STAT,
                allColumns, Sofbus24SQLite.COLUMN_STAT_NUMBER + " = "
                        + stationNumber, null, null, null, null)) {

            if (cursor.getCount() > 0) {
                // Moving the cursor to the first column of the selected row
                cursor.moveToFirst();

                // Creating station object
                StationEntity foundStation = cursorToStation(cursor);
                if (foundStation.getType() == VehicleTypeEnum.METRO
                        || foundStation.getType() == VehicleTypeEnum.METRO1
                        || foundStation.getType() == VehicleTypeEnum.METRO2
                        || foundStation.getType() == VehicleTypeEnum.METRO3
                        || foundStation.getType() == VehicleTypeEnum.METRO4) {
                    foundStation.setCustomField(String.format(
                            Constants.METRO_STATION_URL, foundStation.getNumber()));
                }

                return foundStation;
            } else {
                return null;
            }

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Check if a station exists in the DB via the station number
     *
     * @param stationNumber the input station number
     * @return the station if it is found in the DB and null otherwise
     */
    public StationEntity getStation(int stationNumber) {
        return getStation(stationNumber + "");
    }

    /**
     * Check if a station exists in the DB
     *
     * @param skgtExtId the SGKT ext_id
     * @return the station if it is found in the DB and null otherwise
     */
    public StationEntity getStationViaExtId(String skgtExtId) {
        // Selecting the row that contains the station data
        try (Cursor cursor = database
                .query(Sofbus24SQLite.TABLE_SOF_STAT,
                        allColumns,
                        Sofbus24SQLite.COLUMN_STAT_SKGT_EXT_ID + " = ?",
                        new String[]{skgtExtId}, null, null, null)) {

            if (cursor.getCount() > 0) {
                // Moving the cursor to the first column of the selected row
                cursor.moveToFirst();

                // Creating station object
                return cursorToStation(cursor);
            } else {
                return null;
            }

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Get all stations via type from the database
     *
     * @param vehicleType type of the station
     * @return a list with all stations matching the input type from the DB
     */
    public List<StationEntity> getMetroStationsViaDirection(
            VehicleTypeEnum vehicleType) {

        List<StationEntity> stations = new ArrayList<StationEntity>();

        // Indicates the residue modulo according to the metro station number
        // (METRO1 --> '1', METRO2 --> '0')
        int vehicleTypeIntValue;
        switch (vehicleType) {
            case METRO1:
                vehicleTypeIntValue = 1;
                break;
            default:
                vehicleTypeIntValue = 0;
                break;
        }

        StringBuilder query = new StringBuilder();
        query.append(" SELECT * 					%n");
        query.append(" FROM %s						%n");
        query.append(" WHERE %s %% 2 = %s			%n");
        query.append(" AND %s LIKE '%%%s%%'			%n");

        // Get all stations via type from the database
        String queryString = String.format(query.toString(),
                Sofbus24SQLite.TABLE_SOF_STAT,
                Sofbus24SQLite.COLUMN_STAT_NUMBER, vehicleTypeIntValue,
                Sofbus24SQLite.COLUMN_STAT_TYPE, VehicleTypeEnum.METRO);
        try (Cursor cursor = database.rawQuery(queryString, null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                StationEntity foundStation = cursorToStation(cursor);
                if (vehicleType == VehicleTypeEnum.METRO
                        || vehicleType == VehicleTypeEnum.METRO1
                        || vehicleType == VehicleTypeEnum.METRO2
                        || vehicleType == VehicleTypeEnum.METRO3
                        || vehicleType == VehicleTypeEnum.METRO4) {
                    foundStation.setCustomField(String.format(
                            Constants.METRO_STATION_URL, foundStation.getNumber()));
                }

                if (!"XXXX".equals(foundStation.getNumber())) {
                    stations.add(foundStation);
                }

                cursor.moveToNext();
            }

            // Sorting the stations in correct order (both directions should be sorted in ASC way,
            // as the MetroLoadStations class is reversing the second direction)
            Utils.sortStationList(stations, true);
            return stations;

        } catch (Exception e) {
            return stations;
        }
    }

    /**
     * Get the stations which NUMBER or NAME contains the searched text
     *
     * @param searchText the user search text
     * @return a list with all stations matching the input conditions
     */
    public List<StationEntity> getStationsViaSearch(String searchText) {
        List<StationEntity> stations = new ArrayList<StationEntity>();
        Locale currentLocale = new Locale(language);
        searchText = searchText.toLowerCase(currentLocale);
        searchText = TranslatorLatinToCyrillic.translate(context, searchText);

        // Special case of search - for example: "0764"
        String searchNumber = searchText;
        if (Utils.isInteger(searchText) && searchText.length() == 4 && Utils.removeLeadingZeroes(searchText).length() < 4) {
            searchNumber = Utils.removeLeadingZeroes(searchNumber);
            searchNumber = "'" + searchNumber + "'";
        } else {
            searchNumber = "'%" + searchNumber + "%'";
        }

        StringBuilder query = new StringBuilder();
        query.append(" SELECT * 											\n");
        query.append(" FROM " + Sofbus24SQLite.TABLE_SOF_STAT + "			\n");
        query.append(" WHERE ( 												\n");
        query.append(" 		lower(CAST(" + Sofbus24SQLite.COLUMN_STAT_NUMBER
                + " AS TEXT)) LIKE " + searchNumber + "   					\n");
        query.append(" OR 													\n");
        query.append(" 		lower(" + Sofbus24SQLite.COLUMN_STAT_NAME
                + ") LIKE '%" + searchText + "%')		 					\n");
        query.append(" LIMIT 300											\n");

        // Get the stations which NUMBER or NAME contains the searched text
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                StationEntity foundStation = cursorToStation(cursor);
                stations.add(new VirtualBoardsStationEntity(foundStation));
                cursor.moveToNext();
            }
            return stations;

        } catch (Exception e) {
            return stations;
        }
    }

    /**
     * Get all stations from the database
     *
     * @return a list with all stations from the DB
     */
    public List<StationEntity> getAllStations() {
        List<StationEntity> stations = new ArrayList<StationEntity>();

        // Selecting all fields of the TABLE_STATIONS
        try (Cursor cursor = database.query(Sofbus24SQLite.TABLE_SOF_STAT,
                allColumns, null, null, null, null, null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                StationEntity foundStation = cursorToStation(cursor);
                if (foundStation.getType() == VehicleTypeEnum.METRO
                        || foundStation.getType() == VehicleTypeEnum.METRO1
                        || foundStation.getType() == VehicleTypeEnum.METRO2
                        || foundStation.getType() == VehicleTypeEnum.METRO3
                        || foundStation.getType() == VehicleTypeEnum.METRO4) {
                    foundStation.setCustomField(String.format(
                            Constants.METRO_STATION_URL, foundStation.getNumber()));
                }

                stations.add(foundStation);
                cursor.moveToNext();
            }
            return stations;

        } catch (Exception e) {
            return stations;
        }
    }

    /**
     * Delete all stations from the database;
     */
    public void deleteAllStations() {
        database.delete(Sofbus24SQLite.TABLE_SOF_STAT, null, null);
    }

    /**
     * Get the nearest stations from the DB to a location according to a radius
     *
     * @param context         current activity context
     * @param currentPosition the current position
     * @param stationsRadius  current position radiusF
     * @return a list with the closest stations
     */
    public List<StationEntity> getClosestStations(Activity context,
                                                  LatLng currentPosition, BigDecimal stationsRadius) {

        FavouritesDataSource favouritesDatasource = new FavouritesDataSource(
                context);
        List<StationEntity> stations = new ArrayList<StationEntity>();

        // IMPORTANT: Used for correct ordering
        Double fudge = Math.pow(
                Math.cos(Math.toRadians(currentPosition.latitude)), 2);

        StringBuilder query = new StringBuilder();
        query.append(" SELECT * 											\n");
        query.append(" FROM " + Sofbus24SQLite.TABLE_SOF_STAT + "			\n");
        query.append(" ORDER BY												\n");
        query.append(" 		( (												\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LATITUDE + " - "
                + currentPosition.latitude);
        query.append(" 		) * (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LATITUDE + " - "
                + currentPosition.latitude);
        query.append(" 		) + (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LONGITUDE + " - "
                + currentPosition.longitude);
        query.append(" 		) * (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LONGITUDE + " - "
                + currentPosition.longitude);
        query.append(" 		) * " + fudge + " ) ASC							\n");

        // Get the nearest stations from the DB to a location according to a radius
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();

            // Open the Favourites DB to check if the station is already there
            favouritesDatasource.open();

            while (!cursor.isAfterLast()) {
                StationEntity foundStation = cursorToStation(cursor);

                // Check if the station has coordinates in the database. Also we should check
                // if the map distance between the locations is not "∞" (which means that a
                // strange case occurred (reported in GooglePlay)
                if (foundStation.hasCoordinates() &&
                        !"∞".equals(MapUtils.getMapDistance(currentPosition, foundStation))) {

                    // Get the distance to the current station
                    BigDecimal distance = new BigDecimal(MapUtils.getMapDistance(
                            currentPosition, foundStation));

                    // Check if the station is in the given radius
                    if (distance.compareTo(stationsRadius) != 1) {

                        // Check the type of the station and if it is METRO add the
                        // schedule URL to the custom field
                        if ((foundStation.getType() == VehicleTypeEnum.METRO
                                || foundStation.getType() == VehicleTypeEnum.METRO1
                                || foundStation.getType() == VehicleTypeEnum.METRO2
                                || foundStation.getType() == VehicleTypeEnum.METRO3
                                || foundStation.getType() == VehicleTypeEnum.METRO4)) {
                            foundStation.setCustomField(String.format(
                                    Constants.METRO_STATION_URL,
                                    foundStation.getNumber()));
                        }

                        // Check if the station is not in Favorites
                        if (favouritesDatasource.getStation(foundStation) == null) {
                            stations.add(foundStation);
                        } else {
                            stations.add(null);
                        }

                        cursor.moveToNext();
                    } else {
                        break;
                    }
                } else {
                    cursor.moveToNext();
                }
            }

            // Closing the Favourites DB
            favouritesDatasource.close();
            return stations;

        } catch (Exception e) {
            return stations;
        }
    }

    /**
     * Get the nearest station from the DB to a location
     *
     * @param context         current activity context
     * @param currentLocation the current location
     * @return the closest station
     */
    public StationEntity getClosestStation(Activity context,
                                           Location currentLocation) {

        StationEntity station = null;

        // IMPORTANT: Used for correct ordering
        Double fudge = Math.pow(
                Math.cos(Math.toRadians(currentLocation.getLatitude())), 2);

        StringBuilder query = new StringBuilder();
        query.append(" SELECT * 											\n");
        query.append(" FROM " + Sofbus24SQLite.TABLE_SOF_STAT + "			\n");
        query.append(" ORDER BY												\n");
        query.append(" 		( (												\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LATITUDE + " - "
                + currentLocation.getLatitude());
        query.append(" 		) * (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LATITUDE + " - "
                + currentLocation.getLatitude());
        query.append(" 		) + (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LONGITUDE + " - "
                + currentLocation.getLongitude());
        query.append(" 		) * (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LONGITUDE + " - "
                + currentLocation.getLongitude());
        query.append(" 		) * " + fudge + " ) ASC							\n");

        // Get the nearest station from the DB to a location
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();

            while (!cursor.isAfterLast()) {
                StationEntity foundStation = cursorToStation(cursor);

                // Check if the station has coordinates in the database
                if (foundStation.hasCoordinates()) {
                    station = foundStation;

                    break;
                } else {
                    cursor.moveToNext();
                }
            }
            return station;

        } catch (Exception e) {
            return station;
        }
    }

    /**
     * Get the nearest stations from the DB to a location according to the
     * needed page
     *
     * @param currentPosition the current position
     * @param stationsToLoad  number of stations to load
     * @param searchText      if there is any criteria for searching
     * @return a list with the closest stations
     */
    public List<StationEntity> getClosestStations(LatLng currentPosition,
                                                  int stationsToLoad, String searchText) {
        List<StationEntity> stations = new ArrayList<StationEntity>();

        Locale currentLocale = new Locale(language);
        searchText = searchText.toLowerCase(currentLocale);
        searchText = TranslatorLatinToCyrillic.translate(context, searchText);

        // IMPORTANT: Used for correct ordering
        Double fudge = Math.pow(
                Math.cos(Math.toRadians(currentPosition.latitude)), 2);

        StringBuilder query = new StringBuilder();
        query.append(" SELECT * 											\n");
        query.append(" FROM " + Sofbus24SQLite.TABLE_SOF_STAT + "			\n");
        query.append(" WHERE ( 												\n");
        query.append(" 		lower(CAST(" + Sofbus24SQLite.COLUMN_STAT_NUMBER
                + " AS TEXT)) LIKE '%" + searchText + "%'					\n");
        query.append(" OR 													\n");
        query.append(" 		lower(" + Sofbus24SQLite.COLUMN_STAT_NAME
                + ") LIKE '%" + searchText + "%'		 					\n");
        query.append(" )													\n");
        query.append(" ORDER BY												\n");
        query.append(" 		( (												\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LATITUDE + " - "
                + currentPosition.latitude);
        query.append(" 		) * (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LATITUDE + " - "
                + currentPosition.latitude);
        query.append(" 		) + (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LONGITUDE + " - "
                + currentPosition.longitude);
        query.append(" 		) * (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LONGITUDE + " - "
                + currentPosition.longitude);
        query.append(" 		) * " + fudge + " ) ASC							\n");

        // Get the nearest stations from the DB to a location according to the needed page
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();

            int stationsCount = 1;
            while (!cursor.isAfterLast() && stationsCount <= stationsToLoad) {
                StationEntity foundStation = cursorToStation(cursor);
                boolean isStationInRange = true;
                try {
                    BigDecimal distance = new BigDecimal(MapUtils.getMapDistance(
                            currentPosition, foundStation));
                    if (distance
                            .compareTo(Constants.GLOBAL_PARAM_CLOSEST_STATION_DISTANCE) == 1) {
                        isStationInRange = false;
                    }
                } catch (Exception e) {
                    isStationInRange = false;
                }

                // Check if the station is in range
                if (isStationInRange) {
                    if ((foundStation.getType() == VehicleTypeEnum.METRO
                            || foundStation.getType() == VehicleTypeEnum.METRO1
                            || foundStation.getType() == VehicleTypeEnum.METRO2
                            || foundStation.getType() == VehicleTypeEnum.METRO3
                            || foundStation.getType() == VehicleTypeEnum.METRO4)) {
                        foundStation.setCustomField(String.format(
                                Constants.METRO_STATION_URL,
                                foundStation.getNumber()));
                    }

                    stations.add(foundStation);

                    stationsCount++;
                    cursor.moveToNext();
                } else {
                    break;
                }
            }
            return stations;

        } catch (Exception e) {
            return stations;
        }
    }

    /**
     * Get the nearest stations from the DB to a location according to the
     * needed page
     *
     * @param currentPosition the current position
     * @param stationPage     each page contains 10 stations
     * @param searchText      if there is any criteria for searching
     * @return a list with the closest stations
     */
    public List<StationEntity> getClosestStationsByPage(LatLng currentPosition,
                                                        int stationPage, String searchText) {
        List<StationEntity> stations = new ArrayList<StationEntity>();

        Locale currentLocale = new Locale(language);
        searchText = searchText.toLowerCase(currentLocale);
        searchText = TranslatorLatinToCyrillic.translate(context, searchText);

        // IMPORTANT: Used for correct ordering
        Double fudge = Math.pow(
                Math.cos(Math.toRadians(currentPosition.latitude)), 2);

        StringBuilder query = new StringBuilder();
        query.append(" SELECT * 											\n");
        query.append(" FROM " + Sofbus24SQLite.TABLE_SOF_STAT + "			\n");
        query.append(" WHERE ( 												\n");
        query.append(" 		lower(CAST(" + Sofbus24SQLite.COLUMN_STAT_NUMBER
                + " AS TEXT)) LIKE '%" + searchText + "%'					\n");
        query.append(" OR 													\n");
        query.append(" 		lower(" + Sofbus24SQLite.COLUMN_STAT_NAME
                + ") LIKE '%" + searchText + "%'		 					\n");
        query.append(" )													\n");
        query.append(" ORDER BY												\n");
        query.append(" 		( (												\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LATITUDE + " - "
                + currentPosition.latitude);
        query.append(" 		) * (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LATITUDE + " - "
                + currentPosition.latitude);
        query.append(" 		) + (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LONGITUDE + " - "
                + currentPosition.longitude);
        query.append(" 		) * (											\n");
        query.append(Sofbus24SQLite.COLUMN_STAT_LONGITUDE + " - "
                + currentPosition.longitude);
        query.append(" 		) * " + fudge + " ) ASC							\n");

        // Get the nearest stations from the DB to a location according to the needed page
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();

            int stationsCount = 1;
            while (!cursor.isAfterLast() && stationsCount <= stationPage * 10) {
                StationEntity foundStation = cursorToStation(cursor);
                boolean isStationInRange = true;
                try {
                    BigDecimal distance = new BigDecimal(MapUtils.getMapDistance(
                            currentPosition, foundStation));
                    if (distance
                            .compareTo(Constants.GLOBAL_PARAM_CLOSEST_STATION_DISTANCE) == 1) {
                        isStationInRange = false;
                    }
                } catch (Exception e) {
                    isStationInRange = false;
                }

                // Check if the station is in range
                if (isStationInRange) {
                    if (stationsCount > ((stationPage - 1) * 10)) {
                        if (foundStation.getType() == VehicleTypeEnum.METRO
                                || foundStation.getType() == VehicleTypeEnum.METRO1
                                || foundStation.getType() == VehicleTypeEnum.METRO2
                                || foundStation.getType() == VehicleTypeEnum.METRO3
                                || foundStation.getType() == VehicleTypeEnum.METRO4) {
                            foundStation.setCustomField(String.format(
                                    Constants.METRO_STATION_URL,
                                    foundStation.getNumber()));
                        }

                        stations.add(foundStation);
                    }

                    stationsCount++;
                    cursor.moveToNext();
                } else {
                    break;
                }
            }
            return stations;

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Creating new Station object with the data of the current row of the
     * database
     *
     * @param cursor the input cursor for interacting with the DB
     * @return the station object on the current row
     */
    private StationEntity cursorToStation(Cursor cursor) {
        StationEntity station = new StationEntity();

        // Check if have to translate the station name
        String stationName = cursor.getString(2);
        if (!"bg".equals(language)) {
            stationName = TranslatorCyrillicToLatin.translate(context,
                    stationName);
        }

        // GooglePlay reported a strange error where the type of vehicle is null.
        // Handle this case by setting the vehicle type a default value of BUS
        VehicleTypeEnum vehicleType;
        try {
            vehicleType = VehicleTypeEnum.valueOf(cursor.getString(5));
        } catch (Exception e) {
            vehicleType = VehicleTypeEnum.BUS;
        }

        // Getting all columns of the row and setting them to a Station object
        station.setNumber(cursor.getString(1));
        station.setName(stationName);
        station.setLat(cursor.getString(3));
        station.setLon(cursor.getString(4));
        station.setType(vehicleType);
        station.setSkgtId(cursor.getString(6));
        station.setSkgtTitle(cursor.getString(7));
        station.setSkgtName(cursor.getString(8));
        station.setSkgtCode(cursor.getString(9));
        station.setSkgtPosition(cursor.getString(10).split(","));
        station.setSkgtType(cursor.getString(11));
        station.setSkgtExtId(cursor.getString(12));
        station.setCustomField(getCustomField(station));

        return station;
    }

    /**
     * Define what to put in the custom field in the DB via the station type
     *
     * @param station the inputStation
     * @return what to be inserted in the custom field in the DB
     */
    private String getCustomField(StationEntity station) {
        String stationCustomField;

        switch (station.getType()) {
            case METRO:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                stationCustomField = String.format(Constants.METRO_STATION_URL,
                        station.getNumber());
                break;
            default:
                stationCustomField = "";
                break;
        }

        return stationCustomField;
    }
}