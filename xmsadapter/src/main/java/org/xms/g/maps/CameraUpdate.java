package org.xms.g.maps;

/**
 * Defines a camera move.<br/>
 * Combination of com.huawei.hms.maps.CameraUpdate and com.google.android.gms.maps.CameraUpdate.<br/>
 * com.huawei.hms.maps.CameraUpdate: Defines a camera move. You can call animateCamera(CameraUpdate) or moveCamera(CameraUpdate) to move the camera of a map. To obtain a CameraUpdate object, use the CameraUpdateFactory class by referring to the class description.<br/>
 * com.google.android.gms.maps.CameraUpdate: Defines a camera move. An object of this type can be used to modify a map's camera by calling animateCamera(CameraUpdate), animateCamera(CameraUpdate, GoogleMap.CancelableCallback)or moveCamera(CameraUpdate).<br/>
 */
public final class CameraUpdate extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.CameraUpdate.CameraUpdate(org.xms.g.utils.XBox) Defines a camera move.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public CameraUpdate(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.CameraUpdate.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.CameraUpdate.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps CameraUpdate object
     */
    public static org.xms.g.maps.CameraUpdate dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.CameraUpdate) param0);
    }

    /**
     * org.xms.g.maps.CameraUpdate.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.CameraUpdate;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.CameraUpdate;
        }
    }
}