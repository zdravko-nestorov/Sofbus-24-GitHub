package org.xms.g.common.api;

/**
 * Represents a resource, or a holder of resources, which may be released once they are no longer needed.<br/>
 * Combination of com.huawei.hms.common.api.Releasable and com.google.android.gms.common.api.Releasable.<br/>
 * com.huawei.hms.common.api.Releasable: <br/>
 * com.google.android.gms.common.api.Releasable: Represents a resource, or a holder of resources, which may be released once they are no longer needed.<br/>
 */
public interface Releasable extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.common.api.Releasable.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Releasable.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Releasable object
     */
    public static org.xms.g.common.api.Releasable dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.Releasable) param0);
    }

    /**
     * org.xms.g.common.api.Releasable.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.api.Releasable;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Releasable;
            }
        }
        return param0 instanceof org.xms.g.common.api.Releasable;
    }

    /**
     * org.xms.g.common.api.Releasable.release() release once when resources are no longer needed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.api.Releasable.release()
     * com.google.android.gms.common.api.Releasable.release(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Releasable#public-abstract-void-release">https://developers.google.com/android/reference/com/google/android/gms/common/api/Releasable#public-abstract-void-release</a><br/>
     */
    public void release();

    default java.lang.Object getZInstanceReleasable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceReleasable();
        } else {
            return getGInstanceReleasable();
        }
    }

    default com.google.android.gms.common.api.Releasable getGInstanceReleasable() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.api.Releasable) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.common.api.Releasable() {

            public void release() {
                org.xms.g.common.api.Releasable.this.release();
            }
        };
    }

    default com.huawei.hms.common.api.Releasable getHInstanceReleasable() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.common.api.Releasable) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.common.api.Releasable() {

            public void release() {
                org.xms.g.common.api.Releasable.this.release();
            }
        };
    }

    /**
     * Wrapper class of Releasable which represents a resource, or a holder of resources, which may be released once they are no longer needed.<br/>
     * Combination of com.huawei.hms.common.api.Releasable and com.google.android.gms.common.api.Releasable.<br/>
     * com.huawei.hms.common.api.Releasable: <br/>
     * com.google.android.gms.common.api.Releasable: Represents a resource, or a holder of resources, which may be released once they are no longer needed.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.api.Releasable {

        /**
         * org.xms.g.common.api.Releasable.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.api.Releasable.XImpl.release() release once when resources are no longer needed.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.api.Releasable.release()
         * com.google.android.gms.common.api.Releasable.release(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Releasable#public-abstract-void-release">https://developers.google.com/android/reference/com/google/android/gms/common/api/Releasable#public-abstract-void-release</a><br/>
         */
        public void release() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.api.Releasable) this.getHInstance()).release()");
                ((com.huawei.hms.common.api.Releasable) this.getHInstance()).release();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Releasable) this.getGInstance()).release()");
                ((com.google.android.gms.common.api.Releasable) this.getGInstance()).release();
            }
        }
    }
}