package org.xms.g.maps.model;

/**
 * Defines options for a Circle.<br/>
 * Combination of com.huawei.hms.maps.model.CircleOptions and com.google.android.gms.maps.model.CircleOptions.<br/>
 * com.huawei.hms.maps.model.CircleOptions: Defines attributes for a Circle object.<br/>
 * com.google.android.gms.maps.model.CircleOptions: Defines options for a Circle.<br/>
 */
public final class CircleOptions extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.CircleOptions.CircleOptions(org.xms.g.utils.XBox) Defines options for a Circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.CircleOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/circleoptions-0000001050150596-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/circleoptions-0000001050150596-V5</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.CircleOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#CircleOptions()">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#CircleOptions()</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public CircleOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.CircleOptions.CircleOptions() Defines options for a Circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.CircleOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/circleoptions-0000001050150596-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/circleoptions-0000001050150596-V5</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.CircleOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#CircleOptions()">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#CircleOptions()</a><br/>
     */
    public CircleOptions() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.CircleOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.CircleOptions());
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.CircleOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model CircleOptions object
     */
    public static org.xms.g.maps.model.CircleOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.CircleOptions) param0);
    }

    /**
     * org.xms.g.maps.model.CircleOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.CircleOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.CircleOptions;
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.center(org.xms.g.maps.model.LatLng) Sets the center using a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.center(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#center(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#center(LatLng)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.center(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-center-latlng-center">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-center-latlng-center</a><br/>
     *
     * @param param0 The geographic center as a LatLng
     * @return this CircleOptions object
     */
    public final org.xms.g.maps.model.CircleOptions center(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).center(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).center(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).center(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).center(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.clickable(boolean) Specifies whether this circle is clickable. The default setting is false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.clickable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#clickable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#clickable(boolean)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.clickable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-clickable-boolean-clickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-clickable-boolean-clickable</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this CircleOptions object with a new clickability setting
     */
    public final org.xms.g.maps.model.CircleOptions clickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).clickable(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).clickable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).clickable(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).clickable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.fillColor(int) Sets the fill color.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.fillColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#fillColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#fillColor(int)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.fillColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-fillcolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-fillcolor-int-color</a><br/>
     *
     * @param param0 color in the Color format
     * @return this CircleOptions object
     */
    public final org.xms.g.maps.model.CircleOptions fillColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).fillColor(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).fillColor(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).fillColor(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).fillColor(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.getCenter() Returns the center as a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.getCenter(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getCenter()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getCenter()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.getCenter(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-latlng-getcenter">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-latlng-getcenter</a><br/>
     *
     * @return The geographic center as a LatLng
     */
    public final org.xms.g.maps.model.LatLng getCenter() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getCenter()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getCenter();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getCenter()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getCenter();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.getFillColor() Returns the fill color.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.getFillColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getFillColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getFillColor()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.getFillColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-int-getfillcolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-int-getfillcolor</a><br/>
     *
     * @return The color in the Color format
     */
    public final int getFillColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getFillColor()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getFillColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getFillColor()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getFillColor();
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.getRadius() Returns the circle's radius, in meters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.getRadius(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getRadius()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getRadius()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.getRadius(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-double-getradius">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-double-getradius</a><br/>
     *
     * @return The radius in meters
     */
    public final double getRadius() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getRadius()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getRadius();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getRadius()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getRadius();
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.getStrokeColor() Returns the stroke color.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.getStrokeColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getStrokeColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getStrokeColor()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.getStrokeColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-int-getstrokecolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-int-getstrokecolor</a><br/>
     *
     * @return The color in the Color format
     */
    public final int getStrokeColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokeColor()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokeColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokeColor()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokeColor();
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.getStrokePattern() Returns the stroke pattern set in this CircleOptions object for the circle's outline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.getStrokePattern(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getStrokePattern()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getStrokePattern()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.getStrokePattern(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-listpatternitem-getstrokepattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-listpatternitem-getstrokepattern</a><br/>
     *
     * @return the stroke pattern of the circle's outline
     */
    public final java.util.List<org.xms.g.maps.model.PatternItem> getStrokePattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokePattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokePattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.getStrokeWidth() Returns the stroke width.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.getStrokeWidth(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getStrokeWidth()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getStrokeWidth()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.getStrokeWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-float-getstrokewidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-float-getstrokewidth</a><br/>
     *
     * @return The width in screen pixels
     */
    public final float getStrokeWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokeWidth()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getStrokeWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokeWidth()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getStrokeWidth();
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.getZIndex() Returns the zIndex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-float-getzindex</a><br/>
     *
     * @return The zIndex value
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.isClickable() Gets the clickability setting for the circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.isClickable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#isClickable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#isClickable()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.isClickable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-boolean-isclickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-boolean-isclickable</a><br/>
     *
     * @return true if the circle is clickable; false if it is not
     */
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).isClickable();
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.isVisible() Checks whether the circle is visible.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#isVisible()</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-boolean-isvisible</a><br/>
     *
     * @return true if the circle is visible; false if it is invisible
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.radius(double) Sets the radius in meters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.radius(double): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#radius(double)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#radius(double)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.radius(double): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-radius-double-radius">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-radius-double-radius</a><br/>
     *
     * @param param0 radius in meters
     * @return this CircleOptions object
     */
    public final org.xms.g.maps.model.CircleOptions radius(double param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).radius(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).radius(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).radius(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).radius(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.strokeColor(int) Sets the stroke color.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.strokeColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#strokeColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#strokeColor(int)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.strokeColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-strokecolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-strokecolor-int-color</a><br/>
     *
     * @param param0 color in the Color format
     * @return this CircleOptions object
     */
    public final org.xms.g.maps.model.CircleOptions strokeColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokeColor(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokeColor(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokeColor(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokeColor(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.strokePattern(java.util.List) Sets a stroke pattern for the circle's outline. The default stroke pattern is solid, represented by null.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.strokePattern(java.util.List<com.huawei.hms.maps.model.PatternItem>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#strokePattern(List%3CPatternItem%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#strokePattern(List%3CPatternItem%3E)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.strokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-strokepattern-listpatternitem-pattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-strokepattern-listpatternitem-pattern</a><br/>
     *
     * @param param0 the param should instanceof java util List
     * @return the return object is maps model CircleOptions
     */
    public final org.xms.g.maps.model.CircleOptions strokePattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.strokeWidth(float) Sets the stroke width.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.strokeWidth(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#strokeWidth(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#strokeWidth(float)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.strokeWidth(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-strokewidth-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-strokewidth-float-width</a><br/>
     *
     * @param param0 width in screen pixels
     * @return this CircleOptions object
     */
    public final org.xms.g.maps.model.CircleOptions strokeWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokeWidth(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).strokeWidth(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokeWidth(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).strokeWidth(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.visible(boolean) Sets the visibility.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.visible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#visible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#visible(boolean)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.visible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-visible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-visible-boolean-visible</a><br/>
     *
     * @param param0 false to make this circle invisible
     * @return this CircleOptions object
     */
    public final org.xms.g.maps.model.CircleOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CircleOptions.zIndex(float) Sets the zIndex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CircleOptions.zIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#zIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circleoptions#zIndex(float)</a><br/>
     * com.google.android.gms.maps.model.CircleOptions.zIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-zindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CircleOptions#public-circleoptions-zindex-float-zindex</a><br/>
     *
     * @param param0 zIndex value
     * @return this CircleOptions object
     */
    public final org.xms.g.maps.model.CircleOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.CircleOptions hReturn = ((com.huawei.hms.maps.model.CircleOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.CircleOptions gReturn = ((com.google.android.gms.maps.model.CircleOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CircleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
}