package org.xms.g.maps.model;

/**
 * Defines options for a polygon.<br/>
 * Combination of com.huawei.hms.maps.model.PolygonOptions and com.google.android.gms.maps.model.PolygonOptions.<br/>
 * com.huawei.hms.maps.model.PolygonOptions: Defines attributes for a Polygon.<br/>
 * com.google.android.gms.maps.model.PolygonOptions: Defines options for a polygon.<br/>
 */
public final class PolygonOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.PolygonOptions createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.PolygonOptions hReturn = com.huawei.hms.maps.model.PolygonOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.PolygonOptions gReturn = com.google.android.gms.maps.model.PolygonOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.PolygonOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.PolygonOptions[param0];
        }
    };

    /**
     * org.xms.g.maps.model.PolygonOptions.PolygonOptions(org.xms.g.utils.XBox) Defines options for a polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.PolygonOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/polygonoptions-0000001050153037-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/polygonoptions-0000001050153037-V5</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.PolygonOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public PolygonOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.PolygonOptions() Defines options for a polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.PolygonOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/polygonoptions-0000001050153037-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/polygonoptions-0000001050153037-V5</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.PolygonOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions</a><br/>
     */
    public PolygonOptions() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.PolygonOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.PolygonOptions());
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.PolygonOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model PolygonOptions object
     */
    public static org.xms.g.maps.model.PolygonOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.PolygonOptions) param0);
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.PolygonOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.PolygonOptions;
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.add(org.xms.g.maps.model.LatLng) Adds a vertex to the outline of the polygon being built.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.add(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#add(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#add(LatLng)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.add(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-add-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-add-latlng-point</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @return this PolygonOptions object with the given point added to the outline
     */
    public final org.xms.g.maps.model.PolygonOptions add(org.xms.g.maps.model.LatLng... param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.LatLng.class, x -> (com.huawei.hms.maps.model.LatLng)x.getHInstance())))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.huawei.hms.maps.model.LatLng.class, x -> (com.huawei.hms.maps.model.LatLng) x.getHInstance())));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.LatLng.class, x -> (com.google.android.gms.maps.model.LatLng)x.getGInstance())))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng[]) org.xms.g.utils.Utils.genericArrayCopy(param0, com.google.android.gms.maps.model.LatLng.class, x -> (com.google.android.gms.maps.model.LatLng) x.getGInstance())));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.add(org.xms.g.maps.model.LatLng) Adds a vertex to the outline of the polygon being built.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.add(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#add(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#add(LatLng)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.add(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-add-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-add-latlng-point</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng
     * @return this PolygonOptions object with the given point added to the outline
     */
    public final org.xms.g.maps.model.PolygonOptions add(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).add(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).add(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.addAll(java.lang.Iterable<org.xms.g.maps.model.LatLng>) Adds vertices to the outline of the polygon being built.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.addAll(java.lang.Iterable<com.huawei.hms.maps.model.LatLng>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#addAll(Iterable%3CLatLng%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#addAll(Iterable%3CLatLng%3E)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.addAll(java.lang.Iterable<com.google.android.gms.maps.model.LatLng>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-addall-iterablelatlng-points">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-addall-iterablelatlng-points</a><br/>
     *
     * @param param0 the param should instanceof java lang Iterable<LatLng>
     * @return this PolygonOptions object with the given points added to the outline
     */
    public final org.xms.g.maps.model.PolygonOptions addAll(java.lang.Iterable<org.xms.g.maps.model.LatLng> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).addAll(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.addHole(java.lang.Iterable<org.xms.g.maps.model.LatLng>) Adds a hole to the polygon being built.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.addHole(java.lang.Iterable<com.huawei.hms.maps.model.LatLng>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#addHole(Iterable%3CLatLng%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#addHole(Iterable%3CLatLng%3E)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.addHole(java.lang.Iterable<com.google.android.gms.maps.model.LatLng>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-addhole-iterablelatlng-points">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-addhole-iterablelatlng-points</a><br/>
     *
     * @param param0 the param should instanceof java lang Iterable<LatLng>
     * @return this PolygonOptions object with the given hole added
     */
    public final org.xms.g.maps.model.PolygonOptions addHole(java.lang.Iterable<org.xms.g.maps.model.LatLng> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).addHole(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).addHole(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).addHole(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).addHole(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.clickable(boolean) Specifies whether this polygon is clickable. The default setting is false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.clickable(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#clickable(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#clickable(boolean)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.clickable(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-clickable-boolean-clickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-clickable-boolean-clickable</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this PolygonOptions object with a new clickability setting
     */
    public final org.xms.g.maps.model.PolygonOptions clickable(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).clickable(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).clickable(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).clickable(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).clickable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.fillColor(int) Specifies the polygon's fill color, as 32-bit ARGB. The default color is black( 0xff000000).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.fillColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#fillColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#fillColor(int)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.fillColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-fillcolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-fillcolor-int-color</a><br/>
     *
     * @param param0 the param should instanceof int
     * @return this PolygonOptions object with a new fill color set
     */
    public final org.xms.g.maps.model.PolygonOptions fillColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).fillColor(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).fillColor(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).fillColor(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).fillColor(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.geodesic(boolean) Specifies whether to draw each segment of this polygon as a geodesic. The default setting is false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.geodesic(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#geodesic(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#geodesic(boolean)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.geodesic(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-geodesic-boolean-geodesic">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-geodesic-boolean-geodesic</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this PolygonOptions object with a new geodesic setting
     */
    public final org.xms.g.maps.model.PolygonOptions geodesic(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).geodesic(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).geodesic(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).geodesic(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).geodesic(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.getFillColor() Gets the fill color set for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.getFillColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getFillColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getFillColor()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.getFillColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-int-getfillcolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-int-getfillcolor</a><br/>
     *
     * @return the fill color of the polygon in screen pixels
     */
    public final int getFillColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getFillColor()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getFillColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getFillColor()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getFillColor();
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.getHoles() Gets the holes set for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.getHoles(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getHoles()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getHoles()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.getHoles(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-listlistlatlng-getholes">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-listlistlatlng-getholes</a><br/>
     *
     * @return the list of List<LatLng>s specifying the holes of the polygon
     */
    public final java.util.List<java.util.List<org.xms.g.maps.model.LatLng>> getHoles() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getHoles()");
            java.util.List<java.util.List<com.huawei.hms.maps.model.LatLng>> hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getHoles();
            return org.xms.g.utils.Utils.mapList(hReturn, e -> org.xms.g.utils.Utils.mapList2X(e, true));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getHoles()");
            java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getHoles();
            return org.xms.g.utils.Utils.mapList(gReturn, e -> org.xms.g.utils.Utils.mapList2X(e, false));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.getPoints() Gets the outline set for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.getPoints(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getPoints()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getPoints()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.getPoints(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-listlatlng-getpoints">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-listlatlng-getpoints</a><br/>
     *
     * @return the list of LatLngs specifying the vertices of the outline of the polygon
     */
    public final java.util.List<org.xms.g.maps.model.LatLng> getPoints() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getPoints()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {

                public org.xms.g.maps.model.LatLng apply(com.huawei.hms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getPoints()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getPoints();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.LatLng, org.xms.g.maps.model.LatLng>() {

                public org.xms.g.maps.model.LatLng apply(com.google.android.gms.maps.model.LatLng param0) {
                    return new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.getStrokeColor() Gets the stroke color set for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.getStrokeColor(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getStrokeColor()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getStrokeColor()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.getStrokeColor(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-int-getstrokecolor">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-int-getstrokecolor</a><br/>
     *
     * @return the stroke color of the polygon in screen pixels
     */
    public final int getStrokeColor() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeColor()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeColor();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeColor()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeColor();
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.getStrokeJointType() Gets the stroke joint type set in this PolygonOptions object for all vertices of the polygon's outline. See JointType for possible values.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.getStrokeJointType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getStrokeJointType()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getStrokeJointType()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.getStrokeJointType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-int-getstrokejointtype">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-int-getstrokejointtype</a><br/>
     *
     * @return the stroke joint type of the polygon's outline
     */
    public final int getStrokeJointType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeJointType()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeJointType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeJointType()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeJointType();
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.getStrokePattern() Gets the stroke pattern set in this PolygonOptions object for the polygon's outline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.getStrokePattern(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getStrokePattern()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getStrokePattern()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.getStrokePattern(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-listpatternitem-getstrokepattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-listpatternitem-getstrokepattern</a><br/>
     *
     * @return the stroke pattern of the polygon's outline
     */
    public final java.util.List<org.xms.g.maps.model.PatternItem> getStrokePattern() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokePattern()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.huawei.hms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokePattern()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokePattern();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.PatternItem, org.xms.g.maps.model.PatternItem>() {

                public org.xms.g.maps.model.PatternItem apply(com.google.android.gms.maps.model.PatternItem param0) {
                    return new org.xms.g.maps.model.PatternItem(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.getStrokeWidth() Gets the stroke width set for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.getStrokeWidth(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getStrokeWidth()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getStrokeWidth()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.getStrokeWidth(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-float-getstrokewidth">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-float-getstrokewidth</a><br/>
     *
     * @return the stroke width of the polygon in screen pixels
     */
    public final float getStrokeWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeWidth()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getStrokeWidth();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeWidth()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getStrokeWidth();
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.getZIndex() Gets the zIndex set for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the polygon
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.isClickable() Gets the clickability setting for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.isClickable(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#isClickable()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#isClickable()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.isClickable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-boolean-isclickable">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-boolean-isclickable</a><br/>
     *
     * @return true if the polygon is clickable; false if it is not
     */
    public final boolean isClickable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isClickable()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isClickable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isClickable()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isClickable();
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.isGeodesic() Gets the geodesic setting for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.isGeodesic(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#isGeodesic()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#isGeodesic()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.isGeodesic(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-boolean-isgeodesic">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-boolean-isgeodesic</a><br/>
     *
     * @return true if the polygon segments should be geodesics; false if they should not be
     */
    public final boolean isGeodesic() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isGeodesic()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isGeodesic();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isGeodesic()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isGeodesic();
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.isVisible() Gets the visibility setting for this PolygonOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#isVisible()</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-boolean-isvisible</a><br/>
     *
     * @return true if the polygon is to be visible; false if it is not
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.strokeColor(int) Specifies the polygon's stroke color, as 32-bit ARGB. The default color is black( 0xff000000).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.strokeColor(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#strokeColor(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#strokeColor(int)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.strokeColor(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-strokecolor-int-color">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-strokecolor-int-color</a><br/>
     *
     * @param param0 the param should instanceof int
     * @return this PolygonOptions object with a new stroke color set
     */
    public final org.xms.g.maps.model.PolygonOptions strokeColor(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeColor(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeColor(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeColor(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeColor(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.strokeJointType(int) Specifies the joint type for all vertices of the polygon's outline.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.strokeJointType(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#strokeJointType(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#strokeJointType(int)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.strokeJointType(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-strokejointtype-int-jointtype">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-strokejointtype-int-jointtype</a><br/>
     *
     * @param param0 the param should instanceof int
     * @return this PolygonOptions object with a new stroke joint type set
     */
    public final org.xms.g.maps.model.PolygonOptions strokeJointType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeJointType(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeJointType(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeJointType(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeJointType(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.strokePattern(java.util.List) Specifies a stroke pattern for the polygon's outline. The default stroke pattern is solid, represented by null.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.strokePattern(java.util.List<com.huawei.hms.maps.model.PatternItem>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#strokePattern(List%3CPatternItem%3E)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#strokePattern(List%3CPatternItem%3E)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.strokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem>): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-strokepattern-listpatternitem-pattern">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-strokepattern-listpatternitem-pattern</a><br/>
     *
     * @param param0 the param should instanceof java util List
     * @return the return object is maps model PolygonOptions
     */
    public final org.xms.g.maps.model.PolygonOptions strokePattern(java.util.List param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokePattern(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.strokeWidth(float) Specifies the polygon's stroke width, in display pixels. The default width is 10.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.strokeWidth(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#strokeWidth(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#strokeWidth(float)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.strokeWidth(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-strokewidth-float-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-strokewidth-float-width</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return this PolygonOptions object with a new stroke width set
     */
    public final org.xms.g.maps.model.PolygonOptions strokeWidth(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeWidth(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).strokeWidth(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeWidth(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).strokeWidth(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.visible(boolean) Specifies the visibility for the polygon. The default visibility is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.visible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#visible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#visible(boolean)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.visible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-visible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-visible-boolean-visible</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this PolygonOptions object with a new visibility setting
     */
    public final org.xms.g.maps.model.PolygonOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.maps.model.PolygonOptions.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.model.PolygonOptions.zIndex(float) Specifies the polygon's zIndex, i.e., the order in which it will be drawn. See the documentation at the top of this class for more information about zIndex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.PolygonOptions.zIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#zIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-polygonoptions#zIndex(float)</a><br/>
     * com.google.android.gms.maps.model.PolygonOptions.zIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-zindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/PolygonOptions#public-polygonoptions-zindex-float-zindex</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return this PolygonOptions object with a new zIndex set
     */
    public final org.xms.g.maps.model.PolygonOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.PolygonOptions hReturn = ((com.huawei.hms.maps.model.PolygonOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.PolygonOptions gReturn = ((com.google.android.gms.maps.model.PolygonOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.PolygonOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}