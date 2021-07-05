package org.xms.g.common.api;

/**
 * Represents the successful result of invoking an API method in services using a subclass of Api. Wraps a instance of a Result.<br/>
 * Combination of com.huawei.hms.common.api.Response<T extends com.huawei.hms.support.api.client.Result> and com.google.android.gms.common.api.Response<T extends com.google.android.gms.common.api.Result>.<br/>
 * com.huawei.hms.common.api.Response<T extends com.huawei.hms.support.api.client.Result>: <br/>
 * com.google.android.gms.common.api.Response<T extends com.google.android.gms.common.api.Result>: Represents the successful result of invoking an API method in Google Play services using a subclass of GoogleApi. Wraps a instance of a Result.<br/>
 */
public class Response<XT extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject {
    private boolean wrapper = true;

    /**
     * org.xms.g.common.api.Response.Response(org.xms.g.utils.XBox) constructor of Response with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public Response(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.common.api.Response.Response() constructor of Response.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.Response<T extends com.huawei.hms.support.api.client.Result>.Response()
     * com.google.android.gms.common.api.Response.Response(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Response#public-response">https://developers.google.com/android/reference/com/google/android/gms/common/api/Response#public-response</a><br/>
     */
    public Response() {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new HImpl());
        } else {
            this.setGInstance(new GImpl());
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.Response.Response(XT) constructor of Response with result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.Response<T extends com.huawei.hms.support.api.client.Result>.Response(T)
     * com.google.android.gms.common.api.Response.Response(T): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Response#protected-response-t-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/Response#protected-response-t-result</a><br/>
     *
     * @param param0 the result
     */
    protected Response(XT param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            this.setHInstance(new HImpl(hObj0));
        } else {
            com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            this.setGInstance(new GImpl(gObj0));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.common.api.Response.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Response.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Response object
     */
    public static org.xms.g.common.api.Response dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.Response) param0);
    }

    /**
     * org.xms.g.common.api.Response.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.Response;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Response;
        }
    }

    /**
     * org.xms.g.common.api.Response.getResult() Return the result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.Response<T extends com.huawei.hms.support.api.client.Result>.getResult()
     * com.google.android.gms.common.api.Response.getResult(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Response#protected-t-getresult">https://developers.google.com/android/reference/com/google/android/gms/common/api/Response#protected-t-getresult</a><br/>
     *
     * @return the result of this Response
     */
    protected XT getResult() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                java.lang.Object[] params = new java.lang.Object[0];
                java.lang.Class[] types = new java.lang.Class[0];
                java.lang.Object hmsObj = org.xms.g.utils.Utils.invokeProtectMethod(((com.huawei.hms.common.api.Response) this.getHInstance()), com.huawei.hms.common.api.Response.class, "getResult", types, params);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                java.lang.Object[] params = new java.lang.Object[0];
                java.lang.Class[] types = new java.lang.Class[0];
                java.lang.Object gmsObj = org.xms.g.utils.Utils.invokeProtectMethod(((com.google.android.gms.common.api.Response) this.getGInstance()), com.google.android.gms.common.api.Response.class, "getResult", types, params);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.api.Response) this.getHInstance())).getResultCallSuper()");
                java.lang.Object hmsObj = ((HImpl) ((com.huawei.hms.common.api.Response) this.getHInstance())).getResultCallSuper();
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.Response) this.getGInstance())).getResultCallSuper()");
                java.lang.Object gmsObj = ((GImpl) ((com.google.android.gms.common.api.Response) this.getGInstance())).getResultCallSuper();
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }
    }

    /**
     * org.xms.g.common.api.Response.setResult(XT) Set the result for Response.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.Response<T extends com.huawei.hms.support.api.client.Result>.setResult(T)
     * com.google.android.gms.common.api.Response.setResult(T): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Response#public-void-setresult-t-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/Response#public-void-setresult-t-result</a><br/>
     *
     * @param param0 the result
     */
    public void setResult(XT param0) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.Response) this.getHInstance()).setResult(hObj0)");
                ((com.huawei.hms.common.api.Response) this.getHInstance()).setResult(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Response) this.getGInstance()).setResult(gObj0)");
                ((com.google.android.gms.common.api.Response) this.getGInstance()).setResult(gObj0);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.common.api.Response) this.getHInstance())).setResultCallSuper(hObj0)");
                ((HImpl) ((com.huawei.hms.common.api.Response) this.getHInstance())).setResultCallSuper(hObj0);
            } else {
                com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.common.api.Response) this.getGInstance())).setResultCallSuper(gObj0)");
                ((GImpl) ((com.google.android.gms.common.api.Response) this.getGInstance())).setResultCallSuper(gObj0);
            }
        }
    }

    private class GImpl<T extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.Response<T> {

        public GImpl() {
            super();
        }

        protected GImpl(T param0) {
            super(param0);
        }

        protected T getResult() {
            XT xResult = ((XT) org.xms.g.common.api.Response.this.getResult());
            return ((T) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
        }

        public void setResult(T param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.Response.this, "setResult", params, types, false);
        }

        protected T getResultCallSuper() {
            return super.getResult();
        }

        public void setResultCallSuper(T param0) {
            super.setResult(param0);
        }
    }

    private class HImpl<T extends com.huawei.hms.support.api.client.Result> extends com.huawei.hms.common.api.Response<T> {

        public HImpl() {
            super();
        }

        protected HImpl(T param0) {
            super(param0);
        }

        protected T getResult() {
            XT xResult = ((XT) org.xms.g.common.api.Response.this.getResult());
            return ((T) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
        }

        public void setResult(T param0) {
            java.lang.Object[] params = new java.lang.Object[1];
            java.lang.Class[] types = new java.lang.Class[1];
            params[0] = param0;
            types[0] = org.xms.g.common.api.Result.class;
            org.xms.g.utils.Utils.invokeMethod(org.xms.g.common.api.Response.this, "setResult", params, types, true);
        }

        protected T getResultCallSuper() {
            return super.getResult();
        }

        public void setResultCallSuper(T param0) {
            super.setResult(param0);
        }
    }
}