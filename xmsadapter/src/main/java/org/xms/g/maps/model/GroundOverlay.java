package org.xms.g.maps.model;

/**
 * A ground overlay is an image that is fixed to a map. A ground overlay has the following properties.<br/>
 * Combination of com.huawei.hms.maps.model.GroundOverlay and com.google.android.gms.maps.model.GroundOverlay.<br/>
 * com.huawei.hms.maps.model.GroundOverlay: Defines an image that is fixed to a map.<br/>
 * com.google.android.gms.maps.model.GroundOverlay: A ground overlay is an image that is fixed to a map.<br/>
 */
public final class GroundOverlay extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.GroundOverlay.GroundOverlay(org.xms.g.utils.XBox) A ground overlay is an image that is fixed to a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public GroundOverlay(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.GroundOverlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model GroundOverlay object
     */
    public static org.xms.g.maps.model.GroundOverlay dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.GroundOverlay) param0);
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.GroundOverlay;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.GroundOverlay;
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.equals(java.lang.Object) Tests if this GroundOverlay is equal to another.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#equals(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#equals(Object)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-boolean-equals-object-other">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-boolean-equals-object-other</a><br/>
     *
     * @param param0 an Object
     * @return true if both objects are the same object, that is, this == other
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getBearing() Gets the bearing of the ground overlay in degrees clockwise from north.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getBearing(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getBearing()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getBearing()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getBearing(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-getbearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-getbearing</a><br/>
     *
     * @return the bearing of the ground overlay
     */
    public final float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getBearing()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getBearing();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getBearing()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getBearing();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setBearing(float) Sets the bearing of the ground overlay(the direction that the vertical axis of the ground overlay points)in degrees clockwise from north. The rotation is performed about the anchor point.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setBearing(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setBearing(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setBearing(float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setBearing(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setbearing-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setbearing-float-bearing</a><br/>
     *
     * @param param0 bearing in degrees clockwise from north
     */
    public final void setBearing(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setBearing(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setBearing(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setBearing(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setBearing(param0);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getBounds() Gets the bounds for the ground overlay. This ignores the rotation of the ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getBounds(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getBounds()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getBounds()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getBounds(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-latlngbounds-getbounds">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-latlngbounds-getbounds</a><br/>
     *
     * @return a LatLngBounds that contains the ground overlay, ignoring rotation
     */
    public final org.xms.g.maps.model.LatLngBounds getBounds() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getBounds()");
            com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getBounds();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getBounds()");
            com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getBounds();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getHeight() Gets the height of the ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getHeight(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getHeight()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getHeight()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getHeight(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-getheight">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-getheight</a><br/>
     *
     * @return the height of the ground overlay in meters
     */
    public final float getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getHeight()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getHeight();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getHeight()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getHeight();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getId() Gets this ground overlay's id. The id will be unique amongst all GroundOverlays on a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getId(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getId()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getId()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-string-getid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-string-getid</a><br/>
     *
     * @return this ground overlay's id
     */
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getId();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getPosition() Gets the location of the anchor point.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getPosition(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getPosition()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getPosition()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getPosition(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-latlng-getposition">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-latlng-getposition</a><br/>
     *
     * @return the position on the map (a LatLng)
     */
    public final org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getPosition()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getPosition()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setPosition(org.xms.g.maps.model.LatLng) Sets the position of the ground overlay by changing the location of the anchor point. Preserves all other properties of the image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setPosition(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setPosition(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setPosition(LatLng)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setPosition(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setposition-latlng-latlng">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setposition-latlng-latlng</a><br/>
     *
     * @param param0 a LatLng that is the new location to place the anchor point
     */
    public final void setPosition(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getTag() Gets the tag for the circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getTag(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getTag()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getTag()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getTag(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-object-gettag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-object-gettag</a><br/>
     *
     * @return the tag if a tag was set with setTag; null if no tag has been set
     */
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getTag();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setTag(java.lang.Object) Sets the tag for the ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setTag(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setTag(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setTag(Object)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setTag(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-settag-object-tag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-settag-object-tag</a><br/>
     *
     * @param param0 if null, the tag is cleared
     */
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setTag(param0);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getTransparency() Gets the transparency of this ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getTransparency(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getTransparency()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getTransparency()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getTransparency(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-gettransparency">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-gettransparency</a><br/>
     *
     * @return the transparency of this ground overlay
     */
    public final float getTransparency() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getTransparency()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getTransparency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getTransparency()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getTransparency();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setTransparency(float) Sets the transparency of this ground overlay. See the documentation at the top of this class for more information.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setTransparency(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setTransparency(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setTransparency(float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setTransparency(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-settransparency-float-transparency">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-settransparency-float-transparency</a><br/>
     *
     * @param param0 a float in the range [0..1] where 0 means that the ground overlay is opaque and 1 means that the ground overlay is transparent
     */
    public final void setTransparency(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setTransparency(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setTransparency(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setTransparency(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setTransparency(param0);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getWidth() Gets the width of the ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getWidth(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getWidth()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getWidth()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-getwidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-getwidth</a><br/>
     *
     * @return the width of the ground overlay in meters
     */
    public final float getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getWidth();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.getZIndex() Gets the zIndex of this ground overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the ground overlay
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setZIndex(float) Sets the zIndex of this ground overlay. See the documentation at the top of this class for more information.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setZIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setZIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setZIndex(float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setZIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setzindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setzindex-float-zindex</a><br/>
     *
     * @param param0 the zIndex of this ground overlay
     */
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setZIndex(param0);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#hashCode()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#hashCode()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.isClickable() Gets the clickability of the ground overlay. If the ground overlay is clickable, your app will receive notifications to the GoogleMap.OnGroundOverlayClickListener when the user clicks the ground overlay. The event listener is registered through setOnGroundOverlayClickListener(GoogleMap.OnGroundOverlayClickListener).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.isClickable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#isClickable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#isClickable()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.isClickable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-boolean-isclickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-boolean-isclickable</a><br/>
     *
     * @return true if the ground overlay is clickable; otherwise, returns false
     */
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).isClickable();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setClickable(boolean) Sets the clickability of the ground overlay. If the ground overlay is clickable, your app will receive notifications to the GoogleMap.OnGroundOverlayClickListener when the user clicks the ground overlay. The event listener is registered through setOnGroundOverlayClickListener(GoogleMap.OnGroundOverlayClickListener).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setClickable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setClickable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setClickable(boolean)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setClickable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setclickable-boolean-clickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setclickable-boolean-clickable</a><br/>
     *
     * @param param0 New clickability setting for the ground overlay
     */
    public final void setClickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setClickable(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setClickable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setClickable(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setClickable(param0);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.isVisible() Gets the visibility of this ground overlay. Note that this does not return whether the ground overlay is actually on screen, but whether it will be drawn if it is contained in the camera's viewport.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#isVisible()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-boolean-isvisible</a><br/>
     *
     * @return this ground overlay's visibility
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setVisible(boolean) Sets the visibility of this ground overlay. When not visible, a ground overlay is not drawn, but it keeps all of its other properties.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setVisible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setVisible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setVisible(boolean)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setVisible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setvisible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setvisible-boolean-visible</a><br/>
     *
     * @param param0 if true, then the ground overlay is visible; if false, it is not
     */
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setVisible(param0);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.remove() Removes this ground overlay from the map. After a ground overlay has been removed, the behavior of all its methods is undefined.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.remove(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#remove()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#remove()</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.remove(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-remove">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-remove</a><br/>
     */
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).remove();
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setDimensions(float,float) Sets the width of the ground overlay. The height of the ground overlay will be adapted accordingly to preserve aspect ratio.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setDimensions(float,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setDimensions(float,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setDimensions(float,float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setDimensions(float,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setdimensions-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setdimensions-float-width</a><br/>
     *
     * @param param0 the param should be instanceof float
     * @param param1 the param should be instanceof float
     */
    public final void setDimensions(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setDimensions(param0, param1)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setDimensions(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setDimensions(param0, param1)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setDimensions(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setDimensions(float) Sets the width of the ground overlay. The height of the ground overlay will be adapted accordingly to preserve aspect ratio.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setDimensions(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setDimensions(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setDimensions(float)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setDimensions(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setdimensions-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setdimensions-float-width</a><br/>
     *
     * @param param0 width in meters
     */
    public final void setDimensions(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setDimensions(param0)");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setDimensions(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setDimensions(param0)");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setDimensions(param0);
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setImage(org.xms.g.maps.model.BitmapDescriptor) Sets the image for the Ground Overlay. The new image will occupy the same bounds as the old image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setImage(com.huawei.hms.maps.model.BitmapDescriptor): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setImage(BitmapDescriptor)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setImage(BitmapDescriptor)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setImage(com.google.android.gms.maps.model.BitmapDescriptor): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setimage-bitmapdescriptor-imagedescriptor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setimage-bitmapdescriptor-imagedescriptor</a><br/>
     *
     * @param param0 the BitmapDescriptor to use for this ground overlay
     */
    public final void setImage(org.xms.g.maps.model.BitmapDescriptor param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setImage(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setImage(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setImage(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setImage(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.model.GroundOverlay.setPositionFromBounds(org.xms.g.maps.model.LatLngBounds) Sets the position of the ground overlay by fitting it to the given LatLngBounds. This method will ignore the rotation(bearing)of the ground overlay when positioning it, but the bearing will still be used when drawing it.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.GroundOverlay.setPositionFromBounds(com.huawei.hms.maps.model.LatLngBounds): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setPositionFromBounds(LatLngBounds)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-groundoverlay#setPositionFromBounds(LatLngBounds)</a><br/>
     * com.google.android.gms.maps.model.GroundOverlay.setPositionFromBounds(com.google.android.gms.maps.model.LatLngBounds): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setpositionfrombounds-latlngbounds-bounds">https://developers.google.com/android/reference/com/google/android/gms/maps/model/GroundOverlay#public-void-setpositionfrombounds-latlngbounds-bounds</a><br/>
     *
     * @param param0 a LatLngBounds in which to place the ground overlay
     */
    public final void setPositionFromBounds(org.xms.g.maps.model.LatLngBounds param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setPositionFromBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.GroundOverlay) this.getHInstance()).setPositionFromBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setPositionFromBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.GroundOverlay) this.getGInstance()).setPositionFromBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }
}