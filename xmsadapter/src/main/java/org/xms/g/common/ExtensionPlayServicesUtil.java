package org.xms.g.common;


/**
 * Utility class for verifying that the services APK is available and up-to-date on this device. The same checks are performed if one want to connect to the service.<br/>
 * Combination of com.huawei.hms.api.HuaweiMobileServicesUtil and com.google.android.gms.common.GooglePlayServicesUtil.<br/>
 * com.huawei.hms.api.HuaweiMobileServicesUtil: the HuaweiMobileServicesUtil.<br/>
 * com.google.android.gms.common.GooglePlayServicesUtil: Utility class for verifying that the Google Play services APK is available and up-to-date on this device. The same checks are performed if one uses AdvertisingIdClient or GoogleAuthUtil to connect to the service.<br/>
 */
public final class ExtensionPlayServicesUtil extends org.xms.g.utils.XObject {


    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.ExtensionPlayServicesUtil(org.xms.g.utils.XBox) constructor of ExtensionPlayServicesUtil with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionPlayServicesUtil(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getGMS_ERROR_DIALOG() return the value of GMS_ERROR_DIALOG.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.HMS_ERROR_DIALOG
     * com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-final-string-gms_error_dialog">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-final-string-gms_error_dialog</a><br/>
     *
     * @return java.lang.String Constant Value: "GooglePlayServicesErrorDialog"
     */
    public static java.lang.String getGMS_ERROR_DIALOG() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.HMS_ERROR_DIALOG");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.HMS_ERROR_DIALOG;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG");
            return com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG;
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getGOOGLE_PLAY_SERVICES_PACKAGE() return the value of GOOGLE_PLAY_SERVICES_PACKAGE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_PACKAGE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-final-string-google_play_services_package">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-final-string-google_play_services_package</a><br/>
     *
     * @return Package name for Google Play services
     */
    public static java.lang.String getGOOGLE_PLAY_SERVICES_PACKAGE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getGOOGLE_PLAY_STORE_PACKAGE() return the value of GOOGLE_PLAY_STORE_PACKAGE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_STORE_PACKAGE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-final-string-google_play_store_package">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-final-string-google_play_store_package</a><br/>
     *
     * @return Package name for Google Play Store
     */
    public static java.lang.String getGOOGLE_PLAY_STORE_PACKAGE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getGOOGLE_PLAY_SERVICES_VERSION_CODE() return the value of GOOGLE_PLAY_SERVICES_VERSION_CODE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.SERVICES_VERSION_CODE
     * com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-final-int-google_play_services_version_code">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-final-int-google_play_services_version_code</a><br/>
     *
     * @return Google Play services client library version
     */
    public static int getGOOGLE_PLAY_SERVICES_VERSION_CODE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiAvailability.SERVICES_VERSION_CODE");
            return com.huawei.hms.api.HuaweiApiAvailability.SERVICES_VERSION_CODE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE");
            return com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getErrorDialog(int,android.app.Activity,int) Returns a dialog to address the provided errorCode.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorDialog(int,android.app.Activity,int)
     * com.google.android.gms.common.GooglePlayServicesUtil.getErrorDialog(int,android.app.Activity,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-dialog-geterrordialog-int-errorcode,-activity-activity,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-dialog-geterrordialog-int-errorcode,-activity-activity,-int-requestcode</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then null is returned
     * @param param1 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param2 The requestCode given when calling startActivityForResult
     * @return android.app.Dialog the Dialog
     */
    public static android.app.Dialog getErrorDialog(int param0, android.app.Activity param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorDialog(param0, param1, param2)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorDialog(param0, param1, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.getErrorDialog(param0, param1, param2)");
            return com.google.android.gms.common.GooglePlayServicesUtil.getErrorDialog(param0, param1, param2);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getErrorDialog(int,android.app.Activity,int,android.content.DialogInterface.OnCancelListener) Returns a dialog to address the provided errorCode.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorDialog(int,android.app.Activity,int,android.content.DialogInterface.OnCancelListener)
     * com.google.android.gms.common.GooglePlayServicesUtil.getErrorDialog(int,android.app.Activity,int,android.content.DialogInterface.OnCancelListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-dialog-geterrordialog-int-errorcode,-activity-activity,-int-requestcode,-dialoginterface.oncancellistener-cancellistener">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-dialog-geterrordialog-int-errorcode,-activity-activity,-int-requestcode,-dialoginterface.oncancellistener-cancellistener</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then null is returned
     * @param param1 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param2 The requestCode given when calling startActivityForResult
     * @param param3 The DialogInterface.OnCancelListener to invoke if the dialog is canceled
     * @return android.app.Dialog the Dialog
     */
    public static android.app.Dialog getErrorDialog(int param0, android.app.Activity param1, int param2, android.content.DialogInterface.OnCancelListener param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorDialog(param0, param1, param2, param3)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorDialog(param0, param1, param2, param3);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.getErrorDialog(param0, param1, param2, param3)");
            return com.google.android.gms.common.GooglePlayServicesUtil.getErrorDialog(param0, param1, param2, param3);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getErrorPendingIntent(int,android.content.Context,int) Returns a PendingIntent to address the provided errorCode.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.getErrPendingIntent(android.content.Context,int,int)
     * com.google.android.gms.common.GooglePlayServicesUtil.getErrorPendingIntent(int,android.content.Context,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-pendingintent-geterrorpendingintent-int-errorcode,-context-context,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-pendingintent-geterrorpendingintent-int-errorcode,-context-context,-int-requestcode</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then null is returned
     * @param param1 parent context for creating the PendingIntent
     * @param param2 The requestCode given when calling startActivityForResult
     * @return the pendingIntent to address the provided errorCode
     */
    public static android.app.PendingIntent getErrorPendingIntent(int param0, android.content.Context param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiAvailability.getInstance().getErrPendingIntent(param1,param0,param2)");
            return com.huawei.hms.api.HuaweiApiAvailability.getInstance().getErrPendingIntent(param1, param0, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.getErrorPendingIntent(param0, param1, param2)");
            return com.google.android.gms.common.GooglePlayServicesUtil.getErrorPendingIntent(param0, param1, param2);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getErrorString(int) Returns a human-readable string of the error code returned from isGooglePlayServicesAvailable(Context).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorString(int)
     * com.google.android.gms.common.GooglePlayServicesUtil.getErrorString(int)
     *
     * @param param0 the errorCode
     * @return the string of this errorCode
     */
    public static java.lang.String getErrorString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorString(param0)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.getErrorString(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.getErrorString(param0)");
            return com.google.android.gms.common.GooglePlayServicesUtil.getErrorString(param0);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getRemoteContext(android.content.Context) This gets the Context object of the Buddy APK. This loads the Buddy APK code from the Buddy APK into memory. This returned context can be used to create classes and obtain resources defined in the Buddy APK.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.getRemoteContext(android.content.Context)
     * com.google.android.gms.common.GooglePlayServicesUtil.getRemoteContext(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-context-getremotecontext-context-context">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-context-getremotecontext-context-context</a><br/>
     *
     * @param param0 the context
     * @return The Context object of the Buddy APK or null if the Buddy APK is not installed on the device
     */
    public static final android.content.Context getRemoteContext(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.getRemoteContext(param0)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.getRemoteContext(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.getRemoteContext(param0)");
            return com.google.android.gms.common.GooglePlayServicesUtil.getRemoteContext(param0);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.getRemoteResource(android.content.Context) This gets the Resources object of the Buddy APK.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.getRemoteResource(android.content.Context)
     * com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-resources-getremoteresource-context-context">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-resources-getremoteresource-context-context</a><br/>
     *
     * @param param0 the context
     * @return The Resources object of the Buddy APK or null if the Buddy APK is not installed on the device
     */
    public static final android.content.res.Resources getRemoteResource(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.getRemoteResource(param0)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.getRemoteResource(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(param0)");
            return com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(param0);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.isGooglePlayServicesAvailable(android.content.Context) Verifies that Google Play services is installed and enabled on this device, and that the version installed on this device is no older than the one required by this client.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(android.content.Context)
     * com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-int-isgoogleplayservicesavailable-context-context">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-int-isgoogleplayservicesavailable-context-context</a><br/>
     *
     * @param param0 the context
     * @return status code indicating whether there was an error. Can be one of following in ConnectionResult: SUCCESS, SERVICE_MISSING, SERVICE_VERSION_UPDATE_REQUIRED, SERVICE_DISABLED, SERVICE_INVALID
     */
    public static int isGooglePlayServicesAvailable(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(param0)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(param0)");
            return com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(param0);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.isGooglePlayServicesAvailable(android.content.Context,int) Verifies that Google Play services is installed and enabled on this device, and that the version installed on this device is no older than the one required by this client or the version is not older than the one specified in minApkVersion.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(android.content.Context,int)
     * com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(android.content.Context,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-int-isgoogleplayservicesavailable-context-context,-int-minapkversion">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-int-isgoogleplayservicesavailable-context-context,-int-minapkversion</a><br/>
     *
     * @param param0 the context
     * @param param1 min Apk Version
     * @return status code indicating whether there was an error. Can be one of following in ConnectionResult: SUCCESS, SERVICE_MISSING, SERVICE_VERSION_UPDATE_REQUIRED, SERVICE_DISABLED, SERVICE_INVALID
     */
    public static int isGooglePlayServicesAvailable(android.content.Context param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(param0, param1)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(param0, param1)");
            return com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(param0, param1);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.isUserRecoverableError(int) Determines whether an error is user-recoverable. If true, proceed by calling getErrorDialog(int, Activity, int) and showing the dialog.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.isUserRecoverableError(int)
     * com.google.android.gms.common.GooglePlayServicesUtil.isUserRecoverableError(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-boolean-isuserrecoverableerror-int-errorcode">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-boolean-isuserrecoverableerror-int-errorcode</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context), or returned to your application via GoogleApiClient.OnConnectionFailedListener#onConnectionFailed
     * @return true if the error is recoverable with getErrorDialog(int, Activity, int)
     */
    public static boolean isUserRecoverableError(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.isUserRecoverableError(param0)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.isUserRecoverableError(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.isUserRecoverableError(param0)");
            return com.google.android.gms.common.GooglePlayServicesUtil.isUserRecoverableError(param0);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.showErrorDialogFragment(int,android.app.Activity,int,android.content.DialogInterface.OnCancelListener) Display a DialogFragment for an error code returned by isGooglePlayServicesAvailable(Context).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.popupErrDlgFragment(int,android.app.Activity,int,android.content.DialogInterface.OnCancelListener)
     * com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(int,android.app.Activity,int,android.content.DialogInterface.OnCancelListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-boolean-showerrordialogfragment-int-errorcode,-activity-activity,-int-requestcode,-dialoginterface.oncancellistener-cancellistener">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-boolean-showerrordialogfragment-int-errorcode,-activity-activity,-int-requestcode,-dialoginterface.oncancellistener-cancellistener</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then this does nothing
     * @param param1 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param2 The requestCode given when calling startActivityForResult
     * @param param3 The DialogInterface.OnCancelListener to invoke if the dialog is canceled
     * @return true if the dialog is shown, false otherwise
     */
    public static boolean showErrorDialogFragment(int param0, android.app.Activity param1, int param2, android.content.DialogInterface.OnCancelListener param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.popupErrDlgFragment(param0, param1, param2, param3)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.popupErrDlgFragment(param0, param1, param2, param3);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(param0, param1, param2, param3)");
            return com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(param0, param1, param2, param3);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.showErrorDialogFragment(int,android.app.Activity,androidx.fragment.app.Fragment,int,android.content.DialogInterface.OnCancelListener) Display a DialogFragment for an error code returned by isGooglePlayServicesAvailable(Context).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.popupErrDlgFragment(int,android.app.Activity,int,android.content.DialogInterface.OnCancelListener)
     * com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(int,android.app.Activity,androidx.fragment.app.Fragment,int,android.content.DialogInterface.OnCancelListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-boolean-showerrordialogfragment-int-errorcode,-activity-activity,-fragment-fragment,-int-requestcode,-dialoginterface.oncancellistener-cancellistener">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-boolean-showerrordialogfragment-int-errorcode,-activity-activity,-fragment-fragment,-int-requestcode,-dialoginterface.oncancellistener-cancellistener</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then this does nothing
     * @param param1 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param2 parent fragment for the dialog
     * @param param3 The requestCode given when calling startActivityForResult
     * @param param4 The DialogInterface.OnCancelListener to invoke if the dialog is canceled
     * @return true if the dialog is shown, false otherwise
     */
    public static boolean showErrorDialogFragment(int param0, android.app.Activity param1, androidx.fragment.app.Fragment param2, int param3, android.content.DialogInterface.OnCancelListener param4) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.popupErrDlgFragment(param0,param1,null,param3,param4)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.popupErrDlgFragment(param0, param1, null, param3, param4);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(param0, param1, param2, param3, param4)");
            return com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(param0, param1, param2, param3, param4);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.showErrorDialogFragment(int,android.app.Activity,int) Display a DialogFragment for an error code returned by isGooglePlayServicesAvailable(Context).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.showErrorDialogFragment(int,android.app.Activity,int)
     * com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(int,android.app.Activity,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-boolean-showerrordialogfragment-int-errorcode,-activity-activity,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-boolean-showerrordialogfragment-int-errorcode,-activity-activity,-int-requestcode</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then this does nothing
     * @param param1 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param2 The requestCode given when calling startActivityForResult
     * @return true if the dialog is shown, false otherwise
     */
    public static boolean showErrorDialogFragment(int param0, android.app.Activity param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.showErrorDialogFragment(param0, param1, param2)");
            return com.huawei.hms.api.HuaweiMobileServicesUtil.showErrorDialogFragment(param0, param1, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(param0, param1, param2)");
            return com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(param0, param1, param2);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.showErrorNotification(int,android.content.Context) Displays a notification relevant to the provided error code. This method is similar to getErrorDialog(int, android.app.Activity, int), but is provided for background tasks that cannot or shouldn't display dialogs.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiMobileServicesUtil.showErrorNotification(int,android.content.Context)
     * com.google.android.gms.common.GooglePlayServicesUtil.showErrorNotification(int,android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-void-showerrornotification-int-errorcode,-context-context">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesUtil#public-static-void-showerrornotification-int-errorcode,-context-context</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then null is returned
     * @param param1 used for identifying language to display dialog in as well as accessing the NotificationManager
     */
    public static final void showErrorNotification(int param0, android.content.Context param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiMobileServicesUtil.showErrorNotification(param0, param1)");
            com.huawei.hms.api.HuaweiMobileServicesUtil.showErrorNotification(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GooglePlayServicesUtil.showErrorNotification(param0, param1)");
            com.google.android.gms.common.GooglePlayServicesUtil.showErrorNotification(param0, param1);
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.ExtensionPlayServicesUtil.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionPlayServicesUtil object
     */
    public static org.xms.g.common.ExtensionPlayServicesUtil dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ExtensionPlayServicesUtil) param0);
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesUtil.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiMobileServicesUtil;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.GooglePlayServicesUtil;
        }
    }
}