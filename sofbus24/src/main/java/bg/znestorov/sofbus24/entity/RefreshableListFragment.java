package bg.znestorov.sofbus24.entity;

/**
 * This interface is used to update a Fragment. It is called from an Activity,
 * FragmentActivity or AsyncTask and update the Adapter of the ListFragment
 * implementing this interface
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public interface RefreshableListFragment {

    /**
     * Use to update the Fragment when it is invoked (shown to user). It is
     * called from an Activity, FragmentActivity or AsyncTask and update the
     * Adapter of the ListFragment implementing this interface
     *
     * @param obj       a param that indicates the changes in the ListFragment (the
     *                  new list with objects or a parameter the helps to refresh the
     *                  list)
     * @param emptyText the text that will be shown if the list is empty
     */
    void onFragmentRefresh(Object obj, String emptyText);

}
