package bg.znestorov.sofbus24.entity;

/**
 * The type of the metro schedule - INCOMPLETE COURSE, SOFIA AIRPORT or
 * BUSINESS PARK
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public enum MetroScheduleType {

    /**
     * Indicates the INCOMPLETE COURSES of the metro schedule
     */
    IC,

    /**
     * Indicates the trains that goes to the SOFIA AIRPORT
     */
    SA,

    /**
     * Indicates the trains that goes to the BUSINESS PARK
     */
    BP,

    /**
     * Mixed scheduled types
     */
    IC_SA, IC_BP,

    /**
     * None of the special schedule types
     */
    NONE
}
