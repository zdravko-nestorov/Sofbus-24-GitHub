package org.xms.g.common.data;

/**
 * An interface for notifying an observer about changes to a DataBuffer.To support adding multiple observers, see DataBufferObserverSet. It allows you to delegate addObserver and removeObserver to it and it will handle distributing all the notifications to all registered observers.<br/>
 * Combination of com.huawei.hms.common.data.DataBufferObserver and com.google.android.gms.common.data.DataBufferObserver.<br/>
 * com.huawei.hms.common.data.DataBufferObserver: <br/>
 * com.google.android.gms.common.data.DataBufferObserver: An interface for notifying an observer about changes to a DataBuffer.To support adding multiple observers, see DataBufferObserverSet. It allows you to delegate addObserver and removeObserver to it and it will handle distributing all the notifications to all registered observers.<br/>
 */
public interface DataBufferObserver extends org.xms.g.utils.XInterface {

    /**
     * org.xms.g.common.data.DataBufferObserver.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.data.DataBufferObserver.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted DataBufferObserver object
     */
    public static org.xms.g.common.data.DataBufferObserver dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.data.DataBufferObserver) param0);
    }

    /**
     * org.xms.g.common.data.DataBufferObserver.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
                return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.common.data.DataBufferObserver;
            } else {
                return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.data.DataBufferObserver;
            }
        }
        return param0 instanceof org.xms.g.common.data.DataBufferObserver;
    }

    /**
     * org.xms.g.common.data.DataBufferObserver.onDataChanged() Called when the overall data changes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferObserver.onDataChanged()
     * com.google.android.gms.common.data.DataBufferObserver.onDataChanged(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatachanged">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatachanged</a><br/>
     */
    public void onDataChanged();

    /**
     * org.xms.g.common.data.DataBufferObserver.onDataRangeChanged(int,int) Called when a range of items changes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferObserver.onDataRangeChanged(int,int)
     * com.google.android.gms.common.data.DataBufferObserver.onDataRangeChanged(int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangechanged-int-position,-int-count">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangechanged-int-position,-int-count</a><br/>
     *
     * @param param0 the position
     * @param param1 the count
     */
    public void onDataRangeChanged(int param0, int param1);

    /**
     * org.xms.g.common.data.DataBufferObserver.onDataRangeInserted(int,int) Called when a range of items is inserted.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferObserver.onDataRangeInserted(int,int)
     * com.google.android.gms.common.data.DataBufferObserver.onDataRangeInserted(int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangeinserted-int-position,-int-count">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangeinserted-int-position,-int-count</a><br/>
     *
     * @param param0 The position
     * @param param1 The count
     */
    public void onDataRangeInserted(int param0, int param1);

    /**
     * org.xms.g.common.data.DataBufferObserver.onDataRangeMoved(int,int,int) Called when a range of items is moved.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferObserver.onDataRangeMoved(int,int,int)
     * com.google.android.gms.common.data.DataBufferObserver.onDataRangeMoved(int,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangemoved-int-fromposition,-int-toposition,-int-count">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangemoved-int-fromposition,-int-toposition,-int-count</a><br/>
     *
     * @param param0 The fromPosition
     * @param param1 The toPosition
     * @param param2 The count
     */
    public void onDataRangeMoved(int param0, int param1, int param2);

    /**
     * org.xms.g.common.data.DataBufferObserver.onDataRangeRemoved(int,int) Called when a range of items is removed.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.common.data.DataBufferObserver.onDataRangeRemoved(int,int)
     * com.google.android.gms.common.data.DataBufferObserver.onDataRangeRemoved(int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangeremoved-int-position,-int-count">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangeremoved-int-position,-int-count</a><br/>
     *
     * @param param0 The position
     * @param param1 The count
     */
    public void onDataRangeRemoved(int param0, int param1);

    default java.lang.Object getZInstanceDataBufferObserver() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return getHInstanceDataBufferObserver();
        } else {
            return getGInstanceDataBufferObserver();
        }
    }

    default com.google.android.gms.common.data.DataBufferObserver getGInstanceDataBufferObserver() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.google.android.gms.common.data.DataBufferObserver) ((org.xms.g.utils.XGettable) this).getGInstance());
        }
        return new com.google.android.gms.common.data.DataBufferObserver() {

            public void onDataChanged() {
                org.xms.g.common.data.DataBufferObserver.this.onDataChanged();
            }

            public void onDataRangeChanged(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeChanged(param0, param1);
            }

            public void onDataRangeInserted(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeInserted(param0, param1);
            }

            public void onDataRangeMoved(int param0, int param1, int param2) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeMoved(param0, param1, param2);
            }

            public void onDataRangeRemoved(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeRemoved(param0, param1);
            }
        };
    }

    default com.huawei.hms.common.data.DataBufferObserver getHInstanceDataBufferObserver() {
        if (this instanceof org.xms.g.utils.XGettable) {
            return ((com.huawei.hms.common.data.DataBufferObserver) ((org.xms.g.utils.XGettable) this).getHInstance());
        }
        return new com.huawei.hms.common.data.DataBufferObserver() {

            public void onDataChanged() {
                org.xms.g.common.data.DataBufferObserver.this.onDataChanged();
            }

            public void onDataRangeChanged(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeChanged(param0, param1);
            }

            public void onDataRangeInserted(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeInserted(param0, param1);
            }

            public void onDataRangeMoved(int param0, int param1, int param2) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeMoved(param0, param1, param2);
            }

            public void onDataRangeRemoved(int param0, int param1) {
                org.xms.g.common.data.DataBufferObserver.this.onDataRangeRemoved(param0, param1);
            }
        };
    }

    /**
     * Interface a data buffer can implement to expose the fact that it supports observation.<br/>
     * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
     * com.google.android.gms.common.data.DataBufferObserver.Observable: Interface a data buffer can implement to expose the fact that it supports observation.<br/>
     */
    public static interface Observable extends org.xms.g.utils.XInterface {

        /**
         * org.xms.g.common.data.DataBufferObserver.Observable.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.data.DataBufferObserver.Observable.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the input object
         * @return casted DataBufferObserver.Observable object
         */
        public static org.xms.g.common.data.DataBufferObserver.Observable dynamicCast(java.lang.Object param0) {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * org.xms.g.common.data.DataBufferObserver.Observable.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
        public void addObserver(org.xms.g.common.data.DataBufferObserver param0);

        /**
         * XMS does not provide this api.<br/>
         */
        public void removeObserver(org.xms.g.common.data.DataBufferObserver param0);

        default java.lang.Object getZInstanceObservable() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        default com.google.android.gms.common.data.DataBufferObserver.Observable getGInstanceObservable() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        default java.lang.Object getHInstanceObservable() {
            throw new java.lang.RuntimeException("Not Supported");
        }

        /**
         * Wrapper class of DataBufferObserver.Observable which is an Interface a data buffer can implement to expose the fact that it supports observation.<br/>
         * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
         * com.google.android.gms.common.data.DataBufferObserver.Observable: Interface a data buffer can implement to expose the fact that it supports observation.<br/>
         */
        public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.data.DataBufferObserver.Observable {

            /**
             * org.xms.g.common.data.DataBufferObserver.Observable.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
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
            public void addObserver(org.xms.g.common.data.DataBufferObserver param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }

            /**
             * XMS does not provide this api.<br/>
             */
            public void removeObserver(org.xms.g.common.data.DataBufferObserver param0) {
                throw new java.lang.RuntimeException("Not Supported");
            }
        }
    }

    /**
     * Wrapper class of DataBufferObserver which is an interface for notifying an observer about changes to a DataBuffer.To support adding multiple observers, see DataBufferObserverSet. It allows you to delegate addObserver and removeObserver to it and it will handle distributing all the notifications to all registered observers.<br/>
     * Combination of com.huawei.hms.common.data.DataBufferObserver and com.google.android.gms.common.data.DataBufferObserver.<br/>
     * com.huawei.hms.common.data.DataBufferObserver: <br/>
     * com.google.android.gms.common.data.DataBufferObserver: An interface for notifying an observer about changes to a DataBuffer.To support adding multiple observers, see DataBufferObserverSet. It allows you to delegate addObserver and removeObserver to it and it will handle distributing all the notifications to all registered observers.<br/>
     */
    public static class XImpl extends org.xms.g.utils.XObject implements org.xms.g.common.data.DataBufferObserver {

        /**
         * org.xms.g.common.data.DataBufferObserver.XImpl.XImpl(org.xms.g.utils.XBox) constructor of XImpl with XBox.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         *
         * @param param0 the wrapper of xms instance
         */
        public XImpl(org.xms.g.utils.XBox param0) {
            super(param0);
        }

        /**
         * org.xms.g.common.data.DataBufferObserver.XImpl.onDataChanged() Called when the overall data changes.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBufferObserver.onDataChanged()
         * com.google.android.gms.common.data.DataBufferObserver.onDataChanged(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatachanged">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatachanged</a><br/>
         */
        public void onDataChanged() {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataChanged()");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataChanged();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataChanged()");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataChanged();
            }
        }

        /**
         * org.xms.g.common.data.DataBufferObserver.XImpl.onDataRangeChanged(int,int) Called when a range of items changes.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBufferObserver.onDataRangeChanged(int,int)
         * com.google.android.gms.common.data.DataBufferObserver.onDataRangeChanged(int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangechanged-int-position,-int-count">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangechanged-int-position,-int-count</a><br/>
         *
         * @param param0 the position
         * @param param1 the count
         */
        public void onDataRangeChanged(int param0, int param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeChanged(param0, param1)");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeChanged(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeChanged(param0, param1)");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeChanged(param0, param1);
            }
        }

        /**
         * org.xms.g.common.data.DataBufferObserver.XImpl.onDataRangeInserted(int,int) Called when a range of items is inserted.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBufferObserver.onDataRangeInserted(int,int)
         * com.google.android.gms.common.data.DataBufferObserver.onDataRangeInserted(int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangeinserted-int-position,-int-count">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangeinserted-int-position,-int-count</a><br/>
         *
         * @param param0 The position
         * @param param1 The count
         */
        public void onDataRangeInserted(int param0, int param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeInserted(param0, param1)");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeInserted(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeInserted(param0, param1)");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeInserted(param0, param1);
            }
        }

        /**
         * org.xms.g.common.data.DataBufferObserver.XImpl.onDataRangeMoved(int,int,int) Called when a range of items is moved.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBufferObserver.onDataRangeMoved(int,int,int)
         * com.google.android.gms.common.data.DataBufferObserver.onDataRangeMoved(int,int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangemoved-int-fromposition,-int-toposition,-int-count">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangemoved-int-fromposition,-int-toposition,-int-count</a><br/>
         *
         * @param param0 The fromPosition
         * @param param1 The toPosition
         * @param param2 The count
         */
        public void onDataRangeMoved(int param0, int param1, int param2) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeMoved(param0, param1, param2)");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeMoved(param0, param1, param2);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeMoved(param0, param1, param2)");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeMoved(param0, param1, param2);
            }
        }

        /**
         * org.xms.g.common.data.DataBufferObserver.XImpl.onDataRangeRemoved(int,int) Called when a range of items is removed.<br/>
         * Support running environments including both HMS and GMS which are chosen by users.<br/>
         * Below are the references of HMS apis and GMS apis respectively:<br/>
         * com.huawei.hms.common.data.DataBufferObserver.onDataRangeRemoved(int,int)
         * com.google.android.gms.common.data.DataBufferObserver.onDataRangeRemoved(int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangeremoved-int-position,-int-count">https://developers.google.com/android/reference/com/google/android/gms/common/data/DataBufferObserver#public-abstract-void-ondatarangeremoved-int-position,-int-count</a><br/>
         *
         * @param param0 The position
         * @param param1 The count
         */
        public void onDataRangeRemoved(int param0, int param1) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeRemoved(param0, param1)");
                ((com.huawei.hms.common.data.DataBufferObserver) this.getHInstance()).onDataRangeRemoved(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeRemoved(param0, param1)");
                ((com.google.android.gms.common.data.DataBufferObserver) this.getGInstance()).onDataRangeRemoved(param0, param1);
            }
        }
    }
}