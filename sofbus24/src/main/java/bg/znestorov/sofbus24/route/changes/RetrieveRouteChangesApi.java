package bg.znestorov.sofbus24.route.changes;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.LoadTypeEnum;
import bg.znestorov.sofbus24.entity.RouteChangesEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.main.RouteChanges;
import bg.znestorov.sofbus24.main.RouteChangesDialog;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Retrieving the information about the route changes of the public transport
 * and starting/refreshing the RouteChanges activity
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("StaticFieldLeak")
@SuppressWarnings("deprecation")
public class RetrieveRouteChangesApi extends
        AsyncTask<Void, Void, ArrayList<RouteChangesEntity>> {

    private final Activity context;
    private final GlobalEntity globalContext;

    private final ProgressDialog progressDialog;
    private final LoadTypeEnum loadType;

    public RetrieveRouteChangesApi(Activity context,
                                   ProgressDialog progressDialog, LoadTypeEnum loadType) {

        this.context = context;
        this.globalContext = (GlobalEntity) context.getApplicationContext();

        this.progressDialog = progressDialog;
        this.loadType = loadType;
    }

    /**
     * Processing the route changes JSON result, so take the needed data in an array list
     *
     * @param jsonResult the JSON result retrieved from the SKGT site
     * @return a list with all articles retrieved from the given JSON input
     */
    private static ArrayList<RouteChangesEntity> getRouteChangesList(String jsonResult) {

        ArrayList<RouteChangesEntity> routeChangesList = new ArrayList<>();

        // Get all articles from this Articles page
        JsonArray articleJsonArray;
        try {
            articleJsonArray = new JsonParser().parse(jsonResult).getAsJsonObject()
                    .getAsJsonArray(Constants.ROUTE_CHANGES_NEWS_API_RESULTS);
        } catch (Exception e) {
            return routeChangesList;
        }

        // Iterate the JSON Array and create Java objects
        for (JsonElement articleJsonElement : articleJsonArray) {

            JsonObject articleJsonObject = articleJsonElement.getAsJsonObject();
            routeChangesList.add(new RouteChangesEntity(
                    articleJsonObject.get(Constants.ROUTE_CHANGES_NEWS_API_ID),
                    articleJsonObject.get(Constants.ROUTE_CHANGES_NEWS_API_TITLE),
                    articleJsonObject.get(Constants.ROUTE_CHANGES_NEWS_VALID_FROM_DATE),
                    articleJsonObject.get(Constants.ROUTE_CHANGES_NEWS_VALID_TO_DATE)));
        }

        return routeChangesList;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected ArrayList<RouteChangesEntity> doInBackground(Void... arg0) {

        ArrayList<RouteChangesEntity> routeChangesList = new ArrayList<>();

        try {
            for (int page = 1; page < 6; page++) {

                // Get all articles from this page and transform them to Java objects
                try {
                    String jsonResult = Utils.readUrl(
                            String.format(Constants.ROUTE_CHANGES_API_URL_ADDRESS, page));
                    routeChangesList.addAll(getRouteChangesList(jsonResult));
                } catch (Exception e) {
                    // Just in case of error - do nothing
                }
            }

        } catch (Exception e) {
            routeChangesList = null;
        }

        // In case the progress dialog is dismissed - cancel the async task
        if (loadType == LoadTypeEnum.INIT && !progressDialog.isShowing()) {
            cancel(true);
        }

        return routeChangesList;
    }

    @Override
    protected void onPostExecute(ArrayList<RouteChangesEntity> routeChangesList) {
        super.onPostExecute(routeChangesList);

        if (routeChangesList == null) {
            ActivityUtils.showNoInternetToast(context);
        } else if (routeChangesList.size() == 0) {
            Toast.makeText(context,
                    context.getString(R.string.route_changes_list_empty_text),
                    Toast.LENGTH_LONG).show();
        } else {
            switch (loadType) {
                case INIT:
                    Bundle bundle = new Bundle();
                    bundle.putSerializable(
                            RouteChanges.BUNDLE_ROUTE_CHANGES_NEWS_LIST,
                            routeChangesList);

                    Intent routeChangesIntent;
                    if (globalContext.isPhoneDevice()) {
                        routeChangesIntent = new Intent(context, RouteChanges.class);
                    } else {
                        routeChangesIntent = new Intent(context,
                                RouteChangesDialog.class);
                    }

                    routeChangesIntent.putExtras(bundle);
                    context.startActivity(routeChangesIntent);
                    break;
                default:
                    ((RouteChanges) context)
                            .refreshRouteChangesList(routeChangesList);
                    break;
            }
        }

        dismissLoadingView();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        dismissLoadingView();
    }

    /**
     * Create the loading view and lock the screen
     */
    private void createLoadingView() {
        ActivityUtils.lockScreenOrientation(context);

        if (loadType == LoadTypeEnum.INIT) {
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog
                    .setOnCancelListener(new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialog) {
                            cancel(true);
                        }
                    });
            progressDialog.show();
        }
    }

    /**
     * Dismiss the loading view and unlock the screen
     */
    private void dismissLoadingView() {
        try {
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        } catch (Exception e) {
            /*
             * Fixing a strange error that is happening sometimes when the
             * dialog is dismissed. I guess sometimes activity gets finished
             * before the dialog successfully dismisses.
             *
             * java.lang.IllegalArgumentException: View not attached to window
             * manager
             */
        }

        ActivityUtils.unlockScreenOrientation(context);
    }

}