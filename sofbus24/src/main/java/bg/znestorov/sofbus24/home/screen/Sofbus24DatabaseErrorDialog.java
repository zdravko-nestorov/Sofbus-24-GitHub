package bg.znestorov.sofbus24.home.screen;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.Spanned;
import android.widget.Toast;

import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Dialog alerting the user that the application experienced an unexpected error
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class Sofbus24DatabaseErrorDialog extends DialogFragment {

    private Activity context;
    private Spanned message;
    private String negativeBtn;
    private String neutralBtn;
    private String positiveBtn;
    private OnClickListener negativeOnClickListener;
    private OnClickListener neutralOnClickListener;
    private OnClickListener positiveOnClickListener;
    private OnRecreateDatabaseListener onRecreateDatabaseListener;

    public static Sofbus24DatabaseErrorDialog newInstance() {
        return new Sofbus24DatabaseErrorDialog();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onRecreateDatabaseListener = (OnRecreateDatabaseListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnRecreateDatabaseListener interface...");
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        context = getActivity();
        message = Html.fromHtml(getString(R.string.app_database_error));
        negativeBtn = getString(R.string.app_button_restart);
        neutralBtn = getString(R.string.app_button_email);
        positiveBtn = getString(R.string.app_button_exit);

        negativeOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((OnRecreateDatabaseListener) onRecreateDatabaseListener)
                        .onRecreateDatabaseClicked();
            }
        };

        neutralOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                sendEmail();
                ActivityUtils.closeApplication(context);
            }
        };

        positiveOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ActivityUtils.closeApplication(context);
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(message)
                .setPositiveButton(positiveBtn, positiveOnClickListener)
                .setNeutralButton(neutralBtn, neutralOnClickListener)
                .setNegativeButton(negativeBtn, negativeOnClickListener);

        // Press back button not cancel dialog
        setCancelable(false);

        // To cancel outside touch
        AlertDialog alertDialog = builder.create();
        alertDialog.setCanceledOnTouchOutside(false);

        return alertDialog;
    }

    /**
     * Start an Intent, so send an email (this is the best (and easiest) way is
     * to use an Intent, because otherwise we'll have to write our own client).
     */
    private void sendEmail() {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setType("message/rfc822");
        emailIntent.putExtra(Intent.EXTRA_EMAIL,
                new String[]{"zdravko.nestorov@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,
                getString(R.string.app_send_email_subject));
        emailIntent.putExtra(Intent.EXTRA_TEXT,
                getString(R.string.app_send_email_body));

        try {
            startActivity(Intent.createChooser(emailIntent,
                    getString(R.string.app_send_email_chooser)));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(context,
                    getString(R.string.app_send_email_chooser_error),
                    Toast.LENGTH_LONG).show();
        }
    }

    public interface OnRecreateDatabaseListener {
        public void onRecreateDatabaseClicked();
    }
}