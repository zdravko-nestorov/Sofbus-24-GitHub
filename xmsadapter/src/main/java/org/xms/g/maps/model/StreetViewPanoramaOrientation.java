package org.xms.g.maps.model;

/**
 * An immutable class that aggregates all user point of view parameters.<br/>
 * Combination of com.huawei.hms.maps.model.StreetViewPanoramaOrientation and com.google.android.gms.maps.model.StreetViewPanoramaOrientation.<br/>
 * com.huawei.hms.maps.model.StreetViewPanoramaOrientation: An immutable class that aggregates all user point of view parameters.<br/>
 * com.google.android.gms.maps.model.StreetViewPanoramaOrientation: An immutable class that aggregates all user point of view parameters.<br/>
 */
public class StreetViewPanoramaOrientation extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.StreetViewPanoramaOrientation createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = com.huawei.hms.maps.model.StreetViewPanoramaOrientation.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = com.google.android.gms.maps.model.StreetViewPanoramaOrientation.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.StreetViewPanoramaOrientation[] newArray(int param0) {
            return new org.xms.g.maps.model.StreetViewPanoramaOrientation[param0];
        }
    };

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.StreetViewPanoramaOrientation(org.xms.g.utils.XBox) An immutable class that aggregates all user point of view parameters.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public StreetViewPanoramaOrientation(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.builder() Creates a builder for a Street View panorama orientation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder()
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-static-streetviewpanoramaorientation.builder-builder">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-static-streetviewpanoramaorientation.builder-builder</a><br/>
     *
     * @return the return object is maps model StreetViewPanoramaOrientation Builder
     */
    public static org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder builder() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder()");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder hReturn = com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder()");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder gReturn = com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.builder(org.xms.g.maps.model.StreetViewPanoramaOrientation) Creates a builder for a Street View panorama orientation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder(com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-static-streetviewpanoramaorientation.builder-builder-streetviewpanoramaorientation-orientation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-static-streetviewpanoramaorientation.builder-builder-streetviewpanoramaorientation-orientation</a><br/>
     *
     * @param param0 the param should instanceof maps model StreetViewPanoramaOrientation
     * @return the return object is maps model StreetViewPanoramaOrientation Builder
     */
    public static org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder builder(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder hReturn = com.huawei.hms.maps.model.StreetViewPanoramaOrientation.builder(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder gReturn = com.google.android.gms.maps.model.StreetViewPanoramaOrientation.builder(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.StreetViewPanoramaOrientation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model StreetViewPanoramaOrientation object
     */
    public static org.xms.g.maps.model.StreetViewPanoramaOrientation dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.StreetViewPanoramaOrientation) param0);
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaOrientation;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.getBearing() Direction of the orientation, in degrees clockwise from north.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.bearing: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-final-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-final-float-bearing</a><br/>
     *
     * @return the return object is float
     */
    public float getBearing() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).bearing");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).bearing;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).bearing");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).bearing;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.getTilt() The angle, in degrees, of the orientation. See tilt for details of restrictions on the range of values.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.tilt
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.tilt: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-final-float-tilt">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-final-float-tilt</a><br/>
     *
     * @return the return object is float
     */
    public float getTilt() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).tilt");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).tilt;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).tilt");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).tilt;
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.equals(java.lang.Object) equals.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.equals(java.lang.Object)
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return the return object is boolean
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.hashCode()
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.toString() to String.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.toString()
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-string-tostring</a><br/>
     *
     * @return the return object is java lang String
     */
    public java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).toString()");
            return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).toString()");
            return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.maps.model.StreetViewPanoramaOrientation.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Builds Street View panorama orientations.<br/>
     * Combination of com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder and com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.<br/>
     * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder: Builds Street View panorama orientations.<br/>
     * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder: Builds Street View panorama orientations.<br/>
     */
    public static final class Builder extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.Builder(org.xms.g.utils.XBox) An immutable class that aggregates all user point of view parameters.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder.Builder()
         * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation</a><br/>
         *
         * @param param0 the param should instanceof utils XBox
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.Builder() An immutable class that aggregates all user point of view parameters.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder.Builder()
         * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.Builder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation</a><br/>
         */
        public Builder() {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder());
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder());
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.Builder(org.xms.g.maps.model.StreetViewPanoramaOrientation) An immutable class that aggregates all user point of view parameters.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder.Builder(com.huawei.hms.maps.model.StreetViewPanoramaOrientation)
         * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.Builder(com.google.android.gms.maps.model.StreetViewPanoramaOrientation): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation</a><br/>
         *
         * @param param0 the param should instanceof maps model StreetViewPanoramaOrientation
         */
        public Builder(org.xms.g.maps.model.StreetViewPanoramaOrientation param0) {
            super(((org.xms.g.utils.XBox) null));
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                this.setHInstance(new com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder(((com.huawei.hms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getHInstance())))));
            } else {
                this.setGInstance(new com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder(((com.google.android.gms.maps.model.StreetViewPanoramaOrientation) ((param0) == null ? null : (param0.getGInstance())))));
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps model StreetViewPanoramaOrientation Builder object
         */
        public static org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder) param0);
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder;
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.getBearing() getBearing.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder.bearing
         * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.bearing: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-float-bearing</a><br/>
         *
         * @return the return object is float
         */
        public float getBearing() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).bearing");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).bearing;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).bearing");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).bearing;
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.getTilt() tilt.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder.tilt
         * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.tilt: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-float-tilt">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-float-tilt</a><br/>
         *
         * @return the return object is float
         */
        public float getTilt() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).tilt");
                return ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).tilt;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).tilt");
                return ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).tilt;
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.bearing(float) Sets the direction of the orientation, in degrees clockwise from north.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder.bearing(float)
         * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.bearing(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-streetviewpanoramaorientation.builder-bearing-float-bearing">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-streetviewpanoramaorientation.builder-bearing-float-bearing</a><br/>
         *
         * @param param0 the param should instanceof float
         * @return the return object is maps model StreetViewPanoramaOrientation Builder
         */
        public final org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder bearing(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).bearing(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).bearing(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).bearing(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).bearing(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.build() Builds a StreetViewPanoramaOrientation.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder.build()
         * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.build(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-streetviewpanoramaorientation-build">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-streetviewpanoramaorientation-build</a><br/>
         *
         * @return the return object is maps model StreetViewPanoramaOrientation
         */
        public final org.xms.g.maps.model.StreetViewPanoramaOrientation build() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).build()");
                com.huawei.hms.maps.model.StreetViewPanoramaOrientation hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).build();
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).build()");
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).build();
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }

        /**
         * org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder.tilt(float) Sets the angle, in degrees, of the orientation This value is restricted to being between-90(directly down)and 90(directly up).<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder.tilt(float)
         * com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder.tilt(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-streetviewpanoramaorientation.builder-tilt-float-tilt">https://developers.google.com/android/reference/com/google/android/gms/maps/model/StreetViewPanoramaOrientation.Builder#public-streetviewpanoramaorientation.builder-tilt-float-tilt</a><br/>
         *
         * @param param0 the param should instanceof float
         * @return the return object is maps model StreetViewPanoramaOrientation Builder
         */
        public final org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder tilt(float param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).tilt(param0)");
                com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder hReturn = ((com.huawei.hms.maps.model.StreetViewPanoramaOrientation.Builder) this.getHInstance()).tilt(param0);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).tilt(param0)");
                com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder gReturn = ((com.google.android.gms.maps.model.StreetViewPanoramaOrientation.Builder) this.getGInstance()).tilt(param0);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.StreetViewPanoramaOrientation.Builder(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}