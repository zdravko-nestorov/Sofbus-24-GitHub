package bg.znestorov.sofbus24.closest.stations.map;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.gms.maps.model.LatLng;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.RetrieveCurrentLocationTypeEnum;
import bg.znestorov.sofbus24.main.ClosestStationsList;
import bg.znestorov.sofbus24.main.ClosestStationsListDialog;
import bg.znestorov.sofbus24.main.ClosestStationsMap;
import bg.znestorov.sofbus24.main.DroidTrans;
import bg.znestorov.sofbus24.main.DroidTransDialog;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.MapUtils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Class responsible for AsyncLoad of the current location
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("StaticFieldLeak")
public class RetrieveCurrentLocation extends AsyncTask<Void, Void, Void> {

    // Different location providers
    private static final String GPS_PROVIDER = LocationManager.GPS_PROVIDER;
    private static final String NETWORK_PROVIDER = LocationManager.NETWORK_PROVIDER;
    // The minimum distance and time to for the location updates
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10;
    private static final long MIN_TIME_BETWEEN_UPDATES = 1000 * 2;
    private final FragmentActivity context;
    private final GlobalEntity globalContext;
    private final FragmentManager fragmentManager;
    private final ProgressDialog progressDialog;
    private final RetrieveCurrentLocationTypeEnum retrieveCurrentLocationType;
    // Default latitude and longitude
    private double latitude = 0.0;
    private double longitude = 0.0;
    // Location Managers responsible for the current location
    private LocationManager locationManager;
    private MyLocationListener myNetworkLocationListener;
    private MyLocationListener myGPSLocationListener;
    // Available Location providers
    private boolean areLocationServicesAvailable;
    private boolean isAnyProviderEnabled;

    public RetrieveCurrentLocation(FragmentActivity context,
                                   FragmentManager fragmentManager, ProgressDialog progressDialog,
                                   RetrieveCurrentLocationTypeEnum retrieveCurrentLocationType) {

        this.context = context;
        this.globalContext = (GlobalEntity) context.getApplicationContext();
        this.fragmentManager = fragmentManager;

        this.progressDialog = progressDialog;
        this.retrieveCurrentLocationType = retrieveCurrentLocationType;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();

        areLocationServicesAvailable = MapUtils.areLocationServicesAvailable(context);

        try {
            if (areLocationServicesAvailable) {
                locationManager = (LocationManager) context
                        .getSystemService(Context.LOCATION_SERVICE);
                registerForLocationUpdates();
            }
        } catch (Exception e) {
            isAnyProviderEnabled = false;
        }
    }

    @Override
    protected Void doInBackground(Void... params) {

        while (latitude == 0.0 && longitude == 0.0) {

            // In case of all providers are disabled - cancel the async task
            if (!isAnyProviderEnabled) {
                cancel(true);
            }

            // In case the progress dialog is dismissed - cancel the async task
            if (progressDialog != null && !progressDialog.isShowing()) {
                cancel(true);
            }

            // If the async task is cancelled stop the loop (this is needed
            // because of the RetrieveCurrentLocationTimeout async)
            if (isCancelled()) {
                break;
            }
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);

        actionsOnLocationFound();
        dismissLoadingView();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();

        actionsOnCancelled();
        dismissLoadingView();
    }

    /**
     * Create the loading view and lock the screen
     */
    private void createLoadingView() {
        ActivityUtils.lockScreenOrientation(context);

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

        try {
            if (locationManager != null) {
                if (myNetworkLocationListener != null) {
                    locationManager.removeUpdates(myNetworkLocationListener);
                }

                if (myGPSLocationListener != null) {
                    locationManager.removeUpdates(myGPSLocationListener);
                }
            }
        } catch (Exception e) {
            /**
             * Fixing a strange error that is happening sometimes when the
             * dialog is dismissed. It produces a NullPointerException, which
             * should not be possible, based on the checks above. I guess that
             * if we reach this error again, all seems to be finished already,
             * so no error is needed
             *
             * java.lang.NullPointerException: at ...(RetrieveCurrentLocation.java:182)
             */
        }

        ActivityUtils.unlockScreenOrientation(context);
    }

