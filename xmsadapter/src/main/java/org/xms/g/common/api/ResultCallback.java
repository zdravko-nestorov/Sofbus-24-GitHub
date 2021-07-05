package org.xms.g.common.api;

/**
 * An interface for receiving a Result from a PendingResult as an asynchronous callback.<br/>
 * Combination of com.huawei.hms.support.api.client.ResultCallback<R> and com.google.android.gms.common.api.ResultCallback<R extends com.google.android.gms.common.api.Result>.<br/>
 * com.huawei.hms.support.api.client.ResultCallback<R>: API for receiving a result from an asynchronous HMS SDK method call.<br/>
 * com.google.android.gms.common.api.ResultCallback<R extends com.google.android.gms.common.api.Result>: An interface for receiving a Result from a PendingResult as an asynchronous callback.<br/>
 */
public interface ResultCallback<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.common.api.ResultCallback.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.ResultCallback.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ResultCallback object
     */
    public static org.xms.g.common.api.ResultCallback dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.ResultCallback) param0);
    }

    /**
     * org.xms.g.common.api.ResultCallback.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.ResultCallback;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.ResultCallback;
            }
        }
        return param0 instanceof org.xms.g.common.api.ResultCallback;
    }

    /**
     * org.xms.g.common.api.ResultCallback.onResult(XR) Called when the Result is ready.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ResultCallback<R>.onResult(R): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/resultcallback_r-0000001050121136#EN-US_TOPIC_0000001050121136__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/resultcallback_r-0000001050121136#EN-US_TOPIC_0000001050121136__section32821622269</a><br/>
     * com.google.android.gms.common.api.ResultCallback.onResult(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallback#public-abstract-void-onresult-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/ResultCallback#public-abstract-void-onresult-r-result</a><br/>
     *
     * @param param0 The result from the API call. Never null
     */
    public void onResult(XR param0);

    default java.lang.Object getZInstanceResultCallback() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceResultCallback();
        } else {
            return getGInstanceResultCallback();
        }
    }

    default <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.ResultCallback<R> getGInstanceResultCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.api.ResultCallback<R>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.common.api.ResultCallback<R>() {

            public void onResult(R param0) {
                java.lang.Object[] params = new java.lang.Object[1];
                java.lang.Class[] types = new java.lang.Class[1];
                params[0] = param0;
                types[0] = org.xms.g.common.api.Result.class;
                org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResultCallback.this, "onResult", params, types, false);
            }
        };
    }

    default <R> com.huawei.hms.support.api.client.ResultCallback<R> getHInstanceResultCallback() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.support.api.client.ResultCallback<R>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.support.api.client.ResultCallback<R>() {

            public void onResult(R param0) {
                java.lang.Object[] params = new java.lang.Object[1];
                java.lang.Class[] types = new java.lang.Class[1];
                params[0] = param0;
                types[0] = org.xms.g.common.api.Result.class;
                org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.ResultCallback.this, "onResult", params, types, true);
            }
        };
    }

    /**
     * Wrapper class of ResultCallback which is an interface for receiving a Result from a PendingResult as an asynchronous callback.<br/>
     * Combination of com.huawei.hms.support.api.client.ResultCallback<R> and com.google.android.gms.common.api.ResultCallbacks<R extends com.google.android.gms.common.api.Result>.<br/>
     * com.huawei.hms.support.api.client.ResultCallback<R>: API for receiving a result from an asynchronous HMS SDK method call.<br/>
     * com.google.android.gms.common.api.ResultCallbacks<R extends com.google.android.gms.common.api.Result>: An interface for receiving a Result from a PendingResult as an asynchronous callback.<br/>
     */
    public static class XImpl<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject implements org.xms.g.common.api.ResultCallback<XR> {

        /**
         * org.xms.g.common.api.ResultCallback.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.ResultCallback.XImpl.onResult(XR) Called when the Result is ready.<br/>
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
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ResultCallback) this.getHInstance()).onResult(hObj0)");
                ((com.huawei.hms.support.api.client.ResultCallback) this.getHInstance()).onResult(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.ResultCallback) this.getGInstance()).onResult(gObj0)");
                ((com.google.android.gms.common.api.ResultCallback) this.getGInstance()).onResult(gObj0);
            }
        }
    }
}