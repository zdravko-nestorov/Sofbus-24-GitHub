package bg.znestorov.sofbus24.databases;

import static bg.znestorov.sofbus24.entity.VehicleTypeEnum.getStationTypeByVehicleType;

import android.app.Activity;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Locale;

import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;

/**
 * Vehicles data source class, responsible for all interactions with the
 * vehicles database
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class DroidTransDataSource {

    private final Activity context;
    private final String language;
    private final Sofbus24SQLite dbHelper;
    // Columns of the VEHI Table
    private final String[] vehiColumns = {
            Sofbus24SQLite.COLUMN_PK_VEHI_ID,
            Sofbus24SQLite.COLUMN_VEHI_NUMBER,
            Sofbus24SQLite.COLUMN_VEHI_TYPE,
            Sofbus24SQLite.COLUMN_VEHI_DIRECTION,
            Sofbus24SQLite.COLUMN_VEHI_SKGT_LINE_ID,
            Sofbus24SQLite.COLUMN_VEHI_SKGT_NAME,
            Sofbus24SQLite.COLUMN_VEHI_SKGT_EXT_ID,
            Sofbus24SQLite.COLUMN_VEHI_SKGT_TYPE};
    // Database fields
    private SQLiteDatabase database;

    public DroidTransDataSource(Activity context) {
        this.context = context;
        dbHelper = new Sofbus24SQLite(context);
        language = LanguageChange.getUserLocale(context);
    }

    public void open() throws SQLException {
        database = Sofbus24DatabaseUtils.openDb(dbHelper, database);
    }

    public void close() {
        Sofbus24DatabaseUtils.closeDb(dbHelper, database);
    }

    /**
     * Get a list with all vehicle types from the DB
     *
     * @return a list of vehicles type
     */
    public ArrayList<VehicleTypeEnum> getVehicleTypes() {

        ArrayList<VehicleTypeEnum> vehicleTypes = new ArrayList<VehicleTypeEnum>();

        boolean isDistinct = true;
        String[] vehicleColumns = new String[]{vehiColumns[2]};

        // Selecting the row that contains the vehicle data
        try (Cursor cursor = database.query(isDistinct,
                Sofbus24SQLite.TABLE_SOF_VEHI, vehicleColumns, null, null,
                null, null, null, null)) {

            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                try {
                    VehicleTypeEnum vehicleType = cursorToVehicleType(cursor);
                    vehicleTypes.add(vehicleType);

                    cursor.moveToNext();
                } catch (Exception e) {
                    break;
                }
            }

            // Reorder the vehicle types in the list
            if (vehicleTypes.size() >= 4) {
                vehicleTypes.clear();
                vehicleTypes.add(VehicleTypeEnum.BUS);
                vehicleTypes.add(VehicleTypeEnum.TROLLEY);
                vehicleTypes.add(VehicleTypeEnum.TRAM);
                vehicleTypes.add(VehicleTypeEnum.METRO);
            }
            return vehicleTypes;

        } catch (Exception e) {
            return vehicleTypes;
        }
    }

    /**
     * Getting the vehicle type from the cursor object
     *
     * @param cursor the input cursor for interacting with the DB
     * @return the vehicle type on the current row
     */
    private VehicleTypeEnum cursorToVehicleType(Cursor cursor) {

        VehicleTypeEnum vehicleType = VehicleTypeEnum.valueOf(cursor
                .getString(0));
        if (vehicleType == VehicleTypeEnum.METRO
                || vehicleType == VehicleTypeEnum.METRO1
                || vehicleType == VehicleTypeEnum.METRO2
                || vehicleType == VehicleTypeEnum.METRO3
                || vehicleType == VehicleTypeEnum.METRO4) {
            vehicleType = VehicleTypeEnum.METRO;
        }

        return vehicleType;
    }

    /**
     * Get the vehicle numbers for the selected type
     *
     * @param vehicleType the chosen vehicle type
     * @return the vehicle numbers by type
     */
    public ArrayList<String> getVehicleNumbers(VehicleTypeEnum vehicleType) {

        ArrayList<String> vehiclesNumbers = new ArrayList<String>();

        String[] vehicleColumns = new String[]{vehiColumns[1]};

        String selection;
        String[] selectionArgs;
        switch (vehicleType) {
            case METRO:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                selection = Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ?";
                selectionArgs = new String[]{
                        String.valueOf(VehicleTypeEnum.METRO),
                        String.valueOf(VehicleTypeEnum.METRO1),
                        String.valueOf(VehicleTypeEnum.METRO2),
                        String.valueOf(VehicleTypeEnum.METRO3),
                        String.valueOf(VehicleTypeEnum.METRO4)};
                break;
            default:
                selection = Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ?";
                selectionArgs = new String[]{String.valueOf(vehicleType)};
                break;
        }

        // Selecting the row that contains the vehicle data
        try (Cursor cursor = database.query(Sofbus24SQLite.TABLE_SOF_VEHI,
                vehicleColumns, selection, selectionArgs, null, null, null)) {

            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                String vehicleNumber = cursor.getString(0);
                vehiclesNumbers.add(vehicleNumber);

                cursor.moveToNext();
            }
            return vehiclesNumbers;

        } catch (Exception e) {
            return vehiclesNumbers;
        }
    }

    /**
     * Get the vehicle number position for the selected type (retrieve the
     * position in the WheelView)
     *
     * @param vehicleType           the chosen vehicle type
     * @param searchedVehicleNumber the searched vehicle number
     * @return the vehicle number position by type
     */
    public int getVehicleNumbersPosition(VehicleTypeEnum vehicleType,
                                         String searchedVehicleNumber) {

        int vehiclePosition = 0;

        String[] vehicleColumns = new String[]{vehiColumns[1]};

        String selection;
        String[] selectionArgs;
        switch (vehicleType) {
            case METRO:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                selection = Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ?";
                selectionArgs = new String[]{
                        String.valueOf(VehicleTypeEnum.METRO),
                        String.valueOf(VehicleTypeEnum.METRO1),
                        String.valueOf(VehicleTypeEnum.METRO2),
                        String.valueOf(VehicleTypeEnum.METRO3),
                        String.valueOf(VehicleTypeEnum.METRO4)};
                break;
            default:
                selection = Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ?";
                selectionArgs = new String[]{String.valueOf(vehicleType)};
                break;
        }

        // Selecting the row that contains the vehicle data
        try (Cursor cursor = database.query(Sofbus24SQLite.TABLE_SOF_VEHI,
                vehicleColumns, selection, selectionArgs, null, null, null)) {

            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {

                String dbVehicleNumber = cursor.getString(0);
                if (dbVehicleNumber.equals(searchedVehicleNumber)) {
                    break;
                }

                vehiclePosition++;
                cursor.moveToNext();
            }
            return vehiclePosition;

        } catch (Exception e) {
            return vehiclePosition;
        }
    }

    /**
     * Get the directions according a vehicle type and vehicle number
     *
     * @param vehicleType   the type of the vehicle
     * @param vehicleNumber the number of the vehicle
     * @return the directions of the vehicle
     */
    public ArrayList<String> getVehicleDirections(VehicleTypeEnum vehicleType,
                                                  String vehicleNumber) {

        ArrayList<String> vehiclesDirections = new ArrayList<String>();

        String[] vehicleColumns = new String[]{vehiColumns[3]};

        String selection;
        String[] selectionArgs;
        switch (vehicleType) {
            case METRO:
            case METRO1:
            case METRO2:
            case METRO3:
            case METRO4:
                selection = "(" + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? OR "
                        + Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ?) AND "
                        + Sofbus24SQLite.COLUMN_VEHI_NUMBER + " = ?";
                selectionArgs = new String[]{
                        String.valueOf(VehicleTypeEnum.METRO),
                        String.valueOf(VehicleTypeEnum.METRO1),
                        String.valueOf(VehicleTypeEnum.METRO2),
                        String.valueOf(VehicleTypeEnum.METRO3),
                        String.valueOf(VehicleTypeEnum.METRO4),
                        vehicleNumber};
                break;
            default:
                selection = Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ? AND "
                        + Sofbus24SQLite.COLUMN_VEHI_NUMBER + " = ?";
                selectionArgs = new String[]{String.valueOf(vehicleType),
                        vehicleNumber};
                break;
        }

        // Selecting the row that contains the vehicle data
        try (Cursor cursor = database.query(Sofbus24SQLite.TABLE_SOF_VEHI,
                vehicleColumns, selection, selectionArgs, null, null, null)) {

            if (cursor.getCount() > 0) {
                cursor.moveToFirst();

                String vehicleDirection = cursor.getString(0).toUpperCase(
                        new Locale(LanguageChange.getUserLocale(context)));

                // Translate to Latin if the language is different from BG
                if (!"bg".equals(language)) {
                    vehicleDirection = TranslatorCyrillicToLatin.translate(context,
                            vehicleDirection);
                }

                vehiclesDirections.add(vehicleDirection.replaceAll(" +", " "));
                vehiclesDirections.add(getOppositeDirection(vehicleDirection).replaceAll(" +", " "));
            }
            return vehiclesDirections;

        } catch (Exception e) {
            return vehiclesDirections;
        }
    }

    /**
     * Get the opposite direction of the current one (just permute the words)
     *
     * @param direction the current direction
     * @return the opposite direction
     */
    private String getOppositeDirection(String direction) {

        String oppositeDirection;
        String directionSeparator = " - ";
        String[] directionParts = direction.split(" - ");

        switch (directionParts.length) {
            case 0:
            case 1:
                oppositeDirection = direction;
                break;
            case 2:
                oppositeDirection = directionParts[1] + directionSeparator
                        + directionParts[0];
                break;
            case 3:
                oppositeDirection = directionParts[2] + directionSeparator
                        + directionParts[1] + directionSeparator
                        + directionParts[0];
                break;
            default:
                oppositeDirection = directionParts[3] + directionSeparator
                        + directionParts[2] + directionSeparator
                        + directionParts[1] + directionSeparator
                        + directionParts[0];
                break;
        }

        return oppositeDirection;
    }

    /**
     * Get the direction for the desired vehicle based on the current station number
     * (the direction is based on the current vehicle and station numbers)
     *
     * @param vehicleDirection the desired location
     * @param vehicleNumber    the vehicle number
     * @param stationNumber    the station number
     * @return the correct direction for this vehicle
     */
    public String getVehicleDirectionViaStationNumber(String vehicleDirection, String vehicleNumber,
                                                      String stationNumber) {

        StringBuilder query = new StringBuilder();
        query.append(" SELECT VEST_DIRECTION	                                    	\n");
        query.append(" FROM SOF_STAT													\n");
        query.append(" 		JOIN SOF_VEST												\n");
        query.append(" 			ON SOF_VEST.FK_VEST_STAT_ID = SOF_STAT.PK_STAT_ID		\n");
        query.append(" 		JOIN SOF_VEHI												\n");
        query.append(" 			ON SOF_VEHI.PK_VEHI_ID = SOF_VEST.FK_VEST_VEHI_ID		\n");
        query.append(" 			AND SOF_VEHI.VEHI_NUMBER LIKE '" + vehicleNumber
                + "'																	\n");
        query.append(" WHERE SOF_STAT.STAT_NUMBER = " + stationNumber
                + "																		\n");

        // Selecting the row that contains the vehicles direction
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            if (cursor.getCount() > 0) {
                cursor.moveToFirst();

                // Get the vehicle direction number from the database and base on this decide
                // which direction to show (if 1 - current one, 2 - the opposite)
                Integer vehicleDirectionNumber = cursor.getInt(0);
                if (vehicleDirectionNumber != 1) {
                    vehicleDirection = getOppositeDirection(vehicleDirection);
                }

                // Translate to Latin if the language is different from BG
                if (!"bg".equals(language)) {
                    vehicleDirection = TranslatorCyrillicToLatin.translate(context,
                            vehicleDirection);
                }
            }
            return vehicleDirection;

        } catch (Exception e) {
            return vehicleDirection;
        }
    }

    /**
     * Get the stations for the current vehicle in the desired location
     * <br/><br/>
     * <b>[Exception - GooglePlay]</b> Caused by: android.database.sqlite.SQLiteDatabaseCorruptException:
     * database disk image is malformed (code 11);
     * <br/>
     * <b>[Answer - StackOverflow]</b> This seems to be all 'low-level' issues. Its not something I can do from the code. This means that
     * something or someone (app killer) my be killing my app at some point so then the db is corrupted;
     *
     * @param vehicleType      the vehicle type
     * @param vehicleNumber    the vehicle number
     * @param vehicleDirection the desired location
     * @return a list with all stations for the vehicle
     */
    public ArrayList<StationEntity> getVehicleStations(
            VehicleTypeEnum vehicleType, String vehicleNumber,
            Integer vehicleDirection) {

        ArrayList<StationEntity> vehicleStations = new ArrayList<StationEntity>();

        StringBuilder query = new StringBuilder();
        query.append(" SELECT SOF_STAT.STAT_NUMBER, SOF_STAT.STAT_NAME, SOF_STAT.STAT_LATITUDE, SOF_STAT.STAT_LONGITUDE		\n");
        query.append(" FROM SOF_STAT																						\n");
        query.append(" 		JOIN SOF_VEST																					\n");
        query.append(" 			ON SOF_VEST.FK_VEST_STAT_ID = SOF_STAT.PK_STAT_ID											\n");
        query.append(" 			AND SOF_VEST.VEST_DIRECTION = " + vehicleDirection
                + "																											\n");
        query.append(" 		JOIN SOF_VEHI																					\n");
        query.append(" 			ON SOF_VEHI.PK_VEHI_ID = SOF_VEST.FK_VEST_VEHI_ID											\n");
        query.append(" 			AND SOF_VEHI.VEHI_NUMBER LIKE '" + vehicleNumber
                + "'																										\n");
        query.append(" 			AND SOF_VEHI.VEHI_TYPE LIKE '%" + vehicleType + "%'		    								\n");
        query.append(" AND SOF_STAT.STAT_TYPE LIKE '%" + getStationTypeByVehicleType(vehicleType)  + "%'	                				\n");

        // Selecting the row that contains the stations data
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                StationEntity station = cursorToStation(cursor);
                station.setType(vehicleType);
                vehicleStations.add(station);
                cursor.moveToNext();
            }
            return vehicleStations;

        } catch (Exception e) {
            return vehicleStations;
        }
    }

    /**
     * Get the station position for the current vehicle in the desired location
     * (retrieve the position in the WheelView)
     *
     * @param vehicleType           the vehicle type
     * @param vehicleNumber         the vehicle number
     * @param vehicleDirection      the desired location
     * @param searchedStationNumber the searched station number
     * @return a list with all stations for the vehicle
     */
    public int getVehicleStationPosition(VehicleTypeEnum vehicleType,
                                         String vehicleNumber, Integer vehicleDirection,
                                         String searchedStationNumber) {

        int stationPosition = 0;

        StringBuilder query = new StringBuilder();
        query.append(" SELECT SOF_STAT.STAT_NUMBER, SOF_STAT.STAT_NAME, SOF_STAT.STAT_LATITUDE, SOF_STAT.STAT_LONGITUDE		\n");
        query.append(" FROM SOF_STAT																						\n");
        query.append(" 		JOIN SOF_VEST																					\n");
        query.append(" 			ON SOF_VEST.FK_VEST_STAT_ID = SOF_STAT.PK_STAT_ID											\n");
        query.append(" 			AND SOF_VEST.VEST_DIRECTION = " + vehicleDirection
                + "																											\n");
        query.append(" 		JOIN SOF_VEHI																					\n");
        query.append(" 			ON SOF_VEHI.PK_VEHI_ID = SOF_VEST.FK_VEST_VEHI_ID											\n");
        query.append(" 			AND SOF_VEHI.VEHI_NUMBER LIKE '" + vehicleNumber
                + "'																										\n");
        query.append(" 			AND SOF_VEHI.VEHI_TYPE LIKE '%"
                + String.valueOf(vehicleType) + "%'																			\n");

        // Selecting the row that contains the stations data
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {

                StationEntity station = cursorToStation(cursor);
                if (station.getNumber().equals(searchedStationNumber)) {
                    break;
                }

                stationPosition++;
                cursor.moveToNext();
            }
            return stationPosition;

        } catch (Exception e) {
            return stationPosition;
        }
    }

    /**
     * Creating new Station object with the data of the current row of the
     * database
     *
     * @param cursor the input cursor for interacting with the DB
     * @return the station object on the current row
     */
    private StationEntity cursorToStation(Cursor cursor) {
        StationEntity station = new StationEntity();

        // Check if have to translate the station name
        String stationName = cursor.getString(1).toUpperCase(
                new Locale(LanguageChange.getUserLocale(context)));
        if (!"bg".equals(language)) {
            stationName = TranslatorCyrillicToLatin.translate(context,
                    stationName);
        }

        // Getting all columns of the row and setting them to a Station object
        station.setNumber(cursor.getString(0));
        station.setName(stationName);
        station.setLat(cursor.getString(2));
        station.setLon(cursor.getString(3));

        return station;
    }

}