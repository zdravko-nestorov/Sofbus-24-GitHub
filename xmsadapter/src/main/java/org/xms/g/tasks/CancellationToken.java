package org.xms.g.tasks;


/**
 * Propagates notification that operations should be canceled.<br/>
 * Combination of com.huawei.hmf.tasks.CancellationToken and com.google.android.gms.tasks.CancellationToken.<br/>
 * com.huawei.hmf.tasks.CancellationToken: Cancels a task using the CancellationToken object.<br/>
 * com.google.android.gms.tasks.CancellationToken: Propagates notification that operations should be canceled.<br/>
 */
public abstract class CancellationToken extends org.xms.g.utils.XObject {


    /**
     * org.xms.g.tasks.CancellationToken.CancellationToken(org.xms.g.utils.XBox) constructor of CancellationToken with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public CancellationToken(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.tasks.CancellationToken.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.CancellationToken.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted CancellationToken object
     */
    public static org.xms.g.tasks.CancellationToken dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.CancellationToken) param0);
    }

    /**
     * org.xms.g.tasks.CancellationToken.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.CancellationToken;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.CancellationToken;
        }
    }

    /**
     * org.xms.g.tasks.CancellationToken.isCancellationRequested() Checks if cancellation has been requested from the CancellationTokenSource.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.CancellationToken.isCancellationRequested(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/cancellationtoken-0000001050123105-V5#EN-US_TOPIC_0000001050123105__section10478151064312">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/cancellationtoken-0000001050123105-V5#EN-US_TOPIC_0000001050123105__section10478151064312</a><br/>
     * com.google.android.gms.tasks.CancellationToken.isCancellationRequested(): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationToken#public-abstract-boolean-iscancellationrequested">https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationToken#public-abstract-boolean-iscancellationrequested</a><br/>
     *
     * @return true if cancellation is requested, false otherwise
     */
    public abstract boolean isCancellationRequested();

    /**
     * org.xms.g.tasks.CancellationToken.onCanceledRequested(org.xms.g.tasks.OnTokenCanceledListener) Adds an OnTokenCanceledListener to this CancellationToken.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.CancellationToken.onCanceledRequested(com.huawei.hmf.tasks.OnTokenCanceledListener)
     * com.google.android.gms.tasks.CancellationToken.onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationToken#public-abstract-cancellationtoken-oncanceledrequested-ontokencanceledlistener-listener">https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationToken#public-abstract-cancellationtoken-oncanceledrequested-ontokencanceledlistener-listener</a><br/>
     *
     * @param param0 the listener that will fire once the cancellation request succeeds
     * @return CancellationToken instance added with the listener
     */
    public abstract org.xms.g.tasks.CancellationToken onCanceledRequested(org.xms.g.tasks.OnTokenCanceledListener param0);

    /**
     * Propagates notification that operations should be canceled.<br/>
     * Combination of com.huawei.hmf.tasks.CancellationToken and com.google.android.gms.tasks.CancellationToken.<br/>
     * com.huawei.hmf.tasks.CancellationToken: Cancels a task using the CancellationToken object.<br/>
     * com.google.android.gms.tasks.CancellationToken: Propagates notification that operations should be canceled.<br/>
     */
    public static class XImpl extends org.xms.g.tasks.CancellationToken {


        /**
         * org.xms.g.tasks.CancellationToken.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.tasks.CancellationToken.XImpl.isCancellationRequested() Checks if cancellation has been requested from the CancellationTokenSource.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hmf.tasks.CancellationToken.isCancellationRequested(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/cancellationtoken-0000001050123105-V5#EN-US_TOPIC_0000001050123105__section10478151064312">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/cancellationtoken-0000001050123105-V5#EN-US_TOPIC_0000001050123105__section10478151064312</a><br/>
         * com.google.android.gms.tasks.CancellationToken.isCancellationRequested(): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationToken#public-abstract-boolean-iscancellationrequested">https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationToken#public-abstract-boolean-iscancellationrequested</a><br/>
         *
         * @return true if cancellation is requested, false otherwise
         */
        public boolean isCancellationRequested() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.CancellationToken) this.getHInstance()).isCancellationRequested()");
                return ((com.huawei.hmf.tasks.CancellationToken) this.getHInstance()).isCancellationRequested();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.CancellationToken) this.getGInstance()).isCancellationRequested()");
                return ((com.google.android.gms.tasks.CancellationToken) this.getGInstance()).isCancellationRequested();
            }
        }

        /**
         * org.xms.g.tasks.CancellationToken.XImpl.onCanceledRequested(org.xms.g.tasks.OnTokenCanceledListener) Adds an OnTokenCanceledListener to this CancellationToken.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hmf.tasks.CancellationToken.onCanceledRequested(com.huawei.hmf.tasks.OnTokenCanceledListener)
         * com.google.android.gms.tasks.CancellationToken.onCanceledRequested(com.google.android.gms.tasks.OnTokenCanceledListener): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationToken#public-abstract-cancellationtoken-oncanceledrequested-ontokencanceledlistener-listener">https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationToken#public-abstract-cancellationtoken-oncanceledrequested-ontokencanceledlistener-listener</a><br/>
         *
         * @param param0 the listener that will fire once the cancellation request succeeds
         * @return CancellationToken instance added with the listener
         */
        public org.xms.g.tasks.CancellationToken onCanceledRequested(org.xms.g.tasks.OnTokenCanceledListener param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {

                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.CancellationToken) this.getHInstance()).register(action)");
                com.huawei.hmf.tasks.CancellationToken hReturn = null;
                Runnable action = new Runnable() {
                    @Override
                    public void run() {
                        param0.onCanceled();
                    }
                };
                hReturn = ((com.huawei.hmf.tasks.CancellationToken) this.getHInstance()).register(action);
                if (hReturn == null) {
                    return null;
                }
                return new org.xms.g.tasks.CancellationToken.XImpl(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.CancellationToken) this.getGInstance()).onCanceledRequested(((param0) == null ? null : (param0.getGInstanceOnTokenCanceledListener())))");
                com.google.android.gms.tasks.CancellationToken gReturn = ((com.google.android.gms.tasks.CancellationToken) this.getGInstance()).onCanceledRequested(((param0) == null ? null : (param0.getGInstanceOnTokenCanceledListener())));
                return ((gReturn) == null ? null : (new org.xms.g.tasks.CancellationToken.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}