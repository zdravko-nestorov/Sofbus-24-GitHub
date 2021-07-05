package org.xms.g.common.api;

/**
 * OptionalPendingResults are PendingResults with additional support for non-blocking accessors.<br/>
 * Combination of com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.OptionalPendingResult<R extends com.google.android.gms.common.api.Result>.<br/>
 * com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result>: <br/>
 * com.google.android.gms.common.api.OptionalPendingResult<R extends com.google.android.gms.common.api.Result>: OptionalPendingResults are PendingResults with additional support for non-blocking accessors.<br/>
 */
public abstract class OptionalPendingResult<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.PendingResult<XR> {
    private boolean wrapper = true;

    /**
     * org.xms.g.common.api.OptionalPendingResult.OptionalPendingResult(org.xms.g.utils.XBox) constructor of OptionalPendingResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public OptionalPendingResult(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.common.api.OptionalPendingResult.OptionalPendingResult() constructor of OptionalPendingResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result>.OptionalPendingResult()
     * com.google.android.gms.common.api.OptionalPendingResult.OptionalPendingResult(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-optionalpendingresult">https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-optionalpendingresult</a><br/>
     */
    public OptionalPendingResult() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.OptionalPendingResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.OptionalPendingResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted OptionalPendingResult object
     */
    public static org.xms.g.common.api.OptionalPendingResult dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.api.OptionalPendingResult) {
            return ((org.xms.g.common.api.OptionalPendingResult) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.api.OptionalPendingResult gReturn = ((com.google.android.gms.common.api.OptionalPendingResult) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.common.api.OptionalPendingResult hReturn = ((com.huawei.hms.common.api.OptionalPendingResult) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.api.OptionalPendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.common.api.OptionalPendingResult) param0);
    }

    /**
     * org.xms.g.common.api.OptionalPendingResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.OptionalPendingResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.OptionalPendingResult;
        }
    }

    /**
     * org.xms.g.common.api.OptionalPendingResult.get() Returns the Result immediately if it is available.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result>.get()
     * com.google.android.gms.common.api.OptionalPendingResult.get(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-abstract-r-get">https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-abstract-r-get</a><br/>
     *
     * @return the Result immediately if it is available
     */
    public abstract XR get();

    /**
     * org.xms.g.common.api.OptionalPendingResult.isDone() Returns true if the result is available immediately, false otherwise.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result>.isDone()
     * com.google.android.gms.common.api.OptionalPendingResult.isDone(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-abstract-boolean-isdone">https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-abstract-boolean-isdone</a><br/>
     *
     * @return True if the result is available immediately, false otherwise
     */
    public abstract boolean isDone();

    /**
     * Wrapper class of OptionalPendingResults that are PendingResults with additional support for non-blocking accessors.<br/>
     * Combination of com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.OptionalPendingResult<R extends com.google.android.gms.common.api.Result>.<br/>
     * com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result>: <br/>
     * com.google.android.gms.common.api.OptionalPendingResult<R extends com.google.android.gms.common.api.Result>: OptionalPendingResults are PendingResults with additional support for non-blocking accessors.<br/>
     */
    public static class XImpl<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.OptionalPendingResult<XR> {

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.get() Returns the Result immediately if it is available.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result>.get()
         * com.google.android.gms.common.api.OptionalPendingResult.get(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-abstract-r-get">https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-abstract-r-get</a><br/>
         *
         * @return the Result immediately if it is available
         */
        public XR get() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).get()");
                java.lang.Object hmsObj = ((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).get();
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).get()");
                java.lang.Object gmsObj = ((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).get();
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.isDone() Returns true if the result is available immediately, false otherwise.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.api.OptionalPendingResult<R extends com.huawei.hms.support.api.client.Result>.isDone()
         * com.google.android.gms.common.api.OptionalPendingResult.isDone(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-abstract-boolean-isdone">https://developers.google.com/android/reference/com/google/android/gms/common/api/OptionalPendingResult#public-abstract-boolean-isdone</a><br/>
         *
         * @return True if the result is available immediately, false otherwise
         */
        public boolean isDone() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).isDone()");
                return ((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).isDone();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).isDone()");
                return ((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).isDone();
            }
        }

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.await() Blocks until the task is completed. This is not allowed on the UI thread. The returned result object can have an additional failure mode of INTERRUPTED.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.PendingResult.await(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await</a><br/>
         *
         * @return the result object
         */
        public XR await() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).await()");
                java.lang.Object hmsObj = ((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).await();
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).await()");
                java.lang.Object gmsObj = ((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).await();
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.await(long,java.util.concurrent.TimeUnit) Blocks until the task is completed or has timed out waiting for the result. This is not allowed on the UI thread. The returned result object can have an additional failure mode of either INTERRUPTED or TIMEOUT.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.PendingResult.await(long,java.util.concurrent.TimeUnit): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await-long-time,-timeunit-units">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-r-await-long-time,-timeunit-units</a><br/>
         *
         * @param param0 the maximum time to wait
         * @param param1 the time unit of the timeout argument
         * @return the result object
         */
        public XR await(long param0, java.util.concurrent.TimeUnit param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).await(param0, param1)");
                java.lang.Object hmsObj = ((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).await(param0, param1);
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).await(param0, param1)");
                java.lang.Object gmsObj = ((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).await(param0, param1);
                return ((XR) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.cancel() Requests that the PendingResult be canceled.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.PendingResult.cancel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-cancel">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-cancel</a><br/>
         */
        public void cancel() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).cancel()");
                ((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).cancel();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).cancel()");
                ((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).cancel();
            }
        }

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.isCanceled() Indicates whether the pending result has been canceled either due to calling disconnect() or calling cancel() directly on the pending result or an enclosing Batch.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.PendingResult.isCanceled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-boolean-iscanceled">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-boolean-iscanceled</a><br/>
         *
         * @return True if the pending result has been canceled
         */
        public boolean isCanceled() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).isCanceled()");
                return ((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).isCanceled();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).isCanceled()");
                return ((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).isCanceled();
            }
        }

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.setResultCallback(org.xms.g.common.api.ResultCallback<? super XR>) Set the callback here if you want the result to be delivered via a callback when the result is ready.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback</a><br/>
         *
         * @param param0 the callback
         */
        public void setResultCallback(org.xms.g.common.api.ResultCallback<? super XR> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).setResultCallback(((param0) == null ? null : (param0.getHInstanceResultCallback())))");
                ((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).setResultCallback(((param0) == null ? null : (param0.getHInstanceResultCallback())));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).setResultCallback(((param0) == null ? null : (param0.getGInstanceResultCallback())))");
                ((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).setResultCallback(((param0) == null ? null : (param0.getGInstanceResultCallback())));
            }
        }

        /**
         * org.xms.g.common.api.OptionalPendingResult.XImpl.setResultCallback(org.xms.g.common.api.ResultCallback<? super XR>,long,java.util.concurrent.TimeUnit) Set the callback here if you want the result to be delivered via a callback when the result is ready or has timed out waiting for the result. The returned result object can have an additional failure mode of TIMEOUT.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.PendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R>,long,java.util.concurrent.TimeUnit): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback,-long-time,-timeunit-units">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResult#public-abstract-void-setresultcallback-resultcallback-super-r-callback,-long-time,-timeunit-units</a><br/>
         *
         * @param param0 the callback
         * @param param1 the maximum time to wait
         * @param param2 the time unit of the timeout argument
         */
        public void setResultCallback(org.xms.g.common.api.ResultCallback<? super XR> param0, long param1, java.util.concurrent.TimeUnit param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).setResultCallback(((param0) == null ? null : (param0.getHInstanceResultCallback())), param1, param2)");
                ((com.huawei.hms.common.api.OptionalPendingResult) this.getHInstance()).setResultCallback(((param0) == null ? null : (param0.getHInstanceResultCallback())), param1, param2);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).setResultCallback(((param0) == null ? null : (param0.getGInstanceResultCallback())), param1, param2)");
                ((com.google.android.gms.common.api.OptionalPendingResult) this.getGInstance()).setResultCallback(((param0) == null ? null : (param0.getGInstanceResultCallback())), param1, param2);
            }
        }
    }

    private class GImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.OptionalPendingResult<R> {

        public GImpl() {
            super();
        }

        public R get() {
            XR xResult = ((XR) org.xms.g.common.api.OptionalPendingResult.this.get());
            return ((R) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
        }

        public boolean isDone() {
            return org.xms.g.common.api.OptionalPendingResult.this.isDone();
        }

        public R await() {
            XR xResult = ((XR) org.xms.g.common.api.OptionalPendingResult.this.await());
            return ((R) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
        }

        public R await(long param0, java.util.concurrent.TimeUnit param1) {
            XR xResult = ((XR) org.xms.g.common.api.OptionalPendingResult.this.await(param0, param1));
            return ((R) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
        }

        public void cancel() {
            org.xms.g.common.api.OptionalPendingResult.this.cancel();
        }

        public boolean isCanceled() {
            return org.xms.g.common.api.OptionalPendingResult.this.isCanceled();
        }

        public void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> param0) {
            org.xms.g.common.api.OptionalPendingResult.this.setResultCallback(((param0) == null ? null : (new org.xms.g.common.api.ResultCallback.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> param0, long param1, java.util.concurrent.TimeUnit param2) {
            org.xms.g.common.api.OptionalPendingResult.this.setResultCallback(((param0) == null ? null : (new org.xms.g.common.api.ResultCallback.XImpl(new org.xms.g.utils.XBox(param0, null)))), param1, param2);
        }
    }

    private class HImpl<R extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.common.api.OptionalPendingResult<R> {

        public HImpl() {
            super();
        }

        public R get() {
            XR xResult = ((XR) org.xms.g.common.api.OptionalPendingResult.this.get());
            return ((R) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
        }

        public boolean isDone() {
            return org.xms.g.common.api.OptionalPendingResult.this.isDone();
        }

        public R await() {
            XR xResult = ((XR) org.xms.g.common.api.OptionalPendingResult.this.await());
            return ((R) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
        }

        public R await(long param0, java.util.concurrent.TimeUnit param1) {
            XR xResult = ((XR) org.xms.g.common.api.OptionalPendingResult.this.await(param0, param1));
            return ((R) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
        }

        public void setResultCallback(com.huawei.hms.support.api.client.ResultCallback<R> param0) {
            org.xms.g.common.api.OptionalPendingResult.this.setResultCallback(((param0) == null ? null : (new org.xms.g.common.api.ResultCallback.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void setResultCallback(android.os.Looper param0, com.huawei.hms.support.api.client.ResultCallback<R> param1) {
            throw new java.lang.RuntimeException("Stub");
        }

        public void cancel() {
            org.xms.g.common.api.OptionalPendingResult.this.cancel();
        }

        public boolean isCanceled() {
            return org.xms.g.common.api.OptionalPendingResult.this.isCanceled();
        }

        public void setResultCallback(com.huawei.hms.support.api.client.ResultCallback<R> param0, long param1, java.util.concurrent.TimeUnit param2) {
            org.xms.g.common.api.OptionalPendingResult.this.setResultCallback(((param0) == null ? null : (new org.xms.g.common.api.ResultCallback.XImpl(new org.xms.g.utils.XBox(null, param0)))), param1, param2);
        }
    }
}