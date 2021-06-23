package bg.znestorov.sofbus24.permissions;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.ProcessLifecycleOwner;

import java.util.Map;

import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.AppLifecycleListener;

/**
 * Utils method containing functions concerning Android Permissions.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class PermissionsUtils {

    /**
     * Add a LifecycleObserver that will be notified when the LifecycleOwner changes state.
     *
     * @param activity       current activity
     * @param appPermissions permissions to grant
     * @param action         action to execute after the permissions are granted
     * @return lifecycle observer
     */
    public static AppLifecycleListener addLifecycleObserver(
            ComponentActivity activity, AppPermissions appPermissions, Runnable action) {

        AppLifecycleListener observer = new AppLifecycleListener(activity, appPermissions, action);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(observer);
        return observer;
    }

    /**
     * Remove the given observer from the observers list.
     *
     * @param observer lifecycle observer
     */
    public static void removeLifecycleObserver(AppLifecycleListener observer) {
        if (observer != null) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(observer);
        }
    }

    /**
     * An {@link ActivityResultContract} to {@link Activity#requestPermissions request permissions}.
     *
     * @param activity       current activity
     * @param appPermissions permissions to grant
     * @param action         action to execute after the permissions are granted
     */
    public static ActivityResultLauncher<String[]> createAndLaunchPermissionLauncher(
            ComponentActivity activity, AppPermissions appPermissions, Runnable action) {

        // Create a launcher for activity result in case of multiple permissions request
        ActivityResultLauncher<String[]> launcher = createPermissionLauncher(
                activity, appPermissions, action);

        // Launch the multiple permissions request
        launchPermissionLauncher(activity, appPermissions, launcher);

        // Return the launcher
        return launcher;
    }

    private static ActivityResultLauncher<String[]> createPermissionLauncher(
            ComponentActivity activity, AppPermissions appPermissions, Runnable action) {

        // Register multiple permissions request for activity result
        return activity.registerForActivityResult(
                new ActivityResultContracts.RequestMultiplePermissions(),
                permissions -> {
                    // Check if the desired permissions are granted
                    if (checkPermissions(appPermissions.getPermissions(), permissions)) {
                        onPermissionGranted(action);
                    } else {
                        onPermissionDenied(activity);
                    }
                });
    }

    private static void launchPermissionLauncher(
            ComponentActivity activity, AppPermissions appPermissions,
            ActivityResultLauncher<String[]> launcher) {

        // Check if the permission launcher is already running
        ActivityManager am = (ActivityManager) activity.getSystemService(Context.ACTIVITY_SERVICE);
        ComponentName cn = am.getRunningTasks(1).get(0).topActivity;
        if (Constants.GLOBAL_GRANT_PERMISSION_ACTIVITY.equals(cn.getClassName())) {
            return;
        }

        // Launch the permission launcher
        launcher.launch(appPermissions.getPermissions());
    }

    private static boolean checkPermissions(
            String[] reqPermissions, Map<String, Boolean> resPermissions) {

        // Check if all requested permissions are granted
        for (String reqPermission : reqPermissions) {
            if (resPermissions.get(reqPermission) != Boolean.TRUE) {
                return false;
            }
        }
        return true;
    }

    private static void onPermissionGranted(Runnable action) {
        // Execute the desired user action (if provided)
        if (action != null) {
            action.run();
        }
    }

    private static void onPermissionDenied(ComponentActivity activity) {
        // Finish this activity as well as all activities immediately below it
        activity.finishAffinity();
    }
}