package bg.znestorov.sofbus24.utils.activity;

import android.app.Activity;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.StandardExceptionParser;
import com.google.android.gms.analytics.Tracker;

import bg.znestorov.sofbus24.entity.AppThemeEnum;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.GlobalEntity.TrackerName;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.navigation.NavDrawerHomeScreenPreferences;

/**
 * Class used to interact with GoogleAnalytics
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ActivityTracker {

    /**
     * Send an event to GoogleAnalytics on HomeScreen selection
     *
     * @param context the current activity context
     */
    public static void selectedHomeScreen(Activity context) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Selected Home Screen")
                .setAction("homeScreenSelect")
                .setLabel(
                        "homeScreenSelect: "
                                + NavDrawerHomeScreenPreferences
                                .getUserHomeScreenChoice(context))
                .build());
    }

    /**
     * Send a screen view to GoogleAnalytics on which home screen is started on
     * app startup
     *
     * @param context    the current activity context
     * @param screenName the screen name
     */
    public static void homeScreenUsed(Activity context, String screenName) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Set screen name
        tracker.setScreenName(screenName);

        // Send a screen view
        tracker.send(new HitBuilders.AppViewBuilder().build());
    }

    /**
     * Send a caught exception to GoogleAnalytics
     *
     * @param context    the current activity context
     * @param methodName the name of the method
     * @param msg        the user message
     * @param e          the exception
     */
    public static void sendCaughtException(Activity context, String methodName,
                                           String msg, Exception e) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send exception
        tracker.send(new HitBuilders.ExceptionBuilder()
                .setDescription(
                        "["
                                + methodName
                                + "] "
                                + msg
                                + ":\n"
                                + new StandardExceptionParser(context, null)
                                .getDescription(Thread.currentThread()
                                        .getName(), e)).setFatal(false)
                .build());
    }

    /**
     * Send an event to GoogleAnalytics on VirtualBoards search
     *
     * @param context the current activity context
     */
    public static void queriedVirtualBoardsInformation(Activity context) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Info Search [Virtual Boards]")
                .setAction("queryVirtualBoards").setLabel("queryVirtualBoards")
                .build());
    }

    /**
     * Send an event to GoogleAnalytics on VirtualBoards search
     *
     * @param context         the current activity context
     * @param htmlRequestCode the request code of the user call
     */
    public static void queriedVirtualBoardsInformationType(Activity context,
                                                           HtmlRequestCodesEnum htmlRequestCode) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        String label = "queryVirtualBoards" + htmlRequestCode;
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Virtual Boards Info [" + htmlRequestCode + "]")
                .setAction("queryVirtualBoards").setLabel(label).build());
    }

    /**
     * Send an event to GoogleAnalytics on schedule search
     *
     * @param context the current activity context
     */
    public static void queriedScheduleInformation(Activity context) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Info Search [Schedule]")
                .setAction("querySchedule").setLabel("querySchedule").build());
    }

    /**
     * Send an event to GoogleAnalytics on metro schedule search
     *
     * @param context the current activity context
     */
    public static void queriedMetroInformation(Activity context) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Info Search [Metro]").setAction("queryMetro")
                .setLabel("queryMetro").build());
    }

    /**
     * Send an event to GoogleAnalytics on "check for update" action (from the
     * navigation drawer items or about activity)
     *
     * @param context the current activity context
     */
    public static void queriedCheckForUpdate(Activity context) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Check For Update")
                .setAction("queryCheckForUpdate")
                .setLabel("queryCheckForUpdate").build());
    }

    /**
     * Send an event to GoogleAnalytics on "loading local schedule cache" action
     *
     * @param context the current activity context
     */
    public static void queriedLocalScheduleCache(Activity context) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Local Schedule Cache")
                .setAction("queriedLocalScheduleCache")
                .setLabel("queriedLocalScheduleCache").build());
    }

    /**
     * Send an event to GoogleAnalytics on "changing theme" action (from the
     * settings screen)
     *
     * @param context      the current activity context
     * @param appThemeEnum the chosen theme
     */
    public static void changedApplicationTheme(Activity context,
                                               AppThemeEnum appThemeEnum) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Change Theme [" + appThemeEnum + "]")
                .setAction("changedApplicationTheme")
                .setLabel("changedApplicationTheme").build());
    }

    /**
     * Send an event to GoogleAnalytics on "showing database error dialog"
     * action (from the home screen)
     *
     * @param context the current activity context
     */
    public static void sofbusDatabaseErrorDialog(Activity context) {

        // Get tracker
        Tracker tracker = ((GlobalEntity) context.getApplicationContext())
                .getTracker(TrackerName.APP_TRACKER);

        // Build and send an Event
        tracker.send(new HitBuilders.EventBuilder()
                .setCategory("Database Error Dialog")
                .setAction("sofbusDatabaseErrorDialog")
                .setLabel("sofbusDatabaseErrorDialog").build());
    }

}