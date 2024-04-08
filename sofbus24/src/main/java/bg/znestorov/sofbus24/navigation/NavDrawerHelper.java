package bg.znestorov.sofbus24.navigation;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;

import bg.znestorov.sofbus24.backup.ChooseBackupDialog;
import bg.znestorov.sofbus24.closest.stations.map.RetrieveCurrentLocation;
import bg.znestorov.sofbus24.closest.stations.map.RetrieveCurrentLocationTimeout;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.LoadTypeEnum;
import bg.znestorov.sofbus24.entity.RetrieveCurrentLocationTypeEnum;
import bg.znestorov.sofbus24.main.About;
import bg.znestorov.sofbus24.main.AboutDialog;
import bg.znestorov.sofbus24.main.History;
import bg.znestorov.sofbus24.main.HistoryDialog;
import bg.znestorov.sofbus24.main.HomeScreenSelect;
import bg.znestorov.sofbus24.main.Preferences;
import bg.znestorov.sofbus24.main.PreferencesDialog;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.permissions.AppPermissions;
import bg.znestorov.sofbus24.permissions.PermissionsUtils;
import bg.znestorov.sofbus24.route.changes.RetrieveRouteChangesApi;
import bg.znestorov.sofbus24.updates.check.ChooseUpdateDialog;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.GooglePlayServicesErrorDialog;

public class NavDrawerHelper {

    private final FragmentActivity context;
    private final Fragment fragment;
    private final GlobalEntity globalContext;

    private final DrawerLayout mDrawerLayout;
    private final ListView mDrawerList;
    private final ArrayList<String> navigationItems;

    private final DrawerItemClickListener drawerItemClickListener;
    private final ActivityResultLauncher<String[]> permissionLauncher;

    public NavDrawerHelper(FragmentActivity context, Fragment fragment,
                           DrawerLayout mDrawerLayout, ListView mDrawerList,
                           ArrayList<String> navigationItems) {

        this.context = context;
        this.fragment = fragment;
        this.globalContext = (GlobalEntity) context.getApplicationContext();

        this.mDrawerLayout = mDrawerLayout;
        this.mDrawerList = mDrawerList;
        this.navigationItems = navigationItems;

        this.drawerItemClickListener = new DrawerItemClickListener();
        this.permissionLauncher = PermissionsUtils.createPermissionLauncher(context,
                AppPermissions.getStoragePermissions(), this::startChooseBackupDialog);
    }

