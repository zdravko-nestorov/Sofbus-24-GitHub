package bg.znestorov.sofbus24.preferences;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;

import com.google.android.gms.analytics.GoogleAnalytics;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.navigation.NavDrawerHomeScreenPreferences;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.HmsUtils;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Preferences fragment - containing the user settings
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("NewApi")
public class PreferencesFragment extends PreferenceFragment implements
        OnSharedPreferenceChangeListener {

    private Activity context;
    private GlobalEntity globalContext;

    private PreferenceScreen preferencesScreen;
    private Preference numberOfDays;
    private Preference showCacheToast;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LanguageChange.selectLocale(getActivity());

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);

        // Get the application and current activity context
        context = getActivity();
        globalContext = (GlobalEntity) context.getApplicationContext();
        preferencesScreen = getPreferenceScreen();

        initTabletVersionPreferences();
        initScheduleCachePreferences();

        // Registers a callback to be invoked when a change happens to a
        // preference
        preferencesScreen.getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        preferencesScreen.getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        preferencesScreen.getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
                                          String key) {

        if (key.equals(Constants.PREFERENCE_KEY_FAVOURITES_EXPANDED)) {
            globalContext.setFavouritesChanged(true);
        }

        if (key.equals(Constants.PREFERENCE_KEY_TABS_TYPE)) {
            globalContext.setHomeScreenChanged(true);
        }

        if (key.equals(Constants.PREFERENCE_KEY_APP_THEME)) {
            ActivityTracker.changedApplicationTheme(context,
                    ThemeChange.getAppTheme(context));
            globalContext.setHasToRestart(true);
        }

        if (key.equals(Constants.PREFERENCE_KEY_APP_LANGUAGE)) {
            globalContext.setHasToRestart(true);
        }

        if (key.equals(Constants.PREFERENCE_KEY_CACHE_STATE)) {
            actionsOnScheduleCachePreferences(sharedPreferences, false);
        }

        if (NavDrawerHomeScreenPreferences.getUserHomeScreenChoice(context) == 1
                && (key.equals(Constants.PREFERENCE_KEY_MARKER_TYPE)
                || key.equals(Constants.PREFERENCE_KEY_MARKER_OPTIONS)
                || key.equals(Constants.PREFERENCE_KEY_STATIONS_RADIUS) || key
                .equals(Constants.PREFERENCE_KEY_POSITION_FOCUS))) {
            globalContext.setHasToRestart(true);
        }

        if (HmsUtils.isGms()
                && key.equals(Constants.PREFERENCE_KEY_GOOGLE_ANALYTICS)) {
            GoogleAnalytics
                    .getInstance(globalContext)
                    .setAppOptOut(
                            !sharedPreferences
                                    .getBoolean(
                                            key,
                                            Constants.PREFERENCE_DEFAULT_VALUE_GOOGLE_ANALYTICS));
        }
    }

    /**
     * Remove some of the preferences category in case of tablets
     */
    private void initTabletVersionPreferences() {

        PreferenceCategory preferencesCategory = (PreferenceCategory) findPreference(Constants.PREFERENCE_KEY_APP_VISUAL_CATEGORY);

        // If the HomeScreen is not standard, do not show this option
        if (NavDrawerHomeScreenPreferences.getUserHomeScreenChoice(context) != 0) {
            switch (globalContext.getDeviceType()) {
                case PHONE:
                    ListPreference listPreference = (ListPreference) findPreference(Constants.PREFERENCE_KEY_TABS_TYPE);
                    preferencesCategory.removePreference(listPreference);
                    break;
                case SMALL_TABLET:
                case LARGE_TABLET:
                    preferencesScreen.removePreference(preferencesCategory);
                    break;
            }
        } else {
            switch (globalContext.getDeviceType()) {
                case PHONE:
                    // Do nothing
                    break;
                case SMALL_TABLET:
                    CheckBoxPreference checkBoxPreference = (CheckBoxPreference) findPreference(Constants.PREFERENCE_KEY_FAVOURITES_EXPANDED);
                    preferencesCategory.removePreference(checkBoxPreference);
                    break;
                case LARGE_TABLET:
                    preferencesScreen.removePreference(preferencesCategory);
                    break;
            }
        }
    }

    /**
     * Initialize the schedule cache preferences
     */
    private void initScheduleCachePreferences() {

        numberOfDays = preferencesScreen
                .findPreference(Constants.PREFERENCE_KEY_NUMBER_OF_DAYS);
        showCacheToast = preferencesScreen
                .findPreference(Constants.PREFERENCE_KEY_SHOW_CACHE_TOAST);

        // Check the state of each field on startup
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        actionsOnScheduleCachePreferences(sharedPreferences, true);
    }

    /**
     * Show or hide the schedule cache shared preferences
     *
     * @param sharedPreferences the default shared preferences
     * @param isCalledOnStartup indicates if the method is called on activity startup
     */
    private void actionsOnScheduleCachePreferences(
            SharedPreferences sharedPreferences, boolean isCalledOnStartup) {

        Boolean isScheduleCacheActive = sharedPreferences.getBoolean(
                Constants.PREFERENCE_KEY_CACHE_STATE,
                Constants.PREFERENCE_DEFAULT_VALUE_CACHE_STATE);

        if (isScheduleCacheActive) {
            numberOfDays.setEnabled(true);
            showCacheToast.setEnabled(true);
        } else {
            numberOfDays.setEnabled(false);
            showCacheToast.setEnabled(false);

            // Check if the user wants to remove all schedule cache data
            if (!isCalledOnStartup) {
                ActivityUtils.startPreferencesHiddenActivity(context);
            }
        }
    }
}
