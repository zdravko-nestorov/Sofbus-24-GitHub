package bg.znestorov.sofbus24.droidtrans;

import android.app.Activity;

import java.util.ArrayList;
import java.util.HashMap;

import bg.znestorov.sofbus24.databases.DroidTransDataSource;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;

/**
 * Singleton used for loading the vehicles on the first creation and used them
 * lately
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class DroidTransLoadInfo {

    private static DroidTransLoadInfo instance = null;

    private ArrayList<VehicleTypeEnum> vehicleTypes;
    private HashMap<VehicleTypeEnum, ArrayList<String>> vehicleNumbersMap;

    protected DroidTransLoadInfo(Activity context) {

        DroidTransDataSource droidtransDatasource = new DroidTransDataSource(
                context);
        droidtransDatasource.open();

        vehicleTypes = droidtransDatasource.getVehicleTypes();
        vehicleNumbersMap = new HashMap<VehicleTypeEnum, ArrayList<String>>();
        for (int i = 0; i < vehicleTypes.size(); i++) {
            VehicleTypeEnum vehicleType = vehicleTypes.get(i);
            vehicleNumbersMap.put(vehicleType,
                    droidtransDatasource.getVehicleNumbers(vehicleType));
        }

        droidtransDatasource.close();
    }

    public static DroidTransLoadInfo getInstance(Activity context) {
        if (instance == null) {
            instance = new DroidTransLoadInfo(context);
        }

        return instance;
    }

    public static void resetInstance(Activity context) {
        instance = new DroidTransLoadInfo(context);
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

    public ArrayList<VehicleTypeEnum> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(ArrayList<VehicleTypeEnum> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public HashMap<VehicleTypeEnum, ArrayList<String>> getVehicleNumbersMap() {
        return vehicleNumbersMap;
    }

    public void setVehicleNumbersMap(
            HashMap<VehicleTypeEnum, ArrayList<String>> vehicleNumbersMap) {
        this.vehicleNumbersMap = vehicleNumbersMap;
    }

    /**
     * Get a list with the vehicle numbers for the current vehicle type
     *
     * @param vehicleType the vehicle type
     * @return a list with the vehicles numbers for the current vehicle type
     */
    public ArrayList<String> getVehicleNumbers(VehicleTypeEnum vehicleType) {
        return vehicleNumbersMap.get(vehicleType);
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tvehicleTypes: " + vehicleTypes
                + "\n\tvehicleNumbersMap: " + vehicleNumbersMap + "\n}";
    }

}