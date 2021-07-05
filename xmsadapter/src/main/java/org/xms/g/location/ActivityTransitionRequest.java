package org.xms.g.location;

/**
 * The request object for apps to get notified when user's activity changes.<br/>
 * Combination of com.huawei.hms.location.ActivityConversionRequest and com.google.android.gms.location.ActivityTransitionRequest.<br/>
 * com.huawei.hms.location.ActivityConversionRequest: Activity conversion request body.<br/>
 * com.google.android.gms.location.ActivityTransitionRequest: The request object for apps to get notified when user's activity changes.<br/>
 */
public class ActivityTransitionRequest extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.ActivityConversionRequest.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityconversionrequest-0000001050986181-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityconversionrequest-0000001050986181-V5</a><br/>
     * com.google.android.gms.location.ActivityTransitionRequest.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-static-final-creatoractivitytransitionrequest-creator">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-static-final-creatoractivitytransitionrequest-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.ActivityTransitionRequest createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.ActivityConversionRequest hReturn = com.huawei.hms.location.ActivityConversionRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityTransitionRequest(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.ActivityTransitionRequest gReturn = com.google.android.gms.location.ActivityTransitionRequest.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityTransitionRequest(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.ActivityTransitionRequest[] newArray(int param0) {
            return new org.xms.g.location.ActivityTransitionRequest[param0];
        }
    };
    private boolean wrapper = true;

    /**
     * org.xms.g.location.ActivityTransitionRequest.ActivityTransitionRequest(org.xms.g.utils.XBox) Constructor of ActivityTransitionRequest with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 The wrapper of xms instance
     */
    public ActivityTransitionRequest(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.ActivityTransitionRequest(java.util.List<org.xms.g.location.ActivityTransition>) Creates an ActivityTransitionRequest object by specifying a list of interested activity transitions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionRequest.ActivityConversionRequest(java.util.List<com.huawei.hms.location.ActivityConversionInfo>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionrequest-0000001050986181#EN-US_TOPIC_0000001050986181__section114762417137">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionrequest-0000001050986181#EN-US_TOPIC_0000001050986181__section114762417137</a><br/>
     * com.google.android.gms.location.ActivityTransitionRequest.ActivityTransitionRequest(java.util.List<com.google.android.gms.location.ActivityTransition>): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-activitytransitionrequest-listactivitytransition-transitions">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-activitytransitionrequest-listactivitytransition-transitions</a><br/>
     *
     * @param param0 A list of interested activity transitions
     */
    public ActivityTransitionRequest(java.util.List<org.xms.g.location.ActivityTransition> param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true))));
        } else {
            this.setGInstance(new GImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false))));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.getIS_SAME_TRANSITION() Return the Comparator.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionRequest.IS_EQUAL_CONVERSION
     * com.google.android.gms.location.ActivityTransitionRequest.IS_SAME_TRANSITION: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-static-final-comparatoractivitytransition-is_same_transition">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-static-final-comparatoractivitytransition-is_same_transition</a><br/>
     *
     * @return The comparator used to determine if two transitions are the same
     */
    public static java.util.Comparator getIS_SAME_TRANSITION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionRequest.IS_EQUAL_CONVERSION");
            return com.huawei.hms.location.ActivityConversionRequest.IS_EQUAL_CONVERSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransitionRequest.IS_SAME_TRANSITION");
            return com.google.android.gms.location.ActivityTransitionRequest.IS_SAME_TRANSITION;
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityTransitionRequest.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted ActivityTransitionRequest object
     */
    public static org.xms.g.location.ActivityTransitionRequest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityTransitionRequest) param0);
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionRequest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransitionRequest;
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.equals(java.lang.Object) Checks whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionRequest.equals(java.lang.Object)
     * com.google.android.gms.location.ActivityTransitionRequest.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 The other instance
     * @return True if two instances are equal
     */
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.hashCode() Overrides the method of the java.lang.Object class to calculate hashCode of a object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionRequest.hashCode()
     * com.google.android.gms.location.ActivityTransitionRequest.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-int-hashcode</a><br/>
     *
     * @return A hash code value
     */
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.serializeToIntentExtra(android.content.Intent) Serializes this request to the given intent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionRequest.setDataToIntent(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionrequest-0000001050986181#EN-US_TOPIC_0000001050986181__section9254532817">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionrequest-0000001050986181#EN-US_TOPIC_0000001050986181__section9254532817</a><br/>
     * com.google.android.gms.location.ActivityTransitionRequest.serializeToIntentExtra(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-void-serializetointentextra-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-void-serializetointentextra-intent-intent</a><br/>
     *
     * @param param0 The intent to serailize this object to
     */
    public void serializeToIntentExtra(android.content.Intent param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).setDataToIntent(param0)");
                ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).setDataToIntent(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).serializeToIntentExtra(param0)");
                ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).serializeToIntentExtra(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).setDataToIntentCallSuper(param0)");
                ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).setDataToIntentCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).serializeToIntentExtraCallSuper(param0)");
                ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).serializeToIntentExtraCallSuper(param0);
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionRequest.toString()
     * com.google.android.gms.location.ActivityTransitionRequest.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-string-tostring</a><br/>
     *
     * @return A character string after being converted
     */
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).toString()");
                return ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).toString()");
                return ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).toStringCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionRequest.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionRequest.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.ActivityTransitionRequest.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionRequest#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityConversionRequest) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.ActivityTransitionRequest) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }

    private class GImpl extends com.google.android.gms.location.ActivityTransitionRequest {

        public GImpl(java.util.List<com.google.android.gms.location.ActivityTransition> param0) {
            super(param0);
        }

        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionRequest.this.equals(param0);
        }

        public int hashCode() {
            return org.xms.g.location.ActivityTransitionRequest.this.hashCode();
        }

        public void serializeToIntentExtra(android.content.Intent param0) {
            org.xms.g.location.ActivityTransitionRequest.this.serializeToIntentExtra(param0);
        }

        public java.lang.String toString() {
            return org.xms.g.location.ActivityTransitionRequest.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionRequest.this.writeToParcel(param0, param1);
        }

        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }

        public int hashCodeCallSuper() {
            return super.hashCode();
        }

        public void serializeToIntentExtraCallSuper(android.content.Intent param0) {
            super.serializeToIntentExtra(param0);
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }

    private class HImpl extends com.huawei.hms.location.ActivityConversionRequest {

        public HImpl() {
            super();
        }

        protected HImpl(android.os.Parcel param0) {
            super(param0);
        }

        public HImpl(java.util.List<com.huawei.hms.location.ActivityConversionInfo> param0) {
            super(param0);
        }

        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionRequest.this.equals(param0);
        }

        public int hashCode() {
            return org.xms.g.location.ActivityTransitionRequest.this.hashCode();
        }

        public void setDataToIntent(android.content.Intent param0) {
            org.xms.g.location.ActivityTransitionRequest.this.serializeToIntentExtra(param0);
        }

        public java.lang.String toString() {
            return org.xms.g.location.ActivityTransitionRequest.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionRequest.this.writeToParcel(param0, param1);
        }

        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }

        public int hashCodeCallSuper() {
            return super.hashCode();
        }

        public void setDataToIntentCallSuper(android.content.Intent param0) {
            super.setDataToIntent(param0);
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }
}