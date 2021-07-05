package org.xms.g.maps.model;

/**
 * A polyline is a list of points, where line segments are drawn between consecutive points.<br/>
 * Combination of com.huawei.hms.maps.model.Polyline and com.google.android.gms.maps.model.Polyline.<br/>
 * com.huawei.hms.maps.model.Polyline: Defines a polyline, which is a list of vertices, where line segments are drawn between consecutive vertices. The following table describes attributes of a polyline.<br/>
 * com.google.android.gms.maps.model.Polyline: A polyline is a list of points, where line segments are drawn between consecutive points. A polyline has the following properties:.<br/>
 */
public final class Polyline extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.Polyline.Polyline(org.xms.g.utils.XBox) A polyline is a list of points, where line segments are drawn between consecutive points.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public Polyline(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.Polyline.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model Polyline object
     */
    public static org.xms.g.maps.model.Polyline dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Polyline) param0);
    }

    /**
     * org.xms.g.maps.model.Polyline.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Polyline;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Polyline;
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.equals(java.lang.Object) Tests if this Polyline is equal to another.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#equals(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#equals(Object)</a><br/>
     * com.google.android.gms.maps.model.Polyline.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-boolean-equals-object-other">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-boolean-equals-object-other</a><br/>
     *
     * @param param0 an Object
     * @return true if both objects are the same object, that is, this == other
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getColor() Gets the color of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getColor()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-int-getcolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-int-getcolor</a><br/>
     *
     * @return the color in ARGB format
     */
    public final int getColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getColor()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getColor()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getColor();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setColor(int) Sets the color of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setColor(int)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setcolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setcolor-int-color</a><br/>
     *
     * @param param0 the color in ARGB format
     */
    public final void setColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setColor(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setColor(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setColor(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setColor(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getEndCap() Gets the cap at the end vertex of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getEndCap(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getEndCap()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getEndCap()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getEndCap(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-cap-getendcap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-cap-getendcap</a><br/>
     *
     * @return the end cap type
     */
    public final org.xms.g.maps.model.Cap getEndCap() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getEndCap()");
            com.huawei.hms.maps.model.Cap hReturn = ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getEndCap();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Cap(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getEndCap()");
            com.google.android.gms.maps.model.Cap gReturn = ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getEndCap();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Cap(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setEndCap(org.xms.g.maps.model.Cap) Sets the cap at the end vertex of this polyline. The default end cap is ButtCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setEndCap(com.huawei.hms.maps.model.Cap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setEndCap(Cap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setEndCap(Cap)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setEndCap(com.google.android.gms.maps.model.Cap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setendcap-cap-endcap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setendcap-cap-endcap</a><br/>
     *
     * @param param0 the end cap. Must not be null
     */
    public final void setEndCap(org.xms.g.maps.model.Cap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setEndCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setEndCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setEndCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setEndCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getId() Gets this polyline's id. The id will be unique amongst all Polylines on a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getId(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getId()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getId()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-string-getid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-string-getid</a><br/>
     *
     * @return this polyline's id
     */
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getId();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getJointType() Gets the joint type used at all vertices of the polyline except the start and end vertices. See JointType for possible values.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getJointType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getJointType()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getJointType()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getJointType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-int-getjointtype">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-int-getjointtype</a><br/>
     *
     * @return the joint type
     */
    public final int getJointType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getJointType()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getJointType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getJointType()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getJointType();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setJointType(int) Sets the joint type for all vertices of the polyline except the start and end vertices.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setJointType(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setJointType(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setJointType(int)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setJointType(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setjointtype-int-jointtype">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setjointtype-int-jointtype</a><br/>
     *
     * @param param0 the joint type
     */
    public final void setJointType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setJointType(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setJointType(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setJointType(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setJointType(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getPattern() Gets the stroke pattern of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getPattern(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getPattern()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getPattern()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getPattern(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-listpatternitem-getpattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-listpatternitem-getpattern</a><br/>
     *
     * @return the stroke pattern
     */
    public final java.util.List<org.xms.g.maps.model.PatternItem> getPattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getPattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getPattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getPattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getPattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setPattern(java.util.List) Sets the stroke pattern of the polyline. The default stroke pattern is solid, represented by null.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setPattern(java.util.List<com.huawei.hms.maps.model.PatternItem>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setPattern(List%3CPatternItem%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setPattern(List%3CPatternItem%3E)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setPattern(java.util.List<com.google.android.gms.maps.model.PatternItem>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setpattern-listpatternitem-pattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setpattern-listpatternitem-pattern</a><br/>
     *
     * @param param0 the param should be instanceof java util List
     */
    public final void setPattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setPattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setPattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setPattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setPattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getPoints() Returns a snapshot of the vertices of this polyline at this time.The list returned is a copy of the list of vertices and so changes to the polyline's vertices will not be reflected by this list, nor will changes to this list be reflected by the polyline. To change the vertices of the polyline, call setPoints(List).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getPoints(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getPoints()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getPoints()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getPoints(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-listlatlng-getpoints">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-listlatlng-getpoints</a><br/>
     *
     * @return the return object is java util List<LatLng>
     */
    public final java.util.List<org.xms.g.maps.model.LatLng> getPoints() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getPoints()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {

                public org.xms.g.maps.model.LatLng apply(com.huawei.hms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getPoints()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {

                public org.xms.g.maps.model.LatLng apply(com.google.android.gms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setPoints(java.util.List) Sets the points of this polyline. This method will take a copy of the points, so further mutations to points will have no effect on this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setPoints(java.util.List<com.huawei.hms.maps.model.LatLng>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setPoints(List%3CLatLng%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setPoints(List%3CLatLng%3E)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setPoints(java.util.List<com.google.android.gms.maps.model.LatLng>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setpoints-listlatlng-points">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setpoints-listlatlng-points</a><br/>
     *
     * @param param0 the param should be instanceof java util List
     */
    public final void setPoints(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setPoints(org.xms.g.utils.Utils.mapList2GH(param0, false));
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getStartCap() Gets the cap at the start vertex of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getStartCap(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getStartCap()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getStartCap()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getStartCap(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-cap-getstartcap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-cap-getstartcap</a><br/>
     *
     * @return the start cap
     */
    public final org.xms.g.maps.model.Cap getStartCap() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getStartCap()");
            com.huawei.hms.maps.model.Cap hReturn = ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getStartCap();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Cap(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getStartCap()");
            com.google.android.gms.maps.model.Cap gReturn = ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getStartCap();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Cap(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setStartCap(org.xms.g.maps.model.Cap) Sets the cap at the start vertex of this polyline. The default start cap is ButtCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setStartCap(com.huawei.hms.maps.model.Cap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setStartCap(Cap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setStartCap(Cap)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setStartCap(com.google.android.gms.maps.model.Cap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setstartcap-cap-startcap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setstartcap-cap-startcap</a><br/>
     *
     * @param param0 the start cap. Must not be null
     */
    public final void setStartCap(org.xms.g.maps.model.Cap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setStartCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setStartCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setStartCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setStartCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getTag() Gets the tag for the polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getTag(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getTag()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getTag()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getTag(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-object-gettag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-object-gettag</a><br/>
     *
     * @return the tag if a tag was set with setTag; null if no tag has been set
     */
    public final java.lang.Object getTag() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getTag()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getTag();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getTag()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getTag();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setTag(java.lang.Object) Sets the tag for the polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setTag(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setTag(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setTag(Object)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setTag(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-settag-object-tag">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-settag-object-tag</a><br/>
     *
     * @param param0 if null, the tag is cleared
     */
    public final void setTag(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setTag(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setTag(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setTag(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setTag(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getWidth() Gets the width of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getWidth(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getWidth()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getWidth()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-float-getwidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-float-getwidth</a><br/>
     *
     * @return the width in screen pixels
     */
    public final float getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getWidth();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setWidth(float) Sets the width of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setWidth(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setWidth(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setWidth(float)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setWidth(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setwidth-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setwidth-float-width</a><br/>
     *
     * @param param0 the width in screen pixels
     */
    public final void setWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setWidth(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setWidth(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setWidth(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setWidth(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.getZIndex() Gets the zIndex of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.Polyline.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the polyline
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setZIndex(float) Sets the zIndex of this polyline. Polylines with higher zIndices are drawn above those with lower indices.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setZIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setZIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setZIndex(float)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setZIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setzindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setzindex-float-zindex</a><br/>
     *
     * @param param0 the zIndex of this polyline
     */
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setZIndex(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#hashCode()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#hashCode()</a><br/>
     * com.google.android.gms.maps.model.Polyline.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.isClickable() Gets the clickability of the polyline. If the polyline is clickable, your app will receive notifications to the GoogleMap.OnPolylineClickListener when the user clicks the polyline. The event listener is registered through setOnPolylineClickListener(GoogleMap.OnPolylineClickListener).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.isClickable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#isClickable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#isClickable()</a><br/>
     * com.google.android.gms.maps.model.Polyline.isClickable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-boolean-isclickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-boolean-isclickable</a><br/>
     *
     * @return true if the polyline is clickable; otherwise, returns false
     */
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isClickable();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setClickable(boolean) Sets the clickability of the polyline. If the polyline is clickable, your app will receive notifications to the GoogleMap.OnPolylineClickListener when the user clicks the polyline. The event listener is registered through setOnPolylineClickListener(GoogleMap.OnPolylineClickListener).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setClickable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setClickable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setClickable(boolean)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setClickable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setclickable-boolean-clickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setclickable-boolean-clickable</a><br/>
     *
     * @param param0 New clickability setting for the polyline
     */
    public final void setClickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setClickable(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setClickable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setClickable(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setClickable(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.isGeodesic() Gets whether each segment of the line is drawn as a geodesic or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.isGeodesic(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#isGeodesic()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#isGeodesic()</a><br/>
     * com.google.android.gms.maps.model.Polyline.isGeodesic(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-boolean-isgeodesic">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-boolean-isgeodesic</a><br/>
     *
     * @return true if each segment is drawn as a geodesic; false if each segment is drawn as a straight line on the Mercator projection
     */
    public final boolean isGeodesic() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isGeodesic()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isGeodesic();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isGeodesic()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isGeodesic();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setGeodesic(boolean) Sets whether to draw each segment of the line as a geodesic or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setGeodesic(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setGeodesic(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setGeodesic(boolean)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setGeodesic(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setgeodesic-boolean-geodesic">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setgeodesic-boolean-geodesic</a><br/>
     *
     * @param param0 if true, then each segment is drawn as a geodesic; if false, each segment is drawn as a straight line on the Mercator projection
     */
    public final void setGeodesic(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setGeodesic(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setGeodesic(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setGeodesic(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setGeodesic(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.isVisible() Gets the visibility of this polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#isVisible()</a><br/>
     * com.google.android.gms.maps.model.Polyline.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-boolean-isvisible</a><br/>
     *
     * @return this polyline's visibility
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.setVisible(boolean) Sets the visibility of this polyline. When not visible, a polyline is not drawn, but it keeps all its other properties.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.setVisible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setVisible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#setVisible(boolean)</a><br/>
     * com.google.android.gms.maps.model.Polyline.setVisible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setvisible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-setvisible-boolean-visible</a><br/>
     *
     * @param param0 if true, then the polyline is visible; if false, it is not
     */
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).setVisible(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Polyline.remove() Removes this polyline from the map. After a polyline has been removed, the behavior of all its methods is undefined.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Polyline.remove(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#remove()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polyline#remove()</a><br/>
     * com.google.android.gms.maps.model.Polyline.remove(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-remove">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Polyline#public-void-remove</a><br/>
     */
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Polyline) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.Polyline) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Polyline) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.Polyline) this.getGInstance()).remove();
        }
    }
}