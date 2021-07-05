package org.xms.g.maps;

/**
 * A class containing methods for creating CameraUpdate objects that change a map's camera .<br/>
 * Combination of com.huawei.hms.maps.CameraUpdateFactory and com.google.android.gms.maps.CameraUpdateFactory.<br/>
 * com.huawei.hms.maps.CameraUpdateFactory: Contains various methods for creating CameraUpdate objects that modify the camera of a map.<br/>
 * com.google.android.gms.maps.CameraUpdateFactory: A class containing methods for creating CameraUpdate objects that change a map's camera. To modify the map's camera, call animateCamera(CameraUpdate), animateCamera(CameraUpdate, GoogleMap.CancelableCallback)or moveCamera(CameraUpdate), using a CameraUpdate object created with this class.<br/>
 */
public final class CameraUpdateFactory extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.CameraUpdateFactory.CameraUpdateFactory(org.xms.g.utils.XBox) constructor of CameraUpdateFactory.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 this param is utils XBox
     */
    public CameraUpdateFactory(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.newCameraPosition(org.xms.g.maps.model.CameraPosition) Returns a CameraUpdate that moves the camera to a specified CameraPosition. In effect, this creates a transformation from the CameraPosition object's latitude, longitude, zoom level, bearing and tilt.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.newCameraPosition(com.huawei.hms.maps.model.CameraPosition): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#newCameraPosition(CameraPosition)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#newCameraPosition(CameraPosition)</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(com.google.android.gms.maps.model.CameraPosition): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-methods">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-methods</a><br/>
     *
     * @param param0 the param should instanceof maps model CameraPosition
     * @return a CameraUpdate containing the transformation
     */
    public static final org.xms.g.maps.CameraUpdate newCameraPosition(org.xms.g.maps.model.CameraPosition param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newCameraPosition(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newCameraPosition(((com.huawei.hms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(((com.google.android.gms.maps.model.CameraPosition) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.newLatLng(org.xms.g.maps.model.LatLng) Returns a CameraUpdate that moves the center of the screen to a latitude and longitude specified by a LatLng object. This centers the camera on the LatLng object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.newLatLng(com.huawei.hms.maps.model.LatLng): <a href="https://developer.huawei.com/consumer/cn/doc/development/HMS-References/hms-map-cameraupdatef#newLatLng(LatLng)">https://developer.huawei.com/consumer/cn/doc/development/HMS-References/hms-map-cameraupdatef#newLatLng(LatLng)</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.newLatLng(com.google.android.gms.maps.model.LatLng): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-newlatlng-latlng-latlng">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-newlatlng-latlng-latlng</a><br/>
     *
     * @param param0 a LatLng object containing the desired latitude and longitude
     * @return a CameraUpdate containing the transformation
     */
    public static final org.xms.g.maps.CameraUpdate newLatLng(org.xms.g.maps.model.LatLng param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newLatLng(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newLatLng(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newLatLng(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newLatLng(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    public static final org.xms.g.maps.CameraUpdate newLatLngBounds(org.xms.g.maps.model.LatLngBounds param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.newLatLngBounds(org.xms.g.maps.model.LatLngBounds,int,int,int) Returns a CameraUpdate that transforms the camera such that the specified latitude/longitude bounds are centered on screen within a bounding box of specified dimensions at the greatest possible zoom level.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(com.huawei.hms.maps.model.LatLngBounds,int,int,int): <a href="https://developer.huawei.com/consumer/cn/doc/development/HMS-References/hms-map-cameraupdatef#newLatLngBounds(LatLngBounds,int,int,int)">https://developer.huawei.com/consumer/cn/doc/development/HMS-References/hms-map-cameraupdatef#newLatLngBounds(LatLngBounds,int,int,int)</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds,int,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-newlatlngbounds-latlngbounds-bounds,-int-width,-int-height,-int-padding">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-newlatlngbounds-latlngbounds-bounds,-int-width,-int-height,-int-padding</a><br/>
     *
     * @param param0 the param should instanceof maps model LatLng Bounds
     * @param param1 the param should instanceof int
     * @param param2 the param should instanceof int
     * @param param3 the param should instanceof int
     * @return the return object is CameraUpdate
     */
    public static final org.xms.g.maps.CameraUpdate newLatLngBounds(org.xms.g.maps.model.LatLngBounds param0, int param1, int param2, int param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))), param1, param2, param3)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newLatLngBounds(((com.huawei.hms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getHInstance()))), param1, param2, param3);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))), param1, param2, param3)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(((com.google.android.gms.maps.model.LatLngBounds) ((param0) == null ? null : (param0.getGInstance()))), param1, param2, param3);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.newLatLngZoom(org.xms.g.maps.model.LatLng,float) Returns a CameraUpdate that moves the center of the screen to a latitude and longitude specified by a LatLng object, and moves to the given zoom level.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.newLatLngZoom(com.huawei.hms.maps.model.LatLng,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#newLatLngZoom(LatLng,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#newLatLngZoom(LatLng,float)</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(com.google.android.gms.maps.model.LatLng,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-newlatlngzoom-latlng-latlng,-float-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-newlatlngzoom-latlng-latlng,-float-zoom</a><br/>
     *
     * @param param0 the desired zoom level, in the range of 2.0 to 21.0. Values below this range are set to 2.0, and values above it are set to 21.0. Increase the value to zoom in. Not all areas have tiles at the largest zoom levels
     * @param param1 a LatLng object containing the desired latitude and longitude
     * @return a CameraUpdate containing the transformation
     */
    public static final org.xms.g.maps.CameraUpdate newLatLngZoom(org.xms.g.maps.model.LatLng param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.newLatLngZoom(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.newLatLngZoom(((com.huawei.hms.maps.model.LatLng) ((param0) == null ? null : (param0.getHInstance()))), param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(((com.google.android.gms.maps.model.LatLng) ((param0) == null ? null : (param0.getGInstance()))), param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.scrollBy(float,float) Returns a CameraUpdate that scrolls the camera over the map, shifting the center of view by the specified number of pixels in the x and y directions.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.scrollBy(float,float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#scrollBy(float,float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#scrollBy(float,float)</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.scrollBy(float,float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-scrollby-float-xpixel,-float-ypixel">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-scrollby-float-xpixel,-float-ypixel</a><br/>
     *
     * @param param0 the number of pixels to scroll horizontally. A positive value moves the camera to the right, with respect to its current orientation. A negative value moves the camera to the left, with respect to its current orientation
     * @param param1 the number of pixels to scroll vertically. A positive value moves the camera downwards, with respect to its current orientation. A negative value moves the camera upwards, with respect to its current orientation
     * @return a CameraUpdate containing the transformation
     */
    public static org.xms.g.maps.CameraUpdate scrollBy(float param0, float param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.scrollBy(param0, param1)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.scrollBy(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.scrollBy(param0, param1)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.scrollBy(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.zoomBy(float,android.graphics.Point) Changes the zoom level by a specified amount and sets a specified point as the focus.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.zoomBy(float,android.graphics.Point): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomBy(float,PointF)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomBy(float,PointF)</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.zoomBy(float,android.graphics.Point): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomby-float-amount,-point-focus">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomby-float-amount,-point-focus</a><br/>
     *
     * @param param0 this params is float
     * @param param1 the param is android graphics Point
     * @return the return object is maps CameraUpdate
     */
    public static final org.xms.g.maps.CameraUpdate zoomBy(float param0, android.graphics.Point param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomBy(param0, param1)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomBy(param0, param1);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomBy(param0, param1)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomBy(param0, param1);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.zoomBy(float) Changes the zoom level of the camera by a specified value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.zoomBy(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomBy(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomBy(float)</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.zoomBy(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomby-float-amount">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomby-float-amount</a><br/>
     *
     * @param param0 amount to change the zoom level. Positive values indicate zooming closer to the surface of the Earth while negative values indicate zooming away from the surface of the Earth
     * @return a CameraUpdate containing the transformation
     */
    public static org.xms.g.maps.CameraUpdate zoomBy(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomBy(param0)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomBy(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomBy(param0)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomBy(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.zoomIn() Increases the zoom level of the camera by1.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.zoomIn(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomIn()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomIn()</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.zoomIn(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomin">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomin</a><br/>
     *
     * @return a CameraUpdate containing the transformation
     */
    public static org.xms.g.maps.CameraUpdate zoomIn() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomIn()");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomIn();
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomIn()");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomIn();
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.zoomOut() Decreases the zoom level of the camera by1.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.zoomOut(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomOut()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomOut()</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.zoomOut(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomout">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomout</a><br/>
     *
     * @return a CameraUpdate containing the transformation
     */
    public static org.xms.g.maps.CameraUpdate zoomOut() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomOut()");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomOut();
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomOut()");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomOut();
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.zoomTo(float) Sets the zoom level of the camera to a specified value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.CameraUpdateFactory.zoomTo(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomTo(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-cameraupdatef#zoomTo(float)</a><br/>
     * com.google.android.gms.maps.CameraUpdateFactory.zoomTo(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomto-float-zoom">https://developers.google.com/android/reference/com/google/android/gms/maps/CameraUpdateFactory#public-static-cameraupdate-zoomto-float-zoom</a><br/>
     *
     * @param param0 the desired zoom level, in the range of 2.0 to 21.0. Values below this range are set to 2.0, and values above it are set to 21.0. Increase the value to zoom in. Not all areas have tiles at the largest zoom levels
     * @return the return object is maps CameraUpdate
     */
    public static org.xms.g.maps.CameraUpdate zoomTo(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.CameraUpdateFactory.zoomTo(param0)");
            com.huawei.hms.maps.CameraUpdate hReturn = com.huawei.hms.maps.CameraUpdateFactory.zoomTo(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.CameraUpdateFactory.zoomTo(param0)");
            com.google.android.gms.maps.CameraUpdate gReturn = com.google.android.gms.maps.CameraUpdateFactory.zoomTo(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.CameraUpdate(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.CameraUpdateFactory.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps CameraUpdateFactory object
     */
    public static org.xms.g.maps.CameraUpdateFactory dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.CameraUpdateFactory) param0);
    }

    /**
     * org.xms.g.maps.CameraUpdateFactory.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.CameraUpdateFactory;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.CameraUpdateFactory;
        }
    }
}