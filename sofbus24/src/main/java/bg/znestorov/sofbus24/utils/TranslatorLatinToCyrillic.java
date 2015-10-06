package bg.znestorov.sofbus24.utils;

import android.content.Context;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Class which is used to transcode the <b>Latin</b> text to a <b>Cyrillic</b>
 * one using a table with the symbol translations
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class TranslatorLatinToCyrillic {

    private static final Map<String, String> translatorMap;

    static {
        translatorMap = new HashMap<String, String>();
        translatorMap.put("a", "а");
        translatorMap.put("b", "б");
        translatorMap.put("v", "в");
        translatorMap.put("g", "г");
        translatorMap.put("d", "д");
        translatorMap.put("e", "е");
        translatorMap.put("zh", "ж");
        translatorMap.put("z", "з");
        translatorMap.put("i", "и");
        translatorMap.put("j", "й");
        translatorMap.put("k", "к");
        translatorMap.put("l", "л");
        translatorMap.put("m", "м");
        translatorMap.put("n", "н");
        translatorMap.put("o", "о");
        translatorMap.put("p", "п");
        translatorMap.put("r", "р");
        translatorMap.put("s", "с");
        translatorMap.put("t", "т");
        translatorMap.put("u", "у");
        translatorMap.put("f", "ф");
        translatorMap.put("h", "х");
        translatorMap.put("c", "ц");
        translatorMap.put("ch", "ч");
        translatorMap.put("sh", "ш");
        translatorMap.put("sht", "щ");
        translatorMap.put("y", "ъ");
        translatorMap.put("yu", "ю");
        translatorMap.put("ya", "я");
        translatorMap.put("A", "А");
        translatorMap.put("B", "Б");
        translatorMap.put("V", "В");
        translatorMap.put("G", "Г");
        translatorMap.put("D", "Д");
        translatorMap.put("E", "Е");
        translatorMap.put("ZH", "Ж");
        translatorMap.put("Z", "З");
        translatorMap.put("I", "И");
        translatorMap.put("J", "Й");
        translatorMap.put("K", "К");
        translatorMap.put("L", "Л");
        translatorMap.put("M", "М");
        translatorMap.put("N", "Н");
        translatorMap.put("O", "О");
        translatorMap.put("P", "П");
        translatorMap.put("R", "Р");
        translatorMap.put("S", "С");
        translatorMap.put("T", "Т");
        translatorMap.put("U", "У");
        translatorMap.put("F", "Ф");
        translatorMap.put("H", "Х");
        translatorMap.put("C", "Ц");
        translatorMap.put("CH", "Ч");
        translatorMap.put("SH", "Ш");
        translatorMap.put("SHT", "Щ");
        translatorMap.put("Y", "Ъ");
        translatorMap.put("YU", "Ю");
        translatorMap.put("YA", "Я");
    }

    private TranslatorLatinToCyrillic() {
    }

    /**
     * Translate the input Latin text to a Cyrillic one using a table with the
     * translation
     *
     * @param context the current activity context
     * @param input   the input text in Latin
     * @return the transcoded Latin text in a Cyrillic format
     */
    public static String translate(Context context, String input) {
        StringBuilder output = new StringBuilder("");
        Locale currentLocale = new Locale(LanguageChange.getUserLocale(context));

        if (input != null && !"".equals(input)) {
            int j = 1;
            boolean capitalFlag = false;

            for (int i = 0; i < input.length(); i = i + j) {

                // Case there are at least 3 more symbols
                if (input.substring(i).length() > 2) {
                    capitalFlag = Character.isUpperCase(input.charAt(i))
                            || Character.isUpperCase(input.charAt(i + 1))
                            || Character.isUpperCase(input.charAt(i + 2));

                    String latinSymbol = "" + input.charAt(i)
                            + input.charAt(i + 1) + input.charAt(i + 2);
                    latinSymbol = latinSymbol.toLowerCase(currentLocale);
                    String cyrillicSymbol = translatorMap.get(latinSymbol);

                    if (cyrillicSymbol == null) {
                        capitalFlag = Character.isUpperCase(input.charAt(i))
                                || Character.isUpperCase(input.charAt(i + 1));

                        latinSymbol = "" + input.charAt(i)
                                + input.charAt(i + 1);
                        latinSymbol = latinSymbol.toLowerCase(currentLocale);
                        cyrillicSymbol = translatorMap.get(latinSymbol);

                        if (cyrillicSymbol == null) {
                            latinSymbol = "" + input.charAt(i);
                            cyrillicSymbol = translatorMap.get(latinSymbol);

                            if (cyrillicSymbol == null) {
                                output.append(latinSymbol);
                                j = 1;
                            } else {
                                output.append(cyrillicSymbol);
                                j = 1;
                            }
                        } else {
                            if (capitalFlag) {
                                output.append(cyrillicSymbol
                                        .toUpperCase(currentLocale));
                            } else {
                                output.append(cyrillicSymbol);
                            }
                            j = 2;
                        }
                    } else {
                        if (capitalFlag) {
                            output.append(cyrillicSymbol
                                    .toUpperCase(currentLocale));
                        } else {
                            output.append(cyrillicSymbol);
                        }
                        j = 3;
                    }
                    // Case there are 2 more symbols
                } else if (input.substring(i).length() == 2) {
                    capitalFlag = Character.isUpperCase(input.charAt(i))
                            || Character.isUpperCase(input.charAt(i + 1));

                    String latinSymbol = "" + input.charAt(i)
                            + input.charAt(i + 1);
                    latinSymbol = latinSymbol.toLowerCase(currentLocale);
                    String cyrillicSymbol = translatorMap.get(latinSymbol);

                    if (cyrillicSymbol == null) {
                        latinSymbol = "" + input.charAt(i);
                        cyrillicSymbol = translatorMap.get(latinSymbol);

                        if (cyrillicSymbol == null) {
                            output.append(latinSymbol);
                            j = 1;
                        } else {
                            output.append(cyrillicSymbol);
                            j = 1;
                        }
                    } else {
                        if (capitalFlag) {
                            output.append(cyrillicSymbol
                                    .toUpperCase(currentLocale));
                        } else {
                            output.append(cyrillicSymbol);
                        }
                        j = 2;
                    }
                    // Case there is 1 more symbol
                } else if (input.substring(i).length() == 1) {
                    String latinSymbol = "" + input.charAt(i);
                    String cyrillicSymbol = translatorMap.get(latinSymbol);

                    if (cyrillicSymbol == null) {
                        output.append(latinSymbol);
                        j = 1;
                    } else {
                        output.append(cyrillicSymbol);
                        j = 1;
                    }
                }
            }
        }

        return output.toString();
    }

}
