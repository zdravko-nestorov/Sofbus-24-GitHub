package bg.znestorov.sofbus24.favorites;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import bg.znestorov.sofbus24.main.R;

/**
 * Dialog showing an information about a favorite station
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesInfoDialogAdapter extends ArrayAdapter<String> {

    private Activity context;
    private ArrayList<String> favouritesInfoList;

    public FavouritesInfoDialogAdapter(Activity context,
                                       ArrayList<String> favouritesInfoList) {
        super(context, R.layout.activity_favourites_info_list_item,
                favouritesInfoList);
        this.context = context;
        this.favouritesInfoList = favouritesInfoList;
    }

    @Override
    @SuppressLint("InflateParams")
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        final ViewHolder viewHolder;

        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(
                    R.layout.activity_favourites_info_list_item, null);

            viewHolder = new ViewHolder();
            viewHolder.favouritesInfoImg = (ImageView) rowView
                    .findViewById(R.id.favourites_info_item_img);
            viewHolder.favouritesInfoCategory = (TextView) rowView
                    .findViewById(R.id.favourites_info_item_category);
            viewHolder.favouritesInfoName = (TextView) rowView
                    .findViewById(R.id.favourites_info_item_name);

            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        rowView.setOnClickListener(null);
        rowView.setOnLongClickListener(null);
        rowView.setLongClickable(false);

        String favouritesInfo = favouritesInfoList.get(position);
        switch (position) {
            case 0:
                setFirstRow(viewHolder, favouritesInfo);
                break;
            case 1:
                setSecondRow(viewHolder, favouritesInfo);
                break;
            case 2:
                setThirdRow(viewHolder, favouritesInfo);
                break;
            case 3:
                setFourthRow(viewHolder, favouritesInfo);
                break;
            case 4:
                setFifthRow(viewHolder, favouritesInfo);
                break;
            case 5:
                setSixthRow(viewHolder, favouritesInfo);
                break;
        }

        return rowView;
    }

    /**
     * Set information to the first row
     *
     * @param viewHolder     the view holder with layout objects on the current row
     * @param favouritesInfo the content of the current row
     */
    private void setFirstRow(ViewHolder viewHolder, String favouritesInfo) {
        viewHolder.favouritesInfoImg
                .setImageResource(R.drawable.ic_fav_info_original_name);
        viewHolder.favouritesInfoCategory.setText(context
                .getString(R.string.fav_info_real_name));
        viewHolder.favouritesInfoName.setText(favouritesInfo);
        viewHolder.favouritesInfoName.setSelected(true);
    }

    /**
     * Set information to the second row
     *
     * @param viewHolder     the view holder with layout objects on the current row
     * @param favouritesInfo the content of the current row
     */
    private void setSecondRow(ViewHolder viewHolder, String favouritesInfo) {
        viewHolder.favouritesInfoImg
                .setImageResource(R.drawable.ic_fav_info_favourites_name);
        viewHolder.favouritesInfoCategory.setText(context
                .getString(R.string.fav_info_favourites_name));
        viewHolder.favouritesInfoName.setText(favouritesInfo);
    }

    /**
     * Set information to the third row
     *
     * @param viewHolder     the view holder with layout objects on the current row
     * @param favouritesInfo the content of the current row
     */
    private void setThirdRow(ViewHolder viewHolder, String favouritesInfo) {
        viewHolder.favouritesInfoImg
                .setImageResource(R.drawable.ic_fav_info_date_added);
        viewHolder.favouritesInfoCategory.setText(context
                .getString(R.string.fav_info_date_added));
        viewHolder.favouritesInfoName.setText(favouritesInfo);
    }

    /**
     * Set information to the fourth row
     *
     * @param viewHolder     the view holder with layout objects on the current row
     * @param favouritesInfo the content of the current row
     */
    private void setFourthRow(ViewHolder viewHolder, String favouritesInfo) {
        viewHolder.favouritesInfoImg
                .setImageResource(R.drawable.ic_fav_info_date_last_access);
        viewHolder.favouritesInfoCategory.setText(context
                .getString(R.string.fav_info_date_last_access));
        viewHolder.favouritesInfoName.setText(favouritesInfo);
    }

    /**
     * Set information to the fifth row
     *
     * @param viewHolder     the view holder with layout objects on the current row
     * @param favouritesInfo the content of the current row
     */
    private void setFifthRow(ViewHolder viewHolder, String favouritesInfo) {
        viewHolder.favouritesInfoImg
                .setImageResource(R.drawable.ic_fav_info_usage_count);
        viewHolder.favouritesInfoCategory.setText(context
                .getString(R.string.fav_info_usage_count));
        viewHolder.favouritesInfoName.setText(favouritesInfo);
    }

    /**
     * Set information to the sixth row
     *
     * @param viewHolder     the view holder with layout objects on the current row
     * @param favouritesInfo the content of the current row
     */
    private void setSixthRow(ViewHolder viewHolder, String favouritesInfo) {
        viewHolder.favouritesInfoImg
                .setImageResource(R.drawable.ic_fav_info_position);
        viewHolder.favouritesInfoCategory.setText(context
                .getString(R.string.fav_info_position));
        viewHolder.favouritesInfoName.setText(favouritesInfo);
    }

    static class ViewHolder {
        ImageView favouritesInfoImg;
        TextView favouritesInfoCategory;
        TextView favouritesInfoName;
    }
}