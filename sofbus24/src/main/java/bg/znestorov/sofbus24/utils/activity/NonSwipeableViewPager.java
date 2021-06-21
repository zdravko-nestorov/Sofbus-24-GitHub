package bg.znestorov.sofbus24.utils.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

/**
 * Implementation of the ViewPager with stopped swiping
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class NonSwipeableViewPager extends ViewPager {

    public NonSwipeableViewPager(Context context) {
        super(context);
    }

    public NonSwipeableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        // Never allow swiping to switch between pages
        return false;
    }

    @Override
    @SuppressLint("ClickableViewAccessibility")
    public boolean onTouchEvent(MotionEvent event) {
        // Never allow swiping to switch between pages
        return false;
    }
}