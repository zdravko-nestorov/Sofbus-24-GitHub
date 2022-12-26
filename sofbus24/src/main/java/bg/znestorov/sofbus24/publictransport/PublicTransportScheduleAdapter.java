package bg.znestorov.sofbus24.publictransport;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import bg.znestorov.sofbus24.entity.ScheduleEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Array Adapted used to set each hour of the public transport schedule
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class PublicTransportScheduleAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final ScheduleEntity ptScheduleEntity;

    public PublicTransportScheduleAdapter(Activity context,
                                          ScheduleEntity ptScheduleEntity) {
        super(context, R.layout.activity_public_transport_schedule_list_item,
                ptScheduleEntity.getFormattedScheduleList());
        this.context = context;
        this.ptScheduleEntity = ptScheduleEntity;
    }

    /**
     * Creating the elements of the ListView
     */
    @Override
    @SuppressLint("InflateParams")
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;

        // Used to reuse views
        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater
                    .inflate(
                            R.layout.activity_public_transport_schedule_list_item,
                            null);

            // Configure the view holder
            viewHolder = new ViewHolder();
            viewHolder.schedulePTHour = (TextView) rowView
                    .findViewById(R.id.pt_schedule_item_hour);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        // Fill the data
        String ptSchedule = ptScheduleEntity.getFormattedScheduleList().get(
                position);
        viewHolder.schedulePTHour.setText(ptSchedule);

        // Check if this is the current Fragment, so mark the closest vehicle
        if (ptScheduleEntity.isActive()
                && position == ptScheduleEntity.getCurrentScheduleIndex()) {
            rowView.setBackgroundColor(Color.parseColor("#80CEEA"));
        } else {
            boolean isLightTheme = ThemeChange.isLightTheme(context);

            // Set the background to each row (even or odd)
            if (position % 2 == 1) {
                rowView.setBackgroundColor(isLightTheme ? context
                        .getResources().getColor(
                                R.color.app_light_theme_schedule_odd) : context
                        .getResources().getColor(
                                R.color.app_dark_theme_schedule_odd));
            } else {
                rowView.setBackgroundColor(isLightTheme ? context
                        .getResources().getColor(
                                R.color.app_light_theme_schedule_even)
                        : context.getResources().getColor(
                        R.color.app_dark_theme_schedule_even));
            }

            // Make the rows that the vehicle already passed inactive
            if (Utils.isActiveSchedule(ptSchedule)) {
                viewHolder.schedulePTHour.setTextColor(Color
                        .parseColor("#000000"));
            } else {
                viewHolder.schedulePTHour.setTextColor(Color
                        .parseColor("#8B8B8B"));
            }
        }

        rowView.setOnClickListener(null);
        rowView.setOnLongClickListener(null);
        rowView.setLongClickable(false);

        return rowView;
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        TextView schedulePTHour;
    }

}