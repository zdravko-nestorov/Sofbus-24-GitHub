package bg.znestorov.sofbus24.entity;

/**
 * Indicates the different types of notifications that can be send via the GCM
 * server
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public enum NotificationTypeEnum {

    /**
     * Notification alerting the user that an application update is available
     */
    UPDATE_APP,

    /**
     * Notification alerting the user that an database update is available
     */
    UPDATE_DB,

    /**
     * Notification alerting the user that he/she can rate the application (if
     * wants)
     */
    RATE_APP,

    /**
     * Notification alerting the user about the occurrence of an unforeseen
     * situation
     */
    INFO,

    /**
     * In case of wrong notification sent
     */
    NONE;
}
