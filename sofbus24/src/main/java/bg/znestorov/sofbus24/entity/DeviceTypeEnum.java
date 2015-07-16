package bg.znestorov.sofbus24.entity;

/**
 * Indicates the type of the device - PHONE, SMALL_TABLET, LARGE_TABLET
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public enum DeviceTypeEnum {

    /**
     * If the device is a smartphone
     */
    PHONE,

    /**
     * If the device is a small tablet (tablet with a size between 600dp to
     * 800dp)
     */
    SMALL_TABLET,

    /**
     * If the device is a large table (tablet with a size of 800dp or higher)
     */
    LARGE_TABLET;
}