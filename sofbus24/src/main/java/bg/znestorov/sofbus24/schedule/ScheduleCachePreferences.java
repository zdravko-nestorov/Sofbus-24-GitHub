package bg.znestorov.sofbus24.schedule;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import bg.znestorov.sofbus24.utils.Constants;

/**
 * Class responsible for interaction with the default shared preferences file
 * (interaction with the local schedule values)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ScheduleCachePreferences {

    /**
     * Check if the schedule cache is activated
     *
     * @param context the current activity context
     * @return if the schedule cache is activated
     */
    public static boolean isScheduleCacheActive(Activity context) {

        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);

        Boolean isScheduleCacheActive = sharedPreferences.getBoolean(
                Constants.PREFERENCE_KEY_CACHE_STATE,
                Constants.PREFERENCE_DEFAULT_VALUE_CACHE_STATE);

        return isScheduleCacheActive;
    }

    /**
     * Get the maximum number of days to keep files in the cache
     *
     * @param context the current activity context
     * @return the number of days
     */
    public static Integer getNumberOfDays(Activity context) {

        Integer numberOfDays;

        if (isScheduleCacheActive(context)) {
            SharedPreferences sharedPreferences = PreferenceManager
                    .getDefaultSharedPreferences(context);

            try {
                numberOfDays = Integer.valueOf(sharedPreferences.getString(
                        Constants.PREFERENCE_KEY_NUMBER_OF_DAYS,
                        Constants.PREFERENCE_DEFAULT_VALUE_NUMBER_OF_DAYS));
            } catch (Exception e) {
                numberOfDays = Integer
                        .valueOf(Constants.PREFERENCE_DEFAULT_VALUE_NUMBER_OF_DAYS);
            }
        } else {
            numberOfDays = -1;
        }

        return numberOfDays;
    }

    /**
     * Indicates if the schedule cache toast should be shown or not
     *
     * @param context the current activity context
     * @return if the schedule cache toast should be shown or not
     */
    public static boolean isScheduleCacheToastShown(Activity context) {

        Boolean isScheduleCacheToastShown;

        if (isScheduleCacheActive(context)) {
            SharedPreferences sharedPreferences = PreferenceManager
                    .getDefaultSharedPreferences(context);

            isScheduleCacheToastShown = sharedPreferences.getBoolean(
                    Constants.PREFERENCE_KEY_SHOW_CACHE_TOAST,
                    Constants.PREFERENCE_DEFAULT_VALUE_SHOW_CACHE_TOAST);
        } else {
            isScheduleCacheToastShown = false;
        }

        return isScheduleCacheToastShown;
    }

}