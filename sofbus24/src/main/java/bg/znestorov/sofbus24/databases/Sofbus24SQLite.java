package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import bg.znestorov.sofbus24.about.Configuration;
import bg.znestorov.sofbus24.entity.ConfigEntity;
import bg.znestorov.sofbus24.utils.activity.ActivityTracker;

/**
 * Sofbus24 SQLite helper class, responsible for DB life-cycle (keeping
 * Stations, Vehicles and VehiclesStations DBs)
 *
 * @author Zdravko Nestorov
 * @version 1.0
 */
public class Sofbus24SQLite extends SQLiteOpenHelper {

    // 'Stations' table and its columns
    public static final String TABLE_SOF_STAT = "SOF_STAT";
    public static final String COLUMN_PK_STAT_ID = "PK_STAT_ID";
    public static final String COLUMN_STAT_NUMBER = "STAT_NUMBER";
    public static final String COLUMN_STAT_NAME = "STAT_NAME";
    public static final String COLUMN_STAT_LATITUDE = "STAT_LATITUDE";
    public static final String COLUMN_STAT_LONGITUDE = "STAT_LONGITUDE";
    public static final String COLUMN_STAT_TYPE = "STAT_TYPE";

    // 'Vehicle' table and its columns
    public static final String TABLE_SOF_VEHI = "SOF_VEHI";
    public static final String COLUMN_PK_VEHI_ID = "PK_VEHI_ID";
    public static final String COLUMN_VEHI_NUMBER = "VEHI_NUMBER";
    public static final String COLUMN_VEHI_TYPE = "VEHI_TYPE";
    public static final String COLUMN_VEHI_DIRECTION = "VEHI_DIRECTION";

    // 'VehiclesStations' table and its columns
    public static final String TABLE_SOF_VEST = "SOF_VEST";
    public static final String COLUMN_PK_VEST_ID = "PK_VEST_ID";
    public static final String COLUMN_FK_VEST_VEHI_ID = "FK_VEST_VEHI_ID";
    public static final String COLUMN_FK_VEST_STAT_ID = "FK_VEST_STAT_ID";
    public static final String COLUMN_VEST_DIRECTION = "VEST_DIRECTION";
    // The Android's default system path of the database
    public static final String DB_NAME = "sofbus24.db";
    private static final int DATABASE_VERSION = 1;
    private final Activity context;
    private SQLiteDatabase dbSofbus24;

    /**
     * The constructor takes and keeps a reference of the passed context in
     * order to access to the application assets and resources.
     *
     * @param context the current context
     */
    public Sofbus24SQLite(Activity context) {
        super(context, DB_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        /*
         * Not needed as the database is copied from the assets folder
		 */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*
         * Not needed as the application is taking care of the database update
		 * (to prevent any bugs when the database is updated internally or with
		 * the application update)
		 */
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*
         * Not needed anymore, because there was a bug when trying to put a new
		 * version of the database in the configuration data folder. The new
		 * version of the db was '2'. which is causing the problem 'Can't
		 * downgrade database from version 2 to 1'. Because of this we need to
		 * override the method if you want to be able to run the application
		 * with a database on the device with a higher version than your code
		 * can handle.
		 * 
		 * GooglePlay error: "Caused by:
		 * android.database.sqlite.SQLiteException: Can't downgrade database
		 * from version 2 to 1"
		 */
    }

    @Override
    public synchronized void close() {
        if (dbSofbus24 != null)
            dbSofbus24.close();

        super.close();
    }

    /**
     * Create or upgrade (if needed) the database
     *
     * @param is           the database file input stream (or null if the app will use
     *                     the internal embedded database)
     * @param newDbVersion the new version of the database
     */
    public void createOrUpgradeDataBase(InputStream is, int newDbVersion) {

        // Update the configuration file only in case the upgrade of the
        // database is because of a new version of the application (not in case
        // of application database update)
        if (is == null) {
            boolean dbUpgradeNeeded = checkDataBaseForUpgrade(newDbVersion);
            if (dbUpgradeNeeded) {
                Configuration.editDbConfigurationVersionField(context,
                        newDbVersion);
                context.deleteDatabase(DB_NAME);
            }
        } else {
            context.deleteDatabase(DB_NAME);
        }

        createDataBase(is);
    }

    /**
     * Check if the database need to be upgraded
     *
     * @param newDbVersion the new database version
     * @return true - if the database needs to be upgraded), false - otherwise
     */
    private boolean checkDataBaseForUpgrade(int newDbVersion) {

        ConfigEntity config = new ConfigEntity(context);
        int currentDbVersion = config.getSofbus24DbVersion();

        return newDbVersion > currentDbVersion;
    }

    /**
     * Create an empty database on the system and rewrites it with the ready
     * database
     *
     * @param is the database file input stream (or null if the app will use
     *           the internal embedded database)
     */
    private void createDataBase(InputStream is) {

        // Check if the DB already exists
        boolean dbExist = checkDataBase();

        if (!dbExist) {
            try {
                copyDataBase(is);
            } catch (IOException e) {
                ActivityTracker.sendCaughtException(context,
                        "Sofbus24SQLite.createDataBase(...)",
                        "Error copying database", e);

                throw new Error("Error copying database: \n"
                        + e.getStackTrace());
            }
        }
    }

    /**
     * Check if the database already exist to avoid re-copying the file each
     * time the application is opened
     *
     * @return if the DB exists or not
     */
    private boolean checkDataBase() {
        File dbFile = context.getDatabasePath(DB_NAME);

        return dbFile.exists();
    }

    /**
     * Copies the stations database from the local assets-folder to the just
     * created empty database in the system folder, from where it can be
     * accessed and handled. This is done by transferring ByteStream.
     *
     * @throws IOException
     */
    private void copyDataBase(InputStream is) throws IOException {

        // Open the local DB as the input stream
        InputStream myInput;
        if (is != null) {
            myInput = is;
        } else {
            myInput = context.getAssets().open(DB_NAME);
        }

        // Create the folder and an empty database if it is not already created
        context.openOrCreateDatabase(DB_NAME,
                SQLiteDatabase.CREATE_IF_NECESSARY, null);

        // Path to the just created empty DB
        String outFileName = context.getDatabasePath(DB_NAME).getAbsolutePath();

        // Open the empty DB as the output stream
        OutputStream myOutput = new FileOutputStream(outFileName);

        // Transfer the bytes from the InputFile to the OutputFile
        byte[] buffer = new byte[1024];
        int length;

        while ((length = myInput.read(buffer)) > 0) {
            myOutput.write(buffer, 0, length);
        }

        // Close the streams
        myOutput.flush();
        myOutput.close();
        myInput.close();
    }

}