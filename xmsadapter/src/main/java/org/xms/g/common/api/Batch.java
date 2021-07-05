package org.xms.g.common.api;

/**
 * a final class that Handles a batch of PendingResult items.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.api.Batch: a final class that Handles a batch of PendingResult items.<br/>
 */
public final class Batch extends org.xms.g.common.api.PendingResult<org.xms.g.common.api.Result> {

    /**
     * org.xms.g.common.api.Batch.Batch(org.xms.g.utils.XBox) constructor of Batch with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public Batch(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.Batch.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Batch.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Batch object
     */
    public static org.xms.g.common.api.Batch dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.api.Batch.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.api.Batch.getMApiClient() Return the reference of mApiClient.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.api.Batch.mApiClient: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Batch#protected-final-weakreferencegoogleapiclient-mapiclient">https://developers.google.com/android/reference/com/google/android/gms/common/api/Batch#protected-final-weakreferencegoogleapiclient-mapiclient</a><br/>
     *
     * @return This reference will never be null so long as the GoogleApiClient is connected. It needs to be weak so that PendingResults don't pin disconnected GACs due to binder references to the PendingResults
     */
    public java.lang.ref.WeakReference getMApiClient() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void cancel() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public void clearResultCallback() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final org.xms.g.common.api.BatchResult createFailedResult(org.xms.g.common.api.Status param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public boolean isCanceled() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.Result await() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.common.api.Result await(long param0, java.util.concurrent.TimeUnit param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public void setResultCallback(org.xms.g.common.api.ResultCallback<? super org.xms.g.common.api.Result> param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public void setResultCallback(org.xms.g.common.api.ResultCallback<? super org.xms.g.common.api.Result> param0, long param1, java.util.concurrent.TimeUnit param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Wrapper class of Builder for Batch objects.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.common.api.Batch.Builder: Builder for Batch objects.<br/>
     */
    public static final class Builder extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.common.api.Batch.Builder.Builder(org.xms.g.utils.XBox) constructor of Builder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public Builder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.Batch.Builder.Builder(org.xms.g.common.api.ExtensionApiClient) constructor of Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.common.api.Batch.Builder.Builder(com.google.android.gms.common.api.GoogleApiClient): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Batch.Builder#public-batch.builder-googleapiclient-googleapiclient">https://developers.google.com/android/reference/com/google/android/gms/common/api/Batch.Builder#public-batch.builder-googleapiclient-googleapiclient</a><br/>
         *
         * @param param0 the GoogleApiClient instance
         */
        public Builder(org.xms.g.common.api.ExtensionApiClient param0) {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.common.api.Batch.Builder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Batch.Builder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted Batch.Builder object
         */
        public static org.xms.g.common.api.Batch.Builder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.common.api.Batch.Builder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public final <XR extends org.xms.g.common.api.Result> org.xms.g.common.api.BatchResultToken<XR> add(org.xms.g.common.api.PendingResult<XR> param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public final org.xms.g.common.api.Batch build() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}