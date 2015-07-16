package bg.znestorov.sofbus24.main;

import android.os.Bundle;
import android.view.MotionEvent;

import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

public class RouteChangesDialog extends RouteChanges {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityUtils.showAsPopup(this, false);
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        // If we've received a touch notification that the user has touched
        // outside the app, finish the activity.
        if (event.getAction() == MotionEvent.ACTION_DOWN
                && ActivityUtils.isOutOfBounds(this, event)) {
            finish();
            return true;
        }

        // Delegate everything else to Activity.
        return super.onTouchEvent(event);
    }

}