package bg.znestorov.sofbus24.publictransport;

import android.app.Activity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bg.znestorov.sofbus24.entity.PublicTransportStationEntity;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Used to process the information from SKGT site, using REGEX and set it to a
 * PublicTransportStation entity
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ProcessPublicTransportStation {

    private Activity context;
    private PublicTransportStationEntity ptStation;
    private String htmlResult;

    public ProcessPublicTransportStation(Activity context,
                                         PublicTransportStationEntity ptStation, String htmlResult) {
        this.context = context;
        this.ptStation = ptStation;
        this.htmlResult = htmlResult;
    }

    public Activity getContext() {
        return context;
    }

    public void setContext(Activity context) {
        this.context = context;
    }

    public PublicTransportStationEntity getPtStation() {
        return ptStation;
    }

    public void setPtStation(PublicTransportStationEntity ptStation) {
        this.ptStation = ptStation;
    }

    public String getHtmlResult() {
        return htmlResult;
    }

    public void setHtmlResult(String htmlResult) {
        this.htmlResult = htmlResult;
    }

    /**
     * Get the schedule for the selected station from SKGT site and parse it to
     * a PublicTransportStation object
     *
     * @return PublicTransportStation object with schedule set
     */
    public PublicTransportStationEntity getStationFromHtml() {
        // Reset the schedule, because the station is passed by reference, not
        // by value
        ptStation.resetSchedule();

        // Create the pattern and process the htmlResult
        Pattern pattern = Pattern
                .compile(Constants.SCHECULE_REGEX_STATION_SCHEDULE);
        Matcher matcher = pattern.matcher(htmlResult);

        while (matcher.find()) {
            try {
                String[] timeScheduleArray = matcher.group(2).trim().split(":");

                if (timeScheduleArray.length == 3) {
                    // Check if the schedule is set for 00 or 0, and replace it
                    // with 24 (this is needed because the whole algorithm is
                    // created this way)
                    if ("00".equals(timeScheduleArray[0])
                            || "0".equals(timeScheduleArray[0])) {
                        timeScheduleArray[0] = "24";
                    }

                    // In case the schedule is in bold format (when it is the
                    // current hours):
                    // "<span class="info"><b>XX:XX:XX</b></span>"
                    timeScheduleArray[0] = Utils
                            .getOnlyDigits(timeScheduleArray[0]);

                    // Get the time schedule and hour
                    String timeSchedule = timeScheduleArray[0] + ":"
                            + timeScheduleArray[1];
                    int hourSchedule = Integer.parseInt(timeScheduleArray[0]);

                    // Set the schedule to the station
                    ptStation.setScheduleHour(hourSchedule, timeSchedule);
                }
            } catch (Exception e) {
            }
        }

        return ptStation;
    }
}
