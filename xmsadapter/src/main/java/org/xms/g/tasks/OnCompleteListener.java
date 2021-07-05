package org.xms.g.tasks;

/**
 * Listener called when a Task completes.<br/>
 * Combination of com.huawei.hmf.tasks.OnCompleteListener<TResult> and com.google.android.gms.tasks.OnCompleteListener<TResult>.<br/>
 * com.huawei.hmf.tasks.OnCompleteListener<TResult>: Called when the task is completed.<br/>
 * com.google.android.gms.tasks.OnCompleteListener<TResult>: Listener called when a Task completes.<br/>
 */
public interface OnCompleteListener<XTResult> extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.tasks.OnCompleteListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.OnCompleteListener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted OnCompleteListener object
     */
    public static org.xms.g.tasks.OnCompleteListener dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.OnCompleteListener) param0);
    }

    /**
     * org.xms.g.tasks.OnCompleteListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.OnCompleteListener;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.OnCompleteListener;
            }
        }
        return param0 instanceof org.xms.g.tasks.OnCompleteListener;
    }

    /**
     * org.xms.g.tasks.OnCompleteListener.onComplete(org.xms.g.tasks.Task<XTResult>) Called when the Task completes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.OnCompleteListener<TResult>.onComplete(com.huawei.hmf.tasks.Task<TResult>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/oncompletelistener-0000001050121142#EN-US_TOPIC_0000001050121142__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/oncompletelistener-0000001050121142#EN-US_TOPIC_0000001050121142__section32821622269</a><br/>
     * com.google.android.gms.tasks.OnCompleteListener.onComplete(com.google.android.gms.tasks.Task<TResult>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/OnCompleteListener#public-abstract-void-oncomplete-tasktresult-task">https://developers.google.com/android/reference/com/google/android/gms/tasks/OnCompleteListener#public-abstract-void-oncomplete-tasktresult-task</a><br/>
     *
     * @param param0 the completed Task. Never null
     */
    public void onComplete(org.xms.g.tasks.Task<XTResult> param0);

    default java.lang.Object getZInstanceOnCompleteListener() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceOnCompleteListener();
        } else {
            return getGInstanceOnCompleteListener();
        }
    }

    default <TResult> com.google.android.gms.tasks.OnCompleteListener<TResult> getGInstanceOnCompleteListener() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.tasks.OnCompleteListener<TResult>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.tasks.OnCompleteListener<TResult>() {

            public void onComplete(com.google.android.gms.tasks.Task<TResult> param0) {
                org.xms.g.tasks.OnCompleteListener.this.onComplete(((param0) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(param0, null)))));
            }
        };
    }

    default <TResult> com.huawei.hmf.tasks.OnCompleteListener<TResult> getHInstanceOnCompleteListener() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hmf.tasks.OnCompleteListener<TResult>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hmf.tasks.OnCompleteListener<TResult>() {

            public void onComplete(com.huawei.hmf.tasks.Task<TResult> param0) {
                org.xms.g.tasks.OnCompleteListener.this.onComplete(((param0) == null ? null : (new org.xms.g.tasks.Task.XImpl(new org.xms.g.utils.XBox(null, param0)))));
            }
        };
    }

    /**
     * Listener called when a Task completes.<br/>
     * Combination of com.huawei.hmf.tasks.OnCompleteListener<TResult> and com.google.android.gms.tasks.OnCompleteListener<TResult>.<br/>
     * com.huawei.hmf.tasks.OnCompleteListener<TResult>: Called when the task is completed.<br/>
     * com.google.android.gms.tasks.OnCompleteListener<TResult>: Listener called when a Task completes.<br/>
     */
    public static class XImpl<XTResult> extends org.xms.g.utils.XObject implements org.xms.g.tasks.OnCompleteListener<XTResult> {

        /**
         * org.xms.g.tasks.OnCompleteListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.tasks.OnCompleteListener.XImpl.onComplete(org.xms.g.tasks.Task<XTResult>) Called when the Task completes.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hmf.tasks.OnCompleteListener<TResult>.onComplete(com.huawei.hmf.tasks.Task<TResult>): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/oncompletelistener-0000001050121142#EN-US_TOPIC_0000001050121142__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/oncompletelistener-0000001050121142#EN-US_TOPIC_0000001050121142__section32821622269</a><br/>
         * com.google.android.gms.tasks.OnCompleteListener.onComplete(com.google.android.gms.tasks.Task<TResult>): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/OnCompleteListener#public-abstract-void-oncomplete-tasktresult-task">https://developers.google.com/android/reference/com/google/android/gms/tasks/OnCompleteListener#public-abstract-void-oncomplete-tasktresult-task</a><br/>
         *
         * @param param0 the completed Task. Never null
         */
        public void onComplete(org.xms.g.tasks.Task<XTResult> param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.OnCompleteListener) this.getHInstance()).onComplete(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))))");
                ((com.huawei.hmf.tasks.OnCompleteListener) this.getHInstance()).onComplete(((com.huawei.hmf.tasks.Task) ((param0) == null ? null : (param0.getHInstance()))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.OnCompleteListener) this.getGInstance()).onComplete(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))))");
                ((com.google.android.gms.tasks.OnCompleteListener) this.getGInstance()).onComplete(((com.google.android.gms.tasks.Task) ((param0) == null ? null : (param0.getGInstance()))));
            }
        }
    }
}