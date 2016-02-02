package bg.znestorov.sofbus24.utils.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.Spanned;

import bg.znestorov.sofbus24.main.R;

/**
 * Class used to show the user an alert dialog, because no Google Play services
 * are installed on its device
 * <p/>
 * https://code.google.com/p/android/issues/detail?id=42543
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class GooglePlayServicesErrorDialog extends DialogFragment {

    private static final String BUNDLE_GOOGLE_PLAY_SERVICES_MESSAGE = "GOOGLE PLAY SERVICES MESSAGE";

    public static GooglePlayServicesErrorDialog newInstance(String message) {

        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_GOOGLE_PLAY_SERVICES_MESSAGE, message);

        GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = new GooglePlayServicesErrorDialog();
        googlePlayServicesErrorDialog.setArguments(bundle);

        return googlePlayServicesErrorDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Activity context = getActivity();
        String title = getString(R.string.app_google_play_title);
        Spanned message = Html.fromHtml(getArguments().getString(
                BUNDLE_GOOGLE_PLAY_SERVICES_MESSAGE));
        String negativeBtn = getString(R.string.app_button_later);
        String positiveBtn = getString(R.string.app_button_install);

        OnClickListener positiveOnClickListener = new OnClickListener() {
            @SuppressWarnings("deprecation")
            public void onClick(DialogInterface dialog, int i) {
                // Try the new HTTP method
                try {
                    Intent intent = new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.gms"));
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                    intent.setPackage("com.android.vending");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    // Try the market method
                    try {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("market://details?id=com.google.android.gms"));
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                        intent.setPackage("com.android.vending");
                        startActivity(intent);
                    } catch (ActivityNotFoundException f) {
                        // Show the website
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.gms"));
                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
                        startActivity(intent);
                    }
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, null)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }
}