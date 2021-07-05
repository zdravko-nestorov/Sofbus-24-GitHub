package org.xms.g.common.api;

/**
 * ResultCallbacks which automatically start resolutions for failures. Contains separate callbacks for success and unresolvable failures.<br/>
 * Combination of com.huawei.hms.support.api.client.ResolvingResultCallbacks<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.ResolvingResultCallbacks<R extends com.google.android.gms.common.api.Result>.<br/>
 * com.huawei.hms.support.api.client.ResolvingResultCallbacks<R extends com.huawei.hms.support.api.client.Result>: <br/>
 * com.google.android.gms.common.api.ResolvingResultCallbacks<R extends com.google.android.gms.common.api.Result>: ResultCallbacks which automatically start resolutions for failures. Contains separate callbacks for success and unresolvable failures.<br/>
 */
public abstract class ResolvingResultCallbacks<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.ResultCallbacks<XR> {
    private boolean wrapper = true;

    /**
     * org.xms.g.common.api.ResolvingResultCallbacks.ResolvingResultCallbacks(org.xms.g.utils.XBox) constructor of ResolvingResultCallbacks with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ResolvingResultCallbacks(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.common.api.ResolvingResultCallbacks.ResolvingResultCallbacks(android.app.Activity,int) Create new callbacks that automatically resolve failure.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResolvingResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.ResolvingResultCallbacks(android.app.Activity,int)
     * com.google.android.gms.common.api.ResolvingResultCallbacks.ResolvingResultCallbacks(android.app.Activity,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#protected-resolvingresultcallbacks-activity-activity,-int-requestcode">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#protected-resolvingresultcallbacks-activity-activity,-int-requestcode</a><br/>
     *
     * @param param0 Activity to use for displaying UI to resolve failures
     * @param param1 If >= 0, this code will be passed to onActivityResult(int, int, Intent) after the user completes a resolution
     */
    public ResolvingResultCallbacks(android.app.Activity param0, int param1) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl(param0, param1));
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.ResolvingResultCallbacks.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.ResolvingResultCallbacks.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ResolvingResultCallbacks object
     */
    public static org.xms.g.common.api.ResolvingResultCallbacks dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.api.ResolvingResultCallbacks) {
            return ((org.xms.g.common.api.ResolvingResultCallbacks) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.api.ResolvingResultCallbacks gReturn = ((com.google.android.gms.common.api.ResolvingResultCallbacks) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.support.api.client.ResolvingResultCallbacks hReturn = ((com.huawei.hms.support.api.client.ResolvingResultCallbacks) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.api.ResolvingResultCallbacks.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.common.api.ResolvingResultCallbacks) param0);
    }

    /**
     * org.xms.g.common.api.ResolvingResultCallbacks.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.ResolvingResultCallbacks;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.ResolvingResultCallbacks;
        }
    }

    /**
     * org.xms.g.common.api.ResolvingResultCallbacks.onSuccess(XR) Called when the Result is ready and was successful.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResolvingResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.onSuccess(R)
     * com.google.android.gms.common.api.ResolvingResultCallbacks.onSuccess(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#public-abstract-void-onsuccess-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#public-abstract-void-onsuccess-r-result</a><br/>
     *
     * @param param0 The result from the API call. Never null
     */
    public abstract void onSuccess(XR param0);

    /**
     * org.xms.g.common.api.ResolvingResultCallbacks.onUnresolvableFailure(org.xms.g.common.api.Status) Called when a non-resolvable failure occurs or starting a resolution fails.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.api.ResolvingResultCallbacks.onUnresolvableFailure(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#public-abstract-void-onunresolvablefailure-status-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#public-abstract-void-onunresolvablefailure-status-result</a><br/>
     *
     * @param param0 Status resulting from the API call. Guaranteed to be non-null and unsuccessful
     */
    public abstract void onUnresolvableFailure(org.xms.g.common.api.Status param0);

    /**
     * Wrapper class of ResultCallbacks which automatically start resolutions for failures. Contains separate callbacks for success and unresolvable failures.<br/>
     * Combination of com.huawei.hms.support.api.client.ResolvingResultCallbacks<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.ResolvingResultCallbacks<R extends com.google.android.gms.common.api.Result>.<br/>
     * com.huawei.hms.support.api.client.ResolvingResultCallbacks<R extends com.huawei.hms.support.api.client.Result>: <br/>
     * com.google.android.gms.common.api.ResolvingResultCallbacks<R extends com.google.android.gms.common.api.Result>: ResultCallbacks which automatically start resolutions for failures. Contains separate callbacks for success and unresolvable failures.<br/>
     */
    public static class XImpl<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.ResolvingResultCallbacks<XR> {

        /**
         * org.xms.g.common.api.ResolvingResultCallbacks.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.ResolvingResultCallbacks.XImpl.onSuccess(XR) Called when the Result is ready and was successful.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.ResolvingResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.onSuccess(R)
         * com.google.android.gms.common.api.ResolvingResultCallbacks.onSuccess(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#public-abstract-void-onsuccess-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#public-abstract-void-onsuccess-r-result</a><br/>
         *
         * @param param0 The result from the API call. Never null
         */
        public void onSuccess(XR param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResolvingResultCallbacks) this.getHInstance()).onSuccess(hObj0)");
                ((com.huawei.hms.support.api.client.ResolvingResultCallbacks) this.getHInstance()).onSuccess(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResolvingResultCallbacks) this.getGInstance()).onSuccess(gObj0)");
                ((com.google.android.gms.common.api.ResolvingResultCallbacks) this.getGInstance()).onSuccess(gObj0);
            }
        }

        /**
         * org.xms.g.common.api.ResolvingResultCallbacks.XImpl.onUnresolvableFailure(org.xms.g.common.api.Status) Called when a non-resolvable failure occurs or starting a resolution fails.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.ResolvingResultCallbacks<R extends com.huawei.hms.support.api.client.Result>.onUnresolvableFailure(com.huawei.hms.support.api.client.Status)
         * com.google.android.gms.common.api.ResolvingResultCallbacks.onUnresolvableFailure(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#public-abstract-void-onunresolvablefailure-status-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResolvingResultCallbacks#public-abstract-void-onunresolvablefailure-status-result</a><br/>
         *
         * @param param0 Status resulting from the API call. Guaranteed to be non-null and unsuccessful
         */
        public void onUnresolvableFailure(org.xms.g.common.api.Status param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResolvingResultCallbacks) this.getHInstance()).onUnresolvableFailure(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.support.api.client.ResolvingResultCallbacks) this.getHInstance()).onUnresolvableFailure(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResolvingResultCallbacks) this.getGInstance()).onUnresolvableFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.common.api.ResolvingResultCallbacks) this.getGInstance()).onUnresolvableFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }

        /**
         * org.xms.g.common.api.ResolvingResultCallbacks.XImpl.onFailure(org.xms.g.common.api.Status) Called when the Result is ready and a failure occurred.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.ResultCallbacks.onFailure(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onfailure-status-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallbacks#public-abstract-void-onfailure-status-result</a><br/>
         *
         * @param param0 Status resulting from the API call. Guaranteed to be non-null and unsuccessful
         */
        public void onFailure(org.xms.g.common.api.Status param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResolvingResultCallbacks) this.getHInstance()).onFailure(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.support.api.client.ResolvingResultCallbacks) this.getHInstance()).onFailure(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResolvingResultCallbacks) this.getGInstance()).onFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.common.api.ResolvingResultCallbacks) this.getGInstance()).onFailure(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }

        /**
         * org.xms.g.common.api.ResolvingResultCallbacks.XImpl.onResult(XR) Called when the Result is ready.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.ResultCallback.onResult(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallback#public-abstract-void-onresult-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallback#public-abstract-void-onresult-r-result</a><br/>
         *
         * @param param0 The result from the API call. Never null
         */
        public void onResult(XR param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResolvingResultCallbacks) this.getHInstance()).onResult(hObj0)");
                ((com.huawei.hms.support.api.client.ResolvingResultCallbacks) this.getHInstance()).onResult(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResolvingResultCallbacks) this.getGInstance()).onResult(gObj0)");
                ((com.google.android.gms.common.api.ResolvingResultCallbacks) this.getGInstance()).onResult(gObj0);
            }
        }
    }

    private class GImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.ResolvingResultCallbacks<R> {

        public GImpl(android.app.Activity param0, int param1) {
            super(param0, param1);
        }

        public void onSuccess(R param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResolvingResultCallbacks.this, "onSuccess", params, types, false);
        }

        public void onUnresolvableFailure(com.google.android.gms.common.api.Status param0) {
            org.xms.g.common.api.ResolvingResultCallbacks.this.onUnresolvableFailure(((param0) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(param0, null)))));
        }
    }

    private class HImpl<R extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.support.api.client.ResolvingResultCallbacks<R> {

        protected HImpl(android.app.Activity param0, int param1) {
            super(param0, param1);
        }

        public void onSuccess(R param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResolvingResultCallbacks.this, "onSuccess", params, types, true);
        }

        public void onUnresolvableFailure(com.huawei.hms.support.api.client.Status param0) {
            org.xms.g.common.api.ResolvingResultCallbacks.this.onUnresolvableFailure(((param0) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, param0)))));
        }
    }
}