package org.xms.g.tasks;

/**
 * A function that is called to continue execution after completion of a Task.<br/>
 * Combination of com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult> and com.google.android.gms.tasks.Continuation<TResult, TContinuationResult>.<br/>
 * com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult>: Contains a function that is called to continue execution after the completion of a task.<br/>
 * com.google.android.gms.tasks.Continuation<TResult, TContinuationResult>: A function that is called to continue execution after completion of a Task.<br/>
 */
public interface Continuation<XTResult, XTContinuationResult> extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.tasks.Continuation.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.Continuation.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Continuation object
     */
    public static org.xms.g.tasks.Continuation dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.Continuation) param0);
    }

    /**
     * org.xms.g.tasks.Continuation.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.Continuation;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.Continuation;
            }
        }
        return param0 instanceof org.xms.g.tasks.Continuation;
    }

    /**
     * org.xms.g.tasks.Continuation.then(org.xms.g.tasks.Task<XTResult>) Returns the result of applying this Continuation to Task.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.Continuation<TResult,TContinuationResult>.then(com.huawei.hmf.tasks.Task<TResult>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/continuation-0000001050123097#EN-US_TOPIC_0000001050123097__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/continuation-0000001050123097#EN-US_TOPIC_0000001050123097__section32821622269</a><br/>
     * com.google.android.gms.tasks.Continuation.then(com.google.android.gms.tasks.Task<TResult>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Continuation#public-abstract-tcontinuationresult-then-tasktresult-task">https://developers.google.com/android/reference/com/google/android/gms/tasks/Continuation#public-abstract-tcontinuationresult-then-tasktresult-task</a><br/>
     *
     * @param param0 the completed Task. Never null
     * @return the return object is XTContinuationResult
     * @throws java.lang.Exception if the result couldn't be produced
     */
    public XTContinuationResult then(org.xms.g.tasks.Task<XTResult> param0) throws java.lang.Exception;

    default java.lang.Object getZInstanceContinuation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceContinuation();
        } else {
            return getGInstanceContinuation();
        }
    }

    default <TResult, TContinuationResult> com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> getGInstanceContinuation() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.tasks.Continuation<TResult, TContinuationResult>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.tasks.Continuation<TResult, TContinuationResult>() {

            public TContinuationResult then(com.google.android.gms.tasks.Task<TResult> param0) throws java.lang.Exception {
                XTContinuationResult xResult = ((XTContinuationResult) org.xms.g.tasks.Continuation.this.then(((param0) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(param0, null))))));
                return ((TContinuationResult) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
            }
        };
    }

    default <TResult, TContinuationResult> com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult> getHInstanceContinuation() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult>() {

            public TContinuationResult then(com.huawei.hmf.tasks.Task<TResult> param0) throws java.lang.Exception {
                XTContinuationResult xResult = ((XTContinuationResult) org.xms.g.tasks.Continuation.this.then(((param0) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, param0))))));
                return ((TContinuationResult) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
            }
        };
    }

    /**
     * A function that is called to continue execution after completion of a Task.<br/>
     * Combination of com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult> and com.google.android.gms.tasks.Continuation<TResult, TContinuationResult>.<br/>
     * com.huawei.hmf.tasks.Continuation<TResult, TContinuationResult>: Contains a function that is called to continue execution after the completion of a task.<br/>
     * com.google.android.gms.tasks.Continuation<TResult, TContinuationResult>: A function that is called to continue execution after completion of a Task.<br/>
     */
    public static class XImpl<XTResult, XTContinuationResult> extends org.xms.g.utils.XObject implements org.xms.g.tasks.Continuation<XTResult, XTContinuationResult> {

        /**
         * org.xms.g.tasks.Continuation.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.tasks.Continuation.XImpl.then(org.xms.g.tasks.Task<XTResult>) Returns the result of applying this Continuation to Task.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hmf.tasks.Continuation<TResult,TContinuationResult>.then(com.huawei.hmf.tasks.Task<TResult>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/continuation-0000001050123097#EN-US_TOPIC_0000001050123097__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/continuation-0000001050123097#EN-US_TOPIC_0000001050123097__section32821622269</a><br/>
         * com.google.android.gms.tasks.Continuation.then(com.google.android.gms.tasks.Task<TResult>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/Continuation#public-abstract-tcontinuationresult-then-tasktresult-task">https://developers.google.com/android/reference/com/google/android/gms/tasks/Continuation#public-abstract-tcontinuationresult-then-tasktresult-task</a><br/>
         *
         * @param param0 the completed Task. Never null
         * @return the return object is XTContinuationResult
         * @throws java.lang.Exception if the result couldn't be produced
         */
        public XTContinuationResult then(org.xms.g.tasks.Task<XTResult> param0) throws java.lang.Exception {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.Continuation) this.getHInstance()).then(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))))");
                java.lang.Object hmsObj = ((com.huawei.hmf.tasks.Continuation) this.getHInstance()).then(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))));
                return ((XTContinuationResult) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.Continuation) this.getGInstance()).then(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))))");
                java.lang.Object gmsObj = ((com.google.android.gms.tasks.Continuation) this.getGInstance()).then(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))));
                return ((XTContinuationResult) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }
    }
}