package org.xms.g.location;

/**
 * Used for receiving notifications with the location information.<br/>
 * Combination of com.huawei.hms.location.LocationCallback and com.google.android.gms.location.LocationCallback.<br/>
 * com.huawei.hms.location.LocationCallback: Callback class for reporting location information.<br/>
 * com.google.android.gms.location.LocationCallback: Used for receiving notifications from the FusedLocationProviderApi when the device location has changed or can no longer be determined.<br/>
 */
public class LocationCallback extends org.xms.g.utils.XObject {
    private boolean wrapper = true;

    /**
     * org.xms.g.location.LocationCallback.LocationCallback(org.xms.g.utils.XBox) constructor of LocationCallback with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationCallback(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.location.LocationCallback.LocationCallback() constructor of LocationCallback.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationCallback.LocationCallback(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationcallback-0000001050706140-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationcallback-0000001050706140-V5</a><br/>
     * com.google.android.gms.location.LocationCallback.LocationCallback(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationCallback#public-locationcallback">https://developers.google.com/android/reference/com/google/android/gms/location/LocationCallback#public-locationcallback</a><br/>
     */
    public LocationCallback() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }

    /**
     * org.xms.g.location.LocationCallback.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationCallback.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationCallback object
     */
    public static org.xms.g.location.LocationCallback dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationCallback) param0);
    }

    /**
     * org.xms.g.location.LocationCallback.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationCallback;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationCallback;
        }
    }

    /**
     * org.xms.g.location.LocationCallback.onLocationAvailability(org.xms.g.location.LocationAvailability) Called when there is a change in the availability of location data.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationCallback.onLocationAvailability(com.huawei.hms.location.LocationAvailability): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationcallback-0000001050706140-V5#EN-US_TOPIC_0000001050706140__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationcallback-0000001050706140-V5#EN-US_TOPIC_0000001050706140__section1653772245611</a><br/>
     * com.google.android.gms.location.LocationCallback.onLocationAvailability(com.google.android.gms.location.LocationAvailability): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationCallback#public-void-onlocationavailability-locationavailability-locationavailability">https://developers.google.com/android/reference/com/google/android/gms/location/LocationCallback#public-void-onlocationavailability-locationavailability-locationavailability</a><br/>
     *
     * @param param0 The current status of location availability
     */
    public void onLocationAvailability(org.xms.g.location.LocationAvailability param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationCallback) this.getHInstance()).onLocationAvailability(((com.huawei.hms.location.LocationAvailability) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.location.LocationCallback) this.getHInstance()).onLocationAvailability(((com.huawei.hms.location.LocationAvailability) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationCallback) this.getGInstance()).onLocationAvailability(((com.google.android.gms.location.LocationAvailability) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.location.LocationCallback) this.getGInstance()).onLocationAvailability(((com.google.android.gms.location.LocationAvailability) ((param0) == null ? null : (param0.getGInstance()))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.LocationCallback) this.getHInstance())).onLocationAvailabilityCallSuper(((com.huawei.hms.location.LocationAvailability) ((param0) == null ? null : (param0.getHInstance()))))");
                ((HImpl) ((com.huawei.hms.location.LocationCallback) this.getHInstance())).onLocationAvailabilityCallSuper(((com.huawei.hms.location.LocationAvailability) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.LocationCallback) this.getGInstance())).onLocationAvailabilityCallSuper(((com.google.android.gms.location.LocationAvailability) ((param0) == null ? null : (param0.getGInstance()))))");
                ((GImpl) ((com.google.android.gms.location.LocationCallback) this.getGInstance())).onLocationAvailabilityCallSuper(((com.google.android.gms.location.LocationAvailability) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }

    /**
     * org.xms.g.location.LocationCallback.onLocationResult(org.xms.g.location.LocationResult) Called when device location information is available.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationCallback.onLocationResult(com.huawei.hms.location.LocationResult): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationcallback-0000001050706140-V5#EN-US_TOPIC_0000001050706140__section18517246182511">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationcallback-0000001050706140-V5#EN-US_TOPIC_0000001050706140__section18517246182511</a><br/>
     * com.google.android.gms.location.LocationCallback.onLocationResult(com.google.android.gms.location.LocationResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationCallback#public-void-onlocationresult-locationresult-result">https://developers.google.com/android/reference/com/google/android/gms/location/LocationCallback#public-void-onlocationresult-locationresult-result</a><br/>
     *
     * @param param0 The latest location result available
     */
    public void onLocationResult(org.xms.g.location.LocationResult param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationCallback) this.getHInstance()).onLocationResult(((com.huawei.hms.location.LocationResult) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.location.LocationCallback) this.getHInstance()).onLocationResult(((com.huawei.hms.location.LocationResult) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationCallback) this.getGInstance()).onLocationResult(((com.google.android.gms.location.LocationResult) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.location.LocationCallback) this.getGInstance()).onLocationResult(((com.google.android.gms.location.LocationResult) ((param0) == null ? null : (param0.getGInstance()))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.LocationCallback) this.getHInstance())).onLocationResultCallSuper(((com.huawei.hms.location.LocationResult) ((param0) == null ? null : (param0.getHInstance()))))");
                ((HImpl) ((com.huawei.hms.location.LocationCallback) this.getHInstance())).onLocationResultCallSuper(((com.huawei.hms.location.LocationResult) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.LocationCallback) this.getGInstance())).onLocationResultCallSuper(((com.google.android.gms.location.LocationResult) ((param0) == null ? null : (param0.getGInstance()))))");
                ((GImpl) ((com.google.android.gms.location.LocationCallback) this.getGInstance())).onLocationResultCallSuper(((com.google.android.gms.location.LocationResult) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }

    private class GImpl extends com.google.android.gms.location.LocationCallback {

        public GImpl() {
            super();
        }

        public void onLocationAvailability(com.google.android.gms.location.LocationAvailability param0) {
            org.xms.g.location.LocationCallback.this.onLocationAvailability(((param0) == null ? null : (new org.xms.g.location.LocationAvailability(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void onLocationResult(com.google.android.gms.location.LocationResult param0) {
            org.xms.g.location.LocationCallback.this.onLocationResult(((param0) == null ? null : (new org.xms.g.location.LocationResult(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void onLocationAvailabilityCallSuper(com.google.android.gms.location.LocationAvailability param0) {
            super.onLocationAvailability(param0);
        }

        public void onLocationResultCallSuper(com.google.android.gms.location.LocationResult param0) {
            super.onLocationResult(param0);
        }
    }

    private class HImpl extends com.huawei.hms.location.LocationCallback {

        public HImpl() {
            super();
        }

        public void onLocationAvailability(com.huawei.hms.location.LocationAvailability param0) {
            org.xms.g.location.LocationCallback.this.onLocationAvailability(((param0) == null ? null : (new org.xms.g.location.LocationAvailability(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void onLocationResult(com.huawei.hms.location.LocationResult param0) {
            org.xms.g.location.LocationCallback.this.onLocationResult(((param0) == null ? null : (new org.xms.g.location.LocationResult(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void onLocationAvailabilityCallSuper(com.huawei.hms.location.LocationAvailability param0) {
            super.onLocationAvailability(param0);
        }

        public void onLocationResultCallSuper(com.huawei.hms.location.LocationResult param0) {
            super.onLocationResult(param0);
        }
    }
}