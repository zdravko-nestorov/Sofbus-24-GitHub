package bg.znestorov.sofbus24.about;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.Spanned;

import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Dialog responsible to inform the user that the application needs a restart
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RestartApplicationDialog extends DialogFragment {

    private Activity context;
    private int icon;
    private String title;
    private Spanned message;
    private String negativeBtn;
    private String positiveBtn;
    private OnClickListener positiveOnClickListener;

    public static RestartApplicationDialog newInstance() {
        return new RestartApplicationDialog();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        context = getActivity();
        icon = R.drawable.ic_menu_info_details;
        title = getString(R.string.app_dialog_title_important);
        message = Html.fromHtml(getString(R.string.about_update_db_restart));
        negativeBtn = getString(R.string.app_button_no);
        positiveBtn = getString(R.string.app_button_yes);

        positiveOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ActivityUtils.restartApplication(context);
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, null)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }
}