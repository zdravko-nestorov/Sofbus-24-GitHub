package bg.znestorov.sofbus24.gcm;

import android.app.Activity;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import org.json.JSONException;
import org.json.JSONObject;

import bg.znestorov.sofbus24.about.UpdateApplicationDialog;
import bg.znestorov.sofbus24.about.UpdateDatabaseDialog;
import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.entity.NotificationEntity;
import bg.znestorov.sofbus24.entity.NotificationTypeEnum;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.Utils;

public class GcmUtils {

    /**
     * Checks if any GCM notification was previously received. If so, inform the
     * user accordingly
     *
     * @param context         current Activity context
     * @param fragmentManager the fragment manager of the activity/fragment
     */
    public static void processGcmNotification(FragmentActivity context,
                                              FragmentManager fragmentManager) {

        NotificationEntity notification = GcmPreferences
                .getNotification(context);

        // Check if any notification is previously received
        if (notification.isValid()) {

            DialogFragment dialogFragment;
            NotificationTypeEnum notificationType = notification.getType();
            String notificationData = notification.getData();

            switch (notificationType) {
                case UPDATE_APP:

                    // Inform the user that a new version of Sofbus 24 is available
                    dialogFragment = UpdateApplicationDialog
                            .newInstance(String.format(
                                    context.getString(R.string.about_update_app_new),
                                    getGcmUpdateAppNotificationData(notificationData)));
                    dialogFragment.show(fragmentManager, "dialogFragment");

                    break;
                case UPDATE_DB:

                    // Create the updated configuration
                    ConfigEntity config = new ConfigEntity(context);
                    if (Utils.isInteger(notificationData)) {
                        config.setSofbus24DbVersion(Integer
                                .parseInt(notificationData));
                    }

                    // Inform the user that a new database is available
                    dialogFragment = UpdateDatabaseDialog.newInstance(config);
                    dialogFragment.show(fragmentManager, "dialogFragment");

                    break;
                case RATE_APP:

                    // Inform the user that he/she can rate the application if wants
                    dialogFragment = GcmRateDialog.newInstance();
                    dialogFragment.show(fragmentManager, "dialogFragment");

                    break;
                case INFO:

                    // Get the notification data in the correct language
                    notificationData = getGcmInfoNotificationData(context,
                            notificationData);

                    // If the notification data is correct, inform the user about
                    // the occurrence of an unforeseen situation
                    if (!Utils.isEmpty(notificationData)) {
                        dialogFragment = GcmInfoDialog
                                .newInstance(notificationData);
                        dialogFragment.show(fragmentManager, "dialogFragment");
                    }

                    break;
                default:
                    // Do nothing - may be the notification is incorrect
                    break;
            }

            // Clear the SharedPreferences file, after the notification is
            // processed (prevent from multiple messages)
            GcmPreferences.clearNotification(context);
        }
    }

    /**
     * Get the information notification data in the correct language
     *
     * @param context          current Activity context
     * @param notificationData the received notification data
     * @return the notification data in the correct language
     */
    private static String getGcmInfoNotificationData(Activity context,
                                                     String notificationData) {

        try {
            // Get the application language
            String language = LanguageChange.getUserLocale(context);

            // Format the notification data as a JSON object and get the value
            // in the correct language
            JSONObject notificationJson = new JSONObject(notificationData);
            notificationData = notificationJson.getString(language);
        } catch (JSONException e) {
            notificationData = "";
        }

        return notificationData;
    }

    /**
     * Get the update app notification data in the correct format
     *
     * @param notificationData the received notification data
     * @return the notification data in the correct format
     */
    private static String getGcmUpdateAppNotificationData(String notificationData) {

        if (!Utils.isEmpty(notificationData)) {
            notificationData = Utils.getValueBefore(notificationData, "(")
                    .trim();
        }

        return notificationData;
    }
}