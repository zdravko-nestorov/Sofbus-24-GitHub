package bg.znestorov.sofbus24.entity;

import android.app.Application;
import android.content.pm.PackageManager;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.huawei.hms.api.HuaweiApiAvailability;

import org.xms.g.common.ConnectionResult;

import java.util.HashMap;

import bg.znestorov.sofbus24.main.HomeScreenSelect;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.HmsUtils;
import bg.znestorov.sofbus24.utils.MapUtils;

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

    // HomeScreenSelect main activity
    private HomeScreenSelect hssContext;
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

        try {
            // Initialize HMS prerequisites (isHms property)
            org.xms.g.utils.GlobalEnvSetting.init(this, null);
            org.xms.adapter.utils.XLoader.init(this);

            // Set the HMS map API key
            MapUtils.setHmsMapApiKey(this);

        } catch (Exception e) {
            // Do nothing as it can happen only on old Huawei devices
        }

        // Initialize Sofbus 24 prerequisites
        initialize();
    }

    public HomeScreenSelect getHssContext() {
        return hssContext;
    }

    public void setHssContext(HomeScreenSelect hssContext) {
        this.hssContext = hssContext;
    }

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
        // Disable Google Analytics for HMS and GMS (not working with Android Target SDK >30)
        if (HmsUtils.isHms() || HmsUtils.isGms()) {
            return null;
        }

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

        if (HmsUtils.isGms()) {
            // Google Mobile Services
            areServicesAvailable = GoogleApiAvailability.getInstance()
                    .isGooglePlayServicesAvailable(this) == ConnectionResult.getSUCCESS();

            // Google Street View
            try {
                getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
                isGoogleStreetViewAvailable = true;
            } catch (PackageManager.NameNotFoundException e) {
                isGoogleStreetViewAvailable = false;
            }

        } else {
            // Huawei Mobile Services
            areServicesAvailable = HuaweiApiAvailability.getInstance()
                    .isHuaweiMobileServicesAvailable(this) == ConnectionResult.getSUCCESS();

            // Google Street View
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
        APP_TRACKER
    }

}