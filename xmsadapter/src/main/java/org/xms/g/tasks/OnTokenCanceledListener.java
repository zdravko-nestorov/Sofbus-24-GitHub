package org.xms.g.tasks;

/**
 * Listener called when a CancellationToken is canceled successfully.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.tasks.OnTokenCanceledListener: Listener called when a CancellationToken is canceled successfully.<br/>
 */
public interface OnTokenCanceledListener extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.tasks.OnTokenCanceledListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.tasks.OnTokenCanceledListener.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted OnTokenCanceledListener object
     */
    public static org.xms.g.tasks.OnTokenCanceledListener dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.tasks.OnTokenCanceledListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public void onCanceled();

    default java.lang.Object getZInstanceOnTokenCanceledListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default com.google.android.gms.tasks.OnTokenCanceledListener getGInstanceOnTokenCanceledListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    default java.lang.Object getHInstanceOnTokenCanceledListener() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Listener called when a CancellationToken is canceled successfully.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.tasks.OnTokenCanceledListener: Listener called when a CancellationToken is canceled successfully.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.tasks.OnTokenCanceledListener {

        /**
         * org.xms.g.tasks.OnTokenCanceledListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
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
        public void onCanceled() {
            throw new java.lang.RuntimeException("Not Supported");
        }
    }
}