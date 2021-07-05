package org.xms.g.maps.model;

/**
 * Known Direct Subclasses.<br/>
 * Combination of com.huawei.hms.maps.model.Cap and com.google.android.gms.maps.model.Cap.<br/>
 * com.huawei.hms.maps.model.Cap: Defines a cap that is applied at the start or end vertex of a polyline.<br/>
 * com.google.android.gms.maps.model.Cap: Known Direct Subclasses.<br/>
 */
public class Cap extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.Cap.Cap(org.xms.g.utils.XBox) Immutable cap that can be applied at the start or end vertex of a Polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public Cap(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.Cap.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Cap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model Cap object
     */
    public static org.xms.g.maps.model.Cap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Cap) param0);
    }

    /**
     * org.xms.g.maps.model.Cap.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Cap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Cap;
        }
    }

    /**
     * org.xms.g.maps.model.Cap.equals(java.lang.Object) Cap equals some object .<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Cap.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cap</a><br/>
     * com.google.android.gms.maps.model.Cap.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Cap#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Cap#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is boolean
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Cap) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.Cap) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Cap) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.Cap) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.Cap.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Cap.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cap</a><br/>
     * com.google.android.gms.maps.model.Cap.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Cap#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Cap#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Cap) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.Cap) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Cap) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.Cap) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.Cap.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Cap.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cap</a><br/>
     * com.google.android.gms.maps.model.Cap.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Cap#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Cap#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Cap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.Cap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Cap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.Cap) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.model.Cap.writeToParcel(android.os.Parcel,int) write To Parcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Cap.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cap</a><br/>
     * com.google.android.gms.maps.model.Cap.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Cap#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Cap#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Cap) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.Cap) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Cap) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.Cap) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
}