package bg.znestorov.sofbus24.about;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

import org.w3c.dom.Document;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Asynchronous class used for retrieving the application configuration from a
 * URL address and parse it to a configuration object
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RetrieveAppConfiguration extends
        AsyncTask<Void, Void, ConfigEntity> {

    private final FragmentActivity context;
    private final ProgressDialog progressDialog;
    private final boolean updateApp;

    public RetrieveAppConfiguration(FragmentActivity context,
                                    ProgressDialog progressDialog, boolean updateApp) {
        this.context = context;
        this.progressDialog = progressDialog;
        this.updateApp = updateApp;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();

        if (updateApp) {
            ActivityTracker.queriedCheckForUpdate(context);
        }
    }

    @Override
    protected ConfigEntity doInBackground(Void... params) {
        ConfigEntity appConfig = null;

        try {
            // Get the configuration as an InputStream from the station URL
            DocumentBuilderFactory factory = DocumentBuilderFactory
                    .newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new URL(Constants.CONFIGURATION_URL)
                    .openStream());

            // Create a configuration object from the Document
            appConfig = new ConfigEntity(doc);
        } catch (Exception e) {
            appConfig = new ConfigEntity(context);
            ActivityTracker.sendCaughtException(context,
                    "RetrieveAppConfiguration.doInBackground(...)",
                    "Problem with retrieving configuration", e);
        }

        return appConfig;
    }

    @Override
    protected void onPostExecute(ConfigEntity newConfig) {
        super.onPostExecute(newConfig);

        // Check if the information is successfully retrieved or an Internet
        // error occurred
        if (newConfig.isValidConfig()) {
            ConfigEntity currentConfig = new ConfigEntity(context);

            if (updateApp) {
                updateApp(currentConfig, newConfig);
            } else {
                updateDb(currentConfig, newConfig);
            }
        } else {
            ActivityUtils.showNoInternetToast(context);
        }

        dismissLoadingView();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        dismissLoadingView();
    }

    /**
     * Update the current DB if needed
     *
     * @param currentConfig the current application configuration
     * @param newConfig     the new application configuration
     */
    private void updateDb(ConfigEntity currentConfig,
                          final ConfigEntity newConfig) {

        // Check if new DB is available
        DialogFragment dialogFragment;
        if (currentConfig.getSofbus24DbVersion() < newConfig
                .getSofbus24DbVersion()) {
            dialogFragment = UpdateDatabaseDialog.newInstance(newConfig);
            dialogFragment.show(context.getSupportFragmentManager(),
                    "dialogFragment");
        } else {
            dialogFragment = UpdateInformationDialog.newInstance(context
                    .getString(R.string.about_update_db_last));
            dialogFragment.show(context.getSupportFragmentManager(),
                    "dialogFragment");
        }
    }

    /**
     * Update the application
     *
     * @param currentConfig the current application configuration
     * @param newConfig     the new application configuration
     */
    private void updateApp(ConfigEntity currentConfig, ConfigEntity newConfig) {

        // Check if new application version is available
        DialogFragment dialogFragment;
        if (currentConfig.getVersionCode() < newConfig.getVersionCode()) {
            dialogFragment = UpdateApplicationDialog.newInstance(String.format(
                    context.getString(R.string.about_update_app_new),
                    newConfig.getVersionName()));
            dialogFragment.show(context.getSupportFragmentManager(),
                    "dialogFragment");
        } else {
            dialogFragment = UpdateInformationDialog.newInstance(String.format(
                    context.getString(R.string.about_update_app_last),
                    currentConfig.getVersionName()));
            dialogFragment.show(context.getSupportFragmentManager(),
                    "dialogFragment");
        }
    }

    /**
     * Create the loading view and lock the screen
     */
    private void createLoadingView() {
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