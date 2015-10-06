package bg.znestorov.sofbus24.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

import java.util.ArrayList;

import bg.znestorov.sofbus24.entity.MetroScheduleEntity;
import bg.znestorov.sofbus24.metro.MetroScheduleWrapperFragment;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;

public class MetroSchedule extends SherlockFragmentActivity implements
        ActionBar.TabListener {

    private final ArrayList<Fragment> fragmentsList = new ArrayList<Fragment>();
    private Activity context;
    private ActionBar actionBar;
    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private int chosenDirection;
    private MetroScheduleEntity metroSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ThemeChange.selectTheme(this);
        super.onCreate(savedInstanceState);

        LanguageChange.selectLocale(this);
        setContentView(R.layout.activity_metro_schedule);

        context = MetroSchedule.this;

        initBundleInfo();
        initActionBar();
        initLayoutFields();
        setActiveFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present
        getSupportMenuInflater().inflate(
                R.menu.activity_metro_schedule_actions, menu);

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

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        mViewPager.setCurrentItem(tab.getPosition());
        mSectionsPagerAdapter.notifyDataSetChanged();
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
    }

    /**
     * Get the MetroSchedule information from the Bundle object
     */
    private void initBundleInfo() {
        Bundle extras = getIntent().getExtras();
        metroSchedule = (MetroScheduleEntity) extras
                .get(Constants.BUNDLE_METRO_SCHEDULE);
        chosenDirection = metroSchedule.getChosenDirection();
    }

    /**
     * Set up the action bar
     */
    private void initActionBar() {
        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(Utils.getValueAfter(metroSchedule.getStationName(),
                " ").trim());
    }

    /**
     * Initialize the layout fields (ActionBar, ViewPager and
     * SectionsPagerAdapter)
     */
    private void initLayoutFields() {
        // Create the fragments list
        createFragmentsList();

        // Create the adapter that will return a fragment for each of the
        // primary sections of the application
        mSectionsPagerAdapter = new SectionsPagerAdapter(
                getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter and load all tabs at
        // once
        mViewPager = (ViewPager) findViewById(R.id.metro_schedule_pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        // When swiping between different sections, select the corresponding
        // tab. We can also use ActionBar.Tab#select() to do this if we have
        // a reference to the Tab.
        mViewPager
                .setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                        actionBar.setSelectedNavigationItem(position);
                    }
                });

        // For each of the sections in the app, add a tab to the action bar
        for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
            actionBar.addTab(actionBar.newTab()
                    .setText(mSectionsPagerAdapter.getTabName(i))
                    .setTabListener(this));
        }
    }

    /**
     * Create the FragmentsList, where each element contains a separate
     * direction
     */
    private void createFragmentsList() {
        fragmentsList.add(MetroScheduleWrapperFragment
                .newInstance(metroSchedule.getStationEntity(0)));
        fragmentsList.add(MetroScheduleWrapperFragment
                .newInstance(metroSchedule.getStationEntity(1)));
    }

    /**
     * Set the active fragment to be firstly visible (the chosen from the user)
     */
    private void setActiveFragment() {
        mViewPager.setCurrentItem(chosenDirection);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentsList.get(position);
        }

        @Override
        public int getItemPosition(Object object) {
            if (object instanceof MetroScheduleWrapperFragment) {
                ((MetroScheduleWrapperFragment) object).initRefresh(125);
            }

            // Don't return POSITION_NONE, avoid fragment recreation.
            return super.getItemPosition(object);
        }

        @Override
        public int getCount() {
            return fragmentsList.size();
        }

        public String getTabName(int i) {
            return metroSchedule.getDirectionName(context, i);
        }
    }
}