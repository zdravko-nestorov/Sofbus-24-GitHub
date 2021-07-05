package org.xms.g.common;

/**
 * UserRecoverableExceptions signal errors that can be recovered with user action, such as a user login.<br/>
 * Combination of com.huawei.hms.api.UserRecoverableException and com.google.android.gms.common.UserRecoverableException.<br/>
 * com.huawei.hms.api.UserRecoverableException: the UserRecoverableException.<br/>
 * com.google.android.gms.common.UserRecoverableException: UserRecoverableExceptions signal errors that can be recovered with user action, such as a user login.<br/>
 */
public class UserRecoverableException extends java.lang.Exception implements org.xms.g.utils.XGettable {
    public java.lang.Object gInstance;
    public java.lang.Object hInstance;
    private boolean wrapper = true;

    /**
     * org.xms.g.common.UserRecoverableException.UserRecoverableException(org.xms.g.utils.XBox) constructor of UserRecoverableException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public UserRecoverableException(org.xms.g.utils.XBox param0) {
        if (param0 == null) {
            return;
        }
        this.setGInstance(param0.getGInstance());
        this.setHInstance(param0.getHInstance());
        wrapper = true;
    }

    /**
     * org.xms.g.common.UserRecoverableException.UserRecoverableException(java.lang.String,android.content.Intent) constructor of UserRecoverableExceptionbr./> Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.UserRecoverableException.UserRecoverableException(java.lang.String,android.content.Intent)
     * com.google.android.gms.common.UserRecoverableException.UserRecoverableException(java.lang.String,android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/UserRecoverableException#public-userrecoverableexception-string-msg,-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/common/UserRecoverableException#public-userrecoverableexception-string-msg,-intent-intent</a><br/>
     *
     * @param param0 the msg
     * @param param1 the intent
     */
    public UserRecoverableException(java.lang.String param0, android.content.Intent param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.UserRecoverableException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.UserRecoverableException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted UserRecoverableException object
     */
    public static org.xms.g.common.UserRecoverableException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.UserRecoverableException) param0);
    }

    /**
     * org.xms.g.common.UserRecoverableException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.api.UserRecoverableException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.UserRecoverableException;
        }
    }

    /**
     * org.xms.g.common.UserRecoverableException.getIntent() Getter for an Intent that when supplied to startActivityForResult(Intent, int), will allow user intervention.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.api.UserRecoverableException.getIntent()
     * com.google.android.gms.common.UserRecoverableException.getIntent(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/UserRecoverableException#public-intent-getintent">https://developers.google.com/android/reference/com/google/android/gms/common/UserRecoverableException#public-intent-getintent</a><br/>
     *
     * @return Intent representing the ameliorating user action
     */
    public android.content.Intent getIntent() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.api.UserRecoverableException) this.getHInstance()).getIntent()");
                return ((com.huawei.hms.api.UserRecoverableException) this.getHInstance()).getIntent();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.UserRecoverableException) this.getGInstance()).getIntent()");
                return ((com.google.android.gms.common.UserRecoverableException) this.getGInstance()).getIntent();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.api.UserRecoverableException) this.getHInstance())).getIntentCallSuper()");
                return ((HImpl) ((com.huawei.hms.api.UserRecoverableException) this.getHInstance())).getIntentCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.UserRecoverableException) this.getGInstance())).getIntentCallSuper()");
                return ((GImpl) ((com.google.android.gms.common.UserRecoverableException) this.getGInstance())).getIntentCallSuper();
            }
        }
    }

    /**
     * org.xms.g.common.UserRecoverableException.getGInstance() get the gms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return instance of gms
     */
    public java.lang.Object getGInstance() {
        return this.gInstance;
    }

    /**
     * org.xms.g.common.UserRecoverableException.setGInstance(java.lang.Object) set the gms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 instance of gms
     */
    public void setGInstance(java.lang.Object param0) {
        this.gInstance = param0;
    }

    /**
     * org.xms.g.common.UserRecoverableException.getHInstance() get the hms instance from the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @return instance of hms
     */
    public java.lang.Object getHInstance() {
        return this.hInstance;
    }

    /**
     * org.xms.g.common.UserRecoverableException.setHInstance(java.lang.Object) set the hms instance for the corresponding xms instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 instance of hms
     */
    public void setHInstance(java.lang.Object param0) {
        this.hInstance = param0;
    }

    private class GImpl extends com.google.android.gms.common.UserRecoverableException {

        public GImpl(java.lang.String param0, android.content.Intent param1) {
            super(param0, param1);
        }

        public android.content.Intent getIntent() {
            return org.xms.g.common.UserRecoverableException.this.getIntent();
        }

        public android.content.Intent getIntentCallSuper() {
            return super.getIntent();
        }
    }

    private class HImpl extends com.huawei.hms.api.UserRecoverableException {

        public HImpl(java.lang.String param0, android.content.Intent param1) {
            super(param0, param1);
        }

        public android.content.Intent getIntent() {
            return org.xms.g.common.UserRecoverableException.this.getIntent();
        }

        public android.content.Intent getIntentCallSuper() {
            return super.getIntent();
        }
    }
}