package org.xms.g.maps;


/**
 * Defines configuration MapOptions for a Map.<br/>
 * Combination of com.huawei.hms.maps.HuaweiMapOptions and com.google.android.gms.maps.GoogleMapOptions.<br/>
 * com.huawei.hms.maps.HuaweiMapOptions: A final class that extends Object and implements the Parcelable API. This class defines attributes for a HuaweiMap object, and they can be used when you add a map to your app. If MapFragment is used, you can use the static factory method newInstance(HuaweiMapOptions) to pass the attributes. If MapView is used, you can use the constructor MapView(Context, HuaweiMapOptions) to pass the attributes.<br/>
 * com.google.android.gms.maps.GoogleMapOptions: Defines configuration GoogleMapOptions for a GoogleMap. These options can be used when adding a map to your application programmatically(as opposed to via XML). If you are using a MapFragment, you can pass these options in using the static factory method newInstance(GoogleMapOptions). If you are using a MapView, you can pass these options in using the constructor MapView(Context, GoogleMapOptions).<br/>
 */
public final class ExtensionMapOptions extends org.xms.g.utils.XObject {


    /**
     * org.xms.g.maps.ExtensionMapOptions.ExtensionMapOptions(org.xms.g.utils.XBox) Defines configuration GoogleMapOptions for a GoogleMap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.HuaweiMapOptions(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.GoogleMapOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public ExtensionMapOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.ExtensionMapOptions() Defines configuration GoogleMapOptions for a GoogleMap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.HuaweiMapOptions(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.GoogleMapOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions</a><br/>
     */
    public ExtensionMapOptions() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.HuaweiMapOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.GoogleMapOptions());
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.createFromAttributes(android.content.Context,android.util.AttributeSet) Creates a GoogleMapsOptions from the AttributeSet.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.createFromAttributes(android.content.Context,android.util.AttributeSet): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#createFromAttributes(Context,AttributeSet)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#createFromAttributes(Context,AttributeSet)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(android.content.Context,android.util.AttributeSet): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-static-googlemapoptions-createfromattributes-context-context,-attributeset-attrs">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-static-googlemapoptions-createfromattributes-context-context,-attributeset-attrs</a><br/>
     *
     * @param param0 the param should instanceof android content Context
     * @param param1 the param should instanceof android util AttributeSet
     * @return the return object is maps ExtensionMapOptions
     */
    public static final org.xms.g.maps.ExtensionMapOptions createFromAttributes(android.content.Context param0, android.util.AttributeSet param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMapOptions.createFromAttributes(param0, param1)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = com.huawei.hms.maps.HuaweiMapOptions.createFromAttributes(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(param0, param1)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = com.google.android.gms.maps.GoogleMapOptions.createFromAttributes(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMapOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps ExtensionMapOptions object
     */
    public static org.xms.g.maps.ExtensionMapOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.ExtensionMapOptions) param0);
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMapOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMapOptions;
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.ambientEnabled(boolean) Specifies whether ambient-mode styling should be enabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.ambientEnabled(boolean)
     * com.google.android.gms.maps.GoogleMapOptions.ambientEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-ambientenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-ambientenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions ambientEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).ambientEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).ambientEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).ambientEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).ambientEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.camera(org.xms.g.maps.model.CameraPosition) Specifies a the initial camera position for the map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.camera(com.huawei.hms.maps.model.CameraPosition): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#camera(CameraPosition)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#camera(CameraPosition)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.camera(com.google.android.gms.maps.model.CameraPosition): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-camera-cameraposition-camera">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-camera-cameraposition-camera</a><br/>
     *
     * @param param0 the param should instanceof maps model CameraPosition
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions camera(org.xms.g.maps.model.CameraPosition param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).camera(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).camera(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).camera(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).camera(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.compassEnabled(boolean) Enables or disables the compass for a map based on the isCompassEnabled parameter.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.compassEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#compassEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#compassEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.compassEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-compassenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-compassenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions compassEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).compassEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).compassEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).compassEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).compassEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getAmbientEnabled() the ambientEnabled option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getAmbientEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getAmbientEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getAmbientEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getAmbientEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getambientenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getambientenabled</a><br/>
     *
     * @return the ambientEnabled option, or null if unspecified
     */
    public final java.lang.Boolean getAmbientEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getAmbientEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getAmbientEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getAmbientEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getAmbientEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getCamera() the camera option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getCamera(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getCamera()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getCamera()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getCamera(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-cameraposition-getcamera">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-cameraposition-getcamera</a><br/>
     *
     * @return the camera option, or null if unspecified
     */
    public final org.xms.g.maps.model.CameraPosition getCamera() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getCamera()");
            com.huawei.hms.maps.model.CameraPosition hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getCamera();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getCamera()");
            com.google.android.gms.maps.model.CameraPosition gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getCamera();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getCompassEnabled() Checks whether the compass is enabled for a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getCompassEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getCompassEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getCompassEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getCompassEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getcompassenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getcompassenabled</a><br/>
     *
     * @return the compassEnabled option, or null if unspecified
     */
    public final java.lang.Boolean getCompassEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getCompassEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getCompassEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getCompassEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getCompassEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getLatLngBoundsForCameraTarget() the LatLngBounds used to constrain the camera target, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getLatLngBoundsForCameraTarget(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getLatLngBoundsForCameraTarget()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getLatLngBoundsForCameraTarget()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getLatLngBoundsForCameraTarget(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-latlngbounds-getlatlngboundsforcameratarget">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-latlngbounds-getlatlngboundsforcameratarget</a><br/>
     *
     * @return the LatLngBounds used to constrain the camera target, or null if unspecified
     */
    public final org.xms.g.maps.model.LatLngBounds getLatLngBoundsForCameraTarget() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getLatLngBoundsForCameraTarget()");
            com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getLatLngBoundsForCameraTarget();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getLatLngBoundsForCameraTarget()");
            com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getLatLngBoundsForCameraTarget();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getLiteMode() the liteMode option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getLiteMode()
     * com.google.android.gms.maps.GoogleMapOptions.getLiteMode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getlitemode">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getlitemode</a><br/>
     *
     * @return the liteMode option, or null if unspecified
     */
    public final java.lang.Boolean getLiteMode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getLiteMode()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getLiteMode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getLiteMode()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getLiteMode();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getMapToolbarEnabled() the mapToolbarEnabled option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getMapToolbarEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getMapToolbarEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getMapToolbarEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getMapToolbarEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getmaptoolbarenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getmaptoolbarenabled</a><br/>
     *
     * @return the mapToolbarEnabled option, or null if unspecified
     */
    public final java.lang.Boolean getMapToolbarEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMapToolbarEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMapToolbarEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMapToolbarEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMapToolbarEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getMapType() Obtains the current map type.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getMapType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getMapType()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getMapType()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getMapType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-int-getmaptype">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-int-getmaptype</a><br/>
     *
     * @return the mapType option, or -1 if unspecified
     */
    public final int getMapType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMapType()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMapType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMapType()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMapType();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getMaxZoomPreference() Obtains the preferred maximum zoom level of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getMaxZoomPreference(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getMaxZoomPreference()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getMaxZoomPreference()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getMaxZoomPreference(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-float-getmaxzoompreference">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-float-getmaxzoompreference</a><br/>
     *
     * @return the maximum zoom level preference, or null if unspecified
     */
    public final java.lang.Float getMaxZoomPreference() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMaxZoomPreference()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMaxZoomPreference();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMaxZoomPreference()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMaxZoomPreference();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getMinZoomPreference() Obtains the preferred minimum zoom level of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getMinZoomPreference(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getMinZoomPreference()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getMinZoomPreference()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getMinZoomPreference(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-float-getminzoompreference">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-float-getminzoompreference</a><br/>
     *
     * @return the minimum zoom level preference, or null if unspecified
     */
    public final java.lang.Float getMinZoomPreference() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMinZoomPreference()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getMinZoomPreference();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMinZoomPreference()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getMinZoomPreference();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getRotateGesturesEnabled() Checks whether rotate gestures are enabled for a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getRotateGesturesEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getRotateGesturesEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getRotateGesturesEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getRotateGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getrotategesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getrotategesturesenabled</a><br/>
     *
     * @return the rotateGesturesEnabled option, or null if unspecified
     */
    public final java.lang.Boolean getRotateGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getRotateGesturesEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getRotateGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getRotateGesturesEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getRotateGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getScrollGesturesEnabled() the scrollGesturesEnabled option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getScrollGesturesEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getScrollGesturesEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getScrollGesturesEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getScrollGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getscrollgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getscrollgesturesenabled</a><br/>
     *
     * @return the scrollGesturesEnabled option, or null if unspecified
     */
    public final java.lang.Boolean getScrollGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getScrollGesturesEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getScrollGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getScrollGesturesEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getScrollGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getScrollGesturesEnabledDuringRotateOrZoom() the scrollGesturesEnabledDuringRotateOrZoom option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.GoogleMapOptions.getScrollGesturesEnabledDuringRotateOrZoom(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getscrollgesturesenabledduringrotateorzoom">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getscrollgesturesenabledduringrotateorzoom</a><br/>
     *
     * @return the scrollGesturesEnabledDuringRotateOrZoom option, or null if unspecified
     */
    public final java.lang.Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            return false;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getScrollGesturesEnabledDuringRotateOrZoom()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getScrollGesturesEnabledDuringRotateOrZoom();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getTiltGesturesEnabled() the tiltGesturesEnabled option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getTiltGesturesEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getTiltGesturesEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getTiltGesturesEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getTiltGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-gettiltgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-gettiltgesturesenabled</a><br/>
     *
     * @return the tiltGesturesEnabled option, or null if unspecified
     */
    public final java.lang.Boolean getTiltGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getTiltGesturesEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getTiltGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getTiltGesturesEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getTiltGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getUseViewLifecycleInFragment() the useViewLifecycleInFragment option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getUseViewLifecycleInFragment(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getUseViewLifecycleInFragment()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getUseViewLifecycleInFragment()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getUseViewLifecycleInFragment(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getuseviewlifecycleinfragment">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getuseviewlifecycleinfragment</a><br/>
     *
     * @return the useViewLifecycleInFragment option, or null if unspecified
     */
    public final java.lang.Boolean getUseViewLifecycleInFragment() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getUseViewLifecycleInFragment()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getUseViewLifecycleInFragment();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getUseViewLifecycleInFragment()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getUseViewLifecycleInFragment();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getZOrderOnTop() the zOrderOnTop option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getZOrderOnTop(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getZOrderOnTop()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getZOrderOnTop()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getZOrderOnTop(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getzorderontop">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getzorderontop</a><br/>
     *
     * @return the zOrderOnTop option, or null if unspecified
     */
    public final java.lang.Boolean getZOrderOnTop() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZOrderOnTop()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZOrderOnTop();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZOrderOnTop()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZOrderOnTop();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getZoomControlsEnabled() the zoomControlsEnabled option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getZoomControlsEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getZoomControlsEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getZoomControlsEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getZoomControlsEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getzoomcontrolsenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getzoomcontrolsenabled</a><br/>
     *
     * @return the zoomControlsEnabled option, or null if unspecified
     */
    public final java.lang.Boolean getZoomControlsEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZoomControlsEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZoomControlsEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZoomControlsEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZoomControlsEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.getZoomGesturesEnabled() the zoomGesturesEnabled option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.getZoomGesturesEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getZoomGesturesEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#getZoomGesturesEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.getZoomGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getzoomgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-boolean-getzoomgesturesenabled</a><br/>
     *
     * @return the zoomGesturesEnabled option, or null if unspecified
     */
    public final java.lang.Boolean getZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).getZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).getZoomGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.latLngBoundsForCameraTarget(org.xms.g.maps.model.LatLngBounds) Specifies a LatLngBounds to constrain the camera target, so that when users scroll and pan the map, the camera target does not move outside these bounds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.latLngBoundsForCameraTarget(com.huawei.hms.maps.model.LatLngBounds): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#latLngBoundsForCameraTarget(LatLngBounds)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#latLngBoundsForCameraTarget(LatLngBounds)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.latLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-latlngboundsforcameratarget-latlngbounds-llbounds">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-latlngboundsforcameratarget-latlngbounds-llbounds</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng Bounds
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions latLngBoundsForCameraTarget(org.xms.g.maps.model.LatLngBounds param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).latLngBoundsForCameraTarget(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).latLngBoundsForCameraTarget(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).latLngBoundsForCameraTarget(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).latLngBoundsForCameraTarget(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.liteMode(boolean) Specifies whether the map should be created in lite mode. The default value is false. If lite mode is enabled, maps will load as static images. This improves performance in the case where a lot of maps need to be displayed at the same time, for example in a scrolling list, however lite-mode maps cannot be panned or zoomed by the user, or tilted or rotated at all.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.liteMode(boolean)
     * com.google.android.gms.maps.GoogleMapOptions.liteMode(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-litemode-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-litemode-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions liteMode(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).liteMode(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).liteMode(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).liteMode(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).liteMode(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.mapToolbarEnabled(boolean) Specifies whether the mapToolbar should be enabled. See setMapToolbarEnabled(boolean)for more details. The default value is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.mapToolbarEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#mapToolbarEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#mapToolbarEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.mapToolbarEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-maptoolbarenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-maptoolbarenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions mapToolbarEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).mapToolbarEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).mapToolbarEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).mapToolbarEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).mapToolbarEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.mapType(int) Specifies a change to the initial map type.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.mapType(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#mapType(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#mapType(int)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.mapType(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-maptype-int-maptype">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-maptype-int-maptype</a><br/>
     *
     * @param param0 the param should instanceof int
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions mapType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).mapType(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).mapType(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).mapType(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).mapType(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.maxZoomPreference(float) Specifies a preferred upper bound for camera zoom.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.maxZoomPreference(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#maxZoomPreference(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#maxZoomPreference(float)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.maxZoomPreference(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-maxzoompreference-float-maxzoompreference">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-maxzoompreference-float-maxzoompreference</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions maxZoomPreference(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).maxZoomPreference(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).maxZoomPreference(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).maxZoomPreference(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).maxZoomPreference(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.minZoomPreference(float) Specifies a preferred lower bound for camera zoom.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.minZoomPreference(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#minZoomPreference(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#minZoomPreference(float)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.minZoomPreference(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-minzoompreference-float-minzoompreference">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-minzoompreference-float-minzoompreference</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions minZoomPreference(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).minZoomPreference(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).minZoomPreference(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).minZoomPreference(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).minZoomPreference(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.rotateGesturesEnabled(boolean) Specifies whether rotate gestures should be enabled. See setRotateGesturesEnabled(boolean)for more details. The default value is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.rotateGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#rotateGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#rotateGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.rotateGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-rotategesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-rotategesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions rotateGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).rotateGesturesEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).rotateGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).rotateGesturesEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).rotateGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.scrollGesturesEnabled(boolean) Specifies whether scroll gestures should be enabled. See setScrollGesturesEnabled(boolean)for more details. The default value is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.scrollGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#scrollGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#scrollGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.scrollGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-scrollgesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-scrollgesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions scrollGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).scrollGesturesEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).scrollGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).scrollGesturesEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).scrollGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.scrollGesturesEnabledDuringRotateOrZoom(boolean) Specifies whether scroll gestures should be enabled during rotate and zoom gestures. See setScrollGesturesEnabledDuringRotateOrZoom(boolean)for more details. The default value is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.GoogleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-scrollgesturesenabledduringrotateorzoom-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-scrollgesturesenabledduringrotateorzoom-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            return null;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).scrollGesturesEnabledDuringRotateOrZoom(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).scrollGesturesEnabledDuringRotateOrZoom(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.tiltGesturesEnabled(boolean) Specifies whether tilt gestures should be enabled. See setTiltGesturesEnabled(boolean)for more details. The default value is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.tiltGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#tiltGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#tiltGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.tiltGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-tiltgesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-tiltgesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions tiltGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).tiltGesturesEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).tiltGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).tiltGesturesEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).tiltGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.toString()
     * com.google.android.gms.maps.GoogleMapOptions.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.useViewLifecycleInFragment(boolean) When using a MapFragment, this flag specifies whether the lifecycle of the map should be tied to the fragment's view or the fragment itself. The default value is false, tying the lifecycle of the map to the fragment.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.useViewLifecycleInFragment(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#useViewLifecycleInFragment(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#useViewLifecycleInFragment(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.useViewLifecycleInFragment(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-useviewlifecycleinfragment-boolean-useviewlifecycleinfragment">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-useviewlifecycleinfragment-boolean-useviewlifecycleinfragment</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions useViewLifecycleInFragment(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).useViewLifecycleInFragment(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).useViewLifecycleInFragment(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).useViewLifecycleInFragment(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).useViewLifecycleInFragment(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.GoogleMapOptions.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.zOrderOnTop(boolean) Control whether the map view's surface is placed on top of its window. See setZOrderOnTop(boolean)for more details. Note that this will cover all other views that could appear on the map(e.g., the zoom controls, the my location button).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.zOrderOnTop(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#zOrderOnTop(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#zOrderOnTop(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.zOrderOnTop(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-zorderontop-boolean-zorderontop">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-zorderontop-boolean-zorderontop</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions zOrderOnTop(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zOrderOnTop(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zOrderOnTop(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zOrderOnTop(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zOrderOnTop(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.zoomControlsEnabled(boolean) Specifies whether the zoom controls should be enabled. See setZoomControlsEnabled(boolean)for more details. The default value is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.zoomControlsEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#zoomControlsEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#zoomControlsEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.zoomControlsEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-zoomcontrolsenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-zoomcontrolsenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions zoomControlsEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zoomControlsEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zoomControlsEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zoomControlsEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zoomControlsEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMapOptions.zoomGesturesEnabled(boolean) Specifies whether zoom gestures should be enabled. See setZoomGesturesEnabled(boolean)for more details. The default value is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMapOptions.zoomGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#zoomGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapoptions#zoomGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMapOptions.zoomGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-zoomgesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMapOptions#public-googlemapoptions-zoomgesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps ExtensionMapOptions
     */
    public final org.xms.g.maps.ExtensionMapOptions zoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zoomGesturesEnabled(param0)");
            com.huawei.hms.maps.HuaweiMapOptions hReturn = ((com.huawei.hms.maps.HuaweiMapOptions) this.getHInstance()).zoomGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zoomGesturesEnabled(param0)");
            com.google.android.gms.maps.GoogleMapOptions gReturn = ((com.google.android.gms.maps.GoogleMapOptions) this.getGInstance()).zoomGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.ExtensionMapOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
}