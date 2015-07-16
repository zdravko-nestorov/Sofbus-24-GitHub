package bg.znestorov.sofbus24.favorites;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

import bg.znestorov.sofbus24.entity.SortTypeEnum;
import bg.znestorov.sofbus24.utils.Constants;

/**
 * Static class used to interact with the Favourites preferences
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesPreferences {

    /**
     * Get the favourites sort type, defined by the user
     *
     * @param context the current Activity context
     * @return the favourites sort type
     */
    public static SortTypeEnum getFavouritesSortType(Activity context) {
        SortTypeEnum favouritesSortType;

        SharedPreferences favouritesPreferences = context.getSharedPreferences(
                Constants.FAVORUITES_ORDER_PREFERENCES_NAME,
                Context.MODE_PRIVATE);
        String sortType = favouritesPreferences.getString(
                Constants.FAVOURITES_ORDER_PREFERENCES_TYPE, null);
        try {
            favouritesSortType = SortTypeEnum.valueOf(sortType);
        } catch (Exception e) {
            favouritesSortType = SortTypeEnum.CUSTOM;
        }

        return favouritesSortType;
    }

    /**
     * Change the favourites sort type in the SharedPreferences file
     *
     * @param context  the current Activity context
     * @param sortType the favourites sort type
     */
    public static void setFavouritesSortType(Activity context,
                                             SortTypeEnum sortType) {
        SharedPreferences favouritesPreferences = context.getSharedPreferences(
                Constants.FAVORUITES_ORDER_PREFERENCES_NAME,
                Context.MODE_PRIVATE);

        Editor editor = favouritesPreferences.edit();
        editor.putString(Constants.FAVOURITES_ORDER_PREFERENCES_TYPE,
                sortType.toString());
        editor.commit();
    }
}