package org.xms.g.maps.model;

/**
 * Cap that is a semicircle with radius equal to half the stroke width.<br/>
 * Combination of com.huawei.hms.maps.model.RoundCap and com.google.android.gms.maps.model.RoundCap.<br/>
 * com.huawei.hms.maps.model.RoundCap: Extends Cap and represents a semicircle with radius equal to a half of the stroke width. The semicircle will be centered at the start or end vertex of a polyline.<br/>
 * com.google.android.gms.maps.model.RoundCap: Cap that is a semicircle with radius equal to half the stroke width, centered at the start or end vertex of a Polyline with solid stroke pattern.<br/>
 */
public final class RoundCap extends org.xms.g.maps.model.Cap {

    /**
     * org.xms.g.maps.model.RoundCap.RoundCap(org.xms.g.utils.XBox) Cap that is a semicircle with radius equal to half the stroke width, centered at the start or end vertex of a Polyline with solid stroke pattern.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.RoundCap.RoundCap(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/roundcap-0000001050153219-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/roundcap-0000001050153219-V5</a><br/>
     * com.google.android.gms.maps.model.RoundCap.RoundCap(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/RoundCap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/RoundCap</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public RoundCap(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.RoundCap.RoundCap() Cap that is a semicircle with radius equal to half the stroke width, centered at the start or end vertex of a Polyline with solid stroke pattern.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.RoundCap.RoundCap(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/roundcap-0000001050153219-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/roundcap-0000001050153219-V5</a><br/>
     * com.google.android.gms.maps.model.RoundCap.RoundCap(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/RoundCap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/RoundCap</a><br/>
     */
    public RoundCap() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.RoundCap());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.RoundCap());
        }
    }

    /**
     * org.xms.g.maps.model.RoundCap.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.RoundCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model RoundCap object
     */
    public static org.xms.g.maps.model.RoundCap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.RoundCap) param0);
    }

    /**
     * org.xms.g.maps.model.RoundCap.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.RoundCap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.RoundCap;
        }
    }

    /**
     * org.xms.g.maps.model.RoundCap.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.RoundCap.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-roundcap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-roundcap</a><br/>
     * com.google.android.gms.maps.model.RoundCap.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/RoundCap#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/RoundCap#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.RoundCap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.RoundCap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.RoundCap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.RoundCap) this.getGInstance()).toString();
        }
    }
}