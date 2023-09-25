package bg.znestorov.sofbus24.main;

import android.app.ActionBar;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.MapUtils;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;
import bg.znestorov.sofbus24.utils.activity.TextViewWithImages;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;
import bg.znestorov.sofbus24.virtualboards.VirtualBoardsTimeFragment;

public class VirtualBoardsTime extends FragmentActivity {

    private static final String FRAGMENT_TAG_NAME = "Virtual Boards Time Fragment";
    private Activity context;
    private GlobalEntity globalContext;
    private Bundle savedInstanceState;
    private View vbTimeFragment;
    private ProgressBar vbTimeLoading;
    private ImageView vbTimeStreetView;
    private ProgressBar vbTimeStreetViewLoading;
    private View vbTimeBar;
    private TextView vbTimeStationCaption;
    private TextView vbTimeCurrentTime;
    private ImageButton vbTimeStreetViewButton;
    private TextViewWithImages vbTimeLegend;
    private VirtualBoardsStationEntity vbTimeStation;
    private FavouritesDataSource favouritesDatasource;
    private boolean isFavouriteStation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_virtual_boards_time);

        // Get the current context and create a SavedInstanceState objects
        context = VirtualBoardsTime.this;
        globalContext = (GlobalEntity) getApplicationContext();
        favouritesDatasource = new FavouritesDataSource(context);
        this.savedInstanceState = savedInstanceState;

        initBundleInfo();
        initLayoutFields();
        startVirtualBoardsTimeFragment("");
        isVirtualBoardsStationFavourite();
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem addToFavourites = menu
                .findItem(R.id.action_vb_time_favourites);

        if (isFavouriteStation) {
            addToFavourites.setIcon(R.drawable.ic_menu_star_full);
            addToFavourites.setTitle(R.string.action_vb_time_remove_favourites);
        } else {
            addToFavourites.setIcon(R.drawable.ic_menu_star_empty);
            addToFavourites.setTitle(R.string.action_vb_time_add_favourites);
        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.activity_virtual_boards_time_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_vb_time_favourites:
                toggleVirtualBoardsStation();
                return true;
            case R.id.action_vb_time_refresh:
                initRefreshFragmentInformation();
                return true;
            case R.id.action_vb_time_map:
                if (!globalContext.areServicesAvailable()) {
                    GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                            .newInstance(getString(R.string.app_google_play_msg));
                    googlePlayServicesErrorDialog.show(getSupportFragmentManager(),
                            "GooglePlayServicesErrorDialog");
                } else {
                    if (vbTimeStation.hasCoordinates()) {
                        Intent metroMapIntent = new Intent(context,
                                StationMap.class);
                        metroMapIntent.putExtra(Constants.BUNDLE_STATION_MAP,
                                vbTimeStation);
                        startActivity(metroMapIntent);
                    } else {
                        ActivityUtils.showNoCoordinatesToast(context);
                    }
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Add or remove the virtual boards station from the favorites and change
     * the menu view
     */
    private void toggleVirtualBoardsStation() {
        // Add or remove the station from Favorites
        ActivityUtils.toggleFavouritesStation(context, favouritesDatasource,
                vbTimeStation, null);

        // Change the station status to the opposite value
        isFavouriteStation = !isFavouriteStation;

        // Declare that the options menu has changed, so should be recreated
        // (make the system calls the method onPrepareOptionsMenu)
        supportInvalidateOptionsMenu();
    }

    /**
     * Initialize the refresh by loading the information from SKGT site
     */
    private void initRefreshFragmentInformation() {

        // Refresh the VirtualBoardsTime fragment
        VirtualBoardsTimeFragment vbTimeFragmentInstance = ((VirtualBoardsTimeFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_TAG_NAME));
        if (vbTimeFragmentInstance != null) {
            // Use the SwipeRefresh layout
            vbTimeFragmentInstance.refreshFragment();
        } else {
            // Show the loading ProgressBar
            vbTimeFragment.setVisibility(View.GONE);
            vbTimeLoading.setVisibility(View.VISIBLE);
        }

        // Retrieve the refreshed information from SKGT site
        RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                context, this, vbTimeStation, null, HtmlRequestCodesEnum.REFRESH);
        retrieveVirtualBoards.getSumcInformation();
    }

    /**
     * Get the vehicles list and the station from the Bundle object
     */
    private void initBundleInfo() {
        Bundle extras = getIntent().getExtras();
        vbTimeStation = (VirtualBoardsStationEntity) extras
                .get(Constants.BUNDLE_VIRTUAL_BOARDS_TIME);
    }

    /**
     * Initialize the layout fields (ActionBar, FragmentManager and ProgressBar)
     */
    private void initLayoutFields() {
        // Get the Action Bar
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.vb_time_title));

        // Get the Fragment and the loading ProgressBar
        vbTimeFragment = findViewById(R.id.vb_time_fragment);
        vbTimeLoading = (ProgressBar) findViewById(R.id.vb_time_loading);

        // Get StreetView views
        vbTimeStreetView = (ImageView) findViewById(R.id.vb_time_street_view_image);
        vbTimeStreetViewLoading = (ProgressBar) findViewById(R.id.vb_time_street_view_progress);
        vbTimeBar = findViewById(R.id.vb_time_bar);
        vbTimeStationCaption = (TextView) findViewById(R.id.vb_time_station_caption);
        vbTimeCurrentTime = (TextView) findViewById(R.id.vb_time_current_time);
        vbTimeStreetViewButton = (ImageButton) findViewById(R.id.vb_time_street_view_button);
        vbTimeLegend = (TextViewWithImages) findViewById(R.id.vb_time_legend);
        actionsOverStreetViewFields();
    }

    /**
     * Set the station caption ([station name] ([station number])), time of
     * retrieval of the information and the onClickListener over the
     * GoogleStreetView button
     */
    private void actionsOverStreetViewFields() {
        // Add some station meta information
        vbTimeStationCaption.setText(Html.fromHtml(getStationCaption()));
        vbTimeCurrentTime.setText(String.format(
                getString(R.string.vb_time_current_time),
                vbTimeStation.getTime(context)));

        // Add a click listener over the google street view image button
        vbTimeStreetViewButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (!globalContext.areServicesAvailable()) {
                    GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                            .newInstance(getString(R.string.app_google_play_msg));
                    googlePlayServicesErrorDialog.show(
                            getSupportFragmentManager(),
                            "GooglePlayServicesErrorDialog");
                } else {
                    if (globalContext.isGoogleStreetViewAvailable()) {
                        if (vbTimeStation.hasCoordinates()) {
                            Uri streetViewUri = Uri
                                    .parse("google.streetview:cbll="
                                            + vbTimeStation.getLat() + ","
                                            + vbTimeStation.getLon());

                            // Workaround because of a known bug in GPS (fixed in
                            // later version, which we can't use)
                            try {
                                Intent streetViewIntent = new Intent(
                                        Intent.ACTION_VIEW, streetViewUri);
                                streetViewIntent.setPackage("com.google.android.apps.maps");
                                startActivity(streetViewIntent);
                            } catch (ActivityNotFoundException anfe) {
                                ActivityUtils.showNoCoordinatesToast(context);
                            }
                        } else {
                            ActivityUtils.showNoCoordinatesToast(context);
                        }
                    } else {
                        ActivityUtils
                                .showGoogleStreetViewErrorDialog(VirtualBoardsTime.this);
                    }
                }
            }
        });

        // Add the vehicle's extras information legend
        if (Utils.areAdditionalExtrasAvailable(context)) {
            vbTimeLegend.setVisibility(View.VISIBLE);
            vbTimeLegend.setText(Html.fromHtml(getString(R.string.vb_time_legend)));
        }
    }

    /**
     * Create the caption of the station in format [station name] ([station
     * number])
     *
     * @return the caption of the station in format [station name] ([station
     * number])
     */
    private String getStationCaption() {
        return String.format(vbTimeStation.getName() + " (%s)",
                vbTimeStation.getNumber());
    }

    /**
     * Overwrite the information from the vbTimeStation object with the new
     * information retrieved from the SKGT site
     *
     * @param newVBTimeStation the new station with all info, retrieved from SKGT site (if
     *                         null - clear the vehicles list)
     * @param vbTimeEmptyText  the text that has to be shown if the list is empty
     */
    public void refreshVirtualBoardsTimeFragment(
            VirtualBoardsStationEntity newVBTimeStation, String vbTimeEmptyText) {
        // Refresh the time of info retrieval
        vbTimeCurrentTime.setText(String.format(
                getString(R.string.vb_time_current_time),
                vbTimeStation.getTime(context)));

        // Refresh the fragment
        VirtualBoardsTimeFragment vbTimeFragment = ((VirtualBoardsTimeFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_TAG_NAME));
        if (vbTimeFragment != null) {
            vbTimeFragment.onFragmentRefresh(newVBTimeStation, vbTimeEmptyText);
        }

        // Process the layout fields
        actionsOnFragmentStart();
    }

    /**
     * Create a new VirtualBoardsTimeFragment with all needed information
     *
     * @param vbTimeEmptyText the text that has to be shown if the list is empty
     */
    private void startVirtualBoardsTimeFragment(String vbTimeEmptyText) {
        Fragment fragment;

        // Check if a new fragment should be created
        if (savedInstanceState == null) {
            fragment = VirtualBoardsTimeFragment.newInstance(vbTimeStation,
                    vbTimeEmptyText);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.vb_time_fragment, fragment, FRAGMENT_TAG_NAME)
                    .commit();
        }

        actionsOnFragmentStart();
    }

    /**
     * Set the Fragment schedule hour label and show the needed arrows
     */
    private void actionsOnFragmentStart() {
        loadLocationStreetView();

        vbTimeFragment.setVisibility(View.VISIBLE);
        vbTimeLoading.setVisibility(View.GONE);

        actionsOverStreetViewFields();
    }

    /**
     * Load the street view of the station (if the station has coordinates in
     * the database), otherwise shows the default location (the Sofia center)
     */
    private void loadLocationStreetView() {
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(ActivityUtils.initImageLoader(context));
        DisplayImageOptions displayImageOptions = ActivityUtils
                .displayImageOptions();

        // Get the coordinates of the station (if exist in the database), or the
        // default one (if no coordinates exists in the database)
        String stationLat = vbTimeStation.getLat() != null ? vbTimeStation
                .getLat() : Constants.GLOBAL_PARAM_SOFIA_CENTER_LATITUDE + "";
        String stationLon = vbTimeStation.getLon() != null ? vbTimeStation
                .getLon() : Constants.GLOBAL_PARAM_SOFIA_CENTER_LONGITUDE + "";

        // Create the station street view URL address
        String imageUrl;
        if (stationLat != null
                && (stationLat.contains(",") || stationLat.contains("."))) {
            imageUrl = String.format(Constants.FAVOURITES_IMAGE_URL,
                    stationLat, stationLon);
        } else {
            imageUrl = String.format(Constants.FAVOURITES_IMAGE_URL,
                    Constants.GLOBAL_PARAM_SOFIA_CENTER_LATITUDE,
                    Constants.GLOBAL_PARAM_SOFIA_CENTER_LONGITUDE);
        }

        // Loading the image and process the fields over
        imageLoader.displayImage(imageUrl, vbTimeStreetView,
                displayImageOptions, new SimpleImageLoadingListener() {
                    @Override
                    public void onLoadingStarted(String imageUri, View view) {
                        vbTimeStreetViewLoading.setVisibility(View.VISIBLE);
                        vbTimeBar.setVisibility(View.GONE);
                        vbTimeStreetViewButton.setVisibility(View.GONE);

                        // Hide the HMS unsupported GoogleStreetView
                        MapUtils.hideGoogleStreetView(vbTimeStreetViewButton);
                    }

                    @Override
                    public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                        vbTimeStreetViewLoading.setVisibility(View.GONE);
                        vbTimeBar.setVisibility(View.VISIBLE);
                        vbTimeStreetViewButton.setVisibility(View.VISIBLE);

                        // Hide the HMS unsupported GoogleStreetView
                        MapUtils.hideGoogleStreetView(vbTimeStreetViewButton);
                    }

                    @Override
                    public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                        vbTimeStreetViewLoading.setVisibility(View.GONE);
                        vbTimeBar.setVisibility(View.VISIBLE);
                        vbTimeStreetViewButton.setVisibility(View.VISIBLE);

                        // Hide the HMS unsupported GoogleStreetView
                        MapUtils.hideGoogleStreetView(vbTimeStreetViewButton);
                    }
                });
    }

    /**
     * Check if the station is added in the Favorites section or not
     */
    private void isVirtualBoardsStationFavourite() {
        favouritesDatasource.open();
        isFavouriteStation = favouritesDatasource.getStation(vbTimeStation) != null;
        favouritesDatasource.close();

        // Declare that the options menu has changed, so should be recreated
        // (make the system calls the method onPrepareOptionsMenu)
        supportInvalidateOptionsMenu();
    }

}
