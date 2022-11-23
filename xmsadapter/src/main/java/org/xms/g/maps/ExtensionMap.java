package org.xms.g.maps;

import android.annotation.SuppressLint;

/**
 * This is the main class of the Maps SDK for Android and is the entry point for all methods related to the map.<br/>
 * Combination of com.huawei.hms.maps.HuaweiMap and com.google.android.gms.maps.GoogleMap.<br/>
 * com.huawei.hms.maps.HuaweiMap: A main class of the HUAWEI Map Kit SDK. The HuaweiMap class is the entry point for all map-related methods. You cannot create a HuaweiMap object directly, rather, you can obtain a HuaweiMap object only by using the getMapAsync() method in MapFragment or MapView.<br/>
 * com.google.android.gms.maps.GoogleMap: This is the main class of the Google Maps SDK for Android and is the entry point for all methods related to the map. You cannot instantiate a GoogleMap object directly, rather, you must obtain one from the getMapAsync()method on a MapFragment or MapView that you have added to your application.<br/>
 */
public final class ExtensionMap extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.ExtensionMap.ExtensionMap(org.xms.g.utils.XBox) This is the main class of the Google Maps SDK for Android and is the entry point for all methods related to the map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public ExtensionMap(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.ExtensionMap.getMAP_TYPE_HYBRID() Satellite maps with a transparent layer of major streets.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.MAP_TYPE_HYBRID: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap</a><br/>
     * com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_hybrid">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_hybrid</a><br/>
     *
     * @return int return object is int
     */
    public static int getMAP_TYPE_HYBRID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_HYBRID");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_HYBRID;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_HYBRID;
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getMAP_TYPE_NONE() No base map tiles.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NONE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap</a><br/>
     * com.google.android.gms.maps.GoogleMap.MAP_TYPE_NONE: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_none">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_none</a><br/>
     *
     * @return int return object is int
     */
    public static int getMAP_TYPE_NONE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NONE");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NONE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_NONE");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_NONE;
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getMAP_TYPE_NORMAL() Basic maps.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NORMAL: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap</a><br/>
     * com.google.android.gms.maps.GoogleMap.MAP_TYPE_NORMAL: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_normal">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_normal</a><br/>
     *
     * @return int return object is int
     */
    public static int getMAP_TYPE_NORMAL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NORMAL");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_NORMAL;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_NORMAL");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_NORMAL;
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getMAP_TYPE_SATELLITE() Satellite maps with no labels.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.MAP_TYPE_SATELLITE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap</a><br/>
     * com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_satellite">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_satellite</a><br/>
     *
     * @return int return object is int
     */
    public static int getMAP_TYPE_SATELLITE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_SATELLITE");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_SATELLITE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_SATELLITE;
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getMAP_TYPE_TERRAIN() Terrain maps.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.MAP_TYPE_TERRAIN: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap</a><br/>
     * com.google.android.gms.maps.GoogleMap.MAP_TYPE_TERRAIN: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_terrain">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-static-final-int-map_type_terrain</a><br/>
     *
     * @return int return object is int
     */
    public static int getMAP_TYPE_TERRAIN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.MAP_TYPE_TERRAIN");
            return com.huawei.hms.maps.HuaweiMap.MAP_TYPE_TERRAIN;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.MAP_TYPE_TERRAIN");
            return com.google.android.gms.maps.GoogleMap.MAP_TYPE_TERRAIN;
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps ExtensionMap object
     */
    public static org.xms.g.maps.ExtensionMap dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.ExtensionMap) param0);
    }

    /**
     * org.xms.g.maps.ExtensionMap.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap;
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.addCircle(org.xms.g.maps.model.CircleOptions) Add a circle to this map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.addCircle(com.huawei.hms.maps.model.CircleOptions): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addCircle(CircleOptions)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addCircle(CircleOptions)</a><br/>
     * com.google.android.gms.maps.GoogleMap.addCircle(com.google.android.gms.maps.model.CircleOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-circle-addcircle-circleoptions-options">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-circle-addcircle-circleoptions-options</a><br/>
     *
     * @param param0 A circle options object that defines how to render the Circle
     * @return The Circle object that is added to the map
     */
    public final org.xms.g.maps.model.Circle addCircle(org.xms.g.maps.model.CircleOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addCircle(((com.huawei.hms.maps.model.CircleOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.Circle hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addCircle(((com.huawei.hms.maps.model.CircleOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Circle(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addCircle(((com.google.android.gms.maps.model.CircleOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.Circle gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addCircle(((com.google.android.gms.maps.model.CircleOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Circle(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.addGroundOverlay(org.xms.g.maps.model.GroundOverlayOptions) Adds an image to this map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.addGroundOverlay(com.huawei.hms.maps.model.GroundOverlayOptions): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addGroundOverlay(GroundOverlayOptions)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addGroundOverlay(GroundOverlayOptions)</a><br/>
     * com.google.android.gms.maps.GoogleMap.addGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-groundoverlay-addgroundoverlay-groundoverlayoptions-options">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-groundoverlay-addgroundoverlay-groundoverlayoptions-options</a><br/>
     *
     * @param param0 this param is maps model GroundOverlayOptions
     * @return return object is maps model GroundOverlay
     * @throws java.lang.IllegalArgumentException No image or location is specified in the options parameter
     */
    public final org.xms.g.maps.model.GroundOverlay addGroundOverlay(org.xms.g.maps.model.GroundOverlayOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addGroundOverlay(((com.huawei.hms.maps.model.GroundOverlayOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.GroundOverlay hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addGroundOverlay(((com.huawei.hms.maps.model.GroundOverlayOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlay(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addGroundOverlay(((com.google.android.gms.maps.model.GroundOverlayOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.GroundOverlay gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addGroundOverlay(((com.google.android.gms.maps.model.GroundOverlayOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.GroundOverlay(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.addMarker(org.xms.g.maps.model.MarkerOptions) Adds a marker to this map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.addMarker(com.huawei.hms.maps.model.MarkerOptions): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addMarker(MarkerOptions)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addMarker(MarkerOptions)</a><br/>
     * com.google.android.gms.maps.GoogleMap.addMarker(com.google.android.gms.maps.model.MarkerOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-marker-addmarker-markeroptions-options">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-marker-addmarker-markeroptions-options</a><br/>
     *
     * @param param0 A marker options object that defines how to render the marker
     * @return The Marker that was added to the map
     */
    public final org.xms.g.maps.model.Marker addMarker(org.xms.g.maps.model.MarkerOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addMarker(((com.huawei.hms.maps.model.MarkerOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.Marker hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addMarker(((com.huawei.hms.maps.model.MarkerOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addMarker(((com.google.android.gms.maps.model.MarkerOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.Marker gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addMarker(((com.google.android.gms.maps.model.MarkerOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.addPolygon(org.xms.g.maps.model.PolygonOptions) Adds a polygon to this map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.addPolygon(com.huawei.hms.maps.model.PolygonOptions): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addPolygon(PolygonOptions)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addPolygon(PolygonOptions)</a><br/>
     * com.google.android.gms.maps.GoogleMap.addPolygon(com.google.android.gms.maps.model.PolygonOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-polygon-addpolygon-polygonoptions-options">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-polygon-addpolygon-polygonoptions-options</a><br/>
     *
     * @param param0 A polygon options object that defines how to render the Polygon
     * @return The Polygon object that is added to the map
     */
    public final org.xms.g.maps.model.Polygon addPolygon(org.xms.g.maps.model.PolygonOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addPolygon(((com.huawei.hms.maps.model.PolygonOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.Polygon hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addPolygon(((com.huawei.hms.maps.model.PolygonOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Polygon(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addPolygon(((com.google.android.gms.maps.model.PolygonOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.Polygon gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addPolygon(((com.google.android.gms.maps.model.PolygonOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Polygon(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.addPolyline(org.xms.g.maps.model.PolylineOptions) Adds a polyline to this map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.addPolyline(com.huawei.hms.maps.model.PolylineOptions): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addPolyline(PolylineOptions)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addPolyline(PolylineOptions)</a><br/>
     * com.google.android.gms.maps.GoogleMap.addPolyline(com.google.android.gms.maps.model.PolylineOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-polyline-addpolyline-polylineoptions-options">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-polyline-addpolyline-polylineoptions-options</a><br/>
     *
     * @param param0 A polyline options object that defines how to render the Polyline
     * @return The Polyline object that was added to the map
     */
    public final org.xms.g.maps.model.Polyline addPolyline(org.xms.g.maps.model.PolylineOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addPolyline(((com.huawei.hms.maps.model.PolylineOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.Polyline hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addPolyline(((com.huawei.hms.maps.model.PolylineOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.Polyline(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addPolyline(((com.google.android.gms.maps.model.PolylineOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.Polyline gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addPolyline(((com.google.android.gms.maps.model.PolylineOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.Polyline(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.addTileOverlay(org.xms.g.maps.model.TileOverlayOptions) Adds a tile overlay to a map. Note that tile overlays are different from other overlays. If you recreate a map, tile overlays will not be automatically restored. You must manually add them again.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.addTileOverlay(com.huawei.hms.maps.model.TileOverlayOptions): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addTileOverlay(TileOverlayOptions)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#addTileOverlay(TileOverlayOptions)</a><br/>
     * com.google.android.gms.maps.GoogleMap.addTileOverlay(com.google.android.gms.maps.model.TileOverlayOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-tileoverlay-addtileoverlay-tileoverlayoptions-options">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-tileoverlay-addtileoverlay-tileoverlayoptions-options</a><br/>
     *
     * @param param0 A tile-overlay options object that defines how to render the overlay. Options must have a TileProvider specified, otherwise an IllegalArgumentException will be thrown
     * @return The TileOverlay that was added to the map
     */
    public final org.xms.g.maps.model.TileOverlay addTileOverlay(org.xms.g.maps.model.TileOverlayOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addTileOverlay(((com.huawei.hms.maps.model.TileOverlayOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.model.TileOverlay hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).addTileOverlay(((com.huawei.hms.maps.model.TileOverlayOptions) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.TileOverlay(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addTileOverlay(((com.google.android.gms.maps.model.TileOverlayOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.model.TileOverlay gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).addTileOverlay(((com.google.android.gms.maps.model.TileOverlayOptions) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.TileOverlay(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.animateCamera(org.xms.g.maps.CameraUpdate,org.xms.g.maps.ExtensionMap.CancelableCallback) Animates the movement of the camera from the current position to the position defined in the update and calls an optional callback on completion. See CameraUpdateFactory for a set of updates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.animateCamera(com.huawei.hms.maps.CameraUpdate,com.huawei.hms.maps.HuaweiMap.CancelableCallback): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#animateCamera(CameraUpdate,HuaweiMap.CancelableCallback)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#animateCamera(CameraUpdate,HuaweiMap.CancelableCallback)</a><br/>
     * com.google.android.gms.maps.GoogleMap.animateCamera(com.google.android.gms.maps.CameraUpdate,com.google.android.gms.maps.GoogleMap.CancelableCallback): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-animatecamera-cameraupdate-update,-googlemap.cancelablecallback-callback">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-animatecamera-cameraupdate-update,-googlemap.cancelablecallback-callback</a><br/>
     *
     * @param param0 The change that should be applied to the camera
     * @param param1 The callback to invoke from the Android UI thread when the animation stops. If the animation completes normally, onFinish() is called; otherwise, onCancel() is called. Do not update or animate the camera from within onCancel()
     */
    public final void animateCamera(org.xms.g.maps.CameraUpdate param0, org.xms.g.maps.ExtensionMap.CancelableCallback param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))), ((param1) == null ? null : (param1.getHInstanceCancelableCallback())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))), ((param1) == null ? null : (param1.getHInstanceCancelableCallback())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))), ((param1) == null ? null : (param1.getGInstanceCancelableCallback())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))), ((param1) == null ? null : (param1.getGInstanceCancelableCallback())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.animateCamera(org.xms.g.maps.CameraUpdate) Animates the movement of the camera from the current position to the position defined in the update. During the animation, a call to getCameraPosition()returns an intermediate location of the camera.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.animateCamera(com.huawei.hms.maps.CameraUpdate): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#animateCamera(CameraUpdate)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#animateCamera(CameraUpdate)</a><br/>
     * com.google.android.gms.maps.GoogleMap.animateCamera(com.google.android.gms.maps.CameraUpdate): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-animatecamera-cameraupdate-update">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-animatecamera-cameraupdate-update</a><br/>
     *
     * @param param0 The change that should be applied to the camera
     */
    public final void animateCamera(org.xms.g.maps.CameraUpdate param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.animateCamera(org.xms.g.maps.CameraUpdate,int,org.xms.g.maps.ExtensionMap.CancelableCallback) Animates the camera to another position within a specified period and calls an optional callback upon animation completion. If getCameraPosition()is called during the animation, the intermediate position of the camera will be returned.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.animateCamera(com.huawei.hms.maps.CameraUpdate,int,com.huawei.hms.maps.HuaweiMap.CancelableCallback): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#animateCamera(CameraUpdate,int,HuaweiMap.CancelableCallback)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#animateCamera(CameraUpdate,int,HuaweiMap.CancelableCallback)</a><br/>
     * com.google.android.gms.maps.GoogleMap.animateCamera(com.google.android.gms.maps.CameraUpdate,int,com.google.android.gms.maps.GoogleMap.CancelableCallback): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-animatecamera-cameraupdate-update,-int-durationms,-googlemap.cancelablecallback-callback">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-animatecamera-cameraupdate-update,-int-durationms,-googlemap.cancelablecallback-callback</a><br/>
     *
     * @param param0 this param is camera Update
     * @param param1 The duration of the animation in milliseconds. This must be strictly positive, otherwise an IllegalArgumentException will be thrown
     * @param param2 An optional callback to be notified from the Android UI thread when the animation stops. If the animation stops due to its natural completion, the callback will be notified with onFinish(). If the animation stops due to interruption by a later camera movement or a user gesture, onCancel() will be called. The callback should not attempt to move or animate the camera in its cancellation method. If a callback isn't required, leave it as null
     */
    public final void animateCamera(org.xms.g.maps.CameraUpdate param0, int param1, org.xms.g.maps.ExtensionMap.CancelableCallback param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))), param1, ((param2) == null ? null : (param2.getHInstanceCancelableCallback())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).animateCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))), param1, ((param2) == null ? null : (param2.getHInstanceCancelableCallback())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))), param1, ((param2) == null ? null : (param2.getGInstanceCancelableCallback())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).animateCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))), param1, ((param2) == null ? null : (param2.getGInstanceCancelableCallback())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.clear() Removes all circles, markers, polylines, and ground overlays from a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.clear(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#clear()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#clear()</a><br/>
     * com.google.android.gms.maps.GoogleMap.clear(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-clear">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-clear</a><br/>
     */
    public final void clear() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).clear()");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).clear();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).clear()");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).clear();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getCameraPosition() Obtains the current position of the camera. The returned CameraPosition object is a snapshot of the camera's current position and will not be automatically updated when the camera moves.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.getCameraPosition(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getCameraPosition()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getCameraPosition()</a><br/>
     * com.google.android.gms.maps.GoogleMap.getCameraPosition(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-cameraposition-getcameraposition">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-cameraposition-getcameraposition</a><br/>
     *
     * @return The current position of the Camera
     */
    public final org.xms.g.maps.model.CameraPosition getCameraPosition() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getCameraPosition()");
            com.huawei.hms.maps.model.CameraPosition hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getCameraPosition();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getCameraPosition()");
            com.google.android.gms.maps.model.CameraPosition gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getCameraPosition();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.CameraPosition(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getFocusedBuilding() Gets the currently focused building.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.getFocusedBuilding()
     * com.google.android.gms.maps.GoogleMap.getFocusedBuilding(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-indoorbuilding-getfocusedbuilding">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-indoorbuilding-getfocusedbuilding</a><br/>
     *
     * @return The current focused building or null if no building is focused
     */
    public final org.xms.g.maps.model.IndoorBuilding getFocusedBuilding() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getFocusedBuilding()");
            com.huawei.hms.maps.model.IndoorBuilding hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getFocusedBuilding();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.IndoorBuilding(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getFocusedBuilding()");
            com.google.android.gms.maps.model.IndoorBuilding gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getFocusedBuilding();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.IndoorBuilding(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getMapType() Gets the type of map that's currently displayed. See MAP_TYPE_NORMAL, MAP_TYPE_SATELLITE, MAP_TYPE_TERRAIN for possible values.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.getMapType(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getMapType()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getMapType()</a><br/>
     * com.google.android.gms.maps.GoogleMap.getMapType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-int-getmaptype">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-int-getmaptype</a><br/>
     *
     * @return The map type
     */
    public final int getMapType() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMapType()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMapType();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMapType()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMapType();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setMapType(int) Sets the type of map tiles that should be displayed. The allowable values are:.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setMapType(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMapType(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMapType(int)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setMapType(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setmaptype-int-type">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setmaptype-int-type</a><br/>
     *
     * @param param0 The type of map to display
     */
    public final void setMapType(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMapType(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMapType(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMapType(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMapType(param0);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getMaxZoomLevel() Returns the maximum zoom level for the current camera position. This takes into account what map type is currently being used, e.g., satellite or terrain may have a lower max zoom level than the base map tiles.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.getMaxZoomLevel(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getMaxZoomLevel()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getMaxZoomLevel()</a><br/>
     * com.google.android.gms.maps.GoogleMap.getMaxZoomLevel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-float-getmaxzoomlevel">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-float-getmaxzoomlevel</a><br/>
     *
     * @return The maximum zoom level available at the current camera position
     */
    public final float getMaxZoomLevel() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMaxZoomLevel()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMaxZoomLevel();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMaxZoomLevel()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMaxZoomLevel();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getMinZoomLevel() Obtains the minimum zoom level at the current camera position. Different from the maximum zoom level, the minimum zoom level is the same at any position but may vary based on the device and map size.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.getMinZoomLevel(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getMinZoomLevel()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getMinZoomLevel()</a><br/>
     * com.google.android.gms.maps.GoogleMap.getMinZoomLevel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-float-getminzoomlevel">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-float-getminzoomlevel</a><br/>
     *
     * @return The minimum zoom level available
     */
    public final float getMinZoomLevel() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMinZoomLevel()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getMinZoomLevel();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMinZoomLevel()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getMinZoomLevel();
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final android.location.Location getMyLocation() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.maps.ExtensionMap.getProjection() Returns a Projection object that you can use to convert between screen coordinates and latitude/longitude coordinates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.getProjection(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getProjection()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getProjection()</a><br/>
     * com.google.android.gms.maps.GoogleMap.getProjection(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-projection-getprojection">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-projection-getprojection</a><br/>
     *
     * @return The Projection of the map in its current state
     */
    public final org.xms.g.maps.Projection getProjection() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getProjection()");
            com.huawei.hms.maps.Projection hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getProjection();
            return ((hReturn) == null ? null : (new org.xms.g.maps.Projection(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getProjection()");
            com.google.android.gms.maps.Projection gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getProjection();
            return ((gReturn) == null ? null : (new org.xms.g.maps.Projection(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.getUiSettings() Gets the user interface settings for the map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.getUiSettings(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getUiSettings()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#getUiSettings()</a><br/>
     * com.google.android.gms.maps.GoogleMap.getUiSettings(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-uisettings-getuisettings">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-uisettings-getuisettings</a><br/>
     *
     * @return The UiSettings for this map
     */
    public final org.xms.g.maps.UiSettings getUiSettings() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getUiSettings()");
            com.huawei.hms.maps.UiSettings hReturn = ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).getUiSettings();
            return ((hReturn) == null ? null : (new org.xms.g.maps.UiSettings(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getUiSettings()");
            com.google.android.gms.maps.UiSettings gReturn = ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).getUiSettings();
            return ((gReturn) == null ? null : (new org.xms.g.maps.UiSettings(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.isBuildingsEnabled() Returns whether 3D buildings layer is enabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.isBuildingsEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#isBuildingsEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#isBuildingsEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMap.isBuildingsEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-isbuildingsenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-isbuildingsenabled</a><br/>
     *
     * @return true if buildings are enabled; false otherwise
     */
    public final boolean isBuildingsEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isBuildingsEnabled()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isBuildingsEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isBuildingsEnabled()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isBuildingsEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setBuildingsEnabled(boolean) Turns the 3D buildings layer on or off.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setBuildingsEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setBuildingsEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setBuildingsEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setBuildingsEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setbuildingsenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setbuildingsenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable the 3D buildings layer; false to disable 3D buildings
     */
    public final void setBuildingsEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setBuildingsEnabled(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setBuildingsEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setBuildingsEnabled(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setBuildingsEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.isIndoorEnabled() Gets whether indoor maps are currently enabled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.isIndoorEnabled()
     * com.google.android.gms.maps.GoogleMap.isIndoorEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-isindoorenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-isindoorenabled</a><br/>
     *
     * @return true if indoor maps are enabled; false if indoor maps are disabled;
     */
    public final boolean isIndoorEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isIndoorEnabled()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isIndoorEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isIndoorEnabled()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isIndoorEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.isMyLocationEnabled() Gets the status of the my-location layer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.isMyLocationEnabled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#isMyLocationEnabled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#isMyLocationEnabled()</a><br/>
     * com.google.android.gms.maps.GoogleMap.isMyLocationEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-ismylocationenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-ismylocationenabled</a><br/>
     *
     * @return true if the my-location layer is enabled; false otherwise
     */
    public final boolean isMyLocationEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isMyLocationEnabled()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isMyLocationEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isMyLocationEnabled()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isMyLocationEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setMyLocationEnabled(boolean) Enables or disables the my-location layer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setMyLocationEnabled(boolean): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMyLocationEnabled(boolean)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMyLocationEnabled(boolean)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setMyLocationEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setmylocationenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setmylocationenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to enable; false to disable
     */
    @SuppressLint("MissingPermission")
    public final void setMyLocationEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMyLocationEnabled(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMyLocationEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMyLocationEnabled(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMyLocationEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.isTrafficEnabled() Checks whether the map is drawing traffic data. This is subject to the availability of traffic data.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.isTrafficEnabled()
     * com.google.android.gms.maps.GoogleMap.isTrafficEnabled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-istrafficenabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-istrafficenabled</a><br/>
     *
     * @return true if traffic data is enabled; false otherwise
     */
    public final boolean isTrafficEnabled() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isTrafficEnabled()");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).isTrafficEnabled();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isTrafficEnabled()");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).isTrafficEnabled();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setTrafficEnabled(boolean) Turns the traffic layer on or off.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setTrafficEnabled(boolean)
     * com.google.android.gms.maps.GoogleMap.setTrafficEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-settrafficenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-settrafficenabled-boolean-enabled</a><br/>
     *
     * @param param0 this param is boolean
     */
    public final void setTrafficEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setTrafficEnabled(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setTrafficEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setTrafficEnabled(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setTrafficEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.moveCamera(org.xms.g.maps.CameraUpdate) Repositions the camera according to the instructions defined in the update. The move is instantaneous, and a subsequent getCameraPosition()will reflect the new position. See CameraUpdateFactory for a set of updates.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.moveCamera(com.huawei.hms.maps.CameraUpdate): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#moveCamera(CameraUpdate)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#moveCamera(CameraUpdate)</a><br/>
     * com.google.android.gms.maps.GoogleMap.moveCamera(com.google.android.gms.maps.CameraUpdate): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-movecamera-cameraupdate-update">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-movecamera-cameraupdate-update</a><br/>
     *
     * @param param0 The change that should be applied to the camera
     */
    public final void moveCamera(org.xms.g.maps.CameraUpdate param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).moveCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).moveCamera(((com.huawei.hms.maps.CameraUpdate) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).moveCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).moveCamera(((com.google.android.gms.maps.CameraUpdate) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.resetMinMaxZoomPreference() Deletes all maximum and minimum zoom levels previously set.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.resetMinMaxZoomPreference(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#resetMinMaxZoomPreference()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#resetMinMaxZoomPreference()</a><br/>
     * com.google.android.gms.maps.GoogleMap.resetMinMaxZoomPreference(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-resetminmaxzoompreference">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-resetminmaxzoompreference</a><br/>
     */
    public final void resetMinMaxZoomPreference() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).resetMinMaxZoomPreference()");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).resetMinMaxZoomPreference();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).resetMinMaxZoomPreference()");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).resetMinMaxZoomPreference();
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setContentDescription(java.lang.String) Sets a contentDescription for the map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setContentDescription(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setContentDescription(String)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setContentDescription(String)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setContentDescription(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setcontentdescription-string-description">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setcontentdescription-string-description</a><br/>
     *
     * @param param0 a string to use as a description
     */
    public final void setContentDescription(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setContentDescription(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setContentDescription(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setContentDescription(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setContentDescription(param0);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setIndoorEnabled(boolean) Sets whether indoor maps should be enabled. Currently, indoor maps can only be shown on one map at a time and by default, this is the first map added to your application. To enable indoor maps on another map, you must first disable indoor maps on the original map. If you try to enable indoor maps when it is enabled on another map, nothing will happen and this will return false. When Indoor is not enabled for a map, all methods related to indoor will return null, or false.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setIndoorEnabled(boolean)
     * com.google.android.gms.maps.GoogleMap.setIndoorEnabled(boolean): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-setindoorenabled-boolean-enabled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-setindoorenabled-boolean-enabled</a><br/>
     *
     * @param param0 true to try to enable indoor maps; false to disable indoor maps
     * @return whether it was possible to enable indoor maps
     */
    public final boolean setIndoorEnabled(boolean param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setIndoorEnabled(param0)");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setIndoorEnabled(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setIndoorEnabled(param0)");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setIndoorEnabled(param0);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setInfoWindowAdapter(org.xms.g.maps.ExtensionMap.InfoWindowAdapter) Sets a custom renderer for the contents of info windows.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setInfoWindowAdapter(com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setInfoWindowAdapter(HuaweiMap.InfoWindowAdapter)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setInfoWindowAdapter(HuaweiMap.InfoWindowAdapter)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setInfoWindowAdapter(com.google.android.gms.maps.GoogleMap.InfoWindowAdapter): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setinfowindowadapter-googlemap.infowindowadapter-adapter">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setinfowindowadapter-googlemap.infowindowadapter-adapter</a><br/>
     *
     * @param param0 The adapter to use for info window contents, or null to use the default content rendering in info windows
     */
    public final void setInfoWindowAdapter(org.xms.g.maps.ExtensionMap.InfoWindowAdapter param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setInfoWindowAdapter(((param0) == null ? null : (param0.getHInstanceInfoWindowAdapter())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setInfoWindowAdapter(((param0) == null ? null : (param0.getHInstanceInfoWindowAdapter())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setInfoWindowAdapter(((param0) == null ? null : (param0.getGInstanceInfoWindowAdapter())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setInfoWindowAdapter(((param0) == null ? null : (param0.getGInstanceInfoWindowAdapter())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setLatLngBoundsForCameraTarget(org.xms.g.maps.model.LatLngBounds) Specifies a LatLngBounds to constrain the camera target, so that when users scroll and pan the map, the camera target does not move outside these bounds.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setLatLngBoundsForCameraTarget(com.huawei.hms.maps.model.LatLngBounds): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setLatLngBoundsForCameraTarget(LatLngBounds)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setLatLngBoundsForCameraTarget(LatLngBounds)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setLatLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setlatlngboundsforcameratarget-latlngbounds-bounds">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setlatlngboundsforcameratarget-latlngbounds-bounds</a><br/>
     *
     * @param param0 The bounds to constrain the camera target within
     */
    public final void setLatLngBoundsForCameraTarget(org.xms.g.maps.model.LatLngBounds param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setLatLngBoundsForCameraTarget(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setLatLngBoundsForCameraTarget(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setLatLngBoundsForCameraTarget(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setLatLngBoundsForCameraTarget(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setLocationSource(org.xms.g.maps.LocationSource) Sets the location source for the my-location layer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setLocationSource(com.huawei.hms.maps.LocationSource): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setLocationSource(LocationSource)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setLocationSource(LocationSource)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setLocationSource(com.google.android.gms.maps.LocationSource): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setlocationsource-locationsource-source">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setlocationsource-locationsource-source</a><br/>
     *
     * @param param0 A location source to use in the my-location layer. Set to null to use the default location source
     */
    public final void setLocationSource(org.xms.g.maps.LocationSource param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setLocationSource(((param0) == null ? null : (param0.getHInstanceLocationSource())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setLocationSource(((param0) == null ? null : (param0.getHInstanceLocationSource())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setLocationSource(((param0) == null ? null : (param0.getGInstanceLocationSource())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setLocationSource(((param0) == null ? null : (param0.getGInstanceLocationSource())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setMapStyle(org.xms.g.maps.model.MapStyleOptions) Sets the styling of the base map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setMapStyle(com.huawei.hms.maps.model.MapStyleOptions): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMapStyle(MapStyleOptions)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMapStyle(MapStyleOptions)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setMapStyle(com.google.android.gms.maps.model.MapStyleOptions): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-setmapstyle-mapstyleoptions-style">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-boolean-setmapstyle-mapstyleoptions-style</a><br/>
     *
     * @param param0 maps model MapStyleOptions
     * @return true if the style was successfully parsed; false if problems were detected with the MapStyleOptions, including, e.g. unparsable styling JSON, unrecognized feature type, unrecognized element type, or invalid styler keys. If the return value is false, the current style is left unchanged
     */
    public final boolean setMapStyle(org.xms.g.maps.model.MapStyleOptions param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMapStyle(((com.huawei.hms.maps.model.MapStyleOptions) ((param0) == null ? null : (param0.getHInstance()))))");
            return ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMapStyle(((com.huawei.hms.maps.model.MapStyleOptions) ((param0) == null ? null : (param0.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMapStyle(((com.google.android.gms.maps.model.MapStyleOptions) ((param0) == null ? null : (param0.getGInstance()))))");
            return ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMapStyle(((com.google.android.gms.maps.model.MapStyleOptions) ((param0) == null ? null : (param0.getGInstance()))));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setMaxZoomPreference(float) Sets a preferred upper bound for the camera zoom.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setMaxZoomPreference(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMaxZoomPreference(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMaxZoomPreference(float)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setMaxZoomPreference(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setmaxzoompreference-float-maxzoompreference">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setmaxzoompreference-float-maxzoompreference</a><br/>
     *
     * @param param0 The preferred upper bound
     */
    public final void setMaxZoomPreference(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMaxZoomPreference(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMaxZoomPreference(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMaxZoomPreference(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMaxZoomPreference(param0);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setMinZoomPreference(float) Sets a preferred lower bound for the camera zoom.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setMinZoomPreference(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMinZoomPreference(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setMinZoomPreference(float)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setMinZoomPreference(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setminzoompreference-float-minzoompreference">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setminzoompreference-float-minzoompreference</a><br/>
     *
     * @param param0 The preferred lower bound
     */
    public final void setMinZoomPreference(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMinZoomPreference(param0)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setMinZoomPreference(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMinZoomPreference(param0)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setMinZoomPreference(param0);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void setOnCameraChangeListener(org.xms.g.maps.ExtensionMap.OnCameraChangeListener param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnCameraIdleListener(org.xms.g.maps.ExtensionMap.OnCameraIdleListener) Sets a callback that is invoked when camera movement has ended.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnCameraIdleListener(com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCameraIdleListener(HuaweiMap.OnCameraIdleListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCameraIdleListener(HuaweiMap.OnCameraIdleListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnCameraIdleListener(com.google.android.gms.maps.GoogleMap.OnCameraIdleListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncameraidlelistener-googlemap.oncameraidlelistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncameraidlelistener-googlemap.oncameraidlelistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked. To unset the callback, use null
     */
    public final void setOnCameraIdleListener(org.xms.g.maps.ExtensionMap.OnCameraIdleListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraIdleListener(((param0) == null ? null : (param0.getHInstanceOnCameraIdleListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraIdleListener(((param0) == null ? null : (param0.getHInstanceOnCameraIdleListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraIdleListener(((param0) == null ? null : (param0.getGInstanceOnCameraIdleListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraIdleListener(((param0) == null ? null : (param0.getGInstanceOnCameraIdleListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnCameraMoveCanceledListener(org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener) Sets a callback that is invoked when camera motion is stopped or interrupted by a new type of animation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnCameraMoveCanceledListener(com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCameraMoveCanceledListener(HuaweiMap.OnCameraMoveCanceledListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCameraMoveCanceledListener(HuaweiMap.OnCameraMoveCanceledListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnCameraMoveCanceledListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncameramovecanceledlistener-googlemap.oncameramovecanceledlistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncameramovecanceledlistener-googlemap.oncameramovecanceledlistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked. To unset the callback, use null. Do not update or animate the camera from within onCameraMoveCanceled()
     */
    public final void setOnCameraMoveCanceledListener(org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveCanceledListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveCanceledListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveCanceledListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveCanceledListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveCanceledListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveCanceledListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveCanceledListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveCanceledListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnCameraMoveListener(org.xms.g.maps.ExtensionMap.OnCameraMoveListener) Sets a callback that is invoked repeatedly while the camera is in motion. The callback may be invoked as often as once every frame and should not perform expensive operations.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnCameraMoveListener(com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCameraMoveListener(final%20HuaweiMap.OnCameraMoveListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCameraMoveListener(final%20HuaweiMap.OnCameraMoveListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnCameraMoveListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncameramovelistener-googlemap.oncameramovelistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncameramovelistener-googlemap.oncameramovelistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked. To unset the callback, use null
     */
    public final void setOnCameraMoveListener(org.xms.g.maps.ExtensionMap.OnCameraMoveListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnCameraMoveStartedListener(org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener) Sets a listener to listen for the beginning of camera movement or changes of the camera movement reason.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnCameraMoveStartedListener(com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCameraMoveStartedListener(HuaweiMap.OnCameraMoveStartedListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCameraMoveStartedListener(HuaweiMap.OnCameraMoveStartedListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnCameraMoveStartedListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncameramovestartedlistener-googlemap.oncameramovestartedlistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncameramovestartedlistener-googlemap.oncameramovestartedlistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked. To unset the callback, use null. Do not update or animate the camera from within onCameraMoveStarted()
     */
    public final void setOnCameraMoveStartedListener(org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveStartedListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveStartedListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCameraMoveStartedListener(((param0) == null ? null : (param0.getHInstanceOnCameraMoveStartedListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveStartedListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveStartedListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCameraMoveStartedListener(((param0) == null ? null : (param0.getGInstanceOnCameraMoveStartedListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnCircleClickListener(org.xms.g.maps.ExtensionMap.OnCircleClickListener) Sets a callback that's invoked when a circle is clicked.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnCircleClickListener(com.huawei.hms.maps.HuaweiMap.OnCircleClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCircleClickListener(HuaweiMap.OnCircleClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnCircleClickListener(HuaweiMap.OnCircleClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnCircleClickListener(com.google.android.gms.maps.GoogleMap.OnCircleClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncircleclicklistener-googlemap.oncircleclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoncircleclicklistener-googlemap.oncircleclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when a circle is clicked. To unset the callback, use null
     */
    public final void setOnCircleClickListener(org.xms.g.maps.ExtensionMap.OnCircleClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCircleClickListener(((param0) == null ? null : (param0.getHInstanceOnCircleClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnCircleClickListener(((param0) == null ? null : (param0.getHInstanceOnCircleClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCircleClickListener(((param0) == null ? null : (param0.getGInstanceOnCircleClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnCircleClickListener(((param0) == null ? null : (param0.getGInstanceOnCircleClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnGroundOverlayClickListener(org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener) Sets a callback that's invoked when a ground overlay is clicked.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnGroundOverlayClickListener(com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnGroundOverlayClickListener(HuaweiMap.OnGroundOverlayClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnGroundOverlayClickListener(HuaweiMap.OnGroundOverlayClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnGroundOverlayClickListener(com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setongroundoverlayclicklistener-googlemap.ongroundoverlayclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setongroundoverlayclicklistener-googlemap.ongroundoverlayclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when a ground overlay is clicked. To unset the callback, use null
     */
    public final void setOnGroundOverlayClickListener(org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnGroundOverlayClickListener(((param0) == null ? null : (param0.getHInstanceOnGroundOverlayClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnGroundOverlayClickListener(((param0) == null ? null : (param0.getHInstanceOnGroundOverlayClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnGroundOverlayClickListener(((param0) == null ? null : (param0.getGInstanceOnGroundOverlayClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnGroundOverlayClickListener(((param0) == null ? null : (param0.getGInstanceOnGroundOverlayClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnIndoorStateChangeListener(org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener) Sets or clears the listener for indoor events. Only one listener can ever be set. Setting a new listener will remove the previous listener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnIndoorStateChangeListener(com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener)
     * com.google.android.gms.maps.GoogleMap.setOnIndoorStateChangeListener(com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonindoorstatechangelistener-googlemap.onindoorstatechangelistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonindoorstatechangelistener-googlemap.onindoorstatechangelistener-listener</a><br/>
     *
     * @param param0 the listener for indoor events if non-null; otherwise, clears the listener
     */
    public final void setOnIndoorStateChangeListener(org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnIndoorStateChangeListener(((param0) == null ? null : (param0.getHInstanceOnIndoorStateChangeListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnIndoorStateChangeListener(((param0) == null ? null : (param0.getHInstanceOnIndoorStateChangeListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnIndoorStateChangeListener(((param0) == null ? null : (param0.getGInstanceOnIndoorStateChangeListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnIndoorStateChangeListener(((param0) == null ? null : (param0.getGInstanceOnIndoorStateChangeListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnInfoWindowClickListener(org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener) Listener used to listen for tap events of an information window.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnInfoWindowClickListener(com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnInfoWindowClickListener(HuaweiMap.OnInfoWindowClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnInfoWindowClickListener(HuaweiMap.OnInfoWindowClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnInfoWindowClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoninfowindowclicklistener-googlemap.oninfowindowclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoninfowindowclicklistener-googlemap.oninfowindowclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when a marker info window is clicked. To unset the callback, use null
     */
    public final void setOnInfoWindowClickListener(org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowClickListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowClickListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowClickListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowClickListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnInfoWindowCloseListener(org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener) Sets a callback that's invoked when a marker's info window is closed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnInfoWindowCloseListener(com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnInfoWindowCloseListener(HuaweiMap.OnInfoWindowCloseListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnInfoWindowCloseListener(HuaweiMap.OnInfoWindowCloseListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnInfoWindowCloseListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoninfowindowcloselistener-googlemap.oninfowindowcloselistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoninfowindowcloselistener-googlemap.oninfowindowcloselistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when a marker's info window is closed. To unset the callback, use null
     */
    public final void setOnInfoWindowCloseListener(org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowCloseListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowCloseListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowCloseListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowCloseListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowCloseListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowCloseListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowCloseListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowCloseListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnInfoWindowLongClickListener(org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener) Sets a callback that's invoked when a marker's info window is long pressed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnInfoWindowLongClickListener(com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnInfoWindowLongClickListener(HuaweiMap.OnInfoWindowLongClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnInfoWindowLongClickListener(HuaweiMap.OnInfoWindowLongClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnInfoWindowLongClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoninfowindowlongclicklistener-googlemap.oninfowindowlongclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setoninfowindowlongclicklistener-googlemap.oninfowindowlongclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when a marker's info window is long pressed. To unset the callback, use null
     */
    public final void setOnInfoWindowLongClickListener(org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowLongClickListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowLongClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnInfoWindowLongClickListener(((param0) == null ? null : (param0.getHInstanceOnInfoWindowLongClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowLongClickListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowLongClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnInfoWindowLongClickListener(((param0) == null ? null : (param0.getGInstanceOnInfoWindowLongClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnMapClickListener(org.xms.g.maps.ExtensionMap.OnMapClickListener) Sets a listener to listen for tap events of a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnMapClickListener(com.huawei.hms.maps.HuaweiMap.OnMapClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMapClickListener(HuaweiMap.OnMapClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMapClickListener(HuaweiMap.OnMapClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnMapClickListener(com.google.android.gms.maps.GoogleMap.OnMapClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmapclicklistener-googlemap.onmapclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmapclicklistener-googlemap.onmapclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when the map is tapped. To unset the callback, use null
     */
    public final void setOnMapClickListener(org.xms.g.maps.ExtensionMap.OnMapClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapClickListener(((param0) == null ? null : (param0.getHInstanceOnMapClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapClickListener(((param0) == null ? null : (param0.getHInstanceOnMapClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapClickListener(((param0) == null ? null : (param0.getGInstanceOnMapClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapClickListener(((param0) == null ? null : (param0.getGInstanceOnMapClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnMapLoadedCallback(org.xms.g.maps.ExtensionMap.OnMapLoadedCallback) Sets a callback that's invoked when this map has finished rendering. The callback will only be invoked once.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnMapLoadedCallback(com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMapLoadedCallback(HuaweiMap.OnMapLoadedCallback)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMapLoadedCallback(HuaweiMap.OnMapLoadedCallback)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnMapLoadedCallback(com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmaploadedcallback-googlemap.onmaploadedcallback-callback">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmaploadedcallback-googlemap.onmaploadedcallback-callback</a><br/>
     *
     * @param param0 The callback invoked when the map has finished rendering. To unset the callback, use null
     */
    public final void setOnMapLoadedCallback(org.xms.g.maps.ExtensionMap.OnMapLoadedCallback param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapLoadedCallback(((param0) == null ? null : (param0.getHInstanceOnMapLoadedCallback())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapLoadedCallback(((param0) == null ? null : (param0.getHInstanceOnMapLoadedCallback())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapLoadedCallback(((param0) == null ? null : (param0.getGInstanceOnMapLoadedCallback())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapLoadedCallback(((param0) == null ? null : (param0.getGInstanceOnMapLoadedCallback())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnMapLongClickListener(org.xms.g.maps.ExtensionMap.OnMapLongClickListener) Sets a listener to listen for long press events of a map.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnMapLongClickListener(com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMapLongClickListener(HuaweiMap.OnMapLongClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMapLongClickListener(HuaweiMap.OnMapLongClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnMapLongClickListener(com.google.android.gms.maps.GoogleMap.OnMapLongClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmaplongclicklistener-googlemap.onmaplongclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmaplongclicklistener-googlemap.onmaplongclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when the map is long pressed. To unset the callback, use null
     */
    public final void setOnMapLongClickListener(org.xms.g.maps.ExtensionMap.OnMapLongClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapLongClickListener(((param0) == null ? null : (param0.getHInstanceOnMapLongClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMapLongClickListener(((param0) == null ? null : (param0.getHInstanceOnMapLongClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapLongClickListener(((param0) == null ? null : (param0.getGInstanceOnMapLongClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMapLongClickListener(((param0) == null ? null : (param0.getGInstanceOnMapLongClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnMarkerClickListener(org.xms.g.maps.ExtensionMap.OnMarkerClickListener) Sets a callback that's invoked when a marker is clicked.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnMarkerClickListener(com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMarkerClickListener(HuaweiMap.OnMarkerClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMarkerClickListener(HuaweiMap.OnMarkerClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnMarkerClickListener(com.google.android.gms.maps.GoogleMap.OnMarkerClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmarkerclicklistener-googlemap.onmarkerclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmarkerclicklistener-googlemap.onmarkerclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when a marker is clicked. To unset the callback, use null
     */
    public final void setOnMarkerClickListener(org.xms.g.maps.ExtensionMap.OnMarkerClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMarkerClickListener(((param0) == null ? null : (param0.getHInstanceOnMarkerClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMarkerClickListener(((param0) == null ? null : (param0.getHInstanceOnMarkerClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMarkerClickListener(((param0) == null ? null : (param0.getGInstanceOnMarkerClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMarkerClickListener(((param0) == null ? null : (param0.getGInstanceOnMarkerClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnMarkerDragListener(org.xms.g.maps.ExtensionMap.OnMarkerDragListener) Sets a listener to listen for drag events of a marker.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnMarkerDragListener(com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMarkerDragListener(HuaweiMap.OnMarkerDragListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMarkerDragListener(HuaweiMap.OnMarkerDragListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnMarkerDragListener(com.google.android.gms.maps.GoogleMap.OnMarkerDragListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmarkerdraglistener-googlemap.onmarkerdraglistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmarkerdraglistener-googlemap.onmarkerdraglistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked on marker drag events. To unset the callback, use null
     */
    public final void setOnMarkerDragListener(org.xms.g.maps.ExtensionMap.OnMarkerDragListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMarkerDragListener(((param0) == null ? null : (param0.getHInstanceOnMarkerDragListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMarkerDragListener(((param0) == null ? null : (param0.getHInstanceOnMarkerDragListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMarkerDragListener(((param0) == null ? null : (param0.getGInstanceOnMarkerDragListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMarkerDragListener(((param0) == null ? null : (param0.getGInstanceOnMarkerDragListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnMyLocationButtonClickListener(org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener) Sets a callback that's invoked when the my location button is clicked.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnMyLocationButtonClickListener(com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMyLocationButtonClickListener(HuaweiMap.OnMyLocationButtonClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMyLocationButtonClickListener(HuaweiMap.OnMyLocationButtonClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnMyLocationButtonClickListener(com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmylocationbuttonclicklistener-googlemap.onmylocationbuttonclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmylocationbuttonclicklistener-googlemap.onmylocationbuttonclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when the My Location button is clicked
     */
    public final void setOnMyLocationButtonClickListener(org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMyLocationButtonClickListener(((param0) == null ? null : (param0.getHInstanceOnMyLocationButtonClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMyLocationButtonClickListener(((param0) == null ? null : (param0.getHInstanceOnMyLocationButtonClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMyLocationButtonClickListener(((param0) == null ? null : (param0.getGInstanceOnMyLocationButtonClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMyLocationButtonClickListener(((param0) == null ? null : (param0.getGInstanceOnMyLocationButtonClickListener())));
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void setOnMyLocationChangeListener(org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnMyLocationClickListener(org.xms.g.maps.ExtensionMap.OnMyLocationClickListener) Sets a callback that's invoked when the My Location dot(which signifies the user's location)is clicked.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnMyLocationClickListener(com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMyLocationClickListener(HuaweiMap.OnMyLocationClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnMyLocationClickListener(HuaweiMap.OnMyLocationClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnMyLocationClickListener(com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmylocationclicklistener-googlemap.onmylocationclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonmylocationclicklistener-googlemap.onmylocationclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when the My Location dot is clicked
     */
    public final void setOnMyLocationClickListener(org.xms.g.maps.ExtensionMap.OnMyLocationClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMyLocationClickListener(((param0) == null ? null : (param0.getHInstanceOnMyLocationClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnMyLocationClickListener(((param0) == null ? null : (param0.getHInstanceOnMyLocationClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMyLocationClickListener(((param0) == null ? null : (param0.getGInstanceOnMyLocationClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnMyLocationClickListener(((param0) == null ? null : (param0.getGInstanceOnMyLocationClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnPoiClickListener(org.xms.g.maps.ExtensionMap.OnPoiClickListener) Sets a listener to listen for tap events of a POI.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnPoiClickListener(com.huawei.hms.maps.HuaweiMap.OnPoiClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnPoiClickListener(HuaweiMap.OnPoiClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnPoiClickListener(HuaweiMap.OnPoiClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnPoiClickListener(com.google.android.gms.maps.GoogleMap.OnPoiClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonpoiclicklistener-googlemap.onpoiclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonpoiclicklistener-googlemap.onpoiclicklistener-listener</a><br/>
     *
     * @param param0 this param is ExtensionMap OnPoiClickListener
     */
    public final void setOnPoiClickListener(org.xms.g.maps.ExtensionMap.OnPoiClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPoiClickListener(((param0) == null ? null : (param0.getHInstanceOnPoiClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPoiClickListener(((param0) == null ? null : (param0.getHInstanceOnPoiClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPoiClickListener(((param0) == null ? null : (param0.getGInstanceOnPoiClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPoiClickListener(((param0) == null ? null : (param0.getGInstanceOnPoiClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnPolygonClickListener(org.xms.g.maps.ExtensionMap.OnPolygonClickListener) Sets a listener to listen for tap events of a polygon.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnPolygonClickListener(com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnPolygonClickListener(HuaweiMap.OnPolygonClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnPolygonClickListener(HuaweiMap.OnPolygonClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnPolygonClickListener(com.google.android.gms.maps.GoogleMap.OnPolygonClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonpolygonclicklistener-googlemap.onpolygonclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonpolygonclicklistener-googlemap.onpolygonclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when a polygon is clicked. To unset the callback, use null
     */
    public final void setOnPolygonClickListener(org.xms.g.maps.ExtensionMap.OnPolygonClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPolygonClickListener(((param0) == null ? null : (param0.getHInstanceOnPolygonClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPolygonClickListener(((param0) == null ? null : (param0.getHInstanceOnPolygonClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPolygonClickListener(((param0) == null ? null : (param0.getGInstanceOnPolygonClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPolygonClickListener(((param0) == null ? null : (param0.getGInstanceOnPolygonClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setOnPolylineClickListener(org.xms.g.maps.ExtensionMap.OnPolylineClickListener) Sets a callback that's invoked when a polyline is clicked.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setOnPolylineClickListener(com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnPolylineClickListener(HuaweiMap.OnPolylineClickListener)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setOnPolylineClickListener(HuaweiMap.OnPolylineClickListener)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setOnPolylineClickListener(com.google.android.gms.maps.GoogleMap.OnPolylineClickListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonpolylineclicklistener-googlemap.onpolylineclicklistener-listener">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setonpolylineclicklistener-googlemap.onpolylineclicklistener-listener</a><br/>
     *
     * @param param0 The callback that's invoked when a polyline is clicked. To unset the callback, use null
     */
    public final void setOnPolylineClickListener(org.xms.g.maps.ExtensionMap.OnPolylineClickListener param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPolylineClickListener(((param0) == null ? null : (param0.getHInstanceOnPolylineClickListener())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setOnPolylineClickListener(((param0) == null ? null : (param0.getHInstanceOnPolylineClickListener())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPolylineClickListener(((param0) == null ? null : (param0.getGInstanceOnPolylineClickListener())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setOnPolylineClickListener(((param0) == null ? null : (param0.getGInstanceOnPolylineClickListener())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.setPadding(int,int,int,int) Sets padding on a map. You can call this method to define the visible region on a map so that a signal can be sent to the map indicating that some portions around the map edges may be obscured. For example, icons such as the zoom controls and compass will be moved to adapt to the visible region, and the camera will move in relative to the center of the visible region.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.setPadding(int,int,int,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setPadding(int,int,int,int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#setPadding(int,int,int,int)</a><br/>
     * com.google.android.gms.maps.GoogleMap.setPadding(int,int,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setpadding-int-left,-int-top,-int-right,-int-bottom">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-setpadding-int-left,-int-top,-int-right,-int-bottom</a><br/>
     *
     * @param param0 the number of pixels of padding to be added on the top of the map
     * @param param1 the number of pixels of padding to be added on the left of the map
     * @param param2 the number of pixels of padding to be added on the bottom of the map
     * @param param3 the number of pixels of padding to be added on the right of the map
     */
    public final void setPadding(int param0, int param1, int param2, int param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setPadding(param0, param1, param2, param3)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).setPadding(param0, param1, param2, param3);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setPadding(param0, param1, param2, param3)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).setPadding(param0, param1, param2, param3);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.snapshot(org.xms.g.maps.ExtensionMap.SnapshotReadyCallback,android.graphics.Bitmap) Takes a snapshot of a map. This method is equivalent to snapshot(SnapshotReadyCallback), but allows you to provide a pre-allocated bitmap image. If the bitmap image does not match the current map size, another bitmap image matching the size will be allocated. In most cases, the object transferred by the callback method is the same as that provided in the parameter of this method. However, in some cases, the object provided in this method may not be used(for example, if the size of the view has changed at the time when the snapshot is actually taken). Therefore, you should trust only the bitmap image transferred by the callback method.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.snapshot(com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback,android.graphics.Bitmap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#snapshot(HuaweiMap.SnapshotReadyCallback,Bitmap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#snapshot(HuaweiMap.SnapshotReadyCallback,Bitmap)</a><br/>
     * com.google.android.gms.maps.GoogleMap.snapshot(com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback,android.graphics.Bitmap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-snapshot-googlemap.snapshotreadycallback-callback">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-snapshot-googlemap.snapshotreadycallback-callback</a><br/>
     *
     * @param param0 this param is ExtensionMap SnapshotReadyCallback
     * @param param1 this param is android graphics Bitmap
     */
    public final void snapshot(org.xms.g.maps.ExtensionMap.SnapshotReadyCallback param0, android.graphics.Bitmap param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).snapshot(((param0) == null ? null : (param0.getHInstanceSnapshotReadyCallback())), param1)");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).snapshot(((param0) == null ? null : (param0.getHInstanceSnapshotReadyCallback())), param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).snapshot(((param0) == null ? null : (param0.getGInstanceSnapshotReadyCallback())), param1)");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).snapshot(((param0) == null ? null : (param0.getGInstanceSnapshotReadyCallback())), param1);
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.snapshot(org.xms.g.maps.ExtensionMap.SnapshotReadyCallback) Takes a snapshot of a map. If an interactive map is difficult or impossible to use, you can use snapshots in your app. For example, you can call the snapshot()method to generate images and use them to display a thumbnail of the map in your app, or display a snapshot in the notification center.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.snapshot(com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#snapshot(HuaweiMap.SnapshotReadyCallback)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#snapshot(HuaweiMap.SnapshotReadyCallback)</a><br/>
     * com.google.android.gms.maps.GoogleMap.snapshot(com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-snapshot-googlemap.snapshotreadycallback-callback">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-snapshot-googlemap.snapshotreadycallback-callback</a><br/>
     *
     * @param param0 Callback method invoked when the snapshot is taken
     */
    public final void snapshot(org.xms.g.maps.ExtensionMap.SnapshotReadyCallback param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).snapshot(((param0) == null ? null : (param0.getHInstanceSnapshotReadyCallback())))");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).snapshot(((param0) == null ? null : (param0.getHInstanceSnapshotReadyCallback())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).snapshot(((param0) == null ? null : (param0.getGInstanceSnapshotReadyCallback())))");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).snapshot(((param0) == null ? null : (param0.getGInstanceSnapshotReadyCallback())));
        }
    }

    /**
     * org.xms.g.maps.ExtensionMap.stopAnimation() Stops the camera animation if there is one in progress. When the method is called, the camera stops moving immediately and remains in that position.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.HuaweiMap.stopAnimation(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#stopAnimation()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimap#stopAnimation()</a><br/>
     * com.google.android.gms.maps.GoogleMap.stopAnimation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-stopanimation">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap#public-void-stopanimation</a><br/>
     */
    public final void stopAnimation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).stopAnimation()");
            ((com.huawei.hms.maps.HuaweiMap) this.getHInstance()).stopAnimation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap) this.getGInstance()).stopAnimation()");
            ((com.google.android.gms.maps.GoogleMap) this.getGInstance()).stopAnimation();
        }
    }

    /**
     * A callback interface for reporting when a task is complete or canceled.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.CancelableCallback and com.google.android.gms.maps.GoogleMap.CancelableCallback.<br/>
     * com.huawei.hms.maps.HuaweiMap.CancelableCallback: An internal API of the HuaweiMap class. The API contains two abstract methods: onCancel() and onFinish().<br/>
     * com.google.android.gms.maps.GoogleMap.CancelableCallback: A callback interface for reporting when a task is complete or canceled.<br/>
     */
    public static interface CancelableCallback extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.CancelableCallback.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.CancelableCallback.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap CancelableCallback object
         */
        public static org.xms.g.maps.ExtensionMap.CancelableCallback dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.CancelableCallback) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.CancelableCallback.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.CancelableCallback;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.CancelableCallback;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.CancelableCallback;
        }

        /**
         * org.xms.g.maps.ExtensionMap.CancelableCallback.onCancel() Invoked when a task is canceled.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.CancelableCallback.onCancel(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapcancelablec#onCancel()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapcancelablec#onCancel()</a><br/>
         * com.google.android.gms.maps.GoogleMap.CancelableCallback.onCancel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.CancelableCallback#public-abstract-void-oncancel">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.CancelableCallback#public-abstract-void-oncancel</a><br/>
         */
        public void onCancel();

        /**
         * org.xms.g.maps.ExtensionMap.CancelableCallback.onFinish() Invoked when a task is complete.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.CancelableCallback.onFinish(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapcancelablec#onFinish()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapcancelablec#onFinish()</a><br/>
         * com.google.android.gms.maps.GoogleMap.CancelableCallback.onFinish(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.CancelableCallback#public-abstract-void-onfinish">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.CancelableCallback#public-abstract-void-onfinish</a><br/>
         */
        public void onFinish();

        default java.lang.Object getZInstanceCancelableCallback() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceCancelableCallback();
            } else {
                return getGInstanceCancelableCallback();
            }
        }

        default com.google.android.gms.maps.GoogleMap.CancelableCallback getGInstanceCancelableCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.CancelableCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.CancelableCallback() {

                public void onCancel() {
                    org.xms.g.maps.ExtensionMap.CancelableCallback.this.onCancel();
                }

                public void onFinish() {
                    org.xms.g.maps.ExtensionMap.CancelableCallback.this.onFinish();
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.CancelableCallback getHInstanceCancelableCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.CancelableCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.CancelableCallback() {

                public void onCancel() {
                    org.xms.g.maps.ExtensionMap.CancelableCallback.this.onCancel();
                }

                public void onFinish() {
                    org.xms.g.maps.ExtensionMap.CancelableCallback.this.onFinish();
                }
            };
        }

        /**
         * A callback interface for reporting when a task is complete or canceled.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.CancelableCallback: A callback interface for reporting when a task is complete or canceled.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.CancelableCallback {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.CancelableCallback.XImpl.onCancel() Invoked when a task is canceled.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.CancelableCallback.onCancel(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapcancelablec#onCancel()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapcancelablec#onCancel()</a><br/>
             * com.google.android.gms.maps.GoogleMap.CancelableCallback.onCancel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.CancelableCallback#public-abstract-void-oncancel">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.CancelableCallback#public-abstract-void-oncancel</a><br/>
             */
            public void onCancel() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.CancelableCallback) this.getHInstance()).onCancel()");
                    ((com.huawei.hms.maps.HuaweiMap.CancelableCallback) this.getHInstance()).onCancel();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.CancelableCallback) this.getGInstance()).onCancel()");
                    ((com.google.android.gms.maps.GoogleMap.CancelableCallback) this.getGInstance()).onCancel();
                }
            }

            /**
             * org.xms.g.maps.ExtensionMap.CancelableCallback.XImpl.onFinish() Invoked when a task is complete.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.CancelableCallback.onFinish(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapcancelablec#onFinish()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapcancelablec#onFinish()</a><br/>
             * com.google.android.gms.maps.GoogleMap.CancelableCallback.onFinish(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.CancelableCallback#public-abstract-void-onfinish">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.CancelableCallback#public-abstract-void-onfinish</a><br/>
             */
            public void onFinish() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.CancelableCallback) this.getHInstance()).onFinish()");
                    ((com.huawei.hms.maps.HuaweiMap.CancelableCallback) this.getHInstance()).onFinish();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.CancelableCallback) this.getGInstance()).onFinish()");
                    ((com.google.android.gms.maps.GoogleMap.CancelableCallback) this.getGInstance()).onFinish();
                }
            }
        }
    }

    /**
     * Provides views for customized rendering of info windows.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter and com.google.android.gms.maps.GoogleMap.InfoWindowAdapter.<br/>
     * com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter: An internal API of the HuaweiMap class.<br/>
     * com.google.android.gms.maps.GoogleMap.InfoWindowAdapter: Provides views for customized rendering of info windows.<br/>
     */
    public static interface InfoWindowAdapter extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.InfoWindowAdapter.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.InfoWindowAdapter.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap InfoWindowAdapter object
         */
        public static org.xms.g.maps.ExtensionMap.InfoWindowAdapter dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.InfoWindowAdapter) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.InfoWindowAdapter.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.InfoWindowAdapter;
        }

        /**
         * org.xms.g.maps.ExtensionMap.InfoWindowAdapter.getInfoContents(org.xms.g.maps.model.Marker) Provides custom content for the default information window of a marker. This method is called only when getInfoWindow(Marker)returns null for the first time. If this method returns a view, it will be placed in the default information window. If you change the view after this method is called, the changes may not be presented in the displayed information window. If this method returns null, the default information window is displayed.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter.getInfoContents(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapinfowindowa#getInfoContents(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapinfowindowa#getInfoContents(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.InfoWindowAdapter.getInfoContents(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.InfoWindowAdapter#public-abstract-view-getinfocontents-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.InfoWindowAdapter#public-abstract-view-getinfocontents-marker-marker</a><br/>
         *
         * @param param0 this param is Marker
         * @return android view View return object is android view View
         */
        public android.view.View getInfoContents(org.xms.g.maps.model.Marker param0);

        /**
         * org.xms.g.maps.ExtensionMap.InfoWindowAdapter.getInfoWindow(org.xms.g.maps.model.Marker) Provides a custom info window for a marker.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter.getInfoWindow(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapinfowindowa#getInfoWindow(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapinfowindowa#getInfoWindow(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.InfoWindowAdapter.getInfoWindow(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.InfoWindowAdapter#public-abstract-view-getinfowindow-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.InfoWindowAdapter#public-abstract-view-getinfowindow-marker-marker</a><br/>
         *
         * @param param0 this param is Marker
         * @return android view View return object is android view View
         */
        public android.view.View getInfoWindow(org.xms.g.maps.model.Marker param0);

        default java.lang.Object getZInstanceInfoWindowAdapter() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceInfoWindowAdapter();
            } else {
                return getGInstanceInfoWindowAdapter();
            }
        }

        default com.google.android.gms.maps.GoogleMap.InfoWindowAdapter getGInstanceInfoWindowAdapter() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.InfoWindowAdapter() {

                public android.view.View getInfoContents(com.google.android.gms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.InfoWindowAdapter.this.getInfoContents(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }

                public android.view.View getInfoWindow(com.google.android.gms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.InfoWindowAdapter.this.getInfoWindow(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter getHInstanceInfoWindowAdapter() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter() {

                public android.view.View getInfoContents(com.huawei.hms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.InfoWindowAdapter.this.getInfoContents(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }

                public android.view.View getInfoWindow(com.huawei.hms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.InfoWindowAdapter.this.getInfoWindow(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Provides views for customized rendering of info windows.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.InfoWindowAdapter: Provides views for customized rendering of info windows.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.InfoWindowAdapter {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.InfoWindowAdapter.XImpl.getInfoContents(org.xms.g.maps.model.Marker) Provides custom content for the default information window of a marker. This method is called only when getInfoWindow(Marker)returns null for the first time. If this method returns a view, it will be placed in the default information window. If you change the view after this method is called, the changes may not be presented in the displayed information window. If this method returns null, the default information window is displayed.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter.getInfoContents(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapinfowindowa#getInfoContents(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapinfowindowa#getInfoContents(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.InfoWindowAdapter.getInfoWindow(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.InfoWindowAdapter#public-abstract-view-getinfocontents-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.InfoWindowAdapter#public-abstract-view-getinfocontents-marker-marker</a><br/>
             *
             * @param param0 this param is Marker
             * @return android view View return object is android view View
             */
            public android.view.View getInfoContents(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) this.getHInstance()).getInfoContents(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    return ((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) this.getHInstance()).getInfoContents(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) this.getGInstance()).getInfoContents(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    return ((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) this.getGInstance()).getInfoContents(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }

            /**
             * org.xms.g.maps.ExtensionMap.InfoWindowAdapter.XImpl.getInfoWindow(org.xms.g.maps.model.Marker) Provides a custom info window for a marker.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter.getInfoWindow(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapinfowindowa#getInfoWindow(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimapinfowindowa#getInfoWindow(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.InfoWindowAdapter.getInfoWindow(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.InfoWindowAdapter#public-abstract-view-getinfowindow-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.InfoWindowAdapter#public-abstract-view-getinfowindow-marker-marker</a><br/>
             *
             * @param param0 this param is Marker
             * @return android view View return object is android view View
             */
            public android.view.View getInfoWindow(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) this.getHInstance()).getInfoWindow(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    return ((com.huawei.hms.maps.HuaweiMap.InfoWindowAdapter) this.getHInstance()).getInfoWindow(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) this.getGInstance()).getInfoWindow(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    return ((com.google.android.gms.maps.GoogleMap.InfoWindowAdapter) this.getGInstance()).getInfoWindow(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * An internal API of the Map class.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.maps.GoogleMap.OnCameraChangeListener: An internal API of the GoogleMap class. The API contains the abstract method onCameraIdle().<br/>
     */
    public static interface OnCameraChangeListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraChangeListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnCameraChangeListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnCameraChangeListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnCameraChangeListener dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraChangeListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public void onCameraChange(org.xms.g.maps.model.CameraPosition param0);

        default java.lang.Object getZInstanceOnCameraChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        default com.google.android.gms.maps.GoogleMap.OnCameraChangeListener getGInstanceOnCameraChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        default java.lang.Object getHInstanceOnCameraChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * An internal API of the Map class.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraChangeListener: An internal API of the Map class.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraChangeListener {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public void onCameraChange(org.xms.g.maps.model.CameraPosition param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }

    /**
     * Callback interface for when camera movement has ended.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener and com.google.android.gms.maps.GoogleMap.OnCameraIdleListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener: An internal API of the HuaweiMap class. The API contains the abstract method onCameraIdle().<br/>
     * com.google.android.gms.maps.GoogleMap.OnCameraIdleListener: Callback interface for when camera movement has ended.<br/>
     */
    public static interface OnCameraIdleListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraIdleListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnCameraIdleListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnCameraIdleListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnCameraIdleListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnCameraIdleListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraIdleListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCameraIdleListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraIdleListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraIdleListener.onCameraIdle() Called when camera movement has ended, there are no pending animations and the user has stopped interacting with the map.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener.onCameraIdle(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimaponcameraidlel#onCameraIdle()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimaponcameraidlel#onCameraIdle()</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraIdleListener.onCameraIdle(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraIdleListener#public-abstract-void-oncameraidle">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraIdleListener#public-abstract-void-oncameraidle</a><br/>
         */
        public void onCameraIdle();

        default java.lang.Object getZInstanceOnCameraIdleListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnCameraIdleListener();
            } else {
                return getGInstanceOnCameraIdleListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnCameraIdleListener getGInstanceOnCameraIdleListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCameraIdleListener() {

                public void onCameraIdle() {
                    org.xms.g.maps.ExtensionMap.OnCameraIdleListener.this.onCameraIdle();
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener getHInstanceOnCameraIdleListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener() {

                public void onCameraIdle() {
                    org.xms.g.maps.ExtensionMap.OnCameraIdleListener.this.onCameraIdle();
                }
            };
        }

        /**
         * Callback interface for when camera movement has ended.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraIdleListener: Callback interface for when camera movement has ended.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraIdleListener {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnCameraIdleListener.XImpl.onCameraIdle() Called when camera movement has ended, there are no pending animations and the user has stopped interacting with the map.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener.onCameraIdle(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimaponcameraidlel#onCameraIdle()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-huaweimaponcameraidlel#onCameraIdle()</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnCameraIdleListener.onCameraIdle(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraIdleListener#public-abstract-void-oncameraidle">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraIdleListener#public-abstract-void-oncameraidle</a><br/>
             */
            public void onCameraIdle() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener) this.getHInstance()).onCameraIdle()");
                    ((com.huawei.hms.maps.HuaweiMap.OnCameraIdleListener) this.getHInstance()).onCameraIdle();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) this.getGInstance()).onCameraIdle()");
                    ((com.google.android.gms.maps.GoogleMap.OnCameraIdleListener) this.getGInstance()).onCameraIdle();
                }
            }
        }
    }

    /**
     * Callback interface for when the camera's motion has been stopped or when the camera starts moving for a new reason.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener and com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener: An internal API of the HuaweiMap class. The API contains the abstract method onCameraMoveCanceled().<br/>
     * com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener: Callback interface for when the camera's motion has been stopped or when the camera starts moving for a new reason.<br/>
     */
    public static interface OnCameraMoveCanceledListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnCameraMoveCanceledListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.onCameraMoveCanceled() Called when the stopAnimation()method is explicitly called or when the camera movement reason changes when the onCameraIdle()method has an opportunity to be called for the previous animation. Do not update the camera position in this method. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener.onCameraMoveCanceled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovecanceledl#onCameraMoveCanceled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovecanceledl#onCameraMoveCanceled()</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener.onCameraMoveCanceled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveCanceledListener#public-abstract-void-oncameramovecanceled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveCanceledListener#public-abstract-void-oncameramovecanceled</a><br/>
         */
        public void onCameraMoveCanceled();

        default java.lang.Object getZInstanceOnCameraMoveCanceledListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnCameraMoveCanceledListener();
            } else {
                return getGInstanceOnCameraMoveCanceledListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener getGInstanceOnCameraMoveCanceledListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener() {

                public void onCameraMoveCanceled() {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.this.onCameraMoveCanceled();
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener getHInstanceOnCameraMoveCanceledListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener() {

                public void onCameraMoveCanceled() {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.this.onCameraMoveCanceled();
                }
            };
        }

        /**
         * Callback interface for when the camera's motion has been stopped or when the camera starts moving for a new reason.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener: Callback interface for when the camera's motion has been stopped or when the camera starts moving for a new reason.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnCameraMoveCanceledListener.XImpl.onCameraMoveCanceled() Called when the stopAnimation()method is explicitly called or when the camera movement reason changes when the onCameraIdle()method has an opportunity to be called for the previous animation. Do not update the camera position in this method. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener.onCameraMoveCanceled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovecanceledl#onCameraMoveCanceled()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovecanceledl#onCameraMoveCanceled()</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener.onCameraMoveCanceled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveCanceledListener#public-abstract-void-oncameramovecanceled">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveCanceledListener#public-abstract-void-oncameramovecanceled</a><br/>
             */
            public void onCameraMoveCanceled() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener) this.getHInstance()).onCameraMoveCanceled()");
                    ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveCanceledListener) this.getHInstance()).onCameraMoveCanceled();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener) this.getGInstance()).onCameraMoveCanceled()");
                    ((com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener) this.getGInstance()).onCameraMoveCanceled();
                }
            }
        }
    }

    /**
     * Callback interface for when the camera changes position.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener and com.google.android.gms.maps.GoogleMap.OnCameraMoveListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener: An internal API of the HuaweiMap class. The API contains the abstract method onCameraMove().<br/>
     * com.google.android.gms.maps.GoogleMap.OnCameraMoveListener: Callback interface for when the camera changes position.<br/>
     */
    public static interface OnCameraMoveListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnCameraMoveListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnCameraMoveListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnCameraMoveListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnCameraMoveListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCameraMoveListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveListener.onCameraMove() Called when the camera moves after the onCameraMoveStarted()method is called. This method may be called once per frame. Therefore, do not perform high-consumption operations. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener.onCameraMove(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovel#onCameraMove()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovel#onCameraMove()</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveListener.onCameraMove(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveListener#public-abstract-void-oncameramove">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveListener#public-abstract-void-oncameramove</a><br/>
         */
        public void onCameraMove();

        default java.lang.Object getZInstanceOnCameraMoveListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnCameraMoveListener();
            } else {
                return getGInstanceOnCameraMoveListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnCameraMoveListener getGInstanceOnCameraMoveListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCameraMoveListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCameraMoveListener() {

                public void onCameraMove() {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveListener.this.onCameraMove();
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener getHInstanceOnCameraMoveListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener() {

                public void onCameraMove() {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveListener.this.onCameraMove();
                }
            };
        }

        /**
         * Callback interface for when the camera changes position.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveListener: Callback interface for when the camera changes position.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraMoveListener {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnCameraMoveListener.XImpl.onCameraMove() Called when the camera moves after the onCameraMoveStarted()method is called. This method may be called once per frame. Therefore, do not perform high-consumption operations. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener.onCameraMove(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovel#onCameraMove()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovel#onCameraMove()</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnCameraMoveListener.onCameraMove(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveListener#public-abstract-void-oncameramove">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveListener#public-abstract-void-oncameramove</a><br/>
             */
            public void onCameraMove() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener) this.getHInstance()).onCameraMove()");
                    ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveListener) this.getHInstance()).onCameraMove();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCameraMoveListener) this.getGInstance()).onCameraMove()");
                    ((com.google.android.gms.maps.GoogleMap.OnCameraMoveListener) this.getGInstance()).onCameraMove();
                }
            }
        }
    }

    /**
     * Callback interface for when the camera motion starts.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener and com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener: An internal API of the HuaweiMap class. The API contains three public fields and the abstract method onCameraMoveStarted(int reason).<br/>
     * com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener: Callback interface for when the camera motion starts.<br/>
     */
    public static interface OnCameraMoveStartedListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.getREASON_API_ANIMATION() Non-gesture animation initiated in response to user actions.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_API_ANIMATION: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_API_ANIMATION: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-static-final-int-reason_api_animation">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-static-final-int-reason_api_animation</a><br/>
         *
         * @return int return object is int
         */
        public static int getREASON_API_ANIMATION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_API_ANIMATION");
                return com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_API_ANIMATION;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_API_ANIMATION");
                return com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_API_ANIMATION;
            }
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.getREASON_DEVELOPER_ANIMATION() Animation started by the developer.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-static-final-int-reason_developer_animation">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-static-final-int-reason_developer_animation</a><br/>
         *
         * @return int return object is int
         */
        public static int getREASON_DEVELOPER_ANIMATION() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION");
                return com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION");
                return com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_DEVELOPER_ANIMATION;
            }
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.getREASON_GESTURE() Camera motion initiated in response to user gestures on the map.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_GESTURE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_GESTURE: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-static-final-int-reason_gesture">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-static-final-int-reason_gesture</a><br/>
         *
         * @return int return object is int
         */
        public static int getREASON_GESTURE() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_GESTURE");
                return com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.REASON_GESTURE;
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_GESTURE");
                return com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.REASON_GESTURE;
            }
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnCameraMoveStartedListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.onCameraMoveStarted(int) Called when the camera starts moving or the camera movement reason changes. Do not update the camera position in this method. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.onCameraMoveStarted(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl#onCameraMoveStarted(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl#onCameraMoveStarted(int)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.onCameraMoveStarted(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-abstract-void-oncameramovestarted-int-reason">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-abstract-void-oncameramovestarted-int-reason</a><br/>
         *
         * @param param0 The reason for the camera change. Possible values: REASON_GESTURE: User gestures on the map. REASON_API_ANIMATION: Default animations resulting from user interaction. REASON_DEVELOPER_ANIMATION: Developer animations
         */
        public void onCameraMoveStarted(int param0);

        default java.lang.Object getZInstanceOnCameraMoveStartedListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnCameraMoveStartedListener();
            } else {
                return getGInstanceOnCameraMoveStartedListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener getGInstanceOnCameraMoveStartedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener() {

                public void onCameraMoveStarted(int param0) {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.this.onCameraMoveStarted(param0);
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener getHInstanceOnCameraMoveStartedListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener() {

                public void onCameraMoveStarted(int param0) {
                    org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.this.onCameraMoveStarted(param0);
                }
            };
        }

        /**
         * Callback interface for when the camera motion starts.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener: Callback interface for when the camera motion starts.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnCameraMoveStartedListener.XImpl.onCameraMoveStarted(int) Called when the camera starts moving or the camera movement reason changes. Do not update the camera position in this method. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener.onCameraMoveStarted(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl#onCameraMoveStarted(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncameramovestartedl#onCameraMoveStarted(int)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener.onCameraMoveStarted(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-abstract-void-oncameramovestarted-int-reason">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCameraMoveStartedListener#public-abstract-void-oncameramovestarted-int-reason</a><br/>
             *
             * @param param0 The reason for the camera change. Possible values: REASON_GESTURE: User gestures on the map. REASON_API_ANIMATION: Default animations resulting from user interaction. REASON_DEVELOPER_ANIMATION: Developer animations
             */
            public void onCameraMoveStarted(int param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener) this.getHInstance()).onCameraMoveStarted(param0)");
                    ((com.huawei.hms.maps.HuaweiMap.OnCameraMoveStartedListener) this.getHInstance()).onCameraMoveStarted(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener) this.getGInstance()).onCameraMoveStarted(param0)");
                    ((com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener) this.getGInstance()).onCameraMoveStarted(param0);
                }
            }
        }
    }

    /**
     * Callback interface for when a circle is clicked.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnCircleClickListener and com.google.android.gms.maps.GoogleMap.OnCircleClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnCircleClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onCircleClick(Circle circle).<br/>
     * com.google.android.gms.maps.GoogleMap.OnCircleClickListener: Callback interface for when a circle is clicked.<br/>
     */
    public static interface OnCircleClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnCircleClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnCircleClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnCircleClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnCircleClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnCircleClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCircleClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnCircleClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnCircleClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnCircleClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnCircleClickListener.onCircleClick(org.xms.g.maps.model.Circle) Called when a circle is tapped. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnCircleClickListener.onCircleClick(com.huawei.hms.maps.model.Circle): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncircleclickl#onCircleClick(Circle)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncircleclickl#onCircleClick(Circle)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnCircleClickListener.onCircleClick(com.google.android.gms.maps.model.Circle): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCircleClickListener#public-abstract-void-oncircleclick-circle-circle">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCircleClickListener#public-abstract-void-oncircleclick-circle-circle</a><br/>
         *
         * @param param0 The circle that is clicked
         */
        public void onCircleClick(org.xms.g.maps.model.Circle param0);

        default java.lang.Object getZInstanceOnCircleClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnCircleClickListener();
            } else {
                return getGInstanceOnCircleClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnCircleClickListener getGInstanceOnCircleClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnCircleClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnCircleClickListener() {

                public void onCircleClick(com.google.android.gms.maps.model.Circle param0) {
                    org.xms.g.maps.ExtensionMap.OnCircleClickListener.this.onCircleClick(((param0) == null ? null : (new org.xms.g.maps.model.Circle(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnCircleClickListener getHInstanceOnCircleClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnCircleClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnCircleClickListener() {

                public void onCircleClick(com.huawei.hms.maps.model.Circle param0) {
                    org.xms.g.maps.ExtensionMap.OnCircleClickListener.this.onCircleClick(((param0) == null ? null : (new org.xms.g.maps.model.Circle(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for when a circle is clicked.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnCircleClickListener: Callback interface for when a circle is clicked.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnCircleClickListener {

            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnCircleClickListener.XImpl.onCircleClick(org.xms.g.maps.model.Circle) Called when a circle is tapped. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnCircleClickListener.onCircleClick(com.huawei.hms.maps.model.Circle): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncircleclickl#onCircleClick(Circle)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oncircleclickl#onCircleClick(Circle)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnCircleClickListener.onCircleClick(com.google.android.gms.maps.model.Circle): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCircleClickListener#public-abstract-void-oncircleclick-circle-circle">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnCircleClickListener#public-abstract-void-oncircleclick-circle-circle</a><br/>
             *
             * @param param0 The circle that is clicked
             */
            public void onCircleClick(org.xms.g.maps.model.Circle param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnCircleClickListener) this.getHInstance()).onCircleClick(((com.huawei.hms.maps.model.Circle) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnCircleClickListener) this.getHInstance()).onCircleClick(((com.huawei.hms.maps.model.Circle) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnCircleClickListener) this.getGInstance()).onCircleClick(((com.google.android.gms.maps.model.Circle) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnCircleClickListener) this.getGInstance()).onCircleClick(((com.google.android.gms.maps.model.Circle) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when a ground overlay is clicked.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener and com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onGroundOverlayClick(GroundOverlay groundOverlay).<br/>
     * com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener: Callback interface for when a ground overlay is clicked.<br/>
     */
    public static interface OnGroundOverlayClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnGroundOverlayClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.onGroundOverlayClick(org.xms.g.maps.model.GroundOverlay) Called when a ground overlay is clicked.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener.onGroundOverlayClick(com.huawei.hms.maps.model.GroundOverlay): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-ongroundoverlayclickl#onGroundOverlayClick(GroundOverlay)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-ongroundoverlayclickl#onGroundOverlayClick(GroundOverlay)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener.onGroundOverlayClick(com.google.android.gms.maps.model.GroundOverlay): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnGroundOverlayClickListener#public-abstract-void-ongroundoverlayclick-groundoverlay-groundoverlay">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnGroundOverlayClickListener#public-abstract-void-ongroundoverlayclick-groundoverlay-groundoverlay</a><br/>
         *
         * @param param0 The ground overlay that is clicked
         */
        public void onGroundOverlayClick(org.xms.g.maps.model.GroundOverlay param0);

        default java.lang.Object getZInstanceOnGroundOverlayClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnGroundOverlayClickListener();
            } else {
                return getGInstanceOnGroundOverlayClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener getGInstanceOnGroundOverlayClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener() {

                public void onGroundOverlayClick(com.google.android.gms.maps.model.GroundOverlay param0) {
                    org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.this.onGroundOverlayClick(((param0) == null ? null : (new org.xms.g.maps.model.GroundOverlay(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener getHInstanceOnGroundOverlayClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener() {

                public void onGroundOverlayClick(com.huawei.hms.maps.model.GroundOverlay param0) {
                    org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.this.onGroundOverlayClick(((param0) == null ? null : (new org.xms.g.maps.model.GroundOverlay(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for when a ground overlay is clicked.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener: Callback interface for when a ground overlay is clicked.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnGroundOverlayClickListener.XImpl.onGroundOverlayClick(org.xms.g.maps.model.GroundOverlay) Called when a ground overlay is clicked.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener.onGroundOverlayClick(com.huawei.hms.maps.model.GroundOverlay): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-ongroundoverlayclickl#onGroundOverlayClick(GroundOverlay)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-ongroundoverlayclickl#onGroundOverlayClick(GroundOverlay)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener.onGroundOverlayClick(com.google.android.gms.maps.model.GroundOverlay): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnGroundOverlayClickListener#public-abstract-void-ongroundoverlayclick-groundoverlay-groundoverlay">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnGroundOverlayClickListener#public-abstract-void-ongroundoverlayclick-groundoverlay-groundoverlay</a><br/>
             *
             * @param param0 The ground overlay that is clicked
             */
            public void onGroundOverlayClick(org.xms.g.maps.model.GroundOverlay param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener) this.getHInstance()).onGroundOverlayClick(((com.huawei.hms.maps.model.GroundOverlay) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnGroundOverlayClickListener) this.getHInstance()).onGroundOverlayClick(((com.huawei.hms.maps.model.GroundOverlay) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener) this.getGInstance()).onGroundOverlayClick(((com.google.android.gms.maps.model.GroundOverlay) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener) this.getGInstance()).onGroundOverlayClick(((com.google.android.gms.maps.model.GroundOverlay) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * A listener for when the indoor state changes.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener and com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener: A listener for when the indoor state changes.<br/>
     * com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener: A listener for when the indoor state changes. Events are notified on the Android UI thread.<br/>
     */
    public static interface OnIndoorStateChangeListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnIndoorStateChangeListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.onIndoorBuildingFocused() The map maintains a notion of focused building, which is the building currently centered in the viewport or otherwise selected by the user through the UI or the location provider. This callback is called when the focused building changes.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener.onIndoorBuildingFocused()
         * com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener.onIndoorBuildingFocused(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnIndoorStateChangeListener#public-abstract-void-onindoorbuildingfocused">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnIndoorStateChangeListener#public-abstract-void-onindoorbuildingfocused</a><br/>
         */
        public void onIndoorBuildingFocused();

        /**
         * org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.onIndoorLevelActivated(org.xms.g.maps.model.IndoorBuilding) The map keeps track of the active level for each building which has been visited or otherwise had a level selected. When that level changes, this callback will be triggered regardless of whether the building is focused or not. This callback is also called when the default level first becomes available.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener.onIndoorLevelActivated(com.huawei.hms.maps.model.IndoorBuilding)
         * com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener.onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnIndoorStateChangeListener#public-abstract-void-onindoorlevelactivated-indoorbuilding-building">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnIndoorStateChangeListener#public-abstract-void-onindoorlevelactivated-indoorbuilding-building</a><br/>
         *
         * @param param0 the building for which the active level has changed, never null
         */
        public void onIndoorLevelActivated(org.xms.g.maps.model.IndoorBuilding param0);

        default java.lang.Object getZInstanceOnIndoorStateChangeListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnIndoorStateChangeListener();
            } else {
                return getGInstanceOnIndoorStateChangeListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener getGInstanceOnIndoorStateChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener() {

                public void onIndoorBuildingFocused() {
                    org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.this.onIndoorBuildingFocused();
                }

                public void onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding param0) {
                    org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.this.onIndoorLevelActivated(((param0) == null ? null : (new org.xms.g.maps.model.IndoorBuilding(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener getHInstanceOnIndoorStateChangeListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener() {

                public void onIndoorBuildingFocused() {
                    org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.this.onIndoorBuildingFocused();
                }

                public void onIndoorLevelActivated(com.huawei.hms.maps.model.IndoorBuilding param0) {
                    org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.this.onIndoorLevelActivated(((param0) == null ? null : (new org.xms.g.maps.model.IndoorBuilding(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * A listener for when the indoor state changes.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener: A listener for when the indoor state changes.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.XImpl.onIndoorBuildingFocused() The map maintains a notion of focused building, which is the building currently centered in the viewport or otherwise selected by the user through the UI or the location provider. This callback is called when the focused building changes.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener.onIndoorBuildingFocused()
             * com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener.onIndoorBuildingFocused(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnIndoorStateChangeListener#public-abstract-void-onindoorbuildingfocused">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnIndoorStateChangeListener#public-abstract-void-onindoorbuildingfocused</a><br/>
             */
            public void onIndoorBuildingFocused() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) this.getHInstance()).onIndoorBuildingFocused()");
                    ((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) this.getHInstance()).onIndoorBuildingFocused();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) this.getGInstance()).onIndoorBuildingFocused()");
                    ((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) this.getGInstance()).onIndoorBuildingFocused();
                }
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnIndoorStateChangeListener.XImpl.onIndoorLevelActivated(org.xms.g.maps.model.IndoorBuilding) The map keeps track of the active level for each building which has been visited or otherwise had a level selected. When that level changes, this callback will be triggered regardless of whether the building is focused or not. This callback is also called when the default level first becomes available.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener.onIndoorLevelActivated(com.huawei.hms.maps.model.IndoorBuilding)
             * com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener.onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnIndoorStateChangeListener#public-abstract-void-onindoorlevelactivated-indoorbuilding-building">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnIndoorStateChangeListener#public-abstract-void-onindoorlevelactivated-indoorbuilding-building</a><br/>
             *
             * @param param0 the building for which the active level has changed, never null
             */
            public void onIndoorLevelActivated(org.xms.g.maps.model.IndoorBuilding param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) this.getHInstance()).onIndoorLevelActivated(((com.huawei.hms.maps.model.IndoorBuilding) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnIndoorStateChangeListener) this.getHInstance()).onIndoorLevelActivated(((com.huawei.hms.maps.model.IndoorBuilding) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) this.getGInstance()).onIndoorLevelActivated(((com.google.android.gms.maps.model.IndoorBuilding) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener) this.getGInstance()).onIndoorLevelActivated(((com.google.android.gms.maps.model.IndoorBuilding) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for click/tap events on a marker's info window.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener and com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onInfoWindowClick(Marker marker). You can register this API and implement its abstract method to listen for tap events of the information window of a marker.<br/>
     * com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener: Callback interface for click/tap events on a marker's info window.<br/>
     */
    public static interface OnInfoWindowClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnInfoWindowClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.onInfoWindowClick(org.xms.g.maps.model.Marker) Called when the marker's info window is clicked.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener.onInfoWindowClick(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowclickl#onInfoWindowClick(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowclickl#onInfoWindowClick(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener.onInfoWindowClick(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowClickListener#public-abstract-void-oninfowindowclick-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowClickListener#public-abstract-void-oninfowindowclick-marker-marker</a><br/>
         *
         * @param param0 The marker of the info window that was clicked
         */
        public void onInfoWindowClick(org.xms.g.maps.model.Marker param0);

        default java.lang.Object getZInstanceOnInfoWindowClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnInfoWindowClickListener();
            } else {
                return getGInstanceOnInfoWindowClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener getGInstanceOnInfoWindowClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() {

                public void onInfoWindowClick(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.this.onInfoWindowClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener getHInstanceOnInfoWindowClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener() {

                public void onInfoWindowClick(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.this.onInfoWindowClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for click/tap events on a marker's info window.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener: Callback interface for click/tap events on a marker's info window.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl .<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener.XImpl.onInfoWindowClick(org.xms.g.maps.model.Marker) Called when the marker's info window is clicked.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener.onInfoWindowClick(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowclickl#onInfoWindowClick(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowclickl#onInfoWindowClick(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener.onInfoWindowClick(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowClickListener#public-abstract-void-oninfowindowclick-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowClickListener#public-abstract-void-oninfowindowclick-marker-marker</a><br/>
             *
             * @param param0 The marker of the info window that was clicked
             */
            public void onInfoWindowClick(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener) this.getHInstance()).onInfoWindowClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowClickListener) this.getHInstance()).onInfoWindowClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener) this.getGInstance()).onInfoWindowClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener) this.getGInstance()).onInfoWindowClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for close events on a marker's info window.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener and com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener: An internal API of the HuaweiMap class. The API contains the abstract method onInfoWindowClose(Marker marker).<br/>
     * com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener: Callback interface for close events on a marker's info window.<br/>
     */
    public static interface OnInfoWindowCloseListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnInfoWindowCloseListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.onInfoWindowClose(org.xms.g.maps.model.Marker) Called when the marker's info window is closed.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener.onInfoWindowClose(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowclosel#onInfoWindowClose(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowclosel#onInfoWindowClose(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener.onInfoWindowClose(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowCloseListener#public-abstract-void-oninfowindowclose-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowCloseListener#public-abstract-void-oninfowindowclose-marker-marker</a><br/>
         *
         * @param param0 The marker of the info window that was closed
         */
        public void onInfoWindowClose(org.xms.g.maps.model.Marker param0);

        default java.lang.Object getZInstanceOnInfoWindowCloseListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnInfoWindowCloseListener();
            } else {
                return getGInstanceOnInfoWindowCloseListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener getGInstanceOnInfoWindowCloseListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener() {

                public void onInfoWindowClose(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.this.onInfoWindowClose(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener getHInstanceOnInfoWindowCloseListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener() {

                public void onInfoWindowClose(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.this.onInfoWindowClose(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for close events on a marker's info window.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener: Callback interface for close events on a marker's info window.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnInfoWindowCloseListener.XImpl.onInfoWindowClose(org.xms.g.maps.model.Marker) Called when the marker's info window is closed.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener.onInfoWindowClose(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowclosel#onInfoWindowClose(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowclosel#onInfoWindowClose(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener.onInfoWindowClose(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowCloseListener#public-abstract-void-oninfowindowclose-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowCloseListener#public-abstract-void-oninfowindowclose-marker-marker</a><br/>
             *
             * @param param0 The marker of the info window that was closed
             */
            public void onInfoWindowClose(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener) this.getHInstance()).onInfoWindowClose(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowCloseListener) this.getHInstance()).onInfoWindowClose(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener) this.getGInstance()).onInfoWindowClose(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener) this.getGInstance()).onInfoWindowClose(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when the user long presses on a marker's info window.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener and com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onInfoWindowLongClick(Marker marker).<br/>
     * com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener: Callback interface for when the user long presses on a marker's info window.<br/>
     */
    public static interface OnInfoWindowLongClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnInfoWindowLongClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.onInfoWindowLongClick(org.xms.g.maps.model.Marker) Called when the user makes a long-press gesture on the marker's info window.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener.onInfoWindowLongClick(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowlongclickl#onInfoWindowLongClick(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowlongclickl#onInfoWindowLongClick(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener.onInfoWindowLongClick(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowLongClickListener#public-abstract-void-oninfowindowlongclick-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowLongClickListener#public-abstract-void-oninfowindowlongclick-marker-marker</a><br/>
         *
         * @param param0 The marker to which the info window is anchored
         */
        public void onInfoWindowLongClick(org.xms.g.maps.model.Marker param0);

        default java.lang.Object getZInstanceOnInfoWindowLongClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnInfoWindowLongClickListener();
            } else {
                return getGInstanceOnInfoWindowLongClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener getGInstanceOnInfoWindowLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener() {

                public void onInfoWindowLongClick(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.this.onInfoWindowLongClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener getHInstanceOnInfoWindowLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener() {

                public void onInfoWindowLongClick(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.this.onInfoWindowLongClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for when the user long presses on a marker's info window.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener: Callback interface for when the user long presses on a marker's info window.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl .<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnInfoWindowLongClickListener.XImpl.onInfoWindowLongClick(org.xms.g.maps.model.Marker) Called when the user makes a long-press gesture on the marker's info window.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener.onInfoWindowLongClick(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowlongclickl#onInfoWindowLongClick(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-oninfowindowlongclickl#onInfoWindowLongClick(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener.onInfoWindowLongClick(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowLongClickListener#public-abstract-void-oninfowindowlongclick-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnInfoWindowLongClickListener#public-abstract-void-oninfowindowlongclick-marker-marker</a><br/>
             *
             * @param param0 The marker to which the info window is anchored
             */
            public void onInfoWindowLongClick(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener) this.getHInstance()).onInfoWindowLongClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnInfoWindowLongClickListener) this.getHInstance()).onInfoWindowLongClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener) this.getGInstance()).onInfoWindowLongClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener) this.getGInstance()).onInfoWindowLongClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when the user taps on the map.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnMapClickListener and com.google.android.gms.maps.GoogleMap.OnMapClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnMapClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onMapClick(LatLng latLng).<br/>
     * com.google.android.gms.maps.GoogleMap.OnMapClickListener: Callback interface for when the user taps on the map.<br/>
     */
    public static interface OnMapClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnMapClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnMapClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnMapClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnMapClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnMapClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMapClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMapClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMapClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMapClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMapClickListener.onMapClick(org.xms.g.maps.model.LatLng) Called when the user makes a tap gesture on the map, but only if none of the overlays of the map handled the gesture. Implementations of this method are always invoked on the Android UI thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMapClickListener.onMapClick(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmapclickl#onMapClick(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmapclickl#onMapClick(LatLng)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMapClickListener.onMapClick(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapClickListener#public-abstract-void-onmapclick-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapClickListener#public-abstract-void-onmapclick-latlng-point</a><br/>
         *
         * @param param0 The point on the ground (projected from the screen point) that was tapped
         */
        public void onMapClick(org.xms.g.maps.model.LatLng param0);

        default java.lang.Object getZInstanceOnMapClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnMapClickListener();
            } else {
                return getGInstanceOnMapClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnMapClickListener getGInstanceOnMapClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMapClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMapClickListener() {

                public void onMapClick(com.google.android.gms.maps.model.LatLng param0) {
                    org.xms.g.maps.ExtensionMap.OnMapClickListener.this.onMapClick(((param0) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnMapClickListener getHInstanceOnMapClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMapClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMapClickListener() {

                public void onMapClick(com.huawei.hms.maps.model.LatLng param0) {
                    org.xms.g.maps.ExtensionMap.OnMapClickListener.this.onMapClick(((param0) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for when the user taps on the map.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnMapClickListener: Callback interface for when the user taps on the map.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMapClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnMapClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMapClickListener.XImpl.onMapClick(org.xms.g.maps.model.LatLng) Called when the user makes a tap gesture on the map, but only if none of the overlays of the map handled the gesture. Implementations of this method are always invoked on the Android UI thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMapClickListener.onMapClick(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmapclickl#onMapClick(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmapclickl#onMapClick(LatLng)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMapClickListener.onMapClick(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapClickListener#public-abstract-void-onmapclick-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapClickListener#public-abstract-void-onmapclick-latlng-point</a><br/>
             *
             * @param param0 The point on the ground (projected from the screen point) that was tapped
             */
            public void onMapClick(org.xms.g.maps.model.LatLng param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMapClickListener) this.getHInstance()).onMapClick(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMapClickListener) this.getHInstance()).onMapClick(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMapClickListener) this.getGInstance()).onMapClick(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMapClickListener) this.getGInstance()).onMapClick(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when the map has finished rendering. This occurs after all tiles required to render the map have been fetched, and all labeling is complete. This event will not fire if the map never loads due to connectivity issues, or if the map is continuously changing and never completes loading due to the user constantly interacting with the map.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback and com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback: An internal API of the HuaweiMap class. The API contains the abstract method onMapLoaded().<br/>
     * com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback: Callback interface for when the map has finished rendering. This occurs after all tiles required to render the map have been fetched, and all labeling is complete. This event will not fire if the map never loads due to connectivity issues, or if the map is continuously changing and never completes loading due to the user constantly interacting with the map.<br/>
     */
    public static interface OnMapLoadedCallback extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnMapLoadedCallback object
         */
        public static org.xms.g.maps.ExtensionMap.OnMapLoadedCallback dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnMapLoadedCallback) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMapLoadedCallback;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.onMapLoaded() Called when the map has finished rendering. This will only be called once. You must request another callback if you want to be notified again.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback.onMapLoaded(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmaploadedc#onMapLoaded()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmaploadedc#onMapLoaded()</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback.onMapLoaded(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapLoadedCallback#public-abstract-void-onmaploaded">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapLoadedCallback#public-abstract-void-onmaploaded</a><br/>
         */
        public void onMapLoaded();

        default java.lang.Object getZInstanceOnMapLoadedCallback() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnMapLoadedCallback();
            } else {
                return getGInstanceOnMapLoadedCallback();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback getGInstanceOnMapLoadedCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback() {

                public void onMapLoaded() {
                    org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.this.onMapLoaded();
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback getHInstanceOnMapLoadedCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback() {

                public void onMapLoaded() {
                    org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.this.onMapLoaded();
                }
            };
        }

        /**
         * Callback interface for when the map has finished rendering.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback: Callback interface for when the map has finished rendering.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMapLoadedCallback {

            /**
             * org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMapLoadedCallback.XImpl.onMapLoaded() Called when the map has finished rendering. This will only be called once. You must request another callback if you want to be notified again.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback.onMapLoaded(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmaploadedc#onMapLoaded()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmaploadedc#onMapLoaded()</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback.onMapLoaded(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapLoadedCallback#public-abstract-void-onmaploaded">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapLoadedCallback#public-abstract-void-onmaploaded</a><br/>
             */
            public void onMapLoaded() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback) this.getHInstance()).onMapLoaded()");
                    ((com.huawei.hms.maps.HuaweiMap.OnMapLoadedCallback) this.getHInstance()).onMapLoaded();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) this.getGInstance()).onMapLoaded()");
                    ((com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback) this.getGInstance()).onMapLoaded();
                }
            }
        }
    }

    /**
     * An internal API of the Google class.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener and com.google.android.gms.maps.GoogleMap.OnMapLongClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onMapLongClick(LatLng latLng).<br/>
     * com.google.android.gms.maps.GoogleMap.OnMapLongClickListener: An internal API of the Google class.<br/>
     */
    public static interface OnMapLongClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnMapLongClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnMapLongClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnMapLongClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnMapLongClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnMapLongClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMapLongClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMapLongClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMapLongClickListener.onMapLongClick(org.xms.g.maps.model.LatLng) Called when a map is long pressed and no ground overlay of the map processes the long press gesture. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener.onMapLongClick(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmaplongclickl#onMapLongClick(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmaplongclickl#onMapLongClick(LatLng)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMapLongClickListener.onMapLongClick(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapLongClickListener#public-abstract-void-onmaplongclick-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapLongClickListener#public-abstract-void-onmaplongclick-latlng-point</a><br/>
         *
         * @param param0 The point on the ground (projected from the screen point) that was pressed
         */
        public void onMapLongClick(org.xms.g.maps.model.LatLng param0);

        default java.lang.Object getZInstanceOnMapLongClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnMapLongClickListener();
            } else {
                return getGInstanceOnMapLongClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnMapLongClickListener getGInstanceOnMapLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMapLongClickListener() {

                public void onMapLongClick(com.google.android.gms.maps.model.LatLng param0) {
                    org.xms.g.maps.ExtensionMap.OnMapLongClickListener.this.onMapLongClick(((param0) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener getHInstanceOnMapLongClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener() {

                public void onMapLongClick(com.huawei.hms.maps.model.LatLng param0) {
                    org.xms.g.maps.ExtensionMap.OnMapLongClickListener.this.onMapLongClick(((param0) == null ? null : (new org.xms.g.maps.model.LatLng(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * An internal API of the Google class.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnMapLongClickListener: An internal API of the Google class.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMapLongClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnMapLongClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMapLongClickListener.XImpl.onMapLongClick(org.xms.g.maps.model.LatLng) Called when a map is long pressed and no ground overlay of the map processes the long press gesture. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener.onMapLongClick(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmaplongclickl#onMapLongClick(LatLng)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmaplongclickl#onMapLongClick(LatLng)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMapLongClickListener.onMapLongClick(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapLongClickListener#public-abstract-void-onmaplongclick-latlng-point">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMapLongClickListener#public-abstract-void-onmaplongclick-latlng-point</a><br/>
             *
             * @param param0 The point on the ground (projected from the screen point) that was pressed
             */
            public void onMapLongClick(org.xms.g.maps.model.LatLng param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener) this.getHInstance()).onMapLongClick(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMapLongClickListener) this.getHInstance()).onMapLongClick(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) this.getGInstance()).onMapLongClick(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMapLongClickListener) this.getGInstance()).onMapLongClick(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Defines signatures for methods that are called when a marker is clicked or tapped.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener and com.google.android.gms.maps.GoogleMap.OnMarkerClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onMarkerClick(Marker marker).<br/>
     * com.google.android.gms.maps.GoogleMap.OnMarkerClickListener: Defines signatures for methods that are called when a marker is clicked or tapped.<br/>
     */
    public static interface OnMarkerClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnMarkerClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnMarkerClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnMarkerClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnMarkerClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnMarkerClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMarkerClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMarkerClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMarkerClickListener.onMarkerClick(org.xms.g.maps.model.Marker) Called when a marker is tapped. Note that when a marker is tapped, all currently displayed information windows are closed and HuaweiMap.OnInfoWindowCloseListener is triggered. Then OnMarkerClickListener is triggered. Therefore, false will always be returned if isInfoWindowShown()is called in OnMarkerClickListener for any marker.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener.onMarkerClick(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerclickl#onMarkerClick(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerclickl#onMarkerClick(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMarkerClickListener.onMarkerClick(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerClickListener#public-abstract-boolean-onmarkerclick-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerClickListener#public-abstract-boolean-onmarkerclick-marker-marker</a><br/>
         *
         * @param param0 The marker that was clicked
         * @return true if the listener has consumed the event (i.e., the default behavior should not occur); false otherwise (i.e., the default behavior should occur). The default behavior is for the camera to move to the marker and an info window to appear
         */
        public boolean onMarkerClick(org.xms.g.maps.model.Marker param0);

        default java.lang.Object getZInstanceOnMarkerClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnMarkerClickListener();
            } else {
                return getGInstanceOnMarkerClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnMarkerClickListener getGInstanceOnMarkerClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMarkerClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() {

                public boolean onMarkerClick(com.google.android.gms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.OnMarkerClickListener.this.onMarkerClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener getHInstanceOnMarkerClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener() {

                public boolean onMarkerClick(com.huawei.hms.maps.model.Marker param0) {
                    return org.xms.g.maps.ExtensionMap.OnMarkerClickListener.this.onMarkerClick(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Defines signatures for methods that are called when a marker is clicked or tapped.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnMarkerClickListener: Defines signatures for methods that are called when a marker is clicked or tapped.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMarkerClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnMarkerClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMarkerClickListener.XImpl.onMarkerClick(org.xms.g.maps.model.Marker) Called when a marker is tapped. Note that when a marker is tapped, all currently displayed information windows are closed and HuaweiMap.OnInfoWindowCloseListener is triggered. Then OnMarkerClickListener is triggered. Therefore, false will always be returned if isInfoWindowShown()is called in OnMarkerClickListener for any marker.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener.onMarkerClick(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerclickl#onMarkerClick(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerclickl#onMarkerClick(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMarkerClickListener.onMarkerClick(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerClickListener#public-abstract-boolean-onmarkerclick-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerClickListener#public-abstract-boolean-onmarkerclick-marker-marker</a><br/>
             *
             * @param param0 The marker that was clicked
             * @return true if the listener has consumed the event (i.e., the default behavior should not occur); false otherwise (i.e., the default behavior should occur). The default behavior is for the camera to move to the marker and an info window to appear
             */
            public boolean onMarkerClick(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener) this.getHInstance()).onMarkerClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    return ((com.huawei.hms.maps.HuaweiMap.OnMarkerClickListener) this.getHInstance()).onMarkerClick(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMarkerClickListener) this.getGInstance()).onMarkerClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    return ((com.google.android.gms.maps.GoogleMap.OnMarkerClickListener) this.getGInstance()).onMarkerClick(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Listeners will be invoked on the Android UI thread.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener and com.google.android.gms.maps.GoogleMap.OnMarkerDragListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener: An internal API of the HuaweiMap class. The API contains three abstract methods: onMarkerDrag(Marker marker), onMarkerDragEnd(Marker marker), and onMarkerDragStart(Marker marker). You can implement this API to listen for drag events of a marker.<br/>
     * com.google.android.gms.maps.GoogleMap.OnMarkerDragListener: Listeners will be invoked on the Android UI thread.<br/>
     */
    public static interface OnMarkerDragListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnMarkerDragListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnMarkerDragListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnMarkerDragListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnMarkerDragListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMarkerDragListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMarkerDragListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.onMarkerDrag(org.xms.g.maps.model.Marker) Called repeatedly while a marker is being dragged. The marker's location can be accessed via getPosition().<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener.onMarkerDrag(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDrag(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDrag(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMarkerDragListener.onMarkerDrag(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdrag-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdrag-marker-marker</a><br/>
         *
         * @param param0 The marker being dragged
         */
        public void onMarkerDrag(org.xms.g.maps.model.Marker param0);

        /**
         * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.onMarkerDragEnd(org.xms.g.maps.model.Marker) Called when a marker has finished being dragged. The marker's location can be accessed via getPosition().<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener.onMarkerDragEnd(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDragEnd(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDragEnd(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMarkerDragListener.onMarkerDragEnd(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdragend-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdragend-marker-marker</a><br/>
         *
         * @param param0 The marker that was dragged
         */
        public void onMarkerDragEnd(org.xms.g.maps.model.Marker param0);

        /**
         * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.onMarkerDragStart(org.xms.g.maps.model.Marker) Called when a marker starts being dragged. The marker's location can be accessed via getPosition(); this position may be different to the position prior to the start of the drag because the marker is popped up above the touch point.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener.onMarkerDragStart(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDragStart(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDragStart(Marker)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMarkerDragListener.onMarkerDragStart(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdragstart-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdragstart-marker-marker</a><br/>
         *
         * @param param0 The marker being dragged
         */
        public void onMarkerDragStart(org.xms.g.maps.model.Marker param0);

        default java.lang.Object getZInstanceOnMarkerDragListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnMarkerDragListener();
            } else {
                return getGInstanceOnMarkerDragListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnMarkerDragListener getGInstanceOnMarkerDragListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMarkerDragListener() {

                public void onMarkerDrag(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDrag(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }

                public void onMarkerDragEnd(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDragEnd(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }

                public void onMarkerDragStart(com.google.android.gms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDragStart(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener getHInstanceOnMarkerDragListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener() {

                public void onMarkerDrag(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDrag(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }

                public void onMarkerDragEnd(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDragEnd(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }

                public void onMarkerDragStart(com.huawei.hms.maps.model.Marker param0) {
                    org.xms.g.maps.ExtensionMap.OnMarkerDragListener.this.onMarkerDragStart(((param0) == null ? null : (new org.xms.g.maps.model.Marker(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Listeners will be invoked on the Android UI thread.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnMarkerDragListener: Listeners will be invoked on the Android UI thread.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMarkerDragListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.XImpl.onMarkerDrag(org.xms.g.maps.model.Marker) Called repeatedly while a marker is being dragged. The marker's location can be accessed via getPosition().<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener.onMarkerDrag(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDrag(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDrag(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMarkerDragListener.onMarkerDrag(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdrag-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdrag-marker-marker</a><br/>
             *
             * @param param0 The marker being dragged
             */
            public void onMarkerDrag(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDrag(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDrag(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDrag(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDrag(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.XImpl.onMarkerDragEnd(org.xms.g.maps.model.Marker) Called when a marker has finished being dragged. The marker's location can be accessed via getPosition().<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener.onMarkerDragEnd(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDragEnd(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDragEnd(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMarkerDragListener.onMarkerDragEnd(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdragend-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdragend-marker-marker</a><br/>
             *
             * @param param0 The marker that was dragged
             */
            public void onMarkerDragEnd(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDragEnd(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDragEnd(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDragEnd(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDragEnd(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMarkerDragListener.XImpl.onMarkerDragStart(org.xms.g.maps.model.Marker) Called when a marker starts being dragged. The marker's location can be accessed via getPosition(); this position may be different to the position prior to the start of the drag because the marker is popped up above the touch point.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener.onMarkerDragStart(com.huawei.hms.maps.model.Marker): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDragStart(Marker)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmarkerdragl#onMarkerDragStart(Marker)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMarkerDragListener.onMarkerDragStart(com.google.android.gms.maps.model.Marker): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdragstart-marker-marker">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMarkerDragListener#public-abstract-void-onmarkerdragstart-marker-marker</a><br/>
             *
             * @param param0 The marker being dragged
             */
            public void onMarkerDragStart(org.xms.g.maps.model.Marker param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDragStart(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnMarkerDragListener) this.getHInstance()).onMarkerDragStart(((com.huawei.hms.maps.model.Marker) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDragStart(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnMarkerDragListener) this.getGInstance()).onMarkerDragStart(((com.google.android.gms.maps.model.Marker) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when the My Location button is clicked.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener and com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onMyLocationButtonClick().<br/>
     * com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener: Callback interface for when the My Location button is clicked.<br/>
     */
    public static interface OnMyLocationButtonClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnMyLocationButtonClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.onMyLocationButtonClick() Called when the my-location icon is tapped. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener.onMyLocationButtonClick(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmylocationbuttonclickl#onMyLocationButtonClick()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmylocationbuttonclickl#onMyLocationButtonClick()</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener.onMyLocationButtonClick(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMyLocationButtonClickListener#public-abstract-boolean-onmylocationbuttonclick">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMyLocationButtonClickListener#public-abstract-boolean-onmylocationbuttonclick</a><br/>
         *
         * @return true if the listener has consumed the event (i.e., the default behavior should not occur); false otherwise (i.e., the default behavior should occur). The default behavior is for the camera move such that it is centered on the user location
         */
        public boolean onMyLocationButtonClick();

        default java.lang.Object getZInstanceOnMyLocationButtonClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnMyLocationButtonClickListener();
            } else {
                return getGInstanceOnMyLocationButtonClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener getGInstanceOnMyLocationButtonClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener() {

                public boolean onMyLocationButtonClick() {
                    return org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.this.onMyLocationButtonClick();
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener getHInstanceOnMyLocationButtonClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener() {

                public boolean onMyLocationButtonClick() {
                    return org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.this.onMyLocationButtonClick();
                }
            };
        }

        /**
         * Callback interface for when the My Location button is clicked.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener: Callback interface for when the My Location button is clicked.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener.XImpl.onMyLocationButtonClick() Called when the my-location icon is tapped. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener.onMyLocationButtonClick(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmylocationbuttonclickl#onMyLocationButtonClick()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmylocationbuttonclickl#onMyLocationButtonClick()</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener.onMyLocationButtonClick(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMyLocationButtonClickListener#public-abstract-boolean-onmylocationbuttonclick">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMyLocationButtonClickListener#public-abstract-boolean-onmylocationbuttonclick</a><br/>
             *
             * @return true if the listener has consumed the event (i.e., the default behavior should not occur); false otherwise (i.e., the default behavior should occur). The default behavior is for the camera move such that it is centered on the user location
             */
            public boolean onMyLocationButtonClick() {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener) this.getHInstance()).onMyLocationButtonClick()");
                    return ((com.huawei.hms.maps.HuaweiMap.OnMyLocationButtonClickListener) this.getHInstance()).onMyLocationButtonClick();
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) this.getGInstance()).onMyLocationButtonClick()");
                    return ((com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener) this.getGInstance()).onMyLocationButtonClick();
                }
            }
        }
    }

    /**
     * Callback interface for when the My Location dot/chevron(which signifies the user's location)changes location.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener: Callback interface for when the My Location dot/chevron(which signifies the user's location)changes location.<br/>
     */
    public static interface OnMyLocationChangeListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnMyLocationChangeListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public void onMyLocationChange(android.location.Location param0);

        default java.lang.Object getZInstanceOnMyLocationChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        default com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener getGInstanceOnMyLocationChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        default java.lang.Object getHInstanceOnMyLocationChangeListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * Callback interface for when the My Location dot/chevron(which signifies the user's location)changes location.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * : <br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnMyLocationChangeListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public void onMyLocationChange(android.location.Location param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }

    /**
     * Callback interface for when the My Location dot(which signifies the user's location)is clicked.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener and com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onMyLocationClick(Location location).<br/>
     * com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener: Callback interface for when the My Location dot(which signifies the user's location)is clicked.<br/>
     */
    public static interface OnMyLocationClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnMyLocationClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnMyLocationClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnMyLocationClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnMyLocationClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.onMyLocationClick(android.location.Location) Called when the my-location blue dot is tapped. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener.onMyLocationClick(android.location.Location): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmylocationclickl#onMyLocationClick(Location)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmylocationclickl#onMyLocationClick(Location)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener.onMyLocationClick(android.location.Location): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMyLocationClickListener#onMyLocationClick(android.location.Location)">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMyLocationClickListener#onMyLocationClick(android.location.Location)</a><br/>
         *
         * @param param0 The current location of the My Location dot
         */
        public void onMyLocationClick(android.location.Location param0);

        default java.lang.Object getZInstanceOnMyLocationClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnMyLocationClickListener();
            } else {
                return getGInstanceOnMyLocationClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener getGInstanceOnMyLocationClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener() {

                public void onMyLocationClick(android.location.Location param0) {
                    org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.this.onMyLocationClick(param0);
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener getHInstanceOnMyLocationClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener() {

                public void onMyLocationClick(android.location.Location param0) {
                    org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.this.onMyLocationClick(param0);
                }
            };
        }

        /**
         * Callback interface for when the My Location dot(which signifies the user's location)is clicked.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener: Callback interface for when the My Location dot(which signifies the user's location)is clicked.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnMyLocationClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnMyLocationClickListener.XImpl.onMyLocationClick(android.location.Location) Called when the my-location blue dot is tapped. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener.onMyLocationClick(android.location.Location): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmylocationclickl#onMyLocationClick(Location)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onmylocationclickl#onMyLocationClick(Location)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener.onMyLocationClick(android.location.Location): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMyLocationClickListener#onMyLocationClick(android.location.Location)">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnMyLocationClickListener#onMyLocationClick(android.location.Location)</a><br/>
             *
             * @param param0 The current location of the My Location dot
             */
            public void onMyLocationClick(android.location.Location param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener) this.getHInstance()).onMyLocationClick(param0)");
                    ((com.huawei.hms.maps.HuaweiMap.OnMyLocationClickListener) this.getHInstance()).onMyLocationClick(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener) this.getGInstance()).onMyLocationClick(param0)");
                    ((com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener) this.getGInstance()).onMyLocationClick(param0);
                }
            }
        }
    }

    /**
     * A listener for POI taps.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnPoiClickListener and com.google.android.gms.maps.GoogleMap.OnPoiClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnPoiClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onPoiClick(PointOfInterest poi).<br/>
     * com.google.android.gms.maps.GoogleMap.OnPoiClickListener: A listener for POI taps.<br/>
     */
    public static interface OnPoiClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnPoiClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnPoiClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnPoiClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnPoiClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnPoiClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnPoiClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnPoiClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnPoiClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnPoiClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnPoiClickListener.onPoiClick(org.xms.g.maps.model.PointOfInterest) Called when a POI is clicked or tapped.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnPoiClickListener.onPoiClick(com.huawei.hms.maps.model.PointOfInterest): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpoiclickl#onPoiClick(PointOfInterest)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpoiclickl#onPoiClick(PointOfInterest)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnPoiClickListener.onPoiClick(com.google.android.gms.maps.model.PointOfInterest): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPoiClickListener#public-abstract-void-onpoiclick-pointofinterest-poi">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPoiClickListener#public-abstract-void-onpoiclick-pointofinterest-poi</a><br/>
         *
         * @param param0 The point of interest that was clicked or tapped
         */
        public void onPoiClick(org.xms.g.maps.model.PointOfInterest param0);

        default java.lang.Object getZInstanceOnPoiClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnPoiClickListener();
            } else {
                return getGInstanceOnPoiClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnPoiClickListener getGInstanceOnPoiClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnPoiClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnPoiClickListener() {

                public void onPoiClick(com.google.android.gms.maps.model.PointOfInterest param0) {
                    org.xms.g.maps.ExtensionMap.OnPoiClickListener.this.onPoiClick(((param0) == null ? null : (new org.xms.g.maps.model.PointOfInterest(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnPoiClickListener getHInstanceOnPoiClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnPoiClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnPoiClickListener() {

                public void onPoiClick(com.huawei.hms.maps.model.PointOfInterest param0) {
                    org.xms.g.maps.ExtensionMap.OnPoiClickListener.this.onPoiClick(((param0) == null ? null : (new org.xms.g.maps.model.PointOfInterest(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * A listener for POI taps.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnPoiClickListener: A listener for POI taps.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnPoiClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnPoiClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnPoiClickListener.XImpl.onPoiClick(org.xms.g.maps.model.PointOfInterest) Called when a POI is clicked or tapped.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnPoiClickListener.onPoiClick(com.huawei.hms.maps.model.PointOfInterest): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpoiclickl#onPoiClick(PointOfInterest)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpoiclickl#onPoiClick(PointOfInterest)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnPoiClickListener.onPoiClick(com.google.android.gms.maps.model.PointOfInterest): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPoiClickListener#public-abstract-void-onpoiclick-pointofinterest-poi">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPoiClickListener#public-abstract-void-onpoiclick-pointofinterest-poi</a><br/>
             *
             * @param param0 The point of interest that was clicked or tapped
             */
            public void onPoiClick(org.xms.g.maps.model.PointOfInterest param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnPoiClickListener) this.getHInstance()).onPoiClick(((com.huawei.hms.maps.model.PointOfInterest) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnPoiClickListener) this.getHInstance()).onPoiClick(((com.huawei.hms.maps.model.PointOfInterest) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnPoiClickListener) this.getGInstance()).onPoiClick(((com.google.android.gms.maps.model.PointOfInterest) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnPoiClickListener) this.getGInstance()).onPoiClick(((com.google.android.gms.maps.model.PointOfInterest) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when a polygon is clicked.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener and com.google.android.gms.maps.GoogleMap.OnPolygonClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onPolygonClick(Polygon polygon).<br/>
     * com.google.android.gms.maps.GoogleMap.OnPolygonClickListener: Callback interface for when a polygon is clicked.<br/>
     */
    public static interface OnPolygonClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnPolygonClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnPolygonClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnPolygonClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnPolygonClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnPolygonClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnPolygonClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnPolygonClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnPolygonClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnPolygonClickListener.onPolygonClick(org.xms.g.maps.model.Polygon) Called when a polygon is tapped. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener.onPolygonClick(com.huawei.hms.maps.model.Polygon): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpolygonclickl#onPolygonClick(Polygon)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpolygonclickl#onPolygonClick(Polygon)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnPolygonClickListener.onPolygonClick(com.google.android.gms.maps.model.Polygon): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPolygonClickListener#public-abstract-void-onpolygonclick-polygon-polygon">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPolygonClickListener#public-abstract-void-onpolygonclick-polygon-polygon</a><br/>
         *
         * @param param0 The polygon that is clicked
         */
        public void onPolygonClick(org.xms.g.maps.model.Polygon param0);

        default java.lang.Object getZInstanceOnPolygonClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnPolygonClickListener();
            } else {
                return getGInstanceOnPolygonClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnPolygonClickListener getGInstanceOnPolygonClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnPolygonClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnPolygonClickListener() {

                public void onPolygonClick(com.google.android.gms.maps.model.Polygon param0) {
                    org.xms.g.maps.ExtensionMap.OnPolygonClickListener.this.onPolygonClick(((param0) == null ? null : (new org.xms.g.maps.model.Polygon(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener getHInstanceOnPolygonClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener() {

                public void onPolygonClick(com.huawei.hms.maps.model.Polygon param0) {
                    org.xms.g.maps.ExtensionMap.OnPolygonClickListener.this.onPolygonClick(((param0) == null ? null : (new org.xms.g.maps.model.Polygon(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for when a polygon is clicked.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnPolygonClickListener: Callback interface for when a polygon is clicked.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnPolygonClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnPolygonClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnPolygonClickListener.XImpl.onPolygonClick(org.xms.g.maps.model.Polygon) Called when a polygon is tapped. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener.onPolygonClick(com.huawei.hms.maps.model.Polygon): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpolygonclickl#onPolygonClick(Polygon)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpolygonclickl#onPolygonClick(Polygon)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnPolygonClickListener.onPolygonClick(com.google.android.gms.maps.model.Polygon): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPolygonClickListener#public-abstract-void-onpolygonclick-polygon-polygon">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPolygonClickListener#public-abstract-void-onpolygonclick-polygon-polygon</a><br/>
             *
             * @param param0 The polygon that is clicked
             */
            public void onPolygonClick(org.xms.g.maps.model.Polygon param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener) this.getHInstance()).onPolygonClick(((com.huawei.hms.maps.model.Polygon) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnPolygonClickListener) this.getHInstance()).onPolygonClick(((com.huawei.hms.maps.model.Polygon) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnPolygonClickListener) this.getGInstance()).onPolygonClick(((com.google.android.gms.maps.model.Polygon) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnPolygonClickListener) this.getGInstance()).onPolygonClick(((com.google.android.gms.maps.model.Polygon) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface for when a polyline is clicked.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener and com.google.android.gms.maps.GoogleMap.OnPolylineClickListener.<br/>
     * com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener: An internal API of the HuaweiMap class. The API contains the abstract method onPolylineClick(Polyline polyline).<br/>
     * com.google.android.gms.maps.GoogleMap.OnPolylineClickListener: Callback interface for when a polyline is clicked.<br/>
     */
    public static interface OnPolylineClickListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.OnPolylineClickListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.OnPolylineClickListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap OnPolylineClickListener object
         */
        public static org.xms.g.maps.ExtensionMap.OnPolylineClickListener dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.OnPolylineClickListener) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnPolylineClickListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.OnPolylineClickListener;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.OnPolylineClickListener;
        }

        /**
         * org.xms.g.maps.ExtensionMap.OnPolylineClickListener.onPolylineClick(org.xms.g.maps.model.Polyline) Called when a polyline is tapped. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener.onPolylineClick(com.huawei.hms.maps.model.Polyline): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpolylineclickl#onPolylineClick(Polyline)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpolylineclickl#onPolylineClick(Polyline)</a><br/>
         * com.google.android.gms.maps.GoogleMap.OnPolylineClickListener.onPolylineClick(com.google.android.gms.maps.model.Polyline): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPolylineClickListener#public-abstract-void-onpolylineclick-polyline-polyline">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPolylineClickListener#public-abstract-void-onpolylineclick-polyline-polyline</a><br/>
         *
         * @param param0 The polyline that is clicked
         */
        public void onPolylineClick(org.xms.g.maps.model.Polyline param0);

        default java.lang.Object getZInstanceOnPolylineClickListener() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceOnPolylineClickListener();
            } else {
                return getGInstanceOnPolylineClickListener();
            }
        }

        default com.google.android.gms.maps.GoogleMap.OnPolylineClickListener getGInstanceOnPolylineClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.OnPolylineClickListener) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.OnPolylineClickListener() {

                public void onPolylineClick(com.google.android.gms.maps.model.Polyline param0) {
                    org.xms.g.maps.ExtensionMap.OnPolylineClickListener.this.onPolylineClick(((param0) == null ? null : (new org.xms.g.maps.model.Polyline(new org.xms.g.utils.XBox(param0, null)))));
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener getHInstanceOnPolylineClickListener() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener() {

                public void onPolylineClick(com.huawei.hms.maps.model.Polyline param0) {
                    org.xms.g.maps.ExtensionMap.OnPolylineClickListener.this.onPolylineClick(((param0) == null ? null : (new org.xms.g.maps.model.Polyline(new org.xms.g.utils.XBox(null, param0)))));
                }
            };
        }

        /**
         * Callback interface for when a polyline is clicked.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.OnPolylineClickListener: Callback interface for when a polyline is clicked.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.OnPolylineClickListener {

            /**
             * org.xms.g.maps.ExtensionMap.OnPolylineClickListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.OnPolylineClickListener.XImpl.onPolylineClick(org.xms.g.maps.model.Polyline) Called when a polyline is tapped. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener.onPolylineClick(com.huawei.hms.maps.model.Polyline): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpolylineclickl#onPolylineClick(Polyline)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-onpolylineclickl#onPolylineClick(Polyline)</a><br/>
             * com.google.android.gms.maps.GoogleMap.OnPolylineClickListener.onPolylineClick(com.google.android.gms.maps.model.Polyline): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPolylineClickListener#public-abstract-void-onpolylineclick-polyline-polyline">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.OnPolylineClickListener#public-abstract-void-onpolylineclick-polyline-polyline</a><br/>
             *
             * @param param0 The polyline that is clicked
             */
            public void onPolylineClick(org.xms.g.maps.model.Polyline param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener) this.getHInstance()).onPolylineClick(((com.huawei.hms.maps.model.Polyline) ((param0) == null ? null : (param0.getHInstance()))))");
                    ((com.huawei.hms.maps.HuaweiMap.OnPolylineClickListener) this.getHInstance()).onPolylineClick(((com.huawei.hms.maps.model.Polyline) ((param0) == null ? null : (param0.getHInstance()))));
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.OnPolylineClickListener) this.getGInstance()).onPolylineClick(((com.google.android.gms.maps.model.Polyline) ((param0) == null ? null : (param0.getGInstance()))))");
                    ((com.google.android.gms.maps.GoogleMap.OnPolylineClickListener) this.getGInstance()).onPolylineClick(((com.google.android.gms.maps.model.Polyline) ((param0) == null ? null : (param0.getGInstance()))));
                }
            }
        }
    }

    /**
     * Callback interface to notify when the snapshot has been taken.<br/>
     * Combination of com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback and com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback.<br/>
     * com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback: An internal API of the HuaweiMap class. The API contains the abstract method onSnapshotReady(Bitmap snapshot).<br/>
     * com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback: Callback interface to notify when the snapshot has been taken.<br/>
     */
    public static interface SnapshotReadyCallback extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the param should instanceof java lang Object
         * @return cast maps ExtensionMap SnapshotReadyCallback object
         */
        public static org.xms.g.maps.ExtensionMap.SnapshotReadyCallback dynamicCast(java.lang.Object param0) {
            return ((org.xms.g.maps.ExtensionMap.SnapshotReadyCallback) param0);
        }

        /**
         * org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                    return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback;
                } else {
                    return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback;
                }
            }
            return param0 instanceof org.xms.g.maps.ExtensionMap.SnapshotReadyCallback;
        }

        /**
         * org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.onSnapshotReady(android.graphics.Bitmap) Called when a snapshot is generated. This method must be called in the main thread.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback.onSnapshotReady(android.graphics.Bitmap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-snapshotreadyc#onSnapshotReady(Bitmap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-snapshotreadyc#onSnapshotReady(Bitmap)</a><br/>
         * com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback.onSnapshotReady(android.graphics.Bitmap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.SnapshotReadyCallback#public-abstract-void-onsnapshotready-bitmap-snapshot">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.SnapshotReadyCallback#public-abstract-void-onsnapshotready-bitmap-snapshot</a><br/>
         *
         * @param param0 A bitmap containing the map as it is currently rendered, or null if the snapshot could not be taken
         */
        public void onSnapshotReady(android.graphics.Bitmap param0);

        default java.lang.Object getZInstanceSnapshotReadyCallback() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return getHInstanceSnapshotReadyCallback();
            } else {
                return getGInstanceSnapshotReadyCallback();
            }
        }

        default com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback getGInstanceSnapshotReadyCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback) ((org.xms.g.utils.XGettable) this).getGInstance());
            }
            return new com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback() {

                public void onSnapshotReady(android.graphics.Bitmap param0) {
                    org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.this.onSnapshotReady(param0);
                }
            };
        }

        default com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback getHInstanceSnapshotReadyCallback() {
            if (this instanceof org.xms.g.utils.XGettable) {
                return ((com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback) ((org.xms.g.utils.XGettable) this).getHInstance());
            }
            return new com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback() {

                public void onSnapshotReady(android.graphics.Bitmap param0) {
                    org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.this.onSnapshotReady(param0);
                }
            };
        }

        /**
         * Callback interface to notify when the snapshot has been taken.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback: Callback interface to notify when the snapshot has been taken.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.maps.ExtensionMap.SnapshotReadyCallback {

            /**
             * org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             *
             * @param param0 this param is utils XBox
             */
            public XImpl(org.xms.g.utils.XBox param0) {
                super(param0);
            }

            /**
             * org.xms.g.maps.ExtensionMap.SnapshotReadyCallback.XImpl.onSnapshotReady(android.graphics.Bitmap) Called when a snapshot is generated. This method must be called in the main thread.<br/>
             * Support running environments including both HMS and GMS which are chosen by users.<br/>
             * Below are the references of HMS apis and GMS apis respectively:<br/>
             * com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback.onSnapshotReady(android.graphics.Bitmap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-snapshotreadyc#onSnapshotReady(Bitmap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-snapshotreadyc#onSnapshotReady(Bitmap)</a><br/>
             * com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback.onSnapshotReady(android.graphics.Bitmap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.SnapshotReadyCallback#public-abstract-void-onsnapshotready-bitmap-snapshot">https://developers.google.com/android/reference/com/google/android/gms/maps/GoogleMap.SnapshotReadyCallback#public-abstract-void-onsnapshotready-bitmap-snapshot</a><br/>
             *
             * @param param0 A bitmap containing the map as it is currently rendered, or null if the snapshot could not be taken
             */
            public void onSnapshotReady(android.graphics.Bitmap param0) {
                if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback) this.getHInstance()).onSnapshotReady(param0)");
                    ((com.huawei.hms.maps.HuaweiMap.SnapshotReadyCallback) this.getHInstance()).onSnapshotReady(param0);
                } else {
                    org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback) this.getGInstance()).onSnapshotReady(param0)");
                    ((com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback) this.getGInstance()).onSnapshotReady(param0);
                }
            }
        }
    }
}