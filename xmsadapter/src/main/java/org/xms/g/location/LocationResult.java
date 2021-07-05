package org.xms.g.location;

/**
 * A data class representing a geographic location result from the fused location provider.<br/>
 * Combination of com.huawei.hms.location.LocationResult and com.google.android.gms.location.LocationResult.<br/>
 * com.huawei.hms.location.LocationResult: Location data information class.<br/>
 * com.google.android.gms.location.LocationResult: A data class representing a geographic location result from the fused location provider.<br/>
 */
public final class LocationResult extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.LocationResult.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationresult-0000001051066114-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationresult-0000001051066114-V5</a><br/>
     * com.google.android.gms.location.LocationResult.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-static-final-creatorlocationresult-creator">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-static-final-creatorlocationresult-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.LocationResult createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.LocationResult hReturn = com.huawei.hms.location.LocationResult.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationResult(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.LocationResult gReturn = com.google.android.gms.location.LocationResult.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationResult(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.LocationResult[] newArray(int param0) {
            return new org.xms.g.location.LocationResult[param0];
        }
    };

    /**
     * org.xms.g.location.LocationResult.LocationResult(org.xms.g.utils.XBox) constructor of LocationResult with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationResult(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationResult.create(java.util.List<android.location.Location>) Creates a LocationResult for the given locations.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.create(java.util.List<android.location.Location>): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section1653772245611</a><br/>
     * com.google.android.gms.location.LocationResult.create(java.util.List<android.location.Location>): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-static-locationresult-create-listlocation-locations">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-static-locationresult-create-listlocation-locations</a><br/>
     *
     * @param param0 the given locations
     * @return LocationResult instance
     */
    public static org.xms.g.location.LocationResult create(java.util.List<android.location.Location> param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationResult.create(org.xms.g.utils.Utils.mapList2GH(param0, true))");
            com.huawei.hms.location.LocationResult hReturn = com.huawei.hms.location.LocationResult.create(org.xms.g.utils.Utils.mapList2GH(param0, true));
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationResult(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationResult.create(org.xms.g.utils.Utils.mapList2GH(param0, false))");
            com.google.android.gms.location.LocationResult gReturn = com.google.android.gms.location.LocationResult.create(org.xms.g.utils.Utils.mapList2GH(param0, false));
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationResult(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationResult.extractResult(android.content.Intent) Extracts the LocationResult from an Intent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.extractResult(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section191671312526">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section191671312526</a><br/>
     * com.google.android.gms.location.LocationResult.extractResult(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-static-locationresult-extractresult-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-static-locationresult-extractresult-intent-intent</a><br/>
     *
     * @param param0 intent instance
     * @return a LocationResult, or null if the Intent doesn't contain a result
     */
    public static org.xms.g.location.LocationResult extractResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationResult.extractResult(param0)");
            com.huawei.hms.location.LocationResult hReturn = com.huawei.hms.location.LocationResult.extractResult(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationResult(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationResult.extractResult(param0)");
            com.google.android.gms.location.LocationResult gReturn = com.google.android.gms.location.LocationResult.extractResult(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationResult(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationResult.hasResult(android.content.Intent) Returns true if an Intent contains a LocationResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.hasResult(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section122471915428">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section122471915428</a><br/>
     * com.google.android.gms.location.LocationResult.hasResult(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-static-boolean-hasresult-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-static-boolean-hasresult-intent-intent</a><br/>
     *
     * @param param0 intent instance
     * @return true if the intent contains a LocationResult, false otherwise
     */
    public static boolean hasResult(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationResult.hasResult(param0)");
            return com.huawei.hms.location.LocationResult.hasResult(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationResult.hasResult(param0)");
            return com.google.android.gms.location.LocationResult.hasResult(param0);
        }
    }

    /**
     * org.xms.g.location.LocationResult.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationResult.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationResult object
     */
    public static org.xms.g.location.LocationResult dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationResult) param0);
    }

    /**
     * org.xms.g.location.LocationResult.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationResult;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationResult;
        }
    }

    /**
     * org.xms.g.location.LocationResult.equals(java.lang.Object) Checks whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.equals(java.lang.Object)
     * com.google.android.gms.location.LocationResult.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-boolean-equals-object-other">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-boolean-equals-object-other</a><br/>
     *
     * @param param0 the other instance
     * @return true if two instances are equal
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.location.LocationResult.getLastLocation() Returns the most recent location available in this result, or null if no locations are available.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.getLastLocation(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section17829111811544">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section17829111811544</a><br/>
     * com.google.android.gms.location.LocationResult.getLastLocation(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-location-getlastlocation">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-location-getlastlocation</a><br/>
     *
     * @return the available location of the last request
     */
    public final android.location.Location getLastLocation() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).getLastLocation()");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).getLastLocation();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).getLastLocation()");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).getLastLocation();
        }
    }

    /**
     * org.xms.g.location.LocationResult.getLocations() Returns locations computed, ordered from oldest to newest.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.getLocations(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section0637438308">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationresult-0000001051066114-V5#EN-US_TOPIC_0000001051066114__section0637438308</a><br/>
     * com.google.android.gms.location.LocationResult.getLocations(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-listlocation-getlocations">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-listlocation-getlocations</a><br/>
     *
     * @return a set of available locations
     */
    public final java.util.List<android.location.Location> getLocations() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).getLocations()");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).getLocations();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).getLocations()");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).getLocations();
        }
    }

    /**
     * org.xms.g.location.LocationResult.hashCode() Overrides the method of the java.lang.Object class to calculate hashCode of a object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.hashCode()
     * com.google.android.gms.location.LocationResult.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-int-hashcode</a><br/>
     *
     * @return a hash code value
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.location.LocationResult.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.toString()
     * com.google.android.gms.location.LocationResult.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-string-tostring</a><br/>
     *
     * @return A character string after being converted
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.LocationResult) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.LocationResult) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.location.LocationResult.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationResult.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.LocationResult.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-void-writetoparcel-parcel-parcel,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/LocationResult#public-void-writetoparcel-parcel-parcel,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationResult) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationResult) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationResult) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationResult) this.getGInstance()).writeToParcel(param0, param1);
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }
}