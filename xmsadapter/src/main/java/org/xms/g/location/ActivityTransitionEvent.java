package org.xms.g.location;

/**
 * Represents an activity transition event, for example start to walk, stop running etc.<br/>
 * Combination of com.huawei.hms.location.ActivityConversionData and com.google.android.gms.location.ActivityTransitionEvent.<br/>
 * com.huawei.hms.location.ActivityConversionData: Activity conversion event.<br/>
 * com.google.android.gms.location.ActivityTransitionEvent: Represents an activity transition event, for example start to walk, stop running etc.<br/>
 */
public class ActivityTransitionEvent extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.ActivityConversionData.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityconversiondata-0000001051066104-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityconversiondata-0000001051066104-V5</a><br/>
     * com.google.android.gms.location.ActivityTransitionEvent.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-static-final-creatoractivitytransitionevent-creator">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-static-final-creatoractivitytransitionevent-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.ActivityTransitionEvent createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.ActivityConversionData hReturn = com.huawei.hms.location.ActivityConversionData.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityTransitionEvent(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.ActivityTransitionEvent gReturn = com.google.android.gms.location.ActivityTransitionEvent.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityTransitionEvent(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.ActivityTransitionEvent[] newArray(int param0) {
            return new org.xms.g.location.ActivityTransitionEvent[param0];
        }
    };
    private boolean wrapper = true;

    /**
     * org.xms.g.location.ActivityTransitionEvent.ActivityTransitionEvent(org.xms.g.utils.XBox) Constructor of ActivityTransitionEvent with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 The wrapper of xms instance
     */
    public ActivityTransitionEvent(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.ActivityTransitionEvent(int,int,long) Creates an activity transition event.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionData.ActivityConversionData(int,int,long): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversiondata-0000001051066104#EN-US_TOPIC_0000001051066104__section114762417137">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversiondata-0000001051066104#EN-US_TOPIC_0000001051066104__section114762417137</a><br/>
     * com.google.android.gms.location.ActivityTransitionEvent.ActivityTransitionEvent(int,int,long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-activitytransitionevent-int-activitytype,-int-transitiontype,-long-elapsedrealtimenanos">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-activitytransitionevent-int-activitytype,-int-transitiontype,-long-elapsedrealtimenanos</a><br/>
     *
     * @param param0 The type of the activity of this transition
     * @param param1 The type of transition
     * @param param2 The elapsed realtime when this transition happened
     */
    public ActivityTransitionEvent(int param0, int param1, long param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1, param2));
        } else {
            this.setGInstance(new GImpl(param0, param1, param2));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityTransitionEvent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted ActivityTransitionEvent object
     */
    public static org.xms.g.location.ActivityTransitionEvent dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityTransitionEvent) param0);
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionData;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransitionEvent;
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.equals(java.lang.Object) Checks whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionData.equals(java.lang.Object)
     * com.google.android.gms.location.ActivityTransitionEvent.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-boolean-equals-object-object">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-boolean-equals-object-object</a><br/>
     *
     * @param param0 The other instance
     * @return True if two instances are equal
     */
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.getActivityType() Gets the type of the activity of this transition.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionData.getActivityType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversiondata-0000001051066104#EN-US_TOPIC_0000001051066104__section9254532817">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversiondata-0000001051066104#EN-US_TOPIC_0000001051066104__section9254532817</a><br/>
     * com.google.android.gms.location.ActivityTransitionEvent.getActivityType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-int-getactivitytype">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-int-getactivitytype</a><br/>
     *
     * @return The type of the activity
     */
    public int getActivityType() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getActivityType()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getActivityType();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getActivityType()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getActivityType();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getActivityTypeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getActivityTypeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getActivityTypeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getActivityTypeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.getElapsedRealTimeNanos() Gets the elapsed realtime when this transition happened.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionData.getElapsedTimeFromReboot(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversiondata-0000001051066104#EN-US_TOPIC_0000001051066104__section17367589218">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversiondata-0000001051066104#EN-US_TOPIC_0000001051066104__section17367589218</a><br/>
     * com.google.android.gms.location.ActivityTransitionEvent.getElapsedRealTimeNanos(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-long-getelapsedrealtimenanos">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-long-getelapsedrealtimenanos</a><br/>
     *
     * @return The number of milliseconds elapsed since the device boot to the activity conversion time
     */
    public long getElapsedRealTimeNanos() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getElapsedTimeFromReboot()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getElapsedTimeFromReboot();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getElapsedRealTimeNanos()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getElapsedRealTimeNanos();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getElapsedTimeFromRebootCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getElapsedTimeFromRebootCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getElapsedRealTimeNanosCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getElapsedRealTimeNanosCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.getTransitionType() Gets the type of the transition.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionData.getConversionType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversiondata-0000001051066104#EN-US_TOPIC_0000001051066104__section8583114215229">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversiondata-0000001051066104#EN-US_TOPIC_0000001051066104__section8583114215229</a><br/>
     * com.google.android.gms.location.ActivityTransitionEvent.getTransitionType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-int-gettransitiontype">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-int-gettransitiontype</a><br/>
     *
     * @return int The type
     */
    public int getTransitionType() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getConversionType()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).getConversionType();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getTransitionType()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).getTransitionType();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getConversionTypeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).getConversionTypeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getTransitionTypeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).getTransitionTypeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.hashCode() Overrides the method of the java.lang.Object class to calculate hashCode of a object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionData.hashCode()
     * com.google.android.gms.location.ActivityTransitionEvent.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-int-hashcode</a><br/>
     *
     * @return A hash code value
     */
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionData.toString()
     * com.google.android.gms.location.ActivityTransitionEvent.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-string-tostring</a><br/>
     *
     * @return A character string after being converted
     */
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).toString()");
                return ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).toString()");
                return ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).toStringCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionEvent.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionData.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.ActivityTransitionEvent.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionEvent#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityConversionData) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityConversionData) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.ActivityTransitionEvent) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }

    private class GImpl extends com.google.android.gms.location.ActivityTransitionEvent {

        public GImpl(int param0, int param1, long param2) {
            super(param0, param1, param2);
        }

        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionEvent.this.equals(param0);
        }

        public int getActivityType() {
            return org.xms.g.location.ActivityTransitionEvent.this.getActivityType();
        }

        public long getElapsedRealTimeNanos() {
            return org.xms.g.location.ActivityTransitionEvent.this.getElapsedRealTimeNanos();
        }

        public int getTransitionType() {
            return org.xms.g.location.ActivityTransitionEvent.this.getTransitionType();
        }

        public int hashCode() {
            return org.xms.g.location.ActivityTransitionEvent.this.hashCode();
        }

        public java.lang.String toString() {
            return org.xms.g.location.ActivityTransitionEvent.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionEvent.this.writeToParcel(param0, param1);
        }

        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }

        public int getActivityTypeCallSuper() {
            return super.getActivityType();
        }

        public long getElapsedRealTimeNanosCallSuper() {
            return super.getElapsedRealTimeNanos();
        }

        public int getTransitionTypeCallSuper() {
            return super.getTransitionType();
        }

        public int hashCodeCallSuper() {
            return super.hashCode();
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }

    private class HImpl extends com.huawei.hms.location.ActivityConversionData {

        public HImpl() {
            super();
        }

        public HImpl(int param0, int param1, long param2) {
            super(param0, param1, param2);
        }

        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionEvent.this.equals(param0);
        }

        public int getActivityType() {
            return org.xms.g.location.ActivityTransitionEvent.this.getActivityType();
        }

        public long getElapsedTimeFromReboot() {
            return org.xms.g.location.ActivityTransitionEvent.this.getElapsedRealTimeNanos();
        }

        public int getConversionType() {
            return org.xms.g.location.ActivityTransitionEvent.this.getTransitionType();
        }

        public int hashCode() {
            return org.xms.g.location.ActivityTransitionEvent.this.hashCode();
        }

        public java.lang.String toString() {
            return org.xms.g.location.ActivityTransitionEvent.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionEvent.this.writeToParcel(param0, param1);
        }

        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }

        public int getActivityTypeCallSuper() {
            return super.getActivityType();
        }

        public long getElapsedTimeFromRebootCallSuper() {
            return super.getElapsedTimeFromReboot();
        }

        public int getConversionTypeCallSuper() {
            return super.getConversionType();
        }

        public int hashCodeCallSuper() {
            return super.hashCode();
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }
}