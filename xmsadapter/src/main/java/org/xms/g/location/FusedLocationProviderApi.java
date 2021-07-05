package org.xms.g.location;

/**
 * The main entry point for interacting with the fused location provider.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.location.FusedLocationProviderApi: The main entry point for interacting with the fused location provider.<br/>
 */
public interface FusedLocationProviderApi extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.location.FusedLocationProviderApi.getKEY_LOCATION_CHANGED() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.FusedLocationProviderApi.KEY_LOCATION_CHANGED: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderApi#public-static-final-string-key_location_changed">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderApi#public-static-final-string-key_location_changed</a><br/>
     *
     * @return Constant Value.Key used for a Bundle extra holding a Location value when a location change is broadcast using a PendingIntent
     */
    public static java.lang.String getKEY_LOCATION_CHANGED() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.FusedLocationProviderApi.getKEY_MOCK_LOCATION() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.FusedLocationProviderApi.KEY_MOCK_LOCATION: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderApi#public-static-final-string-key_mock_location">https://developers.google.com/android/reference/com/google/android/gms/location/FusedLocationProviderApi#public-static-final-string-key_mock_location</a><br/>
     *
     * @return Constant Value.Key used for the Bundle extra in Location object holding a boolean indicating whether the location was set using setMockLocation(GoogleApiClient, Location). If the value is false this extra is not set
     */
    public static java.lang.String getKEY_MOCK_LOCATION() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.FusedLocationProviderApi.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.FusedLocationProviderApi.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted FusedLocationProviderApi object
     */
    public static org.xms.g.location.FusedLocationProviderApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.FusedLocationProviderApi.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
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
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> flushLocations(org.xms.g.common.api.ExtensionApiClient param0);

    /**
     * XMS does not provide this api.<br/>
     */
    public android.location.Location getLastLocation(org.xms.g.common.api.ExtensionApiClient param0);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.location.LocationAvailability getLocationAvailability(org.xms.g.common.api.ExtensionApiClient param0);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationListener param1);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationCallback param1);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationListener param2) throws java.lang.IllegalStateException;

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationCallback param2, android.os.Looper param3);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationListener param2, android.os.Looper param3);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, android.app.PendingIntent param2);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> setMockLocation(org.xms.g.common.api.ExtensionApiClient param0, android.location.Location param1);

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> setMockMode(org.xms.g.common.api.ExtensionApiClient param0, boolean param1);

    default java.lang.Object getZInstanceFusedLocationProviderApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default com.google.android.gms.location.FusedLocationProviderApi getGInstanceFusedLocationProviderApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceFusedLocationProviderApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Wrapper class of FusedLocationProviderApi which is the main entry point for interacting with the fused location provider.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.location.FusedLocationProviderApi: The main entry point for interacting with the fused location provider.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.FusedLocationProviderApi {

        /**
         * org.xms.g.location.FusedLocationProviderApi.XImpl.XImpl(org.xms.g.utils.XBox) Constructor of XImpl with XBox.<br/>
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
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> flushLocations(org.xms.g.common.api.ExtensionApiClient param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public android.location.Location getLastLocation(org.xms.g.common.api.ExtensionApiClient param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.location.LocationAvailability getLocationAvailability(org.xms.g.common.api.ExtensionApiClient param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, android.app.PendingIntent param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationListener param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> removeLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationCallback param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationListener param2) throws java.lang.IllegalStateException {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationCallback param2, android.os.Looper param3) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, org.xms.g.location.LocationListener param2, android.os.Looper param3) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> requestLocationUpdates(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationRequest param1, android.app.PendingIntent param2) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> setMockLocation(org.xms.g.common.api.ExtensionApiClient param0, android.location.Location param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> setMockMode(org.xms.g.common.api.ExtensionApiClient param0, boolean param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}