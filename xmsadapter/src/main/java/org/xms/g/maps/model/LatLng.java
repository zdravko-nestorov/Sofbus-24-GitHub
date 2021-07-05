package org.xms.g.maps.model;

/**
 * An immutable class representing a pair of latitude and longitude coordinates, stored as degrees.<br/>
 * Combination of com.huawei.hms.maps.model.LatLng and com.google.android.gms.maps.model.LatLng.<br/>
 * com.huawei.hms.maps.model.LatLng: An immutable class that represents the longitude and latitude, in degrees.<br/>
 * com.google.android.gms.maps.model.LatLng: An immutable class representing a pair of latitude and longitude coordinates, stored as degrees.<br/>
 */
public final class LatLng extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.LatLng createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.LatLng hReturn = com.huawei.hms.maps.model.LatLng.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.LatLng gReturn = com.google.android.gms.maps.model.LatLng.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.LatLng[] newArray(int param0) {
            return new org.xms.g.maps.model.LatLng[param0];
        }
    };

    /**
     * org.xms.g.maps.model.LatLng.LatLng(org.xms.g.utils.XBox) An immutable class representing a pair of latitude and longitude coordinates, stored as degrees.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public LatLng(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.LatLng.LatLng(double,double) Constructs a LatLng with the given latitude and longitude, measured in degrees.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLng.LatLng(double,double): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/latlng-0000001050150800-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/latlng-0000001050150800-V5</a><br/>
     * com.google.android.gms.maps.model.LatLng.LatLng(double,double): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-latlng-double-latitude,-double-longitude">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-latlng-double-latitude,-double-longitude</a><br/>
     *
     * @param param0 The point's latitude. This will be clamped to between -90 degrees and +90 degrees inclusive
     * @param param1 The point's longitude. This will be normalized to be within -180 degrees inclusive and +180 degrees exclusive
     */
    public LatLng(double param0, double param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.LatLng(param0, param1));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.LatLng(param0, param1));
        }
    }

    /**
     * org.xms.g.maps.model.LatLng.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.LatLng.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model LatLng object
     */
    public static org.xms.g.maps.model.LatLng dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.LatLng) param0);
    }

    /**
     * org.xms.g.maps.model.LatLng.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.LatLng;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.LatLng;
        }
    }

    /**
     * org.xms.g.maps.model.LatLng.getLatitude() Latitude, in degrees.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLng.latitude: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng</a><br/>
     * com.google.android.gms.maps.model.LatLng.latitude: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-final-double-latitude">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-final-double-latitude</a><br/>
     *
     * @return the return object is double
     */
    public double getLatitude() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).latitude");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).latitude;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).latitude");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).latitude;
        }
    }

    /**
     * org.xms.g.maps.model.LatLng.getLongitude() Longitude, in degrees.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLng.longitude: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng</a><br/>
     * com.google.android.gms.maps.model.LatLng.longitude: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-final-double-longitude">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-final-double-longitude</a><br/>
     *
     * @return the return object is double
     */
    public double getLongitude() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).longitude");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).longitude;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).longitude");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).longitude;
        }
    }

    /**
     * org.xms.g.maps.model.LatLng.equals(java.lang.Object) Tests if this LatLng is equal to another.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLng.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng</a><br/>
     * com.google.android.gms.maps.model.LatLng.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is boolean
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.LatLng.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLng.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng</a><br/>
     * com.google.android.gms.maps.model.LatLng.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.LatLng.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLng.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng</a><br/>
     * com.google.android.gms.maps.model.LatLng.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.model.LatLng.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLng.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlng</a><br/>
     * com.google.android.gms.maps.model.LatLng.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLng#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLng) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.LatLng) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLng) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.LatLng) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}