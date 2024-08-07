package bg.znestorov.sofbus24.navigation;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * Class used to set the items ot the navigation drawer
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class NavDrawerArrayAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final List<String> navigationItems;
    private final List<Integer> navigationItemsImgs;

    private final boolean isPhoneDevice;

    public NavDrawerArrayAdapter(Activity context,
                                 ArrayList<String> navigationItems) {

        super(context, R.layout.activity_navigation_drawer_list_item,
                navigationItems);

        this.context = context;
        this.isPhoneDevice = ((GlobalEntity) context.getApplicationContext())
                .isPhoneDevice();
        this.navigationItems = navigationItems;
        this.navigationItemsImgs = List.of(
                R.drawable.ic_slide_menu_home,
                R.drawable.ic_slide_menu_home_standard,
                R.drawable.ic_slide_menu_home_map,
                R.drawable.ic_slide_menu_home_cars,
                R.drawable.ic_slide_menu_cs_list,
                // R.drawable.ic_slide_menu_route_changes,
                R.drawable.ic_slide_menu_history,
                R.drawable.ic_slide_menu_options,
                R.drawable.ic_slide_menu_info,
                R.drawable.ic_slide_menu_update,
                R.drawable.ic_slide_menu_backup,
                R.drawable.ic_slide_menu_exit
        );
    }

    @Override
    @SuppressLint("InflateParams")
    public View getView(int position, View convertView, ViewGroup parent) {

        // In case of tablet do not show the DroidTrans as possible home screen
        if (!isPhoneDevice && position == 3) {
            return new View(context);
        } else {
            View rowView = convertView;
            ViewHolder viewHolder;

            // Reuse views
            if (rowView == null) {

                /*
                 * Just a workaround because of a exception in the GooglePlay
                 * console (java.lang.NullPointerException) - Last reported on 7
                 * Feb 2015 at 19:15
                 */
                LayoutInflater inflater = (LayoutInflater) context
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                if (inflater == null) {
                    inflater = context.getLayoutInflater();
                }

                rowView = inflater.inflate(
                        R.layout.activity_navigation_drawer_list_item, null);

                // Configure view holder
                viewHolder = new ViewHolder();
                viewHolder.navDrawerLayout = rowView
                        .findViewById(R.id.navigation_drawer_list_item_layout);
                viewHolder.navDrawerImg = (ImageView) rowView
                        .findViewById(R.id.navigation_drawer_list_img);
                viewHolder.navDrawerText = (TextView) rowView
                        .findViewById(R.id.navigation_drawer_list_text);
                viewHolder.navDrawerCheckedImg = (ImageView) rowView
                        .findViewById(R.id.navigation_drawer_list_home_img);
                viewHolder.navDrawerListDivider = rowView.
                        findViewById(R.id.navigation_drawer_list_divider);
                rowView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) rowView.getTag();
            }

            // Initialize each row of the NavigationDrawer
            try {
                initSubTagsBackground(position, viewHolder);
                viewHolder.navDrawerImg.setImageResource(navigationItemsImgs
                        .get(position));
                viewHolder.navDrawerText.setText(navigationItems.get(position));
                initCheckedImage(position, viewHolder);
            } catch (Exception e) {
                /**
                 * There is an error with the method initSubTagsBackground(...),
                 * because the current navDrawerLayout is null. This is just a
                 * workaround to hide the error from the user - it is happening
                 * rarely and only on tablet devices.
                 *
                 * Exception: java.lang.NullPointerException
                 * Last reported: 27 Jul 11:28
                 */
            }

            return rowView;
        }
    }

    @Override
    public boolean isEnabled(int position) {
        switch (position) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    /**
     * Initialize the Sub-tags of the Navigation Drawer (change the background
     * color and fix the padding)
     *
     * @param position   the position of the navigation drawer
     * @param viewHolder the view holder of the current row
     */
    private void initSubTagsBackground(int position, ViewHolder viewHolder) {

        boolean isLightTheme = ThemeChange.isLightTheme(context);

        switch (position) {
            case 1:
                // This is made because of a bug with the dividers between disabled items
                // (not clickable) in ListView for Android previous to Lollipop
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    viewHolder.navDrawerListDivider.setVisibility(View.VISIBLE);
                }
            case 2:
            case 3:
                viewHolder.navDrawerLayout
                        .setBackgroundColor(isLightTheme ? 0x30BBBBBB : 0x70BBBBBB);
                viewHolder.navDrawerLayout.setPadding(
                        ActivityUtils.dpToPx(context, 25),
                        ActivityUtils.dpToPx(context, 8),
                        ActivityUtils.dpToPx(context, 10),
                        ActivityUtils.dpToPx(context, 8));
                break;
            default:
                viewHolder.navDrawerLayout.setBackgroundColor(0xECECEC);
                viewHolder.navDrawerLayout.setPadding(
                        ActivityUtils.dpToPx(context, 10),
                        ActivityUtils.dpToPx(context, 8),
                        ActivityUtils.dpToPx(context, 10),
                        ActivityUtils.dpToPx(context, 8));
                break;
        }
    }

    /**
     * Define the image that marks the chosen home screen
     *
     * @param position   the current row position
     * @param viewHolder the view holder of the current row
     */
    private void initCheckedImage(int position, ViewHolder viewHolder) {
        int userHomeScreenChoice = 0;
        boolean isUserHomeScreenChosen = NavDrawerHomeScreenPreferences
                .isUserHomeScreenChosen(context);

        if (isUserHomeScreenChosen) {
            userHomeScreenChoice = NavDrawerHomeScreenPreferences
                    .getUserHomeScreenChoice(context);
        } else {
            NavDrawerHomeScreenPreferences.setUserChoice(context, 0);
        }

        if (userHomeScreenChoice == position - 1) {
            viewHolder.navDrawerCheckedImg.setVisibility(View.VISIBLE);
            viewHolder.navDrawerCheckedImg
                    .setImageResource(R.drawable.ic_slide_menu_checked);
        } else {
            switch (position) {
                case 0:
                    viewHolder.navDrawerCheckedImg.setVisibility(View.VISIBLE);
                    viewHolder.navDrawerCheckedImg
                            .setImageResource(R.drawable.ic_slide_menu_arrow);
                    break;
                case 1:
                case 2:
                case 3:
                    viewHolder.navDrawerCheckedImg.setVisibility(View.VISIBLE);
                    viewHolder.navDrawerCheckedImg
                            .setImageResource(R.drawable.ic_slide_menu_unchecked);
                    break;
                default:
                    viewHolder.navDrawerCheckedImg.setVisibility(View.GONE);
                    break;
            }
        }
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        View navDrawerLayout;
        ImageView navDrawerImg;
        TextView navDrawerText;
        ImageView navDrawerCheckedImg;
        View navDrawerListDivider;
    }

}