package bg.znestorov.sofbus24.updates.check;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import bg.znestorov.sofbus24.entity.UpdateTypeEnum;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Static class used to interact with the Check For Update preferences
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class CheckForUpdatesPreferences {

    /**
     * Get the last check date for updates
     *
     * @param context    the current Activity context
     * @param updateType the update type (what would be updated - APP or DB)
     * @return the last check date for updates
     */
    private static String getLastCheckDate(Activity context,
                                           UpdateTypeEnum updateType) {

        SharedPreferences applicationUpdate = context.getSharedPreferences(
                Constants.CHECK_FOR_UPDATES_PREFERENCES_NAME,
                Context.MODE_PRIVATE);
        String lastCheckDate = applicationUpdate.getString(
                getPreferencesFieldToUpdate(updateType), "");

        return lastCheckDate;
    }

    /**
     * Checks if the application has already checked for update for the current
     * day (this way we prevent multiple checkings in one day)
     *
     * @param context     current Activity context
     * @param currentDate the current date
     * @param updateType  the update type (what would be updated - APP or DB)
     * @return if the application has already checked for update
     */
    public static boolean isUpdateAlreadyChecked(Activity context,
                                                 String currentDate, UpdateTypeEnum updateType) {

        boolean isUpdateAlreadyChecked = false;

        String lastCheckDate = getLastCheckDate(context, updateType);
        if (lastCheckDate.equals(currentDate)) {
            isUpdateAlreadyChecked = true;
        }

        return isUpdateAlreadyChecked;
    }

    /**
     * Check if there is any information in the preference file for the last
     * check date
     *
     * @param context    the current activity context
     * @param updateType the update type (what would be updated - APP or DB)
     * @return if there is any check date in the preferences
     */
    private static boolean isLastCheckDateEmpty(Activity context,
                                                UpdateTypeEnum updateType) {

        SharedPreferences searchFieldsUpdate = context.getSharedPreferences(
                Constants.CHECK_FOR_UPDATES_PREFERENCES_NAME,
                Context.MODE_PRIVATE);
        String lastCheckDate = searchFieldsUpdate.getString(
                getPreferencesFieldToUpdate(updateType), "");

        return lastCheckDate == null || "".equals(lastCheckDate);
    }

    /**
     * Check if this is the first update or it is already delayed (in both cases
     * a new update is required)
     *
     * @param context     the current activity context
     * @param currentDate the current date
     * @param updateType  the update type (what would be updated - APP or DB)
     * @return if this is the first update or it is already delayed
     */
    public static boolean isFirstOrDelayedUpdate(Activity context,
                                                 String currentDate, UpdateTypeEnum updateType) {
        boolean isFirstOrDelayedUpdate = false;

        if (isLastCheckDateEmpty(context, updateType)) {
            isFirstOrDelayedUpdate = true;
        } else {
            if (Utils.getDateDifferenceInDays(
                    getLastCheckDate(context, updateType), currentDate) > getMaxDaysBetweenUpdates(updateType)) {
                isFirstOrDelayedUpdate = true;
            } else if (Utils.isDateInRange(
                    getLastCheckDate(context, updateType), currentDate,
                    updateType)) {
                isFirstOrDelayedUpdate = true;
            }
        }

        return isFirstOrDelayedUpdate;
    }

    /**
     * Change the the last check date for updates in the SharedPreferences file
     *
     * @param context       the current Activity context
     * @param lastCheckDate the last check date for updates
     * @param updateType    the update type (what would be updated - APP or DB)
     */
    public static void setLastCheckDate(Activity context, String lastCheckDate,
                                        UpdateTypeEnum updateType) {
        SharedPreferences applicationUpdate = context.getSharedPreferences(
                Constants.CHECK_FOR_UPDATES_PREFERENCES_NAME,
                Context.MODE_PRIVATE);

        Editor editor = applicationUpdate.edit();
        editor.putString(getPreferencesFieldToUpdate(updateType), lastCheckDate);
        editor.commit();
    }

    /**
     * Clear the last check date
     *
     * @param context    the current Activity context
     * @param updateType the update type (what would be updated - APP or DB)
     */
    public static void clearLastCheckDate(Activity context,
                                          UpdateTypeEnum updateType) {
        setLastCheckDate(context, "", updateType);
    }

    /**
     * Check which field in preferences to update
     *
     * @param updateType the update type (what would be updated - APP or DB)
     * @return the preferences field to update
     */
    private static String getPreferencesFieldToUpdate(UpdateTypeEnum updateType) {

        String preferencesField;
        switch (updateType) {
            case APP:
                preferencesField = Constants.CHECK_FOR_UPDATES_PREFERENCES_APP_LAST_CHECK;
                break;
            default:
                preferencesField = Constants.CHECK_FOR_UPDATES_PREFERENCES_DB_LAST_CHECK;
                break;
        }

        return preferencesField;
    }

    /**
     * Get the maximum days between updates when no check will be required
     *
     * @param updateType the update type (what would be updated - APP or DB)
     */
    private static int getMaxDaysBetweenUpdates(UpdateTypeEnum updateType) {

        int maxDays;
        switch (updateType) {
            case APP:
                maxDays = 30;
                break;
            default:
                maxDays = 14;
                break;
        }

        return maxDays;
    }
}