package org.xms.g.common.api;

/**
 * Callbacks for receiving a Result from a PendingResult as an asynchronous callback. Contains separate callbacks for success and failure.<br/>
 * Combination of com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.ResultCallbacks<R extends com.google.android.gms.common.api.Result>.<br/>
 * com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result>: <br/>
 * com.google.android.gms.common.api.ResultCallbacks<R extends com.google.android.gms.common.api.Result>: Callbacks for receiving a Result from a PendingResult as an asynchronous callback. Contains separate callbacks for success and failure.<br/>
 */
public abstract class ResultCallbacks<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject implements org.xms.g.common.api.ResultCallback<XR> {
    private boolean wrapper = true;

    /**
     * org.xms.g.common.api.ResultCallbacks.ResultCallbacks(org.xms.g.utils.XBox) constructor of ResultCallbacks with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ResultCallbacks(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.common.api.ResultCallbacks.ResultCallbacks() constructor of ResultCallbacks.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.ResultCallbacks()
     * com.google.android.gms.common.api.ResultCallbacks.ResultCallbacks(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-resultcallbacks">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-resultcallbacks</a><br/>
     */
    public ResultCallbacks() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.ResultCallbacks.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.ResultCallbacks.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ResultCallbacks object
     */
    public static org.xms.g.common.api.ResultCallbacks dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.api.ResultCallbacks) {
            return ((org.xms.g.common.api.ResultCallbacks) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.api.ResultCallbacks gReturn = ((com.google.android.gms.common.api.ResultCallbacks) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.support.api.client.ResultCallbacks hReturn = ((com.huawei.hms.support.api.client.ResultCallbacks) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.api.ResultCallbacks.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.common.api.ResultCallbacks) param0);
    }

    /**
     * org.xms.g.common.api.ResultCallbacks.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.ResultCallbacks;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.ResultCallbacks;
        }
    }

    /**
     * org.xms.g.common.api.ResultCallbacks.onFailure(org.xms.g.common.api.Status) Called when the Result is ready and a failure occurred.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.onFailure(com.huawei.hms.support.api.client.Status)
     * com.google.android.gms.common.api.ResultCallbacks.onFailure(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onfailure-status-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onfailure-status-result</a><br/>
     *
     * @param param0 Status resulting from the API call. Guaranteed to be non-null and unsuccessful
     */
    public abstract void onFailure(org.xms.g.common.api.Status param0);

    /**
     * org.xms.g.common.api.ResultCallbacks.onSuccess(XR) Called when the Result is ready and was successful.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.onSuccess(R)
     * com.google.android.gms.common.api.ResultCallbacks.onSuccess(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onsuccess-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onsuccess-r-result</a><br/>
     *
     * @param param0 The result from the API call. Never null
     */
    public abstract void onSuccess(XR param0);

    /**
     * Wrapper class of Callbacks for receiving a Result from a PendingResult as an asynchronous callback. Contains separate callbacks for success and failure.<br/>
     * Combination of com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.ResultCallbacks<R extends com.google.android.gms.common.api.Result>.<br/>
     * com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result>: <br/>
     * com.google.android.gms.common.api.ResultCallbacks<R extends com.google.android.gms.common.api.Result>: Callbacks for receiving a Result from a PendingResult as an asynchronous callback. Contains separate callbacks for success and failure.<br/>
     */
    public static class XImpl<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.ResultCallbacks<XR> {

        /**
         * org.xms.g.common.api.ResultCallbacks.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.ResultCallbacks.XImpl.onFailure(org.xms.g.common.api.Status) Called when the Result is ready and a failure occurred.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.onFailure(com.huawei.hms.support.api.client.Status)
         * com.google.android.gms.common.api.ResultCallbacks.onFailure(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onfailure-status-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onfailure-status-result</a><br/>
         *
         * @param param0 Status resulting from the API call. Guaranteed to be non-null and unsuccessful
         */
        public void onFailure(org.xms.g.common.api.Status param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onFailure(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onFailure(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }

        /**
         * org.xms.g.common.api.ResultCallbacks.XImpl.onSuccess(XR) Called when the Result is ready and was successful.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.ResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.onSuccess(R)
         * com.google.android.gms.common.api.ResultCallbacks.onSuccess(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onsuccess-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onsuccess-r-result</a><br/>
         *
         * @param param0 The result from the API call. Never null
         */
        public void onSuccess(XR param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onSuccess(hObj0)");
                ((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onSuccess(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onSuccess(gObj0)");
                ((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onSuccess(gObj0);
            }
        }

        /**
         * org.xms.g.common.api.ResultCallbacks.XImpl.onResult(XR) Called when the Result is ready.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.ResultCallback<R>.onResult(R): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/resultcallback_r-0000001050121136#EN-US_TOPIC_0000001050121136__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/resultcallback_r-0000001050121136#EN-US_TOPIC_0000001050121136__section32821622269</a><br/>
         * com.google.android.gms.common.api.ResultCallback.onResult(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallback#public-abstract-void-onresult-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallback#public-abstract-void-onresult-r-result</a><br/>
         *
         * @param param0 The result from the API call. Never null
         */
        public void onResult(XR param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onResult(hObj0)");
                ((com.huawei.hms.support.api.client.ResultCallbacks) this.getHInstance()).onResult(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onResult(gObj0)");
                ((com.google.android.gms.common.api.ResultCallbacks) this.getGInstance()).onResult(gObj0);
            }
        }
    }

    private class GImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.ResultCallbacks<R> {

        public GImpl() {
            super();
        }

        public void onFailure(com.google.android.gms.common.api.Status param0) {
            org.xms.g.common.api.ResultCallbacks.this.onFailure(((param0) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(param0, null)))));
        }

        public void onSuccess(R param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResultCallbacks.this, "onSuccess", params, types, false);
        }
    }

    private class HImpl<R extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.support.api.client.ResultCallbacks<R> {

        public HImpl() {
            super();
        }

        public void onFailure(com.huawei.hms.support.api.client.Status param0) {
            org.xms.g.common.api.ResultCallbacks.this.onFailure(((param0) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, param0)))));
        }

        public void onSuccess(R param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResultCallbacks.this, "onSuccess", params, types, true);
        }
    }
}