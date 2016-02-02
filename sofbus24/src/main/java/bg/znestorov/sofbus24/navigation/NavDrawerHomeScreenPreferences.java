package bg.znestorov.sofbus24.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class NavDrawerHomeScreenPreferences {

    private static final String HOME_SCREEN_PREFERENCES_NAME = "home_screen";
    private static final String HOME_SCREEN_PREFERENCES_USER_CHOICE = "user_choice";

    public static Integer getUserHomeScreenChoice(Activity context) {
        SharedPreferences homeScreenPreferences = context.getSharedPreferences(
                HOME_SCREEN_PREFERENCES_NAME, Context.MODE_PRIVATE);
        Integer userChoice = homeScreenPreferences.getInt(
                HOME_SCREEN_PREFERENCES_USER_CHOICE, -1);

        return userChoice;
    }

    public static boolean isUserHomeScreenChosen(Activity context) {
        Integer userChoice = getUserHomeScreenChoice(context);

        return userChoice != null && userChoice != -1;
    }

    public static void setUserChoice(Activity context, Integer userChoice) {
        SharedPreferences homeScreenPreferences = context.getSharedPreferences(
                HOME_SCREEN_PREFERENCES_NAME, Context.MODE_PRIVATE);

        Editor editor = homeScreenPreferences.edit();
        editor.putInt(HOME_SCREEN_PREFERENCES_USER_CHOICE, userChoice);
        editor.apply();
    }

}