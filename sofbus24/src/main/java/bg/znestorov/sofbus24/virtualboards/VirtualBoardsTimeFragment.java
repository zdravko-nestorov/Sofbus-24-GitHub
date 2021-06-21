package bg.znestorov.sofbus24.virtualboards;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.ListFragment;

import bg.znestorov.sofbus24.entity.RefreshableListFragment;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;

/**
 * Virtual Boards Time Fragment containing information about the vehicles in
 * real time for a chosen station
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class VirtualBoardsTimeFragment extends ListFragment implements
        RefreshableListFragment {

    private static final String BUNDLE_VB_TIME_EMPTY_TEXT = "BUNDLE VB TIME EMPTY TEXT";
    private Activity context;
    private VirtualBoardsStationEntity vbTimeStation;
    private String vbTimeEmptyText;
    private TextView vbListEmptyTextView;

    public static VirtualBoardsTimeFragment newInstance(
            VirtualBoardsStationEntity vbTimeStation, String vbTimeEmptyText) {
        VirtualBoardsTimeFragment vbTimeFragment = new VirtualBoardsTimeFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE_VIRTUAL_BOARDS_TIME,
                vbTimeStation);
        bundle.putString(Constants.BUNDLE_VIRTUAL_BOARDS_TIME_EMPTY_LIST,
                vbTimeEmptyText);
        vbTimeFragment.setArguments(bundle);

        return vbTimeFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(
                R.layout.activity_virtual_boards_time_fragment, container,
                false);

        // Set the context (activity) associated with this fragment
        context = getActivity();

        // Get the empty list TextView
        vbListEmptyTextView = (TextView) myFragmentView
                .findViewById(R.id.vb_list_empty_text);

        // Get the VirtualBoardsStation object and the empty list text from the
        // Bundle
        vbTimeStation = (VirtualBoardsStationEntity) getArguments()
                .getSerializable(Constants.BUNDLE_VIRTUAL_BOARDS_TIME);

        if (savedInstanceState == null) {
            vbTimeEmptyText = getArguments().getString(
                    Constants.BUNDLE_VIRTUAL_BOARDS_TIME_EMPTY_LIST);
        } else {
            vbTimeEmptyText = savedInstanceState
                    .getString(BUNDLE_VB_TIME_EMPTY_TEXT);
        }

        // Set the ListAdapter
        setListAdapter(vbTimeEmptyText);

        return myFragmentView;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState
                .putString(BUNDLE_VB_TIME_EMPTY_TEXT, vbTimeEmptyText);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        /**
         * Code changes because of the SKGT API (the schedule is now deprecated)
         *
         * The row is added to the ListView of all XML layouts (activity_virtual_boards_time_fragment):
         * android:listSelector="@android:color/transparent"
         * This changes the on-clicked color to same as when it is not clicked and it appears as
         * if it is plain text
         *
         VehicleEntity stationVehicle = (VehicleEntity) getListAdapter()
         .getItem(position);

         // Getting the PublicTransport schedule from the station URL address
         PublicTransportStationEntity ptStationEntity = new PublicTransportStationEntity(
         vbTimeStation, stationVehicle);
         DirectionsEntity directionEntity = new DirectionsEntity(stationVehicle);

         ProgressDialog progressDialog = new ProgressDialog(context);
         progressDialog.setMessage(Html.fromHtml(String.format(
         getString(R.string.pt_item_loading_schedule),
         String.format(vbTimeStation.getName() + " (%s)",
         vbTimeStation.getNumber()))));

         RetrievePublicTransportStation retrievePublicTransportStation = new RetrievePublicTransportStation(
         context, progressDialog, ptStationEntity, directionEntity);
         retrievePublicTransportStation.execute();
         */
    }

    @Override
    public void onFragmentRefresh(Object obj, String vbTimeEmptyText) {
        VirtualBoardsStationEntity newVBTimeStation = (VirtualBoardsStationEntity) obj;
        vbTimeStation.setVirtualBoardsTimeStation(newVBTimeStation);

        setListAdapter(vbTimeEmptyText);
    }

    /**
     * Set list adapter and the appropriate text message to it
     */
    private void setListAdapter(String vbTimeEmptyText) {

        VirtualBoardsTimeAdapter vbTimeAdapter = (VirtualBoardsTimeAdapter) getListAdapter();
        if (vbTimeAdapter == null) {
            vbTimeAdapter = new VirtualBoardsTimeAdapter(context, vbTimeStation);
            setListAdapter(vbTimeAdapter);
        } else {
            vbTimeAdapter.notifyDataSetChanged();

            if (vbTimeStation.getVehiclesList().size() > 0) {
                getListView().setSelectionFromTop(0, 0);
            }
        }

        // Check if the list adapter is empty, so show a text message with the
        // problem
        if (vbTimeAdapter.isEmpty()) {
            vbListEmptyTextView.setText(Html.fromHtml(vbTimeEmptyText));
        }

        this.vbTimeEmptyText = vbTimeEmptyText;
    }
}