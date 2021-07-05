package org.xms.g.common;

/**
 * Helper class for verifying that the services APK is available and up-to-date on this device.<br/>
 * Combination of com.huawei.hms.api.HuaweiApiAvailability and com.google.android.gms.common.GoogleApiAvailability.<br/>
 * com.huawei.hms.api.HuaweiApiAvailability: Obtains the HMS Core(APK) availability of the current device.<br/>
 * com.google.android.gms.common.GoogleApiAvailability: Helper class for verifying that the Google Play services APK is available and up-to-date on this device.<br/>
 */
public class ExtensionApiAvailability extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.ExtensionApiAvailability.ExtensionApiAvailability(org.xms.g.utils.XBox) constructor of ExtensionApiAvailability with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionApiAvailability(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.getGOOGLE_PLAY_SERVICES_PACKAGE() return the value of GOOGLE_PLAY_SERVICES_PACKAGE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.SERVICES_PACKAGE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section17814142883619">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section17814142883619</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_PACKAGE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-static-final-string-google_play_services_package">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-static-final-string-google_play_services_package</a><br/>
     *
     * @return Package name for services
     */
    public static java.lang.String getGOOGLE_PLAY_SERVICES_PACKAGE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiAvailability.SERVICES_PACKAGE");
            return com.huawei.hms.api.HuaweiApiAvailability.SERVICES_PACKAGE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_PACKAGE");
            return com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_PACKAGE;
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.getGOOGLE_PLAY_SERVICES_VERSION_CODE() return the value of GOOGLE_PLAY_SERVICES_VERSION_CODE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.SERVICES_VERSION_CODE
     * com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-static-final-int-google_play_services_version_code">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-static-final-int-google_play_services_version_code</a><br/>
     *
     * @return services client library version
     */
    public static int getGOOGLE_PLAY_SERVICES_VERSION_CODE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiAvailability.SERVICES_VERSION_CODE");
            return com.huawei.hms.api.HuaweiApiAvailability.SERVICES_VERSION_CODE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE");
            return com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.getInstance() Returns the singleton instance of GoogleApiAvailability.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.getInstance(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section58256100109">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section58256100109</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.getInstance(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-static-googleapiavailability-getinstance">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-static-googleapiavailability-getinstance</a><br/>
     *
     * @return the singleton instance of ExtensionApiAvailability
     */
    public static org.xms.g.common.ExtensionApiAvailability getInstance() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.HuaweiApiAvailability.getInstance()");
            com.huawei.hms.api.HuaweiApiAvailability hReturn = com.huawei.hms.api.HuaweiApiAvailability.getInstance();
            return ((hReturn) == null ? null : (new org.xms.g.common.ExtensionApiAvailability(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.GoogleApiAvailability.getInstance()");
            com.google.android.gms.common.GoogleApiAvailability gReturn = com.google.android.gms.common.GoogleApiAvailability.getInstance();
            return ((gReturn) == null ? null : (new org.xms.g.common.ExtensionApiAvailability(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.ExtensionApiAvailability.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionApiAvailability object
     */
    public static org.xms.g.common.ExtensionApiAvailability dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ExtensionApiAvailability) param0);
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiApiAvailability;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.GoogleApiAvailability;
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.tasks.Task<java.lang.Void> checkApiAvailability(org.xms.g.common.api.HasApiKey<?> param0, org.xms.g.common.api.HasApiKey<?>... param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.tasks.Task<java.lang.Void> checkApiAvailability(org.xms.g.common.api.ExtensionApi<?> param0, org.xms.g.common.api.ExtensionApi<?>... param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.getErrorDialog(android.app.Activity,int,int) Returns a dialog to address the provided errorCode,The returned dialog displays a localized message about the error and upon user confirmation (by tapping on dialog) will direct them to the Play Store if Google Play services is out of date or missing, or to system settings if Google Play services is disabled on the device.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.getErrorDialog(android.app.Activity,int,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section1127052113378">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section1127052113378</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.getErrorDialog(android.app.Activity,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-dialog-geterrordialog-activity-activity,-int-errorcode,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-dialog-geterrordialog-activity-activity,-int-errorcode,-int-requestcode</a><br/>
     *
     * @param param0 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param1 error code returned by isGooglePlayServicesAvailable(Context) call, If errorCode is SUCCESS then null is returned
     * @param param2 The requestCode given when calling startActivityForResult
     * @return the ErrorDialog
     */
    public android.app.Dialog getErrorDialog(android.app.Activity param0, int param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorDialog(param0, param1, param2)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorDialog(param0, param1, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorDialog(param0, param1, param2)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorDialog(param0, param1, param2);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.getErrorDialog(android.app.Activity,int,int,android.content.DialogInterface.OnCancelListener) Returns a dialog to address the provided errorCode. The returned dialog displays a localized message about the error and upon user confirmation(by tapping on dialog) will direct them to the Play Store if Google Play services is out of date or missing, or to system settings if Google Play services is disabled on the device.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.getErrorDialog(android.app.Activity,int,int,android.content.DialogInterface.OnCancelListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section1191865182210">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section1191865182210</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.getErrorDialog(android.app.Activity,int,int,android.content.DialogInterface.OnCancelListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-dialog-geterrordialog-activity-activity,-int-errorcode,-int-requestcode,-dialoginterface.oncancellistener-cancellistener">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-dialog-geterrordialog-activity-activity,-int-errorcode,-int-requestcode,-dialoginterface.oncancellistener-cancellistener</a><br/>
     *
     * @param param0 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param1 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then null is returned
     * @param param2 The requestCode given when calling startActivityForResult
     * @param param3 The DialogInterface.OnCancelListener to invoke if the dialog is canceled
     * @return the ErrorDialog
     */
    public android.app.Dialog getErrorDialog(android.app.Activity param0, int param1, int param2, android.content.DialogInterface.OnCancelListener param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorDialog(param0, param1, param2, param3)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorDialog(param0, param1, param2, param3);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorDialog(param0, param1, param2, param3)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorDialog(param0, param1, param2, param3);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.getErrorResolutionPendingIntent(android.content.Context,org.xms.g.common.ConnectionResult) Returns a PendingIntent to address the provided connection failure.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.getErrPendingIntent(android.content.Context,com.huawei.hms.api.ConnectionResult)
     * com.google.android.gms.common.GoogleApiAvailability.getErrorResolutionPendingIntent(android.content.Context,com.google.android.gms.common.ConnectionResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-pendingintent-geterrorresolutionpendingintent-context-context,-connectionresult-result">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-pendingintent-geterrorresolutionpendingintent-context-context,-connectionresult-result</a><br/>
     *
     * @param param0 parent context for creating the PendingIntent
     * @param param1 the connection failure. If successful or the error is not resolvable by the user, null is returned
     * @return the PendingIntent
     */
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context param0, org.xms.g.common.ConnectionResult param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrPendingIntent(param0, ((com.huawei.hms.api.ConnectionResult) ((param1) == null ? null : (param1.getHInstance()))))");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrPendingIntent(param0, ((com.huawei.hms.api.ConnectionResult) ((param1) == null ? null : (param1.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorResolutionPendingIntent(param0, ((com.google.android.gms.common.ConnectionResult) ((param1) == null ? null : (param1.getGInstance()))))");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorResolutionPendingIntent(param0, ((com.google.android.gms.common.ConnectionResult) ((param1) == null ? null : (param1.getGInstance()))));
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.getErrorResolutionPendingIntent(android.content.Context,int,int) Returns a PendingIntent to address the provided errorCode. It will direct the user to either the Play Store if Google Play services is out of date or missing, or system settings if Google Play services is disabled on the device.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.getErrPendingIntent(android.content.Context,int,int)
     * com.google.android.gms.common.GoogleApiAvailability.getErrorResolutionPendingIntent(android.content.Context,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-pendingintent-geterrorresolutionpendingintent-context-context,-int-errorcode,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-pendingintent-geterrorresolutionpendingintent-context-context,-int-errorcode,-int-requestcode</a><br/>
     *
     * @param param0 parent context for creating the PendingIntent
     * @param param1 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then null is returned
     * @param param2 The requestCode given when calling startActivityForResult
     * @return the PendingIntent
     */
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context param0, int param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrPendingIntent(param0, param1, param2)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrPendingIntent(param0, param1, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorResolutionPendingIntent(param0, param1, param2)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorResolutionPendingIntent(param0, param1, param2);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.getErrorString(int) Returns a human-readable string of the error code returned from isGooglePlayServicesAvailable(Context).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.getErrorString(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section1351393293818">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section1351393293818</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.getErrorString(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-final-string-geterrorstring-int-errorcode">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-final-string-geterrorstring-int-errorcode</a><br/>
     *
     * @param param0 the errorCode
     * @return the ErrorString
     */
    public final java.lang.String getErrorString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorString(param0)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getErrorString(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorString(param0)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).getErrorString(param0);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.isGooglePlayServicesAvailable(android.content.Context) Verifies that Google Play services is installed and enabled on this device, and that the version installed on this device is no older than the one required by this client.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.isHuaweiMobileServicesAvailable(android.content.Context): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section9492524178">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section9492524178</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-int-isgoogleplayservicesavailable-context-context">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-int-isgoogleplayservicesavailable-context-context</a><br/>
     *
     * @param param0 the Context
     * @return status code indicating whether there was an error. Can be one of following in ConnectionResult: SUCCESS, SERVICE_MISSING, SERVICE_UPDATING, SERVICE_VERSION_UPDATE_REQUIRED, SERVICE_DISABLED, SERVICE_INVALID
     */
    public int isGooglePlayServicesAvailable(android.content.Context param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isHuaweiMobileServicesAvailable(param0)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isHuaweiMobileServicesAvailable(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isGooglePlayServicesAvailable(param0)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isGooglePlayServicesAvailable(param0);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.isGooglePlayServicesAvailable(android.content.Context,int) Verifies that Google Play services is installed and enabled on this device, and that the version installed on this device is no older than the one required by this client or the version is not older than the one specified in minApkVersion.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.isHuaweiMobileServicesAvailable(android.content.Context,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section94164961715">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section94164961715</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.isGooglePlayServicesAvailable(android.content.Context,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-int-isgoogleplayservicesavailable-context-context,-int-minapkversion">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-int-isgoogleplayservicesavailable-context-context,-int-minapkversion</a><br/>
     *
     * @param param0 the context
     * @param param1 the minApkVersion
     * @return status code indicating whether there was an error. Can be one of following in ConnectionResult: SUCCESS, SERVICE_MISSING, SERVICE_UPDATING, SERVICE_VERSION_UPDATE_REQUIRED, SERVICE_DISABLED, SERVICE_INVALID
     */
    public int isGooglePlayServicesAvailable(android.content.Context param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isHuaweiMobileServicesAvailable(param0, param1)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isHuaweiMobileServicesAvailable(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isGooglePlayServicesAvailable(param0, param1)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isGooglePlayServicesAvailable(param0, param1);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.isUserResolvableError(int) Determines whether an error can be resolved via user action,If true, proceed by calling getErrorDialog(Activity,int,int) and showing the dialog.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.isUserResolvableError(int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section11471456162219">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section11471456162219</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.isUserResolvableError(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-final-boolean-isuserresolvableerror-int-errorcode">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-final-boolean-isuserresolvableerror-int-errorcode</a><br/>
     *
     * @param param0 error code returned by isGooglePlayServicesAvailable(Context), or returned to your application via #onConnectionFailed(ConnectionResult)
     * @return boolean true if the error is resolvable with getErrorDialog(Activity,int,int)
     */
    public final boolean isUserResolvableError(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isUserResolvableError(param0)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).isUserResolvableError(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isUserResolvableError(param0)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).isUserResolvableError(param0);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.makeGooglePlayServicesAvailable(android.app.Activity) Attempts to make Google Play services available on this device. If Play Services is already available, the returned Task may complete immediately.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.getHuaweiServicesReady(android.app.Activity)
     * com.google.android.gms.common.GoogleApiAvailability.makeGooglePlayServicesAvailable(android.app.Activity): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-taskvoid-makegoogleplayservicesavailable-activity-activity">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-taskvoid-makegoogleplayservicesavailable-activity-activity</a><br/>
     *
     * @param param0 the passed Activity that will be used to display UI
     * @return A Task. If this Task completes without throwing an exception, Play Services is available on this device
     */
    public org.xms.g.tasks.Task<java.lang.Void> makeGooglePlayServicesAvailable(android.app.Activity param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getHuaweiServicesReady(param0)");
            com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).getHuaweiServicesReady(param0);
            return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).makeGooglePlayServicesAvailable(param0)");
            com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).makeGooglePlayServicesAvailable(param0);
            return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public void setDefaultNotificationChannelId(android.content.Context param0, java.lang.String param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.showErrorDialogFragment(android.app.Activity,int,int) Displays a DialogFragment for an error code returned by isGooglePlayServicesAvailable(Context).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.showErrorDialogFragment(android.app.Activity,int,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section52231618134417">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section52231618134417</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.showErrorDialogFragment(android.app.Activity,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-boolean-showerrordialogfragment-activity-activity,-int-errorcode,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-boolean-showerrordialogfragment-activity-activity,-int-errorcode,-int-requestcode</a><br/>
     *
     * @param param0 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param1 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then this does nothing
     * @param param2 The requestCode given when calling startActivityForResult
     * @return true if the dialog is shown, false otherwise
     */
    public boolean showErrorDialogFragment(android.app.Activity param0, int param1, int param2) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorDialogFragment(param0, param1, param2)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorDialogFragment(param0, param1, param2);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorDialogFragment(param0, param1, param2)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorDialogFragment(param0, param1, param2);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.showErrorDialogFragment(android.app.Activity,int,int,android.content.DialogInterface.OnCancelListener) Displays a DialogFragment for an error code returned by isGooglePlayServicesAvailable(Context).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.showErrorDialogFragment(android.app.Activity,int,int,android.content.DialogInterface.OnCancelListener): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section421173818230">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section421173818230</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.showErrorDialogFragment(android.app.Activity,int,int,android.content.DialogInterface.OnCancelListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-boolean-showerrordialogfragment-activity-activity,-int-errorcode,-int-requestcode,-dialoginterface.oncancellistener-cancellistener">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-boolean-showerrordialogfragment-activity-activity,-int-errorcode,-int-requestcode,-dialoginterface.oncancellistener-cancellistener</a><br/>
     *
     * @param param0 parent activity for creating the dialog, also used for identifying language to display dialog in
     * @param param1 error code returned by isGooglePlayServicesAvailable(Context) call. If errorCode is SUCCESS then this does nothing
     * @param param2 The requestCode given when calling startActivityForResult
     * @param param3 The DialogInterface.OnCancelListener to invoke if the dialog is canceled
     * @return true if the dialog is shown, false otherwise
     */
    public boolean showErrorDialogFragment(android.app.Activity param0, int param1, int param2, android.content.DialogInterface.OnCancelListener param3) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorDialogFragment(param0, param1, param2, param3)");
            return ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorDialogFragment(param0, param1, param2, param3);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorDialogFragment(param0, param1, param2, param3)");
            return ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorDialogFragment(param0, param1, param2, param3);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.showErrorNotification(android.content.Context,int) Displays a notification for an error code returned from isGooglePlayServicesAvailable(Context), if it is resolvable by the user.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.showErrorNotification(android.content.Context,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section138621443204620">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/huaweiapiavailability-0000001050121134#EN-US_TOPIC_0000001050121134__section138621443204620</a><br/>
     * com.google.android.gms.common.GoogleApiAvailability.showErrorNotification(android.content.Context,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-void-showerrornotification-context-context,-int-errorcode">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-void-showerrornotification-context-context,-int-errorcode</a><br/>
     *
     * @param param0 The calling context for displaying the notification
     * @param param1 Error code returned by isGooglePlayServicesAvailable(Context). For other values, including SUCCESS, no notification is shown
     */
    public void showErrorNotification(android.content.Context param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorNotification(param0, param1)");
            ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).showErrorNotification(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorNotification(param0, param1)");
            ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorNotification(param0, param1);
        }
    }

    /**
     * org.xms.g.common.ExtensionApiAvailability.showErrorNotification(android.content.Context,org.xms.g.common.ConnectionResult) Displays a notification for a connection failure, if it is resolvable by the user.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiApiAvailability.popupErrNotification(android.content.Context,com.huawei.hms.api.ConnectionResult)
     * com.google.android.gms.common.GoogleApiAvailability.showErrorNotification(android.content.Context,com.google.android.gms.common.ConnectionResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-void-showerrornotification-context-context,-connectionresult-result">https://developers.google.com/android/reference/com/google/android/gms/common/GoogleApiAvailability#public-void-showerrornotification-context-context,-connectionresult-result</a><br/>
     *
     * @param param0 The calling context used to display the notification
     * @param param1 The connection failure. If successful or the error is not resolvable by the user, no notification is shown
     */
    public void showErrorNotification(android.content.Context param0, org.xms.g.common.ConnectionResult param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).popupErrNotification(param0, ((com.huawei.hms.api.ConnectionResult) ((param1) == null ? null : (param1.getHInstance()))))");
            ((com.huawei.hms.api.HuaweiApiAvailability) this.getHInstance()).popupErrNotification(param0, ((com.huawei.hms.api.ConnectionResult) ((param1) == null ? null : (param1.getHInstance()))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorNotification(param0, ((com.google.android.gms.common.ConnectionResult) ((param1) == null ? null : (param1.getGInstance()))))");
            ((com.google.android.gms.common.GoogleApiAvailability) this.getGInstance()).showErrorNotification(param0, ((com.google.android.gms.common.ConnectionResult) ((param1) == null ? null : (param1.getGInstance()))));
        }
    }
}