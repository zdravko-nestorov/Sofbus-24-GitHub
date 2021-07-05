package org.xms.g.location;

/**
 * Geofence specific status codes, for use in getStatusCode().<br/>
 * Combination of com.huawei.hms.location.GeofenceErrorCodes and com.google.android.gms.location.GeofenceStatusCodes.<br/>
 * com.huawei.hms.location.GeofenceErrorCodes: Geofence result codes.<br/>
 * com.google.android.gms.location.GeofenceStatusCodes: Geofence specific status codes, for use in getStatusCode().<br/>
 */
public final class GeofenceStatusCodes extends org.xms.g.common.api.CommonStatusCodes {

    /**
     * org.xms.g.location.GeofenceStatusCodes.GeofenceStatusCodes(org.xms.g.utils.XBox) Constructor of GeofenceStatusCodes with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 The wrapper of xms instance
     */
    public GeofenceStatusCodes(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.GeofenceStatusCodes.getGEOFENCE_NOT_AVAILABLE() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_UNAVAILABLE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section1254213477129">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section1254213477129</a><br/>
     * com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofenceStatusCodes#public-static-final-int-geofence_not_available">https://developers.google.com/android/reference/com/google/android/gms/location/GeofenceStatusCodes#public-static-final-int-geofence_not_available</a><br/>
     *
     * @return Constant Value. Geofence service is not available now. Typically this is because the user turned off location access in settings > location access
     */
    public static int getGEOFENCE_NOT_AVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_UNAVAILABLE");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_UNAVAILABLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE");
            return com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_NOT_AVAILABLE;
        }
    }

    /**
     * org.xms.g.location.GeofenceStatusCodes.getGEOFENCE_TOO_MANY_GEOFENCES() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section104412013581">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section104412013581</a><br/>
     * com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofenceStatusCodes#public-static-final-int-geofence_too_many_geofences">https://developers.google.com/android/reference/com/google/android/gms/location/GeofenceStatusCodes#public-static-final-int-geofence_too_many_geofences</a><br/>
     *
     * @return Constant Value.Your app has registered more than 100 geofences. Remove unused ones before adding new geofences
     */
    public static int getGEOFENCE_TOO_MANY_GEOFENCES() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_NUMBER_OVER_LIMIT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES");
            return com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_GEOFENCES;
        }
    }

    /**
     * org.xms.g.location.GeofenceStatusCodes.getGEOFENCE_TOO_MANY_PENDING_INTENTS() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section1312133196">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section1312133196</a><br/>
     * com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofenceStatusCodes#public-static-final-int-geofence_too_many_pending_intents">https://developers.google.com/android/reference/com/google/android/gms/location/GeofenceStatusCodes#public-static-final-int-geofence_too_many_pending_intents</a><br/>
     *
     * @return Constant Value.You have provided more than 5 different PendingIntents to the addGeofences(GoogleApiClient, GeofencingRequest, PendingIntent) call
     */
    public static int getGEOFENCE_TOO_MANY_PENDING_INTENTS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT");
            return com.huawei.hms.location.GeofenceErrorCodes.GEOFENCE_PENDINGINTENT_OVER_LIMIT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS");
            return com.google.android.gms.location.GeofenceStatusCodes.GEOFENCE_TOO_MANY_PENDING_INTENTS;
        }
    }

    /**
     * org.xms.g.location.GeofenceStatusCodes.getStatusCodeString(int) Returns an untranslated debug (not user-friendly!) string based on the current status code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceErrorCodes.getErrorMessage(int): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section9254532817">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofenceerrorcodes-0000001051066110-V5#EN-US_TOPIC_0000001051066110__section9254532817</a><br/>
     * com.google.android.gms.location.GeofenceStatusCodes.getStatusCodeString(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofenceStatusCodes#public-static-string-getstatuscodestring-int-statuscode">https://developers.google.com/android/reference/com/google/android/gms/location/GeofenceStatusCodes#public-static-string-getstatuscodestring-int-statuscode</a><br/>
     *
     * @param param0 Result code
     * @return Result description
     */
    public static java.lang.String getStatusCodeString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceErrorCodes.getErrorMessage(param0)");
            return com.huawei.hms.location.GeofenceErrorCodes.getErrorMessage(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofenceStatusCodes.getStatusCodeString(param0)");
            return com.google.android.gms.location.GeofenceStatusCodes.getStatusCodeString(param0);
        }
    }

    /**
     * org.xms.g.location.GeofenceStatusCodes.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.GeofenceStatusCodes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted GeofenceStatusCodes object
     */
    public static org.xms.g.location.GeofenceStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.GeofenceStatusCodes) param0);
    }

    /**
     * org.xms.g.location.GeofenceStatusCodes.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return True if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceErrorCodes;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofenceStatusCodes;
        }
    }
}