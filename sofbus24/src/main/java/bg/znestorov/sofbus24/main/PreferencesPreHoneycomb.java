package bg.znestorov.sofbus24.main;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.google.android.gms.analytics.GoogleAnalytics;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.navigation.NavDrawerHomeScreenPreferences;
import bg.znestorov.sofbus24.preferences.ResetSettingsDialog;
import bg.znestorov.sofbus24.preferences.RestartApplicationDialog;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

@SuppressWarnings("deprecation")
public class PreferencesPreHoneycomb extends SherlockPreferenceActivity
        implements OnSharedPreferenceChangeListener {

    private Activity context;
    private GlobalEntity globalContext;
    private ActionBar actionBar;

    private PreferenceScreen preferencesScreen;
    private Preference numberOfDays;
    private Preference showCacheToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        addPreferencesFromResource(R.xml.preferences);

        // Get the application and current activity context
        context = PreferencesPreHoneycomb.this;
        globalContext = (GlobalEntity) getApplicationContext();
        preferencesScreen = getPreferenceScreen();

        initActionBar();
        initPreHoneycombPreferences();
        initScheduleCachePreferences();
    }

    @Override
    public void onResume() {
        super.onStop();
        getPreferenceScreen().getSharedPreferences()
                .registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        getPreferenceScreen().getSharedPreferences()
                .unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getSupportMenuInflater().inflate(R.menu.activity_preferences_actions,
                menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (globalContext.isHasToRestart()) {
                    restartApplication(false);
                } else {
                    finish();
                }

                return true;
            case R.id.action_pref_reset:
                resetPreferences();
                return true;
            case R.id.action_pref_info_details:
                Intent aboutIntent;
                if (globalContext.isPhoneDevice()) {
                    aboutIntent = new Intent(context, About.class);
                } else {
                    aboutIntent = new Intent(context, AboutDialog.class);
                }
                startActivity(aboutIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {
        if (globalContext.isHasToRestart()) {
            restartApplication(false);
        } else {
            finish();
        }
    }

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

        if (key.equals(Constants.PREFERENCE_KEY_GOOGLE_ANALYTICS)) {
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
     * Initialize the action bar
     */
    private void initActionBar() {
        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.pref_title));
    }

    /**
     * Remove some of the preferences category in case of tablets
     */
    private void initPreHoneycombPreferences() {

        // Remove the preferences category in case of pre honeycomb devices
        PreferenceCategory preferencesCategory = (PreferenceCategory) findPreference(Constants.PREFERENCE_KEY_APP_COMMON_CATEGORY);
        ListPreference listPreference = (ListPreference) findPreference(Constants.PREFERENCE_KEY_APP_THEME);
        preferencesCategory.removePreference(listPreference);

        // If the HomeScreen is not standard, do not show this option
        if (NavDrawerHomeScreenPreferences.getUserHomeScreenChoice(context) != 0) {
            switch (globalContext.getDeviceType()) {
                case PHONE:
                    listPreference = (ListPreference) findPreference(Constants.PREFERENCE_KEY_TABS_TYPE);
                    preferencesCategory.removePreference(listPreference);
                    break;
                case SMALL_TABLET:
                case LARGE_TABLET:
                    preferencesCategory = (PreferenceCategory) findPreference(Constants.PREFERENCE_KEY_APP_VISUAL_CATEGORY);
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
                    preferencesCategory = (PreferenceCategory) findPreference(Constants.PREFERENCE_KEY_APP_VISUAL_CATEGORY);
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

    /**
     * Restart the application after showing an AlertDialog
     *
     * @param isResetted indicates if the method is invoked in case of settings reset.
     *                   If so, and no restart is wanted at this point, leave at the
     *                   current screen and keep the information about application
     *                   restart
     */
    public void restartApplication(boolean isResetted) {
        RestartApplicationDialog.showRestartApplicationDialog(context,
                isResetted).show();
    }

    /**
     * Reset the preferences to default
     */
    private void resetPreferences() {
        ResetSettingsDialog.resetPreferences(context, this).show();
    }
}
