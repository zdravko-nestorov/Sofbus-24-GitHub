package bg.znestorov.sofbus24.entity;

/**
 * Enum used to determine which activity is looking for the current location,
 * and what action has caused it.
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public enum RetrieveCurrentLocationTypeEnum {
    CS_MAP_INIT, CS_LIST_INIT, CS_LIST_REFRESH, DT_HOME_SCREEN, DT_INIT, DT_REFRESH
}
