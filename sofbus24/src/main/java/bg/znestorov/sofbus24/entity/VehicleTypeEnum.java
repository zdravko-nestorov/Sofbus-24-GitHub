package bg.znestorov.sofbus24.entity;

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
    BUS, TROLLEY, TRAM,

    /**
     * This vehicles' types are used in the GoogleMap to indicate the type of
     * the vehicles passing through the current station
     */
    BUS_TROLLEY, BUS_TRAM, TRAM_TROLLEY, BUS_TRAM_TROLLEY,

    /**
     * This vehicles type's indicate all different type of vehicles in the main
     * database (Sofbus24.db)
     */
    BTT, METRO, METRO1, METRO2,

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
    NOIMAGE
}