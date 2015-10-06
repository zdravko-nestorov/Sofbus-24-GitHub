package bg.znestorov.sofbus24.metro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

import java.util.ArrayList;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.MetroStationEntity;
import bg.znestorov.sofbus24.entity.ScheduleEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.main.StationMap;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;

public class MetroScheduleWrapperFragment extends SherlockFragment {

    private static final String BUNDLE_METRO_SCHEDULE = "Metro Schedule";
    private static final String BUNDLE_SAVED_STATE_KEY = "Current Schedule Hour Index";
    private static final String BUNDLE_FRAGMENT_TAG_NAME = "Metro Schedule Fragment";
    private SherlockFragmentActivity context;
    private GlobalEntity globalContext;
    private Bundle savedInstanceState;
    private FavouritesDataSource favouritesDatasource;
    private ActionBar actionBar;
    private ImageView addToFavourites;
    private ImageButton leftArrow;
    private ImageButton rightArrow;
    private View metroStationView;
    private TextView metroScheduleTime;
    private TextView metroStationName;
    private TextView metroDirection;
    private TextView metroScheduleFirst;
    private TextView metroScheduleLast;
    private View metroScheduleFragment;
    private ProgressBar metroScheduleLoading;
    private MetroStationEntity ms;
    private ArrayList<ArrayList<String>> scheduleHourList;
    private int currentScheduleHourIndex = 0;

    public static MetroScheduleWrapperFragment newInstance(MetroStationEntity ms) {
        MetroScheduleWrapperFragment metroScheduleWrapperFragment = new MetroScheduleWrapperFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_METRO_SCHEDULE, ms);
        metroScheduleWrapperFragment.setArguments(bundle);

        return metroScheduleWrapperFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(
                R.layout.activity_metro_schedule_wrapper_fragment, container,
                false);

        // Get the current context and create a FavouritesDatasource and
        // a SavedInstanceState objects
        context = getSherlockActivity();
        globalContext = (GlobalEntity) context.getApplicationContext();
        favouritesDatasource = new FavouritesDataSource(context);
        this.savedInstanceState = savedInstanceState;

        initBundleInfo();
        initLayoutFields(fragmentView);
        initFragmentContent();

        setHasOptionsMenu(true);

        return fragmentView;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(BUNDLE_SAVED_STATE_KEY,
                currentScheduleHourIndex);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        MenuItem reset = menu.findItem(R.id.action_ms_reset);

