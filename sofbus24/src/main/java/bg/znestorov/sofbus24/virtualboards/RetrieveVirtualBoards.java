package bg.znestorov.sofbus24.virtualboards;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.Html;
import android.text.InputType;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreProtocolPNames;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bg.znestorov.sofbus24.databases.FavouritesDataSource;
import bg.znestorov.sofbus24.databases.StationsDataSource;
import bg.znestorov.sofbus24.entity.GlobalEntity;
import bg.znestorov.sofbus24.entity.HtmlRequestCodesEnum;
import bg.znestorov.sofbus24.entity.HtmlResultCodesEnum;
import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VirtualBoardsStationEntity;
import bg.znestorov.sofbus24.main.R;
import bg.znestorov.sofbus24.main.VirtualBoardsTime;
import bg.znestorov.sofbus24.main.VirtualBoardsTimeDialog;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.TranslatorLatinToCyrillic;
import bg.znestorov.sofbus24.utils.Utils;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;
import bg.znestorov.sofbus24.utils.activity.ActivityUtils;

/**
 * It is used to retrieve the information from the SKGT site and transform it in
 * an appropriate form, according to the activity called it
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
@SuppressLint("DefaultLocale")
public class RetrieveVirtualBoards {

    private static final String NDK_TUNNEL = "НДКТУНЕЛ";
    private static final String NDK_GRAFITTI = "НДКГРАФИТИ";
    private Activity context;
    private GlobalEntity globalContext;
    private Object callerInstance;
    private StationEntity station;
    private HtmlRequestCodesEnum htmlRequestCode;
    private HtmlResultCodesEnum htmlResultCode;
    private DefaultHttpClient httpClient;
    private StationsDataSource stationsDatasource;
    private FavouritesDataSource favouriteDatasource;
    /**
     * Indicates if the search is one of the special ones ([1137, 1138 -
     * НДК-тунел], [1139 - НДК-Графити]). In these cases, the procedure of
     * retrieving information is changed (uses the previous stations' times)
     */
    private boolean isSpecialCase;
    /**
     * Indicates if the first time when the captch is required, the captch hack
     * is used - this means that instead of captch we should use the current
     * date in format MMDD
     */
    private boolean isCaptchaHackUsed = false;

    public RetrieveVirtualBoards(Activity context, Object callerInstance,
                                 StationEntity station, HtmlRequestCodesEnum htmlRequestCode) {

        // Set the current activity context and the object that created an
        // instance of this class
        this.context = context;
        this.globalContext = (GlobalEntity) context.getApplicationContext();
        this.callerInstance = callerInstance;

        // Set the selected station
        setCustomField(station);
        this.station = station;

        // Set the type of call to the class
        this.htmlRequestCode = htmlRequestCode;

        // Creating a HTTP Client
        this.httpClient = new DefaultHttpClient();

        // Create an instance of the stations and the favourite database
        this.stationsDatasource = new StationsDataSource(context);
        this.favouriteDatasource = new FavouritesDataSource(context);
    }

    /**
     * Retrieve the information for the selected station
     */
    public void getSumcInformation() {

        ActivityTracker.queriedVirtualBoardsInformation(context);
        ActivityTracker.queriedVirtualBoardsInformationType(context,
                htmlRequestCode);

        // Load the cookies from the preferences (if exists)
        loadCookiesFromPreferences();

        // Create the appropriate progress dialog message (if searched by
        // HomeScreen - show only the searched string, otherwise - the station
        // caption)
        Spanned progressDialogMsg = getToastMsg(context
                .getString(R.string.vb_time_retrieve_info));

        // Making HttpRequest and showing a progress dialog if needed
        ProgressDialog progressDialog = createProgressDialog(progressDialogMsg);
        RetrieveSumcInformation retrieveSumcInformation = new RetrieveSumcInformation(
                progressDialog, null, null);
        retrieveSumcInformation.execute();
    }

    /**
     * Getting the value for the CAPTCHA code and put it in a SharedPreferences
     * file - containing the information in key=value format. It is saved on the
     * internal memory of the device and contains all cookies from the request.
     */
    private void saveCookiesToPreferences() {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.VB_PREFERENCES_NAME_SUMC_COOKIES,
                Context.MODE_PRIVATE);
        Editor edit = sharedPreferences.edit();
        edit.clear();

        int i = 0;
        for (Cookie cookie : httpClient.getCookieStore().getCookies()) {
            edit.putString(Constants.VB_PREFERENCES_COOKIE_NAME + i,
                    cookie.getName());
            edit.putString(Constants.VB_PREFERENCES_COOKIE_VALUE + i,
                    cookie.getValue());
            edit.putString(Constants.VB_PREFERENCES_COOKIE_DOMAIN + i,
                    cookie.getDomain());
            edit.putString(Constants.VB_PREFERENCES_COOKIE_PATH + i,
                    cookie.getPath());
            i++;
        }
        edit.commit();
    }

    /**
     * Getting the value for the CAPTCHA code from a SharedPreferences file that
     * contains the information in key=value format. It is saved on the internal
     * memory of the device, containing the cookies needed for sending a new
     * request
     */
    private void loadCookiesFromPreferences() {

        CookieStore cookieStore = httpClient.getCookieStore();
        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.VB_PREFERENCES_NAME_SUMC_COOKIES,
                Context.MODE_PRIVATE);

        int i = 0;
        while (sharedPreferences.contains(Constants.VB_PREFERENCES_COOKIE_NAME
                + i)) {
            final String name = sharedPreferences.getString(
                    Constants.VB_PREFERENCES_COOKIE_NAME + i, null);
            final String value = sharedPreferences.getString(
                    Constants.VB_PREFERENCES_COOKIE_VALUE + i, null);
            final BasicClientCookie result = new BasicClientCookie(name, value);

            result.setDomain(sharedPreferences.getString(
                    Constants.VB_PREFERENCES_COOKIE_DOMAIN + i, null));
            result.setPath(sharedPreferences.getString(
                    Constants.VB_PREFERENCES_COOKIE_PATH + i, null));
            cookieStore.addCookie(result);
            i++;
        }
    }

    /**
     * Getting the key and the value for the hidden variables and put them in a
     * SharedPreferences file - containing the information in key=value format.
     * It is saved on the internal memory of the device.
     *
     * @param htmlSourceCode the html source code
     */
    private ArrayList<BasicNameValuePair> saveHiddenVariablesToPreferences(
            String htmlSourceCode) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.VB_PREFERENCES_NAME_SUMC_HIDDEN_VARIABLES,
                Context.MODE_PRIVATE);
        ArrayList<BasicNameValuePair> hiddenVariablesList = new ArrayList<BasicNameValuePair>();

        if (htmlSourceCode != null) {
            Pattern pattern = Pattern
                    .compile(Constants.VB_REGEX_HIDDEN_VARIABLE);
            Matcher matcher = pattern.matcher(htmlSourceCode);

            if (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);

                Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.putString(Constants.VB_PREFERENCES_SUMC_HIDDEN_KEY, key);
                edit.putString(Constants.VB_PREFERENCES_SUMC_HIDDEN_VALUE,
                        value);
                edit.commit();

                hiddenVariablesList.add(new BasicNameValuePair(key, value));

                return hiddenVariablesList;
            }
        }

        return hiddenVariablesList;
    }

    /**
     * Getting the value for the hidden variables from a SharedPreferences file
     * that contains the information in key=value format. It is saved on the
     * internal memory of the device.
     */
    private ArrayList<BasicNameValuePair> loadHiddenVariableFromPreferences() {

        SharedPreferences sharedPreferences = context.getSharedPreferences(
                Constants.VB_PREFERENCES_NAME_SUMC_HIDDEN_VARIABLES,
                Context.MODE_PRIVATE);
        ArrayList<BasicNameValuePair> hiddenVariablesList = new ArrayList<BasicNameValuePair>();

        String key = sharedPreferences.getString(
                Constants.VB_PREFERENCES_SUMC_HIDDEN_KEY, null);
        String value = sharedPreferences.getString(
                Constants.VB_PREFERENCES_SUMC_HIDDEN_VALUE, null);

        if (key != null && value != null) {
            hiddenVariablesList.add(new BasicNameValuePair(key, value));
        }

        return hiddenVariablesList;
    }

    /**
     * Adding the User-Agent, the Referrer and the parameters to the HttpPost
     *
     * @param station             station used to create the request
     * @param vehicleTypeId       the searched vehicle type:
     *                            <ul>
     *                            <li>0 - stands for TRAMs</li>
     *                            <li>1 - stands for BUSES</li>
     *                            <li>2 - stands for TROLLEYS</li>
     *                            </ul>
     * @param captchaText         The text that the user entered according to the CAPTCHA image
     * @param captchaId           The Id of the CAPTCHA image, token from the source file
     * @param hiddenVariablesList a list with BasicValuePairs containing the hidden variables
     * @return an HTTP POST object, created with the needed parameters
     */
    private HttpPost createSumcRequest(StationEntity station,
                                       String vehicleTypeId, String captchaText, String captchaId,
                                       ArrayList<BasicNameValuePair> hiddenVariablesList) {

        final HttpPost result = new HttpPost(Constants.VB_URL);
        result.addHeader("User-Agent", Constants.VB_URL_USER_AGENT);
        result.addHeader("Referer", Constants.VB_URL_REFERER);

        try {
            final UrlEncodedFormEntity entity = new UrlEncodedFormEntity(
                    assignHttpPostParameters(station, vehicleTypeId,
                            captchaText, captchaId, hiddenVariablesList),
                    "UTF-8");
            result.setEntity(entity);
        } catch (UnsupportedEncodingException e) {
            ActivityTracker.sendCaughtException(context,
                    "RetrieveVirtualBoards.createSumcRequest(...)",
                    "Not supported default encoding?", e);
            throw new IllegalStateException("Not supported default encoding?",
                    e);
        }

        return result;
    }

    /**
     * Creating a list with BasicNameValuePair parameters, used for preparing
     * the HTTP POST request
     *
     * @param station             station used to create the request
     * @param vehicleTypeId       the searched vehicle type:
     *                            <ul>
     *                            <li>0 - stands for TRAMs</li>
     *                            <li>1 - stands for BUSES</li>
     *                            <li>2 - stands for TROLLEYS</li>
     *                            </ul>
     * @param captchaText         The text that the user entered according to the CAPTCHA image
     * @param captchaId           The Id of the CAPTCHA image, token from the source file
     * @param hiddenVariablesList a list with BasicValuePairs containing the hidden variables
     * @return a list with BasicNameValuePair parameters for the HTTP POST
     * request
     */
    private List<BasicNameValuePair> assignHttpPostParameters(
            StationEntity station, String vehicleTypeId, String captchaText,
            String captchaId, ArrayList<BasicNameValuePair> hiddenVariablesList) {

        // Create the BasinNameValuePairs
        List<BasicNameValuePair> result = new ArrayList<BasicNameValuePair>();
        result.addAll(Arrays.asList(
                new BasicNameValuePair(Constants.VB_URL_STOP_CODE,
                        TranslatorLatinToCyrillic.translate(context,
                                station.getNumber())), new BasicNameValuePair(
                        Constants.VB_URL_GO, "1"), new BasicNameValuePair(
                        Constants.VB_URL_SEC, "5"), new BasicNameValuePair(
                        Constants.VB_URL_O, station.getCustomField()),
                new BasicNameValuePair(Constants.VB_URL_SUBMIT, "Провери")));

        // Add the vehicle type into the request (if needed)
        if (vehicleTypeId != null) {
            result.add(new BasicNameValuePair(Constants.VB_URL_VEHICLE_TYPE_ID,
                    vehicleTypeId));
        }

        // Add captcha text and id into the request (if needed)
        if (captchaText != null && captchaId != null) {
            result.add(new BasicNameValuePair(Constants.VB_URL_CAPTCHA_ID,
                    captchaId));
            result.add(new BasicNameValuePair(Constants.VB_URL_CAPTCHA_TEXT,
                    captchaText));
        }

        // Add the hidden variables into the request (if needed)
        if (hiddenVariablesList != null && !hiddenVariablesList.isEmpty()) {
            result.addAll(hiddenVariablesList);
        }

        return result;
    }

    /**
     * Create a list with all unique station numbers, so check the way to
     * proceed with the HTML result
     *
     * @param htmlSourceCode the HTML source returned by the standard HTML request (without
     *                       vehicleTypeId parameter)
     * @return a list with all unique station numbers from the HTML source
     */
    private LinkedHashSet<String> getStationNumbers(String htmlSourceCode) {

        LinkedHashSet<String> stationNumbers = new LinkedHashSet<String>();

        Pattern pattern = Pattern.compile(Constants.VB_REGEX_STATION_INFO);
        Matcher matcher = pattern.matcher(htmlSourceCode);
        while (matcher.find()) {
            try {
                stationNumbers.add(Utils.getOnlyDigits(matcher.group(2)));
            } catch (Exception e) {
            }
        }

        return stationNumbers;
    }

    /**
     * Get the vehicles types of the cars passing through this station via the
     * response HTML source code, as follows:<br/>
     * <ul>
     * <li>0 - for TRAMS</li>
     * <li>1 - for BUSSES</li>
     * <li>2 - for TROLLEYS</li>
     * </ul>
     *
     * @param htmlResult the response HTML code
     * @return an ArrayList with the different types of vehicles passing through
     * the station
     */
    private ArrayList<String> getStationVehicleTypes(String htmlResult) {

        ArrayList<String> stationVehicleTypes = new ArrayList<String>();

        Pattern pattern = Pattern.compile(Constants.VB_REGEX_VEHICLE_TYPES);
        Matcher matcher = pattern.matcher(htmlResult);
        while (matcher.find()) {
            try {
                String vehicleName = matcher.group(2).trim().toUpperCase();
                String vehicleType;

                if (vehicleName.contains(Constants.VB_VEHICLE_TYPE_TROLLEY)) {
                    vehicleType = "2";
                } else if (vehicleName.contains(Constants.VB_VEHICLE_TYPE_TRAM)) {
                    vehicleType = "0";
                } else {
                    vehicleType = "1";
                }

                stationVehicleTypes.add(vehicleType);
            } catch (Exception e) {
            }
        }

        return stationVehicleTypes;
    }

    /**
     * Create the HTML source by combining only the needed information from each
     * of the 3 requests (bus, trolley, tram)
     *
     * @param htmlSourceCode     the global HTML source code
     * @param tempHtmlSourceCode the current HTML source code (bus, trolley or tram)
     * @return the combined output between the global and current HTML results
     */
    private String createHtmlSourceOutput(String htmlSourceCode,
                                          String tempHtmlSourceCode) {

        // Check if the global source code is empty or there is no
        // available information
        if (htmlSourceCode == null
                || "".equals(htmlSourceCode)
                || (htmlSourceCode != null && !"".equals(htmlSourceCode) && !htmlSourceCode
                .contains(Constants.VB_REGEX_SCHEDULE_START))) {
            htmlSourceCode = "";
        }

        // Check if the current source code is not empty
        if (tempHtmlSourceCode != null && !"".equals(tempHtmlSourceCode)) {
            // Check if the current source code contains schedule info
            if (tempHtmlSourceCode.contains(Constants.VB_REGEX_SCHEDULE_START)) {
                htmlSourceCode = appendArrivals(htmlSourceCode,
                        tempHtmlSourceCode);
            } else if (htmlSourceCode == null
                    || "".equals(htmlSourceCode)
                    || tempHtmlSourceCode
                    .contains(Constants.VB_CAPTCHA_REQUIRED)) {
                htmlSourceCode = tempHtmlSourceCode;
            }
        }

        return htmlSourceCode;
    }

    /**
     * Append the arrivals from the global and current HTML source codes
     *
     * @param htmlSourceCode     the global HTML source code
     * @param tempHtmlSourceCode the current HTML source code (bus, trolley or tram)
     * @return the combined output between the global and current HTML results
     * (with replaced arrivals section)
     */
    private String appendArrivals(String htmlSourceCode,
                                  String tempHtmlSourceCode) {

        Pattern pattern = Pattern.compile(Constants.VB_REGEX_SCHEDULE_BODY);

        // Find arrivals (from the global source code)
        String arrivals = "";
        Matcher matcher = pattern.matcher(htmlSourceCode);
        try {
            if (matcher.find()) {
                arrivals = matcher.group(1).trim();
            }
        } catch (Exception e) {
        }

        // Find temp arrivals (from the current source code)
        String tempArrivals = "";
        Matcher tempMatcher = pattern.matcher(tempHtmlSourceCode);
        if (tempMatcher.find()) {
            tempArrivals = tempMatcher.group(1).trim();
        }

        tempHtmlSourceCode = tempHtmlSourceCode.replaceAll(
                Constants.VB_REGEX_SCHEDULE_BODY, "<div class=\"arrivals\">"
                        + arrivals + "\n" + tempArrivals + "\n</div>");

        return tempHtmlSourceCode;
    }

    /**
     * Checking if a captcha image has to be showed to the user
     *
     * @param htmlResult The response text, prepared from the HTTP request to the SUMC
     *                   server
     */
    private void checkCaptchaText(String htmlResult) {
        // Get the captcha id (poleicngi) from the HTML source result
        String captchaId = getCaptchaId(htmlResult);

        // Making HttpRequest and showing a progress dialog if needed
        ProgressDialog progressDialog = createProgressDialog(Html
                .fromHtml(context.getString(R.string.vb_time_captcha_check)));
        RetrieveCaptchaInformation retrieveCaptchaInformation = new RetrieveCaptchaInformation(
                progressDialog, captchaId);
        retrieveCaptchaInformation.execute();
    }

    /**
     * Get the captcha id (poleicngi) from the HTML source file
     *
     * @param htmlResult The response text, prepared from the HTTP request to the SUMC
     *                   server
     * @return the captcha id from the source file
     */
    private String getCaptchaId(String htmlResult) {
        String captchaId = null;

        Pattern pattern = Pattern.compile(Constants.VB_CAPTCHA_REGEX);
        Matcher matcher = pattern.matcher(htmlResult);

        if (matcher.find()) {
            captchaId = matcher.group(1);
        }

        return captchaId;
    }

    /**
     * Create a captcha HTTP get request
     *
     * @param captchaId The id of the captcha image, token from the source file
     * @return a HTTP get request to the SUMC server
     * @throws ClientProtocolException
     * @throws IOException
     */
    private HttpGet createCaptchaRequest(String captchaId) {
        final HttpGet request = new HttpGet(String.format(
                Constants.VB_CAPTCHA_URL, captchaId));

        request.addHeader("User-Agent", Constants.VB_URL_USER_AGENT);
        request.addHeader("Referer", Constants.VB_URL_REFERER);
        request.getParams().setBooleanParameter(
                CoreProtocolPNames.USE_EXPECT_CONTINUE, true);

        return request;
    }

    /**
     * Getting the image as a Bitmap image from the source file
     *
     * @param httpGet   the newly created HTTP get request
     * @param captchaId The Id of the captcha image, token from the source file
     * @return a Bitmap captcha image
     * @throws ClientProtocolException
     * @throws IOException
     */
    private Bitmap getCaptchaImage(HttpGet httpGet, String captchaId)
            throws IOException {
        HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpEntity httpEntity = httpResponse.getEntity();
        InputStream in = httpEntity.getContent();

        int next;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((next = in.read()) != -1) {
            bos.write(next);
        }

        bos.flush();
        byte[] result = bos.toByteArray();
        bos.close();
        httpEntity.consumeContent();

        Bitmap captchaImage = BitmapFactory.decodeByteArray(result, 0,
                result.length);
        captchaImage = Bitmap.createScaledBitmap(captchaImage, 180, 60, false);

        return captchaImage;
    }

    /**
     * Processing the CAPTCHA text, after clicking OK button
     *
     * @param captchaId   The Id of the CAPTCHA image, token from the source file
     * @param captchaText the text of the captcha image
     */
    private void processCaptchaText(String captchaId, String captchaText) {
        // Translate the text to be always in Latin
        captchaText = TranslatorCyrillicToLatin.translate(context, captchaText);

        // Create the appropriate progress dialog message (if searched by
        // HomeScreen - show only the searched string, otherwise - the station
        // caption)
        Spanned progressDialogMsg = getToastMsg(context
                .getString(R.string.vb_time_retrieve_info));

        // Making HttpRequest and showing a progress dialog if needed
        ProgressDialog progressDialog = createProgressDialog(progressDialogMsg);
        RetrieveSumcInformation retrieveSumcInformation = new RetrieveSumcInformation(
                progressDialog, captchaText, captchaId);
        retrieveSumcInformation.execute();
    }

    /**
     * Creating an Alert Dialog with the captcha image and sets some settings on
     * it (as enlarging the image, set the keyboard input type and so on)
     *
     * @param captchaId    The Id of the CAPTCHA image, token from the source file
     * @param captchaImage The Bitmap CAPTCHA image
     */
    private void getCaptchaText(final String captchaId, Bitmap captchaImage) {

        if (!isCaptchaHackUsed) {
            isCaptchaHackUsed = true;
            processCaptchaText(captchaId, Utils.getCurrentDayMonth());
        } else {
            // It should not never enter here - a captch hack should be user all
            // the time

            // Replace the AlertDialog with a DialogFragment
            Builder dialogBuilder = new AlertDialog.Builder(context);
            dialogBuilder.setTitle(R.string.vb_time_sumc_captcha);
            dialogBuilder.setMessage(R.string.vb_time_sumc_captcha_msg);

            LinearLayout panel = new LinearLayout(context);
            panel.setOrientation(LinearLayout.VERTICAL);

            ImageView image = new ImageView(context);
            image.setId(2);
            image.setImageBitmap(captchaImage);

            // Add the image to the view and fix its size
            panel.addView(image, LayoutParams.MATCH_PARENT,
                    LayoutParams.MATCH_PARENT);
            fixImageSize(image);

            // Center the image
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) image
                    .getLayoutParams();
            layoutParams.gravity = Gravity.CENTER;
            image.setLayoutParams(layoutParams);

            final EditText input = new EditText(context);
            input.setId(1);
            input.setSingleLine();
            input.setInputType(InputType.TYPE_CLASS_TEXT
                    | InputType.TYPE_TEXT_VARIATION_URI
                    | InputType.TYPE_TEXT_VARIATION_PHONETIC);

            ScrollView view = new ScrollView(context);
            panel.addView(input);
            view.addView(panel);

            dialogBuilder
                    .setCancelable(true)
                    .setPositiveButton(R.string.app_button_ok,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,
                                                    int id) {
                                    String captchaText = input.getText()
                                            .toString();
                                    processCaptchaText(captchaId, captchaText);

                                    dialog.dismiss();
                                }
                            }).setView(view);

            dialogBuilder.setOnCancelListener(new OnCancelListener() {
                public void onCancel(DialogInterface arg0) {
                    proccessHtmlResult(null);
                }
            });

            // Workaround to show a keyboard
            AlertDialog alertDialog = dialogBuilder.create();
            alertDialog.getWindow().setSoftInputMode(
                    WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
            try {
                alertDialog.show();
            } catch (Exception e) {
                // Workaround used just in case when this activity is destroyed
                // before the dialog
            }
        }
    }

    /**
     * Fix the size of the image to match the correct dimensions
     *
     * @param image the image view
     */
    private void fixImageSize(ImageView image) {
        try {
            Display display = context.getWindowManager().getDefaultDisplay();
            DisplayMetrics outMetrics = new DisplayMetrics();
            display.getMetrics(outMetrics);
            float scWidth = outMetrics.widthPixels * 0.6f;
            image.getLayoutParams().width = (int) scWidth;

            if (Utils.isInLandscapeMode(context)) {
                image.getLayoutParams().height = (int) (scWidth / 6f);
            } else {
                image.getLayoutParams().height = (int) (scWidth / 3.5f);
            }
        } catch (Exception e) {
        }
    }

    /**
     * Processing the html result and start new activity if needed (checks for
     * all possible errors that can occur)
     *
     * @param htmlResult The response text, prepared from the HTTP request to the SUMC
     *                   server
     */
    private void proccessHtmlResult(String htmlResult) {
        saveCookiesToPreferences();
        saveHiddenVariablesToPreferences(htmlResult);

        // On ICS and later network operations can't be done on the UI thread
        // (GooglePlay bug: NetworkOnMainThreadException)
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                httpClient.getConnectionManager().shutdown();
                return null;
            }
        }.execute();

        // Hide the keyboard if it was shown because of the CAPTCHA
        ActivityUtils.hideKeyboard(context);

        // Process the result accordingly
        ProcessVirtualBoards processVirtualBoards = new ProcessVirtualBoards(
                context, htmlResult);

		/*
         * Revert the original station info (if needed) - it should be placed
		 * here (before processing the result), so take effect in all cases
		 */
        revertSpecialCaseFixes(station);

		/*
		 * If it is not a special case, but the searched text matches some of
		 * the special stations ([1137, 1138 - НДК-тунел], [1139 - НДК-Графити])
		 * and there was no problem with the request, we should add them to the
		 * result (just change the htmlResultCode to MULTIPLE_RESULTS and after
		 * that add the stations in the list)
		 */
        String formattedSearchedText = getFormattedSearchedText();
        boolean isSpecialStation = NDK_GRAFITTI.contains(formattedSearchedText)
                || NDK_TUNNEL.contains(formattedSearchedText);
        boolean isSuccessfulRequest = htmlResultCode == HtmlResultCodesEnum.NO_INFORMATION
                || htmlResultCode == HtmlResultCodesEnum.SINGLE_RESULT
                || htmlResultCode == HtmlResultCodesEnum.MULTIPLE_RESULTS;

        if (!isSpecialCase && isSpecialStation && isSuccessfulRequest) {
            htmlResultCode = HtmlResultCodesEnum.MULTIPLE_RESULTS;
        }

        switch (htmlResultCode) {
            // In case of an error with the result (captcha needed, no Internet or
            // no information)
            case NO_INTERNET:
            case NO_INFORMATION:
            case CAPTCHA_NEEDED:
                switch (htmlRequestCode) {
                    case REFRESH:
                        ((VirtualBoardsTime) callerInstance)
                                .refreshVirtualBoardsTimeFragment(null, getErrorMsg());
                        break;
                    case MULTIPLE_RESULTS:
                        ((VirtualBoardsFragment) callerInstance).setAdapterViaSearch(
                                new ArrayList<StationEntity>(), getErrorMsg());
                        break;
                    default:
                        Spanned progressDialogMsg = Html.fromHtml(getErrorMsg());
                        ActivityUtils.showNoInfoAlertToast(context, progressDialogMsg);
                        break;
                }

                break;
            // In case of single result (only one station found)
            case SINGLE_RESULT:
                VirtualBoardsStationEntity vbTimeStation = processVirtualBoards
                        .getVBSingleStationFromHtml();
                vbTimeStation.removeNotPassingVehicles(isSpecialCase);
                revertSpecialCaseFixes(vbTimeStation);

                // Add the search into the history
                Utils.addStationInHistory(context, vbTimeStation);

                switch (htmlRequestCode) {
                    case REFRESH:
                        ((VirtualBoardsTime) callerInstance)
                                .refreshVirtualBoardsTimeFragment(vbTimeStation, null);
                        break;
                    case MULTIPLE_RESULTS:
                        ArrayList<StationEntity> stationsList = new ArrayList<StationEntity>();
                        stationsList.add(vbTimeStation);
                        ((VirtualBoardsFragment) callerInstance).setAdapterViaSearch(
                                stationsList, null);

                        // If removes the break will directly open the VirtualBoards,
                        // because only one station is found
                        break;
                    default:

                        // Start the VirtualBoards activity
                        Intent vbTimeIntent;
                        if (globalContext.isPhoneDevice()) {
                            vbTimeIntent = new Intent(context, VirtualBoardsTime.class);
                        } else {
                            vbTimeIntent = new Intent(context,
                                    VirtualBoardsTimeDialog.class);
                        }
                        vbTimeIntent.putExtra(Constants.BUNDLE_VIRTUAL_BOARDS_TIME,
                                vbTimeStation);
                        context.startActivity(vbTimeIntent);

                        break;
                }

                break;
            // In case of multiple result (more than one station found)
            default:
                HashMap<String, StationEntity> stationsMap = processVirtualBoards
                        .getMultipleStationsFromHtml();
                // Not implemented for now, as it is slow operation
                // Utils.addListOfStationsInHistory(context, stationsMap);

                switch (htmlRequestCode) {
                    case REFRESH:
                    case SINGLE_RESULT:
                        station = stationsMap.get(station.getFormattedNumber());
                        getSumcInformation();

                        break;
                    case FAVOURITES:
                        station = stationsMap.get(station.getFormattedNumber());
                        updateFavouritesStation(station);
                        getSumcInformation();

                        break;
                    default:
                        ArrayList<StationEntity> stationsList = new ArrayList<StationEntity>(
                                stationsMap.values());

                        /**
                         * If it is not a special case, but the searched text matches
                         * some of the special stations ([1137, 1138 - НДК-тунел], [1139
                         * - НДК-Графити]), add them to the list
                         */
                        if (!isSpecialCase && isSpecialStation) {

                            stationsDatasource.open();
                            if (NDK_GRAFITTI.contains(formattedSearchedText)) {
                                stationsList
                                        .add(0, stationsDatasource.getStation(1139));
                            }

                            if (NDK_TUNNEL.contains(formattedSearchedText)) {
                                stationsList
                                        .add(0, stationsDatasource.getStation(1138));
                                stationsList
                                        .add(0, stationsDatasource.getStation(1137));
                            }
                            stationsDatasource.close();
                        }

                        ((VirtualBoardsFragment) callerInstance).setAdapterViaSearch(
                                stationsList, null);

                        break;
                }

                break;
        }

    }

    /**
     * Get the toast message according to the htmlRequestCode
     *
     * @param msg the unformatted message from strings
     * @return the formatted message
     */
    private Spanned getToastMsg(String msg) {

        // In case a CAPTCHA was required we need to revert all changes made
        // on the original station values
        revertSpecialCaseFixes(station);

        Spanned progressDialogMsg;
        switch (htmlRequestCode) {
            case MULTIPLE_RESULTS:
                progressDialogMsg = Html.fromHtml(String.format(msg,
                        station.getNumber()));
                break;
            default:
                progressDialogMsg = Html.fromHtml(String.format(
                        msg,
                        String.format(station.getName() + " (%s)",
                                station.getNumber())));
                break;
        }

        return progressDialogMsg;
    }

    /**
     * Form the error message. It is not Spanned type as it can't be added as
     * Bundle object.
     *
     * @param msg the unformatted message from strings
     * @return the formatted message
     */
    private String getErrorMsg() {
        String errorDialogMsg;

        switch (htmlResultCode) {
            case CAPTCHA_NEEDED:
                errorDialogMsg = context.getString(R.string.app_captcha_error);
                break;
            case NO_INFORMATION:
                switch (htmlRequestCode) {
                    case MULTIPLE_RESULTS:
                        errorDialogMsg = String.format(
                                context.getString(R.string.app_info_error),
                                station.getNumber());
                        break;
                    default:
                        errorDialogMsg = String.format(
                                context.getString(R.string.app_info_error),
                                String.format(station.getName() + " (%s)",
                                        station.getNumber()));
                        break;
                }

                break;
            default:
                errorDialogMsg = String.format(
                        context.getString(R.string.app_internet_error),
                        String.format(station.getName() + " (%s)",
                                station.getNumber()));
                break;
        }

        return errorDialogMsg;
    }

    /**
     * Create a progress dialog if needed (if the instance of this class is
     * created by the REFRESH - no progress dialog needed)
     *
     * @param msg
     * @return
     */
    private ProgressDialog createProgressDialog(Spanned msg) {
        ProgressDialog progressDialog;

        switch (htmlRequestCode) {
            case REFRESH:
                progressDialog = null;
                break;
            default:
                progressDialog = new ProgressDialog(context);
                progressDialog.setMessage(msg);
                break;
        }

        return progressDialog;
    }

    /**
     * Update the station in the favourites database
     *
     * @param stationToUpdate the new station (fulfilled with all information)
     */
    private void updateFavouritesStation(StationEntity stationToUpdate) {
        favouriteDatasource.open();
        favouriteDatasource.updateStation(stationToUpdate);
        favouriteDatasource.close();
    }

    /**
     * Make some adjusmtents in the special cases (([1137, 1138 - НДК-тунел],
     * [1139 - НДК-Графити])) - replace the original station numbers with the
     * closest ones
     *
     * @param station the station used for searching
     */
    private void makeSpecialCaseFixes(StationEntity station) {

        String stationNumber = getFormattedSearchedText();

        if ("1137".equals(stationNumber)) {
            isSpecialCase = true;
            station.setNumber("0364");
        }

        if ("1138".equals(stationNumber)) {
            isSpecialCase = true;
            station.setNumber("0400");
        }

        if ("1139".equals(stationNumber)) {
            isSpecialCase = true;
            station.setNumber("0363");
        }
    }

    /**
     * Revert the adjusmtents in the special cases (([1137, 1138 - НДК-тунел],
     * [1139 - НДК-Графити])) - replace the closest station numbers with the
     * original ones
     *
     * @param station the station used for searching
     */
    private void revertSpecialCaseFixes(StationEntity station) {

        if (isSpecialCase) {

            String stationNumber = station.getFormattedNumber();

            stationsDatasource.open();
            if ("0364".equals(stationNumber)) {
                station.assingStationValues(stationsDatasource.getStation(1137));
                setCustomField(station);
            }

            if ("0400".equals(stationNumber)) {
                station.assingStationValues(stationsDatasource.getStation(1138));
                setCustomField(station);
            }

            if ("0363".equals(stationNumber)) {
                station.assingStationValues(stationsDatasource.getStation(1139));
                setCustomField(station);
            }
            stationsDatasource.close();
        }
    }

    /**
     * Format the searched word by converting it in cyrillic and make it with
     * captital letters. This is used in cases of search by word.
     *
     * @return the formatted station number
     */
    private String getFormattedSearchedText() {

        String stationNumber = station.getFormattedNumber();
        stationNumber = Utils.removeSpaces(stationNumber);
        stationNumber = stationNumber.replace("-", "");
        stationNumber = stationNumber.toUpperCase();
        stationNumber = TranslatorLatinToCyrillic.translate(context,
                stationNumber);

        return stationNumber;
    }

    /**
     * Set a default value of the station custom field (in case of empty string
     * - put "1")
     *
     * @param station the selected station
     */
    private void setCustomField(StationEntity station) {
        if (station.getCustomField() == null
                || "".equals(station.getCustomField())
                || "-1".equals(station.getCustomField())
                || "null".equals(station.getCustomField())) {
            station.setCustomField("1");
        }
    }

    /**
     * Creating a request to the SUMC server to see if any CAPTCHA is required
     * to be entered as a security measure
     *
     * @author Zdravko Nestorov
     * @version 1.0
     */
    private class RetrieveSumcInformation extends AsyncTask<Void, Void, String> {

        private ProgressDialog progressDialog;
        private String captchaText;
        private String captchaId;
        private ArrayList<BasicNameValuePair> hiddenVariablesList;

        // Http Post parameter used to create/abort the HTTP connection
        private HttpPost httpPost;

        public RetrieveSumcInformation(ProgressDialog progressDialog,
                                       String captchaText, String captchaId) {
            this.progressDialog = progressDialog;
            this.captchaText = captchaText;
            this.captchaId = captchaId;
            this.hiddenVariablesList = loadHiddenVariableFromPreferences();

            // Make the changes over the original station values (replace them
            // with the closest ones)
            makeSpecialCaseFixes(station);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            createLoadingView();
        }

        @Override
        protected String doInBackground(Void... params) {
            String htmlResult = null;

            try {
                // Create a standard HTML request (without vehicleTypeId param)
                httpPost = createSumcRequest(station, null, captchaText,
                        captchaId, hiddenVariablesList);
                htmlResult = httpClient.execute(httpPost,
                        new BasicResponseHandler());

                // Change the hidden variables list value
                hiddenVariablesList = saveHiddenVariablesToPreferences(htmlResult);

                // Check how many unique station numbers are returned
                LinkedHashSet<String> stationNumbers = getStationNumbers(htmlResult);

                /**
                 * In case of no captcha needed, requesting multiple results and
                 * the search is done for a number that is not formatted (i.e.
                 * entered "2"), add "0002" to the unique station numbers and
                 * make a new request to the sumc site to retrieve the info for
                 * the new number
                 */
                String stationNumberFormatted = station.getFormattedNumber();
                if (!htmlResult.contains(Constants.VB_CAPTCHA_REQUIRED)
                        && htmlRequestCode == HtmlRequestCodesEnum.MULTIPLE_RESULTS
                        && Utils.isNumeric(stationNumberFormatted)
                        && stationNumbers.add(stationNumberFormatted)) {
                    httpPost = createSumcRequest(new StationEntity(station),
                            null, captchaText, captchaId, hiddenVariablesList);
                    String htmlResultNew = httpClient.execute(httpPost,
                            new BasicResponseHandler());

                    // Change the hidden variables list value
                    hiddenVariablesList = saveHiddenVariablesToPreferences(htmlResult);

                    /**
                     * Forming the combined html result as a combination of the
                     * new one and the old one
                     */
                    String htmlResultCombined = htmlResultNew + "\n"
                            + htmlResult;

                    /**
                     * Checking the combined result about the unique station
                     * numbers<br/>
                     * - in case of 1 station number found - it means that the
                     * final result is built only by the original request or the
                     * new request<br/>
                     * - otherwise - we need the combined result
                     */
                    stationNumbers = getStationNumbers(htmlResultCombined);
                    if (stationNumbers.size() == 1) {
                        if (stationNumbers.contains(stationNumberFormatted)) {
                            htmlResult = htmlResultNew;
                            station.setNumber(stationNumberFormatted);
                        }
                    } else {
                        htmlResult = htmlResultCombined;
                    }
                }

                // Check if a capture is needed
                if (htmlResult.contains(Constants.VB_CAPTCHA_REQUIRED)) {
                    htmlResultCode = HtmlResultCodesEnum.CAPTCHA_NEEDED;
                } else {
                    /**
                     * Proceed according to the unique station numbers in the
                     * request:<br/>
                     * - in case of empty list - no info available<br/>
                     * - in case of one station number - check the schedule for
                     * all type of vehicles<br/>
                     * - in case of more than one station number - show a list
                     * with all stations<br/>
                     */
                    if (stationNumbers.isEmpty()) {
                        htmlResultCode = HtmlResultCodesEnum.NO_INFORMATION;
                    } else if (stationNumbers.size() == 1) {
                        ArrayList<String> stationVehicleTypes = getStationVehicleTypes(htmlResult);
                        int vehicleTypesCount = stationVehicleTypes.size();

                        /**
                         * Check what types of vehicles pass through the station<br/>
                         * - in case of 1 type - no more requests needed (the
                         * first requests take the time schedule)<br/>
                         * - in case of 2 types - make one more requests to get
                         * the times of arrival of other types of vehicles<br/>
                         * - in case of 3 types - make two more requests to get
                         * the times of arrival of other types of vehicles<br/>
                         */
                        String tempHtmlSourceCode;
                        if (vehicleTypesCount == 2) {
                            httpPost = createSumcRequest(station,
                                    stationVehicleTypes.get(1), captchaText,
                                    captchaId, hiddenVariablesList);
                            tempHtmlSourceCode = httpClient.execute(httpPost,
                                    new BasicResponseHandler());

                            // Change the hidden variables list value
                            hiddenVariablesList = saveHiddenVariablesToPreferences(tempHtmlSourceCode);

                            htmlResult = createHtmlSourceOutput(htmlResult,
                                    tempHtmlSourceCode);
                        } else if (vehicleTypesCount == 3) {
                            for (int i = 1; i < 3; i++) {
                                httpPost = createSumcRequest(station,
                                        stationVehicleTypes.get(i),
                                        captchaText, captchaId,
                                        hiddenVariablesList);
                                tempHtmlSourceCode = httpClient.execute(
                                        httpPost, new BasicResponseHandler());

                                // Change the hidden variables list value
                                hiddenVariablesList = saveHiddenVariablesToPreferences(tempHtmlSourceCode);

                                htmlResult = createHtmlSourceOutput(htmlResult,
                                        tempHtmlSourceCode);
                            }
                        }

                        /**
                         * Check if the SKGT site returned all needed
                         * information
                         * <ul>
                         * <li>No result - INTERNER ERROR</li>
                         * <li>Result with information about captcha (in case
                         * there are more than one vehicle and some of the
                         * requests face captcha image) - CAPTCHA NEEDED</li>
                         * <li>No problem - SINGLE RESULT</li>
                         * </ul>
                         */
                        if (htmlResult == null || "".equals(htmlResult)) {
                            throw new Exception();
                        } else if (htmlResult
                                .contains(Constants.VB_CAPTCHA_REQUIRED)) {
                            htmlResultCode = HtmlResultCodesEnum.CAPTCHA_NEEDED;
                        } else {
                            htmlResultCode = HtmlResultCodesEnum.SINGLE_RESULT;
                        }
                    } else {
                        htmlResultCode = HtmlResultCodesEnum.MULTIPLE_RESULTS;
                    }
                }
            } catch (Exception e) {
                htmlResultCode = HtmlResultCodesEnum.NO_INTERNET;
            }

            return htmlResult;
        }

        @Override
        protected void onPostExecute(String htmlResult) {
            super.onPostExecute(htmlResult);

            switch (htmlResultCode) {
                case CAPTCHA_NEEDED:
                    saveHiddenVariablesToPreferences(htmlResult);
                    checkCaptchaText(htmlResult);
                    break;
                default:
                    proccessHtmlResult(htmlResult);
                    break;
            }

            dismissLoadingView();
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            dismissLoadingView();
        }

        /**
         * Create the loading view and lock the screen
         */
        private void createLoadingView() {
            ActivityUtils.lockScreenOrientation(context);

            if (progressDialog != null) {
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(true);
                progressDialog
                        .setOnCancelListener(new DialogInterface.OnCancelListener() {
                            public void onCancel(DialogInterface dialog) {
                                cancel(true);
                            }
                        });
                progressDialog.show();
            }
        }

        /**
         * Dismiss the loading view and unlock the screen
         */
        private void dismissLoadingView() {
            try {
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            } catch (Exception e) {
                /**
                 * Fixing a strange error that is happening sometimes when the
                 * dialog is dismissed. I guess sometimes activity gets finished
                 * before the dialog successfully dismisses.
                 *
                 * java.lang.IllegalArgumentException: View not attached to
                 * window manager
                 */
            }

            ActivityUtils.unlockScreenOrientation(context);
        }
    }

    /**
     * Class responsible for loading the captcha image from the server
     *
     * @author Zdravko Nestorov
     * @version 1.0
     */
    private class RetrieveCaptchaInformation extends
            AsyncTask<Void, Void, Bitmap> {

        private ProgressDialog progressDialog;
        private String captchaId;

        // Http Get parameter used to create/abort the HTTP connection
        private HttpGet httpGet;

        public RetrieveCaptchaInformation(ProgressDialog progressDialog,
                                          String captchaId) {
            this.progressDialog = progressDialog;
            this.captchaId = captchaId;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            createLoadingView();
        }

        @Override
        protected Bitmap doInBackground(Void... params) {
            Bitmap captchaImage;
            try {
                httpGet = createCaptchaRequest(captchaId);
                captchaImage = getCaptchaImage(httpGet, captchaId);
            } catch (Exception e) {
                ActivityTracker.sendCaughtException(context,
                        "RetrieveCaptchaInformation.doInBackground(...)",
                        "Problem with retrieving captcha image", e);
                captchaImage = null;
            }

            return captchaImage;
        }

        @Override
        protected void onPostExecute(Bitmap captchaImage) {
            super.onPostExecute(captchaImage);

            if (captchaImage != null) {
                getCaptchaText(captchaId, captchaImage);
            } else {
                htmlResultCode = HtmlResultCodesEnum.NO_INTERNET;
                proccessHtmlResult(null);
            }

            dismissLoadingView();
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            dismissLoadingView();
        }

        /**
         * Create the loading view and lock the screen
         */
        private void createLoadingView() {
            ActivityUtils.lockScreenOrientation(context);

            if (progressDialog != null) {
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(true);
                progressDialog
                        .setOnCancelListener(new DialogInterface.OnCancelListener() {
                            public void onCancel(DialogInterface dialog) {
                                cancel(true);
                            }
                        });
                progressDialog.show();
            }
        }

        /**
         * Dismiss the loading view and unlock the screen
         */
        private void dismissLoadingView() {
            try {
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
            } catch (Exception e) {
                /**
                 * Fixing a strange error that is happening sometimes when the
                 * dialog is dismissed. I guess sometimes activity gets finished
                 * before the dialog successfully dismisses.
                 *
                 * java.lang.IllegalArgumentException: View not attached to
                 * window manager
                 */
            }

            ActivityUtils.unlockScreenOrientation(context);
        }
    }
}
