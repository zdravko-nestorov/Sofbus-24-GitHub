package org.xms.g.tasks;

/**
 * Creates a new CancellationToken or cancels one that has already created.<br/>
 * Combination of com.huawei.hmf.tasks.CancellationTokenSource and com.google.android.gms.tasks.CancellationTokenSource.<br/>
 * com.huawei.hmf.tasks.CancellationTokenSource: Creates CancellationToken.<br/>
 * com.google.android.gms.tasks.CancellationTokenSource: Creates a new CancellationToken or cancels one that has already created. There is a 1:1 CancellationTokenSource to CancellationToken relationship.To create a CancellationToken, create a CancellationTokenSource first and then call getToken() to get the CancellationToken for this CancellationTokenSource.<br/>
 */
public class CancellationTokenSource extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.tasks.CancellationTokenSource.CancellationTokenSource(org.xms.g.utils.XBox) constructor of CancellationTokenSource with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public CancellationTokenSource(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.tasks.CancellationTokenSource.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.CancellationTokenSource.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted CancellationTokenSource object
     */
    public static org.xms.g.tasks.CancellationTokenSource dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.tasks.CancellationTokenSource) param0);
    }

    /**
     * org.xms.g.tasks.CancellationTokenSource.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hmf.tasks.CancellationTokenSource;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.tasks.CancellationTokenSource;
        }
    }

    /**
     * org.xms.g.tasks.CancellationTokenSource.cancel() Cancels the CancellationToken if cancellation has not been requested yet.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.CancellationTokenSource.cancel(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/cancellationtokensource-0000001050121152-V5#EN-US_TOPIC_0000001050121152__section7201020155313">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/cancellationtokensource-0000001050121152-V5#EN-US_TOPIC_0000001050121152__section7201020155313</a><br/>
     * com.google.android.gms.tasks.CancellationTokenSource.cancel(): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationTokenSource#public-void-cancel">https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationTokenSource#public-void-cancel</a><br/>
     */
    public void cancel() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.CancellationTokenSource) this.getHInstance()).cancel()");
            ((com.huawei.hmf.tasks.CancellationTokenSource) this.getHInstance()).cancel();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.CancellationTokenSource) this.getGInstance()).cancel()");
            ((com.google.android.gms.tasks.CancellationTokenSource) this.getGInstance()).cancel();
        }
    }

    /**
     * org.xms.g.tasks.CancellationTokenSource.getToken() Gets the CancellationToken for this CancellationTokenSource.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hmf.tasks.CancellationTokenSource.getToken(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/cancellationtokensource-0000001050121152-V5#EN-US_TOPIC_0000001050121152__section10478151064312">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/cancellationtokensource-0000001050121152-V5#EN-US_TOPIC_0000001050121152__section10478151064312</a><br/>
     * com.google.android.gms.tasks.CancellationTokenSource.getToken(): <a href="https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationTokenSource#public-cancellationtoken-gettoken">https://developers.google.com/android/reference/com/google/android/gms/tasks/CancellationTokenSource#public-cancellationtoken-gettoken</a><br/>
     *
     * @return the CancellationToken that can be passed to asynchronous Task to cancel the Task
     */
    public org.xms.g.tasks.CancellationToken getToken() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hmf.tasks.CancellationTokenSource) this.getHInstance()).getToken()");
            com.huawei.hmf.tasks.CancellationToken hReturn = ((com.huawei.hmf.tasks.CancellationTokenSource) this.getHInstance()).getToken();
            return ((hReturn) == null ? null : (new org.xms.g.tasks.CancellationToken.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.tasks.CancellationTokenSource) this.getGInstance()).getToken()");
            com.google.android.gms.tasks.CancellationToken gReturn = ((com.google.android.gms.tasks.CancellationTokenSource) this.getGInstance()).getToken();
            return ((gReturn) == null ? null : (new org.xms.g.tasks.CancellationToken.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }
}