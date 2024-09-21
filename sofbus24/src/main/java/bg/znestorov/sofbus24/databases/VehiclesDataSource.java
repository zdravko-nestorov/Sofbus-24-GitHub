package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import bg.znestorov.sofbus24.entity.StationEntity;
import bg.znestorov.sofbus24.entity.VehicleEntity;
import bg.znestorov.sofbus24.entity.VehicleTypeEnum;
import bg.znestorov.sofbus24.utils.Constants;
import bg.znestorov.sofbus24.utils.LanguageChange;
import bg.znestorov.sofbus24.utils.TranslatorCyrillicToLatin;
import bg.znestorov.sofbus24.utils.Utils;

/**
 * Vehicles data source class, responsible for all interactions with the
 * vehicles database
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class VehiclesDataSource {

    private final Activity context;
    private final String language;
    private final Sofbus24SQLite dbHelper;
    // Columns of the VEHICLES Table
    private final String[] allColumns = {
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

    public VehiclesDataSource(Activity context) {
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
     * Get the vehicle direction
     *
     * @param vehicleType the vehicle type
     * @return the vehicle direction if it is found in the DB and empty string
     * otherwise
     */
    public String getVehicleDirection(VehicleTypeEnum vehicleType) {

        String selection = Sofbus24SQLite.COLUMN_VEHI_TYPE + " = ?";
        String[] selectionArgs = new String[]{String.valueOf(vehicleType)};

        // Selecting the row that contains the vehicle data
        try (Cursor cursor = database.query(Sofbus24SQLite.TABLE_SOF_VEHI,
                allColumns, selection, selectionArgs, null, null, null)) {

            if (cursor.getCount() > 0) {
                // Moving the cursor to the first column of the selected row
                cursor.moveToFirst();

                // Creating vehicle object
                VehicleEntity foundVehicle = cursorToVehicle(cursor);
                return foundVehicle.getDirection();
            } else {
                return Constants.GLOBAL_PARAM_EMPTY_STRING;
            }

        } catch (Exception e) {
            return Constants.GLOBAL_PARAM_EMPTY_STRING;
        }
    }

    /**
     * Get the vehicles which NUMBER or DIRECTION contains the searched text
     *
     * @param type       the type of the Vehicle
     * @param searchText the user search text
     * @return a list with all vehicles matching the input conditions
     */
    public List<VehicleEntity> getVehiclesViaSearch(VehicleTypeEnum type,
                                                    String searchText) {

        List<VehicleEntity> vehicles = new ArrayList<VehicleEntity>();
        Locale currentLocale = new Locale(language);
        searchText = searchText.toLowerCase(currentLocale);

        StringBuilder query = new StringBuilder();
        query.append(" SELECT * 												\n");
        query.append(" FROM " + Sofbus24SQLite.TABLE_SOF_VEHI + "				\n");
        query.append(" WHERE ( 													\n");
        query.append(" 		lower(CAST(" + Sofbus24SQLite.COLUMN_VEHI_NUMBER
                + " AS TEXT)) LIKE '%" + searchText + "%'						\n");
        query.append(" OR 														\n");
        query.append(" 		lower(" + Sofbus24SQLite.COLUMN_VEHI_DIRECTION
                + ") LIKE '%" + searchText + "%'		 						\n");
        query.append(" ) AND													\n");
        query.append(" 		" + Sofbus24SQLite.COLUMN_VEHI_TYPE + " LIKE '%"
                + type.toString() + "%'											\n");

        // Get the vehicles which NUMBER or DIRECTION contains the searched text
        try (Cursor cursor = database.rawQuery(query.toString(), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                VehicleEntity vehicle = cursorToVehicle(cursor);
                vehicles.add(vehicle);
                cursor.moveToNext();
            }
            return vehicles;

        } catch (Exception e) {
            return vehicles;
        }
    }

    /**
     * Creating new Vehicle object with the data of the current row of the
     * database
     *
     * @param cursor the input cursor for interacting with the DB
     * @return the vehicle object on the current row
     */
    private VehicleEntity cursorToVehicle(Cursor cursor) {

        VehicleEntity vehicle = new VehicleEntity();

        // Check if have to translate the vehicle direction
        String vehicleDirection = cursor.getString(3);
        if (!"bg".equals(language)) {
            vehicleDirection = TranslatorCyrillicToLatin.translate(context,
                    vehicleDirection);
        }

        // Getting all columns of the row and setting them to a Vehicle object
        vehicle.setNumber(cursor.getString(1));
        vehicle.setType(VehicleTypeEnum.valueOf(cursor.getString(2)));
        vehicle.setDirection(vehicleDirection);
        vehicle.setSkgtLineId(cursor.getString(4));
        vehicle.setSkgtName(cursor.getString(5));
        vehicle.setSkgtExtId(cursor.getString(6));
        vehicle.setSkgtType(cursor.getString(7));

        return vehicle;
    }

    /**
     * Get a vehicle that is passing through the chosen station
     *
     * @param station the chosen station
     * @return a vehicle that is passing through the chosen station
     */
    public VehicleEntity getVehicleViaStation(StationEntity station) {

        VehicleEntity vehicle = null;
        String stationNumber = station.getNumber();

        StringBuilder query = new StringBuilder();
        query.append(" SELECT SOF_VEHI.VEHI_NUMBER, SOF_VEHI.VEHI_TYPE, SOF_VEST.VEST_DIRECTION		\n");
        query.append(" FROM SOF_VEHI																\n");
        query.append(" 		JOIN SOF_VEST															\n");
        query.append(" 			ON SOF_VEST.FK_VEST_VEHI_ID = SOF_VEHI.PK_VEHI_ID					\n");
        query.append(" 		JOIN SOF_STAT															\n");
        query.append(" 			ON SOF_STAT.PK_STAT_ID = SOF_VEST.FK_VEST_STAT_ID					\n");
        query.append(" 			AND SOF_STAT.STAT_NUMBER = %s										\n");

        // Selecting the row that contains the stations data
        try (Cursor cursor = database.rawQuery(
                String.format(query.toString(), stationNumber), null)) {

            // Iterating the cursor and fill the empty List<Station>
            if (cursor.getCount() > 0) {

                // Moving the cursor to the first column of the selected row
                cursor.moveToFirst();

                vehicle = cursorToVehicleStation(cursor);
            }
            return vehicle;

        } catch (Exception e) {
            return vehicle;
        }
    }

    /**
     * Creating new Vehicle object with the data of the current row of the
     * database
     *
     * @param cursor the input cursor for interacting with the DB
     * @return the vehicle object on the current row
     */
    private VehicleEntity cursorToVehicleStation(Cursor cursor) {

        VehicleEntity vehicle = new VehicleEntity();

        // Getting all columns of the row and setting them to a Vehicle object
        vehicle.setNumber(cursor.getString(0));
        vehicle.setType(VehicleTypeEnum.valueOf(cursor.getString(1)));
        vehicle.setDirection(cursor.getString(2));

        return vehicle;
    }

    /**
     * Get the vehicles' types that are passing through the chosen station
     *
     * @param station the chosen station
     * @return the vehicles' types that are passing through the chosen station
     */
    public VehicleTypeEnum getVehicleTypesViaStation(StationEntity station) {

        StringBuilder vehicleType = new StringBuilder();
        VehicleTypeEnum vehicleTypeEnum = VehicleTypeEnum.BUS;
        String stationNumber = Utils.removeLeadingZeroes(station.getNumber());

        StringBuilder query = new StringBuilder();
        query.append(" SELECT DISTINCT VEHI_TYPE 									\n");
        query.append(" FROM SOF_VEHI												\n");
        query.append(" WHERE PK_VEHI_ID												\n");
        query.append(" IN  (SELECT DISTINCT FK_VEST_VEHI_ID							\n");
        query.append(" 		FROM SOF_VEST											\n");
        query.append(" 		WHERE FK_VEST_STAT_ID =	(SELECT PK_STAT_ID				\n");
        query.append(" 								 FROM SOF_STAT					\n");
        query.append(" 								 WHERE STAT_NUMBER = %s))		\n");
        query.append(" ORDER BY VEHI_TYPE											\n");

        // Selecting the row that contains the stations data
        try (Cursor cursor = database.rawQuery(
                String.format(query.toString(), stationNumber), null)) {

            // Iterating the cursor and fill the empty List<Station>
            cursor.moveToFirst();

            while (!cursor.isAfterLast()) {
                vehicleType.append(cursor.getString(0)).append("_");
                cursor.moveToNext();
            }

            // Get the vehicles' type passing through the station
            if (vehicleType.length() > 0) {
                vehicleType.deleteCharAt(vehicleType.length() - 1);

                try {
                    return VehicleTypeEnum.valueOf(vehicleType.toString());
                } catch (Exception e) {
                    return vehicleTypeEnum;
                }
            }
            return vehicleTypeEnum;

        } catch (Exception e) {
            return vehicleTypeEnum;
        }
    }
}