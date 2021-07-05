package org.xms.g.maps.model;

/**
 * Used to create a definition of a Bitmap image.<br/>
 * Combination of com.huawei.hms.maps.model.BitmapDescriptorFactory and com.google.android.gms.maps.model.BitmapDescriptorFactory.<br/>
 * com.huawei.hms.maps.model.BitmapDescriptorFactory: Creates the definition of a bitmap image.<br/>
 * com.google.android.gms.maps.model.BitmapDescriptorFactory: Used to create a definition of a Bitmap image, used for marker icons and ground overlays.<br/>
 */
public final class BitmapDescriptorFactory extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.BitmapDescriptorFactory(org.xms.g.utils.XBox) Used to create a definition of a Bitmap image, used for marker icons and ground overlays.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public BitmapDescriptorFactory(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_AZURE() Constant Value: 210.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_AZURE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_AZURE: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_azure">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_azure</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_AZURE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_AZURE");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_AZURE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_AZURE");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_AZURE;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_BLUE() Constant Value: 240.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_BLUE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_BLUE: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_blue">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_blue</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_BLUE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_BLUE");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_BLUE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_BLUE");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_BLUE;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_CYAN() Constant Value: 180.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_CYAN: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_CYAN: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_cyan">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_cyan</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_CYAN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_CYAN");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_CYAN;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_CYAN");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_CYAN;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_GREEN() Constant Value: 120.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_GREEN: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_GREEN: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_green">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_green</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_GREEN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_GREEN");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_GREEN;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_GREEN");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_GREEN;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_MAGENTA() Constant Value: 300.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_MAGENTA: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_MAGENTA: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_magenta">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_magenta</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_MAGENTA() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_MAGENTA");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_MAGENTA;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_MAGENTA");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_MAGENTA;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_ORANGE() Constant Value: 30.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_ORANGE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_ORANGE: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_orange">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_orange</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_ORANGE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_ORANGE");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_ORANGE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_ORANGE");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_ORANGE;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_RED() Constant Value: 0.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_rose">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_rose</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_RED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_RED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_ROSE() Constant Value: 330.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_ROSE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_ROSE: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_rose">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_rose</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_ROSE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_ROSE");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_ROSE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_ROSE");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_ROSE;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_VIOLET() Constant Value: 270.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_VIOLET: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_VIOLET: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_violet">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_violet</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_VIOLET() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_VIOLET");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_VIOLET;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_VIOLET");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_VIOLET;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.getHUE_YELLOW() Constant Value: 60.0.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_YELLOW: <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_YELLOW: <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_yellow">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-final-float-hue_yellow</a><br/>
     *
     * @return the return object is float
     */
    public static float getHUE_YELLOW() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_YELLOW");
            return com.huawei.hms.maps.model.BitmapDescriptorFactory.HUE_YELLOW;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_YELLOW");
            return com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_YELLOW;
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.defaultMarker(float) Creates a BitmapDescriptor that refers to a colorization of the default marker image. For convenience, there is a predefined set of hue values. See example HUE_YELLOW.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.defaultMarker(float): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#defaultMarker(float)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#defaultMarker(float)</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(float): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-defaultmarker-float-hue">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-defaultmarker-float-hue</a><br/>
     *
     * @param param0 the param should instanceof float
     * @return the return object is maps model BitmapDescriptor
     */
    public static org.xms.g.maps.model.BitmapDescriptor defaultMarker(float param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.defaultMarker(param0)");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = com.huawei.hms.maps.model.BitmapDescriptorFactory.defaultMarker(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(param0)");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.defaultMarker() Creates a BitmapDescriptor that refers to the default marker image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.defaultMarker(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#defaultMarker()">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#defaultMarker()</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-defaultmarker">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-defaultmarker</a><br/>
     *
     * @return the return object is maps model BitmapDescriptor
     */
    public static org.xms.g.maps.model.BitmapDescriptor defaultMarker() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.defaultMarker()");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = com.huawei.hms.maps.model.BitmapDescriptorFactory.defaultMarker();
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker()");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = com.google.android.gms.maps.model.BitmapDescriptorFactory.defaultMarker();
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.fromAsset(java.lang.String) Creates a BitmapDescriptor using the name of a Bitmap image in the assets directory.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.fromAsset(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromAsset(String)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromAsset(String)</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.fromAsset(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-fromasset-string-assetname">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-fromasset-string-assetname</a><br/>
     *
     * @param param0 The name of a Bitmap image in the assets directory
     * @return the BitmapDescriptor that was loaded from the asset or null if failed to load
     */
    public static final org.xms.g.maps.model.BitmapDescriptor fromAsset(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.fromAsset(param0)");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = com.huawei.hms.maps.model.BitmapDescriptorFactory.fromAsset(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.fromAsset(param0)");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromAsset(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.fromBitmap(android.graphics.Bitmap) Creates a BitmapDescriptor from a given Bitmap image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(android.graphics.Bitmap): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromBitmap(Bitmap)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromBitmap(Bitmap)</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(android.graphics.Bitmap): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-frombitmap-bitmap-image">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-frombitmap-bitmap-image</a><br/>
     *
     * @param param0 the param should instanceof android graphics Bitmap
     * @return the return object is maps model BitmapDescriptor
     */
    public static final org.xms.g.maps.model.BitmapDescriptor fromBitmap(android.graphics.Bitmap param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(param0)");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = com.huawei.hms.maps.model.BitmapDescriptorFactory.fromBitmap(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(param0)");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromBitmap(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.fromFile(java.lang.String) Creates a BitmapDescriptor using the name of a Bitmap image file located in the internal storage. In particular, this calls openFileInput(String).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.fromFile(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromFile(String)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromFile(String)</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.fromFile(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-fromfile-string-filename">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-fromfile-string-filename</a><br/>
     *
     * @param param0 The name of the Bitmap image file
     * @return the BitmapDescriptor that was loaded from the asset or null if failed to load
     */
    public static final org.xms.g.maps.model.BitmapDescriptor fromFile(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.fromFile(param0)");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = com.huawei.hms.maps.model.BitmapDescriptorFactory.fromFile(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.fromFile(param0)");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromFile(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.fromPath(java.lang.String) Creates a BitmapDescriptor from the absolute file path of a Bitmap image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.fromPath(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromPath(String)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromPath(String)</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.fromPath(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-frompath-string-absolutepath">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-frompath-string-absolutepath</a><br/>
     *
     * @param param0 The absolute path of the Bitmap image
     * @return the BitmapDescriptor that was loaded from the absolute path or null if failed to load
     */
    public static final org.xms.g.maps.model.BitmapDescriptor fromPath(java.lang.String param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.fromPath(param0)");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = com.huawei.hms.maps.model.BitmapDescriptorFactory.fromPath(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.fromPath(param0)");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromPath(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.fromResource(int) Creates a BitmapDescriptor using the resource ID of a Bitmap image.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.BitmapDescriptorFactory.fromResource(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromResource(int)">https://developer.huawei.com/consumer/en/doc/development/HMS-References/hms-map-bitmapdescriptorf#fromResource(int)</a><br/>
     * com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-fromresource-int-resourceid">https://developers.google.com/android/reference/com/google/android/gms/maps/model/BitmapDescriptorFactory#public-static-bitmapdescriptor-fromresource-int-resourceid</a><br/>
     *
     * @param param0 The resource ID of a Bitmap image
     * @return the BitmapDescriptor that was loaded from the asset or null if failed to load
     */
    public static org.xms.g.maps.model.BitmapDescriptor fromResource(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.maps.model.BitmapDescriptorFactory.fromResource(param0)");
            com.huawei.hms.maps.model.BitmapDescriptor hReturn = com.huawei.hms.maps.model.BitmapDescriptorFactory.fromResource(param0);
            return ((hReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(param0)");
            com.google.android.gms.maps.model.BitmapDescriptor gReturn = com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(param0);
            return ((gReturn) == null ? null : (new org.xms.g.maps.model.BitmapDescriptor(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.BitmapDescriptorFactory.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model BitmapDescriptorFactory object
     */
    public static org.xms.g.maps.model.BitmapDescriptorFactory dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.BitmapDescriptorFactory) param0);
    }

    /**
     * org.xms.g.maps.model.BitmapDescriptorFactory.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.BitmapDescriptorFactory;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.BitmapDescriptorFactory;
        }
    }
}