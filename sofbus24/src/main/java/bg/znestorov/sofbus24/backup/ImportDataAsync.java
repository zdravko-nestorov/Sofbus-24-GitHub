package bg.znestorov.sofbus24.backup;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;

import bg.znestorov.sofbus24.entity.FileDialogActionEnum;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * An asynchronous class used to import the sofbus24 data (restore the user settings, favorites and etc.)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ImportDataAsync extends AsyncTask<Void, Void, Boolean> {

    private final FragmentActivity context;
    private final String sourceLocation;
    private final ProgressDialog progressDialog;

    public ImportDataAsync(FragmentActivity context, String sourceLocation) {

        this.context = context;
        this.sourceLocation = sourceLocation;
        this.progressDialog = new ProgressDialog(context);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected Boolean doInBackground(Void... params) {
        return new BackupData(context).importSofbus24Data(sourceLocation);
    }

    @Override
    protected void onPostExecute(Boolean isImportSuccessful) {
        super.onPostExecute(isImportSuccessful);
        dismissLoadingView();

        // Check what is the status of importing the data and show the appropriate message
        if (isImportSuccessful) {

            // Send an information to the GoogleAnalytics and show a toast
            ActivityTracker.backupApplicationSuccess(context, FileDialogActionEnum.IMPORT);
            ActivityUtils.showMiddleToast(context, context.getString(R.string.backup_import_success));

            // Wait for the toast to disappear and restart the application
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    ActivityUtils.restartApplication(context);
                }
            }, 3000);
        } else {
            // Send an information to the GoogleAnalytics and show a toast
            ActivityTracker.backupApplicationFailed(context, FileDialogActionEnum.IMPORT);
            ActivityUtils.showMiddleToast(context, context.getString(R.string.backup_import_failed));
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
            progressDialog.setMessage(context.getString(R.string.backup_import_loading));
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
            /**
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