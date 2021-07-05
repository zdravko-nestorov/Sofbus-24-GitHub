package org.xms.g.common.images;

/**
 * This class is used to load images from the network and handles local caching for you.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.images.ImageManager: This class is used to load images from the network and handles local caching for you.<br/>
 */
public final class ImageManager extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.images.ImageManager.ImageManager(org.xms.g.utils.XBox) constructor of ImageManager with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public ImageManager(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.images.ImageManager.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.images.ImageManager.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted ImageManager object
     */
    public static org.xms.g.common.images.ImageManager dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.images.ImageManager.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public final org.xms.g.common.images.ImageManager create(android.content.Context param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void loadImage(android.widget.ImageView param0, android.net.Uri param1, int param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void loadImage(org.xms.g.common.images.ImageManager.OnImageLoadedListener param0, android.net.Uri param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void loadImage(android.widget.ImageView param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void loadImage(org.xms.g.common.images.ImageManager.OnImageLoadedListener param0, android.net.Uri param1, int param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void loadImage(android.widget.ImageView param0, android.net.Uri param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * Listener interface for handling when the image for a particular URI has been loaded.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.common.images.ImageManager.OnImageLoadedListener: Listener interface for handling when the image for a particular URI has been loaded.<br/>
     */
    public static interface OnImageLoadedListener extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.common.images.ImageManager.OnImageLoadedListener.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.images.ImageManager.OnImageLoadedListener.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return ImageManager.OnImageLoadedListener object
         */
        public static org.xms.g.common.images.ImageManager.OnImageLoadedListener dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.common.images.ImageManager.OnImageLoadedListener.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public void onImageLoaded(android.net.Uri param0, android.graphics.drawable.Drawable param1, boolean param2);

        default java.lang.Object getZInstanceOnImageLoadedListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        default com.google.android.gms.common.images.ImageManager.OnImageLoadedListener getGInstanceOnImageLoadedListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        default java.lang.Object getHInstanceOnImageLoadedListener() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * Wrapper class of ImageManager.OnImageLoadedListener which is a Listener interface for handling when the image for a particular URI has been loaded.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.common.images.ImageManager.OnImageLoadedListener: Listener interface for handling when the image for a particular URI has been loaded.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.images.ImageManager.OnImageLoadedListener {

            /**
             * org.xms.g.common.images.ImageManager.OnImageLoadedListener.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
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
            public void onImageLoaded(android.net.Uri param0, android.graphics.drawable.Drawable param1, boolean param2) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }
}