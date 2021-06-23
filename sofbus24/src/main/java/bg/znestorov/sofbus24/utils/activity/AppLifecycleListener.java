package bg.znestorov.sofbus24.utils.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import bg.znestorov.sofbus24.permissions.AppPermissions;
import bg.znestorov.sofbus24.permissions.PermissionsUtils;

/**
 * The {@code ProcessLifecycleOwner} will dispatch {@code ON_START}, {@code OON_RESUME} events,
 * as a first activity moves through these events. {@code OON_PAUSE}, {@code OON_STOP}, events
 * will be dispatched with a delay after a last activity passed through them. This delay is long
 * enough to guarantee that ProcessLifecycleOwner won't send any events if activities are destroyed
 * and recreated due to a configuration change.
 */
@SuppressWarnings("unused")
public class AppLifecycleListener implements LifecycleObserver {

    private final ComponentActivity activity;
    private final AppPermissions appPermissions;
    private final Runnable action;

    public AppLifecycleListener(ComponentActivity activity, AppPermissions appPermissions,
                                Runnable action) {
        this.activity = activity;
        this.appPermissions = appPermissions;
        this.action = action;
    }

    /**
     * The application is moved to the foreground.
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onMoveToForeground() {
        ActivityResultLauncher<String[]> launcher = PermissionsUtils
                .createAndLaunchPermissionLauncher(activity, appPermissions, action);
    }

    /**
     * The application is moved to the background.
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onMoveToBackground() {
    }
}
