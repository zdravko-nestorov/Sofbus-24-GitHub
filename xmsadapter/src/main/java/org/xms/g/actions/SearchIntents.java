package org.xms.g.actions;

/**
 * Constants for intents to perform in-app search from a Search Action.<br/>
 * Combination of com.huawei.hms.actions.SearchIntents and com.google.android.gms.actions.SearchIntents.<br/>
 * com.huawei.hms.actions.SearchIntents: HMS api does not provide in this Class. More details about the related GMS api can be seenin the reference below.<br/>
 * com.google.android.gms.actions.SearchIntents: Constants for intents to perform in-app search from a Search Action.<br/>
 */
public class SearchIntents extends org.xms.g.utils.XObject {

    /**
     * org.xms.g.actions.SearchIntents.SearchIntents(org.xms.g.utils.XBox) constructor of with ItemListIntents XBox.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     *
     * @param param0 the wrapper of xms instance
     */
    public SearchIntents(org.xms.g.utils.XBox param0) {
        super(param0);
    }

    /**
     * org.xms.g.actions.SearchIntents.getACTION_SEARCH() Intent action for performing an in-app search.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.actions.SearchIntents.ACTION_SEARCH
     * com.google.android.gms.actions.SearchIntents.ACTION_SEARCH: <a href="https://developers.google.com/android/reference/com/google/android/gms/actions/SearchIntents?hl=en#ACTION_SEARCH">https://developers.google.com/android/reference/com/google/android/gms/actions/SearchIntents?hl=en#ACTION_SEARCH</a><br/>
     *
     * @return return object is String
     */
    public static java.lang.String getACTION_SEARCH() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.actions.SearchIntents.ACTION_SEARCH");
            return com.huawei.hms.actions.SearchIntents.ACTION_SEARCH;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.actions.SearchIntents.ACTION_SEARCH");
            return com.google.android.gms.actions.SearchIntents.ACTION_SEARCH;
        }
    }

    /**
     * org.xms.g.actions.SearchIntents.getEXTRA_QUERY() Intent extra specifying the text query to use as a string for ACTION_SEARCH.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     * Below are the references of HMS apis and GMS apis respectively:<br/>
     * com.huawei.hms.actions.SearchIntents.EXTRA_QUERY
     * com.google.android.gms.actions.SearchIntents.EXTRA_QUERY: <a href="https://developers.google.com/android/reference/com/google/android/gms/actions/SearchIntents?hl=en#public-static-final-string-extra_query">https://developers.google.com/android/reference/com/google/android/gms/actions/SearchIntents?hl=en#public-static-final-string-extra_query</a><br/>
     *
     * @return return object is String
     */
    public static java.lang.String getEXTRA_QUERY() {
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.huawei.hms.actions.SearchIntents.EXTRA_QUERY");
            return com.huawei.hms.actions.SearchIntents.EXTRA_QUERY;
        } else {
            org.xms.g.utils.XmsLog.d("XMSRouter", "com.google.android.gms.actions.SearchIntents.EXTRA_QUERY");
            return com.google.android.gms.actions.SearchIntents.EXTRA_QUERY;
        }
    }

    /**
     * org.xms.g.actions.SearchIntents.dynamicCast(java.lang.Object) dynamic cast the input object to SearchIntents.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the param should instanceof java.lang.Object
     * @return SearchIntents object
     */
    public static org.xms.g.actions.SearchIntents dynamicCast(java.lang.Object param0) {
        return ((org.xms.g.actions.SearchIntents) param0);
    }

    /**
     * org.xms.g.actions.SearchIntents.isInstance(java.lang.Object) judge whether the Object is XMS instance or not.<br/>
     * Support running environments including both HMS and GMS which are chosen by users.<br/>
     *
     * @param param0 the input object
     * @return if the Object is XMS instance, otherwise false
     */
    public static boolean isInstance(java.lang.Object param0) {
        if (!(param0 instanceof org.xms.g.utils.XGettable)) {
            return false;
        }
        if (org.xms.g.utils.GlobalEnvSetting.isHms()) {
            return ((org.xms.g.utils.XGettable) param0).getHInstance() instanceof com.huawei.hms.actions.SearchIntents;
        } else {
            return ((org.xms.g.utils.XGettable) param0).getGInstance() instanceof com.google.android.gms.actions.SearchIntents;
        }
    }
}