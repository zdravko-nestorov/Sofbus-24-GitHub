package bg.znestorov.sofbus24.databases;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import bg.znestorov.sofbus24.entity.OrderTypeEnum;
import bg.znestorov.sofbus24.entity.PositionTypeEnum;
import bg.znestorov.sofbus24.entity.SortTypeEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.TranslatorLatinToCyrillic;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Favorites data source used for DB interactions
 *
 * @author Zdravko Nestorov
 * @version 2.0
 */
public class FavouritesDataSource {

    private final String[] allColumns = {FavouritesSQLite.COLUMN_NUMBER,
            FavouritesSQLite.COLUMN_NAME, FavouritesSQLite.COLUMN_LAT,
            FavouritesSQLite.COLUMN_LON, FavouritesSQLite.COLUMN_CUSTOM_FIELD,
            FavouritesSQLite.COLUMN_DATE_ADDED,
            FavouritesSQLite.COLUMN_DATE_LAST_ACCESS,
            FavouritesSQLite.COLUMN_USAGE_COUNT,
            FavouritesSQLite.COLUMN_POSITION};
    private final Activity context;
    private final String language;
    // Database fields
    private SQLiteDatabase database;
    private FavouritesSQLite dbHelper;

    public FavouritesDataSource(Activity context) {
        this.context = context;
        this.dbHelper = new FavouritesSQLite(context);
        this.language = LanguageChange.getUserLocale(context);
    }

