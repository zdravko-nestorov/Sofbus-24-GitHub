package bg.znestorov.sofbus24.metro;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.databases.VehiclesDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.TabTypeEnum;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.activity.NonSwipeableViewPager;

/**
 * Metro Fragment containing information about the metro stations
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class MetroFragment extends Fragment {

    private static final String BUNDLE_CURRENT_DIRECTION = "CURRENT DIRECTION";
    private final ArrayList<Fragment> fragmentsList = new ArrayList<Fragment>();
    private VehiclesDataSource vehiclesDataSource;
    private ViewPager mNonSwipeableViewPager;
    private int currentDirection;
    private boolean isPhoneDevice;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initBundleInfo(savedInstanceState);
        initLayoutFields();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LanguageChange.selectLocale(getActivity());

        // Get the type of the device
        Activity context = getActivity();
        vehiclesDataSource = new VehiclesDataSource(context);
        isPhoneDevice = ((GlobalEntity) context.getApplicationContext())
                .isPhoneDevice();

        // Activate the option menu
        setHasOptionsMenu(true);

        return inflater.inflate(R.layout.activity_metro_fragment, container,
                false);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt(BUNDLE_CURRENT_DIRECTION, currentDirection);
    }

    /**
     * This seems to be a bug in the newly added support for nested fragments.
     * Basically, the child FragmentManager ends up with a broken internal state
     * when it is detached from the activity. A short-term workaround that fixed
     * it for me is to add the following to onDetach() of every Fragment which
     * you call getChildFragmentManager() on:
     * www.stackoverflow.com/questions/18977923/viewpager-with-nested-fragments
     */
    @Override
    public void onDetach() {
        super.onDetach();
        try {
            Field childFragmentManager = Fragment.class
                    .getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Get all fragments in the ChildFragmentManager - the fragments are for
        // schedule and metro wrapper fragments
        List<Fragment> fakeMetroFragmentsList = getChildFragmentManager()
                .getFragments();

        // Check if any fragments exist in the ChildFragmentManager. If any -
        // get the MetroStationFragments and get the one that corresponds to the
        // current direction
        if (fakeMetroFragmentsList != null) {
            List<MetroStationFragment> metroFragmentsList = new ArrayList<MetroStationFragment>();

            // Fill a list with the MetroStationFragments
            for (Fragment fragment : fakeMetroFragmentsList) {
                if (fragment != null
                        && fragment instanceof MetroStationFragment) {
                    metroFragmentsList.add((MetroStationFragment) fragment);
                }
            }

            // Get the MetroStationFragment that corresponds to the current
            // direction
            if (!metroFragmentsList.isEmpty()
                    && metroFragmentsList.size() > currentDirection) {
                metroFragmentsList.get(currentDirection).onOptionsItemSelected(
                        item);
            }
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Get the current vehicle code from the Bundle object
     *
     * @param savedInstanceState object containing the state of the saved values
     */
    private void initBundleInfo(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            currentDirection = savedInstanceState
                    .getInt(BUNDLE_CURRENT_DIRECTION);
        } else {
            currentDirection = 0;
        }
    }

    /**
     * Initialize the layout fields and assign the appropriate listeners over
     * them (directions' tabs (TextViews) and the ViewPager)
     */
    private void initLayoutFields() {
        // Create the fragments list
        createFragmentsList();

        // Create the adapter that will return a fragment for each of the metro
        // directions
        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(
                getChildFragmentManager());

        // Set up the ViewPager with the sections adapter and load all tabs at
        // once
        mNonSwipeableViewPager = (NonSwipeableViewPager) getView()
                .findViewById(R.id.metro_pager);
        mNonSwipeableViewPager.setAdapter(mSectionsPagerAdapter);

        // Get the direction tabs and assign them onClickListeners
        TextView textViewDirection1 = (TextView) getView().findViewById(
                R.id.metro_direction1_tab);
        TextView textViewDirection2 = (TextView) getView().findViewById(
                R.id.metro_direction2_tab);
        actionsOverDirectionsTextViews(textViewDirection1, textViewDirection2);

        // Set the active tab
        setActiveFragment(currentDirection, textViewDirection1,
                textViewDirection2);
    }

    /**
     * Create the FragmentsList, where each element contains a separate
     * direction
     */
    private void createFragmentsList() {
        fragmentsList.add(MetroStationFragment.newInstance(0));
        fragmentsList.add(MetroStationFragment.newInstance(1));
    }

    /**
     * Activate the listeners over the directions' tabs (TextViews)
     *
     * @param textViewDirection1 first direction tab (TextView)
     * @param textViewDirection2 second direction tab (TextView)
     */
    private void actionsOverDirectionsTextViews(
            final TextView textViewDirection1, final TextView textViewDirection2) {
        // Set the TextViews text in case of tablet
        if (!isPhoneDevice) {
            vehiclesDataSource.open();
            String direction1 = vehiclesDataSource.getVehicleDirection(
                    VehicleTypeEnum.METRO1).replaceAll("-.*-", " - ");
            String direction2 = vehiclesDataSource.getVehicleDirection(
                    VehicleTypeEnum.METRO2).replaceAll("-.*-", " - ");
            vehiclesDataSource.close();

            textViewDirection1.setText(direction1);
            textViewDirection2.setText(direction2);
        }

        // Assign the Direction1 TextView a click listener
        textViewDirection1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveFragment(0, textViewDirection1, textViewDirection2);
            }
        });

        // Assign the Direction2 TextView a click listener
        textViewDirection2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setActiveFragment(1, textViewDirection1, textViewDirection2);
            }
        });
    }

    /**
     * Set a metro tab to be active - change the background and text colors
     *
     * @param tabType  the position of the tab
     * @param textView the TextView which is selected
     */
    private void setTabActive(TabTypeEnum tabType, TextView textView) {
        int backgroundResource;
        switch (tabType) {
            case LEFT:
                backgroundResource = R.drawable.tab_left_selected;
                break;
            case MIDDLE:
                backgroundResource = R.drawable.tab_middle_selected;
                break;
            default:
                backgroundResource = R.drawable.tab_right_selected;
                break;
        }

        textView.setBackgroundResource(backgroundResource);
        textView.setTextColor(getResources().getColor(R.color.white));
    }

    /**
     * Set a metro tab to be inactive - change the background and text colors
     *
     * @param tabType  the position of the tab
     * @param textView the TextView that has to be deactivated
     */
    private void setTabInactive(TabTypeEnum tabType, TextView textView) {
        int backgroundResource;
        switch (tabType) {
            case LEFT:
                backgroundResource = R.drawable.tab_left_unselected;
                break;
            case MIDDLE:
                backgroundResource = R.drawable.tab_middle_unselected;
                break;
            default:
                backgroundResource = R.drawable.tab_right_unselected;
                break;
        }

        textView.setBackgroundResource(backgroundResource);
        textView.setTextColor(getResources().getColor(R.color.inner_tab_grey));
    }

    /**
     * Set a fragment to be visible (on top)
     *
     * @param directionNumber    the number of the direction
     * @param textViewDirection1 first direction tab (TextView)
     * @param textViewDirection2 second direction tab (TextView)
     */
    private void setActiveFragment(int directionNumber,
                                   TextView textViewDirection1, TextView textViewDirection2) {
        switch (directionNumber) {
            case 0:
                currentDirection = 0;
                setTabActive(TabTypeEnum.LEFT, textViewDirection1);
                setTabInactive(TabTypeEnum.RIGHT, textViewDirection2);
                break;
            default:
                currentDirection = 1;
                setTabActive(TabTypeEnum.RIGHT, textViewDirection2);
                setTabInactive(TabTypeEnum.LEFT, textViewDirection1);
                break;
        }

        mNonSwipeableViewPager.setCurrentItem(currentDirection);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentsList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentsList.size();
        }
    }
}