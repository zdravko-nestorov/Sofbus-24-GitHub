package org.xms.g.common.api;

/**
 * Exception to be returned by a Task when a call to services has failed with a possible resolution that you need to rectify.<br/>
 * Combination of com.huawei.hms.common.ResolvableApiException and com.google.android.gms.common.api.ResolvableApiException.<br/>
 * com.huawei.hms.common.ResolvableApiException: An exception that you need to rectify.<br/>
 * com.google.android.gms.common.api.ResolvableApiException: Exception to be returned by a Task when a call to Google Play services has failed with a possible resolution.<br/>
 */
public class ResolvableApiException extends org.xms.g.common.api.ApiException {
    private boolean wrapper = true;

    /**
     * org.xms.g.common.api.ResolvableApiException.ResolvableApiException(org.xms.g.utils.XBox) constructor of ResolvableApiException with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ResolvableApiException(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.common.api.ResolvableApiException.ResolvableApiException(org.xms.g.common.api.Status) constructor of ResolvableApiException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.ResolvableApiException.ResolvableApiException(com.huawei.hms.support.api.client.Status): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/resolvableapiexception-0000001050123089#EN-US_TOPIC_0000001050123089__section425714488549">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/resolvableapiexception-0000001050123089#EN-US_TOPIC_0000001050123089__section425714488549</a><br/>
     * com.google.android.gms.common.api.ResolvableApiException.ResolvableApiException(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvableApiException#public-resolvableapiexception-status-status">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvableApiException#public-resolvableapiexception-status-status</a><br/>
     *
     * @param param0 Status instance
     */
    public ResolvableApiException(org.xms.g.common.api.Status param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance())))));
        } else {
            this.setGInstance(new GImpl(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance())))));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.ResolvableApiException.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.ResolvableApiException.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ResolvableApiException object
     */
    public static org.xms.g.common.api.ResolvableApiException dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.ResolvableApiException) param0);
    }

    /**
     * org.xms.g.common.api.ResolvableApiException.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.ResolvableApiException;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.ResolvableApiException;
        }
    }

    /**
     * org.xms.g.common.api.ResolvableApiException.getResolution() A pending intent to resolve the failure.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.ResolvableApiException.getResolution()
     * com.google.android.gms.common.api.ResolvableApiException.getResolution(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvableApiException#public-pendingintent-getresolution">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvableApiException#public-pendingintent-getresolution</a><br/>
     *
     * @return The pending intent to resolve the failure
     */
    public android.app.PendingIntent getResolution() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.ResolvableApiException) this.getHInstance()).getResolution()");
                return ((com.huawei.hms.common.ResolvableApiException) this.getHInstance()).getResolution();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResolvableApiException) this.getGInstance()).getResolution()");
                return ((com.google.android.gms.common.api.ResolvableApiException) this.getGInstance()).getResolution();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.ResolvableApiException) this.getHInstance())).getResolutionCallSuper()");
                return ((HImpl) ((com.huawei.hms.common.ResolvableApiException) this.getHInstance())).getResolutionCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.ResolvableApiException) this.getGInstance())).getResolutionCallSuper()");
                return ((GImpl) ((com.google.android.gms.common.api.ResolvableApiException) this.getGInstance())).getResolutionCallSuper();
            }
        }
    }

    /**
     * org.xms.g.common.api.ResolvableApiException.startResolutionForResult(android.app.Activity,int) Resolves an error by starting any intents requiring user interaction.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.ResolvableApiException.startResolutionForResult(android.app.Activity,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/resolvableapiexception-0000001050123089#EN-US_TOPIC_0000001050123089__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/resolvableapiexception-0000001050123089#EN-US_TOPIC_0000001050123089__section32821622269</a><br/>
     * com.google.android.gms.common.api.ResolvableApiException.startResolutionForResult(android.app.Activity,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvableApiException#public-void-startresolutionforresult-activity-activity,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvableApiException#public-void-startresolutionforresult-activity-activity,-int-requestcode</a><br/>
     *
     * @param param0 An Activity context to use to resolve the issue
     * @param param1 The request code to pass to onActivityResult
     * @throws android.content.IntentSender.SendIntentException If the resolution intent has been canceled or is no longer able to execute the request
     */
    public void startResolutionForResult(android.app.Activity param0, int param1) throws android.content.IntentSender.SendIntentException {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.ResolvableApiException) this.getHInstance()).startResolutionForResult(param0, param1)");
                ((com.huawei.hms.common.ResolvableApiException) this.getHInstance()).startResolutionForResult(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResolvableApiException) this.getGInstance()).startResolutionForResult(param0, param1)");
                ((com.google.android.gms.common.api.ResolvableApiException) this.getGInstance()).startResolutionForResult(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.ResolvableApiException) this.getHInstance())).startResolutionForResultCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.common.ResolvableApiException) this.getHInstance())).startResolutionForResultCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.ResolvableApiException) this.getGInstance())).startResolutionForResultCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.common.api.ResolvableApiException) this.getGInstance())).startResolutionForResultCallSuper(param0, param1);
            }
        }
    }

    private class GImpl extends com.google.android.gms.common.api.ResolvableApiException {

        public GImpl(com.google.android.gms.common.api.Status param0) {
            super(param0);
        }

        public android.app.PendingIntent getResolution() {
            return org.xms.g.common.api.ResolvableApiException.this.getResolution();
        }

        public void startResolutionForResult(android.app.Activity param0, int param1) throws android.content.IntentSender.SendIntentException {
            org.xms.g.common.api.ResolvableApiException.this.startResolutionForResult(param0, param1);
        }

        public android.app.PendingIntent getResolutionCallSuper() {
            return super.getResolution();
        }

        public void startResolutionForResultCallSuper(android.app.Activity param0, int param1) throws android.content.IntentSender.SendIntentException {
            super.startResolutionForResult(param0, param1);
        }
    }

    private class HImpl extends com.huawei.hms.common.ResolvableApiException {

        public HImpl(com.huawei.hms.support.api.client.Status param0) {
            super(param0);
        }

        public android.app.PendingIntent getResolution() {
            return org.xms.g.common.api.ResolvableApiException.this.getResolution();
        }

        public void startResolutionForResult(android.app.Activity param0, int param1) throws android.content.IntentSender.SendIntentException {
            org.xms.g.common.api.ResolvableApiException.this.startResolutionForResult(param0, param1);
        }

        public android.app.PendingIntent getResolutionCallSuper() {
            return super.getResolution();
        }

        public void startResolutionForResultCallSuper(android.app.Activity param0, int param1) throws android.content.IntentSender.SendIntentException {
            super.startResolutionForResult(param0, param1);
        }
    }
}