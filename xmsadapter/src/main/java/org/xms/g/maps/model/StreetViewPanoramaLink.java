package org.xms.g.maps.model;

/**
 * An immutable class that represents a link to another Street View panorama.<br/>
 * Combination of com.huawei.hms.maps.model.StreetViewPanoramaLink and com.google.android.gms.maps.model.StreetViewPanoramaLink.<br/>
 * com.huawei.hms.maps.model.StreetViewPanoramaLink: An immutable class that represents a link to another Street View panorama.<br/>
 * com.google.android.gms.maps.model.StreetViewPanoramaLink: An immutable class that represents a link to another Street View panorama.<br/>
 */
public class StreetViewPanoramaLink extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.StreetViewPanoramaLink createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.StreetViewPanoramaLink hReturn = com.huawei.hms.maps.model.StreetViewPanoramaLink.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewPanoramaLink(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.StreetViewPanoramaLink gReturn = com.google.android.gms.maps.model.StreetViewPanoramaLink.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewPanoramaLink(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.StreetViewPanoramaLink[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewPanoramaLink[param0];
        }
    };

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.StreetViewPanoramaLink(org.xms.g.utils.XBox) An immutable class that represents a link to another Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public StreetViewPanoramaLink(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.StreetViewPanoramaLink.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model StreetViewPanoramaLink object
     */
    public static org.xms.g.maps.model.StreetViewPanoramaLink dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewPanoramaLink) param0);
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaLink;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaLink;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.getBearing() The direction of the linked Street View panorama, in degrees clockwise from north.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLink.bearing
     * com.google.android.gms.maps.model.StreetViewPanoramaLink.bearing: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-final-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-final-float-bearing</a><br/>
     *
     * @return the return object is float
     */
    public float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).bearing");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).bearing;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).bearing");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).bearing;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.getPanoId() Panorama ID of the linked Street View panorama.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.StreetViewPanoramaLink.panoId: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-final-string-panoid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-final-string-panoid</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String getPanoId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).panoId");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).panoId;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).panoId");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).panoId;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.equals(java.lang.Object) equals.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLink.equals(java.lang.Object)
     * com.google.android.gms.maps.model.StreetViewPanoramaLink.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is boolean
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLink.hashCode()
     * com.google.android.gms.maps.model.StreetViewPanoramaLink.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLink.toString()
     * com.google.android.gms.maps.model.StreetViewPanoramaLink.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaLink.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaLink.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.maps.model.StreetViewPanoramaLink.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaLink#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.StreetViewPanoramaLink) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.StreetViewPanoramaLink) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}