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

    private DroidTransLoadInfo(Activity context) {

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
     * Exception: android.database.sqlite.SQLiteDatabaseCorruptException<br/>
     * Last reported: 15 Jul 18:46
     *
     * @param context the current activity context
     * @return an instance of the current class (if successfully created,
     * otherwise - null)
     */
    private static DroidTransLoadInfo newInstance(Activity context) {

        DroidTransLoadInfo instance;
        try {
            instance = new DroidTransLoadInfo(context);
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