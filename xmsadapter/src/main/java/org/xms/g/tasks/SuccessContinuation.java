package org.xms.g.tasks;

/**
 * A function that is called to continue execution then a Task succeeds.<br/>
 * Combination of com.huawei.hmf.tasks.SuccessContinuation<TResult, TContinuationResult> and com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult>.<br/>
 * com.huawei.hmf.tasks.SuccessContinuation<TResult, TContinuationResult>: Called to continue execution when a task succeeds.<br/>
 * com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult>: A function that is called to continue execution then a Task succeeds.<br/>
 */
public interface SuccessContinuation<XTResult, XTContinuationResult> extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.tasks.SuccessContinuation.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.SuccessContinuation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted SuccessContinuation object
     */
    public static org.xms.g.tasks.SuccessContinuation dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.SuccessContinuation) param0);
    }

    /**
     * org.xms.g.tasks.SuccessContinuation.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.SuccessContinuation;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.SuccessContinuation;
            }
        }
        return param0 instanceof org.xms.g.tasks.SuccessContinuation;
    }

    /**
     * org.xms.g.tasks.SuccessContinuation.then(XTResult) Returns the result of applying this SuccessContinuation to Task.The SuccessContinuation only happens then the Task is successful. If the previous Task fails, the onSuccessTask continuation will be skipped and failure listeners will be invoked.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.SuccessContinuation<TResult,TContinuationResult>.then(TResult): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/successcontinuation-0000001050121146#EN-US_TOPIC_0000001050121146__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/successcontinuation-0000001050121146#EN-US_TOPIC_0000001050121146__section32821622269</a><br/>
     * com.google.android.gms.tasks.SuccessContinuation.then(TResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/SuccessContinuation#public-abstract-tasktcontinuationresult-then-tresult-result">https://developers.google.com/android/reference/com/google/android/gms/tasks/SuccessContinuation#public-abstract-tasktcontinuationresult-then-tresult-result</a><br/>
     *
     * @param param0 the result of completed Task
     * @return the return object is Task
     * @throws java.lang.Exception if the result couldn't be produced
     */
    public org.xms.g.tasks.Task<XTContinuationResult> then(XTResult param0) throws java.lang.Exception;

    default java.lang.Object getZInstanceSuccessContinuation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceSuccessContinuation();
        } else {
            return getGInstanceSuccessContinuation();
        }
    }

    default <TResult, TContinuationResult> com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> getGInstanceSuccessContinuation() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult>() {

            public com.google.android.gms.tasks.Task<TContinuationResult> then(TResult param0) throws java.lang.Exception {
                java.lang.Object[] params = new java.lang.Object[1];
                java.lang.Class[] types = new java.lang.Class[1];
                params[0] = param0;
                types[0] = java.lang.Object.class;
                java.lang.Object result = org.xms.g.utils.Utils.invokeMethod(org.xms.g.tasks.SuccessContinuation.this, "then", params, types, false);
                return ((com.google.android.gms.tasks.Task) org.xms.g.utils.Utils.handleInvokeBridgeReturnValue(result, false));
            }
        };
    }

    default <TResult, TContinuationResult> com.huawei.hmf.tasks.SuccessContinuation<TResult, TContinuationResult> getHInstanceSuccessContinuation() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hmf.tasks.SuccessContinuation<TResult, TContinuationResult>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hmf.tasks.SuccessContinuation<TResult, TContinuationResult>() {

            public com.huawei.hmf.tasks.Task<TContinuationResult> then(TResult param0) throws java.lang.Exception {
                java.lang.Object[] params = new java.lang.Object[1];
                java.lang.Class[] types = new java.lang.Class[1];
                params[0] = param0;
                types[0] = java.lang.Object.class;
                java.lang.Object result = org.xms.g.utils.Utils.invokeMethod(org.xms.g.tasks.SuccessContinuation.this, "then", params, types, true);
                return ((com.huawei.hmf.tasks.Task) org.xms.g.utils.Utils.handleInvokeBridgeReturnValue(result, true));
            }
        };
    }

    /**
     * A function that is called to continue execution then a Task succeeds.<br/>
     * Combination of com.huawei.hmf.tasks.SuccessContinuation<TResult, TContinuationResult> and com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult>.<br/>
     * com.huawei.hmf.tasks.SuccessContinuation<TResult, TContinuationResult>: Called to continue execution when a task succeeds.<br/>
     * com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult>: A function that is called to continue execution then a Task succeeds.<br/>
     */
    public static class XImpl<XTResult, XTContinuationResult> extends org.xms.g.utils.XObject implements org.xms.g.tasks.SuccessContinuation<XTResult, XTContinuationResult> {

        /**
         * org.xms.g.tasks.SuccessContinuation.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.tasks.SuccessContinuation.XImpl.then(XTResult) Returns the result of applying this SuccessContinuation to Task.The SuccessContinuation only happens then the Task is successful. If the previous Task fails, the onSuccessTask continuation will be skipped and failure listeners will be invoked.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hmf.tasks.SuccessContinuation<TResult,TContinuationResult>.then(TResult): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/successcontinuation-0000001050121146#EN-US_TOPIC_0000001050121146__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/successcontinuation-0000001050121146#EN-US_TOPIC_0000001050121146__section32821622269</a><br/>
         * com.google.android.gms.tasks.SuccessContinuation.then(TResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/SuccessContinuation#public-abstract-tasktcontinuationresult-then-tresult-result">https://developers.google.com/android/reference/com/google/android/gms/tasks/SuccessContinuation#public-abstract-tasktcontinuationresult-then-tresult-result</a><br/>
         *
         * @param param0 the result of completed Task
         * @return the return object is Task
         * @throws java.lang.Exception if the result couldn't be produced
         */
        public org.xms.g.tasks.Task<XTContinuationResult> then(XTResult param0) throws java.lang.Exception {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                java.lang.Object hObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.SuccessContinuation) this.getHInstance()).then(hObj0)");
                com.huawei.hmf.tasks.Task hReturn = ((com.huawei.hmf.tasks.SuccessContinuation) this.getHInstance()).then(hObj0);
                return ((hReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                java.lang.Object gObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.SuccessContinuation) this.getGInstance()).then(gObj0)");
                com.google.android.gms.tasks.Task gReturn = ((com.google.android.gms.tasks.SuccessContinuation) this.getGInstance()).then(gObj0);
                return ((gReturn) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}