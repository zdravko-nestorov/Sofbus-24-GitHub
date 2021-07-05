package org.xms.g.common.data;

/**
 * Default implementation of DataBuffer. An AbstractDataBuffer wraps data provided across the binder from services.<br/>
 * Combination of com.huawei.hms.common.data.AbstractDataBuffer<T> and com.google.android.gms.common.data.AbstractDataBuffer<T>.<br/>
 * com.huawei.hms.common.data.AbstractDataBuffer<T>: <br/>
 * com.google.android.gms.common.data.AbstractDataBuffer<T>: Default implementation of DataBuffer. An AbstractDataBuffer wraps data provided across the binder from Google Play services.<br/>
 */
public abstract class AbstractDataBuffer<XT> extends org.xms.g.utils.XObject implements org.xms.g.common.data.DataBuffer<XT> {

    /**
     * org.xms.g.common.data.AbstractDataBuffer.AbstractDataBuffer(org.xms.g.utils.XBox) constructor of AbstractDataBuffer with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public AbstractDataBuffer(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.data.AbstractDataBuffer.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.data.AbstractDataBuffer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted AbstractDataBuffer object
     */
    public static org.xms.g.common.data.AbstractDataBuffer dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.data.AbstractDataBuffer) {
            return ((org.xms.g.common.data.AbstractDataBuffer) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.data.AbstractDataBuffer gReturn = ((com.google.android.gms.common.data.AbstractDataBuffer) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.common.data.AbstractDataBuffer hReturn = ((com.huawei.hms.common.data.AbstractDataBuffer) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.data.AbstractDataBuffer.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.common.data.AbstractDataBuffer) param0);
    }

    /**
     * org.xms.g.common.data.AbstractDataBuffer.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.AbstractDataBuffer;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.AbstractDataBuffer;
        }
    }

    /**
     * org.xms.g.common.data.AbstractDataBuffer.close() Releases the data buffer, for use in try-with-resources.Both close and release shall have identical semantics, and are idempotent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.AbstractDataBuffer<T>.close()
     * com.google.android.gms.common.data.AbstractDataBuffer.close(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-final-void-close">https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-final-void-close</a><br/>
     */
    public void close() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).close()");
            ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).close();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).close()");
            ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).close();
        }
    }

    /**
     * org.xms.g.common.data.AbstractDataBuffer.get(int) Get the item at the specified position.Note that the objects returned from subsequent invocations of this method for the same position may not be identical objects, but will be equal in value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.AbstractDataBuffer<T>.get(int)
     * com.google.android.gms.common.data.AbstractDataBuffer.get(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-abstract-t-get-int-position">https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-abstract-t-get-int-position</a><br/>
     *
     * @param param0 The position of the item to retrieve
     * @return the item at position in this buffer
     */
    public abstract XT get(int param0);

    /**
     * org.xms.g.common.data.AbstractDataBuffer.getCount() Return the size of AbstractDataBuffer object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.AbstractDataBuffer<T>.getCount()
     * com.google.android.gms.common.data.AbstractDataBuffer.getCount(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-int-getcount">https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-int-getcount</a><br/>
     *
     * @return the size of AbstractDataBuffer object
     */
    public int getCount() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).getCount()");
            return ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).getCount();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).getCount()");
            return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).getCount();
        }
    }

    /**
     * org.xms.g.common.data.AbstractDataBuffer.isClosed() This method is deprecated.release() and close() are idempotent, and so is safe to call multiple times.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.AbstractDataBuffer<T>.isClosed()
     * com.google.android.gms.common.data.AbstractDataBuffer.isClosed(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-boolean-isclosed">https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-boolean-isclosed</a><br/>
     *
     * @return True if this AbstractDataBuffer is closed
     */
    public boolean isClosed() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).isClosed()");
            return ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).isClosed();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).isClosed()");
            return ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).isClosed();
        }
    }

    /**
     * org.xms.g.common.data.AbstractDataBuffer.iterator() Return the Iterator of AbstractDataBuffer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.AbstractDataBuffer<T>.iterator()
     * com.google.android.gms.common.data.AbstractDataBuffer.iterator(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-iteratort-iterator">https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-iteratort-iterator</a><br/>
     *
     * @return Iterator instance
     */
    public java.util.Iterator<XT> iterator() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).iterator()");
            java.util.Iterator hReturn = ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).iterator();
            return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(hReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).iterator()");
            java.util.Iterator gReturn = ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).iterator();
            return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(gReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }

    /**
     * org.xms.g.common.data.AbstractDataBuffer.release() Releases resources used by the buffer. This method is idempotent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.AbstractDataBuffer<T>.release()
     * com.google.android.gms.common.data.AbstractDataBuffer.release(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-void-release">https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-void-release</a><br/>
     */
    public void release() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).release()");
            ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).release();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).release()");
            ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).release();
        }
    }

    /**
     * org.xms.g.common.data.AbstractDataBuffer.singleRefIterator() In order to use this you should correctly override setDataRow(int) in your DataBufferRef implementation. Be careful: there will be single DataBufferRef while iterating. If you are not sure - DO NOT USE this iterator.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.AbstractDataBuffer<T>.singleRefIterator()
     * com.google.android.gms.common.data.AbstractDataBuffer.singleRefIterator(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-iteratort-singlerefiterator">https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-iteratort-singlerefiterator</a><br/>
     *
     * @return Iterator instance
     */
    public java.util.Iterator<XT> singleRefIterator() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).singleRefIterator()");
            java.util.Iterator hReturn = ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).singleRefIterator();
            return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(hReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).singleRefIterator()");
            java.util.Iterator gReturn = ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).singleRefIterator();
            return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(gReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }

    /**
     * Wrapper class of AbstractDataBuffer.Default implementation of DataBuffer. An AbstractDataBuffer wraps data provided across the binder from services.<br/>
     * Combination of com.huawei.hms.common.data.AbstractDataBuffer<T> and com.google.android.gms.common.data.AbstractDataBuffer<T>.<br/>
     * com.huawei.hms.common.data.AbstractDataBuffer<T>: <br/>
     * com.google.android.gms.common.data.AbstractDataBuffer<T>: Default implementation of DataBuffer. An AbstractDataBuffer wraps data provided across the binder from Google Play services.<br/>
     */
    public static class XImpl<XT> extends org.xms.g.common.data.AbstractDataBuffer<XT> {

        /**
         * org.xms.g.common.data.AbstractDataBuffer.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.data.AbstractDataBuffer.XImpl.get(int) Get the item at the specified position.Note that the objects returned from subsequent invocations of this method for the same position may not be identical objects, but will be equal in value.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.AbstractDataBuffer<T>.get(int)
         * com.google.android.gms.common.data.AbstractDataBuffer.get(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-abstract-t-get-int-position">https://developers.google.com/android/reference/com/google/android/gms/common/data/AbstractDataBuffer#public-abstract-t-get-int-position</a><br/>
         *
         * @param param0 The position of the item to retrieve
         * @return the item at position in this buffer
         */
        public XT get(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).get(param0)");
                java.lang.Object hmsObj = ((com.huawei.hms.common.data.AbstractDataBuffer) this.getHInstance()).get(param0);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).get(param0)");
                java.lang.Object gmsObj = ((com.google.android.gms.common.data.AbstractDataBuffer) this.getGInstance()).get(param0);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }
    }
}