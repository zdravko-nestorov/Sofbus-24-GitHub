package bg.znestorov.sofbus24.utils;

import android.app.Activity;
import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.math.BigDecimal;

import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.main.R;

/**
 * Utils method containing functions concerning GoogleMaps stuff
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class MapUtils {

    /**
     * Get the distance between Location and Station object
     *
     * @param location1 Location object
     * @param station   Station object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(Location location1,
                                        StationEntity station) {
        try {
            return getDistance(location1, getLocation(station)).toString();
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between Location and Station object
     *
     * @param context   the current activity context
     * @param location1 Location object
     * @param station   Station object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(Activity context, Location location1,
                                        StationEntity station) {
        try {
            return formatDistance(context,
                    getDistance(location1, getLocation(station)));
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between LatLng and Station object
     *
     * @param context the current activity context
     * @param latLng1 LatLng object
     * @param station Station object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(Activity context, LatLng latLng1,
                                        StationEntity station) {
        try {
            return formatDistance(context,
                    getDistance(getLocation(latLng1), getLocation(station)));
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between LatLng and Station object
     *
     * @param latLng1 LatLng object
     * @param station Station object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(LatLng latLng1, StationEntity station) {
        try {
            return getDistance(getLocation(latLng1), getLocation(station))
                    .toString();
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between two LatLng objects
     *
     * @param latLng1 LatLng object
     * @param latLng2 LatLng object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(LatLng latLng1, LatLng latLng2) {
        try {
            return getDistance(getLocation(latLng1), getLocation(latLng2))
                    .toString();
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Get the distance between two LatLng objects
     *
     * @param context the current activity context
     * @param latLng1 LatLng object
     * @param latLng2 LatLng object
     * @return distance between the input objects (in case of an error - return
     * empty string)
     */
    public static String getMapDistance(Activity context, LatLng latLng1,
                                        LatLng latLng2) {
        try {
            return formatDistance(context,
                    getDistance(getLocation(latLng1), getLocation(latLng2)));
        } catch (Exception e) {
            return "∞";
        }
    }

    /**
     * Create Location object via LatLng one
     *
     * @param latLng the input LatLng object
     * @return a location object base on the input LatLng one
     */
    private static Location getLocation(LatLng latLng) {
        Location location = new Location("");
        location.setLatitude(latLng.latitude);
        location.setLongitude(latLng.longitude);

        return location;
    }

    /**
     * Create Location object via Station one
     *
     * @param station the input Station object
     * @return a location object base on the input Station one
     */
    private static Location getLocation(StationEntity station) {
        Location location = new Location("");
        location.setLatitude(Double.parseDouble(station.getLat()));
        location.setLongitude(Double.parseDouble(station.getLon()));

        return location;
    }

    /**
     * Get the distance between two locations and convert it to long with two
     * decimal digits
     *
     * @param location1 first location
     * @param location2 second location
     * @return the distance between the locations
     */
    private static Float getDistance(Location location1, Location location2) {
        Float distanceTo = location1.distanceTo(location2);
        BigDecimal bd = new BigDecimal(distanceTo);
        BigDecimal rounded = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        distanceTo = rounded.floatValue();

        return distanceTo;
    }

    /**
     * Format the distance in kilometers and meters
     *
     * @param context the current activity context
     * @param meters  the distance in meters
     * @return the formatted distance
     */
    private static String formatDistance(Activity context, Float meters) {
        long km = (long) (meters / 1000);
        long m = (long) (meters - km * 1000);

        String distanceTo;
        if (km > 0) {
            distanceTo = km
                    + context.getString(R.string.app_distance_kilometers) + m
                    + context.getString(R.string.app_distance_meters);
        } else {
            distanceTo = m + context.getString(R.string.app_distance_meters);
        }

        return distanceTo;
    }
}
