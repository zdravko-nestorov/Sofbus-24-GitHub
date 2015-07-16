package bg.znestorov.sofbus24.about;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.utils.Constants;

/**
 * Class responsible for creating the configuration file
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class Configuration {

    /**
     * Creates a configuration file by copying the ready one in the assets
     *
     * @param context current Activity context
     */
    public static void createConfiguration(Activity context) {

        if (!isConfigurationExists(context)) {
            editConfiguration(context, new ConfigEntity());
        }
    }

    private static boolean isConfigurationExists(Activity context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.CONFIGURATION_PREF_NAME, Context.MODE_PRIVATE);

        boolean isFavouritesVisibleExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_FAVOURITES_VISIBILITY_KEY);
        boolean isFavouritesPositionExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_FAVOURITES_POSITION_KEY);
        boolean isSearchVisibleExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_SEARCH_VISIBILITY_KEY);
        boolean isSearchPositionExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_SEARCH_POSITION_KEY);
        boolean isScheduleVisibleExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_SCHEDULE_VISIBILITY_KEY);
        boolean isSchedulePositionExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_SCHEDULE_POSITION_KEY);
        boolean isMetroVisibleExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_METRO_VISIBILITY_KEY);
        boolean isMetroPositionExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_METRO_POSITION_KEY);
        boolean isSofbus24DbVersionExists = sharedPreferences
                .contains(Constants.CONFIGURATION_PREF_SOFBUS24_KEY);

        boolean isConfigurationCorrect = isFavouritesVisibleExists
                && isFavouritesPositionExists && isSearchVisibleExists
                && isSearchPositionExists && isScheduleVisibleExists
                && isSchedulePositionExists && isMetroVisibleExists
                && isMetroPositionExists && isSofbus24DbVersionExists;

        return isConfigurationCorrect;
    }

    /**
     * Edit the configuration file
     *
     * @param context   the current Activity context
     * @param newConfig the new Configuration object
     */
    public static void editConfiguration(Activity context,
                                         ConfigEntity newConfig) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.CONFIGURATION_PREF_NAME, Context.MODE_PRIVATE);

        Editor edit = sharedPreferences.edit();
        edit.clear();
        edit.putBoolean(Constants.CONFIGURATION_PREF_FAVOURITES_VISIBILITY_KEY,
                newConfig.isFavouritesVisibile());
        edit.putInt(Constants.CONFIGURATION_PREF_FAVOURITES_POSITION_KEY,
                newConfig.getFavouritesPosition());
        edit.putBoolean(Constants.CONFIGURATION_PREF_SEARCH_VISIBILITY_KEY,
                newConfig.isSearchVisibile());
        edit.putInt(Constants.CONFIGURATION_PREF_SEARCH_POSITION_KEY,
                newConfig.getSearchPosition());
        edit.putBoolean(Constants.CONFIGURATION_PREF_SCHEDULE_VISIBILITY_KEY,
                newConfig.isScheduleVisibile());
        edit.putInt(Constants.CONFIGURATION_PREF_SCHEDULE_POSITION_KEY,
                newConfig.getSchedulePosition());
        edit.putBoolean(Constants.CONFIGURATION_PREF_METRO_VISIBILITY_KEY,
                newConfig.isMetroVisibile());
        edit.putInt(Constants.CONFIGURATION_PREF_METRO_POSITION_KEY,
                newConfig.getMetroPosition());
        edit.putInt(Constants.CONFIGURATION_PREF_SOFBUS24_KEY,
                newConfig.getSofbus24DbVersion());
        edit.commit();
    }

    /**
     * Edit the configuration file (only for DBs)
     *
     * @param context   the current Activity context
     * @param newConfig the new Configuration object
     */
    public static void editDbConfigurationVersionField(Activity context,
                                                       ConfigEntity newConfig) {

        editDbConfigurationVersionField(context,
                newConfig.getSofbus24DbVersion());
    }

    /**
     * Edit the configuration file (only for DBs)
     *
     * @param context           the current Activity context
     * @param sofbus24DbVersion the new database version
     */
    public static void editDbConfigurationVersionField(Activity context,
                                                       int sofbus24DbVersion) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.CONFIGURATION_PREF_NAME, Context.MODE_PRIVATE);

        Editor edit = sharedPreferences.edit();
        edit.putString(Constants.CONFIGURATION_PREF_SOFBUS24_KEY,
                sofbus24DbVersion + "");
        edit.commit();
    }

    /**
     * Edit the configuration file (only for Sofbus24 start screen tabs)
     *
     * @param context   the current Activity context
     * @param newConfig the new Configuration object
     */
    public static void editTabConfigurationFileds(Activity context,
                                                  ConfigEntity newConfig) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.CONFIGURATION_PREF_NAME, Context.MODE_PRIVATE);

        Editor edit = sharedPreferences.edit();
        edit.putBoolean(Constants.CONFIGURATION_PREF_FAVOURITES_VISIBILITY_KEY,
                newConfig.isFavouritesVisibile());
        edit.putInt(Constants.CONFIGURATION_PREF_FAVOURITES_POSITION_KEY,
                newConfig.getFavouritesPosition());
        edit.putBoolean(Constants.CONFIGURATION_PREF_SEARCH_VISIBILITY_KEY,
                newConfig.isSearchVisibile());
        edit.putInt(Constants.CONFIGURATION_PREF_SEARCH_POSITION_KEY,
                newConfig.getSearchPosition());
        edit.putBoolean(Constants.CONFIGURATION_PREF_SCHEDULE_VISIBILITY_KEY,
                newConfig.isScheduleVisibile());
        edit.putInt(Constants.CONFIGURATION_PREF_SCHEDULE_POSITION_KEY,
                newConfig.getSchedulePosition());
        edit.putBoolean(Constants.CONFIGURATION_PREF_METRO_VISIBILITY_KEY,
                newConfig.isMetroVisibile());
        edit.putInt(Constants.CONFIGURATION_PREF_METRO_POSITION_KEY,
                newConfig.getMetroPosition());
        edit.commit();
    }

}