package bg.znestorov.sofbus24.utils.activity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextViewWithImages extends TextView {

    // Image source template
    public static final String IMAGE_SOURCE_TEMPLATE = " [img src=%s alt=%s/]";

    // Regex pattern that looks for embedded images of the format: [img src=imageName/]
    public static final String PATTERN = "\\Q[img src=\\E([a-zA-Z0-9_]+?)\\Q alt=\\E([a-zA-Z0-9_]+?)\\Q/]\\E";
    private static final String DRAWABLE = "drawable";
    private static final String STRING = "string";

    public TextViewWithImages(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public TextViewWithImages(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TextViewWithImages(Context context) {
        super(context);
    }

    /**
     * Create the {@link Spannable} text interface with the provided text and images attached.
     *
     * @param context the Android context
     * @param text    the provided text to be shown to the user
     * @param height  the desired height of the image icon in pixels. Use the lineHeight
     *                of the TextView to make the image inline with the surrounding text
     * @param colour  the colour (careful: NOT a resource Id) to apply to the image
     * @return the {@link Spannable} text interface with the provided text and images attached
     */
    private static Spannable getTextWithImages(Context context, CharSequence text, int height, int colour) {
        final Spannable spannable = Spannable.Factory.getInstance().newSpannable(text);
        addImages(context, spannable, height, colour);
        return spannable;
    }

    /**
     * Add images to the {@link Spannable} text interface.
     *
     * @param context   the Android context
     * @param spannable the text interface to which markup objects can be attached and detached
     * @param height    the desired height of the image icon in pixels. Use the lineHeight
     *                  of the TextView to make the image inline with the surrounding text
     * @param colour    the colour (careful: NOT a resource Id) to apply to the image
     * @return if the images are successfully added
     */
    private static boolean addImages(Context context, Spannable spannable, int height, int colour) {
        final Pattern refImg = Pattern.compile(PATTERN);
        boolean hasChanges = false;

        final Matcher matcher = refImg.matcher(spannable);
        while (matcher.find()) {
            boolean set = true;
            for (ImageSpan span : spannable.getSpans(matcher.start(), matcher.end(), ImageSpan.class)) {
                if (spannable.getSpanStart(span) >= matcher.start()
                        && spannable.getSpanEnd(span) <= matcher.end()) {
                    spannable.removeSpan(span);
                } else {
                    set = false;
                    break;
                }
            }
            final String resName = spannable.subSequence(matcher.start(1), matcher.end(1)).toString().trim();
            final String resDescription = spannable.subSequence(matcher.start(2), matcher.end(2)).toString().trim();
            final int id = context.getResources().getIdentifier(resName, DRAWABLE, context.getPackageName());
            final int descriptionId = context.getResources().getIdentifier(resDescription, STRING, context.getPackageName());
            if (set) {
                hasChanges = true;
                ImageSpan imageSpan = makeImageSpan(context, id, height, colour);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    imageSpan.setContentDescription(context.getResources().getString(descriptionId));
                }
                spannable.setSpan(imageSpan,
                        matcher.start(),
                        matcher.end(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                );
            }
        }
        return hasChanges;
    }

    /**
     * Create an ImageSpan for the given icon drawable. This also sets the image size and colour.
     * Works best with a white, square icon because of the colouring and resizing.
     *
     * @param context            the Android context
     * @param drawableResourceId a drawable resourceId
     * @param height             the desired height of the image icon in pixels. Use the lineHeight
     *                           of the TextView to make the image inline with the surrounding text
     * @param colour             the colour (careful: NOT a resource Id) to apply to the image
     * @return an {@link ImageSpan}, aligned with the bottom of the text
     */
    private static ImageSpan makeImageSpan(Context context, int drawableResourceId, int height, int colour) {
        Drawable drawable = context.getResources().getDrawable(drawableResourceId);
        drawable.mutate();
        drawable.setBounds(0, 0, getImageWidth(drawable, height), height);
        return new ImageSpan(drawable, ImageSpan.ALIGN_BOTTOM);
    }

    /**
     * Get the current drawable resource width, based on the desired height, respecting the ratio.
     *
     * @param drawable drawable resources
     * @param height   the desired height of the image icon in pixels. Use the lineHeight
     *                 of the TextView to make the image inline with the surrounding text
     * @return the current drawable resource width
     */
    private static int getImageWidth(Drawable drawable, int height) {
        return (int) (height * (double) drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight());
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        final Spannable spannable = getTextWithImages(getContext(), text, getLineHeight(), getCurrentTextColor());
        super.setText(spannable, BufferType.SPANNABLE);
    }
}