package org.xms.g.location;

/**
 * Specifies the types of location services the client is interested in using.<br/>
 * Combination of com.huawei.hms.location.LocationSettingsRequest and com.google.android.gms.location.LocationSettingsRequest.<br/>
 * com.huawei.hms.location.LocationSettingsRequest: Class for specifying the location service types and checking the location settings to obtain optimal functionality of all requested services.<br/>
 * com.google.android.gms.location.LocationSettingsRequest: Specifies the types of location services the client is interested in using.<br/>
 */
public final class LocationSettingsRequest extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.LocationSettingsRequest.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationsettingsrequest-0000001050986191-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationsettingsrequest-0000001050986191-V5</a><br/>
     * com.google.android.gms.location.LocationSettingsRequest.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest#public-static-final-creatorlocationsettingsrequest-creator">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest#public-static-final-creatorlocationsettingsrequest-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.LocationSettingsRequest createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.LocationSettingsRequest hReturn = com.huawei.hms.location.LocationSettingsRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationSettingsRequest(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.LocationSettingsRequest gReturn = com.google.android.gms.location.LocationSettingsRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationSettingsRequest(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.LocationSettingsRequest[] newArray(int param0) {
            return new org.xms.g.location.LocationSettingsRequest[param0];
        }
    };

    /**
     * org.xms.g.location.LocationSettingsRequest.LocationSettingsRequest(org.xms.g.utils.XBox) constructor of LocationSettingsRequest with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationSettingsRequest(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationSettingsRequest.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationSettingsRequest.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationSettingsRequest object
     */
    public static org.xms.g.location.LocationSettingsRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationSettingsRequest) param0);
    }

    /**
     * org.xms.g.location.LocationSettingsRequest.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsRequest;
        }
    }

    /**
     * org.xms.g.location.LocationSettingsRequest.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationSettingsRequest.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.LocationSettingsRequest.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationSettingsRequest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationSettingsRequest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * Wrapper class of Builder that builds LocationSettingsRequest.<br/>
     * Combination of com.huawei.hms.location.LocationSettingsRequest.Builder and com.google.android.gms.location.LocationSettingsRequest.Builder.<br/>
     * com.huawei.hms.location.LocationSettingsRequest.Builder: Builds a LocationSettingsRequest instance.<br/>
     * com.google.android.gms.location.LocationSettingsRequest.Builder: A builder that builds LocationSettingsRequest.<br/>
     */
    public static final class Builder extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.Builder(org.xms.g.utils.XBox) constructor of LocationSettingsRequest.Builder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.Builder() Builds a LocationSettingsRequest.Builder() instance.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.LocationSettingsRequest.Builder.Builder(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5</a><br/>
         * com.google.android.gms.location.LocationSettingsRequest.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder</a><br/>
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.LocationSettingsRequest.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.LocationSettingsRequest.Builder());
            }
        }

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationSettingsRequest.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted LocationSettingsRequest.Builder object
         */
        public static org.xms.g.location.LocationSettingsRequest.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.LocationSettingsRequest.Builder) param0);
        }

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationSettingsRequest.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationSettingsRequest.Builder;
            }
        }

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.addAllLocationRequests(java.util.Collection<org.xms.g.location.LocationRequest>) Adds a collection of LocationRequests that the client is interested in. Settings will be checked for optimal performance of all LocationRequests.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.LocationSettingsRequest.Builder.addAllLocationRequests(java.util.Collection<com.huawei.hms.location.LocationRequest>): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section1653772245611</a><br/>
         * com.google.android.gms.location.LocationSettingsRequest.Builder.addAllLocationRequests(java.util.Collection<com.google.android.gms.location.LocationRequest>): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder-addalllocationrequests-collectionlocationrequest-requests">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder-addalllocationrequests-collectionlocationrequest-requests</a><br/>
         *
         * @param param0 a collection of LocationRequests that the client is interested in
         * @return the LocationSettingsRequest.Builder
         */
        public final org.xms.g.location.LocationSettingsRequest.Builder addAllLocationRequests(java.util.Collection<org.xms.g.location.LocationRequest> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, true))");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, true));
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, false))");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addAllLocationRequests(org.xms.g.utils.Utils.mapCollection2GH(param0, false));
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.addLocationRequest(org.xms.g.location.LocationRequest) Adds one LocationRequest that the client is interested in. Settings will be checked for optimal performance of all LocationRequests.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.LocationSettingsRequest.Builder.addLocationRequest(com.huawei.hms.location.LocationRequest): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section1558216141796">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section1558216141796</a><br/>
         * com.google.android.gms.location.LocationSettingsRequest.Builder.addLocationRequest(com.google.android.gms.location.LocationRequest): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder-addlocationrequest-locationrequest-request">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder-addlocationrequest-locationrequest-request</a><br/>
         *
         * @param param0 one LocationRequest that the client is interested in
         * @return the LocationSettingsRequest.Builder
         */
        public org.xms.g.location.LocationSettingsRequest.Builder addLocationRequest(org.xms.g.location.LocationRequest param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addLocationRequest(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).addLocationRequest(((com.huawei.hms.location.LocationRequest) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addLocationRequest(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).addLocationRequest(((com.google.android.gms.location.LocationRequest) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.build() Creates a LocationSettingsRequest that can be used with SettingsApi.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.LocationSettingsRequest.Builder.build(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section11618710141419">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section11618710141419</a><br/>
         * com.google.android.gms.location.LocationSettingsRequest.Builder.build(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest-build">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest-build</a><br/>
         *
         * @return the LocationSettingsRequest
         */
        public final org.xms.g.location.LocationSettingsRequest build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.LocationSettingsRequest hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.LocationSettingsRequest gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.setAlwaysShow(boolean) Whether or not location is required by the calling app in order to continue.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.LocationSettingsRequest.Builder.setAlwaysShow(boolean): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section1525695411016">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section1525695411016</a><br/>
         * com.google.android.gms.location.LocationSettingsRequest.Builder.setAlwaysShow(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder-setalwaysshow-boolean-show">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder-setalwaysshow-boolean-show</a><br/>
         *
         * @param param0 Indicates whether the location is required for using the app. The options are true (yes) and false (no)
         * @return the LocationSettingsRequest.Builder
         */
        public final org.xms.g.location.LocationSettingsRequest.Builder setAlwaysShow(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setAlwaysShow(param0)");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setAlwaysShow(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setAlwaysShow(param0)");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setAlwaysShow(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.LocationSettingsRequest.Builder.setNeedBle(boolean) Sets whether the client wants BLE scan to be enabled.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.LocationSettingsRequest.Builder.setNeedBle(boolean): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section11565183771218">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationsettingsrequest-builder-0000001051066116-V5#EN-US_TOPIC_0000001051066116__section11565183771218</a><br/>
         * com.google.android.gms.location.LocationSettingsRequest.Builder.setNeedBle(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder-setneedble-boolean-needble">https://developers.google.com/android/reference/com/google/android/gms/location/LocationSettingsRequest.Builder#public-locationsettingsrequest.builder-setneedble-boolean-needble</a><br/>
         *
         * @param param0 Indicates whether BLE scanning needs to be enabled for the app. true: yes; false: no
         * @return the LocationSettingsRequest.Builder
         */
        public final org.xms.g.location.LocationSettingsRequest.Builder setNeedBle(boolean param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setNeedBle(param0)");
                com.huawei.hms.location.LocationSettingsRequest.Builder hReturn = ((com.huawei.hms.location.LocationSettingsRequest.Builder) this.getHInstance()).setNeedBle(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setNeedBle(param0)");
                com.google.android.gms.location.LocationSettingsRequest.Builder gReturn = ((com.google.android.gms.location.LocationSettingsRequest.Builder) this.getGInstance()).setNeedBle(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.LocationSettingsRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}