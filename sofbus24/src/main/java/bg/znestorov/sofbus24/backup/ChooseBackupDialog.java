package bg.znestorov.sofbus24.backup;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.ArrayAdapter;

import java.util.Arrays;
import java.util.List;

import bg.znestorov.sofbus24.entity.FileDialogActionEnum;
import bg.znestorov.sofbus24.explorer.FileChooserDialog;
import bg.znestorov.sofbus24.main.R;

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

        FragmentActivity context = getActivity();
        fragmentManager = getFragmentManager();

        String title = getString(R.string.backup_import_export_choice);
        List<String> chooseBackupItems = Arrays.asList(getResources().getStringArray(R.array.backupChooseItems));

        ArrayAdapter<String> chooseBackupAdapter = new ArrayAdapter<String>(
                context, R.layout.activity_choose_backup_item,
                chooseBackupItems);

        DialogInterface.OnClickListener onListItemClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialoginterface, int i) {

                DialogFragment fileChooserDialog;
                switch (i) {
                    case 0:
                        fileChooserDialog = FileChooserDialog.newInstance(FileDialogActionEnum.IMPORT);
                        fileChooserDialog.show(fragmentManager, "FileImportDialog");
                        break;
                    default:
                        fileChooserDialog = FileChooserDialog.newInstance(FileDialogActionEnum.EXPORT);
                        fileChooserDialog.show(fragmentManager, "FileExportDialog");
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setAdapter(chooseBackupAdapter,
                onListItemClickListener);

        return builder.create();
    }

}