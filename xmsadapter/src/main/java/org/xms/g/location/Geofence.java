package org.xms.g.location;

/**
 * Represents a geographical region, also known as a geofence. Geofences can be monitored by geofencer service. And when the user crosses the boundary of a geofence, an alert will be generated.<br/>
 * Combination of com.huawei.hms.location.Geofence and com.google.android.gms.location.Geofence.<br/>
 * com.huawei.hms.location.Geofence: Geofence entity interface.<br/>
 * com.google.android.gms.location.Geofence: Represents a geographical region, also known as a geofence. Geofences can be monitored by geofencer service. And when the user crosses the boundary of a geofence, an alert will be generated.<br/>
 */
public interface Geofence extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.location.Geofence.getGEOFENCE_TRANSITION_DWELL() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.Geofence.DWELL_GEOFENCE_CONVERSION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section56571345113615">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section56571345113615</a><br/>
     * com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_DWELL: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-static-final-int-geofence_transition_dwell">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-static-final-int-geofence_transition_dwell</a><br/>
     *
     * @return Constant Value.The transition type indicating that the user enters and dwells in geofences for a given period of time
     */
    public static int getGEOFENCE_TRANSITION_DWELL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.Geofence.DWELL_GEOFENCE_CONVERSION");
            return com.huawei.hms.location.Geofence.DWELL_GEOFENCE_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_DWELL");
            return com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_DWELL;
        }
    }

    /**
     * org.xms.g.location.Geofence.getGEOFENCE_TRANSITION_ENTER() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.Geofence.ENTER_GEOFENCE_CONVERSION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section1254213477129">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section1254213477129</a><br/>
     * com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_ENTER: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-static-final-int-geofence_transition_enter">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-static-final-int-geofence_transition_enter</a><br/>
     *
     * @return Constant Value.The transition type indicating that the user enters the geofence(s)
     */
    public static int getGEOFENCE_TRANSITION_ENTER() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.Geofence.ENTER_GEOFENCE_CONVERSION");
            return com.huawei.hms.location.Geofence.ENTER_GEOFENCE_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_ENTER");
            return com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_ENTER;
        }
    }

    /**
     * org.xms.g.location.Geofence.getGEOFENCE_TRANSITION_EXIT() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.Geofence.EXIT_GEOFENCE_CONVERSION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section104194423618">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section104194423618</a><br/>
     * com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_EXIT: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-static-final-int-geofence_transition_exit">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-static-final-int-geofence_transition_exit</a><br/>
     *
     * @return Constant Value.The transition type indicating that the user exits the geofence(s)
     */
    public static int getGEOFENCE_TRANSITION_EXIT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.Geofence.EXIT_GEOFENCE_CONVERSION");
            return com.huawei.hms.location.Geofence.EXIT_GEOFENCE_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_EXIT");
            return com.google.android.gms.location.Geofence.GEOFENCE_TRANSITION_EXIT;
        }
    }

    /**
     * org.xms.g.location.Geofence.getNEVER_EXPIRE() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.Geofence.GEOFENCE_NEVER_EXPIRE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section1786514633613">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section1786514633613</a><br/>
     * com.google.android.gms.location.Geofence.NEVER_EXPIRE: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-static-final-long-never_expire">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-static-final-long-never_expire</a><br/>
     *
     * @return Constant Value.Expiration value that indicates the geofence should never expire
     */
    public static long getNEVER_EXPIRE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.Geofence.GEOFENCE_NEVER_EXPIRE");
            return com.huawei.hms.location.Geofence.GEOFENCE_NEVER_EXPIRE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.Geofence.NEVER_EXPIRE");
            return com.google.android.gms.location.Geofence.NEVER_EXPIRE;
        }
    }

    /**
     * org.xms.g.location.Geofence.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.Geofence.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted Geofence object
     */
    public static org.xms.g.location.Geofence dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.Geofence) param0);
    }

    /**
     * org.xms.g.location.Geofence.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return True if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.Geofence;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.Geofence;
            }
        }
        return param0 instanceof org.xms.g.location.Geofence;
    }

    /**
     * org.xms.g.location.Geofence.getRequestId() Returns the request ID of this geofence.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.Geofence.getUniqueId(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section58926443498">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section58926443498</a><br/>
     * com.google.android.gms.location.Geofence.getRequestId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-abstract-string-getrequestid">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-abstract-string-getrequestid</a><br/>
     *
     * @return The request ID
     */
    public java.lang.String getRequestId();

    default java.lang.Object getZInstanceGeofence() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceGeofence();
        } else {
            return getGInstanceGeofence();
        }
    }

    default com.google.android.gms.location.Geofence getGInstanceGeofence() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.location.Geofence) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.location.Geofence() {

            public java.lang.String getRequestId() {
                return org.xms.g.location.Geofence.this.getRequestId();
            }
        };
    }

    default com.huawei.hms.location.Geofence getHInstanceGeofence() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.location.Geofence) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.location.Geofence() {

            public java.lang.String getUniqueId() {
                return org.xms.g.location.Geofence.this.getRequestId();
            }
        };
    }

    /**
     * Wrapper class of Geofence which represents a geographical region, also known as a geofence. Geofences can be monitored by geofencer service. And when the user crosses the boundary of a geofence, an alert will be generated.<br/>
     * Combination of com.huawei.hms.location.Geofence and com.google.android.gms.location.Geofence.<br/>
     * com.huawei.hms.location.Geofence: Geofence entity interface.<br/>
     * com.google.android.gms.location.Geofence: Represents a geographical region, also known as a geofence. Geofences can be monitored by geofencer service. And when the user crosses the boundary of a geofence, an alert will be generated.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.Geofence {

        /**
         * org.xms.g.location.Geofence.XImpl.XImpl(org.xms.g.utils.XBox) Constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 The wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.location.Geofence.XImpl.getRequestId() Returns the request ID of this geofence.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.getUniqueId(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section58926443498">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-0000001050706130-V5#EN-US_TOPIC_0000001050706130__section58926443498</a><br/>
         * com.google.android.gms.location.Geofence.getRequestId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-abstract-string-getrequestid">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence#public-abstract-string-getrequestid</a><br/>
         *
         * @return The request ID
         */
        public java.lang.String getRequestId() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence) this.getHInstance()).getUniqueId()");
                return ((com.huawei.hms.location.Geofence) this.getHInstance()).getUniqueId();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence) this.getGInstance()).getRequestId()");
                return ((com.google.android.gms.location.Geofence) this.getGInstance()).getRequestId();
            }
        }
    }

    /**
     * Wrapper class of Builder that builds Geofence.<br/>
     * Combination of com.huawei.hms.location.Geofence.Builder and com.google.android.gms.location.Geofence.Builder.<br/>
     * com.huawei.hms.location.Geofence.Builder: Builds a Geofence instance.<br/>
     * com.google.android.gms.location.Geofence.Builder: A builder that builds Geofence.<br/>
     */
    public static final class Builder extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.location.Geofence.Builder.Builder(org.xms.g.utils.XBox) Constructor of Builder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 The wrapper of xms instance
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.location.Geofence.Builder.Builder() Create a builder that builds Geofence.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.Builder.Builder()
         * com.google.android.gms.location.Geofence.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder</a><br/>
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.location.Geofence.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.location.Geofence.Builder());
            }
        }

        /**
         * org.xms.g.location.Geofence.Builder.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.Geofence.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 The input object
         * @return Casted Geofence.Builder object
         */
        public static org.xms.g.location.Geofence.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.location.Geofence.Builder) param0);
        }

        /**
         * org.xms.g.location.Geofence.Builder.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 The input object
         * @return True if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XGettable)) {
                return false;
            }
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.Geofence.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.Geofence.Builder;
            }
        }

        /**
         * org.xms.g.location.Geofence.Builder.build() Creates a geofence object.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.Builder.build(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section1114844123220">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section1114844123220</a><br/>
         * com.google.android.gms.location.Geofence.Builder.build(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence-build">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence-build</a><br/>
         *
         * @return A geofence object
         */
        public final org.xms.g.location.Geofence build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).build()");
                com.huawei.hms.location.Geofence hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).build()");
                com.google.android.gms.location.Geofence gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.Geofence.Builder.setCircularRegion(double,double,float) Sets the region of this geofence. The geofence represents a circular area on a flat, horizontal plane.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.Builder.setRoundArea(double,double,float): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section9254532817">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section9254532817</a><br/>
         * com.google.android.gms.location.Geofence.Builder.setCircularRegion(double,double,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setcircularregion-double-latitude,-double-longitude,-float-radius">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setcircularregion-double-latitude,-double-longitude,-float-radius</a><br/>
         *
         * @param param0 latitude in degrees, between -90 and +90 inclusive
         * @param param1 longitude in degrees, between -180 and +180 inclusive
         * @param param2 radius in meters
         * @return The Builder
         */
        public final org.xms.g.location.Geofence.Builder setCircularRegion(double param0, double param1, float param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setRoundArea(param0, param1, param2)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setRoundArea(param0, param1, param2);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setCircularRegion(param0, param1, param2)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setCircularRegion(param0, param1, param2);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.Geofence.Builder.setExpirationDuration(long) Sets the expiration duration of geofence. This geofence will be removed automatically after this period of time.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.Builder.setValidContinueTime(long): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section3781419112518">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section3781419112518</a><br/>
         * com.google.android.gms.location.Geofence.Builder.setExpirationDuration(long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setexpirationduration-long-durationmillis">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setexpirationduration-long-durationmillis</a><br/>
         *
         * @param param0 Time for this proximity alert, in milliseconds, or NEVER_EXPIRE to indicate no expiration. When positive, this geofence will be removed automatically after this amount of time
         * @return The Builder
         */
        public final org.xms.g.location.Geofence.Builder setExpirationDuration(long param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setValidContinueTime(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setValidContinueTime(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setExpirationDuration(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setExpirationDuration(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.Geofence.Builder.setLoiteringDelay(int) Sets the delay between GEOFENCE_TRANSITION_ENTER and GEOFENCE_TRANSITION_DWELLING in milliseconds.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.Builder.setDwellDelayTime(int): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section4655181732916">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section4655181732916</a><br/>
         * com.google.android.gms.location.Geofence.Builder.setLoiteringDelay(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setloiteringdelay-int-loiteringdelayms">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setloiteringdelay-int-loiteringdelayms</a><br/>
         *
         * @param param0 The delay for confirming dwelling, in milliseconds
         * @return The Builder
         */
        public final org.xms.g.location.Geofence.Builder setLoiteringDelay(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setDwellDelayTime(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setDwellDelayTime(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setLoiteringDelay(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setLoiteringDelay(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.Geofence.Builder.setNotificationResponsiveness(int) Sets the best-effort notification responsiveness of the geofence.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.Builder.setNotificationInterval(int): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section18215122583112">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section18215122583112</a><br/>
         * com.google.android.gms.location.Geofence.Builder.setNotificationResponsiveness(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setnotificationresponsiveness-int-notificationresponsivenessms">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setnotificationresponsiveness-int-notificationresponsivenessms</a><br/>
         *
         * @param param0 (milliseconds)Defines the best-effort description of how soon should the callback be called when the transition associated with the Geofence is triggered. For instance, if set to 300000 milliseconds the callback will be called 5 minutes within entering or exiting the geofence
         * @return The Builder
         */
        public final org.xms.g.location.Geofence.Builder setNotificationResponsiveness(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setNotificationInterval(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setNotificationInterval(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setNotificationResponsiveness(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setNotificationResponsiveness(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.Geofence.Builder.setRequestId(java.lang.String) Sets the request ID of the geofence.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.Builder.setUniqueId(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section217115451211">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section217115451211</a><br/>
         * com.google.android.gms.location.Geofence.Builder.setRequestId(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setrequestid-string-requestid">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-setrequestid-string-requestid</a><br/>
         *
         * @param param0 The request ID. The length of the string can be up to 100 characters
         * @return The Builder
         */
        public final org.xms.g.location.Geofence.Builder setRequestId(java.lang.String param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setUniqueId(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setUniqueId(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setRequestId(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setRequestId(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.location.Geofence.Builder.setTransitionTypes(int) Sets the transition types of interest. Alerts are only generated for the given transition types.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.location.Geofence.Builder.setConversions(int): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section1988364352312">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/geofence-builder-0000001050706136-V5#EN-US_TOPIC_0000001050706136__section1988364352312</a><br/>
         * com.google.android.gms.location.Geofence.Builder.setTransitionTypes(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-settransitiontypes-int-transitiontypes">https://developers.google.com/android/reference/com/google/android/gms/location/Geofence.Builder#public-geofence.builder-settransitiontypes-int-transitiontypes</a><br/>
         *
         * @param param0 Geofence transition types of interest, as a bitwise-OR of GEOFENCE_TRANSITION_ flags
         * @return The Builder
         */
        public final org.xms.g.location.Geofence.Builder setTransitionTypes(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setConversions(param0)");
                com.huawei.hms.location.Geofence.Builder hReturn = ((com.huawei.hms.location.Geofence.Builder) this.getHInstance()).setConversions(param0);
                return ((hReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setTransitionTypes(param0)");
                com.google.android.gms.location.Geofence.Builder gReturn = ((com.google.android.gms.location.Geofence.Builder) this.getGInstance()).setTransitionTypes(param0);
                return ((gReturn) == null ? null : (new org.xms.g.location.Geofence.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}