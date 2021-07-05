package org.xms.g.maps.model;

/**
 * An immutable class representing a dot used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
 * Combination of com.huawei.hms.maps.model.Dot and com.google.android.gms.maps.model.Dot.<br/>
 * com.huawei.hms.maps.model.Dot: Extends PatternItem and represents a dot used in the stroke pattern for a polyline or the outline of a polygon or circle.<br/>
 * com.google.android.gms.maps.model.Dot: An immutable class representing a dot used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
 */
public final class Dot extends org.xms.g.maps.model.PatternItem {

    /**
     * org.xms.g.maps.model.Dot.Dot(org.xms.g.utils.XBox) An immutable class representing a dot used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Dot.Dot(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/dot-0000001050150662-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/dot-0000001050150662-V5</a><br/>
     * com.google.android.gms.maps.model.Dot.Dot(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dot">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dot</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public Dot(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.Dot.Dot() An immutable class representing a dot used in the stroke pattern for a Polyline or the outline of a Polygon or Circle.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Dot.Dot(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/dot-0000001050150662-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/dot-0000001050150662-V5</a><br/>
     * com.google.android.gms.maps.model.Dot.Dot(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dot">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dot</a><br/>
     */
    public Dot() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.Dot());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.Dot());
        }
    }

    /**
     * org.xms.g.maps.model.Dot.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Dot.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model Dot object
     */
    public static org.xms.g.maps.model.Dot dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Dot) param0);
    }

    /**
     * org.xms.g.maps.model.Dot.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Dot;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Dot;
        }
    }

    /**
     * org.xms.g.maps.model.Dot.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Dot.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-dot">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-dot</a><br/>
     * com.google.android.gms.maps.model.Dot.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dot#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Dot#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Dot) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.Dot) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Dot) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.Dot) this.getGInstance()).toString();
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}