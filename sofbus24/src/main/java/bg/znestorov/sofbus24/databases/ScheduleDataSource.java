package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.google.gson.Gson;

import bg.znestorov.sofbus24.entity.ScheduleCacheEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Schedule cache data source used for DB interactions
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class ScheduleDataSource {

    private static final String EMPTY_COLUMN = "-";
    private final ScheduleSQLite dbHelper;
    private final String[] scheduleColumns = {ScheduleSQLite.COLUMN_PK_SCHE_ID,
            ScheduleSQLite.COLUMN_SCHE_TYPE,
            ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER,
            ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER,
            ScheduleSQLite.COLUMN_SCHE_DATA,
            ScheduleSQLite.COLUMN_SCHE_TIMESTAMP};
    // Database fields
    private SQLiteDatabase database;

    public ScheduleDataSource(Activity context) {
        this.dbHelper = new ScheduleSQLite(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    /**
     * Inserting a schedule cache (the html response for the current schedule)
     * into the database
     *
     * @param dataType   the type of the inserted data
     * @param dataNumber the number of the inserted data
     * @param data       the data for the current type and number
     * @return if the data is successful inserted into the db
     */
    public boolean createVehicleScheduleCache(VehicleTypeEnum dataType,
                                              String dataNumber, Object data) {

        if (data != null && !"".equals(data)) {

            // Creating ContentValues object and insert the data in it
            ContentValues values = new ContentValues();
            values.put(ScheduleSQLite.COLUMN_SCHE_TYPE,
                    String.valueOf(dataType));
            values.put(ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER, dataNumber);
            values.put(ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER, EMPTY_COLUMN);

            // Insert the data object into the DB
            Gson gson = new Gson();
            values.put(ScheduleSQLite.COLUMN_SCHE_DATA, gson.toJson(data));

            // Insert the ContentValues data into the database
            long rowId = database.insert(ScheduleSQLite.TABLE_SOF_SCHE, null,
                    values);

            return rowId != -1;
        } else {
            return false;
        }
    }

    /**
     * Inserting a schedule cache (the html response for the current schedule)
     * into the database
     *
     * @param vehicleType   the type of the inserted vehicle
     * @param vehicleNumber the number of the inserted vehicle
     * @param stationNumber the number of the inserted station
     * @param data          the data for the current type and number
     * @return if the data is successful inserted into the db
     */
    public boolean createStationScheduleCache(VehicleTypeEnum vehicleType,
                                              String vehicleNumber, String stationNumber, Object data) {

        if (data != null && !"".equals(data)) {

            // Creating ContentValues object and insert the data in it
            ContentValues values = new ContentValues();
            values.put(ScheduleSQLite.COLUMN_SCHE_TYPE,
                    String.valueOf(vehicleType));
            values.put(ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER, vehicleNumber);
            values.put(ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER, stationNumber);

            // Insert the data object into the DB
            Gson gson = new Gson();
            values.put(ScheduleSQLite.COLUMN_SCHE_DATA, gson.toJson(data));

            // Insert the ContentValues data into the database
            long rowId = database.insert(ScheduleSQLite.TABLE_SOF_SCHE, null,
                    values);

            return rowId != -1;
        } else {
            return false;
        }
    }

    /**
     * Updating a schedule cache (the html response for the current schedule)
     * into the database
     *
     * @param vehicleType   the type of the inserted data
     * @param vehicleNumber the number of the inserted data
     * @param data          the data for the current type and number
     * @return if the data is successful inserted into the db
     */
    public boolean updateVehicleScheduleCache(VehicleTypeEnum vehicleType,
                                              String vehicleNumber, Object data) {

        if (data != null && !"".equals(data)) {

            // Creating ContentValues object and update the data in it
            ContentValues values = new ContentValues();
            values.put(ScheduleSQLite.COLUMN_SCHE_TYPE,
                    String.valueOf(vehicleType));
            values.put(ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER, vehicleNumber);
            values.put(ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER, EMPTY_COLUMN);

            // Insert the data object into the DB
            Gson gson = new Gson();
            values.put(ScheduleSQLite.COLUMN_SCHE_DATA, gson.toJson(data));
            values.put(ScheduleSQLite.COLUMN_SCHE_TIMESTAMP,
                    Utils.getScheduleCacheTimestamp());

            // Insert the ContentValues data into the database
            String whereClause = ScheduleSQLite.COLUMN_SCHE_TYPE + " = ? AND "
                    + ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER + " = ? AND "
                    + ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER + " = ?";
            String[] whereArgs = new String[]{String.valueOf(vehicleType),
                    vehicleNumber, EMPTY_COLUMN};
            long rowId = database.update(ScheduleSQLite.TABLE_SOF_SCHE, values,
                    whereClause, whereArgs);

            return rowId != -1;
        } else {
            return false;
        }
    }

    /**
     * Updating a schedule cache (the html response for the current schedule)
     * into the database
     *
     * @param vehicleType   the type of the inserted data
     * @param vehicleNumber the number of the inserted data
     * @param stationNumber the number of the inserted station
     * @param data          the data for the current type and number
     * @return if the data is successful inserted into the db
     */
    public boolean updateStationScheduleCache(VehicleTypeEnum vehicleType,
                                              String vehicleNumber, String stationNumber, Object data) {

        if (data != null && !"".equals(data)) {

            // Creating ContentValues object and update the data in it
            ContentValues values = new ContentValues();
            values.put(ScheduleSQLite.COLUMN_SCHE_TYPE,
                    String.valueOf(vehicleType));
            values.put(ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER, vehicleNumber);
            values.put(ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER, stationNumber);

            // Insert the data object into the DB
            Gson gson = new Gson();
            values.put(ScheduleSQLite.COLUMN_SCHE_DATA, gson.toJson(data));
            values.put(ScheduleSQLite.COLUMN_SCHE_TIMESTAMP,
                    Utils.getScheduleCacheTimestamp());

            // Insert the ContentValues data into the database
            String whereClause = ScheduleSQLite.COLUMN_SCHE_TYPE + " = ? AND "
                    + ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER + " = ? AND "
                    + ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER + " = ?";
            String[] whereArgs = new String[]{String.valueOf(vehicleType),
                    vehicleNumber, stationNumber};
            long rowId = database.update(ScheduleSQLite.TABLE_SOF_SCHE, values,
                    whereClause, whereArgs);

            return rowId != -1;
        } else {
            return false;
        }
    }

    /**
     * Get a schedule cache via a cache type and number
     *
     * @param dataType   the type of the searched data
     * @param dataNumber the number of the searched data
     * @return a ScheduleCacheEntity object with a data for the searched number
     * and type
     */
    public ScheduleCacheEntity getVehicleScheduleCache(
            VehicleTypeEnum dataType, String dataNumber) {

        ScheduleCacheEntity scheduleCache = null;

        String[] dataColumns = new String[]{scheduleColumns[4],
                scheduleColumns[5]};
        String selection = ScheduleSQLite.COLUMN_SCHE_TYPE + " = ? AND "
                + ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER + " = ? AND "
                + ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER + " = ?";
        String[] selectionArgs = new String[]{String.valueOf(dataType),
                dataNumber, EMPTY_COLUMN};

        // Selecting the row that contains the vehicle data
        Cursor cursor = database.query(ScheduleSQLite.TABLE_SOF_SCHE,
                dataColumns, selection, selectionArgs, null, null, null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            scheduleCache = new ScheduleCacheEntity(cursor.getString(0),
                    cursor.getString(1));
        }

        cursor.close();

        return scheduleCache;
    }

    /**
     * Get a schedule cache via a cache type and number
     *
     * @param vehicleType   the type of the searched data
     * @param vehicleNumber the number of the searched data
     * @param stationNumber the number of the inserted station
     * @return a ScheduleCacheEntity object with a data for the searched number
     * and type
     */
    public ScheduleCacheEntity getStationScheduleCache(
            VehicleTypeEnum vehicleType, String vehicleNumber,
            String stationNumber) {

        ScheduleCacheEntity scheduleCache = null;

        String[] dataColumns = new String[]{scheduleColumns[4],
                scheduleColumns[5]};
        String selection = ScheduleSQLite.COLUMN_SCHE_TYPE + " = ? AND "
                + ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER + " = ? AND "
                + ScheduleSQLite.COLUMN_SCHE_STATION_NUMBER + " = ?";
        String[] selectionArgs = new String[]{String.valueOf(vehicleType),
                vehicleNumber, stationNumber};

        // Selecting the row that contains the vehicle data
        Cursor cursor = database.query(ScheduleSQLite.TABLE_SOF_SCHE,
                dataColumns, selection, selectionArgs, null, null, null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            scheduleCache = new ScheduleCacheEntity(cursor.getString(0),
                    cursor.getString(1));
        }

        cursor.close();

        return scheduleCache;
    }

    /**
     * Delete the schedule cache before a selected number of days
     *
     * @param numberOfDays the records beyond these number of days will be deleted
     * @return if the cache is successfully deleted
     */
    public boolean deleteScheduleCache(int numberOfDays) {

        if (numberOfDays > 0) {
            String where = ScheduleSQLite.COLUMN_SCHE_TIMESTAMP + " > ?";
            String[] whereArgs = new String[]{String.format(
                    "DATE('NOW','-%s DAY')", numberOfDays)};

            return database.delete(ScheduleSQLite.TABLE_SOF_SCHE, where,
                    whereArgs) > 0;
        } else {
            return false;
        }
    }

    /**
     * Check if the schedule cache is available for the selected type and number
     *
     * @param vehicleType   the selected schedule vehicle type
     * @param vehicleNumber the selected schedule vehicle number
     * @return if the schedule cache is available
     */
    public boolean isVehiclesScheduleCacheAvailable(
            VehicleTypeEnum vehicleType, String vehicleNumber) {

        boolean isScheduleAvailable = false;

        StringBuilder query = new StringBuilder();
        query.append(" SELECT COUNT(*)											\n");
        query.append(" FROM " + ScheduleSQLite.TABLE_SOF_SCHE + "				\n");
        query.append(" WHERE 													\n");
        query.append(" " + ScheduleSQLite.COLUMN_SCHE_TYPE + " = '%s' AND		\n");
        query.append(" " + ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER
                + " = '%s'														\n");

        Cursor cursor = database.rawQuery(
                String.format(query.toString(), vehicleType, vehicleNumber),
                null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            isScheduleAvailable = cursor.getInt(0) > 0;
        }

        cursor.close();

        return isScheduleAvailable;
    }

    /**
     * Delete the schedule cache for the selected type and number
     *
     * @param vehicleType   the type of the searched vehicle
     * @param vehicleNumber the selected schedule vehicle number
     * @return if the cache is successfully deleted
     */
    public boolean deleteVehiclesScheduleCache(VehicleTypeEnum vehicleType,
                                               String vehicleNumber) {

        String where = ScheduleSQLite.COLUMN_SCHE_TYPE + " = ? AND "
                + ScheduleSQLite.COLUMN_SCHE_VEHICLE_NUMBER + " = ?";
        String[] whereArgs = new String[]{String.valueOf(vehicleType),
                vehicleNumber};

        return database.delete(ScheduleSQLite.TABLE_SOF_SCHE, where, whereArgs) > 0;
    }

    /**
     * Check if any schedule cache is available
     *
     * @return if any schedule cache is available
     */
    public boolean isAnyScheduleCacheAvailable() {

        boolean isScheduleAvailable = false;

        StringBuilder query = new StringBuilder();
        query.append(" SELECT COUNT(*)										\n");
        query.append(" FROM " + ScheduleSQLite.TABLE_SOF_SCHE + "			\n");

        Cursor cursor = database.rawQuery(query.toString(), null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();
            isScheduleAvailable = cursor.getInt(0) > 0;
        }

        cursor.close();

        return isScheduleAvailable;
    }

    /**
     * Delete all schedule cache from the database;
     *
     * @return if the cache is successfully deleted
     */
    public boolean deleteAllScheduleCache() {
        return database.delete(ScheduleSQLite.TABLE_SOF_SCHE, null, null) > 0;
    }

}