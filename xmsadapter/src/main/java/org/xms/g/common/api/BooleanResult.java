package org.xms.g.common.api;

/**
 * A Result with a boolean value.<br/>
 * Combination of com.huawei.hms.common.api.BooleanResult and com.google.android.gms.common.api.BooleanResult.<br/>
 * com.huawei.hms.common.api.BooleanResult: A Result with a boolean value.<br/>
 * com.google.android.gms.common.api.BooleanResult: A Result with a boolean value.<br/>
 */
public class BooleanResult extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.api.BooleanResult.BooleanResult(org.xms.g.utils.XBox) constructor of BooleanResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public BooleanResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.BooleanResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.BooleanResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted BooleanResult object
     */
    public static org.xms.g.common.api.BooleanResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.BooleanResult) param0);
    }

    /**
     * org.xms.g.common.api.BooleanResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.BooleanResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.BooleanResult;
        }
    }

    /**
     * org.xms.g.common.api.BooleanResult.equals(java.lang.Object) Checks whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.BooleanResult.equals(java.lang.Object)
     * com.google.android.gms.common.api.BooleanResult.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/BooleanResult#public-final-boolean-equals-object-obj">https://developers.google.com/android/reference/com/google/android/gms/common/api/BooleanResult#public-final-boolean-equals-object-obj</a><br/>
     *
     * @param param0 the other BooleanResult Instance
     * @return True if two instances are equal
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.common.api.BooleanResult.getStatus() Returns the status of this result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.BooleanResult.getStatus()
     * com.google.android.gms.common.api.BooleanResult.getStatus(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/BooleanResult#public-status-getstatus">https://developers.google.com/android/reference/com/google/android/gms/common/api/BooleanResult#public-status-getstatus</a><br/>
     *
     * @return the status of this result
     */
    public org.xms.g.common.api.Status getStatus() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).getStatus()");
            com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).getStatus();
            return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).getStatus()");
            com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).getStatus();
            return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.common.api.BooleanResult.getValue() return the value of BooleanResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.BooleanResult.getValue()
     * com.google.android.gms.common.api.BooleanResult.getValue(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/BooleanResult#public-boolean-getvalue">https://developers.google.com/android/reference/com/google/android/gms/common/api/BooleanResult#public-boolean-getvalue</a><br/>
     *
     * @return the boolean value of this result
     */
    public boolean getValue() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).getValue()");
            return ((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).getValue();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).getValue()");
            return ((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).getValue();
        }
    }

    /**
     * org.xms.g.common.api.BooleanResult.hashCode() Return a hash value of instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.BooleanResult.hashCode()
     * com.google.android.gms.common.api.BooleanResult.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/BooleanResult#public-final-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/common/api/BooleanResult#public-final-int-hashcode</a><br/>
     *
     * @return a hash value
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.common.api.BooleanResult) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.common.api.BooleanResult) this.getGInstance()).hashCode();
        }
    }
}