package org.xms.g.location;

/**
 * Successful response of checking settings.<br/>
 * Combination of com.huawei.hms.location.LocationSettingsResponse and com.google.android.gms.location.LocationSettingsResponse.<br/>
 * com.huawei.hms.location.LocationSettingsResponse: Response to the location check request. This class is used to obtain the status of the current location-related settings.<br/>
 * com.google.android.gms.location.LocationSettingsResponse: Successful response of checking settings via checkLocationSettings(GoogleApiClient, LocationSettingsRequest).<br/>
 */
public class LocationSettingsResponse extends org.xms.g.common.api.Response<org.xms.g.location.LocationSettingsResult> {

    /**
     * org.xms.g.location.LocationSettingsResponse.LocationSettingsResponse(org.xms.g.utils.XBox) constructor of LocationSettingsResponse with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationSettingsResponse(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationSettingsResponse.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationSettingsResponse.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationSettingsResponse object
     */
    public static org.xms.g.location.LocationSettingsResponse dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsResponse) param0);
    }

    /**
     * org.xms.g.location.LocationSettingsResponse.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsResponse;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsResponse;
        }
    }

    /**
     * org.xms.g.location.LocationSettingsResponse.getLocationSettingsStates() Obtains the location setting status.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsResponse.getLocationSettingsStates(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsresponse-0000001050706142-V5#EN-US_TOPIC_0000001050706142__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsresponse-0000001050706142-V5#EN-US_TOPIC_0000001050706142__section1653772245611</a><br/>
     * com.google.android.gms.location.LocationSettingsResponse.getLocationSettingsStates(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResponse#public-locationsettingsstates-getlocationsettingsstates">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResponse#public-locationsettingsstates-getlocationsettingsstates</a><br/>
     *
     * @return Location setting status
     */
    public org.xms.g.location.LocationSettingsStates getLocationSettingsStates() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsResponse) this.getHInstance()).getLocationSettingsStates()");
            com.huawei.hms.location.LocationSettingsStates hReturn = ((com.huawei.hms.location.LocationSettingsResponse) this.getHInstance()).getLocationSettingsStates();
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsResponse) this.getGInstance()).getLocationSettingsStates()");
            com.google.android.gms.location.LocationSettingsStates gReturn = ((com.google.android.gms.location.LocationSettingsResponse) this.getGInstance()).getLocationSettingsStates();
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
}