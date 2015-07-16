package bg.znestorov.sofbus24.route.changes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bg.znestorov.sofbus24.entity.RouteChangesEntity;
import bg.znestorov.sofbus24.utils.Constants;

/**
 * Proccessing the route changes html source code, so take the needed data in an
 * array list
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ProcessRouteChanges {

    private String htmlResult;

    public ProcessRouteChanges(String htmlResult) {
        this.htmlResult = htmlResult;
    }

    public ArrayList<RouteChangesEntity> getRouteChangesList() {

        ArrayList<RouteChangesEntity> routeChangesList = new ArrayList<RouteChangesEntity>();

        // Create the pattern and process the htmlResult
        Pattern pattern = Pattern.compile(Constants.ROUTE_CHANGES_REGEX);
        Matcher matcher = pattern.matcher(htmlResult);

        while (matcher.find()) {
            try {
                routeChangesList.add(new RouteChangesEntity(matcher.group(1)
                        .trim(), matcher.group(2).trim(), matcher.group(3)
                        .trim(), matcher.group(4).trim()));
            } catch (Exception e) {
                routeChangesList = null;
            }
        }

        return routeChangesList;
    }
}
