package bg.znestorov.sofbus24.main;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import com.actionbarsherlock.app.SherlockFragmentActivity;

import bg.znestorov.sofbus24.schedule.ScheduleCacheDeleteSettingsDialog;
import bg.znestorov.sofbus24.utils.LanguageChange;

public class PreferencesHidden extends SherlockFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LanguageChange.selectLocale(this);

        if (savedInstanceState == null) {
            DialogFragment dialogFragment = ScheduleCacheDeleteSettingsDialog
                    .newInstance();
            dialogFragment.show(getSupportFragmentManager(), "dialog");
        }
    }

}