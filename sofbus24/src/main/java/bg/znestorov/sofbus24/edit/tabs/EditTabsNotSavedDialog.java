package bg.znestorov.sofbus24.edit.tabs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

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

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        context = getActivity();
        String title = getString(R.string.edit_tabs_not_saved_title);
        String message = getString(R.string.edit_tabs_not_saved_msg);
        String negativeBtn = getString(R.string.app_button_no);
        String positiveBtn = getString(R.string.app_button_yes);

        OnClickListener positiveOnClickListener = new OnClickListener() {
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