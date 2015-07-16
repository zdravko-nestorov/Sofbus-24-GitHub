package bg.znestorov.sofbus24.utils;

import android.app.Activity;
import android.preference.PreferenceManager;

import bg.znestorov.sofbus24.entity.AppThemeEnum;
import bg.znestorov.sofbus24.main.R;

public class ThemeChange {

    /**
     * Check if the selected application theme is LIGHT one
     *
     * @param context the Context of the current activity
     * @return if the theme is light
     */
    public static boolean isLightTheme(Activity context) {
        return getAppTheme(context) == AppThemeEnum.LIGHT;
    }

    /**
     * Check the type of the selected theme for the application
     *
     * @param context the Context of the current activity
     * @return the type of the application theme
     */
    public static AppThemeEnum getAppTheme(Activity context) {

        String choosenTheme = PreferenceManager.getDefaultSharedPreferences(
                context).getString(Constants.PREFERENCE_KEY_APP_THEME,
                Constants.PREFERENCE_DEFAULT_VALUE_APP_THEME);

        if (Constants.PREFERENCE_DEFAULT_VALUE_APP_THEME.equals(choosenTheme)) {
            return AppThemeEnum.LIGHT;
        } else {
            return AppThemeEnum.DARK;
        }
    }

    /**
     * Set the selected theme as a default for the application
     *
     * @param context the Context of the current activity
     */
    public static void selectTheme(Activity context) {

        AppThemeEnum appTheme = getAppTheme(context);
        switch (appTheme) {
            case LIGHT:
                context.setTheme(R.style.AppThemeLight);
                break;
            default:
                context.setTheme(R.style.AppThemeDark);
                break;
        }
    }
}
