package org.xms.g.location;

/**
 * The main entry point for interacting with activity recognition.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.location.ActivityRecognitionApi: The main entry point for interacting with activity recognition.<br/>
 */
public interface ActivityRecognitionApi extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.location.ActivityRecognitionApi.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.ActivityRecognitionApi.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted ActivityRecognitionApi object
     */
    public static org.xms.g.location.ActivityRecognitionApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.ActivityRecognitionApi.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return True if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, long param1, android.app.PendingIntent param2);

    default java.lang.Object getZInstanceActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default com.google.android.gms.location.ActivityRecognitionApi getGInstanceActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceActivityRecognitionApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Wrapper class of ActivityRecognitionApi which is the main entry point for interacting with activity recognition.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.location.ActivityRecognitionApi: The main entry point for interacting with activity recognition.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.ActivityRecognitionApi {

        /**
         * org.xms.g.location.ActivityRecognitionApi.XImpl.XImpl(org.xms.g.utils.XBox) Constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 The wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestActivityUpdates(org.xms.g.common.api.ExtensionApiClient param0, long param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}