package bg.znestorov.sofbus24.main;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import org.xms.g.location.FusedLocationProviderClient;
import org.xms.g.location.LocationCallback;
import org.xms.g.maps.CameraUpdateFactory;
import org.xms.g.maps.ExtensionMap;
import org.xms.g.maps.ExtensionMap.OnInfoWindowClickListener;
import org.xms.g.maps.ExtensionMap.OnMapClickListener;
import org.xms.g.maps.ExtensionMap.OnMarkerClickListener;
import org.xms.g.maps.ExtensionMap.OnMyLocationButtonClickListener;
import org.xms.g.maps.OnMapReadyCallback;
import org.xms.g.maps.SupportMapFragment;
import org.xms.g.maps.model.BitmapDescriptorFactory;
import org.xms.g.maps.model.CameraPosition;
import org.xms.g.maps.model.LatLng;
import org.xms.g.maps.model.Marker;
import org.xms.g.maps.model.MarkerOptions;
import org.xms.g.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.HashMap;

import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.MetroStationEntity;
import bg.znestorov.sofbus24.entity.PublicTransportStationEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.permissions.AppPermissions;
import bg.znestorov.sofbus24.permissions.PermissionsUtils;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.MapUtils;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;

public class StationRouteMap extends FragmentActivity implements OnMapReadyCallback {

    private final LatLng mladostStationLocation = new LatLng(
            Constants.GLOBAL_PARAM_MLADOST_1_LATITUDE,
            Constants.GLOBAL_PARAM_MLADOST_1_LONGITUDE);

    private Activity context;
    private Bundle bundle;
    private ActionBar actionBar;
    private GlobalEntity globalContext;

    private DirectionsEntity directionsEntity;
    private SupportMapFragment mapFragment;
    private ExtensionMap stationMap;
    private FusedLocationProviderClient locationProviderClient;
    private LocationCallback locationCallback;
    private View stationRouteLines;
    private boolean isCurrentLocationFocused = false;

    private LatLng centerStationLocation = new LatLng(
            Constants.GLOBAL_PARAM_SOFIA_CENTER_LATITUDE,
            Constants.GLOBAL_PARAM_SOFIA_CENTER_LONGITUDE);
    private LatLng currentMarkerLatLng;

    /**
     * When the user clicks outside a marker its snippet is hidden
     */
    private final OnMapClickListener onMapClickListener = new OnMapClickListener() {
        @Override
        public void onMapClick(LatLng arg0) {
            currentMarkerLatLng = null;
        }
    };

    /**
     * Check if selecting the current marker shows or hides the snippet
     */
    private final OnMarkerClickListener onMarkerClickListener = new OnMarkerClickListener() {
        @Override
        public boolean onMarkerClick(Marker marker) {
            if (!marker.isInfoWindowShown()) {
                StationEntity station = getMarkerStation(marker);
                currentMarkerLatLng = new LatLng(Double.parseDouble(station
                        .getLat()), Double.parseDouble(station.getLon()));
            } else {
                currentMarkerLatLng = null;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_map_station_route);

        // Get the current context
        context = StationRouteMap.this;
        bundle = savedInstanceState;
        globalContext = (GlobalEntity) getApplicationContext();

        // Set up the action bar
        actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Create and launch a permission launcher to request permissions
        // N.B. Prevent strange errors where the permissions are not granted on startup
        PermissionsUtils.createAndLaunchPermissionLauncher(this,
                AppPermissions.MAP, this::initializeMap);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (mapFragment != null) {
            mapFragment.onStart();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mapFragment != null) {
            mapFragment.onStop();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mapFragment != null) {
            mapFragment.onResume();
        }

        MapUtils.requestLocationUpdates(locationProviderClient, locationCallback);
    }

    @Override
    public void onPause() {
        if (mapFragment != null) {
            mapFragment.onPause();
        }
        super.onPause();

        MapUtils.removeLocationUpdates(locationProviderClient, locationCallback);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mapFragment != null) {
            mapFragment.onDestroy();
        }

        MapUtils.removeLocationUpdates(locationProviderClient, locationCallback);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        if (mapFragment != null) {
            mapFragment.onLowMemory();
        }
    }

