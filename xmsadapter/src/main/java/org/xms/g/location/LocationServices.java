package org.xms.g.location;

/**
 * The main entry point for location services integration.<br/>
 * Combination of com.huawei.hms.location.LocationServices and com.google.android.gms.location.LocationServices.<br/>
 * com.huawei.hms.location.LocationServices: Location service. It provides location-related instances for you to obtain the location access point.<br/>
 * com.google.android.gms.location.LocationServices: The main entry point for location services integration.<br/>
 */
public class LocationServices extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.location.LocationServices.LocationServices(org.xms.g.utils.XBox) constructor of LocationServices with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationServices(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationServices.getAPI() return the API.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.LocationServices.API: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-final-apiapi.apioptions.nooptions-api">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-final-apiapi.apioptions.nooptions-api</a><br/>
     *
     * @return Token to pass to addApi(Api) to enable LocationServices
     */
    public static org.xms.g.common.api.Api getAPI() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.LocationServices.getFusedLocationApi() return the API.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.LocationServices.FusedLocationApi: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-final-fusedlocationproviderapi-fusedlocationapi">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-final-fusedlocationproviderapi-fusedlocationapi</a><br/>
     *
     * @return FusedLocationProviderApi.Entry point to the fused location APIs
     */
    public static org.xms.g.location.FusedLocationProviderApi getFusedLocationApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.LocationServices.getGeofencingApi() return the API.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.LocationServices.GeofencingApi: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-final-geofencingapi-geofencingapi">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-final-geofencingapi-geofencingapi</a><br/>
     *
     * @return GeofencingApi.Entry point to the geofencing APIs
     */
    public static org.xms.g.location.GeofencingApi getGeofencingApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.LocationServices.getSettingsApi() return the API.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.LocationServices.SettingsApi: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-final-settingsapi-settingsapi">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-final-settingsapi-settingsapi</a><br/>
     *
     * @return SettingsApi which is the entry point to the location settings-enabler dialog APIs
     */
    public static org.xms.g.location.SettingsApi getSettingsApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.LocationServices.getFusedLocationProviderClient(android.app.Activity) Create a new instance of FusedLocationProviderClient for use in an Activity.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(android.app.Activity): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section1653772245611</a><br/>
     * com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(android.app.Activity): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-fusedlocationproviderclient-getfusedlocationproviderclient-activity-activity">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-fusedlocationproviderclient-getfusedlocationproviderclient-activity-activity</a><br/>
     *
     * @param param0 Activity in app
     * @return FusedLocationProviderClient instance
     */
    public static org.xms.g.location.FusedLocationProviderClient getFusedLocationProviderClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(param0)");
            com.huawei.hms.location.FusedLocationProviderClient hReturn = com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.FusedLocationProviderClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(param0)");
            com.google.android.gms.location.FusedLocationProviderClient gReturn = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.FusedLocationProviderClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationServices.getFusedLocationProviderClient(android.content.Context) Create a new instance of FusedLocationProviderClient for use in a non-activity Context.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section10168735183219">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section10168735183219</a><br/>
     * com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-fusedlocationproviderclient-getfusedlocationproviderclient-context-context">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-fusedlocationproviderclient-getfusedlocationproviderclient-context-context</a><br/>
     *
     * @param param0 a specific Context
     * @return FusedLocationProviderClient instance
     */
    public static org.xms.g.location.FusedLocationProviderClient getFusedLocationProviderClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(param0)");
            com.huawei.hms.location.FusedLocationProviderClient hReturn = com.huawei.hms.location.LocationServices.getFusedLocationProviderClient(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.FusedLocationProviderClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(param0)");
            com.google.android.gms.location.FusedLocationProviderClient gReturn = com.google.android.gms.location.LocationServices.getFusedLocationProviderClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.FusedLocationProviderClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationServices.getGeofencingClient(android.app.Activity) Create a new instance of GeofencingClient for use in an Activity.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationServices.getGeofenceService(android.app.Activity): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section185947269819">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section185947269819</a><br/>
     * com.google.android.gms.location.LocationServices.getGeofencingClient(android.app.Activity): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-geofencingclient-getgeofencingclient-activity-activity">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-geofencingclient-getgeofencingclient-activity-activity</a><br/>
     *
     * @param param0 Activity in app
     * @return GeofencingClient instance
     */
    public static org.xms.g.location.GeofencingClient getGeofencingClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getGeofenceService(param0)");
            com.huawei.hms.location.GeofenceService hReturn = com.huawei.hms.location.LocationServices.getGeofenceService(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getGeofencingClient(param0)");
            com.google.android.gms.location.GeofencingClient gReturn = com.google.android.gms.location.LocationServices.getGeofencingClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationServices.getGeofencingClient(android.content.Context) Create a new instance of GeofencingClient for use in a non-activity Context.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationServices.getGeofenceService(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section986215751114">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section986215751114</a><br/>
     * com.google.android.gms.location.LocationServices.getGeofencingClient(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-geofencingclient-getgeofencingclient-context-context">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-geofencingclient-getgeofencingclient-context-context</a><br/>
     *
     * @param param0 a specific Context
     * @return GeofencingClient instance
     */
    public static org.xms.g.location.GeofencingClient getGeofencingClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getGeofenceService(param0)");
            com.huawei.hms.location.GeofenceService hReturn = com.huawei.hms.location.LocationServices.getGeofenceService(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getGeofencingClient(param0)");
            com.google.android.gms.location.GeofencingClient gReturn = com.google.android.gms.location.LocationServices.getGeofencingClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationServices.getSettingsClient(android.content.Context) Create a new instance of SettingsClient for use in a non-activity Context.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationServices.getSettingsClient(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section1559810188354">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section1559810188354</a><br/>
     * com.google.android.gms.location.LocationServices.getSettingsClient(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-settingsclient-getsettingsclient-context-context">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-settingsclient-getsettingsclient-context-context</a><br/>
     *
     * @param param0 a specific Context
     * @return SettingsClient instance
     */
    public static org.xms.g.location.SettingsClient getSettingsClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getSettingsClient(param0)");
            com.huawei.hms.location.SettingsClient hReturn = com.huawei.hms.location.LocationServices.getSettingsClient(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.SettingsClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getSettingsClient(param0)");
            com.google.android.gms.location.SettingsClient gReturn = com.google.android.gms.location.LocationServices.getSettingsClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.SettingsClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationServices.getSettingsClient(android.app.Activity) Create a new instance of SettingsClient for use in an Activity.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationServices.getSettingsClient(android.app.Activity): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section1742582817364">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationservice-0000001050746175-V5#EN-US_TOPIC_0000001050746175__section1742582817364</a><br/>
     * com.google.android.gms.location.LocationServices.getSettingsClient(android.app.Activity): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-settingsclient-getsettingsclient-activity-activity">https://developers.google.com/android/reference/com/google/android/gms/location/LocationServices#public-static-settingsclient-getsettingsclient-activity-activity</a><br/>
     *
     * @param param0 Activity in app
     * @return SettingsClient instance
     */
    public static org.xms.g.location.SettingsClient getSettingsClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationServices.getSettingsClient(param0)");
            com.huawei.hms.location.SettingsClient hReturn = com.huawei.hms.location.LocationServices.getSettingsClient(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.SettingsClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationServices.getSettingsClient(param0)");
            com.google.android.gms.location.SettingsClient gReturn = com.google.android.gms.location.LocationServices.getSettingsClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.SettingsClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationServices.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationServices.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationServices object
     */
    public static org.xms.g.location.LocationServices dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationServices) param0);
    }

    /**
     * org.xms.g.location.LocationServices.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationServices;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationServices;
        }
    }
}