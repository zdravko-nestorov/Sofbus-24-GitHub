package bg.znestorov.sofbus24.metro;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bg.znestorov.sofbus24.entity.ScheduleEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;

/**
 * Metro Schedule Fragment containing all information about the hours of
 * arriving separated in different rows
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class MetroScheduleFragment extends ListFragment {

    private Activity context;
    private MetroScheduleAdapter metroArrayAdapter;
    private ScheduleEntity metroScheduleEntity;

    public static MetroScheduleFragment newInstance(
            ScheduleEntity metroScheduleEntity) {
        MetroScheduleFragment metroScheduleFragment = new MetroScheduleFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE_METRO_SCHEDULE,
                metroScheduleEntity);
        metroScheduleFragment.setArguments(bundle);

        return metroScheduleFragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Set the first visible row of the list if this is the active fragment
        if (metroScheduleEntity.isActive()) {
            int currentScheduleIndex = metroScheduleEntity
                    .getCurrentScheduleIndex();
            if (currentScheduleIndex >= 0 && currentScheduleIndex <= 2) {
                currentScheduleIndex = 0;
            } else {
                currentScheduleIndex = currentScheduleIndex - 2;
            }

            setSelection(currentScheduleIndex);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(
                R.layout.activity_metro_schedule_fragment, container, false);

        // Set the context (activity) associated with this fragment
        context = getActivity();

        // Get the Fragment position and MetroStation object from the Bundle
        metroScheduleEntity = (ScheduleEntity) getArguments().getSerializable(
                Constants.BUNDLE_METRO_SCHEDULE);

        // Create the ListAdapter
        metroArrayAdapter = new MetroScheduleAdapter(context,
                metroScheduleEntity);

        // Set the ListAdapter
        setListAdapter(metroArrayAdapter);

        return myFragmentView;
    }
}
