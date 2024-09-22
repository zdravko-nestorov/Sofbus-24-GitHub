package bg.znestorov.sofbus24.utils;

import java.math.BigDecimal;

/**
 * Static class with the constant variables
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class Constants {

    /**
     * Global parameters
     */
    public static final String GLOBAL_PARAM_EMPTY = "EMPTY";
    public static final String GLOBAL_PARAM_EMPTY_STRING = "";
    public static final String GLOBAL_PARAM_XXX = "xxx";
    public static final Double GLOBAL_PARAM_SOFIA_CENTER_LATITUDE = 42.696492;
    public static final Double GLOBAL_PARAM_SOFIA_CENTER_LONGITUDE = 23.326011;
    public static final Double GLOBAL_PARAM_SOFIA_SAN_LATITUDE = 42.6950719;
    public static final Double GLOBAL_PARAM_SOFIA_SAN_LONGITUDE = 23.3326147;
    public static final Double GLOBAL_PARAM_MLADOST_1_LATITUDE = 42.64971443383678;
    public static final Double GLOBAL_PARAM_MLADOST_1_LONGITUDE = 23.37787427008152;
    public static final BigDecimal GLOBAL_PARAM_CLOSEST_STATION_DISTANCE = new BigDecimal(
            25 * 1000 * 1000); // 25 000 km  (more than the Earth diameter)
    public static final int GLOBAL_PARAM_HOME_TABS_COUNT = 3;
    public static final String GLOBAL_PARAM_BACKUP_EXTENSION = ".sofbus24";
    public static final String GLOBAL_GRANT_PERMISSION_ACTIVITY = "com.android.packageinstaller.permission.ui.GrantPermissionsActivity";

    /**
     * Bundle keys
     */
    // Sofbus24 --> ClosestStationsList --> ClosestStationsListFragment
    public static final String BUNDLE_CLOSEST_STATIONS_LIST = "CLOSEST STATIONS LIST";
    // EditTabs --> EditTabsFragment
    public static final String BUNDLE_EDIT_TABS = "EDIT TABS";
    public static final String BUNDLE_EDIT_TABS_RESET = "EDIT TABS RESET";
    // VirtualBoardsFragment --> VirtualBoardsTime
    public static final String BUNDLE_VIRTUAL_BOARDS_TIME_STATION = "VIRTUAL BOARDS TIME STATION";
    public static final String BUNDLE_VIRTUAL_BOARDS_TIME_VEHICLE = "VIRTUAL BOARDS TIME VEHICLE";
    public static final String BUNDLE_VIRTUAL_BOARDS_TIME_EMPTY_LIST = "VIRTUAL BOARDS TIME EMPTY LIST";
    // ScheduleFragment --> PublicTransport --> PublicTransportFragment --> ...
    public static final String BUNDLE_PUBLIC_TRANSPORT_SCHEDULE = "PUBLIC TRANSPORT SCHEDULE";
    public static final String BUNDLE_PUBLIC_TRANSPORT_VEHICLE = "PUBLIC TRANSPORT VEHICLE";
    // Sofbus24 --> MetroFragment --> MetroStationFragment --> ...
    public static final String BUNDLE_METRO_SCHEDULE = "METRO SCHEDULE";
    // MetroSchedule/PublicTransportSchedule --> StationMap
    public static final String BUNDLE_STATION_MAP = "STATION MAP";
    // MetroFragment/PublicTransport --> StationRouteMap
    public static final String BUNDLE_STATION_ROUTE_MAP = "STATION ROUTE MAP";
    // Sofbus24/DroidTrans/ClosestStationsMap --> FavouritesFragment
    public static final String BUNDLE_IS_HOME_SCREEN_FRAGMENT = "IS HOME SCREEN FRAGMENT";
    // Sofbus24 --> DroidTrans
    public static final String BUNDLE_DROID_TRANS = "DROID TRANS";
    // MapsFragmentActivity -> MapsFragmentActivity
    public static final String BUNDLE_MAP_FRAGMENT = "MapBundleKey";

    /**
     * Preferences
     */
    public static final String PREFERENCE_KEY_APP_COMMON_CATEGORY = "sofbusCommonCategory";
    public static final String PREFERENCE_KEY_APP_THEME = "sofbusTheme";
    public static final String PREFERENCE_DEFAULT_VALUE_APP_THEME = "sofbusThemeLight";
    public static final String PREFERENCE_KEY_APP_LANGUAGE = "appLanguage";
    public static final String PREFERENCE_DEFAULT_VALUE_APP_LANGUAGE = "bg";
    public static final String PREFERENCE_KEY_APP_VISUAL_CATEGORY = "sofbusVisualCategory";
    public static final String PREFERENCE_KEY_FAVOURITES_EXPANDED = "favouritesExpanded";
    public static final boolean PREFERENCE_DEFAULT_VALUE_FAVOURITES_EXPANDED = false;
    public static final String PREFERENCE_KEY_TABS_TYPE = "tabsType";
    public static final String PREFERENCE_DEFAULT_VALUE_TABS_TYPE = "tabsTypeIcon";
    public static final String PREFERENCE_DEFAULT_VALUE_TABS_TYPE_TITLE = "tabsTypeTitle";
    public static final String PREFERENCE_KEY_BLIND_VIEW = "blindView";
    public static final boolean PREFERENCE_DEFAULT_VALUE_BLIND_VIEW = false;
    public static final String PREFERENCE_KEY_TIME_TYPE = "timeType";
    public static final String PREFERENCE_DEFAULT_VALUE_TIME_TYPE = "timeRemaining";
    public static final String PREFERENCE_DEFAULT_VALUE_TIME_TYPE_ARRIVAL = "timeArrival";
    public static final String PREFERENCE_KEY_TIME_SOURCE = "timeSource";
    public static final String PREFERENCE_DEFAULT_VALUE_TIME_SOURCE = "timeSkgt";
    public static final String PREFERENCE_KEY_VEHICLE_EXTRAS = "vehicleExtras";
    public static final boolean PREFERENCE_DEFAULT_VALUE_VEHICLE_EXTRAS = true;
    public static final String PREFERENCE_KEY_CACHE_STATE = "cacheState";
    public static final boolean PREFERENCE_DEFAULT_VALUE_CACHE_STATE = true;
    public static final String PREFERENCE_KEY_NUMBER_OF_DAYS = "numberOfDays";
    public static final String PREFERENCE_DEFAULT_VALUE_NUMBER_OF_DAYS = "20";
    public static final String PREFERENCE_KEY_SHOW_CACHE_TOAST = "showCacheToast";
    public static final boolean PREFERENCE_DEFAULT_VALUE_SHOW_CACHE_TOAST = true;
    public static final String PREFERENCE_KEY_MARKER_TYPE = "markerType";
    public static final String PREFERENCE_DEFAULT_VALUE_MARKER_TYPE = "markerSkgtCars";
    public static final String PREFERENCE_KEY_MARKER_OPTIONS = "markerOptions";
    public static final String PREFERENCE_DEFAULT_VALUE_MARKER_OPTIONS = "markerInfo";
    public static final String PREFERENCE_DEFAULT_VALUE_MARKER_OPTIONS_SCHEDULE = "markerSchedule";
    public static final String PREFERENCE_DEFAULT_VALUE_MARKER_OPTIONS_SCHEDULE_NO_SNIPPET = "markerScheduleNoSnippet";
    public static final String PREFERENCE_KEY_STATIONS_RADIUS = "stationsRadius";
    public static final String PREFERENCE_DEFAULT_VALUE_STATIONS_RADIUS = "600";
    public static final String PREFERENCE_KEY_POSITION_FOCUS = "positionFocus";
    public static final boolean PREFERENCE_DEFAULT_VALUE_POSITION_FOCUS = false;
    public static final String PREFERENCE_KEY_AUTOMATIC_UPDATE = "automaticUpdate";
    public static final boolean PREFERENCE_DEFAULT_VALUE_AUTOMATIC_UPDATE = true;
    public static final String PREFERENCE_KEY_GOOGLE_ANALYTICS = "googleAnalytics";
    public static final boolean PREFERENCE_DEFAULT_VALUE_GOOGLE_ANALYTICS = true;

    /**
     * Edit Tabs
     */
    public static final String CONFIGURATION_PREF_FAVOURITES_VISIBILITY_KEY = "FavouritesTabVisibility";
    public static final String CONFIGURATION_PREF_FAVOURITES_POSITION_KEY = "FavouritesTabPosition";
    public static final String CONFIGURATION_PREF_SEARCH_VISIBILITY_KEY = "SearchTabVisibility";
    public static final String CONFIGURATION_PREF_SEARCH_POSITION_KEY = "SearchTabPosition";
    public static final String CONFIGURATION_PREF_SCHEDULE_VISIBILITY_KEY = "ScheduleTabVisibility";
    public static final String CONFIGURATION_PREF_SCHEDULE_POSITION_KEY = "ScheduleTabPosition";
    public static final String CONFIGURATION_PREF_METRO_VISIBILITY_KEY = "MetroTabVisibility";
    public static final String CONFIGURATION_PREF_METRO_POSITION_KEY = "MetroTabPosition";

    /**
     * About
     */
    public static final String CONFIGURATION_URL = "https://raw.githubusercontent.com/zdravko-nestorov/Sofbus-24/master/HoloDesign-ver.3/ConfigData/ConfigurationDetails/configuration.xml";
    public static final String CONFIGURATION_SOFBUS_24_DB_URL = "https://raw.githubusercontent.com/zdravko-nestorov/Sofbus-24/master/HoloDesign-ver.3/ConfigData/Databases/sofbus24.db";
    public static final String CONFIGURATION_PREF_NAME = "configuration";
    public static final String CONFIGURATION_PREF_SOFBUS24_KEY = "CurrentSofbus24DBVersion";

    /**
     * Favorites
     */
    public static final String FAVOURITES_IMAGE_URL = "https://geo0.ggpht.com/cbk?cb_client=maps_sv.tactile&output=thumbnail&thumb=2&w=500&h=165&yaw=1&pitch=1&ll=%s,%s";
    public static final String FAVOURITES_IMAGE_HIGH_URL = "https://geo0.ggpht.com/cbk?cb_client=maps_sv.tactile&output=thumbnail&thumb=2&w=500&h=165&yaw=8&pitch=-15&ll=%s,%s";

    /**
     * Virtual Boards API
     */
    public static final String VB_URL_VIRTUAL_TABLE_API = "https://www.sofiatraffic.bg/bg/trip/getVirtualTable";

    public static final String VB_VEHICLE_NAME_API = "name";
    public static final String VB_VEHICLE_ROUTE_LAST_STOP_API = "last_stop";
    public static final String VB_VEHICLE_ROUTE_NAME_API = "route_name";
    public static final String VB_VEHICLE_TYPE_API = "type";
    public static final String VB_VEHICLE_EXT_ID_API = "ext_id";
    public static final String VB_STATION_DETAILS_API = "details";

    public static final String VB_VEHICLE_TIME_API = "t";
    public static final String VB_VEHICLE_AIR_CONDITIONING_API = "ac";
    public static final String VB_VEHICLE_WHEELCHAIR_API = "wheelchairs";
    public static final String VB_VEHICLE_BICYCLE_MOUNT_API = "bikes";
    public static final String VB_VEHICLE_DOUBLEDECKER_API = "dd";
    public static final String VB_VEHICLE_WIFI_API = "wifi";

    /**
     * Schedule direction
     */
    public static final String SCHEDULE_URL_DIRECTION = "http://m.sofiatraffic.bg/schedules?";
    public static final String SCHEDULE_URL_DIRECTION_BUS_TYPE = "tt";
    public static final String SCHEDULE_URL_DIRECTION_LINE = "ln";
    public static final String SCHEDULE_URL_DIRECTION_SEARCH = "s";
    public static final String SCHEDULE_URL_DIRECTION_SEARCH_VALUE = "Търсене";
    public static final String SCHEDULE_REGEX_DIRECTION_PARTS = "<form method=\"get\" action=\"/schedules/vehicle\">";
    public static final String SCHEDULE_REGEX_DIRECTION_NAME = "<div class=\"info\">(.*?)<\\/div>";
    public static final String SCHEDULE_REGEX_DIRECTION_HIDDEN_VARIABLE = "<input type=\"hidden\" value=\"(.*?)\" name=\"%s\"\\/>";
    public static final String SCHEDULE_REGEX_DIRECTION_STATION = "<option id=\"(.*?)\" value=\".*?\">([^^]*?)<\\/option>";

    public static final String SCHEDULE_URL_STATION_SCHEDULE = "http://m.sofiatraffic.bg/schedules/vehicle?";
    public static final String SCHEDULE_URL_STATION_SCHEDULE_STOP = "stop";
    public static final String SCHEDULE_URL_STATION_SCHEDULE_CH = "ch";
    public static final String SCHEDULE_URL_STATION_SCHEDULE_CH_VALUE = "Провери";
    public static final String SCHEDULE_URL_STATION_SCHEDULE_VT = "vt";
    public static final String SCHEDULE_URL_STATION_SCHEDULE_LID = "lid";
    public static final String SCHEDULE_URL_STATION_SCHEDULE_RID = "rid";
    public static final String SCHEDULE_URL_STATION_SCHEDULE_H = "h";
    public static final String SCHEDULE_URL_STATION_SCHEDULE_H_VALUE = "0";
    public static final String SCHEDULE_REGEX_STATION_SCHEDULE = "<td class=\"(schTdBrd|schTdNoBrd)\" align=\"center\">([^^]*?)<\\/td>";

    public static final String SUMC_SITE_SCHEDULE_URL_ADDRESS = "https://www.sofiatraffic.bg/bg/public-transport";

    /**
     * Metro Schedule
     */
    public static final String METRO_STATION_URL = "https://raw.githubusercontent.com/zdravko-nestorov/Sofbus-24/master/HoloDesign-ver.3/MetroSchedule/schedule/Station%s.xml";

    /**
     * History
     */
    public static final int TOTAL_HISTORY_COUNT = 50;
    public static final String HISTORY_PREFERENCES_NAME = "search_history";
    public static final String HISTORY_PREFERENCES_NEXT_SEARCH_NUMBER = "next_search_number";
    public static final String HISTORY_PREFERENCES_SEARCH_VALUE = "value_";
    public static final String HISTORY_PREFERENCES_SEARCH_DATE = "date_";
    public static final String HISTORY_PREFERENCES_SEARCH_TYPE = "type_";

    /**
     * Favorites Order
     */
    public static final String FAVOURITES_ORDER_PREFERENCES_NAME = "favourites_order";
    public static final String FAVOURITES_ORDER_PREFERENCES_TYPE = "type";

    /**
     * Check For Updates
     */
    public static final String CHECK_FOR_UPDATES_PREFERENCES_NAME = "application_update";
    public static final String CHECK_FOR_UPDATES_PREFERENCES_APP_LAST_CHECK = "app_last_check";
    public static final String CHECK_FOR_UPDATES_PREFERENCES_DB_LAST_CHECK = "db_last_check";

    /**
     * Route Changes
     */
    public static final String ROUTE_CHANGES_URL_ADDRESS = "http://forum.sofiatraffic.bg/forum/route_changes_all.php";
    public static final String ROUTE_CHANGES_REGEX = "<a\\s+href=\\\"routechanges\\S+id=(\\d+)\\\">(.*?)[|](.*?)<\\/a>[^^]*?<span\\s+style=\".*?\">(.*?)<\\/span>";
    public static final String ROUTE_CHANGES_FROM = "from";
    public static final String ROUTE_CHANGES_NEWS_URL_ADDRESS = "http://forum.sofiatraffic.bg/forum/routechanges.php?id=%s";
    public static final String ROUTE_CHANGES_NEWS_REGEX = "<div class=\"txtBlockContent\">([^^]*?)<div class=\"subnav subnavBottom\">";
    public static final String ROUTE_CHANGES_IMAGE_REGEX = "<a href=.*?>.*?<\\/a>(<br.*?>)?";
    public static final String ROUTE_CHANGES_NEW_LINES_REGEX = "(<br.*?>){2,}";

    /**
     * Route Changes API
     */
    public static final String ROUTE_CHANGES_API_URL_ADDRESS = "https://www.sofiatraffic.bg/bg/api/v1/cms/route-changes/?page=%s";
    public static final String ROUTE_CHANGES_NEWS_API_URL_ADDRESS = "https://www.sofiatraffic.bg/bg/api/v1/cms/route-changes/%s/";
    public static final String ROUTE_CHANGES_NEWS_API_URL_BROWSER_ADDRESS = "https://www.sofiatraffic.bg/bg/transport/routeChanges/%s/";
    public static final String ROUTE_CHANGES_NEWS_API_RESULTS = "results";
    public static final String ROUTE_CHANGES_NEWS_API_ID = "id";
    public static final String ROUTE_CHANGES_NEWS_API_TITLE = "title";
    public static final String ROUTE_CHANGES_NEWS_VALID_FROM_DATE = "valid_from";
    public static final String ROUTE_CHANGES_NEWS_VALID_TO_DATE = "valid_to";
    public static final String ROUTE_CHANGES_NEWS_API_CONTENT = "content";

    /**
     * Google Cloud Messaging
     */
    public static final String GCM_PROJECT_ID = "968618561001";

    public static final String GCM_EXTERNAL_SERVER_URL = "http://sofbus-24.appspot.com/gcm/register";
    public static final String GCM_EXTERNAL_SERVER_URL_REG_ID_ATT = "regId";
    public static final String GCM_EXTERNAL_SERVER_URL_DEVICE_MODEL_ATT = "deviceModel";
    public static final String GCM_EXTERNAL_SERVER_URL_DEVICE_OS_VERSION_ATT = "deviceOsVersion";
    public static final String GCM_EXTERNAL_SERVER_URL_SECRET_ATT = "sec";
    public static final String GCM_EXTERNAL_SERVER_URL_SECRET_VALUE = "fa1c9f79de2cabc59d9bddb9f8d5794d8406702b";
    public static final String GCM_EXTERNAL_SERVER_URL_RESPONSE_ERROR_CODE_KEY = "errorCode";

    public static final String GCM_PREFERENCES_NAME = "application_gcm";
    public static final String GCM_PREFERENCES_REG_ID = "regId";
    public static final String GCM_PREFERENCES_APP_VERSION = "appVersion";
    public static final String GCM_PREFERENCES_NOTIFICATION_DATE = "notificationDate";
    public static final String GCM_PREFERENCES_NOTIFICATION_TYPE = "notificationType";
    public static final String GCM_PREFERENCES_NOTIFICATION_DATA = "notificationData";
    public static final String GCM_PREFERENCES_IS_RATED = "isRated";

    public static final String GCM_NOTIFICATION_RESPONSE_DATE_KEY = "date";
    public static final String GCM_NOTIFICATION_RESPONSE_TYPE_KEY = "type";
    public static final String GCM_NOTIFICATION_RESPONSE_DATA_KEY = "data";
    public static final Integer GCM_MAX_DAYS_BETWEEN_NOTIFICATIONS = 0;

}