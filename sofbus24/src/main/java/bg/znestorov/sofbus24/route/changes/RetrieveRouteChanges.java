package bg.znestorov.sofbus24.route.changes;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.LoadTypeEnum;
import bg.znestorov.sofbus24.entity.RouteChangesEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.main.RouteChanges;
import bg.znestorov.sofbus24.main.RouteChangesDialog;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Retrieving the information about the route changes of the public transport
 * and starting/refreshing the RouteChanges activity
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RetrieveRouteChanges extends
        AsyncTask<Void, Void, ArrayList<RouteChangesEntity>> {

    private FragmentActivity context;
    private GlobalEntity globalContext;

    private ProgressDialog progressDialog;
    private LoadTypeEnum loadType;

    private ResponseHandler<String> responseHandler;

    public RetrieveRouteChanges(FragmentActivity context,
                                ProgressDialog progressDialog, LoadTypeEnum loadType) {

        this.context = context;
        this.globalContext = (GlobalEntity) context.getApplicationContext();

        this.progressDialog = progressDialog;
        this.loadType = loadType;

        this.responseHandler = ActivityUtils.getUtfResponseHandler();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        createLoadingView();
    }

    @Override
    protected ArrayList<RouteChangesEntity> doInBackground(Void... arg0) {

        ArrayList<RouteChangesEntity> routeChangesList;
        DefaultHttpClient routeChangesHttpClient = new DefaultHttpClient();

        try {
            StringBuilder htmlResult = new StringBuilder("");
            for (int page = 0; page < 5; page++) {
                HttpPost routeChangesHttpRequest = createRouteChangesRequest(page);
                htmlResult.append(routeChangesHttpClient.execute(
                        routeChangesHttpRequest, responseHandler));
            }

            ProcessRouteChanges processRouteChanges = new ProcessRouteChanges(
                    htmlResult.toString());
            routeChangesList = processRouteChanges.getRouteChangesList();
        } catch (Exception e) {
            routeChangesList = null;
        } finally {
            routeChangesHttpClient.getConnectionManager().shutdown();
        }

        // In case the progress dialog is dissmissed - cancel the async task
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
     * Create HttpGet request to retrieve the route changes
     *
     * @param page the number of the page (it should be multiplied by 20, to get
     *             the FROM param for the POST request)
     * @return a HttpPOST request for the route changes
     * @throws Exception
     */
    private HttpPost createRouteChangesRequest(int page) throws Exception {

        final HttpPost httpPost = new HttpPost(
                Constants.ROUTE_CHANGES_URL_ADDRESS);

        List<BasicNameValuePair> nameValuePairs = new ArrayList<BasicNameValuePair>();
        nameValuePairs.addAll(Arrays.asList(new BasicNameValuePair(
                Constants.ROUTE_CHANGES_FROM, String.valueOf(page * 20))));

        final UrlEncodedFormEntity entity = new UrlEncodedFormEntity(
                nameValuePairs, "UTF-8");
        httpPost.setEntity(entity);

        return httpPost;
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