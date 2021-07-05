package org.xms.g.common;

/**
 * Contains all possible error codes for when a client fails to connect to services.<br/>
 * Combination of com.huawei.hms.api.ConnectionResult and com.google.android.gms.common.ConnectionResult.<br/>
 * com.huawei.hms.api.ConnectionResult: the ConnectionResult.<br/>
 * com.google.android.gms.common.ConnectionResult: Contains all possible error codes for when a client fails to connect to Google Play services. These error codes are used by GoogleApiClient.OnConnectionFailedListener.<br/>
 */
public final class ConnectionResult extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.google.android.gms.common.ConnectionResult.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-creatorconnectionresult-creator">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-creatorconnectionresult-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.common.ConnectionResult createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.api.ConnectionResult hReturn = com.huawei.hms.api.ConnectionResult.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.common.ConnectionResult gReturn = com.google.android.gms.common.ConnectionResult.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.ConnectionResult(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.common.ConnectionResult[] newArray(int param0) {
            return new org.xms.g.common.ConnectionResult[param0];
        }
    };

    /**
     * org.xms.g.common.ConnectionResult.ConnectionResult(org.xms.g.utils.XBox) constructor of ConnectionResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ConnectionResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.ConnectionResult.ConnectionResult(int) Creates a connection result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.ConnectionResult(int)
     * com.google.android.gms.common.ConnectionResult.ConnectionResult(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-connectionresult-int-statuscode">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-connectionresult-int-statuscode</a><br/>
     *
     * @param param0 The status code
     */
    public ConnectionResult(int param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.api.ConnectionResult(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.ConnectionResult(param0));
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.ConnectionResult(int,android.app.PendingIntent) Creates a connection result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.ConnectionResult(int,android.app.PendingIntent)
     * com.google.android.gms.common.ConnectionResult.ConnectionResult(int,android.app.PendingIntent): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-connectionresult-int-statuscode,-pendingintent-pendingintent">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-connectionresult-int-statuscode,-pendingintent-pendingintent</a><br/>
     *
     * @param param0 The status code
     * @param param1 A pending intent that will resolve the issue when started, or null
     */
    public ConnectionResult(int param0, android.app.PendingIntent param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.api.ConnectionResult(param0, param1));
        } else {
            this.setGInstance(new com.google.android.gms.common.ConnectionResult(param0, param1));
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.ConnectionResult(int,android.app.PendingIntent,java.lang.String) Creates a connection result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.ConnectionResult(int,android.app.PendingIntent,java.lang.String)
     * com.google.android.gms.common.ConnectionResult.ConnectionResult(int,android.app.PendingIntent,java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-connectionresult-int-statuscode,-pendingintent-pendingintent,-string-message">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-connectionresult-int-statuscode,-pendingintent-pendingintent,-string-message</a><br/>
     *
     * @param param0 The status code
     * @param param1 A pending intent that will resolve the issue when started, or null
     * @param param2 An additional error message for the connection result, or nul
     */
    public ConnectionResult(int param0, android.app.PendingIntent param1, java.lang.String param2) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.api.ConnectionResult(param0, param1, param2));
        } else {
            this.setGInstance(new com.google.android.gms.common.ConnectionResult(param0, param1, param2));
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getAPI_UNAVAILABLE() return the value of API_UNAVAILABLE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.API_UNAVAILABLE
     * com.google.android.gms.common.ConnectionResult.API_UNAVAILABLE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-api_unavailable">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-api_unavailable</a><br/>
     *
     * @return Constant Value.One of the API components you attempted to connect to is not available
     */
    public static int getAPI_UNAVAILABLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.API_UNAVAILABLE");
            return com.huawei.hms.api.ConnectionResult.API_UNAVAILABLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.API_UNAVAILABLE");
            return com.google.android.gms.common.ConnectionResult.API_UNAVAILABLE;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getCANCELED() return the value of CANCELED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.CANCELED
     * com.google.android.gms.common.ConnectionResult.CANCELED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-canceled">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-canceled</a><br/>
     *
     * @return Constant Value.The connection was canceled
     */
    public static int getCANCELED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.CANCELED");
            return com.huawei.hms.api.ConnectionResult.CANCELED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.CANCELED");
            return com.google.android.gms.common.ConnectionResult.CANCELED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getDEVELOPER_ERROR() return the value of DEVELOPER_ERROR.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.DEVELOPER_ERROR
     * com.google.android.gms.common.ConnectionResult.DEVELOPER_ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-developer_error">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-developer_error</a><br/>
     *
     * @return Constant Value.The application is misconfigured. This error is not recoverable and will be treated as fatal. The developer should look at the logs after this to determine more actionable information
     */
    public static int getDEVELOPER_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.DEVELOPER_ERROR");
            return com.huawei.hms.api.ConnectionResult.DEVELOPER_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.DEVELOPER_ERROR");
            return com.google.android.gms.common.ConnectionResult.DEVELOPER_ERROR;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getDRIVE_EXTERNAL_STORAGE_REQUIRED() return the value of DRIVE_EXTERNAL_STORAGE_REQUIRED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED
     * com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-drive_external_storage_required">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-drive_external_storage_required</a><br/>
     *
     * @return Constant Value,The Drive API requires external storage(such as an SD card), but no external storage is mounted, This error is recoverable if the user installs external storage (if none is present) and ensures that it is mounted (which may involve disabling USB storage mode, formatting the storage, or other initialization as required by the device)
     */
    public static int getDRIVE_EXTERNAL_STORAGE_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED");
            return com.huawei.hms.api.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED");
            return com.google.android.gms.common.ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getINTERNAL_ERROR() return the value of INTERNAL_ERROR.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.INTERNAL_ERROR
     * com.google.android.gms.common.ConnectionResult.INTERNAL_ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-internal_error">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-internal_error</a><br/>
     *
     * @return Constant Value.An internal error occurred. Retrying should resolve the problem
     */
    public static int getINTERNAL_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.INTERNAL_ERROR");
            return com.huawei.hms.api.ConnectionResult.INTERNAL_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.INTERNAL_ERROR");
            return com.google.android.gms.common.ConnectionResult.INTERNAL_ERROR;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getINTERRUPTED() return the value of INTERRUPTED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.INTERRUPTED
     * com.google.android.gms.common.ConnectionResult.INTERRUPTED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-interrupted">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-interrupted</a><br/>
     *
     * @return Constant Value.An interrupt occurred while waiting for the connection complete
     */
    public static int getINTERRUPTED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.INTERRUPTED");
            return com.huawei.hms.api.ConnectionResult.INTERRUPTED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.INTERRUPTED");
            return com.google.android.gms.common.ConnectionResult.INTERRUPTED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getINVALID_ACCOUNT() return the value of INVALID_ACCOUNT.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.INVALID_ACCOUNT
     * com.google.android.gms.common.ConnectionResult.INVALID_ACCOUNT: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-invalid_account">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-invalid_account</a><br/>
     *
     * @return Constant Value.The client attempted to connect to the service with an invalid account name specified
     */
    public static int getINVALID_ACCOUNT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.INVALID_ACCOUNT");
            return com.huawei.hms.api.ConnectionResult.INVALID_ACCOUNT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.INVALID_ACCOUNT");
            return com.google.android.gms.common.ConnectionResult.INVALID_ACCOUNT;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getLICENSE_CHECK_FAILED() return the value of LICENSE_CHECK_FAILED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.LICENSE_CHECK_FAILED
     * com.google.android.gms.common.ConnectionResult.LICENSE_CHECK_FAILED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-license_check_failed">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-license_check_failed</a><br/>
     *
     * @return Constant Value.The application is not licensed to the user. This error is not recoverable and will be treated as fatal
     */
    public static int getLICENSE_CHECK_FAILED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.LICENSE_CHECK_FAILED");
            return com.huawei.hms.api.ConnectionResult.LICENSE_CHECK_FAILED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.LICENSE_CHECK_FAILED");
            return com.google.android.gms.common.ConnectionResult.LICENSE_CHECK_FAILED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getNETWORK_ERROR() return the value of NETWORK_ERROR.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.NETWORK_ERROR
     * com.google.android.gms.common.ConnectionResult.NETWORK_ERROR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-network_error">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-network_error</a><br/>
     *
     * @return Constant Value.A network error occurred. Retrying should resolve the problem
     */
    public static int getNETWORK_ERROR() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.NETWORK_ERROR");
            return com.huawei.hms.api.ConnectionResult.NETWORK_ERROR;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.NETWORK_ERROR");
            return com.google.android.gms.common.ConnectionResult.NETWORK_ERROR;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getRESOLUTION_REQUIRED() return the value of RESOLUTION_REQUIRED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.RESOLUTION_REQUIRED
     * com.google.android.gms.common.ConnectionResult.RESOLUTION_REQUIRED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-resolution_required">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-resolution_required</a><br/>
     *
     * @return Constant Value.Completing the connection requires some form of resolution
     */
    public static int getRESOLUTION_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.RESOLUTION_REQUIRED");
            return com.huawei.hms.api.ConnectionResult.RESOLUTION_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.RESOLUTION_REQUIRED");
            return com.google.android.gms.common.ConnectionResult.RESOLUTION_REQUIRED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getRESTRICTED_PROFILE() return the value of RESTRICTED_PROFILE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.RESTRICTED_PROFILE
     * com.google.android.gms.common.ConnectionResult.RESTRICTED_PROFILE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-restricted_profile">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-restricted_profile</a><br/>
     *
     * @return Constant Value.The current user profile is restricted and cannot use authenticated features
     */
    public static int getRESTRICTED_PROFILE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.RESTRICTED_PROFILE");
            return com.huawei.hms.api.ConnectionResult.RESTRICTED_PROFILE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.RESTRICTED_PROFILE");
            return com.google.android.gms.common.ConnectionResult.RESTRICTED_PROFILE;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSERVICE_DISABLED() return the value of SERVICE_DISABLED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SERVICE_DISABLED
     * com.google.android.gms.common.ConnectionResult.SERVICE_DISABLED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_disabled">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_disabled</a><br/>
     *
     * @return Constant Value.The installed version of Google Play services has been disabled on this device
     */
    public static int getSERVICE_DISABLED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_DISABLED");
            return com.huawei.hms.api.ConnectionResult.SERVICE_DISABLED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_DISABLED");
            return com.google.android.gms.common.ConnectionResult.SERVICE_DISABLED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSERVICE_INVALID() return the value of SERVICE_INVALID.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SERVICE_INVALID
     * com.google.android.gms.common.ConnectionResult.SERVICE_INVALID: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_invalid">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_invalid</a><br/>
     *
     * @return Constant Value.version of the Google Play services installed on this device is not authentic
     */
    public static int getSERVICE_INVALID() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_INVALID");
            return com.huawei.hms.api.ConnectionResult.SERVICE_INVALID;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_INVALID");
            return com.google.android.gms.common.ConnectionResult.SERVICE_INVALID;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSERVICE_MISSING() return the value of SERVICE_MISSING.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SERVICE_MISSING
     * com.google.android.gms.common.ConnectionResult.SERVICE_MISSING: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_missing">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_missing</a><br/>
     *
     * @return Constant Value,Google Play services is missing on this device
     */
    public static int getSERVICE_MISSING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_MISSING");
            return com.huawei.hms.api.ConnectionResult.SERVICE_MISSING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_MISSING");
            return com.google.android.gms.common.ConnectionResult.SERVICE_MISSING;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSERVICE_MISSING_PERMISSION() return the value of SERVICE_MISSING_PERMISSION.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION
     * com.google.android.gms.common.ConnectionResult.SERVICE_MISSING_PERMISSION: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_missing_permission">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_missing_permission</a><br/>
     *
     * @return Constant Value.Google Play service doesn't have one or more required permissions
     */
    public static int getSERVICE_MISSING_PERMISSION() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION");
            return com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_MISSING_PERMISSION");
            return com.google.android.gms.common.ConnectionResult.SERVICE_MISSING_PERMISSION;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSERVICE_UPDATING() return the value of SERVICE_UPDATING.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SERVICE_UPDATING
     * com.google.android.gms.common.ConnectionResult.SERVICE_UPDATING: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_updating">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_updating</a><br/>
     *
     * @return Constant Value.Google Play service is currently being updated on this device
     */
    public static int getSERVICE_UPDATING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_UPDATING");
            return com.huawei.hms.api.ConnectionResult.SERVICE_UPDATING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_UPDATING");
            return com.google.android.gms.common.ConnectionResult.SERVICE_UPDATING;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSERVICE_VERSION_UPDATE_REQUIRED() return the value of SERVICE_VERSION_UPDATE_REQUIRED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED
     * com.google.android.gms.common.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_version_update_required">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-service_version_update_required</a><br/>
     *
     * @return Constant Value.The installed version of Google Play services is out of date
     */
    public static int getSERVICE_VERSION_UPDATE_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED");
            return com.huawei.hms.api.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED");
            return com.google.android.gms.common.ConnectionResult.SERVICE_VERSION_UPDATE_REQUIRED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSIGN_IN_FAILED() return the value of SIGN_IN_FAILED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SIGN_IN_FAILED
     * com.google.android.gms.common.ConnectionResult.SIGN_IN_FAILED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-sign_in_failed">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-sign_in_failed</a><br/>
     *
     * @return Constant Value.The client attempted to connect to the service but the user is not signed in
     */
    public static int getSIGN_IN_FAILED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SIGN_IN_FAILED");
            return com.huawei.hms.api.ConnectionResult.SIGN_IN_FAILED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SIGN_IN_FAILED");
            return com.google.android.gms.common.ConnectionResult.SIGN_IN_FAILED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSIGN_IN_REQUIRED() return the value of SIGN_IN_REQUIRED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SIGN_IN_REQUIRED
     * com.google.android.gms.common.ConnectionResult.SIGN_IN_REQUIRED: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-sign_in_required">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-sign_in_required</a><br/>
     *
     * @return Constant Value.The client attempted to connect to the service but the user is not signed in
     */
    public static int getSIGN_IN_REQUIRED() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SIGN_IN_REQUIRED");
            return com.huawei.hms.api.ConnectionResult.SIGN_IN_REQUIRED;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SIGN_IN_REQUIRED");
            return com.google.android.gms.common.ConnectionResult.SIGN_IN_REQUIRED;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getSUCCESS() return the value of SUCCESS.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.SUCCESS
     * com.google.android.gms.common.ConnectionResult.SUCCESS: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-success">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-success</a><br/>
     *
     * @return Constant Value.The connection was successful
     */
    public static int getSUCCESS() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.SUCCESS");
            return com.huawei.hms.api.ConnectionResult.SUCCESS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.SUCCESS");
            return com.google.android.gms.common.ConnectionResult.SUCCESS;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getTIMEOUT() return the value of TIMEOUT.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.TIMEOUT
     * com.google.android.gms.common.ConnectionResult.TIMEOUT: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-timeout">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-static-final-int-timeout</a><br/>
     *
     * @return Constant Value.The timeout was exceeded while waiting for the connection to complete
     */
    public static int getTIMEOUT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.api.ConnectionResult.TIMEOUT");
            return com.huawei.hms.api.ConnectionResult.TIMEOUT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.ConnectionResult.TIMEOUT");
            return com.google.android.gms.common.ConnectionResult.TIMEOUT;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.ConnectionResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ConnectionResult object
     */
    public static org.xms.g.common.ConnectionResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ConnectionResult) param0);
    }

    /**
     * org.xms.g.common.ConnectionResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.ConnectionResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.ConnectionResult;
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.equals(java.lang.Object) Determines whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.equals(java.lang.Object)
     * com.google.android.gms.common.ConnectionResult.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 Objects to be compared
     * @return Comparison result: equal if true, and unequal if false
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getErrorCode() Indicates the type of error that interrupted connection.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.getErrorCode()
     * com.google.android.gms.common.ConnectionResult.getErrorCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-int-geterrorcode">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-int-geterrorcode</a><br/>
     *
     * @return the error code, or SUCCESS if no error occurred
     */
    public final int getErrorCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getErrorCode()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getErrorCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getErrorCode()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getErrorCode();
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getErrorMessage() Returns an error message for connection result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.getErrorMessage()
     * com.google.android.gms.common.ConnectionResult.getErrorMessage(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-string-geterrormessage">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-string-geterrormessage</a><br/>
     *
     * @return the message
     */
    public final java.lang.String getErrorMessage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getErrorMessage()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getErrorMessage();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getErrorMessage()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getErrorMessage();
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.getResolution() A pending intent to resolve the connection failure. This intent can be started with startIntentSenderForResult(IntentSender, int, Intent, int, int, int) to present UI to solve the issue.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.getResolution()
     * com.google.android.gms.common.ConnectionResult.getResolution(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-pendingintent-getresolution">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-pendingintent-getresolution</a><br/>
     *
     * @return The pending intent to resolve the connection failure
     */
    public final android.app.PendingIntent getResolution() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getResolution()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).getResolution();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getResolution()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).getResolution();
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.hasResolution() Returns true if calling startResolutionForResult(Activity, int) will start any intents requiring user interaction.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.hasResolution()
     * com.google.android.gms.common.ConnectionResult.hasResolution(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-boolean-hasresolution">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-boolean-hasresolution</a><br/>
     *
     * @return true if there is a resolution that can be started
     */
    public final boolean hasResolution() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).hasResolution()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).hasResolution();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).hasResolution()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).hasResolution();
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.hashCode() hashCode of a compute instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.hashCode()
     * com.google.android.gms.common.ConnectionResult.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-int-hashcode</a><br/>
     *
     * @return the hashCode
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.isSuccess() Returns true if the connection was successful.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.isSuccess()
     * com.google.android.gms.common.ConnectionResult.isSuccess(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-boolean-issuccess">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-boolean-issuccess</a><br/>
     *
     * @return true if the connection was successful, false if there was an error
     */
    public final boolean isSuccess() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).isSuccess()");
            return ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).isSuccess();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).isSuccess()");
            return ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).isSuccess();
        }
    }

    /**
     * org.xms.g.common.ConnectionResult.startResolutionForResult(android.app.Activity,int) Resolves an error by starting any intents requiring user interaction. See SIGN_IN_REQUIRED, and RESOLUTION_REQUIRED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.startResolutionForResult(android.app.Activity,int)
     * com.google.android.gms.common.ConnectionResult.startResolutionForResult(android.app.Activity,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-void-startresolutionforresult-activity-activity,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-void-startresolutionforresult-activity-activity,-int-requestcode</a><br/>
     *
     * @param param0 An Activity context to use to resolve the issue. The activity's onActivityResult method will be invoked after the user is done. If the resultCode is RESULT_OK, the application should try to connect again
     * @param param1 The request code to pass to onActivityResult
     * @throws android.content.IntentSender.SendIntentException If the resolution intent has been canceled or is no longer able to execute the request
     */
    public void startResolutionForResult(android.app.Activity param0, int param1) throws android.content.IntentSender.SendIntentException {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).startResolutionForResult(param0, param1)");
            ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).startResolutionForResult(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).startResolutionForResult(param0, param1)");
            ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).startResolutionForResult(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final java.lang.String toString() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.ConnectionResult.writeToParcel(android.os.Parcel,int) used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.ConnectionResult.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.common.ConnectionResult.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/common/ConnectionResult#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 the out
     * @param param1 the flags
     */
    public final void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.ConnectionResult) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.api.ConnectionResult) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.ConnectionResult) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.common.ConnectionResult) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}