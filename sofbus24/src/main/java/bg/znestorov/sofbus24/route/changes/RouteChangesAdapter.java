package bg.znestorov.sofbus24.route.changes;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.List;

import bg.znestorov.sofbus24.entity.RouteChangesEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Array Adapter used to show the route changes news in a list view
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RouteChangesAdapter extends ArrayAdapter<RouteChangesEntity>
        implements Filterable {

    private Activity context;
    private List<RouteChangesEntity> roadChangesList;

    public RouteChangesAdapter(Activity context,
                               List<RouteChangesEntity> roadChangesList) {
        super(context, R.layout.activity_route_changes_list_item,
                roadChangesList);

        this.context = context;
        this.roadChangesList = roadChangesList;
    }

    /**
     * Creating the elements of the ListView
     */
    @Override
    @SuppressLint("InflateParams")
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        ViewHolder viewHolder;

        // Reuse views
        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(
                    R.layout.activity_route_changes_list_item, null);

            // Configure view holder
            viewHolder = new ViewHolder();
            viewHolder.roadChangesTitle = (TextView) rowView
                    .findViewById(R.id.route_changes_item_title);
            viewHolder.roadChangesValidFromDate = (TextView) rowView
                    .findViewById(R.id.route_changes_item_valid_from_date);
            viewHolder.roadChangesCreationDate = (TextView) rowView
                    .findViewById(R.id.route_changes_item_creation_date);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        // Fill the data
        RouteChangesEntity routeChanges = roadChangesList.get(position);

        viewHolder.roadChangesTitle.setText(Html.fromHtml(routeChanges
                .getTitle()));
        viewHolder.roadChangesValidFromDate.setText(context.getString(
                R.string.route_changes_label_valid_from,
                routeChanges.getValidFromDate()));
        viewHolder.roadChangesCreationDate.setText(context.getString(
                R.string.route_changes_label_creation_date,
                routeChanges.getCreationDate()));

        return rowView;
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        TextView roadChangesTitle;
        TextView roadChangesValidFromDate;
        TextView roadChangesCreationDate;
    }

}