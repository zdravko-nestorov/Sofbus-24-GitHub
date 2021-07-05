package org.xms.g.maps;

/**
 * Defines configuration PanoramaOptions for a StreetViewPanorama .<br/>
 * Combination of com.huawei.hms.maps.StreetViewPanoramaOptions and com.google.android.gms.maps.StreetViewPanoramaOptions.<br/>
 * com.huawei.hms.maps.StreetViewPanoramaOptions: Defines configuration PanoramaOptions for a StreetViewPanorama.<br/>
 * com.google.android.gms.maps.StreetViewPanoramaOptions: Defines configuration PanoramaOptions for a StreetViewPanorama. These options can be used when adding a panorama to your application programmatically. If you are using a StreetViewPanoramaFragment, you can pass these options in using the static factory method newInstance(StreetViewPanoramaOptions). If you are using a StreetViewPanoramaView, you can pass these options in using the constructor StreetViewPanoramaView(Context, StreetViewPanoramaOptions).<br/>
 */
public final class StreetViewPanoramaOptions extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.StreetViewPanoramaOptions(org.xms.g.utils.XBox) Defines configuration PanoramaOptions for a StreetViewPanorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.StreetViewPanoramaOptions()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.StreetViewPanoramaOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public StreetViewPanoramaOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.StreetViewPanoramaOptions() Defines configuration PanoramaOptions for a StreetViewPanorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.StreetViewPanoramaOptions()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.StreetViewPanoramaOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions</a><br/>
     */
    public StreetViewPanoramaOptions() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.StreetViewPanoramaOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.StreetViewPanoramaOptions());
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.StreetViewPanoramaOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps StreetViewPanoramaOptions object
     */
    public static org.xms.g.maps.StreetViewPanoramaOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.StreetViewPanoramaOptions) param0);
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanoramaOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanoramaOptions;
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getPanningGesturesEnabled() true if users are initially able to pan via gestures on Street View panoramas.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getPanningGesturesEnabled()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getPanningGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getpanninggesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getpanninggesturesenabled</a><br/>
     *
     * @return true if users are initially able to pan via gestures on Street View panoramas
     */
    public final java.lang.Boolean getPanningGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPanningGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPanningGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPanningGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPanningGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getPanoramaId() The initial panorama ID for the Street View panorama, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getPanoramaId()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getPanoramaId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-string-getpanoramaid">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-string-getpanoramaid</a><br/>
     *
     * @return The initial panorama ID for the Street View panorama, or null if unspecified
     */
    public final java.lang.String getPanoramaId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPanoramaId()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPanoramaId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPanoramaId()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPanoramaId();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getPosition() The initial position for the Street View panorama, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getPosition()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getPosition(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-latlng-getposition">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-latlng-getposition</a><br/>
     *
     * @return The initial position for the Street View panorama, or null if unspecified
     */
    public final org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPosition()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPosition()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getRadius() The initial radius used to search for a Street View panorama, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getRadius()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getRadius(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-integer-getradius">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-integer-getradius</a><br/>
     *
     * @return The initial radius used to search for a Street View panorama, or null if unspecified
     */
    public final java.lang.Integer getRadius() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getRadius()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getRadius();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getRadius()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getRadius();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getSource() The source filter used to search for a Street View panorama, or DEFAULT if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getSource()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getSource(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewsource-getsource">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewsource-getsource</a><br/>
     *
     * @return The source filter used to search for a Street View panorama, or DEFAULT if unspecified
     */
    public final org.xms.g.maps.model.StreetViewSource getSource() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getSource()");
            com.huawei.hms.maps.model.StreetViewSource hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getSource();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getSource()");
            com.google.android.gms.maps.model.StreetViewSource gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getSource();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getStreetNamesEnabled() true if users are initially able to see street names on Street View panoramas.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getStreetNamesEnabled()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getStreetNamesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getstreetnamesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getstreetnamesenabled</a><br/>
     *
     * @return true if users are initially able to see street names on Street View panoramas
     */
    public final java.lang.Boolean getStreetNamesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getStreetNamesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getStreetNamesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getStreetNamesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getStreetNamesEnabled();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getStreetViewPanoramaCamera() The initial camera for the Street View panorama, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getStreetViewPanoramaCamera()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getStreetViewPanoramaCamera(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramacamera-getstreetviewpanoramacamera">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramacamera-getstreetviewpanoramacamera</a><br/>
     *
     * @return The initial camera for the Street View panorama, or null if unspecified
     */
    public final org.xms.g.maps.model.StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getStreetViewPanoramaCamera()");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getStreetViewPanoramaCamera();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getStreetViewPanoramaCamera()");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getStreetViewPanoramaCamera();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getUseViewLifecycleInFragment() the useViewLifecycleInFragment option, or null if unspecified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getUseViewLifecycleInFragment()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getUseViewLifecycleInFragment(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getuseviewlifecycleinfragment">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getuseviewlifecycleinfragment</a><br/>
     *
     * @return the useViewLifecycleInFragment option, or null if unspecified
     */
    public final java.lang.Boolean getUseViewLifecycleInFragment() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getUseViewLifecycleInFragment()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getUseViewLifecycleInFragment();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getUseViewLifecycleInFragment()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getUseViewLifecycleInFragment();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getUserNavigationEnabled() true if users are initially able to move to different Street View panoramas.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getUserNavigationEnabled()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getUserNavigationEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getusernavigationenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getusernavigationenabled</a><br/>
     *
     * @return true if users are initially able to move to different Street View panoramas
     */
    public final java.lang.Boolean getUserNavigationEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getUserNavigationEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getUserNavigationEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getUserNavigationEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getUserNavigationEnabled();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.getZoomGesturesEnabled() true if users are initially able to zoom via gestures on Street View panoramas.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.getZoomGesturesEnabled()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.getZoomGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getzoomgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-boolean-getzoomgesturesenabled</a><br/>
     *
     * @return true if users are initially able to zoom via gestures on Street View panoramas
     */
    public final java.lang.Boolean getZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).getZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).getZoomGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.panningGesturesEnabled(boolean) Toggles the ability for users to use pan around on panoramas using gestures. See setPanningGesturesEnabled(boolean)for more details. The default is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.panningGesturesEnabled(boolean)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.panningGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-panninggesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-panninggesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions panningGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panningGesturesEnabled(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panningGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panningGesturesEnabled(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panningGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.panoramaCamera(org.xms.g.maps.model.StreetViewPanoramaCamera) Specifies the initial camera for the Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.panoramaCamera(com.huawei.hms.maps.model.StreetViewPanoramaCamera)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.panoramaCamera(com.google.android.gms.maps.model.StreetViewPanoramaCamera): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-panoramacamera-streetviewpanoramacamera-camera">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-panoramacamera-streetviewpanoramacamera-camera</a><br/>
     *
     * @param param0 the param should instanceof maps model StreetViewPanoramaCamera
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions panoramaCamera(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panoramaCamera(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panoramaCamera(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panoramaCamera(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panoramaCamera(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.panoramaId(java.lang.String) Specifies the initial position for the Street View panorama based on a panorama id. The position set by the panoramaID takes precedence over a position set by a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.panoramaId(java.lang.String)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.panoramaId(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-panoramaid-string-panoid">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-panoramaid-string-panoid</a><br/>
     *
     * @param param0 the param should instanceof java lang String
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions panoramaId(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panoramaId(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).panoramaId(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panoramaId(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).panoramaId(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.position(org.xms.g.maps.model.LatLng) Specifies the initial position for the Street View panorama based upon location. The position set by the panoramaID, if set, takes precedence over a position set by a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.position(com.huawei.hms.maps.model.LatLng)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.position(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-position-latlng-position">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-position-latlng-position</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions position(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.position(org.xms.g.maps.model.LatLng,java.lang.Integer,org.xms.g.maps.model.StreetViewSource) Specifies the initial position for the Street View panorama based upon location, radius and source. The position set by the panoramaID, if set, takes precedence over a position set by a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.position(com.huawei.hms.maps.model.LatLng,java.lang.Integer,com.huawei.hms.maps.model.StreetViewSource)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.position(com.google.android.gms.maps.model.LatLng,java.lang.Integer,com.google.android.gms.maps.model.StreetViewSource): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-position-latlng-position,-integer-radius,-streetviewsource-source">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-position-latlng-position,-integer-radius,-streetviewsource-source</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @param param1 the param should instanceof java lang Integer
     * @param param2 the param should instanceof maps model StreetViewSource
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions position(org.xms.g.maps.model.LatLng param0, java.lang.Integer param1, org.xms.g.maps.model.StreetViewSource param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))))");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))))");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.position(org.xms.g.maps.model.LatLng,java.lang.Integer) Specifies the initial position for the Street View panorama based upon location and radius. The position set by the panoramaID, if set, takes precedence over a position set by a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.position(com.huawei.hms.maps.model.LatLng,java.lang.Integer)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.position(com.google.android.gms.maps.model.LatLng,java.lang.Integer): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-position-latlng-position,-integer-radius">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-position-latlng-position,-integer-radius</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @param param1 the param should instanceof java lang Integer
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions position(org.xms.g.maps.model.LatLng param0, java.lang.Integer param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.position(org.xms.g.maps.model.LatLng,org.xms.g.maps.model.StreetViewSource) Specifies the initial position for the Street View panorama based upon location and source. The position set by the panoramaID, if set, takes precedence over a position set by a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.position(com.huawei.hms.maps.model.LatLng,com.huawei.hms.maps.model.StreetViewSource)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.position(com.google.android.gms.maps.model.LatLng,com.google.android.gms.maps.model.StreetViewSource): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-position-latlng-position,-streetviewsource-source">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-position-latlng-position,-streetviewsource-source</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @param param1 the param should instanceof maps model StreetViewSource
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions position(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.StreetViewSource param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))))");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))))");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.streetNamesEnabled(boolean) Toggles the ability for users to see street names on panoramas. See setStreetNamesEnabled(boolean)for more details. The default is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.streetNamesEnabled(boolean)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.streetNamesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-streetnamesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-streetnamesenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions streetNamesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).streetNamesEnabled(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).streetNamesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).streetNamesEnabled(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).streetNamesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.toString()
     * com.google.android.gms.maps.StreetViewPanoramaOptions.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.useViewLifecycleInFragment(boolean) When using a StreetViewPanoramaFragment, this flag specifies whether the lifecycle of the Street View panorama should be tied to the fragment's view or the fragment itself. The default value is false, tying the lifecycle of the Street View panorama to the fragment.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.useViewLifecycleInFragment(boolean)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.useViewLifecycleInFragment(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-useviewlifecycleinfragment-boolean-useviewlifecycleinfragment">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-useviewlifecycleinfragment-boolean-useviewlifecycleinfragment</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions useViewLifecycleInFragment(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).useViewLifecycleInFragment(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).useViewLifecycleInFragment(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).useViewLifecycleInFragment(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).useViewLifecycleInFragment(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.userNavigationEnabled(boolean) Toggles the ability for users to move between panoramas. See setUserNavigationEnabled(boolean)for more details. The default is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.userNavigationEnabled(boolean)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.userNavigationEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-usernavigationenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-usernavigationenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions userNavigationEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).userNavigationEnabled(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).userNavigationEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).userNavigationEnabled(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).userNavigationEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.writeToParcel(android.os.Parcel,int) write To Parcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanoramaOptions.zoomGesturesEnabled(boolean) Toggles the ability for users to zoom on panoramas using gestures. See setZoomGesturesEnabled(boolean)for more details. The default is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanoramaOptions.zoomGesturesEnabled(boolean)
     * com.google.android.gms.maps.StreetViewPanoramaOptions.zoomGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-zoomgesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanoramaOptions#public-streetviewpanoramaoptions-zoomgesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the return object is maps StreetViewPanoramaOptions
     */
    public final org.xms.g.maps.StreetViewPanoramaOptions zoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).zoomGesturesEnabled(param0)");
            com.huawei.hms.maps.StreetViewPanoramaOptions hReturn = ((com.huawei.hms.maps.StreetViewPanoramaOptions) this.getHInstance()).zoomGesturesEnabled(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).zoomGesturesEnabled(param0)");
            com.google.android.gms.maps.StreetViewPanoramaOptions gReturn = ((com.google.android.gms.maps.StreetViewPanoramaOptions) this.getGInstance()).zoomGesturesEnabled(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.StreetViewPanoramaOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
}