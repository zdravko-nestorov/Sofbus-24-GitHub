package org.xms.g.location;

/**
 * Result of an activity recognition.<br/>
 * Combination of com.huawei.hms.location.ActivityIdentificationResponse and com.google.android.gms.location.ActivityRecognitionResult.<br/>
 * com.huawei.hms.location.ActivityIdentificationResponse: Activity identification result.<br/>
 * com.google.android.gms.location.ActivityRecognitionResult: Result of an activity recognition.<br/>
 */
public class ActivityRecognitionResult extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.ActivityIdentificationResponse.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityidentificationresponse-0000001051066108-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityidentificationresponse-0000001051066108-V5</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-static-final-creatoractivityrecognitionresult-creator">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-static-final-creatoractivityrecognitionresult-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.ActivityRecognitionResult createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.ActivityIdentificationResponse hReturn = com.huawei.hms.location.ActivityIdentificationResponse.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityRecognitionResult(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.ActivityRecognitionResult gReturn = com.google.android.gms.location.ActivityRecognitionResult.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.ActivityRecognitionResult(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.ActivityRecognitionResult[] newArray(int param0) {
            return new org.xms.g.location.ActivityRecognitionResult[param0];
        }
    };
    private boolean wrapper = true;

    /**
     * org.xms.g.location.ActivityRecognitionResult.ActivityRecognitionResult(org.xms.g.utils.XBox) Constructor of ActivityRecognitionResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 The wrapper of xms instance
     */
    public ActivityRecognitionResult(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.ActivityRecognitionResult(java.util.List<org.xms.g.location.DetectedActivity>,long,long) Constructs an ActivityRecognitionResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.ActivityIdentificationResponse(List<com.huawei.hms.locationActivityIdentificationData>,long,long): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section1346604418442">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section1346604418442</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.ActivityRecognitionResult(java.util.List<com.google.android.gms.location.DetectedActivity>,long,long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-activityrecognitionresult-listdetectedactivity-probableactivities,-long-time,-long-elapsedrealtimemillis">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-activityrecognitionresult-listdetectedactivity-probableactivities,-long-time,-long-elapsedrealtimemillis</a><br/>
     *
     * @param param0 The activities that were detected, sorted by confidence (most probable first)
     * @param param1 The UTC time of this detection, in milliseconds since January 1, 1970
     * @param param2 Milliseconds since boot
     */
    public ActivityRecognitionResult(java.util.List<org.xms.g.location.DetectedActivity> param0, long param1, long param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, true)), param1, param2));
        } else {
            this.setGInstance(new GImpl(((java.util.List) org.xms.g.utils.Utils.mapList2GH(param0, false)), param1, param2));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.ActivityRecognitionResult(org.xms.g.location.DetectedActivity,long,long) Constructs an ActivityRecognitionResult from a single activity.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.ActivityIdentificationResponse(com.huawei.hms.location.ActivityIdentificationData,long,long): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section48131849114415">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section48131849114415</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.ActivityRecognitionResult(com.google.android.gms.location.DetectedActivity,long,long): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-activityrecognitionresult-detectedactivity-mostprobableactivity,-long-time,-long-elapsedrealtimemillis">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-activityrecognitionresult-detectedactivity-mostprobableactivity,-long-time,-long-elapsedrealtimemillis</a><br/>
     *
     * @param param0 The most probable activity of the device
     * @param param1 The UTC time of this detection, in milliseconds since January 1, 1970
     * @param param2 Milliseconds since boot
     */
    public ActivityRecognitionResult(org.xms.g.location.DetectedActivity param0, long param1, long param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((com.huawei.hms.location.ActivityIdentificationData) ((param0) == null ? null : (param0.getHInstance()))), param1, param2));
        } else {
            this.setGInstance(new GImpl(((com.google.android.gms.location.DetectedActivity) ((param0) == null ? null : (param0.getGInstance()))), param1, param2));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.extractResult(android.content.Intent) Extracts the ActivityRecognitionResult from an Intent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.getDataFromIntent(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section9254532817">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section9254532817</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.extractResult(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-static-activityrecognitionresult-extractresult-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-static-activityrecognitionresult-extractresult-intent-intent</a><br/>
     *
     * @param param0 Intent instance
     * @return an ActivityRecognitionResult, or null if the intent doesn't contain an ActivityRecognitionResult
     */
    public static org.xms.g.location.ActivityRecognitionResult extractResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationResponse.getDataFromIntent(param0)");
            com.huawei.hms.location.ActivityIdentificationResponse hReturn = com.huawei.hms.location.ActivityIdentificationResponse.getDataFromIntent(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionResult(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityRecognitionResult.extractResult(param0)");
            com.google.android.gms.location.ActivityRecognitionResult gReturn = com.google.android.gms.location.ActivityRecognitionResult.extractResult(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionResult(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.hasResult(android.content.Intent) Returns true if an Intent contains an ActivityRecognitionResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.containDataFromIntent(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section1066834181110">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section1066834181110</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.hasResult(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-static-boolean-hasresult-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-static-boolean-hasresult-intent-intent</a><br/>
     *
     * @param param0 Intent sent by the activity
     * @return True if the intent contains an ActivityRecognitionResult, false otherwise or the given intent is null
     */
    public static boolean hasResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationResponse.containDataFromIntent(param0)");
            return com.huawei.hms.location.ActivityIdentificationResponse.containDataFromIntent(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityRecognitionResult.hasResult(param0)");
            return com.google.android.gms.location.ActivityRecognitionResult.hasResult(param0);
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityRecognitionResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted ActivityRecognitionResult object
     */
    public static org.xms.g.location.ActivityRecognitionResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityRecognitionResult) param0);
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityIdentificationResponse;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityRecognitionResult;
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.getActivityConfidence(int) Returns the confidence of the given activity type.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.getActivityPossibility(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section45000497546">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section45000497546</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.getActivityConfidence(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-int-getactivityconfidence-int-activitytype">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-int-getactivityconfidence-int-activitytype</a><br/>
     *
     * @param param0 Activity type
     * @return The confidence of the given activity type
     */
    public int getActivityConfidence(int param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getActivityPossibility(param0)");
                return ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getActivityPossibility(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getActivityConfidence(param0)");
                return ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getActivityConfidence(param0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getActivityPossibilityCallSuper(param0)");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getActivityPossibilityCallSuper(param0);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getActivityConfidenceCallSuper(param0)");
                return ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getActivityConfidenceCallSuper(param0);
            }
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.getElapsedRealtimeMillis() Returns the elapsed real time of this detection in milliseconds since boot, including time spent in sleep as obtained by SystemClock.elapsedRealtime().<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.getElapsedTimeFromReboot(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section5515317145716">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section5515317145716</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.getElapsedRealtimeMillis(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-long-getelapsedrealtimemillis">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-long-getelapsedrealtimemillis</a><br/>
     *
     * @return Timestamp, in nanoseconds
     */
    public long getElapsedRealtimeMillis() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getElapsedTimeFromReboot()");
                return ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getElapsedTimeFromReboot();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getElapsedRealtimeMillis()");
                return ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getElapsedRealtimeMillis();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getElapsedTimeFromRebootCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getElapsedTimeFromRebootCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getElapsedRealtimeMillisCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getElapsedRealtimeMillisCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.getMostProbableActivity() Returns the most probable activity of the user.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.getMostActivityIdentification(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section119119581881">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section119119581881</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.getMostProbableActivity(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-detectedactivity-getmostprobableactivity">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-detectedactivity-getmostprobableactivity</a><br/>
     *
     * @return The most probable activity of the user
     */
    public org.xms.g.location.DetectedActivity getMostProbableActivity() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getMostActivityIdentification()");
                com.huawei.hms.location.ActivityIdentificationData hReturn = ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getMostActivityIdentification();
                return ((hReturn) == null ? null : (new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getMostProbableActivity()");
                com.google.android.gms.location.DetectedActivity gReturn = ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getMostProbableActivity();
                return ((gReturn) == null ? null : (new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(gReturn, null))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getMostActivityIdentificationCallSuper()");
                com.huawei.hms.location.ActivityIdentificationData hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getMostActivityIdentificationCallSuper();
                return ((hReturn) == null ? null : (new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getMostProbableActivityCallSuper()");
                com.google.android.gms.location.DetectedActivity gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getMostProbableActivityCallSuper();
                return ((gReturn) == null ? null : (new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.getProbableActivities() Returns the list of activities that were detected with the confidence value associated with each activity. The activities are sorted by most probable activity first.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.getActivityIdentificationDatas(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section178201311108">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section178201311108</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.getProbableActivities(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-listdetectedactivity-getprobableactivities">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-listdetectedactivity-getprobableactivities</a><br/>
     *
     * @return The list of activities that were detected with the confidence value associated with each activity
     */
    public java.util.List<org.xms.g.location.DetectedActivity> getProbableActivities() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getActivityIdentificationDatas()");
                java.util.List hReturn = ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getActivityIdentificationDatas();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.ActivityIdentificationData, org.xms.g.location.DetectedActivity>() {

                    public org.xms.g.location.DetectedActivity apply(com.huawei.hms.location.ActivityIdentificationData param0) {
                        return new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(null, param0));
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getProbableActivities()");
                java.util.List gReturn = ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getProbableActivities();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.DetectedActivity, org.xms.g.location.DetectedActivity>() {

                    public org.xms.g.location.DetectedActivity apply(com.google.android.gms.location.DetectedActivity param0) {
                        return new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(param0, null));
                    }
                }));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getActivityIdentificationDatasCallSuper()");
                java.util.List hReturn = ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getActivityIdentificationDatasCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.location.ActivityIdentificationData, org.xms.g.location.DetectedActivity>() {

                    public org.xms.g.location.DetectedActivity apply(com.huawei.hms.location.ActivityIdentificationData param0) {
                        return new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(null, param0));
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getProbableActivitiesCallSuper()");
                java.util.List gReturn = ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getProbableActivitiesCallSuper();
                return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.location.DetectedActivity, org.xms.g.location.DetectedActivity>() {

                    public org.xms.g.location.DetectedActivity apply(com.google.android.gms.location.DetectedActivity param0) {
                        return new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(param0, null));
                    }
                }));
            }
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.getTime() Returns the UTC time of this detection, in milliseconds since January 1, 1970.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.getTime(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section33798408106">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationresponse-0000001051066108#EN-US_TOPIC_0000001051066108__section33798408106</a><br/>
     * com.google.android.gms.location.ActivityRecognitionResult.getTime(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-long-gettime">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-long-gettime</a><br/>
     *
     * @return Timestamp, in milliseconds
     */
    public long getTime() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getTime()");
                return ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).getTime();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getTime()");
                return ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).getTime();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getTimeCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).getTimeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getTimeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).getTimeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.toString()
     * com.google.android.gms.location.ActivityRecognitionResult.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-string-tostring</a><br/>
     *
     * @return A character string after being converted
     */
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).toString()");
                return ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).toString()");
                return ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).toStringCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.ActivityRecognitionResult.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationResponse.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.ActivityRecognitionResult.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognitionResult#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityIdentificationResponse) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.ActivityRecognitionResult) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }

    private class GImpl extends com.google.android.gms.location.ActivityRecognitionResult {

        public GImpl(java.util.List<com.google.android.gms.location.DetectedActivity> param0, long param1, long param2) {
            super(param0, param1, param2);
        }

        public GImpl(com.google.android.gms.location.DetectedActivity param0, long param1, long param2) {
            super(param0, param1, param2);
        }

        public int getActivityConfidence(int param0) {
            return org.xms.g.location.ActivityRecognitionResult.this.getActivityConfidence(param0);
        }

        public long getElapsedRealtimeMillis() {
            return org.xms.g.location.ActivityRecognitionResult.this.getElapsedRealtimeMillis();
        }

        public com.google.android.gms.location.DetectedActivity getMostProbableActivity() {
            org.xms.g.location.DetectedActivity xResult = org.xms.g.location.ActivityRecognitionResult.this.getMostProbableActivity();
            return ((com.google.android.gms.location.DetectedActivity) ((xResult) == null ? null : (xResult.getGInstance())));
        }

        public java.util.List<com.google.android.gms.location.DetectedActivity> getProbableActivities() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.location.ActivityRecognitionResult.this.getProbableActivities(), false));
        }

        public long getTime() {
            return org.xms.g.location.ActivityRecognitionResult.this.getTime();
        }

        public java.lang.String toString() {
            return org.xms.g.location.ActivityRecognitionResult.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityRecognitionResult.this.writeToParcel(param0, param1);
        }

        public int getActivityConfidenceCallSuper(int param0) {
            return super.getActivityConfidence(param0);
        }

        public long getElapsedRealtimeMillisCallSuper() {
            return super.getElapsedRealtimeMillis();
        }

        public com.google.android.gms.location.DetectedActivity getMostProbableActivityCallSuper() {
            return super.getMostProbableActivity();
        }

        public java.util.List<com.google.android.gms.location.DetectedActivity> getProbableActivitiesCallSuper() {
            return super.getProbableActivities();
        }

        public long getTimeCallSuper() {
            return super.getTime();
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }

    private class HImpl extends com.huawei.hms.location.ActivityIdentificationResponse {

        public HImpl() {
            super();
        }

        public HImpl(java.util.List<com.huawei.hms.location.ActivityIdentificationData> param0, long param1, long param2) {
            super(param0, param1, param2);
        }

        public HImpl(com.huawei.hms.location.ActivityIdentificationData param0, long param1, long param2) {
            super(param0, param1, param2);
        }

        public int getActivityPossibility(int param0) {
            return org.xms.g.location.ActivityRecognitionResult.this.getActivityConfidence(param0);
        }

        public long getElapsedTimeFromReboot() {
            return org.xms.g.location.ActivityRecognitionResult.this.getElapsedRealtimeMillis();
        }

        public com.huawei.hms.location.ActivityIdentificationData getMostActivityIdentification() {
            org.xms.g.location.DetectedActivity xResult = org.xms.g.location.ActivityRecognitionResult.this.getMostProbableActivity();
            return ((com.huawei.hms.location.ActivityIdentificationData) ((xResult) == null ? null : (xResult.getHInstance())));
        }

        public java.util.List<com.huawei.hms.location.ActivityIdentificationData> getActivityIdentificationDatas() {
            return ((java.util.List) org.xms.g.utils.Utils.mapList2GH(org.xms.g.location.ActivityRecognitionResult.this.getProbableActivities(), true));
        }

        public long getTime() {
            return org.xms.g.location.ActivityRecognitionResult.this.getTime();
        }

        public java.lang.String toString() {
            return org.xms.g.location.ActivityRecognitionResult.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.ActivityRecognitionResult.this.writeToParcel(param0, param1);
        }

        public int getActivityPossibilityCallSuper(int param0) {
            return super.getActivityPossibility(param0);
        }

        public long getElapsedTimeFromRebootCallSuper() {
            return super.getElapsedTimeFromReboot();
        }

        public com.huawei.hms.location.ActivityIdentificationData getMostActivityIdentificationCallSuper() {
            return super.getMostActivityIdentification();
        }

        public java.util.List<com.huawei.hms.location.ActivityIdentificationData> getActivityIdentificationDatasCallSuper() {
            return super.getActivityIdentificationDatas();
        }

        public long getTimeCallSuper() {
            return super.getTime();
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }
}