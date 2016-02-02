package bg.znestorov.sofbus24.history;

import java.io.Serializable;

import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * History class representing each station search
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class HistoryEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String historyValue;
    private String historyDate;
    private VehicleTypeEnum historyType;

    public HistoryEntity() {
    }

    public HistoryEntity(String historyValue, String historyDate,
                         VehicleTypeEnum historyType) {
        this.historyValue = historyValue;
        this.historyDate = historyDate;
        this.historyType = historyType;
    }

    public String getHistoryValue() {
        return historyValue;
    }

    public void setHistoryValue(String historyValue) {
        this.historyValue = historyValue;
    }

    public String getHistoryDate() {

        String dateToReturn = historyDate;

        if (dateToReturn != null && dateToReturn.split(":").length == 2) {
            historyDate = historyDate + ":00";
        }

        return historyDate;
    }

    public void setHistoryDate(String historyDate) {
        this.historyDate = historyDate;
    }

    public String getHistoryDateWithoutSeconds() {

        String dateToReturn = historyDate;

        if (dateToReturn != null && dateToReturn.split(":").length == 3) {
            historyDate = Utils.getValueBeforeLast(historyDate, ":");
        }

        return historyDate;
    }

    public VehicleTypeEnum getHistoryType() {
        return historyType;
    }

    public void setHistoryType(VehicleTypeEnum historyType) {
        this.historyType = historyType;
    }

    @Override
    public int hashCode() {

        int hashCode = 13;
        hashCode = 17 * hashCode + this.historyValue.hashCode();
        hashCode = 19 * hashCode + this.historyType.hashCode();

        return hashCode;
    }

    @Override
    public boolean equals(Object object) {

        // Check if the object exists and is instance of HistoryEntity
        if (object == null || !(object instanceof HistoryEntity)) {
            return false;
        }

        // Check if this is the current object
        if (object == this) {
            return true;
        }

        HistoryEntity historyEntity = (HistoryEntity) object;

        // We should not check the HistoryEntity date, because it will be different for each search
        // (it is accurate to a second)
        boolean result = this.getHistoryValue().equals(historyEntity.getHistoryValue()) &&
                this.getHistoryType().equals(historyEntity.getHistoryType());

        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\thistoryValue: " + historyValue
                + "\n\thistoryDate: " + historyDate + "\n\thistoryType: "
                + historyType + "\n}";
    }

}
