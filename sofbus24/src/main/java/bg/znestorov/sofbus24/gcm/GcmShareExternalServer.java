package bg.znestorov.sofbus24.gcm;

import android.app.Activity;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import bg.znestorov.sofbus24.utils.Constants;

/**
 * Class used to share the registration id with the application server (save the
 * registration ids and send notification to them lately)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
class GcmShareExternalServer {

    /**
     * Share the registration id with the application server (used to save the
     * registration ids and send notification to them lately)
     *
     * @param context         the current Activity context
     * @param regId           the registration id
     * @param deviceModel     the model of the device
     * @param deviceOsVersion the android version of the device
     * @return if the reg id is successfully shared with the server
     */
    public static Boolean registerWithAppServer(Activity context, String regId,
                                                String deviceModel, String deviceOsVersion) {

        Boolean isSharedSuccessful;
        HttpURLConnection httpConnection = null;

        try {
            URL serverUrl = new URL(createUrlAddress(regId, deviceModel,
                    deviceOsVersion));

            // Map containing the params of the HTTP POST request
            Map<String, String> paramsMap = new HashMap<String, String>();
            paramsMap.put(Constants.GCM_EXTERNAL_SERVER_URL_REG_ID_ATT, regId);
            paramsMap.put(Constants.GCM_EXTERNAL_SERVER_URL_DEVICE_MODEL_ATT,
                    deviceModel);
            paramsMap.put(
                    Constants.GCM_EXTERNAL_SERVER_URL_DEVICE_OS_VERSION_ATT,
                    deviceOsVersion);
            Iterator<Entry<String, String>> iterator = paramsMap.entrySet()
                    .iterator();

            // Iterate over all params in the Map and put them in the body of
            // the request
            StringBuilder postBody = new StringBuilder();
            while (iterator.hasNext()) {
                Entry<String, String> param = iterator.next();
                postBody.append(param.getKey()).append('=')
                        .append(param.getValue());
                if (iterator.hasNext()) {
                    postBody.append('&');
                }
            }

            String body = postBody.toString();
            byte[] bytes = body.getBytes();

            // Configure the HTTP connection and send it to the server
            httpConnection = (HttpURLConnection) serverUrl.openConnection();
            httpConnection.setDoOutput(true);
            httpConnection.setUseCaches(false);
            httpConnection.setFixedLengthStreamingMode(bytes.length);
            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("Accept", "application/json");
            OutputStream out = httpConnection.getOutputStream();
            out.write(bytes);
            out.close();

            // Check if the status of the HTTP request is successful
            int status = httpConnection.getResponseCode();
            if (status == 200) {
                isSharedSuccessful = true;

                // Check if the registration is successful
                String httpResult = getHttpResult(httpConnection);
                JSONObject httpResultJson = new JSONObject(httpResult);
                isSharedSuccessful = "0"
                        .equals(httpResultJson
                                .getString(Constants.GCM_EXTERNAL_SERVER_URL_RESPONSE_ERROR_CODE_KEY));
            } else {
                isSharedSuccessful = false;
            }

        } catch (Exception e) {
            isSharedSuccessful = false;
        } finally {
            if (httpConnection != null) {
                httpConnection.disconnect();
            }
        }

        return isSharedSuccessful;
    }

    /**
     * Create the URL address, used to share the registration id with the
     * external server. To get the final secret value we make the following:<br/>
     * "URL" + "REG_ID" + "URL_SECRET_VALUE" (the secret word is
     * 'Sofbus24-SecretWord-ForRegistration' after SHA1) and hash it via SHA1.<br/>
     * <p/>
     * The result value is appended as a "sec" param to the end of the URL.
     *
     * @param regId           the registration id of the device/user
     * @param deviceModel     the model of the device
     * @param deviceOsVersion the android version of the device
     * @return the url address, used to sed to share the registration id with
     * the external server
     */
    private static String createUrlAddress(String regId, String deviceModel,
                                           String deviceOsVersion) {

        String urlAddress = Constants.GCM_EXTERNAL_SERVER_URL
                + "?"
                + Constants.GCM_EXTERNAL_SERVER_URL_SECRET_ATT
                + "="
                + getSha1Digest(Constants.GCM_EXTERNAL_SERVER_URL + regId
                + deviceModel + deviceOsVersion
                + Constants.GCM_EXTERNAL_SERVER_URL_SECRET_VALUE);

        return urlAddress;
    }

    /**
     * Make a SHA1 digest of an input string
     *
     * @param input the input string
     * @return the result after SHA1 hash
     */
    private static String getSha1Digest(String input) {

        String sha1Digest = "";

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            // It should never get in here
        }

        md.reset();
        byte[] buffer = input.getBytes();
        md.update(buffer);
        byte[] digest = md.digest();

        // Converts the Byte Array to Hex String
        for (byte aDigest : digest) {
            sha1Digest += Integer.toString((aDigest & 0xff) + 0x100, 16)
                    .substring(1);
        }

        return sha1Digest;
    }

    /**
     * Get the result of the HTTP POST request in string format
     *
     * @param httpConnection the HTTP connection
     * @return the result of the HTTP connection
     */
    private static String getHttpResult(HttpURLConnection httpConnection) {

        StringBuilder httpResult = null;
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(
                    httpConnection.getInputStream()));
            httpResult = new StringBuilder();

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                httpResult.append(line + "\n");
            }
        } catch (IOException e) {
            httpResult = new StringBuilder("");
        }

        return httpResult.toString();
    }

}