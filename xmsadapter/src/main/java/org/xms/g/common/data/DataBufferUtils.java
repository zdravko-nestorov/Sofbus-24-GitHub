package org.xms.g.common.data;

/**
 * Utilities for working with DataBuffer objects.<br/>
 * Combination of com.huawei.hms.common.data.DataBufferUtils and com.google.android.gms.common.data.DataBufferUtils.<br/>
 * com.huawei.hms.common.data.DataBufferUtils: <br/>
 * com.google.android.gms.common.data.DataBufferUtils: Utilities for working with DataBuffer objects.<br/>
 */
public final class DataBufferUtils extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.data.DataBufferUtils.DataBufferUtils(org.xms.g.utils.XBox) constructor of DataBufferUtils with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public DataBufferUtils(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.data.DataBufferUtils.freezeAndClose(org.xms.g.common.data.DataBuffer<XE>) Utility helper method to freeze a DataBuffer into a list of concrete entities. The DataBuffer provided here must contain elements that implement the Freezable interface.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferUtils.freezeAndClose(com.huawei.hms.common.data.DataBuffer<E>)
     * com.google.android.gms.common.data.DataBufferUtils.freezeAndClose(com.google.android.gms.common.data.DataBuffer<E>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferUtils#public-static-arraylistt-freezeandclose-databuffere-buffer">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferUtils#public-static-arraylistt-freezeandclose-databuffere-buffer</a><br/>
     *
     * @param param0 DataBuffer to freeze contents from
     * @return ArrayList of objects represented by the buffer
     */
    public static <XT extends java.lang.Object, XE extends org.xms.g.common.data.Freezable<XT>> java.util.ArrayList<XT> freezeAndClose(org.xms.g.common.data.DataBuffer<XE> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.DataBufferUtils.freezeAndClose(((param0) == null ? null : (param0.getHInstanceDataBuffer())))");
            java.util.ArrayList hReturn = com.huawei.hms.common.data.DataBufferUtils.freezeAndClose(((param0) == null ? null : (param0.getHInstanceDataBuffer())));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.DataBufferUtils.freezeAndClose(((param0) == null ? null : (param0.getGInstanceDataBuffer())))");
            java.util.ArrayList gReturn = com.google.android.gms.common.data.DataBufferUtils.freezeAndClose(((param0) == null ? null : (param0.getGInstanceDataBuffer())));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }

    /**
     * org.xms.g.common.data.DataBufferUtils.hasData(org.xms.g.common.data.DataBuffer<?>) Utility function to determine whether a data buffer has data or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferUtils.hasData(com.huawei.hms.common.data.DataBuffer<?>)
     * com.google.android.gms.common.data.DataBufferUtils.hasData(com.google.android.gms.common.data.DataBuffer<?>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferUtils#public-static-boolean-hasdata-databuffer-buffer">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferUtils#public-static-boolean-hasdata-databuffer-buffer</a><br/>
     *
     * @param param0 The data buffer to check
     * @return Whether the data buffer has data or not
     */
    public static boolean hasData(org.xms.g.common.data.DataBuffer<?> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.DataBufferUtils.hasData(((param0) == null ? null : (param0.getHInstanceDataBuffer())))");
            return com.huawei.hms.common.data.DataBufferUtils.hasData(((param0) == null ? null : (param0.getHInstanceDataBuffer())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.DataBufferUtils.hasData(((param0) == null ? null : (param0.getGInstanceDataBuffer())))");
            return com.google.android.gms.common.data.DataBufferUtils.hasData(((param0) == null ? null : (param0.getGInstanceDataBuffer())));
        }
    }

    /**
     * org.xms.g.common.data.DataBufferUtils.hasNextPage(org.xms.g.common.data.DataBuffer<?>) Utility function to get the "next page" pagination token from a data buffer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferUtils.hasNextPage(com.huawei.hms.common.data.DataBuffer<?>)
     * com.google.android.gms.common.data.DataBufferUtils.hasNextPage(com.google.android.gms.common.data.DataBuffer<?>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferUtils#public-static-boolean-hasnextpage-databuffer-buffer">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferUtils#public-static-boolean-hasnextpage-databuffer-buffer</a><br/>
     *
     * @param param0 The data buffer to check
     * @return Whether the data buffer has next page or not
     */
    public static boolean hasNextPage(org.xms.g.common.data.DataBuffer<?> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.DataBufferUtils.hasNextPage(((param0) == null ? null : (param0.getHInstanceDataBuffer())))");
            return com.huawei.hms.common.data.DataBufferUtils.hasNextPage(((param0) == null ? null : (param0.getHInstanceDataBuffer())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.DataBufferUtils.hasNextPage(((param0) == null ? null : (param0.getGInstanceDataBuffer())))");
            return com.google.android.gms.common.data.DataBufferUtils.hasNextPage(((param0) == null ? null : (param0.getGInstanceDataBuffer())));
        }
    }

    /**
     * org.xms.g.common.data.DataBufferUtils.hasPrevPage(org.xms.g.common.data.DataBuffer<?>) Utility function to get the "prev page" pagination token from a data buffer.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferUtils.hasPrevPage(com.huawei.hms.common.data.DataBuffer<?>)
     * com.google.android.gms.common.data.DataBufferUtils.hasPrevPage(com.google.android.gms.common.data.DataBuffer<?>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferUtils#public-static-boolean-hasprevpage-databuffer-buffer">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferUtils#public-static-boolean-hasprevpage-databuffer-buffer</a><br/>
     *
     * @param param0 The data buffer to check
     * @return boolean Whether the data buffer has prev page or not
     */
    public static boolean hasPrevPage(org.xms.g.common.data.DataBuffer<?> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.DataBufferUtils.hasPrevPage(((param0) == null ? null : (param0.getHInstanceDataBuffer())))");
            return com.huawei.hms.common.data.DataBufferUtils.hasPrevPage(((param0) == null ? null : (param0.getHInstanceDataBuffer())));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.DataBufferUtils.hasPrevPage(((param0) == null ? null : (param0.getGInstanceDataBuffer())))");
            return com.google.android.gms.common.data.DataBufferUtils.hasPrevPage(((param0) == null ? null : (param0.getGInstanceDataBuffer())));
        }
    }

    /**
     * org.xms.g.common.data.DataBufferUtils.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.data.DataBufferUtils.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted DataBufferUtils object
     */
    public static org.xms.g.common.data.DataBufferUtils dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.data.DataBufferUtils) param0);
    }

    /**
     * org.xms.g.common.data.DataBufferUtils.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.DataBufferUtils;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.DataBufferUtils;
        }
    }
}