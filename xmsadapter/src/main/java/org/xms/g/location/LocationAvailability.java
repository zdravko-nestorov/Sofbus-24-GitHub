package org.xms.g.location;

/**
 * Status on the device location availability.<br/>
 * Combination of com.huawei.hms.location.LocationAvailability and com.google.android.gms.location.LocationAvailability.<br/>
 * com.huawei.hms.location.LocationAvailability: Device location availability.<br/>
 * com.google.android.gms.location.LocationAvailability: Status on the availability of location data.<br/>
 */
public final class LocationAvailability extends org.xms.g.utils.XObject {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.LocationAvailability.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationavailability-0000001050746173-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/locationavailability-0000001050746173-V5</a><br/>
     * com.google.android.gms.location.LocationAvailability.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-static-final-creatorlocationavailability-creator">https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-static-final-creatorlocationavailability-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.LocationAvailability createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.LocationAvailability hReturn = com.huawei.hms.location.LocationAvailability.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationAvailability(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.LocationAvailability gReturn = com.google.android.gms.location.LocationAvailability.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.LocationAvailability(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.LocationAvailability[] newArray(int param0) {
            return new org.xms.g.location.LocationAvailability[param0];
        }
    };

    /**
     * org.xms.g.location.LocationAvailability.LocationAvailability(org.xms.g.utils.XBox) constructor of LocationAvailability with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public LocationAvailability(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.location.LocationAvailability.extractLocationAvailability(android.content.Intent) Extracts the LocationAvailability from an Intent.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationAvailability.extractLocationAvailability(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationavailability-0000001050746173-V5#EN-US_TOPIC_0000001050746173__section1653772245611">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationavailability-0000001050746173-V5#EN-US_TOPIC_0000001050746173__section1653772245611</a><br/>
     * com.google.android.gms.location.LocationAvailability.extractLocationAvailability(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-static-locationavailability-extractlocationavailability-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-static-locationavailability-extractlocationavailability-intent-intent</a><br/>
     *
     * @param param0 Intent instance
     * @return a LocationAvailability, or null if the Intent doesn't contain this data
     */
    public static org.xms.g.location.LocationAvailability extractLocationAvailability(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationAvailability.extractLocationAvailability(param0)");
            com.huawei.hms.location.LocationAvailability hReturn = com.huawei.hms.location.LocationAvailability.extractLocationAvailability(param0);
            return ((hReturn) == null ? null : (new org.xms.g.location.LocationAvailability(new org.xms.g.utils.XBox(null, hReturn))));
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationAvailability.extractLocationAvailability(param0)");
            com.google.android.gms.location.LocationAvailability gReturn = com.google.android.gms.location.LocationAvailability.extractLocationAvailability(param0);
            return ((gReturn) == null ? null : (new org.xms.g.location.LocationAvailability(new org.xms.g.utils.XBox(gReturn, null))));
        }
    }

    /**
     * org.xms.g.location.LocationAvailability.hasLocationAvailability(android.content.Intent) Returns true if an Intent contains a LocationAvailability.This is a utility function that can be called from inside an intent receiver to make sure the received intent contains location availability data.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationAvailability.hasLocationAvailability(android.content.Intent): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationavailability-0000001050746173-V5#EN-US_TOPIC_0000001050746173__section15906933183111">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationavailability-0000001050746173-V5#EN-US_TOPIC_0000001050746173__section15906933183111</a><br/>
     * com.google.android.gms.location.LocationAvailability.hasLocationAvailability(android.content.Intent): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-static-boolean-haslocationavailability-intent-intent">https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-static-boolean-haslocationavailability-intent-intent</a><br/>
     *
     * @param param0 Intent instance
     * @return true if the intent contains a LocationAvailability, false otherwise
     */
    public static boolean hasLocationAvailability(android.content.Intent param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.LocationAvailability.hasLocationAvailability(param0)");
            return com.huawei.hms.location.LocationAvailability.hasLocationAvailability(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.LocationAvailability.hasLocationAvailability(param0)");
            return com.google.android.gms.location.LocationAvailability.hasLocationAvailability(param0);
        }
    }

    /**
     * org.xms.g.location.LocationAvailability.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.location.LocationAvailability.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted LocationAvailability object
     */
    public static org.xms.g.location.LocationAvailability dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.LocationAvailability) param0);
    }

    /**
     * org.xms.g.location.LocationAvailability.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
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
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.LocationAvailability;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.LocationAvailability;
        }
    }

    /**
     * org.xms.g.location.LocationAvailability.equals(java.lang.Object) Checks whether two instances are equal.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationAvailability.equals(java.lang.Object)
     * com.google.android.gms.location.LocationAvailability.equals(java.lang.Object): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-boolean-equals-object-o">https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-boolean-equals-object-o</a><br/>
     *
     * @param param0 the other instance
     * @return true if two instances are equal
     */
    public boolean equals(java.lang.Object param0) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).equals(param0)");
            return ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).equals(param0);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).equals(param0)");
            return ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).equals(param0);
        }
    }

    /**
     * org.xms.g.location.LocationAvailability.hashCode() Overrides the method of the java.lang.Object class to calculate hashCode of a object.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationAvailability.hashCode()
     * com.google.android.gms.location.LocationAvailability.hashCode(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-int-hashcode">https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-int-hashcode</a><br/>
     *
     * @return A hash code value
     */
    public final int hashCode() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).hashCode()");
            return ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).hashCode();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).hashCode()");
            return ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).hashCode();
        }
    }

    /**
     * org.xms.g.location.LocationAvailability.isLocationAvailable() Returns true if the device location is known and reasonably up to date within the hints requested by the active LocationRequests.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationAvailability.isLocationAvailable(): <a href="https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationavailability-0000001050746173-V5#EN-US_TOPIC_0000001050746173__section46791837113212">https://developer.huawei.com/consumer/en/doc/HMSCore-References-V5/locationavailability-0000001050746173-V5#EN-US_TOPIC_0000001050746173__section46791837113212</a><br/>
     * com.google.android.gms.location.LocationAvailability.isLocationAvailable(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-boolean-islocationavailable">https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-boolean-islocationavailable</a><br/>
     *
     * @return true if the device location is known and reasonably up to date within the hints requested by the active LocationRequests
     */
    public final boolean isLocationAvailable() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).isLocationAvailable()");
            return ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).isLocationAvailable();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).isLocationAvailable()");
            return ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).isLocationAvailable();
        }
    }

    /**
     * org.xms.g.location.LocationAvailability.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationAvailability.toString()
     * com.google.android.gms.location.LocationAvailability.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-string-tostring</a><br/>
     *
     * @return A character string after being converted
     */
    public final java.lang.String toString() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).toString()");
            return ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).toString();
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).toString()");
            return ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).toString();
        }
    }

    /**
     * org.xms.g.location.LocationAvailability.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.LocationAvailability.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.LocationAvailability.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-void-writetoparcel-parcel-parcel,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/LocationAvailability#public-void-writetoparcel-parcel-parcel,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.LocationAvailability) this.getHInstance()).writeToParcel(param0, param1)");
            ((com.huawei.hms.location.LocationAvailability) this.getHInstance()).writeToParcel(param0, param1);
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.LocationAvailability) this.getGInstance()).writeToParcel(param0, param1)");
            ((com.google.android.gms.location.LocationAvailability) this.getGInstance()).writeToParcel(param0, param1);
        }
    }
}