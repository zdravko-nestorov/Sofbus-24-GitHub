package bg.znestorov.sofbus24.about;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Html;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog informing the user that a new databases are available
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class UpdateDatabaseDialog extends DialogFragment {

    private static final String BUNDLE_NEW_APPLICATION_CONFIG = "NEW APPLICATION CONFIG";
    private FragmentActivity context;
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
        int icon = R.drawable.ic_menu_info_details;
        String title = getString(R.string.app_dialog_title_important);
        String message = getString(R.string.about_update_db_new);
        String negativeBtn = getString(R.string.app_button_later);
        String positiveBtn = getString(R.string.app_button_update);

        Bundle bundle = getArguments();
        newConfig = (ConfigEntity) bundle
                .getSerializable(BUNDLE_NEW_APPLICATION_CONFIG);

        OnClickListener positiveOnClickListener = new OnClickListener() {
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