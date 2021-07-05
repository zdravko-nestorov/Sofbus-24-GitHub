package org.xms.g.location;

/**
 * Status codes that can be returned to listeners to indicate the success or failure of an operation.<br/>
 * Combination of com.huawei.hms.location.GeofenceErrorCodes and com.google.android.gms.location.LocationStatusCodes.<br/>
 * com.huawei.hms.location.GeofenceErrorCodes: Geofence result codes.<br/>
 * com.google.android.gms.location.LocationStatusCodes: Status codes that can be returned to listeners to indicate the success or failure of an operation.<br/>
 */
public final class LocationStatusCodes extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.location.LocationStatusCodes.LocationStatusCodes(org.xms.g.utils.XBox) constructor of LocationStatusCodes with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationStatusCodes(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationStatusCodes.getERROR() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.ERROR
     * com.google.android.gms.location.LocationStatusCodes.ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-error">https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-error</a><br/>
     *
     * @return Constant Value.An unspecified error occurred; no more specific information is available. The device logs may provide additional data
     */
    public static int getERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.ERROR");
            return com.huawei.hms.location.GeofenceErrorCodes.ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationStatusCodes.ERROR");
            return com.google.android.gms.location.LocationStatusCodes.ERROR;
        }
    }

    /**
     * org.xms.g.location.LocationStatusCodes.getGEOFENCE_NOT_AVAILABLE() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_UNAVAILABLE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section1254213477129">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section1254213477129</a><br/>
     * com.google.android.gms.location.LocationStatusCodes.GEOFENCE_NOT_AVAILABLE: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-geofence_not_available">https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-geofence_not_available</a><br/>
     *
     * @return Constant Value.Geofence service is not available now. Typically this is because the user turned off location access in settings > location access
     */
    public static int getGEOFENCE_NOT_AVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_UNAVAILABLE");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_UNAVAILABLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationStatusCodes.GEOFENCE_NOT_AVAILABLE");
            return com.google.android.gms.location.LocationStatusCodes.GEOFENCE_NOT_AVAILABLE;
        }
    }

    /**
     * org.xms.g.location.LocationStatusCodes.getGEOFENCE_TOO_MANY_GEOFENCES() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section104412013581">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section104412013581</a><br/>
     * com.google.android.gms.location.LocationStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-geofence_too_many_geofences">https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-geofence_too_many_geofences</a><br/>
     *
     * @return Constant Value.Your app has registered more than 100 geofences. Remove unused ones before adding new geofences
     */
    public static int getGEOFENCE_TOO_MANY_GEOFENCES() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES");
            return com.google.android.gms.location.LocationStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES;
        }
    }

    /**
     * org.xms.g.location.LocationStatusCodes.getGEOFENCE_TOO_MANY_PENDING_INTENTS() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section1312133196">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section1312133196</a><br/>
     * com.google.android.gms.location.LocationStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-geofence_too_many_pending_intents">https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-geofence_too_many_pending_intents</a><br/>
     *
     * @return Constant Value.You have provided more than 5 different PendingIntents to the addGeofences(GoogleApiClient, GeofencingRequest, PendingIntent) call
     */
    public static int getGEOFENCE_TOO_MANY_PENDING_INTENTS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS");
            return com.google.android.gms.location.LocationStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS;
        }
    }

    /**
     * org.xms.g.location.LocationStatusCodes.getSUCCESS() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.SUCCESS
     * com.google.android.gms.location.LocationStatusCodes.SUCCESS: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-success">https://developers.google.com/android/reference/com/google/android/gms/location/LocationStatusCodes#public-static-final-int-success</a><br/>
     *
     * @return Constant Value. The operation was successful
     */
    public static int getSUCCESS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.SUCCESS");
            return com.huawei.hms.location.GeofenceErrorCodes.SUCCESS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationStatusCodes.SUCCESS");
            return com.google.android.gms.location.LocationStatusCodes.SUCCESS;
        }
    }

    /**
     * org.xms.g.location.LocationStatusCodes.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationStatusCodes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationStatusCodes object
     */
    public static org.xms.g.location.LocationStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationStatusCodes) param0);
    }

    /**
     * org.xms.g.location.LocationStatusCodes.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceErrorCodes;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationStatusCodes;
        }
    }
}