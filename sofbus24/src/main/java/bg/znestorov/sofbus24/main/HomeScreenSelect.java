package bg.znestorov.sofbus24.main;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.analytics.GoogleAnalytics;

import bg.znestorov.sofbus24.about.Configuration;
import bg.znestorov.sofbus24.databases.ScheduleDatabaseUtils;
import bg.znestorov.sofbus24.databases.Sofbus24DatabaseUtils;
import bg.znestorov.sofbus24.databases.Sofbus24SQLite;
import bg.znestorov.sofbus24.droidtrans.DroidTransLoadInfo;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.UpdateTypeEnum;
import bg.znestorov.sofbus24.gcm.GcmPreferences;
import bg.znestorov.sofbus24.gcm.RetrieveRegId;
import bg.znestorov.sofbus24.home.screen.Sofbus24DatabaseErrorDialog;
import bg.znestorov.sofbus24.home.screen.Sofbus24DatabaseErrorDialog.OnRecreateDatabaseListener;
import bg.znestorov.sofbus24.metro.MetroLoadStations;
import bg.znestorov.sofbus24.navigation.NavDrawerHomeScreenPreferences;
import bg.znestorov.sofbus24.permissions.AppPermissions;
import bg.znestorov.sofbus24.permissions.PermissionsUtils;
import bg.znestorov.sofbus24.schedule.ScheduleLoadVehicles;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.HmsUtils;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;

/**
 * The application startup activity. It is used to fill the DB with information,
 * to load some data and to check for an update periodically.
 * <p/>
 * A strange error occurs sometimes - {java.lang.NullPointerException in
 * android.app.LoadedApk.initializeJavaContextClassLoader}. This is a verbose
 * error message raised by underlying framework when dalvik re-install .apk file
 * and trying to reuse or recycle the previous opened activity/view from the
 * same package (if you haven't closed the previous installed app yet). It has
 * nothing to do with your app, moreover, it is very unlikely that your app will
 * get freezed or crashed cause by this verbose error message on end user's
 * device.
 * <p/>
 * For more information, StackOverflow post:<br/>
 * {http://stackoverflow.com/questions/10150899/runtimeexception-unable-to-
 * instantiate-application/10158241#10158241}
 *
 * @author Zdravko Nestorov
 */
