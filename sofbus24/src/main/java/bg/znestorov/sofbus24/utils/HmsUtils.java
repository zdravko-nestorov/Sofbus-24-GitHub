package bg.znestorov.sofbus24.utils;

/**
 * Utils method containing functions concerning HMS stuff
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class HmsUtils {

    public static boolean isGms() {
        return !HmsUtils.isHms();
    }

    public static boolean isHms() {
        return org.xms.g.utils.GlobalEnvSetting.isHms();
    }
}
