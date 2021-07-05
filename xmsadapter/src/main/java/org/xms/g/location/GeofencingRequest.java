package org.xms.g.location;

/**
 * Specifies the list of geofences to be monitored and how the geofence notifications should be reported.<br/>
 * Combination of com.huawei.hms.location.GeofenceRequest and com.google.android.gms.location.GeofencingRequest.<br/>
 * com.huawei.hms.location.GeofenceRequest: Geofence request class.<br/>
 * com.google.android.gms.location.GeofencingRequest: Specifies the list of geofences to be monitored and how the geofence notifications should be reported.<br/>
 */
public class GeofencingRequest extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.GeofenceRequest.CREATOR: <a href=""></a><br/>
     * com.google.android.gms.location.GeofencingRequest.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-static-final-creatorgeofencingrequest-creator">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-static-final-creatorgeofencingrequest-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.GeofencingRequest createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.GeofenceRequest hReturn = com.huawei.hms.location.GeofenceRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.GeofencingRequest(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.GeofencingRequest gReturn = com.google.android.gms.location.GeofencingRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.GeofencingRequest(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.GeofencingRequest[] newArray(int param0) {
            return new org.xms.g.location.GeofencingRequest[param0];
        }
    };

    /**
     * org.xms.g.location.GeofencingRequest.GeofencingRequest(org.xms.g.utils.XBox) constructor of GeofencingRequest with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public GeofencingRequest(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.GeofencingRequest.getINITIAL_TRIGGER_DWELL() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceRequest.DWELL_INIT_CONVERSION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section18651015308">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section18651015308</a><br/>
     * com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_DWELL: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-static-final-int-initial_trigger_dwell">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-static-final-int-initial_trigger_dwell</a><br/>
     *
     * @return Constant Value.A flag indicating that geofencing service should trigger GEOFENCE_TRANSITION_DWELL notification at the moment when the geofence is added and if the device is already inside that geofence for some time
     */
    public static int getINITIAL_TRIGGER_DWELL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceRequest.DWELL_INIT_CONVERSION");
            return com.huawei.hms.location.GeofenceRequest.DWELL_INIT_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_DWELL");
            return com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_DWELL;
        }
    }

    /**
     * org.xms.g.location.GeofencingRequest.getINITIAL_TRIGGER_ENTER() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceRequest.ENTER_INIT_CONVERSION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section1254213477129">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section1254213477129</a><br/>
     * com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_ENTER: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-static-final-int-initial_trigger_enter">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-static-final-int-initial_trigger_enter</a><br/>
     *
     * @return Constant Value.A flag indicating that geofencing service should trigger GEOFENCE_TRANSITION_ENTER notification at the moment when the geofence is added and if the device is already inside that geofence
     */
    public static int getINITIAL_TRIGGER_ENTER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceRequest.ENTER_INIT_CONVERSION");
            return com.huawei.hms.location.GeofenceRequest.ENTER_INIT_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_ENTER");
            return com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_ENTER;
        }
    }

    /**
     * org.xms.g.location.GeofencingRequest.getINITIAL_TRIGGER_EXIT() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceRequest.EXIT_INIT_CONVERSION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section63171927192919">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section63171927192919</a><br/>
     * com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_EXIT: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-static-final-int-initial_trigger_exit">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-static-final-int-initial_trigger_exit</a><br/>
     *
     * @return Constant Value.A flag indicating that geofencing service should trigger GEOFENCE_TRANSITION_EXIT notification at the moment when the geofence is added and if the device is already outside that geofence
     */
    public static int getINITIAL_TRIGGER_EXIT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.GeofenceRequest.EXIT_INIT_CONVERSION");
            return com.huawei.hms.location.GeofenceRequest.EXIT_INIT_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_EXIT");
            return com.google.android.gms.location.GeofencingRequest.INITIAL_TRIGGER_EXIT;
        }
    }

    /**
     * org.xms.g.location.GeofencingRequest.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.GeofencingRequest.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted GeofencingRequest object
     */
    public static org.xms.g.location.GeofencingRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.GeofencingRequest) param0);
    }

    /**
     * org.xms.g.location.GeofencingRequest.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofencingRequest;
        }
    }

    /**
     * org.xms.g.location.GeofencingRequest.getGeofences() Gets the list of geofences to be monitored.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceRequest.getGeofences(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section9254532817">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section9254532817</a><br/>
     * com.google.android.gms.location.GeofencingRequest.getGeofences(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-listgeofence-getgeofences">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-listgeofence-getgeofences</a><br/>
     *
     * @return the list of geofences to be monitored
     */
    public java.util.List<org.xms.g.location.Geofence> getGeofences() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).getGeofences()");
            java.util.List hReturn = ((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).getGeofences();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.Geofence, org.xms.g.location.Geofence>() {

                public org.xms.g.location.Geofence apply(com.huawei.hms.location.Geofence param0) {
                    return new org.xms.g.location.Geofence.XImpl(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).getGeofences()");
            java.util.List gReturn = ((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).getGeofences();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.Geofence, org.xms.g.location.Geofence>() {

                public org.xms.g.location.Geofence apply(com.google.android.gms.location.Geofence param0) {
                    return new org.xms.g.location.Geofence.XImpl(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.location.GeofencingRequest.getInitialTrigger() Gets the triggering behavior at the moment when the geofences are added.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceRequest.getInitConversions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section1842912113331">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencerequest-0000001050746171-V5#EN-US_TOPIC_0000001050746171__section1842912113331</a><br/>
     * com.google.android.gms.location.GeofencingRequest.getInitialTrigger(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-int-getinitialtrigger">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-int-getinitialtrigger</a><br/>
     *
     * @return the triggering behavior at the moment when the geofences are added. Its a bit-wise of INITIAL_TRIGGER_ENTER and INITIAL_TRIGGER_EXIT
     */
    public int getInitialTrigger() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).getInitConversions()");
            return ((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).getInitConversions();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).getInitialTrigger()");
            return ((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).getInitialTrigger();
        }
    }

    /**
     * org.xms.g.location.GeofencingRequest.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceRequest.toString()
     * com.google.android.gms.location.GeofencingRequest.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-string-tostring</a><br/>
     *
     * @return A character string after being converted
     */
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.location.GeofencingRequest.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.GeofenceRequest.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.GeofencingRequest.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.GeofenceRequest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.GeofencingRequest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * Wrapper class of Builder that builds GeofencingRequest.Pending.<br/>
     * Combination of com.huawei.hms.location.GeofenceRequest.Builder and com.google.android.gms.location.GeofencingRequest.Builder.<br/>
     * com.huawei.hms.location.GeofenceRequest.Builder: Builds a GeofenceRequest instance.<br/>
     * com.google.android.gms.location.GeofencingRequest.Builder: A builder that builds GeofencingRequest.Pending.<br/>
     */
    public static final class Builder extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.location.GeofencingRequest.Builder.Builder(org.xms.g.utils.XBox) constructor of GeofencingRequest.Builder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.location.GeofencingRequest.Builder.Builder() constructor of GeofencingRequest.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.GeofenceRequest.Builder.Builder()
         * com.google.android.gms.location.GeofencingRequest.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest.builder">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest.builder</a><br/>
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.GeofenceRequest.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.GeofencingRequest.Builder());
            }
        }

        /**
         * org.xms.g.location.GeofencingRequest.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.GeofencingRequest.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted GeofencingRequest.Builder object
         */
        public static org.xms.g.location.GeofencingRequest.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.GeofencingRequest.Builder) param0);
        }

        /**
         * org.xms.g.location.GeofencingRequest.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.GeofenceRequest.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.GeofencingRequest.Builder;
            }
        }

        /**
         * org.xms.g.location.GeofencingRequest.Builder.addGeofence(org.xms.g.location.Geofence) Adds a geofence to be monitored by geofencing service.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.GeofenceRequest.Builder.createGeofence(com.huawei.hms.location.Geofence): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencingrequest-builder-0000001050706138-V5#EN-US_TOPIC_0000001050706138__section9254532817">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencingrequest-builder-0000001050706138-V5#EN-US_TOPIC_0000001050706138__section9254532817</a><br/>
         * com.google.android.gms.location.GeofencingRequest.Builder.addGeofence(com.google.android.gms.location.Geofence): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest.builder-addgeofence-geofence-geofence">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest.builder-addgeofence-geofence-geofence</a><br/>
         *
         * @param param0 the geofence to be monitored. The geofence must be built with Geofence.Builder
         * @return the builder object itself for method chaining
         * @throws java.lang.NullPointerException     if the given geofence is null
         * @throws java.lang.IllegalArgumentException if the geofence is not built with Geofence.Builder
         */
        public org.xms.g.location.GeofencingRequest.Builder addGeofence(org.xms.g.location.Geofence param0) throws java.lang.NullPointerException, java.lang.IllegalArgumentException {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).createGeofence(((param0) == null ? null : (param0.getHInstanceGeofence())))");
                com.huawei.hms.location.GeofenceRequest.Builder hReturn = ((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).createGeofence(((param0) == null ? null : (param0.getHInstanceGeofence())));
                return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).addGeofence(((param0) == null ? null : (param0.getGInstanceGeofence())))");
                com.google.android.gms.location.GeofencingRequest.Builder gReturn = ((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).addGeofence(((param0) == null ? null : (param0.getGInstanceGeofence())));
                return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.GeofencingRequest.Builder.addGeofences(java.util.List<org.xms.g.location.Geofence>) Adds all the geofences in the given list to be monitored by geofencing service.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.GeofenceRequest.Builder.createGeofenceList(java.util.List<com.huawei.hms.location.Geofence>): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencingrequest-builder-0000001050706138-V5#EN-US_TOPIC_0000001050706138__section1842912113331">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencingrequest-builder-0000001050706138-V5#EN-US_TOPIC_0000001050706138__section1842912113331</a><br/>
         * com.google.android.gms.location.GeofencingRequest.Builder.addGeofences(java.util.List<com.google.android.gms.location.Geofence>): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest.builder-addgeofences-listgeofence-geofences">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest.builder-addgeofences-listgeofence-geofences</a><br/>
         *
         * @param param0 the geofences to be monitored. The geofences in the list must be built with Geofence.Builder
         * @return the builder object itself for method chaining
         * @throws java.lang.IllegalArgumentException if the geofence is not built with Geofence.Builder
         */
        public final org.xms.g.location.GeofencingRequest.Builder addGeofences(java.util.List<org.xms.g.location.Geofence> param0) throws java.lang.IllegalArgumentException {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).createGeofenceList(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true)))");
                com.huawei.hms.location.GeofenceRequest.Builder hReturn = ((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).createGeofenceList(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true)));
                return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).addGeofences(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false)))");
                com.google.android.gms.location.GeofencingRequest.Builder gReturn = ((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).addGeofences(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false)));
                return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.GeofencingRequest.Builder.build() Builds the GeofencingRequest object.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.GeofenceRequest.Builder.build(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencingrequest-builder-0000001050706138-V5#EN-US_TOPIC_0000001050706138__section19287113774815">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencingrequest-builder-0000001050706138-V5#EN-US_TOPIC_0000001050706138__section19287113774815</a><br/>
         * com.google.android.gms.location.GeofencingRequest.Builder.build(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest-build">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest-build</a><br/>
         *
         * @return a GeofencingRequest object
         */
        public final org.xms.g.location.GeofencingRequest build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.GeofenceRequest hReturn = ((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingRequest(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.GeofencingRequest gReturn = ((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingRequest(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.GeofencingRequest.Builder.setInitialTrigger(int) Sets the geofence notification behavior at the moment when the geofences are added. The default behavior is INITIAL_TRIGGER_ENTER and INITIAL_TRIGGER_DWELL.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.GeofenceRequest.Builder.setInitConversions(int): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencingrequest-builder-0000001050706138-V5#EN-US_TOPIC_0000001050706138__section25585613476">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofencingrequest-builder-0000001050706138-V5#EN-US_TOPIC_0000001050706138__section25585613476</a><br/>
         * com.google.android.gms.location.GeofencingRequest.Builder.setInitialTrigger(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest.builder-setinitialtrigger-int-initialtrigger">https://developers.google.com/android/reference/com/google/android/gms/location/GeofencingRequest.Builder#public-geofencingrequest.builder-setinitialtrigger-int-initialtrigger</a><br/>
         *
         * @param param0 the notification behavior. It's a bit-wise of INITIAL_TRIGGER_ENTER and/or INITIAL_TRIGGER_EXIT and/or INITIAL_TRIGGER_DWELL. When initialTrigger is set to 0 (setInitialTrigger(0)), initial trigger would be disabled
         * @return the builder object itself for method chaining
         */
        public final org.xms.g.location.GeofencingRequest.Builder setInitialTrigger(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).setInitConversions(param0)");
                com.huawei.hms.location.GeofenceRequest.Builder hReturn = ((com.huawei.hms.location.GeofenceRequest.Builder) this.getHInstance()).setInitConversions(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).setInitialTrigger(param0)");
                com.google.android.gms.location.GeofencingRequest.Builder gReturn = ((com.google.android.gms.location.GeofencingRequest.Builder) this.getGInstance()).setInitialTrigger(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.GeofencingRequest.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}