package bg.znestorov.sofbus24.edit.tabs;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragmentActivity;

import java.util.List;

import bg.znestorov.sofbus24.entity.HomeTabEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Array Adapter used to set each row of the EditTabs Fragment
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class EditTabsAdapter extends ArrayAdapter<HomeTabEntity> {

    private final SherlockFragmentActivity context;
    private final List<HomeTabEntity> editTabsList;

    public EditTabsAdapter(SherlockFragmentActivity context,
                           List<HomeTabEntity> editTabsList) {
        super(context, R.layout.activity_sofbus24_edit_tabs_fragment_item,
                editTabsList);

        this.context = context;
        this.editTabsList = editTabsList;
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
                    R.layout.activity_sofbus24_edit_tabs_fragment_item, null);

            // Configure view holder
            viewHolder = new ViewHolder();
            viewHolder.tabVisibility = (CheckBox) rowView
                    .findViewById(R.id.edit_tabs_visible);
            viewHolder.tabName = (TextView) rowView
                    .findViewById(R.id.edit_tabs_name);
            viewHolder.tabPosition = (ImageView) rowView
                    .findViewById(R.id.edit_tabs_position);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        actionsOverListItemFields(viewHolder, position);

        return rowView;
    }

    /**
     * Assign actions over the fields of the current list item
     *
     * @param viewHolder holder containing all elements in the layout
     * @param position   the current position
     */
    private void actionsOverListItemFields(final ViewHolder viewHolder,
                                           final int position) {
        String tabName = editTabsList.get(position).getTabName();
        viewHolder.tabName.setText(tabName);

        if (tabName.equals(context.getString(R.string.edit_tabs_favourites))
                || tabName.equals(context.getString(R.string.edit_tabs_search))) {
            viewHolder.tabVisibility.setEnabled(false);
        } else {
            viewHolder.tabVisibility.setEnabled(true);
        }

        viewHolder.tabVisibility.setChecked(editTabsList.get(position)
                .isTabVisible());
        viewHolder.tabVisibility
                .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {
                        viewHolder.tabVisibility.setChecked(isChecked);
                        editTabsList.get(position).setTabVisible(isChecked);

                        // Declare that the options menu has changed, so should
                        // be recreated (make the system calls the method
                        // onPrepareOptionsMenu)
                        context.supportInvalidateOptionsMenu();
                    }
                });
    }

    /**
     * Rearrange the listView according to the from and to positions of the drop
     * action
     *
     * @param from the start position of the drop action
     * @param to   the end position of the drop action
     */
    public void rearrangeView(int from, int to) {
        HomeTabEntity itemFrom = this.getItem(from);
        this.remove(itemFrom);
        this.insert(itemFrom, to);

        for (int i = 0; i < editTabsList.size(); i++) {
            editTabsList.get(i).setTabPosition(i);

            // Just a workaround as can't fix the issue with the automatic
            // change of the checkboxes on rearrange (only on pre HONEYCOMB
            // devices)
            if (Utils.isPreHoneycomb()) {
                editTabsList.get(i).setTabVisible(true);
            }
        }
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        CheckBox tabVisibility;
        TextView tabName;
        ImageView tabPosition;
    }
}