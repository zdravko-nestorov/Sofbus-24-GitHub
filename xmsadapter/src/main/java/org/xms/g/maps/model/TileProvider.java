package org.xms.g.maps.model;

/**
 * An interface for a class that provides the tile images for a TileOverlay.<br/>
 * Combination of com.huawei.hms.maps.model.TileProvider and com.google.android.gms.maps.model.TileProvider.<br/>
 * com.huawei.hms.maps.model.TileProvider: Provides tile images for TileOverlay. The method in this API may be called from multiple threads. Therefore, you must ensure the threadsafe when implementing this API.<br/>
 * com.google.android.gms.maps.model.TileProvider: An interface for a class that provides the tile images for a TileOverlay. For information about the tile coordinate system, see TileOverlay.<br/>
 */
public interface TileProvider extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.maps.model.TileProvider.getNO_TILE() Stub tile that is used to indicate that no tile exists for a specific tile coordinate.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileProvider.NO_TILE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileprovider">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileprovider</a><br/>
     * com.google.android.gms.maps.model.TileProvider.NO_TILE: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileProvider#public-static-final-tile-no_tile">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileProvider#public-static-final-tile-no_tile</a><br/>
     *
     * @return the return object is maps model Tile
     */
    public static org.xms.g.maps.model.Tile getNO_TILE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.TileProvider.NO_TILE");
            com.huawei.hms.maps.model.Tile hReturn = null;
            hReturn = com.huawei.hms.maps.model.TileProvider.NO_TILE;
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Tile(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.TileProvider.NO_TILE");
            com.google.android.gms.maps.model.Tile gReturn = null;
            gReturn = com.google.android.gms.maps.model.TileProvider.NO_TILE;
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Tile(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.TileProvider.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.TileProvider.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model TileProvider object
     */
    public static org.xms.g.maps.model.TileProvider dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.TileProvider) param0);
    }

    /**
     * org.xms.g.maps.model.TileProvider.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.TileProvider;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.TileProvider;
            }
        }
        return param0 instanceof org.xms.g.maps.model.TileProvider;
    }

    /**
     * org.xms.g.maps.model.TileProvider.getTile(int,int,int) Returns the tile to be used for this tile coordinate.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileProvider.getTile(int,int,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileprovider#getTile(int,int,int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileprovider#getTile(int,int,int)</a><br/>
     * com.google.android.gms.maps.model.TileProvider.getTile(int,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileProvider#public-abstract-tile-gettile-int-x,-int-y,-int-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileProvider#public-abstract-tile-gettile-int-x,-int-y,-int-zoom</a><br/>
     *
     * @param param0 The x coordinate of the tile. This will be in the range [0, 2zoom - 1] inclusive
     * @param param1 The y coordinate of the tile. This will be in the range [0, 2zoom - 1] inclusive
     * @param param2 The zoom level of the tile. This will be in the range [ GoogleMap.getMinZoomLevel, GoogleMap.getMaxZoomLevel] inclusive
     * @return the Tile to be used for this tile coordinate. If you do not wish to provide a tile for this tile coordinate, return NO_TILE. If the tile could not be found at this point in time, return null and further requests might be made with an exponential backoff
     */
    public org.xms.g.maps.model.Tile getTile(int param0, int param1, int param2);

    default java.lang.Object getZInstanceTileProvider() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceTileProvider();
        } else {
            return getGInstanceTileProvider();
        }
    }

    default com.google.android.gms.maps.model.TileProvider getGInstanceTileProvider() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.maps.model.TileProvider) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.maps.model.TileProvider() {

            public com.google.android.gms.maps.model.Tile getTile(int param0, int param1, int param2) {
                org.xms.g.maps.model.Tile xResult = org.xms.g.maps.model.TileProvider.this.getTile(param0, param1, param2);
                return ((com.google.android.gms.maps.model.Tile) ((xResult) == null ? null : (xResult.getGInstance())));
            }
        };
    }

    default com.huawei.hms.maps.model.TileProvider getHInstanceTileProvider() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.maps.model.TileProvider) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.maps.model.TileProvider() {

            public com.huawei.hms.maps.model.Tile getTile(int param0, int param1, int param2) {
                org.xms.g.maps.model.Tile xResult = org.xms.g.maps.model.TileProvider.this.getTile(param0, param1, param2);
                return ((com.huawei.hms.maps.model.Tile) ((xResult) == null ? null : (xResult.getHInstance())));
            }
        };
    }

    /**
     * An interface for a class that provides the tile images for a TileOverlay.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.maps.model.TileProvider: An interface for a class that provides the tile images for a TileOverlay.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.model.TileProvider {

        /**
         * org.xms.g.maps.model.TileProvider.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl .<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 this param is utils XBox
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.maps.model.TileProvider.XImpl.getTile(int,int,int) Returns the tile to be used for this tile coordinate.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.model.TileProvider.getTile(int,int,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileprovider#getTile(int,int,int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileprovider#getTile(int,int,int)</a><br/>
         * com.google.android.gms.maps.model.TileProvider.getTile(int,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileProvider#public-abstract-tile-gettile-int-x,-int-y,-int-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileProvider#public-abstract-tile-gettile-int-x,-int-y,-int-zoom</a><br/>
         *
         * @param param0 The x coordinate of the tile. This will be in the range [0, 2zoom - 1] inclusive
         * @param param1 The y coordinate of the tile. This will be in the range [0, 2zoom - 1] inclusive
         * @param param2 The zoom level of the tile. This will be in the range [ GoogleMap.getMinZoomLevel, GoogleMap.getMaxZoomLevel] inclusive
         * @return the Tile to be used for this tile coordinate. If you do not wish to provide a tile for this tile coordinate, return NO_TILE. If the tile could not be found at this point in time, return null and further requests might be made with an exponential backoff
         */
        public org.xms.g.maps.model.Tile getTile(int param0, int param1, int param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileProvider) this.getHInstance()).getTile(param0, param1, param2)");
                com.huawei.hms.maps.model.Tile hReturn = ((com.huawei.hms.maps.model.TileProvider) this.getHInstance()).getTile(param0, param1, param2);
                return ((hReturn) == null ? null : (new org.xms.g.maps.model.Tile(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileProvider) this.getGInstance()).getTile(param0, param1, param2)");
                com.google.android.gms.maps.model.Tile gReturn = ((com.google.android.gms.maps.model.TileProvider) this.getGInstance()).getTile(param0, param1, param2);
                return ((gReturn) == null ? null : (new org.xms.g.maps.model.Tile(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}