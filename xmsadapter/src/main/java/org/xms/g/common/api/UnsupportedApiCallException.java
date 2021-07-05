package org.xms.g.common.api;

/**
 * Exception that's thrown when an API call is not supported by services package.<br/>
 * Combination of com.huawei.hms.common.api.UnsupportedApiCallException and com.google.android.gms.common.api.UnsupportedApiCallException.<br/>
 * com.huawei.hms.common.api.UnsupportedApiCallException: <br/>
 * com.google.android.gms.common.api.UnsupportedApiCallException: Exception that's thrown when an API call is not supported by the Google Play services package.<br/>
 */
public final class UnsupportedApiCallException extends java.lang.UnsupportedOperationException implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.g.common.api.UnsupportedApiCallException.UnsupportedApiCallException(org.xms.g.utils.XBox) constructor of UnsupportedApiCallException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public UnsupportedApiCallException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.g.common.api.UnsupportedApiCallException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.UnsupportedApiCallException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted UnsupportedApiCallException object
     */
    public static org.xms.g.common.api.UnsupportedApiCallException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.UnsupportedApiCallException) param0);
    }

    /**
     * org.xms.g.common.api.UnsupportedApiCallException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.UnsupportedApiCallException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.UnsupportedApiCallException;
        }
    }

    /**
     * org.xms.g.common.api.UnsupportedApiCallException.getMessage() return the message of UnsupportedApiCallException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.UnsupportedApiCallException.getMessage()
     * com.google.android.gms.common.api.UnsupportedApiCallException.getMessage(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/UnsupportedApiCallException#public-string-getmessage">https://developers.google.com/android/reference/com/google/android/gms/common/api/UnsupportedApiCallException#public-string-getmessage</a><br/>
     *
     * @return the message of UnsupportedApiCallException
     */
    public final java.lang.String getMessage() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.UnsupportedApiCallException) this.getHInstance()).getMessage()");
            return ((com.huawei.hms.common.api.UnsupportedApiCallException) this.getHInstance()).getMessage();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.UnsupportedApiCallException) this.getGInstance()).getMessage()");
            return ((com.google.android.gms.common.api.UnsupportedApiCallException) this.getGInstance()).getMessage();
        }
    }

    /**
     * org.xms.g.common.api.UnsupportedApiCallException.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return Instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.common.api.UnsupportedApiCallException.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 Instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.common.api.UnsupportedApiCallException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return Instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.common.api.UnsupportedApiCallException.setHInstance(java.lang.Object) set the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 Instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}