package org.xms.g.maps.model;

/**
 * A polygon on the earth's surface.<br/>
 * Combination of com.huawei.hms.maps.model.Polygon and com.google.android.gms.maps.model.Polygon.<br/>
 * com.huawei.hms.maps.model.Polygon: Defines a polygon on the surface of the Earth. A polygon can be convex or concave. It can span the 180 meridian and have holes that are not filled in.<br/>
 * com.google.android.gms.maps.model.Polygon: A polygon on the earth's surface. A polygon can be convex or concave, it may span the 180 meridian and it can have holes that are not filled in. It has the following properties:.<br/>
 */
public final class Polygon extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.Polygon.Polygon(org.xms.g.utils.XBox) A polygon on the earth's surface.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public Polygon(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.Polygon.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model Polygon object
     */
    public static org.xms.g.maps.model.Polygon dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Polygon) param0);
    }

    /**
     * org.xms.g.maps.model.Polygon.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Polygon;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Polygon;
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.equals(java.lang.Object) Checks whether a polygon object equals another.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#equals(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#equals(Object)</a><br/>
     * com.google.android.gms.maps.model.Polygon.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-boolean-equals-object-other">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-boolean-equals-object-other</a><br/>
     *
     * @param param0 an Object
     * @return true if both objects are the same object, that is, this == other
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getFillColor() Obtains the fill color of a polygon, in ARGB format.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getFillColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getFillColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getFillColor()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getFillColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-int-getfillcolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-int-getfillcolor</a><br/>
     *
     * @return the color in ARGB format
     */
    public final int getFillColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getFillColor()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getFillColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getFillColor()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getFillColor();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setFillColor(int) Sets the fill color of this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setFillColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setFillColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setFillColor(int)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setFillColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setfillcolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setfillcolor-int-color</a><br/>
     *
     * @param param0 the color in ARGB format
     */
    public final void setFillColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setFillColor(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setFillColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setFillColor(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setFillColor(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getHoles() Returns a snapshot of the holes of this polygon at this time.The list returned is a copy of the list of holes and so changes to the polygon's holes will not be reflected by this list, nor will changes to this list be reflected by the polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getHoles(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getHoles()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getHoles()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getHoles(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-listlistlatlng-getholes">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-listlistlatlng-getholes</a><br/>
     *
     * @return the return object is java util List<java util List<LatLng>>
     */
    public final java.util.List<java.util.List<org.xms.g.maps.model.LatLng>> getHoles() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getHoles()");
            java.util.List<java.util.List<com.huawei.hms.maps.model.LatLng>> hReturn = ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getHoles();
            return org.xms.g.utils.Utils.mapList(hReturn, e -> org.xms.g.utils.Utils.mapList2X(e, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getHoles()");
            java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> gReturn = ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getHoles();
            return org.xms.g.utils.Utils.mapList(gReturn, e -> org.xms.g.utils.Utils.mapList2X(e, false));
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setHoles(java.util.List) Sets the holes of this polygon. This method will take a copy of the holes, so further mutations to holes will have no effect on this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setHoles(java.util.List<? extends java.util.List<com.huawei.hms.maps.model.LatLng>>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setHoles(List%3CList%3CLatLng%3E%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setHoles(List%3CList%3CLatLng%3E%3E)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setHoles(java.util.List<? extends java.util.List<com.google.android.gms.maps.model.LatLng>>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setholes-list-extends-listlatlng-holes">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setholes-list-extends-listlatlng-holes</a><br/>
     *
     * @param param0 the param should be instanceof java util List
     */
    public final void setHoles(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setHoles(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setHoles(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setHoles(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setHoles(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getId() Gets this polygon's id. The id will be unique amongst all Polygons on a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getId(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getId()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getId()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-string-getid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-string-getid</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getId();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getPoints() Returns a snapshot of the vertices of this polygon at this time.The list returned is a copy of the list of vertices and so changes to the polygon's vertices will not be reflected by this list, nor will changes to this list be reflected by the polygon. To change the vertices of the polygon, call setPoints(List).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getPoints(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getPoints()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getPoints()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getPoints(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-listlatlng-getpoints">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-listlatlng-getpoints</a><br/>
     *
     * @return the return object is java util List<LatLng>
     */
    public final java.util.List<org.xms.g.maps.model.LatLng> getPoints() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getPoints()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {

                public org.xms.g.maps.model.LatLng apply(com.huawei.hms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getPoints()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {

                public org.xms.g.maps.model.LatLng apply(com.google.android.gms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setPoints(java.util.List) Sets the points of this polygon. This method will take a copy of the points, so further mutations to points will have no effect on this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setPoints(java.util.List<com.huawei.hms.maps.model.LatLng>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setPoints(List%3CLatLng%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setPoints(List%3CLatLng%3E)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setPoints(java.util.List<com.google.android.gms.maps.model.LatLng>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setpoints-listlatlng-points">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setpoints-listlatlng-points</a><br/>
     *
     * @param param0 the param should be instanceof java util List
     */
    public final void setPoints(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getStrokeColor() Gets the stroke color of this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getStrokeColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getStrokeColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getStrokeColor()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getStrokeColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-int-getstrokecolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-int-getstrokecolor</a><br/>
     *
     * @return the color in ARGB format
     */
    public final int getStrokeColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeColor()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeColor()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeColor();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setStrokeColor(int) Sets the stroke color of this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setStrokeColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setStrokeColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setStrokeColor(int)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setStrokeColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setstrokecolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setstrokecolor-int-color</a><br/>
     *
     * @param param0 the color in ARGB format
     */
    public final void setStrokeColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeColor(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeColor(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeColor(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getStrokeJointType() Gets the stroke joint type used at all vertices of the polygon's outline. See JointType for possible values.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getStrokeJointType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getStrokeJointType()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getStrokeJointType()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getStrokeJointType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-int-getstrokejointtype">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-int-getstrokejointtype</a><br/>
     *
     * @return the stroke joint type
     */
    public final int getStrokeJointType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeJointType()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeJointType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeJointType()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeJointType();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setStrokeJointType(int) Sets the joint type for all vertices of the polygon's outline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setStrokeJointType(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setStrokeJointType(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setStrokeJointType(int)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setStrokeJointType(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setstrokejointtype-int-jointtype">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setstrokejointtype-int-jointtype</a><br/>
     *
     * @param param0 the stroke joint type
     */
    public final void setStrokeJointType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeJointType(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeJointType(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeJointType(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeJointType(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getStrokePattern() Gets the stroke pattern of this polygon's outline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getStrokePattern(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getStrokePattern()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getStrokePattern()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getStrokePattern(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-listpatternitem-getstrokepattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-listpatternitem-getstrokepattern</a><br/>
     *
     * @return the stroke pattern
     */
    public final java.util.List<org.xms.g.maps.model.PatternItem> getStrokePattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokePattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokePattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setStrokePattern(java.util.List) Sets the stroke pattern of the polygon's outline. The default stroke pattern is solid, represented by null.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setStrokePattern(java.util.List<com.huawei.hms.maps.model.PatternItem>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setStrokePattern(List%3CPatternItem%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setStrokePattern(List%3CPatternItem%3E)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setStrokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setstrokepattern-listpatternitem-pattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setstrokepattern-listpatternitem-pattern</a><br/>
     *
     * @param param0 the param should be instanceof java util List
     */
    public final void setStrokePattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getStrokeWidth() Gets the stroke width of this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getStrokeWidth(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getStrokeWidth()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getStrokeWidth()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getStrokeWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-float-getstrokewidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-float-getstrokewidth</a><br/>
     *
     * @return the width in screen pixels
     */
    public final float getStrokeWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeWidth()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getStrokeWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeWidth()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getStrokeWidth();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setStrokeWidth(float) Sets the stroke width of this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setStrokeWidth(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setStrokeWidth(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setStrokeWidth(float)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setStrokeWidth(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setstrokewidth-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setstrokewidth-float-width</a><br/>
     *
     * @param param0 the width in display pixels
     */
    public final void setStrokeWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeWidth(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setStrokeWidth(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeWidth(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setStrokeWidth(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getTag() Gets the tag for the polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getTag(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getTag()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getTag()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getTag(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-object-gettag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-object-gettag</a><br/>
     *
     * @return the tag if a tag was set with setTag; null if no tag has been set
     */
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getTag();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setTag(java.lang.Object) Sets the tag for the polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setTag(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setTag(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setTag(Object)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setTag(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-settag-object-tag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-settag-object-tag</a><br/>
     *
     * @param param0 if null, the tag is cleared
     */
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setTag(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.getZIndex() Gets the zIndex of this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.Polygon.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the polygon
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setZIndex(float) Sets the zIndex of this polygon. Polygons with higher zIndices are drawn above those with lower indices.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setZIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setZIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setZIndex(float)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setZIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setzindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setzindex-float-zindex</a><br/>
     *
     * @param param0 the zIndex of this polygon
     */
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setZIndex(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#hashCode()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#hashCode()</a><br/>
     * com.google.android.gms.maps.model.Polygon.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.isClickable() Gets the clickability of the polygon. If the polygon is clickable, your app will receive notifications to the GoogleMap.OnPolygonClickListener when the user clicks the polygon. The event listener is registered through setOnPolygonClickListener(GoogleMap.OnPolygonClickListener).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.isClickable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#isClickable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#isClickable()</a><br/>
     * com.google.android.gms.maps.model.Polygon.isClickable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-boolean-isclickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-boolean-isclickable</a><br/>
     *
     * @return true if the polygon is clickable; otherwise, returns false
     */
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isClickable();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setClickable(boolean) Sets the clickability of the polygon. If the polygon is clickable, your app will receive notifications to the GoogleMap.OnPolygonClickListener when the user clicks the polygon. The event listener is registered through setOnPolygonClickListener(GoogleMap.OnPolygonClickListener).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setClickable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setClickable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setClickable(boolean)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setClickable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setclickable-boolean-clickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setclickable-boolean-clickable</a><br/>
     *
     * @param param0 New clickability setting for the polygon
     */
    public final void setClickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setClickable(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setClickable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setClickable(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setClickable(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.isGeodesic() Gets whether each segment of the line is drawn as a geodesic or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.isGeodesic(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#isGeodesic()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#isGeodesic()</a><br/>
     * com.google.android.gms.maps.model.Polygon.isGeodesic(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-boolean-isgeodesic">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-boolean-isgeodesic</a><br/>
     *
     * @return true if each segment is drawn as a geodesic; false if each segment is drawn as a straight line on the Mercator projection
     */
    public final boolean isGeodesic() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isGeodesic()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isGeodesic();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isGeodesic()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isGeodesic();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setGeodesic(boolean) Sets whether to draw each segment of the line as a geodesic or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setGeodesic(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setGeodesic(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setGeodesic(boolean)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setGeodesic(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setgeodesic-boolean-geodesic">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setgeodesic-boolean-geodesic</a><br/>
     *
     * @param param0 if true, then each segment is drawn as a geodesic; if false, each segment is drawn as a straight line on the Mercator projection
     */
    public final void setGeodesic(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setGeodesic(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setGeodesic(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setGeodesic(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setGeodesic(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.isVisible() Gets the visibility of this polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#isVisible()</a><br/>
     * com.google.android.gms.maps.model.Polygon.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-boolean-isvisible</a><br/>
     *
     * @return this polygon visibility
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.setVisible(boolean) Sets the visibility of this polygon. When not visible, a polygon is not drawn, but it keeps all its other properties.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.setVisible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setVisible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#setVisible(boolean)</a><br/>
     * com.google.android.gms.maps.model.Polygon.setVisible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setvisible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-setvisible-boolean-visible</a><br/>
     *
     * @param param0 if true, then the polygon is visible; if false, it is not
     */
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).setVisible(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polygon.remove() Removes the polygon from the map. After a polygon has been removed, the behavior of all its methods is undefined.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polygon.remove(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#remove()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygon#remove()</a><br/>
     * com.google.android.gms.maps.model.Polygon.remove(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-remove">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polygon#public-void-remove</a><br/>
     */
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polygon) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.Polygon) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polygon) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.Polygon) this.getGInstance()).remove();
        }
    }
}