    /**
     * Define the user actions on navigation drawer item click
     *
     * @param position the position of the click
     */
    private void selectNavigationDrawerItem(int position) {

        ProgressDialog progressDialog = new ProgressDialog(context);
        int userHomeScreen = NavDrawerHomeScreenPreferences
                .getUserHomeScreenChoice(context);

        mDrawerList.setItemChecked(position, true);
        mDrawerLayout.closeDrawer(mDrawerList);

        // Get the appropriate fragment manager (in case of Activity or a Fragment)
        FragmentManager fragmentManager;
        if (fragment == null) {
            fragmentManager = context.getSupportFragmentManager();
        } else {
            fragmentManager = fragment.getChildFragmentManager();
        }

        // Check the user choice
        switch (position) {
            case 0:
                break;
            case 1:
            case 2:
            case 3:
                if (isHomeScreenChanged(fragmentManager, userHomeScreen, position)) {
                    NavDrawerHomeScreenPreferences.setUserChoice(context,
                            position - 1);

                    context.setResult(HomeScreenSelect.RESULT_CODE_ACTIVITY_NEW);
                    context.finish();
                }

                break;
            case 4:
                startClosestStationsList(fragmentManager, progressDialog);
                break;
            case 5:
                if (ActivityUtils.haveNetworkConnection(context)) {
                    progressDialog.setMessage(context
                            .getString(R.string.route_changes_loading));

                    RetrieveRouteChangesApi retrieveRouteChangesApi;
                    retrieveRouteChangesApi = new RetrieveRouteChangesApi(context,
                            progressDialog, LoadTypeEnum.INIT);
                    retrieveRouteChangesApi.execute();
                } else {
                    ActivityUtils.showNoInternetToast(context);
                }
                break;
            case 6:
                Intent historyIntent;
                if (globalContext.isPhoneDevice()) {
                    historyIntent = new Intent(context, History.class);
                } else {
                    historyIntent = new Intent(context, HistoryDialog.class);
                }
                context.startActivity(historyIntent);
                break;
            case 7:
                Intent preferencesIntent;
                if (globalContext.isPhoneDevice()) {
                    preferencesIntent = new Intent(context, Preferences.class);
                } else {
                    preferencesIntent = new Intent(context, PreferencesDialog.class);
                }
                context.startActivity(preferencesIntent);
                break;
            case 8:
                Intent aboutIntent;
                if (globalContext.isPhoneDevice()) {
                    aboutIntent = new Intent(context, About.class);
                } else {
                    aboutIntent = new Intent(context, AboutDialog.class);
                }
                context.startActivity(aboutIntent);
                break;
            case 9:
                if (ActivityUtils.haveNetworkConnection(context)) {
                    startChooseUpdateDialog();
                } else {
                    ActivityUtils.showNoInternetToast(context);
                }
                break;
            case 10:
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) {
                    PermissionsUtils.launchPermissionLauncher(context, AppPermissions.getStoragePermissions(),
                            permissionLauncher);
                } else {
                    startChooseBackupDialog();
                }
                break;
            case 11:
                context.setResult(HomeScreenSelect.RESULT_CODE_ACTIVITY_FINISH);
                context.finish();
                break;
        }
    }

    /**
     * Show a long toast about the changed home screen and set the change in the
     * preference file
     *
     * @param userHomeScreen the current home screen
     * @param userChoice     the user choice
     * @return if the home screen can be changed
     */
    private boolean isHomeScreenChanged(FragmentManager fragmentManager, int userHomeScreen, int userChoice) {

        boolean isHomeScreenChanged = true;
        String homeScreenName = navigationItems.get(userChoice);

        if (userChoice == 2 && !globalContext.areServicesAvailable()) {
            GooglePlayServicesErrorDialog googlePlayServicesErrorDialog = GooglePlayServicesErrorDialog
                    .newInstance(context
                            .getString(
                                    R.string.navigation_drawer_home_screen_error,
                                    context.getString(R.string.navigation_drawer_home_map)));
            googlePlayServicesErrorDialog.show(
                    fragmentManager,
                    "GooglePlayServicesHomeScreenErrorDialog");

            isHomeScreenChanged = false;
        } else {
            if (userHomeScreen == userChoice - 1) {
                ActivityUtils
                        .showLongToast(
                                context,
                                String.format(
                                        context.getString(R.string.navigation_drawer_home_screen_remains),
                                        homeScreenName));

                isHomeScreenChanged = false;
            } else {
                globalContext.setHomeActivityChanged(true);
            }
        }

        return isHomeScreenChanged;
    }

    /**
     * Start the ClosestStationsList activity
     *
     * @param progressDialog the progress dialog
     */
    private void startClosestStationsList(FragmentManager fragmentManager, ProgressDialog progressDialog) {
        progressDialog.setMessage(context
                .getString(R.string.app_loading_current_location));

        RetrieveCurrentLocation retrieveCurrentLocation = new RetrieveCurrentLocation(
                context, fragmentManager, progressDialog,
                RetrieveCurrentLocationTypeEnum.CS_LIST_INIT);
        retrieveCurrentLocation.execute();
        RetrieveCurrentLocationTimeout retrieveCurrentLocationTimeout = new RetrieveCurrentLocationTimeout(
                retrieveCurrentLocation,
                RetrieveCurrentLocationTimeout.TIMEOUT_CS_LIST);
        (new Thread(retrieveCurrentLocationTimeout)).start();
    }

    /**
     * Start the ChooseUpdateDialog dialog
     */
    private void startChooseUpdateDialog() {
        // Get the appropriate fragment manager (in case of Activity or a Fragment)
        FragmentManager fragmentManager;
        if (fragment == null) {
            fragmentManager = context.getSupportFragmentManager();
        } else {
            fragmentManager = fragment.getChildFragmentManager();
        }

        // Start the "Choose Backup Dialog"
        DialogFragment chooseUpdateDialog = ChooseUpdateDialog.newInstance();
        chooseUpdateDialog.show(fragmentManager, "dialogFragment");
    }

    /**
     * Start the ChooseBackupDialog dialog
     */
    private void startChooseBackupDialog() {
        // Get the appropriate fragment manager (in case of Activity or a Fragment)
        FragmentManager fragmentManager;
        if (fragment == null) {
            fragmentManager = context.getSupportFragmentManager();
        } else {
            fragmentManager = fragment.getChildFragmentManager();
        }

        // Start the "Choose Backup Dialog"
        DialogFragment chooseBackupDialog = ChooseBackupDialog.newInstance();
        chooseBackupDialog.show(fragmentManager, "dialogFragment");
    }

    public DrawerItemClickListener getDrawerItemClickListener() {
        return drawerItemClickListener;
    }

    /**
     * Class responsible for registering user clicks over the navigation drawer
     */
    public class DrawerItemClickListener implements
            ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,
                                long id) {
            selectNavigationDrawerItem(position);
        }
    }

}