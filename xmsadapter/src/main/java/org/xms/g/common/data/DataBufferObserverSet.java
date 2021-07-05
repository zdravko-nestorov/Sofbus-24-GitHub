package org.xms.g.common.data;

/**
 * Utility class for managing a set of observers and distributing their notifications.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.data.DataBufferObserverSet: Utility class for managing a set of observers and distributing their notifications.<br/>
 */
public final class DataBufferObserverSet extends org.xms.g.utils.XObject implements org.xms.g.common.data.DataBufferObserver, org.xms.g.common.data.DataBufferObserver.Observable {

    /**
     * org.xms.g.common.data.DataBufferObserverSet.DataBufferObserverSet(org.xms.g.utils.XBox) constructor of DataBufferObserverSet with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public DataBufferObserverSet(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.data.DataBufferObserverSet.DataBufferObserverSet() constructor of DataBufferObserverSet.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.data.DataBufferObserverSet.DataBufferObserverSet(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserverSet#public-databufferobserverset">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserverSet#public-databufferobserverset</a><br/>
     */
    public DataBufferObserverSet() {
        super(((org.xms.g.utils.XBox) null));
    }

    /**
     * org.xms.g.common.data.DataBufferObserverSet.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.data.DataBufferObserverSet.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted DataBufferObserverSet object
     */
    public static org.xms.g.common.data.DataBufferObserverSet dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.data.DataBufferObserverSet.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
    public final void addObserver(org.xms.g.common.data.DataBufferObserver param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void clear() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final boolean hasObservers() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void onDataChanged() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void onDataRangeChanged(int param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void onDataRangeInserted(int param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void onDataRangeMoved(int param0, int param1, int param2) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void onDataRangeRemoved(int param0, int param1) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public final void removeObserver(org.xms.g.common.data.DataBufferObserver param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}