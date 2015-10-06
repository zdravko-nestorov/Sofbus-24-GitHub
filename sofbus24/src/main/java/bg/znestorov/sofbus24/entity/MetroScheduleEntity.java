package bg.znestorov.sofbus24.entity;

import android.app.Activity;

import org.w3c.dom.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Entity used to keep all the information about a metro station in both
 * directions, so the user can change the direction anytime
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class MetroScheduleEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private final int metroStationsSize;
    private int chosenDirection;
    private List<MetroStationEntity> metroStations;
    private String scheduleCacheTimestamp;

    public MetroScheduleEntity(int chosenDirection,
                               MetroStationEntity metroStation1, MetroStationEntity metroStation2) {
        this.chosenDirection = chosenDirection;

        this.metroStations = new ArrayList<MetroStationEntity>();
        this.metroStations.add(metroStation1);
        if (chosenDirection == 0) {
            this.metroStations.add(metroStation2);
        } else {
            this.metroStations.add(0, metroStation2);
        }

        this.metroStationsSize = metroStations != null ? metroStations.size()
                : 0;
    }

    public int getChosenDirection() {
        return chosenDirection;
    }

    public void setChosenDirection(int chosenDirection) {
        this.chosenDirection = chosenDirection;
    }

    public List<MetroStationEntity> getMetroStations() {
        return metroStations;
    }

    public void setMetroStations(List<MetroStationEntity> metroStations) {
        this.metroStations = metroStations;
    }

    public int getMetroStationsSize() {
        return metroStationsSize;
    }

    public String getScheduleCacheTimestamp() {
        return scheduleCacheTimestamp;
    }

    public void setScheduleCacheTimestamp(String scheduleCacheTimestamp) {
        this.scheduleCacheTimestamp = scheduleCacheTimestamp;
    }

    /**
     * Get the station at a chosen position
     *
     * @param position the user defined position
     * @return the found station
     */
    public MetroStationEntity getStationEntity(int position) {
        switch (position) {
            case 0:
                return metroStationsSize > 0 ? metroStations.get(0) : null;
            default:
                return metroStationsSize > 1 ? metroStations.get(1) : null;
        }
    }

    /**
     * Get the chosen station
     *
     * @return the chosen StationEntity
     */
    public MetroStationEntity getChosenStationEntity() {
        return getStationEntity(chosenDirection);
    }

    /**
     * Get the name of the station
     *
     * @return the station name
     */
    public String getStationName() {
        return getStationEntity(0).getName();
    }

    /**
     * Get the name of the chosen direction and format it appropriate
     *
     * @param context  the current activity context
     * @param position the chosen direction
     * @return the formatted direction name
     */
    public String getDirectionName(Activity context, int position) {
        return getStationEntity(position).getDirection(context)
                .replaceAll("-.*?-", " - ").trim();
    }

    /**
     * Check if the information for this entity is valid (if the schedule is set
     * for both directions)
     *
     * @return if the metro information is valid
     */
    public boolean isMetroInformationValid() {
        if (metroStationsSize > 0) {
            boolean isMetroInformationValid = true;

            for (int i = 0; i < metroStationsSize; i++) {
                if (!metroStations.get(i).isScheduleSet()) {
                    isMetroInformationValid = false;
                    break;
                }
            }

            return isMetroInformationValid;
        } else {
            return false;
        }
    }

    /**
     * Set the direction of the station on the chosen position
     *
     * @param position           the chosen position
     * @param docStationSchedule the document with the information about the chosen station
     */
    public void setDirection(int position, Document docStationSchedule) {
        getStationEntity(position).setDirection(docStationSchedule);
    }

    /**
     * Set the weekday schedule of the station on the chosen position
     *
     * @param position           the chosen position
     * @param docStationSchedule the document with the information about the chosen station
     */
    public void setWeekdaySchedule(int position, Document docStationSchedule) {
        getStationEntity(position).setWeekdaySchedule(docStationSchedule);
    }

    /**
     * Set the holiday schedule of the station on the chosen position
     *
     * @param position           the chosen position
     * @param docStationSchedule the document with the information about the chosen station
     */
    public void setHolidaySchedule(int position, Document docStationSchedule) {
        getStationEntity(position).setHolidaySchedule(docStationSchedule);
    }

    /**
     * Check if the object is loaded from the schedule cache (in case there is
     * no timestamp)
     *
     * @return if the object is loaded from the schedule cache
     */
    public boolean isScheduleCacheLoaded() {
        return scheduleCacheTimestamp != null;
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tchosenDirection: "
                + chosenDirection + "\n\tmetroStations: " + metroStations
                + "\n\tmetroStationsSize: " + metroStationsSize
                + "\n\tscheduleCacheTimestamp: " + scheduleCacheTimestamp
                + "\n}";
    }

}