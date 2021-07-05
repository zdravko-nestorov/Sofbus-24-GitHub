package org.xms.g.location;

/**
 * Represents the result of activity transitions.<br/>
 * Combination of com.huawei.hms.location.ActivityConversionResponse and com.google.android.gms.location.ActivityTransitionResult.<br/>
 * com.huawei.hms.location.ActivityConversionResponse: Activity conversion result.<br/>
 * com.google.android.gms.location.ActivityTransitionResult: Represents the result of activity transitions.<br/>
 */
public class ActivityTransitionResult extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.ActivityConversionResponse.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityconversionresponse-0000001051066106-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityconversionresponse-0000001051066106-V5</a><br/>
     * com.google.android.gms.location.ActivityTransitionResult.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-static-final-creatoractivitytransitionresult-creator">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-static-final-creatoractivitytransitionresult-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.ActivityTransitionResult createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.ActivityConversionResponse hReturn = com.huawei.hms.location.ActivityConversionResponse.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityTransitionResult(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.ActivityTransitionResult gReturn = com.google.android.gms.location.ActivityTransitionResult.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityTransitionResult(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.ActivityTransitionResult[] newArray(int param0) {
            return new org.xms.g.location.ActivityTransitionResult[param0];
        }
    };
    private boolean wrapper = true;

    /**
     * org.xms.g.location.ActivityTransitionResult.ActivityTransitionResult(org.xms.g.utils.XBox) Constructor of ActivityTransitionResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 The wrapper of xms instance
     */
    public ActivityTransitionResult(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.ActivityTransitionResult(java.util.List<org.xms.g.location.ActivityTransitionEvent>) Constructs a result by specifying a list of transition events.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionResponse.ActivityConversionResponse(java.util.List<com.huawei.hms.location.ActivityConversionData>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionresponse-0000001051066106#EN-US_TOPIC_0000001051066106__section114762417137">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionresponse-0000001051066106#EN-US_TOPIC_0000001051066106__section114762417137</a><br/>
     * com.google.android.gms.location.ActivityTransitionResult.ActivityTransitionResult(java.util.List<com.google.android.gms.location.ActivityTransitionEvent>): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-activitytransitionresult-listactivitytransitionevent-transitionevents">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-activitytransitionresult-listactivitytransitionevent-transitionevents</a><br/>
     *
     * @param param0 The transition events
     */
    public ActivityTransitionResult(java.util.List<org.xms.g.location.ActivityTransitionEvent> param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true))));
        } else {
            this.setGInstance(new GImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false))));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.extractResult(android.content.Intent) Extracts the ActivityTransitionResult from the given Intent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionResponse.getDataFromIntent(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionresponse-0000001051066106#EN-US_TOPIC_0000001051066106__section9254532817">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionresponse-0000001051066106#EN-US_TOPIC_0000001051066106__section9254532817</a><br/>
     * com.google.android.gms.location.ActivityTransitionResult.extractResult(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-static-activitytransitionresult-extractresult-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-static-activitytransitionresult-extractresult-intent-intent</a><br/>
     *
     * @param param0 The Intent to extract the result from
     * @return The ActivityTransitionResult included in the given intent or return null if no such result is found in the given intent
     */
    public static org.xms.g.location.ActivityTransitionResult extractResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionResponse.getDataFromIntent(param0)");
            com.huawei.hms.location.ActivityConversionResponse hReturn = com.huawei.hms.location.ActivityConversionResponse.getDataFromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.ActivityTransitionResult(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransitionResult.extractResult(param0)");
            com.google.android.gms.location.ActivityTransitionResult gReturn = com.google.android.gms.location.ActivityTransitionResult.extractResult(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.ActivityTransitionResult(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.hasResult(android.content.Intent) Checks if the intent contains an ActivityTransitionResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionResponse.containDataFromIntent(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionresponse-0000001051066106#EN-US_TOPIC_0000001051066106__section1615213590310">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionresponse-0000001051066106#EN-US_TOPIC_0000001051066106__section1615213590310</a><br/>
     * com.google.android.gms.location.ActivityTransitionResult.hasResult(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-static-boolean-hasresult-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-static-boolean-hasresult-intent-intent</a><br/>
     *
     * @param param0 Intent instance
     * @return True if the intent contains ActivityTransitionResult; false otherwise
     */
    public static boolean hasResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityConversionResponse.containDataFromIntent(param0)");
            return com.huawei.hms.location.ActivityConversionResponse.containDataFromIntent(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityTransitionResult.hasResult(param0)");
            return com.google.android.gms.location.ActivityTransitionResult.hasResult(param0);
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityTransitionResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted ActivityTransitionResult object
     */
    public static org.xms.g.location.ActivityTransitionResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityTransitionResult) param0);
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityConversionResponse;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityTransitionResult;
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.equals(java.lang.Object) Checks whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionResponse.equals(java.lang.Object)
     * com.google.android.gms.location.ActivityTransitionResult.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 The other instance
     * @return True if two instances are equal
     */
    public boolean equals(java.lang.Object param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).equals(param0)");
                return ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).equals(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).equals(param0)");
                return ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).equals(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).equalsCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).equalsCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).equalsCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).equalsCallSuper(param0);
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.getTransitionEvents() Gets all the activity transition events in this result. The events are in ascending order of time, and may include events in the past.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionResponse.getActivityConversionDatas(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionresponse-0000001051066106#EN-US_TOPIC_0000001051066106__section11309956806">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityconversionresponse-0000001051066106#EN-US_TOPIC_0000001051066106__section11309956806</a><br/>
     * com.google.android.gms.location.ActivityTransitionResult.getTransitionEvents(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-listactivitytransitionevent-gettransitionevents">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-listactivitytransitionevent-gettransitionevents</a><br/>
     *
     * @return List of activity transition events
     */
    public java.util.List<org.xms.g.location.ActivityTransitionEvent> getTransitionEvents() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).getActivityConversionDatas()");
                java.util.List hReturn = ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).getActivityConversionDatas();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.ActivityConversionData, org.xms.g.location.ActivityTransitionEvent>() {

                    public org.xms.g.location.ActivityTransitionEvent apply(com.huawei.hms.location.ActivityConversionData param0) {
                        return new org.xms.g.location.ActivityTransitionEvent(new org.xms.g.utils.XBox(null, param0));
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).getTransitionEvents()");
                java.util.List gReturn = ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).getTransitionEvents();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.ActivityTransitionEvent, org.xms.g.location.ActivityTransitionEvent>() {

                    public org.xms.g.location.ActivityTransitionEvent apply(com.google.android.gms.location.ActivityTransitionEvent param0) {
                        return new org.xms.g.location.ActivityTransitionEvent(new org.xms.g.utils.XBox(param0, null));
                    }
                }));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).getActivityConversionDatasCallSuper()");
                java.util.List hReturn = ((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).getActivityConversionDatasCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.ActivityConversionData, org.xms.g.location.ActivityTransitionEvent>() {

                    public org.xms.g.location.ActivityTransitionEvent apply(com.huawei.hms.location.ActivityConversionData param0) {
                        return new org.xms.g.location.ActivityTransitionEvent(new org.xms.g.utils.XBox(null, param0));
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).getTransitionEventsCallSuper()");
                java.util.List gReturn = ((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).getTransitionEventsCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.ActivityTransitionEvent, org.xms.g.location.ActivityTransitionEvent>() {

                    public org.xms.g.location.ActivityTransitionEvent apply(com.google.android.gms.location.ActivityTransitionEvent param0) {
                        return new org.xms.g.location.ActivityTransitionEvent(new org.xms.g.utils.XBox(param0, null));
                    }
                }));
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.hashCode() Overrides the method of the java.lang.Object class to calculate hashCode of a object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionResponse.hashCode()
     * com.google.android.gms.location.ActivityTransitionResult.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-int-hashcode</a><br/>
     *
     * @return A hash code value
     */
    public int hashCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).hashCode()");
                return ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).hashCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).hashCode()");
                return ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).hashCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).hashCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).hashCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).hashCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).hashCodeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityTransitionResult.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityConversionResponse.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.ActivityTransitionResult.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityTransitionResult#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityConversionResponse) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.ActivityTransitionResult) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }

    private class GImpl extends com.google.android.gms.location.ActivityTransitionResult {

        public GImpl(java.util.List<com.google.android.gms.location.ActivityTransitionEvent> param0) {
            super(param0);
        }

        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionResult.this.equals(param0);
        }

        public java.util.List<com.google.android.gms.location.ActivityTransitionEvent> getTransitionEvents() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.location.ActivityTransitionResult.this.getTransitionEvents(), false));
        }

        public int hashCode() {
            return org.xms.g.location.ActivityTransitionResult.this.hashCode();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionResult.this.writeToParcel(param0, param1);
        }

        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }

        public java.util.List<com.google.android.gms.location.ActivityTransitionEvent> getTransitionEventsCallSuper() {
            return super.getTransitionEvents();
        }

        public int hashCodeCallSuper() {
            return super.hashCode();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }

    private class HImpl extends com.huawei.hms.location.ActivityConversionResponse {

        public HImpl() {
            super();
        }

        public HImpl(java.util.List<com.huawei.hms.location.ActivityConversionData> param0) {
            super(param0);
        }

        public boolean equals(java.lang.Object param0) {
            return org.xms.g.location.ActivityTransitionResult.this.equals(param0);
        }

        public java.util.List<com.huawei.hms.location.ActivityConversionData> getActivityConversionDatas() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.location.ActivityTransitionResult.this.getTransitionEvents(), true));
        }

        public int hashCode() {
            return org.xms.g.location.ActivityTransitionResult.this.hashCode();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityTransitionResult.this.writeToParcel(param0, param1);
        }

        public boolean equalsCallSuper(java.lang.Object param0) {
            return super.equals(param0);
        }

        public java.util.List<com.huawei.hms.location.ActivityConversionData> getActivityConversionDatasCallSuper() {
            return super.getActivityConversionDatas();
        }

        public int hashCodeCallSuper() {
            return super.hashCode();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }
}