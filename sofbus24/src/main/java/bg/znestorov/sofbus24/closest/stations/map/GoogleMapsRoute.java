package bg.znestorov.sofbus24.closest.stations.map;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;

import com.google.android.gms.maps.model.LatLng;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import bg.znestorov.sofbus24.main.ClosestStationsMap;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.HmsUtils;
import bg.znestorov.sofbus24.utils.MapUtils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Asynchronous class used to retrieve the route between a map location and a
 * station
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("StaticFieldLeak")
public class GoogleMapsRoute extends AsyncTask<Void, Void, String> {

    private final Activity context;
    private final Object callerInstance;
    private final String routeUrl;
    private final String routeUrlMapsApp;
    private final String distance;
    private ProgressDialog progressDialog;

    public GoogleMapsRoute(Activity context, Object callerInstance,
                           Location currentLocation, LatLng latLng) {
        this.context = context;
        this.callerInstance = callerInstance;

        this.routeUrl = createRouteUrl(currentLocation, latLng);
        this.routeUrlMapsApp = createRouteUrlMapsApp(currentLocation, latLng);
        this.distance = String.format(context.getString(R.string.app_distance),
                MapUtils.getMapDistance(context,
                        new LatLng(currentLocation.getLatitude(),
                                currentLocation.getLongitude()), latLng));
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected String doInBackground(Void... params) {
        return getJSONFromUrl(routeUrl);
    }

    @Override
    protected void onPostExecute(String jsonResult) {
        super.onPostExecute(jsonResult);

        // Check if inline directions navigation is available
        if (jsonResult != null && !"".equals(jsonResult) && !jsonResult.contains("REQUEST_DENIED")) {
            ((ClosestStationsMap) callerInstance).visualizeRoute(jsonResult);
            Toast.makeText(context, distance, Toast.LENGTH_SHORT).show();

        } else {
            // Check if maps directions navigation is available (GoogleMaps or PetalMaps)
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(routeUrlMapsApp));
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
                Toast.makeText(context, distance, Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(context,
                        context.getString(R.string.cs_map_fetch_route_error),
                        Toast.LENGTH_LONG).show();
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
     * Create google apis route url containing the points between the current
     * location and the selected station.
     * <p>
     * N.B. This Google Apis Route URL could not be used anymore:
     * https://stackoverflow.com/a/57229885
     *
     * @param currentLocation the current location
     * @param latLng          the selected LatLng
     * @return a google apis route url
     */
    private String createRouteUrl(Location currentLocation, LatLng latLng) {
        return "https://maps.googleapis.com/maps/api/directions/json" +
                "?origin=" + // from
                currentLocation.getLatitude() +
                "," +
                currentLocation.getLongitude() +
                "&destination=" + // to
                latLng.latitude +
                "," +
                latLng.longitude +
                "&sensor=false&mode=walking&alternatives=true&key=" +
                context.getString(R.string.google_maps_api_2_map_release_home);
    }

    /**
     * Create google maps app route url containing the origin and destination points between
     * the current location and the selected station.
     *
     * @param currentLocation the current location
     * @param latLng          the selected LatLng
     * @return a google apis route url
     */
    private String createRouteUrlMapsApp(Location currentLocation, LatLng latLng) {
        if (HmsUtils.isGms()) {
            // GoogleMaps Navigation:
            // https://developers.google.com/maps/documentation/urls/get-started#directions-action
            return "https://www.google.com/maps/dir/?api=1" +
                    "&destination=" + // to
                    latLng.latitude +
                    "," +
                    latLng.longitude +
                    "&travelmode=walking";
        } else {
            // MapKit Navigation:
            // https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/petal-maps-application-navigation-0000001060038018
            return "mapapp://navigation" +
                    "?daddr=" + // to
                    latLng.latitude +
                    "," +
                    latLng.longitude +
                    "&type=walk";
        }
    }

    /**
     * Get the JSON object from the Google apis root url address and transform
     * it to a string object
     *
     * @param routeUrl the google apis route url
     * @return string representation of the JSON result
     */
    @SuppressWarnings("deprecation")
    private String getJSONFromUrl(String routeUrl) {
        InputStream is = null;
        String jsonString;

        try {
            // Create a DefaultHttpClient and make an HTTP request
            DefaultHttpClient httpClient = new DefaultHttpClient();
            HttpPost httpPost = new HttpPost(routeUrl);

            HttpResponse httpResponse = httpClient.execute(httpPost);
            HttpEntity httpEntity = httpResponse.getEntity();
            is = httpEntity.getContent();

            // Converting the result to a string object
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    is, StandardCharsets.ISO_8859_1), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;

            while ((line = reader.readLine()) != null) {
                if (isCancelled()) {
                    break;
                }

                sb.append(line + "\n");
            }

            jsonString = sb.toString();
            is.close();
        } catch (Exception e) {
            jsonString = "";
        }

        return jsonString;
    }

    /**
     * Create the loading view and lock the screen
     */
    private void createLoadingView() {
        ActivityUtils.lockScreenOrientation(context);

        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context
                .getString(R.string.cs_map_fetch_route));
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
