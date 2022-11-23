package bg.znestorov.sofbus24.virtualboards;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.Html;
import android.text.Spanned;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.HtmlResultCodesEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.main.VirtualBoardsTime;
import bg.znestorov.sofbus24.main.VirtualBoardsTimeDialog;
import bg.znestorov.sofbus24.metro.RetrieveMetroSchedule;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * It is used to retrieve the information from the SKGT site and transform it in
 * an appropriate form, according to the activity called it
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RetrieveVirtualBoardsApi {

    private final Activity context;
    private final GlobalEntity globalContext;
    private final Object callerInstance;
    private final HtmlRequestCodesEnum htmlRequestCode;
    private final StationsDataSource stationsDatasource;
    private final FavouritesDataSource favouriteDatasource;
    private StationEntity station;
    private VehicleEntity vehicle;
    private HtmlResultCodesEnum htmlResultCode;

    public RetrieveVirtualBoardsApi(Activity context, Object callerInstance, StationEntity station,
                                    VehicleEntity vehicle, HtmlRequestCodesEnum htmlRequestCode) {

        // Set the current activity context and the object that created an instance
        // of this class
        this.context = context;
        this.globalContext = (GlobalEntity) context.getApplicationContext();
        this.callerInstance = callerInstance;

        // Set the selected station and vehicle (if any)
        this.station = station;
        this.vehicle = vehicle;

        // Set the type of call to the class
        this.htmlRequestCode = htmlRequestCode;

        // Create an instance of the stations and the favourite database
        this.stationsDatasource = new StationsDataSource(context);
        this.favouriteDatasource = new FavouritesDataSource(context);
    }

    /**
     * Retrieve the information for the selected station
     */
    public void getSumcInformation() {

        ActivityTracker.queriedVirtualBoardsInformation(context);
        ActivityTracker.queriedVirtualBoardsInformationType(context, htmlRequestCode);

        // Create the appropriate progress dialog message (if searched by HomeScreen -
        // show only the searched string, otherwise - the station caption)
        Spanned progressDialogMsg = getToastMsg(context.getString(R.string.vb_time_retrieve_info));

        // Making HttpRequest and showing a progress dialog if needed (based on station type)
        ProgressDialog progressDialog = createProgressDialog(progressDialogMsg);
        if (station != null && station.getType() != null
                && (station.getType() == VehicleTypeEnum.METRO
                || station.getType() == VehicleTypeEnum.METRO1
                || station.getType() == VehicleTypeEnum.METRO2)) {
            RetrieveMetroSchedule retrieveMetroSchedule = new RetrieveMetroSchedule(context,
                    progressDialog, station);
            retrieveMetroSchedule.execute();
        } else {
            RetrieveSumcInformation retrieveSumcInformation = new RetrieveSumcInformation(
                    progressDialog);
            retrieveSumcInformation.execute();
        }
    }

    /**
     * Processing the html result and start new activity if needed (checks for
     * all possible errors that can occur)
     *
     * @param stations the stations returned from the SKGT request or database
     */
    @SuppressLint("StaticFieldLeak")
    private void processJsonResult(List<StationEntity> stations) {

        // Hide the keyboard if it was shown because of the CAPTCHA
        ActivityUtils.hideKeyboard(context);

        switch (htmlResultCode) {
            // In case of an error with the result (no Internet or no information)
            case NO_INTERNET:
            case NO_INFORMATION:
                switch (htmlRequestCode) {
                    case REFRESH:
                        ((VirtualBoardsTime) callerInstance)
                                .refreshVirtualBoardsTimeFragment(null, getErrorMsg());
                        break;
                    case MULTIPLE_RESULTS:
                        ((VirtualBoardsFragment) callerInstance).setAdapterViaSearch(
                                new ArrayList<StationEntity>(), getErrorMsg());
                        break;
                    default:
                        Spanned progressDialogMsg = Html.fromHtml(getErrorMsg());
                        ActivityUtils.showNoInfoAlertToast(context, progressDialogMsg);
                        break;
                }

                break;
            // In case of single result (only one station found)
            case SINGLE_RESULT:
                VirtualBoardsStationEntity vbTimeStation = (VirtualBoardsStationEntity) stations.get(0);

                // Add the search into the history
                Utils.addStationInHistory(context, vbTimeStation);

                switch (htmlRequestCode) {
                    case REFRESH:
                        ((VirtualBoardsTime) callerInstance)
                                .refreshVirtualBoardsTimeFragment(vbTimeStation, null);
                        break;
                    case MULTIPLE_RESULTS:
                        ArrayList<StationEntity> stationsList = new ArrayList<>();
                        stationsList.add(vbTimeStation);
                        ((VirtualBoardsFragment) callerInstance).setAdapterViaSearch(
                                stationsList, null);

                        // If removes the break will directly open the VirtualBoards,
                        // because only one station is found
                        break;
                    default:

                        // Start the VirtualBoards activity
                        Intent vbTimeIntent;
                        if (globalContext.isPhoneDevice()) {
                            vbTimeIntent = new Intent(context, VirtualBoardsTime.class);
                        } else {
                            vbTimeIntent = new Intent(context,
                                    VirtualBoardsTimeDialog.class);
                        }
                        vbTimeIntent.putExtra(Constants.BUNDLE_VIRTUAL_BOARDS_TIME,
                                vbTimeStation);
                        context.startActivity(vbTimeIntent);

                        break;
                }

                break;
            // In case of multiple result (more than one station found)
            default:
                HashMap<String, StationEntity> stationsMap = new LinkedHashMap<>();
                for (StationEntity stationEntity : stations) {
                    stationsMap.put(stationEntity.getFormattedNumber(), stationEntity);
                }

                // Not implemented for now, as it is slow operation
                // Utils.addListOfStationsInHistory(context, stationsMap);

                switch (htmlRequestCode) {
                    case REFRESH:
                    case SINGLE_RESULT:
                        station = stationsMap.get(station.getFormattedNumber());
                        getSumcInformation();

                        break;
                    case FAVOURITES:
                        station = stationsMap.get(station.getFormattedNumber());
                        updateFavouritesStation(station);
                        getSumcInformation();

                        break;
                    default:
                        ArrayList<StationEntity> stationsList = new ArrayList<>(stationsMap.values());
                        ((VirtualBoardsFragment) callerInstance).setAdapterViaSearch(stationsList, null);

                        break;
                }

                break;
        }

    }

    /**
     * Get the toast message according to the htmlRequestCode
     *
     * @param msg the unformatted message from strings
     * @return the formatted message
     */
    private Spanned getToastMsg(String msg) {

        Spanned progressDialogMsg;
        switch (htmlRequestCode) {
            case MULTIPLE_RESULTS:
                progressDialogMsg = Html.fromHtml(String.format(msg,
                        station.getNumber()));
                break;
            default:
                progressDialogMsg = Html.fromHtml(String.format(
                        msg,
                        String.format(station.getName() + " (%s)",
                                station.getNumber())));
                break;
        }

        return progressDialogMsg;
    }

    /**
     * Form the error message. It is not Spanned type as it can't be added as
     * Bundle object.
     *
     * @return the formatted message
     */
    private String getErrorMsg() {
        String errorDialogMsg;

        switch (htmlResultCode) {
            case CAPTCHA_NEEDED:
                errorDialogMsg = context.getString(R.string.app_captcha_error);
                break;
            case NO_INFORMATION:
                switch (htmlRequestCode) {
                    case MULTIPLE_RESULTS:
                        errorDialogMsg = String.format(
                                context.getString(R.string.app_info_error),
                                station.getNumber());
                        break;
                    default:
                        errorDialogMsg = String.format(
                                context.getString(R.string.app_info_error),
                                String.format(station.getName() + " (%s)",
                                        station.getNumber()));
                        break;
                }

                break;
            default:
                errorDialogMsg = context.getString(R.string.app_internet_error);
                break;
        }

        return errorDialogMsg;
    }

    /**
     * Create a progress dialog if needed (if the instance of this class is
     * created by the REFRESH - no progress dialog needed)
     *
     * @param msg the progress dialog message
     * @return the progress dialog
     */
    private ProgressDialog createProgressDialog(Spanned msg) {
        ProgressDialog progressDialog;

        switch (htmlRequestCode) {
            case REFRESH:
                progressDialog = null;
                break;
            default:
                progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(msg);
                break;
        }

        return progressDialog;
    }

    /**
     * Update the station in the favourites database
     *
     * @param stationToUpdate the new station (fulfilled with all information)
     */
    private void updateFavouritesStation(StationEntity stationToUpdate) {
        favouriteDatasource.open();
        favouriteDatasource.updateStation(stationToUpdate);
        favouriteDatasource.close();
    }

    /**
     * Creating a request to the SUMC server to see if any CAPTCHA is required
     * to be entered as a security measure
     *
     * @author Zdravko Nestorov
     * @version 1.0
     */
    @SuppressLint("StaticFieldLeak")
    private class RetrieveSumcInformation extends AsyncTask<Void, Void, List<StationEntity>> {

        private final ProgressDialog progressDialog;

        RetrieveSumcInformation(ProgressDialog progressDialog) {
            this.progressDialog = progressDialog;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            createLoadingView();
        }

        @Override
        protected List<StationEntity> doInBackground(Void... params) {

            List<StationEntity> stations = new ArrayList<>();

            try {

                // Check if we are looking for a single result or multiple result, because
                // in case of more than one result (multiple results), we will look in the
                // the database for the stations
                if (htmlRequestCode != HtmlRequestCodesEnum.MULTIPLE_RESULTS) {

                    String jsonResult;

                    // Check if we want to retrieve the information in real time for all
                    // vehicles or just for a selected one (the previous section "Schedule"
                    // now will be used to retrieve information about the times of arrival
                    // for a selected vehicle)
                    if (vehicle != null) {
                        jsonResult = Utils.readUrl(Constants.VB_URL_VEHICLE_API,
                                station.getFormattedNumber(), vehicle.getNumber(),
                                vehicle.getType().toString().toLowerCase(Locale.getDefault()));
                    } else {
                        jsonResult = Utils.readUrl(Constants.VB_URL_STATION_API,
                                station.getFormattedNumber());
                    }

                    // Check what is the status of the JSON result
                    if (Utils.isEmpty(jsonResult)) {
                        throw new Exception();
                    } else if (jsonResult.contains("{}")
                            || !jsonResult.contains("lines")
                            || !jsonResult.contains("arrivals")
                            || !jsonResult.contains("time")) {
                        htmlResultCode = HtmlResultCodesEnum.NO_INFORMATION;
                    } else {
                        ProcessVirtualBoardsApi processVirtualBoardsApi =
                                new ProcessVirtualBoardsApi(context, jsonResult);
                        stations.add(processVirtualBoardsApi.getStationVehiclesFromJson());

                        htmlResultCode = HtmlResultCodesEnum.SINGLE_RESULT;
                    }

                } else {
                    stationsDatasource.open();
                    stations.addAll(stationsDatasource.getStationsViaSearch(
                            null, station.getNumber()));
                    stationsDatasource.close();

                    // Check what should be the return code, depending on the stations list size
                    if (stations.size() == 0) {
                        htmlResultCode = HtmlResultCodesEnum.NO_INFORMATION;
                    } else if (stations.size() == 1) {
                        htmlResultCode = HtmlResultCodesEnum.SINGLE_RESULT;
                    } else {
                        htmlResultCode = HtmlResultCodesEnum.MULTIPLE_RESULTS;
                    }
                }

            } catch (Exception e) {
                htmlResultCode = HtmlResultCodesEnum.NO_INTERNET;
            }

            return stations;
        }

        @Override
        protected void onPostExecute(List<StationEntity> stations) {
            super.onPostExecute(stations);

            processJsonResult(stations);
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

            try {
                if (progressDialog != null) {
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
            } catch (Exception e) {
                /*
                 * Fixing a strange error that is happening sometimes when the
                 * dialog is created. I guess sometimes activity gets finished
                 * before the dialog successfully shows.
                 *
                 * android.view.WindowManager$BadTokenException: Unable to add window
                 * -- token android.os.BinderProxy@433e17f8 is not valid; is your activity running?
                 */
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
                 * java.lang.IllegalArgumentException: View not attached to
                 * window manager
                 */
            }

            ActivityUtils.unlockScreenOrientation(context);
        }

    }

}