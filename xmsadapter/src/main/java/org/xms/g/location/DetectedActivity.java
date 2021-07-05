package org.xms.g.location;

/**
 * The detected activity of the device with an an associated confidence. See ActivityRecognitionApi for details on how to obtain a DetectedActivity.<br/>
 * Combination of com.huawei.hms.location.ActivityIdentificationData and com.google.android.gms.location.DetectedActivity.<br/>
 * com.huawei.hms.location.ActivityIdentificationData: Identified activity type.<br/>
 * com.google.android.gms.location.DetectedActivity: The detected activity of the device with an an associated confidence. See ActivityRecognitionApi for details on how to obtain a DetectedActivity.<br/>
 */
public class DetectedActivity extends org.xms.g.utils.XObject implements android.os.Parcelable {
    /**
     * android.os.Parcelable.Creator.CREATOR a public CREATOR field that generates instances of your Parcelable class from a Parcel.<br/>
     * <p>
     * com.huawei.hms.location.ActivityIdentificationData.CREATOR: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityidentificationdata-0000001050706134-V5">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References-V5/activityidentificationdata-0000001050706134-V5</a><br/>
     * com.google.android.gms.location.DetectedActivity.CREATOR: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-creatordetectedactivity-creator">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-creatordetectedactivity-creator</a><br/>
     */
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public org.xms.g.location.DetectedActivity createFromParcel(android.os.Parcel param0) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                com.huawei.hms.location.ActivityIdentificationData hReturn = com.huawei.hms.location.ActivityIdentificationData.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(null, hReturn));
            } else {
                com.google.android.gms.location.DetectedActivity gReturn = com.google.android.gms.location.DetectedActivity.CREATOR.createFromParcel(param0);
                return new org.xms.g.location.DetectedActivity(new org.xms.g.utils.XBox(gReturn, null));
            }
        }

        public org.xms.g.location.DetectedActivity[] newArray(int param0) {
            return new org.xms.g.location.DetectedActivity[param0];
        }
    };
    private boolean wrapper = true;

    /**
     * org.xms.g.location.DetectedActivity.DetectedActivity(org.xms.g.utils.XBox) constructor of DetectedActivity with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public DetectedActivity(org.xms.g.utils.XBox param0) {
        super(param0);
        wrapper = true;
    }

    /**
     * org.xms.g.location.DetectedActivity.DetectedActivity(int,int) Constructs a DetectedActivity.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.ActivityIdentificationData(int,int): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section483016191826">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section483016191826</a><br/>
     * com.google.android.gms.location.DetectedActivity.DetectedActivity(int,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-detectedactivity-int-activitytype,-int-confidence">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-detectedactivity-int-activitytype,-int-confidence</a><br/>
     *
     * @param param0 The activity that was detected
     * @param param1 Value from 0 to 100 indicating how likely it is that the user is performing this activity
     * @throws org.xms.g.common.api.ApiException throws ApiException when using hms constructor
     */
    public DetectedActivity(int param0, int param1) throws org.xms.g.common.api.ApiException {
        super(((org.xms.g.utils.XBox) null));
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            try {
                this.setHInstance(new HImpl(param0, param1));
            } catch (com.huawei.hms.common.ApiException exception) {
                throw new org.xms.g.common.api.ApiException(new org.xms.g.utils.XBox(null, exception));
            }
        } else {
            this.setGInstance(new GImpl(param0, param1));
        }
        wrapper = false;
    }

    /**
     * org.xms.g.location.DetectedActivity.getIN_VEHICLE() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.VEHICLE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section920118334120">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section920118334120</a><br/>
     * com.google.android.gms.location.DetectedActivity.IN_VEHICLE: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-in_vehicle">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-in_vehicle</a><br/>
     *
     * @return The constant value.device is in a vehicle, such as a car
     */
    public static int getIN_VEHICLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.VEHICLE");
            return com.huawei.hms.location.ActivityIdentificationData.VEHICLE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.IN_VEHICLE");
            return com.google.android.gms.location.DetectedActivity.IN_VEHICLE;
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.getON_BICYCLE() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.BIKE: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section150818206412">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section150818206412</a><br/>
     * com.google.android.gms.location.DetectedActivity.ON_BICYCLE: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-on_bicycle">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-on_bicycle</a><br/>
     *
     * @return The constant value.The device is on a bicycle
     */
    public static int getON_BICYCLE() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.BIKE");
            return com.huawei.hms.location.ActivityIdentificationData.BIKE;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.ON_BICYCLE");
            return com.google.android.gms.location.DetectedActivity.ON_BICYCLE;
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.getON_FOOT() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.FOOT: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section5817139114111">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section5817139114111</a><br/>
     * com.google.android.gms.location.DetectedActivity.ON_FOOT: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-on_foot">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-on_foot</a><br/>
     *
     * @return The constant value.The device is on a user who is walking or running
     */
    public static int getON_FOOT() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.FOOT");
            return com.huawei.hms.location.ActivityIdentificationData.FOOT;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.ON_FOOT");
            return com.google.android.gms.location.DetectedActivity.ON_FOOT;
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.getRUNNING() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.RUNNING: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section141409458439">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section141409458439</a><br/>
     * com.google.android.gms.location.DetectedActivity.RUNNING: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-running">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-running</a><br/>
     *
     * @return The constant value.The device is on a user who is running. This is a sub-activity of ON_FOOT
     */
    public static int getRUNNING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.RUNNING");
            return com.huawei.hms.location.ActivityIdentificationData.RUNNING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.RUNNING");
            return com.google.android.gms.location.DetectedActivity.RUNNING;
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.getSTILL() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.STILL: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section7209416174213">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section7209416174213</a><br/>
     * com.google.android.gms.location.DetectedActivity.STILL: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-still">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-still</a><br/>
     *
     * @return The constant value.The device is still (not moving)
     */
    public static int getSTILL() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.STILL");
            return com.huawei.hms.location.ActivityIdentificationData.STILL;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.STILL");
            return com.google.android.gms.location.DetectedActivity.STILL;
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.getTILTING() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.location.DetectedActivity.TILTING: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-tilting">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-tilting</a><br/>
     *
     * @return The constant value.The device angle relative to gravity changed significantly
     */
    public static int getTILTING() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.location.DetectedActivity.getUNKNOWN() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.OTHERS: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section42028371426">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section42028371426</a><br/>
     * com.google.android.gms.location.DetectedActivity.UNKNOWN: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-unknown">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-unknown</a><br/>
     *
     * @return The constant value.Unable to detect the current activity
     */
    public static int getUNKNOWN() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.OTHERS");
            return com.huawei.hms.location.ActivityIdentificationData.OTHERS;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.UNKNOWN");
            return com.google.android.gms.location.DetectedActivity.UNKNOWN;
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.getWALKING() Return the constant value.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.WALKING: <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section8832102418431">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section8832102418431</a><br/>
     * com.google.android.gms.location.DetectedActivity.WALKING: <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-walking">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-static-final-int-walking</a><br/>
     *
     * @return The constant value.The device is on a user who is walking
     */
    public static int getWALKING() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.location.ActivityIdentificationData.WALKING");
            return com.huawei.hms.location.ActivityIdentificationData.WALKING;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.location.DetectedActivity.WALKING");
            return com.google.android.gms.location.DetectedActivity.WALKING;
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.dynamicCast(java.lang.Object) Dynamic cast the input object to org.xms.g.location.DetectedActivity.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return Casted DetectedActivity object
     */
    public static org.xms.g.location.DetectedActivity dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.location.DetectedActivity) param0);
    }

    /**
     * org.xms.g.location.DetectedActivity.isInstance(java.lang.Object) Judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 The input object
     * @return True if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.location.ActivityIdentificationData;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.location.DetectedActivity;
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.getConfidence() Returns a value from 0 to 100 indicating the likelihood that the user is performing this activity.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.getPossibility(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section9254532817">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section9254532817</a><br/>
     * com.google.android.gms.location.DetectedActivity.getConfidence(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-int-getconfidence">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-int-getconfidence</a><br/>
     *
     * @return A value from 0 to 100 indicating the likelihood that the user is performing this activity
     */
    public int getConfidence() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).getPossibility()");
                return ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).getPossibility();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.DetectedActivity) this.getGInstance()).getConfidence()");
                return ((com.google.android.gms.location.DetectedActivity) this.getGInstance()).getConfidence();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).getPossibilityCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).getPossibilityCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).getConfidenceCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).getConfidenceCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.getType() Returns the type of activity that was detected.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.getIdentificationActivity(): <a href="https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section63878407100">https://developer.huawei.com/consumer/en/doc/development/HMSCore-References/activityidentificationdata-0000001050706134#EN-US_TOPIC_0000001050706134__section63878407100</a><br/>
     * com.google.android.gms.location.DetectedActivity.getType(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-int-gettype">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-int-gettype</a><br/>
     *
     * @return Activity type
     */
    public int getType() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).getIdentificationActivity()");
                return ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).getIdentificationActivity();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.DetectedActivity) this.getGInstance()).getType()");
                return ((com.google.android.gms.location.DetectedActivity) this.getGInstance()).getType();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).getIdentificationActivityCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).getIdentificationActivityCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).getTypeCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).getTypeCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.toString() Overrides the method of the java.lang.Object class to convert a value into a character string.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.toString()
     * com.google.android.gms.location.DetectedActivity.toString(): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-string-tostring">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-string-tostring</a><br/>
     *
     * @return A character string after being converted
     */
    public java.lang.String toString() {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).toString()");
                return ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).toString();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.DetectedActivity) this.getGInstance()).toString()");
                return ((com.google.android.gms.location.DetectedActivity) this.getGInstance()).toString();
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).toStringCallSuper()");
                return ((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).toStringCallSuper();
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).toStringCallSuper()");
                return ((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).toStringCallSuper();
            }
        }
    }

    /**
     * org.xms.g.location.DetectedActivity.writeToParcel(android.os.Parcel,int) Used in serialization and deserialization.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.location.ActivityIdentificationData.writeToParcel(android.os.Parcel,int)
     * com.google.android.gms.location.DetectedActivity.writeToParcel(android.os.Parcel,int): <a href="https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-void-writetoparcel-parcel-out,-int-flags">https://developers.google.com/android/reference/com/google/android/gms/location/DetectedActivity#public-void-writetoparcel-parcel-out,-int-flags</a><br/>
     *
     * @param param0 Parcel to which this object is written
     * @param param1 Writing mode
     */
    public void writeToParcel(android.os.Parcel param0, int param1) {
        if (wrapper) {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).writeToParcel(param0, param1)");
                ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance()).writeToParcel(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((com.google.android.gms.location.DetectedActivity) this.getGInstance()).writeToParcel(param0, param1)");
                ((com.google.android.gms.location.DetectedActivity) this.getGInstance()).writeToParcel(param0, param1);
            }
        } else {
            if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).writeToParcelCallSuper(param0, param1)");
                ((HImpl) ((com.huawei.hms.location.ActivityIdentificationData) this.getHInstance())).writeToParcelCallSuper(param0, param1);
            } else {
                org.xms.g.utils.XmsLog.d("XMSRouter", "((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).writeToParcelCallSuper(param0, param1)");
                ((GImpl) ((com.google.android.gms.location.DetectedActivity) this.getGInstance())).writeToParcelCallSuper(param0, param1);
            }
        }
    }

    /**
     * XMS does not provide this api.<br/>
     */
    public int describeContents() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    private class GImpl extends com.google.android.gms.location.DetectedActivity {

        public GImpl(int param0, int param1) {
            super(param0, param1);
        }

        public int getConfidence() {
            return org.xms.g.location.DetectedActivity.this.getConfidence();
        }

        public int getType() {
            return org.xms.g.location.DetectedActivity.this.getType();
        }

        public java.lang.String toString() {
            return org.xms.g.location.DetectedActivity.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.DetectedActivity.this.writeToParcel(param0, param1);
        }

        public int getConfidenceCallSuper() {
            return super.getConfidence();
        }

        public int getTypeCallSuper() {
            return super.getType();
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }

    private class HImpl extends com.huawei.hms.location.ActivityIdentificationData {

        public HImpl(int param0, int param1) throws com.huawei.hms.common.ApiException {
            super(param0, param1);
        }

        public int getPossibility() {
            return org.xms.g.location.DetectedActivity.this.getConfidence();
        }

        public int getIdentificationActivity() {
            return org.xms.g.location.DetectedActivity.this.getType();
        }

        public java.lang.String toString() {
            return org.xms.g.location.DetectedActivity.this.toString();
        }

        public void writeToParcel(android.os.Parcel param0, int param1) {
            org.xms.g.location.DetectedActivity.this.writeToParcel(param0, param1);
        }

        public int getPossibilityCallSuper() {
            return super.getPossibility();
        }

        public int getIdentificationActivityCallSuper() {
            return super.getIdentificationActivity();
        }

        public java.lang.String toStringCallSuper() {
            return super.toString();
        }

        public void writeToParcelCallSuper(android.os.Parcel param0, int param1) {
            super.writeToParcel(param0, param1);
        }
    }
}