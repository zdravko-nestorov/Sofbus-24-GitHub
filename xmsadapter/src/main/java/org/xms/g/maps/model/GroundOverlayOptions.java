package org.xms.g.maps.model;

/**
 * Defines options for a ground overlay.<br/>
 * Combination of com.huawei.hms.maps.model.GroundOverlayOptions and com.google.android.gms.maps.model.GroundOverlayOptions.<br/>
 * com.huawei.hms.maps.model.GroundOverlayOptions: Defines attributes for a ground overlay.<br/>
 * com.google.android.gms.maps.model.GroundOverlayOptions: Defines options for a ground overlay.<br/>
 */
public final class GroundOverlayOptions extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.GroundOverlayOptions(org.xms.g.utils.XBox) Defines options for a ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.GroundOverlayOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/groundoverlayoptions-0000001050152689-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/groundoverlayoptions-0000001050152689-V5</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.GroundOverlayOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public GroundOverlayOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.GroundOverlayOptions() Defines options for a ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.GroundOverlayOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/groundoverlayoptions-0000001050152689-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/groundoverlayoptions-0000001050152689-V5</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.GroundOverlayOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions</a><br/>
     */
    public GroundOverlayOptions() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.GroundOverlayOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.GroundOverlayOptions());
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getNO_DIMENSION() Flag for when no dimension is specified for the height.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.NO_DIMENSION
     * com.google.android.gms.maps.model.GroundOverlayOptions.NO_DIMENSION: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-static-final-float-no_dimension">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-static-final-float-no_dimension</a><br/>
     *
     * @return the return object is float
     */
    public static float getNO_DIMENSION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.GroundOverlayOptions.NO_DIMENSION");
            return com.huawei.hms.maps.model.GroundOverlayOptions.NO_DIMENSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.GroundOverlayOptions.NO_DIMENSION");
            return com.google.android.gms.maps.model.GroundOverlayOptions.NO_DIMENSION;
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.GroundOverlayOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model GroundOverlayOptions object
     */
    public static org.xms.g.maps.model.GroundOverlayOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.GroundOverlayOptions) param0);
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.GroundOverlayOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.GroundOverlayOptions;
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.anchor(float,float) Specifies the anchor.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.anchor(float,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#anchor(float,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#anchor(float,float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.anchor(float,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-anchor-float-u,-float-v">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-anchor-float-u,-float-v</a><br/>
     *
     * @param param0 u-coordinate of the anchor
     * @param param1 v-coordinate of the anchor
     * @return this GroundOverlayOptions object with a new anchor set
     */
    public final org.xms.g.maps.model.GroundOverlayOptions anchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).anchor(param0, param1)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).anchor(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).anchor(param0, param1)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).anchor(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.bearing(float) Specifies the bearing of the ground overlay in degrees clockwise from north. The rotation is performed about the anchor point. If not specified, the default is 0(i.e., up on the image points north).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.bearing(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#bearing(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#bearing(float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.bearing(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-bearing-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-bearing-float-bearing</a><br/>
     *
     * @param param0 the bearing in degrees clockwise from north. Values outside the range [0, 360) will be normalized
     * @return this GroundOverlayOptions object with a new bearing set
     */
    public final org.xms.g.maps.model.GroundOverlayOptions bearing(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).bearing(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).bearing(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).bearing(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).bearing(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.clickable(boolean) Specifies whether the ground overlay is clickable. The default clickability is false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.clickable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#clickable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#clickable(boolean)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.clickable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-clickable-boolean-clickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-clickable-boolean-clickable</a><br/>
     *
     * @param param0 The new clickability setting
     * @return this GroundOverlayOptions object with a new clickability setting
     */
    public final org.xms.g.maps.model.GroundOverlayOptions clickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).clickable(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).clickable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).clickable(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).clickable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getAnchorU() Horizontal relative anchor; 0.0 and 1.0 denote left and right edges respectively. Other anchor values are interpolated accordingly.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getAnchorU(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getAnchorU()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getAnchorU()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getAnchorU(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getanchoru">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getanchoru</a><br/>
     *
     * @return the horizontal edge-relative anchor location
     */
    public final float getAnchorU() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getAnchorU()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getAnchorU();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getAnchorU()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getAnchorU();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getAnchorV() Vertical relative anchor; 0.0 and 1.0 denote top and bottom edges respectively. Other anchor values are interpolated accordingly.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getAnchorV(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getAnchorV()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getAnchorV()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getAnchorV(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getanchorv">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getanchorv</a><br/>
     *
     * @return the vertical edge-relative anchor location
     */
    public final float getAnchorV() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getAnchorV()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getAnchorV();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getAnchorV()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getAnchorV();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getBearing() Gets the bearing set for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getBearing(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getBearing()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getBearing()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getBearing(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getbearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getbearing</a><br/>
     *
     * @return the bearing of the ground overlay
     */
    public final float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getBearing()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getBearing();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getBearing()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getBearing();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getBounds() Gets the bounds set for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getBounds(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getBounds()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getBounds()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getBounds(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-latlngbounds-getbounds">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-latlngbounds-getbounds</a><br/>
     *
     * @return the bounds of the ground overlay. This will be null if the position was set using position(LatLng, float) or position(LatLng, float, float)
     */
    public final org.xms.g.maps.model.LatLngBounds getBounds() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getBounds()");
            com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getBounds();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getBounds()");
            com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getBounds();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getHeight() Gets the height set for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getHeight(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getHeight()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getHeight()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getHeight(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getheight">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getheight</a><br/>
     *
     * @return the height of the ground overlay
     */
    public final float getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getHeight()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getHeight();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getHeight()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getHeight();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getImage() Gets the image descriptor set for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getImage(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getImage()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getImage()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getImage(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-bitmapdescriptor-getimage">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-bitmapdescriptor-getimage</a><br/>
     *
     * @return A BitmapDescriptor representing the image of the ground overlay
     */
    public final org.xms.g.maps.model.BitmapDescriptor getImage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getImage()");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getImage();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getImage()");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getImage();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getLocation() Gets the location set for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getLocation(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getLocation()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getLocation()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getLocation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-latlng-getlocation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-latlng-getlocation</a><br/>
     *
     * @return the location to place the anchor of the ground overlay. This will be null if the position was set using positionFromBounds(LatLngBounds)
     */
    public final org.xms.g.maps.model.LatLng getLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getLocation()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getLocation();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getLocation()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getLocation();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getTransparency() Gets the transparency set for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getTransparency(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getTransparency()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getTransparency()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getTransparency(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-gettransparency">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-gettransparency</a><br/>
     *
     * @return the transparency of the ground overlay
     */
    public final float getTransparency() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getTransparency()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getTransparency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getTransparency()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getTransparency();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getWidth() Gets the width set for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getWidth(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getWidth()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getWidth()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getwidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getwidth</a><br/>
     *
     * @return the width of the ground overlay
     */
    public final float getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getWidth();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.getZIndex() Gets the zIndex set for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the ground overlay
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.image(org.xms.g.maps.model.BitmapDescriptor) Specifies the image for this ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.image(com.huawei.hms.maps.model.BitmapDescriptor): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#image(BitmapDescriptor)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#image(BitmapDescriptor)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.image(com.google.android.gms.maps.model.BitmapDescriptor): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-image-bitmapdescriptor-imagedescriptor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-image-bitmapdescriptor-imagedescriptor</a><br/>
     *
     * @param param0 the BitmapDescriptor to use for this ground overlay
     * @return this GroundOverlayOptions object with a new image set
     */
    public final org.xms.g.maps.model.GroundOverlayOptions image(org.xms.g.maps.model.BitmapDescriptor param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).image(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).image(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).image(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).image(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.isClickable() Gets the clickability setting for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.isClickable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#isClickable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#isClickable()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.isClickable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-boolean-isclickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-boolean-isclickable</a><br/>
     *
     * @return true if the ground overlay is clickable; false if it is not
     */
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).isClickable();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.isVisible() Gets the visibility setting for this GroundOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#isVisible()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-boolean-isvisible</a><br/>
     *
     * @return true if this ground overlay is visible; false if it is not
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.position(org.xms.g.maps.model.LatLng,float) Specifies the position for this ground overlay using an anchor point(a LatLng)and the width(in meters). The height will be adapted accordingly to preserve aspect ratio.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.position(com.huawei.hms.maps.model.LatLng,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#position(LatLng,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#position(LatLng,float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.position(com.google.android.gms.maps.model.LatLng,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-position-latlng-location,-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-position-latlng-location,-float-width</a><br/>
     *
     * @param param0 the width of the overlay (in meters)
     * @param param1 the location on the map LatLng to which the anchor point in the given image will remain fixed. The anchor will remain fixed to the position on the ground when transformations are applied (e.g., setDimensions, setBearing, etc.)
     * @param param2 the height of the overlay (in meters)
     * @return this GroundOverlayOptions object with a new position set
     * @throws java.lang.IllegalArgumentException if anchor is null
     * @throws java.lang.IllegalArgumentException if width is negative
     * @throws java.lang.IllegalStateException    if the position was already set using positionFromBounds(LatLngBounds)
     */
    public final org.xms.g.maps.model.GroundOverlayOptions position(org.xms.g.maps.model.LatLng param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.position(org.xms.g.maps.model.LatLng,float,float) Specifies the position for this ground overlay using an anchor point(a LatLng), width and height(both in meters). When rendered, the image will be scaled to fit the dimensions specified.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.position(com.huawei.hms.maps.model.LatLng,float,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#position(LatLng,float,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#position(LatLng,float,float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.position(com.google.android.gms.maps.model.LatLng,float,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-position-latlng-location,-float-width,-float-height">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-position-latlng-location,-float-width,-float-height</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @param param1 the param should instanceof float
     * @param param2 the param should instanceof float
     * @return the return object is maps model GroundOverlayOptions
     * @throws java.lang.IllegalArgumentException if anchor is null
     * @throws java.lang.IllegalArgumentException if width is negative
     * @throws java.lang.IllegalStateException    if the position was already set using positionFromBounds(LatLngBounds)
     */
    public final org.xms.g.maps.model.GroundOverlayOptions position(org.xms.g.maps.model.LatLng param0, float param1, float param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, param2)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, param2);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, param2)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, param2);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.positionFromBounds(org.xms.g.maps.model.LatLngBounds) Specifies the position for this ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.positionFromBounds(com.huawei.hms.maps.model.LatLngBounds): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#positionFromBounds(LatLngBounds)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#positionFromBounds(LatLngBounds)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.positionFromBounds(com.google.android.gms.maps.model.LatLngBounds): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-positionfrombounds-latlngbounds-bounds">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-positionfrombounds-latlngbounds-bounds</a><br/>
     *
     * @param param0 a LatLngBounds in which to place the ground overlay
     * @return this GroundOverlayOptions object with a new position set
     * @throws java.lang.IllegalStateException if the position was already set using position(LatLng, float) or position(LatLng, float, float)
     */
    public final org.xms.g.maps.model.GroundOverlayOptions positionFromBounds(org.xms.g.maps.model.LatLngBounds param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).positionFromBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).positionFromBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).positionFromBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).positionFromBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.transparency(float) Specifies the transparency of the ground overlay. The default transparency is 0(opaque).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.transparency(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#transparency(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#transparency(float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.transparency(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-transparency-float-transparency">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-transparency-float-transparency</a><br/>
     *
     * @param param0 a float in the range [0..1] where 0 means that the ground overlay is opaque and 1 means that the ground overlay is transparent
     * @return this GroundOverlayOptions object with a new transparency setting
     * @throws java.lang.IllegalStateException if the transparency is outside the range[0..1]
     */
    public final org.xms.g.maps.model.GroundOverlayOptions transparency(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).transparency(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).transparency(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).transparency(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).transparency(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.visible(boolean) Specifies the visibility for the ground overlay. The default visibility is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.visible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#visible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#visible(boolean)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.visible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-visible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-visible-boolean-visible</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this GroundOverlayOptions object with a new visibility setting
     */
    public final org.xms.g.maps.model.GroundOverlayOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.writeToParcel(android.os.Parcel,int) write To Parcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.maps.model.GroundOverlayOptions.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlayOptions.zIndex(float) Specifies the ground overlay's zIndex, i.e., the order in which it will be drawn. See the documentation at the top of this class for more information about zIndex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlayOptions.zIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#zIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlayo#zIndex(float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlayOptions.zIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-zindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlayOptions#public-groundoverlayoptions-zindex-float-zindex</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return this GroundOverlayOptions object with a new zIndex set
     */
    public final org.xms.g.maps.model.GroundOverlayOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.GroundOverlayOptions hReturn = ((com.huawei.hms.maps.model.GroundOverlayOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.GroundOverlayOptions gReturn = ((com.google.android.gms.maps.model.GroundOverlayOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
}