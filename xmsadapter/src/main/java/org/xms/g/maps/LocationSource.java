package org.xms.g.maps;

/**
 * Defines an interface for providing location data, typically to a Map object.<br/>
 * Combination of com.huawei.hms.maps.LocationSource and com.google.android.gms.maps.LocationSource.<br/>
 * com.huawei.hms.maps.LocationSource: Defines a location source that provides location data.<br/>
 * com.google.android.gms.maps.LocationSource: Defines an interface for providing location data, typically to a GoogleMap object.<br/>
 */
public interface LocationSource extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.maps.LocationSource.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.LocationSource.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps LocationSource object
     */
    public static org.xms.g.maps.LocationSource dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.LocationSource) param0);
    }

    /**
     * org.xms.g.maps.LocationSource.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.LocationSource;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.LocationSource;
            }
        }
        return param0 instanceof org.xms.g.maps.LocationSource;
    }

    /**
     * org.xms.g.maps.LocationSource.activate(org.xms.g.maps.LocationSource.OnLocationChangedListener) Activates this provider. This provider will notify the supplied listener periodically, until you call deactivate(). Notifications will be broadcast on the main thread.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.LocationSource.activate(com.huawei.hms.maps.LocationSource.OnLocationChangedListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-locationsource#activate(LocationSource.OnLocationChangedListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-locationsource#activate(LocationSource.OnLocationChangedListener)</a><br/>
     * com.google.android.gms.maps.LocationSource.activate(com.google.android.gms.maps.LocationSource.OnLocationChangedListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource#public-abstract-void-activate-locationsource.onlocationchangedlistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource#public-abstract-void-activate-locationsource.onlocationchangedlistener-listener</a><br/>
     *
     * @param param0 listener that's called when a new location is available
     */
    public void activate(org.xms.g.maps.LocationSource.OnLocationChangedListener param0);

    /**
     * org.xms.g.maps.LocationSource.deactivate() Deactivates this provider.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.LocationSource.deactivate(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-locationsource#deactivate()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-locationsource#deactivate()</a><br/>
     * com.google.android.gms.maps.LocationSource.deactivate(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource#public-abstract-void-deactivate">https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource#public-abstract-void-deactivate</a><br/>
     */
    public void deactivate();

    default java.lang.Object getZInstanceLocationSource() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceLocationSource();
        } else {
            return getGInstanceLocationSource();
        }
    }

    default com.google.android.gms.maps.LocationSource getGInstanceLocationSource() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.maps.LocationSource) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.maps.LocationSource() {

            public void activate(com.google.android.gms.maps.LocationSource.OnLocationChangedListener param0) {
                org.xms.g.maps.LocationSource.this.activate(((param0) == null ? null : (new org.xms.g.maps.LocationSource.OnLocationChangedListener.XImpl(new org.xms.g.utils.XBox(param0, null)))));
            }

            public void deactivate() {
                org.xms.g.maps.LocationSource.this.deactivate();
            }
        };
    }

    default com.huawei.hms.maps.LocationSource getHInstanceLocationSource() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.maps.LocationSource) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.maps.LocationSource() {

            public void activate(com.huawei.hms.maps.LocationSource.OnLocationChangedListener param0) {
                org.xms.g.maps.LocationSource.this.activate(((param0) == null ? null : (new org.xms.g.maps.LocationSource.OnLocationChangedListener.XImpl(new org.xms.g.utils.XBox(null, param0)))));
            }

            public void deactivate() {
                org.xms.g.maps.LocationSource.this.deactivate();
            }
        };
    }

    /**
     * Handles a location update.<br/>
     * Combination of com.huawei.hms.maps.LocationSource.OnLocationChangedListener and com.google.android.gms.maps.LocationSource.OnLocationChangedListener.<br/>
     * com.huawei.hms.maps.LocationSource.OnLocationChangedListener: Handles a location update.<br/>
     * com.google.android.gms.maps.LocationSource.OnLocationChangedListener: Handles a location update.<br/>
     */
    public static interface OnLocationChangedListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.LocationSource.OnLocationChangedListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.LocationSource.OnLocationChangedListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps LocationSource OnLocationChangedListener object
         */
        public static org.xms.g.maps.LocationSource.OnLocationChangedListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.LocationSource.OnLocationChangedListener) param0);
        }

        /**
         * org.xms.g.maps.LocationSource.OnLocationChangedListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            if (!(param0 instanceof org.xms.g.utils.XInterface)) {
                return false;
            }
            if (param0 instanceof org.xms.g.utils.XGettable) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.LocationSource.OnLocationChangedListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.LocationSource.OnLocationChangedListener;
                }
            }
            return param0 instanceof org.xms.g.maps.LocationSource.OnLocationChangedListener;
        }

        /**
         * org.xms.g.maps.LocationSource.OnLocationChangedListener.onLocationChanged(android.location.Location) Called when a new user location is known.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.LocationSource.OnLocationChangedListener.onLocationChanged(android.location.Location): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onlocationchangedl#onLocationChanged(Location)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onlocationchangedl#onLocationChanged(Location)</a><br/>
         * com.google.android.gms.maps.LocationSource.OnLocationChangedListener.onLocationChanged(android.location.Location): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource.OnLocationChangedListener#public-abstract-void-onlocationchanged-location-location">https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource.OnLocationChangedListener#public-abstract-void-onlocationchanged-location-location</a><br/>
         *
         * @param param0 new location. Must not be null
         */
        public void onLocationChanged(android.location.Location param0);

        default java.lang.Object getZInstanceOnLocationChangedListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnLocationChangedListener();
            } else {
                return getGInstanceOnLocationChangedListener();
            }
        }

        default com.google.android.gms.maps.LocationSource.OnLocationChangedListener getGInstanceOnLocationChangedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.LocationSource.OnLocationChangedListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.LocationSource.OnLocationChangedListener() {

                public void onLocationChanged(android.location.Location param0) {
                    org.xms.g.maps.LocationSource.OnLocationChangedListener.this.onLocationChanged(param0);
                }
            };
        }

        default com.huawei.hms.maps.LocationSource.OnLocationChangedListener getHInstanceOnLocationChangedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.LocationSource.OnLocationChangedListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.LocationSource.OnLocationChangedListener() {

                public void onLocationChanged(android.location.Location param0) {
                    org.xms.g.maps.LocationSource.OnLocationChangedListener.this.onLocationChanged(param0);
                }
            };
        }

        /**
         * Handles a location update.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.LocationSource.OnLocationChangedListener: Handles a location update.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.LocationSource.OnLocationChangedListener {

            /**
             * org.xms.g.maps.LocationSource.OnLocationChangedListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.LocationSource.OnLocationChangedListener.XImpl.onLocationChanged(android.location.Location) Called when a new user location is known.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.LocationSource.OnLocationChangedListener.onLocationChanged(android.location.Location): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onlocationchangedl#onLocationChanged(Location)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onlocationchangedl#onLocationChanged(Location)</a><br/>
             * com.google.android.gms.maps.LocationSource.OnLocationChangedListener.onLocationChanged(android.location.Location): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource.OnLocationChangedListener#public-abstract-void-onlocationchanged-location-location">https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource.OnLocationChangedListener#public-abstract-void-onlocationchanged-location-location</a><br/>
             *
             * @param param0 new location. Must not be null
             */
            public void onLocationChanged(android.location.Location param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.LocationSource.OnLocationChangedListener) this.getHInstance()).onLocationChanged(param0)");
                    ((com.huawei.hms.maps.LocationSource.OnLocationChangedListener) this.getHInstance()).onLocationChanged(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.LocationSource.OnLocationChangedListener) this.getGInstance()).onLocationChanged(param0)");
                    ((com.google.android.gms.maps.LocationSource.OnLocationChangedListener) this.getGInstance()).onLocationChanged(param0);
                }
            }
        }
    }

    /**
     * Defines an interface for providing location data, typically to a GoogleMap object.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.maps.LocationSource: Defines an interface for providing location data, typically to a GoogleMap object.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.LocationSource {

        /**
         * org.xms.g.maps.LocationSource.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 this param is utils XBox
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.maps.LocationSource.XImpl.activate(org.xms.g.maps.LocationSource.OnLocationChangedListener) Activates this provider. This provider will notify the supplied listener periodically, until you call deactivate(). Notifications will be broadcast on the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.LocationSource.activate(com.huawei.hms.maps.LocationSource.OnLocationChangedListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-locationsource#activate(LocationSource.OnLocationChangedListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-locationsource#activate(LocationSource.OnLocationChangedListener)</a><br/>
         * com.google.android.gms.maps.LocationSource.activate(com.google.android.gms.maps.LocationSource.OnLocationChangedListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource#public-abstract-void-activate-locationsource.onlocationchangedlistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource#public-abstract-void-activate-locationsource.onlocationchangedlistener-listener</a><br/>
         *
         * @param param0 listener that's called when a new location is available
         */
        public void activate(org.xms.g.maps.LocationSource.OnLocationChangedListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.LocationSource) this.getHInstance()).activate(((param0) == null ? null : (param0.getHInstanceOnLocationChangedListener())))");
                ((com.huawei.hms.maps.LocationSource) this.getHInstance()).activate(((param0) == null ? null : (param0.getHInstanceOnLocationChangedListener())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.LocationSource) this.getGInstance()).activate(((param0) == null ? null : (param0.getGInstanceOnLocationChangedListener())))");
                ((com.google.android.gms.maps.LocationSource) this.getGInstance()).activate(((param0) == null ? null : (param0.getGInstanceOnLocationChangedListener())));
            }
        }

        /**
         * org.xms.g.maps.LocationSource.XImpl.deactivate() Deactivates this provider.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.LocationSource.deactivate(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-locationsource#deactivate()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-locationsource#deactivate()</a><br/>
         * com.google.android.gms.maps.LocationSource.deactivate(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource#public-abstract-void-deactivate">https://developers.google.com/android/reference/com/google/android/gms/maps/LocationSource#public-abstract-void-deactivate</a><br/>
         */
        public void deactivate() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.LocationSource) this.getHInstance()).deactivate()");
                ((com.huawei.hms.maps.LocationSource) this.getHInstance()).deactivate();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.LocationSource) this.getGInstance()).deactivate()");
                ((com.google.android.gms.maps.LocationSource) this.getGInstance()).deactivate();
            }
        }
    }
}