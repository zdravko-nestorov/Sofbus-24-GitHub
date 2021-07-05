package org.xms.g.common.api;

/**
 * Describes the authorization request for OAuth2.0 which has security implications for the user, and requesting additional scopes will result in authorization dialogs.<br/>
 * Combination of com.huawei.hms.support.api.entity.auth.Scope and com.google.android.gms.common.api.Scope.<br/>
 * com.huawei.hms.support.api.entity.auth.Scope: Describes the authorization request for OAuth2.0, which affects user security. When authorization is requested, an authorization dialog box is displayed.<br/>
 * com.google.android.gms.common.api.Scope: Describes an OAuth 2.0 scope to request. This has security implications for the user, and requesting additional scopes will result in authorization dialogs.<br/>
 */
public final class Scope extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.support.api.entity.auth.Scope.CREATOR: <a href=""></a><br/>
     * com.google.android.gms.common.api.Scope.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-static-final-creatorscope-creator">https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-static-final-creatorscope-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.common.api.Scope createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.support.api.entity.auth.Scope hReturn = com.huawei.hms.support.api.entity.auth.Scope.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.common.api.Scope gReturn = com.google.android.gms.common.api.Scope.CREATOR.createFromParcel(param0);
                return new org.xms.g.common.api.Scope(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.common.api.Scope[] newArray(int param0) {
            return new org.xms.g.common.api.Scope[param0];
        }
    };

    /**
     * org.xms.g.common.api.Scope.Scope(org.xms.g.utils.XBox) constructor of Scope with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public Scope(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.api.Scope.Scope(java.lang.String) Creates a new scope using the specified URI.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.entity.auth.Scope.Scope(java.lang.String): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section03313201607">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section03313201607</a><br/>
     * com.google.android.gms.common.api.Scope.Scope(java.lang.String): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-scope-string-scopeuri">https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-scope-string-scopeuri</a><br/>
     *
     * @param param0 URI of the scope
     */
    public Scope(java.lang.String param0) {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            this.setHInstance(new com.huawei.hms.support.api.entity.auth.Scope(param0));
        } else {
            this.setGInstance(new com.google.android.gms.common.api.Scope(param0));
        }
    }

    /**
     * org.xms.g.common.api.Scope.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.api.Scope.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Scope object
     */
    public static org.xms.g.common.api.Scope dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.common.api.Scope) param0);
    }

    /**
     * org.xms.g.common.api.Scope.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.support.api.entity.auth.Scope;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.common.api.Scope;
        }
    }

    /**
     * org.xms.g.common.api.Scope.equals(java.lang.Object) Determines whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.entity.auth.Scope.equals(java.lang.Object): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section857317474820">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section857317474820</a><br/>
     * com.google.android.gms.common.api.Scope.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 Objects to be compared
     * @return Comparison result: equal if true, and unequal if false
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Scope) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.common.api.Scope) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.common.api.Scope.hashCode() hashCode of a compute instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.entity.auth.Scope.hashCode(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section2482195825115">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section2482195825115</a><br/>
     * com.google.android.gms.common.api.Scope.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-int-hashcode</a><br/>
     *
     * @return hash code
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Scope) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.common.api.Scope) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.common.api.Scope.toString() Constructs and outputs the string of an instance.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.entity.auth.Scope.toString(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section170184875211">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section170184875211</a><br/>
     * com.google.android.gms.common.api.Scope.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-string-tostring</a><br/>
     *
     * @return the string of an instance
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).toString()");
            return ((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Scope) this.getGInstance()).toString()");
            return ((com.google.android.gms.common.api.Scope) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.common.api.Scope.writeToParcel(android.os.Parcel,int) used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.support.api.entity.auth.Scope.writeToParcel(android.os.Parcel,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section5488115785018">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/scope-0000001050123083#EN-US_TOPIC_0000001050123083__section5488115785018</a><br/>
     * com.google.android.gms.common.api.Scope.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-void-writetoparcel-parcel-dest,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/common/api/Scope#public-void-writetoparcel-parcel-dest,-int-flags</a><br/>
     *
     * @param param0 Parcel object
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.support.api.entity.auth.Scope) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.common.api.Scope) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.common.api.Scope) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}