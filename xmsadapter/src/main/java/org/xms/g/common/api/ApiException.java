package org.xms.g.common.api;

/**
 * Exception to be returned when a call to HMS or GMS SDK has failed.<br/>
 * Combination of com.huawei.hms.common.ApiException and com.google.android.gms.common.api.ApiException.<br/>
 * com.huawei.hms.common.ApiException: Exception returned when the HMS SDK call fails.<br/>
 * com.google.android.gms.common.api.ApiException: Exception to be returned by a Task when a call to Google Play services has failed.<br/>
 */
public class ApiException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    private boolean wrapper = true;

    /**
     * org.xms.g.common.api.ApiException.ApiException(org.xms.g.utils.XBox) constructor of ApiException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ApiException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
        wrapper = true;
    }

    /**
     * org.xms.g.common.api.ApiException.ApiException(org.xms.g.common.api.Status) Create an ApiException from a Status.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.ApiException.ApiException(com.huawei.hms.support.api.client.Status): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/apiexception-0000001050123087#EN-US_TOPIC_0000001050123087__section425714488549">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/apiexception-0000001050123087#EN-US_TOPIC_0000001050123087__section425714488549</a><br/>
     * com.google.android.gms.common.api.ApiException.ApiException(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ApiException#public-apiexception-status-status">https://developers.google.com/android/reference/com/google/android/gms/common/api/ApiException#public-apiexception-status-status</a><br/>
     *
     * @param param0 the Status instance containing a message and code
     */
    public ApiException(org.xms.g.common.api.Status param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance())))));
        } else {
            this.setGInstance(new GImpl(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance())))));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.ApiException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.ApiException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ApiException object
     */
    public static org.xms.g.common.api.ApiException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.ApiException) param0);
    }

    /**
     * org.xms.g.common.api.ApiException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.ApiException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.ApiException;
        }
    }

    /**
     * org.xms.g.common.api.ApiException.getStatusCode() Indicates the status of the operation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.ApiException.getStatusCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/apiexception-0000001050123087#EN-US_TOPIC_0000001050123087__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/apiexception-0000001050123087#EN-US_TOPIC_0000001050123087__section32821622269</a><br/>
     * com.google.android.gms.common.api.ApiException.getStatusCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ApiException#public-int-getstatuscode">https://developers.google.com/android/reference/com/google/android/gms/common/api/ApiException#public-int-getstatuscode</a><br/>
     *
     * @return Status code resulting from the operation
     */
    public int getStatusCode() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.ApiException) this.getHInstance()).getStatusCode()");
                return ((com.huawei.hms.common.ApiException) this.getHInstance()).getStatusCode();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ApiException) this.getGInstance()).getStatusCode()");
                return ((com.google.android.gms.common.api.ApiException) this.getGInstance()).getStatusCode();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.ApiException) this.getHInstance())).getStatusCodeCallSuper()");
                return ((HImpl) ((com.huawei.hms.common.ApiException) this.getHInstance())).getStatusCodeCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.ApiException) this.getGInstance())).getStatusCodeCallSuper()");
                return ((GImpl) ((com.google.android.gms.common.api.ApiException) this.getGInstance())).getStatusCodeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.common.api.ApiException.getStatusMessage() Obtains the status description.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.ApiException.getStatusMessage(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/apiexception-0000001050123087#EN-US_TOPIC_0000001050123087__section0102201410491">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/apiexception-0000001050123087#EN-US_TOPIC_0000001050123087__section0102201410491</a><br/>
     * com.google.android.gms.common.api.ApiException.getStatusMessage(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ApiException#public-string-getstatusmessage">https://developers.google.com/android/reference/com/google/android/gms/common/api/ApiException#public-string-getstatusmessage</a><br/>
     *
     * @return Status description
     */
    public java.lang.String getStatusMessage() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.ApiException) this.getHInstance()).getStatusMessage()");
                return ((com.huawei.hms.common.ApiException) this.getHInstance()).getStatusMessage();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ApiException) this.getGInstance()).getStatusMessage()");
                return ((com.google.android.gms.common.api.ApiException) this.getGInstance()).getStatusMessage();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.ApiException) this.getHInstance())).getStatusMessageCallSuper()");
                return ((HImpl) ((com.huawei.hms.common.ApiException) this.getHInstance())).getStatusMessageCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.ApiException) this.getGInstance())).getStatusMessageCallSuper()");
                return ((GImpl) ((com.google.android.gms.common.api.ApiException) this.getGInstance())).getStatusMessageCallSuper();
            }
        }
    }

    /**
     * org.xms.g.common.api.ApiException.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return Instance of gms api
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.common.api.ApiException.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 Instance of gms api
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.common.api.ApiException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return Instance of hms api
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.common.api.ApiException.setHInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 Instance of hms api
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }

    private class GImpl extends com.google.android.gms.common.api.ApiException {

        public GImpl(com.google.android.gms.common.api.Status param0) {
            super(param0);
        }

        public int getStatusCode() {
            return org.xms.g.common.api.ApiException.this.getStatusCode();
        }

        public java.lang.String getStatusMessage() {
            return org.xms.g.common.api.ApiException.this.getStatusMessage();
        }

        public int getStatusCodeCallSuper() {
            return super.getStatusCode();
        }

        public java.lang.String getStatusMessageCallSuper() {
            return super.getStatusMessage();
        }
    }

    private class HImpl extends com.huawei.hms.common.ApiException {

        public HImpl(com.huawei.hms.support.api.client.Status param0) {
            super(param0);
        }

        public int getStatusCode() {
            return org.xms.g.common.api.ApiException.this.getStatusCode();
        }

        public java.lang.String getStatusMessage() {
            return org.xms.g.common.api.ApiException.this.getStatusMessage();
        }

        public int getStatusCodeCallSuper() {
            return super.getStatusCode();
        }

        public java.lang.String getStatusMessageCallSuper() {
            return super.getStatusMessage();
        }
    }
}