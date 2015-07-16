package bg.znestorov.sofbus24.utils.activity;

/**
 * Interface used to set click listener to a EditText, so interact with search
 * and clear buttons
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public interface DrawableClickListener {

    public void onClick(DrawablePosition target);

    ;

    public static enum DrawablePosition {
        TOP, BOTTOM, LEFT, RIGHT
    }
}