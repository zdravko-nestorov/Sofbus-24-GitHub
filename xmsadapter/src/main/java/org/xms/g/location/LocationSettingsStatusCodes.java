package org.xms.g.location;

/**
 * Location settings specific status codes, for use in getStatusCode().<br/>
 * Combination of com.huawei.hms.location.LocationSettingsStatusCodes and com.google.android.gms.location.LocationSettingsStatusCodes.<br/>
 * com.huawei.hms.location.LocationSettingsStatusCodes: Location setting status code.<br/>
 * com.google.android.gms.location.LocationSettingsStatusCodes: Location settings specific status codes, for use in getStatusCode().<br/>
 */
public class LocationSettingsStatusCodes extends org.xms.g.common.api.CommonStatusCodes {

    /**
     * org.xms.g.location.LocationSettingsStatusCodes.LocationSettingsStatusCodes(org.xms.g.utils.XBox) constructor of LocationSettingsStatusCodes with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationSettingsStatusCodes(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationSettingsStatusCodes.getSETTINGS_CHANGE_UNAVAILABLE() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsstatuscodes-0000001050986193-V5#EN-US_TOPIC_0000001050986193__section1254213477129">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsstatuscodes-0000001050986193-V5#EN-US_TOPIC_0000001050986193__section1254213477129</a><br/>
     * com.google.android.gms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStatusCodes#public-static-final-int-settings_change_unavailable">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStatusCodes#public-static-final-int-settings_change_unavailable</a><br/>
     *
     * @return Constant Value.Location settings can't be changed to meet the requirements, no dialog pops up
     */
    public static int getSETTINGS_CHANGE_UNAVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE");
            return com.huawei.hms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE");
            return com.google.android.gms.location.LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE;
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStatusCodes.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationSettingsStatusCodes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationSettingsStatusCodes object
     */
    public static org.xms.g.location.LocationSettingsStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsStatusCodes) param0);
    }

    /**
     * org.xms.g.location.LocationSettingsStatusCodes.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsStatusCodes;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsStatusCodes;
        }
    }
}