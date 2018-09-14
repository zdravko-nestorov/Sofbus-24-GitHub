package bg.znestorov.sofbus24.entity;

import com.google.gson.JsonElement;

import java.io.Serializable;

import bg.znestorov.sofbus24.utils.Constants;

import static bg.znestorov.sofbus24.utils.Utils.getJsonElementAsString;
import static bg.znestorov.sofbus24.utils.Utils.transformStringDate;

/**
 * Used to represent the route changes of the public transport in Sofia
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class RouteChangesEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String title;
    private String validFromDate;
    private String validToDate;
    private String url;
    private String articleBody;

    public RouteChangesEntity(String id, String title, String validFromDate,
                              String validToDate) {
        this.id = id;
        this.title = title;
        this.validFromDate = transformStringDate(validFromDate,
                "yyyy-MM-dd", "dd.MM.yyy", false);
        this.validToDate = transformStringDate(validToDate,
                "yyyy-MM-dd", "dd.MM.yyy", true);
        this.url = String.format(Constants.ROUTE_CHANGES_NEWS_API_URL_ADDRESS, id);
    }

    public RouteChangesEntity(JsonElement id, JsonElement title, JsonElement validFromDate,
                              JsonElement validToDate) {
        this.id = getJsonElementAsString(id);
        this.title = getJsonElementAsString(title);
        this.validFromDate = transformStringDate(getJsonElementAsString(validFromDate),
                "yyyy-MM-dd", "dd.MM.yyy", false);
        this.validToDate = transformStringDate(getJsonElementAsString(validToDate),
                "yyyy-MM-dd", "dd.MM.yyy", true);
        this.url = String.format(Constants.ROUTE_CHANGES_NEWS_API_URL_ADDRESS, this.id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
    }

    public String getValidToDate() {
        return validToDate;
    }

    public void setValidToDate(String validToDate) {
        this.validToDate = validToDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }

    @Override
    public String toString() {
        return "RouteChangesEntity{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", validFromDate='" + validFromDate + '\'' +
                ", validToDate='" + validToDate + '\'' +
                ", url='" + url + '\'' +
                ", articleBody='" + articleBody + '\'' +
                '}';
    }

}