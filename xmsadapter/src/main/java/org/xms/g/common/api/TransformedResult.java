package org.xms.g.common.api;

/**
 * Represents a pending result that has been transformed by one or more subsequent API calls.<br/>
 * Combination of com.huawei.hms.support.api.client.ConvertedResult<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.TransformedResult<R extends com.google.android.gms.common.api.Result>.<br/>
 * com.huawei.hms.support.api.client.ConvertedResult<R extends com.huawei.hms.support.api.client.Result>: <br/>
 * com.google.android.gms.common.api.TransformedResult<R extends com.google.android.gms.common.api.Result>: Represents a pending result that has been transformed by one or more subsequent API calls.<br/>
 */
public abstract class TransformedResult<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject {
    private boolean wrapper = true;

    /**
     * org.xms.g.common.api.TransformedResult.TransformedResult(org.xms.g.utils.XBox) constructor of TransformedResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public TransformedResult(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.common.api.TransformedResult.TransformedResult() Creates a new TransformedResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ConvertedResult<R extends com.huawei.hms.support.api.client.Result>.ConvertedResult()
     * com.google.android.gms.common.api.TransformedResult.TransformedResult(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/TransformedResult#public-transformedresult">https://developers.google.com/android/reference/com/google/android/gms/common/api/TransformedResult#public-transformedresult</a><br/>
     */
    public TransformedResult() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.TransformedResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.TransformedResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted TransformedResult object
     */
    public static org.xms.g.common.api.TransformedResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.TransformedResult) param0);
    }

    /**
     * org.xms.g.common.api.TransformedResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.ConvertedResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.TransformedResult;
        }
    }

    /**
     * org.xms.g.common.api.TransformedResult.andFinally(org.xms.g.common.api.ResultCallbacks<? super XR>) Requests that the supplied callbacks are called when the result is ready.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.ConvertedResult<R extends com.huawei.hms.support.api.client.Result>.finalExec(com.huawei.hms.support.api.client.ResultCallbacks<? super R>)
     * com.google.android.gms.common.api.TransformedResult.andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/TransformedResult#public-abstract-void-andfinally-resultcallbacks-super-r-callbacks">https://developers.google.com/android/reference/com/google/android/gms/common/api/TransformedResult#public-abstract-void-andfinally-resultcallbacks-super-r-callbacks</a><br/>
     *
     * @param param0 ResultCallbacks instance
     */
    public abstract void andFinally(org.xms.g.common.api.ResultCallbacks<? super XR> param0);

    public abstract <XS extends org.xms.g.common.api.Result> org.xms.g.common.api.TransformedResult<XS> then(org.xms.g.common.api.ResultTransform<? super XR, ? extends XS> param0);

    /**
     * Wrapper class of TransformedResult which represents a pending result that has been transformed by one or more subsequent API calls.<br/>
     * Combination of com.huawei.hms.support.api.client.ConvertedResult<R extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.TransformedResult<R extends com.google.android.gms.common.api.Result>.<br/>
     * com.huawei.hms.support.api.client.ConvertedResult<R extends com.huawei.hms.support.api.client.Result>: <br/>
     * com.google.android.gms.common.api.TransformedResult<R extends com.google.android.gms.common.api.Result>: Represents a pending result that has been transformed by one or more subsequent API calls.<br/>
     */
    public static class XImpl<XR extends org.xms.g.common.api.Result> extends org.xms.g.common.api.TransformedResult<XR> {

        /**
         * org.xms.g.common.api.TransformedResult.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.TransformedResult.XImpl.andFinally(org.xms.g.common.api.ResultCallbacks<? super XR>) Requests that the supplied callbacks are called when the result is ready.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.ConvertedResult<R extends com.huawei.hms.support.api.client.Result>.finalExec(com.huawei.hms.support.api.client.ResultCallbacks<? super R>)
         * com.google.android.gms.common.api.TransformedResult.andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/TransformedResult#public-abstract-void-andfinally-resultcallbacks-super-r-callbacks">https://developers.google.com/android/reference/com/google/android/gms/common/api/TransformedResult#public-abstract-void-andfinally-resultcallbacks-super-r-callbacks</a><br/>
         *
         * @param param0 ResultCallbacks instance
         */
        public void andFinally(org.xms.g.common.api.ResultCallbacks<? super XR> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ConvertedResult) this.getHInstance()).finalExec(((com.huawei.hms.support.api.client.ResultCallbacks) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hms.support.api.client.ConvertedResult) this.getHInstance()).finalExec(((com.huawei.hms.support.api.client.ResultCallbacks) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.TransformedResult) this.getGInstance()).andFinally(((com.google.android.gms.common.api.ResultCallbacks) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.common.api.TransformedResult) this.getGInstance()).andFinally(((com.google.android.gms.common.api.ResultCallbacks) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }

        public <XS extends org.xms.g.common.api.Result> org.xms.g.common.api.TransformedResult<XS> then(org.xms.g.common.api.ResultTransform<? super XR, ? extends XS> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.ConvertedResult) this.getHInstance()).convertResult(((com.huawei.hms.support.api.client.ResultConvert) ((param0) == null ? null : (param0.getHInstance()))))");
                com.huawei.hms.support.api.client.ConvertedResult hReturn = ((com.huawei.hms.support.api.client.ConvertedResult) this.getHInstance()).convertResult(((com.huawei.hms.support.api.client.ResultConvert) ((param0) == null ? null : (param0.getHInstance()))));
                return ((hReturn) == null ? null : (new org.xms.g.common.api.TransformedResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.TransformedResult) this.getGInstance()).then(((com.google.android.gms.common.api.ResultTransform) ((param0) == null ? null : (param0.getGInstance()))))");
                com.google.android.gms.common.api.TransformedResult gReturn = ((com.google.android.gms.common.api.TransformedResult) this.getGInstance()).then(((com.google.android.gms.common.api.ResultTransform) ((param0) == null ? null : (param0.getGInstance()))));
                return ((gReturn) == null ? null : (new org.xms.g.common.api.TransformedResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }

    private class GImpl<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.TransformedResult<R> {

        public GImpl() {
            super();
        }

        public void andFinally(com.google.android.gms.common.api.ResultCallbacks<? super R> param0) {
            org.xms.g.common.api.TransformedResult.this.andFinally(((param0) == null ? null : (new org.xms.g.common.api.ResultCallbacks.XImpl(new org.xms.g.utils.XBox(param0, null)))));
        }

        public <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> param0) {
            org.xms.g.common.api.TransformedResult xResult = org.xms.g.common.api.TransformedResult.this.then(((param0) == null ? null : (new org.xms.g.common.api.ResultTransform.XImpl(new org.xms.g.utils.XBox(param0, null)))));
            return ((com.google.android.gms.common.api.TransformedResult) ((xResult) == null ? null : (xResult.getGInstance())));
        }
    }

    private class HImpl<R extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.support.api.client.ConvertedResult<R> {

        public HImpl() {
            super();
        }

        public void finalExec(com.huawei.hms.support.api.client.ResultCallbacks<? super R> param0) {
            org.xms.g.common.api.TransformedResult.this.andFinally(((param0) == null ? null : (new org.xms.g.common.api.ResultCallbacks.XImpl(new org.xms.g.utils.XBox(null, param0)))));
        }

        public <S extends com.huawei.hms.support.api.client.Result> com.huawei.hms.support.api.client.ConvertedResult<S> convertResult(com.huawei.hms.support.api.client.ResultConvert<? super R, ? extends S> param0) {
            org.xms.g.common.api.TransformedResult xResult = org.xms.g.common.api.TransformedResult.this.then(((param0) == null ? null : (new org.xms.g.common.api.ResultTransform.XImpl(new org.xms.g.utils.XBox(null, param0)))));
            return ((com.huawei.hms.support.api.client.ConvertedResult) ((xResult) == null ? null : (xResult.getHInstance())));
        }
    }
}