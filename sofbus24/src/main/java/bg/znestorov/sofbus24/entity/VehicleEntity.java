package bg.znestorov.sofbus24.entity;

import java.io.Serializable;
import java.util.ArrayList;

import bg.znestorov.sofbus24.utils.Utils;

/**
 * Class representing a vehicle structure with all common fields (implements
 * Serializable, so can be transferred between activities)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class VehicleEntity implements Comparable<VehicleEntity>, Serializable {

    private static final long serialVersionUID = 1L;

    private String number;
    private VehicleTypeEnum type;
    private String direction;
    private String skgtLineId;
    private String skgtName;
    private String skgtExtId;
    private String skgtType;
    private ArrayList<String> arrivalTimes;
    private ArrayList<Boolean> isWheelchairAccessible;
    private ArrayList<Boolean> hasAirConditioning;
    private ArrayList<Boolean> hasBicycleMount;
    private ArrayList<Boolean> isDoubledecker;
    private ArrayList<Boolean> hasWifi;

    private int stop = -1;
    private int lid = -1;
    private int vt = -1;
    private int rid = -1;

    public VehicleEntity() {
    }

    public VehicleEntity(VehicleTypeEnum type) {
        this.type = type;
        this.arrivalTimes = new ArrayList<String>();
    }

    public VehicleEntity(String number, VehicleTypeEnum type, String direction) {

        this.number = number;
        this.type = type;
        this.direction = Utils.isEmpty(direction) ? "---" : direction;
        this.arrivalTimes = new ArrayList<String>();
    }

    public VehicleEntity(String number, VehicleTypeEnum type, String direction,
                         ArrayList<String> arrivalTimes) {

        this.number = number;
        this.type = type;
        this.direction = direction;
        this.arrivalTimes = arrivalTimes;
    }

    /**
     * Constructor used in VirtualBoardsTime activity to retrieve the schedule
     *
     * @param number       the vehicle number
     * @param type         the vehicle type
     * @param direction    the vehicle direction
     * @param arrivalTimes the arrival times
     * @param stop         the stop unique id
     * @param lid          the lid unique id
     * @param vt           the vt unique id
     * @param rid          the rid unique id
     */
    public VehicleEntity(String number, VehicleTypeEnum type, String direction,
                         ArrayList<String> arrivalTimes, int stop, int lid, int vt, int rid) {

        this.number = number;
        this.type = type;
        this.direction = direction;
        this.arrivalTimes = arrivalTimes;

        this.stop = stop;
        this.lid = lid;
        this.vt = vt;
        this.rid = rid;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberLeadingDigits() {
        try {
            return Integer.parseInt(number.split("(?=\\D)")[0]);
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }

    public int getNumberDigits() {
        try {
            return Integer.parseInt(number.replaceAll("[^0-9]", ""));
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }

    public String getNumberChars() {
        try {
            return number.replaceAll("[0-9]", "");
        } catch (Exception e) {
            return "null";
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleTypeEnum getType() {
        return type;
    }

    public void setType(VehicleTypeEnum type) {
        this.type = type;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSkgtLineId() {
        return skgtLineId;
    }

    public void setSkgtLineId(String skgtLineId) {
        this.skgtLineId = skgtLineId;
    }

    public String getSkgtName() {
        return skgtName;
    }

    public void setSkgtName(String skgtName) {
        this.skgtName = skgtName;
    }

    public String getSkgtExtId() {
        return skgtExtId;
    }

    public void setSkgtExtId(String skgtExtId) {
        this.skgtExtId = skgtExtId;
    }

    public String getSkgtType() {
        return skgtType;
    }

    public void setSkgtType(String skgtType) {
        this.skgtType = skgtType;
    }

    public ArrayList<String> getArrivalTimes() {
        return arrivalTimes;
    }

    public void setArrivalTimes(ArrayList<String> arrivalTimes) {
        this.arrivalTimes = arrivalTimes;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getVt() {
        return vt;
    }

    public void setVt(int vt) {
        this.vt = vt;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public ArrayList<Boolean> getIsWheelchairAccessible() {
        return isWheelchairAccessible;
    }

    public void setIsWheelchairAccessible(ArrayList<Boolean> isWheelchairAccessible) {
        this.isWheelchairAccessible = isWheelchairAccessible;
    }

    public ArrayList<Boolean> getHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(ArrayList<Boolean> hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public ArrayList<Boolean> getHasBicycleMount() {
        return hasBicycleMount;
    }

    public void setHasBicycleMount(ArrayList<Boolean> hasBicycleMount) {
        this.hasBicycleMount = hasBicycleMount;
    }

    public ArrayList<Boolean> getIsDoubledecker() {
        return isDoubledecker;
    }

    public void setIsDoubledecker(ArrayList<Boolean> isDoubledecker) {
        this.isDoubledecker = isDoubledecker;
    }

    public ArrayList<Boolean> getHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(ArrayList<Boolean> hasWifi) {
        this.hasWifi = hasWifi;
    }

    @Override
    public int compareTo(VehicleEntity vehicle) {
        // FIRST compare the vehicle types
        int result = getType().compareTo(vehicle.getType());
        if (result != 0) {
            return result;
        }

        // SECOND compare by the vehicle name leading digits (leading digits)
        result = Integer.compare(getNumberLeadingDigits(), vehicle.getNumberLeadingDigits());
        if (result != 0) {
            return result;
        }

        // THIRD compare by the vehicle name chars (non-digits)
        result = getNumberChars().compareTo(vehicle.getNumberChars());
        if (result != 0) {
            return result;
        }

        // FOURTH compare by the vehicle name digits (all digits)
        result = Integer.compare(getNumberDigits(), vehicle.getNumberDigits());
        if (result != 0) {
            return result;
        }

        // LAST compare the vehicle hashes
        return Integer.compare(this.hashCode(), vehicle.hashCode());
    }

    @Override
    public String toString() {
        return "VehicleEntity{" +
                "number='" + number + '\'' +
                ", type=" + type +
                ", direction='" + direction + '\'' +
                ", skgtLineId=" + skgtLineId +
                ", skgtName='" + skgtName + '\'' +
                ", skgtExtId='" + skgtExtId + '\'' +
                ", skgtType=" + skgtType +
                ", arrivalTimes=" + arrivalTimes +
                ", isWheelchairAccessible=" + isWheelchairAccessible +
                ", hasAirConditioning=" + hasAirConditioning +
                ", hasBicycleMount=" + hasBicycleMount +
                ", isDoubledecker=" + isDoubledecker +
                ", hasWifi=" + hasWifi +
                ", stop=" + stop +
                ", lid=" + lid +
                ", vt=" + vt +
                ", rid=" + rid +
                '}';
    }
}