package org.xms.g.maps.model;

/**
 * Defines options for a polyline.<br/>
 * Combination of com.huawei.hms.maps.model.PolylineOptions and com.google.android.gms.maps.model.PolylineOptions.<br/>
 * com.huawei.hms.maps.model.PolylineOptions: Implements the Parcelable API and defines attributes for a polyline.<br/>
 * com.google.android.gms.maps.model.PolylineOptions: Defines options for a polyline.<br/>
 */
public final class PolylineOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.PolylineOptions createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.PolylineOptions hReturn = com.huawei.hms.maps.model.PolylineOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.PolylineOptions gReturn = com.google.android.gms.maps.model.PolylineOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.PolylineOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.PolylineOptions[param0];
        }
    };

    /**
     * org.xms.g.maps.model.PolylineOptions.PolylineOptions(org.xms.g.utils.XBox) Defines options for a polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.PolylineOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/polylineoptions-0000001050153163-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/polylineoptions-0000001050153163-V5</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.PolylineOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public PolylineOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.PolylineOptions() Defines options for a polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.PolylineOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/polylineoptions-0000001050153163-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/polylineoptions-0000001050153163-V5</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.PolylineOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions</a><br/>
     */
    public PolylineOptions() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.PolylineOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.PolylineOptions());
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.PolylineOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model PolylineOptions object
     */
    public static org.xms.g.maps.model.PolylineOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.PolylineOptions) param0);
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.PolylineOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.PolylineOptions;
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.add(org.xms.g.maps.model.LatLng) Adds a vertex to the end of the polyline being built.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.add(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#add(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#add(LatLng)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.add(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-add-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-add-latlng-point</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @return this PolylineOptions object with the given point on the end
     */
    public final org.xms.g.maps.model.PolylineOptions add(org.xms.g.maps.model.LatLng... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.LatLng.class, x -> (com.huawei.hms.maps.model.LatLng)x.getHInstance())))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.LatLng.class, x -> (com.huawei.hms.maps.model.LatLng) x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.LatLng.class, x -> (com.google.android.gms.maps.model.LatLng)x.getGInstance())))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.LatLng.class, x -> (com.google.android.gms.maps.model.LatLng) x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.add(org.xms.g.maps.model.LatLng) Adds a vertex to the end of the polyline being built.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.add(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#add(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#add(LatLng)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.add(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-add-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-add-latlng-point</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @return this PolylineOptions object with the given point on the end
     */
    public final org.xms.g.maps.model.PolylineOptions add(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.addAll(java.lang.Iterable<org.xms.g.maps.model.LatLng>) Adds vertices to the end of the polyline being built.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.addAll(java.lang.Iterable<com.huawei.hms.maps.model.LatLng>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#addAll(Iterable%3CLatLng%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#addAll(Iterable%3CLatLng%3E)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.addAll(java.lang.Iterable<com.google.android.gms.maps.model.LatLng>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-addall-iterablelatlng-points">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-addall-iterablelatlng-points</a><br/>
     *
     * @param param0 the param should instanceof java lang Iterable<LatLng>
     * @return this PolylineOptions object with the given points on the end
     */
    public final org.xms.g.maps.model.PolylineOptions addAll(java.lang.Iterable<org.xms.g.maps.model.LatLng> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.clickable(boolean) Specifies whether this polyline is clickable. The default setting is false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.clickable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#clickable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#clickable(boolean)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.clickable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-clickable-boolean-clickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-clickable-boolean-clickable</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this PolylineOptions object with a new clickability setting
     */
    public final org.xms.g.maps.model.PolylineOptions clickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).clickable(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).clickable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).clickable(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).clickable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.color(int) Sets the color of the polyline as a 32-bit ARGB color. The default color is black( 0xff000000).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.color(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#color(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#color(int)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.color(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-color-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-color-int-color</a><br/>
     *
     * @param param0 the param should instanceof int
     * @return this PolylineOptions object with a new color set
     */
    public final org.xms.g.maps.model.PolylineOptions color(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).color(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).color(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).color(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).color(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.endCap(org.xms.g.maps.model.Cap) Sets the cap at the end vertex of the polyline. The default end cap is ButtCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.endCap(com.huawei.hms.maps.model.Cap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#endCap(Cap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#endCap(Cap)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.endCap(com.google.android.gms.maps.model.Cap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-endcap-cap-endcap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-endcap-cap-endcap</a><br/>
     *
     * @param param0 the param should instanceof maps model Cap
     * @return this PolylineOptions object with a new end cap set
     */
    public final org.xms.g.maps.model.PolylineOptions endCap(org.xms.g.maps.model.Cap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).endCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).endCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).endCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).endCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.geodesic(boolean) Specifies whether to draw each segment of this polyline as a geodesic. The default setting is false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.geodesic(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#geodesic(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#geodesic(boolean)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.geodesic(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-geodesic-boolean-geodesic">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-geodesic-boolean-geodesic</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this PolylineOptions object with a new geodesic setting
     */
    public final org.xms.g.maps.model.PolylineOptions geodesic(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).geodesic(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).geodesic(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).geodesic(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).geodesic(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.getColor() Gets the color set for this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.getColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getColor()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.getColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-int-getcolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-int-getcolor</a><br/>
     *
     * @return the color of the polyline in ARGB format
     */
    public final int getColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getColor()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getColor()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getColor();
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.getEndCap() Gets the cap set for the end vertex in this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.getEndCap(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getEndCap()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getEndCap()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.getEndCap(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-cap-getendcap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-cap-getendcap</a><br/>
     *
     * @return the end cap of the polyline
     */
    public final org.xms.g.maps.model.Cap getEndCap() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getEndCap()");
            com.huawei.hms.maps.model.Cap hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getEndCap();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Cap(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getEndCap()");
            com.google.android.gms.maps.model.Cap gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getEndCap();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Cap(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.getJointType() Gets the joint type set in this PolylineOptions object for all vertices except the start and end vertices. See JointType for possible values.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.getJointType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getJointType()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getJointType()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.getJointType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-int-getjointtype">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-int-getjointtype</a><br/>
     *
     * @return the joint type of the polyline
     */
    public final int getJointType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getJointType()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getJointType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getJointType()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getJointType();
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.getPattern() Gets the stroke pattern set in this PolylineOptions object for the polyline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.getPattern(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getPattern()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getPattern()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.getPattern(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-listpatternitem-getpattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-listpatternitem-getpattern</a><br/>
     *
     * @return the stroke pattern of the polyline
     */
    public final java.util.List<org.xms.g.maps.model.PatternItem> getPattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getPattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getPattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getPattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getPattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.getPoints() Gets the points set for this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.getPoints(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getPoints()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getPoints()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.getPoints(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-listlatlng-getpoints">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-listlatlng-getpoints</a><br/>
     *
     * @return the list of LatLngs specifying the vertices of the polyline
     */
    public final java.util.List<org.xms.g.maps.model.LatLng> getPoints() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getPoints()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {

                public org.xms.g.maps.model.LatLng apply(com.huawei.hms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getPoints()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {

                public org.xms.g.maps.model.LatLng apply(com.google.android.gms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.getStartCap() Gets the cap set for the start vertex in this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.getStartCap(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getStartCap()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getStartCap()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.getStartCap(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-cap-getstartcap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-cap-getstartcap</a><br/>
     *
     * @return the start cap of the polyline
     */
    public final org.xms.g.maps.model.Cap getStartCap() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getStartCap()");
            com.huawei.hms.maps.model.Cap hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getStartCap();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Cap(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getStartCap()");
            com.google.android.gms.maps.model.Cap gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getStartCap();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Cap(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.getWidth() Gets the width set for this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.getWidth(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getWidth()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getWidth()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.getWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-float-getwidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-float-getwidth</a><br/>
     *
     * @return the width of the polyline in screen pixels
     */
    public final float getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getWidth()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getWidth()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getWidth();
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.getZIndex() Gets the zIndex set for this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the polyline
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.isClickable() Gets the clickability setting for this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.isClickable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#isClickable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#isClickable()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.isClickable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-boolean-isclickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-boolean-isclickable</a><br/>
     *
     * @return true if the polyline is clickable; false if it is not
     */
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isClickable();
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.isGeodesic() Gets the geodesic setting for this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.isGeodesic(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#isGeodesic()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#isGeodesic()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.isGeodesic(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-boolean-isgeodesic">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-boolean-isgeodesic</a><br/>
     *
     * @return true if the polyline segments should be geodesics; false they should not be
     */
    public final boolean isGeodesic() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isGeodesic()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isGeodesic();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isGeodesic()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isGeodesic();
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.isVisible() Gets the visibility setting for this PolylineOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#isVisible()</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-boolean-isvisible</a><br/>
     *
     * @return true if the polyline is visible; false if it is not
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.jointType(int) Sets the joint type for all vertices of the polyline except the start and end vertices.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.jointType(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#jointType(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#jointType(int)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.jointType(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-jointtype-int-jointtype">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-jointtype-int-jointtype</a><br/>
     *
     * @param param0 the param should instanceof int
     * @return this PolylineOptions object with a new joint type set
     */
    public final org.xms.g.maps.model.PolylineOptions jointType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).jointType(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).jointType(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).jointType(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).jointType(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.pattern(java.util.List) Sets the stroke pattern for the polyline. The default stroke pattern is solid, represented by null.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.pattern(java.util.List<com.huawei.hms.maps.model.PatternItem>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#pattern(List%3CPatternItem%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#pattern(List%3CPatternItem%3E)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.pattern(java.util.List<com.google.android.gms.maps.model.PatternItem>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-pattern-listpatternitem-pattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-pattern-listpatternitem-pattern</a><br/>
     *
     * @param param0 the param should instanceof java util List
     * @return the return object is maps model PolylineOptions
     */
    public final org.xms.g.maps.model.PolylineOptions pattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).pattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).pattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).pattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).pattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.startCap(org.xms.g.maps.model.Cap) Sets the cap at the start vertex of the polyline. The default start cap is ButtCap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.startCap(com.huawei.hms.maps.model.Cap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#startCap(Cap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#startCap(Cap)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.startCap(com.google.android.gms.maps.model.Cap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-startcap-cap-startcap">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-startcap-cap-startcap</a><br/>
     *
     * @param param0 the param should instanceof maps model Cap
     * @return this PolylineOptions object with a new start cap set
     */
    public final org.xms.g.maps.model.PolylineOptions startCap(org.xms.g.maps.model.Cap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).startCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).startCap(((com.huawei.hms.maps.model.Cap) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).startCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).startCap(((com.google.android.gms.maps.model.Cap) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.visible(boolean) Specifies the visibility for the polyline. The default visibility is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.visible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#visible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#visible(boolean)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.visible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-visible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-visible-boolean-visible</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this PolylineOptions object with a new visibility setting
     */
    public final org.xms.g.maps.model.PolylineOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.width(float) Sets the width of the polyline in screen pixels. The default is 10.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.width(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#visible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#visible(boolean)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.width(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-width-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-width-float-width</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return this PolylineOptions object with a new width set
     */
    public final org.xms.g.maps.model.PolylineOptions width(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).width(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).width(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).width(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).width(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#writeToParcel(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#writeToParcel(boolean)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.model.PolylineOptions.zIndex(float) Specifies the polyline's zIndex, i.e., the order in which it will be drawn. See the documentation at the top of this class for more information about zIndex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolylineOptions.zIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#zIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polylineo#zIndex(float)</a><br/>
     * com.google.android.gms.maps.model.PolylineOptions.zIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-zindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolylineOptions#public-polylineoptions-zindex-float-zindex</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return this PolylineOptions object with a new zIndex set
     */
    public final org.xms.g.maps.model.PolylineOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.PolylineOptions hReturn = ((com.huawei.hms.maps.model.PolylineOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.PolylineOptions gReturn = ((com.google.android.gms.maps.model.PolylineOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolylineOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}