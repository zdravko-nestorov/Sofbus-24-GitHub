package bg.znestorov.sofbus24.publictransport;

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
 * Public Transport Schedule Fragment containing all information about the hours
 * of arriving separated in different rows
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class PublicTransportScheduleFragment extends ListFragment {

    private ScheduleEntity ptScheduleEntity;

    public static PublicTransportScheduleFragment newInstance(
            ScheduleEntity ptScheduleEntity) {
        PublicTransportScheduleFragment ptScheduleFragment = new PublicTransportScheduleFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE_PUBLIC_TRANSPORT_SCHEDULE,
                ptScheduleEntity);
        ptScheduleFragment.setArguments(bundle);

        return ptScheduleFragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Set the first visible row of the list if this is the active fragment
        if (ptScheduleEntity.isActive()) {
            int currentScheduleIndex = ptScheduleEntity
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
                R.layout.activity_public_transport_schedule_fragment,
                container, false);

        // Set the context (activity) associated with this fragment
        Activity context = getActivity();

        // Get the Fragment position and MetroStation object from the Bundle
        ptScheduleEntity = (ScheduleEntity) getArguments().getSerializable(
                Constants.BUNDLE_PUBLIC_TRANSPORT_SCHEDULE);

        // Create the ListAdapter
        PublicTransportScheduleAdapter ptArrayAdapter = new PublicTransportScheduleAdapter(context,
                ptScheduleEntity);

        // Set the ListAdapter
        setListAdapter(ptArrayAdapter);

        return myFragmentView;
    }
}
