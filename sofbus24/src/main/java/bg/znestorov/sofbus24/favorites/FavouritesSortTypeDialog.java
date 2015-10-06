package bg.znestorov.sofbus24.favorites;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import bg.znestorov.sofbus24.entity.SortTypeEnum;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog used to show a sort type choice (ASC or DESC)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesSortTypeDialog extends DialogFragment {

    private static final String BUNDLE_SORT_TYPE = "SORT TYPE";

    public static FavouritesSortTypeDialog newInstance(SortTypeEnum sortType) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_SORT_TYPE, sortType.toString());

        FavouritesSortTypeDialog favouritesSortTypeDialog = new FavouritesSortTypeDialog();
        favouritesSortTypeDialog.setArguments(bundle);

        return favouritesSortTypeDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final SortTypeEnum sortType = SortTypeEnum.valueOf(getArguments()
                .getString(BUNDLE_SORT_TYPE));
        CharSequence[] items = {getString(R.string.fav_menu_sort_type_asc),
                getString(R.string.fav_menu_sort_type_desc)};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getString(R.string.fav_menu_sort_type_title));
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int itemNumber) {
                ((OnSortTypeChoiceListener) getTargetFragment())
                        .onSortTypeChoose(getSortType(sortType, itemNumber));
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
    private SortTypeEnum getSortType(SortTypeEnum sortType, int itemNumber) {
        SortTypeEnum finalSortType;

        switch (itemNumber) {
            case 0:
                switch (sortType) {
                    case ALPHABETICAL:
                        finalSortType = SortTypeEnum.ALPHABETICAL_ASC;
                        break;
                    case DATE_ADDED:
                        finalSortType = SortTypeEnum.DATE_ADDED_DESC;
                        break;
                    case DATE_LAST_ACCESS:
                        finalSortType = SortTypeEnum.DATE_LAST_ACCESS_DESC;
                        break;
                    case USAGE_COUNT:
                        finalSortType = SortTypeEnum.USAGE_COUNT_DESC;
                        break;
                    default:
                        finalSortType = SortTypeEnum.CUSTOM;
                        break;
                }
                break;
            default:
                switch (sortType) {
                    case ALPHABETICAL:
                        finalSortType = SortTypeEnum.ALPHABETICAL_DESC;
                        break;
                    case DATE_ADDED:
                        finalSortType = SortTypeEnum.DATE_ADDED_ASC;
                        break;
                    case DATE_LAST_ACCESS:
                        finalSortType = SortTypeEnum.DATE_LAST_ACCESS_ASC;
                        break;
                    case USAGE_COUNT:
                        finalSortType = SortTypeEnum.USAGE_COUNT_ASC;
                        break;
                    default:
                        finalSortType = SortTypeEnum.CUSTOM;
                        break;
                }
                break;
        }

        return finalSortType;
    }

    public interface OnSortTypeChoiceListener {
        void onSortTypeChoose(SortTypeEnum sortType);
    }
}