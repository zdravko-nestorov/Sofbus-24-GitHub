package bg.znestorov.sofbus24.utils;

import android.annotation.SuppressLint;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Class responsible to define if a day is a working day or holiday
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class WorkingDaysCalendar {

    private static final int APRIL_DAYS = 30;
    private static final int MAY_DAYS = 31;

    /**
     * Check if the current date is a WORKING day (check if it is a Holiday or
     * Weekend)
     *
     * @param date the date to be checked
     * @return if the date is working day
     */
    public static boolean isWorkingDay(Calendar date) {
        return !(isHoliday(date) || isWeekend(date));

    }

    /**
     * Check if the current date is a HOLIDAY (check if it is a Static or
     * Floating Holiday)
     *
     * @param date the date to be checked
     * @return if the date is holiday
     */
    private static boolean isHoliday(Calendar date) {
        return isStaticHoliday(date) || isFloatingHoliday(date);

    }

    /**
     * Check if the current date is from the WEEKEND (check if it is Saturday or
     * Sunday)
     *
     * @param date the date to be checked
     * @return if the date is from the weekend
     */
    private static boolean isWeekend(Calendar date) {
        return date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;

    }

    /**
     * Check if the current date is a static HOLIDAY
     *
     * @param date the date to be checked
     * @return if the date is a static holiday
     */
    private static boolean isStaticHoliday(Calendar date) {
        // New Year
        if (date.get(Calendar.MONTH) == Calendar.JANUARY
                && date.get(Calendar.DATE) == 1) {
            return true;
        }

        // Day after New Year's Day
        if (date.get(Calendar.MONTH) == Calendar.JANUARY
                && date.get(Calendar.DATE) == 2) {
            return true;
        }

        // Liberation Day
        if (date.get(Calendar.MONTH) == Calendar.MARCH
                && date.get(Calendar.DATE) == 3) {
            return true;
        }

        // Labour Day
        if (date.get(Calendar.MONTH) == Calendar.MAY
                && date.get(Calendar.DATE) == 1) {
            return true;
        }

        // St. George's Day
        if (date.get(Calendar.MONTH) == Calendar.MAY
                && date.get(Calendar.DATE) == 6) {
            return true;
        }

        // Bulgarian Education and Culture, and Slavonic Literature Day
        if (date.get(Calendar.MONTH) == Calendar.MAY
                && date.get(Calendar.DATE) == 24) {
            return true;
        }

        // Unification Day
        if (date.get(Calendar.MONTH) == Calendar.SEPTEMBER
                && date.get(Calendar.DATE) == 6) {
            return true;
        }

        // Independence Day
        if (date.get(Calendar.MONTH) == Calendar.SEPTEMBER
                && date.get(Calendar.DATE) == 22) {
            return true;
        }

        // Revival Leaders' Day (All Saints Day)
        if (date.get(Calendar.MONTH) == Calendar.NOVEMBER
                && date.get(Calendar.DATE) == 1) {
            return true;
        }

        // Christmas Eve
        if (date.get(Calendar.MONTH) == Calendar.DECEMBER
                && date.get(Calendar.DATE) == 24) {
            return true;
        }

        // Christmas Day
        if (date.get(Calendar.MONTH) == Calendar.DECEMBER
                && date.get(Calendar.DATE) == 25) {
            return true;
        }

        // Second Day of Christmas
        return date.get(Calendar.MONTH) == Calendar.DECEMBER
                && date.get(Calendar.DATE) == 26;

    }

    /**
     * Check if the current date is a floating HOLIDAY (check if it is Easter or
     * Ascension day)
     *
     * @param date the date to be checked
     * @return if the date is a floating holiday
     */
    private static boolean isFloatingHoliday(Calendar date) {
        return isEaster(date) || isAscensionDay(date);

    }

    /**
     * Check if the current date is the EASTER
     *
     * @param date the date to be checked
     * @return if it is Easter
     */
    private static boolean isEaster(Calendar date) {
        return isEasterFriday(date) || isEasterMonday(date);

    }

    /**
     * Check if the current date is the EASTER FRIDAY
     *
     * @param date the date to be checked
     * @return if it is Easter Friday
     */
    private static boolean isEasterFriday(Calendar date) {
        int monthEaster = getEasterMonday(date.get(Calendar.YEAR)).get(
                Calendar.MONTH);
        int dayEaster = getEasterMonday(date.get(Calendar.YEAR)).get(
                Calendar.DAY_OF_MONTH);

        if (date.get(Calendar.MONTH) == monthEaster) {
            if (date.get(Calendar.DAY_OF_MONTH) == dayEaster - 3) {
                return true;
            }
        }

        return false;
    }

    /**
     * Check if the current date is the EASTER MONDAY
     *
     * @param date the date to be checked
     * @return if it is Easter Monday
     */
    private static boolean isEasterMonday(Calendar date) {
        int monthEaster = getEasterMonday(date.get(Calendar.YEAR)).get(
                Calendar.MONTH);
        int dayEaster = getEasterMonday(date.get(Calendar.YEAR)).get(
                Calendar.DAY_OF_MONTH);

        if (date.get(Calendar.MONTH) == monthEaster) {
            if (date.get(Calendar.DAY_OF_MONTH) == dayEaster) {
                return true;
            }
        }

        return false;
    }

    /**
     * Check if the current date is the ASCENSION
     *
     * @param date the date to be checked
     * @return if it is Ascension
     */
    private static boolean isAscensionDay(Calendar date) {
        int monthAscDay = getAscensionDay(date.get(Calendar.YEAR)).get(
                Calendar.MONTH);
        int dayAscDay = getAscensionDay(date.get(Calendar.YEAR)).get(
                Calendar.DAY_OF_MONTH);

        if (date.get(Calendar.MONTH) == monthAscDay) {
            if (date.get(Calendar.DAY_OF_MONTH) == dayAscDay) {
                return true;
            }
        }

        return false;
    }

    /**
     * Get the Ascension date
     *
     * @param year the current year
     * @return the Ascension date
     */
    @SuppressLint("SimpleDateFormat")
    private static Calendar getAscensionDay(int year) {
        int monthEaster = getEasterMonday(year).get(Calendar.MONTH);
        int mondayEaster = getEasterMonday(year).get(Calendar.DAY_OF_MONTH);
        int ascensionDay = mondayEaster + 38;
        int ascensionMonth = 0;

        if ((ascensionDay - APRIL_DAYS) > MAY_DAYS) {
            ascensionDay = ascensionDay - APRIL_DAYS - MAY_DAYS;
            ascensionMonth = monthEaster + 3;
        } else {
            ascensionDay = ascensionDay - APRIL_DAYS;
            ascensionMonth = monthEaster + 2;
        }

        Calendar toReturn = Calendar.getInstance();

        SimpleDateFormat df = new SimpleDateFormat("yyyyMdd");
        try {
            Date date = df.parse("" + year + ascensionMonth + ascensionDay);
            toReturn.setTimeInMillis(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return toReturn;
    }

    /**
     * Get the Easter Monday
     *
     * @param year the current year
     * @return the Easter Monday
     */
    @SuppressLint("SimpleDateFormat")
    private static Calendar getEasterMonday(int year) {
        int goldenNumber = year % 19;
        int epact = (19 * goldenNumber + 24) % 30;
        int vernalEquinoxToPaschalFullMoon = epact - epact / 28;
        int paschalFullMoonDay = (year + year / 4
                + vernalEquinoxToPaschalFullMoon - 13) % 7;
        int vernalEquinoxToPaschalFullMoonSunday = vernalEquinoxToPaschalFullMoon
                - paschalFullMoonDay;
        int easterMonth = 3 + (vernalEquinoxToPaschalFullMoonSunday + 40) / 44;
        int easterDay = (vernalEquinoxToPaschalFullMoonSunday + 28 - 31 * (easterMonth / 4));
        int easterMonday = 0;

        if ((easterDay == 31 && easterMonth == 3)
                || (easterDay == 30 && easterMonth == 4)) {
            easterMonday = 1;
            easterMonth++;
        } else {
            easterMonday = easterDay + 1;
        }

        Calendar toReturn = Calendar.getInstance();

        SimpleDateFormat df = new SimpleDateFormat("yyyyMdd");
        try {
            Date date = df.parse("" + year + easterMonth + easterMonday);
            toReturn.setTimeInMillis(date.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return toReturn;
    }

}