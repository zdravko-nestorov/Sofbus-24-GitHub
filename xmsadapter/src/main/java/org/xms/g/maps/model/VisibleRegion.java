package org.xms.g.maps.model;

/**
 * Contains the four points defining the four-sided polygon that is visible in a map's camera.<br/>
 * Combination of com.huawei.hms.maps.model.VisibleRegion and com.google.android.gms.maps.model.VisibleRegion.<br/>
 * com.huawei.hms.maps.model.VisibleRegion: Implements the Parcelable API. This class contains four points that define a tetragon visible in the camera of a map. The tetragon may be a trapezoid instead of rectangle because the camera may tilt. If the camera is directly over the center of the visible region, the shape is rectangular. If the camera tilts, the shape will be a trapezoid whose smallest side is closest to the point of view.<br/>
 * com.google.android.gms.maps.model.VisibleRegion: Contains the four points defining the four-sided polygon that is visible in a map's camera. This polygon can be a trapezoid instead of a rectangle, because a camera can have tilt. If the camera is directly over the center of the camera, the shape is rectangular, but if the camera is tilted, the shape will appear to be a trapezoid whose smallest side is closest to the point of view.<br/>
 */
public final class VisibleRegion extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.VisibleRegion createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.VisibleRegion hReturn = com.huawei.hms.maps.model.VisibleRegion.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.VisibleRegion(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.VisibleRegion gReturn = com.google.android.gms.maps.model.VisibleRegion.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.VisibleRegion(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.VisibleRegion[] newArray(int param0) {
            return new org.xms.g.maps.model.VisibleRegion[param0];
        }
    };

    /**
     * org.xms.g.maps.model.VisibleRegion.VisibleRegion(org.xms.g.utils.XBox) Contains the four points defining the four-sided polygon that is visible in a map's camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public VisibleRegion(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.VisibleRegion(org.xms.g.maps.model.LatLng,org.xms.g.maps.model.LatLng,org.xms.g.maps.model.LatLng,org.xms.g.maps.model.LatLng,org.xms.g.maps.model.LatLngBounds) Contains the four points defining the four-sided polygon that is visible in a map's camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.VisibleRegion(com.huawei.hms.maps.model.LatLng,com.huawei.hms.maps.model.LatLng,com.huawei.hms.maps.model.LatLng,com.huawei.hms.maps.model.LatLng,com.huawei.hms.maps.model.LatLngBounds): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/visibleregion-0000001050153385-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/visibleregion-0000001050153385-V5</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.VisibleRegion(com.google.android.gms.maps.model.LatLng,com.google.android.gms.maps.model.LatLng,com.google.android.gms.maps.model.LatLng,com.google.android.gms.maps.model.LatLng,com.google.android.gms.maps.model.LatLngBounds): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion</a><br/>
     *
     * @param param0 a LatLng object containing the latitude and longitude of the far left corner of the region
     * @param param1 a LatLng object containing the latitude and longitude of the far right corner of the region
     * @param param2 a LatLng object containing the latitude and longitude of the near left corner of the region
     * @param param3 a LatLng object containing the latitude and longitude of the near right corner of the region
     * @param param4 the smallest bounding box that includes the visible region defined in this class. If this box crosses the 180?? meridian (the vertical line from north to south), the longitude in farRight will be negative and the longitude in farLeft will be positive. Same applies to nearRight and nearLeft
     */
    public VisibleRegion(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.LatLng param1, org.xms.g.maps.model.LatLng param2, org.xms.g.maps.model.LatLng param3, org.xms.g.maps.model.LatLngBounds param4) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.VisibleRegion(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.LatLng) ((param1) == null ? null : (param1.getHInstance()))), ((com.huawei.hms.maps.model.LatLng) ((param2) == null ? null : (param2.getHInstance()))), ((com.huawei.hms.maps.model.LatLng) ((param3) == null ? null : (param3.getHInstance()))), ((com.huawei.hms.maps.model.LatLngBounds) ((param4) == null ? null : (param4.getHInstance())))));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.VisibleRegion(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.LatLng) ((param1) == null ? null : (param1.getGInstance()))), ((com.google.android.gms.maps.model.LatLng) ((param2) == null ? null : (param2.getGInstance()))), ((com.google.android.gms.maps.model.LatLng) ((param3) == null ? null : (param3.getGInstance()))), ((com.google.android.gms.maps.model.LatLngBounds) ((param4) == null ? null : (param4.getGInstance())))));
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.VisibleRegion.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model VisibleRegion object
     */
    public static org.xms.g.maps.model.VisibleRegion dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.VisibleRegion) param0);
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.VisibleRegion;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.VisibleRegion;
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.getFarLeft() LatLng object that defines the far left corner of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.farLeft: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.farLeft: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlng-farleft">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlng-farleft</a><br/>
     *
     * @return the return object is maps model LatLng
     */
    public org.xms.g.maps.model.LatLng getFarLeft() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).farLeft");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).farLeft;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).farLeft");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).farLeft;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.getFarRight() LatLng object that defines the far right corner of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.farRight: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.farRight: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlng-farright">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlng-farright</a><br/>
     *
     * @return the return object is maps model LatLng
     */
    public org.xms.g.maps.model.LatLng getFarRight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).farRight");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).farRight;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).farRight");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).farRight;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.getLatLngBounds() The smallest bounding box that includes the visible region defined in this class.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.latLngBounds: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.latLngBounds: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlngbounds-latlngbounds">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlngbounds-latlngbounds</a><br/>
     *
     * @return the return object is maps model LatLngBounds
     */
    public org.xms.g.maps.model.LatLngBounds getLatLngBounds() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).latLngBounds");
            com.huawei.hms.maps.model.LatLngBounds hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).latLngBounds;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).latLngBounds");
            com.google.android.gms.maps.model.LatLngBounds gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).latLngBounds;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.getNearLeft() LatLng object that defines the bottom left corner of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.nearLeft: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.nearLeft: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlng-nearleft">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlng-nearleft</a><br/>
     *
     * @return the return object is maps model LatLng
     */
    public org.xms.g.maps.model.LatLng getNearLeft() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).nearLeft");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).nearLeft;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).nearLeft");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).nearLeft;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.getNearRight() LatLng object that defines the bottom right corner of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.nearRight: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.nearRight: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlng-nearright">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-final-latlng-nearright</a><br/>
     *
     * @return the return object is maps model LatLng
     */
    public org.xms.g.maps.model.LatLng getNearRight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).nearRight");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).nearRight;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).nearRight");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).nearRight;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.equals(java.lang.Object) Compares this VisibleRegion to another object. If the other object is actually a pointer to this object, or if all four corners and the bounds of the two objects are the same, this method returns true. Otherwise, this method returns false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion#equals(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion#equals(Object)</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 an Object. Return true if both objects are the same object, or if all four corners and the bounds of the two objects are the same. Return false otherwise
     * @return the return object is boolean
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.hashCode() hash Code .<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.model.VisibleRegion.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.VisibleRegion.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-visibleregion</a><br/>
     * com.google.android.gms.maps.model.VisibleRegion.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/VisibleRegion#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.VisibleRegion) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.VisibleRegion) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}