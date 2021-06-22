package bg.znestorov.sofbus24.main;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import bg.znestorov.sofbus24.entity.RouteChangesEntity;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;

/**
 * Activity that shows a single route change news
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RouteChangesNews extends FragmentActivity {

    public static final String BUNDLE_ROUTE_CHANGES_NEWS = "ROUTE CHANGES NEWS";
    private Activity context;
    private RouteChangesEntity routeChanges;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_route_changes_news);

        // Get the activity context
        context = RouteChangesNews.this;

        // Check the bundle state of the activity
        routeChanges = (RouteChangesEntity) getIntent().getExtras()
                .getSerializable(BUNDLE_ROUTE_CHANGES_NEWS);

        // Initialize the ActionBar and the Layout fields
        initActionBar();
        initLayoutFields();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_route_changes_news_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public boolean onOptionsItemSelected(MenuItem item) {

        // Select the current locale - we need to put this here, as this
        // activity won't recreate on orientation change
        LanguageChange.selectLocale(this);

        // Get the URL address and the device Android version
        String urlAddress = String.format(Constants.ROUTE_CHANGES_NEWS_API_URL_BROWSER_ADDRESS,
                routeChanges.getId());

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.action_route_changes_copy_link:

                android.content.ClipboardManager clipboard = (android.content.ClipboardManager)
                        getSystemService(Context.CLIPBOARD_SERVICE);
                android.content.ClipData clip = android.content.ClipData
                        .newPlainText(urlAddress, urlAddress);
                clipboard.setPrimaryClip(clip);

                Toast.makeText(context,
                        getString(R.string.route_changes_news_copy_link),
                        Toast.LENGTH_SHORT).show();

                return true;
            case R.id.action_route_changes_open_browser:

                if (!urlAddress.startsWith("http://")
                        && !urlAddress.startsWith("https://")) {
                    urlAddress = "http://" + urlAddress;
                }

                Intent browserIntent;
                browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlAddress));
                startActivity(Intent.createChooser(browserIntent,
                        getString(R.string.route_changes_news_choose_browser)));

                return true;
            default:
                return super.onOptionsItemSelected(item);
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
    }

    /**
     * Initialize the Layout fields
     */
    private void initLayoutFields() {

        TextView routeChangesNewsTitle = (TextView) findViewById(R.id.route_changes_news_title);
        routeChangesNewsTitle.setText(Html.fromHtml(routeChanges.getTitle()));

        TextView routeChangesNewsValidFromDate = (TextView) findViewById(R.id.route_changes_news_valid_from_date);
        routeChangesNewsValidFromDate.setText(Html.fromHtml(getString(
                R.string.route_changes_label_valid_from,
                routeChanges.getValidFromDate())));

        TextView routeChangesNewsValidToDate = (TextView) findViewById(R.id.route_changes_news_valid_to_date);
        routeChangesNewsValidToDate.setText(Html.fromHtml(getString(
                R.string.route_changes_label_valid_to,
                routeChanges.getValidToDate())));

        TextView routeChangesNewsArticleBody = (TextView) findViewById(R.id.route_changes_news_article_body);
        routeChangesNewsArticleBody.setText(Html.fromHtml(routeChanges
                .getArticleBody()));
    }

}
