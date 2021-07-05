package org.xms.g.maps.model;

/**
 * Contains information about a Tile that is returned by a TileProvider.<br/>
 * Combination of com.huawei.hms.maps.model.Tile and com.google.android.gms.maps.model.Tile.<br/>
 * com.huawei.hms.maps.model.Tile: Defines the minimum unit of a tile overlay. To create a Tile object, call the TileProvider method.<br/>
 * com.google.android.gms.maps.model.Tile: Contains information about a Tile that is returned by a TileProvider.<br/>
 */
public final class Tile extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.maps.model.Tile createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.maps.model.Tile hReturn = com.huawei.hms.maps.model.Tile.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.Tile(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.maps.model.Tile gReturn = com.google.android.gms.maps.model.Tile.CREATOR.createFromParcel(param0);
                return new org.xms.g.maps.model.Tile(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.maps.model.Tile[] newArray(int param0) {
            return new org.xms.g.maps.model.Tile[param0];
        }
    };

    /**
     * org.xms.g.maps.model.Tile.Tile(org.xms.g.utils.XBox) Defines the minimum unit of a tile overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public Tile(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.Tile.Tile(int,int,byte[]) Defines the minimum unit of a tile overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Tile.Tile(int,int,byte[]): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tile-0000001050153285-V5">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/tile-0000001050153285-V5</a><br/>
     * com.google.android.gms.maps.model.Tile.Tile(int,int,byte[]): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile</a><br/>
     *
     * @param param0 A byte array containing the image data. The image will be created from this data by calling decodeByteArray(byte[], int, int)
     * @param param1 the width of the image in pixels
     * @param param2 the height of the image in pixels
     */
    public Tile(int param0, int param1, byte[] param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.maps.model.Tile(param0, param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.maps.model.Tile(param0, param1, param2));
        }
    }

    /**
     * org.xms.g.maps.model.Tile.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.Tile.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model Tile object
     */
    public static org.xms.g.maps.model.Tile dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.Tile) param0);
    }

    /**
     * org.xms.g.maps.model.Tile.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.Tile;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.Tile;
        }
    }

    /**
     * org.xms.g.maps.model.Tile.getData() A byte array containing the image data. The image will be created from this data by calling decodeByteArray(byte[], int, int).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Tile.data: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tile">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tile</a><br/>
     * com.google.android.gms.maps.model.Tile.data: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile#public-final-byte[]-data">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile#public-final-byte[]-data</a><br/>
     *
     * @return the return object is byte[]
     */
    public byte[] getData() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Tile) this.getHInstance()).data");
            return ((com.huawei.hms.maps.model.Tile) this.getHInstance()).data;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Tile) this.getGInstance()).data");
            return ((com.google.android.gms.maps.model.Tile) this.getGInstance()).data;
        }
    }

    /**
     * org.xms.g.maps.model.Tile.getHeight() The height of the image encoded by data in pixels.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Tile.height: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tile">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tile</a><br/>
     * com.google.android.gms.maps.model.Tile.height: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile#public-final-int-height">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile#public-final-int-height</a><br/>
     *
     * @return the return object is int
     */
    public int getHeight() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Tile) this.getHInstance()).height");
            return ((com.huawei.hms.maps.model.Tile) this.getHInstance()).height;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Tile) this.getGInstance()).height");
            return ((com.google.android.gms.maps.model.Tile) this.getGInstance()).height;
        }
    }

    /**
     * org.xms.g.maps.model.Tile.getWidth() The width of the image encoded by data in pixels.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Tile.width: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tile">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tile</a><br/>
     * com.google.android.gms.maps.model.Tile.width: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile#public-final-int-width">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile#public-final-int-width</a><br/>
     *
     * @return the return object is int
     */
    public int getWidth() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Tile) this.getHInstance()).width");
            return ((com.huawei.hms.maps.model.Tile) this.getHInstance()).width;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Tile) this.getGInstance()).width");
            return ((com.google.android.gms.maps.model.Tile) this.getGInstance()).width;
        }
    }

    /**
     * org.xms.g.maps.model.Tile.writeToParcel(android.os.Parcel,int) writeToParcel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.Tile.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tile">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tile</a><br/>
     * com.google.android.gms.maps.model.Tile.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/maps/model/Tile#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the param should instanceof android os Parcel
     * @param param1 the param should instanceof int
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.Tile) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.maps.model.Tile) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.Tile) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.maps.model.Tile) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}