package org.xms.g.maps.model;

/**
 * Contains information about a PointOfInterest that was clicked on.<br/>
 * Combination of com.huawei.hms.maps.model.PointOfInterest and com.google.android.gms.maps.model.PointOfInterest.<br/>
 * com.huawei.hms.maps.model.PointOfInterest: Contains attributes about a POI that is tapped.<br/>
 * com.google.android.gms.maps.model.PointOfInterest: Contains information about a PointOfInterest that was clicked on.<br/>
 */
public final class PointOfInterest extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.PointOfInterest createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.PointOfInterest hReturn = com.huawei.hms.maps.model.PointOfInterest.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.PointOfInterest(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.PointOfInterest gReturn = com.google.android.gms.maps.model.PointOfInterest.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.PointOfInterest(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.PointOfInterest[] newArray(int param0) {
            return new org.xms.g.maps.model.PointOfInterest[param0];
        }
    };

    /**
     * org.xms.g.maps.model.PointOfInterest.PointOfInterest(org.xms.g.utils.XBox) Contains information about a PointOfInterest that was clicked on.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public PointOfInterest(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.PointOfInterest.PointOfInterest(org.xms.g.maps.model.LatLng,java.lang.String,java.lang.String) Contains information about a PointOfInterest that was clicked on.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PointOfInterest.PointOfInterest(com.huawei.hms.maps.model.LatLng,java.lang.String,java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/pointofinterest-0000001050152963-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/pointofinterest-0000001050152963-V5</a><br/>
     * com.google.android.gms.maps.model.PointOfInterest.PointOfInterest(com.google.android.gms.maps.model.LatLng,java.lang.String,java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest</a><br/>
     *
     * @param param0 the placeId of the POI
     * @param param1 the name of the POI
     * @param param2 the LatLng of the POI
     */
    public PointOfInterest(org.xms.g.maps.model.LatLng param0, java.lang.String param1, java.lang.String param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.PointOfInterest(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.PointOfInterest(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1, param2));
        }
    }

    /**
     * org.xms.g.maps.model.PointOfInterest.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.PointOfInterest.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model PointOfInterest object
     */
    public static org.xms.g.maps.model.PointOfInterest dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.PointOfInterest) param0);
    }

    /**
     * org.xms.g.maps.model.PointOfInterest.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.PointOfInterest;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.PointOfInterest;
        }
    }

    /**
     * org.xms.g.maps.model.PointOfInterest.getLatLng() The LatLng of the POI.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PointOfInterest.latLng: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-poi">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-poi</a><br/>
     * com.google.android.gms.maps.model.PointOfInterest.latLng: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest#public-final-latlng-latlng">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest#public-final-latlng-latlng</a><br/>
     *
     * @return the return object is maps model LatLng
     */
    public org.xms.g.maps.model.LatLng getLatLng() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).latLng");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).latLng;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).latLng");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).latLng;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PointOfInterest.getName() The name of the POI.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PointOfInterest.name: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-poi">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-poi</a><br/>
     * com.google.android.gms.maps.model.PointOfInterest.name: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest#public-final-string-name">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest#public-final-string-name</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String getName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).name");
            return ((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).name;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).name");
            return ((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).name;
        }
    }

    /**
     * org.xms.g.maps.model.PointOfInterest.getPlaceId() The placeId of the POI.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PointOfInterest.placeId: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-poi">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-poi</a><br/>
     * com.google.android.gms.maps.model.PointOfInterest.placeId: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest#public-final-string-placeid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest#public-final-string-placeid</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String getPlaceId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).placeId");
            return ((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).placeId;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).placeId");
            return ((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).placeId;
        }
    }

    /**
     * org.xms.g.maps.model.PointOfInterest.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PointOfInterest.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-poi">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-poi</a><br/>
     * com.google.android.gms.maps.model.PointOfInterest.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PointOfInterest#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.PointOfInterest) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.PointOfInterest) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}