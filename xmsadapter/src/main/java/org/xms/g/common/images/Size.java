package org.xms.g.common.images;

/**
 * Immutable class for describing width and height dimensions in pixels.<br/>
 * Combination of com.huawei.hms.common.size.Size and com.google.android.gms.common.images.Size.<br/>
 * com.huawei.hms.common.size.Size: <br/>
 * com.google.android.gms.common.images.Size: Immutable class for describing width and height dimensions in pixels.<br/>
 */
public final class Size extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.images.Size.Size(org.xms.g.utils.XBox) constructor of Size with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public Size(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.images.Size.Size(int,int) Create a new immutable Size instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.size.Size.Size(int,int)
     * com.google.android.gms.common.images.Size.Size(int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-size-int-width,-int-height">https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-size-int-width,-int-height</a><br/>
     *
     * @param param0 The width of the size, in pixels
     * @param param1 The height of the size, in pixels
     * @return new Size instance
     */
    public Size(int param0, int param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.common.size.Size(param0, param1));
        } else {
            this.setGInstance(new com.google.android.gms.common.images.Size(param0, param1));
        }
    }

    /**
     * org.xms.g.common.images.Size.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.images.Size.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return the Size object
     */
    public static org.xms.g.common.images.Size dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.images.Size) param0);
    }

    /**
     * org.xms.g.common.images.Size.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.size.Size;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.images.Size;
        }
    }

    /**
     * org.xms.g.common.images.Size.equals(java.lang.Object) Check if this size is equal to another size.Two sizes are equal if and only if both their widths and heights are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.size.Size.equals(java.lang.Object)
     * com.google.android.gms.common.images.Size.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-boolean-equals-object-obj">https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-boolean-equals-object-obj</a><br/>
     *
     * @param param0 Objects to be compared
     * @return true if the objects were equal, false otherwise
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.size.Size) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.common.size.Size) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.Size) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.images.Size) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.common.images.Size.getHeight() Get the height of the size (in pixels).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.size.Size.getHeight()
     * com.google.android.gms.common.images.Size.getHeight(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-int-getheight">https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-int-getheight</a><br/>
     *
     * @return int The height of Size
     */
    public final int getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.size.Size) this.getHInstance()).getHeight()");
            return ((com.huawei.hms.common.size.Size) this.getHInstance()).getHeight();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.Size) this.getGInstance()).getHeight()");
            return ((com.google.android.gms.common.images.Size) this.getGInstance()).getHeight();
        }
    }

    /**
     * org.xms.g.common.images.Size.getWidth() Get the width of the size (in pixels).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.size.Size.getWidth()
     * com.google.android.gms.common.images.Size.getWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-int-getwidth">https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-int-getwidth</a><br/>
     *
     * @return int The width of Size
     */
    public final int getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.size.Size) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.common.size.Size) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.Size) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.common.images.Size) this.getGInstance()).getWidth();
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final int hashCode() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final org.xms.g.common.images.Size parseSize(java.lang.String param0) throws java.lang.NumberFormatException, java.lang.NullPointerException {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.images.Size.toString() Return the size represented as a string with the format "WxH".<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.size.Size.toString()
     * com.google.android.gms.common.images.Size.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/common/images/Size#public-string-tostring</a><br/>
     *
     * @return string representation of the size
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.size.Size) this.getHInstance()).toString()");
            return ((com.huawei.hms.common.size.Size) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.Size) this.getGInstance()).toString()");
            return ((com.google.android.gms.common.images.Size) this.getGInstance()).toString();
        }
    }
}