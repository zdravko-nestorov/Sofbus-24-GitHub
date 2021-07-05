package org.xms.g.tasks;

/**
 * Listener called when a Task is canceled.<br/>
 * Combination of com.huawei.hmf.tasks.OnCanceledListener and com.google.android.gms.tasks.OnCanceledListener.<br/>
 * com.huawei.hmf.tasks.OnCanceledListener: Called when the task is canceled.<br/>
 * com.google.android.gms.tasks.OnCanceledListener: Listener called when a Task is canceled.<br/>
 */
public interface OnCanceledListener extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.tasks.OnCanceledListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.OnCanceledListener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted OnCanceledListener object
     */
    public static org.xms.g.tasks.OnCanceledListener dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.OnCanceledListener) param0);
    }

    /**
     * org.xms.g.tasks.OnCanceledListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.OnCanceledListener;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.OnCanceledListener;
            }
        }
        return param0 instanceof org.xms.g.tasks.OnCanceledListener;
    }

    /**
     * org.xms.g.tasks.OnCanceledListener.onCanceled() Called when the Task is canceled successfully.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.OnCanceledListener.onCanceled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/oncanceledlistener-0000001050123095#EN-US_TOPIC_0000001050123095__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/oncanceledlistener-0000001050123095#EN-US_TOPIC_0000001050123095__section32821622269</a><br/>
     * com.google.android.gms.tasks.OnCanceledListener.onCanceled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/OnCanceledListener#public-abstract-void-oncanceled">https://developers.google.com/android/reference/com/google/android/gms/tasks/OnCanceledListener#public-abstract-void-oncanceled</a><br/>
     */
    public void onCanceled();

    default java.lang.Object getZInstanceOnCanceledListener() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceOnCanceledListener();
        } else {
            return getGInstanceOnCanceledListener();
        }
    }

    default com.google.android.gms.tasks.OnCanceledListener getGInstanceOnCanceledListener() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.tasks.OnCanceledListener) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.tasks.OnCanceledListener() {

            public void onCanceled() {
                org.xms.g.tasks.OnCanceledListener.this.onCanceled();
            }
        };
    }

    default com.huawei.hmf.tasks.OnCanceledListener getHInstanceOnCanceledListener() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hmf.tasks.OnCanceledListener) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hmf.tasks.OnCanceledListener() {

            public void onCanceled() {
                org.xms.g.tasks.OnCanceledListener.this.onCanceled();
            }
        };
    }

    /**
     * Listener called when a Task is canceled.<br/>
     * Combination of com.huawei.hmf.tasks.OnCanceledListener and com.google.android.gms.tasks.OnCanceledListener.<br/>
     * com.huawei.hmf.tasks.OnCanceledListener: Called when the task is canceled.<br/>
     * com.google.android.gms.tasks.OnCanceledListener: Listener called when a Task is canceled.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.tasks.OnCanceledListener {

        /**
         * org.xms.g.tasks.OnCanceledListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.tasks.OnCanceledListener.XImpl.onCanceled() Called when the Task is canceled successfully.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hmf.tasks.OnCanceledListener.onCanceled(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/oncanceledlistener-0000001050123095#EN-US_TOPIC_0000001050123095__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/oncanceledlistener-0000001050123095#EN-US_TOPIC_0000001050123095__section32821622269</a><br/>
         * com.google.android.gms.tasks.OnCanceledListener.onCanceled(): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/OnCanceledListener#public-abstract-void-oncanceled">https://developers.google.com/android/reference/com/google/android/gms/tasks/OnCanceledListener#public-abstract-void-oncanceled</a><br/>
         */
        public void onCanceled() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.OnCanceledListener) this.getHInstance()).onCanceled()");
                ((com.huawei.hmf.tasks.OnCanceledListener) this.getHInstance()).onCanceled();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.OnCanceledListener) this.getGInstance()).onCanceled()");
                ((com.google.android.gms.tasks.OnCanceledListener) this.getGInstance()).onCanceled();
            }
        }
    }
}