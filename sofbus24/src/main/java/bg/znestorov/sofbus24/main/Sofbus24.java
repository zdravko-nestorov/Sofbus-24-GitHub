package bg.znestorov.sofbus24.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ListView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

import java.util.ArrayList;

import bg.znestorov.sofbus24.home.screen.Sofbus24Fragment;
import bg.znestorov.sofbus24.navigation.NavDrawerArrayAdapter;
import bg.znestorov.sofbus24.navigation.NavDrawerHelper;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

@SuppressWarnings("deprecation")
public class Sofbus24 extends SherlockFragmentActivity {

    private static final String TAG_SOFBUS_24_FRAGMENT = "SOFBUS_24_FRAGMENT";
    private FragmentActivity context;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;
    private NavDrawerArrayAdapter mMenuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_sofbus24);

        // Get the application and current context;
        context = Sofbus24.this;
        ActivityUtils.showHomeActivtyChangedToast(context,
                getString(R.string.navigation_drawer_home_standard));

        // Create the Sofbus24 fragment (should be created before the NavigationDrawer,
        // so can be used for showing some DialogFragments from the NavigationPanel,
        // which won't be recreated on orientation changes).
        // For example - all backup dialogs, information dialogs and so on
        Sofbus24Fragment sofbus24Fragment = getSofbus24Fragment(savedInstanceState);

        // Initialize the ActionBar and the NavigationDrawer
        initNavigationDrawer(sofbus24Fragment);

        // Start the Sofbus24 fragment
        startSofbus24Fragment(sofbus24Fragment);

        // Check for an update
        if (savedInstanceState == null) {
            // Not needed anymore - only the GCM notifications can inform the
            // user about any actions
            // Utils.checkForUpdate(context, UpdateTypeEnum.APP);
            ActivityTracker.homeScreenUsed(context, "Sofbus 24 (Home Screen)");
        }
    }

    @Override
    public void onBackPressed() {
        setResult(HomeScreenSelect.RESULT_CODE_ACTIVITY_FINISH, new Intent());
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerLayout != null && mDrawerList != null
                && item.getItemId() != android.R.id.home) {
            mDrawerLayout.closeDrawer(mDrawerList);
        }

        switch (item.getItemId()) {
            case android.R.id.home:
                if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
                    mDrawerLayout.closeDrawer(mDrawerList);
                } else {
                    mDrawerLayout.openDrawer(mDrawerList);
                }

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(
            android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Pass any configuration change to the drawer toggles
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    /**
     * Get the Sofbus24 fragment (create a new one or get the one from the Bundle)
     *
     * @param savedInstanceState the current state of the activity
     */
    private Sofbus24Fragment getSofbus24Fragment(Bundle savedInstanceState) {
        Sofbus24Fragment sofbus24Fragment;

        if (savedInstanceState == null) {
            sofbus24Fragment = new Sofbus24Fragment();
        } else {
            sofbus24Fragment = (Sofbus24Fragment) getSupportFragmentManager()
                    .findFragmentByTag(TAG_SOFBUS_24_FRAGMENT);

            if (sofbus24Fragment == null) {
                sofbus24Fragment = new Sofbus24Fragment();
            }
        }

        return sofbus24Fragment;
    }

    /**
     * Initialize the navigation drawer
     *
     * @param sofbus24Fragment the fragment that will initialize all screens on the home screen dialog
     */
    private void initNavigationDrawer(Sofbus24Fragment sofbus24Fragment) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.app_sofbus24));

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
        mDrawerList.setOnItemClickListener(new NavDrawerHelper(context, sofbus24Fragment,
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
                R.drawable.ic_drawer, R.string.app_navigation_drawer_open,
                R.string.app_navigation_drawer_close) {

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

    /**
     * Start the Sofbus24 fragment
     *
     * @param sofbus24Fragment the fragment that will initialize all screens on the home screen dialog
     */
    private void startSofbus24Fragment(Sofbus24Fragment sofbus24Fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.sofbus24_fragment, sofbus24Fragment,
                        TAG_SOFBUS_24_FRAGMENT).addToBackStack(null).commit();
    }

}