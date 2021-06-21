package bg.znestorov.sofbus24.explorer;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Html;

import androidx.fragment.app.DialogFragment;

import bg.znestorov.sofbus24.main.R;

public class FileLoadDialog extends DialogFragment {

    private static final String BUNDLE_DIALOG_TITLE = "DIALOG TITLE";
    private static final String BUNDLE_DIALOG_MESSAGE = "DIALOG MESSAGE";
    private static final String BUNDLE_CHOSEN_FILE_PATH = "CHOSEN FILE PATH";
    private String filePath;
    private OnFileLoadListener onFileLoadListener;

    public static FileLoadDialog newInstance(String title, String message, String filePath) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_DIALOG_TITLE, title);
        bundle.putString(BUNDLE_DIALOG_MESSAGE, message);
        bundle.putString(BUNDLE_CHOSEN_FILE_PATH, filePath);

        FileLoadDialog fileLoadDialog = new FileLoadDialog();
        fileLoadDialog.setArguments(bundle);

        return fileLoadDialog;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onFileLoadListener = (OnFileLoadListener) getTargetFragment();
        } catch (ClassCastException e) {
            throw new ClassCastException(getTargetFragment().toString() + " must implement OnFileLoadListener interface...");
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String title = getArguments().getString(BUNDLE_DIALOG_TITLE);
        String message = getArguments().getString(BUNDLE_DIALOG_MESSAGE);
        filePath = getArguments().getString(BUNDLE_CHOSEN_FILE_PATH);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title).setMessage(Html.fromHtml(message)).setNegativeButton(getString(R.string.app_button_no), null)
                .setPositiveButton(getString(R.string.app_button_yes), new OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        onFileLoadListener.onFileLoaded(filePath);
                    }
                });

        return builder.create();
    }

    /**
     * It should be implemented by the Activity which uses the
     * FileLoadDialog
     */
    public interface OnFileLoadListener {
        /**
         * Invoked when the user confirms that the file should be loaded
         *
         * @param chosenPath the chosen file path
         */
        void onFileLoaded(String chosenPath);
    }
}