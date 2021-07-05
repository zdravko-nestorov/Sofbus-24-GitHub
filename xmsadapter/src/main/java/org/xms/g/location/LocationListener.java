package org.xms.g.location;

/**
 * Used for receiving notifications from the FusedLocationProviderApi when the location has changed.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.location.LocationListener: Used for receiving notifications from the FusedLocationProviderApi when the location has changed.<br/>
 */
public interface LocationListener extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.location.LocationListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationListener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationListener object
     */
    public static org.xms.g.location.LocationListener dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.LocationListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public void onLocationChanged(android.location.Location param0);

    default java.lang.Object getZInstanceLocationListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default com.google.android.gms.location.LocationListener getGInstanceLocationListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceLocationListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Wrapper class of LocationListener which is used for receiving notifications from the FusedLocationProviderApi when the location has changed.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.location.LocationListener: Used for receiving notifications from the FusedLocationProviderApi when the location has changed.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.location.LocationListener {

        /**
         * org.xms.g.location.LocationListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
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
        public void onLocationChanged(android.location.Location param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}