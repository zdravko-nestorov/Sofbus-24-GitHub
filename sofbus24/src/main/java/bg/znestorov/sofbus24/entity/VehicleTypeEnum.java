package bg.znestorov.sofbus24.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    BTT, METRO, METRO1, METRO2, METRO3, METRO4,

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
    private Set<String> transportType;

    VehicleTypeEnum() {
    }

    VehicleTypeEnum(String transportCode, String... transportType) {
        this.transportCode = transportCode;
        this.transportType = new HashSet<>(Arrays.asList(transportType));
    }

    public static VehicleTypeEnum fromTransportCode(String transportCode) {
        for (VehicleTypeEnum vehicleTypeEnum : VehicleTypeEnum.values()) {
            if (transportCode != null && transportCode.equals(vehicleTypeEnum.transportCode)) {
                return vehicleTypeEnum;
            }
        }
        throw new RuntimeException("Vehicle type not found for transportCode: " + transportCode);
    }

    public static VehicleTypeEnum fromTransportType(String transportType) {
        for (VehicleTypeEnum vehicleTypeEnum : VehicleTypeEnum.values()) {
            if (vehicleTypeEnum.transportType != null && vehicleTypeEnum.transportType.contains(transportType)) {
                return vehicleTypeEnum;
            }
        }
        throw new RuntimeException("Vehicle type not found for transportType: " + transportType);
    }

    public static VehicleTypeEnum getStationType(VehicleTypeEnum vehicleType) {
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