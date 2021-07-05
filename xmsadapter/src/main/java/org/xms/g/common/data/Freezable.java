package org.xms.g.common.data;

/**
 * Interface for data objects that support being frozen into immutable representations.<br/>
 * Combination of com.huawei.hms.common.data.Freezable<T> and com.google.android.gms.common.data.Freezable<T>.<br/>
 * com.huawei.hms.common.data.Freezable<T>: <br/>
 * com.google.android.gms.common.data.Freezable<T>: Interface for data objects that support being frozen into immutable representations.<br/>
 */
public interface Freezable<XT> extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.common.data.Freezable.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.data.Freezable.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Freezable object
     */
    public static org.xms.g.common.data.Freezable dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.data.Freezable) param0);
    }

    /**
     * org.xms.g.common.data.Freezable.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.Freezable;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.Freezable;
            }
        }
        return param0 instanceof org.xms.g.common.data.Freezable;
    }

    /**
     * org.xms.g.common.data.Freezable.freeze() Freeze a volatile representation into an immutable representation. Objects returned from this call are safe to cache.Note that the output of freeze may not be identical to the parent object, but should be equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.Freezable<T>.freeze()
     * com.google.android.gms.common.data.Freezable.freeze(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/Freezable#public-abstract-t-freeze">https://developers.google.com/android/reference/com/google/android/gms/common/data/Freezable#public-abstract-t-freeze</a><br/>
     *
     * @return A concrete implementation of the data object
     */
    public XT freeze();

    /**
     * org.xms.g.common.data.Freezable.isDataValid() Check to see if this object is valid for use. If the object is still volatile, this method will indicate whether or not the object can be safely used. The output of a call to freeze() will always be valid.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.Freezable<T>.isDataValid()
     * com.google.android.gms.common.data.Freezable.isDataValid(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/Freezable#public-abstract-boolean-isdatavalid">https://developers.google.com/android/reference/com/google/android/gms/common/data/Freezable#public-abstract-boolean-isdatavalid</a><br/>
     *
     * @return whether or not the object is valid for use
     */
    public boolean isDataValid();

    default java.lang.Object getZInstanceFreezable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceFreezable();
        } else {
            return getGInstanceFreezable();
        }
    }

    default <T> com.google.android.gms.common.data.Freezable<T> getGInstanceFreezable() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.data.Freezable<T>) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.common.data.Freezable<T>() {

            public T freeze() {
                XT xResult = ((XT) org.xms.g.common.data.Freezable.this.freeze());
                return ((T) org.xms.g.utils.Utils.getInstanceInInterface(xResult, false));
            }

            public boolean isDataValid() {
                return org.xms.g.common.data.Freezable.this.isDataValid();
            }
        };
    }

    default <T> com.huawei.hms.common.data.Freezable<T> getHInstanceFreezable() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.common.data.Freezable<T>) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.common.data.Freezable<T>() {

            public T freeze() {
                XT xResult = ((XT) org.xms.g.common.data.Freezable.this.freeze());
                return ((T) org.xms.g.utils.Utils.getInstanceInInterface(xResult, true));
            }

            public boolean isDataValid() {
                return org.xms.g.common.data.Freezable.this.isDataValid();
            }
        };
    }

    /**
     * Wrapper class of Freezable which is an Interface for data objects that support being frozen into immutable representations.<br/>
     * Combination of com.huawei.hms.common.data.Freezable<T> and com.google.android.gms.common.data.Freezable<T>.<br/>
     * com.huawei.hms.common.data.Freezable<T>: <br/>
     * com.google.android.gms.common.data.Freezable<T>: Interface for data objects that support being frozen into immutable representations.<br/>
     */
    public static class XImpl<XT> extends org.xms.g.utils.XObject implements org.xms.g.common.data.Freezable<XT> {

        /**
         * org.xms.g.common.data.Freezable.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.data.Freezable.XImpl.freeze() Freeze a volatile representation into an immutable representation. Objects returned from this call are safe to cache.Note that the output of freeze may not be identical to the parent object, but should be equal.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.Freezable<T>.freeze()
         * com.google.android.gms.common.data.Freezable.freeze(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/Freezable#public-abstract-t-freeze">https://developers.google.com/android/reference/com/google/android/gms/common/data/Freezable#public-abstract-t-freeze</a><br/>
         *
         * @return A concrete implementation of the data object
         */
        public XT freeze() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.Freezable) this.getHInstance()).freeze()");
                java.lang.Object hmsObj = ((com.huawei.hms.common.data.Freezable) this.getHInstance()).freeze();
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithHmsObject(hmsObj));
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.Freezable) this.getGInstance()).freeze()");
                java.lang.Object gmsObj = ((com.google.android.gms.common.data.Freezable) this.getGInstance()).freeze();
                return ((XT) org.xms.g.utils.Utils.getXmsObjectWithGmsObject(gmsObj));
            }
        }

        /**
         * org.xms.g.common.data.Freezable.XImpl.isDataValid() Check to see if this object is valid for use. If the object is still volatile, this method will indicate whether or not the object can be safely used. The output of a call to freeze() will always be valid.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.Freezable<T>.isDataValid()
         * com.google.android.gms.common.data.Freezable.isDataValid(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/Freezable#public-abstract-boolean-isdatavalid">https://developers.google.com/android/reference/com/google/android/gms/common/data/Freezable#public-abstract-boolean-isdatavalid</a><br/>
         *
         * @return whether or not the object is valid for use
         */
        public boolean isDataValid() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.Freezable) this.getHInstance()).isDataValid()");
                return ((com.huawei.hms.common.data.Freezable) this.getHInstance()).isDataValid();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.Freezable) this.getGInstance()).isDataValid()");
                return ((com.google.android.gms.common.data.Freezable) this.getGInstance()).isDataValid();
            }
        }
    }
}