package bg.znestorov.sofbus24.gcm;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.Spanned;

import bg.znestorov.sofbus24.main.R;

/**
 * Dialog informing the user about the occurrence of an unforeseen situation
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class GcmInfoDialog extends DialogFragment {

    private static final String BUNDLE_MESSAGE = "MESSAGE";

    public static GcmInfoDialog newInstance(String message) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_MESSAGE, message);

        GcmInfoDialog updateApplicationDialog = new GcmInfoDialog();
        updateApplicationDialog.setArguments(bundle);

        return updateApplicationDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Activity context = getActivity();
        int icon = R.drawable.ic_menu_info_details;
        String title = getString(R.string.app_dialog_title_info);
        Spanned message = Html.fromHtml(getArguments().getString(BUNDLE_MESSAGE));
        String neutralBtn = getString(R.string.app_button_ok);

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNeutralButton(neutralBtn, null);

        return builder.create();
    }
}