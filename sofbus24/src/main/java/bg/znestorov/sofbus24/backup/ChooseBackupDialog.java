package bg.znestorov.sofbus24.backup;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.widget.ArrayAdapter;

import androidx.activity.result.ActivityResultCallback;
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
 * <p>Starting with Android 10+ (Scoped Storage) and being a hard requirement for
 * Android 14+, this dialog uses the Storage Access Framework (SAF) instead of a
 * legacy file chooser.</p>
 *
 * <p><b>Lifecycle note.</b> This dialog uses
 * {@link AlertDialog.Builder#setAdapter(android.widget.ListAdapter, DialogInterface.OnClickListener)},
 * which auto-dismisses the underlying {@link AlertDialog} as soon as the user
 * taps an item. The {@link DialogFragment} is therefore destroyed
 * <em>before</em> the SAF picker activity returns its result. To make sure the
 * result is still delivered, the launchers are registered against the host
 * Activity's {@link androidx.activity.result.ActivityResultRegistry} (using
 * stable keys) instead of the fragment's lifecycle. The launchers therefore
 * outlive the dialog and the callback fires correctly when the picker returns.</p>
 *
 * @author Zdravko Nestorov
 * @version 3.0
 */
public class ChooseBackupDialog extends DialogFragment {

    /**
     * Default file name suggested to the user when exporting a backup.
     */
    private static final String DEFAULT_BACKUP_FILE_NAME = "sofbus24_backup.sofbus24";

    /**
     * Required file extension for any backup that can be imported.
     */
    private static final String BACKUP_FILE_EXTENSION = ".sofbus24";

    /**
     * MIME type used when creating a new backup document via SAF.
     */
    private static final String EXPORT_MIME_TYPE = "application/octet-stream";

    /**
     * MIME types accepted when opening an existing backup document via SAF.
     * We use a wildcard since {@code .sofbus24} files do not have a registered
     * MIME type (post-pick filename validation guards against wrong picks).
     */
    private static final String[] IMPORT_MIME_TYPES = {"*/*"};

    /**
     * Stable keys used to register the launchers against the host activity's
     * {@link androidx.activity.result.ActivityResultRegistry}. They must remain
     * unique across the application.
     */
    private static final String IMPORT_REGISTRY_KEY = "bg.znestorov.sofbus24.backup.import";
    private static final String EXPORT_REGISTRY_KEY = "bg.znestorov.sofbus24.backup.export";

    private ActivityResultLauncher<String[]> openDocumentLauncher;
    private ActivityResultLauncher<String> createDocumentLauncher;

    public static ChooseBackupDialog newInstance() {
        return new ChooseBackupDialog();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Register the launchers against the *host activity's* registry (no
        // LifecycleOwner) so that they survive the dialog being dismissed when
        // the user taps an item. Re-registering with the same key on a
        // subsequent show simply replaces the previous callback.
        final FragmentActivity activity = requireActivity();

        openDocumentLauncher = activity.getActivityResultRegistry().register(
                IMPORT_REGISTRY_KEY,
                new ActivityResultContracts.OpenDocument(),
                new ActivityResultCallback<Uri>() {
                    @Override
                    public void onActivityResult(Uri uri) {
                        handleImportUri(activity, uri);
                    }
                });

        createDocumentLauncher = activity.getActivityResultRegistry().register(
                EXPORT_REGISTRY_KEY,
                new ActivityResultContracts.CreateDocument(EXPORT_MIME_TYPE),
                new ActivityResultCallback<Uri>() {
                    @Override
                    public void onActivityResult(Uri uri) {
                        handleExportUri(activity, uri);
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
                        if (i == 0) {
                            launchImportPicker();
                        } else {
                            launchExportPicker();
                        }
                    }
                };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setAdapter(chooseBackupAdapter,
                onListItemClickListener);

        return builder.create();
    }

    /**
     * Launches the SAF "open document" picker so the user can pick a previously
     * exported backup file to import.
     */
    private void launchImportPicker() {
        try {
            openDocumentLauncher.launch(IMPORT_MIME_TYPES);
        } catch (Exception e) {
            // No application on the device is able to handle the SAF intent.
            FragmentActivity context = getActivity();
            if (context != null) {
                ActivityUtils.showLongToast(context,
                        context.getString(R.string.backup_import_failed));
            }
        }
    }

    /**
     * Launches the SAF "create document" picker so the user can choose where to
     * save a new backup file.
     */
    private void launchExportPicker() {
        try {
            createDocumentLauncher.launch(DEFAULT_BACKUP_FILE_NAME);
        } catch (Exception e) {
            // No application on the device is able to handle the SAF intent.
            FragmentActivity context = getActivity();
            if (context != null) {
                ActivityUtils.showLongToast(context,
                        context.getString(R.string.backup_export_failed));
            }
        }
    }

    /**
     * Handles the {@link Uri} returned by the import picker. Validates the file
     * extension before kicking off {@link ImportDataAsync}.
     *
     * <p>SAF cannot filter the picker by file extension (only by MIME type, and
     * {@code .sofbus24} has no registered MIME), so we validate here instead
     * and surface a friendly error if the user picked the wrong file.</p>
     */
    private static void handleImportUri(FragmentActivity activity, Uri uri) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (uri == null) {
            // User cancelled the picker - nothing to do
            return;
        }

        // Persist read access across process restarts (best-effort)
        try {
            activity.getContentResolver().takePersistableUriPermission(
                    uri, Intent.FLAG_GRANT_READ_URI_PERMISSION);
        } catch (SecurityException ignored) {
            // The provider does not support persistable permissions - safe to ignore
        }

        String displayName = queryDisplayName(activity, uri);
        if (displayName == null
                || !displayName.toLowerCase(Locale.ROOT).endsWith(BACKUP_FILE_EXTENSION)) {
            ActivityUtils.showLongToast(activity,
                    activity.getString(R.string.backup_import_invalid_extension));
            return;
        }

        new ImportDataAsync(activity, uri).execute();
    }

    /**
     * Handles the {@link Uri} returned by the export picker.
     */
    private static void handleExportUri(FragmentActivity activity, Uri uri) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (uri == null) {
            // User cancelled the picker - nothing to do
            return;
        }

        // Persist write access across process restarts (best-effort)
        try {
            activity.getContentResolver().takePersistableUriPermission(
                    uri, Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        } catch (SecurityException ignored) {
            // The provider does not support persistable permissions - safe to ignore
        }

        new ExportDataAsync(activity, uri).execute();
    }

    /**
     * Looks up the display name (file name) backing a SAF {@link Uri} via the
     * {@link OpenableColumns#DISPLAY_NAME} column. Returns {@code null} if the
     * provider does not expose a display name or the query fails.
     *
     * <p>We deliberately do <em>not</em> fall back to {@link Uri#getPath()},
     * because the path component of a SAF {@code content://} URI is usually
     * an opaque document ID and would produce unreliable extension matches.
     * Treating an unknown name as "invalid" is the safer default — it forces
     * the user to pick a file from a properly-implemented document provider.</p>
     */
    private static String queryDisplayName(FragmentActivity activity, Uri uri) {
        try (Cursor cursor = activity.getContentResolver().query(
                uri,
                new String[]{OpenableColumns.DISPLAY_NAME},
                null, null, null)) {

            if (cursor != null && cursor.moveToFirst()) {
                int nameColumn = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                if (nameColumn >= 0) {
                    return cursor.getString(nameColumn);
                }
            }
        } catch (Exception ignored) {
            // Provider failed - treat as unknown
        }
        return null;
    }
}
