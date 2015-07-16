package bg.znestorov.sofbus24.favorites;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Dialog used to show information about the favourite item
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesInfoDialog extends DialogFragment {

    private static final String BUNDLE_STATION = "STATION";
    private Activity context;
    private ListView favouritesInfoListView;
    private FavouritesInfoDialogAdapter favouritesInfoDialogAdapter;

    public static FavouritesInfoDialog newInstance(StationEntity station) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(BUNDLE_STATION, station);

        FavouritesInfoDialog favouritesInfoDialog = new FavouritesInfoDialog();
        favouritesInfoDialog.setArguments(bundle);

        return favouritesInfoDialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        context = getActivity();

        StationEntity station = (StationEntity) getArguments().getSerializable(
                BUNDLE_STATION);
        String realStationName = getRealStationName(station);

        return createDirectoryChooserDialog(station, realStationName);
    }

    /**
     * Get the real station name (retrieved from Stations DB)
     *
     * @param station the selected station
     * @return the real station name
     */
    private String getRealStationName(StationEntity station) {
        String realStationName;

        StationsDataSource stationsDatasource = new StationsDataSource(context);
        stationsDatasource.open();
        realStationName = stationsDatasource.getStation(station).getName();
        stationsDatasource.close();

        return realStationName;
    }

    /**
     * Create an AlertBuilder with all information for the current favourites
     * station
     *
     * @param station         the selected favourites station
     * @param realStationName the real station name
     * @return the created AlertDialog
     */
    @SuppressLint("InflateParams")
    private AlertDialog createDirectoryChooserDialog(StationEntity station,
                                                     String realStationName) {
        View view = context.getLayoutInflater().inflate(
                R.layout.activity_favourites_info_fragment, null);

        // Create the dialog builder
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
        ActivityUtils.setInverseBackgroundForced(context, dialogBuilder);
        dialogBuilder.setView(view);
        dialogBuilder.setTitle(context
                .getString(R.string.app_dialog_title_info));
        dialogBuilder.setPositiveButton(
                context.getString(R.string.app_button_ok), null);

        // Create the favourites info list
        ArrayList<String> favouritesInfoList = new ArrayList<String>();
        favouritesInfoList.add(realStationName);
        favouritesInfoList.add(station.getName());
        favouritesInfoList.add(station.getDateAdded());
        favouritesInfoList.add(station.getDateLastAccess());
        favouritesInfoList.add(station.getUsageCount() + "");
        favouritesInfoList.add(station.getPosition() + "");

        // Asign the favourites info list to the ListView
        favouritesInfoListView = (ListView) view
                .findViewById(R.id.favourites_info_list);
        favouritesInfoDialogAdapter = new FavouritesInfoDialogAdapter(context,
                favouritesInfoList);
        favouritesInfoListView.setAdapter(favouritesInfoDialogAdapter);

        return dialogBuilder.create();
    }
}