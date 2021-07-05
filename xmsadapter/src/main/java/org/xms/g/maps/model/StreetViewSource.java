package org.xms.g.maps.model;

/**
 * Identifiers to limit Street View searches to selected sources.<br/>
 * Combination of com.huawei.hms.maps.model.StreetViewSource and com.google.android.gms.maps.model.StreetViewSource.<br/>
 * com.huawei.hms.maps.model.StreetViewSource: Identifiers to limit Street View searches to selected sources.<br/>
 * com.google.android.gms.maps.model.StreetViewSource: Identifiers to limit Street View searches to selected sources. See setPosition(LatLng, StreetViewSource), setPosition(LatLng, int, StreetViewSource), position(LatLng, Integer, StreetViewSource)or position(LatLng, StreetViewSource).<br/>
 */
public final class StreetViewSource extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.StreetViewSource createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.StreetViewSource hReturn = com.huawei.hms.maps.model.StreetViewSource.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewSource(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.StreetViewSource gReturn = com.google.android.gms.maps.model.StreetViewSource.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewSource(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.StreetViewSource[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewSource[param0];
        }
    };

    /**
     * org.xms.g.maps.model.StreetViewSource.StreetViewSource(org.xms.g.utils.XBox) Identifiers to limit Street View searches to selected sources.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public StreetViewSource(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.StreetViewSource.getDEFAULT() Default: Uses the default sources of Street View, searches will not be limited to specific sources.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewSource.DEFAULT
     * com.google.android.gms.maps.model.StreetViewSource.DEFAULT: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-static-final-streetviewsource-default">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-static-final-streetviewsource-default</a><br/>
     *
     * @return the return object is maps model StreetViewSource
     */
    public static org.xms.g.maps.model.StreetViewSource getDEFAULT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewSource.DEFAULT");
            com.huawei.hms.maps.model.StreetViewSource hReturn = null;
            hReturn = com.huawei.hms.maps.model.StreetViewSource.DEFAULT;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewSource.DEFAULT");
            com.google.android.gms.maps.model.StreetViewSource gReturn = null;
            gReturn = com.google.android.gms.maps.model.StreetViewSource.DEFAULT;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewSource.getOUTDOOR() Limits Street View searches to outdoor collections. Indoor collections are not included in search results. Note also that the search only returns panoramas where it's possible to determine whether they're indoors or outdoors. For example, photo spheres are not returned because it's unknown whether they are indoors or outdoors.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewSource.OUTDOOR
     * com.google.android.gms.maps.model.StreetViewSource.OUTDOOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-static-final-streetviewsource-outdoor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-static-final-streetviewsource-outdoor</a><br/>
     *
     * @return the return object is maps model StreetViewSource
     */
    public static org.xms.g.maps.model.StreetViewSource getOUTDOOR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewSource.OUTDOOR");
            com.huawei.hms.maps.model.StreetViewSource hReturn = null;
            hReturn = com.huawei.hms.maps.model.StreetViewSource.OUTDOOR;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewSource.OUTDOOR");
            com.google.android.gms.maps.model.StreetViewSource gReturn = null;
            gReturn = com.google.android.gms.maps.model.StreetViewSource.OUTDOOR;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewSource(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewSource.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.StreetViewSource.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model StreetViewSource object
     */
    public static org.xms.g.maps.model.StreetViewSource dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewSource) param0);
    }

    /**
     * org.xms.g.maps.model.StreetViewSource.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewSource;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewSource;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewSource.equals(java.lang.Object) equals.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewSource.equals(java.lang.Object)
     * com.google.android.gms.maps.model.StreetViewSource.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is boolean
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewSource.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewSource.hashCode()
     * com.google.android.gms.maps.model.StreetViewSource.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewSource.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewSource.toString()
     * com.google.android.gms.maps.model.StreetViewSource.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewSource.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewSource.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.maps.model.StreetViewSource.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewSource#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.StreetViewSource) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.StreetViewSource) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}