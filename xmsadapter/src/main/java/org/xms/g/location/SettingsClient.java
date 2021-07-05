package org.xms.g.location;

/**
 * The main entry point for interacting with the location settings-enabler APIs.<br/>
 * Combination of com.huawei.hms.location.SettingsClient and com.google.android.gms.location.SettingsClient.<br/>
 * com.huawei.hms.location.SettingsClient: Class for checking location-related settings.<br/>
 * com.google.android.gms.location.SettingsClient: The main entry point for interacting with the location settings-enabler APIs.<br/>
 */
public class SettingsClient extends org.xms.g.common.api.ExtensionApi<org.xms.g.common.api.Api.ApiOptions.NoOptions> {

    /**
     * org.xms.g.location.SettingsClient.SettingsClient(org.xms.g.utils.XBox) constructor of SettingsClient with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public SettingsClient(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.SettingsClient.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.SettingsClient.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted SettingsClient object
     */
    public static org.xms.g.location.SettingsClient dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.SettingsClient) {
            return ((org.xms.g.location.SettingsClient) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.SettingsClient gReturn = ((com.google.android.gms.location.SettingsClient) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.SettingsClient hReturn = ((com.huawei.hms.location.SettingsClient) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.SettingsClient(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.location.SettingsClient) param0);
    }

    /**
     * org.xms.g.location.SettingsClient.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.SettingsClient;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.SettingsClient;
        }
    }

    /**
     * org.xms.g.location.SettingsClient.checkLocationSettings(org.xms.g.location.LocationSettingsRequest) Checks if the relevant system settings are enabled on the device to carry out the desired location requests.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.SettingsClient.checkLocationSettings(com.huawei.hms.location.LocationSettingsRequest): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/settingsclient-0000001051066118-V5#EN-US_TOPIC_0000001051066118__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/settingsclient-0000001051066118-V5#EN-US_TOPIC_0000001051066118__section1653772245611</a><br/>
     * com.google.android.gms.location.SettingsClient.checkLocationSettings(com.google.android.gms.location.LocationSettingsRequest): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/SettingsClient#public-tasklocationsettingsresponse-checklocationsettings-locationsettingsrequest-locationsettingsrequest">https://developers.google.com/android/reference/com/google/android/gms/location/SettingsClient#public-tasklocationsettingsresponse-checklocationsettings-locationsettingsrequest-locationsettingsrequest</a><br/>
     *
     * @param param0 an object that contains all the location requirements that the client is interested in
     * @return the task
     */
    public org.xms.g.tasks.Task<org.xms.g.location.LocationSettingsResponse> checkLocationSettings(org.xms.g.location.LocationSettingsRequest param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.SettingsClient) this.getHInstance()).checkLocationSettings(((com.huawei.hms.location.LocationSettingsRequest) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.location.SettingsClient) this.getHInstance()).checkLocationSettings(((com.huawei.hms.location.LocationSettingsRequest) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.SettingsClient) this.getGInstance()).checkLocationSettings(((com.google.android.gms.location.LocationSettingsRequest) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.location.SettingsClient) this.getGInstance()).checkLocationSettings(((com.google.android.gms.location.LocationSettingsRequest) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.Object getApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}