package bg.znestorov.sofbus24.entity;

import java.io.Serializable;

import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Class representing a station structure with all common fields (implements
 * Serializable, so can be transferred between activities)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class StationEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String number;
    private String name;
    private String lat;
    private String lon;
    private VehicleTypeEnum type;
    private String skgtId;
    private String skgtTitle;
    private String skgtName;
    private String skgtCode;
    private String[] skgtPosition;
    private String skgtType;
    private String skgtExtId;

    /**
     * It is used in two cases with different meanings:
     * <ul>
     * <li><b>Bus, Trolley, Tram</b> - the position of the station in case of
     * multiple results</li>
     * <li><b>Metro</b> - the URL address of the station</li>
     * </ul>
     */
    private String customField;

    /**
     * Information fields concerning the Favorites section (when the favorite is
     * added, last access, how many times is accessed and the user defined order
     * position)
     */
    private String dateAdded;
    private String dateLastAccess;
    private int usageCount;
    private int position;

    public StationEntity() {
    }

    public StationEntity(StationEntity station) {
        this.number = Utils.formatNumberOfDigits(station.getNumber(), 4);
        this.name = station.getName();
        this.lat = station.getLat();
        this.lon = station.getLon();
        this.type = station.getType();
        this.customField = station.getCustomField();
        this.skgtId = station.getSkgtId();
        this.skgtTitle = station.getSkgtTitle();
        this.skgtName = station.getSkgtName();
        this.skgtCode = station.getSkgtCode();
        this.skgtPosition = station.getSkgtPosition();
        this.skgtType = station.getSkgtType();
        this.skgtExtId = station.getSkgtExtId();
    }

    public StationEntity(String skgtId, String number, String name, String lat, String lon,
                         VehicleTypeEnum type, String customField) {
        this.number = Utils.formatNumberOfDigits(number, 4);
        this.name = name;
        this.lat = lat;
        this.lon = lon;
        this.type = type;
        this.customField = customField;
        this.skgtId = skgtId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = Utils.formatNumberOfDigits(number, 4);
    }

    public String getFormattedNumber() {
        return Utils.formatNumberOfDigits(number, 4);
    }

    public void setNumberUnformatted(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public VehicleTypeEnum getType() {
        return type;
    }

    public void setType(VehicleTypeEnum type) {
        this.type = type;
    }

    public String getSkgtId() {
        return skgtId;
    }

    public void setSkgtId(String skgtId) {
        this.skgtId = skgtId;
    }

    public String getSkgtTitle() {
        return skgtTitle;
    }

    public void setSkgtTitle(String skgtTitle) {
        this.skgtTitle = skgtTitle;
    }

    public String getSkgtName() {
        return skgtName;
    }

    public void setSkgtName(String skgtName) {
        this.skgtName = skgtName;
    }

    public String getSkgtCode() {
        return skgtCode;
    }

    public void setSkgtCode(String skgtCode) {
        this.skgtCode = skgtCode;
    }

    public String[] getSkgtPosition() {
        return skgtPosition;
    }

    public void setSkgtPosition(String[] skgtPosition) {
        this.skgtPosition = skgtPosition;
    }

    public String getSkgtType() {
        return skgtType;
    }

    public void setSkgtType(String skgtType) {
        this.skgtType = skgtType;
    }

    public String getSkgtExtId() {
        return skgtExtId;
    }

    public void setSkgtExtId(String skgtExtId) {
        this.skgtExtId = skgtExtId;
    }

    public String getCustomField() {
        return customField;
    }

    public void setCustomField(String customField) {
        this.customField = customField;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDateLastAccess() {
        return dateLastAccess;
    }

    public void setDateLastAccess(String dateLastAccess) {
        this.dateLastAccess = dateLastAccess;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Check if the station has coordinates
     *
     * @return true if the station has coordinates, false otherwise
     */
    public boolean hasCoordinates() {
        return lat != null && lon != null && !"".equals(lat) && !"".equals(lon)
                && !"EMPTY".equals(lat) && !"EMPTY".equals(lon);
    }

    /**
     * Check if the station is metro one
     *
     * @return true if the station is metro one, false otherwise
     */
    public boolean isMetroStation() {
        return customField.equals(String.format(Constants.METRO_STATION_URL,
                number));
    }

    /**
     * Check if the station is metro one
     *
     * @return true if the station is metro one, false otherwise
     */
    public boolean isMetroStationByType() {
        return type == VehicleTypeEnum.METRO
                || type == VehicleTypeEnum.METRO1
                || type == VehicleTypeEnum.METRO2
                || type == VehicleTypeEnum.METRO3
                || type == VehicleTypeEnum.METRO4;
    }

    /**
     * Assign the station new values
     *
     * @param station the new station values
     */
    public void assignStationValues(StationEntity station) {
        this.number = Utils.formatNumberOfDigits(station.getNumber(), 4);
        this.name = station.getName();
        this.lat = station.getLat();
        this.lon = station.getLon();
        this.type = station.getType();
        this.customField = station.getCustomField();
        this.skgtId = station.getSkgtId();
        this.skgtTitle = station.getSkgtTitle();
        this.skgtName = station.getSkgtName();
        this.skgtCode = station.getSkgtCode();
        this.skgtPosition = station.getSkgtPosition();
        this.skgtType = station.getSkgtType();
        this.skgtExtId = station.getSkgtExtId();
    }

    @Override
    public String toString() {
        return "StationEntity{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", type=" + type +
                ", skgtId='" + skgtId + '\'' +
                ", skgtTitle='" + skgtTitle + '\'' +
                ", skgtName='" + skgtName + '\'' +
                ", skgtCode='" + skgtCode + '\'' +
                ", skgtPosition='" + skgtPosition + '\'' +
                ", skgtType='" + skgtType + '\'' +
                ", skgtExtId='" + skgtExtId + '\'' +
                ", customField='" + customField + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                ", dateLastAccess='" + dateLastAccess + '\'' +
                ", usageCount=" + usageCount +
                ", position=" + position +
                '}';
    }
}