package bg.znestorov.sofbus24.main;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import bg.znestorov.sofbus24.closest.stations.map.RetrieveCurrentLocation;
import bg.znestorov.sofbus24.closest.stations.map.RetrieveCurrentLocationTimeout;
import bg.znestorov.sofbus24.databases.DroidTransDataSource;
import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.databases.VehiclesDataSource;
import bg.znestorov.sofbus24.droidtrans.DroidTransLoadInfo;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.RetrieveCurrentLocationTypeEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.entity.WheelStateEntity;
import bg.znestorov.sofbus24.gcm.GcmUtils;
import bg.znestorov.sofbus24.navigation.NavDrawerArrayAdapter;
import bg.znestorov.sofbus24.navigation.NavDrawerHelper;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.MapUtils;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;
import kankan.wheel.widget.OnWheelChangedListener;
import kankan.wheel.widget.OnWheelScrollListener;
import kankan.wheel.widget.WheelView;
import kankan.wheel.widget.adapters.AbstractWheelTextAdapter;
import kankan.wheel.widget.adapters.ArrayWheelAdapter;

/**
 * Represents the functionality of the DroidTrans application (not active in the
 * market). The main functionality of the class is to start a location update
 * listener to find the current location (if enabled) and the nearest station to
 * it. If no location is found in next 3 seconds, check if there is available
 * LastKnownLocation and find the nearest station to it. Also the class saves
 * the state of the wheels on orientation change.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressWarnings("deprecation")
public class DroidTrans extends FragmentActivity {

    public static final String BUNDLE_IS_DROID_TRANS_HOME_SCREEN = "IS DROID TRANS HOME SCREEN";
    private static final String BUNDLE_USER_LOCATION_LAT = "BUNDLE USER LOCATION LAT";
    private static final String BUNDLE_USER_LOCATION_LON = "BUNDLE USER LOCATION LON";
    private static final String BUNDLE_WHEEL_STATE = "BUNDLE WHEEL STATE";
    private FragmentActivity context;
    private GlobalEntity globalContext;
    private DroidTransLoadInfo droidtransLoadInfo;
    private StationsDataSource stationsDatasource;
    private VehiclesDataSource vehiclesDatasource;
    private DroidTransDataSource droidtransDatasource;
    private ActionBar actionBar;
    private boolean isDroidTransHomeScreen;
    private WheelView vehicleTypesWheel;
    private WheelView vehicleNumbersWheel;
    private WheelView vehicleDirectionsWheel;
    private WheelView vehicleStationsWheel;
    private Button vehicleSchedule;
    private boolean scrolling = false;
    private WheelStateEntity wheelState;
    private ArrayList<VehicleTypeEnum> vehicleTypes;
    private ArrayList<String> vehicleNumbers;
    private ArrayList<String> vehicleDirections;
    private ArrayList<StationEntity> vehicleStations;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private NavDrawerArrayAdapter mMenuAdapter;
    private Location userLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_droidtrans);

        initGlobalVariables();
        initBundleInfo(savedInstanceState);
        initActionBar();
        initLayoutFields();
        checkForLocationServicesAvailable();

        if (isDroidTransHomeScreen) {
            initNavigationDrawer();

            if (savedInstanceState == null) {
                // Not needed anymore - only the GCM notifications can inform
                // the user about any actions
                // Utils.checkForUpdate(context, UpdateTypeEnum.APP);
                GcmUtils.processGcmNotification(context,
                        getSupportFragmentManager());
                ActivityTracker.homeScreenUsed(context,
                        "DroidTrans (Home Screen)");
            }
        }
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
    protected void onSaveInstanceState(Bundle savedInstanceState) {

        setWheelStateEntity(wheelState);

        savedInstanceState.putDouble(BUNDLE_USER_LOCATION_LAT,
                userLocation != null ? userLocation.getLatitude() : -1);
        savedInstanceState.putDouble(BUNDLE_USER_LOCATION_LON,
                userLocation != null ? userLocation.getLongitude() : -1);
        savedInstanceState.putSerializable(BUNDLE_WHEEL_STATE, wheelState);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        setResult(HomeScreenSelect.RESULT_CODE_ACTIVITY_FINISH, new Intent());
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_droidtrans_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        MenuItem favourites = menu.findItem(R.id.action_favourites);
        MenuItem csMap = menu.findItem(R.id.action_closest_stations_map);

        if (isDroidTransHomeScreen) {
            favourites.setVisible(true);
            csMap.setVisible(true);
        } else {
            favourites.setVisible(false);
            csMap.setVisible(false);
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
                if (isDroidTransHomeScreen) {
                    if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
                        mDrawerLayout.closeDrawer(mDrawerList);
                    } else {
                        mDrawerLayout.openDrawer(mDrawerList);
                    }
                } else {
                    finish();
                }

                return true;
            case R.id.action_favourites:
                Intent favouritesIntent;
                if (globalContext.isPhoneDevice()) {
                    favouritesIntent = new Intent(context, Favourites.class);
                } else {
                    favouritesIntent = new Intent(context, FavouritesDialog.class);
                }

                startActivity(favouritesIntent);

                return true;
            case R.id.action_closest_stations_map:
                ActivityUtils.startClosestStationsMap(context,
                        getSupportFragmentManager(), false);

                return true;
            case R.id.action_droidtrans_reset:
                refresh();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
     * Initialize the global variables (get the current activity context and
     * initialize the db datasource)
     */
    private void initGlobalVariables() {

        context = DroidTrans.this;
        globalContext = (GlobalEntity) getApplicationContext();

        droidtransLoadInfo = DroidTransLoadInfo.getInstance(context);
        stationsDatasource = new StationsDataSource(context);
        vehiclesDatasource = new VehiclesDataSource(context);
        droidtransDatasource = new DroidTransDataSource(context);
    }

    /**
     * Check if any of the location services is available, in case this is the home screen.
     */
    private void checkForLocationServicesAvailable() {
        if (isDroidTransHomeScreen && !MapUtils.areLocationServicesAvailable(context)) {
            MapUtils.showLocationSourceDialog(context.getSupportFragmentManager());
        }
    }

    /**
     * Initialize the information from the bundle
     *
     * @param savedInstanceState the current bundle
     */
    private void initBundleInfo(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();

        // Each time check if this is the home screen or not
        isDroidTransHomeScreen = bundle != null && bundle.getBoolean(
                BUNDLE_IS_DROID_TRANS_HOME_SCREEN, false);

        // Show a notification that the home screen is changed (if needed)
        ActivityUtils.showHomeActivityChangedToast(context,
                getString(R.string.navigation_drawer_home_cars));

        // Get the wheels state
        if (savedInstanceState == null) {
            LatLng bundleLocation = bundle != null ? (LatLng) bundle.get(Constants.BUNDLE_DROID_TRANS) : null;

            if (bundleLocation == null) {
                userLocation = null;
            } else {
                userLocation = new Location("");
                userLocation.setLatitude(bundleLocation.latitude);
                userLocation.setLongitude(bundleLocation.longitude);
            }

            wheelState = new WheelStateEntity();
        } else {
            Double latitude = savedInstanceState
                    .getDouble(BUNDLE_USER_LOCATION_LAT);
            Double longitude = savedInstanceState
                    .getDouble(BUNDLE_USER_LOCATION_LON);

            if (latitude == -1 || longitude == -1) {
                userLocation = null;
            } else {
                userLocation = new Location("");
                userLocation.setLatitude(latitude);
                userLocation.setLongitude(longitude);
            }

            wheelState = (WheelStateEntity) savedInstanceState
                    .getSerializable(BUNDLE_WHEEL_STATE);
        }
    }

    /**
     * Set up the action bar
     */
    private void initActionBar() {
        actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.droid_trans_title));
    }

    /**
     * Initialize the layout fields
     */
    private void initLayoutFields() {

        vehicleTypesWheel = (WheelView) findViewById(R.id.droidtrans_vehicle_types);
        vehicleTypesWheel.setVisibleItems(4);

        vehicleNumbersWheel = (WheelView) findViewById(R.id.droidtrans_vehicle_numbers);
        vehicleNumbersWheel.setVisibleItems(5);

        vehicleDirectionsWheel = (WheelView) findViewById(R.id.droidtrans_directions);
        vehicleDirectionsWheel.setVisibleItems(2);

        vehicleStationsWheel = (WheelView) findViewById(R.id.droidtrans_stations);
        vehicleDirectionsWheel.setVisibleItems(5);

        vehicleSchedule = (Button) findViewById(R.id.droidtrans_schedule);

        updateVehicleWheels();
        setVehicleWheelsListeners();
        setVehicleWheelsState();
        retrieveVehicleSchedule();
    }

    /**
     * Update all information in the vehicles wheels
     */
    private void updateVehicleWheels() {

        updateVehicleWheelTypes();

        updateVehicleWheel(0);
        updateVehicleWheel(1);
        updateVehicleWheel(2);
    }

    /**
     * Update the vehicles wheel type
     */
    private void updateVehicleWheelTypes() {

        getVehicleTypes();

        VehiclesAdapter vehiclesAdapter = new VehiclesAdapter(context,
                vehicleTypes);
        vehiclesAdapter.setTextSize(18);
        vehicleTypesWheel.setViewAdapter(vehiclesAdapter);
    }

    /**
     * Update the wheel view according to its position
     *
     * @param wheelViewPosition the position of the wheel view<br/>
     *                          <ul>
     *                          <li>0 - update vehicle numbers</li>
     *                          <li>1 - update vehicle directions</li>
     *                          <li>2 - update vehicle stations</li>
     *                          </ul>
     */
    private void updateVehicleWheel(int wheelViewPosition) {

        switch (wheelViewPosition) {
            case 0:
                updateVehicleWheelNumbers();
                updateVehicleWheelDirections();
                updateVehicleWheelStations();
                break;
            case 1:
                updateVehicleWheelDirections();
                updateVehicleWheelStations();
                break;
            default:
                updateVehicleWheelStations();
                break;
        }
    }

    /**
     * Set up all wheel listeners (over each of the wheels)
     */
    private void setVehicleWheelsListeners() {
        setVehicleWheelsListener(0);
        setVehicleWheelsListener(1);
        setVehicleWheelsListener(2);
    }

    /**
     * Set up one of the vehicle wheel listeners
     */
    private void setVehicleWheelsListener(final int wheelViewPosition) {

        WheelView wheelView;
        switch (wheelViewPosition) {
            case 0:
                wheelView = vehicleTypesWheel;
                break;
            case 1:
                wheelView = vehicleNumbersWheel;
                break;
            default:
                wheelView = vehicleDirectionsWheel;
                break;
        }

        wheelView.addChangingListener(new OnWheelChangedListener() {

            @Override
            public void onChanged(WheelView wheel, int oldValue, int newValue) {
                if (!scrolling) {
                    updateVehicleWheel(wheelViewPosition);
                }
            }
        });

        wheelView.addScrollingListener(new OnWheelScrollListener() {

            @Override
            public void onScrollingStarted(WheelView wheel) {
                scrolling = true;
            }

            @Override
            public void onScrollingFinished(WheelView wheel) {
                scrolling = false;
                updateVehicleWheel(wheelViewPosition);
            }
        });
    }

    /**
     * Set the state of the wheels (the current items) - in case of a new
     * location found change the WheelStateEntity object values
     */
    private void setVehicleWheelsState() {

        if (userLocation != null) {
            changeWheelsStateEntityValuesByLocation(userLocation);
            changeWheelsStateItemsValues();
        }
    }

    /**
     * Get the wheel views positions according to the current location
     *
     * @param currentLocation the current user location
     */
    private void changeWheelsStateEntityValuesByLocation(
            Location currentLocation) {

        int vehiclesTypeWheelPosition;
        int vehiclesNumberWheelPosition;
        int vehiclesDirectionWheelPosition;
        int stationsNumbersWheelPosition;

        try {
            // Get the closest station
            stationsDatasource.open();
            StationEntity closestStation = stationsDatasource
                    .getClosestStation(context, currentLocation);
            stationsDatasource.close();

            // Get the vehicle passing through the closest station
            vehiclesDatasource.open();
            VehicleEntity closestVehicle = vehiclesDatasource
                    .getVehicleViaStation(closestStation);
            vehiclesTypeWheelPosition = getVehicleTypePosition(closestVehicle
                    .getType());
            vehiclesDirectionWheelPosition = Integer.parseInt(closestVehicle
                    .getDirection());
            vehiclesDatasource.close();

            // Get the position of the wheel views
            droidtransDatasource.open();
            vehiclesNumberWheelPosition = droidtransDatasource
                    .getVehicleNumbersPosition(
                            getVehicleType(closestVehicle.getType()),
                            closestVehicle.getNumber());
            stationsNumbersWheelPosition = droidtransDatasource
                    .getVehicleStationPosition(
                            getVehicleType(closestVehicle.getType()),
                            closestVehicle.getNumber(),
                            vehiclesDirectionWheelPosition,
                            closestStation.getNumber());
            droidtransDatasource.close();

            // Set the values into the WheelState object
            wheelState = new WheelStateEntity(vehiclesTypeWheelPosition,
                    vehiclesNumberWheelPosition,
                    vehiclesDirectionWheelPosition - 1,
                    stationsNumbersWheelPosition);
        } catch (Exception e) {
            // Just in case when no vehicle is passing through this station
            // (very rare case)
        }
    }

    /**
     * In case of a location found or an orientation changes, change the
     * WheelStateEntity object values
     */
    private void changeWheelsStateItemsValues() {
        vehicleTypesWheel.setCurrentItem(wheelState.getVehiclesType());
        vehicleNumbersWheel.setCurrentItem(wheelState.getVehiclesNumber());
        vehicleDirectionsWheel
                .setCurrentItem(wheelState.getVehiclesDirection());
        vehicleStationsWheel.setCurrentItem(wheelState.getStationsNumbers());
    }

    /**
     * Get the vehicle type accordingly
     *
     * @param vehicleType the current vehicle type
     * @return the output vehicle type
     */
    private VehicleTypeEnum getVehicleType(VehicleTypeEnum vehicleType) {

        if (vehicleType == VehicleTypeEnum.METRO
                || vehicleType == VehicleTypeEnum.METRO1
                || vehicleType == VehicleTypeEnum.METRO2
                || vehicleType == VehicleTypeEnum.METRO3
                || vehicleType == VehicleTypeEnum.METRO4) {
            vehicleType = VehicleTypeEnum.METRO;
        }

        return vehicleType;
    }

    /**
     * Get the vehicle type position in the wheel view via the vehicle type
     *
     * @param vehicleType the current vehicle type
     * @return the position of the vehicle type in the wheel view
     */
    private int getVehicleTypePosition(VehicleTypeEnum vehicleType) {

        int vehicleTypePosition;
        if (vehicleType == VehicleTypeEnum.METRO
                || vehicleType == VehicleTypeEnum.METRO1
                || vehicleType == VehicleTypeEnum.METRO2
                || vehicleType == VehicleTypeEnum.METRO3
                || vehicleType == VehicleTypeEnum.METRO4) {
            vehicleType = VehicleTypeEnum.METRO;
        }

        switch (vehicleType) {
            case BUS:
                vehicleTypePosition = 0;
                break;
            case TROLLEY:
                vehicleTypePosition = 1;
                break;
            case TRAM:
                vehicleTypePosition = 2;
                break;
            default:
                vehicleTypePosition = 3;
                break;
        }

        return vehicleTypePosition;
    }

    /**
     * Update the vehicles wheel numbers
     */
    private void updateVehicleWheelNumbers() {

        VehicleTypeEnum vehicleType = getCurrentVehicleType();
        getVehicleNumbers(vehicleType);

        String[] vehicleNumbersArray = getVehicleNumberArray(vehicleType);
        ArrayWheelAdapter<String> adapter = new ArrayWheelAdapter<String>(this,
                vehicleNumbersArray);
        adapter.setTextSize(15);
        vehicleNumbersWheel.setViewAdapter(adapter);

        switch (vehicleType) {
            case METRO:
                vehicleNumbersWheel.setCyclic(false);
                break;
            default:
                vehicleNumbersWheel.setCyclic(true);
                break;
        }

        vehicleNumbersWheel.setCurrentItem(0);
    }

    /**
     * Get the number of the vehicle
     *
     * @param vehicleType the vehicle type
     * @return the number
     */
    private String[] getVehicleNumberArray(VehicleTypeEnum vehicleType) {
        String[] vehicleNumbersArray;
        vehicleNumbersArray = new String[vehicleNumbers.size()];
        vehicleNumbersArray = vehicleNumbers.toArray(vehicleNumbersArray);
        return vehicleNumbersArray;
    }

    /**
     * Get the text that the WheelView will show for each station
     *
     * @return the name (title) of the station
     */

    /**
     * Update the vehicles wheel numbers
     */
    private void updateVehicleWheelDirections() {

        VehicleTypeEnum vehicleType = getCurrentVehicleType();
        String vehicleNumber = getCurrentVehicleNumber();
        getVehicleDirections(vehicleType, vehicleNumber);

        String[] vehicleDirectionsArray = new String[vehicleDirections.size()];
        vehicleDirectionsArray = vehicleDirections
                .toArray(vehicleDirectionsArray);
        ArrayWheelAdapter<String> adapter = new ArrayWheelAdapter<String>(this,
                vehicleDirectionsArray);
        adapter.setTextSize(12);
        vehicleDirectionsWheel.setViewAdapter(adapter);
        vehicleDirectionsWheel.setCurrentItem(0);
    }

    /**
     * Update the stations numbers
     */
    private void updateVehicleWheelStations() {

        VehicleTypeEnum vehicleType = getCurrentVehicleType();
        String vehicleNumber = getCurrentVehicleNumber();
        Integer vehicleDirection = getCurrentVehicleDirection();
        getStationsList(vehicleType, vehicleNumber, vehicleDirection);

        String[] vehicleStationsArray = getStationsNameArray();
        ArrayWheelAdapter<String> adapter = new ArrayWheelAdapter<String>(this,
                vehicleStationsArray);
        adapter.setTextSize(13);
        vehicleStationsWheel.setViewAdapter(adapter);
        vehicleStationsWheel.setCurrentItem(0);
    }

    /**
     * Get all vehicle types
     */
    private void getVehicleTypes() {
        vehicleTypes = droidtransLoadInfo.getVehicleTypes();
    }

    /**
     * Get the vehicle numbers for the selected vehicle type
     *
     * @param vehicleType the selected vehicle type
     */
    private void getVehicleNumbers(VehicleTypeEnum vehicleType) {
        vehicleNumbers = droidtransLoadInfo.getVehicleNumbers(vehicleType);
    }

    /**
     * Get the vehicle directions for the selected vehicle type and number
     *
     * @param vehicleType   the selected vehicle type
     * @param vehicleNumber the selected vehicle number
     */
    private void getVehicleDirections(VehicleTypeEnum vehicleType,
                                      String vehicleNumber) {
        droidtransDatasource.open();
        vehicleDirections = droidtransDatasource.getVehicleDirections(
                vehicleType, vehicleNumber);
        droidtransDatasource.close();
    }

    /**
     * Get all stations for the selected vehicle in the desired location
     *
     * @param vehicleType      the selected vehicle type
     * @param vehicleNumber    the selected vehicle number
     * @param vehicleDirection the desired direction
     */
    private void getStationsList(VehicleTypeEnum vehicleType,
                                 String vehicleNumber, Integer vehicleDirection) {
        droidtransDatasource.open();
        vehicleStations = droidtransDatasource.getVehicleStations(
                vehicleType, vehicleNumber, vehicleDirection);
        droidtransDatasource.close();
    }

    /**
     * Retrieve the schedule of the vehicle
     */
    private void retrieveVehicleSchedule() {

        switch (ThemeChange.getAppTheme(context)) {
            case LIGHT:
                vehicleSchedule
                        .setBackgroundResource(R.drawable.btn_droidtrans_light);
                break;
            default:
                vehicleSchedule
                        .setBackgroundResource(R.drawable.btn_droidtrans_dark);
                break;
        }

        vehicleSchedule.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                try {
                    ProgressDialog progressDialog = new ProgressDialog(context);

                    VehicleTypeEnum vehicleType = getCurrentVehicleType();
                    StationEntity station = getCurrentStation();

                    RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                            context, null, station, null, HtmlRequestCodesEnum.SINGLE_RESULT);
                    retrieveVirtualBoards.getSumcInformation();
                } catch (Exception e) {
                    Toast.makeText(context,
                            getString(R.string.droid_trans_no_info),
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    /**
     * Get the current vehicle type
     *
     * @return the current vehicle type
     */
    private VehicleTypeEnum getCurrentVehicleType() {
        return vehicleTypes.get(vehicleTypesWheel.getCurrentItem());
    }

    /**
     * Get the current vehicle number
     *
     * @return the current vehicle number
     */
    private String getCurrentVehicleNumber() {
        return vehicleNumbers.get(vehicleNumbersWheel.getCurrentItem());
    }

    /**
     * Get the current vehicle direction
     *
     * @return the current vehicle direction
     */
    private Integer getCurrentVehicleDirection() {
        return vehicleDirectionsWheel.getCurrentItem() + 1;
    }

    /**
     * Get the current stations number
     *
     * @return the current stations number
     */
    private StationEntity getCurrentStation() {
        return vehicleStations.get(vehicleStationsWheel.getCurrentItem());
    }

    /**
     * Get the text that the WheelView will show for each station
     *
     * @return the name (title) of the station
     */
    private String[] getStationsNameArray() {

        String[] stationName = new String[vehicleStations.size()];

        for (int i = 0; i < vehicleStations.size(); i++) {
            StationEntity station = vehicleStations.get(i);
            stationName[i] = String.format("%s (%s)", station.getName(),
                    station.getNumber());
        }

        return stationName;
    }

    /**
     * Initialize the navigation drawer
     */
    private void initNavigationDrawer() {

        actionBar = getActionBar();
        actionBar.setTitle(getString(R.string.app_sofbus24));
        actionBar.setSubtitle(getString(R.string.droid_trans_title));

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

                // Show informational toast for blind people
                Utils.navDrawerBlindToast(context, R.string.app_navigation_drawer_closed);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                mMenuAdapter.notifyDataSetChanged();

                // Show informational toast for blind people
                Utils.navDrawerBlindToast(context, R.string.app_navigation_drawer_opened);
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    /**
     * Set the state entity values (used in onSavedInstanceState(...))
     *
     * @param wheelState the wheel state entity
     */
    private void setWheelStateEntity(WheelStateEntity wheelState) {
        wheelState.setVehiclesType(vehicleTypesWheel.getCurrentItem());
        wheelState.setVehiclesNumber(vehicleNumbersWheel.getCurrentItem());
        wheelState
                .setVehiclesDirection(vehicleDirectionsWheel.getCurrentItem());
        wheelState.setStationsNumbers(vehicleStationsWheel.getCurrentItem());
    }

    /**
     * Refresh the DroidTrans activity (start the RetrieveCurrentLocation
     * AsyncTask)
     */
    private void refresh() {

        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog
                .setMessage(getString(R.string.app_loading_closest_station));

        RetrieveCurrentLocation retrieveCurrentLocation = new RetrieveCurrentLocation(
                context, context.getSupportFragmentManager(), progressDialog,
                RetrieveCurrentLocationTypeEnum.DT_REFRESH);
        retrieveCurrentLocation.execute();

        RetrieveCurrentLocationTimeout retrieveCurrentLocationTimeout = new RetrieveCurrentLocationTimeout(
                retrieveCurrentLocation,
                RetrieveCurrentLocationTimeout.TIMEOUT_DT);
        (new Thread(retrieveCurrentLocationTimeout)).start();
    }

    /**
     * Refresh the DroidTrans activity information (called from
     * RetrieveCurrentLocation AsyncTask)
     *
     * @param currentLocation the current user location
     */
    public void refreshDroidTransActivity(Location currentLocation) {

        userLocation = currentLocation;
        setVehicleWheelsState();
    }

    /**
     * Adapter for countries
     */
    private class VehiclesAdapter extends AbstractWheelTextAdapter {

        private final ArrayList<VehicleTypeEnum> vehicleTypes;
        private final ArrayList<Integer> vehicleImages;

        /**
         * Constructor
         */
        VehiclesAdapter(Activity context,
                        ArrayList<VehicleTypeEnum> vehicleTypes) {

            super(context, R.layout.activity_droidtrans_list_item, NO_RESOURCE);

            this.vehicleTypes = new ArrayList<VehicleTypeEnum>(
                    new LinkedHashSet<VehicleTypeEnum>(vehicleTypes));
            this.vehicleImages = getVehicleImages();

            setItemTextResource(R.id.droidtrans_vehicle_type_text);
        }

        private ArrayList<Integer> getVehicleImages() {

            ArrayList<Integer> vehicleImages = new ArrayList<Integer>();

            for (int i = 0; i < vehicleTypes.size(); i++) {
                switch (i) {
                    case 0:
                        vehicleImages.add(R.drawable.ic_droidtrans_bus);
                        break;
                    case 1:
                        vehicleImages.add(R.drawable.ic_droidtrans_trolley);
                        break;
                    case 2:
                        vehicleImages.add(R.drawable.ic_droidtrans_tram);
                        break;
                    default:
                        vehicleImages.add(R.drawable.ic_droidtrans_subway);
                        break;
                }
            }

            return vehicleImages;
        }

        @Override
        public View getItem(int index, View cachedView, ViewGroup parent) {

            View view = super.getItem(index, cachedView, parent);
            ImageView img = (ImageView) view
                    .findViewById(R.id.droidtrans_vehicle_type_img);
            img.setImageResource(vehicleImages.get(index));

            return view;
        }

        @Override
        public int getItemsCount() {
            return vehicleTypes.size();
        }

        @Override
        protected CharSequence getItemText(int index) {

            CharSequence vehicleType;
            switch (vehicleTypes.get(index)) {
                case BUS:
                    vehicleType = getString(R.string.droid_trans_type_bus);
                    break;
                case TROLLEY:
                    vehicleType = getString(R.string.droid_trans_type_trolley);
                    break;
                case TRAM:
                    vehicleType = getString(R.string.droid_trans_type_tram);
                    break;
                default:
                    vehicleType = getString(R.string.droid_trans_type_metro);
                    break;
            }

            return vehicleType;
        }
    }

}