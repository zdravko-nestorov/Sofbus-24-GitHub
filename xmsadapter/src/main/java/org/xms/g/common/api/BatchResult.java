package org.xms.g.common.api;

/**
 * The result of a batch operation.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.api.BatchResult: The result of a batch operation.<br/>
 */
public final class BatchResult extends org.xms.g.utils.XObject implements org.xms.g.common.api.Result {

    /**
     * org.xms.g.common.api.BatchResult.BatchResult(org.xms.g.utils.XBox) constructor of BatchResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public BatchResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.BatchResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.BatchResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted BatchResult object
     */
    public static org.xms.g.common.api.BatchResult dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.api.BatchResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public final org.xms.g.common.api.Status getStatus() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final <XR extends org.xms.g.common.api.Result> XR take(org.xms.g.common.api.BatchResultToken<XR> param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}