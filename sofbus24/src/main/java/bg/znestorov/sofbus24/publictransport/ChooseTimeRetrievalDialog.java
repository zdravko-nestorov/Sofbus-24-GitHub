package bg.znestorov.sofbus24.publictransport;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.widget.ArrayAdapter;

import androidx.fragment.app.DialogFragment;

import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.PublicTransportStationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.virtualboards.RetrieveVirtualBoardsApi;

/**
 * Dialog offering a choice about what time to be retrieved - schedule or virtual
 * boards
 * <p>
 * IMPORTANT: Code changes because of the SKGT API (the schedule is now deprecated) -
 * NOT LONGER NEEDED
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@Deprecated
public class ChooseTimeRetrievalDialog extends DialogFragment {

    private static final String BUNDLE_PT_DIRECTION_ENTITY = "PT DIRECTION ENTITY";
    private static final String BUNDLE_PT_STATION_ENTITY = "PT STATION ENTITY";
    private Activity context;
    private DirectionsEntity ptDirections;
    private PublicTransportStationEntity ptStation;

    public static ChooseTimeRetrievalDialog newInstance(
            DirectionsEntity ptDirectionsEntity,
            PublicTransportStationEntity ptStation) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_PT_DIRECTION_ENTITY, ptDirectionsEntity);
        bundle.putSerializable(BUNDLE_PT_STATION_ENTITY, ptStation);

        ChooseTimeRetrievalDialog chooseTimeRetrievalDialog = new ChooseTimeRetrievalDialog();
        chooseTimeRetrievalDialog.setArguments(bundle);

        return chooseTimeRetrievalDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        context = getActivity();

        String title = getString(R.string.pt_time_retrieval_choice);
        String[] choices = new String[]{
                getString(R.string.pt_time_retrieval_schedule),
                getString(R.string.pt_time_retrieval_virtual_boards)};

        ptDirections = (DirectionsEntity) getArguments().getSerializable(
                BUNDLE_PT_DIRECTION_ENTITY);
        ptStation = (PublicTransportStationEntity) getArguments()
                .getSerializable(BUNDLE_PT_STATION_ENTITY);

        ArrayAdapter<String> ptDirectionsAdapter = new ArrayAdapter<String>(
                context, R.layout.activity_public_transport_directions_item,
                choices);

        DialogInterface.OnClickListener onListItemClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialoginterface, int i) {
                switch (i) {
                    case 0:
                        // Getting the schedule
                        ProgressDialog progressDialog = new ProgressDialog(context);
                        progressDialog.setMessage(Html.fromHtml(String.format(
                                getString(R.string.pt_item_loading_schedule),
                                String.format(ptStation.getName() + " (%s)",
                                        ptStation.getNumber()))));
                        RetrievePublicTransportStation retrievePublicTransportStation = new RetrievePublicTransportStation(
                                context, progressDialog, ptStation, ptDirections);
                        retrievePublicTransportStation.execute();
                        break;
                    default:
                        // Getting the real time
                        RetrieveVirtualBoardsApi retrieveVirtualBoards = new RetrieveVirtualBoardsApi(
                                context, this, ptStation, null,
                                HtmlRequestCodesEnum.SINGLE_RESULT);
                        retrieveVirtualBoards.getSumcInformation();
                        break;
                }
            }
        };

        title = String.format(title, ptStation.getName().trim() + " ("
                + ptStation.getNumber() + ")");

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title).setAdapter(ptDirectionsAdapter,
                onListItemClickListener);

        return builder.create();
    }
}