package bg.znestorov.sofbus24.favorites;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.Spanned;

import bg.znestorov.sofbus24.main.R;

/**
 * Dialog alerting the user that all favorite stations will be deleted
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesDeleteAllDialog extends DialogFragment {

    public static FavouritesDeleteAllDialog newInstance() {
        return new FavouritesDeleteAllDialog();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Activity context = getActivity();
        int icon = R.drawable.ic_menu_delete;
        String title = getString(R.string.app_dialog_title_important);
        Spanned message = Html
                .fromHtml(getString(R.string.fav_menu_remove_all_confirmation));
        String negativeBtn = getString(R.string.app_button_no);
        String positiveBtn = getString(R.string.app_button_yes);

        OnClickListener positiveOnClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                ((OnDeleteAllFavouritesListener) getTargetFragment())
                        .onDeleteAllFavouritesClicked();
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setIcon(icon).setTitle(title).setMessage(message)
                .setNegativeButton(negativeBtn, null)
                .setPositiveButton(positiveBtn, positiveOnClickListener);

        return builder.create();
    }

    public interface OnDeleteAllFavouritesListener {
        void onDeleteAllFavouritesClicked();
    }
}