package org.xms.g.location;

/**
 * Result of checking settings, indicates whether a dialog should be shown to ask the user's consent to change their settings.<br/>
 * Combination of com.huawei.hms.location.LocationSettingsResult and com.google.android.gms.location.LocationSettingsResult.<br/>
 * com.huawei.hms.location.LocationSettingsResult: Location setting result.<br/>
 * com.google.android.gms.location.LocationSettingsResult: Result of checking settings via checkLocationSettings(GoogleApiClient, LocationSettingsRequest), indicates whether a dialog should be shown to ask the user's consent to change their settings.<br/>
 */
public final class LocationSettingsResult extends org.xms.g.utils.XObject implements org.xms.g.common.api.Result, android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.LocationSettingsResult.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationsettingsresult-0000001050746177-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationsettingsresult-0000001050746177-V5</a><br/>
     * com.google.android.gms.location.LocationSettingsResult.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResult#public-static-final-creatorlocationsettingsresult-creator">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResult#public-static-final-creatorlocationsettingsresult-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.LocationSettingsResult createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.LocationSettingsResult hReturn = com.huawei.hms.location.LocationSettingsResult.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationSettingsResult(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.LocationSettingsResult gReturn = com.google.android.gms.location.LocationSettingsResult.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationSettingsResult(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.LocationSettingsResult[] newArray(int param0) {
            return new org.xms.g.location.LocationSettingsResult[param0];
        }
    };

    /**
     * org.xms.g.location.LocationSettingsResult.LocationSettingsResult(org.xms.g.utils.XBox) constructor of LocationSettingsResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationSettingsResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationSettingsResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationSettingsResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationSettingsResult object
     */
    public static org.xms.g.location.LocationSettingsResult dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.location.LocationSettingsResult) {
            return ((org.xms.g.location.LocationSettingsResult) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.location.LocationSettingsResult gReturn = ((com.google.android.gms.location.LocationSettingsResult) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.location.LocationSettingsResult hReturn = ((com.huawei.hms.location.LocationSettingsResult) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.location.LocationSettingsResult(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.location.LocationSettingsResult) param0);
    }

    /**
     * org.xms.g.location.LocationSettingsResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsResult;
        }
    }

    /**
     * org.xms.g.location.LocationSettingsResult.getLocationSettingsStates() Retrieves the location settings states.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsResult.getLocationSettingsStates(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsresult-0000001050746177-V5#EN-US_TOPIC_0000001050746177__section31921512113417">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsresult-0000001050746177-V5#EN-US_TOPIC_0000001050746177__section31921512113417</a><br/>
     * com.google.android.gms.location.LocationSettingsResult.getLocationSettingsStates(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResult#public-locationsettingsstates-getlocationsettingsstates">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResult#public-locationsettingsstates-getlocationsettingsstates</a><br/>
     *
     * @return the location settings states
     */
    public final org.xms.g.location.LocationSettingsStates getLocationSettingsStates() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).getLocationSettingsStates()");
            com.huawei.hms.location.LocationSettingsStates hReturn = ((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).getLocationSettingsStates();
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).getLocationSettingsStates()");
            com.google.android.gms.location.LocationSettingsStates gReturn = ((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).getLocationSettingsStates();
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsStates(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationSettingsResult.getStatus() Returns the status of this result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsResult.getStatus(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsresult-0000001050746177-V5#EN-US_TOPIC_0000001050746177__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsresult-0000001050746177-V5#EN-US_TOPIC_0000001050746177__section1653772245611</a><br/>
     * com.google.android.gms.location.LocationSettingsResult.getStatus(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResult#public-status-getstatus">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResult#public-status-getstatus</a><br/>
     *
     * @return the status of this result
     */
    public final org.xms.g.common.api.Status getStatus() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).getStatus()");
            com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).getStatus();
            return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).getStatus()");
            com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).getStatus();
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationSettingsResult.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsResult.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.LocationSettingsResult.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResult#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsResult#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationSettingsResult) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationSettingsResult) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}