package org.xms.g.common.api;

/**
 * Common status codes that are often shared across API surfaces.<br/>
 * Combination of com.huawei.hms.common.api.CommonStatusCodes and com.google.android.gms.common.api.CommonStatusCodes.<br/>
 * com.huawei.hms.common.api.CommonStatusCodes: Common status codes that are often shared across API surfaces.<br/>
 * com.google.android.gms.common.api.CommonStatusCodes: Common status codes that are often shared across API surfaces.<br/>
 */
public class CommonStatusCodes extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.api.CommonStatusCodes.CommonStatusCodes(org.xms.g.utils.XBox) constructor of CommonStatusCodes with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public CommonStatusCodes(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getAPI_NOT_CONNECTED() return the value of API_NOT_CONNECTED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.API_NOT_CONNECTED
     * com.google.android.gms.common.api.CommonStatusCodes.API_NOT_CONNECTED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-api_not_connected">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-api_not_connected</a><br/>
     *
     * @return Constant Value.The client attempted to call a method from an API that failed to connect
     */
    public static int getAPI_NOT_CONNECTED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.API_NOT_CONNECTED");
            return com.huawei.hms.common.api.CommonStatusCodes.API_NOT_CONNECTED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.API_NOT_CONNECTED");
            return com.google.android.gms.common.api.CommonStatusCodes.API_NOT_CONNECTED;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getCANCELED() return the value of CANCELED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.CANCELED
     * com.google.android.gms.common.api.CommonStatusCodes.CANCELED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-canceled">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-canceled</a><br/>
     *
     * @return Constant Value.The result was canceled either due to client disconnect or cancel()
     */
    public static int getCANCELED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.CANCELED");
            return com.huawei.hms.common.api.CommonStatusCodes.CANCELED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.CANCELED");
            return com.google.android.gms.common.api.CommonStatusCodes.CANCELED;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getDEVELOPER_ERROR() return the value of DEVELOPER_ERROR.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.DEVELOPER_ERROR
     * com.google.android.gms.common.api.CommonStatusCodes.DEVELOPER_ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-developer_error">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-developer_error</a><br/>
     *
     * @return Constant Value.The application is misconfigured
     */
    public static int getDEVELOPER_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.DEVELOPER_ERROR");
            return com.huawei.hms.common.api.CommonStatusCodes.DEVELOPER_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.DEVELOPER_ERROR");
            return com.google.android.gms.common.api.CommonStatusCodes.DEVELOPER_ERROR;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getERROR() return the value of ERROR.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.ERROR
     * com.google.android.gms.common.api.CommonStatusCodes.ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-error">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-error</a><br/>
     *
     * @return Constant Value.The operation failed with no more detailed information
     */
    public static int getERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.ERROR");
            return com.huawei.hms.common.api.CommonStatusCodes.ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.ERROR");
            return com.google.android.gms.common.api.CommonStatusCodes.ERROR;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getINTERNAL_ERROR() return the value of INTERNAL_ERROR.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.INTERNAL_ERROR
     * com.google.android.gms.common.api.CommonStatusCodes.INTERNAL_ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-internal_error">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-internal_error</a><br/>
     *
     * @return Constant Value.An internal error occurred. Retrying should resolve the problem
     */
    public static int getINTERNAL_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.INTERNAL_ERROR");
            return com.huawei.hms.common.api.CommonStatusCodes.INTERNAL_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.INTERNAL_ERROR");
            return com.google.android.gms.common.api.CommonStatusCodes.INTERNAL_ERROR;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getINTERRUPTED() return the value of INTERRUPTED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.INTERRUPTED
     * com.google.android.gms.common.api.CommonStatusCodes.INTERRUPTED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-interrupted">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-interrupted</a><br/>
     *
     * @return Constant Value.A blocking call was interrupted while waiting and did not run to completion
     */
    public static int getINTERRUPTED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.INTERRUPTED");
            return com.huawei.hms.common.api.CommonStatusCodes.INTERRUPTED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.INTERRUPTED");
            return com.google.android.gms.common.api.CommonStatusCodes.INTERRUPTED;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getINVALID_ACCOUNT() return the value of INVALID_ACCOUNT.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.INVALID_ACCOUNT
     * com.google.android.gms.common.api.CommonStatusCodes.INVALID_ACCOUNT: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-invalid_account">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-invalid_account</a><br/>
     *
     * @return Constant Value.The client attempted to connect to the service with an invalid account name specified
     */
    public static int getINVALID_ACCOUNT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.INVALID_ACCOUNT");
            return com.huawei.hms.common.api.CommonStatusCodes.INVALID_ACCOUNT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.INVALID_ACCOUNT");
            return com.google.android.gms.common.api.CommonStatusCodes.INVALID_ACCOUNT;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getNETWORK_ERROR() return the value of NETWORK_ERROR.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.NETWORK_ERROR
     * com.google.android.gms.common.api.CommonStatusCodes.NETWORK_ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-network_error">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-network_error</a><br/>
     *
     * @return Constant Value.A network error occurred. Retrying should resolve the problem
     */
    public static int getNETWORK_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.NETWORK_ERROR");
            return com.huawei.hms.common.api.CommonStatusCodes.NETWORK_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.NETWORK_ERROR");
            return com.google.android.gms.common.api.CommonStatusCodes.NETWORK_ERROR;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getRESOLUTION_REQUIRED() return the value of RESOLUTION_REQUIRED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED
     * com.google.android.gms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-resolution_required">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-resolution_required</a><br/>
     *
     * @return Constant Value.Completing the operation requires some form of resolution
     */
    public static int getRESOLUTION_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED");
            return com.huawei.hms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED");
            return com.google.android.gms.common.api.CommonStatusCodes.RESOLUTION_REQUIRED;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getSERVICE_DISABLED() return the value of SERVICE_DISABLED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.SERVICE_DISABLED
     * com.google.android.gms.common.api.CommonStatusCodes.SERVICE_DISABLED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-service_disabled">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-service_disabled</a><br/>
     *
     * @return Constant Value.The installed version of Google Play services has been disabled on this device
     */
    public static int getSERVICE_DISABLED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SERVICE_DISABLED");
            return com.huawei.hms.common.api.CommonStatusCodes.SERVICE_DISABLED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SERVICE_DISABLED");
            return com.google.android.gms.common.api.CommonStatusCodes.SERVICE_DISABLED;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getSERVICE_VERSION_UPDATE_REQUIRED() return the value of SERVICE_VERSION_UPDATE_REQUIRED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED
     * com.google.android.gms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-service_version_update_required">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-service_version_update_required</a><br/>
     *
     * @return Constant Value.The installed version of services is out of date
     */
    public static int getSERVICE_VERSION_UPDATE_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED");
            return com.huawei.hms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED");
            return com.google.android.gms.common.api.CommonStatusCodes.SERVICE_VERSION_UPDATE_REQUIRED;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getSIGN_IN_REQUIRED() return the value of SIGN_IN_REQUIRED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED
     * com.google.android.gms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-sign_in_required">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-sign_in_required</a><br/>
     *
     * @return Constant Value.The client attempted to connect to the service but the user is not signed in
     */
    public static int getSIGN_IN_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED");
            return com.huawei.hms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED");
            return com.google.android.gms.common.api.CommonStatusCodes.SIGN_IN_REQUIRED;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getSUCCESS() return the value of SUCCESS.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.SUCCESS
     * com.google.android.gms.common.api.CommonStatusCodes.SUCCESS: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-success">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-success</a><br/>
     *
     * @return Constant Value.The operation was successful
     */
    public static int getSUCCESS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SUCCESS");
            return com.huawei.hms.common.api.CommonStatusCodes.SUCCESS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SUCCESS");
            return com.google.android.gms.common.api.CommonStatusCodes.SUCCESS;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getSUCCESS_CACHE() return the value of SUCCESS_CACHE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.SUCCESS_CACHE
     * com.google.android.gms.common.api.CommonStatusCodes.SUCCESS_CACHE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-success_cache">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-success_cache</a><br/>
     *
     * @return Constant Value.The operation was successful, but was used the device's cache
     */
    public static int getSUCCESS_CACHE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.SUCCESS_CACHE");
            return com.huawei.hms.common.api.CommonStatusCodes.SUCCESS_CACHE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.SUCCESS_CACHE");
            return com.google.android.gms.common.api.CommonStatusCodes.SUCCESS_CACHE;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getTIMEOUT() return the value of TIMEOUT.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.TIMEOUT
     * com.google.android.gms.common.api.CommonStatusCodes.TIMEOUT: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-timeout">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-final-int-timeout</a><br/>
     *
     * @return Constant Value.Timed out while awaiting the result
     */
    public static int getTIMEOUT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.TIMEOUT");
            return com.huawei.hms.common.api.CommonStatusCodes.TIMEOUT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.TIMEOUT");
            return com.google.android.gms.common.api.CommonStatusCodes.TIMEOUT;
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.getStatusCodeString(int) return the string based on the current status code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.CommonStatusCodes.getStatusCodeString(int)
     * com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-string-getstatuscodestring-int-statuscode">https://developers.google.com/android/reference/com/google/android/gms/common/api/CommonStatusCodes#public-static-string-getstatuscodestring-int-statuscode</a><br/>
     *
     * @param param0 status code
     * @return untranslated debug (not user-friendly!) string based on the current status code
     */
    public static java.lang.String getStatusCodeString(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.api.CommonStatusCodes.getStatusCodeString(param0)");
            return com.huawei.hms.common.api.CommonStatusCodes.getStatusCodeString(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(param0)");
            return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(param0);
        }
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.CommonStatusCodes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted CommonStatusCodes object
     */
    public static org.xms.g.common.api.CommonStatusCodes dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.CommonStatusCodes) param0);
    }

    /**
     * org.xms.g.common.api.CommonStatusCodes.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.CommonStatusCodes;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.CommonStatusCodes;
        }
    }
}