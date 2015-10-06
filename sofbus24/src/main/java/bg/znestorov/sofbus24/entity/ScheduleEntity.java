package bg.znestorov.sofbus24.entity;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This class is used to send data from the MetroSchedule and PublicTransport
 * fragment to all Metro and PublicTransport Fragments
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ScheduleEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private ArrayList<String> formattedScheduleList;
    private boolean isActive;
    private int currentScheduleIndex;

    public ScheduleEntity(ArrayList<String> metroScheduleList,
                          boolean isActive, int currentActiveRow) {
        this.isActive = isActive;
        this.currentScheduleIndex = currentActiveRow;
        this.formattedScheduleList = metroScheduleList;
    }

    public ArrayList<String> getFormattedScheduleList() {
        return formattedScheduleList;
    }

    public void setFormattedScheduleList(ArrayList<String> formattedScheduleList) {
        this.formattedScheduleList = formattedScheduleList;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getCurrentScheduleIndex() {
        return currentScheduleIndex;
    }

    public void setCurrentScheduleIndex(int currentScheduleIndex) {
        this.currentScheduleIndex = currentScheduleIndex;
    }
}
