package org.xms.g.maps.model;

/**
 * Defines a Bitmap image.<br/>
 * Combination of com.huawei.hms.maps.model.BitmapDescriptor and com.google.android.gms.maps.model.BitmapDescriptor.<br/>
 * com.huawei.hms.maps.model.BitmapDescriptor: Defines a bitmap image. You can obtain a BitmapDescriptor using BitmapDescriptorFactory. A bitmap image can be used for a marker icon or ground overlay.<br/>
 * com.google.android.gms.maps.model.BitmapDescriptor: Defines a Bitmap image. For a marker, this class can be used to set the image of the marker icon. For a ground overlay, it can be used to set the image to place on the surface of the earth. To obtain a BitmapDescriptor use the factory class BitmapDescriptorFactory.<br/>
 */
public final class BitmapDescriptor extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.BitmapDescriptor.BitmapDescriptor(org.xms.g.utils.XBox) Defines a Bitmap image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public BitmapDescriptor(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptor.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.BitmapDescriptor.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model BitmapDescriptor object
     */
    public static org.xms.g.maps.model.BitmapDescriptor dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.BitmapDescriptor) param0);
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptor.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.BitmapDescriptor;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.BitmapDescriptor;
        }
    }
}