package org.xms.g.maps.model;

/**
 * An immutable class representing a gap used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
 * Combination of com.huawei.hms.maps.model.Gap and com.google.android.gms.maps.model.Gap.<br/>
 * com.huawei.hms.maps.model.Gap: Extends PatternItem and represents a gap used in the stroke pattern for a polyline or the outline of a polygon or circle.<br/>
 * com.google.android.gms.maps.model.Gap: An immutable class representing a gap used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
 */
public final class Gap extends org.xms.g.maps.model.PatternItem {

    /**
     * org.xms.g.maps.model.Gap.Gap(org.xms.g.utils.XBox) An immutable class representing a gap used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public Gap(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.Gap.Gap(float) An immutable class representing a gap used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Gap.Gap(float): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/gap-0000001050152621-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/gap-0000001050152621-V5</a><br/>
     * com.google.android.gms.maps.model.Gap.Gap(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Gap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Gap</a><br/>
     *
     * @param param0 Length in pixels. Negative value will be clamped to zero
     */
    public Gap(float param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.Gap(param0));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.Gap(param0));
        }
    }

    /**
     * org.xms.g.maps.model.Gap.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Gap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model Gap object
     */
    public static org.xms.g.maps.model.Gap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Gap) param0);
    }

    /**
     * org.xms.g.maps.model.Gap.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Gap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Gap;
        }
    }

    /**
     * org.xms.g.maps.model.Gap.getLength() Length in pixels. Negative value will be clamped to zero.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Gap.length: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-gap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-gap</a><br/>
     * com.google.android.gms.maps.model.Gap.length: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Gap#public-final-float-length">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Gap#public-final-float-length</a><br/>
     *
     * @return the return object is float
     */
    public float getLength() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Gap) this.getHInstance()).length");
            return ((com.huawei.hms.maps.model.Gap) this.getHInstance()).length;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Gap) this.getGInstance()).length");
            return ((com.google.android.gms.maps.model.Gap) this.getGInstance()).length;
        }
    }

    /**
     * org.xms.g.maps.model.Gap.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Gap.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-gap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-gap</a><br/>
     * com.google.android.gms.maps.model.Gap.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Gap#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Gap#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Gap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.Gap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Gap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.Gap) this.getGInstance()).toString();
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}