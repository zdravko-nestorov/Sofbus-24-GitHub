package org.xms.g.common.data;

/**
 * Utilities for working with Freezable objects.<br/>
 * Combination of com.huawei.hms.common.data.FreezableUtils and com.google.android.gms.common.data.FreezableUtils.<br/>
 * com.huawei.hms.common.data.FreezableUtils: <br/>
 * com.google.android.gms.common.data.FreezableUtils: Utilities for working with Freezable objects.<br/>
 */
public final class FreezableUtils extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.data.FreezableUtils.FreezableUtils(org.xms.g.utils.XBox) constructor of FreezableUtils with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public FreezableUtils(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.data.FreezableUtils.FreezableUtils() constructor of FreezableUtils.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.data.FreezableUtils.FreezableUtils(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/FreezableUtils#public-freezableutils">https://developers.google.com/android/reference/com/google/android/gms/common/data/FreezableUtils#public-freezableutils</a><br/>
     */
    public FreezableUtils() {
        super(((org.xms.g.utils.XBox) null));
    }

    /**
     * org.xms.g.common.data.FreezableUtils.freeze(XE[]) Utility helper method to freeze an array of freezable entities into a list of concrete entities. The array provided here must contain elements that implement the Freezable interface.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.FreezableUtils.freeze(E[])
     * com.google.android.gms.common.data.FreezableUtils.freeze(E[]): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/FreezableUtils#public-static-arraylistt-freeze-e[]-array">https://developers.google.com/android/reference/com/google/android/gms/common/data/FreezableUtils#public-static-arraylistt-freeze-e[]-array</a><br/>
     *
     * @param param0 Array to freeze contents from
     * @return ArrayList of frozen representations of the object present in the provided array
     */
    public static <XT, XE extends org.xms.g.common.data.Freezable<XT>> java.util.ArrayList<XT> freeze(XE[] param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.FreezableUtils.freeze(org.xms.g.utils.Utils.mapArray2GH(param0, com.huawei.hms.common.data.Freezable.class, true))");
            java.util.ArrayList hReturn = com.huawei.hms.common.data.FreezableUtils.freeze(org.xms.g.utils.Utils.mapArray2GH(param0, com.huawei.hms.common.data.Freezable.class, true));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.FreezableUtils.freeze(org.xms.g.utils.Utils.mapArray2GH(param0, com.google.android.gms.common.data.Freezable.class, false))");
            java.util.ArrayList gReturn = com.google.android.gms.common.data.FreezableUtils.freeze(org.xms.g.utils.Utils.mapArray2GH(param0, com.google.android.gms.common.data.Freezable.class, false));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }

    /**
     * org.xms.g.common.data.FreezableUtils.freeze(java.util.ArrayList<XE>) Utility helper method to freeze a list of freezable entities into a list of concrete entities. The list provided here must contain elements that implement the Freezable interface.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.FreezableUtils.freeze(java.util.ArrayList<E>)
     * com.google.android.gms.common.data.FreezableUtils.freeze(java.util.ArrayList<E>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/FreezableUtils#public-static-arraylistt-freeze-arrayliste-list">https://developers.google.com/android/reference/com/google/android/gms/common/data/FreezableUtils#public-static-arraylistt-freeze-arrayliste-list</a><br/>
     *
     * @param param0 ArrayList to freeze contents from
     * @return java.util.ArrayList<XT> ArrayList of frozen representations of the object present in the provided list
     */
    public static <XT, XE extends org.xms.g.common.data.Freezable<XT>> java.util.ArrayList<XT> freeze(java.util.ArrayList<XE> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.FreezableUtils.freeze(((java.util.ArrayList) org.xms.g.utils.Utils.mapList2GH(param0, true)))");
            java.util.ArrayList hReturn = com.huawei.hms.common.data.FreezableUtils.freeze(((java.util.ArrayList) org.xms.g.utils.Utils.mapList2GH(param0, true)));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.FreezableUtils.freeze(((java.util.ArrayList) org.xms.g.utils.Utils.mapList2GH(param0, false)))");
            java.util.ArrayList gReturn = com.google.android.gms.common.data.FreezableUtils.freeze(((java.util.ArrayList) org.xms.g.utils.Utils.mapList2GH(param0, false)));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }

    /**
     * org.xms.g.common.data.FreezableUtils.freezeIterable(java.lang.Iterable<XE>) Utility helper method to freeze an array of freezable entities into a list of concrete entities. The array provided here must contain elements that implement the Freezable interface.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.FreezableUtils.freezeIterable(java.lang.Iterable<E>)
     * com.google.android.gms.common.data.FreezableUtils.freezeIterable(java.lang.Iterable<E>): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/FreezableUtils#public-static-arraylistt-freezeiterable-iterablee-iterable">https://developers.google.com/android/reference/com/google/android/gms/common/data/FreezableUtils#public-static-arraylistt-freezeiterable-iterablee-iterable</a><br/>
     *
     * @param param0 Iterable to freeze contents from
     * @return ArrayList of frozen representations of the object present in the provided array
     */
    public static <XT, XE extends org.xms.g.common.data.Freezable<XT>> java.util.ArrayList<XT> freezeIterable(java.lang.Iterable<XE> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.common.data.FreezableUtils.freezeIterable(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)))");
            java.util.ArrayList hReturn = com.huawei.hms.common.data.FreezableUtils.freezeIterable(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, true)));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.common.data.FreezableUtils.freezeIterable(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)))");
            java.util.ArrayList gReturn = com.google.android.gms.common.data.FreezableUtils.freezeIterable(org.xms.g.utils.Utils.transformIterable(param0, e -> org.xms.g.utils.Utils.getInstanceInInterface(e, false)));
            return ((java.util.ArrayList) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<Object, XT>() {

                public XT apply(java.lang.Object param0) {
                    return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(param0));
                }
            }));
        }
    }

    /**
     * org.xms.g.common.data.FreezableUtils.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.data.FreezableUtils.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted FreezableUtils object
     */
    public static org.xms.g.common.data.FreezableUtils dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.data.FreezableUtils) param0);
    }

    /**
     * org.xms.g.common.data.FreezableUtils.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.FreezableUtils;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.FreezableUtils;
        }
    }
}