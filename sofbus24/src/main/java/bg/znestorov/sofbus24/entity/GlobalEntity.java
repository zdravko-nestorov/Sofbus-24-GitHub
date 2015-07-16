package bg.znestorov.sofbus24.entity;

import android.app.Application;
import android.content.pm.PackageManager;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

import java.util.HashMap;

import bg.znestorov.sofbus24.main.R;

/**
 * Global class that extends Application and save state across several
 * Activities and all parts of your application. Each Activity is also a
 * Context, which is information about its execution environment in the broadest
 * sense. Your application also has a context, and Android guarantees that it
 * will exist as a single instance across your application.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class GlobalEntity extends Application {

    private boolean isPhoneDevice;
    private boolean isLargeTablet;
    private boolean areServicesAvailable;
    private boolean isGoogleStreetViewAvailable;
    // Indicates if the standard home screen has changed tabs
    private boolean hasToRestart = false;
    private boolean isFavouritesChanged = false;
    private boolean isVbChanged = false;
    private boolean isHomeScreenChanged = false;
    // Indicates if the home activity is changed
    private boolean isHomeActivityChanged = false;
    // Google Analytics
    private HashMap<TrackerName, Tracker> mTrackers;

    @Override
    public void onCreate() {
        super.onCreate();
        initialize();
    }
    ;

    public boolean isPhoneDevice() {
        return isPhoneDevice;
    }

    public void setPhoneDevice(boolean isPhoneDevice) {
        this.isPhoneDevice = isPhoneDevice;
    }

    public boolean isLargeTablet() {
        return isLargeTablet;
    }

    public void setLargeTablet(boolean isLargeTablet) {
        this.isLargeTablet = isLargeTablet;
    }

    public boolean isHasToRestart() {
        return hasToRestart;
    }

    public void setHasToRestart(boolean hasToRestart) {
        this.hasToRestart = hasToRestart;
    }

    public boolean isFavouritesChanged() {
        return isFavouritesChanged;
    }

    public void setFavouritesChanged(boolean isFavouritesChanged) {
        this.isFavouritesChanged = isFavouritesChanged;
    }

    public boolean isVbChanged() {
        return isVbChanged;
    }

    public void setVbChanged(boolean isVbChanged) {
        this.isVbChanged = isVbChanged;
    }

    public boolean isHomeScreenChanged() {
        return isHomeScreenChanged;
    }

    public void setHomeScreenChanged(boolean isHomeScreenChanged) {
        this.isHomeScreenChanged = isHomeScreenChanged;
    }

    public boolean areServicesAvailable() {
        return areServicesAvailable;
    }

    public void setServicesAvailable(boolean areServicesAvailable) {
        this.areServicesAvailable = areServicesAvailable;
    }

    public boolean isGoogleStreetViewAvailable() {
        return isGoogleStreetViewAvailable;
    }

    public void setGoogleStreetViewAvailable(boolean isGoogleStreetViewAvailable) {
        this.isGoogleStreetViewAvailable = isGoogleStreetViewAvailable;
    }

    public boolean isHomeActivityChanged() {
        return isHomeActivityChanged;
    }

    public void setHomeActivityChanged(boolean isHomeActivityChanged) {
        this.isHomeActivityChanged = isHomeActivityChanged;
    }

    /**
     * Get the tracker, responsible for the GoogleAnalytics statistics
     *
     * @param trackerId the tracker id
     * @return the tracker
     */
    public synchronized Tracker getTracker(TrackerName trackerId) {

        if (!mTrackers.containsKey(trackerId)) {

            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);

            // Check what tracker to be created. In case we need multiple
            // trackers, create different ones using the appropriate
            // configuration file
            switch (trackerId) {
                default:
                    Tracker tracker = analytics.newTracker(R.xml.app_tracker);
                    mTrackers.put(trackerId, tracker);
                    break;
            }
        }

        return mTrackers.get(trackerId);
    }

    /**
     * Get the type of the device - PHONE, SMALL TABLET or LARGE TABLET
     *
     * @return the device type
     */
    public DeviceTypeEnum getDeviceType() {

        DeviceTypeEnum deviceType;
        if (isPhoneDevice) {
            deviceType = DeviceTypeEnum.PHONE;
        } else if (!isLargeTablet) {
            deviceType = DeviceTypeEnum.SMALL_TABLET;
        } else {
            deviceType = DeviceTypeEnum.LARGE_TABLET;
        }

        return deviceType;
    }

    /**
     * Initialize the main params of the application
     */
    private void initialize() {

        isPhoneDevice = getResources().getBoolean(R.bool.isPhone);
        isLargeTablet = getResources().getBoolean(R.bool.isLargeTablet);

        try {
            getPackageManager().getApplicationInfo("com.google.android.gms", 0);

            // (GooglePlay error on old devices - Android 2.2-3.0) Additional
            // check that verifies that Google Play services is installed and
            // enabled on this device, and that the version installed on this
            // device is no older than the one required by this client
            if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this) == ConnectionResult.SUCCESS) {
                areServicesAvailable = true;
            } else {
                areServicesAvailable = false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            areServicesAvailable = false;
        }

        try {
            getPackageManager().getApplicationInfo("com.google.android.street",
                    0);
            isGoogleStreetViewAvailable = true;
        } catch (PackageManager.NameNotFoundException e) {
            isGoogleStreetViewAvailable = false;
        }

        mTrackers = new HashMap<TrackerName, Tracker>();
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tisPhoneDevice: " + isPhoneDevice
                + "\n\tisLargeTablet: " + isLargeTablet
                + "\n\tareServicesAvailable: " + areServicesAvailable
                + "\n\tisGoogleStreetViewAvailable: "
                + isGoogleStreetViewAvailable + "\n\thasToRestart: "
                + hasToRestart + "\n\tisFavouritesChanged: "
                + isFavouritesChanged + "\n\tisVbChanged: " + isVbChanged
                + "\n\tisHomeScreenChanged: " + isHomeScreenChanged
                + "\n\tisHomeActivityChanged: " + isHomeActivityChanged + "\n}";
    }

    /**
     * Enum used to identify the tracker that needs to be used for tracking.
     * <p/>
     * A single tracker is usually enough for most purposes. In case you do need
     * multiple trackers, storing them all in Application object helps ensure
     * that they are created only once per application instance.
     */
    public enum TrackerName {
        APP_TRACKER;
    }

}