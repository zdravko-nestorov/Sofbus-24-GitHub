package bg.znestorov.sofbus24.favorites;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;

import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog alerting the user that the station will be removed from Favorites
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesRemoveDialog extends DialogFragment {

    private static final String BUNDLE_STATION = "STATION";

    private StationEntity station;

    public static FavouritesRemoveDialog newInstance(StationEntity station) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_STATION, station);

        FavouritesRemoveDialog favouritesRenameDialog = new FavouritesRemoveDialog();
        favouritesRenameDialog.setArguments(bundle);

        return favouritesRenameDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Activity context = getActivity();
        station = (StationEntity) getArguments()
                .getSerializable(BUNDLE_STATION);

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.fav_item_remove_title);
        builder.setIcon(R.drawable.ic_menu_delete);
        builder.setMessage(Html.fromHtml(String.format(
                context.getString(R.string.fav_item_remove_confirmation),
                station.getName(), station.getNumber())));

        builder.setPositiveButton(context.getString(R.string.app_button_yes),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        ((OnRemoveFavouritesListener) getTargetFragment())
                                .onRemoveFavouritesClicked(station);
                    }
                });

        builder.setNegativeButton(context.getString(R.string.app_button_no),
                null);

        return builder.create();
    }

    public interface OnRemoveFavouritesListener {
        void onRemoveFavouritesClicked(StationEntity station);
    }

}