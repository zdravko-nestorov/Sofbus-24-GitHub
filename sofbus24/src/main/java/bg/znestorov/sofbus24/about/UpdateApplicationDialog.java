package bg.znestorov.sofbus24.about;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;

import androidx.fragment.app.DialogFragment;

import bg.znestorov.sofbus24.main.R;

/**
 * Dialog informing the user that an update is available
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class UpdateApplicationDialog extends DialogFragment {

    private static final String BUNDLE_MESSAGE = "MESSAGE";
    private Activity context;

    public static UpdateApplicationDialog newInstance(String message) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_MESSAGE, message);

        UpdateApplicationDialog updateApplicationDialog = new UpdateApplicationDialog();
        updateApplicationDialog.setArguments(bundle);

        return updateApplicationDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        context = getActivity();
        int icon = R.drawable.ic_menu_info_details;
        String title = getString(R.string.app_dialog_title_important);
        Spanned message = Html.fromHtml(getArguments().getString(BUNDLE_MESSAGE));
        String negativeBtn = getString(R.string.app_button_later);
        String positiveBtn = getString(R.string.app_button_update);

        OnClickListener positiveOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String appPackageName = context.getPackageName();

                try {
                    context.startActivity(new Intent(Intent.ACTION_VIEW, Uri
                            .parse("market://details?id=" + appPackageName)));
                } catch (android.content.ActivityNotFoundException anfe) {
                    context.startActivity(new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id="
                                    + appPackageName)));
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, null)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }
}