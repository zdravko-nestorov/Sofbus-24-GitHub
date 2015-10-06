package bg.znestorov.sofbus24.utils;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Class which is used to transcode the <b>Cyrillic</b> text to a <b>Latin</b>
 * one using a table with the symbol translations
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class TranslatorCyrillicToLatin {

    private static final Map<String, String> translatorMap;

    static {
        translatorMap = new HashMap<String, String>();
        translatorMap.put("а", "a");
        translatorMap.put("б", "b");
        translatorMap.put("в", "v");
        translatorMap.put("г", "g");
        translatorMap.put("д", "d");
        translatorMap.put("е", "e");
        translatorMap.put("ж", "zh");
        translatorMap.put("з", "z");
        translatorMap.put("и", "i");
        translatorMap.put("й", "j");
        translatorMap.put("к", "k");
        translatorMap.put("л", "l");
        translatorMap.put("м", "m");
        translatorMap.put("н", "n");
        translatorMap.put("о", "o");
        translatorMap.put("п", "p");
        translatorMap.put("р", "r");
        translatorMap.put("с", "s");
        translatorMap.put("т", "t");
        translatorMap.put("у", "u");
        translatorMap.put("ф", "f");
        translatorMap.put("х", "h");
        translatorMap.put("ц", "c");
        translatorMap.put("ч", "ch");
        translatorMap.put("ш", "sh");
        translatorMap.put("щ", "sht");
        translatorMap.put("ъ", "y");
        translatorMap.put("ь", "j");
        translatorMap.put("ю", "yu");
        translatorMap.put("я", "ya");
        translatorMap.put("А", "A");
        translatorMap.put("Б", "B");
        translatorMap.put("В", "V");
        translatorMap.put("Г", "G");
        translatorMap.put("Д", "D");
        translatorMap.put("Е", "E");
        translatorMap.put("Ж", "Zh");
        translatorMap.put("З", "Z");
        translatorMap.put("И", "I");
        translatorMap.put("Й", "J");
        translatorMap.put("К", "K");
        translatorMap.put("Л", "L");
        translatorMap.put("М", "M");
        translatorMap.put("Н", "N");
        translatorMap.put("О", "O");
        translatorMap.put("П", "P");
        translatorMap.put("Р", "R");
        translatorMap.put("С", "S");
        translatorMap.put("Т", "T");
        translatorMap.put("У", "U");
        translatorMap.put("Ф", "F");
        translatorMap.put("Х", "H");
        translatorMap.put("Ц", "C");
        translatorMap.put("Ч", "Ch");
        translatorMap.put("Ш", "Sh");
        translatorMap.put("Щ", "Sht");
        translatorMap.put("Ъ", "Y");
        translatorMap.put("Ь", "J");
        translatorMap.put("Ю", "Yu");
        translatorMap.put("Я", "Ya");
    }

    private TranslatorCyrillicToLatin() {
    }

    /**
     * Translate the input Cyrillic text to a Latin one using a table with the
     * translation
     *
     * @param context the current activity context
     * @param input   the input text in Latin
     * @return the transcoded Cyrillic text in a Latin format
     */
    public static String translate(Context context, String input) {
        StringBuilder output = new StringBuilder("");
        Locale currentLocale = new Locale(LanguageChange.getUserLocale(context));

        if (input != null && !"".equals(input)) {
            boolean capitalFlag = false;

            for (int i = 0; i < input.length(); i++) {
                // Check if the first letter (but not last) is a Capital one
                if (i == 0 && i < input.length() - 1) {
                    capitalFlag = Character.isUpperCase(input.charAt(i + 1));
                }

                // Check if a letter between the first and last is a Capital one
                if (i > 0 && i < input.length() - 1) {
                    capitalFlag = (Character.isUpperCase(input.charAt(i - 1)) || input
                            .charAt(i - 1) == ' ')
                            && (Character.isUpperCase(input.charAt(i + 1)) || input
                            .charAt(i + 1) == ' ')
                            && !(input.charAt(i - 1) == ' ' && input
                            .charAt(i + 1) == ' ');
                }

                // Check if the last letter (but not first) is a Capital one
                if (i > 0 && i == input.length() - 1) {
                    capitalFlag = Character.isUpperCase(input.charAt(i - 1));
                }

                String cyrillicSymbol = input.charAt(i) + "";
                String latinSymbol = translatorMap.get(cyrillicSymbol);

                if (latinSymbol == null) {
                    output.append(cyrillicSymbol);
                } else {
                    if (capitalFlag) {
                        latinSymbol = latinSymbol.toUpperCase(currentLocale);
                    }
                    output.append(latinSymbol);
                }
            }
        }

        return output.toString();
    }

    /**
     * Translate an array of String from Cyrillic to Latin
     *
     * @param arrayToTranslate the input array
     * @return the translated array
     */
    public static String[] translate(Context context, String[] arrayToTranslate) {
        String[] output = null;

        if (arrayToTranslate != null && arrayToTranslate.length != 0) {
            output = new String[arrayToTranslate.length];

            for (int i = 0; i < arrayToTranslate.length; i++) {
                output[i] = translate(context, arrayToTranslate[i]);
            }
        }

        return output;
    }

    /**
     * Translate a list of String from Cyrillic to Latin
     *
     * @param listToTranslate the input list
     * @return the translated list
     */
    public static ArrayList<String> translate(Context context,
                                              ArrayList<String> listToTranslate) {
        ArrayList<String> output = null;

        if (listToTranslate != null && listToTranslate.size() != 0) {
            output = new ArrayList<String>();

            for (int i = 0; i < listToTranslate.size(); i++) {
                output.add(translate(context, listToTranslate.get(i)));
            }
        }

        return output;
    }
}
