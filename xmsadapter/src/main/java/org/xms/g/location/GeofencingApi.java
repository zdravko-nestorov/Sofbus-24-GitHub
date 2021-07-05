package org.xms.g.location;

/**
 * The main entry point for interacting with the geofencing APIs.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.location.GeofencingApi: The main entry point for interacting with the geofencing APIs.<br/>
 */
public interface GeofencingApi extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.location.GeofencingApi.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.GeofencingApi.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted GeofencingApi object
     */
    public static org.xms.g.location.GeofencingApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.GeofencingApi.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> addGeofences(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.GeofencingRequest param1, android.app.PendingIntent param2);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> addGeofences(org.xms.g.common.api.ExtensionApiClient param0, java.util.List<org.xms.g.location.Geofence> param1, android.app.PendingIntent param2);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeGeofences(org.xms.g.common.api.ExtensionApiClient param0, java.util.List<java.lang.String> param1);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeGeofences(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1);

    default java.lang.Object getZInstanceGeofencingApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default com.google.android.gms.location.GeofencingApi getGInstanceGeofencingApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceGeofencingApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Wrapper class of GeofencingApi which is the main entry point for interacting with the geofencing APIs.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.location.GeofencingApi: The main entry point for interacting with the geofencing APIs.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.GeofencingApi {

        /**
         * org.xms.g.location.GeofencingApi.XImpl.XImpl(org.xms.g.utils.XBox) Constructor of XImpl with XBox.<br/>
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
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> addGeofences(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.GeofencingRequest param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> addGeofences(org.xms.g.common.api.ExtensionApiClient param0, java.util.List<org.xms.g.location.Geofence> param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeGeofences(org.xms.g.common.api.ExtensionApiClient param0, java.util.List<java.lang.String> param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeGeofences(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}