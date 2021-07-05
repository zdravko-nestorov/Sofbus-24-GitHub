package org.xms.g.location;

/**
 * Stores the current states of all location-related settings.<br/>
 * Combination of com.huawei.hms.location.LocationSettingsStates and com.google.android.gms.location.LocationSettingsStates.<br/>
 * com.huawei.hms.location.LocationSettingsStates: Current location-related setting status.<br/>
 * com.google.android.gms.location.LocationSettingsStates: Stores the current states of all location-related settings.<br/>
 */
public final class LocationSettingsStates extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.LocationSettingsStates.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-static-final-creatorlocationsettingsstates-creator">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-static-final-creatorlocationsettingsstates-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.LocationSettingsStates createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.LocationSettingsStates hReturn = com.huawei.hms.location.LocationSettingsStates.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationSettingsStates(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.LocationSettingsStates gReturn = com.google.android.gms.location.LocationSettingsStates.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationSettingsStates(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.LocationSettingsStates[] newArray(int param0) {
            return new org.xms.g.location.LocationSettingsStates[param0];
        }
    };

    /**
     * org.xms.g.location.LocationSettingsStates.LocationSettingsStates(org.xms.g.utils.XBox) constructor of LocationSettingsStates with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationSettingsStates(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationSettingsStates.fromIntent(android.content.Intent) Retrieves the location settings states from the intent extras.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.fromIntent(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsstates-0000001050706144-V5#EN-US_TOPIC_0000001050706144__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsstates-0000001050706144-V5#EN-US_TOPIC_0000001050706144__section1653772245611</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.fromIntent(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-static-locationsettingsstates-fromintent-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-static-locationsettingsstates-fromintent-intent-intent</a><br/>
     *
     * @param param0 Intent instance
     * @return the location settings states
     */
    public static org.xms.g.location.LocationSettingsStates fromIntent(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationSettingsStates.fromIntent(param0)");
            com.huawei.hms.location.LocationSettingsStates hReturn = com.huawei.hms.location.LocationSettingsStates.fromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationSettingsStates.fromIntent(param0)");
            com.google.android.gms.location.LocationSettingsStates gReturn = com.google.android.gms.location.LocationSettingsStates.fromIntent(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationSettingsStates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationSettingsStates object
     */
    public static org.xms.g.location.LocationSettingsStates dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsStates) param0);
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsStates;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsStates;
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isBlePresent() Whether BLE is present on the device.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.isBlePresent(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.isBlePresent(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isblepresent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isblepresent</a><br/>
     *
     * @return true if BLE is present on the device
     */
    public final boolean isBlePresent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isBlePresent()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isBlePresent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isBlePresent()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isBlePresent();
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isBleUsable() Whether BLE is enabled and is usable by the app.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.isBleUsable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.isBleUsable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isbleusable">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isbleusable</a><br/>
     *
     * @return true if BLE is enabled and is usable by the app
     */
    public final boolean isBleUsable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isBleUsable()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isBleUsable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isBleUsable()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isBleUsable();
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isGpsPresent() Whether GPS provider is present on the device.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.isGpsPresent(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.isGpsPresent(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isgpspresent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isgpspresent</a><br/>
     *
     * @return true if GPS provider is present on the device
     */
    public final boolean isGpsPresent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isGpsPresent()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isGpsPresent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isGpsPresent()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isGpsPresent();
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isGpsUsable() Whether GPS provider is enabled and is usable by the app.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.isGpsUsable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.isGpsUsable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isgpsusable">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isgpsusable</a><br/>
     *
     * @return true if GPS provider is enabled and is usable by the app
     */
    public final boolean isGpsUsable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isGpsUsable()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isGpsUsable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isGpsUsable()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isGpsUsable();
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isLocationPresent() Whether location is present on the device.This method returns true when either GPS or network location provider is present.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.isLocationPresent(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.isLocationPresent(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-islocationpresent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-islocationpresent</a><br/>
     *
     * @return true if location is present on the device
     */
    public final boolean isLocationPresent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isLocationPresent()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isLocationPresent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isLocationPresent()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isLocationPresent();
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isLocationUsable() Whether location is enabled and is usable by the app.This method returns true when either GPS or network location provider is usable.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.isLocationUsable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.isLocationUsable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-islocationusable">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-islocationusable</a><br/>
     *
     * @return true if location is enabled and is usable by the app
     */
    public final boolean isLocationUsable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isLocationUsable()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isLocationUsable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isLocationUsable()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isLocationUsable();
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isNetworkLocationPresent() Whether network location provider is present on the device.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.isNetworkLocationPresent(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.isNetworkLocationPresent(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isnetworklocationpresent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isnetworklocationpresent</a><br/>
     *
     * @return true if network location provider is present on the device
     */
    public final boolean isNetworkLocationPresent() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isNetworkLocationPresent()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isNetworkLocationPresent();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isNetworkLocationPresent()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isNetworkLocationPresent();
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.isNetworkLocationUsable() Whether network location provider is enabled and usable by the app.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.isNetworkLocationUsable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4">https://developer.huawei.com/consumer/en/doc/development/HMS-References/locationsettingsstates-v4</a><br/>
     * com.google.android.gms.location.LocationSettingsStates.isNetworkLocationUsable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isnetworklocationusable">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-boolean-isnetworklocationusable</a><br/>
     *
     * @return true if network location provider is enabled and usable by the app
     */
    public final boolean isNetworkLocationUsable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isNetworkLocationUsable()");
            return ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).isNetworkLocationUsable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isNetworkLocationUsable()");
            return ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).isNetworkLocationUsable();
        }
    }

    /**
     * org.xms.g.location.LocationSettingsStates.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsStates.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.LocationSettingsStates.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsStates#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationSettingsStates) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationSettingsStates) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
}