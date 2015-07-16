package bg.znestorov.sofbus24.entity;

/**
 * Representing each of the tabs of the HomeScreen and their status
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class HomeTabEntity {

    private boolean tabVisible;
    private String tabName;
    private int tabPosition;

    public HomeTabEntity() {
    }

    public HomeTabEntity(boolean tabVisible, String tabName, int tabPosition) {
        this.tabVisible = tabVisible;
        this.tabName = tabName;
        this.tabPosition = tabPosition;
    }

    public boolean isTabVisible() {
        return tabVisible;
    }

    public void setTabVisible(boolean tabVisible) {
        this.tabVisible = tabVisible;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public int getTabPosition() {
        return tabPosition;
    }

    public void setTabPosition(int tabPosition) {
        this.tabPosition = tabPosition;
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\ttabVisible: " + tabVisible
                + "\n\ttabName: " + tabName + "\n\ttabPosition: " + tabPosition
                + "\n}";
    }

}
