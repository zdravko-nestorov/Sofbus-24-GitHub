package org.xms.g.maps.model;

/**
 * Defines MarkerOptions for a marker.<br/>
 * Combination of com.huawei.hms.maps.model.MarkerOptions and com.google.android.gms.maps.model.MarkerOptions.<br/>
 * com.huawei.hms.maps.model.MarkerOptions: Defines attributes for a marker.<br/>
 * com.google.android.gms.maps.model.MarkerOptions: Defines MarkerOptions for a marker.<br/>
 */
public final class MarkerOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.MarkerOptions createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.MarkerOptions hReturn = com.huawei.hms.maps.model.MarkerOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.MarkerOptions gReturn = com.google.android.gms.maps.model.MarkerOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.MarkerOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.MarkerOptions[param0];
        }
    };

    /**
     * org.xms.g.maps.model.MarkerOptions.MarkerOptions(org.xms.g.utils.XBox) Creates a new set of marker options.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.MarkerOptions(): <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References-V5/markeroptions-0000001050150930-V5">https://developer.huawei.com/consumer/cn/doc/HMSCore-References-V5/markeroptions-0000001050150930-V5</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.MarkerOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public MarkerOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.MarkerOptions() Creates a new set of marker options.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.MarkerOptions(): <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References-V5/markeroptions-0000001050150930-V5">https://developer.huawei.com/consumer/cn/doc/HMSCore-References-V5/markeroptions-0000001050150930-V5</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.MarkerOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions</a><br/>
     */
    public MarkerOptions() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.MarkerOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.MarkerOptions());
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.MarkerOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model MarkerOptions object
     */
    public static org.xms.g.maps.model.MarkerOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.MarkerOptions) param0);
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.MarkerOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.MarkerOptions;
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.alpha(float) Sets the alpha(opacity)of the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.alpha(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#alpha(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#alpha(float)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.alpha(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-alpha-float-alpha">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-alpha-float-alpha</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return the object for which the method was called, with the new alpha set
     */
    public final org.xms.g.maps.model.MarkerOptions alpha(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).alpha(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).alpha(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).alpha(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).alpha(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.anchor(float,float) Specifies the anchor to be at a particular point in the marker image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.anchor(float,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#anchor(float,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#anchor(float,float)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.anchor(float,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-anchor-float-u,-float-v">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-anchor-float-u,-float-v</a><br/>
     *
     * @param param0 u-coordinate of the anchor, as a ratio of the image width (in the range [0, 1])
     * @param param1 v-coordinate of the anchor, as a ratio of the image height (in the range [0, 1])
     * @return the object for which the method was called, with the new anchor set
     */
    public final org.xms.g.maps.model.MarkerOptions anchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).anchor(param0, param1)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).anchor(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).anchor(param0, param1)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).anchor(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.draggable(boolean) Sets the draggability for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.draggable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#draggable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#draggable(boolean)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.draggable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-draggable-boolean-draggable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-draggable-boolean-draggable</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the object for which the method was called, with the new draggable state set
     */
    public final org.xms.g.maps.model.MarkerOptions draggable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).draggable(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).draggable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).draggable(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).draggable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.flat(boolean) Sets whether this marker should be flat against the map true or a billboard facing the camera false. If the marker is flat against the map, it will remain stuck to the map as the camera rotates and tilts but will still remain the same size as the camera zooms, unlike a GroundOverlay. If the marker is a billboard, it will always be drawn facing the camera and will rotate and tilt with the camera. The default value is false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.flat(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#flat(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#flat(boolean)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.flat(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-flat-boolean-flat">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-flat-boolean-flat</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the object for which the method was called, with the new flat state set
     */
    public final org.xms.g.maps.model.MarkerOptions flat(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).flat(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).flat(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).flat(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).flat(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getAlpha() Gets the alpha set for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getAlpha(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getAlpha()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getAlpha()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getAlpha(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getalpha">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getalpha</a><br/>
     *
     * @return the alpha of the marker in the range [0, 1]
     */
    public final float getAlpha() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAlpha()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAlpha();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAlpha()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAlpha();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getAnchorU() Horizontal distance, normalized to[0, 1], of the anchor from the left edge.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getAnchorU(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getAnchorU()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getAnchorU()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getAnchorU(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getanchoru">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getanchoru</a><br/>
     *
     * @return the u value of the anchor
     */
    public final float getAnchorU() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAnchorU()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAnchorU();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAnchorU()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAnchorU();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getAnchorV() Vertical distance, normalized to[0, 1], of the anchor from the top edge.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getAnchorV(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getAnchorV()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getAnchorV()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getAnchorV(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getanchorv">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getanchorv</a><br/>
     *
     * @return the v value of the anchor
     */
    public final float getAnchorV() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAnchorV()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getAnchorV();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAnchorV()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getAnchorV();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getIcon() Gets the custom icon descriptor set for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getIcon(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getIcon()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getIcon()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getIcon(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-bitmapdescriptor-geticon">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-bitmapdescriptor-geticon</a><br/>
     *
     * @return A BitmapDescriptor representing the custom icon, or null if no custom icon is set
     */
    public final org.xms.g.maps.model.BitmapDescriptor getIcon() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getIcon()");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getIcon();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getIcon()");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getIcon();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getInfoWindowAnchorU() Horizontal distance, normalized to[0, 1], of the info window anchor from the left edge.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getInfoWindowAnchorU(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getInfoWindowAnchorU()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getInfoWindowAnchorU()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getInfoWindowAnchorU(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getinfowindowanchoru">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getinfowindowanchoru</a><br/>
     *
     * @return the u value of the info window anchor
     */
    public final float getInfoWindowAnchorU() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getInfoWindowAnchorU()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getInfoWindowAnchorU();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getInfoWindowAnchorU()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getInfoWindowAnchorU();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getInfoWindowAnchorV() Vertical distance, normalized to[0, 1], of the info window anchor from the top edge.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getInfoWindowAnchorV(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getInfoWindowAnchorV()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getInfoWindowAnchorV()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getInfoWindowAnchorV(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getinfowindowanchorv">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getinfowindowanchorv</a><br/>
     *
     * @return the v value of the info window anchor
     */
    public final float getInfoWindowAnchorV() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getInfoWindowAnchorV()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getInfoWindowAnchorV();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getInfoWindowAnchorV()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getInfoWindowAnchorV();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getPosition() Returns the position set for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getPosition(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getPosition()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getPosition()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getPosition(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-latlng-getposition">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-latlng-getposition</a><br/>
     *
     * @return A LatLng object specifying the marker's current position
     */
    public final org.xms.g.maps.model.LatLng getPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getPosition()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getPosition()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getRotation() Gets the rotation set for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getRotation(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getRotation()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getRotation()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getRotation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getrotation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getrotation</a><br/>
     *
     * @return the rotation of the marker in degrees clockwise from the default position
     */
    public final float getRotation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getRotation()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getRotation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getRotation()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getRotation();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getSnippet() Gets the snippet set for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getSnippet(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getSnippet()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getSnippet()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getSnippet(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-string-getsnippet">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-string-getsnippet</a><br/>
     *
     * @return A string containing the marker's snippet
     */
    public final java.lang.String getSnippet() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getSnippet()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getSnippet();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getSnippet()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getSnippet();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getTitle() Gets the title set for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getTitle(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getTitle()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getTitle()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getTitle(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-string-gettitle">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-string-gettitle</a><br/>
     *
     * @return A string containing the marker's title
     */
    public final java.lang.String getTitle() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getTitle()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getTitle();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getTitle()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getTitle();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.getZIndex() Gets the zIndex set for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the marker
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.icon(org.xms.g.maps.model.BitmapDescriptor) Sets the icon for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.icon(com.huawei.hms.maps.model.BitmapDescriptor): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#icon(BitmapDescriptor)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#icon(BitmapDescriptor)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.icon(com.google.android.gms.maps.model.BitmapDescriptor): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-icon-bitmapdescriptor-icondescriptor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-icon-bitmapdescriptor-icondescriptor</a><br/>
     *
     * @param param0 if null, the default marker is used
     * @return the object for which the method was called, with the new icon descriptor set
     */
    public final org.xms.g.maps.model.MarkerOptions icon(org.xms.g.maps.model.BitmapDescriptor param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).icon(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).icon(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).icon(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).icon(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.infoWindowAnchor(float,float) Specifies the anchor point of the info window on the marker image. This is specified in the same coordinate system as the anchor. See anchor(float, float)for more details. The default is the top middle of the image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.infoWindowAnchor(float,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#infoWindowAnchor(float,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#infoWindowAnchor(float,float)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.infoWindowAnchor(float,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-infowindowanchor-float-u,-float-v">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-infowindowanchor-float-u,-float-v</a><br/>
     *
     * @param param0 u-coordinate of the info window anchor, as a ratio of the image width (in the range [0, 1])
     * @param param1 v-coordinate of the info window anchor, as a ratio of the image height (in the range [0, 1])
     * @return the object for which the method was called, with the new info window anchor set
     */
    public final org.xms.g.maps.model.MarkerOptions infoWindowAnchor(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).infoWindowAnchor(param0, param1)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).infoWindowAnchor(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).infoWindowAnchor(param0, param1)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).infoWindowAnchor(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.isDraggable() Gets the draggability setting for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.isDraggable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#isDraggable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#isDraggable()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.isDraggable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-boolean-isdraggable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-boolean-isdraggable</a><br/>
     *
     * @return true if the marker is draggable; otherwise, returns false
     */
    public final boolean isDraggable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isDraggable()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isDraggable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isDraggable()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isDraggable();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.isFlat() Gets the flat setting for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.isFlat(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#isFlat()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#isFlat()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.isFlat(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-boolean-isflat">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-boolean-isflat</a><br/>
     *
     * @return true if the marker is flat against the map; false if the marker should face the camera
     */
    public final boolean isFlat() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isFlat()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isFlat();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isFlat()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isFlat();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.isVisible() Gets the visibility setting for this MarkerOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#isVisible()</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-boolean-isvisible</a><br/>
     *
     * @return true if the marker is visible; otherwise, returns false
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.position(org.xms.g.maps.model.LatLng) Sets the location for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.position(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#position(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#position(LatLng)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.position(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-position-latlng-latlng">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-position-latlng-latlng</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @return the object for which the method was called, with the new position set
     */
    public final org.xms.g.maps.model.MarkerOptions position(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).position(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).position(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.rotation(float) Sets the rotation of the marker in degrees clockwise about the marker's anchor point.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.rotation(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#rotation(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#rotation(float)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.rotation(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-rotation-float-rotation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-rotation-float-rotation</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return the object for which the method was called, with the new rotation set
     */
    public final org.xms.g.maps.model.MarkerOptions rotation(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).rotation(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).rotation(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).rotation(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).rotation(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.snippet(java.lang.String) Sets the snippet for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.snippet(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#snippet(String)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#snippet(String)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.snippet(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-snippet-string-snippet">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-snippet-string-snippet</a><br/>
     *
     * @param param0 the param should instanceof java lang String
     * @return the object for which the method was called, with the new snippet set
     */
    public final org.xms.g.maps.model.MarkerOptions snippet(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).snippet(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).snippet(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).snippet(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).snippet(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.title(java.lang.String) Sets the title for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.title(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#title(String)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#title(String)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.title(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-title-string-title">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-title-string-title</a><br/>
     *
     * @param param0 the param should instanceof java lang String
     * @return the object for which the method was called, with the new title set
     */
    public final org.xms.g.maps.model.MarkerOptions title(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).title(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).title(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).title(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).title(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.visible(boolean) Sets the visibility for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.visible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#visible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#visible(boolean)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.visible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-visible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-visible-boolean-visible</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return the object for which the method was called, with the new visibility state set
     */
    public final org.xms.g.maps.model.MarkerOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.maps.model.MarkerOptions.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.model.MarkerOptions.zIndex(float) Sets the zIndex for the marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MarkerOptions.zIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#zIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-markeroptions#zIndex(float)</a><br/>
     * com.google.android.gms.maps.model.MarkerOptions.zIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-zindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MarkerOptions#public-markeroptions-zindex-float-zindex</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return the object for which the method was called, with the new zIndex set
     */
    public final org.xms.g.maps.model.MarkerOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.MarkerOptions hReturn = ((com.huawei.hms.maps.model.MarkerOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.MarkerOptions gReturn = ((com.google.android.gms.maps.model.MarkerOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MarkerOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}