package bg.znestorov.sofbus24.route.changes;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bg.znestorov.sofbus24.entity.RouteChangesEntity;
import bg.znestorov.sofbus24.main.RouteChangesNews;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Retrieving the information about a route change news (starting the
 * RouteChangesRoute)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RetrieveRouteChangesNews extends AsyncTask<Void, Void, String> {

    private Activity context;
    private ProgressDialog progressDialog;
    private RouteChangesEntity routeChanges;

    private ResponseHandler<String> responseHandler;

    public RetrieveRouteChangesNews(Activity context,
                                    ProgressDialog progressDialog, RouteChangesEntity routeChanges) {

        this.context = context;
        this.progressDialog = progressDialog;
        this.routeChanges = routeChanges;

        this.responseHandler = ActivityUtils.getUtfResponseHandler();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected String doInBackground(Void... arg0) {

        String htmlResult;
        DefaultHttpClient routeChangesNewsHttpClient = new DefaultHttpClient();

        try {
            HttpGet routeChangesHttpRequest = createRouteChangesNewsRequest();
            htmlResult = routeChangesNewsHttpClient.execute(
                    routeChangesHttpRequest, responseHandler);
        } catch (Exception e) {
            htmlResult = null;
        } finally {
            routeChangesNewsHttpClient.getConnectionManager().shutdown();
        }

        if (!progressDialog.isShowing()) {
            cancel(true);
        }

        return getArticleBody(htmlResult);
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
     * Create HttpGet request to retrieve the route changes news
     *
     * @return a HttpGet request for the route changes news
     * @throws URISyntaxException
     */
    private HttpGet createRouteChangesNewsRequest() throws URISyntaxException {
        HttpGet httpGet = new HttpGet();
        httpGet.setURI(new URI(routeChanges.getUrl()));

        return httpGet;
    }

    /**
     * Get the body of the article
     *
     * @param htmlResult the html response
     * @return the body of the article
     */
    private String getArticleBody(String htmlResult) {

        String articleBody = null;

        if (htmlResult != null) {

            Pattern pattern = Pattern
                    .compile(Constants.ROUTE_CHANGES_NEWS_REGEX_1);
            Matcher matcher = pattern.matcher(htmlResult);

            if (matcher.find()) {
                articleBody = matcher.group(1);
                articleBody = articleBody.replaceAll("&nbsp;", "");
            } else {
                pattern = Pattern.compile(Constants.ROUTE_CHANGES_NEWS_REGEX_2);
                matcher = pattern.matcher(htmlResult);

                if (matcher.find()) {
                    articleBody = matcher.group(1);
                    articleBody = articleBody.replaceAll("&nbsp;", "");
                } else {
                    pattern = Pattern
                            .compile(Constants.ROUTE_CHANGES_NEWS_REGEX_3);
                    matcher = pattern.matcher(htmlResult);

                    if (matcher.find()) {
                        articleBody = matcher.group(1);
                        articleBody = articleBody.replaceAll("&nbsp;", "");
                    }
                }
            }
        }

        return articleBody;
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
            /**
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