package bg.znestorov.sofbus24.publictransport;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.text.Html;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;

import bg.znestorov.sofbus24.databases.DroidTransDataSource;
import bg.znestorov.sofbus24.databases.ScheduleDatabaseUtils;
import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.ScheduleCacheEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.main.History;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.schedule.ScheduleCachePreferences;
import bg.znestorov.sofbus24.schedule.ScheduleVehicleFragment;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Async class used to retrieve the public transport directions from the Sofbus 24
 * database (directions' names and stations)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressWarnings("deprecation")
public class RetrievePublicTransportDirectionApi extends
        AsyncTask<Void, Void, DirectionsEntity> {

    private final Activity context;
    private final Object callerInstance;

    private final ProgressDialog progressDialog;
    private final VehicleEntity vehicle;

    private final DroidTransDataSource droidTransDataSource;

    public RetrievePublicTransportDirectionApi(Activity context,
                                               Object callerInstance, ProgressDialog progressDialog,
                                               VehicleEntity vehicle) {
        this.context = context;
        this.callerInstance = callerInstance;

        this.progressDialog = progressDialog;
        this.vehicle = vehicle;

        this.droidTransDataSource = new DroidTransDataSource(context);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected DirectionsEntity doInBackground(Void... params) {

        droidTransDataSource.open();

        // Retrieve the direction names and stations for this vehicles from the DB
        ArrayList<String> directionsNames = droidTransDataSource.
                getVehicleDirections(vehicle.getType(), vehicle.getNumber());
        ArrayList<ArrayList<StationEntity>> directionsList = new ArrayList<>();

        // In case we have any directions returned from the database, get the associated stations
        if (directionsNames != null && !directionsNames.isEmpty()) {
            for (int i = 0; i < directionsNames.size(); i++) {
                directionsList.add(droidTransDataSource.getVehicleStations(
                        vehicle.getType(), vehicle.getNumber(), (i + 1)));
            }
        }
        droidTransDataSource.close();

        DirectionsEntity ptDirectionsEntity;
        if (directionsList.isEmpty()) {
            ptDirectionsEntity = new DirectionsEntity();
        } else {
            ptDirectionsEntity = new DirectionsEntity(vehicle, 0, directionsNames, directionsList);
        }

        /**
         * Check if there is some problem with loading the schedule from the
         * SUMC site and if there is - load the local cache, otherwise - save
         * the cache into the database
         */
        if (ScheduleCachePreferences.isScheduleCacheActive(context)) {

            if (!ptDirectionsEntity.isDirectionSet()) {
                ScheduleCacheEntity scheduleCache = ScheduleDatabaseUtils
                        .getVehicleScheduleCache(context, vehicle);

                if (scheduleCache != null) {
                    ptDirectionsEntity = scheduleCache.getDirectionsEntity();
                    ptDirectionsEntity.setScheduleCacheTimestamp(scheduleCache
                            .getTimestamp());
                } else {
                    ptDirectionsEntity = new DirectionsEntity();
                }
            } else {
                ScheduleDatabaseUtils.createOrUpdateVehicleScheduleCache(
                        context, vehicle, ptDirectionsEntity);
            }
        }

        return ptDirectionsEntity;
    }

    @Override
    protected void onPostExecute(final DirectionsEntity ptDirectionsEntity) {
        super.onPostExecute(ptDirectionsEntity);

        // Check if the information is correctly retrieved from SKGT site
        if (ptDirectionsEntity.isDirectionSet()) {

            // Get the fragment manager to start the dialog fragment
            FragmentManager fragmentManager;
            if (callerInstance instanceof ScheduleVehicleFragment) {
                fragmentManager = ((ScheduleVehicleFragment) callerInstance)
                        .getChildFragmentManager();
            } else {
                fragmentManager = ((History) callerInstance)
                        .getSupportFragmentManager();
            }

            // Show the dialog fragment with the directions
            try {
                DialogFragment dialogFragment = ChooseDirectionDialog
                        .newInstance(ptDirectionsEntity);
                dialogFragment.show(fragmentManager, "dialog");
            } catch (Exception e) {
                /*
                 * Strange bug reported in GooglePlay - may be the orientation
                 * is released before the dialog fragment is shown. In this case
                 * the app crashes because the dialog tries to show after
                 * savedInstanceState() method is called.
                 *
                 * GooglePlayError: java.lang.IllegalStateException: Can not
                 * perform this action after onSaveInstanceState
                 */
            }

            // In case of loading the schedule from the local cache (and if the
            // toasts are allowed), alert the user about that
            if (ptDirectionsEntity.isScheduleCacheLoaded()) {
                ActivityTracker.queriedLocalScheduleCache(context);

                if (ScheduleCachePreferences.isScheduleCacheToastShown(context)) {

                    String vehicleTitle = ActivityUtils.getVehicleTitle(
                            context, ptDirectionsEntity.getVehicle());
                    String timestamp = ptDirectionsEntity
                            .getScheduleCacheTimestamp();

                    Toast.makeText(
                            context,
                            Html.fromHtml(context.getString(
                                    R.string.pt_schedule_cache_loaded,
                                    vehicleTitle, timestamp)),
                            Toast.LENGTH_LONG).show();
                }
            }
        } else {
            ActivityUtils.showNoInternetOrInfoToast(context);
        }

        dismissLoadingView();
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