    /**
     * Permission is handled via <code>ActivityResultLauncher</code>.
     */
    @SuppressLint("MissingPermission")
    @Override
    public void onMapReady(ExtensionMap map) {
        stationMap = map;
        stationRouteLines = findViewById(R.id.station_route_lines);

        // Check if the station map is found
        if (stationMap != null) {
            // Get the list of MetroStation objects from the Bundle
            Bundle extras = getIntent().getExtras();
            directionsEntity = (DirectionsEntity) extras
                    .get(Constants.BUNDLE_STATION_ROUTE_MAP);

            // Get the needed fields from the bundle object to form the action
            // bar title and subtitle
            VehicleEntity vehicle = directionsEntity.getVehicle();
            final VehicleTypeEnum stationType = vehicle.getType();
            int ptActiveDirection = directionsEntity.getActiveDirection();
            String directionName = directionsEntity.getDirectionsNames().get(
                    ptActiveDirection);

            // Set ActionBar title and subtitle
            actionBar.setTitle(getLineName(vehicle));
            actionBar.setSubtitle(directionName);

            // Set a click listener over the map (when the map is clicked the
            // snippet became hidden)
            stationMap.setOnMapClickListener(onMapClickListener);

            // Set a click listener over the markers
            stationMap.setOnMarkerClickListener(onMarkerClickListener);

            // Initialize the map without the current location
            initializeMap(stationType, null);

            // Activate my location, set a location button that center the map
            // over a point and start a LocationChangeListener
            stationMap.setMyLocationEnabled(true);
            stationMap.getUiSettings().setMyLocationButtonEnabled(true);

            // Register for location updates
            locationProviderClient = MapUtils.getLocationProviderClient(context);
            locationCallback = MapUtils.getLocationCallback((currentLocation) -> {
                if (currentLocation != null) {
                    stationMap.clear();
                    initializeMap(stationType, currentLocation);
                }
                return null;
            });
            MapUtils.requestLocationUpdates(locationProviderClient, locationCallback);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.activity_map_station_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // Hide the HMS unsupported map modes (satellite and hybrid)
        MapUtils.hideGmsUnsupportedMapTypes(menu, R.id.action_sm_map_mode_satellite,
                R.id.action_sm_map_mode_hybrid);

        // Hide the HMS unsupported GoogleStreetView
        MapUtils.hideGoogleStreetView(menu, R.id.action_sm_google_street_view);

        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_sm_google_street_view:
                if (globalContext.isGoogleStreetViewAvailable()) {
                    if (currentMarkerLatLng != null) {
                        Uri streetViewUri = Uri.parse("google.streetview:cbll="
                                + currentMarkerLatLng.getLatitude() + ","
                                + currentMarkerLatLng.getLongitude());
                        Intent streetViewIntent = new Intent(Intent.ACTION_VIEW,
                                streetViewUri);
                        streetViewIntent.setPackage("com.google.android.apps.maps");
                        startActivity(streetViewIntent);
                    } else {
                        Toast.makeText(context,
                                getString(R.string.app_no_station_selected_error),
                                Toast.LENGTH_SHORT).show();
                    }
                } else {
                    ActivityUtils
                            .showGoogleStreetViewErrorDialog(StationRouteMap.this);
                }
                return true;
            case R.id.action_sm_map_mode_normal:
                if (stationMap == null) {
                    ActivityUtils.recreateActivity(context, false);
                    return true;
                }

                stationMap.setMapType(ExtensionMap.getMAP_TYPE_NORMAL());
                Toast.makeText(context,
                        Html.fromHtml(getString(R.string.cs_map_normal)),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_sm_map_mode_terrain:
                if (stationMap == null) {
                    ActivityUtils.recreateActivity(context, false);
                    return true;
                }

                stationMap.setMapType(ExtensionMap.getMAP_TYPE_TERRAIN());
                Toast.makeText(context,
                        Html.fromHtml(getString(R.string.cs_map_terrain)),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_sm_map_mode_satellite:
                if (stationMap == null) {
                    ActivityUtils.recreateActivity(context, false);
                    return true;
                }

                stationMap.setMapType(ExtensionMap.getMAP_TYPE_SATELLITE());
                Toast.makeText(context,
                        Html.fromHtml(getString(R.string.cs_map_satellite)),
                        Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_sm_map_mode_hybrid:
                if (stationMap == null) {
                    ActivityUtils.recreateActivity(context, false);
                    return true;
                }

                stationMap.setMapType(ExtensionMap.getMAP_TYPE_HYBRID());
                Toast.makeText(context,
                        Html.fromHtml(getString(R.string.cs_map_hybrid)),
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Initialize the map UI.
     */
    private void initializeMap() {
        // Register lifecycle observer, request location permissions and retrieve the map
        mapFragment = MapUtils.initializeMap(this, R.id.station_route_map, bundle);
        mapFragment.getMapAsync(this);
    }

    /**
     * Initialize the map and all of its objects
     *
     * @param stationType     the station type
     * @param currentLocation the current location
     */
    private void initializeMap(VehicleTypeEnum stationType, final Location currentLocation) {
        // Check the type of the bundle object
        if (VehicleTypeEnum.METRO.equals(stationType)
                || VehicleTypeEnum.METRO1.equals(stationType)
                || VehicleTypeEnum.METRO2.equals(stationType)
                || VehicleTypeEnum.METRO3.equals(stationType)
                || VehicleTypeEnum.METRO4.equals(stationType)) {
            processListOfMetroStationObjects(currentLocation);
        } else {
            processListOfPTStationObjects(currentLocation);
        }

        // Animate the map to the station position
        animateMapFocus(centerStationLocation);
        stationMap
                .setOnMyLocationButtonClickListener(new OnMyLocationButtonClickListener() {
                    @Override
                    public boolean onMyLocationButtonClick() {
                        if (isCurrentLocationFocused) {
                            animateMapFocus(centerStationLocation);
                            isCurrentLocationFocused = false;
                        } else {
                            animateMapFocus(currentLocation);
                            isCurrentLocationFocused = true;
                        }
                        return true;
                    }
                });

        // Remove the locationChangeListener
        MapUtils.removeLocationUpdates(locationProviderClient, locationCallback);
    }

    /**
     * Process the list of MetroStation objects
     *
     * @param currentLocation the current location
     */
    private void processListOfMetroStationObjects(Location currentLocation) {
        // Show the metro lines
        if (stationRouteLines != null) {
            stationRouteLines.setVisibility(View.VISIBLE);
        }

        // Get the active direction parameters
        int metroActiveDirection = directionsEntity.getActiveDirection();
        String metroDirectionName = directionsEntity.getDirectionsNames().get(
                metroActiveDirection);
        ArrayList<StationEntity> metroDirectionStations = directionsEntity
                .getDirectionsList().get(metroActiveDirection);

        // Create an object consisted of a set of all points of the route
        int lineWidth = getResources().getInteger(R.integer.google_map_route_line_width);

        int metroRouteColor1 = ContextCompat.getColor(context, R.color.metro_line_1);
        int metroRouteColor2 = ContextCompat.getColor(context, R.color.metro_line_2);
        int metroRouteColor3 = ContextCompat.getColor(context, R.color.metro_line_3);
        int metroRouteColor4 = ContextCompat.getColor(context, R.color.metro_line_4);

        PolylineOptions metroRouteOptionsM11 = new PolylineOptions()
                .width(lineWidth * 2)
                .color(metroRouteColor1); // Slivnitsa - Business Park (THICK 1.1 RED)
        PolylineOptions metroRouteOptionsM12 = new PolylineOptions()
                .width(lineWidth)
                .color(metroRouteColor1); // Slivnitsa - Mladost 1 (THIN 1.2 RED)
        PolylineOptions metroRouteOptionsM2 = new PolylineOptions()
                .width(lineWidth)
                .color(metroRouteColor2); // Vitosha - Obelya (THIN 2 BLUE)
        PolylineOptions metroRouteOptionsM3 = new PolylineOptions()
                .width(lineWidth)
                .color(metroRouteColor3); // Hadzhi Dimitar - Gorna Banya (THIN 3 GREEN)
        PolylineOptions metroRouteOptionsM4 = new PolylineOptions()
                .width(lineWidth)
                .color(metroRouteColor4); // Obelya - Sofia Airport (THIN 4 YELLOW)

        // Process all stations of the metro route
        for (int i = 0; i < metroDirectionStations.size(); i++) {
            StationEntity station = metroDirectionStations.get(i);
            MetroStationEntity ms = new MetroStationEntity(station,
                    metroDirectionName);

            // Create the marker over the map
            if (ms.hasCoordinates()) {
                LatLng msLocation = new LatLng(Double.parseDouble(ms.getLat()),
                        Double.parseDouble(ms.getLon()));

                // Add the msLocation to the appropriate route options object
                int stationNumber = Integer.parseInt(station.getNumber());

                if (stationNumber < 2999) {
                    // Vitosha - Obelya (THIN 2 BLUE)
                    metroRouteOptionsM2.add(msLocation);

                } else if (stationNumber == 2999 || stationNumber == 3000) {
                    // Obelya (THIN 2 BLUE/THIN 4 YELLOW)
                    metroRouteOptionsM2.add(msLocation);
                    metroRouteOptionsM4.add(msLocation);

                } else if (stationNumber == 3001 || stationNumber == 3002) {
                    // Slivnitsa (THIN 11/THICK 12 RED/THIN 4 YELLOW)
                    metroRouteOptionsM11.add(msLocation);
                    metroRouteOptionsM12.add(msLocation);
                    metroRouteOptionsM4.add(msLocation);

                } else if (stationNumber > 3002) {

                    // Slivnitsa - Sofia Airport/Business Park
                    if (stationNumber < 3025) {
                        // Slivnitsa - Mladost 1 (THICK 1 RED/THIN 1 RED/THIN 4 YELLOW)
                        metroRouteOptionsM11.add(msLocation);
                        metroRouteOptionsM12.add(msLocation);
                        metroRouteOptionsM4.add(msLocation);

                    } else if (stationNumber == 3025) {
                        // Mladost 1 (THICK 1 RED/THIN 1 RED/THIN 4 YELLOW)
                        metroRouteOptionsM11.add(msLocation);
                        metroRouteOptionsM12.add(msLocation);
                        metroRouteOptionsM12.add(mladostStationLocation);

                        metroRouteOptionsM4.add(msLocation);

                    } else if (stationNumber == 3026) { // reverse station order
                        // Mladost 1 (THICK 1 RED/THIN 1 RED/THIN 4 YELLOW)
                        metroRouteOptionsM11.add(msLocation);
                        metroRouteOptionsM12.add(mladostStationLocation);
                        metroRouteOptionsM12.add(msLocation);

                        metroRouteOptionsM4.add(msLocation);

                    } else if (stationNumber > 3026 && stationNumber < 3039) {

                        // Mladost 1 - Sofia Airport (THIN 4 YELLOW)
                        metroRouteOptionsM4.add(msLocation);
                    } else if (stationNumber >= 3039 && stationNumber < 3100) {

                        // Alexandar Malinov - Business Park (THIN 1 RED)
                        metroRouteOptionsM12.add(msLocation);
                    } else if (stationNumber >= 3100) {

                        // Hadzhi Dimitar - Gorna Banya (THIN 3 GREEN)
                        metroRouteOptionsM3.add(msLocation);
                    }
                }

                // Create a marker on the msLocation and set some options
                MarkerOptions stationMarkerOptions = new MarkerOptions()
                        .position(msLocation)
                        .title(String.format(ms.getName() + " (%s)",
                                ms.getNumber()))
                        .icon(BitmapDescriptorFactory
                                .fromResource(getMarkerIcon(ms.getType())));

                // Check if the user is already localized
                if (currentLocation != null) {
                    stationMarkerOptions = stationMarkerOptions.snippet(String
                            .format(context.getString(R.string.app_distance),
                                    MapUtils.getMapDistance(context,
                                            currentLocation, station)));
                } else {
                    stationMarkerOptions = stationMarkerOptions.snippet(context
                            .getString(R.string.app_distance_none));
                }

                stationMap.addMarker(stationMarkerOptions);
            }
        }

        // Set a click listener over the markers' snippets
        stationMap
                .setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
                    @Override
                    public void onInfoWindowClick(Marker marker) {
                        // Get the station associated with this marker
                        StationEntity station = getMarkerStation(marker);

                        // Getting the Metro schedule from the station URL
                        // address
                        ProgressDialog progressDialog = new ProgressDialog(
                                context);
                        progressDialog.setMessage(Html.fromHtml(String.format(
                                getString(R.string.metro_loading_schedule),
                                station.getName(), station.getNumber())));

                        RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                                context, null, station, null, HtmlRequestCodesEnum.SINGLE_RESULT);
                        retrieveVirtualBoards.getSumcInformation();
                    }
                });

        // Draw a line between all the markers (RED route MUST be last, because it should
        // appear above the THICK BLUE)
        stationMap.addPolyline(metroRouteOptionsM11);
        stationMap.addPolyline(metroRouteOptionsM12);
        stationMap.addPolyline(metroRouteOptionsM2);
        stationMap.addPolyline(metroRouteOptionsM3);
        stationMap.addPolyline(metroRouteOptionsM4);
    }

    /**
     * Process the list of Public Transport (buses, trolleys and trams) objects
     *
     * @param currentLocation the current location
     */
    private void processListOfPTStationObjects(Location currentLocation) {
        // Hide the metro lines
        if (stationRouteLines != null) {
            stationRouteLines.setVisibility(View.GONE);
        }

        // Get the active direction parameters
        int ptActiveDirection = directionsEntity.getActiveDirection();
        String ptDirectionName = directionsEntity.getDirectionsNames().get(
                ptActiveDirection);
        ArrayList<StationEntity> ptDirectionStations = directionsEntity
                .getDirectionsList().get(ptActiveDirection);

        // Create a HashMap to associate each marker with a station
        final HashMap<String, PublicTransportStationEntity> markersAndStations = new HashMap<String, PublicTransportStationEntity>();

        // Create an object consisted of a set of all points of the route
        PolylineOptions ptRouteOptions = new PolylineOptions().width(
                getResources()
                        .getInteger(R.integer.google_map_route_line_width))
                .color(Color.parseColor("#2B8FD9"));

        // Process all stations of the public transport route
        for (int i = 0; i < ptDirectionStations.size(); i++) {
            StationEntity station = ptDirectionStations.get(i);

            // Create the marker over the map
            if (station.hasCoordinates()) {
                LatLng ptLocation = new LatLng(Double.parseDouble(station
                        .getLat()), Double.parseDouble(station.getLon()));

                // Add the msLocation to the appropriate route options object
                ptRouteOptions.add(ptLocation);

                // Center the map over the central station of the route
                if (i == ptDirectionStations.size() / 2) {
                    centerStationLocation = ptLocation;
                }

                // Create a marker on the msLocation and set some options
                MarkerOptions stationMarkerOptions = new MarkerOptions()
                        .position(ptLocation)
                        .title(String.format(station.getName() + " (%s)",
                                station.getNumber()))
                        .icon(BitmapDescriptorFactory
                                .fromResource(getMarkerIcon(station.getType())));

                // Check if the user is already localized
                if (currentLocation != null) {
                    stationMarkerOptions = stationMarkerOptions.snippet(String
                            .format(context.getString(R.string.app_distance),
                                    MapUtils.getMapDistance(context,
                                            currentLocation, station)));
                } else {
                    stationMarkerOptions = stationMarkerOptions.snippet(context
                            .getString(R.string.app_distance_none));
                }

                Marker marker = stationMap.addMarker(stationMarkerOptions);

                // Associate the marker and the station
                PublicTransportStationEntity ptStation;
                try {
                    ptStation = (PublicTransportStationEntity) station;
                } catch (Exception e) {
                    // A GooglePlay used logged an issue with ClassCastException. If the
                    // received object is not the desired type, create it
                    ptStation = new PublicTransportStationEntity(station);
                }
                ptStation.setDirection(ptDirectionName);
                markersAndStations.put(marker.getId(), ptStation);
            }
        }

        // Draw a line between all the markers
        stationMap.addPolyline(ptRouteOptions);

        // Set a click listener over the markers' snippets
        stationMap
                .setOnInfoWindowClickListener(new OnInfoWindowClickListener() {
                    @Override
                    public void onInfoWindowClick(Marker marker) {
                        // Get the station associated to this marker
                        PublicTransportStationEntity ptStation = markersAndStations
                                .get(marker.getId());

                        // Code changes because of the SKGT API (the schedule is now deprecated)
                        // Getting the PublicTransport schedule from the station URL address
                        // DialogFragment dialogFragment = ChooseTimeRetrievalDialog.newInstance(directionsEntity, ptStation);
                        // dialogFragment.show(getSupportFragmentManager(), "chooseTimeRetrievalDialog");

                        // Getting the real time (there is no need of ChooserDialog now)
                        RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                                context, this, ptStation, null,
                                HtmlRequestCodesEnum.SINGLE_RESULT);
                        retrieveVirtualBoards.getSumcInformation();
                    }
                });
    }

    /**
     * Process the vehicle type and format the action bar title (for PT (public
     * transport) - [line name] [line number], and for METRO - [line number])
     *
     * @param vehicle the chosen vehicle
     * @return the direction name in format<br>
     * for PT (public transport) - [line name] [line number], and for
     * METRO - [line number]
     */
    private String getLineName(VehicleEntity vehicle) {
        String lineName;

        switch (vehicle.getType()) {
            case BUS:
                lineName = String.format(getString(R.string.pt_bus),
                        vehicle.getNumber());
                break;
            case TROLLEY:
                lineName = String.format(getString(R.string.pt_trolley),
                        vehicle.getNumber());
                break;
            case TRAM:
                lineName = String.format(getString(R.string.pt_tram),
                        vehicle.getNumber());
                break;
            case METRO1:
                lineName = getString(R.string.metro_search_tab_direction1);
                break;
            case METRO2:
                lineName = getString(R.string.metro_search_tab_direction2);
                break;
            default:
                lineName = String.format(getString(R.string.pt_bus),
                        vehicle.getNumber());
                break;
        }

        return lineName;
    }

    /**
     * Construct a CameraPosition focusing on Mountain View and animate the
     * camera to that position
     *
     * @param stationLocation the location of the station over the map (using LatLng object)
     */
    private void animateMapFocus(LatLng stationLocation) {
        LatLng focusedLatLng;

        // Check if the user is already localized
        if (stationLocation != null) {
            focusedLatLng = stationLocation;
        } else {
            focusedLatLng = centerStationLocation;
        }

        float zoom;
        if (globalContext.isPhoneDevice()) {
            zoom = 11.8f;
        } else {
            zoom = 12.2f;
        }

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(focusedLatLng).zoom(zoom).build();
        stationMap.animateCamera(CameraUpdateFactory
                .newCameraPosition(cameraPosition));
    }

    /**
     * Construct a CameraPosition focusing on Mountain View and animate the
     * camera to that position
     *
     * @param stationLocation the location of the station over the map (using Location
     *                        object)
     */
    private void animateMapFocus(Location stationLocation) {
        LatLng focusedLatLng;

        // Check if the user is already localized
        if (stationLocation != null) {
            focusedLatLng = new LatLng(stationLocation.getLatitude(),
                    stationLocation.getLongitude());
        } else {
            focusedLatLng = centerStationLocation;
        }

        float zoom;
        if (globalContext.isPhoneDevice()) {
            zoom = 11.8f;
        } else {
            zoom = 12.2f;
        }

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(focusedLatLng).zoom(zoom).build();
        stationMap.animateCamera(CameraUpdateFactory
                .newCameraPosition(cameraPosition));
    }

    /**
     * Get the appropriate marker icon according to the station type
     *
     * @param stationType the type of the station
     * @return the marker icon from the resources
     */
    private int getMarkerIcon(VehicleTypeEnum stationType) {
        int markerIcon;

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
            case METRO:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                markerIcon = R.drawable.ic_metro_map_marker;
                break;
            default:
                markerIcon = R.drawable.ic_none_map_marker;
                break;
        }

        return markerIcon;
    }

    /**
     * Get the station associated with this marker
     *
     * @param marker the current marker
     * @return the station associated with this marker
     */
    private StationEntity getMarkerStation(Marker marker) {
        // Get the station number
        String markerTitle = marker.getTitle();
        String stationNumber = Utils.getValueBeforeLast(
                Utils.getValueAfterLast(markerTitle, "("), ")");

        // Get the station from the DB
        StationsDataSource stationDatasource = new StationsDataSource(context);
        stationDatasource.open();
        StationEntity station = stationDatasource.getStation(stationNumber);
        stationDatasource.close();

        return station;
    }

}