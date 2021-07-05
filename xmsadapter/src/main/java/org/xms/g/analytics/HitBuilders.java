package org.xms.g.analytics;

/**
 * Helper class to build a map of hit parameters and values.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.analytics.HitBuilders: Helper class to build a map of hit parameters and values.<br/>
 */
public class HitBuilders extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.analytics.HitBuilders.HitBuilders(org.xms.g.utils.XBox) constructor of HitBuilders with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public HitBuilders(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.analytics.HitBuilders.HitBuilders() constructor of HitBuilders.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.HitBuilders.HitBuilders(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders#public-hitbuilders">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders#public-hitbuilders</a><br/>
     */
    public HitBuilders() {
        super(((org.xms.g.utils.XBox) null));
    }

    /**
     * org.xms.g.analytics.HitBuilders.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return the casted HitBuilders object
     */
    public static org.xms.g.analytics.HitBuilders dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.HitBuilders.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * This class was deprecated.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.AppViewBuilder: This class was deprecated.<br/>
     */
    public static class AppViewBuilder extends org.xms.g.analytics.HitBuilders.HitBuilder {

        /**
         * org.xms.g.analytics.HitBuilders.AppViewBuilder.AppViewBuilder(org.xms.g.utils.XBox) constructor of AppViewBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public AppViewBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.AppViewBuilder.AppViewBuilder() constructor of AppViewBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.AppViewBuilder.AppViewBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.AppViewBuilder#public-hitbuilders.appviewbuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.AppViewBuilder#public-hitbuilders.appviewbuilder</a><br/>
         */
        public AppViewBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.AppViewBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.AppViewBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted HitBuilders.AppViewBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.AppViewBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.AppViewBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * A Builder object to build event hits.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.EventBuilder: A Builder object to build event hits.<br/>
     */
    public static class EventBuilder extends org.xms.g.analytics.HitBuilders.HitBuilder {

        /**
         * org.xms.g.analytics.HitBuilders.EventBuilder.EventBuilder(org.xms.g.utils.XBox) constructor of EventBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public EventBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.EventBuilder.EventBuilder() constructor of EventBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.EventBuilder.EventBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.EventBuilder#public-hitbuilders.eventbuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.EventBuilder#public-hitbuilders.eventbuilder</a><br/>
         */
        public EventBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.EventBuilder.EventBuilder(java.lang.String,java.lang.String) constructor of EventBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.EventBuilder.EventBuilder(java.lang.String,java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.EventBuilder#public-hitbuilders.eventbuilder-string-category,-string-action">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.EventBuilder#public-hitbuilders.eventbuilder-string-category,-string-action</a><br/>
         *
         * @param param0 Category in which the event will be filed. Example: "Video"
         * @param param1 Action associated with the event. Example: "Play"
         */
        public EventBuilder(java.lang.String param0, java.lang.String param1) {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.EventBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.EventBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted HitBuilders.EventBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.EventBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.EventBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public org.xms.g.analytics.HitBuilders.EventBuilder setAction(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.EventBuilder setCategory(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.EventBuilder setLabel(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.EventBuilder setValue(long param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * Exception builder allows you to measure the number and type of caught and uncaught crashes and exceptions that occur in your app.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.ExceptionBuilder: Exception builder allows you to measure the number and type of caught and uncaught crashes and exceptions that occur in your app.<br/>
     */
    public static class ExceptionBuilder extends org.xms.g.analytics.HitBuilders.HitBuilder {

        /**
         * org.xms.g.analytics.HitBuilders.ExceptionBuilder.ExceptionBuilder(org.xms.g.utils.XBox) constructor of ExceptionBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public ExceptionBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.ExceptionBuilder.ExceptionBuilder() constructor of ExceptionBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.ExceptionBuilder.ExceptionBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.ExceptionBuilder#public-hitbuilders.exceptionbuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.ExceptionBuilder#public-hitbuilders.exceptionbuilder</a><br/>
         */
        public ExceptionBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.ExceptionBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.ExceptionBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted HitBuilders.ExceptionBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.ExceptionBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.ExceptionBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public org.xms.g.analytics.HitBuilders.ExceptionBuilder setDescription(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.ExceptionBuilder setFatal(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * Internal class to provide common builder class methods.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.HitBuilder<T extends com.google.android.gms.analytics.HitBuilders.HitBuilder>: Internal class to provide common builder class methods.<br/>
     */
    public static class HitBuilder<XT extends org.xms.g.analytics.HitBuilders.HitBuilder> extends org.xms.g.utils.XObject {

        /**
         * org.xms.g.analytics.HitBuilders.HitBuilder.HitBuilder(org.xms.g.utils.XBox) constructor of HitBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public HitBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.HitBuilder.HitBuilder() constructor of HitBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.HitBuilder.HitBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.HitBuilder#protected-hitbuilders.hitbuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.HitBuilder#protected-hitbuilders.hitbuilder</a><br/>
         */
        protected HitBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.HitBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.HitBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted HitBuilders.HitBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.HitBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.HitBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public XT addImpression(org.xms.g.analytics.ecommerce.Product param0, java.lang.String param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT addProduct(org.xms.g.analytics.ecommerce.Product param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT addPromotion(org.xms.g.analytics.ecommerce.Promotion param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public java.util.Map<java.lang.String, java.lang.String> build() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public final XT set(java.lang.String param0, java.lang.String param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public final XT setAll(java.util.Map<java.lang.String, java.lang.String> param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT setCampaignParamsFromUrl(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT setCustomDimension(int param0, java.lang.String param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT setCustomMetric(int param0, float param1) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT setNewSession() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT setNonInteraction(boolean param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT setProductAction(org.xms.g.analytics.ecommerce.ProductAction param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public XT setPromotionAction(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        protected java.lang.String get(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        protected XT setHitType(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * This class was deprecated.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.ItemBuilder: This class was deprecated.<br/>
     */
    public static class ItemBuilder extends org.xms.g.analytics.HitBuilders.HitBuilder {

        /**
         * org.xms.g.analytics.HitBuilders.ItemBuilder.ItemBuilder(org.xms.g.utils.XBox) constructor of ItemBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public ItemBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.ItemBuilder.ItemBuilder() constructor of ItemBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.ItemBuilder.ItemBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.ItemBuilder#public-hitbuilders.itembuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.ItemBuilder#public-hitbuilders.itembuilder</a><br/>
         */
        public ItemBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.ItemBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.ItemBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted HitBuilders.ItemBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.ItemBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.ItemBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public org.xms.g.analytics.HitBuilders.ItemBuilder setCategory(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.ItemBuilder setCurrencyCode(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.ItemBuilder setName(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.ItemBuilder setPrice(double param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.ItemBuilder setQuantity(long param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.ItemBuilder setSku(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.ItemBuilder setTransactionId(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * Class to build a screen view hit.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder: Class to build a screen view hit.<br/>
     */
    public static class ScreenViewBuilder extends org.xms.g.analytics.HitBuilders.HitBuilder {

        /**
         * org.xms.g.analytics.HitBuilders.ScreenViewBuilder.ScreenViewBuilder(org.xms.g.utils.XBox) constructor of ScreenViewBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public ScreenViewBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.ScreenViewBuilder.ScreenViewBuilder() constructor of ScreenViewBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder.ScreenViewBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.ScreenViewBuilder#public-hitbuilders.screenviewbuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.ScreenViewBuilder#public-hitbuilders.screenviewbuilder</a><br/>
         */
        public ScreenViewBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.ScreenViewBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.ScreenViewBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted HitBuilders.ScreenViewBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.ScreenViewBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.ScreenViewBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return true if the Object is XMS instance, otherwise false
         */
        public static boolean isInstance(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * A Builder object to build social event hits.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.SocialBuilder: A Builder object to build social event hits.<br/>
     */
    public static class SocialBuilder extends org.xms.g.analytics.HitBuilders.HitBuilder {

        /**
         * org.xms.g.analytics.HitBuilders.SocialBuilder.SocialBuilder(org.xms.g.utils.XBox) constructor of SocialBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public SocialBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.SocialBuilder.SocialBuilder() constructor of SocialBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.SocialBuilder.SocialBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.SocialBuilder#public-hitbuilders.socialbuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.SocialBuilder#public-hitbuilders.socialbuilder</a><br/>
         */
        public SocialBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.SocialBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.SocialBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return the casted HitBuilders.SocialBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.SocialBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.SocialBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public org.xms.g.analytics.HitBuilders.SocialBuilder setAction(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.SocialBuilder setNetwork(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.SocialBuilder setTarget(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * Hit builder used to collect timing related data.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.TimingBuilder: Hit builder used to collect timing related data.<br/>
     */
    public static class TimingBuilder extends org.xms.g.analytics.HitBuilders.HitBuilder {

        /**
         * org.xms.g.analytics.HitBuilders.TimingBuilder.TimingBuilder(org.xms.g.utils.XBox) constructor of TimingBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public TimingBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.TimingBuilder.TimingBuilder() constructor of TimingBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.TimingBuilder.TimingBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.TimingBuilder#public-hitbuilders.timingbuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.TimingBuilder#public-hitbuilders.timingbuilder</a><br/>
         */
        public TimingBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.TimingBuilder.TimingBuilder(java.lang.String,java.lang.String,long) Convenience constructor for creating a timing hit. Additional fields can be specified using the setter methods.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.TimingBuilder.TimingBuilder(java.lang.String,java.lang.String,long): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.TimingBuilder#public-hitbuilders.timingbuilder-string-category,-string-variable,-long-value">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.TimingBuilder#public-hitbuilders.timingbuilder-string-category,-string-variable,-long-value</a><br/>
         *
         * @param param0 The type of variable being measured. Example: AssetLoader
         * @param param1 The variable being measured. Example: AssetLoader.load
         * @param param2 The value associated with the variable. Example: 1000
         */
        public TimingBuilder(java.lang.String param0, java.lang.String param1, long param2) {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.TimingBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.TimingBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return the casted HitBuilders.TimingBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.TimingBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.TimingBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public org.xms.g.analytics.HitBuilders.TimingBuilder setCategory(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.TimingBuilder setLabel(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.TimingBuilder setValue(long param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.TimingBuilder setVariable(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }

    /**
     * This class was deprecated.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.analytics.HitBuilders.TransactionBuilder: This class was deprecated.<br/>
     */
    public static class TransactionBuilder extends org.xms.g.analytics.HitBuilders.HitBuilder {

        /**
         * org.xms.g.analytics.HitBuilders.TransactionBuilder.TransactionBuilder(org.xms.g.utils.XBox) constructor of TransactionBuilder with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public TransactionBuilder(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.analytics.HitBuilders.TransactionBuilder.TransactionBuilder() constructor of TransactionBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.google.android.gms.analytics.HitBuilders.TransactionBuilder.TransactionBuilder(): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.TransactionBuilder#public-hitbuilders.transactionbuilder">https://developers.google.com/android/reference/com/google/android/gms/analytics/HitBuilders.TransactionBuilder#public-hitbuilders.transactionbuilder</a><br/>
         */
        public TransactionBuilder() {
            super(((org.xms.g.utils.XBox) null));
        }

        /**
         * org.xms.g.analytics.HitBuilders.TransactionBuilder.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.HitBuilders.TransactionBuilder.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return the casted HitBuilders.TransactionBuilder object
         */
        public static org.xms.g.analytics.HitBuilders.TransactionBuilder dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.analytics.HitBuilders.TransactionBuilder.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public org.xms.g.analytics.HitBuilders.TransactionBuilder setAffiliation(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.TransactionBuilder setCurrencyCode(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.TransactionBuilder setRevenue(double param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.TransactionBuilder setShipping(double param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.TransactionBuilder setTax(double param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * XMS does not provide this api.<br/>
         */
        public org.xms.g.analytics.HitBuilders.TransactionBuilder setTransactionId(java.lang.String param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}