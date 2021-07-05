package org.xms.g.maps.model;

/**
 * An icon placed at a particular point on the map's surface.<br/>
 * Combination of com.huawei.hms.maps.model.Marker and com.google.android.gms.maps.model.Marker.<br/>
 * com.huawei.hms.maps.model.Marker: Defines an icon placed at a specified position on a map.<br/>
 * com.google.android.gms.maps.model.Marker: An icon placed at a particular point on the map's surface. A marker icon is drawn oriented against the device's screen rather than the map's surface; i.e., it will not necessarily change orientation due to map rotations, tilting, or zooming.<br/>
 */
public final class Marker extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.Marker.Marker(org.xms.g.utils.XBox) An icon placed at a particular point on the map's surface.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public Marker(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.Marker.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model Marker object
     */
    public static org.xms.g.maps.model.Marker dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Marker) param0);
    }

    /**
     * org.xms.g.maps.model.Marker.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Marker;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Marker;
        }
    }

    /**
     * org.xms.g.maps.model.Marker.equals(java.lang.Object) Tests if this Marker is equal to another.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#equals(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#equals(Object)</a><br/>
     * com.google.android.gms.maps.model.Marker.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-equals-object-other">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-equals-object-other</a><br/>
     *
     * @param param0 an Object
     * @return true if both objects are the same object, that is, this == other
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.getAlpha() Gets the alpha of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.getAlpha(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getAlpha()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getAlpha()</a><br/>
     * com.google.android.gms.maps.model.Marker.getAlpha(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-float-getalpha">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-float-getalpha</a><br/>
     *
     * @return the alpha of the marker in the range [0, 1]
     */
    public final float getAlpha() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getAlpha()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getAlpha();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getAlpha()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getAlpha();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setAlpha(float) Removes this marker from the map. After a marker has been removed, the behavior of all its methods is undefined.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setAlpha(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setAlpha(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setAlpha(float)</a><br/>
     * com.google.android.gms.maps.model.Marker.setAlpha(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setalpha-float-alpha">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setalpha-float-alpha</a><br/>
     *
     * @param param0 the param should be instanceof float
     */
    public final void setAlpha(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setAlpha(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setAlpha(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setAlpha(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setAlpha(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.getId() Gets this marker's id. The id will be unique amongst all Markers on a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.getId(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getId()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getId()</a><br/>
     * com.google.android.gms.maps.model.Marker.getId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-string-getid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-string-getid</a><br/>
     *
     * @return this marker's id
     */
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getId();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.getPosition() Returns the position of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.getPosition(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getPosition()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getPosition()</a><br/>
     * com.google.android.gms.maps.model.Marker.getPosition(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-latlng-getposition">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-latlng-getposition</a><br/>
     *
     * @return A LatLng object specifying the marker's current position
     */
    public final org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getPosition()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getPosition()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setPosition(org.xms.g.maps.model.LatLng) Sets the location of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setPosition(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setPosition(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setPosition(LatLng)</a><br/>
     * com.google.android.gms.maps.model.Marker.setPosition(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setposition-latlng-latlng">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setposition-latlng-latlng</a><br/>
     *
     * @param param0 the param should be instanceof maps model LatLng
     */
    public final void setPosition(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setPosition(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setPosition(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.model.Marker.getRotation() Gets the rotation of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.getRotation(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getRotation()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getRotation()</a><br/>
     * com.google.android.gms.maps.model.Marker.getRotation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-float-getrotation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-float-getrotation</a><br/>
     *
     * @return the rotation of the marker in degrees clockwise from the default position
     */
    public final float getRotation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getRotation()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getRotation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getRotation()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getRotation();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setRotation(float) Sets the rotation of the marker in degrees clockwise about the marker's anchor point. The axis of rotation is perpendicular to the marker. A rotation of 0 corresponds to the default position of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setRotation(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setRotation(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setRotation(float)</a><br/>
     * com.google.android.gms.maps.model.Marker.setRotation(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setrotation-float-rotation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setrotation-float-rotation</a><br/>
     *
     * @param param0 the param should be instanceof float
     */
    public final void setRotation(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setRotation(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setRotation(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setRotation(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setRotation(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.getSnippet() Gets the snippet of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.getSnippet(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getSnippet()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getSnippet()</a><br/>
     * com.google.android.gms.maps.model.Marker.getSnippet(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-string-getsnippet">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-string-getsnippet</a><br/>
     *
     * @return A string containing the marker's snippet
     */
    public final java.lang.String getSnippet() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getSnippet()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getSnippet();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getSnippet()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getSnippet();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setSnippet(java.lang.String) Sets the snippet of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setSnippet(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setSnippet(String)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setSnippet(String)</a><br/>
     * com.google.android.gms.maps.model.Marker.setSnippet(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setsnippet-string-snippet">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setsnippet-string-snippet</a><br/>
     *
     * @param param0 if null, the snippet is cleared
     */
    public final void setSnippet(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setSnippet(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setSnippet(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setSnippet(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setSnippet(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.getTag() Gets the tag for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.getTag(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getTag()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getTag()</a><br/>
     * com.google.android.gms.maps.model.Marker.getTag(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-object-gettag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-object-gettag</a><br/>
     *
     * @return the tag if a tag was set with setTag; null if no tag has been set
     */
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getTag();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setTag(java.lang.Object) Sets the tag for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setTag(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setTag(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setTag(Object)</a><br/>
     * com.google.android.gms.maps.model.Marker.setTag(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-settag-object-tag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-settag-object-tag</a><br/>
     *
     * @param param0 if null, the tag is cleared
     */
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setTag(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.getTitle() Gets the title of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.getTitle(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getTitle()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getTitle()</a><br/>
     * com.google.android.gms.maps.model.Marker.getTitle(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-string-gettitle">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-string-gettitle</a><br/>
     *
     * @return A string containing the marker's title
     */
    public final java.lang.String getTitle() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getTitle()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getTitle();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getTitle()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getTitle();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setTitle(java.lang.String) Sets the title of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setTitle(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setTitle(String)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setTitle(String)</a><br/>
     * com.google.android.gms.maps.model.Marker.setTitle(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-settitle-string-title">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-settitle-string-title</a><br/>
     *
     * @param param0 if null, the title is cleared
     */
    public final void setTitle(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setTitle(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setTitle(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setTitle(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setTitle(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.getZIndex() Returns the zIndex of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.Marker.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-float-getzindex</a><br/>
     *
     * @return this marker's zIndex
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setZIndex(float) Sets the zIndex of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setZIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setZIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setZIndex(float)</a><br/>
     * com.google.android.gms.maps.model.Marker.setZIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setzindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setzindex-float-zindex</a><br/>
     *
     * @param param0 the param should be instanceof float
     */
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setZIndex(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#hashCode()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#hashCode()</a><br/>
     * com.google.android.gms.maps.model.Marker.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.hideInfoWindow() Hides the info window if it is shown from this marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.hideInfoWindow(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#hideInfoWindow()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#hideInfoWindow()</a><br/>
     * com.google.android.gms.maps.model.Marker.hideInfoWindow(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-hideinfowindow">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-hideinfowindow</a><br/>
     */
    public final void hideInfoWindow() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).hideInfoWindow()");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).hideInfoWindow();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).hideInfoWindow()");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).hideInfoWindow();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.isDraggable() Gets the draggability of the marker. When a marker is draggable, it can be moved by the user by long pressing on the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.isDraggable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#isDraggable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#isDraggable()</a><br/>
     * com.google.android.gms.maps.model.Marker.isDraggable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-isdraggable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-isdraggable</a><br/>
     *
     * @return true if the marker is draggable; otherwise, returns false
     */
    public final boolean isDraggable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).isDraggable()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).isDraggable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).isDraggable()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).isDraggable();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setDraggable(boolean) Sets the draggability of the marker. When a marker is draggable, it can be moved by the user by long pressing on the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setDraggable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setDraggable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setDraggable(boolean)</a><br/>
     * com.google.android.gms.maps.model.Marker.setDraggable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setdraggable-boolean-draggable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setdraggable-boolean-draggable</a><br/>
     *
     * @param param0 the param should be instanceof boolean
     */
    public final void setDraggable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setDraggable(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setDraggable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setDraggable(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setDraggable(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.isFlat() Gets the flat setting of the Marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.isFlat(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#isFlat()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#isFlat()</a><br/>
     * com.google.android.gms.maps.model.Marker.isFlat(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-isflat">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-isflat</a><br/>
     *
     * @return true if the marker is flat against the map; false if the marker should face the camera
     */
    public final boolean isFlat() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).isFlat()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).isFlat();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).isFlat()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).isFlat();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setFlat(boolean) Sets whether this marker should be flat against the map true or a billboard facing the camera false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setFlat(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setFlat(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setFlat(boolean)</a><br/>
     * com.google.android.gms.maps.model.Marker.setFlat(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setflat-boolean-flat">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setflat-boolean-flat</a><br/>
     *
     * @param param0 the param should be instanceof boolean
     */
    public final void setFlat(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setFlat(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setFlat(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setFlat(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setFlat(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.isInfoWindowShown() Returns whether the info window is currently shown above this marker. This does not consider whether or not the info window is actually visible on screen.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.isInfoWindowShown()
     * com.google.android.gms.maps.model.Marker.isInfoWindowShown(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-isinfowindowshown">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-isinfowindowshown</a><br/>
     *
     * @return the return object is boolean
     */
    public final boolean isInfoWindowShown() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).isInfoWindowShown()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).isInfoWindowShown();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).isInfoWindowShown()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).isInfoWindowShown();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.isVisible() Gets the visibility setting of this marker. Note that this does not indicate whether the marker is within the screen's viewport. It indicates whether the marker will be drawn if it is contained in the screen's viewport.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#isInfoWindowShown()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#isInfoWindowShown()</a><br/>
     * com.google.android.gms.maps.model.Marker.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-boolean-isvisible</a><br/>
     *
     * @return this marker's visibility
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.Marker) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.Marker) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setVisible(boolean) Sets the visibility of this marker. If set to false and an info window is currently showing for this marker, this will hide the info window.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setVisible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setVisible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setVisible(boolean)</a><br/>
     * com.google.android.gms.maps.model.Marker.setVisible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setvisible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setvisible-boolean-visible</a><br/>
     *
     * @param param0 the param should be instanceof boolean
     */
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setVisible(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.remove() Removes this marker from the map. After a marker has been removed, the behavior of all its methods is undefined.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.remove(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#remove()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#remove()</a><br/>
     * com.google.android.gms.maps.model.Marker.remove(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-remove">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-remove</a><br/>
     */
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).remove();
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setAnchor(float,float) Sets the anchor point for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setAnchor(float,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setAnchor(float,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setAnchor(float,float)</a><br/>
     * com.google.android.gms.maps.model.Marker.setAnchor(float,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setanchor-float-anchoru,-float-anchorv">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setanchor-float-anchoru,-float-anchorv</a><br/>
     *
     * @param param0 v-coordinate of the anchor, as a ratio of the image height (in the range [0, 1])
     * @param param1 u-coordinate of the anchor, as a ratio of the image width (in the range [0, 1])
     */
    public final void setAnchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setAnchor(param0, param1)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setAnchor(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setAnchor(param0, param1)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setAnchor(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setIcon(org.xms.g.maps.model.BitmapDescriptor) Sets the icon for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setIcon(com.huawei.hms.maps.model.BitmapDescriptor): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setIcon(BitmapDescriptor)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setIcon(BitmapDescriptor)</a><br/>
     * com.google.android.gms.maps.model.Marker.setIcon(com.google.android.gms.maps.model.BitmapDescriptor): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-seticon-bitmapdescriptor-icondescriptor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-seticon-bitmapdescriptor-icondescriptor</a><br/>
     *
     * @param param0 if null, the default marker is used
     */
    public final void setIcon(org.xms.g.maps.model.BitmapDescriptor param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setIcon(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setIcon(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setIcon(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setIcon(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.model.Marker.setInfoWindowAnchor(float,float) Specifies the point in the marker image at which to anchor the info window when it is displayed. This is specified in the same coordinate system as the anchor. See setAnchor(float, float)for more details. The default is the top middle of the image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.setInfoWindowAnchor(float,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setInfoWindowAnchor(float,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#setInfoWindowAnchor(float,float)</a><br/>
     * com.google.android.gms.maps.model.Marker.setInfoWindowAnchor(float,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setinfowindowanchor-float-anchoru,-float-anchorv">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-setinfowindowanchor-float-anchoru,-float-anchorv</a><br/>
     *
     * @param param0 v-coordinate of the info window anchor, as a ratio of the image height (in the range [0, 1])
     * @param param1 u-coordinate of the info window anchor, as a ratio of the image width (in the range [0, 1])
     */
    public final void setInfoWindowAnchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).setInfoWindowAnchor(param0, param1)");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).setInfoWindowAnchor(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).setInfoWindowAnchor(param0, param1)");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).setInfoWindowAnchor(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.model.Marker.showInfoWindow() Shows the info window of this marker on the map, if this marker isVisible().<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Marker.showInfoWindow(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#showInfoWindow()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-marker#showInfoWindow()</a><br/>
     * com.google.android.gms.maps.model.Marker.showInfoWindow(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-showinfowindow">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Marker#public-void-showinfowindow</a><br/>
     *
     * @throws java.lang.IllegalArgumentException if marker is not on this map
     */
    public final void showInfoWindow() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Marker) this.getHInstance()).showInfoWindow()");
            ((com.huawei.hms.maps.model.Marker) this.getHInstance()).showInfoWindow();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Marker) this.getGInstance()).showInfoWindow()");
            ((com.google.android.gms.maps.model.Marker) this.getGInstance()).showInfoWindow();
        }
    }
}