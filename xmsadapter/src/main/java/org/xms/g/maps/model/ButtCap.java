package org.xms.g.maps.model;

/**
 * Cap that is squared off exactly at the start or end vertex of a Polyline with solid stroke pattern .<br/>
 * Combination of com.huawei.hms.maps.model.ButtCap and com.google.android.gms.maps.model.ButtCap.<br/>
 * com.huawei.hms.maps.model.ButtCap: Extends Cap and defines a cap that is squared off exactly at the start or end vertex of a polyline.<br/>
 * com.google.android.gms.maps.model.ButtCap: Cap that is squared off exactly at the start or end vertex of a Polyline with solid stroke pattern, equivalent to having no additional cap beyond the start or end vertex. This is the default cap type at start and end vertices of Polylines with solid stroke pattern.<br/>
 */
public final class ButtCap extends org.xms.g.maps.model.Cap {

    /**
     * org.xms.g.maps.model.ButtCap.ButtCap(org.xms.g.utils.XBox) Cap that is squared off exactly at the start or end vertex of a Polyline with solid stroke pattern.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.ButtCap.ButtCap(): <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References-V5/buttcap-0000001050152435-V5">https://developer.huawei.com/consumer/cn/doc/HMSCore-References-V5/buttcap-0000001050152435-V5</a><br/>
     * com.google.android.gms.maps.model.ButtCap.ButtCap(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/ButtCap#ButtCap()">https://developers.google.com/android/reference/com/google/android/gms/maps/model/ButtCap#ButtCap()</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public ButtCap(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.ButtCap.ButtCap() Cap that is squared off exactly at the start or end vertex of a Polyline with solid stroke pattern.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.ButtCap.ButtCap(): <a href="https://developer.huawei.com/consumer/cn/doc/HMSCore-References-V5/buttcap-0000001050152435-V5">https://developer.huawei.com/consumer/cn/doc/HMSCore-References-V5/buttcap-0000001050152435-V5</a><br/>
     * com.google.android.gms.maps.model.ButtCap.ButtCap(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/ButtCap#ButtCap()">https://developers.google.com/android/reference/com/google/android/gms/maps/model/ButtCap#ButtCap()</a><br/>
     */
    public ButtCap() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.ButtCap());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.ButtCap());
        }
    }

    /**
     * org.xms.g.maps.model.ButtCap.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.ButtCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is maps model ButtCap
     */
    public static org.xms.g.maps.model.ButtCap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.ButtCap) param0);
    }

    /**
     * org.xms.g.maps.model.ButtCap.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.ButtCap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.ButtCap;
        }
    }

    /**
     * org.xms.g.maps.model.ButtCap.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.ButtCap.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-buttcap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-buttcap</a><br/>
     * com.google.android.gms.maps.model.ButtCap.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/ButtCap#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/ButtCap#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.ButtCap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.ButtCap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.ButtCap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.ButtCap) this.getGInstance()).toString();
        }
    }
}