    public FavouritesDataSource(Activity context, SQLiteDatabase database) {
        this.context = context;
        this.database = database;
        this.language = LanguageChange.getUserLocale(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    /**
     * Adding a station to the database
     *
     * @param station the input station
     * @return the station if it is added successfully and null if already
     * exists
     */
    public StationEntity createStation(StationEntity station) {

        if (getStation(station) == null) {

            // Check if have to translate the station name
            String stationName = station.getName();
            if (!"bg".equals(language)) {
                stationName = TranslatorLatinToCyrillic.translate(context,
                        stationName);
            }

            // Creating ContentValues object and insert the station data in it
            ContentValues values = new ContentValues();
            values.put(FavouritesSQLite.COLUMN_NUMBER, station.getNumber());
            values.put(FavouritesSQLite.COLUMN_NAME, stationName);
            values.put(FavouritesSQLite.COLUMN_LAT,
                    getCoordinates(station.getNumber(), station.getLat()));
            values.put(FavouritesSQLite.COLUMN_LON,
                    getCoordinates(station.getNumber(), station.getLon()));
            values.put(FavouritesSQLite.COLUMN_CUSTOM_FIELD,
                    getCustomField(station));

            // Creating the information fields for each favorite (new Favorites
            // version)
            String currentDate = Utils.getCurrentDateTime();

            String dateAdded = station.getDateAdded();
            if (dateAdded == null || "".equals(dateAdded)) {
                dateAdded = currentDate;
            }
            values.put(FavouritesSQLite.COLUMN_DATE_ADDED, dateAdded);

            String dateLastAccess = station.getDateLastAccess();
            if (dateLastAccess == null || "".equals(dateLastAccess)) {
                dateLastAccess = currentDate;
            }
            values.put(FavouritesSQLite.COLUMN_DATE_LAST_ACCESS, dateLastAccess);

            values.put(FavouritesSQLite.COLUMN_USAGE_COUNT,
                    station.getUsageCount());
            values.put(FavouritesSQLite.COLUMN_POSITION, getNextPosition());

            // Insert the ContentValues data into the database
            database.insert(FavouritesSQLite.TABLE_FAVOURITES, null, values);

            // Selecting the row that contains the station data
            Cursor cursor = database.query(FavouritesSQLite.TABLE_FAVOURITES,
                    allColumns, FavouritesSQLite.COLUMN_NUMBER + " = "
                            + station.getNumber(), null, null, null, null);

            // Moving the cursor to the first column of the selected row
            cursor.moveToFirst();

            // Creating newStation and closing the cursor
            StationEntity insertedStation = cursorToStation(cursor);
            cursor.close();

            return insertedStation;
        } else {
            return null;
        }
    }

    /**
     * Adding a list of stations to the database
     *
     * @param stationsList the lists of stations
     */
    public void createStations(List<StationEntity> stationsList) {
        if (stationsList != null && stationsList.size() > 0) {
            for (int i = 0; i < stationsList.size(); i++) {
                createStation(stationsList.get(i));
            }
        }
    }

    /**
     * Figure out which coordinate to be taken, so add the station in the
     * database (latitude and longitude)
     *
     * @param stationNumber     the number of the station (used to search the DB for the
     *                          station)
     * @param stationCoordinate the coordinate of the station (latitude or longitude)
     * @return the coordinate (latitude or longitude), which will be inserted in
     * the database
     */
    private String getCoordinates(String stationNumber, String stationCoordinate) {
        String coordinate = Constants.GLOBAL_PARAM_EMPTY;

        StationsDataSource stationsDS = new StationsDataSource(context);
        stationsDS.open();

        if (stationCoordinate != null && !"".equals(stationCoordinate)) {
            coordinate = stationCoordinate;
        } else if (stationsDS.getStation(stationNumber) != null) {
            coordinate = stationsDS.getStation(stationNumber).getLat();
        }
        stationsDS.close();

        return coordinate;
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
            case METRO1:
            case METRO2:
                stationCustomField = String.format(Constants.METRO_STATION_URL,
                        station.getNumber());
                break;
            default:
                stationCustomField = String.valueOf(station.getCustomField());
                break;
        }

        return stationCustomField;
    }

    /**
     * Get the position of the last added favorite in the table
     *
     * @return the last added favorite position
     */
    private int getLastPosition() {
        int nextPosition = 1;
        @SuppressLint("Recycle") Cursor cursor = database
                .query(FavouritesSQLite.TABLE_FAVOURITES, new String[]{"MAX("
                                + FavouritesSQLite.COLUMN_POSITION + ")"}, null, null,
                        null, null, null);

        if (cursor.getCount() > 0) {
            // Moving the cursor to the first result
            cursor.moveToFirst();

            // Getting the last position of the records and adding 1 to get the
            // next free position
            nextPosition = cursor.getInt(0);
        }

        return nextPosition;
    }

    /**
     * Get the next free position to add a favorite in the table
     *
     * @return the next free position
     */
    private int getNextPosition() {
        return getLastPosition() + 1;
    }

    /**
     * Delete station from the database
     *
     * @param station the input station
     */
    public void deleteStation(StationEntity station) {
        String where = FavouritesSQLite.COLUMN_NUMBER + " = ?";
        String[] whereArgs = new String[]{String.valueOf(station.getNumber())};

        // Remove the station
        database.delete(FavouritesSQLite.TABLE_FAVOURITES, where, whereArgs);

        // Reorder the DB with stations
        updateStations(getAllStationsSorted(SortTypeEnum.CUSTOM));
    }

    /**
     * Update a station from the database. The search is done by the station
     * code and the custom field is updated.
     *
     * @param station the new station parameters
     */
    public void updateStation(StationEntity station) {

        // Check if have to translate the station name
        String stationName = station.getName();
        if (!"bg".equals(language)) {
            stationName = TranslatorLatinToCyrillic.translate(context,
                    stationName);
        }

        ContentValues dataToInsert = new ContentValues();
        dataToInsert.put(FavouritesSQLite.COLUMN_NAME, stationName);
        dataToInsert.put(FavouritesSQLite.COLUMN_LAT, station.getLat());
        dataToInsert.put(FavouritesSQLite.COLUMN_LON, station.getLon());
        dataToInsert.put(FavouritesSQLite.COLUMN_CUSTOM_FIELD,
                station.getCustomField());
        dataToInsert.put(FavouritesSQLite.COLUMN_DATE_ADDED,
                station.getDateAdded());
        dataToInsert.put(FavouritesSQLite.COLUMN_DATE_LAST_ACCESS,
                station.getDateLastAccess());
        dataToInsert.put(FavouritesSQLite.COLUMN_USAGE_COUNT,
                station.getUsageCount());
        dataToInsert.put(FavouritesSQLite.COLUMN_POSITION,
                station.getPosition());

        String where = FavouritesSQLite.COLUMN_NUMBER + " = ?";
        String[] whereArgs = new String[]{String.valueOf(station.getNumber())};

        database.update(FavouritesSQLite.TABLE_FAVOURITES, dataToInsert, where,
                whereArgs);
    }

    /**
     * Update a list with stations from the database. The search is done by the
     * station code and the custom field is updated.
     *
     * @param stations the new list with stations
     */
    private void updateStations(List<StationEntity> stations) {
        for (int i = 0; i < stations.size(); i++) {
            StationEntity station = stations.get(i);
            station.setPosition(i + 1);
            updateStation(station);
        }
    }

    /**
     * Update the station information (set the last access date and the usage
     * count)
     *
     * @param station the new station parameters
     */
    public void updateStationInfo(StationEntity station) {
        station = getStation(station);
        station.setDateLastAccess(Utils.getCurrentDateTime());
        station.setUsageCount(station.getUsageCount() + 1);

        updateStation(station);
    }

    /**
     * Check if a station exists in the DB
     *
     * @param station the input station
     * @return the station if it is found in the DB and null otherwise
     */
    public StationEntity getStation(StationEntity station) {
        // Selecting the row that contains the station data
        Cursor cursor = database.query(FavouritesSQLite.TABLE_FAVOURITES,
                allColumns,
                FavouritesSQLite.COLUMN_NUMBER + " = " + station.getNumber(),
                null, null, null, null);

        if (cursor.getCount() > 0) {
            // Moving the cursor to the first column of the selected row
            cursor.moveToFirst();

            // Creating station object and closing the cursor
            StationEntity foundStation = cursorToStation(cursor);
            cursor.close();

            return foundStation;
        } else {
            cursor.close();

            return null;
        }
    }

    /**
     * Check if a station exists in the DB
     *
     * @param stationNumber the number of the input station
     * @return the station if it is found in the DB and null otherwise
     */
    public StationEntity getStation(String stationNumber) {
        // Selecting the row that contains the station data
        Cursor cursor = database.query(FavouritesSQLite.TABLE_FAVOURITES,
                allColumns, FavouritesSQLite.COLUMN_NUMBER + " = "
                        + stationNumber, null, null, null, null);

        if (cursor.getCount() > 0) {
            // Moving the cursor to the first column of the selected row
            cursor.moveToFirst();

            // Creating station object and closing the cursor
            StationEntity foundStation = cursorToStation(cursor);
            cursor.close();

            return foundStation;
        } else {
            cursor.close();

            return null;
        }
    }

    /**
     * Check if a station exists in the DB (according to its position)
     *
     * @param position the input station position
     * @return the station if it is found in the DB and null otherwise
     */
    private StationEntity getStation(int position) {
        // Selecting the row that contains the station data
        Cursor cursor = database.query(FavouritesSQLite.TABLE_FAVOURITES,
                allColumns,
                FavouritesSQLite.COLUMN_POSITION + " = " + position, null,
                null, null, null);

        if (cursor.getCount() > 0) {
            // Moving the cursor to the first column of the selected row
            cursor.moveToFirst();

            // Creating station object and closing the cursor
            StationEntity foundStation = cursorToStation(cursor);
            cursor.close();

            return foundStation;
        } else {
            cursor.close();

            return null;
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

        StringBuilder query = new StringBuilder();
        query.append(" SELECT * 											\n");
        query.append(" FROM " + FavouritesSQLite.TABLE_FAVOURITES + "		\n");
        query.append(" WHERE 												\n");
        query.append(" 	lower(CAST(" + FavouritesSQLite.COLUMN_NUMBER
                + " AS TEXT)) LIKE '%" + searchText + "%'					\n");
        query.append(" OR 													\n");
        query.append(" 	lower(" + FavouritesSQLite.COLUMN_NAME + ") LIKE '%"
                + searchText + "%'		 									\n");

        Cursor cursor = database.rawQuery(query.toString(), null);

        // Iterating the cursor and fill the empty List<Station>
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            StationEntity station = cursorToStation(cursor);
            stations.add(station);
            cursor.moveToNext();
        }

        // Closing the cursor
        cursor.close();

        return stations;
    }

    /**
     * Get all stations from the database (used only to upgrade the db version)
     *
     * @return a list with all stations from the DB
     */
    public List<StationEntity> getAllStations() {
        List<StationEntity> stations = new ArrayList<StationEntity>();

        // Selecting all fields of the TABLE_FAVOURITES
        String[] allColumns = {FavouritesSQLite.COLUMN_NUMBER,
                FavouritesSQLite.COLUMN_NAME, FavouritesSQLite.COLUMN_LAT,
                FavouritesSQLite.COLUMN_LON,
                FavouritesSQLite.COLUMN_CUSTOM_FIELD};
        Cursor cursor = database.query(FavouritesSQLite.TABLE_FAVOURITES,
                allColumns, null, null, null, null, null);

        // Iterating the cursor and fill the empty List<Station>
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            StationEntity station = cursorToStation(cursor);
            stations.add(station);
            cursor.moveToNext();
        }

        // Closing the cursor
        cursor.close();

        return stations;
    }

