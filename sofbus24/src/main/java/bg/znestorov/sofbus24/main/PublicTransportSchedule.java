package bg.znestorov.sofbus24.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.format.DateFormat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

import java.util.ArrayList;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.PublicTransportStationEntity;
import bg.znestorov.sofbus24.entity.ScheduleEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.publictransport.PublicTransportScheduleFragment;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;

public class PublicTransportSchedule extends SherlockFragmentActivity {

    private static final String SAVED_STATE_KEY = "Current Schedule Hour Index";
    private static final String FRAGMENT_TAG_NAME = "PublicTransport Schedule Fragment";
    private Activity context;
    private GlobalEntity globalContext;
    private Bundle savedInstanceState;
    private FavouritesDataSource favouritesDatasource;
    private ActionBar actionBar;
    private VehicleEntity vehicle;
    private ImageView addToFavourites;
    private ImageButton leftArrow;
    private ImageButton rightArrow;
    private View ptStationView;
    private TextView ptScheduleTime;
    private TextView ptStationName;
    private TextView ptDirection;
    private TextView ptScheduleFirst;
    private TextView ptScheduleLast;
    private View ptScheduleFragment;
    private ProgressBar ptScheduleLoading;
    private PublicTransportStationEntity ptStation;
    private ArrayList<ArrayList<String>> scheduleHourList;
    private int currentScheduleHourIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_public_transport_schedule);

        // Get the current context and create a FavouritesDatasource and
        // a SavedInstanceState objects
        context = PublicTransportSchedule.this;
        globalContext = (GlobalEntity) getApplicationContext();
        favouritesDatasource = new FavouritesDataSource(context);
        this.savedInstanceState = savedInstanceState;

        initBundleInfo();
        initLayoutFields();
        initFragmentContent();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(SAVED_STATE_KEY, currentScheduleHourIndex);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem reset = menu.findItem(R.id.action_pt_reset);

        if (currentScheduleHourIndex != getActiveScheduleHourIndex(scheduleHourList)) {
            reset.setVisible(true);
        } else {
            reset.setVisible(false);
        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getSupportMenuInflater().inflate(
                R.menu.activity_public_transport_schedule_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_pt_reset:
                // This is needed, because the fragment should be restarted
                savedInstanceState = null;

                initActiveFragmentContent();
                return true;
            case R.id.action_pt_refresh:
                initRefresh();
                return true;
            case R.id.action_pt_map:
                if (!globalContext.areServicesAvailable()) {
                    GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                            .newInstance(getString(R.string.app_google_play_msg));
                    googlePlayServicesErrorDialog.show(getSupportFragmentManager(),
                            "GooglePlayServicesErrorDialog");
                } else {
                    if (ptStation.hasCoordinates()) {
                        Intent ptMapIntent = new Intent(context, StationMap.class);
                        ptMapIntent.putExtra(Constants.BUNDLE_STATION_MAP,
                                ptStation);
                        startActivity(ptMapIntent);
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
     * Initialize the refresh by putting a 500 ms delay
     */
    private void initRefresh() {
        // This is needed, because the fragment should be restarted
        savedInstanceState = null;

        // Show the loading ProgressBar
        ptScheduleFragment.setVisibility(View.GONE);
        ptScheduleLoading.setVisibility(View.VISIBLE);

        // Start a new thread - just to wait 500 ms
        Handler handler = new Handler();
        Runnable myRunnable = new Runnable() {
            public void run() {
                try {
                    // Reset the time shown in the action bar
                    actionBar.setSubtitle(Utils.getCurrentDateTime());

                    // Initialize the fragment content
                    initFragmentContent();
                } catch (Exception e) {
                }
            }
        };

        handler.postDelayed(myRunnable, 500);
    }

    /**
     * Get and process the Bundle information
     */
    private void initBundleInfo() {

        // Get the PublicTransportStation and VehicleEntity objects from Bundle
        Bundle extras = getIntent().getExtras();
        ptStation = (PublicTransportStationEntity) extras
                .get(Constants.BUNDLE_PUBLIC_TRANSPORT_SCHEDULE);
        vehicle = (VehicleEntity) extras
                .get(Constants.BUNDLE_PUBLIC_TRANSPORT_VEHICLE);

        // Get an ArrayList of ArrayList with all active schedules
        scheduleHourList = getScheduleHourList(ptStation);

        // Get the active schedule (according to the current hour)
        if (savedInstanceState != null) {
            currentScheduleHourIndex = savedInstanceState
                    .getInt(SAVED_STATE_KEY);
        } else {
            currentScheduleHourIndex = getActiveScheduleHourIndex(scheduleHourList);
        }
    }

    /**
     * Initialize the layout fields (ActionBar, ImageViews and TextVies)
     */
    private void initLayoutFields() {
        // Get the Action Bar
        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Get the Favourite ImageView and the Arrow ImageButtons
        addToFavourites = (ImageView) findViewById(R.id.pt_schedule_favourite);
        leftArrow = (ImageButton) findViewById(R.id.pt_schedule_img_left);
        rightArrow = (ImageButton) findViewById(R.id.pt_schedule_img_right);
        actionsOverImageButtons();

        // Get the header TextView views and set them labels
        ptStationView = findViewById(R.id.pt_schedule_station_view);
        ptScheduleTime = (TextView) findViewById(R.id.pt_schedule_time);
        ptStationName = (TextView) findViewById(R.id.pt_schedule_station_name);
        ptDirection = (TextView) findViewById(R.id.pt_schedule_direction);
        actionsOverTextViews();

        // Get the Fragment and the loading ProgressBar
        ptScheduleFragment = findViewById(R.id.pt_schedule_fragment);
        ptScheduleLoading = (ProgressBar) findViewById(R.id.pt_schedule_loading);

        // Get the first and last train TextViews and set them labels
        ptScheduleFirst = (TextView) findViewById(R.id.pt_schedule_first);
        ptScheduleLast = (TextView) findViewById(R.id.pt_schedule_last);
        actionsOverScheduleTextViews();
    }

    /**
     * Set onClickListeners over the ImageButtons
     */
    private void actionsOverImageButtons() {
        // Set onClickListener over the Favorites ImageView
        addToFavourites.setImageResource(getFavouriteImage(ptStation));
        addToFavourites.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                ActivityUtils.toggleFavouritesStation(context,
                        favouritesDatasource, ptStation, addToFavourites);
            }
        });

        // Set onClickListener over the left arrow
        leftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savedInstanceState = null;
                currentScheduleHourIndex--;

                // Sometimes if the device is slow, the arrow is still visible
                // on the first fragment and cause an Exception
                if (currentScheduleHourIndex >= 0) {
                    initFragmentContent();
                } else {
                    showNeededArrows();
                }
            }
        });

        // Set onClickListener over the right arrow
        rightArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savedInstanceState = null;
                currentScheduleHourIndex++;

                // Sometimes if the device is slow, the arrow is still visible
                // on the last fragment and cause an Exception
                if (currentScheduleHourIndex < scheduleHourList.size()) {
                    initFragmentContent();
                } else {
                    showNeededArrows();
                }
            }
        });
    }

    /**
     * Get the favorites image according to this if exists in the Favorites
     * Database
     *
     * @param station the station on the current row
     * @return the station image id
     */
    private Integer getFavouriteImage(StationEntity station) {
        Integer favouriteImage;

        favouritesDatasource.open();
        if (favouritesDatasource.getStation(station) == null) {
            favouriteImage = R.drawable.ic_fav_empty;
        } else {
            favouriteImage = R.drawable.ic_fav_full;
        }
        favouritesDatasource.close();

        return favouriteImage;
    }

    /**
     * Set labels on the TextViews
     */
    private void actionsOverTextViews() {

        String stationName = ptStation.getName();
        String stationNumber = ptStation.getNumber();
        String stationDirection = ptStation.getDirection();

        actionBar.setTitle(getActionBarTitle());
        actionBar.setSubtitle(Utils.getCurrentDateTime());
        ptStationName.setText(Html.fromHtml(stationName + " (" + stationNumber
                + ")"));
        ptDirection.setText(Html.fromHtml(stationDirection));
    }

    /**
     * Create the ActionBar title using the vehicle type and number
     *
     * @return the actionBar title in format - [VehicleType] №[VehicleNumber]
     */
    private String getActionBarTitle() {

        String title;

        switch (vehicle.getType()) {
            case BUS:
                title = String.format(getString(R.string.pt_bus),
                        vehicle.getNumber());
                break;
            case TROLLEY:
                title = String.format(getString(R.string.pt_trolley),
                        vehicle.getNumber());
                break;
            case TRAM:
                title = String.format(getString(R.string.pt_tram),
                        vehicle.getNumber());
                break;
            default:
                title = String.format(getString(R.string.pt_bus),
                        vehicle.getNumber());
                break;
        }

        return title;
    }

    /**
     * Set labels on the schedule TextViews
     */
    private void actionsOverScheduleTextViews() {
        if (ptScheduleFirst != null && ptScheduleLast != null) {
            ptScheduleFirst.setText(ptStation.getFirstSchedule());
            ptScheduleLast.setText(ptStation.getLastSchedule());
        }
    }

    /**
     * Check which fragment should be loaded
     */
    private void initFragmentContent() {
        if (currentScheduleHourIndex == getActiveScheduleHourIndex(scheduleHourList)) {
            initActiveFragmentContent();
        } else {
            initCurrentFragmentContent();
        }
    }

    /**
     * Initialize the active fragment
     */
    private void initActiveFragmentContent() {

        // Get the active schedule (according to the current hour)
        currentScheduleHourIndex = getActiveScheduleHourIndex(scheduleHourList);

        // Declare that the options menu has changed, so should be recreated
        // (make the system calls the method onPrepareOptionsMenu)
        supportInvalidateOptionsMenu();

        // Format the schedule list
        ArrayList<String> formattedScheduleList = formatScheduleList(scheduleHourList
                .get(currentScheduleHourIndex));

        // Get the active hour of the schedule (according to the current time
        // for this hour)
        int activeScheduleIndex = getActiveScheduleIndex(formattedScheduleList);

        // Initialize the active fragment
        startFragment(formattedScheduleList, true, activeScheduleIndex);
    }

    /**
     * Initialize the current fragment
     */
    private void initCurrentFragmentContent() {
        // Declare that the options menu has changed, so should be recreated
        // (make the system calls the method onPrepareOptionsMenu)
        supportInvalidateOptionsMenu();

        // Format the schedule list
        ArrayList<String> formattedScheduleList = formatScheduleList(scheduleHourList
                .get(currentScheduleHourIndex));

        // Get the active hour of the schedule (according to the current time
        // for this hour)
        int activeScheduleIndex = getActiveScheduleIndex(formattedScheduleList);

        // Initialize the active fragment
        startFragment(formattedScheduleList, false, activeScheduleIndex);
    }

    /**
     * Create a new PublicTransportScheduleFragment with all needed information
     *
     * @param formattedScheduleList a formatted schedule list with current times of arrival and
     *                              remaining times
     * @param isActive              if the fragment is active
     * @param scheduleIndex         the active hour of the schedule (according to the current time
     *                              for this hour)
     */
    private void startFragment(ArrayList<String> formattedScheduleList,
                               boolean isActive, int scheduleIndex) {
        Fragment fragment;

        if (savedInstanceState == null) {
            ScheduleEntity ptScheduleEntity = new ScheduleEntity(
                    formattedScheduleList, isActive, scheduleIndex);
            fragment = PublicTransportScheduleFragment
                    .newInstance(ptScheduleEntity);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.pt_schedule_fragment, fragment,
                            FRAGMENT_TAG_NAME).commit();
        }

        actionsOnFragmentChange();
    }

    /**
     * Set the Fragment schedule hour label and show the needed arrows
     */
    private void actionsOnFragmentChange() {

        // Change the color of the station square
        if (ThemeChange.isLightTheme(context)) {
            ptStationView
                    .setBackgroundResource(R.color.app_light_theme_schedule_station);
        } else {
            ptStationView
                    .setBackgroundResource(R.color.app_dark_theme_schedule_station);
        }

        // Set the PublicTransportScheduleTime label
        String hourRange = getHour(scheduleHourList.get(
                currentScheduleHourIndex).get(0))
                + ":00";
        ptScheduleTime.setText(hourRange);

        // Show needed arrows
        showNeededArrows();

        ptScheduleFragment.setVisibility(View.VISIBLE);
        ptScheduleLoading.setVisibility(View.GONE);
    }

    /**
     * Show the needed arrows, according to the visible fragment
     */
    private void showNeededArrows() {
        if (currentScheduleHourIndex == 0) {
            leftArrow.setVisibility(View.GONE);
            rightArrow.setVisibility(View.VISIBLE);
        } else if (currentScheduleHourIndex == scheduleHourList.size() - 1) {
            leftArrow.setVisibility(View.VISIBLE);
            rightArrow.setVisibility(View.GONE);
        } else {
            leftArrow.setVisibility(View.VISIBLE);
            rightArrow.setVisibility(View.VISIBLE);
        }
    }

    /**
     * Get a list with all schedule hours for this station (if for some hour
     * there is no times of arrival - it is not added to the list)
     *
     * @param ptStation the PublicTransportStation object retrieved from the Bundle
     * @return a list with the schedule hours
     */
    private ArrayList<ArrayList<String>> getScheduleHourList(
            PublicTransportStationEntity ptStation) {
        ArrayList<ArrayList<String>> scheduleHourList = new ArrayList<ArrayList<String>>();

        for (int i = 4; i <= 24; i++) {
            ArrayList<String> ptSchedule = ptStation.getSchedule().get(i);

            if (ptSchedule != null && !ptSchedule.isEmpty()) {
                scheduleHourList.add(ptSchedule);
            }
        }

        return scheduleHourList;
    }

    /**
     * Get the index of the current public transport schedule in the
     * scheduleHourList
     *
     * @param scheduleHourList a list containing all schedules for this station (that has
     *                         time of arrivals)
     * @return the index of the current schedule hour
     */
    private int getActiveScheduleHourIndex(
            ArrayList<ArrayList<String>> scheduleHourList) {
        int currentScheduleHourIndex = -1;

        int currentHour = Integer.parseInt(DateFormat.format("kk",
                new java.util.Date()).toString());
        boolean isCurrentHourInRange = false;

        for (int i = 0; i < scheduleHourList.size(); i++) {
            int scheduleHour = getHour(scheduleHourList.get(i).get(0));
            if (scheduleHour == currentHour) {
                // This rule is set in case the current hour is after the last
                // time schedule for the current fragment (if the current hour
                // is 15:59, and the last schedule is 15:50). In this case we
                // get the next hour as the current one
                if (isScheduleActive(scheduleHourList.get(i))) {
                    isCurrentHourInRange = true;
                    currentScheduleHourIndex = i;
                } else {
                    // Check if this is the last hour that there is a schedule.
                    // If so - do nothing
                    if (i != scheduleHourList.size() - 1) {
                        isCurrentHourInRange = true;
                        currentScheduleHourIndex = i + 1;
                    }
                }

                break;
                // Just in case when there is no schedule hour matching the
                // current hour
            } else if (scheduleHour == currentHour + 1
                    || scheduleHour == currentHour + 2
                    || scheduleHour == currentHour + 3
                    || scheduleHour == currentHour + 4) {
                isCurrentHourInRange = true;
                currentScheduleHourIndex = i;

                break;
            }
        }

        // Check if the current hour is present in the schedule. If not - set it
        // to the first fragment
        if (!isCurrentHourInRange) {
            currentScheduleHourIndex = 0;
        }

        return currentScheduleHourIndex;
    }

    /**
     * Get the hour part of a time input in format HH:MM
     *
     * @param time the time input in format HH:MM
     * @return the hour part of the time input
     */
    private int getHour(String time) {
        int hour;

        if (time != null && time.contains(":")) {
            hour = Integer.parseInt(time.replaceAll(":.*", ""));
        } else {
            hour = -1;
        }

        return hour;
    }

    /**
     * Check if the current fragment contains a schedule that is after the
     * current hour. For example:<br/>
     * <b>If the last schedule time is 15:50 and the current hour is 15:59 - the
     * fragment is not Active</b>
     *
     * @param scheduleList the current fragment schedule time list
     * @return if the fragment is active or not
     */
    private boolean isScheduleActive(ArrayList<String> scheduleList) {
        boolean isScheduleActive = false;

        if (scheduleList != null && scheduleList.size() > 0) {
            String currentTime = DateFormat.format("kk:mm",
                    new java.util.Date()).toString();
            String ptScheduleTime = scheduleList.get(scheduleList.size() - 1);
            String differenceTime = Utils.getTimeDifference(context,
                    ptScheduleTime, currentTime);

            if (!"---".equals(differenceTime)) {
                isScheduleActive = true;
            }
        }

        return isScheduleActive;
    }

    /**
     * Find the difference between the current time and the public transport
     * schedule time and create new list containing both
     *
     * @param scheduleList the current fragment schedule time list
     * @return an ArrayList containing the current time and the time left
     */
    private ArrayList<String> formatScheduleList(ArrayList<String> scheduleList) {
        ArrayList<String> formattedPTScheduleList = new ArrayList<String>();
        String currentTime = DateFormat.format("kk:mm", new java.util.Date())
                .toString();

        for (int i = 0; i < scheduleList.size(); i++) {
            String ptScheduleTime = scheduleList.get(i);
            String differenceTime = Utils.getTimeDifference(context,
                    ptScheduleTime, currentTime);

            if (!"---".equals(differenceTime)) {
                ptScheduleTime = String.format(ptScheduleTime + " (%s)",
                        differenceTime);
            }

            formattedPTScheduleList.add(ptScheduleTime);
        }

        return formattedPTScheduleList;
    }

    /**
     * Get the current active schedule time from the active schedule list
     *
     * @param scheduleList the current fragment schedule time list (must be formatted
     *                     list)
     * @return the index of the current schedule
     */
    private int getActiveScheduleIndex(ArrayList<String> scheduleList) {
        int currentScheduleIndex = -1;

        for (int i = 0; i < scheduleList.size(); i++) {
            if (scheduleList.get(i).contains("~")) {
                currentScheduleIndex = i;
                break;
            }
        }

        return currentScheduleIndex;
    }

}