    /**
     * Check if any of the providers is enabled.
     * <p>
     * N.B. Permission is handled via <code>ActivityResultLauncher</code> in calling activities.
     */
    @SuppressLint("MissingPermission")
    private void registerForLocationUpdates() {

        if (locationManager != null) {
            // Getting the GPS status
            boolean isGPSEnabled = locationManager
                    .isProviderEnabled(GPS_PROVIDER);

            // Getting the network status
            boolean isNetworkEnabled = locationManager
                    .isProviderEnabled(NETWORK_PROVIDER);

            // Check if any of the providers is enabled
            isAnyProviderEnabled = isGPSEnabled || isNetworkEnabled;

            if (isAnyProviderEnabled) {
                if (isNetworkEnabled) {
                    if (myNetworkLocationListener == null) {
                        myNetworkLocationListener = new MyLocationListener(NETWORK_PROVIDER);

                        locationManager.requestLocationUpdates(
                                NETWORK_PROVIDER, MIN_TIME_BETWEEN_UPDATES,
                                MIN_DISTANCE_CHANGE_FOR_UPDATES,
                                myNetworkLocationListener);
                    }
                } else {
                    if (myNetworkLocationListener != null) {
                        locationManager
                                .removeUpdates(myNetworkLocationListener);
                        myNetworkLocationListener = null;
                    }
                }

                if (isGPSEnabled) {
                    if (myGPSLocationListener == null) {
                        myGPSLocationListener = new MyLocationListener(GPS_PROVIDER);

                        locationManager.requestLocationUpdates(GPS_PROVIDER,
                                MIN_TIME_BETWEEN_UPDATES,
                                MIN_DISTANCE_CHANGE_FOR_UPDATES,
                                myGPSLocationListener);
                    }
                } else {
                    if (myGPSLocationListener != null) {
                        locationManager.removeUpdates(myGPSLocationListener);
                        myGPSLocationListener = null;
                    }
                }
            }
        }
    }

    /**
     * Show a toast for a long period of time
     *
     * @param message the message of the toast
     */
    private void showLongToast(String message) {
        ActivityUtils.showLongToast(context, message);
    }

    /**
     * Actions when any location is found
     */
    private void actionsOnLocationFound() {

        // Check if the location is available
        if (areLocationServicesAvailable) {

            // Check which activity called the async task
            switch (retrieveCurrentLocationType) {
                case CS_MAP_INIT:
                    startClosestStationsMapActivity();
                    break;
                case CS_LIST_INIT:
                    startClosestStationsListActivity();
                    break;
                case CS_LIST_REFRESH:
                    refreshClosestStationsListActivity();
                    break;
                case DT_HOME_SCREEN:
                case DT_INIT:
                    startDroidTransActivity();
                    break;
                default:
                    refreshDroidTransActivity();
                    break;
            }
        } else {
            MapUtils.showLocationSourceDialog(fragmentManager);
        }
    }

    /**
     * Start the ClosestStationsMap activity with all needed information
     */
    private void startClosestStationsMapActivity() {
        Intent closestStationsMapIntent = new Intent(context,
                ClosestStationsMap.class);
        context.startActivity(closestStationsMapIntent);
    }

    /**
     * Start the ClosestStationsList activity with all needed information
     */
    private void startClosestStationsListActivity() {

        LatLng currentLocation = new LatLng(this.latitude, this.longitude);

        Intent closestStationsListIntent;
        if (globalContext.isPhoneDevice()) {
            closestStationsListIntent = new Intent(context,
                    ClosestStationsList.class);
        } else {
            closestStationsListIntent = new Intent(context,
                    ClosestStationsListDialog.class);
        }

        closestStationsListIntent.putExtra(
                Constants.BUNDLE_CLOSEST_STATIONS_LIST, currentLocation);
        context.startActivity(closestStationsListIntent);
    }

    /**
     * Refresh the ClosestStationsList activity
     */
    private void refreshClosestStationsListActivity() {
        LatLng currentLocation = getCurrentLocation();
        ((ClosestStationsList) context).refreshClosestStationsListFragment(currentLocation);
    }

    /**
     * Start the DroidTrans activity with all needed information
     */
    private void startDroidTransActivity() {

        Intent droidTransIntent;
        if (globalContext.isPhoneDevice()) {
            droidTransIntent = new Intent(context, DroidTrans.class);
        } else {
            droidTransIntent = new Intent(context, DroidTransDialog.class);
        }

        LatLng currentLocation = getCurrentLocation();
        switch (retrieveCurrentLocationType) {
            case DT_HOME_SCREEN:
                droidTransIntent.putExtra(
                        DroidTrans.BUNDLE_IS_DROID_TRANS_HOME_SCREEN, true);
                droidTransIntent.putExtra(Constants.BUNDLE_DROID_TRANS,
                        currentLocation);

                ActivityUtils.getHomeScreenLauncher(context).launch(droidTransIntent);
                break;
            default:
                droidTransIntent.putExtra(Constants.BUNDLE_DROID_TRANS,
                        currentLocation);

                context.startActivity(droidTransIntent);
                break;
        }
    }

    /**
     * Get current location based on the retrieved latitude and longitude.
     *
     * @return current location
     */
    private LatLng getCurrentLocation() {
        if (this.latitude != 0.0 || this.longitude != 0.0) {
            return new LatLng(this.latitude, this.longitude);
        } else {
            return new LatLng(
                    Constants.GLOBAL_PARAM_SOFIA_CENTER_LATITUDE,
                    Constants.GLOBAL_PARAM_SOFIA_CENTER_LONGITUDE);
        }
    }

    /**
     * Refresh the DroidTrans activity
     */
    private void refreshDroidTransActivity() {

        Location currentLocation;
        if (latitude != 0.0 && longitude != 0.0) {
            currentLocation = new Location("");
            currentLocation.setLatitude(latitude);
            currentLocation.setLongitude(longitude);
        } else {
            currentLocation = null;
        }

        ((DroidTrans) context).refreshDroidTransActivity(currentLocation);
    }

