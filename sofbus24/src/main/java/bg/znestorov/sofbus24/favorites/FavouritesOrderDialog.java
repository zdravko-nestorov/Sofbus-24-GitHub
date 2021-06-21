package bg.znestorov.sofbus24.favorites;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

import bg.znestorov.sofbus24.entity.OrderTypeEnum;
import bg.znestorov.sofbus24.entity.PositionTypeEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog used to show how the favourites will be sorted
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesOrderDialog extends DialogFragment {

    private static final String BUNDLE_STATION = "STATION";
    private static final String BUNDLE_POSITION_TYPE = "POSITION TYPE";

    public static FavouritesOrderDialog newInstance(StationEntity station,
                                                    PositionTypeEnum positionType) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_STATION, station);
        bundle.putString(BUNDLE_POSITION_TYPE, positionType.toString());

        FavouritesOrderDialog favouritesOrderDialog = new FavouritesOrderDialog();
        favouritesOrderDialog.setArguments(bundle);

        return favouritesOrderDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final StationEntity station = (StationEntity) getArguments()
                .getSerializable(BUNDLE_STATION);
        PositionTypeEnum positionType = PositionTypeEnum.valueOf(getArguments()
                .getString(BUNDLE_POSITION_TYPE));
        final CharSequence[] items = getListItems(positionType);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(getString(R.string.fav_menu_sort_order_title));
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int itemNumber) {
                String rowText = items[itemNumber].toString();
                ((OnOrderChoiceListener) getTargetFragment()).onOrderChoose(
                        station, getOrderType(rowText));
            }
        });

        return builder.create();
    }

    private CharSequence[] getListItems(PositionTypeEnum positionType) {
        CharSequence[] items;

        switch (positionType) {
            case FIRST:
                items = new CharSequence[]{
                        getString(R.string.fav_menu_sort_order_down),
                        getString(R.string.fav_menu_sort_order_last)};
                break;
            case LAST:
                items = new CharSequence[]{
                        getString(R.string.fav_menu_sort_order_up),
                        getString(R.string.fav_menu_sort_order_first)};
                break;
            default:
                items = new CharSequence[]{
                        getString(R.string.fav_menu_sort_order_up),
                        getString(R.string.fav_menu_sort_order_down),
                        getString(R.string.fav_menu_sort_order_first),
                        getString(R.string.fav_menu_sort_order_last)};
                break;
        }

        return items;
    }

    /**
     * Get the order type for the selected row (UP or DOWN)
     *
     * @param rowText text of the selected row
     */
    private OrderTypeEnum getOrderType(String rowText) {
        OrderTypeEnum orderType;

        if (rowText.equals(getString(R.string.fav_menu_sort_order_first))) {
            orderType = OrderTypeEnum.FIRST;
        } else if (rowText.equals(getString(R.string.fav_menu_sort_order_up))) {
            orderType = OrderTypeEnum.UP;
        } else if (rowText.equals(getString(R.string.fav_menu_sort_order_down))) {
            orderType = OrderTypeEnum.DOWN;
        } else {
            orderType = OrderTypeEnum.LAST;
        }

        return orderType;
    }

    public interface OnOrderChoiceListener {
        void onOrderChoose(StationEntity station,
                           OrderTypeEnum orderType);
    }
}