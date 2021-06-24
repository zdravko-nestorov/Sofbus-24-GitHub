package bg.znestorov.sofbus24.backup;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import java.util.Arrays;
import java.util.List;

import bg.znestorov.sofbus24.entity.FileDialogActionEnum;
import bg.znestorov.sofbus24.explorer.FileChooserDialog;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;

/**
 * Dialog informing the user about the backup options
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ChooseBackupDialog extends DialogFragment {

    private FragmentManager fragmentManager;

    public static ChooseBackupDialog newInstance() {
        return new ChooseBackupDialog();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final FragmentActivity context = getActivity();
        fragmentManager = getFragmentManager();

        // Explicitly set the default locale before initializing the the dialog content
        // Otherwise the locale is incorrectly retrieved
        LanguageChange.selectLocale(context);

        String title = getString(R.string.backup_import_export_choice);
        List<String> chooseBackupItems = Arrays.asList(getResources().getStringArray(R.array.backupChooseItems));

        ArrayAdapter<String> chooseBackupAdapter = new ArrayAdapter<String>(
                context, R.layout.activity_choose_backup_item,
                chooseBackupItems);

        DialogInterface.OnClickListener onListItemClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialoginterface, int i) {

                DialogFragment fileChooserDialog;
                String fileChooserDialogName;
                FileDialogActionEnum fileDialogAction;

                switch (i) {
                    case 0:
                        fileDialogAction = FileDialogActionEnum.IMPORT;
                        fileChooserDialogName = "FileImportDialog";
                        break;
                    default:
                        fileDialogAction = FileDialogActionEnum.EXPORT;
                        fileChooserDialogName = "FileExportDialog";
                        break;
                }

                // Send information to GoogleAnalytics with the taken action - IMPORT/EXPORT
                ActivityTracker.backupApplication(context, fileDialogAction);

                // Start the FileChooserDialog in IMPORT/EXPORT mode
                fileChooserDialog = FileChooserDialog.newInstance(fileDialogAction);
                fileChooserDialog.show(fragmentManager, fileChooserDialogName);
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setAdapter(chooseBackupAdapter,
                onListItemClickListener);

        return builder.create();
    }

}