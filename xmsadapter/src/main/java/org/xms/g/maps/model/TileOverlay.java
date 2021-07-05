package org.xms.g.maps.model;

/**
 * A Tile Overlay is a set of images which are displayed on top of the base map tiles.<br/>
 * Combination of com.huawei.hms.maps.model.TileOverlay and com.google.android.gms.maps.model.TileOverlay.<br/>
 * com.huawei.hms.maps.model.TileOverlay: Represents a tile overlay. A tile overlay is a set of images to be displayed on a map. It can be transparent and enable you to add new functions to an existing map.<br/>
 * com.google.android.gms.maps.model.TileOverlay: A Tile Overlay is a set of images which are displayed on top of the base map tiles. These tiles may be transparent, allowing you to add features to existing maps. A tile overlay has the following properties:.<br/>
 */
public final class TileOverlay extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.TileOverlay.TileOverlay(org.xms.g.utils.XBox) A Tile Overlay is a set of images which are displayed on top of the base map tiles.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public TileOverlay(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.TileOverlay.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.TileOverlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model TileOverlay object
     */
    public static org.xms.g.maps.model.TileOverlay dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.TileOverlay) param0);
    }

    /**
     * org.xms.g.maps.model.TileOverlay.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.TileOverlay;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.TileOverlay;
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.clearTileCache() Clears the tile cache so that all tiles will be requested again from the TileProvider. The current tiles from this tile overlay will also be cleared from the map after calling this method. The API maintains a small in-memory cache of tiles. If you want to cache tiles for longer, you should implement an on-disk cache.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.clearTileCache(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#clearTileCache()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#clearTileCache()</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.clearTileCache(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-cleartilecache">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-cleartilecache</a><br/>
     */
    public final void clearTileCache() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).clearTileCache()");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).clearTileCache();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).clearTileCache()");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).clearTileCache();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.equals(java.lang.Object) Tests if this TileOverlay is equal to another.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#equals(Object)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#equals(Object)</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-boolean-equals-object-other">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-boolean-equals-object-other</a><br/>
     *
     * @param param0 an Object
     * @return true if both objects are the same object, that is, this == other
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.getFadeIn() Gets whether the overlay tiles should fade in.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.getFadeIn(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#getFadeIn()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#getFadeIn()</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.getFadeIn(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-boolean-getfadein">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-boolean-getfadein</a><br/>
     *
     * @return true if the tiles are to fade in; false if they are not
     */
    public final boolean getFadeIn() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getFadeIn()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getFadeIn();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getFadeIn()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getFadeIn();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.setFadeIn(boolean) Sets whether the overlay tiles should fade in.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.setFadeIn(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#setFadeIn(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#setFadeIn(boolean)</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.setFadeIn(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-setfadein-boolean-fadein">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-setfadein-boolean-fadein</a><br/>
     *
     * @param param0 true to make the tiles fade in; false to render them instantly
     */
    public final void setFadeIn(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setFadeIn(param0)");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setFadeIn(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setFadeIn(param0)");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setFadeIn(param0);
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.getId() Gets this tile overlay's id.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.getId(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#getId()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#getId()</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.getId(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-string-getid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-string-getid</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String getId() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getId()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getId();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getId()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getId();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.getTransparency() Gets the transparency of this tile overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.getTransparency(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#getTransparency()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#getTransparency()</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.getTransparency(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-float-gettransparency">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-float-gettransparency</a><br/>
     *
     * @return the transparency of this tile overlay
     */
    public final float getTransparency() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getTransparency()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getTransparency();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getTransparency()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getTransparency();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.setTransparency(float) Sets the transparency of this tile overlay. See the documentation at the top of this class for more information.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.setTransparency(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#setTransparency(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#setTransparency(float)</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.setTransparency(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-settransparency-float-transparency">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-settransparency-float-transparency</a><br/>
     *
     * @param param0 a float in the range [0..1] where 0 means that the tile overlay is opaque and 1 means that the tile overlay is transparent
     */
    public final void setTransparency(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setTransparency(param0)");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setTransparency(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setTransparency(param0)");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setTransparency(param0);
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.getZIndex() Gets the zIndex of this tile overlay.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.getZIndex(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#getZIndex()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#getZIndex()</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.getZIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-float-getzindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-float-getzindex</a><br/>
     *
     * @return the zIndex of the tile overlay
     */
    public final float getZIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getZIndex()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).getZIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getZIndex()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).getZIndex();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.setZIndex(float) Sets the zIndex of this tile overlay. See the documentation at the top of this class for more information.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.setZIndex(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#setZIndex(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#setZIndex(float)</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.setZIndex(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-setzindex-float-zindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-setzindex-float-zindex</a><br/>
     *
     * @param param0 the zIndex of this tile overlay
     */
    public final void setZIndex(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setZIndex(param0)");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setZIndex(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setZIndex(param0)");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setZIndex(param0);
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#hashCode()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#hashCode()</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.isVisible() Gets the visibility of this tile overlay. Note that this does not return whether the tile overlay is actually within the screen's viewport, but whether it will be drawn if it is contained in the screen's viewport.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.isVisible(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#isVisible()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#isVisible()</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.isVisible(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-boolean-isvisible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-boolean-isvisible</a><br/>
     *
     * @return this tile overlay's visibility
     */
    public final boolean isVisible() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).isVisible()");
            return ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).isVisible();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).isVisible()");
            return ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).isVisible();
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.setVisible(boolean) Sets the visibility of this tile overlay. When not visible, a tile overlay is not drawn, but it keeps all its other properties. Tile overlays are visible by default.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.setVisible(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#setVisible(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#setVisible(boolean)</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.setVisible(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-setvisible-boolean-visible">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-setvisible-boolean-visible</a><br/>
     *
     * @param param0 true to make this overlay visible; false to make it invisible
     */
    public final void setVisible(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setVisible(param0)");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).setVisible(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setVisible(param0)");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).setVisible(param0);
        }
    }

    /**
     * org.xms.g.maps.model.TileOverlay.remove() Removes this tile overlay from the map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.TileOverlay.remove(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#remove()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-tileoverlay#remove()</a><br/>
     * com.google.android.gms.maps.model.TileOverlay.remove(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-remove">https://developers.google.com/android/reference/com/google/android/gms/maps/model/TileOverlay#public-void-remove</a><br/>
     */
    public final void remove() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).remove()");
            ((com.huawei.hms.maps.model.TileOverlay) this.getHInstance()).remove();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).remove()");
            ((com.google.android.gms.maps.model.TileOverlay) this.getGInstance()).remove();
        }
    }
}