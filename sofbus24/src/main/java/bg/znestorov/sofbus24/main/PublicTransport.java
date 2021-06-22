package bg.znestorov.sofbus24.main;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

import bg.znestorov.sofbus24.databases.ScheduleDatabaseUtils;
import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.publictransport.PublicTransportFragment;
import bg.znestorov.sofbus24.schedule.ScheduleCacheDeleteDialog;
import bg.znestorov.sofbus24.schedule.ScheduleCachePreferences;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;

public class PublicTransport extends FragmentActivity implements
        ActionBar.TabListener {

    private final ArrayList<Fragment> fragmentsList = new ArrayList<Fragment>();
    private Activity context;
    private ActionBar actionBar;
    private ViewPager mViewPager;
    private int activeDirection;
    private DirectionsEntity ptDirectionsEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_public_transport);

        // Get the current activity context
        context = PublicTransport.this;

        initBundleInfo();
        initLayoutFields();
        setActiveFragment();

        // Add the search in the history
        Utils.addVehicleInHistory(context, ptDirectionsEntity.getVehicle());
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        MenuItem clearScheduleCache = menu
                .findItem(R.id.action_pt_clear_schedule_cache);

        // Check if the ClearScheduleCache action bar icon should be visible
        // or not
        if (ScheduleCachePreferences.isScheduleCacheActive(context)) {
            clearScheduleCache.setVisible(true);
        } else {
            clearScheduleCache.setVisible(false);
        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.activity_public_transport_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        ProgressDialog progressDialog = new ProgressDialog(context);

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();

                return true;
            case R.id.action_pt_route_map:
                progressDialog
                        .setMessage(getString(R.string.pt_menu_map_route_loading));
                RetrievePTRoute retrievePTRoute = new RetrievePTRoute(context,
                        progressDialog);
                retrievePTRoute.execute();

                return true;
            case R.id.action_pt_site:
                ActivityUtils.startWebPageActivity(context,
                        ptDirectionsEntity.getVehicle());

                return true;
            case R.id.action_pt_clear_schedule_cache:

                VehicleEntity vehicle = ptDirectionsEntity.getVehicle();
                VehicleTypeEnum vehicleType = vehicle.getType();
                String vehicleNumber = vehicle.getNumber();

                if (ScheduleDatabaseUtils.isVehiclesScheduleCacheAvailable(context,
                        vehicleType, vehicleNumber)) {
                    DialogFragment dialogFragment = ScheduleCacheDeleteDialog
                            .newInstance(vehicleType, vehicleNumber);
                    dialogFragment.show(getSupportFragmentManager(), "dialog");
                } else {
                    String emptyScheduleCacheMsg = getString(
                            R.string.pt_menu_clear_schedule_cache_empty_toast,
                            ActivityUtils.getVehicleTitle(context, vehicle));

                    ActivityUtils.showLongToast(context, emptyScheduleCacheMsg);
                }

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        mViewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    /**
     * Get the current location coordinates from the Bundle object
     */
    private void initBundleInfo() {
        Bundle extras = getIntent().getExtras();
        ptDirectionsEntity = (DirectionsEntity) extras
                .get(Constants.BUNDLE_PUBLIC_TRANSPORT_SCHEDULE);
        activeDirection = ptDirectionsEntity.getActiveDirection();
    }

    /**
     * Initialize the layout fields (ActionBar, ViewPager and
     * SectionsPagerAdapter)
     */
    @SuppressWarnings("deprecation")
    private void initLayoutFields() {

        // Set up the ActionBar
        actionBar = getActionBar();
        actionBar.setTitle(getString(R.string.pt_title));
        actionBar.setSubtitle(ActivityUtils.getVehicleTitle(context,
                ptDirectionsEntity.getVehicle()));
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Create the fragments list
        createFragmentsList();

        // Create the adapter that will return a fragment for each of the
        // primary sections of the application
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(
                getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter and load all tabs at
        // once
        mViewPager = (ViewPager) findViewById(R.id.pt_pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager
                .setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        actionBar.setSelectedNavigationItem(position);
                    }
                });

        // For each of the sections in the app, add a tab to the action bar
        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
            actionBar.addTab(actionBar.newTab()
                    .setText(mSectionsPagerAdapter.getTabName(i))
                    .setTabListener(this));
        }
    }

    /**
     * Create the FragmentsList, where each element contains a separate
     * direction
     */
    private void createFragmentsList() {
        DirectionsEntity ptDirectionsEntity1 = new DirectionsEntity(
                ptDirectionsEntity, 0);
        fragmentsList.add(PublicTransportFragment
                .newInstance(ptDirectionsEntity1));

        DirectionsEntity ptDirectionsEntity2 = new DirectionsEntity(
                ptDirectionsEntity, 1);
        fragmentsList.add(PublicTransportFragment
                .newInstance(ptDirectionsEntity2));
    }

    /**
     * Set the active fragment to be firstly visible (the chosen from the
     * AlertDialog)
     */
    private void setActiveFragment() {
        mViewPager.setCurrentItem(activeDirection);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentsList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentsList.size();
        }

        public String getTabName(int i) {
            String tabName;

            switch (i) {
                case 0:
                    tabName = ptDirectionsEntity.getDirectionsNames().get(0);
                    break;
                case 1:
                    tabName = ptDirectionsEntity.getDirectionsNames().get(1);
                    break;
                default:
                    tabName = ptDirectionsEntity.getDirectionsNames().get(0);
                    break;
            }

            return tabName;
        }
    }

    /**
     * Asynchronous class used for retrieving the Public Transport route
     *
     * @author Zdravko Nestorov
     */
    @SuppressLint("StaticFieldLeak")
    public class RetrievePTRoute extends AsyncTask<Void, Void, Intent> {

        private final Activity context;
        private final GlobalEntity globalContext;
        private final ProgressDialog progressDialog;

        public RetrievePTRoute(Activity context, ProgressDialog progressDialog) {
            this.context = context;
            this.globalContext = (GlobalEntity) context.getApplicationContext();
            this.progressDialog = progressDialog;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            createLoadingView();
        }

        @Override
        protected Intent doInBackground(Void... params) {
            Intent ptMapRouteIntent = new Intent(context, StationRouteMap.class);
            DirectionsEntity ptDirectionsEntityTransfer = new DirectionsEntity(
                    ptDirectionsEntity, mViewPager.getCurrentItem());
            ptMapRouteIntent.putExtra(Constants.BUNDLE_STATION_ROUTE_MAP,
                    ptDirectionsEntityTransfer);

            return ptMapRouteIntent;
        }

        @Override
        protected void onPostExecute(Intent ptMapRouteIntent) {
            super.onPostExecute(ptMapRouteIntent);

            if (!globalContext.areServicesAvailable()) {
                GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                        .newInstance(getString(R.string.app_google_play_msg));
                googlePlayServicesErrorDialog.show(getSupportFragmentManager(),
                        "GooglePlayServicesErrorDialog");
            } else {
                context.startActivity(ptMapRouteIntent);
            }

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
                 * java.lang.IllegalArgumentException: View not attached to
                 * window manager
                 */
            }

            ActivityUtils.unlockScreenOrientation(context);
        }
    }
}
