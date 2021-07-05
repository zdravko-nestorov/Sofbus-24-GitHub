package org.xms.g.maps.model;

/**
 * Represents a level in a building.<br/>
 * Combination of com.huawei.hms.maps.model.IndoorLevel and com.google.android.gms.maps.model.IndoorLevel.<br/>
 * com.huawei.hms.maps.model.IndoorLevel: Represents a level in a building.<br/>
 * com.google.android.gms.maps.model.IndoorLevel: Represents a level in a building.<br/>
 */
public final class IndoorLevel extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.maps.model.IndoorLevel.IndoorLevel(org.xms.g.utils.XBox) Represents a level in a building.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the param should instanceof utils XBox
     */
    public IndoorLevel(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.maps.model.IndoorLevel.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.maps.model.IndoorLevel.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java lang Object
     * @return cast maps model IndoorLevel object
     */
    public static org.xms.g.maps.model.IndoorLevel dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.maps.model.IndoorLevel) param0);
    }

    /**
     * org.xms.g.maps.model.IndoorLevel.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.maps.model.IndoorLevel;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.maps.model.IndoorLevel;
        }
    }

    /**
     * org.xms.g.maps.model.IndoorLevel.activate() Sets this level as the visible level in its building.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorLevel.activate()
     * com.google.android.gms.maps.model.IndoorLevel.activate(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-void-activate">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-void-activate</a><br/>
     */
    public final void activate() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).activate()");
            ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).activate();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).activate()");
            ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).activate();
        }
    }

    /**
     * org.xms.g.maps.model.IndoorLevel.equals(java.lang.Object) Tests if this IndoorLevel is equal to another.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorLevel.equals(java.lang.Object)
     * com.google.android.gms.maps.model.IndoorLevel.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-boolean-equals-object-other">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-boolean-equals-object-other</a><br/>
     *
     * @param param0 an Object
     * @return true if both objects are the same object, that is, this == other
     */
    public final boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.maps.model.IndoorLevel.getName() Localized display name for the level, e.g."Ground floor". Returns an empty string if no name is defined.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorLevel.getName()
     * com.google.android.gms.maps.model.IndoorLevel.getName(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-string-getname">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-string-getname</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String getName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).getName()");
            return ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).getName();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).getName()");
            return ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).getName();
        }
    }

    /**
     * org.xms.g.maps.model.IndoorLevel.getShortName() Localized short display name for the level, e.g."1". Returns an empty string if no shortName is defined.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorLevel.getShortName()
     * com.google.android.gms.maps.model.IndoorLevel.getShortName(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-string-getshortname">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-string-getshortname</a><br/>
     *
     * @return the return object is java lang String
     */
    public final java.lang.String getShortName() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).getShortName()");
            return ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).getShortName();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).getShortName()");
            return ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).getShortName();
        }
    }

    /**
     * org.xms.g.maps.model.IndoorLevel.hashCode() hash Code.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.maps.model.IndoorLevel.hashCode()
     * com.google.android.gms.maps.model.IndoorLevel.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/maps/model/IndoorLevel#public-int-hashcode</a><br/>
     *
     * @return the return object is int
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.maps.model.IndoorLevel) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.maps.model.IndoorLevel) this.getGInstance()).hashCode();
        }
    }
}