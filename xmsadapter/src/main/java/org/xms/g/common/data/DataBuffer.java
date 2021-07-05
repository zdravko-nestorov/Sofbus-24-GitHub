package org.xms.g.common.data;

/**
 * Interface for a buffer of typed data.<br/>
 * Combination of com.huawei.hms.common.data.DataBuffer<T> and com.google.android.gms.common.data.DataBuffer<T>.<br/>
 * com.huawei.hms.common.data.DataBuffer<T>: <br/>
 * com.google.android.gms.common.data.DataBuffer<T>: Interface for a buffer of typed data.<br/>
 */
public interface DataBuffer<XT> extends org.xms.g.utils.XInterface, org.xms.g.common.api.Releasable, java.io.Closeable, java.lang.Iterable<XT> {

    /**
     * org.xms.g.common.data.DataBuffer.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.data.DataBuffer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted DataBuffer object
     */
    public static org.xms.g.common.data.DataBuffer dynamicCast(java.lang.Object param0) {
        if (param0 instanceof org.xms.g.common.data.DataBuffer) {
            return ((org.xms.g.common.data.DataBuffer) param0);
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            com.google.android.gms.common.data.DataBuffer gReturn = ((com.google.android.gms.common.data.DataBuffer) ((org.xms.g.utils.XGettable) param0).getGInstance());
            com.huawei.hms.common.data.DataBuffer hReturn = ((com.huawei.hms.common.data.DataBuffer) ((org.xms.g.utils.XGettable) param0).getHInstance());
            return new org.xms.g.common.data.DataBuffer.XImpl(new org.xms.g.utils.XBox(gReturn, hReturn));
        }
        return ((org.xms.g.common.data.DataBuffer) param0);
    }

    /**
     * org.xms.g.common.data.DataBuffer.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XInterface)) {
            return false;
        }
        if (param0 instanceof org.xms.g.utils.XGettable) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.DataBuffer;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.DataBuffer;
            }
        }
        return param0 instanceof org.xms.g.common.data.DataBuffer;
    }

    /**
     * org.xms.g.common.data.DataBuffer.close() Releases the data buffer, for use in try-with-resources.Both close and release shall have identical semantics, and are idempotent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBuffer<T>.close()
     * com.google.android.gms.common.data.DataBuffer.close(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-void-close">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-void-close</a><br/>
     */
    public void close();

    /**
     * org.xms.g.common.data.DataBuffer.get(int) Returns an element on specified position.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBuffer<T>.get(int)
     * com.google.android.gms.common.data.DataBuffer.get(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-t-get-int-position">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-t-get-int-position</a><br/>
     *
     * @param param0 The position of the item to retrieve
     * @return the item at position in this buffer
     */
    public XT get(int param0);

    /**
     * org.xms.g.common.data.DataBuffer.getCount() Retrun the size of this DataBuffer instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBuffer<T>.getCount()
     * com.google.android.gms.common.data.DataBuffer.getCount(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-int-getcount">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-int-getcount</a><br/>
     *
     * @return The size of this DataBuffer instance
     */
    public int getCount();

    /**
     * org.xms.g.common.data.DataBuffer.isClosed() Check whether the data buffer is closed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBuffer<T>.isClosed()
     * com.google.android.gms.common.data.DataBuffer.isClosed(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-boolean-isclosed">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-boolean-isclosed</a><br/>
     *
     * @return True if the data buffer is closed
     */
    public boolean isClosed();

    /**
     * org.xms.g.common.data.DataBuffer.iterator() Return the iterator instance of this DataBuffer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBuffer<T>.iterator()
     * com.google.android.gms.common.data.DataBuffer.iterator(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-iteratort-iterator">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-iteratort-iterator</a><br/>
     *
     * @return The iterator instance of this DataBuffer
     */
    public java.util.Iterator<XT> iterator();

    /**
     * org.xms.g.common.data.DataBuffer.release() Releases resources used by the buffer. This method is idempotent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBuffer<T>.release()
     * com.google.android.gms.common.data.DataBuffer.release(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-void-release">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-void-release</a><br/>
     */
    public void release();

    /**
     * org.xms.g.common.data.DataBuffer.singleRefIterator() In order to use this iterator it should be supported by particular DataBuffer. Be careful: there will be single reference while iterating. If you are not sure - DO NOT USE this iterator.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBuffer<T>.singleRefIterator()
     * com.google.android.gms.common.data.DataBuffer.singleRefIterator(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-iteratort-singlerefiterator">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-iteratort-singlerefiterator</a><br/>
     *
     * @return The iterator instance of this DataBuffer
     */
    public java.util.Iterator<XT> singleRefIterator();

