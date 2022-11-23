package org.xms.g.maps;

/**
 * Use this class to initialize the Maps SDK for Android if features need to be used before obtaining a map.<br/>
 * Combination of com.huawei.hms.maps.MapsInitializer and com.google.android.gms.maps.MapsInitializer.<br/>
 * com.huawei.hms.maps.MapsInitializer: final class that extends Object. If certain features need to be used before a map is obtained, use this class to initialize the HMS Core Map SDK.<br/>
 * com.google.android.gms.maps.MapsInitializer: Use this class to initialize the Google Maps SDK for Android if features need to be used before obtaining a map. It must be called because some classes such as BitmapDescriptorFactory and CameraUpdateFactory need to be initialized.<br/>
 */
public final class MapsInitializer extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.MapsInitializer.MapsInitializer(org.xms.g.utils.XBox) A final class that extends Object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public MapsInitializer(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.MapsInitializer.initialize(android.content.Context) Initializes the Google Maps SDK for Android so that its classes are ready for use.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.MapsInitializer.initialize(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapsinitializer#initialize(Context)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-mapsinitializer#initialize(Context)</a><br/>
     * com.google.android.gms.maps.MapsInitializer.initialize(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/MapsInitializer#public-static-synchronized-int-initialize-context-context">https://developers.google.com/android/reference/com/google/android/gms/maps/MapsInitializer#public-static-synchronized-int-initialize-context-context</a><br/>
     *
     * @param param0 Required to fetch the necessary SDK resources and code. Must not be null
     * @return A ConnectionResult error code
     */
    public static final int initialize(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.MapsInitializer.initialize(param0)");
            com.huawei.hms.maps.MapsInitializer.initialize(param0);
            return 0;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.MapsInitializer.initialize(param0)");
            return com.google.android.gms.maps.MapsInitializer.initialize(param0);
        }
    }

    /**
     * org.xms.g.maps.MapsInitializer.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.MapsInitializer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps MapsInitializer object
     */
    public static org.xms.g.maps.MapsInitializer dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.MapsInitializer) param0);
    }

    /**
     * org.xms.g.maps.MapsInitializer.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.MapsInitializer;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.MapsInitializer;
        }
    }
}