package org.xms.g.common.api;

/**
 * Contains the result of an availability check for one or more Apis.<br/>
 * Combination of com.huawei.hms.common.api.AvailabilityException and com.google.android.gms.common.api.AvailabilityException.<br/>
 * com.huawei.hms.common.api.AvailabilityException: <br/>
 * com.google.android.gms.common.api.AvailabilityException: Contains the result of an availability check for one or more GoogleApis.<br/>
 */
public class AvailabilityException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.g.common.api.AvailabilityException.AvailabilityException(org.xms.g.utils.XBox) constructor of AvailabilityException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public AvailabilityException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.g.common.api.AvailabilityException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.AvailabilityException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted AvailabilityException object
     */
    public static org.xms.g.common.api.AvailabilityException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.AvailabilityException) param0);
    }

    /**
     * org.xms.g.common.api.AvailabilityException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.AvailabilityException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.AvailabilityException;
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.ConnectionResult getConnectionResult(org.xms.g.common.api.ExtensionApi<? extends org.xms.g.common.api.Api.ApiOptions> param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.api.AvailabilityException.getMessage() Lists the ConnectionResult per API.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.AvailabilityException.getMessage()
     * com.google.android.gms.common.api.AvailabilityException.getMessage(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/AvailabilityException#public-string-getmessage">https://developers.google.com/android/reference/com/google/android/gms/common/api/AvailabilityException#public-string-getmessage</a><br/>
     *
     * @return Lists the ConnectionResult per API
     */
    public java.lang.String getMessage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.AvailabilityException) this.getHInstance()).getMessage()");
            return ((com.huawei.hms.common.api.AvailabilityException) this.getHInstance()).getMessage();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.AvailabilityException) this.getGInstance()).getMessage()");
            return ((com.google.android.gms.common.api.AvailabilityException) this.getGInstance()).getMessage();
        }
    }

    /**
     * org.xms.g.common.api.AvailabilityException.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return Instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.common.api.AvailabilityException.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 Instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.common.api.AvailabilityException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return Instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.common.api.AvailabilityException.setHInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 Instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}