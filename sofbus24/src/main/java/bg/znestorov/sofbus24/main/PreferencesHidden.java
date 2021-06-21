package bg.znestorov.sofbus24.main;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import bg.znestorov.sofbus24.schedule.ScheduleCacheDeleteSettingsDialog;
import bg.znestorov.sofbus24.utils.LanguageChange;

public class PreferencesHidden extends FragmentActivity {

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