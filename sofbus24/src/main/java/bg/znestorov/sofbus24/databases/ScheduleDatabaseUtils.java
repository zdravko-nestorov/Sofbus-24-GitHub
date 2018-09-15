package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import bg.znestorov.sofbus24.entity.ScheduleCacheEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.schedule.ScheduleCachePreferences;

/**
 * Class containing all helping functions for creating and deleting the Schedule
 * DB
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ScheduleDatabaseUtils {

    private static final String METRO_NUMBER = "1";
    private static final VehicleTypeEnum METRO_TYPE = VehicleTypeEnum.METRO;

    /**
     * Check how many times the database is open, so close the DB when it is really needed.
     * For example if the counter is ZERO, this means that there are no open connections
     * to it and will try to close something that is not really open. This way we will save
     * time and do what is needed only when it is needed
     */
    private static volatile int scheduleDbCounter;

    /**
     * Acquire a synchronization when open/close the database
     */
    private static final Object SCHEDULE_DB_LOCK = new Object();

    /**
     * Delete the files in the cache after the maximum number of days have
     * passed
     *
     * @param context the current activity context
     */
    public static void deleteOldScheduleCache(Activity context) {

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);

        try {
            scheduleDatasource.open();
            scheduleDatasource.deleteScheduleCache(ScheduleCachePreferences
                    .getNumberOfDays(context));
        } catch (Exception e) {
            /*
             * Workaround because of an error in the GooglePlay console "android.database.sqlite.SQLiteException"
             * (reported on 30 Aug 23:59). In case of a problem with the DB opening, just skip the deleting of the
             * old cache and next time when the application is opened, it will try again
             */
        } finally {
            scheduleDatasource.close();
        }
    }

    /**
     * Check if the schedule cache is available for the BTT vehicles (buses,
     * trolleys, trams)
     *
     * @param context the current activity context
     * @return if the schedule cache is available
     */
    public static boolean isAnyScheduleCacheAvailable(Activity context) {

        boolean isScheduleCacheAvailable;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();
        isScheduleCacheAvailable = scheduleDatasource
                .isAnyScheduleCacheAvailable();
        scheduleDatasource.close();

        return isScheduleCacheAvailable;
    }

    /**
     * Delete all schedule cache from the database
     *
     * @param context the current activity context
     * @return if the schedule cache is successfully deleted
     */
    public static boolean deleteAllScheduleCache(Activity context) {

        boolean isScheduleCacheDeleted;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();
        isScheduleCacheDeleted = scheduleDatasource.deleteAllScheduleCache();
        scheduleDatasource.close();

        return isScheduleCacheDeleted;
    }

    /**
     * Check if the schedule cache is available for the selected type and number
     *
     * @param context        the current activity context
     * @param vehiclesType   the selected schedule vehicle type
     * @param vehiclesNumber the selected schedule vehicle number
     * @return if the schedule cache is available
     */
    public static boolean isVehiclesScheduleCacheAvailable(Activity context,
                                                           VehicleTypeEnum vehiclesType, String vehiclesNumber) {

        boolean isScheduleCacheAvailable;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();
        isScheduleCacheAvailable = scheduleDatasource
                .isVehiclesScheduleCacheAvailable(vehiclesType, vehiclesNumber);
        scheduleDatasource.close();

        return isScheduleCacheAvailable;
    }

    /**
     * Check if the schedule cache is available for the selected type and number
     *
     * @param context       the current activity context
     * @param vehicleType   the selected schedule vehicle type
     * @param vehicleNumber the selected schedule vehicle number
     * @return if the schedule cache is available
     */
    public static boolean deleteVehiclesScheduleCache(Activity context,
                                                      VehicleTypeEnum vehicleType, String vehicleNumber) {

        boolean isScheduleCacheAvailable;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();
        isScheduleCacheAvailable = scheduleDatasource
                .deleteVehiclesScheduleCache(vehicleType, vehicleNumber);
        scheduleDatasource.close();

        return isScheduleCacheAvailable;
    }

    /**
     * Create or update the schedule cache for the selected vehicle
     *
     * @param context the current activity context
     * @param vehicle the selected vehicle
     * @param data    the data for the selected vehicle
     * @return the schedule cache for the current vehicle
     */
    public static ScheduleCacheEntity createOrUpdateVehicleScheduleCache(
            Activity context, VehicleEntity vehicle, Object data) {

        ScheduleCacheEntity scheduleCache;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();

        scheduleCache = scheduleDatasource.getVehicleScheduleCache(
                vehicle.getType(), vehicle.getNumber());
        if (scheduleCache == null) {
            scheduleDatasource.createVehicleScheduleCache(vehicle.getType(),
                    vehicle.getNumber(), data);
        } else {
            scheduleDatasource.updateVehicleScheduleCache(vehicle.getType(),
                    vehicle.getNumber(), data);
        }

        scheduleDatasource.close();

        return scheduleCache;
    }

    /**
     * Create or update the schedule cache for the selected vehicle
     *
     * @param context the current activity context
     * @param vehicle the selected vehicle
     * @param station the selected station
     * @return the schedule cache for the current station
     */
    public static ScheduleCacheEntity createOrUpdateStationScheduleCache(
            Activity context, VehicleEntity vehicle, StationEntity station) {

        ScheduleCacheEntity scheduleCache;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();

        scheduleCache = scheduleDatasource.getStationScheduleCache(
                vehicle.getType(), vehicle.getNumber(), station.getNumber());
        if (scheduleCache == null) {
            scheduleDatasource.createStationScheduleCache(vehicle.getType(),
                    vehicle.getNumber(), station.getNumber(), station);
        } else {
            scheduleDatasource.updateStationScheduleCache(vehicle.getType(),
                    vehicle.getNumber(), station.getNumber(), station);
        }

        scheduleDatasource.close();

        return scheduleCache;
    }

    /**
     * Create or update the schedule cache for the selected vehicle
     *
     * @param context the current activity context
     * @param station the selected station
     * @param data    the object that will be saved into the db
     * @return the schedule cache for the current station
     */
    public static ScheduleCacheEntity createOrUpdateMetroStationScheduleCache(
            Activity context, StationEntity station, Object data) {

        ScheduleCacheEntity scheduleCache;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();

        scheduleCache = scheduleDatasource.getStationScheduleCache(METRO_TYPE,
                METRO_NUMBER, station.getNumber());
        if (scheduleCache == null) {
            scheduleDatasource.createStationScheduleCache(METRO_TYPE,
                    METRO_NUMBER, station.getNumber(), data);
        } else {
            scheduleDatasource.updateStationScheduleCache(METRO_TYPE,
                    METRO_NUMBER, station.getNumber(), data);
        }

        scheduleDatasource.close();

        return scheduleCache;
    }

    /**
     * Get the schedule cache for the selected vehicle
     *
     * @param context the current activity context
     * @param vehicle the selected vehicle
     * @return the schedule cache for the current vehicle
     */
    public static ScheduleCacheEntity getVehicleScheduleCache(Activity context,
                                                              VehicleEntity vehicle) {

        ScheduleCacheEntity scheduleCache;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();
        scheduleCache = scheduleDatasource.getVehicleScheduleCache(
                vehicle.getType(), vehicle.getNumber());
        scheduleDatasource.close();

        return scheduleCache;
    }

    /**
     * Get the schedule cache for the selected vehicle
     *
     * @param context the current activity context
     * @param vehicle the selected vehicle
     * @param station the selected station
     * @return the schedule cache for the current vehicle
     */
    public static ScheduleCacheEntity getStationScheduleCache(Activity context,
                                                              VehicleEntity vehicle, StationEntity station) {

        ScheduleCacheEntity scheduleCache;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();
        scheduleCache = scheduleDatasource.getStationScheduleCache(
                vehicle.getType(), vehicle.getNumber(), station.getNumber());
        scheduleDatasource.close();

        return scheduleCache;
    }

    /**
     * Get the schedule cache for the selected metro station
     *
     * @param context the current activity context
     * @param station the selected station
     * @return the schedule cache for the current metro station
     */
    public static ScheduleCacheEntity getMetroStationScheduleCache(
            Activity context, StationEntity station) {

        ScheduleCacheEntity scheduleCache;

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();
        scheduleCache = scheduleDatasource.getStationScheduleCache(METRO_TYPE,
                METRO_NUMBER, station.getNumber());
        scheduleDatasource.close();

        return scheduleCache;
    }

    /**
     * A strange error occurs sometimes - {android.database.sqlite.SQLiteDiskIOException:
     * disk I/O error}. The exception itself is generated in the native sqlite code, and
     * while I haven't looked up the C/C++ part of the JNI interface, this should come
     * directly from the underlying sqlite3_open call. For non obvious reasons the actual
     * error code is not included in the thrown exception, so you are basically out of luck
     * here to find the root cause.
     * As this comes directly from the native layer it's some kind of filesystem/hardware problem.
     * The card may be broken, the card socket may be broken/dirty/whatever or anything in between
     * could be messed up (most likely physically).
     * <p/>
     * For more information, StackOverflow posts:<br/>
     * {http://stackoverflow.com/questions/20189026/contentprovider-throws-
     * sqlitecantopendatabaseexception-unable-to-open-database}<br/>
     * {http://stackoverflow.com/questions/4651797/database-handling-stoped-
     * working-on-android-2-2-1-desire-hd-1-72-405-3/4828540#4828540}
     *
     * @throws SQLException in case of an SQL problem
     */
    public static SQLiteDatabase openScheduleDb(ScheduleSQLite dbHelper, SQLiteDatabase database)
            throws SQLException {

        // Acquire a synchronization when open the database
        synchronized (SCHEDULE_DB_LOCK) {

            // Increase the open/close DB counter
            scheduleDbCounter++;

            // Check if the database is open. If so - do nothing (we have what we need)
            if (database != null && database.isOpen()) {
                return database;
            }

            // Create and/or open a database that will be used for reading and writing
            database = dbHelper.getWritableDatabase();
        }

        return database;
    }

    /**
     * Close the database. Firstly check if somebody is holding the LOCK over it and after that -
     * if it is open now
     *
     * @param dbHelper the schedule database helper
     * @param database the schedule database
     */
    public static void closeScheduleDb(ScheduleSQLite dbHelper, SQLiteDatabase database) {

        // Acquire a synchronization when close the database
        synchronized (SCHEDULE_DB_LOCK) {

            // Decrease the open/close DB counter
            scheduleDbCounter--;

            // Check if the counter is ZERO and if the database is really open. Only if
            // the conditions are fulfilled, we MUST close the database. Otherwise - do
            // nothing (we have already closed it)
            if (scheduleDbCounter == 0 && database != null && database.isOpen()) {
                dbHelper.close();
            }
        }
    }

}