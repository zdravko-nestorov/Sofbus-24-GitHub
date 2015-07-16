package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Sofbus24 data source class that validates the database (check for missing
 * tables and so on)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class Sofbus24DataSource {

    // Database fields
    private SQLiteDatabase database;
    private Sofbus24SQLite dbHelper;

    private String stationsTableName = Sofbus24SQLite.TABLE_SOF_STAT;
    private String[] stationsColumns = {Sofbus24SQLite.COLUMN_PK_STAT_ID,
            Sofbus24SQLite.COLUMN_STAT_NUMBER, Sofbus24SQLite.COLUMN_STAT_NAME,
            Sofbus24SQLite.COLUMN_STAT_LATITUDE,
            Sofbus24SQLite.COLUMN_STAT_LONGITUDE,
            Sofbus24SQLite.COLUMN_STAT_TYPE};

    private String vehiclesTableName = Sofbus24SQLite.TABLE_SOF_VEHI;
    private String[] vehiclesColumns = {Sofbus24SQLite.COLUMN_PK_VEHI_ID,
            Sofbus24SQLite.COLUMN_VEHI_NUMBER, Sofbus24SQLite.COLUMN_VEHI_TYPE,
            Sofbus24SQLite.COLUMN_VEHI_DIRECTION};

    private String droidTransTableName = Sofbus24SQLite.TABLE_SOF_VEST;
    private String[] droidTransColumns = {Sofbus24SQLite.COLUMN_PK_VEST_ID,
            Sofbus24SQLite.COLUMN_FK_VEST_VEHI_ID,
            Sofbus24SQLite.COLUMN_FK_VEST_STAT_ID,
            Sofbus24SQLite.COLUMN_VEST_DIRECTION};

    public Sofbus24DataSource(Activity context) {
        dbHelper = new Sofbus24SQLite(context);
    }

    private void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    private void close() {
        dbHelper.close();
    }

    /**
     * Check if the database is valid (if all tables and columns are
     * successfully created)
     *
     * @return if the database is valid
     */
    public boolean isSofbus24ValidDatabase() {

        open();
        boolean isSofbus24ValidDatabase = isStationsTableValid()
                && isVehiclesTableValid() && isDroidTransTableValid();
        close();

        return isSofbus24ValidDatabase;
    }

    /**
     * Check if the Stations table is valid (if all columns exists in the table)
     *
     * @return if the Stations table is valid
     */
    private boolean isStationsTableValid() {

        boolean isStationsTabledValid = true;

        for (int i = 0; i < stationsColumns.length; i++) {
            isStationsTabledValid = isStationsTabledValid
                    && existsColumnInTable(database, stationsTableName,
                    stationsColumns[i]);

            // In case there is an error - stop the loop
            if (!isStationsTabledValid) {
                break;
            }
        }

        return isStationsTabledValid;
    }

    /**
     * Check if the Vehicles table is valid (if all columns exists in the table)
     *
     * @return if the Vehicles table is valid
     */
    private boolean isVehiclesTableValid() {

        boolean isVehiclesTabledValid = true;

        for (int i = 0; i < vehiclesColumns.length; i++) {
            isVehiclesTabledValid = isVehiclesTabledValid
                    && existsColumnInTable(database, vehiclesTableName,
                    vehiclesColumns[i]);

            // In case there is an error - stop the loop
            if (!isVehiclesTabledValid) {
                break;
            }
        }

        return isVehiclesTabledValid;
    }

    /**
     * Check if the DroidTrans table is valid (if all columns exists in the
     * table)
     *
     * @return if the DroidTrans table is valid
     */
    private boolean isDroidTransTableValid() {

        boolean isDroidTransTabledValid = true;

        for (int i = 0; i < droidTransColumns.length; i++) {
            isDroidTransTabledValid = isDroidTransTabledValid
                    && existsColumnInTable(database, droidTransTableName,
                    droidTransColumns[i]);

            // In case there is an error - stop the loop
            if (!isDroidTransTabledValid) {
                break;
            }
        }

        return isDroidTransTabledValid;
    }

    /**
     * Check if a columns exists in the database
     *
     * @param database      the sofbus 24 database
     * @param table         the table that want to validate
     * @param columnToCheck the column to check
     * @return if the column to check exists in the database
     */
    private boolean existsColumnInTable(SQLiteDatabase database, String table,
                                        String columnToCheck) {

        Cursor cursor = null;
        boolean existsColumnInTable;

        try {
            cursor = database.rawQuery("SELECT * FROM " + table + " LIMIT 0",
                    null);

            // Check if the column exists in the database
            if (cursor.getColumnIndex(columnToCheck) != -1) {
                existsColumnInTable = true;
            } else {
                existsColumnInTable = false;
            }
        } catch (Exception e) {
            existsColumnInTable = false;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        return existsColumnInTable;
    }
}