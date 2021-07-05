package org.xms.g.common.api;

/**
 * Anything that has an ApiKey.This is used to allow clients to be exposed via interface instead of subclass. Those interfaces can be declared as extending this, and Api's will automatically fulfill the interface.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.api.HasApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions>: Anything that has an ApiKey.This is used to allow GoogleApi-based clients to be exposed via interface instead of subclass. Those interfaces can be declared as extending this, and GoogleApi's will automatically fulfill the interface.<br/>
 */
public interface HasApiKey<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.common.api.HasApiKey.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.HasApiKey.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted HasApiKey object
     */
    public static org.xms.g.common.api.HasApiKey dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.api.HasApiKey.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public java.lang.Object getApiKey();

    default java.lang.Object getZInstanceHasApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.common.api.HasApiKey<O> getGInstanceHasApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceHasApiKey() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Wrapper class of HasApiKey that has an ApiKey.This is used to allow clients to be exposed via interface instead of subclass. Those interfaces can be declared as extending this, and Api's will automatically fulfill the interface.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.common.api.HasApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions>: Anything that has an ApiKey.This is used to allow GoogleApi-based clients to be exposed via interface instead of subclass. Those interfaces can be declared as extending this, and GoogleApi's will automatically fulfill the interface.<br/>
     */
    public static class XImpl<XO extends org.xms.g.common.api.Api.ApiOptions> extends org.xms.g.utils.XObject implements org.xms.g.common.api.HasApiKey<XO> {

        /**
         * org.xms.g.common.api.HasApiKey.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
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