package bg.znestorov.sofbus24.schedule;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import bg.znestorov.sofbus24.databases.ScheduleDatabaseUtils;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog alerting the user that the schedule cache will be deleted (it is used
 * by the PreferencesFragment - it should not be v4, as it is not supported by
 * the new implementation of Android 3.0+)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ScheduleCacheDeleteSettingsDialog extends DialogFragment {

    private Activity context;

    public static ScheduleCacheDeleteSettingsDialog newInstance() {
        return new ScheduleCacheDeleteSettingsDialog();
    }

    @Override
    @SuppressLint("StaticFieldLeak")
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        context = getActivity();
        int icon = R.drawable.ic_menu_delete;
        String title = getString(R.string.app_dialog_title_important);
        String negativeBtn = getString(R.string.app_button_no);
        String positiveBtn = getString(R.string.app_button_yes);
        Spanned message = Html
                .fromHtml(getString(R.string.pt_menu_clear_all_schedule_cache_settings));

        OnClickListener negativeOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                context.finish();
            }
        };

        OnClickListener positiveOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                // Run the schedule cache clean in a separate thread in case the
                // amount of data is too big
                new AsyncTask<Void, Void, Void>() {

                    @Override
                    protected Void doInBackground(Void... params) {
                        ScheduleDatabaseUtils.deleteAllScheduleCache(context);

                        return null;
                    }

                }.execute();

                Spanned deleteMessage = Html
                        .fromHtml(getString(R.string.pt_menu_clear_all_schedule_cache_toast));
                Toast.makeText(context, deleteMessage, Toast.LENGTH_LONG)
                        .show();

                context.finish();
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, negativeOnClickListener)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        // Disable the outside dismiss
        AlertDialog alertDialog = builder.create();
        setCancelable(false);
        alertDialog.setCanceledOnTouchOutside(false);

        return alertDialog;
    }
}