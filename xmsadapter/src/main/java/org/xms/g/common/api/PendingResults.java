package org.xms.g.common.api;

/**
 * Provides factory methods for PendingResult instances, primarily for use in tests.<br/>
 * Combination of com.huawei.hms.support.api.client.PendingResultsCreator and com.google.android.gms.common.api.PendingResults.<br/>
 * com.huawei.hms.support.api.client.PendingResultsCreator: <br/>
 * com.google.android.gms.common.api.PendingResults: Provides factory methods for PendingResult instances, primarily for use in tests.<br/>
 */
public final class PendingResults extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.api.PendingResults.PendingResults(org.xms.g.utils.XBox) constructor of PendingResults with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public PendingResults(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.PendingResults.canceledPendingResult() Returns a PendingResult that has been canceled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult()
     * com.google.android.gms.common.api.PendingResults.canceledPendingResult(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResults#public-static-pendingresultstatus-canceledpendingresult">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResults#public-static-pendingresultstatus-canceledpendingresult</a><br/>
     *
     * @return org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> PendingResult instance
     */
    public static org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> canceledPendingResult() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult()");
            com.huawei.hms.support.api.client.PendingResult hReturn = com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult();
            return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.PendingResults.canceledPendingResult()");
            com.google.android.gms.common.api.PendingResult gReturn = com.google.android.gms.common.api.PendingResults.canceledPendingResult();
            return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.common.api.PendingResults.canceledPendingResult(XR) Returns a PendingResult that has been canceled.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult(R)
     * com.google.android.gms.common.api.PendingResults.canceledPendingResult(R): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResults#public-static-pendingresultr-canceledpendingresult-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResults#public-static-pendingresultr-canceledpendingresult-r-result</a><br/>
     *
     * @param param0 The canceled result. Must have a status code of CANCELED
     * @return org.xms.g.common.api.PendingResult<XR> PendingResult instance
     */
    public static <XR extends org.xms.g.common.api.Result> org.xms.g.common.api.PendingResult<XR> canceledPendingResult(XR param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult(hObj0)");
            com.huawei.hms.support.api.client.PendingResult hReturn = com.huawei.hms.support.api.client.PendingResultsCreator.discardedPendingResult(hObj0);
            return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.PendingResults.canceledPendingResult(gObj0)");
            com.google.android.gms.common.api.PendingResult gReturn = com.google.android.gms.common.api.PendingResults.canceledPendingResult(gObj0);
            return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.common.api.PendingResults.immediatePendingResult(XR) Returns a PendingResult with the specified result.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(R)
     * com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResults#public-static-optionalpendingresultr-immediatependingresult-r-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResults#public-static-optionalpendingresultr-immediatependingresult-r-result</a><br/>
     *
     * @return org.xms.g.common.api.OptionalPendingResult<XR> OptionalPendingResult instance
     */
    public static <XR extends org.xms.g.common.api.Result> org.xms.g.common.api.OptionalPendingResult<XR> immediatePendingResult(XR param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            com.huawei.hms.support.api.client.Result hObj0 = ((com.huawei.hms.support.api.client.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, true));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(hObj0)");
            com.huawei.hms.common.api.OptionalPendingResult hReturn = com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(hObj0);
            return ((hReturn) == null ? null : (new org.xms.g.common.api.OptionalPendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            com.google.android.gms.common.api.Result gObj0 = ((com.google.android.gms.common.api.Result) org.xms.g.utils.Utils.getInstanceInInterface(param0, false));
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.PendingResults.immediatePendingResult(gObj0)");
            com.google.android.gms.common.api.OptionalPendingResult gReturn = com.google.android.gms.common.api.PendingResults.immediatePendingResult(gObj0);
            return ((gReturn) == null ? null : (new org.xms.g.common.api.OptionalPendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.common.api.PendingResults.immediatePendingResult(org.xms.g.common.api.Status) Returns a PendingResult with the specified Status.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(com.huawei.hms.support.api.client.Status)
     * com.google.android.gms.common.api.PendingResults.immediatePendingResult(com.google.android.gms.common.api.Status): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResults#public-static-pendingresultstatus-immediatependingresult-status-result">https://developers.google.com/android/reference/com/google/android/gms/common/api/PendingResults#public-static-pendingresultstatus-immediatependingresult-status-result</a><br/>
     *
     * @return PendingResult instance
     */
    public static org.xms.g.common.api.PendingResult<org.xms.g.common.api.Status> immediatePendingResult(org.xms.g.common.api.Status param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))))");
            com.huawei.hms.support.api.client.PendingResult hReturn = com.huawei.hms.support.api.client.PendingResultsCreator.instantPendingResult(((com.huawei.hms.support.api.client.Status) ((param0) == null ? null : (param0.getHInstance()))));
            return ((hReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.api.PendingResults.immediatePendingResult(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))))");
            com.google.android.gms.common.api.PendingResult gReturn = com.google.android.gms.common.api.PendingResults.immediatePendingResult(((com.google.android.gms.common.api.Status) ((param0) == null ? null : (param0.getGInstance()))));
            return ((gReturn) == null ? null : (new org.xms.g.common.api.PendingResult.XImpl(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.common.api.PendingResults.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.PendingResults.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted PendingResults object
     */
    public static org.xms.g.common.api.PendingResults dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.PendingResults) param0);
    }

    /**
     * org.xms.g.common.api.PendingResults.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.client.PendingResultsCreator;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.PendingResults;
        }
    }
}