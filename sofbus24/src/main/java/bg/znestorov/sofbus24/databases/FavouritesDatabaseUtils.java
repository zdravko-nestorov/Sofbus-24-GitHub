package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Class containing all helping functions for creating and deleting the
 * Favorites DB
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class FavouritesDatabaseUtils {

    /**
     * Acquire a synchronization when open/close the database
     */
    private static final Object FAVOURITES_DB_LOCK = new Object();
    /**
     * Check how many times the database is open, so close the DB when it is really needed.
     * For example if the counter is ZERO, this means that there are no open connections
     * to it and will try to close something that is not really open. This way we will save
     * time and do what is needed only when it is needed
     */
    private static volatile int favouritesDbCounter;

    /**
     * Delete all records from the Favorites DB (the DB remains empty - it is
     * not deleted)
     *
     * @param context the current activity context
     */
    public static void deleteFavouriteDatabase(Activity context) {
        FavouritesDataSource favouritesDatasource = new FavouritesDataSource(
                context);
        favouritesDatasource.open();
        favouritesDatasource.deleteAllStations();
        favouritesDatasource.close();
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
    public static SQLiteDatabase openFavouritesDb(FavouritesSQLite dbHelper, SQLiteDatabase database)
            throws SQLException {

        // Acquire a synchronization when open the database
        synchronized (FAVOURITES_DB_LOCK) {

            // Increase the open/close DB counter
            favouritesDbCounter++;

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
     * @param dbHelper the favourites database helper
     * @param database the favourites database
     */
    public static void closeFavouritesDb(FavouritesSQLite dbHelper, SQLiteDatabase database) {

        // Acquire a synchronization when close the database
        synchronized (FAVOURITES_DB_LOCK) {

            // Decrease the open/close DB counter
            favouritesDbCounter--;

            // Check if the counter is ZERO and if the database is really open. Only if
            // the conditions are fulfilled, we MUST close the database. Otherwise - do
            // nothing (we have already closed it)
            if (favouritesDbCounter == 0 && database != null && database.isOpen()) {
                dbHelper.close();
            }
        }
    }

}
