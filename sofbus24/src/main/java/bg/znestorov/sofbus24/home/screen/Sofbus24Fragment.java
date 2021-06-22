package bg.znestorov.sofbus24.home.screen;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.ListFragment;
import androidx.viewpager.widget.ViewPager;

import com.astuetz.PagerSlidingTabStrip;
import com.astuetz.PagerSlidingTabStrip.IconTitleProvider;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.ScheduleDatabaseUtils;
import bg.znestorov.sofbus24.entity.AppThemeEnum;
import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.entity.DeviceTypeEnum;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.HomeTabEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.favorites.FavouritesStationFragment;
import bg.znestorov.sofbus24.gcm.GcmUtils;
import bg.znestorov.sofbus24.main.EditTabs;
import bg.znestorov.sofbus24.main.EditTabsDialog;
import bg.znestorov.sofbus24.main.HomeScreenSelect;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.metro.MetroFragment;
import bg.znestorov.sofbus24.schedule.ScheduleCacheDeleteDialog;
import bg.znestorov.sofbus24.schedule.ScheduleCachePreferences;
import bg.znestorov.sofbus24.schedule.ScheduleFragment;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.virtualboards.VirtualBoardsFragment;

public class Sofbus24Fragment extends Fragment implements
        ActionBar.TabListener {

    private final List<Fragment> fragmentsList = new ArrayList<Fragment>();
    private FragmentActivity context;
    private GlobalEntity globalContext;
    private ActionBar actionBar;
    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private PagerSlidingTabStrip mPagerSlidingTabs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(
                R.layout.activity_sofbus24_fragment, container, false);

        // Get the application and current context;
        context = getActivity();
        globalContext = (GlobalEntity) context.getApplicationContext();
        LanguageChange.selectLocale(context);

        // Activate the option menu
        setHasOptionsMenu(true);

        // Checks if any GCM notification was previously received. If so, inform
        // the user accordingly
        GcmUtils.processGcmNotification(context, getChildFragmentManager());

        return fragmentView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initLayoutFields(getView());
    }

    @Override
    public void onResume() {
        super.onResume();

        context.invalidateOptionsMenu();
        actionsOverHomeScreen(-1);
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        if (mViewPager != null) {
            int currentTab = mViewPager.getCurrentItem();
            Fragment currentFragment = fragmentsList.get(currentTab);

            MenuItem favouritesSort = menu
                    .findItem(R.id.action_favourites_sort);
            MenuItem favouritesRemoveAll = menu
                    .findItem(R.id.action_favourites_remove_all);
            MenuItem metroMapRoute = menu.findItem(R.id.action_metro_map_route);
            MenuItem metroScheduleSite = menu
                    .findItem(R.id.action_metro_schedule_site);
            MenuItem clearScheduleCache = menu
                    .findItem(R.id.action_clear_schedule_cache);

            if (currentFragment instanceof FavouritesStationFragment) {
                favouritesSort.setVisible(true);
                favouritesRemoveAll.setVisible(true);
                metroMapRoute.setVisible(false);
                metroScheduleSite.setVisible(false);
                clearScheduleCache.setVisible(false);
            } else if (currentFragment instanceof ScheduleFragment) {
                favouritesSort.setVisible(false);
                favouritesRemoveAll.setVisible(false);
                metroMapRoute.setVisible(false);
                metroScheduleSite.setVisible(false);

                // Check if the ClearScheduleCache action bar icon should be
                // visible or not
                if (ScheduleCachePreferences.isScheduleCacheActive(context)) {
                    clearScheduleCache.setVisible(true);
                } else {
                    clearScheduleCache.setVisible(false);
                }
            } else if (currentFragment instanceof MetroFragment) {
                favouritesSort.setVisible(false);
                favouritesRemoveAll.setVisible(false);
                metroMapRoute.setVisible(true);
                metroScheduleSite.setVisible(true);

                // Check if the ClearScheduleCache action bar icon should be
                // visible or not
                if (ScheduleCachePreferences.isScheduleCacheActive(context)) {
                    clearScheduleCache.setVisible(true);
                } else {
                    clearScheduleCache.setVisible(false);
                }
            } else {
                favouritesSort.setVisible(false);
                favouritesRemoveAll.setVisible(false);
                metroMapRoute.setVisible(false);
                metroScheduleSite.setVisible(false);
                clearScheduleCache.setVisible(false);
            }

        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // Inflate the menu; this adds items to the action bar if it is present
        inflater.inflate(R.menu.activity_sofbus24_actions, menu);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab,
                              FragmentTransaction fragmentTransaction) {
        actionsOverHomeScreen(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab,
                                FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab,
                                FragmentTransaction fragmentTransaction) {
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_droidtrans:
                ActivityUtils.startDroidTrans(context, getChildFragmentManager(),
                        false);

                return true;
            case R.id.action_closest_stations_map:
                ActivityUtils.startClosestStationsMap(context,
                        getChildFragmentManager(), false);

                return true;
            case R.id.action_clear_schedule_cache:
                if (ScheduleDatabaseUtils.isAnyScheduleCacheAvailable(context)) {
                    DialogFragment dialogFragment = ScheduleCacheDeleteDialog
                            .newInstance(VehicleTypeEnum.BTTM, "");
                    dialogFragment.show(getChildFragmentManager(), "dialog");
                } else {
                    String emptyScheduleCacheMsg = getString(R.string.pt_menu_clear_all_schedule_cache_empty_toast);
                    ActivityUtils.showLongToast(context, emptyScheduleCacheMsg);
                }

                return true;
            case R.id.action_edit_tabs:
                Intent editTabsIntent;
                if (globalContext.isPhoneDevice()) {
                    editTabsIntent = new Intent(context, EditTabs.class);
                } else {
                    editTabsIntent = new Intent(context, EditTabsDialog.class);
                }

                startActivity(editTabsIntent);

                return true;
            default:
                if (mViewPager != null) {
                    Integer tabPosition = mViewPager.getCurrentItem();
                    List<Fragment> sofbus24FragmentsList = getChildFragmentManager()
                            .getFragments();

                    if (sofbus24FragmentsList != null && tabPosition != null
                            && sofbus24FragmentsList.size() > tabPosition) {

                        Fragment fakeFragment = fragmentsList.get(tabPosition);
                        Fragment currentFragment = null;

                        // Check which fragment from the child manager fragment list
                        // is the current one. In case of FavouritesStationFragment
                        // or MetroStationFragment, proceed with options menu
                        if (fakeFragment instanceof FavouritesStationFragment) {
                            for (Fragment fragment : sofbus24FragmentsList) {
                                if (fragment != null
                                        && fragment instanceof FavouritesStationFragment) {
                                    currentFragment = fragment;
                                }
                            }
                        }

                        if (fakeFragment instanceof ScheduleFragment) {
                            for (Fragment fragment : sofbus24FragmentsList) {
                                if (fragment != null
                                        && fragment instanceof ScheduleFragment) {
                                    currentFragment = fragment;
                                }
                            }
                        }

                        if (fakeFragment instanceof MetroFragment) {
                            for (Fragment fragment : sofbus24FragmentsList) {
                                if (fragment != null
                                        && fragment instanceof MetroFragment) {
                                    currentFragment = fragment;
                                }
                            }
                        }

                        // Check the type of the fragment
                        if (currentFragment != null) {
                            if (currentFragment instanceof ListFragment) {
                                ((ListFragment) currentFragment)
                                        .onOptionsItemSelected(item);
                            } else {
                                ((Fragment) currentFragment)
                                        .onOptionsItemSelected(item);
                            }
                        }
                    }
                }

                return true;
        }
    }

    /**
     * Initialize the layout fields (ActionBar, ViewPager and
     * SectionsPagerAdapter)
     */
    @SuppressWarnings("deprecation")
    private void initLayoutFields(View fragmentView) {

        // Set the tabs to the ActionBar
        actionBar = context.getActionBar();
        actionBar.setTitle(getString(R.string.app_sofbus24));

        // Create the fragments list
        createFragmentsList();

        // Create the adapter that will return a fragment for each of the
        // primary sections of the application
        mSectionsPagerAdapter = new SectionsPagerAdapter(
                getChildFragmentManager());

        // Set up the ViewPager with the sections adapter and load all tabs at
        // once
        mPagerSlidingTabs = (PagerSlidingTabStrip) fragmentView
                .findViewById(R.id.sofbus24_tabs);
        if (ThemeChange.getAppTheme(context) == AppThemeEnum.DARK) {
            mPagerSlidingTabs
                    .setTabBackground(R.color.app_dark_theme_tab_background);
        }

        mViewPager = (ViewPager) fragmentView.findViewById(R.id.sofbus24_pager);
        mViewPager
                .setOffscreenPageLimit(Constants.GLOBAL_PARAM_HOME_TABS_COUNT - 1);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // Assign the view pager to the SlidingTab pager
        mPagerSlidingTabs.setViewPager(mViewPager);

        // When swiping between the sections, select the corresponding tab
        if (!Utils.isInLandscapeMode(context)) {
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
            mPagerSlidingTabs.setVisibility(View.VISIBLE);

            mPagerSlidingTabs
                    .setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                        @Override
                        public void onPageSelected(int position) {
                            actionsOverHomeScreen(position);
                        }
                    });
        } else {
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
            mPagerSlidingTabs.setVisibility(View.GONE);

            mViewPager
                    .setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                        @Override
                        public void onPageSelected(int position) {
                            actionBar.setSelectedNavigationItem(position);
                        }
                    });
        }

        // For each of the sections in the app, add a tab to the action bar
        initTabs();
    }

    /**
     * For each of the sections in the app, add a tab to the action bar
     */
    private void initTabs() {
        if (actionBar.getTabCount() > 0) {
            actionBar.removeAllTabs();
        }

        // Used when the tabs are shown in the action bar (not below) - for
        // example phone in landscape mode
        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {

            ActionBar.Tab actionBarTab = actionBar.newTab();

            // Check the page title that has to be set to the tab
            CharSequence pageTitle = getPageTitle(mSectionsPagerAdapter
                    .getPageTitle(i));
            if (pageTitle != null) {
                actionBarTab.setText(pageTitle);
            }

            // Check the page icon res id that has to be set to the tab
            int pageIconResId = getPageIconResId(mSectionsPagerAdapter
                    .getPageIconResId(i));
            if (pageIconResId > 0) {
                actionBarTab.setIcon(pageIconResId);
            }

            actionBar.addTab(actionBarTab.setTabListener(this));
        }
    }

    /**
     * Create or rearrange (if already created) the FragmentsList, using the
     * current application config file
     */
    private void createFragmentsList() {
        // Get the application config file
        ConfigEntity config = new ConfigEntity(context);

        // Empty the fragmentsList if contains any elements
        if (!fragmentsList.isEmpty()) {
            fragmentsList.clear();
        }

        // Create a new ordered list with fragments (according to the
        // configuration file)
        for (int i = 0; i < Constants.GLOBAL_PARAM_HOME_TABS_COUNT; i++) {
            HomeTabEntity homeTab = config.getTabByPosition(context, i);
            if (homeTab.isTabVisible()) {
                fragmentsList.add(getFragmentByTagName(homeTab));
            }
        }
    }

    /**
     * Get the fragment according to the given HomeTab
     *
     * @param homeTab HomeTab object pointing which fragment to be chosen
     * @return the fragment associated to the given HomeTab
     */
    private Fragment getFragmentByTagName(HomeTabEntity homeTab) {
        Fragment fragment;

        String homeTabName = homeTab.getTabName();
        if (homeTabName.equals(getString(R.string.edit_tabs_favourites))) {
            fragment = FavouritesStationFragment.getInstance(true);
        } else if (homeTabName.equals(getString(R.string.edit_tabs_search))) {
            fragment = new VirtualBoardsFragment();
        } else if (homeTabName.equals(getString(R.string.edit_tabs_schedule))) {
            fragment = new ScheduleFragment();
        } else {
            fragment = new MetroFragment();
        }

        return fragment;
    }

    /**
     * Get the tab title according to the user choice (SharedPreferences file)
     * and the type of the device (PHONE, SMALL TABLET or LARGE TABLET)
     *
     * @param pageTitle the page title of the tab (according to the type of the tab
     *                  fragment)
     * @return the page title that will be shown
     */
    private CharSequence getPageTitle(CharSequence pageTitle) {

        DeviceTypeEnum deviceType = globalContext.getDeviceType();
        String tabsType = getTabsType();

        switch (deviceType) {
            case PHONE:
            case SMALL_TABLET:
                if (Constants.PREFERENCE_DEFAULT_VALUE_TABS_TYPE.equals(tabsType)) {
                    pageTitle = null;
                }

                break;
            default:
                // Do nothing (leave the page title to be shown)
                break;
        }

        return pageTitle;
    }

    /**
     * Get the tab icon according to the user choice (SharedPreferences file)
     * and the type of the device (PHONE, SMALL TABLET or LARGE TABLET)
     *
     * @param pageIcon the page icon of the tab (according to the type of the tab
     *                 fragment)
     * @return the page icon that will be shown
     */
    private int getPageIconResId(int pageIcon) {

        DeviceTypeEnum deviceType = globalContext.getDeviceType();
        String tabsType = getTabsType();

        switch (deviceType) {
            case PHONE:
            case SMALL_TABLET:
                if (Constants.PREFERENCE_DEFAULT_VALUE_TABS_TYPE_TITLE
                        .equals(tabsType)) {
                    pageIcon = 0;
                }

                break;
            default:
                // Do nothing (leave the page icon to be shown)
                break;
        }

        return pageIcon;
    }

    /**
     * Get the type of the home screen tabs from the SharedPreferences file
     *
     * @return the type of the home screen tabs
     */
    private String getTabsType() {

        // Get SharedPreferences from option menu
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);

        // Get "tabsType" value from the SharedPreferences file
        String tabsType = sharedPreferences.getString(
                Constants.PREFERENCE_KEY_TABS_TYPE,
                Constants.PREFERENCE_DEFAULT_VALUE_TABS_TYPE);

        return tabsType;
    }

    /**
     * Proceed with updating the HomeScreen if needed
     *
     * @param tabPosition the tabPosition that is pressed or "-1" in case of onResume
     */
    private void actionsOverHomeScreen(int tabPosition) {

        // Check if this is called from "onResume(...)", so take the current
        // active tab or from "onTabSelected(...)", so set the according menu
        // items
        if (tabPosition == -1) {
            // Check if the activity has to be restarted
            if (globalContext.isHasToRestart()) {
                context.setResult(HomeScreenSelect.RESULT_CODE_ACTIVITY_RESTART);
                context.finish();

                return;
            }

            // Check if the ordering and visibility of the tabs should be
            // changed
            if (globalContext.isHomeScreenChanged()) {
                // Rearrange the fragmentsList
                createFragmentsList();

                // Notify the adapters for the changes in the
                // fragmentsList
                mSectionsPagerAdapter.notifyDataSetChanged();
                mPagerSlidingTabs.notifyDataSetChanged();

                // For each of the sections in the application, add a
                // tab to the ActionBar
                initTabs();

                // Show a message that the home screen is changed
                Toast.makeText(context, getString(R.string.edit_tabs_toast),
                        Toast.LENGTH_SHORT).show();

                // Reset to default
                globalContext.setHomeScreenChanged(false);

                return;
            }

            // Check if the view pager is already created (if the application
            // has just started)
            if (mViewPager != null) {
                tabPosition = mViewPager.getCurrentItem();
            }
        } else {
            // Declare that the options menu has changed, so should be recreated
            // (make the system calls the method onPrepareOptionsMenu)
            context.supportInvalidateOptionsMenu();

            // When the given tab is selected, switch to the corresponding page
            // in the ViewPager.
            mViewPager.setCurrentItem(tabPosition);
        }

        // Get the Fragment from the fragmentsList (used to check what type is
        // the current fragment. It doesn't store the real fragment - it will be
        // taken from the FragmentManager)
        if (mViewPager != null) {

            Fragment fakeFragment;

            // Workaround because of a strange bug in GooglePlay market, where
            // the FragmentsList is empty. In this case recreate the list and
            // proceed accordingly
            try {
                fakeFragment = fragmentsList.get(tabPosition);
            } catch (Exception e) {
                createFragmentsList();
                fakeFragment = fragmentsList.get(tabPosition);
            }

            if (fakeFragment instanceof FavouritesStationFragment) {
                ActivityUtils.setHomeScreenActionBarSubtitle(context,
                        actionBar, getString(R.string.edit_tabs_favourites),
                        getString(R.string.edit_tabs_favourites_pre_honeycomb));
            } else if (fakeFragment instanceof VirtualBoardsFragment) {
                ActivityUtils.setHomeScreenActionBarSubtitle(context,
                        actionBar, getString(R.string.edit_tabs_search),
                        getString(R.string.edit_tabs_search_pre_honeycomb));
            } else if (fakeFragment instanceof ScheduleFragment) {
                ActivityUtils.setHomeScreenActionBarSubtitle(context,
                        actionBar, getString(R.string.edit_tabs_schedule),
                        getString(R.string.edit_tabs_schedule_pre_honeycomb));
            } else {
                ActivityUtils.setHomeScreenActionBarSubtitle(context,
                        actionBar, getString(R.string.edit_tabs_metro),
                        getString(R.string.edit_tabs_metro_pre_honeycomb));
            }

            // Check if the FragmentManager is created and proceed with actions
            // for each fragment (updates)
            if (getChildFragmentManager().getFragments() != null) {
                List<Fragment> fmFragmentsList = getChildFragmentManager()
                        .getFragments();

                if (fakeFragment instanceof FavouritesStationFragment
                        && globalContext.isFavouritesChanged()) {

                    // Match the fake fragment from the fragmentsList with the
                    // one from the FragmentManager
                    for (Fragment fragment : fmFragmentsList) {
                        if (fragment instanceof FavouritesStationFragment) {
                            ((FavouritesStationFragment) fragment)
                                    .onResumeFragment(context);
                            globalContext.setFavouritesChanged(false);
                        }
                    }
                }

                if (fakeFragment instanceof VirtualBoardsFragment
                        && globalContext.isVbChanged()) {

                    // Match the fake fragment from the fragmentsList with the
                    // one from the FragmentManager
                    for (Fragment fragment : fmFragmentsList) {
                        if (fragment instanceof VirtualBoardsFragment) {
                            ((VirtualBoardsFragment) fragment)
                                    .onResumeFragment(context);
                            globalContext.setVbChanged(false);
                        }
                    }
                }
            }
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentStatePagerAdapter
            implements IconTitleProvider {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentsList.get(position);
        }

        /**
         * Purpose of this method is to check whether an item in the adapter
         * still exists in the dataset and where it should show. For each entry
         * in dataset, request its Fragment.
         * <p/>
         * If the Fragment is found, return its (new) position. There's no need
         * to return POSITION_UNCHANGED; ViewPager handles it.
         * <p/>
         * If the Fragment passed to this method is not found, remove all
         * references and let the ViewPager remove it from display by by
         * returning POSITION_NONE;
         */
        @Override
        public int getItemPosition(Object object) {
            return POSITION_NONE;
        }

        @Override
        public int getCount() {
            return fragmentsList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return Sofbus24Fragment.this
                    .getPageTitle(getPageTitleByTagName(fragmentsList
                            .get(position)));
        }

        /**
         * Get the current item title according to the fragment type
         *
         * @param fragment the fragment set on this tab
         * @return the title associated to the given fragment
         */
        private CharSequence getPageTitleByTagName(Fragment fragment) {

            CharSequence pageTitle;

            if (fragment instanceof FavouritesStationFragment) {
                pageTitle = getString(R.string.sofbus24_favourites_title);
            } else if (fragment instanceof VirtualBoardsFragment) {
                pageTitle = getString(R.string.sofbus24_search_title);
            } else if (fragment instanceof ScheduleFragment) {
                pageTitle = getString(R.string.sofbus24_schedule_title);
            } else {
                pageTitle = getString(R.string.sofbus24_metro_title);
            }

            return pageTitle;
        }

        @Override
        public int getPageIconResId(int position) {
            return Sofbus24Fragment.this
                    .getPageIconResId(getPageIconByTagName(fragmentsList
                            .get(position)));
        }

        /**
         * Get the current item page icon according to the fragment type
         *
         * @param fragment the fragment set on this tab
         * @return the icon associated to the given fragment
         */
        private int getPageIconByTagName(Fragment fragment) {

            int pageIcon;

            if (fragment instanceof FavouritesStationFragment) {
                pageIcon = R.drawable.ic_tab_favorites;
            } else if (fragment instanceof VirtualBoardsFragment) {
                pageIcon = R.drawable.ic_tab_real_time;
            } else if (fragment instanceof ScheduleFragment) {
                pageIcon = R.drawable.ic_tab_schedule;
            } else {
                pageIcon = R.drawable.ic_tab_metro;
            }

            return pageIcon;
        }
    }

}