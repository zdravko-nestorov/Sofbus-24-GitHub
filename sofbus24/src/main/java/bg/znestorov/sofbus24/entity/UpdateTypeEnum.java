package bg.znestorov.sofbus24.entity;

/**
 * Enum used to check what to be updated - the APPLICATION or the DB
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public enum UpdateTypeEnum {

    /**
     * Indicates that the application needs to be updated
     */
    APP,

    /**
     * Indicates that the database needs to be updated
     */
    DB;
}
