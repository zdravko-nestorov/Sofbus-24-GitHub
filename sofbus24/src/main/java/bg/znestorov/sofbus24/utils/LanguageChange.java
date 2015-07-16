package bg.znestorov.sofbus24.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.preference.PreferenceManager;

import java.util.Locale;

/**
 * Class used for defining the locale that need to be set, so cover the selected
 * language by the user
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class LanguageChange {

    private LanguageChange() {
    }

    /**
     * Getting the selected language of the user (from settings)
     *
     * @param context Context of the current activity
     * @return the selected user locale
     */
    public static String getUserLocale(Context context) {
        // Get SharedPreferences from option menu
        final SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(context);

        // Get "language" value from the Shared Preferences
        final String language = sharedPreferences.getString(
                Constants.PREFERENCE_KEY_APP_LANGUAGE,
                Constants.PREFERENCE_DEFAULT_VALUE_APP_LANGUAGE);

        return language;
    }

    /**
     * Set the selected locale as a default for the application
     *
     * @param context Context of the current activity
     */
    public static void selectLocale(Activity context) {
        Locale locale = new Locale(getUserLocale(context));
        Locale.setDefault(locale);

        Configuration config = new Configuration();
        config.locale = locale;

        context.getBaseContext()
                .getResources()
                .updateConfiguration(
                        config,
                        context.getBaseContext().getResources()
                                .getDisplayMetrics());
    }
}