package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

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
    public static final Integer DB_STATIONS_VERSION = 86;
    private static final String DB_PATH = "//data//data//bg.znestorov.sofbus24.main//databases//";
    private static final String DB_STATIONS_NAME = "stations.db";
    private static final String DB_STATIONS_JOURNAL_NAME = "stations.db-journal";

    private static final String DB_VEHICLES_NAME = "vehicles.db";
    private static final String DB_VEHICLES_JOURNAL_NAME = "vehicles.db-journal";
    /**
     * Acquire a synchronization when open/close the database
     */
    private static final Object DB_LOCK = new Object();
    /**
     * Check how many times the database is open, so close the DB when it is really needed.
     * For example if the counter is ZERO, this means that there are no open connections
     * to it and will try to close something that is not really open. This way we will save
     * time and do what is needed only when it is needed
     */
    private static volatile int dbCounter;

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

    /**
     * A strange error occurs sometimes - {android.database.sqlite.SQLiteDiskIOException:
     * disk I/O error}. The exception itself is generated in the native sqlite code, and
     * while I haven't looked up the C/C++ part of the JNI interface, this should come
     * directly from the underlying sqlite3_open call. For non obvious reasons the actual
     * error code is not included in the thrown exception, so you are basically out of luck
     * here to find the root cause.
     * As this comes directly from the native layer it's some kind of filesystem/hardware problem.
     * The card may be broken, the card socket may be broken/dirty/whatever or anything in between
     * could be messed up (most likely physically).
     * <p/>
     * For more information, StackOverflow posts:<br/>
     * {http://stackoverflow.com/questions/20189026/contentprovider-throws-
     * sqlitecantopendatabaseexception-unable-to-open-database}<br/>
     * {http://stackoverflow.com/questions/4651797/database-handling-stoped-
     * working-on-android-2-2-1-desire-hd-1-72-405-3/4828540#4828540}
     *
     * @throws SQLException in case of an SQL problem
     */
    public static SQLiteDatabase openDb(Sofbus24SQLite dbHelper, SQLiteDatabase database)
            throws SQLException {

        // Acquire a synchronization when open the database
        synchronized (DB_LOCK) {

            // Increase the open/close DB counter
            dbCounter++;

            // Check if the database is open. If so - do nothing (we have what we need)
            if (database != null && database.isOpen()) {
                return database;
            }

            // Create and/or open a database that will be used for reading and writing
            database = dbHelper.getWritableDatabase();
        }

        return database;
    }

    /**
     * Close the database. Firstly check if somebody is holding the LOCK over it and after that -
     * if it is open now
     *
     * @param dbHelper the sofbus 24 database helper
     * @param database the sofbus 24 database
     */
    public static void closeDb(Sofbus24SQLite dbHelper, SQLiteDatabase database) {

        // Acquire a synchronization when close the database
        synchronized (DB_LOCK) {

            // Decrease the open/close DB counter
            dbCounter--;

            // Check if the counter is ZERO and if the database is really open. Only if
            // the conditions are fulfilled, we MUST close the database. Otherwise - do
            // nothing (we have already closed it)
            if (dbCounter == 0 && database != null && database.isOpen()) {
                dbHelper.close();
            }
        }
    }

}