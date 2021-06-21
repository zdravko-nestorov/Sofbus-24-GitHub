package bg.znestorov.sofbus24.preferences;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;

import androidx.fragment.app.DialogFragment;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog alerting the user about application restart
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RestartApplicationDialog extends DialogFragment {

    private static final String BUNDLE_IS_RESETTED = "IS RESETTED";

    public static RestartApplicationDialog newInstance(boolean isResetted) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(BUNDLE_IS_RESETTED, isResetted);

        RestartApplicationDialog restartApplicationDialog = new RestartApplicationDialog();
        restartApplicationDialog.setArguments(bundle);

        return restartApplicationDialog;
    }

    public static AlertDialog showRestartApplicationDialog(
            final Activity context, final boolean isResetted) {
        int icon = R.drawable.ic_menu_info_details;
        String title = context.getString(R.string.app_dialog_title_important);
        Spanned message = Html.fromHtml(context
                .getString(R.string.pref_restart_app));
        String negativeBtn = context.getString(R.string.app_button_no);
        String positiveBtn = context.getString(R.string.app_button_yes);

        OnClickListener positiveOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                context.finish();
            }
        };

        OnClickListener negativeOnClickListener = new OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (!isResetted) {
                    ((GlobalEntity) context.getApplicationContext())
                            .setHasToRestart(false);
                    context.finish();
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, negativeOnClickListener)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return showRestartApplicationDialog(getActivity(), getArguments()
                .getBoolean(BUNDLE_IS_RESETTED));
    }
}