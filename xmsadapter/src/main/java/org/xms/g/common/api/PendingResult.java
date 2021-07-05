package org.xms.g.common.api;

/**
 * Represents a pending result from calling an API method in services.<br/>
 * Combination of com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.PendingResult<R extends com.google.android.gms.common.api.Result>.<br/>
 * com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result>: <br/>
 * com.google.android.gms.common.api.PendingResult<R extends com.google.android.gms.common.api.Result>: Represents a pending result from calling an API method in Google Play services.<br/>
 */
public abstract class PendingResult<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.api.PendingResult.PendingResult(org.xms.g.utils.XBox) constructor of PendingResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public PendingResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.PendingResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.PendingResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted PendingResult object
     */
    public static org.xms.g.common.api.PendingResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.PendingResult) param0);
    }

    /**
     * org.xms.g.common.api.PendingResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.PendingResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.PendingResult;
        }
    }

    /**
     * org.xms.g.common.api.PendingResult.await() Blocks until the task is completed. This is not allowed on the UI thread. The returned result object can have an additional failure mode of INTERRUPTED.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.await()
     * com.google.android.gms.common.api.PendingResult.await(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await</a><br/>
     *
     * @return the Result immediately if it is available
     */
    public abstract XR await();

    /**
     * org.xms.g.common.api.PendingResult.await(long,java.util.concurrent.TimeUnit) Blocks until the task is completed or has timed out waiting for the result. This is not allowed on the UI thread. The returned result object can have an additional failure mode of either INTERRUPTED or TIMEOUT.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.await(long,java.util.concurrent.TimeUnit)
     * com.google.android.gms.common.api.PendingResult.await(long,java.util.concurrent.TimeUnit): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await-long-time,-timeunit-units">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await-long-time,-timeunit-units</a><br/>
     *
     * @param param0 the maximum time to wait
     * @param param1 the time unit of the timeout argument
     * @return the Result immediately if it is available
     */
    public abstract XR await(long param0, java.util.concurrent.TimeUnit param1);

    /**
     * org.xms.g.common.api.PendingResult.cancel() Requests that the PendingResult be canceled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.cancel()
     * com.google.android.gms.common.api.PendingResult.cancel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-cancel">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-cancel</a><br/>
     */
    public abstract void cancel();

    /**
     * org.xms.g.common.api.PendingResult.isCanceled() Indicates whether the pending result has been canceled either due to calling disconnect() or calling cancel() directly on the pending result or an enclosing Batch.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.isCanceled()
     * com.google.android.gms.common.api.PendingResult.isCanceled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-boolean-iscanceled">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-boolean-iscanceled</a><br/>
     *
     * @return True if the pending result has been canceled
     */
    public abstract boolean isCanceled();

    /**
     * org.xms.g.common.api.PendingResult.setResultCallback(org.xms.g.common.api.ResultCallback<? super XR>) Set the callback here if you want the result to be delivered via a callback when the result is ready.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.setResultCallback(com.huawei.hms.support.api.client.ResultCallback<R>)
     * com.google.android.gms.common.api.PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback</a><br/>
     *
     * @param param0 callback instance
     */
    public abstract void setResultCallback(org.xms.g.common.api.ResultCallback<? super XR> param0);

    /**
     * org.xms.g.common.api.PendingResult.setResultCallback(org.xms.g.common.api.ResultCallback<? super XR>,long,java.util.concurrent.TimeUnit) Set the callback here if you want the result to be delivered via a callback when the result is ready or has timed out waiting for the result. The returned result object can have an additional failure mode of TIMEOUT.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.setResultCallback(com.huawei.hms.support.api.client.ResultCallback<R>,long,java.util.concurrent.TimeUnit)
     * com.google.android.gms.common.api.PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R>,long,java.util.concurrent.TimeUnit): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback,-long-time,-timeunit-units">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback,-long-time,-timeunit-units</a><br/>
     *
     * @param param0 callback instance
     * @param param1 the maximum time to wait
     * @param param2 the time unit of the timeout argument
     */
    public abstract void setResultCallback(org.xms.g.common.api.ResultCallback<? super XR> param0, long param1, java.util.concurrent.TimeUnit param2);

    public <XS extends org.xms.g.common.api.Result> org.xms.g.common.api.TransformedResult<XS> then(org.xms.g.common.api.ResultTransform<? super XR, ? extends XS> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).convertResult(((com.huawei.hms.support.api.client.ResultConvert) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.support.api.client.ConvertedResult hReturn = ((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).convertResult(((com.huawei.hms.support.api.client.ResultConvert) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.common.api.TransformedResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.PendingResult) this.getGInstance()).then(((com.google.android.gms.common.api.ResultTransform) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.common.api.TransformedResult gReturn = ((com.google.android.gms.common.api.PendingResult) this.getGInstance()).then(((com.google.android.gms.common.api.ResultTransform) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.common.api.TransformedResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * Wrapper class of PendingResult which represents a pending result from calling an API method in services.<br/>
     * Combination of com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.PendingResult<R extends com.google.android.gms.common.api.Result>.<br/>
     * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>: <br/>
     * com.google.android.gms.common.api.PendingResult<R extends com.google.android.gms.common.api.Result>: Represents a pending result from calling an API method in Google Play services.<br/>
     */
    public static class XImpl<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.PendingResult<XR> {

        /**
         * org.xms.g.common.api.PendingResult.XImpl.XImpl(org.xms.g.utils.XBox) constructor of PendingResult.XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.PendingResult.XImpl.await() Blocks until the task is completed. This is not allowed on the UI thread. The returned result object can have an additional failure mode of INTERRUPTED.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.await()
         * com.google.android.gms.common.api.PendingResult.await(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await</a><br/>
         *
         * @return the Result immediately if it is available
         */
        public XR await() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).await()");
                java.lang.Object hmsObj = ((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).await();
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.PendingResult) this.getGInstance()).await()");
                java.lang.Object gmsObj = ((com.google.android.gms.common.api.PendingResult) this.getGInstance()).await();
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }

        /**
         * org.xms.g.common.api.PendingResult.XImpl.await(long,java.util.concurrent.TimeUnit) Blocks until the task is completed or has timed out waiting for the result. This is not allowed on the UI thread. The returned result object can have an additional failure mode of either INTERRUPTED or TIMEOUT.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.await(long,java.util.concurrent.TimeUnit)
         * com.google.android.gms.common.api.PendingResult.await(long,java.util.concurrent.TimeUnit): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await-long-time,-timeunit-units">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await-long-time,-timeunit-units</a><br/>
         *
         * @param param0 the maximum time to wait
         * @param param1 the time unit of the timeout argument
         * @return the Result immediately if it is available
         */
        public XR await(long param0, java.util.concurrent.TimeUnit param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).await(param0, param1)");
                java.lang.Object hmsObj = ((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).await(param0, param1);
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.PendingResult) this.getGInstance()).await(param0, param1)");
                java.lang.Object gmsObj = ((com.google.android.gms.common.api.PendingResult) this.getGInstance()).await(param0, param1);
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }

        /**
         * org.xms.g.common.api.PendingResult.XImpl.cancel() Requests that the PendingResult be canceled.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.cancel()
         * com.google.android.gms.common.api.PendingResult.cancel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-cancel">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-cancel</a><br/>
         */
        public void cancel() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).cancel()");
                ((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).cancel();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.PendingResult) this.getGInstance()).cancel()");
                ((com.google.android.gms.common.api.PendingResult) this.getGInstance()).cancel();
            }
        }

        /**
         * org.xms.g.common.api.PendingResult.XImpl.isCanceled() Indicates whether the pending result has been canceled either due to calling disconnect() or calling cancel() directly on the pending result or an enclosing Batch.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.isCanceled()
         * com.google.android.gms.common.api.PendingResult.isCanceled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-boolean-iscanceled">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-boolean-iscanceled</a><br/>
         *
         * @return True if the pending result has been canceled
         */
        public boolean isCanceled() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).isCanceled()");
                return ((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).isCanceled();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.PendingResult) this.getGInstance()).isCanceled()");
                return ((com.google.android.gms.common.api.PendingResult) this.getGInstance()).isCanceled();
            }
        }

        /**
         * org.xms.g.common.api.PendingResult.XImpl.setResultCallback(org.xms.g.common.api.ResultCallback<? super XR>) Set the callback here if you want the result to be delivered via a callback when the result is ready.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.setResultCallback(com.huawei.hms.support.api.client.ResultCallback<R>)
         * com.google.android.gms.common.api.PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback</a><br/>
         *
         * @param param0 callback instance
         */
        public void setResultCallback(org.xms.g.common.api.ResultCallback<? super XR> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).setResultCallback(((param0) == null ? null : (param0.getHInstanceResultCallback())))");
                ((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).setResultCallback(((param0) == null ? null : (param0.getHInstanceResultCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.PendingResult) this.getGInstance()).setResultCallback(((param0) == null ? null : (param0.getGInstanceResultCallback())))");
                ((com.google.android.gms.common.api.PendingResult) this.getGInstance()).setResultCallback(((param0) == null ? null : (param0.getGInstanceResultCallback())));
            }
        }

        /**
         * org.xms.g.common.api.PendingResult.XImpl.setResultCallback(org.xms.g.common.api.ResultCallback<? super XR>,long,java.util.concurrent.TimeUnit) Set the callback here if you want the result to be delivered via a callback when the result is ready or has timed out waiting for the result. The returned result object can have an additional failure mode of TIMEOUT.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.PendingResult<R extends com.huawei.hms.support.api.client.Result>.setResultCallback(com.huawei.hms.support.api.client.ResultCallback<R>,long,java.util.concurrent.TimeUnit)
         * com.google.android.gms.common.api.PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R>,long,java.util.concurrent.TimeUnit): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback,-long-time,-timeunit-units">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback,-long-time,-timeunit-units</a><br/>
         *
         * @param param0 callback instance
         * @param param1 the maximum time to wait
         * @param param2 the time unit of the timeout argument
         */
        public void setResultCallback(org.xms.g.common.api.ResultCallback<? super XR> param0, long param1, java.util.concurrent.TimeUnit param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).setResultCallback(((param0) == null ? null : (param0.getHInstanceResultCallback())), param1, param2)");
                ((com.huawei.hms.support.api.client.PendingResult) this.getHInstance()).setResultCallback(((param0) == null ? null : (param0.getHInstanceResultCallback())), param1, param2);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.PendingResult) this.getGInstance()).setResultCallback(((param0) == null ? null : (param0.getGInstanceResultCallback())), param1, param2)");
                ((com.google.android.gms.common.api.PendingResult) this.getGInstance()).setResultCallback(((param0) == null ? null : (param0.getGInstanceResultCallback())), param1, param2);
            }
        }
    }
}