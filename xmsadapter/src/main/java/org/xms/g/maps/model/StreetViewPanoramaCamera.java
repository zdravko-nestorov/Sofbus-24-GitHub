package org.xms.g.maps.model;

/**
 * An immutable class that aggregates all camera position parameters.<br/>
 * Combination of com.huawei.hms.maps.model.StreetViewPanoramaCamera and com.google.android.gms.maps.model.StreetViewPanoramaCamera.<br/>
 * com.huawei.hms.maps.model.StreetViewPanoramaCamera: An immutable class that aggregates all camera position parameters.<br/>
 * com.google.android.gms.maps.model.StreetViewPanoramaCamera: An immutable class that aggregates all camera position parameters.<br/>
 */
public class StreetViewPanoramaCamera extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.StreetViewPanoramaCamera createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = com.huawei.hms.maps.model.StreetViewPanoramaCamera.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.StreetViewPanoramaCamera[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewPanoramaCamera[param0];
        }
    };

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.StreetViewPanoramaCamera(org.xms.g.utils.XBox) An immutable class that aggregates all camera position parameters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public StreetViewPanoramaCamera(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    public static org.xms.g.maps.model.StreetViewPanoramaCamera.Builder builder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder()");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder()");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.builder(org.xms.g.maps.model.StreetViewPanoramaCamera) Creates a builder for a Street View panorama camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder(com.huawei.hms.maps.model.StreetViewPanoramaCamera)
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder(com.google.android.gms.maps.model.StreetViewPanoramaCamera): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-static-streetviewpanoramacamera.builder-builder">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-static-streetviewpanoramacamera.builder-builder</a><br/>
     *
     * @param param0 the param should instanceof maps model StreetViewPanoramaCamera
     * @return the return object is maps model StreetViewPanoramaCamera Builder
     */
    public static org.xms.g.maps.model.StreetViewPanoramaCamera.Builder builder(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = com.huawei.hms.maps.model.StreetViewPanoramaCamera.builder(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = com.google.android.gms.maps.model.StreetViewPanoramaCamera.builder(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.StreetViewPanoramaCamera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model StreetViewPanoramaCamera object
     */
    public static org.xms.g.maps.model.StreetViewPanoramaCamera dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewPanoramaCamera) param0);
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaCamera;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaCamera;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.getBearing() Direction that the camera is pointing in, in degrees clockwise from north.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.bearing
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.bearing: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-final-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-final-float-bearing</a><br/>
     *
     * @return the return object is float
     */
    public float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).bearing");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).bearing;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).bearing");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).bearing;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.getTilt() The angle, in degrees, of the camera from the horizon of the panorama. See tilt for details of restrictions on the range of values.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.tilt
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.tilt: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-final-float-tilt">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-final-float-tilt</a><br/>
     *
     * @return the return object is float
     */
    public float getTilt() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).tilt");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).tilt;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).tilt");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).tilt;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.getZoom() Zoom level near the centre of the screen. See zoom for the definition of the camera's zoom level.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.zoom
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.zoom: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-final-float-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-final-float-zoom</a><br/>
     *
     * @return the return object is float
     */
    public float getZoom() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).zoom");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).zoom;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).zoom");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).zoom;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.equals(java.lang.Object) equals.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.equals(java.lang.Object)
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is boolean
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.getOrientation() Returns the particular camera's tilt and bearing as an orientation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.getOrientation()
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.getOrientation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-streetviewpanoramaorientation-getorientation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-streetviewpanoramaorientation-getorientation</a><br/>
     *
     * @return orientation Tilt and bearing of the camera
     */
    public org.xms.g.maps.model.StreetViewPanoramaOrientation getOrientation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).getOrientation()");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).getOrientation();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).getOrientation()");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).getOrientation();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.hashCode()
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.toString()
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaCamera.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.StreetViewPanoramaCamera) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.StreetViewPanoramaCamera) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Builds panorama cameras.<br/>
     * Combination of com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder and com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder: Builds panorama cameras.<br/>
     * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder: Builds panorama cameras.<br/>
     */
    public static final class Builder extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.Builder(org.xms.g.utils.XBox) Builds panorama cameras.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.Builder()
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder</a><br/>
         *
         * @param param0 the param should instanceof utils XBox
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.Builder() Builds panorama cameras.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.Builder()
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder</a><br/>
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder());
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.Builder(org.xms.g.maps.model.StreetViewPanoramaCamera) constructor of Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.Builder(com.huawei.hms.maps.model.StreetViewPanoramaCamera)
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.Builder(com.google.android.gms.maps.model.StreetViewPanoramaCamera): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-streetviewpanoramacamera-previous">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-streetviewpanoramacamera-previous</a><br/>
         *
         * @param param0 maps model StreetViewPanoramaCamera
         */
        public Builder(org.xms.g.maps.model.StreetViewPanoramaCamera param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder(((com.huawei.hms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getHInstance())))));
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder(((com.google.android.gms.maps.model.StreetViewPanoramaCamera) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps model StreetViewPanoramaCamera Builder object
         */
        public static org.xms.g.maps.model.StreetViewPanoramaCamera.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.model.StreetViewPanoramaCamera.Builder) param0);
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder;
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.getBearing() bearing.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.bearing
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.bearing: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-float-bearing</a><br/>
         *
         * @return the return object is float
         */
        public float getBearing() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).bearing");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).bearing;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).bearing");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).bearing;
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.getTilt() getTilt.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.tilt
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.tilt: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-float-tilt">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-float-tilt</a><br/>
         *
         * @return the return object is float
         */
        public float getTilt() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).tilt");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).tilt;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).tilt");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).tilt;
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.getZoom() getZoom.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.zoom
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.zoom: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-float-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-float-zoom</a><br/>
         *
         * @return the return object is float
         */
        public float getZoom() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).zoom");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).zoom;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).zoom");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).zoom;
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.bearing(float) Sets the direction that the camera is pointing in, in degrees clockwise from north.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.bearing(float)
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.bearing(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-bearing-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-bearing-float-bearing</a><br/>
         *
         * @param param0 the param should instanceof float
         * @return the return object is maps model StreetViewPanoramaCamera Builder
         */
        public final org.xms.g.maps.model.StreetViewPanoramaCamera.Builder bearing(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).bearing(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).bearing(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).bearing(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).bearing(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.build() Builds a StreetViewPanoramaCamera.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.build()
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.build(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera-build">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera-build</a><br/>
         *
         * @return the return object is maps model StreetViewPanoramaCamera
         */
        public final org.xms.g.maps.model.StreetViewPanoramaCamera build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).build()");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).build()");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.orientation(org.xms.g.maps.model.StreetViewPanoramaOrientation) Sets the camera tilt and bearing based upon the given orientation's tilt and bearing.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.orientation(com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.orientation(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-orientation-streetviewpanoramaorientation-orientation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-orientation-streetviewpanoramaorientation-orientation</a><br/>
         *
         * @param param0 the param should instanceof maps model StreetViewPanoramaOrientation
         * @return the return object is maps model StreetViewPanoramaCamera Builder
         */
        public final org.xms.g.maps.model.StreetViewPanoramaCamera.Builder orientation(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).orientation(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).orientation(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).orientation(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).orientation(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.tilt(float) Sets the angle, in degrees, of the camera from the horizon of the panorama. This value is restricted to being between-90(directly down)and 90(directly up).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.tilt(float)
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.tilt(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-tilt-float-tilt">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-tilt-float-tilt</a><br/>
         *
         * @param param0 the param should instanceof float
         * @return the return object is maps model StreetViewPanoramaCamera Builder
         */
        public final org.xms.g.maps.model.StreetViewPanoramaCamera.Builder tilt(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).tilt(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).tilt(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).tilt(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).tilt(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaCamera.Builder.zoom(float) Sets the zoom level of the camera.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder.zoom(float)
         * com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder.zoom(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-zoom-float-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaCamera.Builder#public-streetviewpanoramacamera.builder-zoom-float-zoom</a><br/>
         *
         * @param param0 the param should instanceof float
         * @return the return object is maps model StreetViewPanoramaCamera Builder
         */
        public final org.xms.g.maps.model.StreetViewPanoramaCamera.Builder zoom(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).zoom(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaCamera.Builder) this.getHInstance()).zoom(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).zoom(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaCamera.Builder) this.getGInstance()).zoom(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaCamera.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}