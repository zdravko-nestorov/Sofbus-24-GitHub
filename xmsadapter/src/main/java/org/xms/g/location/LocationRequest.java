package org.xms.g.location;

/**
 * A data object that contains quality of service parameters for requests to the FusedLocationProviderApi.<br/>
 * Combination of com.huawei.hms.location.LocationRequest and com.google.android.gms.location.LocationRequest.<br/>
 * com.huawei.hms.location.LocationRequest: Location request class.<br/>
 * com.google.android.gms.location.LocationRequest: A data object that contains quality of service parameters for requests to the FusedLocationProviderApi.<br/>
 */
public final class LocationRequest extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.LocationRequest.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationrequest-0000001050986189-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationrequest-0000001050986189-V5</a><br/>
     * com.google.android.gms.location.LocationRequest.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-creatorlocationrequest-creator">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-creatorlocationrequest-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.LocationRequest createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.LocationRequest hReturn = com.huawei.hms.location.LocationRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.LocationRequest gReturn = com.google.android.gms.location.LocationRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.LocationRequest[] newArray(int param0) {
            return new org.xms.g.location.LocationRequest[param0];
        }
    };

    /**
     * org.xms.g.location.LocationRequest.LocationRequest(org.xms.g.utils.XBox) constructor of LocationRequest with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationRequest(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationRequest.getPRIORITY_BALANCED_POWER_ACCURACY() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section139848557579">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section139848557579</a><br/>
     * com.google.android.gms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-int-priority_balanced_power_accuracy">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-int-priority_balanced_power_accuracy</a><br/>
     *
     * @return Constant Value.Block level accuracy is considered to be about 100 meter accuracy. Using a coarse accuracy such as this often consumes less power
     */
    public static int getPRIORITY_BALANCED_POWER_ACCURACY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY");
            return com.huawei.hms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY");
            return com.google.android.gms.location.LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY;
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getPRIORITY_HIGH_ACCURACY() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.PRIORITY_HIGH_ACCURACY: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section1254213477129">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section1254213477129</a><br/>
     * com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-int-priority_high_accuracy">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-int-priority_high_accuracy</a><br/>
     *
     * @return Constant Value.Used with setPriority(int) to request the most accurate locations available
     */
    public static int getPRIORITY_HIGH_ACCURACY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.PRIORITY_HIGH_ACCURACY");
            return com.huawei.hms.location.LocationRequest.PRIORITY_HIGH_ACCURACY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY");
            return com.google.android.gms.location.LocationRequest.PRIORITY_HIGH_ACCURACY;
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getPRIORITY_LOW_POWER() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.PRIORITY_LOW_POWER: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section191618352589">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section191618352589</a><br/>
     * com.google.android.gms.location.LocationRequest.PRIORITY_LOW_POWER: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-int-priority_low_power">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-int-priority_low_power</a><br/>
     *
     * @return Constant Value.Used with setPriority(int) to request "city" level accuracy
     */
    public static int getPRIORITY_LOW_POWER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.PRIORITY_LOW_POWER");
            return com.huawei.hms.location.LocationRequest.PRIORITY_LOW_POWER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.PRIORITY_LOW_POWER");
            return com.google.android.gms.location.LocationRequest.PRIORITY_LOW_POWER;
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getPRIORITY_NO_POWER() return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.PRIORITY_NO_POWER: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section83335182014">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section83335182014</a><br/>
     * com.google.android.gms.location.LocationRequest.PRIORITY_NO_POWER: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-int-priority_no_power">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-final-int-priority_no_power</a><br/>
     *
     * @return Constant Value.Used with setPriority(int) to request the best accuracy possible with zero additional power consumption
     */
    public static int getPRIORITY_NO_POWER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.PRIORITY_NO_POWER");
            return com.huawei.hms.location.LocationRequest.PRIORITY_NO_POWER;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.PRIORITY_NO_POWER");
            return com.google.android.gms.location.LocationRequest.PRIORITY_NO_POWER;
        }
    }

    /**
     * org.xms.g.location.LocationRequest.create() Create a location request with default parameters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.create(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section1653772245611</a><br/>
     * com.google.android.gms.location.LocationRequest.create(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-locationrequest-create">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-static-locationrequest-create</a><br/>
     *
     * @return a new location request
     */
    public static org.xms.g.location.LocationRequest create() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationRequest.create()");
            com.huawei.hms.location.LocationRequest hReturn = com.huawei.hms.location.LocationRequest.create();
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationRequest.create()");
            com.google.android.gms.location.LocationRequest gReturn = com.google.android.gms.location.LocationRequest.create();
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationRequest.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationRequest object
     */
    public static org.xms.g.location.LocationRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationRequest) param0);
    }

    /**
     * org.xms.g.location.LocationRequest.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationRequest;
        }
    }

    /**
     * org.xms.g.location.LocationRequest.equals(java.lang.Object) Checks whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.equals(java.lang.Object)
     * com.google.android.gms.location.LocationRequest.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-boolean-equals-object-object">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-boolean-equals-object-object</a><br/>
     *
     * @param param0 the other instance
     * @return true if two instances are equal
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getExpirationTime() Get the request expiration time, in milliseconds since boot.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.getExpirationTime()
     * com.google.android.gms.location.LocationRequest.getExpirationTime(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-long-getexpirationtime">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-long-getexpirationtime</a><br/>
     *
     * @return expiration time of request, in milliseconds since boot including suspend
     */
    public final long getExpirationTime() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getExpirationTime()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getExpirationTime();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getExpirationTime()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getExpirationTime();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.setExpirationTime(long) Set the request expiration time, in millisecond since boot.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.setExpirationTime(long): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section19996045152413">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section19996045152413</a><br/>
     * com.google.android.gms.location.LocationRequest.setExpirationTime(long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setexpirationtime-long-millis">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setexpirationtime-long-millis</a><br/>
     *
     * @param param0 expiration time of request, in milliseconds since boot including suspend
     * @return the same object, so that setters can be chained
     */
    public final org.xms.g.location.LocationRequest setExpirationTime(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setExpirationTime(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setExpirationTime(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setExpirationTime(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setExpirationTime(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getFastestInterval() Get the fastest interval of this request, in milliseconds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.getFastestInterval()
     * com.google.android.gms.location.LocationRequest.getFastestInterval(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-long-getfastestinterval">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-long-getfastestinterval</a><br/>
     *
     * @return fastest interval in milliseconds, exact
     */
    public final long getFastestInterval() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getFastestInterval()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getFastestInterval();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getFastestInterval()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getFastestInterval();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.setFastestInterval(long) Explicitly set the fastest interval for location updates, in milliseconds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.setFastestInterval(long): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section4468141915170">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section4468141915170</a><br/>
     * com.google.android.gms.location.LocationRequest.setFastestInterval(long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setfastestinterval-long-millis">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setfastestinterval-long-millis</a><br/>
     *
     * @param param0 fastest interval for updates in milliseconds, exact
     * @return the same object, so that setters can be chained
     */
    public final org.xms.g.location.LocationRequest setFastestInterval(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setFastestInterval(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setFastestInterval(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setFastestInterval(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setFastestInterval(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getInterval() Get the desired interval of this request, in milliseconds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.getInterval()
     * com.google.android.gms.location.LocationRequest.getInterval(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-long-getinterval">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-long-getinterval</a><br/>
     *
     * @return desired interval in milliseconds, inexact
     */
    public final long getInterval() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getInterval()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getInterval();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getInterval()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getInterval();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.setInterval(long) Set the desired interval for active location updates, in milliseconds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.setInterval(long): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section1523913396146">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section1523913396146</a><br/>
     * com.google.android.gms.location.LocationRequest.setInterval(long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setinterval-long-millis">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setinterval-long-millis</a><br/>
     *
     * @param param0 desired interval in millisecond, inexact
     * @return the same object, so that setters can be chained
     */
    public final org.xms.g.location.LocationRequest setInterval(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setInterval(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setInterval(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setInterval(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setInterval(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getMaxWaitTime() Gets the maximum wait time in milliseconds for location updates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.getMaxWaitTime()
     * com.google.android.gms.location.LocationRequest.getMaxWaitTime(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-long-getmaxwaittime">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-long-getmaxwaittime</a><br/>
     *
     * @return maximum wait time in milliseconds, inexact
     */
    public final long getMaxWaitTime() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getMaxWaitTime()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getMaxWaitTime();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getMaxWaitTime()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getMaxWaitTime();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.setMaxWaitTime(long) Sets the maximum wait time in milliseconds for location updates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.setMaxWaitTime(long): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section105968022917">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section105968022917</a><br/>
     * com.google.android.gms.location.LocationRequest.setMaxWaitTime(long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setmaxwaittime-long-millis">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setmaxwaittime-long-millis</a><br/>
     *
     * @param param0 desired maximum wait time in millisecond, inexact
     * @return the same object, so that setters can be chained
     */
    public final org.xms.g.location.LocationRequest setMaxWaitTime(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setMaxWaitTime(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setMaxWaitTime(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setMaxWaitTime(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setMaxWaitTime(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getNumUpdates() Get the number of updates requested.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.getNumUpdates()
     * com.google.android.gms.location.LocationRequest.getNumUpdates(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-int-getnumupdates">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-int-getnumupdates</a><br/>
     *
     * @return number of updates
     */
    public final int getNumUpdates() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getNumUpdates()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getNumUpdates();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getNumUpdates()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getNumUpdates();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.setNumUpdates(int) Set the number of location updates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.setNumUpdates(int): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section518711641618">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section518711641618</a><br/>
     * com.google.android.gms.location.LocationRequest.setNumUpdates(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setnumupdates-int-numupdates">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setnumupdates-int-numupdates</a><br/>
     *
     * @param param0 the number of location updates requested
     * @return the same object, so that setters can be chained
     */
    public final org.xms.g.location.LocationRequest setNumUpdates(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setNumUpdates(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setNumUpdates(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setNumUpdates(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setNumUpdates(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getPriority() Get the quality of the request.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.getPriority()
     * com.google.android.gms.location.LocationRequest.getPriority(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-int-getpriority">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-int-getpriority</a><br/>
     *
     * @return an accuracy constant
     */
    public final int getPriority() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getPriority()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getPriority();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getPriority()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getPriority();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.setPriority(int) Set the priority of the request.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.setPriority(int): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section106231148987">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section106231148987</a><br/>
     * com.google.android.gms.location.LocationRequest.setPriority(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setpriority-int-priority">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setpriority-int-priority</a><br/>
     *
     * @param param0 an accuracy or power constant
     * @return the same object, so that setters can be chained
     */
    public final org.xms.g.location.LocationRequest setPriority(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setPriority(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setPriority(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setPriority(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setPriority(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.getSmallestDisplacement() Get the minimum displacement between location updates in meters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.getSmallestDisplacement()
     * com.google.android.gms.location.LocationRequest.getSmallestDisplacement(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-float-getsmallestdisplacement">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-float-getsmallestdisplacement</a><br/>
     *
     * @return minimum displacement between location updates in meters
     */
    public final float getSmallestDisplacement() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).getSmallestDisplacement()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).getSmallestDisplacement();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).getSmallestDisplacement()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).getSmallestDisplacement();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.setSmallestDisplacement(float) Set the minimum displacement between location updates in meters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.setSmallestDisplacement(float): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section464205715275">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section464205715275</a><br/>
     * com.google.android.gms.location.LocationRequest.setSmallestDisplacement(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setsmallestdisplacement-float-smallestdisplacementmeters">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setsmallestdisplacement-float-smallestdisplacementmeters</a><br/>
     *
     * @param param0 the smallest displacement in meters the user must move between location updates
     * @return the same object, so that setters can be chained
     */
    public final org.xms.g.location.LocationRequest setSmallestDisplacement(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setSmallestDisplacement(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setSmallestDisplacement(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setSmallestDisplacement(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setSmallestDisplacement(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.hashCode() Overrides the method of the java.lang.Object class to calculate hashCode of a object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.hashCode()
     * com.google.android.gms.location.LocationRequest.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-int-hashcode</a><br/>
     *
     * @return a hash code value
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.isFastestIntervalExplicitlySet() Returns whether or not the fastest interval was explicitly specified for the location request.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.isFastestIntervalExplicitlySet(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section11397333202215">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section11397333202215</a><br/>
     * com.google.android.gms.location.LocationRequest.isFastestIntervalExplicitlySet(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-boolean-isfastestintervalexplicitlyset">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-boolean-isfastestintervalexplicitlyset</a><br/>
     *
     * @return True if the fastest interval was explicitly set for the location request; false otherwise
     */
    public final boolean isFastestIntervalExplicitlySet() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).isFastestIntervalExplicitlySet()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).isFastestIntervalExplicitlySet();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).isFastestIntervalExplicitlySet()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).isFastestIntervalExplicitlySet();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.setExpirationDuration(long) Set the duration of this request, in milliseconds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.setExpirationDuration(long): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section18862171122619">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationrequest-0000001050986189-V5#EN-US_TOPIC_0000001050986189__section18862171122619</a><br/>
     * com.google.android.gms.location.LocationRequest.setExpirationDuration(long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setexpirationduration-long-millis">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-locationrequest-setexpirationduration-long-millis</a><br/>
     *
     * @param param0 duration of request in milliseconds
     * @return the same object, so that setters can be chained
     */
    public final org.xms.g.location.LocationRequest setExpirationDuration(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).setExpirationDuration(param0)");
            com.huawei.hms.location.LocationRequest hReturn = ((com.huawei.hms.location.LocationRequest) this.getHInstance()).setExpirationDuration(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).setExpirationDuration(param0)");
            com.google.android.gms.location.LocationRequest gReturn = ((com.google.android.gms.location.LocationRequest) this.getGInstance()).setExpirationDuration(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationRequest(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationRequest.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.toString()
     * com.google.android.gms.location.LocationRequest.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-string-tostring</a><br/>
     *
     * @return A character string after being converted
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.LocationRequest) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.LocationRequest) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.location.LocationRequest.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationRequest.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.LocationRequest.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-void-writetoparcel-parcel-parcel,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/LocationRequest#public-void-writetoparcel-parcel-parcel,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationRequest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationRequest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationRequest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationRequest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}