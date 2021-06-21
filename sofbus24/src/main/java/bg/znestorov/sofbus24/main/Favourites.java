package bg.znestorov.sofbus24.main;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.fragment.app.FragmentActivity;

import bg.znestorov.sofbus24.favorites.FavouritesStationFragment;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;

public class Favourites extends FragmentActivity {

    private static final String TAG_FAVOURITES_FRAGMENT = "FAVOURITES_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_favourites);

        // Initialize the ActionBar
        initActionBar();

        // Start the Sofbus24 fragment
        startFavouritesFragment(savedInstanceState);
    }

    @Override
    public void onBackPressed() {
        setResult(HomeScreenSelect.RESULT_CODE_ACTIVITY_FINISH, new Intent());
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_favourites_actions, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /**
     * Initialize the ActionBar drawer
     */
    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setTitle(getString(R.string.edit_tabs_favourites));
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    /**
     * Start the Favourites fragment
     *
     * @param savedInstanceState the current state of the activity
     */
    private void startFavouritesFragment(Bundle savedInstanceState) {
        FavouritesStationFragment favouritesFragment;

        if (savedInstanceState == null) {
            favouritesFragment = FavouritesStationFragment.getInstance(false);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.favourites_fragment, favouritesFragment,
                            TAG_FAVOURITES_FRAGMENT).addToBackStack(null)
                    .commit();
        }
    }
}