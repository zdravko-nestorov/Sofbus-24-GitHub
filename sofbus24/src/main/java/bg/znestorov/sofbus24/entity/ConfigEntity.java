package bg.znestorov.sofbus24.entity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.io.Serializable;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;

/**
 * Configuration object containing some information about the application
 *
 * @author Zdravko Nestorov
 * @version 2.0
 */
public class ConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private int versionCode;
    private String versionName;

    private boolean favouritesVisible = true;
    private int favouritesPosition = 0;
    private boolean searchVisible = true;
    private int searchPosition = 1;
    private boolean scheduleVisible = true;
    private int schedulePosition = 2;

    private int sofbus24DbVersion = 1;

    public ConfigEntity() {

        this.favouritesVisible = true;
        this.favouritesPosition = 0;
        this.searchVisible = true;
        this.searchPosition = 1;
        this.scheduleVisible = true;
        this.schedulePosition = 2;

        this.sofbus24DbVersion = 1;
    }

    public ConfigEntity(Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.CONFIGURATION_PREF_NAME, Context.MODE_PRIVATE);

        int versionCode;
        String versionName;
        try {
            versionCode = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0).versionCode;
            versionName = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            versionCode = 0;
            versionName = null;
        }

        this.versionCode = versionCode;
        this.versionName = versionName;

        try {
            this.favouritesVisible = sharedPreferences.getBoolean(
                    Constants.CONFIGURATION_PREF_FAVOURITES_VISIBILITY_KEY,
                    true);
            this.favouritesPosition = sharedPreferences.getInt(
                    Constants.CONFIGURATION_PREF_FAVOURITES_POSITION_KEY, 0);
        } catch (Exception e) {
            this.favouritesVisible = true;
            this.favouritesPosition = 0;
        }

        try {
            this.searchVisible = sharedPreferences.getBoolean(
                    Constants.CONFIGURATION_PREF_SEARCH_VISIBILITY_KEY, true);
            this.searchPosition = sharedPreferences.getInt(
                    Constants.CONFIGURATION_PREF_SEARCH_POSITION_KEY, 1);
        } catch (Exception e) {
            this.searchVisible = true;
            this.searchPosition = 1;
        }

        try {
            this.scheduleVisible = sharedPreferences.getBoolean(
                    Constants.CONFIGURATION_PREF_SCHEDULE_VISIBILITY_KEY, true);
            this.schedulePosition = sharedPreferences.getInt(
                    Constants.CONFIGURATION_PREF_SCHEDULE_POSITION_KEY, 2);
        } catch (Exception e) {
            this.scheduleVisible = true;
            this.schedulePosition = 2;
        }

        try {
            this.sofbus24DbVersion = Integer.parseInt(sharedPreferences
                    .getString(Constants.CONFIGURATION_PREF_SOFBUS24_KEY, "1"));
        } catch (Exception e) {
            try {
                this.sofbus24DbVersion = sharedPreferences.getInt(
                        Constants.CONFIGURATION_PREF_SOFBUS24_KEY, 1);
            } catch (Exception e1) {
                this.sofbus24DbVersion = 1;
            }
        }
    }

    public ConfigEntity(Document doc) {
        int versionCode = 0;
        String versionName = null;
        int stationsDbVersion = 0;

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();

            Node versionCodeNode = (Node) xpath.evaluate(
                    "Configuration/NewVersionCode/text()", doc,
                    XPathConstants.NODE);
            versionCode = Integer.parseInt(versionCodeNode.getTextContent());

            Node versionNameNode = (Node) xpath.evaluate(
                    "Configuration/NewVersionName/text()", doc,
                    XPathConstants.NODE);
            versionName = versionNameNode.getTextContent();

            Node stationsDbVersionNode = (Node) xpath.evaluate(
                    "Configuration/NewSofbus24DBVersion/text()", doc,
                    XPathConstants.NODE);
            stationsDbVersion = Integer.parseInt(stationsDbVersionNode
                    .getTextContent());
        } catch (Exception e) {
        }

        this.versionCode = versionCode;
        this.versionName = versionName;
        this.sofbus24DbVersion = stationsDbVersion;
    }

    public ConfigEntity(int versionCode, String versionName,
                        int stationsDbVersion, boolean favouritesVisible,
                        int favouritesPosition, boolean searchVisible, int searchPosition,
                        boolean scheduleVisible, int schedulePosition,
                        boolean metroVisible, int metroPosition, int vehiclesDbVersion) {

        this.versionCode = versionCode;
        this.versionName = versionName;

        this.favouritesVisible = favouritesVisible;
        this.favouritesPosition = favouritesPosition;
        this.searchVisible = searchVisible;
        this.searchPosition = searchPosition;
        this.scheduleVisible = scheduleVisible;
        this.schedulePosition = schedulePosition;

        this.sofbus24DbVersion = stationsDbVersion;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public boolean isFavouritesVisible() {
        return favouritesVisible;
    }

    public void setFavouritesVisible(boolean favouritesVisible) {
        this.favouritesVisible = favouritesVisible;
    }

    public int getFavouritesPosition() {
        return favouritesPosition;
    }

    public void setFavouritesPosition(int favouritesPosition) {
        this.favouritesPosition = favouritesPosition;
    }

    public boolean isSearchVisible() {
        return searchVisible;
    }

    public void setSearchVisible(boolean searchVisible) {
        this.searchVisible = searchVisible;
    }

    public int getSearchPosition() {
        return searchPosition;
    }

    public void setSearchPosition(int searchPosition) {
        this.searchPosition = searchPosition;
    }

    public boolean isScheduleVisible() {
        return scheduleVisible;
    }

    public void setScheduleVisible(boolean scheduleVisible) {
        this.scheduleVisible = scheduleVisible;
    }

    public int getSchedulePosition() {
        return schedulePosition;
    }

    public void setSchedulePosition(int schedulePosition) {
        this.schedulePosition = schedulePosition;
    }

    public int getSofbus24DbVersion() {
        return sofbus24DbVersion;
    }

    public void setSofbus24DbVersion(int stationsDbVersion) {
        this.sofbus24DbVersion = stationsDbVersion;
    }

    /**
     * Get the tab according to its position
     *
     * @param context  the current activity context
     * @param position the position of the tab
     * @return the TabEntity object on the selected position
     */
    public HomeTabEntity getTabByPosition(Activity context, int position) {

        if (position >= 0 && position < Constants.GLOBAL_PARAM_HOME_TABS_COUNT) {

            boolean tabVisible;
            String tabName;

            if (favouritesPosition == position) {
                tabVisible = favouritesVisible;
                tabName = context.getString(R.string.edit_tabs_favourites);
            } else if (searchPosition == position) {
                tabVisible = searchVisible;
                tabName = context.getString(R.string.edit_tabs_search);
            } else {
                tabVisible = scheduleVisible;
                tabName = context.getString(R.string.edit_tabs_schedule);
            }

            return new HomeTabEntity(tabVisible, tabName, position);
        } else {
            return new HomeTabEntity();
        }
    }

    /**
     * Check if the Configuration entity is valid
     *
     * @return if the entity is valid
     */
    public boolean isValidConfig() {

        boolean isValidConfig = false;

        if (versionCode > 0 && versionName != null && sofbus24DbVersion > 0) {
            isValidConfig = true;
        }

        return isValidConfig;
    }

    /**
     * Check if the Configuration is in default state (used to determine if the
     * reset button in EditTabs should be visible)
     *
     * @return if it is a default configuration
     */
    public boolean isDefaultConfig() {

        boolean isDefaultConfig = favouritesVisible && favouritesPosition == 0
                && searchVisible && searchPosition == 1 && scheduleVisible
                && schedulePosition == 2;

        return isDefaultConfig;
    }

    /**
     * Check if two configs are same
     *
     * @param config the current config
     * @return if the configurations are the same
     */
    public boolean isSameConfig(ConfigEntity config) {

        boolean isSameConfig = this.isFavouritesVisible() == config
                .isFavouritesVisible()
                && this.getFavouritesPosition() == config
                .getFavouritesPosition()
                && this.isSearchVisible() == config.isSearchVisible()
                && this.getSearchPosition() == config.getSearchPosition()
                && this.isScheduleVisible() == config.isScheduleVisible()
                && this.getSchedulePosition() == config.getSchedulePosition();

        return isSameConfig;
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tversionCode: " + versionCode
                + "\n\tversionName: " + versionName
                + "\n\tfavouritesVisible: " + favouritesVisible
                + "\n\tfavouritesPosition: " + favouritesPosition
                + "\n\tsearchVisible: " + searchVisible
                + "\n\tsearchPosition: " + searchPosition
                + "\n\tscheduleVisible: " + scheduleVisible
                + "\n\tschedulePosition: " + schedulePosition
                + "\n\tstationsDbVersion: " + sofbus24DbVersion
                + "\n}";
    }

}