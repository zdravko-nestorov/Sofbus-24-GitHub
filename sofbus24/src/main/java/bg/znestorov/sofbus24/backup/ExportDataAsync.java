package bg.znestorov.sofbus24.backup;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;

import androidx.fragment.app.FragmentActivity;

import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * An asynchronous class used to export the sofbus24 data (save the user
 * settings, favorites and etc.).
 *
 * <p>As of the SAF migration, the destination location is no longer a
 * {@link String} file path but an {@link Uri} returned by the Storage Access
 * Framework picker.</p>
 *
 * @author Zdravko Nestorov
 * @version 2.0
 */
@SuppressLint("StaticFieldLeak")
public class ExportDataAsync extends AsyncTask<Void, Void, Boolean> {

    private final FragmentActivity context;
    private final Uri targetUri;
    private final ProgressDialog progressDialog;

    public ExportDataAsync(FragmentActivity context, Uri targetUri) {

        this.context = context;
        this.targetUri = targetUri;
        this.progressDialog = new ProgressDialog(context);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        return new BackupData(context).exportSofbus24Data(targetUri);
    }

    @Override
    protected void onPostExecute(Boolean isExportSuccessful) {
        super.onPostExecute(isExportSuccessful);
        dismissLoadingView();

        // Check what is the status of importing the data and show the appropriate message
        if (isExportSuccessful) {
            // Show a toast - use the URI display value as the resolved path may not exist
            String displayLocation = targetUri != null ? targetUri.toString() : "";
            ActivityUtils.showMiddleToast(context,
                    String.format(context.getString(R.string.backup_export_success), displayLocation));
        } else {
            // Show a toast
            ActivityUtils.showMiddleToast(context, context.getString(R.string.backup_export_failed));
        }
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();

        dismissLoadingView();
    }

    /**
     * Create the loading view and lock the screen
     */
    private void createLoadingView() {
        ActivityUtils.lockScreenOrientation(context);

        if (progressDialog != null) {
            progressDialog.setMessage(context.getString(R.string.backup_export_loading));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            progressDialog.show();
        }
    }

    /**
     * Dismiss the loading view and unlock the screen
     */
    private void dismissLoadingView() {
        try {
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e) {
            /*
             * Fixing a strange error that is happening sometimes when the
             * dialog is dismissed. I guess sometimes activity gets finished
             * before the dialog successfully dismisses.
             *
             * java.lang.IllegalArgumentException: View not attached to window
             * manager
             */
        }

        ActivityUtils.unlockScreenOrientation(context);
    }

}
