package bg.znestorov.sofbus24.about;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;

import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog informing the user that a new databases are available
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class UpdateDatabaseDialog extends DialogFragment {

    public static final String BUNDLE_NEW_APPLICATION_CONFIG = "NEW APPLICATION CONFIG";
    private FragmentActivity context;
    private int icon;
    private String title;
    private String message;
    private String negativeBtn;
    private String positiveBtn;
    private OnClickListener positiveOnClickListener;
    private ConfigEntity newConfig;

    public static UpdateDatabaseDialog newInstance(ConfigEntity newConfig) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_NEW_APPLICATION_CONFIG, newConfig);

        UpdateDatabaseDialog updateDatabaseDialog = new UpdateDatabaseDialog();
        updateDatabaseDialog.setArguments(bundle);

        return updateDatabaseDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        context = getActivity();
        icon = R.drawable.ic_menu_info_details;
        title = getString(R.string.app_dialog_title_important);
        message = getString(R.string.about_update_db_new);
        negativeBtn = getString(R.string.app_button_later);
        positiveBtn = getString(R.string.app_button_update);

        Bundle bundle = getArguments();
        newConfig = (ConfigEntity) bundle
                .getSerializable(BUNDLE_NEW_APPLICATION_CONFIG);

        positiveOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(Html.fromHtml(context
                        .getString(R.string.about_update_db_copy)));
                RetrieveDatabases retrieveDatabases = new RetrieveDatabases(
                        context, progressDialog, newConfig);
                retrieveDatabases.execute();
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, null)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }
}