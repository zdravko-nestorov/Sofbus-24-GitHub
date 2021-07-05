package org.xms.g.common.api;


/**
 * Result token used to retrieve the result of individual operations from a batch.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.api.BatchResultToken<R extends com.google.android.gms.common.api.Result>: Result token used to retrieve the result of individual operations from a batch.<br/>
 */
public final class BatchResultToken<XR extends org.xms.g.common.api.Result> extends org.xms.g.utils.XObject {


    /**
     * org.xms.g.common.api.BatchResultToken.BatchResultToken(org.xms.g.utils.XBox) constructor of BatchResultToken with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public BatchResultToken(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.BatchResultToken.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.BatchResultToken.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted BatchResultToken object
     */
    public static org.xms.g.common.api.BatchResultToken dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.BatchResultToken) param0);
    }

    /**
     * org.xms.g.common.api.BatchResultToken.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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

            throw new RuntimeException("HMS does not support this API.");
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.BatchResultToken;
        }
    }
}