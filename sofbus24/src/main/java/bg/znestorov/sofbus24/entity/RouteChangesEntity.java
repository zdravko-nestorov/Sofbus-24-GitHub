package bg.znestorov.sofbus24.entity;

import java.io.Serializable;

import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;

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
    private String modifiedDate;
    private String creationDate;
    private String url;
    private String articleBody;

    public RouteChangesEntity(String id, String title, String validFromDate,
                              String creationDate) {
        this.id = id;
        this.title = title;
        this.validFromDate = Utils.transformStringDate(validFromDate,
                "yyyy-MM-dd HH:mm:ss", "dd.MM.yyy");
        this.creationDate = Utils.transformStringDate(creationDate,
                "yyyy-MM-dd HH:mm:ss", "dd.MM.yyy kk:mm");
        this.url = String.format(Constants.ROUTE_CHANGES_NEWS_API_URL_ADDRESS, id);
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

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
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
                ", creationDate='" + creationDate + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", url='" + url + '\'' +
                ", articleBody='" + articleBody + '\'' +
                '}';
    }

}