package bg.znestorov.sofbus24.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import bg.znestorov.sofbus24.utils.Utils;

/**
 * Class used to retrieve data from the Schedule database
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class ScheduleCacheEntity {

    private String data;
    private String timestamp;

    public ScheduleCacheEntity(String data, String timestamp) {
        this.data = data;
        this.timestamp = Utils.formatScheduleCacheTimestamp(timestamp);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Transform the Gson data to a PublicTransportStationEntity object
     *
     * @return the PublicTransportStationEntity object
     */
    public PublicTransportStationEntity getPTStationEntity() {
        Gson gson = new Gson();

        return gson.fromJson(data,
                new TypeToken<PublicTransportStationEntity>() {
                }.getType());
    }

    /**
     * Transform the Gson data to a DirectionsEntity object
     *
     * @return the DirectionsEntity object
     */
    public DirectionsEntity getDirectionsEntity() {
        Gson gson = new Gson();

        return gson.fromJson(data, new TypeToken<DirectionsEntity>() {
        }.getType());
    }

    /**
     * Transform the Gson data to a MetroScheduleEntity object
     *
     * @return the MetroScheduleEntity object
     */
    public MetroScheduleEntity getMetroScheduleEntity() {
        Gson gson = new Gson();

        return gson.fromJson(data, new TypeToken<MetroScheduleEntity>() {
        }.getType());
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tdata: " + data + "\n\ttimestamp: "
                + timestamp + "\n}";
    }

}