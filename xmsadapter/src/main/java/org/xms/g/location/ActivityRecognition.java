package org.xms.g.location;

/**
 * The main entry point for activity recognition integration.<br/>
 * Combination of com.huawei.hms.location.ActivityIdentification and com.google.android.gms.location.ActivityRecognition.<br/>
 * com.huawei.hms.location.ActivityIdentification: Entry for calling activity identification, which is used to obtain the ActivityIdentificationService instance.<br/>
 * com.google.android.gms.location.ActivityRecognition: The main entry point for activity recognition integration.<br/>
 */
public class ActivityRecognition extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.location.ActivityRecognition.ActivityRecognition(org.xms.g.utils.XBox) Constructor of ActivityRecognition with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 The wrapper of xms instance
     */
    public ActivityRecognition(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.ActivityRecognition.getCLIENT_NAME() Return the value of CLIENT_NAME.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognition.CLIENT_NAME: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-final-string-client_name">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-final-string-client_name</a><br/>
     *
     * @return Constant Value:"activity_recognition"
     */
    public static java.lang.String getCLIENT_NAME() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.ActivityRecognition.getAPI() Return the token that pass to addApi(Api) to enable ContextServices.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognition.API: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-final-apiapi.apioptions.nooptions-api">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-final-apiapi.apioptions.nooptions-api</a><br/>
     *
     * @return Token to pass to addApi(Api) to enable ContextServices
     */
    public static org.xms.g.common.api.Api getAPI() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.ActivityRecognition.getActivityRecognitionApi() Return the entry point to the activity recognition APIs.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.ActivityRecognition.ActivityRecognitionApi: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-final-activityrecognitionapi-activityrecognitionapi">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-final-activityrecognitionapi-activityrecognitionapi</a><br/>
     *
     * @return Entry point to the activity recognition APIs
     */
    public static org.xms.g.location.ActivityRecognitionApi getActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.ActivityRecognition.getClient(android.app.Activity) Create a new instance of Client for use in an Activity.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentification.getService(android.app.Activity): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentification-0000001050746167#EN-US_TOPIC_0000001050746167__section1120013264461">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentification-0000001050746167#EN-US_TOPIC_0000001050746167__section1120013264461</a><br/>
     * com.google.android.gms.location.ActivityRecognition.getClient(android.app.Activity): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-activityrecognitionclient-getclient-activity-activity">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-activityrecognitionclient-getclient-activity-activity</a><br/>
     *
     * @param param0 A specific Activity
     * @return ActivityRecognitionClient instance obtained based on Activity
     */
    public static org.xms.g.location.ActivityRecognitionClient getClient(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentification.getService(param0)");
            com.huawei.hms.location.ActivityIdentificationService hReturn = com.huawei.hms.location.ActivityIdentification.getService(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityRecognition.getClient(param0)");
            com.google.android.gms.location.ActivityRecognitionClient gReturn = com.google.android.gms.location.ActivityRecognition.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.ActivityRecognition.getClient(android.content.Context) Create a new instance of ActivityRecognitionClient for use in a non-activity Context.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentification.getService(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentification-0000001050746167#EN-US_TOPIC_0000001050746167__section146052044204717">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentification-0000001050746167#EN-US_TOPIC_0000001050746167__section146052044204717</a><br/>
     * com.google.android.gms.location.ActivityRecognition.getClient(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-activityrecognitionclient-getclient-context-context">https://developers.google.com/android/reference/com/google/android/gms/location/ActivityRecognition#public-static-activityrecognitionclient-getclient-context-context</a><br/>
     *
     * @param param0 Context instance
     * @return ActivityRecognitionClient instance obtained based on Context
     */
    public static org.xms.g.location.ActivityRecognitionClient getClient(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentification.getService(param0)");
            com.huawei.hms.location.ActivityIdentificationService hReturn = com.huawei.hms.location.ActivityIdentification.getService(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionClient(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.ActivityRecognition.getClient(param0)");
            com.google.android.gms.location.ActivityRecognitionClient gReturn = com.google.android.gms.location.ActivityRecognition.getClient(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.ActivityRecognitionClient(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.ActivityRecognition.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityRecognition.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return casted ActivityRecognition object
     */
    public static org.xms.g.location.ActivityRecognition dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.ActivityRecognition) param0);
    }

    /**
     * org.xms.g.location.ActivityRecognition.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityIdentification;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.ActivityRecognition;
        }
    }
}