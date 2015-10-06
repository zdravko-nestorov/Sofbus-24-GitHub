package bg.znestorov.sofbus24.schedule;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.VehiclesDataSource;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;

/**
 * Singleton used for loading the vehicles on the first creation and used them
 * lately
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ScheduleLoadVehicles {

    private static ScheduleLoadVehicles instance = null;

    private List<VehicleEntity> buses;
    private List<VehicleEntity> trolleys;
    private List<VehicleEntity> trams;

    private ScheduleLoadVehicles(Activity context) {
        VehiclesDataSource vehiclesDatasource = new VehiclesDataSource(context);
        vehiclesDatasource.open();

        buses = vehiclesDatasource.getVehiclesViaSearch(VehicleTypeEnum.BUS,
                "");
        trolleys = vehiclesDatasource.getVehiclesViaSearch(
                VehicleTypeEnum.TROLLEY, "");
        trams = vehiclesDatasource.getVehiclesViaSearch(VehicleTypeEnum.TRAM,
                "");

        vehiclesDatasource.close();
    }

    public static ScheduleLoadVehicles getInstance(Activity context) {
        if (instance == null) {
            instance = newInstance(context);
        }

        return instance;
    }

    public static void resetInstance(Activity context) {
        instance = newInstance(context);
    }

    /**
     * This method is created because of a problem, reported by a user in the
     * GooglePlay developer console<br/>
     * <p/>
     * Exception: android.database.sqlite.SQLiteDatabaseCorruptException
     * Last reported: 15 Jul 18:46
     *
     * @param context the current activity context
     * @return an instance of the current class (if successfully created,
     * otherwise - null)
     */
    private static ScheduleLoadVehicles newInstance(Activity context) {

        ScheduleLoadVehicles instance;
        try {
            instance = new ScheduleLoadVehicles(context);
        } catch (Exception e) {
            instance = null;
        }

        return instance;
    }

    /**
     * Check if the instance is already created
     *
     * @return if the instance is already created
     */
    public static boolean isInstanceCreated() {

        return instance != null;

    }

    public List<VehicleEntity> getBuses() {
        return buses;
    }

    public void setBuses(List<VehicleEntity> buses) {
        this.buses = buses;
    }

    public List<VehicleEntity> getTrolleys() {
        return trolleys;
    }

    public void setTrolleys(List<VehicleEntity> trolleys) {
        this.trolleys = trolleys;
    }

    public List<VehicleEntity> getTrams() {
        return trams;
    }

    public void setTrams(List<VehicleEntity> trams) {
        this.trams = trams;
    }

    /**
     * Get a list with the vehicles for the current vehicle type (integer code)
     *
     * @param vehicleType the vehicle type (integer code)
     * @return a list with the vehicles for the current vehicle type
     */
    public ArrayList<VehicleEntity> getVehiclesList(int vehicleType) {
        ArrayList<VehicleEntity> vehiclesList = new ArrayList<VehicleEntity>();
        switch (vehicleType) {
            case 0:
                vehiclesList.addAll(buses);
                break;
            case 1:
                vehiclesList.addAll(trolleys);
                break;
            default:
                vehiclesList.addAll(trams);
                break;
        }

        return vehiclesList;
    }

    /**
     * Get a list with the stations for the current vehicle type
     *
     * @param vehicleType the vehicle type
     * @return a list with the vehicles for the current vehicle type
     */
    public ArrayList<VehicleEntity> getDirectionList(VehicleTypeEnum vehicleType) {
        int currentDirection;
        switch (vehicleType) {
            case BUS:
                currentDirection = 0;
                break;
            case TROLLEY:
                currentDirection = 1;
                break;
            default:
                currentDirection = 2;
                break;
        }

        return getVehiclesList(currentDirection);
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tbuses: " + buses
                + "\n\ttrolleys: " + trolleys + "\n\ttrams: " + trams + "\n}";
    }

}