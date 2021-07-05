package org.xms.g.common;

/**
 * Indicates services is not available.<br/>
 * Combination of com.huawei.hms.api.HuaweiServicesNotAvailableException and com.google.android.gms.common.GooglePlayServicesNotAvailableException.<br/>
 * com.huawei.hms.api.HuaweiServicesNotAvailableException: the HuaweiServicesNotAvailableException.<br/>
 * com.google.android.gms.common.GooglePlayServicesNotAvailableException: Indicates Google Play services is not available.<br/>
 */
public final class ExtensionPlayServicesNotAvailableException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.ExtensionPlayServicesNotAvailableException(org.xms.g.utils.XBox) constructor of ExtensionPlayServicesNotAvailableException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionPlayServicesNotAvailableException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.ExtensionPlayServicesNotAvailableException(int) constructor of ExtensionPlayServicesNotAvailableException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiServicesNotAvailableException.HuaweiServicesNotAvailableException(int)
     * com.google.android.gms.common.GooglePlayServicesNotAvailableException.GooglePlayServicesNotAvailableException(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesNotAvailableException#public-googleplayservicesnotavailableexception-int-errorcode">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesNotAvailableException#public-googleplayservicesnotavailableexception-int-errorcode</a><br/>
     *
     * @param param0 the errorCode
     */
    public ExtensionPlayServicesNotAvailableException(int param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.api.HuaweiServicesNotAvailableException(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.GooglePlayServicesNotAvailableException(param0));
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.ExtensionPlayServicesNotAvailableException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionPlayServicesNotAvailableException object
     */
    public static org.xms.g.common.ExtensionPlayServicesNotAvailableException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.ExtensionPlayServicesNotAvailableException) param0);
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.HuaweiServicesNotAvailableException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.GooglePlayServicesNotAvailableException;
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.getErrorCode() return the value of errorCode.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.HuaweiServicesNotAvailableException.errorCode
     * com.google.android.gms.common.GooglePlayServicesNotAvailableException.errorCode: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesNotAvailableException#public-final-int-errorcode">https://developers.google.com/android/reference/com/google/android/gms/common/GooglePlayServicesNotAvailableException#public-final-int-errorcode</a><br/>
     *
     * @return the ErrorCode
     */
    public int getErrorCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.HuaweiServicesNotAvailableException) this.getHInstance()).errorCode");
            return ((com.huawei.hms.api.HuaweiServicesNotAvailableException) this.getHInstance()).errorCode;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.GooglePlayServicesNotAvailableException) this.getGInstance()).errorCode");
            return ((com.google.android.gms.common.GooglePlayServicesNotAvailableException) this.getGInstance()).errorCode;
        }
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.common.ExtensionPlayServicesNotAvailableException.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }
}