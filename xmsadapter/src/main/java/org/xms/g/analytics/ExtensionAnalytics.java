package org.xms.g.analytics;

/**
 * The top level Analytics singleton that provides methods for configuring Analytics and creating Tracker objects.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.analytics.GoogleAnalytics: The top level Google Analytics singleton that provides methods for configuring Google Analytics and creating Tracker objects.<br/>
 */
public final class ExtensionAnalytics extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.analytics.ExtensionAnalytics.ExtensionAnalytics(org.xms.g.utils.XBox) constructor of ExtensionAnalytics with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ExtensionAnalytics(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public static org.xms.g.analytics.ExtensionAnalytics getInstance(android.content.Context param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ExtensionAnalytics.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.analytics.ExtensionAnalytics.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ExtensionAnalytics object
     */
    public static org.xms.g.analytics.ExtensionAnalytics dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.analytics.ExtensionAnalytics.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public final void dispatchLocalHits() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void enableAutoActivityReports(android.app.Application param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final boolean getAppOptOut() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void setAppOptOut(boolean param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final org.xms.g.analytics.Logger getLogger() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void setLogger(org.xms.g.analytics.Logger param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final boolean isDryRunEnabled() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final org.xms.g.analytics.Tracker newTracker(java.lang.String param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final org.xms.g.analytics.Tracker newTracker(int param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void reportActivityStart(android.app.Activity param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void reportActivityStop(android.app.Activity param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void setDryRun(boolean param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void setLocalDispatchPeriod(int param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}