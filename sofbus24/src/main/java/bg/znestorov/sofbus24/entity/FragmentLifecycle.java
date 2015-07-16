package bg.znestorov.sofbus24.entity;

import android.app.Activity;

/**
 * This interface is used to update a Fragment. It is called from an Activity,
 * FragmentActivity or AsyncTask and update the Adapter of the ListFragment
 * implementing this interface
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public interface FragmentLifecycle {

    /**
     * Use to update the Fragment when it is invoked (shown to user). It is
     * called from an Activity, FragmentActivity or AsyncTask and update the
     * Adapter of the ListFragment implementing this interface
     *
     * @param context the current Activity context
     */
    public void onResumeFragment(Activity context);

}
