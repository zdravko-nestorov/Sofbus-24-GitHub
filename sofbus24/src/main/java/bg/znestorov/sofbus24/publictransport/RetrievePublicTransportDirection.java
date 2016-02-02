package bg.znestorov.sofbus24.publictransport;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.text.Html;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.ScheduleDatabaseUtils;
import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.ScheduleCacheEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.main.History;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.schedule.ScheduleCachePreferences;
import bg.znestorov.sofbus24.schedule.ScheduleVehicleFragment;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Async class used to retrieve the public transport directions from the SKGT
 * site (directions' names and stations)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressWarnings("deprecation")
public class RetrievePublicTransportDirection extends
        AsyncTask<Void, Void, DirectionsEntity> {

    private final Activity context;
    private final Object callerInstance;
    private final ProgressDialog progressDialog;
    private final VehicleEntity vehicle;

    public RetrievePublicTransportDirection(Activity context,
                                            Object callerInstance, ProgressDialog progressDialog,
                                            VehicleEntity vehicle) {
        this.context = context;
        this.callerInstance = callerInstance;
        this.progressDialog = progressDialog;
        this.vehicle = vehicle;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected DirectionsEntity doInBackground(Void... params) {

        String htmlResult = null;
        DefaultHttpClient directionHttpClient = new DefaultHttpClient();
        DirectionsEntity ptDirectionsEntity;

        try {
            HttpGet directionHttpRequest = createDirectionRequest();
            htmlResult = directionHttpClient.execute(directionHttpRequest,
                    new BasicResponseHandler());

            ProcessPublicTransportDirection processPtDirection = new ProcessPublicTransportDirection(
                    context, vehicle, htmlResult);
            ptDirectionsEntity = processPtDirection.getDirectionsFromHtml();
        } catch (Exception e) {
            ptDirectionsEntity = new DirectionsEntity();
        } finally {
            directionHttpClient.getConnectionManager().shutdown();
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
     * Create HttpGet request to retrieve the information about the selected
     * vehicle
     *
     * @return a HttpGet request for the selected vehicle
     * @throws URISyntaxException
     */
    private HttpGet createDirectionRequest() throws URISyntaxException {
        HttpGet httpGet = new HttpGet();
        httpGet.setURI(new URI(createDirectionUrlAddress()));

        return httpGet;
    }

    /**
     * Create the direction URL address
     *
     * @return the URL address of the directions for the selected vehicle
     */
    private String createDirectionUrlAddress() {

        String vehicleNumber = "21-22".equals(vehicle.getNumber()) ? "22"
                : vehicle.getNumber();
        final List<NameValuePair> result = new ArrayList<NameValuePair>();

        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_DIRECTION_BUS_TYPE,
                getVehicleType(vehicle)));
        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_DIRECTION_LINE, vehicleNumber));
        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_DIRECTION_SEARCH,
                Constants.SCHEDULE_URL_DIRECTION_SEARCH_VALUE));

        String returnURL = Constants.SCHEDULE_URL_DIRECTION
                + URLEncodedUtils.format(result, "UTF-8");

        return returnURL;
    }

    /**
     * Get the corresponding vehicle type code for the vehicle type<br>
     * <ul>
     * <li>BUS - vehicle type code "1"</li>
     * <li>TROLLEY - vehicle type code "2"</li>
     * <li>TRAM - vehicle type code "0"</li>
     * </ul>
     *
     * @param vehicle the selected vehicle
     * @return the corresponding vehicle type code
     */
    private String getVehicleType(VehicleEntity vehicle) {
        String vehicleType;

        switch (vehicle.getType()) {
            case BUS:
                vehicleType = "1";
                break;
            case TROLLEY:
                vehicleType = "2";
                break;
            default:
                vehicleType = "0";
                break;
        }

        return vehicleType;
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
