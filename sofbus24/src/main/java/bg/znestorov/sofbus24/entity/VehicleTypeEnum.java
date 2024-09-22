package bg.znestorov.sofbus24.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import bg.znestorov.sofbus24.utils.Utils;

/**
 * Enumeration representing the types of vehicles and stations
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public enum VehicleTypeEnum {

    /**
     * The main vehicles' types
     */
    BUS("A", "1", "5"), TROLLEY("TB", "4"), TRAM("TM", "2"),

    /**
     * This vehicles' types are used in the GoogleMap to indicate the type of
     * the vehicles passing through the current station
     */
    BUS_TROLLEY, BUS_TRAM, TRAM_TROLLEY, BUS_TRAM_TROLLEY,

    /**
     * This vehicles type's indicate all different type of vehicles in the main
     * database (Sofbus24.db)
     */
    BTT, METRO("M", "3"), METRO1("M", "3"), METRO2("M", "3"), METRO3("M", "3"), METRO4("M", "3"),

    /**
     * This vehicles' type is used in the schedule cache to determine if we
     * want to delete the whole cache or just a cache for a selected vehicle
     */
    BTTM,

    /**
     * This vehicle's type is used in Favorites section in case no GPS
     * coordinates are available for the current station, and we can't show its
     * image
     */
    NOIMAGE;

    private String transportCode;
    private Set<String> transportTypes = new HashSet<>();

    VehicleTypeEnum() {
    }

    VehicleTypeEnum(String transportCode, String... transportTypes) {
        this.transportCode = transportCode;
        this.transportTypes = new HashSet<>(Arrays.asList(transportTypes));
    }

    public static VehicleTypeEnum getVehicleType(String skgtTransportType, String skgtTransportCode) {
        for (VehicleTypeEnum vehicleType : VehicleTypeEnum.values()) {
            if ("3".equals(skgtTransportType)) {
                // Metro vehicle types
                if (vehicleType.transportTypes.contains(skgtTransportType) &&
                        vehicleType.name().contains(Utils.getOnlyDigits(skgtTransportCode))) {
                    return vehicleType;
                }
            } else {
                // Standard vehicle types
                if (vehicleType.transportTypes.contains(skgtTransportType)) {
                    return vehicleType;
                }
            }
        }
        return null;
    }

    public static VehicleTypeEnum getStationTypeByVehicleType(VehicleTypeEnum vehicleType) {
        switch (vehicleType) {
            case METRO:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                return METRO;
            default:
                return BTT;
        }
    }
}