package bg.znestorov.sofbus24.about;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;

import bg.znestorov.sofbus24.databases.Sofbus24SQLite;
import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Asynchronous class used for retrieving the Databases from URL addresses and
 * replace the existing ones in the memory
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("StaticFieldLeak")
class RetrieveDatabases extends
        AsyncTask<Void, Void, HashMap<String, InputStream>> {

    private final FragmentActivity context;
    private final ProgressDialog progressDialog;
    private final ConfigEntity newConfig;

    public RetrieveDatabases(FragmentActivity context,
                             ProgressDialog progressDialog, ConfigEntity newConfig) {

        this.context = context;
        this.progressDialog = progressDialog;
        this.newConfig = newConfig;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected HashMap<String, InputStream> doInBackground(Void... params) {

        HashMap<String, InputStream> databases = new HashMap<String, InputStream>();

        try {
            databases.put(Constants.CONFIGURATION_PREF_SOFBUS24_KEY, new URL(
                    Constants.CONFIGURATION_SOFBUS_24_DB_URL).openStream());

            // Check if DB should be updated
            if (databases.size() > 0) {
                InputStream dbInputStream;

                // Check if the STATIONS DB should be updated
                dbInputStream = databases
                        .get(Constants.CONFIGURATION_PREF_SOFBUS24_KEY);
                if (dbInputStream != null) {
                    createSofbusDbInFiles(dbInputStream);
                }
            }
        } catch (Exception e) {
            databases.clear();
            ActivityTracker.sendCaughtException(context,
                    "RetrieveDatabases.doInBackground(...)",
                    "Problem with retrieving DB", e);
        }

        return databases;
    }

    @Override
    protected void onPostExecute(HashMap<String, InputStream> databases) {
        super.onPostExecute(databases);

        if (databases.size() > 0) {
            Configuration.editDbConfigurationVersionField(context, newConfig);
        }

        // Check if this is an user update (progressDialog is not null)
        if (progressDialog != null) {

            // Check if the information is successfully retrieved or an Internet
            // error occurred
            if (databases.size() > 0) {
                DialogFragment dialogFragment = RestartApplicationDialog
                        .newInstance();
                dialogFragment.show(context.getSupportFragmentManager(),
                        "dialog");
            } else {
                ActivityUtils.showNoInternetToast(context);
            }
        }

        dismissLoadingView();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        dismissLoadingView();
    }

    /**
     * Replace the existing Sofbus 24 DB in files folder with the one that was
     * download from the URL address
     *
     * @param dbInputStream the stations DB input stream
     * @throws Exception
     */
    private void createSofbusDbInFiles(InputStream dbInputStream)
            throws Exception {

        context.deleteFile(Sofbus24SQLite.DB_NAME);

        FileOutputStream dbOutputStream = null;
        try {
            dbOutputStream = context.openFileOutput(Sofbus24SQLite.DB_NAME,
                    Context.MODE_PRIVATE);
            byte[] buf = new byte[1024];
            int len;
            while ((len = dbInputStream.read(buf)) > 0) {
                dbOutputStream.write(buf, 0, len);
            }
        } finally {
            dbOutputStream.close();
            dbInputStream.close();
        }
    }

    /**
     * Create the loading view and lock the screen
     */
    private void createLoadingView() {

        if (progressDialog != null) {
            ActivityUtils.lockScreenOrientation(context);

            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog
                    .setOnCancelListener(new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialog) {
                            cancel(true);
                        }
                    });
            progressDialog.show();
        }
    }

    /**
     * Dismiss the loading view and unlock the screen
     */
    private void dismissLoadingView() {
        if (progressDialog != null) {
            progressDialog.dismiss();

            ActivityUtils.unlockScreenOrientation(context);
        }
    }
}