        if (currentScheduleHourIndex != getActiveScheduleHourIndex(scheduleHourList)) {
            reset.setVisible(true);
        } else {
            reset.setVisible(false);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_ms_reset:
                // This is needed, because the fragment should be restarted
                savedInstanceState = null;

                initActiveFragmentContent();
                return true;
            case R.id.action_ms_refresh:
                initRefresh(500);
                return true;
            case R.id.action_ms_map:
                if (!globalContext.areServicesAvailable()) {
                    GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                            .newInstance(getString(R.string.app_google_play_msg));
                    googlePlayServicesErrorDialog.show(getFragmentManager(),
                            "GooglePlayServicesErrorDialog");
                } else {
                    Intent metroMapIntent = new Intent(context, StationMap.class);
                    metroMapIntent.putExtra(Constants.BUNDLE_STATION_MAP, ms);
                    startActivity(metroMapIntent);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Initialize the refresh by putting waitTime delay
     *
     * @param waitTime the period of time for the refresh (in milliseconds)
     */
    public void initRefresh(int waitTime) {
        // This is needed, because the fragment should be restarted
        savedInstanceState = null;

        // Show the loading ProgressBar
        metroScheduleFragment.setVisibility(View.GONE);
        metroScheduleLoading.setVisibility(View.VISIBLE);

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

        handler.postDelayed(myRunnable, waitTime);
    }

    /**
     * Get and process the Bundle information
     */
    private void initBundleInfo() {
        // Get the MetroStation object from Bundle
        Bundle extras = getArguments();
        ms = (MetroStationEntity) extras.get(BUNDLE_METRO_SCHEDULE);

        // Get an ArrayList of ArrayList with all active schedules
        scheduleHourList = getScheduleHourList(ms);

        // Get the active schedule (according to the current hour)
        if (savedInstanceState != null) {
            currentScheduleHourIndex = savedInstanceState
                    .getInt(BUNDLE_SAVED_STATE_KEY);
        } else {
            currentScheduleHourIndex = getActiveScheduleHourIndex(scheduleHourList);
        }
    }

    /**
     * Initialize the layout fields (ActionBar, ImageViews and TextVies)
     *
     * @param fragmentView the current fragment view
     */
    private void initLayoutFields(View fragmentView) {
        // Get the Action Bar
        actionBar = context.getSupportActionBar();

        // Get the Favorite ImageView and the Arrow ImageButtons
        addToFavourites = (ImageView) fragmentView
                .findViewById(R.id.metro_schedule_favourite);
        leftArrow = (ImageButton) fragmentView
                .findViewById(R.id.metro_schedule_img_left);
        rightArrow = (ImageButton) fragmentView
                .findViewById(R.id.metro_schedule_img_right);
        actionsOverImageButtons();

        // Get the header TextView views and set them labels
        metroStationView = fragmentView
                .findViewById(R.id.metro_schedule_station_view);
        metroScheduleTime = (TextView) fragmentView
                .findViewById(R.id.metro_schedule_time);
        metroStationName = (TextView) fragmentView
                .findViewById(R.id.metro_schedule_station_name);
        metroDirection = (TextView) fragmentView
                .findViewById(R.id.metro_schedule_direction);
        actionsOverTextViews();

        // Get the Fragment and the loading ProgressBar
        metroScheduleFragment = fragmentView
                .findViewById(R.id.metro_schedule_fragment);
        metroScheduleLoading = (ProgressBar) fragmentView
                .findViewById(R.id.metro_schedule_loading);

        // Get the first and last train TextViews and set them labels
        metroScheduleFirst = (TextView) fragmentView
                .findViewById(R.id.metro_schedule_first);
        metroScheduleLast = (TextView) fragmentView
                .findViewById(R.id.metro_schedule_last);
        actionsOverScheduleTextViews();

        // Get the legend TextView
        TextView metroScheduleLegend = (TextView) fragmentView
                .findViewById(R.id.metro_schedule_legend);
        metroScheduleLegend.setText(Html
                .fromHtml(getString(R.string.metro_schedule_legend)));
    }

    /**
     * Set onClickListeners over the ImageButtons
     */
    private void actionsOverImageButtons() {
        // Set onClickListener over the Favorites ImageView
        addToFavourites.setImageResource(getFavouriteImage(ms));
        addToFavourites.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                ActivityUtils.toggleFavouritesStation(context,
                        favouritesDatasource, ms, addToFavourites);
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
                if (currentScheduleHourIndex > 0) {
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
        String stationNumber = ms.getNumber();
        String stationName = ms.getName();
        stationName = stationName.substring(0, 4) + ". "
                + Utils.getValueAfter(stationName, " ").trim();
        String stationDirection = ms.getDirection(context);

        actionBar.setSubtitle(Utils.getCurrentDateTime());
        metroStationName.setText(Html.fromHtml(stationName + " ("
                + stationNumber + ")"));
        metroDirection.setText(Html.fromHtml(stationDirection));
    }

    /**
     * Set labels on the schedule TextViews
     */
    private void actionsOverScheduleTextViews() {
        if (metroScheduleFirst != null && metroScheduleLast != null) {
            metroScheduleFirst.setText(ms.getFirstSchedule());
            metroScheduleLast.setText(ms.getLastSchedule());
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
        context.supportInvalidateOptionsMenu();

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

        // Format the schedule list
        ArrayList<String> formattedScheduleList = formatScheduleList(scheduleHourList
                .get(currentScheduleHourIndex));

        // Declare that the options menu has changed, so should be recreated
        // (make the system calls the method onPrepareOptionsMenu)
        context.supportInvalidateOptionsMenu();

        // Get the active hour of the schedule (according to the current time
        // for this hour)
        int activeScheduleIndex = getActiveScheduleIndex(formattedScheduleList);

        // Initialize the active fragment
        startFragment(formattedScheduleList, false, activeScheduleIndex);
    }

    /**
     * Create a new MetroScheduleFragment with all needed information
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
            ScheduleEntity metroScheduleEntity = new ScheduleEntity(
                    formattedScheduleList, isActive, scheduleIndex);
            fragment = MetroScheduleFragment.newInstance(metroScheduleEntity);
        } else {
            fragment = getChildFragmentManager().findFragmentByTag(
                    BUNDLE_FRAGMENT_TAG_NAME);
        }

        getChildFragmentManager()
                .beginTransaction()
                .replace(R.id.metro_schedule_fragment, fragment,
                        BUNDLE_FRAGMENT_TAG_NAME).commit();

        actionsOnFragmentChange();
    }

    /**
     * Set the Fragment schedule hour label and show the needed arrows
     */
    private void actionsOnFragmentChange() {

        // Change the color of the station square
        if (ThemeChange.isLightTheme(context)) {
            metroStationView
                    .setBackgroundResource(R.color.app_light_theme_schedule_station);
        } else {
            metroStationView
                    .setBackgroundResource(R.color.app_dark_theme_schedule_station);
        }

        // Set the MetroScheduleTime label
        String hourRange = getHour(scheduleHourList.get(
                currentScheduleHourIndex).get(0))
                + ":00";
        metroScheduleTime.setText(hourRange);

        // Show needed arrows
        showNeededArrows();

        metroScheduleFragment.setVisibility(View.VISIBLE);
        metroScheduleLoading.setVisibility(View.GONE);
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
     * @param ms the MetroStation object retrieved from the Bundle
     * @return a list with the schedule hours
     */
    private ArrayList<ArrayList<String>> getScheduleHourList(
            MetroStationEntity ms) {
        ArrayList<ArrayList<String>> scheduleHourList = new ArrayList<ArrayList<String>>();

        for (int i = 4; i <= 24; i++) {
            ArrayList<String> metroSchedule = ms.getSchedule().get(i);

            if (metroSchedule != null && !metroSchedule.isEmpty()) {
                scheduleHourList.add(metroSchedule);
            }
        }

        return scheduleHourList;
    }

    /**
     * Get the index of the current metro schedule in the scheduleHourList
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
            String metroScheduleTime = scheduleList
                    .get(scheduleList.size() - 1);
            String differenceTime = Utils.getTimeDifference(context,
                    metroScheduleTime, currentTime);

            if (!"---".equals(differenceTime)) {
                isScheduleActive = true;
            }
        }

        return isScheduleActive;
    }

    /**
     * Find the difference between the current time and the metro schedule time
     * and create new list containing both
     *
     * @param scheduleList the current fragment schedule time list
     * @return an ArrayList containing the current time and the time left
     */
    private ArrayList<String> formatScheduleList(ArrayList<String> scheduleList) {
        ArrayList<String> formattedMetroScheduleList = new ArrayList<String>();
        String currentTime = DateFormat.format("kk:mm", new java.util.Date())
                .toString();

        for (int i = 0; i < scheduleList.size(); i++) {
            String metroScheduleTime = scheduleList.get(i);
            String differenceTime = Utils.getTimeDifference(context,
                    metroScheduleTime, currentTime);

            if (!"---".equals(differenceTime)) {
                metroScheduleTime = String.format(metroScheduleTime + " (%s)",
                        differenceTime);
            }

            formattedMetroScheduleList.add(metroScheduleTime);
        }

        return formattedMetroScheduleList;
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
