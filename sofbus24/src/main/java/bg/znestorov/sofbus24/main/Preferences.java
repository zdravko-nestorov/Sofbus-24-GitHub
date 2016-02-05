package bg.znestorov.sofbus24.main;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.preferences.PreferencesFragment;
import bg.znestorov.sofbus24.preferences.ResetSettingsDialog;
import bg.znestorov.sofbus24.preferences.ResetSettingsDialog.OnResetSettingsListener;
import bg.znestorov.sofbus24.preferences.RestartApplicationDialog;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;

public class Preferences extends FragmentActivity implements
        OnResetSettingsListener {

    private final PreferencesFragment preferencesFragment = new PreferencesFragment();
    private Activity context;
    private GlobalEntity globalContext;

    @Override
    @SuppressWarnings("deprecation")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);

        // Get the application and current activity context
        context = Preferences.this;
        globalContext = (GlobalEntity) getApplicationContext();

        // Set up the action bar
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.pref_title));

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .replace(android.R.id.content, preferencesFragment)
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.activity_preferences_actions, menu);

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

    /**
     * Restart the application after showing an AlertDialog
     *
     * @param isResetted indicates if the method is invoked in case of settings reset.
     *                   If so, and no restart is wanted at this point, leave at the
     *                   current screen and keep the information about application
     *                   restart
     */
    private void restartApplication(boolean isResetted) {
        DialogFragment dialogFragment = RestartApplicationDialog
                .newInstance(isResetted);
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }

    /**
     * Reset the preferences to default
     */
    private void resetPreferences() {
        DialogFragment dialogFragment = ResetSettingsDialog.newInstance();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }

    @Override
    public void onResetSettingsClicked() {
        restartApplication(true);
    }
}
