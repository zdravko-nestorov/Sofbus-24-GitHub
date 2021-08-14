package bg.znestorov.sofbus24.utils;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.huawei.hms.maps.MapsInitializer;

import org.xms.g.location.FusedLocationProviderClient;
import org.xms.g.location.LocationCallback;
import org.xms.g.location.LocationRequest;
import org.xms.g.location.LocationResult;
import org.xms.g.location.LocationServices;
import org.xms.g.maps.SupportMapFragment;
import org.xms.g.maps.model.LatLng;
import org.xms.g.utils.Function;

import java.math.BigDecimal;

import bg.znestorov.sofbus24.closest.stations.map.LocationSourceDialog;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Utils method containing functions concerning GoogleMaps stuff
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressWarnings("ConstantConditions")
public class MapUtils {

    /**
     * Check if any of the location services is available.
     *
     * @param context the current activity context
     * @return if any of the location services is available
     */
    @SuppressWarnings("deprecation")
    public static boolean areLocationServicesAvailable(Context context) {
        String locationProviders = Settings.Secure.getString(
                context.getContentResolver(),
                Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
        return locationProviders
                .contains(LocationManager.NETWORK_PROVIDER)
                || locationProviders.contains(LocationManager.GPS_PROVIDER);
    }

    /**
     * Show a location source error dialog
     */
    public static void showLocationSourceDialog(FragmentManager fragmentManager) {
        try {
            DialogFragment dialogFragment = new LocationSourceDialog();
            dialogFragment.show(fragmentManager, "dialogFragment");
        } catch (Exception e) {
            /**
             * Fixing a strange error that is happening sometimes when the
             * dialog is created. I guess sometimes the activity gets destroyed
             * before the dialog successfully be shown.
             *
             * java.lang.IllegalStateException: Activity has been destroyed
             */
        }
    }

    /**
     * Create a current location provider client.
     *
     * @param context the current activity context
     * @return current location provider client
     */
    public static FusedLocationProviderClient getLocationProviderClient(Context context) {
        return LocationServices.getFusedLocationProviderClient(context);
    }

    /**
     * Create a location request for the updates.
     *
     * @return location request
     */
    public static LocationRequest getLocationRequest() {
        return LocationRequest.create()
                .setInterval(10_000)
                .setFastestInterval(5_000)
                .setPriority(LocationRequest.getPRIORITY_BALANCED_POWER_ACCURACY());
    }

    /**
     * Create a callback for the location updates.
     *
     * @param action action to execute after the location is changed
     * @return a callback for the location updates
     */
    public static LocationCallback getLocationCallback(Function<Location, Void> action) {
        return new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                // Check if any location result is present
                if (locationResult == null) {
                    return;
                }

                // Execute the action after a new location is found
                action.apply(locationResult.getLastLocation());
            }
        };
    }

    /**
     * Requests location updates with a callback on the specified Looper thread.
     *
     * @param providerClient   current location provider client
     * @param locationCallback callback for the location updates
     */
    public static void requestLocationUpdates(FusedLocationProviderClient providerClient,
                                              LocationCallback locationCallback) {
        if (providerClient == null || locationCallback == null) {
            return;
        }
        providerClient.requestLocationUpdates(
                getLocationRequest(), locationCallback, Looper.myLooper());
    }

    /**
     * Removes all location updates for the given location result listener.
     *
     * @param locationProviderClient current location provider client
     * @param locationCallback       callback for the location updates
     */
    public static void removeLocationUpdates(FusedLocationProviderClient locationProviderClient,
                                             LocationCallback locationCallback) {
        if (locationProviderClient == null || locationCallback == null) {
            return;
        }
        locationProviderClient.removeLocationUpdates(locationCallback);
    }

    /**
     * Get the distance between Location and Station object
     *
     * @param location1 Location object
     * @param station   Station object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(Location location1,
                                        StationEntity station) {
        try {
            return getDistance(location1, getLocation(station)).toString();
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between Location and Station object
     *
     * @param context   the current activity context
     * @param location1 Location object
     * @param station   Station object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(Activity context, Location location1,
                                        StationEntity station) {
        try {
            return formatDistance(context,
                    getDistance(location1, getLocation(station)));
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between LatLng and Station object
     *
     * @param context the current activity context
     * @param latLng1 LatLng object
     * @param station Station object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(Activity context, LatLng latLng1,
                                        StationEntity station) {
        try {
            return formatDistance(context,
                    getDistance(getLocation(latLng1), getLocation(station)));
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between LatLng and Station object
     *
     * @param latLng1 LatLng object
     * @param station Station object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(LatLng latLng1, StationEntity station) {
        try {
            return getDistance(getLocation(latLng1), getLocation(station))
                    .toString();
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between two LatLng objects
     *
     * @param latLng1 LatLng object
     * @param latLng2 LatLng object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(LatLng latLng1, LatLng latLng2) {
        try {
            return getDistance(getLocation(latLng1), getLocation(latLng2))
                    .toString();
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between two LatLng objects
     *
     * @param context the current activity context
     * @param latLng1 LatLng object
     * @param latLng2 LatLng object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(Activity context, LatLng latLng1,
                                        LatLng latLng2) {
        try {
            return formatDistance(context,
                    getDistance(getLocation(latLng1), getLocation(latLng2)));
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Check if the provided {@code lat} and {@code lon} are NOT the default Map location
     * (no location is currently found).
     *
     * @param lat current latitude
     * @param lon current longitude
     * @return if the provided coordinates are NOT the default Map location.
     */
    public static boolean isNotDefaultMapLocation(double lat, double lon) {
        return lat != 0.0 && lat != Constants.GLOBAL_PARAM_SOFIA_CENTER_LATITUDE
                && lon != 0.0 && lon != Constants.GLOBAL_PARAM_SOFIA_CENTER_LONGITUDE;
    }

    /**
     * Create Location object via LatLng one
     *
     * @param latLng the input LatLng object
     * @return a location object base on the input LatLng one
     */
    private static Location getLocation(LatLng latLng) {
        Location location = new Location("");
        location.setLatitude(latLng.getLatitude());
        location.setLongitude(latLng.getLongitude());

        return location;
    }

    /**
     * Create Location object via Station one
     *
     * @param station the input Station object
     * @return a location object base on the input Station one
     */
    private static Location getLocation(StationEntity station) {
        Location location = new Location("");
        location.setLatitude(Double.parseDouble(station.getLat()));
        location.setLongitude(Double.parseDouble(station.getLon()));

        return location;
    }

    /**
     * Get the distance between two locations and convert it to long with two
     * decimal digits
     *
     * @param location1 first location
     * @param location2 second location
     * @return the distance between the locations
     */
    private static Float getDistance(Location location1, Location location2) {
        float distanceTo = location1.distanceTo(location2);
        BigDecimal bd = new BigDecimal(distanceTo);
        BigDecimal rounded = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        distanceTo = rounded.floatValue();

        return distanceTo;
    }

    /**
     * Format the distance in kilometers and meters
     *
     * @param context the current activity context
     * @param meters  the distance in meters
     * @return the formatted distance
     */
    private static String formatDistance(Activity context, Float meters) {
        long km = (long) (meters / 1000);
        long m = (long) (meters - km * 1000);

        String distanceTo;
        if (km > 0) {
            distanceTo = km
                    + context.getString(R.string.app_distance_kilometers) + m
                    + context.getString(R.string.app_distance_meters);
        } else {
            distanceTo = m + context.getString(R.string.app_distance_meters);
        }

        return distanceTo;
    }

    /**
     * Set the HMS map API key.
     *
     * @param context the current activity context
     */
    public static void setHmsMapApiKey(Context context) {
        if (HmsUtils.isHms()) {
            MapsInitializer.setApiKey(context.getString(R.string.huawei_maps_api_2_map_release_home));
        }
    }

    /**
     * Initial map setup.
     *
     * @param context the current activity context
     * @param bundle  activity saved instance state
     * @return the {@link SupportMapFragment} associated with the current activity
     */
    public static SupportMapFragment initializeMap(FragmentActivity context, int mapId, Bundle bundle) {
        SupportMapFragment mapFragment = SupportMapFragment.dynamicCast(
                context.getSupportFragmentManager().findFragmentById(mapId));

        // Retrieve the saved instance state
        Bundle mapFragmentBundle = null;
        if (bundle != null) {
            mapFragmentBundle = bundle.getBundle(Constants.BUNDLE_MAP_FRAGMENT);
        }

        // Set the HMS map API key
        setHmsMapApiKey(context);
        mapFragment.onCreate(mapFragmentBundle);

        return mapFragment;
    }

    /**
     * Hide the HMS unsupported map modes (satellite and hybrid).
     *
     * @param menu        the options menu as last shown
     * @param menuItemIds menu item identifiers
     */
    public static void hideGmsUnsupportedMapTypes(Menu menu, Integer... menuItemIds) {
        if (HmsUtils.isGms() || menu == null || Utils.isEmpty(menuItemIds)) {
            return;
        }

        // Get the menu item with a particular identifier and hide it
        for (Integer menuItemId : menuItemIds) {
            menu.findItem(menuItemId).setVisible(false);
        }
    }

    /**
     * Hide the HMS unsupported GoogleStreetView.
     *
     * @param menu        the options menu as last shown
     * @param menuItemIds menu item identifiers
     */
    public static void hideGoogleStreetView(Menu menu, Integer... menuItemIds) {
        if (HmsUtils.isGms() || menu == null || Utils.isEmpty(menuItemIds)) {
            return;
        }

        // Get the menu item with a particular identifier and hide it
        for (Integer menuItemId : menuItemIds) {
            menu.findItem(menuItemId).setVisible(false);
        }
    }

    /**
     * Hide the HMS unsupported GoogleStreetView.
     *
     * @param streetViewButton GoogleStreetView button
     */
    public static void hideGoogleStreetView(ImageButton streetViewButton) {
        if (HmsUtils.isGms() || streetViewButton == null) {
            return;
        }

        // Hide the GoogleStreetView button
        streetViewButton.setVisibility(View.INVISIBLE);
    }
}
