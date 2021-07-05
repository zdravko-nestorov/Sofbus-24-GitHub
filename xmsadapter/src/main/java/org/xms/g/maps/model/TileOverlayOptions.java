package org.xms.g.maps.model;

/**
 * Defines options for a TileOverlay.<br/>
 * Combination of com.huawei.hms.maps.model.TileOverlayOptions and com.google.android.gms.maps.model.TileOverlayOptions.<br/>
 * com.huawei.hms.maps.model.TileOverlayOptions: Defines attributes of a TileOverlay object.<br/>
 * com.google.android.gms.maps.model.TileOverlayOptions: Defines options for a TileOverlay.<br/>
 */
public final class TileOverlayOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.TileOverlayOptions createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.TileOverlayOptions hReturn = com.huawei.hms.maps.model.TileOverlayOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.TileOverlayOptions gReturn = com.google.android.gms.maps.model.TileOverlayOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.TileOverlayOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.TileOverlayOptions[param0];
        }
    };

    /**
     * org.xms.g.maps.model.TileOverlayOptions.TileOverlayOptions(org.xms.g.utils.XBox) Defines options for a TileOverlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.TileOverlayOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tileoverlayoptions-0000001050153331-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tileoverlayoptions-0000001050153331-V5</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.TileOverlayOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions</a><br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public TileOverlayOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.TileOverlayOptions() Defines options for a TileOverlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.TileOverlayOptions(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tileoverlayoptions-0000001050153331-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tileoverlayoptions-0000001050153331-V5</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.TileOverlayOptions(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions</a><br/>
     */
    public TileOverlayOptions() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.TileOverlayOptions());
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.TileOverlayOptions());
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.TileOverlayOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model TileOverlayOptions object
     */
    public static org.xms.g.maps.model.TileOverlayOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.TileOverlayOptions) param0);
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.TileOverlayOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.TileOverlayOptions;
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.fadeIn(boolean) Specifies whether the tiles should fade in.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.fadeIn(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#fadeIn(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#fadeIn(boolean)</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.fadeIn(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-fadein-boolean-fadein">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-fadein-boolean-fadein</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this TileOverlayOptions object with a new visibility setting
     */
    public final org.xms.g.maps.model.TileOverlayOptions fadeIn(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).fadeIn(param0)");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).fadeIn(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).fadeIn(param0)");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).fadeIn(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.getFadeIn() Gets whether the tiles should fade in.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.getFadeIn(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#getFadeIn()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#getFadeIn()</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.getFadeIn(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-boolean-getfadein">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-boolean-getfadein</a><br/>
     *
     * @return true if the tiles are to fade in; false if it is not
     */
    public final boolean getFadeIn() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getFadeIn()");
            return ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getFadeIn();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getFadeIn()");
            return ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getFadeIn();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.getTileProvider() Gets the tile provider set for this TileOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.getTileProvider(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#getTileProvider()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#getTileProvider()</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.getTileProvider(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileprovider-gettileprovider">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileprovider-gettileprovider</a><br/>
     *
     * @return the TileProvider of the tile overlay
     */
    public final org.xms.g.maps.model.TileProvider getTileProvider() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getTileProvider()");
            com.huawei.hms.maps.model.TileProvider hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getTileProvider();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileProvider.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getTileProvider()");
            com.google.android.gms.maps.model.TileProvider gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getTileProvider();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileProvider.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.getTransparency() Gets the transparency set for this TileOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.getTransparency(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#getTransparency()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#getTransparency()</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.getTransparency(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-float-gettransparency">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-float-gettransparency</a><br/>
     *
     * @return the transparency of the tile overlay
     */
    public final float getTransparency() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getTransparency()");
            return ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getTransparency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getTransparency()");
            return ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getTransparency();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.getZIndex() Gets the zIndex set for this TileOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the tile overlay
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.isVisible() Gets the visibility setting for this TileOverlayOptions object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#isVisible()</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-boolean-isvisible</a><br/>
     *
     * @return true if the tile overlay is to be visible; false if it is not
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.tileProvider(org.xms.g.maps.model.TileProvider) Specifies the tile provider to use for this tile overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.tileProvider(com.huawei.hms.maps.model.TileProvider): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#tileProvider(TileProvider)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#tileProvider(TileProvider)</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.tileProvider(com.google.android.gms.maps.model.TileProvider): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-tileprovider-tileprovider-tileprovider">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-tileprovider-tileprovider-tileprovider</a><br/>
     *
     * @param param0 the TileProvider to use for this tile overlay
     * @return the object for which the method was called, with the new tile provider set
     */
    public final org.xms.g.maps.model.TileOverlayOptions tileProvider(org.xms.g.maps.model.TileProvider param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).tileProvider(((param0) == null ? null : (param0.getHInstanceTileProvider())))");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).tileProvider(((param0) == null ? null : (param0.getHInstanceTileProvider())));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).tileProvider(((param0) == null ? null : (param0.getGInstanceTileProvider())))");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).tileProvider(((param0) == null ? null : (param0.getGInstanceTileProvider())));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.transparency(float) Specifies the transparency of the tile overlay. The default transparency is 0(opaque).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.transparency(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#transparency(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#transparency(float)</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.transparency(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-transparency-float-transparency">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-transparency-float-transparency</a><br/>
     *
     * @param param0 a float in the range [0..1] where 0 means that the tile overlay is opaque and 1 means that the tile overlay is transparent
     * @return this TileOverlayOptions object with a new transparency setting
     * @throws java.lang.IllegalArgumentException if the transparency is outside the range[0..1]
     */
    public final org.xms.g.maps.model.TileOverlayOptions transparency(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).transparency(param0)");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).transparency(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).transparency(param0)");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).transparency(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.visible(boolean) Specifies the visibility for the tile overlay. The default visibility is true.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.visible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#visible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#visible(boolean)</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.visible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-visible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-visible-boolean-visible</a><br/>
     *
     * @param param0 the param should instanceof boolean
     * @return this TileOverlayOptions object with a new visibility setting
     */
    public final org.xms.g.maps.model.TileOverlayOptions visible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).visible(param0)");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).visible(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).visible(param0)");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).visible(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#writeToParcel()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#writeToParcel()</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlayOptions.zIndex(float) Specifies the tile overlay's zIndex, i.e., the order in which it will be drawn where overlays with larger values are drawn above those with lower values. See the documentation at the top of this class for more information about zIndex.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlayOptions.zIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#zIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlayo#zIndex(float)</a><br/>
     * com.google.android.gms.maps.model.TileOverlayOptions.zIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-zindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlayOptions#public-tileoverlayoptions-zindex-float-zindex</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return this TileOverlayOptions object with a new zIndex set
     */
    public final org.xms.g.maps.model.TileOverlayOptions zIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).zIndex(param0)");
            com.huawei.hms.maps.model.TileOverlayOptions hReturn = ((com.huawei.hms.maps.model.TileOverlayOptions) this.getHInstance()).zIndex(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).zIndex(param0)");
            com.google.android.gms.maps.model.TileOverlayOptions gReturn = ((com.google.android.gms.maps.model.TileOverlayOptions) this.getGInstance()).zIndex(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlayOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}