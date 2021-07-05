package org.xms.g.location;

/**
 * Represents an event from the GeofencingApi API.<br/>
 * Combination of com.huawei.hms.location.GeofenceData and com.google.android.gms.location.GeofencingEvent.<br/>
 * com.huawei.hms.location.GeofenceData: Geofence event.<br/>
 * com.google.android.gms.location.GeofencingEvent: Represents an event from the GeofencingApi API.<br/>
 */
public class GeofencingEvent extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.location.GeofencingEvent.GeofencingEvent(org.xms.g.utils.XBox) Constructor of GeofencingEvent with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 The wrapper of xms instance
     */
    public GeofencingEvent(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.GeofencingEvent.fromIntent(android.content.Intent) Creates a GeofencingEvent object from the given intent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceData.getDataFromIntent(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section9254532817">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section9254532817</a><br/>
     * com.google.android.gms.location.GeofencingEvent.fromIntent(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-static-geofencingevent-fromintent-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-static-geofencingevent-fromintent-intent-intent</a><br/>
     *
     * @param param0 The intent to extract the geofencing event data from
     * @return A GeofencingEvent object or null if the given intent is null
     */
    public static org.xms.g.location.GeofencingEvent fromIntent(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceData.getDataFromIntent(param0)");
            com.huawei.hms.location.GeofenceData hReturn = com.huawei.hms.location.GeofenceData.getDataFromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingEvent(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofencingEvent.fromIntent(param0)");
            com.google.android.gms.location.GeofencingEvent gReturn = com.google.android.gms.location.GeofencingEvent.fromIntent(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingEvent(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.GeofencingEvent.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.GeofencingEvent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted GeofencingEvent object
     */
    public static org.xms.g.location.GeofencingEvent dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.GeofencingEvent) param0);
    }

    /**
     * org.xms.g.location.GeofencingEvent.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceData;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofencingEvent;
        }
    }

    /**
     * org.xms.g.location.GeofencingEvent.getErrorCode() Returns the error code that explains the error that triggered the intent specified in fromIntent(Intent).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceData.getErrorCode(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section85449184712">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section85449184712</a><br/>
     * com.google.android.gms.location.GeofencingEvent.getErrorCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-int-geterrorcode">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-int-geterrorcode</a><br/>
     *
     * @return the error code specified in GeofenceStatusCodes or -1 if hasError() returns false
     */
    public int getErrorCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).getErrorCode()");
            return ((com.huawei.hms.location.GeofenceData) this.getHInstance()).getErrorCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getErrorCode()");
            return ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getErrorCode();
        }
    }

    /**
     * org.xms.g.location.GeofencingEvent.getGeofenceTransition() Returns the transition type of the geofence transition alert.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceData.getConversion(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section11578123265110">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section11578123265110</a><br/>
     * com.google.android.gms.location.GeofencingEvent.getGeofenceTransition(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-int-getgeofencetransition">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-int-getgeofencetransition</a><br/>
     *
     * @return -1 if the intent specified in fromIntent(Intent) is not generated for a transition alert; Otherwise returns the GEOFENCE_TRANSITION_ flags value defined in Geofence
     */
    public int getGeofenceTransition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConversion()");
            return ((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConversion();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getGeofenceTransition()");
            return ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getGeofenceTransition();
        }
    }

    /**
     * org.xms.g.location.GeofencingEvent.getTriggeringGeofences() Returns a list of geofences that triggered this geofence transition alert.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceData.getConvertingGeofenceList(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section13616111912545">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section13616111912545</a><br/>
     * com.google.android.gms.location.GeofencingEvent.getTriggeringGeofences(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-listgeofence-gettriggeringgeofences">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-listgeofence-gettriggeringgeofences</a><br/>
     *
     * @return A list of geofences that triggered this geofence transition alert or null if the intent specified in fromIntent(Intent) is not generated for a geofence transition alert
     */
    public java.util.List<org.xms.g.location.Geofence> getTriggeringGeofences() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConvertingGeofenceList()");
            java.util.List hReturn = ((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConvertingGeofenceList();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.Geofence, org.xms.g.location.Geofence>() {

                public org.xms.g.location.Geofence apply(com.huawei.hms.location.Geofence param0) {
                    return new org.xms.g.location.Geofence.XImpl(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getTriggeringGeofences()");
            java.util.List gReturn = ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getTriggeringGeofences();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.Geofence, org.xms.g.location.Geofence>() {

                public org.xms.g.location.Geofence apply(com.google.android.gms.location.Geofence param0) {
                    return new org.xms.g.location.Geofence.XImpl(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.location.GeofencingEvent.getTriggeringLocation() Gets the location that triggered the geofence transition.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceData.getConvertingLocation(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section43512495554">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencedata-0000001050986185-V5#EN-US_TOPIC_0000001050986185__section43512495554</a><br/>
     * com.google.android.gms.location.GeofencingEvent.getTriggeringLocation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-location-gettriggeringlocation">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-location-gettriggeringlocation</a><br/>
     *
     * @return the location that triggered this geofence alert or null if it's not included in the intent specified in fromIntent(Intent)
     */
    public android.location.Location getTriggeringLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConvertingLocation()");
            return ((com.huawei.hms.location.GeofenceData) this.getHInstance()).getConvertingLocation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getTriggeringLocation()");
            return ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).getTriggeringLocation();
        }
    }

    /**
     * org.xms.g.location.GeofencingEvent.hasError() Whether an error triggered this intent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceData.isFailure()
     * com.google.android.gms.location.GeofencingEvent.hasError(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-boolean-haserror">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingEvent#public-boolean-haserror</a><br/>
     *
     * @return true if an error triggered the intent specified in fromIntent(Intent), otherwise false
     */
    public boolean hasError() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceData) this.getHInstance()).isFailure()");
            return ((com.huawei.hms.location.GeofenceData) this.getHInstance()).isFailure();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).hasError()");
            return ((com.google.android.gms.location.GeofencingEvent) this.getGInstance()).hasError();
        }
    }
}