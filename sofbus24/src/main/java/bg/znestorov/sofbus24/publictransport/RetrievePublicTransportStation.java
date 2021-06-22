package bg.znestorov.sofbus24.publictransport;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
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
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.PublicTransportStationEntity;
import bg.znestorov.sofbus24.entity.ScheduleCacheEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.main.PublicTransportSchedule;
import bg.znestorov.sofbus24.main.PublicTransportScheduleDialog;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.schedule.ScheduleCachePreferences;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;
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
@SuppressLint("StaticFieldLeak")
public class RetrievePublicTransportStation extends
        AsyncTask<Void, Void, PublicTransportStationEntity> {

    private final Activity context;
    private final GlobalEntity globalContext;
    private final ProgressDialog progressDialog;
    private final DirectionsEntity ptDirectionsEntity;
    private final int activeDirection;
    private PublicTransportStationEntity ptStation;

    public RetrievePublicTransportStation(Activity context,
                                          ProgressDialog progressDialog,
                                          PublicTransportStationEntity ptStation,
                                          DirectionsEntity ptDirectionsEntity) {

        this.context = context;
        this.globalContext = (GlobalEntity) context.getApplicationContext();
        this.progressDialog = progressDialog;

        this.ptStation = ptStation;
        this.ptDirectionsEntity = ptDirectionsEntity;

        this.activeDirection = ptDirectionsEntity.getActiveDirection();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        ActivityTracker.queriedScheduleInformation(context);
        createLoadingView();
    }

    @Override
    protected PublicTransportStationEntity doInBackground(Void... params) {

        String htmlResult = null;
        VehicleEntity vehicle = ptDirectionsEntity.getVehicle();
        DefaultHttpClient stationHttpClient = new DefaultHttpClient();

        try {
            HttpGet stationHttpRequest = createStationRequest();
            htmlResult = stationHttpClient.execute(stationHttpRequest,
                    new BasicResponseHandler());

            ProcessPublicTransportStation processPtStation = new ProcessPublicTransportStation(
                    context, ptStation, htmlResult);
            ptStation = processPtStation.getStationFromHtml();
        } catch (Exception e) {
            // Do nothing - the schedule is not already set
        } finally {
            stationHttpClient.getConnectionManager().shutdown();
        }

        /**
         * Check if there is some problem with loading the schedule from the
         * SUMC site and if there is - load the local cache, otherwise - save
         * the cache into the database
         */
        if (ScheduleCachePreferences.isScheduleCacheActive(context)) {

            if (!ptStation.isScheduleSet()) {
                ScheduleCacheEntity scheduleCache = ScheduleDatabaseUtils
                        .getStationScheduleCache(context, vehicle, ptStation);

                if (scheduleCache != null) {
                    ptStation = scheduleCache.getPTStationEntity();
                    ptStation.setScheduleCacheTimestamp(scheduleCache
                            .getTimestamp());
                }
            } else {
                ScheduleDatabaseUtils.createOrUpdateStationScheduleCache(
                        context, vehicle, ptStation);
            }
        }

        return ptStation;
    }

    @Override
    protected void onPostExecute(final PublicTransportStationEntity ptStation) {
        super.onPostExecute(ptStation);

        // Check if the information is correctly retrieved from SKGT site
        if (ptStation.isScheduleSet()) {
            Utils.addStationInHistory(context, ptStation);

            Intent ptScheduleIntent;
            if (globalContext.isPhoneDevice()) {
                ptScheduleIntent = new Intent(context,
                        PublicTransportSchedule.class);
            } else {
                ptScheduleIntent = new Intent(context,
                        PublicTransportScheduleDialog.class);
            }

            ptScheduleIntent.putExtra(
                    Constants.BUNDLE_PUBLIC_TRANSPORT_SCHEDULE, ptStation);
            ptScheduleIntent.putExtra(
                    Constants.BUNDLE_PUBLIC_TRANSPORT_VEHICLE,
                    ptDirectionsEntity.getVehicle());

            context.startActivity(ptScheduleIntent);

            // In case of loading the schedule from the local cache (and if the
            // toasts are allowed), alert the user about that
            if (ptStation.isScheduleCacheLoaded()) {
                ActivityTracker.queriedLocalScheduleCache(context);

                if (ScheduleCachePreferences.isScheduleCacheToastShown(context)) {

                    String stationTitle = ActivityUtils
                            .getStationTitle(ptStation);
                    String timestamp = ptStation.getScheduleCacheTimestamp();

                    Toast.makeText(
                            context,
                            Html.fromHtml(context.getString(
                                    R.string.pt_schedule_cache_loaded,
                                    stationTitle, timestamp)),
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
    private HttpGet createStationRequest() throws URISyntaxException {
        HttpGet httpGet = new HttpGet();
        httpGet.setURI(new URI(createStationUrlAddress()));

        return httpGet;
    }

    /**
     * Create the station URL address
     *
     * @return the URL address of the selected station
     */
    private String createStationUrlAddress() {
        final List<NameValuePair> result = new ArrayList<NameValuePair>();

        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_STATION_SCHEDULE_STOP, ptStation.getId()));
        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_STATION_SCHEDULE_CH,
                Constants.SCHEDULE_URL_STATION_SCHEDULE_CH_VALUE));
        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_STATION_SCHEDULE_VT, ptDirectionsEntity
                .getVt().get(activeDirection)));
        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_STATION_SCHEDULE_VT, ptDirectionsEntity
                .getVt().get(activeDirection)));
        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_STATION_SCHEDULE_LID, ptDirectionsEntity
                .getLid().get(activeDirection)));
        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_STATION_SCHEDULE_RID, ptDirectionsEntity
                .getRid().get(activeDirection)));
        result.add(new BasicNameValuePair(
                Constants.SCHEDULE_URL_STATION_SCHEDULE_H,
                Constants.SCHEDULE_URL_STATION_SCHEDULE_H_VALUE));

        String returnURL = Constants.SCHEDULE_URL_STATION_SCHEDULE
                + URLEncodedUtils.format(result, "UTF-8");

        return returnURL;
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