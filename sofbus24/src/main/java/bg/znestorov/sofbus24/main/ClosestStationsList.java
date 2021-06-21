package bg.znestorov.sofbus24.main;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.model.LatLng;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.SimpleImageLoadingListener;

import bg.znestorov.sofbus24.closest.stations.list.ClosestStationsListFragment;
import bg.znestorov.sofbus24.closest.stations.map.RetrieveCurrentLocation;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.RetrieveCurrentLocationTypeEnum;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;

public class ClosestStationsList extends FragmentActivity {

    private static final String FRAGMENT_TAG_NAME = "Closest Stations List Fragment";
    private FragmentActivity context;
    private GlobalEntity globalContext;
    private Bundle savedInstanceState;
    private View csListFragment;
    private ProgressBar csListLoading;
    private ImageView streetView;
    private ProgressBar streetViewLoading;
    private ImageButton streetViewButton;
    private LatLng currentLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_closest_stations_list);

        // Get the current context and create a SavedInstanceState objects
        context = ClosestStationsList.this;
        globalContext = (GlobalEntity) getApplicationContext();
        this.savedInstanceState = savedInstanceState;

        initBundleInfo();
        initLayoutFields();
        startClosestStationsListFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.activity_closest_stations_list_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_cs_list_refresh:
                initRefresh();
                return true;
            case R.id.action_cs_list_map:
                if (!globalContext.areServicesAvailable()) {
                    GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                            .newInstance(getString(R.string.app_google_play_msg));
                    googlePlayServicesErrorDialog.show(getSupportFragmentManager(),
                            "GooglePlayServicesErrorDialog");
                } else {
                    Intent closestStationsMapIntent = new Intent(context,
                            ClosestStationsMap.class);
                    startActivity(closestStationsMapIntent);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Initialize the refresh by putting a 500 ms delay
     */
    private void initRefresh() {
        // Show the loading ProgressBar
        csListFragment.setVisibility(View.GONE);
        csListLoading.setVisibility(View.VISIBLE);

        // Retrieve the current position
        RetrieveCurrentLocation retrieveCurrentLocation = new RetrieveCurrentLocation(
                context, context.getSupportFragmentManager(), null,
                RetrieveCurrentLocationTypeEnum.CS_LIST_REFRESH);
        retrieveCurrentLocation.execute();
    }

    /**
     * Get the current location coordinates from the Bundle object
     */
    private void initBundleInfo() {
        Bundle extras = getIntent().getExtras();
        currentLocation = (LatLng) extras
                .get(Constants.BUNDLE_CLOSEST_STATIONS_LIST);
    }

    /**
     * Initialize the layout fields (ActionBar, FragmentManager and ProgressBar)
     */
    private void initLayoutFields() {
        // Get the Action Bar
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.cs_list_title));

        // Get the Fragment and the loading ProgressBar
        csListFragment = findViewById(R.id.cs_list_fragment);
        csListLoading = (ProgressBar) findViewById(R.id.cs_list_loading);

        // Get StreetView ImageView and ProgressBar
        streetView = (ImageView) findViewById(R.id.cs_list_street_view_image);
        streetViewLoading = (ProgressBar) findViewById(R.id.cs_list_street_view_progress);
        streetViewButton = (ImageButton) findViewById(R.id.cs_list_street_view_button);
        actionsOverStreetViewFields();
    }

    /**
     * Set the onClickListener over the GoogleStreetView button
     */
    private void actionsOverStreetViewFields() {
        streetViewButton
                .setOnClickListener(new android.view.View.OnClickListener() {
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
                                Uri streetViewUri = Uri
                                        .parse("google.streetview:cbll="
                                                + currentLocation.latitude
                                                + ","
                                                + currentLocation.longitude
                                                + "&cbp=1,90,,0,1.0&mz=20");
                                Intent streetViewIntent = new Intent(
                                        Intent.ACTION_VIEW, streetViewUri);
                                startActivity(streetViewIntent);
                            } else {
                                ActivityUtils
                                        .showGoogleStreetViewErrorDialog(ClosestStationsList.this);
                            }
                        }
                    }
                });
    }

    /**
     * Used to refresh the content of the ClosestStationsListFragment according
     * to the newly retrieved location
     */
    public void refreshClosestStationsListFragment() {
        // Refresh the fragment
        ClosestStationsListFragment csListFragment = ((ClosestStationsListFragment) getSupportFragmentManager()
                .findFragmentByTag(FRAGMENT_TAG_NAME));
        if (csListFragment != null) {
            csListFragment.onFragmentRefresh(currentLocation, null);
        }

        // Process the layout fields
        actionsOnFragmentStart();
    }

    public void refreshClosestStationsListFragmentFailed() {
        actionsOnFragmentStart();
    }

    /**
     * Create a new ClosestStationsListFragment with all needed information
     */
    private void startClosestStationsListFragment() {
        Fragment fragment;

        if (savedInstanceState == null) {
            fragment = ClosestStationsListFragment.newInstance(currentLocation);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.cs_list_fragment, fragment, FRAGMENT_TAG_NAME)
                    .commit();
        }

        actionsOnFragmentStart();
    }

    /**
     * Set the Fragment schedule hour label and show the needed arrows
     */
    private void actionsOnFragmentStart() {
        loadLocationStreetView();

        csListFragment.setVisibility(View.VISIBLE);
        csListLoading.setVisibility(View.GONE);
    }

    /**
     * Load the current location StreetView
     */
    private void loadLocationStreetView() {
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(ActivityUtils.initImageLoader(context));

        DisplayImageOptions displayImageOptions = ActivityUtils
                .displayImageOptions();

        String imageUrl = String.format(Constants.FAVOURITES_IMAGE_URL,
                currentLocation.latitude + "", currentLocation.longitude + "");
        imageLoader.displayImage(imageUrl, streetView, displayImageOptions,
                new SimpleImageLoadingListener() {
                    @Override
                    public void onLoadingStarted(String imageUri, View view) {
                        streetViewLoading.setVisibility(View.VISIBLE);
                        streetViewButton.setVisibility(View.GONE);
                    }

                    @Override
                    public void onLoadingFailed(String imageUri, View view,
                                                FailReason failReason) {
                        streetViewLoading.setVisibility(View.GONE);
                        streetViewButton.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onLoadingComplete(String imageUri, View view,
                                                  Bitmap loadedImage) {
                        streetViewLoading.setVisibility(View.GONE);
                        streetViewButton.setVisibility(View.VISIBLE);
                    }
                });
    }
}