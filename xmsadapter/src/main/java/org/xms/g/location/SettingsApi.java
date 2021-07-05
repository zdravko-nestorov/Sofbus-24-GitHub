package org.xms.g.location;

/**
 * The main entry point for interacting with the location settings-enabler APIs.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.location.SettingsApi: The main entry point for interacting with the location settings-enabler APIs.<br/>
 */
public interface SettingsApi extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.location.SettingsApi.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.SettingsApi.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted SettingsApi object
     */
    public static org.xms.g.location.SettingsApi dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.SettingsApi.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.PendingResult<org.xms.g.location.LocationSettingsResult> checkLocationSettings(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationSettingsRequest param1);

    default java.lang.Object getZInstanceSettingsApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default com.google.android.gms.location.SettingsApi getGInstanceSettingsApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceSettingsApi() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Wrapper class of SettingsApi which is the main entry point for interacting with the location settings-enabler APIs.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.location.SettingsApi: The main entry point for interacting with the location settings-enabler APIs.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.SettingsApi {

        /**
         * org.xms.g.location.SettingsApi.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.common.api.PendingResult<org.xms.g.location.LocationSettingsResult> checkLocationSettings(org.xms.g.common.api.ExtensionApiClient param0, org.xms.g.location.LocationSettingsRequest param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}