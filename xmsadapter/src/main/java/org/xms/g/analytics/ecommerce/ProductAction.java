package org.xms.g.analytics.ecommerce;

/**
 * Class to construct transaction/checkout or other product interaction related information for a Analytics hit.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.analytics.ecommerce.ProductAction: Class to construct transaction/checkout or other product interaction related information for a Google Analytics hit.<br/>
 */
public class ProductAction extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.ProductAction(org.xms.g.utils.XBox) constructor of ProductAction with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ProductAction(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.ProductAction(java.lang.String) constructor of ProductAction with action.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ProductAction(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-productaction-string-action">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-productaction-string-action</a><br/>
     *
     * @param param0 The value of product action
     */
    public ProductAction(java.lang.String param0) {
        super(((org.xms.g.utils.XBox) null));
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_ADD() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_ADD: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_add">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_add</a><br/>
     *
     * @return Constant Value.Action to use when a product is added to the cart
     */
    public static java.lang.String getACTION_ADD() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_CHECKOUT() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_CHECKOUT: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_checkout">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_checkout</a><br/>
     *
     * @return Constant Value.Action to use for hits with checkout data
     */
    public static java.lang.String getACTION_CHECKOUT() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_CHECKOUT_OPTION() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_CHECKOUT_OPTION: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_checkout_option">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_checkout_option</a><br/>
     *
     * @return Constant Value.Action to be used for supplemental checkout data that needs to be provided after a checkout hit. This action can additionally have the same fields as the checkout action
     */
    public static java.lang.String getACTION_CHECKOUT_OPTION() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_CHECKOUT_OPTIONS() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_CHECKOUT_OPTIONS: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_checkout_options">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_checkout_options</a><br/>
     *
     * @return Constant Value.Action to be used for supplemental checkout data that needs to be provided after a checkout hit. This action can additionally have the same fields as the checkout action
     */
    public static java.lang.String getACTION_CHECKOUT_OPTIONS() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_CLICK() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_CLICK: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_click">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_click</a><br/>
     *
     * @return Constant Value.Action to use when the user clicks on a set of products. This action can have accompanying fields like product action list name setProductActionList(String) and product list source setProductListSource(String)
     */
    public static java.lang.String getACTION_CLICK() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_DETAIL() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_DETAIL: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_detail">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_detail</a><br/>
     *
     * @return Constant Value.Action to use when the user views detailed descriptions of products. This action can have accompanying fields like product action list name setProductActionList(String) and product list source setProductListSource(String)
     */
    public static java.lang.String getACTION_DETAIL() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_PURCHASE() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_PURCHASE: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_purchase">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_purchase</a><br/>
     *
     * @return Constant Value.Action that is used to report all the transaction data to GA. This is equivalent to the transaction hit type which was available in previous versions of the SDK. This action can can also have accompanying fields like transaction id, affiliation, revenue, tax, shipping and coupon code. These fields can be specified with methods defined in this class
     */
    public static java.lang.String getACTION_PURCHASE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_REFUND() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_REFUND: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_refund">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_refund</a><br/>
     *
     * @return Constant Value.Action to use while reporting refunded transactions to GA
     */
    public static java.lang.String getACTION_REFUND() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.getACTION_REMOVE() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.analytics.ecommerce.ProductAction.ACTION_REMOVE: <a href="https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_remove">https://developers.google.com/android/reference/com/google/android/gms/analytics/ecommerce/ProductAction#public-static-final-string-action_remove</a><br/>
     *
     * @return Constant Value.Action to use when a product is removed from the cart
     */
    public static java.lang.String getACTION_REMOVE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.ecommerce.ProductAction.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ProductAction object
     */
    public static org.xms.g.analytics.ecommerce.ProductAction dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ecommerce.ProductAction.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public org.xms.g.analytics.ecommerce.ProductAction setCheckoutOptions(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setCheckoutStep(int param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setProductActionList(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setProductListSource(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setTransactionAffiliation(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setTransactionCouponCode(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setTransactionId(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setTransactionRevenue(double param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setTransactionShipping(double param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public org.xms.g.analytics.ecommerce.ProductAction setTransactionTax(double param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public java.lang.String toString() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}