package bg.znestorov.sofbus24.favorites;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;

import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Dialog giving an option to the user to rename a favorite station
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesRenameDialog extends DialogFragment {

    private static final String BUNDLE_STATION = "STATION";
    private static final String BUNDLE_INPUT_TEXT = "INPUT TEXT";
    private StationEntity station;
    private EditText input;
    private String inputText;

    public static FavouritesRenameDialog newInstance(StationEntity station) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_STATION, station);

        FavouritesRenameDialog favouritesRenameDialog = new FavouritesRenameDialog();
        favouritesRenameDialog.setArguments(bundle);

        return favouritesRenameDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Activity context = getActivity();
        station = (StationEntity) getArguments()
                .getSerializable(BUNDLE_STATION);

        if (savedInstanceState != null) {
            inputText = savedInstanceState.getString(BUNDLE_INPUT_TEXT);
        } else {
            inputText = station.getName();
            inputText = inputText.trim();
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.fav_item_rename_title);
        builder.setIcon(R.drawable.ic_menu_edit);
        builder.setMessage(Html.fromHtml(String.format(
                context.getString(R.string.fav_item_rename_msg),
                station.getName(), station.getNumber())));

        // Set an EditText view to get user input
        input = new EditText(context);
        input.setHint(context.getString(R.string.fav_item_rename_hint));
        input.setMaxLines(1);
        input.setText(inputText);
        input.setSelection(inputText.length());
        builder.setView(input);

        builder.setPositiveButton(context.getString(R.string.app_button_ok),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        ((OnRenameFavouritesListener) getTargetFragment())
                                .onRenameFavouritesClicked(input.getText()
                                        .toString(), station);
                    }
                });

        builder.setNegativeButton(
                context.getString(R.string.app_button_cancel), null);

        return builder.create();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDialog().getWindow().setSoftInputMode(
                LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onStart() {
        super.onStart();

        final AlertDialog dialog = (AlertDialog) getDialog();
        if (dialog != null) {
            final Button positiveBtn = dialog.getButton(Dialog.BUTTON_POSITIVE);

            if ("".equals(inputText)) {
                positiveBtn.setEnabled(false);
            } else {
                positiveBtn.setEnabled(true);
            }

            // Add a click listener when ENTER key is pressed
            input.setOnKeyListener(new OnKeyListener() {
                @Override
                public boolean onKey(View v, int keyCode, KeyEvent event) {
                    if (event.getAction() == KeyEvent.ACTION_DOWN
                            && keyCode == KeyEvent.KEYCODE_ENTER) {
                        String editTextInput = input.getText().toString();

                        if (editTextInput != null && !"".equals(editTextInput)) {
                            ((OnRenameFavouritesListener) getTargetFragment())
                                    .onRenameFavouritesClicked(input.getText()
                                            .toString(), station);
                            dismiss();
                        }

                        return true;
                    }

                    return false;
                }
            });

            // Add on change text listener on the input field
            input.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable s) {
                }

                public void beforeTextChanged(CharSequence s, int start,
                                              int count, int after) {
                }

                public void onTextChanged(CharSequence s, int start,
                                          int before, int count) {
                    String inputText = input.getText().toString();

                    if (inputText.length() == 0) {
                        positiveBtn.setEnabled(false);
                    } else {
                        positiveBtn.setEnabled(true);
                    }
                }
            });
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString(BUNDLE_INPUT_TEXT, input != null ? input
                .getText().toString() : "");
    }

    public interface OnRenameFavouritesListener {
        void onRenameFavouritesClicked(String stationName,
                                       StationEntity station);
    }
}