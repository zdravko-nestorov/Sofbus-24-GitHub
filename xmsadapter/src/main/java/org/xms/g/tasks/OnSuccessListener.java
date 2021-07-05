package org.xms.g.tasks;

/**
 * Listener called when a Task completes successfully.<br/>
 * Combination of com.huawei.hmf.tasks.OnSuccessListener<TResult> and com.google.android.gms.tasks.OnSuccessListener<TResult>.<br/>
 * com.huawei.hmf.tasks.OnSuccessListener<TResult>: Called when the task is completed successfully.<br/>
 * com.google.android.gms.tasks.OnSuccessListener<TResult>: Listener called when a Task completes successfully.<br/>
 */
public interface OnSuccessListener<XTResult> extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.tasks.OnSuccessListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.OnSuccessListener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted OnSuccessListener object
     */
    public static org.xms.g.tasks.OnSuccessListener dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.OnSuccessListener) param0);
    }

    /**
     * org.xms.g.tasks.OnSuccessListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.OnSuccessListener;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.OnSuccessListener;
            }
        }
        return param0 instanceof org.xms.g.tasks.OnSuccessListener;
    }

    /**
     * org.xms.g.tasks.OnSuccessListener.onSuccess(XTResult) Called when the Task completes successfully.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.OnSuccessListener<TResult>.onSuccess(TResult): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/onsuccesslistener-0000001050121140#EN-US_TOPIC_0000001050121140__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/onsuccesslistener-0000001050121140#EN-US_TOPIC_0000001050121140__section32821622269</a><br/>
     * com.google.android.gms.tasks.OnSuccessListener.onSuccess(TResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/OnSuccessListener#public-abstract-void-onsuccess-tresult-result">https://developers.google.com/android/reference/com/google/android/gms/tasks/OnSuccessListener#public-abstract-void-onsuccess-tresult-result</a><br/>
     *
     * @param param0 the result of the Task
     */
    public void onSuccess(XTResult param0);

    default java.lang.Object getZInstanceOnSuccessListener() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceOnSuccessListener();
        } else {
            return getGInstanceOnSuccessListener();
        }
    }

    default <TResult> com.google.android.gms.tasks.OnSuccessListener<TResult> getGInstanceOnSuccessListener() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.tasks.OnSuccessListener<TResult>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.tasks.OnSuccessListener<TResult>() {

            public void onSuccess(TResult param0) {
                java.lang.Object[] params = new java.lang.Object[1];
                java.lang.Class[] types = new java.lang.Class[1];
                params[0] = param0;
                types[0] = java.lang.Object.class;
                org.xms.g.utils.Utils.invokeMethod(org.xms.g.tasks.OnSuccessListener.this, "onSuccess", params, types, false);
            }
        };
    }

    default <TResult> com.huawei.hmf.tasks.OnSuccessListener<TResult> getHInstanceOnSuccessListener() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hmf.tasks.OnSuccessListener<TResult>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hmf.tasks.OnSuccessListener<TResult>() {

            public void onSuccess(TResult param0) {
                java.lang.Object[] params = new java.lang.Object[1];
                java.lang.Class[] types = new java.lang.Class[1];
                params[0] = param0;
                types[0] = java.lang.Object.class;
                org.xms.g.utils.Utils.invokeMethod(org.xms.g.tasks.OnSuccessListener.this, "onSuccess", params, types, true);
            }
        };
    }

    /**
     * Listener called when a Task completes successfully.<br/>
     * Combination of com.huawei.hmf.tasks.OnSuccessListener<TResult> and com.google.android.gms.tasks.OnSuccessListener<TResult>.<br/>
     * com.huawei.hmf.tasks.OnSuccessListener<TResult>: Called when the task is completed successfully.<br/>
     * com.google.android.gms.tasks.OnSuccessListener<TResult>: Listener called when a Task completes successfully.<br/>
     */
    public static class XImpl<XTResult> extends org.xms.g.utils.XObject implements org.xms.g.tasks.OnSuccessListener<XTResult> {

        /**
         * org.xms.g.tasks.OnSuccessListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.tasks.OnSuccessListener.XImpl.onSuccess(XTResult) Called when the Task completes successfully.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hmf.tasks.OnSuccessListener<TResult>.onSuccess(TResult): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/onsuccesslistener-0000001050121140#EN-US_TOPIC_0000001050121140__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/onsuccesslistener-0000001050121140#EN-US_TOPIC_0000001050121140__section32821622269</a><br/>
         * com.google.android.gms.tasks.OnSuccessListener.onSuccess(TResult): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/OnSuccessListener#public-abstract-void-onsuccess-tresult-result">https://developers.google.com/android/reference/com/google/android/gms/tasks/OnSuccessListener#public-abstract-void-onsuccess-tresult-result</a><br/>
         *
         * @param param0 the result of the Task
         */
        public void onSuccess(XTResult param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                java.lang.Object hObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.OnSuccessListener) this.getHInstance()).onSuccess(hObj0)");
                ((com.huawei.hmf.tasks.OnSuccessListener) this.getHInstance()).onSuccess(hObj0);
            } else {
                java.lang.Object gObj0 = ((java.lang.Object) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.OnSuccessListener) this.getGInstance()).onSuccess(gObj0)");
                ((com.google.android.gms.tasks.OnSuccessListener) this.getGInstance()).onSuccess(gObj0);
            }
        }
    }
}