public class HomeScreenSelect extends FragmentActivity implements
        OnRecreateDatabaseListener {

    public static final int REQUEST_CODE_HOME_SCREEN_SELECT = 0;
    public static final int RESULT_CODE_ACTIVITY_NEW = 1;
    public static final int RESULT_CODE_ACTIVITY_FINISH = 2;
    public static final int RESULT_CODE_ACTIVITY_RESTART = 3;
    private static final String BUNDLE_USER_CHOICE = "USER CHOICE";
    private static final String BUNDLE_IS_HOME_SCREEN_BOX_VIEW_VISIBLE = "IS HOME SCREEN BOX VIEW VISIBLE";
    private static final Integer MAX_STARTUP_COUNT = 2;
    private FragmentActivity context;
    private GlobalEntity globalContext;
    private int userChoice = -1;
    private View homeScreenBoxView;
    private boolean isHomeScreenBoxViewVisible;
    private boolean shouldExecuteOnResume;
    private ActivityResultLauncher<String[]> permissionLauncher;

    /**
     * Make a launcher for a previously-{@link ActivityResultCaller#registerForActivityResult}
     * prepared call to start the process of executing an {@link ActivityResultContracts}, before
     * the activity is created to prevent orientation changes problems.
     */
    private final ActivityResultLauncher<Intent> homeScreenLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    shouldExecuteOnResume = false;

                    switch (result.getResultCode()) {
                        case RESULT_CODE_ACTIVITY_NEW:
                            ActivityTracker.selectedHomeScreen(context);
                        case RESULT_CODE_ACTIVITY_RESTART:
                            processAppStartUp(null, false);
                            break;
                        case RESULT_CODE_ACTIVITY_FINISH:
                            finish();
                            break;
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initApplicationHssContext();

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_home_screen_select);

        // Get the application and the current context
        context = HomeScreenSelect.this;
        userChoice = savedInstanceState == null ? -1 : savedInstanceState
                .getInt(BUNDLE_USER_CHOICE);
        isHomeScreenBoxViewVisible = savedInstanceState == null || savedInstanceState
                .getBoolean(BUNDLE_IS_HOME_SCREEN_BOX_VIEW_VISIBLE);
        shouldExecuteOnResume = false;

        // Init the layout fields
        initLayoutFields(savedInstanceState, true);

        // In case of first start, check if the statistics should be
        // enabled/disabled
        if (savedInstanceState == null) {
            registerGCM();
            enableDisableStatistics();
        }

        // Create a permission launcher to request permissions
        this.permissionLauncher = PermissionsUtils.createPermissionLauncher(context,
                AppPermissions.HOME_SCREEN, this::startHomeScreen);
    }

    @Override
    protected void onResume() {
        super.onResume();
        initApplicationHssContext();

        if (shouldExecuteOnResume) {
            processAppStartUp(null, false);
        } else {
            shouldExecuteOnResume = true;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        isHomeScreenBoxViewVisible = homeScreenBoxView == null || homeScreenBoxView
                .getVisibility() == View.VISIBLE;

        outState.putInt(BUNDLE_USER_CHOICE, userChoice);
        outState.putBoolean(BUNDLE_IS_HOME_SCREEN_BOX_VIEW_VISIBLE,
                isHomeScreenBoxViewVisible);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onBackPressed() {
        ActivityUtils.closeApplication(context);
    }

    /**
     * Get a launcher for a previously-{@link ActivityResultCaller#registerForActivityResult}
     * prepared call to start the process of executing an {@link ActivityResultContracts},
     * associated with the main screen.
     *
     * @return {@link ActivityResultLauncher}, associated with the main screen
     */
    public ActivityResultLauncher<Intent> getHomeScreenLauncher() {
        return homeScreenLauncher;
    }

    /**
     * Initialize the layout fields and load the needed data
     *
     * @param savedInstanceState the state of the activity
     * @param isFirstTimeStart   check if the method has been already started
     */
    private void initLayoutFields(Bundle savedInstanceState,
                                  boolean isFirstTimeStart) {

        // Check if the home screen box view should be visible or not
        homeScreenBoxView = findViewById(R.id.sofbus24_home_screen_box_view);
        if (isHomeScreenBoxViewVisible) {
            showHomeScreenBoxView();
        } else {
            hideHomeScreenBoxView();
        }

        // Check what action to be taken on application startup
        View homeScreenView = findViewById(R.id.sofbus24_home_screen);
        View loadingView = findViewById(R.id.sofbus24_loading);

        boolean isHomeScreenSet = NavDrawerHomeScreenPreferences
                .isUserHomeScreenChosen(context);

        if (!isHomeScreenSet) {
            homeScreenView.setVisibility(View.VISIBLE);
            loadingView.setVisibility(View.GONE);

            processUserChoice(savedInstanceState);
        } else {
            homeScreenView.setVisibility(View.GONE);
            loadingView.setVisibility(View.VISIBLE);

            processAppStartUp(savedInstanceState, isFirstTimeStart);
        }
    }

    /**
     * Process the user choice and load the needed information
     *
     * @param savedInstanceState the state of the activity
     */
    private void processUserChoice(final Bundle savedInstanceState) {

        final RadioGroup homeScreenChoiceGroup = (RadioGroup) findViewById(R.id.sofbus24_home_screen_select);
        final ImageButton homeScreenChoiceBtn = (ImageButton) findViewById(R.id.sofbus24_home_screen_select_btn);

        // Check if there is any user choice
        if (userChoice >= 0) {
            homeScreenChoiceGroup.check(getCheckedViewId());
            homeScreenChoiceBtn.setVisibility(View.VISIBLE);
        }

        // Check if the device is a tablet and show only two possible home
        // screens
        if (!globalContext.isPhoneDevice()) {
            findViewById(R.id.sofbus24_home_screen_droidtrans).setVisibility(
                    View.GONE);
        }

        // Show the next button in case of the first item selected
        homeScreenChoiceGroup
                .setOnCheckedChangeListener(new OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        userChoice = checkedId;

                        if (homeScreenChoiceBtn.getVisibility() == View.GONE) {
                            homeScreenChoiceBtn.setVisibility(View.VISIBLE);
                        }
                    }
                });

        // Set on click listener over the next button
        homeScreenChoiceBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                int userChoice = getCheckedViewNumber(homeScreenChoiceGroup
                        .getCheckedRadioButtonId());

                // Check if the user selected GoogleMaps as a home screen and if
                // there are GooglePlayServices installed on its device
                if (userChoice == 1 && !globalContext.areServicesAvailable()) {
                    GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                            .newInstance(getString(
                                    R.string.navigation_drawer_home_screen_error,
                                    getString(R.string.navigation_drawer_home_map)));
                    googlePlayServicesErrorDialog.show(
                            getSupportFragmentManager(),
                            "GooglePlayServicesHomeScreenErrorDialog");
                } else {
                    NavDrawerHomeScreenPreferences.setUserChoice(context,
                            userChoice);

                    initLayoutFields(savedInstanceState, false);
                }
            }
        });
    }

    /**
     * Get the id of the selected radio button
     *
     * @return the checked view id
     */
    private int getCheckedViewId() {

        int checkedViewId;

        switch (userChoice) {
            case 1:
                checkedViewId = R.id.sofbus24_home_screen_standard;
                break;
            case 2:
                checkedViewId = R.id.sofbus24_home_screen_map;
                break;
            case 3:
                checkedViewId = R.id.sofbus24_home_screen_droidtrans;
                break;
            default:
                checkedViewId = -1;
                break;
        }

        return checkedViewId;
    }

    /**
     * Check which radio button is checked by its id
     *
     * @param viewId the id of the checked radio button
     * @return the consequent number of the radio button
     */
    private int getCheckedViewNumber(int viewId) {

        int checkedViewNumber;

        switch (viewId) {
            case R.id.sofbus24_home_screen_standard:
                checkedViewNumber = 0;
                break;
            case R.id.sofbus24_home_screen_map:
                checkedViewNumber = 1;
                break;
            default:
                checkedViewNumber = 2;
                break;
        }

        return checkedViewNumber;

    }

    /**
     * Load the information into the database/objects and start the appropriate
     * screens
     *
     * @param savedInstanceState the state of the activity
     * @param isFirstTimeStart   check if the method has been already started
     */
    private void processAppStartUp(Bundle savedInstanceState,
                                   boolean isFirstTimeStart) {

        if (savedInstanceState == null || !isFirstTimeStart) {

            // Creates the configuration file
            Configuration.createConfiguration(context);

            // Retrieve the information from the DB
            createDatabase();
        }
    }

    /**
     * Retrieve the information from the DB
     */
    private void createDatabase() {

        CreateDatabases createDatabases = new CreateDatabases(context, 1);
        createDatabases.execute();
    }

    /**
     * Start the standard home screen fragment
     */
    private void startSofbus24() {
        Intent sofbus24Intent = new Intent(context, Sofbus24.class);
        getHomeScreenLauncher().launch(sofbus24Intent);
    }

    /**
     * Actions after the AsyncTask is finished
     */
    private void startHomeScreen() {

        int userHomeScreenChoice;
        if (NavDrawerHomeScreenPreferences.isUserHomeScreenChosen(context)) {
            userHomeScreenChoice = NavDrawerHomeScreenPreferences
                    .getUserHomeScreenChoice(context);
        } else {
            userHomeScreenChoice = 0;
            NavDrawerHomeScreenPreferences.setUserChoice(context,
                    userHomeScreenChoice);
        }

        switch (userHomeScreenChoice) {
            case 0:
                startSofbus24();
                break;
            case 1:
                ActivityUtils.startClosestStationsMap(context,
                        getSupportFragmentManager(), true);
                break;
            case 2:
                ActivityUtils.startDroidTrans(context, getSupportFragmentManager(),
                        true);
                break;
        }

        // Check for updates (only when everything is visualized)
        Utils.checkForUpdate(context, UpdateTypeEnum.APP);
        Utils.checkForUpdate(context, UpdateTypeEnum.DB);
    }

    /**
     * Register the client app with the Google Cloud Messaging service (if a
     * registration key is stored in a SharedPreferences class - continue as
     * usual)
     */
    private void registerGCM() {

        String regId = GcmPreferences.getRegistrationId(context);
        if (HmsUtils.isGms() && Utils.isEmpty(regId)) {
            RetrieveRegId retrieveRegId = new RetrieveRegId(context, 1);
            retrieveRegId.execute();
        }
    }

    /**
     * Enable or disable the GoogleAnalytics
     */
    private void enableDisableStatistics() {
        // Disable Google Analytics for HMS and GMS (not working with Android Target SDK >30)
        if (HmsUtils.isHms() || HmsUtils.isGms()) {
            return;
        }

        boolean googleAnalytics = PreferenceManager
                .getDefaultSharedPreferences(context).getBoolean(
                        Constants.PREFERENCE_KEY_GOOGLE_ANALYTICS,
                        Constants.PREFERENCE_DEFAULT_VALUE_GOOGLE_ANALYTICS);

        // Set the opposite value of the user choice to the AppOptOut (so
        // enable/disable automatic tracking)
        GoogleAnalytics.getInstance(getApplicationContext()).setAppOptOut(!googleAnalytics);
    }

    @Override
    public void onRecreateDatabaseClicked() {
        showHomeScreenBoxView();
        createDatabase();
    }

    /**
     * Show the Sofbus 24 HomeScreenSelect the box view (this view contains the
     * choose home screen and loading parts)
     */
    private void showHomeScreenBoxView() {
        homeScreenBoxView.setVisibility(View.VISIBLE);
    }

    /**
     * Hide the Sofbus 24 HomeScreenSelect the box view (this view contains the
     * choose home screen and loading parts)
     */
    private void hideHomeScreenBoxView() {
        homeScreenBoxView.setVisibility(View.GONE);
    }

    /**
     * Class responsible for async creation of the databases
     *
     * @author Zdravko Nestorov
     * @version 1.0
     */
    @SuppressLint("StaticFieldLeak")
    public class CreateDatabases extends AsyncTask<Void, Void, Boolean> {

        private final FragmentActivity context;
        private final int startupCount;

        public CreateDatabases(FragmentActivity context, int startupCount) {
            this.context = context;
            this.startupCount = startupCount;
        }

        @Override
        protected Boolean doInBackground(Void... params) {

            // Delete the files in the cache after the maximum number of days
            // have passed
            ScheduleDatabaseUtils.deleteOldScheduleCache(context);

            // Create the database by copying it from the assets folder to the
            // internal memory
            Sofbus24DatabaseUtils.createOrUpgradeSofbus24Database(context);
            boolean isSofbus24DatabaseValid = Sofbus24DatabaseUtils
                    .isSofbus24DatabaseValid(context);

            return isSofbus24DatabaseValid;
        }

        @Override
        protected void onPostExecute(Boolean isSofbus24DatabaseValid) {
            super.onPostExecute(isSofbus24DatabaseValid);

            if (isSofbus24DatabaseValid) {
                new LoadStartingData(context).execute();
            } else {

                // Reset the version of the DB to the original one. This way,
                // the application will continue to automatically look for
                // updates when the time comes
                Configuration.editDbConfigurationVersionField(context,
                        Sofbus24DatabaseUtils.DB_STATIONS_VERSION);

                // Delete the database (this way each time you restart the
                // application, it will automatically try to recreate the DB
                // copying the one placed in assets)
                deleteDatabase(Sofbus24SQLite.DB_NAME);

                // If there are more than @MAX_STARTUP_COUNT, alert the user
                // IMPORTANT: This case should not be reached anytime (very rare
                // case when the user can't copy the database correctly into the
                // memory)
                if (startupCount > MAX_STARTUP_COUNT) {
                    ActivityTracker.sofbusDatabaseErrorDialog(context);
                    hideHomeScreenBoxView();

                    DialogFragment dialogFragment = Sofbus24DatabaseErrorDialog
                            .newInstance();
                    dialogFragment.show(getSupportFragmentManager(), "dialog");
                } else {
                    new CreateDatabases(context, startupCount + 1).execute();
                }
            }
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            new CreateDatabases(context, startupCount + 1).execute();
        }
    }

    /**
     * Class responsible for AsyncLoad of the DB information
     *
     * @author Zdravko Nestorov
     * @version 1.0
     */
    @SuppressLint("StaticFieldLeak")
    public class LoadStartingData extends AsyncTask<Void, Void, Void> {

        private final FragmentActivity context;

        public LoadStartingData(FragmentActivity context) {
            this.context = context;
        }

        @Override
        protected Void doInBackground(Void... params) {

            GlobalEntity globalContext = (GlobalEntity) context
                    .getApplicationContext();

            if (globalContext.isHasToRestart()) {
                globalContext.setHasToRestart(false);

                // Reset all vehicles from the Database, so use them lately
                ScheduleLoadVehicles.resetInstance(context);

                // Reset all metro stations from the Database, so use them
                // lately
                MetroLoadStations.resetInstance(context);

                // Reset all droidtrans information from the Database, so use
                // them lately
                DroidTransLoadInfo.resetInstance(context);
            } else {
                // Load all vehicles from the Database, so use them lately
                ScheduleLoadVehicles.getInstance(context);

                // Load all metro stations from the Database, so use them lately
                MetroLoadStations.getInstance(context);

                // Load all droidtrans info from the Database, so use them
                // lately
                DroidTransLoadInfo.getInstance(context);
            }

            /*
             * Workaround used to prevent a GooglePlay exception to be thrown
             * (the problem is that the instance of the Singleton is not created
             * on first application startup)
             *
             * android.database.sqlite.SQLiteException: unable to close due to
             * unfinalised statements
             */
            if (!ScheduleLoadVehicles.isInstanceCreated()
                    || !MetroLoadStations.isInstanceCreated()
                    || !DroidTransLoadInfo.isInstanceCreated()) {
                cancel(true);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            // Check if request permissions dialog will be shown (disable "onResume" actions)
            // The "onResume" actions will be triggered as the permissions dialog is shown on top
            // of the current activity. This will open multiple (two) startup screens
            if (!PermissionsUtils.checkPermissions(context, AppPermissions.HOME_SCREEN)) {
                shouldExecuteOnResume = false;
            }

            // Launch the already registered permission launcher
            PermissionsUtils.launchPermissionLauncher(context, AppPermissions.HOME_SCREEN,
                    permissionLauncher);
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            new LoadStartingData(context).execute();
        }
    }

    private void initApplicationHssContext() {
        if (globalContext == null) {
            globalContext = (GlobalEntity) getApplicationContext();
        }
        globalContext.setHssContext(this);
    }
}