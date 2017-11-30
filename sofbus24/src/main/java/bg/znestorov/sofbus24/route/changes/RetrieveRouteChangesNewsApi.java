package bg.znestorov.sofbus24.route.changes;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import bg.znestorov.sofbus24.entity.RouteChangesEntity;
import bg.znestorov.sofbus24.main.RouteChangesNews;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Retrieving the information about a route change news (starting the
 * RouteChangesRoute)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("StaticFieldLeak")
@SuppressWarnings("deprecation")
public class RetrieveRouteChangesNewsApi extends AsyncTask<Void, Void, String> {

    private final Activity context;
    private final ProgressDialog progressDialog;
    private final RouteChangesEntity routeChanges;

    public RetrieveRouteChangesNewsApi(Activity context, ProgressDialog progressDialog,
                                       RouteChangesEntity routeChanges) {
        this.context = context;
        this.progressDialog = progressDialog;
        this.routeChanges = routeChanges;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected String doInBackground(Void... arg0) {

        String jsonResult;

        try {
            jsonResult = Utils.readUrl(routeChanges.getUrl());
        } catch (Exception e) {
            jsonResult = null;
        }

        if (!progressDialog.isShowing()) {
            cancel(true);
        }

        // Init some Article's stuff such as content and modified date
        initArticleInformation(jsonResult);

        return routeChanges.getArticleBody();
    }

    @Override
    protected void onPostExecute(String articleBody) {
        super.onPostExecute(articleBody);

        if (articleBody == null) {
            ActivityUtils.showNoInternetToast(context);
        } else {

            // Assign the HTML response to the RouteChanges entity
            routeChanges.setArticleBody(articleBody);

            // Start RouteChangesNews activity
            Bundle bundle = new Bundle();
            bundle.putSerializable(RouteChangesNews.BUNDLE_ROUTE_CHANGES_NEWS,
                    routeChanges);

            Intent routeChangesNewsIntent = new Intent(context,
                    RouteChangesNews.class);
            routeChangesNewsIntent.putExtras(bundle);
            context.startActivity(routeChangesNewsIntent);
        }

        dismissLoadingView();
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        dismissLoadingView();
    }

    /**
     * Init some Article's stuff such as content and modified date
     *
     * @param jsonResult the JSON response
     */
    private void initArticleInformation(String jsonResult) {

        // Get the current article content
        JsonObject articleJsonObject;
        try {
            articleJsonObject = new JsonParser().parse(jsonResult).getAsJsonObject();

            // Set the article modified date
            routeChanges.setModifiedDate(
                    articleJsonObject.get(Constants.ROUTE_CHANGES_NEWS_API_DATE_MODIFIED).getAsString());

            // Set the article body
            String articleBody = articleJsonObject.get(Constants.ROUTE_CHANGES_NEWS_API_CONTENT).getAsString();
            articleBody = articleBody.replaceAll("&nbsp;", "");
            articleBody = articleBody.replaceAll("\\t", "");
            articleBody = articleBody.replaceAll(Constants.ROUTE_CHANGES_IMAGE_REGEX, "");
            articleBody = articleBody.replaceAll(Constants.ROUTE_CHANGES_NEW_LINES_REGEX, "");
            articleBody = "<div>" + articleBody.trim();
            routeChanges.setArticleBody(articleBody);

        } catch (Exception e) {
            // Do nothing - we have an error with the information extraction
        }
    }

    /**
     * Create the loading view and lock the screen
     */
    private void createLoadingView() {
        ActivityUtils.lockScreenOrientation(context);

        if (progressDialog != null) {
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