package org.xms.g.maps.model;

/**
 * Joint types for Polyline and outline of Polygon.<br/>
 * Combination of com.huawei.hms.maps.model.JointType and com.google.android.gms.maps.model.JointType.<br/>
 * com.huawei.hms.maps.model.JointType: Defines the joint type for a polyline or the outline of a polygon.<br/>
 * com.google.android.gms.maps.model.JointType: Joint types for Polyline and outline of Polygon.<br/>
 */
public final class JointType extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.JointType.JointType(org.xms.g.utils.XBox) Joint types for Polyline and outline of Polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public JointType(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.JointType.getBEVEL() Flat bevel on the outside of the joint.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.JointType.BEVEL: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-jointtype">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-jointtype</a><br/>
     * com.google.android.gms.maps.model.JointType.BEVEL: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/JointType#public-static-final-int-bevel">https://developers.google.com/android/reference/com/google/android/gms/maps/model/JointType#public-static-final-int-bevel</a><br/>
     *
     * @return the return object is int
     */
    public static int getBEVEL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.JointType.BEVEL");
            return com.huawei.hms.maps.model.JointType.BEVEL;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.JointType.BEVEL");
            return com.google.android.gms.maps.model.JointType.BEVEL;
        }
    }

    /**
     * org.xms.g.maps.model.JointType.getDEFAULT() Default: Mitered joint, with fixed pointed extrusion equal to half the stroke width on the outside of the joint.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.JointType.DEFAULT: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-jointtype">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-jointtype</a><br/>
     * com.google.android.gms.maps.model.JointType.DEFAULT: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/JointType#public-static-final-int-default">https://developers.google.com/android/reference/com/google/android/gms/maps/model/JointType#public-static-final-int-default</a><br/>
     *
     * @return the return object is int
     */
    public static int getDEFAULT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.JointType.DEFAULT");
            return com.huawei.hms.maps.model.JointType.DEFAULT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.JointType.DEFAULT");
            return com.google.android.gms.maps.model.JointType.DEFAULT;
        }
    }

    /**
     * org.xms.g.maps.model.JointType.getROUND() Rounded on the outside of the joint by an arc of radius equal to half the stroke width, centered at the vertex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.JointType.ROUND: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-jointtype">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-jointtype</a><br/>
     * com.google.android.gms.maps.model.JointType.ROUND: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/JointType#public-static-final-int-round">https://developers.google.com/android/reference/com/google/android/gms/maps/model/JointType#public-static-final-int-round</a><br/>
     *
     * @return the return object is int
     */
    public static int getROUND() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.JointType.ROUND");
            return com.huawei.hms.maps.model.JointType.ROUND;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.JointType.ROUND");
            return com.google.android.gms.maps.model.JointType.ROUND;
        }
    }

    /**
     * org.xms.g.maps.model.JointType.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.JointType.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model JointType object
     */
    public static org.xms.g.maps.model.JointType dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.JointType) param0);
    }

    /**
     * org.xms.g.maps.model.JointType.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.JointType;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.JointType;
        }
    }
}