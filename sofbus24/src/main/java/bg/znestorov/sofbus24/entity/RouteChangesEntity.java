package bg.znestorov.sofbus24.entity;

import java.io.Serializable;

import bg.znestorov.sofbus24.utils.Constants;

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
    private String creationDate;
    private String url;
    private String articleBody;

    public RouteChangesEntity(String id, String title, String validFromDate,
                              String creationDate) {
        this.id = id;
        this.title = title;
        this.validFromDate = validFromDate;
        this.creationDate = creationDate;
        this.url = String.format(Constants.ROUTE_CHANGES_NEWS_URL_ADDRESS, id);
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
        return getClass().getName() + " {\n\tid: " + id + "\n\ttitle: " + title
                + "\n\tvalidFromDate: " + validFromDate + "\n\tcreationDate: "
                + creationDate + "\n\turl: " + url + "\n\tarticleBody: "
                + articleBody + "\n}";
    }

}