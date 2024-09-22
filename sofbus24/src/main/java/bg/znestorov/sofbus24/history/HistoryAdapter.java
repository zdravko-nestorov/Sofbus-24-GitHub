package bg.znestorov.sofbus24.history;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Array Adapter user for set each row a history object from a preference file
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class HistoryAdapter extends ArrayAdapter<HistoryEntity> implements
        Filterable {

    private final Activity context;
    private final List<HistoryEntity> historyList;

    public HistoryAdapter(Activity context, List<HistoryEntity> historyList) {
        super(context, R.layout.activity_history_list_item, historyList);

        this.context = context;
        this.historyList = historyList;
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
            rowView = inflater.inflate(R.layout.activity_history_list_item,
                    null);

            // Configure view holder
            viewHolder = new ViewHolder();
            viewHolder.searchImage = (ImageView) rowView
                    .findViewById(R.id.history_item_favourite);
            viewHolder.searchText = (TextView) rowView
                    .findViewById(R.id.history_item_search_text);
            viewHolder.searchType = (TextView) rowView
                    .findViewById(R.id.history_item_search_type);
            viewHolder.searchDate = (TextView) rowView
                    .findViewById(R.id.history_item_search_date);
            rowView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) rowView.getTag();
        }

        // Fill the data
        HistoryEntity history = historyList.get(position);

        VehicleTypeEnum historyType = history.getHistoryType();
        String historyValue = history.getHistoryValue();
        String searchName = Utils.getValueBefore(historyValue, "(");
        String searchNumber = Utils.getValueBetweenLast(historyValue, "(", ")");

        viewHolder.searchImage.setImageResource(getHistoryImage(history));
        viewHolder.searchText.setText(Html.fromHtml(getHistoryTitle(
                historyType, searchName, searchNumber)));
        viewHolder.searchType.setText(Html.fromHtml(getHistorySubtitle(
                historyType, searchName, searchNumber)));
        viewHolder.searchDate.setText(Html.fromHtml(context.getString(
                R.string.history_item_search_date, getHistoryType(history),
                history.getHistoryDateWithoutSeconds())));

        return rowView;
    }

    /**
     * Get the history title according to the type of search
     *
     * @param historyType  the type of the search
     * @param searchName   the search name (station or vehicle)
     * @param searchNumber the search number (station or vehicle)
     * @return the history title
     */
    private String getHistoryTitle(VehicleTypeEnum historyType,
                                   String searchName, String searchNumber) {

        String historyTitle;

        switch (historyType) {
            case BUS:
                historyTitle = context.getString(R.string.history_title_bus,
                        searchNumber);
                break;
            case TROLLEY:
                historyTitle = context.getString(R.string.history_title_trolley,
                        searchNumber);
                break;
            case TRAM:
                historyTitle = context.getString(R.string.history_title_tram,
                        searchNumber);
                break;
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                historyTitle = context.getString(R.string.history_title_metro,
                        searchNumber);
                break;
            default:
                historyTitle = searchName;
                if (historyTitle.startsWith("METR. ")
                        || historyTitle.startsWith("METROSTANCIYA ")
                        || historyTitle.startsWith("МЕТР. ")
                        || historyTitle.startsWith("МЕТРОСТАНЦИЯ "))
                    historyTitle = Utils.getValueAfter(historyTitle, " ").trim();

                break;
        }

        historyTitle = historyTitle.replaceAll("[&]\\S{4};", "\"");

        return historyTitle;
    }

    /**
     * Get the history subtitle according to the type of search
     *
     * @param historyType  the type of the search
     * @param searchName   the search name (station or vehicle)
     * @param searchNumber the search number (station or vehicle)
     * @return the history subtitle
     */
    private String getHistorySubtitle(VehicleTypeEnum historyType,
                                      String searchName, String searchNumber) {

        String historySubtitle;

        switch (historyType) {
            case BUS:
            case TROLLEY:
            case TRAM:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                historySubtitle = searchName;
                break;
            case METRO:
                historySubtitle = String
                        .format(context
                                        .getString(R.string.history_item_metro_station_number_text),
                                searchNumber);
                break;
            default:
                historySubtitle = context.getString(
                        R.string.history_item_station_number, searchNumber);
                break;
        }

        return historySubtitle;
    }

    /**
     * Get the type of the history search
     *
     * @param history the current history object
     * @return the type of the search
     */
    private String getHistoryType(HistoryEntity history) {
        String historyType;

        switch (history.getHistoryType()) {
            case BUS:
                historyType = context.getString(R.string.history_type_bus);
                break;
            case TROLLEY:
                historyType = context.getString(R.string.history_type_trolley);
                break;
            case TRAM:
                historyType = context.getString(R.string.history_type_tram);
                break;
            case BTT:
                historyType = context.getString(R.string.history_type_station);
                break;
            default:
                historyType = context.getString(R.string.history_type_metro);
                break;
        }

        return historyType;
    }

    /**
     * Get the image of the history item
     *
     * @param history the history object
     * @return the image resource of the current row
     */
    private int getHistoryImage(HistoryEntity history) {

        int historyImage;

        switch (history.getHistoryType()) {
            case BUS:
                historyImage = R.drawable.ic_history_bus;
                break;
            case TROLLEY:
                historyImage = R.drawable.ic_history_trolley;
                break;
            case TRAM:
                historyImage = R.drawable.ic_history_tram;
                break;
            case METRO:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                historyImage = R.drawable.ic_history_metro;
                break;
            default:
                historyImage = R.drawable.ic_history_station;
                break;
        }

        return historyImage;
    }

    // Used for optimize performance of the ListView
    static class ViewHolder {
        ImageView searchImage;
        TextView searchText;
        TextView searchType;
        TextView searchDate;
    }
}