package bg.znestorov.sofbus24.virtualboards;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.InputType;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import com.actionbarsherlock.app.SherlockListFragment;

import java.util.ArrayList;

import bg.znestorov.sofbus24.entity.FragmentLifecycle;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.DrawableClickListener;
import bg.znestorov.sofbus24.utils.activity.SearchEditText;

/**
 * Fragment used to show the information in VirtualBoards section
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class VirtualBoardsFragment extends SherlockListFragment implements
        FragmentLifecycle, OnItemClickListener {

    private static final String BUNDLE_VB_SEARCH_TEXT = "VB SEARCH TEXT";
    private static final String BUNDLE_VB_STATIONS_LIST = "VB STATION LIST";
    private static final String BUNDLE_VB_EMPTY_LIST_MSG = "VB EMPTY LIST MESSAGE";
    private final ArrayList<StationEntity> vbList = new ArrayList<StationEntity>();
    private Activity context;
    private GridView gridViewVirtualBoards;
    private View emptyView;
    private TextView emptyTextView;
    private SearchEditText searchEditText;
    private String vbSearchText;
    private String emptyListMsg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LanguageChange.selectLocale(getActivity());

        View myFragmentView = inflater.inflate(
                R.layout.activity_virtual_boards_fragment, container, false);

        // Set the context (activity) associated with this fragment
        context = getSherlockActivity();

        // Actions over the layout fields
        initBundleInfo(savedInstanceState);
        initLayoutFields(myFragmentView);
        actionsOverSearchEditText();
        setAdapter();
        setEmptyListView();

        return myFragmentView;
    }

    @Override
    public void onResumeFragment(Activity context) {
        setAdapterViaSearch();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString(BUNDLE_VB_SEARCH_TEXT, vbSearchText);
        savedInstanceState.putSerializable(BUNDLE_VB_STATIONS_LIST, vbList);
        savedInstanceState.putString(BUNDLE_VB_EMPTY_LIST_MSG, emptyListMsg);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        StationEntity station = (StationEntity) getListAdapter().getItem(
                position);
        onListItemClick(station);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        StationEntity station = (StationEntity) gridViewVirtualBoards
                .getAdapter().getItem(position);
        onListItemClick(station);
    }

    /**
     * Retrieve an information about the selected station
     *
     * @param station selected station
     */
    private void onListItemClick(StationEntity station) {
        RetrieveVirtualBoards retrieveVirtualBoards = new RetrieveVirtualBoards(
                context, this, station, HtmlRequestCodesEnum.SINGLE_RESULT);
        retrieveVirtualBoards.getSumcInformation();
    }

    /**
     * Retrieved the bundle saved information
     *
     * @param savedInstanceState the fragment bundle
     */
    @SuppressWarnings("unchecked")
    private void initBundleInfo(Bundle savedInstanceState) {
        if (savedInstanceState != null
                && savedInstanceState.getSerializable(BUNDLE_VB_STATIONS_LIST) != null) {
            vbSearchText = savedInstanceState.getString(BUNDLE_VB_SEARCH_TEXT);
            vbList.clear();
            vbList.addAll((ArrayList<StationEntity>) savedInstanceState
                    .getSerializable(BUNDLE_VB_STATIONS_LIST));
            emptyListMsg = savedInstanceState
                    .getString(BUNDLE_VB_EMPTY_LIST_MSG);
        } else {
            vbSearchText = "";
            emptyListMsg = "";
        }
    }

    /**
     * Initialize the layout fields
     *
     * @param myFragmentView the layout view of the current fragment
     */
    private void initLayoutFields(View myFragmentView) {
        searchEditText = (SearchEditText) myFragmentView
                .findViewById(R.id.vb_search);
        emptyView = myFragmentView.findViewById(R.id.vb_list_empty_view);
        emptyTextView = (TextView) myFragmentView
                .findViewById(R.id.vb_list_empty_text);

        // Set on click listener over the grid view (if exists)
        gridViewVirtualBoards = (GridView) myFragmentView
                .findViewById(R.id.vb_list_grid_view);
        if (gridViewVirtualBoards != null) {
            gridViewVirtualBoards.setOnItemClickListener(this);
        }

        // In case of screen rotation (recreate screen)
        searchEditText.setText(vbSearchText);
    }

    /**
     * Modify the Search EditText field and activate the listeners
     */
    private void actionsOverSearchEditText() {
        // TODO: Find a way to set an alphanumeric keyboard with numeric as
        // default
        searchEditText.setInputType(InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS
                | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        searchEditText.setFilters(new InputFilter[]{createInputFilter()});

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
                vbSearchText = searchEditText.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }
        });

        // Add the editor action listener
        searchEditText.setOnEditorActionListener(new OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId,
                                          KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    performSearch();

                    return true;
                }

                return false;
            }
        });

        // Add a drawable listeners (search and clear icons)
        searchEditText.setDrawableClickListener(new DrawableClickListener() {
            @Override
            public void onClick(DrawablePosition target) {
                switch (target) {
                    case LEFT:
                        performSearch();

                        break;
                    case RIGHT:
                        searchEditText.setText("");
                        emptyListMsg = null;
                        performSearch();

                        break;
                    default:
                        break;
                }
            }

        });
    }

    /**
     * Set the adapter with the found stations (on the GridView or the ListView)
     */
    private void setAdapter() {
        ArrayAdapter<StationEntity> virtualBoardsAdapter = new VirtualBoardsAdapter(
                context, vbList);
        if (gridViewVirtualBoards == null) {
            setListAdapter(virtualBoardsAdapter);
        } else {
            gridViewVirtualBoards.setAdapter(virtualBoardsAdapter);
        }
    }

    /**
     * Set list adapter and the appropriate text message to it (using a list as
     * a parameter)
     *
     * @param stationsList the stationList that need to be set to the listView
     * @param emptyListMsg the text that will show if the list is empty
     */
    public void setAdapterViaSearch(ArrayList<StationEntity> stationsList,
                                    String emptyListMsg) {
        ActivityUtils.hideKeyboard(context, searchEditText);

        vbList.clear();
        vbList.addAll(stationsList);

        this.emptyListMsg = emptyListMsg;

        setAdapterViaSearch();
    }

    /**
     * Set list adapter and the appropriate text message to it, using the
     * default fragment list (vbList)
     */
    private void setAdapterViaSearch() {
        ArrayAdapter<StationEntity> virtualBoardsAdapter = getAdapter();
        if (virtualBoardsAdapter != null) {
            virtualBoardsAdapter.notifyDataSetChanged();
            setEmptyListView();
        }
    }

    /**
     * Set a message to the empty list according to the search text view:
     * <ul>
     * <li>If contains <b>no</b> text - set the default search message</li>
     * <li>If contains <b>some</b> text - set that there are no results</li>
     * </ul>
     */
    private void setEmptyListView() {
        // Check if the fragment is currently added to its activity
        if (isAdded() && (getAdapter() == null || getAdapter().isEmpty())) {
            if (emptyView != null) {
                emptyView.setVisibility(View.VISIBLE);
            }

            if (emptyListMsg != null && !"".equals(emptyListMsg)) {
                emptyTextView.setText(Html.fromHtml(emptyListMsg));
            } else {
                if (vbSearchText == null || "".equals(vbSearchText)) {
                    emptyTextView.setText(Html
                            .fromHtml(getString(R.string.vb_item_search_list)));
                } else {
                    emptyTextView.setText(Html.fromHtml(String.format(
                            getString(R.string.vb_item_empty_list),
                            vbSearchText)));
                }
            }
        } else {
            if (emptyView != null) {
                emptyView.setVisibility(View.GONE);
            }
        }
    }

    /**
     * Perform a search via the search text from the SearchEditText
     */
    private void performSearch() {
        if (checkSearchText(vbSearchText)) {
            StationEntity station = new StationEntity();
            station.setNumberUnformatted(vbSearchText);

            RetrieveVirtualBoards retrieveVirtualBoards = new RetrieveVirtualBoards(
                    context, this, station,
                    HtmlRequestCodesEnum.MULTIPLE_RESULTS);
            retrieveVirtualBoards.getSumcInformation();
        } else {
            vbSearchText = "";
            if (vbList != null) {
                vbList.clear();
            }

            setAdapterViaSearch();
        }
    }

    /**
     * Check the searched text is containing only digits and if not - if its
     * size is more than 3 characters
     *
     * @param searchText the searched text
     * @return if the searched text fulfill the criteria
     */
    private boolean checkSearchText(String searchText) {
        boolean result = false;

        if (searchText != null && !"".equals(searchText)) {
            String searchTextNoDigits = searchText.replaceAll("\\d+", "");

            if ("".equals(searchTextNoDigits)) {
                result = true;
            } else {
                if (searchText.length() > 2) {
                    result = true;
                }
            }
        }

        return result;
    }

    /**
     * Get the adapter of the list fragment
     *
     * @return the VirtualBoardsAdapter
     */
    private ArrayAdapter<StationEntity> getAdapter() {
        ArrayAdapter<StationEntity> virtualBoardsAdapter;
        if (gridViewVirtualBoards == null) {
            virtualBoardsAdapter = (VirtualBoardsAdapter) getListAdapter();
        } else {
            virtualBoardsAdapter = (VirtualBoardsAdapter) gridViewVirtualBoards
                    .getAdapter();
        }

        return virtualBoardsAdapter;
    }

    /**
     * Create an input filter to limit characters in an EditText (letters,
     * digits, spaces and enter)
     *
     * @return an input filter
     */
    private InputFilter createInputFilter() {
        InputFilter inputFilter = new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end,
                                       Spanned dest, int dstart, int dend) {

                // InputFilters are a little complicated in Android versions
                // that display dictionary suggestions. You sometimes get a
                // SpannableStringBuilder, sometimes a plain String in the
                // source parameter
                if (source instanceof SpannableStringBuilder) {
                    SpannableStringBuilder sourceAsSpannableBuilder = (SpannableStringBuilder) source;
                    for (int i = end - 1; i >= start; i--) {
                        char currentChar = source.charAt(i);

                        // Check if the character has to be removed
                        if (!ActivityUtils.isCharAllowed(currentChar)) {
                            sourceAsSpannableBuilder.delete(i, i + 1);
                        }

                        // Check if a search should be performed
                        if (currentChar == '\n') {
                            performSearch();
                        }
                    }

                    return source;
                } else {
                    StringBuilder filteredStringBuilder = new StringBuilder();
                    for (int i = start; i < end; i++) {
                        char currentChar = source.charAt(i);

                        // Check if the character should be appended
                        if (ActivityUtils.isCharAllowed(currentChar)) {
                            filteredStringBuilder.append(currentChar);
                        }

                        // Check if a search should be performed
                        if (currentChar == '\n') {
                            performSearch();
                        }
                    }

                    return filteredStringBuilder.toString();
                }
            }
        };

        return inputFilter;
    }

}
