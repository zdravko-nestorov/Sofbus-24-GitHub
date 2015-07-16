package bg.znestorov.sofbus24.entity;

import java.io.Serializable;

/**
 * Class used to save the state of the Wheels in the DroidTrans activity
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class WheelStateEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private int vehiclesType;
    private int vehiclesNumber;
    private int vehiclesDirection;
    private int stationsNumbers;

    public WheelStateEntity() {
        this.vehiclesType = -1;
        this.vehiclesNumber = -1;
        this.vehiclesDirection = -1;
        this.stationsNumbers = -1;
    }

    public WheelStateEntity(int vehiclesType, int vehiclesNumber,
                            int vehiclesDirection, int stationsNumbers) {
        this.vehiclesType = vehiclesType;
        this.vehiclesNumber = vehiclesNumber;
        this.vehiclesDirection = vehiclesDirection;
        this.stationsNumbers = stationsNumbers;
    }

    public int getVehiclesType() {
        return vehiclesType;
    }

    public void setVehiclesType(int vehiclesType) {
        this.vehiclesType = vehiclesType;
    }

    public int getVehiclesNumber() {
        return vehiclesNumber;
    }

    public void setVehiclesNumber(int vehiclesNumber) {
        this.vehiclesNumber = vehiclesNumber;
    }

    public int getVehiclesDirection() {
        return vehiclesDirection;
    }

    public void setVehiclesDirection(int vehiclesDirection) {
        this.vehiclesDirection = vehiclesDirection;
    }

    public int getStationsNumbers() {
        return stationsNumbers;
    }

    public void setStationsNumbers(int stationsNumbers) {
        this.stationsNumbers = stationsNumbers;
    }

    /**
     * Check if the wheel state is set
     *
     * @return if the wheel state is set
     */
    public boolean isWheelStateSet() {
        return this.vehiclesType != -1 && this.vehiclesNumber != -1
                && this.vehiclesDirection != -1 && this.stationsNumbers != -1;
    }

    /**
     * Check if the wheel state is set in base position (all is at 0 position)
     *
     * @return if the wheel state is set in base position (all is at 0 position)
     */
    public boolean isWheelStateInBasePosition() {
        return this.vehiclesType == 0 && this.vehiclesNumber == 0
                && this.vehiclesDirection == 0 && this.stationsNumbers == 0;
    }

    /**
     * Reset the wheel state
     */
    public void reset() {
        this.vehiclesType = -1;
        this.vehiclesNumber = -1;
        this.vehiclesDirection = -1;
        this.stationsNumbers = -1;
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tvehiclesType: " + vehiclesType
                + "\n\tvehiclesNumber: " + vehiclesNumber
                + "\n\tvehiclesDirection: " + vehiclesDirection
                + "\n\tstationsNumbers: " + stationsNumbers + "\n}";
    }

}
