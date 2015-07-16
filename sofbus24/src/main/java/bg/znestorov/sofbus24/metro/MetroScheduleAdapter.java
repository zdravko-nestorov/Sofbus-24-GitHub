package bg.znestorov.sofbus24.metro;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import bg.znestorov.sofbus24.entity.MetroScheduleType;
import bg.znestorov.sofbus24.entity.ScheduleEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.ThemeChange;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Array Adapted used to set each hour of the metro schedule
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class MetroScheduleAdapter extends ArrayAdapter<String> {

    private Activity context;
    private ScheduleEntity metroScheduleEntity;

    public MetroScheduleAdapter(Activity context,
                                ScheduleEntity metroScheduleEntity) {
        super(context, R.layout.activity_metro_schedule_wrapper_list_item,
                metroScheduleEntity.getFormattedScheduleList());
        this.context = context;
        this.metroScheduleEntity = metroScheduleEntity;
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
            rowView = inflater.inflate(
                    R.layout.activity_metro_schedule_wrapper_list_item, null);

            // Configure the view holder
            viewHolder = new ViewHolder();
            viewHolder.scheduleMetroHour = (TextView) rowView
                    .findViewById(R.id.metro_schedule_item_hour);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        // Check if this is the current Fragment, so mark the closest vehicle
        if (metroScheduleEntity.isActive()
                && position == metroScheduleEntity.getCurrentScheduleIndex()) {
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
        }

        // Fill the data
        String metroSchedule = metroScheduleEntity.getFormattedScheduleList()
                .get(position);
        setMetroSchedule(viewHolder, metroSchedule);

        rowView.setOnClickListener(null);
        rowView.setOnLongClickListener(null);
        rowView.setLongClickable(false);

        return rowView;
    }

    private void setMetroSchedule(ViewHolder viewHolder, String metroSchedule) {

        // Find the metro schedule type
        MetroScheduleType metroScheduleType = MetroScheduleType.NONE;
        try {
            if (metroSchedule.contains("|")) {
                String metroScheduleTypeText = Utils.getValueAfter(
                        metroSchedule, "|");
                metroScheduleTypeText = Utils.getValueBefore(
                        metroScheduleTypeText, "(");
                metroScheduleTypeText = metroScheduleTypeText.trim();
                metroScheduleTypeText = metroScheduleTypeText.replace("|", "_");

                metroScheduleType = MetroScheduleType
                        .valueOf(metroScheduleTypeText);
            }
        } catch (Exception e) {
            metroScheduleType = MetroScheduleType.NONE;
        }

        // Format the metro schedule
        metroSchedule = metroSchedule.replaceAll(
                "([|]{0,1}[A-Z]{0,2}){0,3}[ ]{1}[(]{1}", " (");
        metroSchedule = Utils.getValueBefore(metroSchedule, "|");
        metroSchedule = metroSchedule.trim();

        // Define the color and the text of the current row
        String metroScheduleColor;
        switch (metroScheduleType) {
            case IC:
                metroScheduleColor = "#FF0017";
                break;
            case SA:
                metroSchedule = metroSchedule
                        + context.getString(R.string.metro_schedule_sofia_airport);
                metroScheduleColor = "#000000";
                break;
            case BP:
                metroSchedule = metroSchedule
                        + context.getString(R.string.metro_schedule_bussiness_park);
                metroScheduleColor = "#000000";
                break;
            case IC_SA:
                metroSchedule = metroSchedule
                        + context.getString(R.string.metro_schedule_sofia_airport);
                metroScheduleColor = "#FF0017";
                break;
            case IC_BP:
                metroSchedule = metroSchedule
                        + context.getString(R.string.metro_schedule_bussiness_park);
                metroScheduleColor = "#FF0017";
                break;
            default:
                metroScheduleColor = "#000000";
                break;
        }

        // In case the metro schedule hour has already passed, set the text
        // color to grey
        if (!metroSchedule.contains("~")) {
            metroScheduleColor = "#8B8B8B";
        }

        viewHolder.scheduleMetroHour.setTextColor(Color
                .parseColor(metroScheduleColor));
        viewHolder.scheduleMetroHour.setText(Html.fromHtml(metroSchedule));
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        TextView scheduleMetroHour;
    }

}