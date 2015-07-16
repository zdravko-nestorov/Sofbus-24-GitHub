package bg.znestorov.sofbus24.entity;

import android.content.SharedPreferences;
import android.os.Bundle;

import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Contains the information received from the GCM service via a notification
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class NotificationEntity {

    private String date;
    private NotificationTypeEnum type;
    private String data;

    /**
     * Constructor used to retrieve the received notification from GCM service
     *
     * @param extras the received Bundle object
     */
    public NotificationEntity(Bundle extras) {

        if (extras != null && !extras.isEmpty()) {
            this.date = extras
                    .getString(Constants.GCM_NOTIFICATION_RESPONSE_DATE_KEY);
            try {
                this.type = NotificationTypeEnum
                        .valueOf(extras
                                .getString(Constants.GCM_NOTIFICATION_RESPONSE_TYPE_KEY));
            } catch (Exception e) {
                this.type = NotificationTypeEnum.NONE;
            }
            this.data = extras
                    .getString(Constants.GCM_NOTIFICATION_RESPONSE_DATA_KEY);
        }
    }

    /**
     * Constructor used to retrieve the notification data from the
     * SharedPreferences file
     *
     * @param sharedPreferences the GCM SharedPreferences file
     */
    public NotificationEntity(SharedPreferences sharedPreferences) {

        this.date = sharedPreferences.getString(
                Constants.GCM_PREFERENCES_NOTIFICATION_DATE, "");
        try {
            this.type = NotificationTypeEnum
                    .valueOf(sharedPreferences.getString(
                            Constants.GCM_PREFERENCES_NOTIFICATION_TYPE, ""));
        } catch (Exception e) {
            this.type = null;
        }
        this.data = sharedPreferences.getString(
                Constants.GCM_PREFERENCES_NOTIFICATION_DATA, "");
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public NotificationTypeEnum getType() {
        return type;
    }

    public void setType(NotificationTypeEnum type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * Indicates if the notification params are correctly set
     *
     * @return if the send notification is correct
     */
    public boolean isValid() {
        return !Utils.isEmpty(date) && type != null && !Utils.isEmpty(data);
    }

    @Override
    public String toString() {
        return getClass().getName() + " {\n\tdate: " + date + "\n\ttype: "
                + type + "\n\tdata: " + data + "\n}";
    }

}