package bg.znestorov.sofbus24.favorites;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import bg.znestorov.sofbus24.entity.SortTypeEnum;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog used to show a sort type choice
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesSortDialog extends DialogFragment {

    public static FavouritesSortDialog newInstance() {
        return new FavouritesSortDialog();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        CharSequence[] items = {getString(R.string.fav_menu_sort_name),
                getString(R.string.fav_menu_sort_date_added),
                getString(R.string.fav_menu_sort_date_last_access),
                getString(R.string.fav_menu_sort_usage_count),
                getString(R.string.fav_menu_sort_custom)};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getString(R.string.fav_menu_sort_title));
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int itemNumber) {
                ((OnSortChoiceListener) getTargetFragment())
                        .onSortChoose(getSortType(itemNumber));
            }
        });

        return builder.create();
    }

    /**
     * Get the sort type for the selected row
     *
     * @param itemNumber number of the selected row
     * @return the row type for the selected row
     */
    private SortTypeEnum getSortType(int itemNumber) {
        SortTypeEnum sortType;
        switch (itemNumber) {
            case 0:
                sortType = SortTypeEnum.ALPHABETICAL;
                break;
            case 1:
                sortType = SortTypeEnum.DATE_ADDED;
                break;
            case 2:
                sortType = SortTypeEnum.DATE_LAST_ACCESS;
                break;
            case 3:
                sortType = SortTypeEnum.USAGE_COUNT;
                break;
            default:
                sortType = SortTypeEnum.CUSTOM;
                break;
        }

        return sortType;
    }

    public interface OnSortChoiceListener {
        void onSortChoose(SortTypeEnum sortType);
    }
}