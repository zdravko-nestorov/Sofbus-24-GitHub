package org.xms.g.maps.model;

/**
 * Defines styling options for a Map.<br/>
 * Combination of com.huawei.hms.maps.model.MapStyleOptions and com.google.android.gms.maps.model.MapStyleOptions.<br/>
 * com.huawei.hms.maps.model.MapStyleOptions: Customizes style attributes for a HuaweiMap object.<br/>
 * com.google.android.gms.maps.model.MapStyleOptions: Defines styling options for a GoogleMap.<br/>
 */
public final class MapStyleOptions extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.MapStyleOptions createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.MapStyleOptions hReturn = com.huawei.hms.maps.model.MapStyleOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.MapStyleOptions(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.MapStyleOptions gReturn = com.google.android.gms.maps.model.MapStyleOptions.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.MapStyleOptions(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.MapStyleOptions[] newArray(int param0) {
            return new org.xms.g.maps.model.MapStyleOptions[param0];
        }
    };

    /**
     * org.xms.g.maps.model.MapStyleOptions.MapStyleOptions(org.xms.g.utils.XBox) Defines styling options for a Map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public MapStyleOptions(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.MapStyleOptions.MapStyleOptions(java.lang.String) Defines styling options for Map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MapStyleOptions.MapStyleOptions(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/mapstyleoptions-0000001050150846-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/mapstyleoptions-0000001050150846-V5</a><br/>
     * com.google.android.gms.maps.model.MapStyleOptions.MapStyleOptions(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MapStyleOptions#public-mapstyleoptions-string-json">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MapStyleOptions#public-mapstyleoptions-string-json</a><br/>
     *
     * @param param0 the param should instanceof java lang String
     */
    public MapStyleOptions(java.lang.String param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.MapStyleOptions(param0));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.MapStyleOptions(param0));
        }
    }

    /**
     * org.xms.g.maps.model.MapStyleOptions.loadRawResourceStyle(android.content.Context,int) Creates a new set of map style options based on the a JSON styling string loaded from a raw resource identifier.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MapStyleOptions.loadRawResourceStyle(android.content.Context,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapstyleoptions#loadRawResourceStyle(Context,int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapstyleoptions#loadRawResourceStyle(Context,int)</a><br/>
     * com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(android.content.Context,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MapStyleOptions#public-static-mapstyleoptions-loadrawresourcestyle-context-clientcontext,-int-resourceid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MapStyleOptions#public-static-mapstyleoptions-loadrawresourcestyle-context-clientcontext,-int-resourceid</a><br/>
     *
     * @param param0 Client context for the supplied resourceId
     * @param param1 Id of a raw resource containing the styling JSON
     * @return A reference to this MapStyleOptions to allow call chaining
     * @throws android.content.res.Resources.NotFoundException if resourceId is not a valid raw resource id or the resource could not be read
     */
    public static final org.xms.g.maps.model.MapStyleOptions loadRawResourceStyle(android.content.Context param0, int param1) throws android.content.res.Resources.NotFoundException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.MapStyleOptions.loadRawResourceStyle(param0, param1)");
            com.huawei.hms.maps.model.MapStyleOptions hReturn = com.huawei.hms.maps.model.MapStyleOptions.loadRawResourceStyle(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.MapStyleOptions(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(param0, param1)");
            com.google.android.gms.maps.model.MapStyleOptions gReturn = com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.MapStyleOptions(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.MapStyleOptions.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.MapStyleOptions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model MapStyleOptions object
     */
    public static org.xms.g.maps.model.MapStyleOptions dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.MapStyleOptions) param0);
    }

    /**
     * org.xms.g.maps.model.MapStyleOptions.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.MapStyleOptions;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.MapStyleOptions;
        }
    }

    /**
     * org.xms.g.maps.model.MapStyleOptions.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.MapStyleOptions.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapstyleoptions">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapstyleoptions</a><br/>
     * com.google.android.gms.maps.model.MapStyleOptions.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/MapStyleOptions#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/MapStyleOptions#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.MapStyleOptions) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.MapStyleOptions) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.MapStyleOptions) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.MapStyleOptions) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}