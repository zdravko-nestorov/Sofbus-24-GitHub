package org.xms.g.maps.model;

/**
 * Represents a building.<br/>
 * Combination of com.huawei.hms.maps.model.IndoorBuilding and com.google.android.gms.maps.model.IndoorBuilding.<br/>
 * com.huawei.hms.maps.model.IndoorBuilding: Represents a building.<br/>
 * com.google.android.gms.maps.model.IndoorBuilding: Represents a building.<br/>
 */
public final class IndoorBuilding extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.IndoorBuilding.IndoorBuilding(org.xms.g.utils.XBox) Represents a building.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public IndoorBuilding(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.IndoorBuilding.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.IndoorBuilding.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model IndoorBuilding object
     */
    public static org.xms.g.maps.model.IndoorBuilding dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.IndoorBuilding) param0);
    }

    /**
     * org.xms.g.maps.model.IndoorBuilding.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.IndoorBuilding;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.IndoorBuilding;
        }
    }

    /**
     * org.xms.g.maps.model.IndoorBuilding.equals(java.lang.Object) Tests if this IndoorBuilding is equal to another.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorBuilding.equals(java.lang.Object)
     * com.google.android.gms.maps.model.IndoorBuilding.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-boolean-equals-object-other">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-boolean-equals-object-other</a><br/>
     *
     * @param param0 an Object
     * @return true if both objects are the same object, that is, this == other
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.IndoorBuilding.getActiveLevelIndex() Gets the index in the list returned by getLevels()of the level that is currently active in this building(default if no active level was previously set).<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorBuilding.getActiveLevelIndex()
     * com.google.android.gms.maps.model.IndoorBuilding.getActiveLevelIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-int-getactivelevelindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-int-getactivelevelindex</a><br/>
     *
     * @return the return object is int
     */
    public final int getActiveLevelIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getActiveLevelIndex()");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getActiveLevelIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getActiveLevelIndex()");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getActiveLevelIndex();
        }
    }

    /**
     * org.xms.g.maps.model.IndoorBuilding.getDefaultLevelIndex() Gets the index in the list returned by getLevels()of the default level for this building.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorBuilding.getDefaultLevelIndex()
     * com.google.android.gms.maps.model.IndoorBuilding.getDefaultLevelIndex(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-int-getdefaultlevelindex">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-int-getdefaultlevelindex</a><br/>
     *
     * @return the return object is int
     */
    public final int getDefaultLevelIndex() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getDefaultLevelIndex()");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getDefaultLevelIndex();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getDefaultLevelIndex()");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getDefaultLevelIndex();
        }
    }

    /**
     * org.xms.g.maps.model.IndoorBuilding.getLevels() Gets the levels in the building.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorBuilding.getLevels()
     * com.google.android.gms.maps.model.IndoorBuilding.getLevels(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-listindoorlevel-getlevels">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-listindoorlevel-getlevels</a><br/>
     *
     * @return the return object is java util List<IndoorLevel>
     */
    public final java.util.List<org.xms.g.maps.model.IndoorLevel> getLevels() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getLevels()");
            java.util.List hReturn = ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).getLevels();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(hReturn, new org.xms.g.utils.Function<com.huawei.hms.maps.model.IndoorLevel, org.xms.g.maps.model.IndoorLevel>() {

                public org.xms.g.maps.model.IndoorLevel apply(com.huawei.hms.maps.model.IndoorLevel param0) {
                    return new org.xms.g.maps.model.IndoorLevel(new org.xms.g.utils.XBox(null, param0));
                }
            }));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getLevels()");
            java.util.List gReturn = ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).getLevels();
            return ((java.util.List) org.xms.g.utils.Utils.mapCollection(gReturn, new org.xms.g.utils.Function<com.google.android.gms.maps.model.IndoorLevel, org.xms.g.maps.model.IndoorLevel>() {

                public org.xms.g.maps.model.IndoorLevel apply(com.google.android.gms.maps.model.IndoorLevel param0) {
                    return new org.xms.g.maps.model.IndoorLevel(new org.xms.g.utils.XBox(param0, null));
                }
            }));
        }
    }

    /**
     * org.xms.g.maps.model.IndoorBuilding.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorBuilding.hashCode()
     * com.google.android.gms.maps.model.IndoorBuilding.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.maps.model.IndoorBuilding.isUnderground() Returns true if the building is entirely underground.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorBuilding.isUnderground()
     * com.google.android.gms.maps.model.IndoorBuilding.isUnderground(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-boolean-isunderground">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorBuilding#public-boolean-isunderground</a><br/>
     *
     * @return the return object is boolean
     */
    public final boolean isUnderground() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).isUnderground()");
            return ((com.huawei.hms.maps.model.IndoorBuilding) this.getHInstance()).isUnderground();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).isUnderground()");
            return ((com.google.android.gms.maps.model.IndoorBuilding) this.getGInstance()).isUnderground();
        }
    }
}