    /**
     * Get all stations from the database in some order
     *
     * @param sortType the sort type of the extracted stations from the DB
     * @return a list with all stations from the DB
     */
    public ArrayList<StationEntity> getAllStationsSorted(SortTypeEnum sortType) {
        ArrayList<StationEntity> stations = new ArrayList<StationEntity>();

        // Selecting all fields of the TABLE_FAVOURITES
        String orderBy = getOrderBy(sortType);
        Cursor cursor = database.query(FavouritesSQLite.TABLE_FAVOURITES,
                allColumns, null, null, null, null, orderBy);

        // Iterating the cursor and fill the empty List<Station>
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            StationEntity station = cursorToStation(cursor);
            stations.add(station);
            cursor.moveToNext();
        }

        // Closing the cursor
        cursor.close();

        return stations;
    }

    /**
     * Get all stations from the database in some order
     *
     * @param sortType         the sort type of the extracted stations from the DB
     * @param stationToExclude the station that has to be excluded
     * @return a list with all stations from the DB
     */
    private ArrayList<StationEntity> getAllStationsSortedWithExcludes(
            SortTypeEnum sortType, StationEntity stationToExclude) {
        ArrayList<StationEntity> stations = new ArrayList<StationEntity>();

        // Selecting all fields of the TABLE_FAVOURITES
        String orderBy = getOrderBy(sortType);
        Cursor cursor = database.query(FavouritesSQLite.TABLE_FAVOURITES,
                allColumns, null, null, null, null, orderBy);

        // Iterating the cursor and fill the empty List<Station>
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            StationEntity station = cursorToStation(cursor);
            if (!station.getNumber().equals(stationToExclude.getNumber())) {
                stations.add(station);
            }

            cursor.moveToNext();
        }

        // Closing the cursor
        cursor.close();

        return stations;
    }

    /**
     * Create a string representation to use it in the query of the sort type
     *
     * @param sortType the current sort type
     * @return the order by query part
     */
    private String getOrderBy(SortTypeEnum sortType) {
        String orderBy = "%s Collate NOCASE %s";

        switch (sortType) {
            case ALPHABETICAL_ASC:
                orderBy = String.format(orderBy, FavouritesSQLite.COLUMN_NAME,
                        "ASC");
                break;
            case ALPHABETICAL_DESC:
                orderBy = String.format(orderBy, FavouritesSQLite.COLUMN_NAME,
                        "DESC");
                break;
            case DATE_ADDED_ASC:
                orderBy = String.format(orderBy,
                        FavouritesSQLite.COLUMN_DATE_ADDED, "ASC");
                break;
            case DATE_ADDED_DESC:
                orderBy = String.format(orderBy,
                        FavouritesSQLite.COLUMN_DATE_ADDED, "DESC");
                break;
            case DATE_LAST_ACCESS_ASC:
                orderBy = String.format(orderBy,
                        FavouritesSQLite.COLUMN_DATE_LAST_ACCESS, "ASC");
                break;
            case DATE_LAST_ACCESS_DESC:
                orderBy = String.format(orderBy,
                        FavouritesSQLite.COLUMN_DATE_LAST_ACCESS, "DESC");
                break;
            case USAGE_COUNT_ASC:
                orderBy = String.format(orderBy,
                        FavouritesSQLite.COLUMN_USAGE_COUNT, "ASC");
                break;
            case USAGE_COUNT_DESC:
                orderBy = String.format(orderBy,
                        FavouritesSQLite.COLUMN_USAGE_COUNT, "DESC");
                break;
            default:
                orderBy = String.format(orderBy, FavouritesSQLite.COLUMN_POSITION,
                        "ASC");
                break;
        }

        return orderBy;
    }

    /**
     * Delete all stations from the database;
     */
    public void deleteAllStations() {
        database.delete(FavouritesSQLite.TABLE_FAVOURITES, null, null);
    }

    /**
     * Change the position of the station if possible
     *
     * @param station   the current station
     * @param orderType the desired new order (UP or DOWN)
     */
    public void reorderStations(StationEntity station, OrderTypeEnum orderType) {
        StationEntity oldStation = getStation(station);

        int oldPosition = oldStation.getPosition();
        int maxPosition = getLastPosition();

        ArrayList<StationEntity> stations = getAllStationsSortedWithExcludes(
                SortTypeEnum.CUSTOM, station);

        switch (orderType) {
            case FIRST:
                stations.add(0, station);
                updateStations(stations);
                break;
            case LAST:
                stations.add(station);
                updateStations(stations);
                break;
            default:
                int newPosition = orderType == OrderTypeEnum.DOWN ? oldPosition + 1
                        : oldPosition - 1;
                if (newPosition >= 1 && newPosition <= maxPosition) {
                    // Get the station on the desired position
                    StationEntity newStation = getStation(newPosition);

                    // Change the order of both stations
                    oldStation.setPosition(newPosition);
                    newStation.setPosition(oldPosition);

                    // Update the DB with the new stations
                    updateStation(oldStation);
                    updateStation(newStation);
                }

                break;
        }
    }

    /**
     * Indicates if the station is first, medium or last
     *
     * @param station the chosen station
     * @return if the station is first, medium or last
     */
    public PositionTypeEnum getStationPosition(StationEntity station) {
        station = getStation(station);

        int position = station.getPosition();
        int maxPosition = getLastPosition();

        if (position == 1 && position == maxPosition) {
            return PositionTypeEnum.FIRST_AND_LAST;
        } else if (position == 1) {
            return PositionTypeEnum.FIRST;
        } else if (position == maxPosition) {
            return PositionTypeEnum.LAST;
        } else {
            return PositionTypeEnum.MEDIUM;
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

        // Get station number
        String stationNumber = cursor.getString(0);

        // Check if have to translate the station name
        String stationName = cursor.getString(1);
        if (!"bg".equals(language)) {
            stationName = TranslatorCyrillicToLatin.translate(context,
                    stationName);
        }

        // Get the station type
        StationsDataSource stationDatasource = new StationsDataSource(context);
        stationDatasource.open();
        StationEntity dbStation = stationDatasource.getStation(stationNumber);
        VehicleTypeEnum stationType = dbStation != null ? dbStation.getType()
                : VehicleTypeEnum.BTT;
        stationDatasource.close();

        // Getting all columns of the row and setting them to a Station object
        station.setNumber(stationNumber);
        station.setName(stationName);
        station.setLat(cursor.getString(2));
        station.setLon(cursor.getString(3));
        station.setType(stationType);
        station.setCustomField(cursor.getString(4));

        // Get the station information fields
        try {
            station.setDateAdded(cursor.getString(5));
            station.setDateLastAccess(cursor.getString(6));
            station.setUsageCount(cursor.getInt(7));
            station.setPosition(cursor.getInt(8));
        } catch (Exception e) {
            // Using try/catch because they are newly implemented and the code
            // will crash the first time without this)
        }

        return station;
    }
}