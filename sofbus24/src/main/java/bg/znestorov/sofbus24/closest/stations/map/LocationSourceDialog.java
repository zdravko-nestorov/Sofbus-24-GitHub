package bg.znestorov.sofbus24.closest.stations.map;

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

import bg.znestorov.sofbus24.main.R;

/**
 * Dialog informing the user that he/she should allow the Google Terms, so can
 * retrieve his/her current location
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class LocationSourceDialog extends DialogFragment {

    private Activity context;
    private int icon;
    private String title;
    private Spanned message;
    private String negativeBtn;
    private String positiveBtn;
    private OnClickListener positiveOnClickListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        context = getActivity();
        icon = R.drawable.ic_menu_mylocation;
        title = getString(R.string.app_dialog_title_error);
        message = Html.fromHtml(getString(R.string.app_location_access_error));
        negativeBtn = getString(R.string.app_button_later);
        positiveBtn = getString(R.string.app_button_activate);

        positiveOnClickListener = new OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
                Intent intent = new Intent(
                        android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                context.startActivity(intent);
                dismiss();
            }

        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, null)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }
}