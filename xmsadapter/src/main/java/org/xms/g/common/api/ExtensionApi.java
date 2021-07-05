package org.xms.g.common.api;


/**
 * Base class for API entry points.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.api.GoogleApi<O extends com.google.android.gms.common.api.Api.ApiOptions>: Base class for Google API entry points.<br/>
 */
public abstract class ExtensionApi<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.utils.XObject implements org.xms.g.common.api.HasApiKey<XO> {


    /**
     * org.xms.g.common.api.ExtensionApi.ExtensionApi(org.xms.g.utils.XBox) constructor of ExtensionApi with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionApi(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.ExtensionApi.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.ExtensionApi.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionApi object
     */
    public static org.xms.g.common.api.ExtensionApi dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.api.ExtensionApi) {
            return ((org.xms.g.common.api.ExtensionApi) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.api.GoogleApi gReturn = ((com.google.android.gms.common.api.GoogleApi) ((org.xms.g.utils.XGettable) param0).getGInstance());

            throw new RuntimeException("HMS does not support this API.");
        }
        return ((org.xms.g.common.api.ExtensionApi) param0);
    }

    /**
     * org.xms.g.common.api.ExtensionApi.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.GoogleApi;
        }
    }

    /**
     * Wrapper class of GoogleApi which is base class for API entry points.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.common.api.HasApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions>: Base class for Google API entry points.<br/>
     */
    public static class XImpl<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.common.api.ExtensionApi<XO> {

        /**
         * org.xms.g.common.api.ExtensionApi.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public java.lang.Object getApiKey() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}