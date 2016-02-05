package bg.znestorov.sofbus24.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.UpdateTypeEnum;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.history.HistoryEntity;
import bg.znestorov.sofbus24.history.HistoryOfSearches;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.updates.check.CheckForUpdatesAsync;
import bg.znestorov.sofbus24.updates.check.CheckForUpdatesPreferences;

/**
 * Utility class
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class Utils {

    /**
     * The days that the application and the database should be updated
     */
    private static final Set<Integer> DAYS_FOR_APP_UPDATE;
    /**
     * The days that the application and the database should be updated
     */
    private static final Set<Integer> DAYS_FOR_DB_UPDATE;
    /**
     * Maximum number of attempts when a file is copied/replaced. If some file
     * fails to copy/replace, try the value of the variable more attempts
     */
    private static final Integer MAX_COPY_FILE_ATTEMPTS = 3;

    static {
        DAYS_FOR_APP_UPDATE = new LinkedHashSet<Integer>();
        DAYS_FOR_APP_UPDATE.add(1);
    }

    static {
        DAYS_FOR_DB_UPDATE = new LinkedHashSet<Integer>();
        DAYS_FOR_DB_UPDATE.add(1);
        DAYS_FOR_DB_UPDATE.add(15);
    }

    /**
     * Check if the input is a number
     *
     * @param input the input string
     * @return if the input is a number
     */
    public static boolean isNumeric(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }

    /**
     * Check if the input is an Integer
     *
     * @param input the input string
     * @return if the input is an Integer
     */
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }

    /**
     * Tests if the supplied string is NULL or 0-length.
     *
     * @param input the input string
     * @return boolean TRUE if empty, otherwise FALSE
     */
    public static boolean isEmpty(String input) {
        return input == null || input.trim().length() == 0;
    }

    /**
     * Function that extracts only digits from a given String. In case of an
     * empty string - return "".
     *
     * @param value the input String
     * @return the digits from the String
     */
    public static String getOnlyDigits(String value) {
        if (value != null && !"".equals(value)) {
            value = value.replaceAll("\\D+", "");
        } else {
            value = "";
        }

        return value;
    }

    /**
     * Function that remove all whitespaces and non visible characters such as
     * tab, \n from a string text. In case of an empty string - return "".
     *
     * @param value the input String
     * @return the digits from the String
     */
    public static String removeSpaces(String value) {
        if (value != null && !"".equals(value)) {
            value = value.replaceAll("\\s+", "");
        } else {
            value = "";
        }

        return value;
    }

    /**
     * Get a value from a string BEFORE some REGEX
     *
     * @param value the string value
     * @param regex the regex that is looked for
     * @return the substring value BEFORE the REGEX, or the value in case of no
     * REGEX found
     */
    public static String getValueBefore(String value, String regex) {
        if (value.contains(regex)) {
            return value.substring(0, value.indexOf(regex));
        } else {
            return value;
        }
    }

    /**
     * Get a value from a string BEFORE some REGEX (LAST)
     *
     * @param value the string value
     * @param regex the regex that is looked for
     * @return the substring value BEFORE the REGEX (LAST), or the value in case
     * of no REGEX found
     */
    public static String getValueBeforeLast(String value, String regex) {
        if (value.contains(regex)) {
            return value.substring(0, value.lastIndexOf(regex));
        } else {
            return value;
        }
    }

    /**
     * Get a value from a string AFTER some REGEX
     *
     * @param value the string value
     * @param regex the regex that is looked for
     * @return the substring value AFTER the REGEX, or the value in case of no
     * REGEX found
     */
    public static String getValueAfter(String value, String regex) {
        if (value.contains(regex)) {
            return value.substring(value.indexOf(regex) + regex.length());
        } else {
            return value;
        }
    }

    /**
     * Get a value from a string AFTER some REGEX (LAST)
     *
     * @param value the string value
     * @param regex the regex that is looked for
     * @return the substring value AFTER the REGEX (LAST), or the value in case
     * of no REGEX found
     */
    public static String getValueAfterLast(String value, String regex) {
        if (value.contains(regex)) {
            return value.substring(value.lastIndexOf(regex) + regex.length());
        } else {
            return value;
        }
    }

    /**
     * Get a value from a string BETWEEN the REGEX1 and REGEX2
     *
     * @param value  the string value
     * @param regex1 the regex that is looked for (after)
     * @param regex2 the regex that is looked for (before)
     * @return the substring value BETWEEN the REGEX1 and REGEX2, or the value
     * in case of no REGEX found
     */
    public static String getValueBetween(String value, String regex1,
                                         String regex2) {
        if (value.contains(regex1) && value.contains(regex2)) {
            return value.substring(value.indexOf(regex1) + regex1.length(),
                    value.indexOf(regex2));
        } else {
            return value;
        }
    }

    /**
     * Get a value from a string BETWEEN the last REGEX1 and REGEX2
     *
     * @param value  the string value
     * @param regex1 the regex that is looked for (after)
     * @param regex2 the regex that is looked for (before)
     * @return the substring value BETWEEN the REGEX1 and REGEX2, or the value
     * in case of no REGEX found
     */
    public static String getValueBetweenLast(String value, String regex1,
                                             String regex2) {
        if (value.contains(regex1) && value.contains(regex2)) {
            return value.substring(value.lastIndexOf(regex1) + regex1.length(),
                    value.lastIndexOf(regex2));
        } else {
            return value;
        }
    }

    /**
     * Filling a number with zeroes ("0") if it is lower than "outputLength"
     * digits
     *
     * @param input        an input string containing a number
     * @param outputLength the desired length of the output
     * @return a number (in string format) which is always at least
     * "outputLength" digits
     */
    public static String formatNumberOfDigits(String input, int outputLength) {
        String formatType = String.format(Locale.getDefault(), "%%0%dd",
                outputLength);

        try {
            input = String.format(formatType, Integer.parseInt(input));
        } catch (Exception e) {
        }

        return input;
    }

    /**
     * Remove the leading zeros in alphanumeric text with regex
     *
     * @param input an input string containing a number
     * @return a number (in string format) with removed leading zeroes (if
     * exist)
     */
    public static String removeLeadingZeroes(String input) {
        try {
            input = input.replaceFirst("^0+(?!$)", "");
        } catch (Exception e) {
        }

        return input;
    }

    /**
     * Get the current date time in format DD.MM.YYY, HH:MM
     *
     * @return the current time in format DD.MM.YYY, HH:MM
     */
    public static String getCurrentDateTime() {
        return DateFormat.format("dd.MM.yyy, kk:mm", new java.util.Date())
                .toString();
    }

    /**
     * Get the current time in format DD.MM.YYY, HH:MM
     *
     * @return the current time in format DD.MM.YYY, HH:MM
     */
    public static String getCurrentTime() {
        return DateFormat.format("kk:mm", new java.util.Date()).toString();
    }

    /**
     * Get the current date in format DD.MM.YYY
     *
     * @return the current date in format DD.MM.YYY
     */
    public static String getCurrentDate() {
        return DateFormat.format("dd.MM.yyy", new java.util.Date()).toString();
    }

    /**
     * Get the current day
     *
     * @return the current day
     */
    private static int getCurrentDay() {
        int day;
        try {
            day = Integer.parseInt(DateFormat
                    .format("dd", new java.util.Date()).toString());
        } catch (Exception e) {
            day = 0;
        }

        return day;
    }

    /**
     * Get the difference between two hours in format HH:MM
     *
     * @param context   Context of the current activity
     * @param afterTime a time after the current moment in format HH:MM
     * @param currTime  the current time in format HH:MM
     * @return the difference between the times
     */
    public static String getTimeDifference(Activity context, String afterTime,
                                           String currTime) {
        String diff = "";
        int afterTimeMillis = 0;
        int currTimeMillis = 0;

        // Format the times in case there is additional information (HH:MM|...)
        // - in case of metro schedule
        afterTime = getValueBefore(afterTime, "|");
        currTime = getValueBefore(currTime, "|");

        // In cases when it is after midnight
        if (afterTime.startsWith("00:") && !currTime.startsWith("00:")) {
            afterTime = afterTime.replaceAll("00:", "24:");
        }

        try {
            afterTimeMillis = new BigDecimal(afterTime.split(":")[0]).intValue()
                    * 60 + new BigDecimal(afterTime.split(":")[1]).intValue();
            currTimeMillis = new BigDecimal(currTime.split(":")[0]).intValue()
                    * 60 + new BigDecimal(currTime.split(":")[1]).intValue();

            diff = (afterTimeMillis - currTimeMillis) + "";

            if (!diff.contains("-")) {
                diff = (new BigDecimal(diff).intValue() / 60) + ":"
                        + (new BigDecimal(diff).intValue() % 60);
                diff = formatTime(context, diff);
            } else {
                diff = "---";
            }
        } catch (Exception e) {

        }

        return diff;
    }

    /**
     * Format the remaining time in format ~1h,20m
     *
     * @param context    Context of the current activity
     * @param difference the difference between the times (current one and the one
     *                   after)
     * @return the difference in format ~1h,20m
     */
    private static String formatTime(Activity context, String difference) {
        String diff = "";
        String[] differenceArr = difference.split(":");

        if (differenceArr.length == 2) {

            if ("".equals(differenceArr[0]) || "0".equals(differenceArr[0])) {
                if (differenceArr[1].length() == 0) {
                    differenceArr[1] = "0"
                            + context.getString(R.string.app_remaining_minutes);
                } else {
                    differenceArr[1] = differenceArr[1]
                            + context.getString(R.string.app_remaining_minutes);
                }

                diff = "~" + differenceArr[1];
            } else {
                differenceArr[0] = differenceArr[0]
                        + context.getString(R.string.app_remaining_hours);
                if (differenceArr[1].length() == 0) {
                    differenceArr[1] = "0"
                            + context.getString(R.string.app_remaining_minutes);
                } else {
                    differenceArr[1] = differenceArr[1]
                            + context.getString(R.string.app_remaining_minutes);
                }

                diff = "~" + differenceArr[0] + " " + differenceArr[1];
            }
        }

        return diff;
    }

    /**
     * Transform the remaining time in minutes
     *
     * @param remainingTime the remaining time in string format
     * @return the remaining time in minutes
     */
    public static int getRemainingMinutes(String remainingTime) {
        int remainingMinutes;

        String[] remainingTimeArray = remainingTime.split(" ");
        if (remainingTimeArray.length == 1) {
            remainingMinutes = Integer.parseInt(Utils
                    .getOnlyDigits(remainingTimeArray[0]));
        } else {
            remainingMinutes = 60
                    * Integer.parseInt(Utils
                    .getOnlyDigits(remainingTimeArray[0]))
                    + Integer.parseInt(Utils
                    .getOnlyDigits(remainingTimeArray[1]));
        }

        return remainingMinutes;
    }

    /**
     * Convert the millis in remaining time format (~Хч Хм)
     *
     * @param context Context of the current activity
     * @param millis  remaining time in millis
     * @return the remaining time in format ~Хч Хм
     */
    public static String formatMillisInTime(Activity context, Long millis) {
        String remainingTime;

        long minutes = (millis / (1000 * 60)) % 60;
        long hour = (millis / (1000 * 60 * 60)) % 24;

        if (hour > 0) {
            remainingTime = "~" + hour
                    + context.getString(R.string.app_remaining_minutes) + " "
                    + minutes
                    + context.getString(R.string.app_remaining_minutes);
        } else {
            remainingTime = "~" + minutes
                    + context.getString(R.string.app_remaining_minutes);
        }

        return remainingTime;
    }

    /**
     * Function that format the direction name of the station or vehicle to be
     * in correct format. In case of an empty string - return "".
     *
     * @param directionName the name of the direction
     * @return the correctly formatted direction
     */
    public static String formatDirectionName(String directionName) {
        if (directionName != null && !"".equals(directionName)) {
            String[] directionNameParts = directionName.trim().split("-");

            switch (directionNameParts.length) {
                case 1:
                    directionName = directionNameParts[0];

                    break;
                case 2:
                case 4:
                    directionNameParts[0] = directionNameParts[0].trim();
                    directionNameParts[0] = directionNameParts[0].replaceAll("\\(",
                            " (");

                    directionNameParts[1] = directionNameParts[1].trim();
                    directionNameParts[1] = getValueBeforeLast(
                            directionNameParts[1], "(");
                    directionNameParts[1] = getValueBefore(directionNameParts[1],
                            "/");

                    directionName = directionNameParts[0] + " - "
                            + directionNameParts[1];
                    directionName = directionName.replaceAll(" +", " ");

                    break;
                case 3:
                case 6:
                    boolean isDirectionThreeParts = true;
                    if (directionNameParts[0].equals(directionNameParts[2])) {
                        isDirectionThreeParts = false;
                    }

                    directionNameParts[0] = directionNameParts[0].trim();
                    directionNameParts[0] = directionNameParts[0].replaceAll("\\(",
                            " (");

                    directionNameParts[1] = directionNameParts[1].trim();

                    directionNameParts[2] = directionNameParts[2].trim();
                    directionNameParts[2] = getValueBeforeLast(
                            directionNameParts[2], "(");
                    directionNameParts[2] = getValueBefore(directionNameParts[2],
                            "/");

                    if (isDirectionThreeParts) {
                        directionName = directionNameParts[0] + " - "
                                + directionNameParts[1] + " - "
                                + directionNameParts[2];
                    } else {
                        directionName = directionNameParts[0] + " - "
                                + directionNameParts[1];
                    }
                    directionName = directionName.replaceAll(" +", " ");

                    break;
                default:
                    break;
            }
        } else {
            directionName = "";
        }

        // Special cases
        directionName = directionName.replaceAll(" - 1 - ", "-1 - ");
        directionName = directionName.replaceAll(" - 1", " 1");
        directionName = directionName.replaceAll("-1", " 1");
        directionName = directionName.replaceAll(" - 2 - ", "-2 - ");
        directionName = directionName.replaceAll(" - 2", " 2");
        directionName = directionName.replaceAll(" - 3 - ", "-3 - ");
        directionName = directionName.replaceAll(" - 3", " 3");
        directionName = directionName.replaceAll(" - 4 - ", "-4 - ");
        directionName = directionName.replaceAll(" - 4", " 4");
        directionName = directionName.replaceAll(" - 5 - ", "-5 - ");
        directionName = directionName.replaceAll(" - 5", " 5");
        directionName = directionName.replaceAll(" - 8 - ", "-8 - ");
        directionName = directionName.replaceAll(" - 8", " 8");
        directionName = directionName.replaceAll("6 - ", "6-");
        directionName = directionName.replaceAll(" - Г", " Г");
        directionName = directionName.replaceAll("н - з", "н-з");
        directionName = directionName.replaceAll("М - ция", "М-ция");
        directionName = directionName.replaceAll("Ц - р", "Ц-р");
        directionName = directionName.replaceAll("Метр\\.", "Метростанция ");
        directionName = directionName.replaceAll("Метрост\\.", "Метростанция ");
        directionName = directionName.replaceAll("Зап\\.", "Западен ");
        directionName = directionName.replaceAll("Ц\\. гара", "Централна гара");
        directionName = directionName.replaceAll("Ц\\.гара", "Централна гара");
        directionName = directionName.replaceAll("Ц\\. Гара", "Централна гара");
        directionName = directionName.replaceAll("Ц\\.Гара", "Централна гара");
        directionName = directionName
                .replaceAll("Ст\\.Град", "Студентски Град");
        directionName = directionName.replaceAll("БУЛ\\. НИКОЛА ПЕТКОВ",
                "бул\\. Никола Петков");
        directionName = directionName.replaceAll("УЛ\\. ДОБРОТИЧ",
                "ул\\. Добротич");
        directionName = directionName.replaceAll("СЕЛО ДОЛНИ ПАСАРЕЛ",
                "Село Долни Пасарел");
        directionName = directionName.replaceAll(
                "АВТОБАЗА ИСКЪР - УЛ\\. ГЕН\\. ГУРКО",
                "Автобаза Искър - ул\\. Генерал Гурко");
        directionName = directionName.replaceAll(
                "Кв\\. Д\\.Миленков - Кв\\. Бусманци",
                "кв\\. Д\\. Миленков - кв\\. Бусманци");
        directionName = directionName.replaceAll("МАНАСТИР СВ\\. МИНА",
                "Манастир Света Мина");
        directionName = directionName.replaceAll("Ж\\.К\\.ГОЦЕ ДЕЛЧЕВ",
                "ж\\.к\\. Гоце Делчев");
        directionName = directionName.replaceAll("ПЛ\\. ОРЛОВ МОСТ",
                "Площад Орлов Мост");
        directionName = directionName.replaceAll("ЛИФТА - ДРАГАЛЕВЦИ",
                "Лифта Драгалевци");
        directionName = directionName.replaceAll(
                "СУ СВ\\.КЛИМЕНТ ОХРИДСКИ - СТУДЕНТСКИ ГРАД",
                "СУ Свети Климент Охридски - Студентски Град");
        directionName = directionName.replaceAll(
                "СУ Св\\. Климент Охридски - СТУДЕНТСКИ ГРАД",
                "СУ Свети Климент Охридски - Студентски Град");
        directionName = directionName.replaceAll("ФОНДОВИ ЖИЛИЩА",
                "Фондови Жилища");
        directionName = directionName.replaceAll("СТУДЕНТСКИ ГРАД",
                "Студентски Град");
        directionName = directionName.replaceAll("В\\.З\\.Бонсови поляни",
                "в.з. Бонсови поляни");
        directionName = directionName.replaceAll("СЕЛО ЖЕЛЯВА", "село Желява");
        directionName = directionName.replaceAll("СЕЛО БАЛША", "Село Балша");
        directionName = directionName.replaceAll("КУЛИНАРЕН К - Т ПЕЙФИЛ",
                "Кулинарен комбинат Пейфил");
        directionName = directionName.replaceAll("СУ Св\\. Климент Охридски",
                "СУ Свети Климент Охридски");
        directionName = directionName.replaceAll(
                "МБАЛ Св\\.Анна - ухо - Ж\\.к\\. Гоце Делчев",
                "МБАЛ Св\\.Анна - Ж\\.к\\. Гоце Делчев");
        directionName = directionName.replaceAll(
                "Ж\\.к\\. Гоце Делчев - МБАЛ Св\\.Анна - ухо",
                "Ж\\.к\\. Гоце Делчев - МБАЛ Св\\.Анна");
        directionName = directionName.replaceAll(" ухо", " ж\\.к\\. Люлин 3");
        directionName = directionName.replaceAll("ДепоИскър", "Депо Искър");
        directionName = directionName.replaceAll("Ж\\.к\\.Люлин 1,2",
                "ж\\.к\\. Люлин 1,2");
        directionName = directionName.replaceAll("Ж\\.К\\.", "Ж\\.к\\.");
        directionName = directionName.replaceAll("Ж\\.К\\. ", "Ж\\.к\\.");
        directionName = directionName.replaceAll("Ж\\.к\\. ", "Ж\\.к\\.");
        directionName = directionName.replaceAll("Ж\\.к\\.", "ж\\.к\\. ");
        directionName = directionName.replaceAll("Кв\\. ", "Кв\\.");
        directionName = directionName.replaceAll("Кв\\.", "кв\\. ");
        directionName = directionName.replaceAll("Ул\\. ", "Ул\\.");
        directionName = directionName.replaceAll("Ул\\.", "ул\\. ");
        directionName = directionName.replaceAll("Пл\\. ", "Пл\\.");
        directionName = directionName.replaceAll("Пл\\.", "Площад ");
        directionName = directionName.replaceAll("С\\. ", "С\\.");
        directionName = directionName.replaceAll("С\\.", "село ");
        directionName = directionName.replaceAll("Бул\\. ", "Бул\\.");
        directionName = directionName.replaceAll("Бул\\.", "бул\\. ");
        directionName = directionName.replaceAll("Бл\\. ", "Бл\\.");
        directionName = directionName.replaceAll("Бл\\.", "бл\\. ");
        directionName = directionName.replaceAll("Св\\. ", "Св\\.");
        directionName = directionName.replaceAll("Св\\.", "Света ");

        // Special cases
        directionName = directionName.replaceAll(
                "кв\\. Орландовци Гара Захарна фабрика",
                "кв\\. Орландовци - Гара Захарна фабрика");
        directionName = directionName.replaceAll(
                "ул\\. Кораб планина Гара Захарна фабрика",
                "ул\\. Кораб планина - Гара Захарна фабрика");
        directionName = directionName.replaceAll(
                "Автостанция Орландовци ГАРА КУРИЛО",
                "Автостанция Орландовци - ГАРА КУРИЛО");
        directionName = directionName.replaceAll("кв\\. Иваняне Гара Обеля",
                "кв\\. Иваняне - Гара Обеля");
        directionName = directionName.replaceAll("АП Малашевци Град Бухово",
                "АП Малашевци - Град Бухово");
        directionName = directionName.replaceAll("УМБАЛСМ Пирогов Гара Искър",
                "УМБАЛСМ Пирогов - Гара Искър");
        directionName = directionName.replaceAll(
                "ЧИТАЛИЩЕ СВЕТЛИНА Гара Искър",
                "ЧИТАЛИЩЕ СВЕТЛИНА - Гара Искър");
        directionName = directionName.replaceAll("жк.Младост 4",
                "ж.к. Младост 4");

        if ("ж.к. Младост 1".equals(directionName)) {
            directionName = directionName.replaceAll("ж\\.к\\. Младост 1",
                    "ж\\.к\\. Младост 1 - ж\\.к\\. Люлин 1,2");
        }

        directionName = directionName.trim().replaceAll("-", " - ");
        directionName = directionName.trim().replaceAll(" +", " ");

        // Special cases
        if (directionName.contains(" - временна")) {
            directionName = directionName
                    .replaceAll(" - временна", "-временна");
        }

        // BUS #4
        if (directionName.contains("ж.к. Младост 1/бл.70/ - Кокалянско ханче")) {
            directionName = directionName.replaceAll(
                    "ж.к. Младост 1/бл\\.70/ - Кокалянско ханче",
                    "ж.к. Младост 1 /бл\\.70/ - Кокалянско ханче");
        }
        if (directionName.contains("Кокалянско ханче - ж.к. Младост 1")) {
            directionName = directionName.replaceAll(
                    "Кокалянско ханче - ж\\.к\\. Младост 1",
                    "Кокалянско ханче - ж\\.к\\. Младост 1 /бл\\.70/");
        }

        // BUS #7
        if (directionName.contains("ЧИТАЛИЩЕ СВЕТЛИНА")) {
            directionName = directionName.replaceAll("ЧИТАЛИЩЕ СВЕТЛИНА",
                    "Читалище Светлина");
        }

        // BUS #9
        if (directionName.contains("АВТОБАЗА ИСКЪР")) {
            directionName = directionName.replaceAll("АВТОБАЗА ИСКЪР",
                    "Автобаза Искър");
        }
        if (directionName.contains("УЛ. ГЕН. ГУРКО")) {
            directionName = directionName.replaceAll("УЛ\\. ГЕН\\. ГУРКО",
                    "ул\\. Генерал Гурко");
        }

        // BUS #14
        if (directionName.contains("Автостанция Изток Гара Искър")) {
            directionName = directionName.replaceAll("Автостанция Изток Гара Искър",
                    "Автостанция Изток - Гара Искър");
        }

        // BUS #23
        if (directionName.contains("ГАРА КУРИЛО")) {
            directionName = directionName.replaceAll("ГАРА КУРИЛО",
                    "Гара Курило");
        }

        // BUS #27
        if (directionName.contains("Село Кътина Гара София север")) {
            directionName = directionName.replaceAll(
                    "Село Кътина Гара София север",
                    "Село Кътина - Гара София север");
        }

        // BUS #59
        if (directionName.contains("АВТОСТАНЦИЯ КНЯЖЕВО")) {
            directionName = directionName.replaceAll("АВТОСТАНЦИЯ КНЯЖЕВО",
                    "Автостанция Княжево");
        }
        if (directionName.contains("село Мърчаево Толумска махала")) {
            directionName = directionName.replaceAll(
                    "село Мърчаево Толумска махала",
                    "село Мърчаево (Толумска махала)");
        }

        // BUS #76
        if (directionName.contains("жк.Младост 4")) {
            directionName = directionName.replaceAll("жк\\.Младост 4",
                    "ж\\.к\\. Младост 4");
        }

        // BUS #84
        if (directionName.contains("ул. Ген Гурко")) {
            directionName = directionName.replaceAll("ул\\. Ген Гурко",
                    "ул\\. Генерал Гурко");
        }

        // BUS #82, #108 and #310
        if (directionName.contains("ж.к. Люлин - 5")) {
            directionName = directionName.replaceAll("ж\\.к\\. Люлин - 5",
                    "ж\\.к\\. Люлин 5");
        }

        // BUS #94
        if (directionName.contains("СУ СВ.КЛИМЕНТ ОХРИДСКИ")) {
            directionName = directionName.replaceAll(
                    "СУ СВ\\.КЛИМЕНТ ОХРИДСКИ", "СУ Свети Климент Охридски");
        }

        // BUS #117
        if (directionName.contains("Автостанция Изток Град Бухово")) {
            directionName = directionName.replaceAll(
                    "Автостанция Изток Град Бухово",
                    "Автостанция Изток - Град Бухово");
        }

        // BUS #280 and #306
        if (directionName.contains("СУ Света Климент Охридски")) {
            directionName = directionName.replaceAll(
                    "СУ Света Климент Охридски", "СУ Свети Климент Охридски");
        }

        // BUS #309
        if ("ж.к. Люлин 1,2".equals(directionName)) {
            directionName = "ж.к. Люлин 1,2 - бул. Илиянци (подлеза)";
        }
        if ("бул. Илиянци - подлеза".equals(directionName)) {
            directionName = "бул. Илиянци (подлеза) - ж.к. Люлин 1,2";
        }

        // BUS #413
        if (directionName.contains("Технополис ж.к.Младост")) {
            directionName = directionName.replaceAll(
                    "Технополис ж\\.к\\.Младост",
                    "Технополис ж\\.к\\. Младост 4");
        }

        // TROLLEY #1
        if ("ж.к. Левски Г".equals(directionName)) {
            directionName = "ж\\.к\\. Левски Г - ВМА";
        }

        // TROLLEY #8
        if (directionName
                .contains("ж.к. Гоце Делчев - МБАЛ Света Анна - ж.к. Люлин 3")) {
            directionName = directionName
                    .replaceAll(
                            "ж\\.к\\. Гоце Делчев - МБАЛ Света Анна - ж\\.к\\. Люлин 3",
                            "ж\\.к\\. Гоце Делчев - МБАЛ Света Анна");
        }

        // TROLLEY #9
        if (directionName.contains("ж. к. Борово")) {
            directionName = directionName.replaceAll("ж\\. к\\. Борово",
                    "ж\\.к\\. Борово");
        }

        // TRAM #19
        if ("кв. Княжево Гара София север".equals(directionName)) {
            directionName = "кв\\. Княжево - Гара София север";
        }

        return directionName;
    }

    /**
     * Add a search to the history of searches, using the searched text
     *
     * @param context         the current Activity context
     * @param historyType     the type of the search - <b>public transport</b> or
     *                        <b>metro</b>
     * @param historyValueArr the value that has to be added to the history of searches
     */
    private static void addSearchInHistory(Activity context,
                                           VehicleTypeEnum historyType, String... historyValueArr) {
        HistoryOfSearches history = HistoryOfSearches.getInstance(context);

        // Get the name of the search
        String historyValue = "";
        if (historyValueArr.length == 1) {
            historyValue = historyValueArr[0];
        } else {
            if (historyValueArr[1] == null || "".equals(historyValueArr[1])) {
                historyValue = historyValueArr[0];
            } else {
                historyValue = String.format(historyValueArr[0] + " (%s)",
                        historyValueArr[1]);
            }
        }

        // Get the search type
        if (historyType == VehicleTypeEnum.METRO1
                || historyType == VehicleTypeEnum.METRO2) {
            historyType = VehicleTypeEnum.METRO;
        }

        // Create the current/last HistoryEntity and searchNumber
        int lastSearchNumber = history.getLastSearchNumber();
        HistoryEntity lastHistoryEntity = history.getLastHistoryEntity(context);

        // Create the next HistoryEntity and searchNumber
        int nextSearchNumber = history.getNextSearchNumber();
        HistoryEntity nextHistoryEntity = new HistoryEntity(historyValue, DateFormat.format("dd.MM.yyyy, kk:mm:ss",
                new java.util.Date()).toString(), historyType);

        // Check if the last HistoryEntity recorded in the SharedPreferences file is
        // the same as the current one (in case of refresh or something similar to this).
        // According to an user (Gmail - Deyan Viktorov), only the time of the history search
        // should be updated
        if (lastHistoryEntity != null && lastHistoryEntity.equals(nextHistoryEntity)) {
            history.putHistoryEntityInPreferences(context, lastSearchNumber, nextHistoryEntity);
        } else {
            history.putHistoryEntityInPreferences(context, nextSearchNumber, nextHistoryEntity);
        }
    }

    /**
     * Add a search to the history of searches, using the station
     *
     * @param context the current Activity context
     * @param station the station that has to be added to the history of searches
     */
    public static void addStationInHistory(Activity context,
                                           StationEntity station) {

        VehicleTypeEnum stationType = station.getType();
        switch (stationType) {
            case METRO:
            case METRO1:
            case METRO2:
                stationType = VehicleTypeEnum.METRO;
                break;
            default:
                stationType = VehicleTypeEnum.BTT;
                break;
        }

        addSearchInHistory(context, stationType, station.getName(),
                station.getNumber());
    }

    /**
     * Add a search to the history of searches, using the station
     *
     * @param context     the current Activity context
     * @param stationsMap the map of stations that has to be added to the history of
     *                    searches
     */
    public static void addListOfStationsInHistory(Activity context,
                                                  HashMap<String, StationEntity> stationsMap) {

        for (Entry<String, StationEntity> stringStationEntityEntry : stationsMap
                .entrySet()) {
            addStationInHistory(context, stringStationEntityEntry.getValue());
        }
    }

    /**
     * Add a search to the history of searches, using the station
     *
     * @param context the current Activity context
     * @param vehicle the vehicle that has to be added to the history of searches
     */
    public static void addVehicleInHistory(Activity context,
                                           VehicleEntity vehicle) {
        addSearchInHistory(context, vehicle.getType(), vehicle.getDirection(),
                vehicle.getNumber());
    }

    /**
     * Check if the device is in landscape mode
     *
     * @param context the current activity context
     * @return if the device is in landscape mode
     */
    public static boolean isInLandscapeMode(Activity context) {

        int currentOrientation = context.getResources().getConfiguration().orientation;
        return currentOrientation == Configuration.ORIENTATION_LANDSCAPE;
    }

    /**
     * Check if the device is tablet in landscape mode
     *
     * @param context the current activity context
     * @return if the device is tablet in landscape mode
     */
    public static boolean isTabletInLandscapeMode(Activity context) {

        GlobalEntity globalContext = (GlobalEntity) context
                .getApplicationContext();
        int currentOrientation = context.getResources().getConfiguration().orientation;

        return !globalContext.isPhoneDevice()
                && currentOrientation == Configuration.ORIENTATION_LANDSCAPE;
    }

    /**
     * Create a list with all items in the NavigationDrawer (each row of the
     * menu)
     *
     * @param context the current activity context
     * @return an ArrayList with all rows of the menu
     */
    public static ArrayList<String> initNavigationDrawerItems(Activity context) {

        ArrayList<String> navigationItems = new ArrayList<String>();

        navigationItems.add(context.getString(R.string.navigation_drawer_home));
        navigationItems.add(context
                .getString(R.string.navigation_drawer_home_standard));
        navigationItems.add(context
                .getString(R.string.navigation_drawer_home_map));
        navigationItems.add(context
                .getString(R.string.navigation_drawer_home_cars));
        navigationItems.add(context.getString(R.string.navigation_drawer_cs));
        navigationItems.add(context
                .getString(R.string.navigation_drawer_route_changes));
        navigationItems.add(context
                .getString(R.string.navigation_drawer_history));
        navigationItems.add(context
                .getString(R.string.navigation_drawer_options));
        navigationItems.add(context.getString(R.string.navigation_drawer_info));
        navigationItems.add(context
                .getString(R.string.navigation_drawer_update));
        navigationItems.add(context
                .getString(R.string.navigation_drawer_backup));
        navigationItems.add(context.getString(R.string.navigation_drawer_exit));

        return navigationItems;
    }

    /**
     * Check if there is an available network connection
     *
     * @param context the current activity context
     * @return if there is a network connection
     */
    public static boolean haveNetworkConnection(Activity context) {

        boolean haveConnectedWifi = false;
        boolean haveConnectedMobile = false;
        boolean haveConnected = false;

        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();

        for (NetworkInfo networkInfo : allNetworkInfo) {
            if ("WIFI".equalsIgnoreCase(networkInfo.getTypeName())) {
                if (networkInfo.isConnected()) {
                    haveConnectedWifi = true;
                }
            }

            if ("MOBILE".equalsIgnoreCase(networkInfo.getTypeName())) {
                if (networkInfo.isConnected()) {
                    haveConnectedMobile = true;
                }
            }
        }

        if (!haveConnectedWifi && !haveConnectedMobile) {
            NetworkInfo networkInfo = connectivityManager
                    .getActiveNetworkInfo();
            haveConnected = networkInfo != null && networkInfo.isAvailable()
                    && networkInfo.isConnected();
        }

        return haveConnectedWifi || haveConnectedMobile || haveConnected;
    }

    /**
     * Get the difference between two dates in days
     *
     * @param startDateString the start date
     * @param endDateString   the end date
     * @return the difference between the start and end date in days
     */
    @SuppressLint("SimpleDateFormat")
    public static int getDateDifferenceInDays(String startDateString,
                                              String endDateString) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                    "dd.MM.yyyy");
            Date startDate = simpleDateFormat.parse(startDateString);
            Date endDate = simpleDateFormat.parse(endDateString);

            long difference = endDate.getTime() - startDate.getTime();
            int daysDifference = (int) (difference / (1000 * 60 * 60 * 24));

            return daysDifference;
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * Get the closest date when the app had to be updated
     *
     * @param updateType the update type (what would be updated - APP or DB)
     * @return the closest date when the app had to be updated
     */
    private static String getClosestDateForUpdate(UpdateTypeEnum updateType) {
        String closestDateForUpdate;

        Integer[] daysForUpdate;
        int currentDay = getCurrentDay();

        switch (updateType) {
            case APP:
                daysForUpdate = DAYS_FOR_APP_UPDATE
                        .toArray(new Integer[DAYS_FOR_APP_UPDATE.size()]);
                closestDateForUpdate = daysForUpdate[0] + "";

                break;
            default:
                daysForUpdate = DAYS_FOR_DB_UPDATE
                        .toArray(new Integer[DAYS_FOR_DB_UPDATE.size()]);

                if (currentDay >= daysForUpdate[1]) {
                    closestDateForUpdate = daysForUpdate[1] + "";
                } else {
                    closestDateForUpdate = daysForUpdate[0] + "";
                }

                break;
        }

        closestDateForUpdate += "." + getValueAfter(getCurrentDate(), ".");

        return closestDateForUpdate;
    }

    /**
     * Check if the date for update is in range
     *
     * @param startDateString the start date in string format
     * @param endDateString   the end date in string format
     * @param updateType      the update type (what would be updated - APP or DB)
     * @return if the date is in range
     */
    public static boolean isDateInRange(String startDateString,
                                        String endDateString, UpdateTypeEnum updateType) {
        int startCheckDifference = getDateDifferenceInDays(startDateString,
                getClosestDateForUpdate(updateType));
        int endCheckDifference = getDateDifferenceInDays(
                getClosestDateForUpdate(updateType), endDateString);

        return startCheckDifference > 0 && endCheckDifference > 0;
    }

    /**
     * Check if an application or database update is available (APP - one per
     * month, DB - twice per month)
     *
     * @param context    the current activity context
     * @param updateType the update type (what would be updated - APP or DB)
     */
    public static void checkForUpdate(FragmentActivity context,
                                      UpdateTypeEnum updateType) {

        // Get "automaticUpdate" value from the SharedPreferences file
        boolean automaticUpdate = PreferenceManager
                .getDefaultSharedPreferences(context).getBoolean(
                        Constants.PREFERENCE_KEY_AUTOMATIC_UPDATE,
                        Constants.PREFERENCE_DEFAULT_VALUE_AUTOMATIC_UPDATE);

        // Update the application if the user selected the option in the
        // Preferences file
        if (automaticUpdate) {
            Set<Integer> daysForUpdate;
            switch (updateType) {
                case APP:
                    daysForUpdate = DAYS_FOR_APP_UPDATE;
                    break;
                default:
                    daysForUpdate = DAYS_FOR_DB_UPDATE;
                    break;
            }

            boolean haveInternetConnection = haveNetworkConnection(context);
            boolean isFirstOrDelayedUpdate = CheckForUpdatesPreferences
                    .isFirstOrDelayedUpdate(context, getCurrentDate(),
                            updateType);
            boolean isDayForUpdate = daysForUpdate.contains(getCurrentDay());
            boolean isUpdateAlreadyChecked = CheckForUpdatesPreferences
                    .isUpdateAlreadyChecked(context, getCurrentDate(),
                            updateType);

            if (haveInternetConnection
                    && (isFirstOrDelayedUpdate || (isDayForUpdate && !isUpdateAlreadyChecked))) {
                new CheckForUpdatesAsync(context, updateType).execute();
            }
        }
    }

    /**
     * Check if the version is before HONEYCOMB
     *
     * @return if the version is before HONEYCOMB
     */
    public static boolean isPreHoneycomb() {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB;
    }

    /**
     * Decode drawable to a Bitmap (save the allocated memory, but doesn't
     * really help)
     *
     * @param context the activity context
     * @param resId   the drawable res id
     * @return the decoded bitmap
     */
    public static Bitmap decodeDrawable(Activity context, int resId) {

        // Decode image size
        BitmapFactory.Options o = new BitmapFactory.Options();
        BitmapFactory.decodeResource(context.getResources(), resId, o);
        o.inJustDecodeBounds = true;

        // In Samsung Galaxy S3, typically max memory is 64mb
        // Camera max resolution is 3264 x 2448, times 4 to get Bitmap
        // memory of 30.5mb for one bitmap
        // If we use scale of 2, resolution will be halved, 1632 x 1224 and
        // x 4 to get Bitmap memory of 7.62mb
        // We try use 25% memory which equals to 16mb maximum for one bitmap
        long maxMemory = Runtime.getRuntime().maxMemory();
        int maxMemoryForImage = (int) (maxMemory / 100 * 25);

        // Refer to
        // http://developer.android.com/training/displaying-bitmaps/cache-bitmap.html
        // A full screen GridView filled with images on a device with
        // 800x480 resolution would use around 1.5MB (800*480*4 bytes)
        // When bitmap option's inSampleSize doubled, pixel height and
        // weight both reduce in half
        int scale = 1;
        while ((o.outWidth / scale) * (o.outHeight / scale) * 4 > maxMemoryForImage)
            scale *= 2;

        // Decode with inSampleSize
        BitmapFactory.Options o2 = new BitmapFactory.Options();
        o2.inSampleSize = scale;
        Bitmap b = BitmapFactory.decodeResource(context.getResources(), resId,
                o2);

        return b;
    }

    /**
     * Get the size of the screen in inches
     *
     * @param context the current activity context
     * @return the screen size in inches
     */
    public static double getScreenSizeInInches(Activity context) {

        DisplayMetrics dm = new DisplayMetrics();
        context.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        int dens = dm.densityDpi;
        double wi = (double) width / (double) dens;
        double hi = (double) height / (double) dens;
        double x = Math.pow(wi, 2);
        double y = Math.pow(hi, 2);
        double screenInches = Math.sqrt(x + y);

        return screenInches;
    }

    /**
     * Get the current date in format DD.MM.YYY
     *
     * @return the current date in format DD.MM.YYY
     */
    public static String getScheduleCacheTimestamp() {
        return DateFormat.format("yyyy-MM-dd", new java.util.Date()).toString();
    }

    /**
     * Format the schedule cache timestamp in format DD.MM.YYY
     *
     * @param timestamp the database timestamp
     * @return the formatted timestamp
     */
    @SuppressLint("SimpleDateFormat")
    public static String formatScheduleCacheTimestamp(String timestamp) {

        String formattedTimestamp;
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(timestamp);
            formattedTimestamp = DateFormat.format("dd.MM.yyy", date)
                    .toString();
        } catch (ParseException e) {
            // This case should not be reached
            formattedTimestamp = timestamp;
        }

        return formattedTimestamp;
    }

    /**
     * Get the current day and month in format DDMM (if the current date is
     * 01-01-2015, take 0101 as a string)
     *
     * @return the current day and month in format DDMM
     */
    public static String getCurrentDayMonth() {
        return DateFormat.format("ddMM", new java.util.Date()).toString();
    }

    /**
     * Get the Android version of the device (Android xx.xx (XX), SDK=xx)
     *
     * @return the android version of the device
     */
    public static String getDeviceOsVersion() {

        StringBuilder deviceOsVersion = new StringBuilder();
        deviceOsVersion.append("Android ").append(Build.VERSION.RELEASE);

        Field[] fields = Build.VERSION_CODES.class.getFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            int fieldValue = -1;

            try {
                fieldValue = field.getInt(new Object());
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }

            if (fieldValue == Build.VERSION.SDK_INT) {
                deviceOsVersion.append(" (").append(fieldName).append("), ");
                deviceOsVersion.append("SDK=").append(fieldValue);
            }
        }

        return deviceOsVersion.toString();
    }

    /**
     * Check if a given filename is valid according to the OS rules
     *
     * @param filename the filename to check
     * @return if the filename is valid or not
     */
    public static boolean isFilenameValid(String filename) {
        if (isEmpty(filename)) {
            return false;
        }

        File file = new File(filename);
        try {
            file.getCanonicalPath();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    /**
     * Check if a given file path has read/write permission
     *
     * @param filePath the file path to check
     * @return if the file path has read/write permission
     */
    public static boolean hasWritePermissions(String filePath) {
        if (isEmpty(filePath)) {
            return false;
        }

        File file = new File(filePath);
        return file.canWrite();
    }

    /**
     * Check if a given file already exists
     *
     * @param filePath the file to check
     * @return if the file already exists
     */
    public static boolean isFileExists(String filePath) {
        if (isEmpty(filePath)) {
            return false;
        }

        File file = new File(filePath);
        return file.exists();
    }

    /**
     * Check if there is enough space to save the file
     *
     * @param filePath the file path to check
     * @return if there is enough space to save the file
     */
    @SuppressWarnings("deprecation")
    public static float getAvailableSpaceInBytes(String filePath) {
        if (isEmpty(filePath)) {
            return 0.f;
        }

        StatFs stat = new StatFs(filePath);

        long bytesAvailable;
        bytesAvailable = Build.VERSION.SDK_INT >= 18 ? getAvailableSpaceInBytes(stat) : (long) stat.getBlockSize() * (long) stat.getAvailableBlocks();

        return bytesAvailable;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    private static long getAvailableSpaceInBytes(StatFs stat) {
        return stat.getBlockSizeLong() * stat.getAvailableBlocksLong();
    }

    /**
     * Returns the name of the file or directory represented by this file
     *
     * @param filepath the selected filepath
     * @return the filename of the given filepath
     */
    public static String getFilenameFromPath(String filepath) {
        return new File(filepath).getName();
    }

    /**
     * Returns the filepath only or the parent directory
     * (Example: C:\\abcfolder\\textfile.txt“ --> “C:\\abcfolder\\“)
     *
     * @param filepath the selected filepath
     * @return the filepath only
     */
    public static String getParentPathFromPath(String filepath) {
        if (isEmpty(filepath)) {
            return "";
        }

        String absolutePath = new File(filepath).getAbsolutePath();
        String parentPath = absolutePath.substring(0, absolutePath.lastIndexOf(File.separator)) + File.separator;

        return parentPath;
    }

    /**
     * Returns the file name without its <a href="http://en.wikipedia.org/wiki/Filename_extension">file extension</a> or path.
     * This is similar to the {@code basename} unix command. The result does not include the '{@code .}'.
     *
     * @param filepath The name of the file to trim the extension from. This can be either a fully
     *                 qualified file name (including a path) or just a file name.
     * @return The file name without its path or extension.
     */
    public static String getFilenameWithoutExtension(String filepath) {
        if (isEmpty(filepath)) {
            return "";
        }

        String fileName = getFilenameFromPath(filepath);
        int dotIndex = fileName.lastIndexOf('.');

        return (dotIndex == -1) ? fileName : fileName.substring(0, dotIndex);
    }

    /**
     * Deletes the given folder and all its files/subfolders recursively
     *
     * @param fileOrDirectory the file or folder path to delete recursively
     * @return if the delete procedure was successful
     */
    public static boolean deleteFileOrDirectory(String fileOrDirectory) {
        return isEmpty(fileOrDirectory) || deleteFileOrDirectory(new File(fileOrDirectory));

    }

    /**
     * Deletes the given folder and all its files/subfolders recursively
     *
     * @param fileOrDirectory the file or folder to delete recursively
     * @return if the delete procedure was successful
     */
    private static boolean deleteFileOrDirectory(File fileOrDirectory) {

        if (fileOrDirectory.exists()) {

            File[] files = fileOrDirectory.listFiles();
            if (files == null) {
                return fileOrDirectory.delete();
            }

            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFileOrDirectory(file);
                } else {
                    file.delete();
                }
            }
        }

        return (fileOrDirectory.delete());
    }

    /**
     * This method copies a file or directory to the target file or directory (if targetLocation does not exist, it will be created)
     *
     * @param sourceLocation the source file/directory location
     * @param targetLocation the target location
     * @throws IOException
     */
    public static void copyAndReplaceFileOrDirectory(String sourceLocation, String targetLocation) throws IOException {
        if (isEmpty(sourceLocation)) {
            return;
        }

        copyAndReplaceFileOrDirectory(new File(sourceLocation), new File(targetLocation));
    }

    /**
     * This method copies a file or directory to the target file or directory (if targetLocation does not exist, it will be created)
     *
     * @param sourceLocation the source file/directory
     * @param targetLocation the target directory
     * @throws IOException
     */
    private static void copyAndReplaceFileOrDirectory(File sourceLocation, File targetLocation) throws IOException {

        if (sourceLocation.isDirectory()) {
            copyAndReplaceDirectory(sourceLocation, targetLocation);
        } else {
            copyAndReplaceFile(sourceLocation, targetLocation, 1);
        }
    }

    /**
     * Copies the source directory to the target location and replace it if existing
     *
     * @param sourceLocation the source directory
     * @param targetLocation the target directory
     * @throws IOException
     */
    private static void copyAndReplaceDirectory(File sourceLocation, File targetLocation) throws IOException {

        if (!targetLocation.exists()) {
            targetLocation.mkdir();
        }

        String[] children = sourceLocation.list();
        for (String child : children) {
            copyAndReplaceFileOrDirectory(new File(sourceLocation, child),
                    new File(targetLocation, child));
        }
    }

    /**
     * Copies all bytes from an input stream to a file. If the target file exists, than it is replaced.
     *
     * @param sourceLocation the source file
     * @param targetLocation the target directory
     * @param copyAttempts   indicates the consecutive number of times this method is called recursively
     * @throws IOException
     */
    private static void copyAndReplaceFile(File sourceLocation, File targetLocation, int copyAttempts) throws IOException {

        try {
            // As this method is copy and replace, we should firstly remove the file
            // and after that write the new one on its place
            if (targetLocation.exists()) {
                targetLocation.delete();
            }

            InputStream in = new FileInputStream(sourceLocation);
            OutputStream out = new FileOutputStream(targetLocation);

            // Copy the bits from input stream to output stream
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            if (copyAttempts == MAX_COPY_FILE_ATTEMPTS) {
                throw e;
            } else {
                copyAndReplaceFile(sourceLocation, targetLocation, copyAttempts + 1);
            }
        }
    }

    /**
     * Returns the contents of the file in a byte array
     *
     * @param fileLocation the source file location
     * @return the content of the file in a byte array
     * @throws IOException
     */
    public static byte[] getBytesFromFile(String fileLocation) throws IOException {
        return getBytesFromFile(new File(fileLocation));
    }

    /**
     * Returns the contents of the file in a byte array
     *
     * @param file the source file
     * @return the content of the file in a byte array
     * @throws IOException
     */
    private static byte[] getBytesFromFile(File file) throws IOException {

        // Get the size of the file
        long length = file.length();

        // You cannot create an array using a long type. It needs to be an int type.
        // Before converting to an int type, check to ensure that file is not larger than Integer.MAX_VALUE.
        if (length > Integer.MAX_VALUE) {
            // File is too large
            throw new IOException("File is too large!");
        }

        // Create the byte array to hold the data
        byte[] bytes = new byte[(int) length];

        // Read in the bytes
        int offset = 0;
        int numRead = 0;

        InputStream is = new FileInputStream(file);
        try {
            while (offset < bytes.length
                    && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                offset += numRead;
            }
        } finally {
            is.close();
        }

        // Ensure all the bytes have been read in
        if (offset < bytes.length) {
            throw new IOException("Could not completely read file " + file.getName());
        }

        return bytes;
    }

    /**
     * Creating a binary file that will overwrite the file (if exists)
     *
     * @param fileLocation the source file location
     * @param data         the content of the file
     * @throws IOException
     */
    public static void writeBytesToFile(String fileLocation, byte[] data) throws Exception {

        FileOutputStream fileOutputStream = new FileOutputStream(fileLocation);
        fileOutputStream.write(data);
        fileOutputStream.close();
    }

}