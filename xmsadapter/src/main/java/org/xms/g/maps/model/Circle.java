package org.xms.g.maps.model;

/**
 * A circle on the earth's surface(spherical cap).<br/>
 * Combination of com.huawei.hms.maps.model.Circle and com.google.android.gms.maps.model.Circle.<br/>
 * com.huawei.hms.maps.model.Circle: Defines a circle on a map. There are two types of circles: solid circle and hollow circle.<br/>
 * com.google.android.gms.maps.model.Circle: A circle on the earth's surface(spherical cap).<br/>
 */
public final class Circle extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.Circle.Circle(org.xms.g.utils.XBox) A circle has the following properties.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public Circle(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.Circle.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model Circle object
     */
    public static org.xms.g.maps.model.Circle dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Circle) param0);
    }

    /**
     * org.xms.g.maps.model.Circle.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Circle;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Circle;
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getCenter() Returns the center as a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getCenter(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getCenter()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getCenter()</a><br/>
     * com.google.android.gms.maps.model.Circle.getCenter(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-latlng-getcenter">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-latlng-getcenter</a><br/>
     *
     * @return The geographic center as a LatLng
     */
    public final org.xms.g.maps.model.LatLng getCenter() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getCenter()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getCenter();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getCenter()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getCenter();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setCenter(org.xms.g.maps.model.LatLng) Sets the center using a LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setCenter(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setCenter(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setCenter(LatLng)</a><br/>
     * com.google.android.gms.maps.model.Circle.setCenter(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setcenter-latlng-center">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setcenter-latlng-center</a><br/>
     *
     * @param param0 The geographic center of the circle, specified as a LatLng
     * @throws java.lang.NullPointerException if center is null
     */
    public final void setCenter(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setCenter(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setCenter(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setCenter(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setCenter(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getFillColor() Returns the fill color of this Circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getFillColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getFillColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getFillColor()</a><br/>
     * com.google.android.gms.maps.model.Circle.getFillColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-int-getfillcolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-int-getfillcolor</a><br/>
     *
     * @return The fill color of the circle in ARGB format
     */
    public final int getFillColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getFillColor()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getFillColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getFillColor()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getFillColor();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setFillColor(int) The fill color is the color inside the circle, in the integer format specified by Color. If TRANSPARENT is used then no fill is drawn.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setFillColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setFillColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setFillColor(int)</a><br/>
     * com.google.android.gms.maps.model.Circle.setFillColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setfillcolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setfillcolor-int-color</a><br/>
     *
     * @param param0 The color in the Color format
     */
    public final void setFillColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setFillColor(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setFillColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setFillColor(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setFillColor(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getId() Gets this circle's id. The id will be unique amongst all Circles on a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getId(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getId()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getId()</a><br/>
     * com.google.android.gms.maps.model.Circle.getId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-string-getid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-string-getid</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getId();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getRadius() Returns the circle's radius, in meters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getRadius(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getRadius()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getRadius()</a><br/>
     * com.google.android.gms.maps.model.Circle.getRadius(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-double-getradius">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-double-getradius</a><br/>
     *
     * @return The radius in meters
     */
    public final double getRadius() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getRadius()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getRadius();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getRadius()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getRadius();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setRadius(double) Sets the radius in meters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setRadius(double): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setRadius(double)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setRadius(double)</a><br/>
     * com.google.android.gms.maps.model.Circle.setRadius(double): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setradius-double-radius">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setradius-double-radius</a><br/>
     *
     * @param param0 The radius, in meters
     * @throws java.lang.IllegalArgumentException if radius is negative
     */
    public final void setRadius(double param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setRadius(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setRadius(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setRadius(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setRadius(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getStrokeColor() Returns the stroke color.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getStrokeColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getStrokeColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getStrokeColor()</a><br/>
     * com.google.android.gms.maps.model.Circle.getStrokeColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-int-getstrokecolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-int-getstrokecolor</a><br/>
     *
     * @return The color of the circle in ARGB format
     */
    public final int getStrokeColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokeColor()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokeColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokeColor()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokeColor();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setStrokeColor(int) The stroke color is the color of this circle's outline, in the integer format specified by Color. If TRANSPARENT is used then no outline is drawn.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setStrokeColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setStrokeColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setStrokeColor(int)</a><br/>
     * com.google.android.gms.maps.model.Circle.setStrokeColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setstrokecolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setstrokecolor-int-color</a><br/>
     *
     * @param param0 The stroke color in the Color format
     */
    public final void setStrokeColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokeColor(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokeColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokeColor(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokeColor(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getStrokePattern() Returns the stroke pattern of this circle's outline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getStrokePattern(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getStrokePattern()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getStrokePattern()</a><br/>
     * com.google.android.gms.maps.model.Circle.getStrokePattern(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-listpatternitem-getstrokepattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-listpatternitem-getstrokepattern</a><br/>
     *
     * @return the stroke pattern
     */
    public final java.util.List<org.xms.g.maps.model.PatternItem> getStrokePattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokePattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokePattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setStrokePattern(java.util.List) Sets the stroke pattern of the circle's outline. The default stroke pattern is solid, represented by null.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setStrokePattern(java.util.List<com.huawei.hms.maps.model.PatternItem>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setStrokePattern(List%3CPatternItem%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setStrokePattern(List%3CPatternItem%3E)</a><br/>
     * com.google.android.gms.maps.model.Circle.setStrokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setstrokepattern-listpatternitem-pattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setstrokepattern-listpatternitem-pattern</a><br/>
     *
     * @param param0 the param should be instanceof java util List
     */
    public final void setStrokePattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getStrokeWidth() Returns the stroke width.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getStrokeWidth(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getStrokeWidth()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getStrokeWidth()</a><br/>
     * com.google.android.gms.maps.model.Circle.getStrokeWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-float-getstrokewidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-float-getstrokewidth</a><br/>
     *
     * @return The width in screen pixels
     */
    public final float getStrokeWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokeWidth()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getStrokeWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokeWidth()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getStrokeWidth();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setStrokeWidth(float) The stroke width is the width(in screen pixels)of the circle's outline. It must be zero or greater. If it is zero then no outline is drawn. The default value is 10.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setStrokeWidth(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setStrokeWidth(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setStrokeWidth(float)</a><br/>
     * com.google.android.gms.maps.model.Circle.setStrokeWidth(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setstrokewidth-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setstrokewidth-float-width</a><br/>
     *
     * @param param0 The stroke width, in screen pixels
     * @throws java.lang.IllegalArgumentException if width is negative
     */
    public final void setStrokeWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokeWidth(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setStrokeWidth(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokeWidth(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setStrokeWidth(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getTag() Gets the tag for the circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getTag(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getTag()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getTag()</a><br/>
     * com.google.android.gms.maps.model.Circle.getTag(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-object-gettag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-object-gettag</a><br/>
     *
     * @return the tag if a tag was set with setTag; null if no tag has been set
     */
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getTag();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setTag(java.lang.Object) Sets the tag for the circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setTag(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setTag(T)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setTag(T)</a><br/>
     * com.google.android.gms.maps.model.Circle.setTag(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-settag-object-tag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-settag-object-tag</a><br/>
     *
     * @param param0 if null, the tag is cleared
     */
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setTag(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Circle.getZIndex() Returns the zIndex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.Circle.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-float-getzindex</a><br/>
     *
     * @return The zIndex of this circle
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setZIndex(float) Overlays(such as circles)with higher zIndices are drawn above those with lower indices.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setZIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setZIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setZIndex(float)</a><br/>
     * com.google.android.gms.maps.model.Circle.setZIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setzindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setzindex-float-zindex</a><br/>
     *
     * @param param0 The zIndex value
     */
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setZIndex(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Circle.isClickable() Gets the clickability of the circle. If the circle is clickable, your app will receive notifications to the GoogleMap.OnCircleClickListener when the user clicks the circle. The event listener is registered through setOnCircleClickListener(GoogleMap.OnCircleClickListener).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.isClickable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#isClickable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#isClickable()</a><br/>
     * com.google.android.gms.maps.model.Circle.isClickable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-boolean-isclickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-boolean-isclickable</a><br/>
     *
     * @return true if the circle is clickable; false if it is not clickable
     */
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).isClickable();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setClickable(boolean) Sets the clickability of the circle. If the circle is clickable, your app will receive notifications to the GoogleMap.OnCircleClickListener when the user clicks the circle. The event listener is registered through setOnCircleClickListener(GoogleMap.OnCircleClickListener).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setClickable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setClickable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setClickable(boolean)</a><br/>
     * com.google.android.gms.maps.model.Circle.setClickable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setclickable-boolean-clickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setclickable-boolean-clickable</a><br/>
     *
     * @param param0 New clickability setting for the circle
     */
    public final void setClickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setClickable(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setClickable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setClickable(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setClickable(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Circle.isVisible() Checks whether the circle is visible.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#isVisible()</a><br/>
     * com.google.android.gms.maps.model.Circle.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-boolean-isvisible</a><br/>
     *
     * @return true if the circle is visible; false if it is invisible
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.Circle) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.Circle) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.Circle.setVisible(boolean) Sets the visibility of the circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.setVisible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setVisible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#setVisible(boolean)</a><br/>
     * com.google.android.gms.maps.model.Circle.setVisible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setvisible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-setvisible-boolean-visible</a><br/>
     *
     * @param param0 true to make this circle visible; false to make it invisible
     */
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).setVisible(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Circle.remove() Removes this circle from the map. After a circle has been removed, the behavior of all its methods is undefined.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Circle.remove(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#remove()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-circle#remove()</a><br/>
     * com.google.android.gms.maps.model.Circle.remove(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-remove">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Circle#public-void-remove</a><br/>
     */
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Circle) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.Circle) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Circle) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.Circle) this.getGInstance()).remove();
        }
    }
}