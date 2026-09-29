package bg.znestorov.sofbus24.utils;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;

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

        String chosenTheme = PreferenceManager.getDefaultSharedPreferences(
                context).getString(Constants.PREFERENCE_KEY_APP_THEME,
                Constants.PREFERENCE_DEFAULT_VALUE_APP_THEME);

        if (Constants.PREFERENCE_DEFAULT_VALUE_APP_THEME.equals(chosenTheme)) {
            return AppThemeEnum.LIGHT;
        } else if (Constants.PREFERENCE_AMOLED_VALUE_APP_THEME.equals(chosenTheme)) {
            return AppThemeEnum.AMOLED;
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
            case AMOLED:
                context.setTheme(R.style.AppThemeAmoled);
                break;
            default:
                context.setTheme(R.style.AppThemeDark);
                break;
        }
    }

    /**
     * Set the AMOLED theme to the home screen select activity, which uses the light one otherwise
     *
     * @param context the Context of the current activity
     */
    public static void selectLauncherTheme(Activity context) {
        if (getAppTheme(context) == AppThemeEnum.AMOLED) {
            context.setTheme(R.style.AppThemeLauncherAmoled);
        }
    }

    /**
     * Get a color from the theme of the current activity
     *
     * @param context   the Context of the current activity
     * @param attribute the theme attribute
     * @return the color
     */
    public static int getColor(Activity context, int attribute) {
        TypedValue value = new TypedValue();
        context.getTheme().resolveAttribute(attribute, value, true);
        return value.data;
    }

    /**
     * Get a resource (such as a drawable) from the theme of the current activity
     *
     * @param context   the Context of the current activity
     * @param attribute the theme attribute
     * @return the resource id
     */
    public static int getResourceId(Activity context, int attribute) {
        TypedValue value = new TypedValue();
        context.getTheme().resolveAttribute(attribute, value, true);
        return value.resourceId;
    }

    /**
     * Get the tint for the icons, which are dark images, so they are visible in the AMOLED theme
     *
     * @param context the Context of the current activity
     * @return the icons tint or null to keep their original colors
     */
    public static ColorStateList getIconTint(Activity context) {
        return getAppTheme(context) == AppThemeEnum.AMOLED
                ? ColorStateList.valueOf(getColor(context, R.attr.appThemeText)) : null;
    }

    /**
     * Tint the action bar icons (see {@link #getIconTint(Activity)})
     *
     * @param context the Context of the current activity
     * @param menu    the inflated menu
     */
    public static void tintMenuIcons(Activity context, Menu menu) {
        ColorStateList iconTint = getIconTint(context);
        if (iconTint == null) {
            return;
        }

        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            Drawable icon = item.getIcon();
            if (icon != null) {
                icon = icon.mutate();
                icon.setTintList(iconTint);
                item.setIcon(icon);
            }
        }
    }
}
