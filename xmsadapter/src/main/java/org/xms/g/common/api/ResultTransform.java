package org.xms.g.common.api;


/**
 * Transforms a Result by making a subsequent API call.<br/>
 * Combination of com.huawei.hms.support.api.client.ResultConvert<R extends com.huawei.hms.support.api.client.Result, S extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result>.<br/>
 * com.huawei.hms.support.api.client.ResultConvert<R extends com.huawei.hms.support.api.client.Result, S extends com.huawei.hms.support.api.client.Result>: <br/>
 * com.google.android.gms.common.api.ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result>: Transforms a Result by making a subsequent API call.<br/>
 */
public abstract class ResultTransform<XR extends org.xms.g.common.api.Result, XS extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject {
    private boolean wrapper = true;


    /**
     * org.xms.g.common.api.ResultTransform.ResultTransform(org.xms.g.utils.XBox) constructor of ResultTransform with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ResultTransform(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.common.api.ResultTransform.ResultTransform() constructor of ResultTransform.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResultConvert<R extends com.huawei.hms.support.api.client.Result,S extends com.huawei.hms.support.api.client.Result>.ResultConvert()
     * com.google.android.gms.common.api.ResultTransform.ResultTransform(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-resulttransform">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-resulttransform</a><br/>
     */
    public ResultTransform() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.ResultTransform.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.ResultTransform.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ResultTransform object
     */
    public static org.xms.g.common.api.ResultTransform dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.ResultTransform) param0);
    }

    /**
     * org.xms.g.common.api.ResultTransform.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.ResultConvert;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.ResultTransform;
        }
    }

    /**
     * org.xms.g.common.api.ResultTransform.createFailedResult(org.xms.g.common.api.Status) Creates a failed result with the given Status.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResultConvert<R extends com.huawei.hms.support.api.client.Result,S extends com.huawei.hms.support.api.client.Result>.newFailedPendingResult(com.huawei.hms.support.api.client.Status)
     * com.google.android.gms.common.api.ResultTransform.createFailedResult(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-final-pendingresults-createfailedresult-status-status">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-final-pendingresults-createfailedresult-status-status</a><br/>
     *
     * @param param0 Status instance
     * @return PendingResult instance
     */
    public final org.xms.g.common.api.PendingResult<XS> createFailedResult(org.xms.g.common.api.Status param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultConvert) this.getHInstance()).newFailedPendingResult(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.support.api.client.PendingResult hReturn = ((com.huawei.hms.support.api.client.ResultConvert) this.getHInstance()).newFailedPendingResult(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultTransform) this.getGInstance()).createFailedResult(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.common.api.ResultTransform) this.getGInstance()).createFailedResult(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.common.api.ResultTransform.onFailure(org.xms.g.common.api.Status) Called when the PendingResult to be transformed returns a failure.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResultConvert<R extends com.huawei.hms.support.api.client.Result,S extends com.huawei.hms.support.api.client.Result>.onFailed(com.huawei.hms.support.api.client.Status)
     * com.google.android.gms.common.api.ResultTransform.onFailure(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-status-onfailure-status-status">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-status-onfailure-status-status</a><br/>
     *
     * @param param0 The status of the failure
     * @return The status of the result of the transformation. Must not be success or null
     */
    public org.xms.g.common.api.Status onFailure(org.xms.g.common.api.Status param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultConvert) this.getHInstance()).onFailed(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.support.api.client.ResultConvert) this.getHInstance()).onFailed(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultTransform) this.getGInstance()).onFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.common.api.ResultTransform) this.getGInstance()).onFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, null))));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.support.api.client.ResultConvert) this.getHInstance())).onFailedCallSuper(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.support.api.client.Status hReturn = ((HImpl) ((com.huawei.hms.support.api.client.ResultConvert) this.getHInstance())).onFailedCallSuper(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.ResultTransform) this.getGInstance())).onFailureCallSuper(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.Status gReturn = ((GImpl) ((com.google.android.gms.common.api.ResultTransform) this.getGInstance())).onFailureCallSuper(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }

    /**
     * org.xms.g.common.api.ResultTransform.onSuccess(XR) Transforms the result of a successful API call.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.api.ResultTransform.onSuccess(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-abstract-pendingresults-onsuccess-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-abstract-pendingresults-onsuccess-r-result</a><br/>
     *
     * @param param0 The successful result to be transformed. Never null. If this result is Releasable it will be automatically released after this transform is applied; it is not necessary to release the result inside onSuccess. It is an error to set callbacks on this result. Any callbacks set on this result will be overridden and will not be called
     * @return The result of the transformation. Normally the result of another API call. To shortcut execution and directly yield a failure, return either:null, which is translated into a Status with code ERROR; or a specific failure created using createFailedResult(Status)
     */
    public abstract org.xms.g.common.api.PendingResult<XS> onSuccess(XR param0);

    /**
     * Wrapper class of ResultTransform which transforms a Result by making a subsequent API call.<br/>
     * Combination of com.huawei.hms.support.api.client.ResultConvert<R extends com.huawei.hms.support.api.client.Result, S extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result>.<br/>
     * com.huawei.hms.support.api.client.ResultConvert<R extends com.huawei.hms.support.api.client.Result, S extends com.huawei.hms.support.api.client.Result>: <br/>
     * com.google.android.gms.common.api.ResultTransform<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result>: Transforms a Result by making a subsequent API call.<br/>
     */
    public static class XImpl<XR extends org.xms.g.common.api.Result, XS extends org.xms.g.common.api.Result> extends org.xms.g.common.api.ResultTransform<XR, XS> {


        /**
         * org.xms.g.common.api.ResultTransform.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.ResultTransform.XImpl.onSuccess(XR) Transforms the result of a successful API call.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.ResultTransform.onSuccess(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-abstract-pendingresults-onsuccess-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultTransform#public-abstract-pendingresults-onsuccess-r-result</a><br/>
         *
         * @param param0 The successful result to be transformed. Never null. If this result is Releasable it will be automatically released after this transform is applied; it is not necessary to release the result inside onSuccess. It is an error to set callbacks on this result. Any callbacks set on this result will be overridden and will not be called
         * @return The result of the transformation. Normally the result of another API call. To shortcut execution and directly yield a failure, return either:null, which is translated into a Status with code ERROR; or a specific failure created using createFailedResult(Status)
         */
        public org.xms.g.common.api.PendingResult<XS> onSuccess(XR param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultConvert) this.getHInstance()).onSuccess(((com.huawei.hms.support.api.client.Result) hObj0)");
                java.lang.Object hObj0 = org.xms.g.utils.Utils.getInstanceInInterface(param0, true);
                com.huawei.hms.support.api.client.PendingResult hReturn = null;
                hReturn = ((com.huawei.hms.support.api.client.ResultConvert) this.getHInstance()).onSuccess(((com.huawei.hms.support.api.client.Result) hObj0));
                if (hReturn == null)
                    return null;
                return new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultTransform) this.getGInstance()).onSuccess(gObj0)");
                com.google.android.gms.common.api.PendingResult gReturn = ((com.google.android.gms.common.api.ResultTransform) this.getGInstance()).onSuccess(gObj0);
                return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }

    private class GImpl<R extends com.google.android.gms.common.api.Result, S extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.ResultTransform<R, S> {

        public GImpl() {
            super();
        }

        public com.google.android.gms.common.api.Status onFailure(com.google.android.gms.common.api.Status param0) {
            org.xms.g.common.api.Status xResult = org.xms.g.common.api.ResultTransform.this.onFailure(((param0) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(param0, null)))));
            return ((com.google.android.gms.common.api.Status) ((xResult) == null ? null : (xResult.getGInstance())));
        }

        public com.google.android.gms.common.api.Status onFailureCallSuper(com.google.android.gms.common.api.Status param0) {
            return super.onFailure(param0);
        }

        public com.google.android.gms.common.api.PendingResult<S> onSuccess(R param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            java.lang.Object result = org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResultTransform.this, "onSuccess", params, types, false);
            return ((com.google.android.gms.common.api.PendingResult) org.xms.g.utils.Utils.handleInvokeBridgeReturnValue(result, false));
        }
    }

    private class HImpl<R extends com.huawei.hms.support.api.client.Result, S extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.support.api.client.ResultConvert<R, S> {


        public HImpl() {
            super();
        }

        public com.huawei.hms.support.api.client.Status onFailed(com.huawei.hms.support.api.client.Status param0) {
            org.xms.g.common.api.Status xResult = org.xms.g.common.api.ResultTransform.this.onFailure(((param0) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, param0)))));
            return ((com.huawei.hms.support.api.client.Status) ((xResult) == null ? null : (xResult.getHInstance())));
        }

        public com.huawei.hms.support.api.client.Status onFailedCallSuper(com.huawei.hms.support.api.client.Status param0) {
            return super.onFailed(param0);
        }

        public com.huawei.hms.support.api.client.PendingResult onSuccess(com.huawei.hms.support.api.client.Result param0) {
            throw new java.lang.RuntimeException("Stub");
        }
    }
}