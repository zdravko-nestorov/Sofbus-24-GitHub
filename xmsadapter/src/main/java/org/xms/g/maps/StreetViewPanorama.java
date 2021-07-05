package org.xms.g.maps;

/**
 * This is the main class of the Street View feature in the Maps SDK for Android and is the entry point for all methods related to Street View panoramas.<br/>
 * Combination of com.huawei.hms.maps.StreetViewPanorama and com.google.android.gms.maps.StreetViewPanorama.<br/>
 * com.huawei.hms.maps.StreetViewPanorama: This is the main class of the Street View feature in the Huawei Maps SDK for Android and is the entry point for all methods related to Street View panoramas.<br/>
 * com.google.android.gms.maps.StreetViewPanorama: This is the main class of the Street View feature in the Google Maps SDK for Android and is the entry point for all methods related to Street View panoramas.<br/>
 */
public class StreetViewPanorama extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.StreetViewPanorama.StreetViewPanorama(org.xms.g.utils.XBox) constructor of StreetViewPanorama .<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is utils XBox
     */
    public StreetViewPanorama(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.StreetViewPanorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps StreetViewPanorama object
     */
    public static org.xms.g.maps.StreetViewPanorama dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.StreetViewPanorama) param0);
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama;
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.animateTo(org.xms.g.maps.model.StreetViewPanoramaCamera,long) Changes the current camera position, orientation and zoom, to a given position over a specified duration.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.animateTo(com.huawei.hms.maps.model.StreetViewPanoramaCamera,long)
     * com.google.android.gms.maps.StreetViewPanorama.animateTo(com.google.android.gms.maps.model.StreetViewPanoramaCamera,long): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-animateto-streetviewpanoramacamera-camera,-long-duration">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-animateto-streetviewpanoramacamera-camera,-long-duration</a><br/>
     *
     * @param param0 The length of time, in milliseconds, it takes to transition from the current camera position to the given one
     * @param param1 The camera position to animate to
     */
    public void animateTo(org.xms.g.maps.model.StreetViewPanoramaCamera param0, long param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).animateTo(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).animateTo(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))), param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).animateTo(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).animateTo(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))), param1);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.getLocation() Returns the current location of the user and information regarding the current panorama's adjacent panoramas.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.getLocation()
     * com.google.android.gms.maps.StreetViewPanorama.getLocation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramalocation-getlocation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramalocation-getlocation</a><br/>
     *
     * @return The current location of the user
     */
    public org.xms.g.maps.model.StreetViewPanoramaLocation getLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getLocation()");
            com.huawei.hms.maps.model.StreetViewPanoramaLocation hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getLocation();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getLocation()");
            com.google.android.gms.maps.model.StreetViewPanoramaLocation gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getLocation();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.getPanoramaCamera() Returns the current orientation and zoom.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.getPanoramaCamera()
     * com.google.android.gms.maps.StreetViewPanorama.getPanoramaCamera(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramacamera-getpanoramacamera">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramacamera-getpanoramacamera</a><br/>
     *
     * @return The current camera
     */
    public org.xms.g.maps.model.StreetViewPanoramaCamera getPanoramaCamera() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getPanoramaCamera()");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).getPanoramaCamera();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getPanoramaCamera()");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).getPanoramaCamera();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.isPanningGesturesEnabled() Returns whether or not the panning gestures are enabled for the user.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.isPanningGesturesEnabled()
     * com.google.android.gms.maps.StreetViewPanorama.isPanningGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled</a><br/>
     *
     * @return true if panning gestures are enabled
     */
    public boolean isPanningGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isPanningGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isPanningGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isPanningGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isPanningGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setPanningGesturesEnabled(boolean) Sets whether the user is able to use panning gestures.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPanningGesturesEnabled(boolean)
     * com.google.android.gms.maps.StreetViewPanorama.setPanningGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setpanninggesturesenabled-boolean-enablepanning">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setpanninggesturesenabled-boolean-enablepanning</a><br/>
     *
     * @param param0 true if users are allowed to use panning gestures
     */
    public void setPanningGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPanningGesturesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPanningGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPanningGesturesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPanningGesturesEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.isStreetNamesEnabled() Returns whether or not the street names appear on the panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.isStreetNamesEnabled()
     * com.google.android.gms.maps.StreetViewPanorama.isStreetNamesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled</a><br/>
     *
     * @return true if street names are shown
     */
    public boolean isStreetNamesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isStreetNamesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isStreetNamesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isStreetNamesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isStreetNamesEnabled();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setStreetNamesEnabled(boolean) Sets whether the user is able to see street names on panoramas.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setStreetNamesEnabled(boolean)
     * com.google.android.gms.maps.StreetViewPanorama.setStreetNamesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setstreetnamesenabled-boolean-enablestreetnames">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setstreetnamesenabled-boolean-enablestreetnames</a><br/>
     *
     * @param param0 true if users are able to see street names on panoramas
     */
    public void setStreetNamesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setStreetNamesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setStreetNamesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setStreetNamesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setStreetNamesEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.isUserNavigationEnabled() Returns whether or not the panning gestures are enabled for the user.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.isUserNavigationEnabled()
     * com.google.android.gms.maps.StreetViewPanorama.isUserNavigationEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-ispanninggesturesenabled</a><br/>
     *
     * @return true if navigation is enabled
     */
    public boolean isUserNavigationEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isUserNavigationEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isUserNavigationEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isUserNavigationEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isUserNavigationEnabled();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setUserNavigationEnabled(boolean) Sets whether the user is able to move to another panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setUserNavigationEnabled(boolean)
     * com.google.android.gms.maps.StreetViewPanorama.setUserNavigationEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setusernavigationenabled-boolean-enableusernavigation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setusernavigationenabled-boolean-enableusernavigation</a><br/>
     *
     * @param param0 true if users are allowed to move to another panorama
     */
    public void setUserNavigationEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setUserNavigationEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setUserNavigationEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setUserNavigationEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setUserNavigationEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.isZoomGesturesEnabled() Returns whether or not the zoom gestures are enabled for the user.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.isZoomGesturesEnabled()
     * com.google.android.gms.maps.StreetViewPanorama.isZoomGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-iszoomgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-boolean-iszoomgesturesenabled</a><br/>
     *
     * @return true if zoom gestures are enabled
     */
    public boolean isZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).isZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).isZoomGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setZoomGesturesEnabled(boolean) Sets whether the user is able to use zoom gestures.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setZoomGesturesEnabled(boolean)
     * com.google.android.gms.maps.StreetViewPanorama.setZoomGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setzoomgesturesenabled-boolean-enablezoom">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setzoomgesturesenabled-boolean-enablezoom</a><br/>
     *
     * @param param0 true if users are allowed to use zoom gestures
     */
    public void setZoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setZoomGesturesEnabled(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setZoomGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setZoomGesturesEnabled(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setZoomGesturesEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.orientationToPoint(org.xms.g.maps.model.StreetViewPanoramaOrientation) Returns a screen location that corresponds to an orientation(StreetViewPanoramaOrientation). The screen location is in screen pixels(not display pixels)relative to the top left of the Street View panorama(not of the whole screen).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.orientationToPoint(com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
     * com.google.android.gms.maps.StreetViewPanorama.orientationToPoint(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-point-orientationtopoint-streetviewpanoramaorientation-orientation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-point-orientationtopoint-streetviewpanoramaorientation-orientation</a><br/>
     *
     * @param param0 A StreetViewPanoramaOrientation on the Street View panorama to convert to a screen location
     * @return A Point representing the screen location in screen pixels. Returns null if the orientation is unable to be projected on the screen (e.g. behind the user's field of view)
     */
    public android.graphics.Point orientationToPoint(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).orientationToPoint(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).orientationToPoint(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).orientationToPoint(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).orientationToPoint(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.pointToOrientation(android.graphics.Point) Returns the orientation that corresponds to a screen location. The screen location is specified in screen pixels(not display pixels)relative to the top left of the Street View panorama(not the top left of the whole screen).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.pointToOrientation(android.graphics.Point)
     * com.google.android.gms.maps.StreetViewPanorama.pointToOrientation(android.graphics.Point): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramaorientation-pointtoorientation-point-point">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-streetviewpanoramaorientation-pointtoorientation-point-point</a><br/>
     *
     * @param param0 A Point on the screen in screen pixels
     * @return The StreetViewPanoramaOrientation corresponding to the point on the screen, or null if the Street View panorama has not been initialized or if the given point is not a valid point on the screen
     */
    public org.xms.g.maps.model.StreetViewPanoramaOrientation pointToOrientation(android.graphics.Point param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).pointToOrientation(param0)");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).pointToOrientation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).pointToOrientation(param0)");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).pointToOrientation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setOnStreetViewPanoramaCameraChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) Sets a callback that's invoked when the camera changes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramacamerachangelistener-streetviewpanorama.onstreetviewpanoramacamerachangelistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramacamerachangelistener-streetviewpanorama.onstreetviewpanoramacamerachangelistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when the camera changes. To unset the callback, use null
     */
    public void setOnStreetViewPanoramaCameraChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaCameraChangeListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaCameraChangeListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaCameraChangeListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaCameraChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaCameraChangeListener())));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setOnStreetViewPanoramaChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) Sets a callback that's invoked when the panorama changes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramachangelistener-streetviewpanorama.onstreetviewpanoramachangelistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramachangelistener-streetviewpanorama.onstreetviewpanoramachangelistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when the panorama changes. To unset the callback, use null
     */
    public void setOnStreetViewPanoramaChangeListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaChangeListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaChangeListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaChangeListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaChangeListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaChangeListener())));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setOnStreetViewPanoramaClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) Sets a callback that's invoked when the panorama is tapped.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramaclicklistener-streetviewpanorama.onstreetviewpanoramaclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramaclicklistener-streetviewpanorama.onstreetviewpanoramaclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when the panorama is tapped. To unset the callback, use null
     */
    public void setOnStreetViewPanoramaClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaClickListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaClickListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaClickListener())));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setOnStreetViewPanoramaLongClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) Sets a callback that's invoked when the panorama is long-pressed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.StreetViewPanorama.setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramalongclicklistener-streetviewpanorama.onstreetviewpanoramalongclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-final-void-setonstreetviewpanoramalongclicklistener-streetviewpanorama.onstreetviewpanoramalongclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when the panorama is long-pressed. To unset the callback, use null
     */
    public void setOnStreetViewPanoramaLongClickListener(org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaLongClickListener())))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getHInstanceOnStreetViewPanoramaLongClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaLongClickListener())))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setOnStreetViewPanoramaLongClickListener(((param0) == null ? null : (param0.getGInstanceOnStreetViewPanoramaLongClickListener())));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng,org.xms.g.maps.model.StreetViewSource) Sets the StreetViewPanorama to a given location.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition(com.huawei.hms.maps.model.LatLng,com.huawei.hms.maps.model.StreetViewSource)
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(com.google.android.gms.maps.model.LatLng,com.google.android.gms.maps.model.StreetViewSource): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-streetviewsource-source">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-streetviewsource-source</a><br/>
     *
     * @param param0 the param should be instanceof maps model LatLng
     * @param param1 the param should be instanceof maps model StreetViewSource
     */
    public void setPosition(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.StreetViewSource param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.StreetViewSource) ((param1) == null ? null : (param1.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng) Sets the StreetViewPanorama to a given location.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition(com.huawei.hms.maps.model.LatLng)
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position</a><br/>
     *
     * @param param0 the param should be instanceof maps model LatLng
     */
    public void setPosition(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng,int) Sets the StreetViewPanorama to a given location.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition(com.huawei.hms.maps.model.LatLng,int)
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(com.google.android.gms.maps.model.LatLng,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-int-radius">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-int-radius</a><br/>
     *
     * @param param0 the param should be instanceof maps model LatLng
     * @param param1 the param should be instanceof int
     */
    public void setPosition(org.xms.g.maps.model.LatLng param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(org.xms.g.maps.model.LatLng,int,org.xms.g.maps.model.StreetViewSource) Sets the StreetViewPanorama to a given location.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition(com.huawei.hms.maps.model.LatLng,int,com.huawei.hms.maps.model.StreetViewSource)
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(com.google.android.gms.maps.model.LatLng,int,com.google.android.gms.maps.model.StreetViewSource): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-int-radius,-streetviewsource-source">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-latlng-position,-int-radius,-streetviewsource-source</a><br/>
     *
     * @param param0 the param should be instanceof maps model LatLng
     * @param param1 the param should be instanceof int
     * @param param2 the param should be instanceof maps model StreetViewSource
     */
    public void setPosition(org.xms.g.maps.model.LatLng param0, int param1, org.xms.g.maps.model.StreetViewSource param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))))");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, ((com.huawei.hms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))))");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, ((com.google.android.gms.maps.model.StreetViewSource) ((param2) == null ? null : (param2.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.StreetViewPanorama.setPosition(java.lang.String) Sets the StreetViewPanorama to a given location.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.StreetViewPanorama.setPosition(java.lang.String)
     * com.google.android.gms.maps.StreetViewPanorama.setPosition(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-string-panoid">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama#public-void-setposition-string-panoid</a><br/>
     *
     * @param param0 Panorama ID of the desired location
     */
    public void setPosition(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(param0)");
            ((com.huawei.hms.maps.StreetViewPanorama) this.getHInstance()).setPosition(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(param0)");
            ((com.google.android.gms.maps.StreetViewPanorama) this.getGInstance()).setPosition(param0);
        }
    }

    /**
     * A listener for when the StreetViewPanoramaCamera changes.<br/>
     * Combination of com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener and com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.<br/>
     * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener: A listener for when the StreetViewPanoramaCamera changes.<br/>
     * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener: A listener for when the StreetViewPanoramaCamera changes.<br/>
     */
    public static interface OnStreetViewPanoramaCameraChangeListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps StreetViewPanorama OnStreetViewPanoramaCameraChangeListener object
         */
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) param0);
        }

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener;
        }

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(org.xms.g.maps.model.StreetViewPanoramaCamera) Called when the user makes changes to the camera on the panorama or if the camera is changed programmatically. Implementations of this method are always invoked on the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(com.huawei.hms.maps.model.StreetViewPanoramaCamera)
         * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(com.google.android.gms.maps.model.StreetViewPanoramaCamera): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener#public-abstract-void-onstreetviewpanoramacamerachange-streetviewpanoramacamera-camera">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener#public-abstract-void-onstreetviewpanoramacamerachange-streetviewpanoramacamera-camera</a><br/>
         *
         * @param param0 The position the camera has changed to
         */
        public void onStreetViewPanoramaCameraChange(org.xms.g.maps.model.StreetViewPanoramaCamera param0);

        default java.lang.Object getZInstanceOnStreetViewPanoramaCameraChangeListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnStreetViewPanoramaCameraChangeListener();
            } else {
                return getGInstanceOnStreetViewPanoramaCameraChangeListener();
            }
        }

        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener getGInstanceOnStreetViewPanoramaCameraChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() {

                public void onStreetViewPanoramaCameraChange(com.google.android.gms.maps.model.StreetViewPanoramaCamera param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.this.onStreetViewPanoramaCameraChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener getHInstanceOnStreetViewPanoramaCameraChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener() {

                public void onStreetViewPanoramaCameraChange(com.huawei.hms.maps.model.StreetViewPanoramaCamera param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.this.onStreetViewPanoramaCameraChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * A listener for when the StreetViewPanoramaCamera changes.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener: A listener for when the StreetViewPanoramaCamera changes.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener {

            /**
             * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.XImpl.onStreetViewPanoramaCameraChange(org.xms.g.maps.model.StreetViewPanoramaCamera) Called when the user makes changes to the camera on the panorama or if the camera is changed programmatically. Implementations of this method are always invoked on the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(com.huawei.hms.maps.model.StreetViewPanoramaCamera)
             * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener.onStreetViewPanoramaCameraChange(com.google.android.gms.maps.model.StreetViewPanoramaCamera): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener#public-abstract-void-onstreetviewpanoramacamerachange-streetviewpanoramacamera-camera">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener#public-abstract-void-onstreetviewpanoramacamerachange-streetviewpanoramacamera-camera</a><br/>
             *
             * @param param0 The position the camera has changed to
             */
            public void onStreetViewPanoramaCameraChange(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getHInstance()).onStreetViewPanoramaCameraChange(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getHInstance()).onStreetViewPanoramaCameraChange(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getGInstance()).onStreetViewPanoramaCameraChange(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener) this.getGInstance()).onStreetViewPanoramaCameraChange(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * A listener for when the Street View panorama loads a new panorama.<br/>
     * Combination of com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener and com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.<br/>
     * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener: A listener for when the Street View panorama loads a new panorama.<br/>
     * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener: A listener for when the Street View panorama loads a new panorama.<br/>
     */
    public static interface OnStreetViewPanoramaChangeListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps StreetViewPanorama OnStreetViewPanoramaChangeListener object
         */
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) param0);
        }

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener;
        }

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.onStreetViewPanoramaChange(org.xms.g.maps.model.StreetViewPanoramaLocation) The StreetViewPanorama performs an animated transition from one location to another when the user performs a manual navigation action. This callback is called when the transition animation has occurred and the rendering of the first panorama has occurred. This callback also occurs when the developer sets a position and the rendering of the first panorama has occurred. It is possible that not all the panoramas have loaded when this callback is activated. Implementations of this method are always invoked on the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.onStreetViewPanoramaChange(com.huawei.hms.maps.model.StreetViewPanoramaLocation)
         * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.onStreetViewPanoramaChange(com.google.android.gms.maps.model.StreetViewPanoramaLocation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaChangeListener#public-abstract-void-onstreetviewpanoramachange-streetviewpanoramalocation-location">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaChangeListener#public-abstract-void-onstreetviewpanoramachange-streetviewpanoramalocation-location</a><br/>
         *
         * @param param0 Location the StreetViewPanorama is changed to. null if it is an invalid panorama
         */
        public void onStreetViewPanoramaChange(org.xms.g.maps.model.StreetViewPanoramaLocation param0);

        default java.lang.Object getZInstanceOnStreetViewPanoramaChangeListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnStreetViewPanoramaChangeListener();
            } else {
                return getGInstanceOnStreetViewPanoramaChangeListener();
            }
        }

        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener getGInstanceOnStreetViewPanoramaChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener() {

                public void onStreetViewPanoramaChange(com.google.android.gms.maps.model.StreetViewPanoramaLocation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.this.onStreetViewPanoramaChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener getHInstanceOnStreetViewPanoramaChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener() {

                public void onStreetViewPanoramaChange(com.huawei.hms.maps.model.StreetViewPanoramaLocation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.this.onStreetViewPanoramaChange(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaLocation(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * A listener for when the Street View panorama loads a new panorama.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener: A listener for when the Street View panorama loads a new panorama.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener {

            /**
             * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.XImpl.onStreetViewPanoramaChange(org.xms.g.maps.model.StreetViewPanoramaLocation) The StreetViewPanorama performs an animated transition from one location to another when the user performs a manual navigation action. This callback is called when the transition animation has occurred and the rendering of the first panorama has occurred. This callback also occurs when the developer sets a position and the rendering of the first panorama has occurred. It is possible that not all the panoramas have loaded when this callback is activated. Implementations of this method are always invoked on the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.onStreetViewPanoramaChange(com.huawei.hms.maps.model.StreetViewPanoramaLocation)
             * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener.onStreetViewPanoramaChange(com.google.android.gms.maps.model.StreetViewPanoramaLocation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaChangeListener#public-abstract-void-onstreetviewpanoramachange-streetviewpanoramalocation-location">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaChangeListener#public-abstract-void-onstreetviewpanoramachange-streetviewpanoramalocation-location</a><br/>
             *
             * @param param0 Location the StreetViewPanorama is changed to. null if it is an invalid panorama
             */
            public void onStreetViewPanoramaChange(org.xms.g.maps.model.StreetViewPanoramaLocation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getHInstance()).onStreetViewPanoramaChange(((com.huawei.hms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getHInstance()).onStreetViewPanoramaChange(((com.huawei.hms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getGInstance()).onStreetViewPanoramaChange(((com.google.android.gms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener) this.getGInstance()).onStreetViewPanoramaChange(((com.google.android.gms.maps.model.StreetViewPanoramaLocation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when the user taps on the panorama.<br/>
     * Combination of com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener and com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.<br/>
     * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener: Callback interface for when the user taps on the panorama.<br/>
     * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener: Callback interface for when the user taps on the panorama.<br/>
     */
    public static interface OnStreetViewPanoramaClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps StreetViewPanorama OnStreetViewPanoramaClickListener object
         */
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) param0);
        }

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener;
        }

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.onStreetViewPanoramaClick(org.xms.g.maps.model.StreetViewPanoramaOrientation) Called when the user makes a tap gesture on the panorama, but only if none of the overlays of the panorama handled the gesture. Implementations of this method are always invoked on the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.onStreetViewPanoramaClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
         * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.onStreetViewPanoramaClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaClickListener#public-abstract-void-onstreetviewpanoramaclick-streetviewpanoramaorientation-orientation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaClickListener#public-abstract-void-onstreetviewpanoramaclick-streetviewpanoramaorientation-orientation</a><br/>
         *
         * @param param0 The tilt and bearing values corresponding to the point on the screen where the user tapped. These values have an absolute value within a specific panorama, and are independent of the current orientation of the camera
         */
        public void onStreetViewPanoramaClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0);

        default java.lang.Object getZInstanceOnStreetViewPanoramaClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnStreetViewPanoramaClickListener();
            } else {
                return getGInstanceOnStreetViewPanoramaClickListener();
            }
        }

        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener getGInstanceOnStreetViewPanoramaClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener() {

                public void onStreetViewPanoramaClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.this.onStreetViewPanoramaClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener getHInstanceOnStreetViewPanoramaClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener() {

                public void onStreetViewPanoramaClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.this.onStreetViewPanoramaClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for when the user taps on the panorama.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener: Callback interface for when the user taps on the panorama.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener {

            /**
             * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.XImpl.onStreetViewPanoramaClick(org.xms.g.maps.model.StreetViewPanoramaOrientation) Called when the user makes a tap gesture on the panorama, but only if none of the overlays of the panorama handled the gesture. Implementations of this method are always invoked on the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.onStreetViewPanoramaClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
             * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener.onStreetViewPanoramaClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaClickListener#public-abstract-void-onstreetviewpanoramaclick-streetviewpanoramaorientation-orientation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaClickListener#public-abstract-void-onstreetviewpanoramaclick-streetviewpanoramaorientation-orientation</a><br/>
             *
             * @param param0 The tilt and bearing values corresponding to the point on the screen where the user tapped. These values have an absolute value within a specific panorama, and are independent of the current orientation of the camera
             */
            public void onStreetViewPanoramaClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getHInstance()).onStreetViewPanoramaClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getHInstance()).onStreetViewPanoramaClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getGInstance()).onStreetViewPanoramaClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener) this.getGInstance()).onStreetViewPanoramaClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when the user long presses on the panorama.<br/>
     * Combination of com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener and com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.<br/>
     * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener: Callback interface for when the user long presses on the panorama.<br/>
     * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener: Callback interface for when the user long presses on the panorama.<br/>
     */
    public static interface OnStreetViewPanoramaLongClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps StreetViewPanorama OnStreetViewPanoramaLongClickListener object
         */
        public static org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) param0);
        }

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener;
        }

        /**
         * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(org.xms.g.maps.model.StreetViewPanoramaOrientation) Called when the user makes a long-press gesture on the panorama, but only if none of the overlays of the panorama handled the gesture. Implementations of this method are always invoked on the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
         * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaLongClickListener#public-abstract-void-onstreetviewpanoramalongclick-streetviewpanoramaorientation-orientation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaLongClickListener#public-abstract-void-onstreetviewpanoramalongclick-streetviewpanoramaorientation-orientation</a><br/>
         *
         * @param param0 The tilt and bearing values corresponding to the point on the screen where the user long-pressed. These values have an absolute value within a specific panorama, and are independent of the current orientation of the camera
         */
        public void onStreetViewPanoramaLongClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0);

        default java.lang.Object getZInstanceOnStreetViewPanoramaLongClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnStreetViewPanoramaLongClickListener();
            } else {
                return getGInstanceOnStreetViewPanoramaLongClickListener();
            }
        }

        default com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener getGInstanceOnStreetViewPanoramaLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener() {

                public void onStreetViewPanoramaLongClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.this.onStreetViewPanoramaLongClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener getHInstanceOnStreetViewPanoramaLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener() {

                public void onStreetViewPanoramaLongClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation param0) {
                    org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.this.onStreetViewPanoramaLongClick(((param0) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for when the user long presses on the panorama.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener: Callback interface for when the user long presses on the panorama.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener {

            /**
             * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.XImpl.onStreetViewPanoramaLongClick(org.xms.g.maps.model.StreetViewPanoramaOrientation) Called when the user makes a long-press gesture on the panorama, but only if none of the overlays of the panorama handled the gesture. Implementations of this method are always invoked on the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
             * com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener.onStreetViewPanoramaLongClick(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaLongClickListener#public-abstract-void-onstreetviewpanoramalongclick-streetviewpanoramaorientation-orientation">https://developers.google.com/android/reference/com/google/android/gms/maps/StreetViewPanorama.OnStreetViewPanoramaLongClickListener#public-abstract-void-onstreetviewpanoramalongclick-streetviewpanoramaorientation-orientation</a><br/>
             *
             * @param param0 The tilt and bearing values corresponding to the point on the screen where the user long-pressed. These values have an absolute value within a specific panorama, and are independent of the current orientation of the camera
             */
            public void onStreetViewPanoramaLongClick(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getHInstance()).onStreetViewPanoramaLongClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getHInstance()).onStreetViewPanoramaLongClick(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getGInstance()).onStreetViewPanoramaLongClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener) this.getGInstance()).onStreetViewPanoramaLongClick(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }
}