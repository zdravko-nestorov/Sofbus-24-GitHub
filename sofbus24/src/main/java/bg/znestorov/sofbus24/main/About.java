package bg.znestorov.sofbus24.main;

import android.app.ProgressDialog;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

import bg.znestorov.sofbus24.about.RetrieveAppConfiguration;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

public class About extends SherlockFragmentActivity {

    private SherlockFragmentActivity context;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_about);

        // Get the current context
        context = About.this;

        // Find the TextViews over the layout
        TextView aboutInformation = (TextView) findViewById(R.id.about_information);

        // Set the TextViews a formatted text
        String appVersion = "0.0";
        try {
            appVersion = getPackageManager()
                    .getPackageInfo(getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            // This should never be reached (the package exists)
        }
        aboutInformation.setText(Html.fromHtml(String.format(
                getString(R.string.about_information),
                getString(R.string.app_name), appVersion)));

        // Set up the action bar
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setSubtitle(String.format(getString(R.string.about_subtitle),
                appVersion));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getSupportMenuInflater().inflate(R.menu.activity_about_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RetrieveAppConfiguration retrieveAppConfiguration;
        ProgressDialog progressDialog = new ProgressDialog(context);

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_about_update_db:
                if (ActivityUtils.haveNetworkConnection(context)) {
                    progressDialog.setMessage(getString(R.string.about_update_db));
                    retrieveAppConfiguration = new RetrieveAppConfiguration(
                            context, progressDialog, false);
                    retrieveAppConfiguration.execute();
                } else {
                    ActivityUtils.showNoInternetToast(context);
                }
                return true;
            case R.id.action_about_update_app:
                if (ActivityUtils.haveNetworkConnection(context)) {
                    progressDialog.setMessage(getString(R.string.about_update_app));
                    retrieveAppConfiguration = new RetrieveAppConfiguration(
                            context, progressDialog, true);
                    retrieveAppConfiguration.execute();
                } else {
                    ActivityUtils.showNoInternetToast(context);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}