package org.xms.g.maps.model;

/**
 * Bitmap overlay centered at the start or end vertex of a Polyline.<br/>
 * Combination of com.huawei.hms.maps.model.CustomCap and com.google.android.gms.maps.model.CustomCap.<br/>
 * com.huawei.hms.maps.model.CustomCap: Extends the Cap class to customize the cap style for a polyline.<br/>
 * com.google.android.gms.maps.model.CustomCap: Bitmap overlay centered at the start or end vertex of a Polyline, orientated according to the direction of the line's first or last edge and scaled with respect to the line's stroke width. CustomCap can be applied to Polyline with any stroke pattern.<br/>
 */
public final class CustomCap extends org.xms.g.maps.model.Cap {

    /**
     * org.xms.g.maps.model.CustomCap.CustomCap(org.xms.g.utils.XBox) Constructs a new CustomCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public CustomCap(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.CustomCap.CustomCap(org.xms.g.maps.model.BitmapDescriptor,float) Constructs a new CustomCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CustomCap.CustomCap(com.huawei.hms.maps.model.BitmapDescriptor,float): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/customcap-0000001050150644-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/customcap-0000001050150644-V5</a><br/>
     * com.google.android.gms.maps.model.CustomCap.CustomCap(com.google.android.gms.maps.model.BitmapDescriptor,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap</a><br/>
     *
     * @param param0 Descriptor of the bitmap to be used
     * @param param1 Stroke width, in pixels, for which the cap bitmap at its native dimension is designed
     */
    public CustomCap(org.xms.g.maps.model.BitmapDescriptor param0, float param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.CustomCap(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance()))), param1));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.CustomCap(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance()))), param1));
        }
    }

    /**
     * org.xms.g.maps.model.CustomCap.CustomCap(org.xms.g.maps.model.BitmapDescriptor) Constructs a new CustomCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CustomCap.CustomCap(com.huawei.hms.maps.model.BitmapDescriptor): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/customcap-0000001050150644-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/customcap-0000001050150644-V5</a><br/>
     * com.google.android.gms.maps.model.CustomCap.CustomCap(com.google.android.gms.maps.model.BitmapDescriptor): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap#public-customcap-bitmapdescriptor-bitmapdescriptor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap#public-customcap-bitmapdescriptor-bitmapdescriptor</a><br/>
     *
     * @param param0 Descriptor of the bitmap to be used. Must not be null
     */
    public CustomCap(org.xms.g.maps.model.BitmapDescriptor param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.CustomCap(((com.huawei.hms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getHInstance())))));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.CustomCap(((com.google.android.gms.maps.model.BitmapDescriptor) ((param0) == null ? null : (param0.getGInstance())))));
        }
    }

    /**
     * org.xms.g.maps.model.CustomCap.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.CustomCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model CustomCap object
     */
    public static org.xms.g.maps.model.CustomCap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.CustomCap) param0);
    }

    /**
     * org.xms.g.maps.model.CustomCap.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.CustomCap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.CustomCap;
        }
    }

    /**
     * org.xms.g.maps.model.CustomCap.getBitmapDescriptor() Descriptor of the bitmap to be overlaid at the start or end vertex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CustomCap.bitmapDescriptor: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-customcap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-customcap</a><br/>
     * com.google.android.gms.maps.model.CustomCap.bitmapDescriptor: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap#public-final-bitmapdescriptor-bitmapdescriptor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap#public-final-bitmapdescriptor-bitmapdescriptor</a><br/>
     *
     * @return the return object is maps model BitmapDescriptor
     */
    public org.xms.g.maps.model.BitmapDescriptor getBitmapDescriptor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).bitmapDescriptor");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = null;
            hReturn = ((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).bitmapDescriptor;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).bitmapDescriptor");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = null;
            gReturn = ((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).bitmapDescriptor;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.CustomCap.getRefWidth() Reference stroke width(in pixels)- the stroke width for which the cap bitmap at its native dimension is designed. The default reference stroke width is 10 pixels.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CustomCap.refWidth: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-customcap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-customcap</a><br/>
     * com.google.android.gms.maps.model.CustomCap.refWidth: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap#public-final-float-refwidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap#public-final-float-refwidth</a><br/>
     *
     * @return the return object is float
     */
    public float getRefWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).refWidth");
            return ((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).refWidth;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).refWidth");
            return ((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).refWidth;
        }
    }

    /**
     * org.xms.g.maps.model.CustomCap.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.CustomCap.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-customcap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-customcap</a><br/>
     * com.google.android.gms.maps.model.CustomCap.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/CustomCap#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.CustomCap) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.CustomCap) this.getGInstance()).toString();
        }
    }
}