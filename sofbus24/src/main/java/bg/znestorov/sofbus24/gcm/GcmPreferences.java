package bg.znestorov.sofbus24.gcm;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.entity.NotificationEntity;
import bg.znestorov.sofbus24.entity.NotificationTypeEnum;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Responsible for the iteractions with the SharedPreference file, containing an
 * information about the Google Cloud Messaging services
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class GcmPreferences {

    /**
     * Get the GCM registration id from the SharedPreferences file (the id is
     * connected with the application version, so needs additional checks in
     * case of a new version deployed on GooglePlayStore)
     *
     * @param context the current context
     * @return the registration id from the SharedPreferences file
     */
    public static String getReistrationId(Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.GCM_PREFERENCES_NAME, Context.MODE_PRIVATE);

        String registrationId = sharedPreferences.getString(
                Constants.GCM_PREFERENCES_REG_ID, "");
        if (Utils.isEmpty(registrationId)) {
            return "";
        }

        int registeredVersion = sharedPreferences.getInt(
                Constants.GCM_PREFERENCES_APP_VERSION, Integer.MIN_VALUE);
        int currentVersion = getAppVersion(context);
        if (registeredVersion != currentVersion) {
            return "";
        }

        return registrationId;
    }

    /**
     * Store the GCM registration id and the application version in a
     * SharedPreference file (the registration id is dependant from the
     * application version and each time a new version of the app is deployed in
     * the GooglePlay store, a new registration of the app is needed)
     *
     * @param context the current context
     * @param regId   the registration id received from GCM service
     */
    public static void storeRegistrationId(Context context, String regId) {

        SharedPreferences prefs = context.getSharedPreferences(
                Constants.GCM_PREFERENCES_NAME, Context.MODE_PRIVATE);
        int appVersion = getAppVersion(context);

        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(Constants.GCM_PREFERENCES_REG_ID, regId);
        editor.putInt(Constants.GCM_PREFERENCES_APP_VERSION, appVersion);
        editor.commit();
    }

    /**
     * Get the application version code (in case of a problem, set '0' as a
     * version code)
     *
     * @param context the current context
     * @return the version code of the application
     */
    private static int getAppVersion(Context context) {

        int versionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager()
                    .getPackageInfo(context.getPackageName(), 0);
            versionCode = packageInfo.versionCode;
        } catch (NameNotFoundException e) {
            versionCode = 0;
        }

        return versionCode;
    }

    /**
     * Get the last received push notification in the SharedPreference file. The
     * data in the file will be changed only if a period of 3 days is passed
     * before the last saved notification
     *
     * @param context the current context
     * @return the notification saved in the SharedPreferences file
     */
    public static NotificationEntity getNotification(Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.GCM_PREFERENCES_NAME, Context.MODE_PRIVATE);
        NotificationEntity notification = new NotificationEntity(
                sharedPreferences);

        return notification;
    }

    /**
     * Store the date and type of the received notification, if satisfies the
     * conditions - if 3 days past since the last notification, change the date
     * in the SharedPreferences file and set the notification type accordingly.
     * Otherwise, do not edit the file
     *
     * @param context          the current context
     * @param notificationDate the received notification
     */
    public static void storeNotification(Context context,
                                         NotificationEntity notification) {

        SharedPreferences prefs = context.getSharedPreferences(
                Constants.GCM_PREFERENCES_NAME, Context.MODE_PRIVATE);

        // Get the notification saved into the SharedPreferences file
        NotificationEntity prefsNotification = getNotification(context);
        String prefsNotificationDate = prefsNotification.getDate();

        // Check if there is any saved date in the SharedPreferences file
        if (!Utils.isEmpty(prefsNotificationDate)) {

            // Check the elapsed days since the last received notification. If
            // "GCM_MAX_DAYS_BETWEEN_NOTIFICATIONS" aren't passed - do not save
            // anything
            int daysDifference = Math.abs(Utils.getDateDifferenceInDays(
                    prefsNotificationDate, Utils.getCurrentDate()));
            if (daysDifference < Constants.GCM_MAX_DAYS_BETWEEN_NOTIFICATIONS) {
                return;
            }
        }

        // Get the values of the received notification
        String notificationDate = notification.getDate();
        NotificationTypeEnum notificationType = notification.getType();
        String notificationData = notification.getData();

        // Get the current app configuration
        ConfigEntity currentConfig = new ConfigEntity(context);

        // According to the type of the notification, check if we should proceed
        // with informing the user or the notification is incorrect
        switch (notificationType) {
            case UPDATE_APP:

                String appVersion = Utils.getValueBetween(notificationData, "(",
                        ")");

                // If the type of the notification is UPDATE_APP and the current
                // application version is the same or higher than the one from the
                // notification - do not save anything in the SharedPreferences file
                if (!Utils.isInteger(appVersion)
                        || currentConfig.getVersionCode() >= Integer
                        .parseInt(appVersion)) {
                    return;
                }

                break;
            case UPDATE_DB:

                // If the type of the notification is UPDATE_DB and the current
                // dabatase version is the same or higher than the one from the
                // notification - do not save anything in the SharedPreferences file
                if (!Utils.isInteger(notificationData)
                        || currentConfig.getSofbus24DbVersion() >= Integer
                        .parseInt(notificationData)) {
                    return;
                }

                break;
            case RATE_APP:

                // If the type of the notification is RATE_APP and the user already
                // rated it - do not save anything in the SharedPreferences file
                if (isRated(context)) {
                    return;
                }

                break;
            default:
                // Do nothing - just inform the user with the correct message
                break;
        }

        // Save the values in the SharedPreferences file
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(Constants.GCM_PREFERENCES_NOTIFICATION_DATE,
                notificationDate);
        editor.putString(Constants.GCM_PREFERENCES_NOTIFICATION_TYPE,
                notificationType.toString());
        editor.putString(Constants.GCM_PREFERENCES_NOTIFICATION_DATA,
                notificationData);
        editor.commit();
    }

    /**
     * Once the notification is processed, than remove the notification data
     * from the SharedPreferences file
     *
     * @param context the current context
     */
    public static void clearNotification(Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.GCM_PREFERENCES_NAME, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(Constants.GCM_PREFERENCES_NOTIFICATION_TYPE);
        editor.remove(Constants.GCM_PREFERENCES_NOTIFICATION_DATA);
        editor.commit();
    }

    /**
     * Check if the user already rated the application or not
     *
     * @param context the current context
     * @return the isRated param from the SharedPreferences file (if the user
     * already rated the application)
     */
    public static Boolean isRated(Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.GCM_PREFERENCES_NAME, Context.MODE_PRIVATE);
        Boolean isRated = sharedPreferences.getBoolean(
                Constants.GCM_PREFERENCES_IS_RATED, false);

        return isRated;
    }

    /**
     * Store the user's choice when a rate dialog appears. If the user choose
     * LATER - false will be saved, NO THANKS or RATE IT - true will be saved
     *
     * @param context the current context
     * @param isRated indicates the user's choice
     */
    public static void storeRated(Context context, Boolean isRated) {

        SharedPreferences prefs = context.getSharedPreferences(
                Constants.GCM_PREFERENCES_NAME, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(Constants.GCM_PREFERENCES_IS_RATED, isRated);
        editor.commit();
    }

}