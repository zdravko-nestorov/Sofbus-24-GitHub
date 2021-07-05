package org.xms.g.common.api;

/**
 * Represents the final result of invoking an API method in services.<br/>
 * Combination of com.huawei.hms.support.api.client.Result and com.google.android.gms.common.api.Result.<br/>
 * com.huawei.hms.support.api.client.Result: Represents the processing result of calling an HMS Core (APK) API.<br/>
 * com.google.android.gms.common.api.Result: Represents the final result of invoking an API method in Google Play services.<br/>
 */
public interface Result extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.common.api.Result.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Result object
     */
    public static org.xms.g.common.api.Result dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.Result) param0);
    }

    /**
     * org.xms.g.common.api.Result.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.Result;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Result;
            }
        }
        return param0 instanceof org.xms.g.common.api.Result;
    }

    /**
     * org.xms.g.common.api.Result.getStatus() Returns the status of this result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.Result.getStatus(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/result-0000001050123085#EN-US_TOPIC_0000001050123085__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/result-0000001050123085#EN-US_TOPIC_0000001050123085__section32821622269</a><br/>
     * com.google.android.gms.common.api.Result.getStatus(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Result#public-abstract-status-getstatus">https://developers.google.com/android/reference/com/google/android/gms/common/api/Result#public-abstract-status-getstatus</a><br/>
     *
     * @return Status of the API call result
     */
    public org.xms.g.common.api.Status getStatus();

    default java.lang.Object getZInstanceResult() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceResult();
        } else {
            return getGInstanceResult();
        }
    }

    default com.google.android.gms.common.api.Result getGInstanceResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.api.Result) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.common.api.Result() {

            public com.google.android.gms.common.api.Status getStatus() {
                org.xms.g.common.api.Status xResult = org.xms.g.common.api.Result.this.getStatus();
                return ((com.google.android.gms.common.api.Status) ((xResult) == null ? null : (xResult.getGInstance())));
            }
        };
    }

    default com.huawei.hms.support.api.client.Result getHInstanceResult() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.support.api.client.Result) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.support.api.client.Result() {

            public com.huawei.hms.support.api.client.Status getStatus() {
                org.xms.g.common.api.Status xResult = org.xms.g.common.api.Result.this.getStatus();
                return ((com.huawei.hms.support.api.client.Status) ((xResult) == null ? null : (xResult.getHInstance())));
            }
        };
    }

    /**
     * Wrapper class of Result which represents the final result of invoking an API method in services.<br/>
     * Combination of com.huawei.hms.support.api.client.Result and com.google.android.gms.common.api.Result.<br/>
     * com.huawei.hms.support.api.client.Result: Represents the processing result of calling an HMS Core (APK) API.<br/>
     * com.google.android.gms.common.api.Result: Represents the final result of invoking an API method in Google Play services.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.Result {

        /**
         * org.xms.g.common.api.Result.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.Result.XImpl.getStatus() Returns the status of this result.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.support.api.client.Result.getStatus(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/result-0000001050123085#EN-US_TOPIC_0000001050123085__section32821622269">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/result-0000001050123085#EN-US_TOPIC_0000001050123085__section32821622269</a><br/>
         * com.google.android.gms.common.api.Result.getStatus(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Result#public-abstract-status-getstatus">https://developers.google.com/android/reference/com/google/android/gms/common/api/Result#public-abstract-status-getstatus</a><br/>
         *
         * @return Status of the API call result
         */
        public org.xms.g.common.api.Status getStatus() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.client.Result) this.getHInstance()).getStatus()");
                com.huawei.hms.support.api.client.Status hReturn = ((com.huawei.hms.support.api.client.Result) this.getHInstance()).getStatus();
                return ((hReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(null, hReturn))));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Result) this.getGInstance()).getStatus()");
                com.google.android.gms.common.api.Status gReturn = ((com.google.android.gms.common.api.Result) this.getGInstance()).getStatus();
                return ((gReturn) == null ? null : (new org.xms.g.common.api.Status(new org.xms.g.utils.XBox(gReturn, null))));
            }
        }
    }
}