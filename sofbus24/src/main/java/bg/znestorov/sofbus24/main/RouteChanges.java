package bg.znestorov.sofbus24.main;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import java.util.ArrayList;

import bg.znestorov.sofbus24.entity.LoadTypeEnum;
import bg.znestorov.sofbus24.entity.RouteChangesEntity;
import bg.znestorov.sofbus24.route.changes.RetrieveRouteChangesApi;
import bg.znestorov.sofbus24.route.changes.RetrieveRouteChangesNewsApi;
import bg.znestorov.sofbus24.route.changes.RouteChangesAdapter;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;
import bg.znestorov.sofbus24.utils.activity.ListActivity;

/**
 * RouteChanges activity containing information about the changes in the public
 * transport routes
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RouteChanges extends ListActivity {

    public static final String BUNDLE_ROUTE_CHANGES_NEWS_LIST = "ROUTE CHANGES NEWS LIST";
    private Activity context;
    private ProgressBar loadingRouteChanges;
    private View routeChangesContent;
    private RouteChangesAdapter routeChangesAdapter;
    private ArrayList<RouteChangesEntity> routeChangesList = new ArrayList<RouteChangesEntity>();

    @Override
    @SuppressWarnings("unchecked")
    protected void onCreate(final Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_route_changes);

        // Get the current context
        context = RouteChanges.this;

        // Check the bundle state of the activity
        if (savedInstanceState == null) {
            routeChangesList = (ArrayList<RouteChangesEntity>) getIntent()
                    .getExtras()
                    .getSerializable(BUNDLE_ROUTE_CHANGES_NEWS_LIST);
        } else {
            routeChangesList.clear();
            routeChangesList
                    .addAll((ArrayList<RouteChangesEntity>) savedInstanceState
                            .getSerializable(BUNDLE_ROUTE_CHANGES_NEWS_LIST));
        }

        // Initialize the ActionBar and the Layout fields
        initActionBar();
        initLayoutFields();
        setListAdapter();
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putSerializable(BUNDLE_ROUTE_CHANGES_NEWS_LIST,
                routeChangesList);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_route_changes_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_route_changes_refresh:
                actionsOnRefresh();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        if (Utils.haveNetworkConnection(context)) {
            RouteChangesEntity routeChanges = (RouteChangesEntity) getListAdapter()
                    .getItem(position);

            ProgressDialog progressDialog = new ProgressDialog(context);
            progressDialog.setMessage(Html.fromHtml(getString(
                    R.string.route_changes_news_loading,
                    routeChanges.getTitle())));

            RetrieveRouteChangesNewsApi retrieveRouteChangesNewsApi = new RetrieveRouteChangesNewsApi(
                    context, progressDialog, routeChanges);
            retrieveRouteChangesNewsApi.execute();
        } else {
            ActivityUtils.showNoInternetToast(context);
        }
    }

    /**
     * Initialize the ActionBar
     */
    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(getString(R.string.route_changes_title));
        actionBar.setSubtitle(Utils.getCurrentDateTime());
    }

    /**
     * Initialize the Layout fields
     */
    private void initLayoutFields() {
        loadingRouteChanges = (ProgressBar) findViewById(R.id.route_changes_loading);
        routeChangesContent = findViewById(R.id.route_changes_content);
    }

    /**
     * Set the list adapter
     */
    private void setListAdapter() {
        routeChangesAdapter = new RouteChangesAdapter(context, routeChangesList);
        setListAdapter(routeChangesAdapter);
    }

    /**
     * Actions on refresh the route changes news
     */
    private void actionsOnRefresh() {

        loadingRouteChanges.setVisibility(View.VISIBLE);
        routeChangesContent.setVisibility(View.GONE);

        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(getString(R.string.route_changes_loading));

        RetrieveRouteChangesApi retrieveRouteChangesApi = new RetrieveRouteChangesApi(
                context, progressDialog, LoadTypeEnum.REFRESH);
        retrieveRouteChangesApi.execute();
    }

    /**
     * Refresh the content of the route changes list
     *
     * @param newRouteChangesList the list with the new route changes entities
     */
    public void refreshRouteChangesList(
            ArrayList<RouteChangesEntity> newRouteChangesList) {

        ListView listView = getListView();

        // Check if the ListView is already created
        if (listView != null) {

            // If there are some items in the list after the refresh, scroll the
            // ListView to the top
            if (newRouteChangesList != null && newRouteChangesList.size() > 0) {
                routeChangesList.clear();
                routeChangesList.addAll(newRouteChangesList);

                loadingRouteChanges.setVisibility(View.GONE);
                routeChangesContent.setVisibility(View.VISIBLE);

                routeChangesAdapter.notifyDataSetChanged();

                listView.setSelectionFromTop(0, 0);
            }
        }
    }

}