package bg.znestorov.sofbus24.databases;

import android.app.Activity;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Class containing all helping functions for creating the Stations DB from an
 * XML file, copying to the SD card, copying the DB from the assets and so on
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class Sofbus24DatabaseUtils {

    /**
     * The version of the database. When an application update is made, it is
     * recommended to use the same version that is used into the ConfigData
     * project. This way when the user install it for a first time or update it,
     * the version will be the same as in the config file, which won't activate
     * the automatic application update (it may be one version up - all is up to
     * you)
     */
    public static final Integer DB_STATIONS_VERSION = 13;
    private static final String DB_PATH = "//data//data//bg.znestorov.sofbus24.main//databases//";
    private static final String DB_STATIONS_NAME = "stations.db";
    private static final String DB_STATIONS_JOURNAL_NAME = "stations.db-journal";

    private static final String DB_VEHICLES_NAME = "vehicles.db";
    private static final String DB_VEHICLES_JOURNAL_NAME = "vehicles.db-journal";

    /**
     * Delete the old databases (stations.db and vehicles.db) and create an
     * empty database on the system and rewrites it with the ready database
     *
     * @param context the current activity context
     */
    public static void createOrUpgradeSofbus24Database(Activity context) {
        deleteOldDatabases(context);

        InputStream dbInputStream = getDatabaseInputStream(context);
        Sofbus24SQLite myDbHelper = new Sofbus24SQLite(context);
        myDbHelper.createOrUpgradeDataBase(dbInputStream, DB_STATIONS_VERSION);

        // Delete the new db file after the DB is updated (if the update is done
        // via the application)
        if (dbInputStream != null) {
            context.deleteFile(Sofbus24SQLite.DB_NAME);
        }
    }

    /**
     * Check if the database is valid (if all tables and columns exists)
     *
     * @param context the current activity context
     * @return if the database is valid
     */
    public static boolean isSofbus24DatabaseValid(Activity context) {

        Sofbus24DataSource sofbus24DataSource = new Sofbus24DataSource(context);
        return sofbus24DataSource.isSofbus24ValidDatabase();
    }

    /**
     * Delete all records from the Station DB (the DB remains empty - it is not
     * deleted)
     *
     * @param context the current activity context
     */
    public static void deleteStationDatabase(Activity context) {
        StationsDataSource stationsDatasource = new StationsDataSource(context);
        stationsDatasource.open();
        stationsDatasource.deleteAllStations();
        stationsDatasource.close();
    }

    /**
     * Delete the database file in the current path
     *
     * @param context the current Activity context
     * @param path    the database file
     */
    private static void deleteDatabase(Activity context, String path) {
        File dbFile = new File(path);
        dbFile.delete();
    }

    /**
     * Delete the old databases that were used (Stations and Vehicles)
     *
     * @param context the current activity context
     */
    private static void deleteOldDatabases(Activity context) {
        deleteDatabase(context, DB_PATH + DB_STATIONS_NAME);
        deleteDatabase(context, DB_PATH + DB_STATIONS_JOURNAL_NAME);
        deleteDatabase(context, DB_PATH + DB_VEHICLES_NAME);
        deleteDatabase(context, DB_PATH + DB_VEHICLES_JOURNAL_NAME);
    }

    /**
     * Get the input database stream (if a database update is found - get the
     * stream from the Files folder and delete the existing database)
     *
     * @param context the current activity context
     * @return the input database stream
     */
    private static InputStream getDatabaseInputStream(Activity context) {

        FileInputStream dbInputStream;
        try {
            dbInputStream = context.openFileInput(Sofbus24SQLite.DB_NAME);
        } catch (Exception e) {
            dbInputStream = null;
        }

        return dbInputStream;
    }

}