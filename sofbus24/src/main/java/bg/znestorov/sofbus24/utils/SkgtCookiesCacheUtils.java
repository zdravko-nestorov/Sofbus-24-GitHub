package bg.znestorov.sofbus24.utils;

import static bg.znestorov.sofbus24.utils.Constants.VB_COOKIES_EXPIRATION_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_COOKIES_SOFIA_TRAFFIC_SESSION_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_COOKIES_XSRF_TOKEN_API;
import static bg.znestorov.sofbus24.utils.Constants.VB_URL_COOKIES_API;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SkgtCookiesCacheUtils {

    private static Date expiresAt;
    private static String xsrfToken;
    private static String sofiaTrafficSession;

    public static synchronized String getXsrfToken() {
        if (isCookieValid(xsrfToken)) {
            return xsrfToken;
        }
        resetCookiesCache();
        return xsrfToken;
    }

    public static synchronized String getSofiaTrafficSession() {
        if (isCookieValid(sofiaTrafficSession)) {
            return sofiaTrafficSession;
        }
        resetCookiesCache();
        return sofiaTrafficSession;
    }

    private static boolean isCookieValid(String cookie) {
        return cookie != null && expiresAt != null && new Date().before(expiresAt);
    }

    private static synchronized void resetCookiesCache() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, VB_COOKIES_EXPIRATION_API);
        expiresAt = calendar.getTime();

        try {
            fetchCookies();
        } catch (IOException e) {
            // Do nothing and wait the user to retry retrieving the information
        }
    }

    private static void fetchCookies(Object... params) throws IOException {
        // Create a new URL connection to download the cookies
        HttpURLConnection connection = (HttpURLConnection) new URL(String.format(VB_URL_COOKIES_API, params)).openConnection();

        // Retrieve the list of cookies
        List<String> cookies = connection.getHeaderFields().get("Set-Cookie");
        if (cookies != null) {
            processCookies(cookies);
        }
    }

    private static void processCookies(List<String> cookies) {
        if (cookies == null) {
            return;
        }

        for (String cookie : cookies) {
            if (Utils.isEmpty(cookie)) {
                continue;
            }

            // Null-safe split operation
            String[] cookieSegments = cookie.split(";");
            if (cookieSegments.length == 0 || Utils.isEmpty(cookieSegments[0])) {
                continue;
            }

            // Cookies "name=value" split operation
            String[] cookieParts = cookieSegments[0].split("=");
            if (cookieParts.length != 2 || Utils.isEmpty(cookieParts[0])) {
                continue;
            }

            String cookieName = cookieParts[0];
            String cookieValue = cookieParts[1];

            switch (cookieName) {
                case VB_COOKIES_XSRF_TOKEN_API:
                    xsrfToken = cookieValue;
                    break;
                case VB_COOKIES_SOFIA_TRAFFIC_SESSION_API:
                    sofiaTrafficSession = cookieValue;
                    break;
                default:
                    // Handle unknown cookies if necessary
                    break;
            }
        }
    }
}
