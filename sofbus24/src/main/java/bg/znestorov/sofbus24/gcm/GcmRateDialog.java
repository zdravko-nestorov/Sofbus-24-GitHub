package bg.znestorov.sofbus24.gcm;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import bg.znestorov.sofbus24.main.R;

/**
 * Dialog that notify the user that he/she can rate the application if wants
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class GcmRateDialog extends DialogFragment {

    private Activity context;
    private String title;
    private String message;
    private String negativeBtn;
    private String positiveBtn;
    private String neutralBtn;
    private OnClickListener negativeOnClickListener;
    private OnClickListener positiveOnClickListener;
    private OnClickListener neutralOnClickListener;

    public static GcmRateDialog newInstance() {
        return new GcmRateDialog();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        context = getActivity();
        title = getString(R.string.app_dialog_title_rate);
        message = getString(R.string.gcm_dialog_message_rate);
        negativeBtn = getString(R.string.app_button_no_thanks);
        positiveBtn = getString(R.string.app_button_rate);
        neutralBtn = getString(R.string.app_button_remind_later);

        negativeOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                GcmPreferences.storeRated(context, true);
            }
        };

        positiveOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                GcmPreferences.storeRated(context, true);

                Intent intent;
                String appPackageName = context.getPackageName();
                try {
                    intent = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id=" + appPackageName));
                } catch (android.content.ActivityNotFoundException anfe) {
                    intent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id="
                                    + appPackageName));
                }

                context.startActivity(intent);
            }
        };

        neutralOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                GcmPreferences.storeRated(context, false);
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, negativeOnClickListener)
                .setPositiveButton(positiveBtn, positiveOnClickListener)
                .setNeutralButton(neutralBtn, neutralOnClickListener);

        return builder.create();
    }
}