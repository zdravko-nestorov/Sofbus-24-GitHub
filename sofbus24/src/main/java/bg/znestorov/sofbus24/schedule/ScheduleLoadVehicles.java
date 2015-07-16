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

    private List<VehicleEntity> busses;
    private List<VehicleEntity> trolleys;
    private List<VehicleEntity> trams;

    protected ScheduleLoadVehicles(Activity context) {
        VehiclesDataSource vehiclesDatasource = new VehiclesDataSource(context);
        vehiclesDatasource.open();

        busses = vehiclesDatasource.getVehiclesViaSearch(VehicleTypeEnum.BUS,
                "");
        trolleys = vehiclesDatasource.getVehiclesViaSearch(
                VehicleTypeEnum.TROLLEY, "");
        trams = vehiclesDatasource.getVehiclesViaSearch(VehicleTypeEnum.TRAM,
                "");

        vehiclesDatasource.close();
    }

    public static ScheduleLoadVehicles getInstance(Activity context) {
        if (instance == null) {
            instance = new ScheduleLoadVehicles(context);
        }

        return instance;
    }

    public static void resetInstance(Activity context) {
        instance = new ScheduleLoadVehicles(context);
    }

    /**
     * Check if the instance is already created
     *
     * @return if the instance is already created
     */
    public static boolean isInstanceCreated() {

        if (instance != null) {
            return true;
        }

        return false;
    }

    public List<VehicleEntity> getBusses() {
        return busses;
    }

    public void setBusses(List<VehicleEntity> busses) {
        this.busses = busses;
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
                vehiclesList.addAll(busses);
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
        return getClass().getName() + " {\n\tbusses: " + busses
                + "\n\ttrolleys: " + trolleys + "\n\ttrams: " + trams + "\n}";
    }

}