    /**
     * Actions on cancelled the async task.
     * <p>
     * N.B. Permission is handled via <code>ActivityResultLauncher</code> in calling activities.
     */
    @SuppressLint("MissingPermission")
    private void actionsOnCancelled() {

        Location lastKnownLocation = null;
        if (locationManager != null) {
            try {
                lastKnownLocation = locationManager
                        .getLastKnownLocation(GPS_PROVIDER) == null ? locationManager
                        .getLastKnownLocation(NETWORK_PROVIDER) == null ? null
                        : locationManager.getLastKnownLocation(NETWORK_PROVIDER)
                        : locationManager.getLastKnownLocation(GPS_PROVIDER);
            } catch (Exception e) {
                // Do nothing - unknown problem with location permissions (happens only on cancelled)
            }
        }

        // Check if there is any last known location
        if (lastKnownLocation == null) {

            switch (retrieveCurrentLocationType) {
                case CS_MAP_INIT:
                    if (progressDialog.isShowing()) {

                        // Check if the location is available
                        if (areLocationServicesAvailable) {
                            showLocationMapErrorToast();

                            Intent closestStationsMapIntent = new Intent(context,
                                    ClosestStationsMap.class);
                            context.startActivity(closestStationsMapIntent);
                        } else {
                            MapUtils.showLocationSourceDialog(fragmentManager);
                        }
                    }

                    break;
                case CS_LIST_INIT:
                    if (progressDialog.isShowing()) {

                        // Check if the location is available
                        if (areLocationServicesAvailable) {
                            showLocationErrorToast();
                        } else {
                            MapUtils.showLocationSourceDialog(fragmentManager);
                        }
                    }

                    break;
                case CS_LIST_REFRESH:

                    // Check if the location is available
                    if (areLocationServicesAvailable) {
                        showLongToast(context
                                .getString(R.string.app_location_modules_timeout_error));
                    } else {
                        MapUtils.showLocationSourceDialog(fragmentManager);
                    }

                    ((ClosestStationsList) context)
                            .refreshClosestStationsListFragmentFailed();

                    break;
                case DT_HOME_SCREEN:
                    startDroidTransActivity();

                    break;
                case DT_INIT:
                    if (progressDialog.isShowing()) {

                        // Check if the location is available
                        if (areLocationServicesAvailable) {
                            showLongToast(context
                                    .getString(R.string.app_nearest_station_init_error));
                            startDroidTransActivity();
                        } else {
                            MapUtils.showLocationSourceDialog(fragmentManager);
                        }
                    }

                    break;
                default:

                    // We should check if the progress dialog is showing, because
                    // the refresh can be stopped
                    if (progressDialog.isShowing()) {

                        // Check if the location is available
                        if (areLocationServicesAvailable) {
                            showNearestStationErrorToast();
                            refreshDroidTransActivity();
                        } else {
                            MapUtils.showLocationSourceDialog(fragmentManager);
                        }
                    }

                    break;
            }
        } else {
            actionsOnLocationFound();
        }
    }

    /**
     * Show location map modules/timeout error toast
     */
    private void showLocationMapErrorToast() {

        if (!isAnyProviderEnabled) {
            showLongToast(context
                    .getString(R.string.app_location_modules_error));
        } else {
            showLongToast(context
                    .getString(R.string.app_location_timeout_map_error));
        }
    }

    /**
     * Show location modules/timeout error toast
     */
    private void showLocationErrorToast() {

        if (!isAnyProviderEnabled) {
            showLongToast(context
                    .getString(R.string.app_location_modules_error));
        } else {
            showLongToast(context
                    .getString(R.string.app_location_timeout_error));
        }
    }

    /**
     * Show nearest station modules/timeout error toast
     */
    private void showNearestStationErrorToast() {

        if (!isAnyProviderEnabled) {
            showLongToast(context
                    .getString(R.string.app_nearest_station_modules_error));
        } else {
            showLongToast(context
                    .getString(R.string.app_nearest_station_timeout_error));
        }
    }

    private class MyLocationListener implements LocationListener {

        private final String provider;
        private boolean isValidLocation;

        public MyLocationListener(String provider) {
            this.provider = provider;
        }

        @Override
        public void onLocationChanged(Location location) {
            if (location == null) {
                return;
            }

            // Ignore the first network location and use the second one
            // https://stackoverflow.com/a/36071894
            if (NETWORK_PROVIDER.equals(provider) && !isValidLocation) {
                this.isValidLocation = true;
                return;
            }

            this.isValidLocation = true;
            latitude = location.getLatitude();
            longitude = location.getLongitude();
        }

        @Override
        public void onProviderDisabled(String provider) {
            registerForLocationUpdates();
        }

        @Override
        public void onProviderEnabled(String provider) {
            registerForLocationUpdates();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            registerForLocationUpdates();
        }
    }

}