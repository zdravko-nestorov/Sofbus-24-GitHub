package bg.znestorov.sofbus24.publictransport;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import bg.znestorov.sofbus24.entity.DirectionsEntity;
import bg.znestorov.sofbus24.entity.PublicTransportStationEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.DrawableClickListener;
import bg.znestorov.sofbus24.utils.activity.SearchEditText;

/**
 * Public Transport Fragment containing information about the stations
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class PublicTransportFragment extends ListFragment {

    private static final String BUNDLE_STATION_SEARCH_TEXT = "STATION SEARCH TEXT";
    private Activity context;
    private DirectionsEntity ptDirectionsEntity;
    private PublicTransportAdapter ptAdapter;
    private String stationSearchText;

    public static PublicTransportFragment newInstance(
            DirectionsEntity ptDirectionsEntity) {
        PublicTransportFragment publicTransportFragment = new PublicTransportFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BUNDLE_PUBLIC_TRANSPORT_SCHEDULE,
                ptDirectionsEntity);
        publicTransportFragment.setArguments(bundle);

        return publicTransportFragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(
                R.layout.activity_public_transport_fragment, container, false);

        // Set the context (activity) associated with this fragment
        context = getActivity();

        // Get the Fragment position and MetroStation object from the Bundle
        ptDirectionsEntity = (DirectionsEntity) getArguments().getSerializable(
                Constants.BUNDLE_PUBLIC_TRANSPORT_SCHEDULE);

        // Get the stationSearchText from the Bundle (savedInstanceState)
        if (savedInstanceState != null) {
            stationSearchText = savedInstanceState
                    .getString(BUNDLE_STATION_SEARCH_TEXT);
        } else {
            stationSearchText = "";
        }

        // Find all of TextView and SearchEditText tabs in the layout
        SearchEditText searchEditText = (SearchEditText) myFragmentView
                .findViewById(R.id.pt_search);
        TextView emptyList = (TextView) myFragmentView
                .findViewById(R.id.pt_list_empty_text);
        actionsOverSearchEditText(searchEditText, emptyList);

        // Create the ListAdapter
        int activeDirection = ptDirectionsEntity.getActiveDirection();
        String directionName = ptDirectionsEntity.getDirectionsNames().get(
                activeDirection);
        ArrayList<StationEntity> directionList = ptDirectionsEntity
                .getDirectionsList().get(activeDirection);
        ptAdapter = new PublicTransportAdapter(context, emptyList,
                directionName, directionList);

        // Set the ListAdapter
        setListAdapter(ptAdapter);

        return myFragmentView;
    }

    @Override
    public void onResume() {
        super.onResume();

        if (ptAdapter != null) {
            ptAdapter.getFilter().filter(stationSearchText);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString(BUNDLE_STATION_SEARCH_TEXT,
                stationSearchText);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        PublicTransportStationEntity ptStation;
        Object itemObject = getListAdapter().getItem(position);

        // Check the type of the station (in case of local cache, the station si
        // standard StationEntity)
        if (itemObject instanceof PublicTransportStationEntity) {
            ptStation = (PublicTransportStationEntity) getListAdapter()
                    .getItem(position);
        } else {
            ptStation = new PublicTransportStationEntity(
                    (StationEntity) getListAdapter().getItem(position));
        }

        int activeDirection = ptDirectionsEntity.getActiveDirection();
        ptStation.setDirection(ptDirectionsEntity.getDirectionsNames().get(
                activeDirection));

        // Getting the PublicTransport schedule from the station URL address
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(Html.fromHtml(String.format(
                getString(R.string.pt_item_loading_schedule),
                String.format(ptStation.getName() + " (%s)",
                        ptStation.getNumber()))));
        RetrievePublicTransportStation retrievePublicTransportStation = new RetrievePublicTransportStation(
                context, progressDialog, ptStation, ptDirectionsEntity);
        retrievePublicTransportStation.execute();
    }

    /**
     * Modify the Search EditText field and activate the listeners
     *
     * @param searchEditText the search EditText
     */
    private void actionsOverSearchEditText(final SearchEditText searchEditText,
                                           final TextView emptyList) {
        // TODO: Find a way to set an alphanumeric keyboard with numeric as
        // default
        searchEditText.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        searchEditText.setFilters(new InputFilter[]{ActivityUtils
                .createInputFilter()});
        searchEditText.setText(stationSearchText);

        // Add on focus listener
        searchEditText.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    ActivityUtils.hideKeyboard(context, searchEditText);
                }
            }
        });

        // Add on text changes listener
        searchEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {
                stationSearchText = searchEditText.getText().toString();
                ptAdapter.getFilter().filter(stationSearchText);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
            }
        });

        // Add a drawable listeners (search and clear icons)
        searchEditText.setDrawableClickListener(new DrawableClickListener() {
            @Override
            public void onClick(DrawablePosition target) {
                switch (target) {
                    case LEFT:
                        searchEditText.requestFocus();
                        searchEditText.setSelection(searchEditText.getText()
                                .length());
                        ActivityUtils.showKeyboard(context, searchEditText);
                        break;
                    case RIGHT:
                        searchEditText.setText("");
                        break;
                    default:
                        break;
                }
            }
        });
    }

}