    default java.lang.Object getZInstanceDataBuffer() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceDataBuffer();
        } else {
            return getGInstanceDataBuffer();
        }
    }

    default <T> com.google.android.gms.common.data.DataBuffer<T> getGInstanceDataBuffer() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.data.DataBuffer<T>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        throw new java.lang.RuntimeException("Not for inheriting");
    }

    default <T> com.huawei.hms.common.data.DataBuffer<T> getHInstanceDataBuffer() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.common.data.DataBuffer<T>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        throw new java.lang.RuntimeException("Not for inheriting");
    }

    /**
     * Wrapper class of DataBuffer which is an Interface for a buffer of typed data.<br/>
     * Combination of com.huawei.hms.common.data.DataBuffer<T> and com.google.android.gms.common.data.DataBuffer<T>.<br/>
     * com.huawei.hms.common.data.DataBuffer<T>: <br/>
     * com.google.android.gms.common.data.DataBuffer<T>: Interface for a buffer of typed data.<br/>
     */
    public static class XImpl<XT> extends org.xms.g.utils.XObject implements org.xms.g.common.data.DataBuffer<XT> {

        /**
         * org.xms.g.common.data.DataBuffer.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.data.DataBuffer.XImpl.close() Releases the data buffer, for use in try-with-resources.Both close and release shall have identical semantics, and are idempotent.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBuffer<T>.close()
         * com.google.android.gms.common.data.DataBuffer.close(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-void-close">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-void-close</a><br/>
         */
        public void close() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).close()");
                ((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).close();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).close()");
                ((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).close();
            }
        }

        /**
         * org.xms.g.common.data.DataBuffer.XImpl.get(int) Returns an element on specified position.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBuffer<T>.get(int)
         * com.google.android.gms.common.data.DataBuffer.get(int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-t-get-int-position">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-t-get-int-position</a><br/>
         *
         * @param param0 The position of the item to retrieve
         * @return the item at position in this buffer
         */
        public XT get(int param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).get(param0)");
                java.lang.Object hmsObj = ((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).get(param0);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).get(param0)");
                java.lang.Object gmsObj = ((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).get(param0);
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }

        /**
         * org.xms.g.common.data.DataBuffer.XImpl.getCount() Retrun the size of this DataBuffer instance.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBuffer<T>.getCount()
         * com.google.android.gms.common.data.DataBuffer.getCount(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-int-getcount">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-int-getcount</a><br/>
         *
         * @return The size of this DataBuffer instance
         */
        public int getCount() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).getCount()");
                return ((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).getCount();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).getCount()");
                return ((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).getCount();
            }
        }

        /**
         * org.xms.g.common.data.DataBuffer.XImpl.isClosed() Check whether the data buffer is closed.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBuffer<T>.isClosed()
         * com.google.android.gms.common.data.DataBuffer.isClosed(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-boolean-isclosed">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-boolean-isclosed</a><br/>
         *
         * @return True if the data buffer is closed
         */
        public boolean isClosed() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).isClosed()");
                return ((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).isClosed();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).isClosed()");
                return ((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).isClosed();
            }
        }

        /**
         * org.xms.g.common.data.DataBuffer.XImpl.iterator() Return the iterator instance of this DataBuffer.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBuffer<T>.iterator()
         * com.google.android.gms.common.data.DataBuffer.iterator(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-iteratort-iterator">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-iteratort-iterator</a><br/>
         *
         * @return The iterator instance of this DataBuffer
         */
        public java.util.Iterator<XT> iterator() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).iterator()");
                java.util.Iterator hReturn = ((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).iterator();
                return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(hReturn, new org.xms.g.utils.Function<Object, XT>() {

                    public XT apply(java.lang.Object param0) {
                        return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).iterator()");
                java.util.Iterator gReturn = ((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).iterator();
                return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(gReturn, new org.xms.g.utils.Function<Object, XT>() {

                    public XT apply(java.lang.Object param0) {
                        return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                    }
                }));
            }
        }

        /**
         * org.xms.g.common.data.DataBuffer.XImpl.release() Releases resources used by the buffer. This method is idempotent.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBuffer<T>.release()
         * com.google.android.gms.common.data.DataBuffer.release(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-void-release">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-void-release</a><br/>
         */
        public void release() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).release()");
                ((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).release();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).release()");
                ((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).release();
            }
        }

        /**
         * org.xms.g.common.data.DataBuffer.XImpl.singleRefIterator() In order to use this iterator it should be supported by particular DataBuffer. Be careful: there will be single reference while iterating. If you are not sure - DO NOT USE this iterator.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBuffer<T>.singleRefIterator()
         * com.google.android.gms.common.data.DataBuffer.singleRefIterator(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-iteratort-singlerefiterator">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBuffer#public-abstract-iteratort-singlerefiterator</a><br/>
         *
         * @return The iterator instance of this DataBuffer
         */
        public java.util.Iterator<XT> singleRefIterator() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).singleRefIterator()");
                java.util.Iterator hReturn = ((com.huawei.hms.common.data.DataBuffer) this.getHInstance()).singleRefIterator();
                return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(hReturn, new org.xms.g.utils.Function<Object, XT>() {

                    public XT apply(java.lang.Object param0) {
                        return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                    }
                }));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).singleRefIterator()");
                java.util.Iterator gReturn = ((com.google.android.gms.common.data.DataBuffer) this.getGInstance()).singleRefIterator();
                return ((java.util.Iterator) org.xms.g.utils.Utils.transformIterator(gReturn, new org.xms.g.utils.Function<Object, XT>() {

                    public XT apply(java.lang.Object param0) {
                        return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                    }
                }));
            }
        }
    }
}