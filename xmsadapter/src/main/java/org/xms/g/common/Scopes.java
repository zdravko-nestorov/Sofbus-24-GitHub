package org.xms.g.common;

/**
 * OAuth 2.0 scopes for use with services. See the specific client methods for details on which scopes are required.<br/>
 * HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.common.Scopes: OAuth 2.0 scopes for use with Google Play services. See the specific client methods for details on which scopes are required.<br/>
 */
public final class Scopes extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.common.Scopes.Scopes(org.xms.g.utils.XBox) constructor of Scopes with XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public Scopes(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.common.Scopes.getAPP_STATE() return the value of APP_STATE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.APP_STATE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-app_state">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-app_state</a><br/>
     *
     * @return Constant Value.Scope for using the App State service
     */
    public static java.lang.String getAPP_STATE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getCLOUD_SAVE() return the value of CLOUD_SAVE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.CLOUD_SAVE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-cloud_save">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-cloud_save</a><br/>
     *
     * @return Constant Value.Scope for using the CloudSave service
     */
    public static java.lang.String getCLOUD_SAVE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getDRIVE_APPFOLDER() return the value of DRIVE_APPFOLDER.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.DRIVE_APPFOLDER: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-drive_appfolder">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-drive_appfolder</a><br/>
     *
     * @return Constant Value.Scope for accessing appfolder files from Google Drive
     */
    public static java.lang.String getDRIVE_APPFOLDER() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getDRIVE_FILE() return the value of DRIVE_FILE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.DRIVE_FILE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-drive_file">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-drive_file</a><br/>
     *
     * @return Constant Value.Scope for access user-authorized files from Google Drive
     */
    public static java.lang.String getDRIVE_FILE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getEMAIL() return the value of EMAIL.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.EMAIL: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-email">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-email</a><br/>
     *
     * @return Constant Value.OAuth 2.0 scope for accessing user's Google account email address
     */
    public static java.lang.String getEMAIL() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getFITNESS_ACTIVITY_READ() return the value of FITNESS_ACTIVITY_READ.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_activity_read">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_activity_read</a><br/>
     *
     * @return Constant Value.Scope for read access to activity-related data types in Google Fit. These include activity type, calories consumed and expended, step counts, and others
     */
    public static java.lang.String getFITNESS_ACTIVITY_READ() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getFITNESS_ACTIVITY_READ_WRITE() return the value of FITNESS_ACTIVITY_READ_WRITE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.FITNESS_ACTIVITY_READ_WRITE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_activity_read_write">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_activity_read_write</a><br/>
     *
     * @return Constant Value.Scope for read/write access to activity-related data types in Google Fit. These include activity type, calories consumed and expended, step counts, and others
     */
    public static java.lang.String getFITNESS_ACTIVITY_READ_WRITE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getFITNESS_BODY_READ() return the value of FITNESS_BODY_READ.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.FITNESS_BODY_READ: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_body_read">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_body_read</a><br/>
     *
     * @return Constant Value.Scope for read access to biometric data types in Google Fit. These include heart rate, height, and weight
     */
    public static java.lang.String getFITNESS_BODY_READ() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getFITNESS_BODY_READ_WRITE() return the value of FITNESS_BODY_READ_WRITE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.FITNESS_BODY_READ_WRITE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_body_read_write">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_body_read_write</a><br/>
     *
     * @return Constant Value.Scope for read/write access to biometric data types in Google Fit. These include heart rate, height, and weight
     */
    public static java.lang.String getFITNESS_BODY_READ_WRITE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getFITNESS_LOCATION_READ() return the value of FITNESS_LOCATION_READ.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_location_read">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_location_read</a><br/>
     *
     * @return Constant Value.Scope for read access to location-related data types in Google Fit. These include location, distance, and speed
     */
    public static java.lang.String getFITNESS_LOCATION_READ() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getFITNESS_LOCATION_READ_WRITE() return the value of FITNESS_LOCATION_READ_WRITE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.FITNESS_LOCATION_READ_WRITE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_location_read_write">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_location_read_write</a><br/>
     *
     * @return Constant Value.Scope for read/write access to location-related data types in Google Fit. These include location, distance, and speed
     */
    public static java.lang.String getFITNESS_LOCATION_READ_WRITE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getFITNESS_NUTRITION_READ() return the value of FITNESS_NUTRITION_READ.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_nutrition_read">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_nutrition_read</a><br/>
     *
     * @return Constant Value.Scope for read access to nutrition data types in Google Fit
     */
    public static java.lang.String getFITNESS_NUTRITION_READ() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getFITNESS_NUTRITION_READ_WRITE() return the value of FITNESS_NUTRITION_READ_WRITE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.FITNESS_NUTRITION_READ_WRITE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_nutrition_read_write">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-fitness_nutrition_read_write</a><br/>
     *
     * @return Constant Value.Scope for read/write access to nutrition data types in Google Fit
     */
    public static java.lang.String getFITNESS_NUTRITION_READ_WRITE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getGAMES() return the value of GAMES.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.GAMES: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-games">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-games</a><br/>
     *
     * @return Constant Value.Scope for accessing data from Google Play Games
     */
    public static java.lang.String getGAMES() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getPLUS_LOGIN() return the value of PLUS_LOGIN.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.PLUS_LOGIN: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-plus_login">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-plus_login</a><br/>
     *
     * @return Constant Value.If you really need user's age range and locale information (which is the only additional information you can get from PLUS_LOGIN as of September 2016)
     */
    public static java.lang.String getPLUS_LOGIN() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getPLUS_ME() return the value of PLUS_ME.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.PLUS_ME: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-plus_me">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-plus_me</a><br/>
     *
     * @return Constant Value,This scope was previously named PLUS_PROFILE
     */
    public static java.lang.String getPLUS_ME() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.getPROFILE() return the value of PROFILE.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.google.android.gms.common.Scopes.PROFILE: <a href="https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-profile">https://developers.google.com/android/reference/com/google/android/gms/common/Scopes#public-static-final-string-profile</a><br/>
     *
     * @return Constant Value.OAuth 2.0 scope for viewing a user's basic profile information
     */
    public static java.lang.String getPROFILE() {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.dynamicCast(java.lang.Object) dynamic cast the input object to org.xms.g.common.Scopes.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return casted Scopes object
     */
    public static org.xms.g.common.Scopes dynamicCast(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }

    /**
     * org.xms.g.common.Scopes.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return true if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        throw new java.lang.RuntimeException("Not Supported");
    }
}