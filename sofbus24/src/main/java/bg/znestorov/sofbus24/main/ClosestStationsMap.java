package bg.znestorov.sofbus24.main;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bg.znestorov.sofbus24.closest.stations.map.GoogleMapsRoute;
import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.databases.VehiclesDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.SortTypeEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.gcm.GcmUtils;
import bg.znestorov.sofbus24.metro.RetrieveMetroSchedule;
import bg.znestorov.sofbus24.navigation.NavDrawerArrayAdapter;
import bg.znestorov.sofbus24.navigation.NavDrawerHelper;
import bg.znestorov.sofbus24.permissions.AppPermissions;
import bg.znestorov.sofbus24.permissions.PermissionsUtils;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.AppLifecycleListener;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;

/**
 * Activity visualizing the google maps with all stations
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressWarnings("deprecation")
public class ClosestStationsMap extends FragmentActivity implements OnMapReadyCallback {

    public static final String BUNDLE_IS_CS_MAP_HOME_SCREEN = "IS CLOSEST STATIONS MAP HOME SCREEN";
    private static final String GPS_PROVIDER = LocationManager.GPS_PROVIDER;
    private static final String NETWORK_PROVIDER = LocationManager.NETWORK_PROVIDER;
    private final List<Polyline> routePolylineList = new ArrayList<Polyline>();
    /**
     * Connect each point over the map with the appropriate station
     */
    private final HashMap<String, StationEntity> markersAndStations = new HashMap<String, StationEntity>();
    private FragmentActivity context;
    /**
     * Listener used to check which marker snippet is pressed
     */
    private final OnInfoWindowClickListener onInfoWindowClickListener = new OnInfoWindowClickListener() {
        @Override
        public void onInfoWindowClick(Marker marker) {
            // Get the station associated to this marker
            StationEntity station = markersAndStations.get(marker.getId());
            processWithStationResult(station);
        }
    };
    private GlobalEntity globalContext;
    private AppLifecycleListener observer;
    private boolean isCSMapHomeScreen;
    private StationsDataSource stationsDatasource;
    private VehiclesDataSource vehiclesDatasource;
    private FavouritesDataSource favouritesDatasource;
    private ActionBar actionBar;
    private String markerType;
    private String markerOptions;
    private boolean positionFocus;
    private BigDecimal stationsRadius;
    private GoogleMap googleMap;
    private Location previousLocation;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private NavDrawerArrayAdapter mMenuAdapter;
    /**
     * Indicates if my location has been already focused
     */
    private boolean isMyLocationAlreadyFocused = false;
    /**
     * Indicates which marker is selected on the map (in case no selection -
     * null)
     */
    private LatLng selectedMarkerLatLng;
    /**
     * Listener used to check when the map is pressed
     */
    private final OnMapClickListener onMapClickListener = new OnMapClickListener() {
        @Override
        public void onMapClick(LatLng point) {
            onMapTouchEvent(point);
        }
    };
    /**
     * Listener used to check when the map is longed pressed
     */
    private final OnMapLongClickListener onMapLongClickListener = new OnMapLongClickListener() {
        @Override
        public void onMapLongClick(LatLng point) {
            onMapTouchEvent(point);
        }
    };
    /**
     * Listener used to check which marker is clicked
     */
    private final OnMarkerClickListener onMarkerClickListener = new OnMarkerClickListener() {
        @Override
        public boolean onMarkerClick(Marker marker) {

            boolean showSnippetOfInformation = !markerOptions
                    .equals(Constants.PREFERENCE_DEFAULT_VALUE_MARKER_OPTIONS_SCHEDULE_NO_SNIPPET);

            // Check if the snippet of information should be shown
            if (showSnippetOfInformation) {

                if (!marker.isInfoWindowShown()) {
                    StationEntity station = markersAndStations.get(marker
                            .getId());
                    selectedMarkerLatLng = new LatLng(
                            Double.parseDouble(station.getLat()),
                            Double.parseDouble(station.getLon()));
                } else {
                    selectedMarkerLatLng = null;
                }

                // Check if we should open the virtual boards activity directly
                if (markerOptions
                        .equals(Constants.PREFERENCE_DEFAULT_VALUE_MARKER_OPTIONS_SCHEDULE)) {
                    // Get the station associated to this marker
                    StationEntity station = markersAndStations.get(marker
                            .getId());
                    processWithStationResult(station);
                }

                return false;
            } else {
                // Get the station associated to this marker
                StationEntity station = markersAndStations.get(marker.getId());
                processWithStationResult(station);

                return true;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_closest_stations_map);

        // Get the current activity context and get an instance of the
        // StationsDatasource
        context = ClosestStationsMap.this;
        globalContext = (GlobalEntity) getApplicationContext();
        isCSMapHomeScreen = getIntent().getExtras() != null && getIntent()
                .getExtras().getBoolean(BUNDLE_IS_CS_MAP_HOME_SCREEN, false);
        stationsDatasource = new StationsDataSource(context);
        vehiclesDatasource = new VehiclesDataSource(context);
        favouritesDatasource = new FavouritesDataSource(context);

        ActivityUtils.showHomeActivtyChangedToast(context,
                getString(R.string.navigation_drawer_home_map));

        getSharedPreferencesFields();
        initActionBar();
        initGoogleMaps();

        if (isCSMapHomeScreen) {
            if (savedInstanceState == null) {
                // Not needed anymore - only the GCM notifications can inform
                // the user about any actions
                // Utils.checkForUpdate(context, UpdateTypeEnum.APP);
                GcmUtils.processGcmNotification(context,
                        getSupportFragmentManager());
                ActivityTracker.homeScreenUsed(context,
                        "Closest Stations Map (Home Screen)");
            }

            initNavigationDrawer();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        PermissionsUtils.removeLifecycleObserver(observer);
    }

    /**
     * Permission is handled via <code>ActivityResultLauncher</code>.
     */
    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;

        // Enabling MyLocation Layer of Google Map and the corresponding
        // buttons
        googleMap.setMyLocationEnabled(true);
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.getUiSettings().setCompassEnabled(true);
        googleMap.getUiSettings().setZoomControlsEnabled(true);

        // Enable the GoogleMap listeners
        googleMap.setOnMapClickListener(onMapClickListener);
        googleMap.setOnMapLongClickListener(onMapLongClickListener);

        // Activate my location, set a location button that center the map
        // over a point and start a LocationChangeListener
        googleMap.setMyLocationEnabled(true);
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap
                .setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
                    @Override
                    public void onMyLocationChange(Location currentLocation) {
                        // Check if there is any found location and if the
                        // distance between it and previous one (if exists)
                        // is more than 20 meters
                        if (currentLocation != null
                                && (previousLocation == null || previousLocation
                                .distanceTo(currentLocation) > 20f)) {
                            // Get the current location as previous now
                            previousLocation = currentLocation;

                            // Proceed with all needed actions when a new
                            // location is found
                            onLocationChanged(currentLocation);
                        }
                    }
                });

        // Start a new thread - just to wait 3 sec and if no location is
        // found to display the last known location
        Handler handler = new Handler();

        try {
            Runnable myRunnable = new Runnable() {
                public void run() {
                    try {
                        if (previousLocation == null) {
                            // Getting LocationManager object from System
                            // Service LOCATION_SERVICE
                            LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

                            // Getting Current Location
                            Location location = locationManager
                                    .getLastKnownLocation(GPS_PROVIDER) == null ? locationManager
                                    .getLastKnownLocation(NETWORK_PROVIDER) == null ? null
                                    : locationManager
                                    .getLastKnownLocation(NETWORK_PROVIDER)
                                    : locationManager
                                    .getLastKnownLocation(GPS_PROVIDER);

                            // Check if any location is found. If no - just
                            // center the map over the center of Sofia
                            if (location != null) {
                                // Assign a value to the previous location
                                previousLocation = location;

                                // Showing the current location and zoom it
                                // in
                                // GoogleMaps
                                animateMapFocus(location, 16);

                                // Visualize the closest stations to the new
                                // location
                                new LoadStationsFromDb(context,
                                        vehiclesDatasource, location, null)
                                        .execute();
                            } else {
                                // Sofia center location
                                Location centerStationLocation = new Location(
                                        "no_location");
                                centerStationLocation
                                        .setLatitude(Constants.GLOBAL_PARAM_SOFIA_CENTER_LATITUDE);
                                centerStationLocation
                                        .setLongitude(Constants.GLOBAL_PARAM_SOFIA_CENTER_LONGITUDE);

                                // Assign a value to the previous location
                                previousLocation = centerStationLocation;

                                // Showing the Sofia center location and
                                // zoom it
                                // in GoogleMaps
                                animateMapFocus(centerStationLocation, 14);

                                // Visualize the closest stations to the
                                // Sofia
                                // center location
                                new LoadStationsFromDb(context,
                                        vehiclesDatasource,
                                        centerStationLocation, null)
                                        .execute();
                            }
                        }
                    } catch (Exception e) {
                    }
                }
            };

            handler.postDelayed(myRunnable, isCSMapHomeScreen ? 1000 : 3000);
        } catch (Exception e) {
            /*
             * Strange bug from GooglePlayConsole (Last reported: 9 Jan
             * 15:57):
             *
             * java.lang.NullPointerException at
             * bg.znestorov.sofbus24.main.ClosestStationsMap
             * .onOptionsItemSelected(ClosestStationsMap.java:352)
             */
        }

        // Visualize the favorites stations on the map
        new LoadStationsFromDb(context, vehiclesDatasource, null, null)
                .execute();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (globalContext.isHasToRestart()) {
            context.setResult(HomeScreenSelect.RESULT_CODE_ACTIVITY_RESTART);
            context.finish();
        }
    }

    @Override
    public void onBackPressed() {
        setResult(HomeScreenSelect.RESULT_CODE_ACTIVITY_FINISH, new Intent());
        finish();
    }

    /**
     * Get the values from the SharedPreferences file (positionFocus and
     * stationsRadius)
     */
    private void getSharedPreferencesFields() {
        // Get SharedPreferences from option menu
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);

        // Get "markerOptions" value from the SharedPreferences file
        markerType = sharedPreferences.getString(
                Constants.PREFERENCE_KEY_MARKER_TYPE,
                Constants.PREFERENCE_DEFAULT_VALUE_MARKER_TYPE);

        // Get "markerOptions" value from the SharedPreferences file
        markerOptions = sharedPreferences.getString(
                Constants.PREFERENCE_KEY_MARKER_OPTIONS,
                Constants.PREFERENCE_DEFAULT_VALUE_MARKER_OPTIONS);

        // Get "positionFocus" value from the SharedPreferences file
        positionFocus = sharedPreferences.getBoolean(
                Constants.PREFERENCE_KEY_POSITION_FOCUS,
                Constants.PREFERENCE_DEFAULT_VALUE_POSITION_FOCUS);

        // Get "stationsFocus" value from the SharedPreferences file
        stationsRadius = new BigDecimal(sharedPreferences.getString(
                Constants.PREFERENCE_KEY_STATIONS_RADIUS,
                Constants.PREFERENCE_DEFAULT_VALUE_STATIONS_RADIUS));
    }

    /**
     * Set up the action bar
     */
    private void initActionBar() {
        actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.cs_map_title));
    }

    /**
     * Set the ActionBar subtitle - it depends on the stations nearby
     *
     * @param closestStationsCount the count of the nearby stations
     */
    private void setActionBarSubTitle(int closestStationsCount) {
        actionBar.setSubtitle(getString(R.string.cs_map_subtitle,
                stationsRadius, closestStationsCount + ""));
    }

    /**
     * Initialize the GoogleMaps and show the current location to the user
     */
    private void initGoogleMaps() {
        // Verify that the Google Play services APK is available and up-to-date
        // on this device
        int status = GooglePlayServicesUtil
                .isGooglePlayServicesAvailable(context);

        // Check if Google Play Services are available or not
        if (status != ConnectionResult.SUCCESS) {
            int requestCode = 10;
            Dialog dialog = GooglePlayServicesUtil.getErrorDialog(status, this,
                    requestCode);
            dialog.show();
        } else {
            // Register lifecycle observer, request location permissions retrieve the GoogleMap
            observer = PermissionsUtils.addLifecycleObserver(this, AppPermissions.LOCATION, () -> {

                // Getting reference to the SupportMapFragment of activity layout
                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.closest_stations_map);

                // Getting GoogleMap object from the fragment
                if (mapFragment != null) {
                    mapFragment.getMapAsync(this);
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.activity_closest_stations_maps_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        MenuItem favoritesItem = menu.findItem(R.id.action_gm_map_favorites);
        MenuItem droidtransItem = menu.findItem(R.id.action_gm_map_droidtrans);

        if (isCSMapHomeScreen) {
            favoritesItem.setVisible(true);
            droidtransItem.setVisible(true);
        } else {
            favoritesItem.setVisible(false);
            droidtransItem.setVisible(false);
        }

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerLayout != null && mDrawerList != null
                && item.getItemId() != android.R.id.home) {
            mDrawerLayout.closeDrawer(mDrawerList);
        }

        switch (item.getItemId()) {
            case android.R.id.home:
                if (isCSMapHomeScreen) {
                    if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
                        mDrawerLayout.closeDrawer(mDrawerList);
                    } else {
                        mDrawerLayout.openDrawer(mDrawerList);
                    }
                } else {
                    finish();
                }

                return true;
            case R.id.action_gm_map_favorites:
                Intent favouritesIntent;
                if (globalContext.isPhoneDevice()) {
                    favouritesIntent = new Intent(context, Favourites.class);
                } else {
                    favouritesIntent = new Intent(context, FavouritesDialog.class);
                }

                startActivity(favouritesIntent);

                return true;
            case R.id.action_gm_map_droidtrans:
                ActivityUtils.startDroidTrans(context, getSupportFragmentManager(),
                        false);

                return true;
            case R.id.action_gm_map_clear:
                googleMap.clear();
                isMyLocationAlreadyFocused = false;
                selectedMarkerLatLng = null;
                previousLocation = null;

                initGoogleMaps();
                Toast.makeText(context, getString(R.string.cs_map_clear_info),
                        Toast.LENGTH_SHORT).show();

                return true;
            case R.id.action_gm_map_route:
                deleteRoute();

                if (googleMap.getMyLocation() != null) {
                    if (selectedMarkerLatLng != null) {
                        GoogleMapsRoute googleMapsRoute = new GoogleMapsRoute(
                                context, this, googleMap.getMyLocation(),
                                selectedMarkerLatLng);
                        googleMapsRoute.execute();
                    } else {
                        Toast.makeText(context,
                                getString(R.string.cs_map_route_error),
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(context,
                            getString(R.string.cs_map_location_error),
                            Toast.LENGTH_SHORT).show();
                }

                return true;
            case R.id.action_gm_map_gsv:
                if (globalContext.isGoogleStreetViewAvailable()) {
                    if (selectedMarkerLatLng != null) {
                        Uri streetViewUri = Uri.parse("google.streetview:cbll="
                                + selectedMarkerLatLng.latitude + ","
                                + selectedMarkerLatLng.longitude
                                + "&cbp=1,90,,0,1.0&mz=20");
                        Intent streetViewIntent = new Intent(Intent.ACTION_VIEW,
                                streetViewUri);
                        startActivity(streetViewIntent);
                    } else {
                        Toast.makeText(context,
                                getString(R.string.app_no_station_selected_error),
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    ActivityUtils
                            .showGoogleStreetViewErrorDialog(ClosestStationsMap.this);
                }

                return true;
            case R.id.action_gm_map_traffic:
                if (googleMap.isTrafficEnabled()) {
                    googleMap.setTrafficEnabled(false);
                    Toast.makeText(context,
                            getString(R.string.cs_map_traffic_off_info),
                            Toast.LENGTH_SHORT).show();
                } else {
                    googleMap.setTrafficEnabled(true);
                    Toast.makeText(context,
                            getString(R.string.cs_map_traffic_on_info),
                            Toast.LENGTH_SHORT).show();
                }

                return true;
            case R.id.action_gm_map_mode_normal:
                googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                Toast.makeText(context,
                        Html.fromHtml(getString(R.string.cs_map_normal)),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_gm_map_mode_terrain:
                googleMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                Toast.makeText(context,
                        Html.fromHtml(getString(R.string.cs_map_terrain)),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_gm_map_mode_satellite:
                googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                Toast.makeText(context,
                        Html.fromHtml(getString(R.string.cs_map_satellite)),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_gm_map_mode_hybrid:
                googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                Toast.makeText(context,
                        Html.fromHtml(getString(R.string.cs_map_hybrid)),
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Actions on location changes
     *
     * @param location the new location
     */
    private void onLocationChanged(Location location) {
        // Showing the current location and zoom it in GoogleMaps
        animateMapFocus(location, false);

        // Visualize the closest stations to the new location
        new LoadStationsFromDb(context, vehiclesDatasource, location, null)
                .execute();
    }

    /**
     * Trigger the events that happens on onMapClick and onMapLongClick
     *
     * @param point the tapped point
     */
    private void onMapTouchEvent(LatLng point) {
        // Indicates that no marker is selected
        selectedMarkerLatLng = null;

        // Create a location object according to the tapped position
        Location tapLocation = new Location("");
        tapLocation.setLatitude(point.latitude);
        tapLocation.setLongitude(point.longitude);

        // Showing the current location and zoom it in GoogleMaps
        animateMapFocus(tapLocation, true);

        // Visualize the closest station to the new location
        new LoadStationsFromDb(context, vehiclesDatasource, tapLocation,
                getString(R.string.cs_map_closest_stations)).execute();
    }

    /**
     * Construct a CameraPosition focusing on Mountain View and animate the
     * camera to that position
     *
     * @param location  the location of the station over the map (using Location
     *                  object)
     * @param isPressed indicates if the location is retrieved by tap over the map
     */
    private void animateMapFocus(Location location, boolean isPressed) {
        // Check if the map should be focused over the new location
        if (positionFocus || isPressed || !isMyLocationAlreadyFocused) {

            // Check if the current location was already focused
            if (!isMyLocationAlreadyFocused) {
                isMyLocationAlreadyFocused = true;
            }

            // Focus the map over the new location
            CameraPosition cameraPosition;

            // If the this action is triggered because of Map click - do not
            // zoom to this location
            if (!isPressed) {
                cameraPosition = new CameraPosition.Builder()
                        .target(new LatLng(location.getLatitude(), location
                                .getLongitude())).zoom(16).build();
            } else {
                cameraPosition = new CameraPosition.Builder()
                        .target(new LatLng(location.getLatitude(), location
                                .getLongitude()))
                        .zoom(googleMap.getCameraPosition().zoom).build();
            }

            googleMap.animateCamera(CameraUpdateFactory
                    .newCameraPosition(cameraPosition));
        }
    }

    /**
     * Construct a CameraPosition focusing on Mountain View and animate the
     * camera to that position (used when the camera is focused on the
     * LastKnownLocation, because if a new one is found to be focused over it)
     *
     * @param location the location of the station over the map (using Location
     *                 object)
     * @param zoom     the requested zoom of the map
     */
    private void animateMapFocus(Location location, int zoom) {
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(location.getLatitude(), location
                        .getLongitude())).zoom(zoom).build();

        googleMap.animateCamera(CameraUpdateFactory
                .newCameraPosition(cameraPosition));
    }

    /**
     * Get the closest stations to the location according to the radius from
     * SharedPreferences file
     *
     * @param location the location of the station over the map (using Location
     *                 object)
     * @return an ArrayList containing all stations in the stations radius
     */
    private ArrayList<StationEntity> getClosestStations(Location location) {
        ArrayList<StationEntity> closestStations = new ArrayList<StationEntity>();

        stationsDatasource.open();
        closestStations.addAll(stationsDatasource.getClosestStations(context,
                new LatLng(location.getLatitude(), location.getLongitude()),
                stationsRadius));
        stationsDatasource.close();

        return closestStations;
    }

    /**
     * Get a list with all stations marked as favorites
     *
     * @return an ArrayList containing all favorites stations
     */
    private ArrayList<StationEntity> getFavouritesStations() {
        ArrayList<StationEntity> favouritesStations = new ArrayList<StationEntity>();

        favouritesDatasource.open();
        favouritesStations.addAll(favouritesDatasource
                .getAllStationsSorted(SortTypeEnum.CUSTOM));
        favouritesDatasource.close();

        return favouritesStations;
    }

    /**
     * Visualize the closest station over a map location on the GoogleMaps
     *
     * @param location        the location of the station over the map (using Location
     *                        object)
     * @param closestStations the closest stations to map location
     */
    private void visualizeClosestStations(Location location,
                                          List<StationEntity> closestStations) {

        // Process all stations of the public transport route
        for (int i = 0; i < closestStations.size(); i++) {
            StationEntity station = closestStations.get(i);

            // Create the marker over the map only if the station has
            // coordinates in the database
            if (station != null && station.hasCoordinates()) {
                LatLng stationLocation = new LatLng(Double.parseDouble(station
                        .getLat()), Double.parseDouble(station.getLon()));

                // Create a marker on the station location and set some options
                MarkerOptions stationMarkerOptions = new MarkerOptions()
                        .position(stationLocation)
                        .title(String.format(station.getName() + " (%s)",
                                station.getNumber()))
                        .snippet(getStationTypeText(station));

                // Assign an icon to the marker (according to the user choice)
                if (Constants.PREFERENCE_DEFAULT_VALUE_MARKER_TYPE
                        .equals(markerType)) {
                    stationMarkerOptions = stationMarkerOptions
                            .icon(BitmapDescriptorFactory
                                    .fromResource(getMarkerIcon(station)));
                }

                Marker marker = googleMap.addMarker(stationMarkerOptions);

                // Associate the marker and the station
                markersAndStations.put(marker.getId(), station);
            }
        }

        // Set a listeners over the markers
        googleMap.setOnMarkerClickListener(onMarkerClickListener);
        googleMap.setOnInfoWindowClickListener(onInfoWindowClickListener);

        // Set the ActionBar subtitle with the number of stations nearby
        setActionBarSubTitle(closestStations.size());
    }

    /**
     * Visualize the closest station over a map location on the GoogleMaps
     *
     * @param favouritesStations the favourites stations
     */
    private void visualizeFavouritesStations(
            List<StationEntity> favouritesStations) {
        // Process all stations of the public transport route
        for (int i = 0; i < favouritesStations.size(); i++) {
            StationEntity station = favouritesStations.get(i);

            // Create the marker over the map only if the station has
            // coordinates in the database
            if (station.hasCoordinates()) {
                LatLng stationLocation = new LatLng(Double.parseDouble(station
                        .getLat()), Double.parseDouble(station.getLon()));

                // Create a marker on the station location and set some options
                MarkerOptions stationMarkerOptions = new MarkerOptions()
                        .position(stationLocation)
                        .title(String.format(station.getName() + " (%s)",
                                station.getNumber()))
                        .snippet(getStationTypeText(station));

                // Assign an icon to the marker (according to the user choice)
                if (!Constants.PREFERENCE_DEFAULT_VALUE_MARKER_TYPE
                        .equals(markerType)) {
                    stationMarkerOptions = stationMarkerOptions
                            .icon(BitmapDescriptorFactory
                                    .fromResource(R.drawable.ic_fav_full));
                } else {
                    stationMarkerOptions = stationMarkerOptions
                            .icon(BitmapDescriptorFactory
                                    .fromResource(R.drawable.ic_favorites_map_marker));
                }

                Marker marker = googleMap.addMarker(stationMarkerOptions);

                // Associate the marker and the station
                markersAndStations.put(marker.getId(), station);
            }
        }

        // Set a listeners over the markers
        googleMap.setOnMarkerClickListener(onMarkerClickListener);
        googleMap.setOnInfoWindowClickListener(onInfoWindowClickListener);
    }

    /**
     * Visualize the route between a map location and selected station
     */
    public void visualizeRoute(String result) {
        try {
            // Transform the string into a json object
            JSONObject json = new JSONObject(result);
            JSONArray routeArray = json.getJSONArray("routes");
            JSONObject routes = routeArray.getJSONObject(0);
            JSONObject overviewPolylines = routes
                    .getJSONObject("overview_polyline");

            // Decode the points from the JSON object
            String encodedString = overviewPolylines.getString("points");
            List<LatLng> routePointsList = decodePoly(encodedString);

            // Clear the route list
            routePolylineList.clear();

            // Iterate over the route points and visualize them on the map
            for (int z = 0; z < routePointsList.size() - 1; z++) {
                LatLng src = routePointsList.get(z);
                LatLng dest = routePointsList.get(z + 1);

                // Add the point to the map
                Polyline polyline = googleMap.addPolyline(new PolylineOptions()
                        .add(new LatLng(src.latitude, src.longitude),
                                new LatLng(dest.latitude, dest.longitude))
                        .width(getResources().getInteger(R.integer.google_map_route_line_width))
                        .color(Color.BLUE).geodesic(true));

                // Add the point to the route list
                routePolylineList.add(polyline);
            }
        } catch (JSONException e) {
            Toast.makeText(context,
                    getString(R.string.cs_map_fetch_route_error),
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * Clear the drawn route over the map
     */
    private void deleteRoute() {
        for (Polyline polyline : routePolylineList) {
            polyline.remove();
        }

        routePolylineList.clear();
    }

    /**
     * Create a list with the route map points using the JSON object
     *
     * @param jsonRoutePoints the points from the JSON object
     * @return a list with the route map points
     */
    private List<LatLng> decodePoly(String jsonRoutePoints) {
        List<LatLng> routePoints = new ArrayList<LatLng>();
        int index = 0, len = jsonRoutePoints.length();
        int lat = 0, lng = 0;

        while (index < len) {
            int b, shift = 0, result = 0;
            do {
                b = jsonRoutePoints.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);

            int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lat += dlat;

            shift = 0;
            result = 0;
            do {
                b = jsonRoutePoints.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);

            int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lng += dlng;

            LatLng p = new LatLng((((double) lat / 1E5)),
                    (((double) lng / 1E5)));
            routePoints.add(p);
        }

        return routePoints;
    }

    /**
     * Get the type of the the station associated with the selected marker
     *
     * @param station the station associated with the selected marker
     * @return the type of the station
     */
    private String getStationTypeText(StationEntity station) {

        String historyType;
        VehicleTypeEnum stationType = vehiclesDatasource
                .getVehicleTypesViaStation(station);

        switch (stationType) {
            case BUS:
                historyType = context.getString(R.string.cs_map_type_bus);
                break;
            case TROLLEY:
                historyType = context.getString(R.string.cs_map_type_trolley);
                break;
            case TRAM:
                historyType = context.getString(R.string.cs_map_type_tram);
                break;
            case BUS_TROLLEY:
                historyType = context.getString(R.string.cs_map_type_bus_trolley);
                break;
            case BUS_TRAM:
                historyType = context.getString(R.string.cs_map_type_bus_tram);
                break;
            case TRAM_TROLLEY:
                historyType = context.getString(R.string.cs_map_type_trolley_tram);
                break;
            case BUS_TRAM_TROLLEY:
                historyType = context
                        .getString(R.string.cs_map_type_bus_trolley_tram);
                break;
            case METRO1:
            case METRO2:
                historyType = context.getString(R.string.cs_map_type_metro);
                break;
            default:
                historyType = context.getString(R.string.cs_map_type_btt);
                break;
        }

        return historyType;
    }

    /**
     * Get the appropriate marker icon according to the station type
     *
     * @param station the station under the current marker
     * @return the marker icon from the resources
     */
    private int getMarkerIcon(StationEntity station) {

        int markerIcon;
        VehicleTypeEnum stationType = vehiclesDatasource
                .getVehicleTypesViaStation(station);

        switch (stationType) {
            case BUS:
                markerIcon = R.drawable.ic_bus_map_marker;
                break;
            case TROLLEY:
                markerIcon = R.drawable.ic_trolley_map_marker;
                break;
            case TRAM:
                markerIcon = R.drawable.ic_tram_map_marker;
                break;
            case BUS_TROLLEY:
                markerIcon = R.drawable.ic_bus_trolley_map_marker;
                break;
            case BUS_TRAM:
                markerIcon = R.drawable.ic_bus_tram_map_marker;
                break;
            case TRAM_TROLLEY:
                markerIcon = R.drawable.ic_trolley_tram_map_marker;
                break;
            case METRO1:
            case METRO2:
                markerIcon = R.drawable.ic_metro_map_marker;
                break;
            default:
                markerIcon = R.drawable.ic_bus_map_marker;
                break;
        }

        return markerIcon;
    }

    /**
     * Get the schedule for the station associated with the selected marker
     *
     * @param station the station associated with the selected marker
     */
    private void processWithStationResult(StationEntity station) {
        // Getting the time of arrival of the vehicles
        String stationCustomField = station.getCustomField();
        String metroCustomField = String.format(Constants.METRO_STATION_URL,
                station.getNumber());

        // Check if the type of the station - BTT or METRO
        if (!stationCustomField.equals(metroCustomField)) {
            RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                    context, null, station, null, HtmlRequestCodesEnum.SINGLE_RESULT);
            retrieveVirtualBoards.getSumcInformation();
        } else {
            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(Html.fromHtml(String.format(
                    context.getString(R.string.metro_loading_schedule),
                    station.getName(), station.getNumber())));
            RetrieveMetroSchedule retrieveMetroSchedule = new RetrieveMetroSchedule(
                    context, progressDialog, station);
            retrieveMetroSchedule.execute();
        }
    }

    /**
     * Initialize the navigation drawer
     */
    private void initNavigationDrawer() {

        actionBar = getActionBar();
        actionBar.setTitle(getString(R.string.app_sofbus24));
        actionBar.setSubtitle(getString(R.string.cs_map_title));

        // Enable ActionBar app icon to behave as action to toggle nav
        // drawerActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);

        // Generate the titles of each row
        ArrayList<String> navigationItems = Utils.initNavigationDrawerItems(context);

        // Locate the DrawerLayout in the layout
        mDrawerLayout = (DrawerLayout) findViewById(R.id.navigation_drawer_layout);
        mDrawerLayout.setDrawerShadow(R.drawable.ic_drawer_shadow,
                GravityCompat.START);

        // Locate ListView in the layout
        mDrawerList = (ListView) findViewById(R.id.navigation_drawer_listview);
        mMenuAdapter = new NavDrawerArrayAdapter(context, navigationItems);
        mDrawerList.setAdapter(mMenuAdapter);
        mDrawerList.setOnItemClickListener(new NavDrawerHelper(context, null,
                mDrawerLayout, mDrawerList, navigationItems)
                .getDrawerItemClickListener());

        // Check if the theme is DARK
        if (!ThemeChange.isLightTheme(context)) {
            mDrawerList
                    .setBackgroundResource(R.color.app_dark_theme_background);
        }

        // ActionBarDrawerToggle ties together the the proper interactions
        // between the sliding drawer and the action bar app icon
        mDrawerToggle = new ActionBarDrawerToggle(context, mDrawerLayout,
                R.string.app_navigation_drawer_open, R.string.app_navigation_drawer_close) {

            @Override
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                mMenuAdapter.notifyDataSetChanged();
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Sync the toggle state after onRestoreInstanceState has occurred.
        if (mDrawerToggle != null) {
            mDrawerToggle.syncState();
        }
    }

    @Override
    public void onConfigurationChanged(
            android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Pass any configuration change to the drawer toggles
        if (mDrawerToggle != null) {
            mDrawerToggle.onConfigurationChanged(newConfig);
        }
    }

    /**
     * Class responsible for asynchronous load of the stations from the database
     *
     * @author Zdravko Nestorov
     * @version 1.0
     */
    @SuppressLint("StaticFieldLeak")
    public class LoadStationsFromDb extends
            AsyncTask<Void, Void, List<StationEntity>> {

        private final Activity context;
        private final VehiclesDataSource vehiclesDatasource;

        private final Location location;
        private final String progressDialogMsg;

        private ProgressDialog progressDialog;

        public LoadStationsFromDb(Activity context,
                                  VehiclesDataSource vehiclesDatasource, Location location,
                                  String progressDialogMsg) {

            this.context = context;
            this.vehiclesDatasource = vehiclesDatasource;

            this.location = location;
            this.progressDialogMsg = progressDialogMsg;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            createLoadingView();
        }

        @Override
        protected List<StationEntity> doInBackground(Void... params) {
            if (location != null) {
                return getClosestStations(location);
            } else {
                return getFavouritesStations();
            }
        }

        @Override
        protected void onPostExecute(List<StationEntity> stationsList) {
            super.onPostExecute(stationsList);

            vehiclesDatasource.open();

            if (location != null) {
                visualizeClosestStations(location, stationsList);
            } else {
                visualizeFavouritesStations(stationsList);
            }

            vehiclesDatasource.close();

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

            if (progressDialogMsg != null && !"".equals(progressDialogMsg)) {
                progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(progressDialogMsg);
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
                 * java.lang.IllegalArgumentException: View not attached to
                 * window manager
                 */
            }

            ActivityUtils.unlockScreenOrientation(context);
        }
    }

}