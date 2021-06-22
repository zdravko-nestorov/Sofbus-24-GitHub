package bg.znestorov.sofbus24.explorer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.text.InputFilter;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import bg.znestorov.sofbus24.backup.ExportDataAsync;
import bg.znestorov.sofbus24.backup.ImportDataAsync;
import bg.znestorov.sofbus24.entity.FileDialogActionEnum;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * This class creates a file manager which help the user to interact with the files in the smartphone memory.
 * It is responsible to import/export all settings of the application.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FileChooserDialog extends DialogFragment implements FileReplaceDialog.OnFileReplaceListener, FileLoadDialog.OnFileLoadListener {

    private static final long MAX_FILE_SIZE = 13 * 1024 * 1024;
    private static final String[] DEFAULT_EXTENSIONS = {".sofbus24"};
    private static final String BUNDLE_DIALOG_ACTION_TYPE = "DIALOG ACTION TYPE";
    private static final String BUNDLE_CURRENT_DIRECTORY = "CURRENT DIRECTORY";
    private static final String BUNDLE_EXTENSION_FILTER = "EXTENSION FILTER";
    private static final String BUNDLE_SELECTED_FILEPATH = "SELECTED FILEPATH";
    private static final String TAG_DIALOG_FILE_REPLACE_OR_LOAD = "FileReplaceOrLoadDialog";
    private final ArrayList<File> subDirectories = new ArrayList<File>();
    private FragmentActivity context;
    private Fragment fragment;
    private String rootDirectory = "";
    private TextView directoryPathTextView;
    private FileDialogActionEnum actionType;
    private String currentDirectory = "";
    private String selectedFilepath = "";
    private String[] extensionFilter;
    private ListView fileDialogListView;
    private ProgressBar fileDialogListViewLoading;
    private EditText fileDialogBackupNameEditText;
    private FileDialogAdapter fileDialogAdapter;

    public static FileChooserDialog newInstance(FileDialogActionEnum actionType) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_DIALOG_ACTION_TYPE, actionType.toString());

        FileChooserDialog fileChooserDialog = new FileChooserDialog();
        fileChooserDialog.setArguments(bundle);

        return fileChooserDialog;
    }

    public static FileChooserDialog newInstance(FileDialogActionEnum actionType, String currentDirectory) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_DIALOG_ACTION_TYPE, actionType.toString());
        bundle.putString(BUNDLE_CURRENT_DIRECTORY, currentDirectory);

        FileChooserDialog fileChooserDialog = new FileChooserDialog();
        fileChooserDialog.setArguments(bundle);

        return fileChooserDialog;
    }

    public static FileChooserDialog newInstance(FileDialogActionEnum actionType, String currentDirectory, String[] extensionFilter) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_DIALOG_ACTION_TYPE, actionType.toString());
        bundle.putString(BUNDLE_CURRENT_DIRECTORY, currentDirectory);
        bundle.putSerializable(BUNDLE_EXTENSION_FILTER, extensionFilter);

        FileChooserDialog fileChooserDialog = new FileChooserDialog();
        fileChooserDialog.setArguments(bundle);

        return fileChooserDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        context = getActivity();
        fragment = this;
        rootDirectory = new File("/").getAbsolutePath();

        initBundleInfo(savedInstanceState);
        initCurrentDirectory(currentDirectory);

        // If any of both DialogFragments have been shown before orientation change, recreate it.
        // We are using this (and not the standard solution of the DialogFragments), because there
        // was a problem with the order of recreating the DialogFragments, and they were overlapping each other.
        showFileReplaceOrLoadDialog(selectedFilepath);

        setCancelable(false);

        return createDirectoryChooserDialog();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        new RetrieveSubDirectoriesAsync(context, currentDirectory, FileChooserDialog.this, fileDialogListView, fileDialogListViewLoading).execute();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(BUNDLE_CURRENT_DIRECTORY, currentDirectory);
        outState.putString(BUNDLE_SELECTED_FILEPATH, selectedFilepath);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStart() {
        super.onStart();

        final AlertDialog alertDialog = (AlertDialog) getDialog();

        if (alertDialog != null) {

            // Override the back and uo buttons - change them NOT to close the dialog and just to set one directory up
            alertDialog.setOnKeyListener(new OnKeyListener() {
                @Override
                public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                    if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                        if (!currentDirectory.equals(rootDirectory)) {
                            directoryLevelUp();
                        }
                        return true;
                    }
                    return false;
                }
            });

            // Override the positive button (if exists)
            Button positiveButton = alertDialog.getButton(Dialog.BUTTON_POSITIVE);
            if (positiveButton != null) {
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onBackupExport(alertDialog);
                    }
                });
            }
        }
    }

    /**
     * The actions in this method are taken when the user tries to save the backup in the memory
     *
     * @param alertDialog the file chooser dialog (current dialog)
     */
    private void onBackupExport(Dialog alertDialog) {

        // Check if the filename has the sofbus backup extension
        String filename = fileDialogBackupNameEditText != null ? fileDialogBackupNameEditText.getText().toString() : "";
        filename = filename.endsWith(Constants.GLOBAL_PARAM_BACKUP_EXTENSION) ? filename : filename + Constants.GLOBAL_PARAM_BACKUP_EXTENSION;

        // Create the filepath to this file
        String filepath = currentDirectory + File.separator + filename;

        // Check if the filename is a valid one
        if (!Utils.isFilenameValid(filename)) {
            ActivityUtils.showLongToast(context, getString(R.string.backup_export_backup_name));
            return;
        }

        // Check if the directory has permissions to write the backup file
        if (!Utils.hasWritePermissions(currentDirectory)) {
            ActivityUtils.showLongToast(context, getString(R.string.backup_export_write_permission));
            return;
        }

        // Check if the file is not too big to be saved
        if (Utils.getAvailableSpaceInBytes(currentDirectory) <= MAX_FILE_SIZE) {
            ActivityUtils.showLongToast(context, getString(R.string.backup_export_file_size));
            return;
        }

        // Check if the file already exists
        if (Utils.isFileExists(filepath)) {
            showFileReplaceOrLoadDialog(filepath);
        } else {
            if (alertDialog != null) {
                alertDialog.dismiss();
            }

            ExportDataAsync exportData = new ExportDataAsync(context, filepath);
            exportData.execute();
        }
    }

    private void showFileReplaceOrLoadDialog(String filepath) {

        // Dismiss the previously created DialogFragment (if any) after orientation changes
        DialogFragment fileReplaceOrLoadDialog = (DialogFragment) getFragmentManager().findFragmentByTag(TAG_DIALOG_FILE_REPLACE_OR_LOAD);
        if (fileReplaceOrLoadDialog != null) {
            fileReplaceOrLoadDialog.dismiss();
        }

        // Check if the filepath is valid and take the appropriate actions according to the actionType
        if (!Utils.isEmpty(filepath)) {
            switch (actionType) {
                case IMPORT:
                    showFileLoadDialog(filepath);
                    break;
                case EXPORT:
                    showFileReplaceDialog(filepath);
                    break;
            }
        }
    }

    private void showFileReplaceDialog(String filepath) {

        selectedFilepath = filepath;
        String filename = Utils.getFilenameFromPath(filepath);

        DialogFragment fileReplaceDialog = FileReplaceDialog.newInstance(getString(R.string.backup_export_duplicate_title),
                getString(R.string.backup_export_duplicate_msg, filename), filepath);
        fileReplaceDialog.setTargetFragment(fragment, 0);
        fileReplaceDialog.show(getFragmentManager(), TAG_DIALOG_FILE_REPLACE_OR_LOAD);
    }

    private void showFileLoadDialog(String filepath) {

        selectedFilepath = filepath;
        String filename = Utils.getFilenameFromPath(filepath);

        DialogFragment fileLoadDialog = FileLoadDialog.newInstance(getString(R.string.backup_import_confirm_title),
                getString(R.string.backup_import_confirm_msg, filename), filepath);
        fileLoadDialog.setTargetFragment(fragment, 0);
        fileLoadDialog.show(getFragmentManager(), TAG_DIALOG_FILE_REPLACE_OR_LOAD);
    }

    @Override
    public void onFileReplaced(String chosenPath) {
        Dialog alertDialog = getDialog();
        if (alertDialog != null) {
            alertDialog.dismiss();
        }

        ExportDataAsync exportData = new ExportDataAsync(context, chosenPath);
        exportData.execute();
    }

    @Override
    public void onFileLoaded(String chosenPath) {
        Dialog alertDialog = getDialog();
        if (alertDialog != null) {
            alertDialog.dismiss();
        }

        ImportDataAsync importData = new ImportDataAsync(context, chosenPath);
        importData.execute();
    }

    /**
     * Initialize the information from the bundle (mostly used on startup and orientation changes)
     *
     * @param savedInstanceState the savedInstanceState which contains the activity information
     */
    private void initBundleInfo(Bundle savedInstanceState) {
        if (getArguments() == null) {
            actionType = FileDialogActionEnum.IMPORT;
            extensionFilter = DEFAULT_EXTENSIONS;
            currentDirectory = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            String stringActionType = getArguments().getString(BUNDLE_DIALOG_ACTION_TYPE);
            if (stringActionType == null) {
                actionType = FileDialogActionEnum.IMPORT;
            } else {
                actionType = FileDialogActionEnum.valueOf(stringActionType);
            }

            Serializable serializableExtensionFilter = getArguments().getSerializable(BUNDLE_EXTENSION_FILTER);
            if (serializableExtensionFilter == null) {
                extensionFilter = DEFAULT_EXTENSIONS;
            } else {
                extensionFilter = (String[]) serializableExtensionFilter;
            }

            currentDirectory = getArguments().getString(BUNDLE_CURRENT_DIRECTORY);
            if (currentDirectory == null || "".equals(currentDirectory)) {
                currentDirectory = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
        }

        if (savedInstanceState != null) {
            currentDirectory = savedInstanceState.getString(BUNDLE_CURRENT_DIRECTORY);
            selectedFilepath = savedInstanceState.getString(BUNDLE_SELECTED_FILEPATH);
        }
    }

    /**
     * Initialize the current directory
     *
     * @param directory the current directory
     */
    private void initCurrentDirectory(String directory) {
        File directoryFile = new File(directory);
        if (!directoryFile.exists() || !directoryFile.isDirectory()) {
            directory = rootDirectory;
        }

        try {
            directory = new File(directory).getCanonicalPath();
        } catch (IOException ioe) {
            return;
        }

        currentDirectory = directory;
    }

    /**
     * Get all directories in the current directory and sort them alphabetically
     *
     * @param directory the current directory
     * @return all directories in the current directory
     */
    private ArrayList<File> getDirectories(String directory) {
        ArrayList<File> subDirectories = new ArrayList<File>();
        try {
            File dirFile = new File(directory);

            // If the directory is not the base sd card directory add ".." for
            // going up one directory
            if (!currentDirectory.equals(rootDirectory)) {
                subDirectories.add(new File(".."));
            }

            if (!dirFile.exists() || !dirFile.isDirectory()) {
                return subDirectories;
            }

            ArrayList<File> files = new ArrayList<File>();
            ArrayList<File> directories = new ArrayList<File>();
            for (File file : dirFile.listFiles()) {
                if (file.isFile()) {
                    if (isFileExtensionCorrect(file)) {
                        files.add(file);
                    }
                } else {
                    if (!file.getName().startsWith(".")) {
                        directories.add(file);
                    }
                }
            }

            Comparator<File> alphabeticalComparator = new Comparator<File>() {
                public int compare(File file1, File file2) {
                    return file1.compareTo(file2);
                }
            };
            Collections.sort(files, alphabeticalComparator);
            Collections.sort(directories, alphabeticalComparator);

            subDirectories.addAll(directories);
            subDirectories.addAll(files);
        } catch (Exception e) {
        }

        return subDirectories;
    }

    /**
     * Check if the file extension is correct or not
     *
     * @param file the current file
     * @return if the file is a valid one (can be shown to the user)
     */
    private boolean isFileExtensionCorrect(File file) {
        String fileName = file.getName();
        boolean isFileExtensionCorrect = false;

        if (extensionFilter != null && extensionFilter.length > 0) {
            for (String extension : extensionFilter) {
                if (fileName.endsWith(extension)) {
                    isFileExtensionCorrect = true;
                    break;
                }
            }
        } else {
            isFileExtensionCorrect = true;
        }

        return isFileExtensionCorrect;
    }

    /**
     * Creates the directory chooser dialog (the file manager)
     *
     * @return the file manager
     */
    @SuppressLint("InflateParams")
    private AlertDialog createDirectoryChooserDialog() {
        View view = context.getLayoutInflater().inflate(R.layout.file_explorer_layout, null);

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
        dialogBuilder.setView(view);

        ImageView fileExplorerLogo = (ImageView) view.findViewById(R.id.file_explorer_logo);
        fileExplorerLogo.setImageResource(R.drawable.icn_smartphone);

        directoryPathTextView = (TextView) view.findViewById(R.id.file_explorer_path);
        directoryPathTextView.setText(currentDirectory);
        directoryPathTextView.setSelected(true);

        fileDialogListView = (ListView) view.findViewById(R.id.file_explorer_list);
        fileDialogAdapter = new FileDialogAdapter(context, subDirectories);
        fileDialogListView.setAdapter(fileDialogAdapter);
        fileDialogListView.setOnItemClickListener(new FileDialogOnClickListener());
        fileDialogListViewLoading = (ProgressBar) view.findViewById(R.id.file_explorer_list_loading);

        View fileDialogFooterDelim = view.findViewById(R.id.file_explorer_footer_delim);

        fileDialogBackupNameEditText = (EditText) view.findViewById(R.id.file_explorer_backup_name);
        fileDialogBackupNameEditText.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        fileDialogBackupNameEditText.setFilters(new InputFilter[]{ActivityUtils
                .createFileInputFilter()});

        // Take appropriate actions according to the type of the dialog
        switch (actionType) {
            case EXPORT:
                dialogBuilder.setPositiveButton(context.getString(R.string.app_button_save), null);
                fileDialogFooterDelim.setVisibility(View.VISIBLE);
                fileDialogBackupNameEditText.setVisibility(View.VISIBLE);
            default:
                dialogBuilder.setNegativeButton(context.getString(R.string.app_button_cancel), null);
                break;
        }

        return dialogBuilder.create();
    }

    /**
     * Get one level up in the directory tree
     */
    private void directoryLevelUp() {
        currentDirectory = currentDirectory.substring(0, currentDirectory.lastIndexOf("/"));

        // In case we reach the root directory
        if ("".equals(currentDirectory)) {
            currentDirectory = "/";
        }

        new RetrieveSubDirectoriesAsync(context, currentDirectory, FileChooserDialog.this, fileDialogListView, fileDialogListViewLoading).execute();
    }

    /**
     * Update the files/folders in the current directory
     *
     * @param newSubDirectories the new directories (files and/or folders) in the current one
     */
    private void updateDirectory(ArrayList<File> newSubDirectories) {
        subDirectories.clear();
        subDirectories.addAll(newSubDirectories);
        directoryPathTextView.setText(currentDirectory);
        fileDialogAdapter.notifyDataSetChanged();
        fileDialogListView.setSelectionFromTop(0, 0);
    }

    private class FileDialogOnClickListener implements OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> list, View v, int position, long id) {
            File selectedFile = (File) ((ListView) list).getAdapter().getItem(position);
            String selectedFileName = selectedFile.getName();

            // Navigate into the sub-directory
            if ("..".equals(selectedFileName)) {
                directoryLevelUp();
            } else {
                File newFile;

                // Check if the a file was already selected
                if (selectedFile.isFile()) {
                    newFile = selectedFile;
                } else {
                    String previousDirectory = currentDirectory;
                    if ("/".equals(currentDirectory)) {
                        currentDirectory += selectedFileName;
                    } else {
                        currentDirectory += "/" + selectedFileName;
                    }

                    // Check if the selected item is a file or directory
                    newFile = new File(currentDirectory);
                }

                if (newFile.isFile()) {
                    // Check if the size length is in range
                    if (newFile.length() > MAX_FILE_SIZE) {
                        Toast.makeText(context, context.getString(R.string.file_explorer_large_file, MAX_FILE_SIZE / (1024 * 1024)), Toast.LENGTH_SHORT)
                                .show();
                    } else {
                        String filename = newFile.getName();
                        String filepath = currentDirectory + File.separator + filename;

                        switch (actionType) {
                            case EXPORT:
                                fileDialogBackupNameEditText.setText(filename);
                                fileDialogBackupNameEditText.setSelection(filename.length());

                                onBackupExport(getDialog());
                                break;
                            case IMPORT:
                                showFileReplaceOrLoadDialog(filepath);
                                break;
                        }
                    }
                } else {
                    new RetrieveSubDirectoriesAsync(context, currentDirectory, FileChooserDialog.this, fileDialogListView, fileDialogListViewLoading).execute();
                }
            }
        }
    }

    /**
     * Class responsible fore retrieving the information for the current directory. Get all files/folders in the current directory, filter them and show to the user
     */
    @SuppressLint("StaticFieldLeak")
    public class RetrieveSubDirectoriesAsync extends AsyncTask<Void, Void, ArrayList<File>> {

        private final Activity context;
        private final String directory;

        private final FileChooserDialog fileChooserDialog;
        private final ListView fileDialogListView;
        private final ProgressBar fileDialogListViewLoading;

        public RetrieveSubDirectoriesAsync(Activity context, String directory, FileChooserDialog fileChooserDialog, ListView fileDialogListView,
                                           ProgressBar fileDialogListViewLoading) {
            this.context = context;
            this.directory = directory;

            this.fileChooserDialog = fileChooserDialog;
            this.fileDialogListView = fileDialogListView;
            this.fileDialogListViewLoading = fileDialogListViewLoading;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            createSyncLoadingView();
        }

        @Override
        protected ArrayList<File> doInBackground(Void... params) {
            return getDirectories(directory);
        }

        @Override
        protected void onPostExecute(ArrayList<File> newSubDirectories) {
            super.onPostExecute(newSubDirectories);
            dismissLoadingView(newSubDirectories);
        }

        @Override
        protected void onCancelled(ArrayList<File> newSubDirectories) {
            dismissLoadingView(newSubDirectories);
        }

        /**
         * Show the user that the file manager is retrieving the files
         */
        private void createSyncLoadingView() {
            ActivityUtils.lockScreenOrientation(context);

            if (fileDialogListView != null) {
                fileDialogListView.setVisibility(View.INVISIBLE);
            }

            if (fileDialogListViewLoading != null) {
                fileDialogListViewLoading.setVisibility(View.VISIBLE);
            }
        }

        /**
         * Show the user that all files are already retrieved and show them in the file explorer
         *
         * @param newSubDirectories the new directories (files and/or folders) in the current one
         */
        private void dismissLoadingView(ArrayList<File> newSubDirectories) {
            if (fileChooserDialog != null) {
                fileChooserDialog.updateDirectory(newSubDirectories);
            }

            if (fileDialogListView != null) {
                fileDialogListView.setVisibility(View.VISIBLE);
            }

            if (fileDialogListViewLoading != null) {
                fileDialogListViewLoading.setVisibility(View.INVISIBLE);
            }

            ActivityUtils.unlockScreenOrientation(context);
        }
    }
}