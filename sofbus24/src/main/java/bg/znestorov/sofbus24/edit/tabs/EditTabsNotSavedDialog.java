package bg.znestorov.sofbus24.edit.tabs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import bg.znestorov.sofbus24.main.R;

/**
 * Class used to show the user an alert dialog, because there are some changes
 * over the HomeScreen and they weren't saved already
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class EditTabsNotSavedDialog extends DialogFragment {

    private Activity context;
    private String title;
    private String message;
    private String negativeBtn;
    private String positiveBtn;
    private OnClickListener positiveOnClickListener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        context = getActivity();
        title = getString(R.string.edit_tabs_not_saved_title);
        message = getString(R.string.edit_tabs_not_saved_msg);
        negativeBtn = getString(R.string.app_button_no);
        positiveBtn = getString(R.string.app_button_yes);

        positiveOnClickListener = new OnClickListener() {
            public void onClick(DialogInterface dialog, int i) {
                context.finish();
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, null)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }
}