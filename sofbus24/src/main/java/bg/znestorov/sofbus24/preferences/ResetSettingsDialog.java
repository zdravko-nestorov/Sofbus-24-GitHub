package bg.znestorov.sofbus24.preferences;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.fragment.app.DialogFragment;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.main.PreferencesPreHoneycomb;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog alerting the user about preferences settings reset
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ResetSettingsDialog extends DialogFragment {

    private OnResetSettingsListener onResetSettingsListener;

    public static ResetSettingsDialog newInstance() {
        return new ResetSettingsDialog();
    }

    public static AlertDialog resetPreferences(final Activity context,
                                               final Object instance) {
        int icon = R.drawable.ic_menu_info_details;
        String title = context.getString(R.string.app_dialog_title_important);
        String message = context.getString(R.string.pref_reset);
        String negativeBtn = context.getString(R.string.app_button_no);
        String positiveBtn = context.getString(R.string.app_button_yes);

        OnClickListener positiveOnClickListener = new OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                SharedPreferences preferences = PreferenceManager
                        .getDefaultSharedPreferences(context);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.apply();

                // Check if the user wants to restart the application
                ((GlobalEntity) context.getApplicationContext())
                        .setHasToRestart(true);

                if (instance instanceof OnResetSettingsListener) {
                    ((OnResetSettingsListener) instance)
                            .onResetSettingsClicked();
                } else {
                    ((PreferencesPreHoneycomb) instance)
                            .restartApplication(true);
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, null)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onResetSettingsListener = (OnResetSettingsListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnResetSettingsListener interface...");
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return resetPreferences(getActivity(), onResetSettingsListener);
    }

    public interface OnResetSettingsListener {
        void onResetSettingsClicked();
    }
}