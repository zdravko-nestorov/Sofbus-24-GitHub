package org.xms.f.analytics;


/**
 * The top level Analytics singleton that provides methods for logging events and setting user properties.<br/>
 * Combination of com.huawei.hms.analytics.HiAnalyticsInstance and com.google.firebase.analytics.FirebaseAnalytics.<br/>
 * com.huawei.hms.analytics.HiAnalyticsInstance: Provides public methods to report user behavior data. This class uses the singleton pattern./Obtains an Analytics Kit instance with the given context.<br/>
 * com.google.firebase.analytics.FirebaseAnalytics: The top level Firebase Analytics singleton that provides methods for logging events and setting user properties.<br/>
 */
public final class ExtensionAnalytics extends org.xms.g.utils.XObject {


    /**
     * org.xms.f.analytics.ExtensionAnalytics.ExtensionAnalytics(org.xms.g.utils.XBox) constructor of ExtensionAnalytics with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionAnalytics(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.getInstance(android.content.Context) Returns the singleton FirebaseAnalytics interface.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalytics.getInstance(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-0000001050707170-V5#EN-US_TOPIC_0000001050707170__section209812717321">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-0000001050707170-V5#EN-US_TOPIC_0000001050707170__section209812717321</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.getInstance(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-static-firebaseanalytics-getinstance-context-context">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-static-firebaseanalytics-getinstance-context-context</a><br/>
     *
     * @param param0 the context used to initialize Firebase Analytics. Must not be null
     * @return the singleton
     */
    public static org.xms.f.analytics.ExtensionAnalytics getInstance(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.HiAnalytics.getInstance(param0)");
            com.huawei.hms.analytics.HiAnalyticsInstance hReturn = com.huawei.hms.analytics.HiAnalytics.getInstance(param0);
            return ((hReturn) == null ? null : (new org.xms.f.analytics.ExtensionAnalytics(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.getInstance(param0)");
            com.google.firebase.analytics.FirebaseAnalytics gReturn = com.google.firebase.analytics.FirebaseAnalytics.getInstance(param0);
            return ((gReturn) == null ? null : (new org.xms.f.analytics.ExtensionAnalytics(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.analytics.ExtensionAnalytics.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionAnalytics object
     */
    public static org.xms.f.analytics.ExtensionAnalytics dynamicCast(java.lang.Object param0) {
        return ((org.xms.f.analytics.ExtensionAnalytics) param0);
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.analytics.HiAnalyticsInstance;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.analytics.FirebaseAnalytics;
        }
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.getAppInstanceId() Retrieves the app instance id from the service.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalyticsInstance.getAAID(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section124931637174316">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section124931637174316</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.getAppInstanceId(): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-taskstring-getappinstanceid">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-taskstring-getappinstanceid</a><br/>
     *
     * @return Task with the result of the retrieval
     */
    public org.xms.g.tasks.Task<java.lang.String> getAppInstanceId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).getAAID()");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).getAAID();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).getAppInstanceId()");
            com.google.android.gms.tasks.Task gReturn = ((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).getAppInstanceId();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.logEvent(java.lang.String,android.os.Bundle) Logs an app event.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalyticsInstance.onEvent(java.lang.String,android.os.Bundle): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section15204518184114">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section15204518184114</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.logEvent(java.lang.String,android.os.Bundle): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-logevent-string-name,-bundle-params">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-logevent-string-name,-bundle-params</a><br/>
     *
     * @param param0 The name of the event. Should contain 1 to 40 alphanumeric characters or underscores
     * @param param1 The map of event parameters. Passing null indicates that the event has no parameters
     */
    public final void logEvent(java.lang.String param0, android.os.Bundle param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).onEvent(param0, param1)");
            ((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).onEvent(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).logEvent(param0, param1)");
            ((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).logEvent(param0, param1);
        }
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.resetAnalyticsData() Clears all analytics data for this app from the device and resets the app instance id.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalyticsInstance.clearCachedData(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section7238134312">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section7238134312</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.resetAnalyticsData(): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-resetanalyticsdata">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-resetanalyticsdata</a><br/>
     */
    public final void resetAnalyticsData() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).clearCachedData()");
            ((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).clearCachedData();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).resetAnalyticsData()");
            ((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).resetAnalyticsData();
        }
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.setAnalyticsCollectionEnabled(boolean) Sets whether analytics collection is enabled for this app on this device. This setting is persisted across app sessions. By default it is enabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalyticsInstance.setAnalyticsEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section113486277512">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section113486277512</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.setAnalyticsCollectionEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-setanalyticscollectionenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-setanalyticscollectionenabled-boolean-enabled</a><br/>
     *
     * @param param0 Whether analytics collection is enabled for this app on this device
     */
    public final void setAnalyticsCollectionEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).setAnalyticsEnabled(param0)");
            ((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).setAnalyticsEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setAnalyticsCollectionEnabled(param0)");
            ((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setAnalyticsCollectionEnabled(param0);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void setConsent(java.util.Map<org.xms.f.analytics.ExtensionAnalytics.ConsentType, org.xms.f.analytics.ExtensionAnalytics.ConsentStatus> param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void setCurrentScreen(android.app.Activity param0, java.lang.String param1, java.lang.String param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.setDefaultEventParameters(android.os.Bundle) Adds parameters that will be set on every event logged from the SDK, including automatic ones. The values passed in the parameters bundle will be added to the map of default event parameters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalyticsInstance.addDefaultEventParams(android.os.Bundle): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001054744573__section1740315510397">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001054744573__section1740315510397</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.setDefaultEventParameters(android.os.Bundle): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics?hl=en#public-void-setdefaulteventparameters-bundle-parameters">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics?hl=en#public-void-setdefaulteventparameters-bundle-parameters</a><br/>
     *
     * @param param0 Default event parameters
     */
    public final void setDefaultEventParameters(android.os.Bundle param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).addDefaultEventParams(param0)");
            ((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).addDefaultEventParams(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setDefaultEventParameters(param0)");
            ((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setDefaultEventParameters(param0);
        }
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.setSessionTimeoutDuration(long) Sets the duration of inactivity that terminates the current session. The default value is 1800000 (30 minutes).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalyticsInstance.setSessionDuration(long): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section347035614364">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section347035614364</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.setSessionTimeoutDuration(long): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-setsessiontimeoutduration-long-milliseconds">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-setsessiontimeoutduration-long-milliseconds</a><br/>
     *
     * @param param0 Session timeout duration in milliseconds
     */
    public final void setSessionTimeoutDuration(long param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).setSessionDuration(param0)");
            ((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).setSessionDuration(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setSessionTimeoutDuration(param0)");
            ((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setSessionTimeoutDuration(param0);
        }
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.setUserId(java.lang.String) Sets the user ID property.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalyticsInstance.setUserId(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section11961041191220">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section11961041191220</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.setUserId(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-setuserid-string-id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-setuserid-string-id</a><br/>
     *
     * @param param0 The user ID to ascribe to the user of this app on this device, which must be non-empty and no more than 256 characters long. Setting the ID to null removes the user ID
     */
    public final void setUserId(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).setUserId(param0)");
            ((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).setUserId(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setUserId(param0)");
            ((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setUserId(param0);
        }
    }

    /**
     * org.xms.f.analytics.ExtensionAnalytics.setUserProperty(java.lang.String,java.lang.String) Sets a user property to a given value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.analytics.HiAnalyticsInstance.setUserProfile(java.lang.String,java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section096353619188">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-hianalytics-instance-0000001050987219-V5#EN-US_TOPIC_0000001050987219__section096353619188</a><br/>
     * com.google.firebase.analytics.FirebaseAnalytics.setUserProperty(java.lang.String,java.lang.String): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-setuserproperty-string-name,-string-value">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics#public-void-setuserproperty-string-name,-string-value</a><br/>
     *
     * @param param0 The name of the user property to set. Should contain 1 to 24 alphanumeric characters or underscores and must start with an alphabetic character
     * @param param1 The value of the user property. Values can be up to 36 characters long. Setting the value to null removes the user property
     */
    public final void setUserProperty(java.lang.String param0, java.lang.String param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).setUserProfile(param0, param1)");
            ((com.huawei.hms.analytics.HiAnalyticsInstance) this.getHInstance()).setUserProfile(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setUserProperty(param0, param1)");
            ((com.google.firebase.analytics.FirebaseAnalytics) this.getGInstance()).setUserProperty(param0, param1);
        }
    }

    public static class ConsentStatus extends org.xms.g.utils.XObject {

        public ConsentStatus(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        public static ExtensionAnalytics.ConsentStatus getDENIED() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static ExtensionAnalytics.ConsentStatus getGRANTED() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static org.xms.f.analytics.ExtensionAnalytics.ConsentStatus dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    public static class ConsentType extends org.xms.g.utils.XObject {

        public ConsentType(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        public static ExtensionAnalytics.ConsentType getAD_STORAGE() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static ExtensionAnalytics.ConsentType getANALYTICS_STORAGE() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static org.xms.f.analytics.ExtensionAnalytics.ConsentType dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * An Event is an important occurrence in your app that you want to measure.<br/>
     * Combination of com.huawei.hms.analytics.type.HAEventType and com.google.firebase.analytics.FirebaseAnalytics.Event.<br/>
     * com.huawei.hms.analytics.type.HAEventType: Provides the ID constants of all predefined events.<br/>
     * com.google.firebase.analytics.FirebaseAnalytics.Event: An Event is an important occurrence in your app that you want to measure.<br/>
     */
    public static class Event extends org.xms.g.utils.XObject {

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.Event(org.xms.g.utils.XBox) constructor of Event with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Event(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.Event() constructor of Event.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.Event(): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#protected-firebaseanalytics.event">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#protected-firebaseanalytics.event</a><br/>
         */
        protected Event() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getADD_PAYMENT_INFO() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.CREATEPAYMENTINFO: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_PAYMENT_INFO: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-add_payment_info">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-add_payment_info</a><br/>
         *
         * @return Constant Value.Add Payment Info event. This event signifies that a user has submitted their payment information
         */
        public static java.lang.String getADD_PAYMENT_INFO() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.CREATEPAYMENTINFO");
                return com.huawei.hms.analytics.type.HAEventType.CREATEPAYMENTINFO;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_PAYMENT_INFO");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_PAYMENT_INFO;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getADD_TO_CART() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.ADDPRODUCT2CART: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_CART: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-add_to_cart">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-add_to_cart</a><br/>
         *
         * @return Constant Value.E-Commerce Add To Cart event
         */
        public static java.lang.String getADD_TO_CART() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.ADDPRODUCT2CART");
                return com.huawei.hms.analytics.type.HAEventType.ADDPRODUCT2CART;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_CART");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_CART;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getADD_TO_WISHLIST() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.ADDPRODUCT2WISHLIST: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_WISHLIST: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-add_to_wishlist">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-add_to_wishlist</a><br/>
         *
         * @return Constant Value.E-Commerce Add To Wishlist event
         */
        public static java.lang.String getADD_TO_WISHLIST() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.ADDPRODUCT2WISHLIST");
                return com.huawei.hms.analytics.type.HAEventType.ADDPRODUCT2WISHLIST;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_WISHLIST");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_TO_WISHLIST;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getAPP_OPEN() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.STARTAPP: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.APP_OPEN: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-app_open">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-app_open</a><br/>
         *
         * @return Constant Value App Open event
         */
        public static java.lang.String getAPP_OPEN() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.STARTAPP");
                return com.huawei.hms.analytics.type.HAEventType.STARTAPP;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.APP_OPEN");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.APP_OPEN;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getBEGIN_CHECKOUT() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.STARTCHECKOUT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.BEGIN_CHECKOUT: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-begin_checkout">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-begin_checkout</a><br/>
         *
         * @return Constant Value.E-Commerce Begin Checkout event
         */
        public static java.lang.String getBEGIN_CHECKOUT() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.STARTCHECKOUT");
                return com.huawei.hms.analytics.type.HAEventType.STARTCHECKOUT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.BEGIN_CHECKOUT");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.BEGIN_CHECKOUT;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getCAMPAIGN_DETAILS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.VIEWCAMPAIGN: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.CAMPAIGN_DETAILS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-campaign_details">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-campaign_details</a><br/>
         *
         * @return Constant Value.Log this event to supply the referral details of a re-engagement campaign
         */
        public static java.lang.String getCAMPAIGN_DETAILS() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.VIEWCAMPAIGN");
                return com.huawei.hms.analytics.type.HAEventType.VIEWCAMPAIGN;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.CAMPAIGN_DETAILS");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.CAMPAIGN_DETAILS;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getCHECKOUT_PROGRESS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.VIEWCHECKOUTSTEP: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.CHECKOUT_PROGRESS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-checkout_progress">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-checkout_progress</a><br/>
         *
         * @return Constant Value
         */
        public static java.lang.String getCHECKOUT_PROGRESS() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.VIEWCHECKOUTSTEP");
                return com.huawei.hms.analytics.type.HAEventType.VIEWCHECKOUTSTEP;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.CHECKOUT_PROGRESS");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.CHECKOUT_PROGRESS;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getEARN_VIRTUAL_CURRENCY() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.WINVIRTUALCOIN: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.EARN_VIRTUAL_CURRENCY: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-earn_virtual_currency">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-earn_virtual_currency</a><br/>
         *
         * @return Constant Value.Earn Virtual Currency event
         */
        public static java.lang.String getEARN_VIRTUAL_CURRENCY() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.WINVIRTUALCOIN");
                return com.huawei.hms.analytics.type.HAEventType.WINVIRTUALCOIN;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.EARN_VIRTUAL_CURRENCY");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.EARN_VIRTUAL_CURRENCY;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getECOMMERCE_PURCHASE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.COMPLETEPURCHASE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.ECOMMERCE_PURCHASE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-ecommerce_purchase">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-ecommerce_purchase</a><br/>
         *
         * @return Constant Value.E-Commerce Purchase event
         */
        public static java.lang.String getECOMMERCE_PURCHASE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.COMPLETEPURCHASE");
                return com.huawei.hms.analytics.type.HAEventType.COMPLETEPURCHASE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.ECOMMERCE_PURCHASE");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.ECOMMERCE_PURCHASE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getGENERATE_LEAD() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.OBTAINLEADS: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.GENERATE_LEAD: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-generate_lead">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-generate_lead</a><br/>
         *
         * @return Constant Value.Generate Lead event
         */
        public static java.lang.String getGENERATE_LEAD() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.OBTAINLEADS");
                return com.huawei.hms.analytics.type.HAEventType.OBTAINLEADS;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.GENERATE_LEAD");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.GENERATE_LEAD;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getJOIN_GROUP() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.JOINUSERGROUP: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.JOIN_GROUP: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-join_group">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-join_group</a><br/>
         *
         * @return Constant Value.Join Group event
         */
        public static java.lang.String getJOIN_GROUP() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.JOINUSERGROUP");
                return com.huawei.hms.analytics.type.HAEventType.JOINUSERGROUP;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.JOIN_GROUP");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.JOIN_GROUP;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getLEVEL_END() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.COMPLETELEVEL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_END: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-level_end">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-level_end</a><br/>
         *
         * @return Constant Value.Level End event
         */
        public static java.lang.String getLEVEL_END() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.COMPLETELEVEL");
                return com.huawei.hms.analytics.type.HAEventType.COMPLETELEVEL;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_END");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_END;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getLEVEL_START() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.STARTLEVEL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_START: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-level_start">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-level_start</a><br/>
         *
         * @return Constant Value.Level Start event
         */
        public static java.lang.String getLEVEL_START() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.STARTLEVEL");
                return com.huawei.hms.analytics.type.HAEventType.STARTLEVEL;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_START");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_START;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getLEVEL_UP() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.UPGRADELEVEL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_UP: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-level_up">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-level_up</a><br/>
         *
         * @return Constant Value.Level Up event
         */
        public static java.lang.String getLEVEL_UP() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.UPGRADELEVEL");
                return com.huawei.hms.analytics.type.HAEventType.UPGRADELEVEL;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_UP");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.LEVEL_UP;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getLOGIN() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.SIGNIN: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-login">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-login</a><br/>
         *
         * @return Constant Value.Login event
         */
        public static java.lang.String getLOGIN() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.SIGNIN");
                return com.huawei.hms.analytics.type.HAEventType.SIGNIN;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getPOST_SCORE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.SUBMITSCORE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.POST_SCORE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-post_score">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-post_score</a><br/>
         *
         * @return Constant Value.Post Score event
         */
        public static java.lang.String getPOST_SCORE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.SUBMITSCORE");
                return com.huawei.hms.analytics.type.HAEventType.SUBMITSCORE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.POST_SCORE");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.POST_SCORE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getPRESENT_OFFER() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.CREATEORDER: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.PRESENT_OFFER: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-present_offer">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-present_offer</a><br/>
         *
         * @return Constant Value.Present Offer event
         */
        public static java.lang.String getPRESENT_OFFER() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.CREATEORDER");
                return com.huawei.hms.analytics.type.HAEventType.CREATEORDER;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.PRESENT_OFFER");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.PRESENT_OFFER;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getPURCHASE_REFUND() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.REFUNDORDER: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE_REFUND: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-purchase_refund">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-purchase_refund</a><br/>
         *
         * @return Constant Value.E-Commerce Purchase Refund event
         */
        public static java.lang.String getPURCHASE_REFUND() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.REFUNDORDER");
                return com.huawei.hms.analytics.type.HAEventType.REFUNDORDER;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE_REFUND");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE_REFUND;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getREMOVE_FROM_CART() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.DELPRODUCTFROMCART: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.REMOVE_FROM_CART: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-remove_from_cart">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-remove_from_cart</a><br/>
         *
         * @return Constant Value.E-Commerce Remove from Cart event
         */
        public static java.lang.String getREMOVE_FROM_CART() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.DELPRODUCTFROMCART");
                return com.huawei.hms.analytics.type.HAEventType.DELPRODUCTFROMCART;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.REMOVE_FROM_CART");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.REMOVE_FROM_CART;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getSEARCH() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.SEARCH: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-search">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-search</a><br/>
         *
         * @return Constant Value.Search event
         */
        public static java.lang.String getSEARCH() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.SEARCH");
                return com.huawei.hms.analytics.type.HAEventType.SEARCH;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getSELECT_CONTENT() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.VIEWCONTENT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_CONTENT: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-select_content">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-select_content</a><br/>
         *
         * @return Constant Value.Select Content event
         */
        public static java.lang.String getSELECT_CONTENT() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.VIEWCONTENT");
                return com.huawei.hms.analytics.type.HAEventType.VIEWCONTENT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_CONTENT");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_CONTENT;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getSET_CHECKOUT_OPTION() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.UPDATECHECKOUTOPTION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.SET_CHECKOUT_OPTION: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-set_checkout_option">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-set_checkout_option</a><br/>
         *
         * @return Constant Value.Set checkout option
         */
        public static java.lang.String getSET_CHECKOUT_OPTION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.UPDATECHECKOUTOPTION");
                return com.huawei.hms.analytics.type.HAEventType.UPDATECHECKOUTOPTION;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.SET_CHECKOUT_OPTION");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SET_CHECKOUT_OPTION;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getSHARE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.SHARECONTENT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.SHARE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-share">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-share</a><br/>
         *
         * @return Constant Value.Share event
         */
        public static java.lang.String getSHARE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.SHARECONTENT");
                return com.huawei.hms.analytics.type.HAEventType.SHARECONTENT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.SHARE");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SHARE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getSIGN_UP() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.REGISTERACCOUNT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.SIGN_UP: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-sign_up">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-sign_up</a><br/>
         *
         * @return Constant Value.Sign Up event
         */
        public static java.lang.String getSIGN_UP() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.REGISTERACCOUNT");
                return com.huawei.hms.analytics.type.HAEventType.REGISTERACCOUNT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.SIGN_UP");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SIGN_UP;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getSPEND_VIRTUAL_CURRENCY() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.CONSUMEVIRTUALCOIN: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.SPEND_VIRTUAL_CURRENCY: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-spend_virtual_currency">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-spend_virtual_currency</a><br/>
         *
         * @return Constant Value.Spend Virtual Currency event
         */
        public static java.lang.String getSPEND_VIRTUAL_CURRENCY() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.CONSUMEVIRTUALCOIN");
                return com.huawei.hms.analytics.type.HAEventType.CONSUMEVIRTUALCOIN;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.SPEND_VIRTUAL_CURRENCY");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.SPEND_VIRTUAL_CURRENCY;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getTUTORIAL_BEGIN() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.STARTTUTORIAL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.TUTORIAL_BEGIN: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-tutorial_begin">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-tutorial_begin</a><br/>
         *
         * @return Constant Value.Tutorial Begin event
         */
        public static java.lang.String getTUTORIAL_BEGIN() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.STARTTUTORIAL");
                return com.huawei.hms.analytics.type.HAEventType.STARTTUTORIAL;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.TUTORIAL_BEGIN");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.TUTORIAL_BEGIN;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getTUTORIAL_COMPLETE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.COMPLETETUTORIAL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.TUTORIAL_COMPLETE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-tutorial_complete">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-tutorial_complete</a><br/>
         *
         * @return Constant Value.Tutorial End event
         */
        public static java.lang.String getTUTORIAL_COMPLETE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.COMPLETETUTORIAL");
                return com.huawei.hms.analytics.type.HAEventType.COMPLETETUTORIAL;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.TUTORIAL_COMPLETE");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.TUTORIAL_COMPLETE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getUNLOCK_ACHIEVEMENT() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.OBTAINACHIEVEMENT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.UNLOCK_ACHIEVEMENT: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-unlock_achievement">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-unlock_achievement</a><br/>
         *
         * @return Constant Value.Unlock Achievement event
         */
        public static java.lang.String getUNLOCK_ACHIEVEMENT() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.OBTAINACHIEVEMENT");
                return com.huawei.hms.analytics.type.HAEventType.OBTAINACHIEVEMENT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.UNLOCK_ACHIEVEMENT");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.UNLOCK_ACHIEVEMENT;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getVIEW_ITEM() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.VIEWPRODUCT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_item">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_item</a><br/>
         *
         * @return Constant Value.View Item event
         */
        public static java.lang.String getVIEW_ITEM() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.VIEWPRODUCT");
                return com.huawei.hms.analytics.type.HAEventType.VIEWPRODUCT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getVIEW_ITEM_LIST() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.VIEWPRODUCTLIST: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM_LIST: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_item_list">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_item_list</a><br/>
         *
         * @return Constant Value.View Item List event
         */
        public static java.lang.String getVIEW_ITEM_LIST() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.VIEWPRODUCTLIST");
                return com.huawei.hms.analytics.type.HAEventType.VIEWPRODUCTLIST;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM_LIST");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_ITEM_LIST;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getVIEW_SEARCH_RESULTS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAEventType.VIEWSEARCHRESULT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section471591317439</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_search_results">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_search_results</a><br/>
         *
         * @return Constant Value.View Search Results event
         */
        public static java.lang.String getVIEW_SEARCH_RESULTS() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAEventType.VIEWSEARCHRESULT");
                return com.huawei.hms.analytics.type.HAEventType.VIEWSEARCHRESULT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS");
                return com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getADD_SHIPPING_INFO() Add Shipping Info event. This event signifies that a user has submitted their shipping information.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.ADD_SHIPPING_INFO: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-add_shipping_info">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-add_shipping_info</a><br/>
         *
         * @return Constant Value: "add_shipping_info"
         */
        public static java.lang.String getADD_SHIPPING_INFO() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getPURCHASE() E-Commerce Purchase event. This event signifies that an item(s) was purchased by a user.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.PURCHASE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-purchase">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-purchase</a><br/>
         *
         * @return Constant Value: "purchase"
         */
        public static java.lang.String getPURCHASE() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getREFUND() E-Commerce Refund event. This event signifies that a refund was issued.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.REFUND: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-refund">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-refund</a><br/>
         *
         * @return Constant Value: "refund"
         */
        public static java.lang.String getREFUND() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getSELECT_ITEM() Select Item event. This event signifies that an item was selected by a user from a list.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_ITEM: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-select_item">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-select_item</a><br/>
         *
         * @return Constant Value: "select_item"
         */
        public static java.lang.String getSELECT_ITEM() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getSELECT_PROMOTION() Select promotion event. This event signifies that a user has selected a promotion offer.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.SELECT_PROMOTION: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-select_promotion">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-select_promotion</a><br/>
         *
         * @return Constant Value: "select_promotion"
         */
        public static java.lang.String getSELECT_PROMOTION() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getVIEW_CART() E-commerce View Cart event. This event signifies that a user has viewed their cart.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_CART: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_cart">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_cart</a><br/>
         *
         * @return Constant Value: "view_cart"
         */
        public static java.lang.String getVIEW_CART() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.getVIEW_PROMOTION() View Promotion event. This event signifies that a promotion was shown to a user.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Event.VIEW_PROMOTION: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_promotion">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Event#public-static-final-string-view_promotion</a><br/>
         *
         * @return Constant Value: "view_promotion"
         */
        public static java.lang.String getVIEW_PROMOTION() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static java.lang.String getAD_IMPRESSION() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static java.lang.String getSCREEN_VIEW() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.analytics.ExtensionAnalytics.Event.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted ExtensionAnalytics.Event object
         */
        public static org.xms.f.analytics.ExtensionAnalytics.Event dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.analytics.ExtensionAnalytics.Event) param0);
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Event.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.analytics.type.HAEventType;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.analytics.FirebaseAnalytics.Event;
            }
        }
    }

    /**
     * Params supply information that contextualize Events.<br/>
     * Combination of com.huawei.hms.analytics.type.HAParamType and com.google.firebase.analytics.FirebaseAnalytics.Param.<br/>
     * com.huawei.hms.analytics.type.HAParamType: Provides the IDs of all predefined parameters, including the ID constants of predefined parameters and user attributes.<br/>
     * com.google.firebase.analytics.FirebaseAnalytics.Param: Params supply information that contextualize Events.<br/>
     */
    public static class Param extends org.xms.g.utils.XObject {

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.Param(org.xms.g.utils.XBox) constructor of Param with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Param(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.Param() constructor of Param.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.Param(): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#protected-firebaseanalytics.param">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#protected-firebaseanalytics.param</a><br/>
         */
        protected Param() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getACHIEVEMENT_ID() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.ACHIEVEMENTID: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ACHIEVEMENT_ID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-achievement_id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-achievement_id</a><br/>
         *
         * @return Constant Value.Game achievement ID (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getACHIEVEMENT_ID() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.ACHIEVEMENTID");
                return com.huawei.hms.analytics.type.HAParamType.ACHIEVEMENTID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ACHIEVEMENT_ID");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ACHIEVEMENT_ID;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getACLID() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CLICKID: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-aclid">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-aclid</a><br/>
         *
         * @return Constant Value.CAMPAIGN_DETAILS click ID
         */
        public static java.lang.String getACLID() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CLICKID");
                return com.huawei.hms.analytics.type.HAParamType.CLICKID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ACLID;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getAFFILIATION() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.STORENAME: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.AFFILIATION: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-affiliation">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-affiliation</a><br/>
         *
         * @return Constant Value.A product affiliation to designate a supplying company or brick and mortar store location (String). The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getAFFILIATION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.STORENAME");
                return com.huawei.hms.analytics.type.HAParamType.STORENAME;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.AFFILIATION");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.AFFILIATION;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCAMPAIGN() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.PROMOTIONNAME: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-campaign">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-campaign</a><br/>
         *
         * @return Constant Value.CAMPAIGN_DETAILS name; used for keyword analysis to identify a specific product promotion or strategic campaign
         */
        public static java.lang.String getCAMPAIGN() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PROMOTIONNAME");
                return com.huawei.hms.analytics.type.HAParamType.PROMOTIONNAME;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CAMPAIGN;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCHARACTER() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.ROLENAME: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CHARACTER: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-character">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-character</a><br/>
         *
         * @return Constant Value.Character used in game (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getCHARACTER() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.ROLENAME");
                return com.huawei.hms.analytics.type.HAParamType.ROLENAME;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CHARACTER");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CHARACTER;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCHECKOUT_OPTION() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.OPTION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_OPTION: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-checkout_option">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-checkout_option</a><br/>
         *
         * @return Constant Value.Some option on a step in an ecommerce flow
         */
        public static java.lang.String getCHECKOUT_OPTION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.OPTION");
                return com.huawei.hms.analytics.type.HAParamType.OPTION;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_OPTION");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_OPTION;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCHECKOUT_STEP() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.STEP: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_STEP: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-checkout_step">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-checkout_step</a><br/>
         *
         * @return Constant Value.The checkout step (1..N)
         */
        public static java.lang.String getCHECKOUT_STEP() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.STEP");
                return com.huawei.hms.analytics.type.HAParamType.STEP;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_STEP");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CHECKOUT_STEP;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCONTENT() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CONTENT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-content">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-content</a><br/>
         *
         * @return Constant Value.CAMPAIGN_DETAILS content; used for A/B testing and content-targeted ads to differentiate ads or links that point to the same URL
         */
        public static java.lang.String getCONTENT() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CONTENT");
                return com.huawei.hms.analytics.type.HAParamType.CONTENT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCONTENT_TYPE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CONTENTTYPE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-content_type">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-content_type</a><br/>
         *
         * @return Constant Value.Type of content selected (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getCONTENT_TYPE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CONTENTTYPE");
                return com.huawei.hms.analytics.type.HAParamType.CONTENTTYPE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT_TYPE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCOUPON() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.VOUCHER: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.COUPON: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-coupon">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-coupon</a><br/>
         *
         * @return Constant Value.Coupon code used for a purchase (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getCOUPON() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.VOUCHER");
                return com.huawei.hms.analytics.type.HAParamType.VOUCHER;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.COUPON");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.COUPON;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCP1() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.EXTENDPARAM: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CP1: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-cp1">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-cp1</a><br/>
         *
         * @return Constant Value.CAMPAIGN_DETAILS custom parameter
         */
        public static java.lang.String getCP1() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.EXTENDPARAM");
                return com.huawei.hms.analytics.type.HAParamType.EXTENDPARAM;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CP1");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CP1;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCREATIVE_NAME() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.MATERIALNAME: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_NAME: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-creative_name">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-creative_name</a><br/>
         *
         * @return Constant Value.The name of a creative used in a promotional spot (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getCREATIVE_NAME() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.MATERIALNAME");
                return com.huawei.hms.analytics.type.HAParamType.MATERIALNAME;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_NAME");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_NAME;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCREATIVE_SLOT() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.MATERIALSLOT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_SLOT: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-creative_slot">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-creative_slot</a><br/>
         *
         * @return Constant Value.The name of a creative slot (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getCREATIVE_SLOT() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.MATERIALSLOT");
                return com.huawei.hms.analytics.type.HAParamType.MATERIALSLOT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_SLOT");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CREATIVE_SLOT;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getCURRENCY() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CURRNAME: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-currency">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-currency</a><br/>
         *
         * @return Constant Value.Currency of the purchase or items associated with the event, in 3-letter ISO_4217 format (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getCURRENCY() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CURRNAME");
                return com.huawei.hms.analytics.type.HAParamType.CURRNAME;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.CURRENCY;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getDESTINATION() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.DESTINATION: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-destination">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-destination</a><br/>
         *
         * @return Constant Value.Flight or Travel destination (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getDESTINATION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.DESTINATION");
                return com.huawei.hms.analytics.type.HAParamType.DESTINATION;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getEND_DATE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.ENDDATE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.END_DATE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-end_date">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-end_date</a><br/>
         *
         * @return Constant Value.The arrival date, check-out date, or rental end date for the item (String).The parameter expects a date formatted as YYYY-MM-DD and set with putString(String, String)
         */
        public static java.lang.String getEND_DATE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.ENDDATE");
                return com.huawei.hms.analytics.type.HAParamType.ENDDATE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.END_DATE");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.END_DATE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getEXTEND_SESSION() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.EXTEND_SESSION: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-extend_session">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-extend_session</a><br/>
         *
         * @return Constant Value.Indicates that the associated event should either extend the current session or start a new session if no session was active when the event was logged. Specify 1 to extend the current session or to start a new session; any other long value will not extend or start a session
         */
        public static java.lang.String getEXTEND_SESSION() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getFLIGHT_NUMBER() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.FLIGHTNO: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.FLIGHT_NUMBER: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-flight_number">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-flight_number</a><br/>
         *
         * @return Constant Value.Flight number for travel events (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getFLIGHT_NUMBER() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.FLIGHTNO");
                return com.huawei.hms.analytics.type.HAParamType.FLIGHTNO;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.FLIGHT_NUMBER");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.FLIGHT_NUMBER;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getGROUP_ID() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.USERGROUPID: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.GROUP_ID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-group_id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-group_id</a><br/>
         *
         * @return Constant Value.Group/clan/guild id (String).The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getGROUP_ID() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.USERGROUPID");
                return com.huawei.hms.analytics.type.HAParamType.USERGROUPID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.GROUP_ID");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.GROUP_ID;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getINDEX() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.POSITIONID: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-index">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-index</a><br/>
         *
         * @return Constant Value.The index of the item in a list.The parameter expects a long value set with putLong(String, long)
         */
        public static java.lang.String getINDEX() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.POSITIONID");
                return com.huawei.hms.analytics.type.HAParamType.POSITIONID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_BRAND() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.BRAND: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_BRAND: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_brand">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_brand</a><br/>
         *
         * @return Constant Value.Item brand. The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getITEM_BRAND() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.BRAND");
                return com.huawei.hms.analytics.type.HAParamType.BRAND;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_BRAND");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_BRAND;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_CATEGORY() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CATEGORY: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category</a><br/>
         *
         * @return Constant Value.Item category (context-specific) (String). The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getITEM_CATEGORY() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CATEGORY");
                return com.huawei.hms.analytics.type.HAParamType.CATEGORY;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_ID() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.PRODUCTID: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_id</a><br/>
         *
         * @return Constant Value.Item ID (context-specific) (String). The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getITEM_ID() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PRODUCTID");
                return com.huawei.hms.analytics.type.HAParamType.PRODUCTID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_ID;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_LIST() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.PRODUCTLIST: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_list">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_list</a><br/>
         *
         * @return Constant Value.The list in which the item was presented to the user
         */
        public static java.lang.String getITEM_LIST() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PRODUCTLIST");
                return com.huawei.hms.analytics.type.HAParamType.PRODUCTLIST;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_LOCATION_ID() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.PLACEID: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LOCATION_ID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_location_id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_location_id</a><br/>
         *
         * @return Constant Value.The Google Place ID that corresponds to the associated item (String). Alternatively, you can supply your own custom Location ID. The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getITEM_LOCATION_ID() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PLACEID");
                return com.huawei.hms.analytics.type.HAParamType.PLACEID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LOCATION_ID");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LOCATION_ID;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_NAME() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.PRODUCTNAME: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_name">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_name</a><br/>
         *
         * @return Constant Value.Item Name (context-specific) (String). The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getITEM_NAME() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PRODUCTNAME");
                return com.huawei.hms.analytics.type.HAParamType.PRODUCTNAME;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_NAME;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_VARIANT() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.PRODUCTFEATURE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_VARIANT: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_variant">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_variant</a><br/>
         *
         * @return Constant Value.Item variant. The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getITEM_VARIANT() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PRODUCTFEATURE");
                return com.huawei.hms.analytics.type.HAParamType.PRODUCTFEATURE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_VARIANT");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_VARIANT;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getLEVEL() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.LEVELID: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-level">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-level</a><br/>
         *
         * @return Constant Value.Level in game (long). The parameter expects a long value set with putLong(String, long)
         */
        public static java.lang.String getLEVEL() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.LEVELID");
                return com.huawei.hms.analytics.type.HAParamType.LEVELID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getLEVEL_NAME() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.LEVELNAME: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL_NAME: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-level_name">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-level_name</a><br/>
         *
         * @return Constant Value.The name of a level in a game (String). The parameter expects a String value set with putString(String, String)
         */
        public static java.lang.String getLEVEL_NAME() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.LEVELNAME");
                return com.huawei.hms.analytics.type.HAParamType.LEVELNAME;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL_NAME");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.LEVEL_NAME;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getLOCATION() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.MEDIUM: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-medium">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-medium</a><br/>
         *
         * @return Constant Value.Location (String). The Google Place ID that corresponds to the associated event. Alternatively, you can supply your own custom Location ID. The parameter expects a string value set with putString(String, String).public static java.lang.String getLOCATION() { if (org.xms.g.utils.GlobalEnvSetting.isHms()) { org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PLACEID"); return com.huawei.hms.analytics.type.HAParamType.PLACEID; } else { org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION"); return com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION; } } / org.xms.f.analytics.ExtensionAnalytics.Param.getMEDIUM() return the constant value.<br/> Support running environments including both HMS and GMS which are chosen by users.<br/> Below are the references of HMS apis and GMS apis respectively:<br/> com.huawei.hms.analytics.type.HAParamType.MEDIUM : <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/> com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM : <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-medium">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-medium</a><br/>
         */
        public static java.lang.String getLOCATION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PLACEID");
                return com.huawei.hms.analytics.type.HAParamType.PLACEID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION;
            }
        }

        public static java.lang.String getMEDIUM() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.MEDIUM");
                return com.huawei.hms.analytics.type.HAParamType.MEDIUM;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.MEDIUM;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getMETHOD() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CHANNEL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-method">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-method</a><br/>
         *
         * @return Constant Value.A particular approach used in an operation; for example, "facebook" or "email" in the context of a sign_up or login event. The parameter expects a string value set with putString(String, String)
         */
        public static java.lang.String getMETHOD() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CHANNEL");
                return com.huawei.hms.analytics.type.HAParamType.CHANNEL;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.METHOD;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getNUMBER_OF_NIGHTS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.BOOKINGDAYS: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_NIGHTS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-number_of_nights">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-number_of_nights</a><br/>
         *
         * @return Constant Value.Number of nights staying at hotel (long)
         */
        public static java.lang.String getNUMBER_OF_NIGHTS() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.BOOKINGDAYS");
                return com.huawei.hms.analytics.type.HAParamType.BOOKINGDAYS;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_NIGHTS");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_NIGHTS;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getNUMBER_OF_PASSENGERS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.PASSENGERSNUMBER: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_PASSENGERS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-number_of_passengers">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-number_of_passengers</a><br/>
         *
         * @return Constant Value.Number of passengers traveling (long)
         */
        public static java.lang.String getNUMBER_OF_PASSENGERS() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PASSENGERSNUMBER");
                return com.huawei.hms.analytics.type.HAParamType.PASSENGERSNUMBER;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_PASSENGERS");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_PASSENGERS;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getNUMBER_OF_ROOMS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.BOOKINGROOMS: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_ROOMS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-number_of_rooms">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-number_of_rooms</a><br/>
         *
         * @return Constant Value.Number of rooms for travel events (long)
         */
        public static java.lang.String getNUMBER_OF_ROOMS() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.BOOKINGROOMS");
                return com.huawei.hms.analytics.type.HAParamType.BOOKINGROOMS;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_ROOMS");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.NUMBER_OF_ROOMS;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getORIGIN() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.ORIGINATINGPLACE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ORIGIN: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-origin">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-origin</a><br/>
         *
         * @return Constant Value.Flight or Travel origin (String)
         */
        public static java.lang.String getORIGIN() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.ORIGINATINGPLACE");
                return com.huawei.hms.analytics.type.HAParamType.ORIGINATINGPLACE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.ORIGIN");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.ORIGIN;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getPRICE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.PRICE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-price">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-price</a><br/>
         *
         * @return Constant Value.Purchase price (double). Expecting a double value set with putDouble(String, double)
         */
        public static java.lang.String getPRICE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.PRICE");
                return com.huawei.hms.analytics.type.HAParamType.PRICE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.PRICE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getQUANTITY() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.QUANTITY: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-quantity">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-quantity</a><br/>
         *
         * @return Constant Value.Purchase quantity (long)
         */
        public static java.lang.String getQUANTITY() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.QUANTITY");
                return com.huawei.hms.analytics.type.HAParamType.QUANTITY;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.QUANTITY;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getSCORE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.SCORE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-score">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-score</a><br/>
         *
         * @return Constant Value.Score in game (long)
         */
        public static java.lang.String getSCORE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.SCORE");
                return com.huawei.hms.analytics.type.HAParamType.SCORE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.SCORE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getSEARCH_TERM() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.KEYWORDS: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.SEARCH_TERM: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-search_term">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-search_term</a><br/>
         *
         * @return Constant Value.The search string/keywords used (String)
         */
        public static java.lang.String getSEARCH_TERM() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.KEYWORDS");
                return com.huawei.hms.analytics.type.HAParamType.KEYWORDS;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.SEARCH_TERM");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.SEARCH_TERM;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getSHIPPING() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.SHIPPING: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-shipping">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-shipping</a><br/>
         *
         * @return Constant Value.Shipping cost associated with a transaction (double). Expecting a double value set with putDouble(String, double)
         */
        public static java.lang.String getSHIPPING() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.SHIPPING");
                return com.huawei.hms.analytics.type.HAParamType.SHIPPING;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getSIGN_UP_METHOD() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CHANNEL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.SIGN_UP_METHOD: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-sign_up_method">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-sign_up_method</a><br/>
         *
         * @return Constant Value.Signup method (String)
         */
        public static java.lang.String getSIGN_UP_METHOD() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CHANNEL");
                return com.huawei.hms.analytics.type.HAParamType.CHANNEL;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.SIGN_UP_METHOD");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.SIGN_UP_METHOD;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getSOURCE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.SOURCE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-source">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-source</a><br/>
         *
         * @return Constant Value.CAMPAIGN_DETAILS source; used to identify a search engine, newsletter, or other source
         */
        public static java.lang.String getSOURCE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.SOURCE");
                return com.huawei.hms.analytics.type.HAParamType.SOURCE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.SOURCE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getSTART_DATE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.BEGINDATE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.START_DATE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-start_date">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-start_date</a><br/>
         *
         * @return Constant Value.The departure date, check-in date, or rental start date for the item (String)
         */
        public static java.lang.String getSTART_DATE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.BEGINDATE");
                return com.huawei.hms.analytics.type.HAParamType.BEGINDATE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.START_DATE");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.START_DATE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getSUCCESS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.RESULT: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.SUCCESS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-success">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-success</a><br/>
         *
         * @return Constant Value.The result of an operation (long). Specify 1 to indicate success and 0 to indicate failure
         */
        public static java.lang.String getSUCCESS() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.RESULT");
                return com.huawei.hms.analytics.type.HAParamType.RESULT;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.SUCCESS");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.SUCCESS;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getTAX() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.TAXFEE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.TAX: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-tax">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-tax</a><br/>
         *
         * @return Constant Value.Tax cost associated with a transaction (double). Expecting a double value set with putDouble(String, double)
         */
        public static java.lang.String getTAX() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.TAXFEE");
                return com.huawei.hms.analytics.type.HAParamType.TAXFEE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.TAX");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.TAX;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getTERM() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.KEYWORDS: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.TERM: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-term">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-term</a><br/>
         *
         * @return Constant Value.CAMPAIGN_DETAILS term; used with paid search to supply the keywords for ads
         */
        public static java.lang.String getTERM() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.KEYWORDS");
                return com.huawei.hms.analytics.type.HAParamType.KEYWORDS;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.TERM");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.TERM;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getTRANSACTION_ID() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.TRANSACTIONID: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-transaction_id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-transaction_id</a><br/>
         *
         * @return Constant Value.The unique identifier of a transaction (String)
         */
        public static java.lang.String getTRANSACTION_ID() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.TRANSACTIONID");
                return com.huawei.hms.analytics.type.HAParamType.TRANSACTIONID;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.TRANSACTION_ID;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getTRAVEL_CLASS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CLASS: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.TRAVEL_CLASS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-travel_class">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-travel_class</a><br/>
         *
         * @return Constant Value.Travel class (String)
         */
        public static java.lang.String getTRAVEL_CLASS() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CLASS");
                return com.huawei.hms.analytics.type.HAParamType.CLASS;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.TRAVEL_CLASS");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.TRAVEL_CLASS;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getVALUE() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.REVENUE: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.VALUE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-value">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-value</a><br/>
         *
         * @return Constant Value.A context-specific numeric value which is accumulated automatically for each event type
         */
        public static java.lang.String getVALUE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.REVENUE");
                return com.huawei.hms.analytics.type.HAParamType.REVENUE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.VALUE");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.VALUE;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getVIRTUAL_CURRENCY_NAME() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.VIRTUALCURRNAME: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.VIRTUAL_CURRENCY_NAME: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-virtual_currency_name">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-virtual_currency_name</a><br/>
         *
         * @return Constant Value.Name of virtual currency type (String)
         */
        public static java.lang.String getVIRTUAL_CURRENCY_NAME() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.VIRTUALCURRNAME");
                return com.huawei.hms.analytics.type.HAParamType.VIRTUALCURRNAME;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.Param.VIRTUAL_CURRENCY_NAME");
                return com.google.firebase.analytics.FirebaseAnalytics.Param.VIRTUAL_CURRENCY_NAME;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getDISCOUNT() Monetary value of discount associated with a purchase(double).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.DISCOUNT: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-discount">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-discount</a><br/>
         *
         * @return Constant Value: "discount"
         */
        public static java.lang.String getDISCOUNT() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_CATEGORY2() Item category (context-specific) (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY2: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category2">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category2</a><br/>
         *
         * @return Constant Value: "item_category2"
         */
        public static java.lang.String getITEM_CATEGORY2() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_CATEGORY3() Item category (context-specific) (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY3: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category3">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category3</a><br/>
         *
         * @return Constant Value: "item_category3"
         */
        public static java.lang.String getITEM_CATEGORY3() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_CATEGORY4() Item category (context-specific) (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY4: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category4">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category4</a><br/>
         *
         * @return Constant Value: "item_category4"
         */
        public static java.lang.String getITEM_CATEGORY4() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_CATEGORY5() Item category (context-specific) (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_CATEGORY5: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category5">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_category5</a><br/>
         *
         * @return Constant Value: "item_category5"
         */
        public static java.lang.String getITEM_CATEGORY5() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_LIST_ID() The ID of the list in which the item was presented to the user (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST_ID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_list_id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_list_id</a><br/>
         *
         * @return Constant Value: "item_list_id"
         */
        public static java.lang.String getITEM_LIST_ID() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEM_LIST_NAME() The name of the list in which the item was presented to the user (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEM_LIST_NAME: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_list_name">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-item_list_name</a><br/>
         *
         * @return Constant Value: "item_list_name"
         */
        public static java.lang.String getITEM_LIST_NAME() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getITEMS() The list of items involved in the transaction.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-items">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-items</a><br/>
         *
         * @return Constant Value: "items"
         */
        public static java.lang.String getITEMS() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getLOCATION_ID() The location associated with the event.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION_ID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-location_id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-location_id</a><br/>
         *
         * @return Constant Value: "location_id"
         */
        public static java.lang.String getLOCATION_ID() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getPAYMENT_TYPE() The chosen method of payment (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.PAYMENT_TYPE: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-payment_type">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-payment_type</a><br/>
         *
         * @return Constant Value: "payment_type"
         */
        public static java.lang.String getPAYMENT_TYPE() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getPROMOTION_ID() The ID of a product promotion (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.PROMOTION_ID: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-promotion_id">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-promotion_id</a><br/>
         *
         * @return Constant Value: "promotion_id"
         */
        public static java.lang.String getPROMOTION_ID() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getPROMOTION_NAME() The name of a product promotion (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.PROMOTION_NAME: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-promotion_name">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-promotion_name</a><br/>
         *
         * @return Constant Value: "promotion_name"
         */
        public static java.lang.String getPROMOTION_NAME() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.getSHIPPING_TIER() The shipping tier (e.g. Ground, Air, Next-day) selected for delivery of the purchased item (String).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING_TIER: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-shipping_tier">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.Param#public-static-final-string-shipping_tier</a><br/>
         *
         * @return Constant Value: "shipping_tier"
         */
        public static java.lang.String getSHIPPING_TIER() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static java.lang.String getAD_FORMAT() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static java.lang.String getAD_PLATFORM() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static java.lang.String getAD_SOURCE() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static java.lang.String getAD_UNIT_NAME() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static java.lang.String getSCREEN_CLASS() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        public static java.lang.String getSCREEN_NAME() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.analytics.ExtensionAnalytics.Param.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted ExtensionAnalytics.Param object
         */
        public static org.xms.f.analytics.ExtensionAnalytics.Param dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.analytics.ExtensionAnalytics.Param) param0);
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.Param.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.analytics.type.HAParamType;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.analytics.FirebaseAnalytics.Param;
            }
        }
    }

    /**
     * A UserProperty is an attribute that describes the app-user.<br/>
     * Combination of com.huawei.hms.analytics.type.HAParamType and com.google.firebase.analytics.FirebaseAnalytics.UserProperty.<br/>
     * com.huawei.hms.analytics.type.HAParamType: Provides the IDs of all predefined parameters, including the ID constants of predefined parameters and user attributes.<br/>
     * com.google.firebase.analytics.FirebaseAnalytics.UserProperty: A UserProperty is an attribute that describes the app-user.<br/>
     */
    public static class UserProperty extends org.xms.g.utils.XObject {

        /**
         * org.xms.f.analytics.ExtensionAnalytics.UserProperty.UserProperty(org.xms.g.utils.XBox) constructor of UserProperty with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public UserProperty(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.UserProperty.UserProperty() constructor of UserProperty.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.UserProperty.UserProperty(): <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.UserProperty#protected-firebaseanalytics.userproperty">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.UserProperty#protected-firebaseanalytics.userproperty</a><br/>
         */
        protected UserProperty() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.UserProperty.getALLOW_AD_PERSONALIZATION_SIGNALS() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.firebase.analytics.FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.UserProperty#public-static-final-string-allow_ad_personalization_signals">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.UserProperty#public-static-final-string-allow_ad_personalization_signals</a><br/>
         *
         * @return Constant Value.Indicates whether events logged by Google Analytics can be used to personalize ads for the user
         */
        public static java.lang.String getALLOW_AD_PERSONALIZATION_SIGNALS() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.UserProperty.getSIGN_UP_METHOD() return the constant value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.analytics.type.HAParamType.CHANNEL: <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/android-api-constant-values-0000001050987221-V5#EN-US_TOPIC_0000001050987221__section111591243455</a><br/>
         * com.google.firebase.analytics.FirebaseAnalytics.UserProperty.SIGN_UP_METHOD: <a href="https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.UserProperty#public-static-final-string-sign_up_method">https://developers.google.com/android/reference/com/google/firebase/analytics/FirebaseAnalytics.UserProperty#public-static-final-string-sign_up_method</a><br/>
         *
         * @return Constant Value.The method used to sign in. For example, "google", "facebook" or "twitter"
         */
        public static java.lang.String getSIGN_UP_METHOD() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.analytics.type.HAParamType.CHANNEL");
                return com.huawei.hms.analytics.type.HAParamType.CHANNEL;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.firebase.analytics.FirebaseAnalytics.UserProperty.SIGN_UP_METHOD");
                return com.google.firebase.analytics.FirebaseAnalytics.UserProperty.SIGN_UP_METHOD;
            }
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.UserProperty.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.f.analytics.ExtensionAnalytics.UserProperty.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted ExtensionAnalytics.UserProperty object
         */
        public static org.xms.f.analytics.ExtensionAnalytics.UserProperty dynamicCast(java.lang.Object param0) {
            return ((org.xms.f.analytics.ExtensionAnalytics.UserProperty) param0);
        }

        /**
         * org.xms.f.analytics.ExtensionAnalytics.UserProperty.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.analytics.type.HAParamType;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.firebase.analytics.FirebaseAnalytics.UserProperty;
            }
        }
    }
}