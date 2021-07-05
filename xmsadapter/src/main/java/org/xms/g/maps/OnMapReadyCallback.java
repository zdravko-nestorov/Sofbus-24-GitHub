package org.xms.g.maps;

/**
 * Callback interface for when the map is ready to be used.<br/>
 * Combination of com.huawei.hms.maps.OnMapReadyCallback and com.google.android.gms.maps.OnMapReadyCallback.<br/>
 * com.huawei.hms.maps.OnMapReadyCallback: Executes a callback when a HuaweiMap object is ready for use.<br/>
 * com.google.android.gms.maps.OnMapReadyCallback: Callback interface for when the map is ready to be used.<br/>
 */
public interface OnMapReadyCallback extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.maps.OnMapReadyCallback.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.OnMapReadyCallback.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps OnMapReadyCallback object
     */
    public static org.xms.g.maps.OnMapReadyCallback dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.OnMapReadyCallback) param0);
    }

    /**
     * org.xms.g.maps.OnMapReadyCallback.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.OnMapReadyCallback;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.OnMapReadyCallback;
            }
        }
        return param0 instanceof org.xms.g.maps.OnMapReadyCallback;
    }

    /**
     * org.xms.g.maps.OnMapReadyCallback.onMapReady(org.xms.g.maps.ExtensionMap) Called when a map is ready for use.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.OnMapReadyCallback.onMapReady(com.huawei.hms.maps.HuaweiMap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmapreadycallback#onMapReady(HuaweiMap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmapreadycallback#onMapReady(HuaweiMap)</a><br/>
     * com.google.android.gms.maps.OnMapReadyCallback.onMapReady(com.google.android.gms.maps.GoogleMap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/OnMapReadyCallback#public-abstract-void-onmapready-googlemap-googlemap">https://developers.google.com/android/reference/com/google/android/gms/maps/OnMapReadyCallback#public-abstract-void-onmapready-googlemap-googlemap</a><br/>
     *
     * @param param0 this param maps ExtensionMap
     */
    public void onMapReady(org.xms.g.maps.ExtensionMap param0);

    default java.lang.Object getZInstanceOnMapReadyCallback() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceOnMapReadyCallback();
        } else {
            return getGInstanceOnMapReadyCallback();
        }
    }

    default com.google.android.gms.maps.OnMapReadyCallback getGInstanceOnMapReadyCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.maps.OnMapReadyCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.maps.OnMapReadyCallback() {

            public void onMapReady(com.google.android.gms.maps.GoogleMap param0) {
                org.xms.g.maps.OnMapReadyCallback.this.onMapReady(((param0) == null ? null : (new org.xms.g.maps.ExtensionMap(new org.xms.g.utils.XBox(param0, null)))));
            }
        };
    }

    default com.huawei.hms.maps.OnMapReadyCallback getHInstanceOnMapReadyCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.maps.OnMapReadyCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.maps.OnMapReadyCallback() {

            public void onMapReady(com.huawei.hms.maps.HuaweiMap param0) {
                org.xms.g.maps.OnMapReadyCallback.this.onMapReady(((param0) == null ? null : (new org.xms.g.maps.ExtensionMap(new org.xms.g.utils.XBox(null, param0)))));
            }
        };
    }

    /**
     * Callback interface for when the map is ready to be used.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.maps.OnMapReadyCallback: Callback interface for when the map is ready to be used.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.OnMapReadyCallback {

        /**
         * org.xms.g.maps.OnMapReadyCallback.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 this param is utils XBox
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.maps.OnMapReadyCallback.XImpl.onMapReady(org.xms.g.maps.ExtensionMap) Called when a map is ready for use.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.OnMapReadyCallback.onMapReady(com.huawei.hms.maps.HuaweiMap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmapreadycallback#onMapReady(HuaweiMap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmapreadycallback#onMapReady(HuaweiMap)</a><br/>
         * com.google.android.gms.maps.OnMapReadyCallback.onMapReady(com.google.android.gms.maps.GoogleMap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/OnMapReadyCallback#public-abstract-void-onmapready-googlemap-googlemap">https://developers.google.com/android/reference/com/google/android/gms/maps/OnMapReadyCallback#public-abstract-void-onmapready-googlemap-googlemap</a><br/>
         *
         * @param param0 the param is ExtensionMap
         */
        public void onMapReady(org.xms.g.maps.ExtensionMap param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.OnMapReadyCallback) this.getHInstance()).onMapReady(((com.huawei.hms.maps.HuaweiMap) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.maps.OnMapReadyCallback) this.getHInstance()).onMapReady(((com.huawei.hms.maps.HuaweiMap) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.OnMapReadyCallback) this.getGInstance()).onMapReady(((com.google.android.gms.maps.GoogleMap) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.maps.OnMapReadyCallback) this.getGInstance()).onMapReady(((com.google.android.gms.maps.GoogleMap) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }
}