package org.xms.g.maps.model;

/**
 * An immutable class representing a latitude/longitude aligned rectangle.<br/>
 * Combination of com.huawei.hms.maps.model.LatLngBounds and com.google.android.gms.maps.model.LatLngBounds.<br/>
 * com.huawei.hms.maps.model.LatLngBounds: An immutable class that represents a longitude/latitude aligned rectangle.<br/>
 * com.google.android.gms.maps.model.LatLngBounds: An immutable class representing a latitude/longitude aligned rectangle.<br/>
 */
public final class LatLngBounds extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.LatLngBounds createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.LatLngBounds hReturn = com.huawei.hms.maps.model.LatLngBounds.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.LatLngBounds gReturn = com.google.android.gms.maps.model.LatLngBounds.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.LatLngBounds[] newArray(int param0) {
            return new org.xms.g.maps.model.LatLngBounds[param0];
        }
    };

    /**
     * org.xms.g.maps.model.LatLngBounds.LatLngBounds(org.xms.g.utils.XBox) An immutable class representing a latitude/longitude aligned rectangle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public LatLngBounds(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.LatLngBounds(org.xms.g.maps.model.LatLng,org.xms.g.maps.model.LatLng) An immutable class representing a latitude/longitude aligned rectangle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.LatLngBounds(com.huawei.hms.maps.model.LatLng,com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/latlngbounds-0000001050150808-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/latlngbounds-0000001050150808-V5</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.LatLngBounds(com.google.android.gms.maps.model.LatLng,com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-latlngbounds-latlng-southwest,-latlng-northeast">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-latlngbounds-latlng-southwest,-latlng-northeast</a><br/>
     *
     * @param param0 southwest corner
     * @param param1 northeast corner
     */
    public LatLngBounds(org.xms.g.maps.model.LatLng param0, org.xms.g.maps.model.LatLng param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.LatLngBounds(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), ((com.huawei.hms.maps.model.LatLng) ((param1) == null ? null : (param1.getHInstance())))));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.LatLngBounds(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), ((com.google.android.gms.maps.model.LatLng) ((param1) == null ? null : (param1.getGInstance())))));
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.builder() Creates a new builder.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.builder(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#builder()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#builder()</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-static-latlngbounds.builder-builder">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-static-latlngbounds.builder-builder</a><br/>
     *
     * @return the return object is maps model LatLngBounds Builder
     */
    public static final org.xms.g.maps.model.LatLngBounds.Builder builder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.LatLngBounds.builder()");
            com.huawei.hms.maps.model.LatLngBounds.Builder hReturn = com.huawei.hms.maps.model.LatLngBounds.builder();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds.Builder(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.LatLngBounds.builder()");
            com.google.android.gms.maps.model.LatLngBounds.Builder gReturn = com.google.android.gms.maps.model.LatLngBounds.builder();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.createFromAttributes(android.content.Context,android.util.AttributeSet) Creates a LatLngBounds object using specified attributes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.createFromAttributes(android.content.Context,android.util.AttributeSet): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#createFromAttributes(Context,AttributeSet)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#createFromAttributes(Context,AttributeSet)</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.createFromAttributes(android.content.Context,android.util.AttributeSet): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-static-latlngbounds-createfromattributes-context-context,-attributeset-attrs">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-static-latlngbounds-createfromattributes-context-context,-attributeset-attrs</a><br/>
     *
     * @param param0 the param should instanceof android content Context
     * @param param1 the param should instanceof android util AttributeSet
     * @return the return object is maps model LatLngBounds
     */
    public static final org.xms.g.maps.model.LatLngBounds createFromAttributes(android.content.Context param0, android.util.AttributeSet param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.LatLngBounds.createFromAttributes(param0, param1)");
            com.huawei.hms.maps.model.LatLngBounds hReturn = com.huawei.hms.maps.model.LatLngBounds.createFromAttributes(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.LatLngBounds.createFromAttributes(param0, param1)");
            com.google.android.gms.maps.model.LatLngBounds gReturn = com.google.android.gms.maps.model.LatLngBounds.createFromAttributes(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.LatLngBounds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model LatLngBounds object
     */
    public static org.xms.g.maps.model.LatLngBounds dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.LatLngBounds) param0);
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.LatLngBounds;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.LatLngBounds;
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.getNortheast() Northeast corner of the bound.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.northeast: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.northeast: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-final-latlng-northeast">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-final-latlng-northeast</a><br/>
     *
     * @return the return object is maps model LatLng
     */
    public org.xms.g.maps.model.LatLng getNortheast() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).northeast");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).northeast;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).northeast");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).northeast;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.getSouthwest() Southwest corner of the bound.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.southwest: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.southwest: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-final-latlng-southwest">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-final-latlng-southwest</a><br/>
     *
     * @return the return object is maps model LatLng
     */
    public org.xms.g.maps.model.LatLng getSouthwest() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).southwest");
            com.huawei.hms.maps.model.LatLng hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).southwest;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).southwest");
            com.google.android.gms.maps.model.LatLng gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).southwest;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.contains(org.xms.g.maps.model.LatLng) Checks whether a LatLngBounds object contains a specified location.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.contains(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#contains(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#contains(LatLng)</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.contains(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-boolean-contains-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-boolean-contains-latlng-point</a><br/>
     *
     * @param param0 the LatLng to test
     * @return true if this contains the given point; false if not
     */
    public final boolean contains(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).contains(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).contains(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).contains(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).contains(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.equals(java.lang.Object) equals.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is boolean
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.getCenter() Obtains the center of a longitude/latitude bounding box.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.getCenter(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#getCenter()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#getCenter()</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.getCenter(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-latlng-getcenter">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-latlng-getcenter</a><br/>
     *
     * @return A LatLng that is the center of the LatLngBounds
     */
    public final org.xms.g.maps.model.LatLng getCenter() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).getCenter()");
            com.huawei.hms.maps.model.LatLng hReturn = ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).getCenter();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).getCenter()");
            com.google.android.gms.maps.model.LatLng gReturn = ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).getCenter();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.including(org.xms.g.maps.model.LatLng) Obtains a LatLngBounds object that contains a specified location.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.including(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#including(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds#including(LatLng)</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.including(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-latlngbounds-including-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-latlngbounds-including-latlng-point</a><br/>
     *
     * @param param0 a LatLng to be included in the new bounds
     * @return A new LatLngBounds that contains this and the extra point
     */
    public final org.xms.g.maps.model.LatLngBounds including(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).including(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).including(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).including(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).including(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.model.LatLngBounds.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.LatLngBounds.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngbounds</a><br/>
     * com.google.android.gms.maps.model.LatLngBounds.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.LatLngBounds) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.LatLngBounds) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * This is a builder that is able to create a minimum bound based on a set of LatLng points.<br/>
     * Combination of com.huawei.hms.maps.model.LatLngBounds.Builder and com.google.android.gms.maps.model.LatLngBounds.Builder.<br/>
     * com.huawei.hms.maps.model.LatLngBounds.Builder: An internal API of the LatLngBounds class. The API contains two methods: build() and include(LatLng point).<br/>
     * com.google.android.gms.maps.model.LatLngBounds.Builder: This is a builder that is able to create a minimum bound based on a set of LatLng points.<br/>
     */
    public static final class Builder extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.maps.model.LatLngBounds.Builder.Builder(org.xms.g.utils.XBox) This is a builder that is able to create a minimum bound based on a set of LatLng points.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.LatLngBounds.Builder.Builder(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/latlngbounds-builder-0000001050150832-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/latlngbounds-builder-0000001050150832-V5</a><br/>
         * com.google.android.gms.maps.model.LatLngBounds.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds.Builder">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds.Builder</a><br/>
         *
         * @param param0 the param should instanceof utils XBox
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.maps.model.LatLngBounds.Builder.Builder() This is a builder that is able to create a minimum bound based on a set of LatLng points.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.LatLngBounds.Builder.Builder(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/latlngbounds-builder-0000001050150832-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/latlngbounds-builder-0000001050150832-V5</a><br/>
         * com.google.android.gms.maps.model.LatLngBounds.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds.Builder#public-latlngbounds-build">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds.Builder#public-latlngbounds-build</a><br/>
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.LatLngBounds.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.LatLngBounds.Builder());
            }
        }

        /**
         * org.xms.g.maps.model.LatLngBounds.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.LatLngBounds.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps model LatLngBounds Builder object
         */
        public static org.xms.g.maps.model.LatLngBounds.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.model.LatLngBounds.Builder) param0);
        }

        /**
         * org.xms.g.maps.model.LatLngBounds.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.LatLngBounds.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.LatLngBounds.Builder;
            }
        }

        /**
         * org.xms.g.maps.model.LatLngBounds.Builder.build() Creates the LatLng bounds.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.LatLngBounds.Builder.build(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngboundsb#build()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngboundsb#build()</a><br/>
         * com.google.android.gms.maps.model.LatLngBounds.Builder.build(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds.Builder#public-latlngbounds-build">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds.Builder#public-latlngbounds-build</a><br/>
         *
         * @return the return object is maps model LatLngBounds
         * @throws java.lang.IllegalStateException if no points have been included
         */
        public final org.xms.g.maps.model.LatLngBounds build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds.Builder) this.getHInstance()).build()");
                com.huawei.hms.maps.model.LatLngBounds hReturn = ((com.huawei.hms.maps.model.LatLngBounds.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds.Builder) this.getGInstance()).build()");
                com.google.android.gms.maps.model.LatLngBounds gReturn = ((com.google.android.gms.maps.model.LatLngBounds.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.maps.model.LatLngBounds.Builder.include(org.xms.g.maps.model.LatLng) Includes this point for building of the bounds. The bounds will be extended in a minimum way to include this point.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.LatLngBounds.Builder.include(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngboundsb#include(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-latlngboundsb#include(LatLng)</a><br/>
         * com.google.android.gms.maps.model.LatLngBounds.Builder.include(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds.Builder#public-latlngbounds.builder-include-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/model/LatLngBounds.Builder#public-latlngbounds.builder-include-latlng-point</a><br/>
         *
         * @param param0 A LatLng to be included in the bounds
         * @return This builder object with a new point added
         */
        public final org.xms.g.maps.model.LatLngBounds.Builder include(org.xms.g.maps.model.LatLng param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.LatLngBounds.Builder) this.getHInstance()).include(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.maps.model.LatLngBounds.Builder hReturn = ((com.huawei.hms.maps.model.LatLngBounds.Builder) this.getHInstance()).include(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.LatLngBounds.Builder) this.getGInstance()).include(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.maps.model.LatLngBounds.Builder gReturn = ((com.google.android.gms.maps.model.LatLngBounds.Builder) this.getGInstance()).include(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.LatLngBounds.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}