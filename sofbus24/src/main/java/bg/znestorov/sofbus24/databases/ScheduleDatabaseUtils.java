package bg.znestorov.sofbus24.databases;

import android.app.Activity;

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
     * Delete the files in the cache after the maximum number of days have
     * passed
     *
     * @param context the current activity context
     */
    public static void deleteOldScheduleCache(Activity context) {

        ScheduleDataSource scheduleDatasource = new ScheduleDataSource(context);
        scheduleDatasource.open();
        scheduleDatasource.deleteScheduleCache(ScheduleCachePreferences
                .getNumberOfDays(context));
        scheduleDatasource.close();
    }

    /**
     * Check if the schedule cache is available for the BTT vehicles (buses,
     * trolleys, trams)
     *
     * @param context the current activity context
     * @return if the schedule cache is available
     */
    public static boolean isAnyScheduleCacheAvaialble(Activity context) {

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
    public static boolean isVehiclesScheduleCacheAvaialble(Activity context,
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

}