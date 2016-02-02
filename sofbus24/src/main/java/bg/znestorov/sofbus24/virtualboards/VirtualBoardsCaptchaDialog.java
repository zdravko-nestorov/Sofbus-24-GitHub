package bg.znestorov.sofbus24.virtualboards;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.InputType;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.WindowManager.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.SerialBitmap;

/**
 * Dialog alerting the user about the captcha image
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class VirtualBoardsCaptchaDialog extends DialogFragment {

    private static final String BUNDLE_CAPTCHA_ID = "CAPTCHA ID";
    private static final String BUNDLE_CAPTCHA_IMAGE = "CAPTCHA IMAGE";
    private static final String BUNDLE_INPUT_TEXT = "INPUT TEXT";
    private Activity context;
    private String captchaId;
    private EditText input;

    public static VirtualBoardsCaptchaDialog newInstance(String captchaId,
                                                         Bitmap captchaImage) {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_CAPTCHA_ID, captchaId);
        bundle.putSerializable(BUNDLE_CAPTCHA_IMAGE, new SerialBitmap(
                captchaImage));

        VirtualBoardsCaptchaDialog vbCaptchaDialog = new VirtualBoardsCaptchaDialog();
        vbCaptchaDialog.setArguments(bundle);

        return vbCaptchaDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        context = getActivity();
        captchaId = getArguments().getString(BUNDLE_CAPTCHA_ID);
        Bitmap captchaImage = ((SerialBitmap) getArguments().getSerializable(
                BUNDLE_CAPTCHA_IMAGE)).getBitmap();

        String inputText;
        if (savedInstanceState != null) {
            inputText = savedInstanceState.getString(BUNDLE_INPUT_TEXT);
        } else {
            inputText = "";
        }

        Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(R.string.vb_time_sumc_captcha);
        builder.setMessage(R.string.vb_time_sumc_captcha_msg);

        LinearLayout panel = new LinearLayout(context);
        panel.setOrientation(LinearLayout.VERTICAL);

        ImageView image = new ImageView(context);
        image.setId(R.id.captchaImageViewId);
        image.setImageBitmap(captchaImage);

        // Add the image to the view and fix its size
        panel.addView(image, LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT);
        fixImageSize(image);

        // Center the image
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) image
                .getLayoutParams();
        layoutParams.gravity = Gravity.CENTER;
        image.setLayoutParams(layoutParams);

        input = new EditText(context);
        input.setId(R.id.captchaEditTextId);
        input.setSingleLine();
        input.setInputType(InputType.TYPE_CLASS_TEXT
                | InputType.TYPE_TEXT_VARIATION_URI
                | InputType.TYPE_TEXT_VARIATION_PHONETIC);
        input.setText(inputText);
        input.setSelection(inputText.length());

        ScrollView view = new ScrollView(context);
        panel.addView(input);
        view.addView(panel);

        builder.setCancelable(true)
                .setPositiveButton(R.string.app_button_ok,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                String captchaText = input.getText().toString();

                                ((OnCaptchaActionsListener) getTargetFragment())
                                        .onCaptchaCompleted(captchaId,
                                                captchaText);
                            }
                        }).setView(view);

        builder.setOnCancelListener(new OnCancelListener() {
            public void onCancel(DialogInterface arg0) {
                ((OnCaptchaActionsListener) getTargetFragment())
                        .onCaptchaCancelled();
            }
        });

        return builder.create();
    }

    /**
     * Fix the size of the image to match the correct dimensions
     *
     * @param image the image view
     */
    private void fixImageSize(ImageView image) {
        try {
            Display display = context.getWindowManager().getDefaultDisplay();
            DisplayMetrics outMetrics = new DisplayMetrics();
            display.getMetrics(outMetrics);
            float scWidth = outMetrics.widthPixels * 0.6f;
            image.getLayoutParams().width = (int) scWidth;

            if (Utils.isInLandscapeMode(context)) {
                image.getLayoutParams().height = (int) (scWidth / 6f);
            } else {
                image.getLayoutParams().height = (int) (scWidth / 3.5f);
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDialog().getWindow().setSoftInputMode(
                LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString(BUNDLE_INPUT_TEXT, input != null ? input
                .getText().toString() : "");
    }

    public interface OnCaptchaActionsListener {

        void onCaptchaCompleted(String captchaId, String captchaText);

        void onCaptchaCancelled();
    }
}