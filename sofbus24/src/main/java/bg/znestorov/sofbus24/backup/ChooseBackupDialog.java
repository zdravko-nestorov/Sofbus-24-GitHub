package bg.znestorov.sofbus24.backup;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.text.Html;
import android.text.TextUtils;
import android.widget.ArrayAdapter;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Dialog informing the user about the backup options.
 *
 * <p>The backup file is chosen through the Storage Access Framework (SAF)
 * system picker, so no storage permissions are needed.</p>
 *
 * <p>The picker launchers are registered by the host activity via
 * {@link #registerPickers(FragmentActivity)} while it is being created. The
 * dialog itself is dismissed as soon as an item is tapped, so it only sends
 * the choice back to the activity through the fragment result API. This way
 * the picked file is still processed if the activity is recreated while the
 * picker is open.</p>
 *
 * @author Zdravko Nestorov
 * @version 3.0
 */
public class ChooseBackupDialog extends DialogFragment {

    private static final String DEFAULT_BACKUP_FILE_NAME = "sofbus24_backup.sofbus24";
    private static final String BACKUP_FILE_EXTENSION = ".sofbus24";
    private static final String EXPORT_MIME_TYPE = "application/octet-stream";

    // The ".sofbus24" files do not have a registered MIME type, so the picker
    // can't filter them - the file name is validated after it is picked instead
    private static final String[] IMPORT_MIME_TYPES = {"*/*"};

    private static final String REQUEST_KEY_BACKUP_CHOICE = "bg.znestorov.sofbus24.backup.choice";
    private static final String BUNDLE_IS_IMPORT = "BUNDLE_IS_IMPORT";

    public static ChooseBackupDialog newInstance() {
        return new ChooseBackupDialog();
    }

    /**
     * Register the SAF pickers for the given activity. Must be called before the
     * activity is started (in onCreate), and the dialog must be shown using the
     * activity's support fragment manager.
     *
     * @param activity the activity hosting the dialog
     */
    public static void registerPickers(final FragmentActivity activity) {

        final ActivityResultLauncher<String[]> openDocumentLauncher = activity.registerForActivityResult(
                new ActivityResultContracts.OpenDocument(), uri -> onImportUriPicked(activity, uri));
        final ActivityResultLauncher<String> createDocumentLauncher = activity.registerForActivityResult(
                new ActivityResultContracts.CreateDocument(EXPORT_MIME_TYPE), uri -> onExportUriPicked(activity, uri));

        activity.getSupportFragmentManager().setFragmentResultListener(REQUEST_KEY_BACKUP_CHOICE, activity,
                (requestKey, result) -> {
                    if (result.getBoolean(BUNDLE_IS_IMPORT)) {
                        launchPicker(activity, openDocumentLauncher, IMPORT_MIME_TYPES, R.string.backup_import_failed);
                    } else {
                        launchPicker(activity, createDocumentLauncher, DEFAULT_BACKUP_FILE_NAME, R.string.backup_export_failed);
                    }
                });
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final FragmentActivity context = getActivity();

        // Explicitly set the default locale before initializing the the dialog content
        // Otherwise the locale is incorrectly retrieved
        LanguageChange.selectLocale(context);

        String title = getString(R.string.backup_import_export_choice);
        List<String> chooseBackupItems = Arrays.asList(
                getResources().getStringArray(R.array.backupChooseItems));

        ArrayAdapter<String> chooseBackupAdapter = new ArrayAdapter<String>(
                context, R.layout.activity_choose_backup_item,
                chooseBackupItems);

        DialogInterface.OnClickListener onListItemClickListener =
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialoginterface, int i) {
                        // Item 0 -> IMPORT, anything else -> EXPORT
                        Bundle result = new Bundle();
                        result.putBoolean(BUNDLE_IS_IMPORT, i == 0);
                        getParentFragmentManager().setFragmentResult(REQUEST_KEY_BACKUP_CHOICE, result);
                    }
                };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setAdapter(chooseBackupAdapter,
                onListItemClickListener);

        return builder.create();
    }

    private static <I> void launchPicker(FragmentActivity activity, ActivityResultLauncher<I> launcher,
                                         I input, int errorMessageId) {
        try {
            launcher.launch(input);
        } catch (ActivityNotFoundException e) {
            // No application on the device is able to handle the SAF intent
            ActivityUtils.showLongToast(activity, activity.getString(errorMessageId));
        }
    }

    /**
     * Validate the file extension of the picked backup file and ask the user to
     * confirm that the current settings should be replaced
     */
    private static void onImportUriPicked(final FragmentActivity activity, final Uri uri) {

        // The user cancelled the picker
        if (uri == null) {
            return;
        }

        String displayName = queryDisplayName(activity, uri);
        if (displayName == null
                || !displayName.toLowerCase(Locale.ROOT).endsWith(BACKUP_FILE_EXTENSION)) {
            ActivityUtils.showLongToast(activity,
                    activity.getString(R.string.backup_import_invalid_extension));
            return;
        }

        String message = activity.getString(R.string.backup_import_confirm_msg,
                TextUtils.htmlEncode(displayName));
        new AlertDialog.Builder(activity)
                .setTitle(R.string.backup_import_confirm_title)
                .setMessage(Html.fromHtml(message))
                .setNegativeButton(R.string.app_button_no, null)
                .setPositiveButton(R.string.app_button_yes,
                        (dialog, which) -> new ImportDataAsync(activity, uri).execute())
                .show();
    }

    private static void onExportUriPicked(FragmentActivity activity, Uri uri) {

        // The user cancelled the picker
        if (uri == null) {
            return;
        }

        String displayName = queryDisplayName(activity, uri);
        new ExportDataAsync(activity, uri, displayName != null ? displayName : DEFAULT_BACKUP_FILE_NAME).execute();
    }

    /**
     * Get the file name of a SAF {@link Uri}. The path of a content URI is usually
     * an opaque document ID, so it is not used as a fallback.
     *
     * @return the file name or null if the document provider does not expose it
     */
    private static String queryDisplayName(Context context, Uri uri) {
        try (Cursor cursor = context.getContentResolver().query(uri,
                new String[]{OpenableColumns.DISPLAY_NAME}, null, null, null)) {
            if (cursor != null && cursor.moveToFirst()) {
                return cursor.getString(0);
            }
        } catch (Exception e) {
            // The document provider failed - treat the name as unknown
        }

        return null;
    }
}
