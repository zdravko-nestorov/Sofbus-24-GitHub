package org.xms.g.maps;

/**
 * Settings for the user interface of a Map.<br/>
 * Combination of com.huawei.hms.maps.UiSettings and com.google.android.gms.maps.UiSettings.<br/>
 * com.huawei.hms.maps.UiSettings: Sets the built-in UI and gesture controls of a map.<br/>
 * com.google.android.gms.maps.UiSettings: Settings for the user interface of a GoogleMap. To obtain this interface, call getUiSettings().<br/>
 */
public final class UiSettings extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.UiSettings.UiSettings(org.xms.g.utils.XBox) constructor of UiSettings.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is utils XBox
     */
    public UiSettings(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.UiSettings.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.UiSettings.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps UiSettings object
     */
    public static org.xms.g.maps.UiSettings dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.UiSettings) param0);
    }

    /**
     * org.xms.g.maps.UiSettings.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.UiSettings;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.UiSettings;
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isCompassEnabled() Gets whether the compass is enabled/disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isCompassEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isCompassEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isCompassEnabled()</a><br/>
     * com.google.android.gms.maps.UiSettings.isCompassEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-iscompassenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-iscompassenabled</a><br/>
     *
     * @return true if the compass is enabled; false if the compass is disabled
     */
    public final boolean isCompassEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isCompassEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isCompassEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isCompassEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isCompassEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setCompassEnabled(boolean) Enables or disables the compass. The compass is an icon on the map that indicates the direction of north on the map. If enabled, it is only shown when the camera is tilted or rotated away from its default orientation(tilt of 0 and a bearing of 0). When a user clicks the compass, the camera orients itself to its default orientation and fades away shortly after. If disabled, the compass will never be displayed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setCompassEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setCompassEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setCompassEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setCompassEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setcompassenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setcompassenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable the compass; false to disable the compass
     */
    public final void setCompassEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setCompassEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setCompassEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setCompassEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setCompassEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isIndoorLevelPickerEnabled() Gets whether the indoor level picker is enabled/disabled. That is, whether the level picker will appear when a building with indoor maps is focused.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isIndoorLevelPickerEnabled()
     * com.google.android.gms.maps.UiSettings.isIndoorLevelPickerEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-isindoorlevelpickerenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-isindoorlevelpickerenabled</a><br/>
     *
     * @return true if the level picker is enabled; false if the level picker is disabled
     */
    public final boolean isIndoorLevelPickerEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isIndoorLevelPickerEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isIndoorLevelPickerEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isIndoorLevelPickerEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isIndoorLevelPickerEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setIndoorLevelPickerEnabled(boolean) Sets whether the indoor level picker is enabled when indoor mode is enabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setIndoorLevelPickerEnabled(boolean)
     * com.google.android.gms.maps.UiSettings.setIndoorLevelPickerEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setindoorlevelpickerenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setindoorlevelpickerenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to show; false to hide the level picker
     */
    public final void setIndoorLevelPickerEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setIndoorLevelPickerEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setIndoorLevelPickerEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setIndoorLevelPickerEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setIndoorLevelPickerEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isMapToolbarEnabled() Gets whether the Map Toolbar is enabled/disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isMapToolbarEnabled()
     * com.google.android.gms.maps.UiSettings.isMapToolbarEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-ismaptoolbarenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-ismaptoolbarenabled</a><br/>
     *
     * @return true if the Map Toolbar is enabled; false otherwise
     */
    public final boolean isMapToolbarEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isMapToolbarEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isMapToolbarEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isMapToolbarEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isMapToolbarEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setMapToolbarEnabled(boolean) Sets the preference for whether the Map Toolbar should be enabled or disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setMapToolbarEnabled(boolean)
     * com.google.android.gms.maps.UiSettings.setMapToolbarEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setmaptoolbarenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setmaptoolbarenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable the Map Toolbar; false to disable the Map Toolbar
     */
    public final void setMapToolbarEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setMapToolbarEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setMapToolbarEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setMapToolbarEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setMapToolbarEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isMyLocationButtonEnabled() Gets whether the my-location button is enabled/disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isMyLocationButtonEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isMyLocationButtonEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isMyLocationButtonEnabled()</a><br/>
     * com.google.android.gms.maps.UiSettings.isMyLocationButtonEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-ismylocationbuttonenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-ismylocationbuttonenabled</a><br/>
     *
     * @return true if the my-location button is enabled; false if the my-location button is disabled
     */
    public final boolean isMyLocationButtonEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isMyLocationButtonEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isMyLocationButtonEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isMyLocationButtonEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isMyLocationButtonEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setMyLocationButtonEnabled(boolean) Enables or disables the my-location button. The my-location button causes the camera to move such that the user's location is in the center of the map. If the button is enabled, it is only shown when the my-location layer is enabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setMyLocationButtonEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setMyLocationButtonEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setMyLocationButtonEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setMyLocationButtonEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setmylocationbuttonenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setmylocationbuttonenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable the my-location button; false to disable the my-location button
     */
    public final void setMyLocationButtonEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setMyLocationButtonEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setMyLocationButtonEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setMyLocationButtonEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setMyLocationButtonEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isRotateGesturesEnabled() Gets whether rotate gestures are enabled/disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isRotateGesturesEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isRotateGesturesEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isRotateGesturesEnabled()</a><br/>
     * com.google.android.gms.maps.UiSettings.isRotateGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-isrotategesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-isrotategesturesenabled</a><br/>
     *
     * @return true if rotate gestures are enabled; false if rotate gestures are disabled
     */
    public final boolean isRotateGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isRotateGesturesEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isRotateGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isRotateGesturesEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isRotateGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setRotateGesturesEnabled(boolean) Sets the preference for whether rotate gestures should be enabled or disabled. If enabled, users can use a two-finger rotate gesture to rotate the camera. If disabled, users cannot rotate the camera via gestures. This setting doesn't restrict the user from tapping the compass icon to reset the camera orientation, nor does it restrict programmatic movements and animation of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setRotateGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setRotateGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setRotateGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setRotateGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setrotategesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setrotategesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable rotate; false to disable rotate gestures
     */
    public final void setRotateGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setRotateGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setRotateGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setRotateGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setRotateGesturesEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isScrollGesturesEnabled() Gets whether scroll gestures are enabled/disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isScrollGesturesEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isScrollGesturesEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isScrollGesturesEnabled()</a><br/>
     * com.google.android.gms.maps.UiSettings.isScrollGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-isscrollgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-isscrollgesturesenabled</a><br/>
     *
     * @return true if scroll gestures are enabled; false if scroll gestures are disabled
     */
    public final boolean isScrollGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isScrollGesturesEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isScrollGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isScrollGesturesEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isScrollGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setScrollGesturesEnabled(boolean) Sets the preference for whether scroll gestures should be enabled or disabled. If enabled, users can swipe to pan the camera. If disabled, swiping has no effect. This setting doesn't restrict programmatic movement and animation of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setScrollGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setScrollGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setScrollGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setScrollGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setscrollgesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setscrollgesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable scroll gestures; false to disable scroll gestures
     */
    public final void setScrollGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setScrollGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setScrollGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setScrollGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setScrollGesturesEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isScrollGesturesEnabledDuringRotateOrZoom() Gets whether scroll gestures are enabled/disabled during rotation and zoom gestures.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isScrollGesturesEnabledDuringRotateOrZoom(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isScrollGesturesEnabledDuringRotateOrZoom()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isScrollGesturesEnabledDuringRotateOrZoom()</a><br/>
     * com.google.android.gms.maps.UiSettings.isScrollGesturesEnabledDuringRotateOrZoom(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-isscrollgesturesenabledduringrotateorzoom">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-isscrollgesturesenabledduringrotateorzoom</a><br/>
     *
     * @return true if scroll gestures are enabled during rotate or zoom gestures; false if scroll gestures are disabled during rotate or zoom gestures
     */
    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isScrollGesturesEnabledDuringRotateOrZoom()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isScrollGesturesEnabledDuringRotateOrZoom();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isScrollGesturesEnabledDuringRotateOrZoom()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isScrollGesturesEnabledDuringRotateOrZoom();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setScrollGesturesEnabledDuringRotateOrZoom(boolean) Sets the preference for whether scroll gestures can take place at the same time as a zoom or rotate gesture. If enabled, users can scroll the map while rotating or zooming the map. If disabled, the map cannot be scrolled while the user rotates or zooms the map using gestures. This setting doesn't disable scroll gestures entirely, only during rotation and zoom gestures, nor does it restrict programmatic movements and animation of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setScrollGesturesEnabledDuringRotateOrZoom(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setScrollGesturesEnabledDuringRotateOrZoom(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setScrollGesturesEnabledDuringRotateOrZoom(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setScrollGesturesEnabledDuringRotateOrZoom(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setscrollgesturesenabledduringrotateorzoom-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setscrollgesturesenabledduringrotateorzoom-boolean-enabled</a><br/>
     *
     * @param param0 true to enable scroll gestures during rotate or zoom gestures; false to disable scroll gestures during rotate or zoom gestures
     */
    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setScrollGesturesEnabledDuringRotateOrZoom(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setScrollGesturesEnabledDuringRotateOrZoom(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setScrollGesturesEnabledDuringRotateOrZoom(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setScrollGesturesEnabledDuringRotateOrZoom(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isTiltGesturesEnabled() Gets whether tilt gestures are enabled/disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isTiltGesturesEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isTiltGesturesEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isTiltGesturesEnabled()</a><br/>
     * com.google.android.gms.maps.UiSettings.isTiltGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-istiltgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-istiltgesturesenabled</a><br/>
     *
     * @return true if tilt gestures are enabled; false if tilt gestures are disabled
     */
    public final boolean isTiltGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isTiltGesturesEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isTiltGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isTiltGesturesEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isTiltGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setTiltGesturesEnabled(boolean) Sets the preference for whether tilt gestures should be enabled or disabled. If enabled, users can use a two-finger vertical down swipe to tilt the camera. If disabled, users cannot tilt the camera via gestures. This setting doesn't restrict users from tapping the compass icon to reset the camera orientation, nor does it restrict programmatic movement and animation of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setTiltGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setTiltGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setTiltGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setTiltGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-settiltgesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-settiltgesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable tilt gestures; false to disable tilt gestures
     */
    public final void setTiltGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setTiltGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setTiltGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setTiltGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setTiltGesturesEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isZoomControlsEnabled() Gets whether the zoom controls are enabled/disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isZoomControlsEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isZoomControlsEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isZoomControlsEnabled()</a><br/>
     * com.google.android.gms.maps.UiSettings.isZoomControlsEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-iszoomcontrolsenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-iszoomcontrolsenabled</a><br/>
     *
     * @return true if the zoom controls are enabled; false if the zoom controls are disabled;
     */
    public final boolean isZoomControlsEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isZoomControlsEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isZoomControlsEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isZoomControlsEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isZoomControlsEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setZoomControlsEnabled(boolean) Enables or disables the zoom controls. If enabled, the zoom controls are a pair of buttons(one for zooming in, one for zooming out)that appear on the screen. When pressed, they cause the camera to zoom in(or out)by one zoom level. If disabled, the zoom controls are not shown.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setZoomControlsEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setZoomControlsEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setZoomControlsEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setZoomControlsEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setzoomcontrolsenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setzoomcontrolsenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable the zoom controls; false to disable the zoom controls
     */
    public final void setZoomControlsEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setZoomControlsEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setZoomControlsEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setZoomControlsEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setZoomControlsEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.isZoomGesturesEnabled() Gets whether zoom gestures are enabled/disabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.isZoomGesturesEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isZoomGesturesEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#isZoomGesturesEnabled()</a><br/>
     * com.google.android.gms.maps.UiSettings.isZoomGesturesEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-iszoomgesturesenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-boolean-iszoomgesturesenabled</a><br/>
     *
     * @return true if zoom gestures are enabled; false if zoom gestures are disabled
     */
    public final boolean isZoomGesturesEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).isZoomGesturesEnabled()");
            return ((com.huawei.hms.maps.UiSettings) this.getHInstance()).isZoomGesturesEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).isZoomGesturesEnabled()");
            return ((com.google.android.gms.maps.UiSettings) this.getGInstance()).isZoomGesturesEnabled();
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setZoomGesturesEnabled(boolean) Sets the preference for whether zoom gestures should be enabled or disabled. If enabled, users can either double tap/two-finger tap or pinch to zoom the camera. If disabled, these gestures have no effect. This setting doesn't affect the zoom buttons, nor does it restrict programmatic movement and animation of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setZoomGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setZoomGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setZoomGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setZoomGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setzoomgesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setzoomgesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable zoom gestures; false to disable zoom gestures
     */
    public final void setZoomGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setZoomGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setZoomGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setZoomGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setZoomGesturesEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.UiSettings.setAllGesturesEnabled(boolean) Sets the preference for whether all gestures should be enabled or disabled. If enabled, all gestures are available; otherwise, all gestures are disabled. This doesn't restrict users from tapping any on screen buttons to move the camera(e.g., compass or zoom controls), nor does it restrict programmatic movements and animation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.UiSettings.setAllGesturesEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setAllGesturesEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-uisettings#setAllGesturesEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.UiSettings.setAllGesturesEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setallgesturesenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/UiSettings#public-void-setallgesturesenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable all gestures; false to disable all gestures
     */
    public final void setAllGesturesEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.UiSettings) this.getHInstance()).setAllGesturesEnabled(param0)");
            ((com.huawei.hms.maps.UiSettings) this.getHInstance()).setAllGesturesEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.UiSettings) this.getGInstance()).setAllGesturesEnabled(param0)");
            ((com.google.android.gms.maps.UiSettings) this.getGInstance()).setAllGesturesEnabled(param0);
        }
    }
}