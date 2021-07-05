package org.xms.g.common.images;

/**
 * A class that represents an image that is located on a web server.<br/>
 * Combination of com.huawei.hms.common.webserverpic.WebServerPic and com.google.android.gms.common.images.WebImage.<br/>
 * com.huawei.hms.common.webserverpic.WebServerPic: <br/>
 * com.google.android.gms.common.images.WebImage: A class that represents an image that is located on a web server.<br/>
 */
public final class WebImage extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.common.webserverpic.WebServerPic.CREATOR: <a href=""></a><br/>
     * com.google.android.gms.common.images.WebImage.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-static-final-creatorwebimage-creatorh">https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-static-final-creatorwebimage-creatorh</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.common.images.WebImage createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.common.webserverpic.WebServerPic hReturn = com.huawei.hms.common.webserverpic.WebServerPic.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.images.WebImage(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.common.images.WebImage gReturn = com.google.android.gms.common.images.WebImage.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.images.WebImage(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.common.images.WebImage[] newArray(int param0) {
            return new org.xms.g.common.images.WebImage[param0];
        }
    };

    /**
     * org.xms.g.common.images.WebImage.WebImage(org.xms.g.utils.XBox) constructor of WebImage with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public WebImage(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.images.WebImage.WebImage(android.net.Uri,int,int) Constructs a new WebImage with the given URL and dimensions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.webserverpic.WebServerPic.WebServerPic(android.net.Uri,int,int)
     * com.google.android.gms.common.images.WebImage.WebImage(android.net.Uri,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-webimage-uri-url,-int-width,-int-height">https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-webimage-uri-url,-int-width,-int-height</a><br/>
     *
     * @param param0 The URL of the image
     * @param param1 The width of the image, in pixels
     * @param param2 The height of the image, in pixels
     */
    public WebImage(android.net.Uri param0, int param1, int param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.common.webserverpic.WebServerPic(param0, param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.common.images.WebImage(param0, param1, param2));
        }
    }

    /**
     * org.xms.g.common.images.WebImage.WebImage(android.net.Uri) Constructs a new WebImage with the given URL.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.webserverpic.WebServerPic.WebServerPic(android.net.Uri)
     * com.google.android.gms.common.images.WebImage.WebImage(android.net.Uri): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-webimage-uri-url">https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-webimage-uri-url</a><br/>
     *
     * @param param0 The URL of the image
     */
    public WebImage(android.net.Uri param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.common.webserverpic.WebServerPic(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.images.WebImage(param0));
        }
    }

    /**
     * org.xms.g.common.images.WebImage.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.images.WebImage.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted WebImage object
     */
    public static org.xms.g.common.images.WebImage dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.images.WebImage) param0);
    }

    /**
     * org.xms.g.common.images.WebImage.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.webserverpic.WebServerPic;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.images.WebImage;
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final boolean equals(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.images.WebImage.getHeight() Gets the image height, in pixels.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.webserverpic.WebServerPic.getHeight()
     * com.google.android.gms.common.images.WebImage.getHeight(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-int-getheight">https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-int-getheight</a><br/>
     *
     * @return The Height
     */
    public final int getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getHeight()");
            return ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getHeight();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).getHeight()");
            return ((com.google.android.gms.common.images.WebImage) this.getGInstance()).getHeight();
        }
    }

    /**
     * org.xms.g.common.images.WebImage.getUrl() Gets the image URL.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.webserverpic.WebServerPic.getUrl()
     * com.google.android.gms.common.images.WebImage.getUrl(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-uri-geturl">https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-uri-geturl</a><br/>
     *
     * @return the Image URL
     */
    public final android.net.Uri getUrl() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getUrl()");
            return ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getUrl();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).getUrl()");
            return ((com.google.android.gms.common.images.WebImage) this.getGInstance()).getUrl();
        }
    }

    /**
     * org.xms.g.common.images.WebImage.getWidth() Gets the image width, in pixels.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.webserverpic.WebServerPic.getWidth()
     * com.google.android.gms.common.images.WebImage.getWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-int-getwidth">https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-int-getwidth</a><br/>
     *
     * @return The Width
     */
    public final int getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.common.images.WebImage) this.getGInstance()).getWidth();
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final int hashCode() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.images.WebImage.toString() Returns a string representation of this object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.webserverpic.WebServerPic.toString()
     * com.google.android.gms.common.images.WebImage.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-string-tostring</a><br/>
     *
     * @return representation string of this object
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).toString()");
            return ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).toString()");
            return ((com.google.android.gms.common.images.WebImage) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.common.images.WebImage.writeToParcel(android.os.Parcel,int) used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.webserverpic.WebServerPic.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.common.images.WebImage.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/common/images/WebImage#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.common.webserverpic.WebServerPic) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.images.WebImage) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.common.images.WebImage) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
}