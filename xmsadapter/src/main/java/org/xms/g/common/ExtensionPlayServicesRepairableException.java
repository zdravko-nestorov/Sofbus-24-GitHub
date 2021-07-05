package org.xms.g.common;

/**
 * ExtensionPlayServicesRepairableException are special instances of UserRecoverableExceptions which are thrown when services is not installed, up-to-date, or enabled. In these cases, client code can use getConnectionStatusCode() in conjunction with getErrorDialog(android.app.Activity, int, int) to provide users with a localized Dialog that will allow users to install, update, or otherwise enable services.<br/>
 * Combination of com.huawei.hms.api.HuaweiServicesRepairableException and com.google.android.gms.common.GooglePlayServicesRepairableException.<br/>
 * com.huawei.hms.api.HuaweiServicesRepairableException: the HuaweiServicesRepairableException.<br/>
 * com.google.android.gms.common.GooglePlayServicesRepairableException: GooglePlayServicesRepairableExceptions are special instances of UserRecoverableExceptions which are thrown when Google Play services is not installed, up-to-date, or enabled. In these cases, client code can use getConnectionStatusCode() in conjunction with getErrorDialog(android.app.Activity, int, int) to provide users with a localized Dialog that will allow users to install, update, or otherwise enable Google Play services.<br/>
 */
public class ExtensionPlayServicesRepairableException extends org.xms.g.common.UserRecoverableException {

    /**
     * org.xms.g.common.ExtensionPlayServicesRepairableException.ExtensionPlayServicesRepairableException(org.xms.g.utils.XBox) constructor of ExtensionPlayServicesRepairableException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionPlayServicesRepairableException(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesRepairableException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.ExtensionPlayServicesRepairableException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionPlayServicesRepairableException object
     */
    public static org.xms.g.common.ExtensionPlayServicesRepairableException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ExtensionPlayServicesRepairableException) param0);
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesRepairableException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiServicesRepairableException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.GooglePlayServicesRepairableException;
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesRepairableException.getConnectionStatusCode() Returns the ConnectionResult statusCode of the exception.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiServicesRepairableException.getConnectionStatusCode()
     * com.google.android.gms.common.GooglePlayServicesRepairableException.getConnectionStatusCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesRepairableException#public-int-getconnectionstatuscode">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesRepairableException#public-int-getconnectionstatuscode</a><br/>
     *
     * @return the ConnectionResult statusCode of the exception
     */
    public int getConnectionStatusCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiServicesRepairableException) this.getHInstance()).getConnectionStatusCode()");
            return ((com.huawei.hms.api.HuaweiServicesRepairableException) this.getHInstance()).getConnectionStatusCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GooglePlayServicesRepairableException) this.getGInstance()).getConnectionStatusCode()");
            return ((com.google.android.gms.common.GooglePlayServicesRepairableException) this.getGInstance()).getConnectionStatusCode();
        }
    }
}