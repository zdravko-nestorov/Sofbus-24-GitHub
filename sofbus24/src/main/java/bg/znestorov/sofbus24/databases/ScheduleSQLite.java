package bg.znestorov.sofbus24.databases;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Schedule SQLite helper class, responsible for DB life-cycle
 *
 * @author Zdravko Nestorov
 * @version 2.0
 */
public class ScheduleSQLite extends SQLiteOpenHelper {

    // Table and columns names
    public static final String TABLE_SOF_SCHE = "SOF_SCHE";
    public static final String COLUMN_PK_SCHE_ID = "PK_SCHE_ID";
    public static final String COLUMN_SCHE_TYPE = "SCHE_TYPE";
    public static final String COLUMN_SCHE_VEHICLE_NUMBER = "SCHE_VEHICLE_NUMBER";
    public static final String COLUMN_SCHE_STATION_NUMBER = "SCHE_STATION_NUMBER";
    public static final String COLUMN_SCHE_DATA = "SCHE_DATA";
    public static final String COLUMN_SCHE_TIMESTAMP = "SCHE_TIMESTAMP";

    // Database name and version
    private static final String DATABASE_NAME = "schedule.db";
    private static final int DATABASE_VERSION = 1;

    // Database creation SQL statement
    private static final String DATABASE_CREATE_SCHEDULE = "CREATE TABLE "
            + TABLE_SOF_SCHE + " (" + COLUMN_PK_SCHE_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE, "
            + COLUMN_SCHE_TYPE + " TEXT NOT NULL, "
            + COLUMN_SCHE_VEHICLE_NUMBER + " TEXT NOT NULL, "
            + COLUMN_SCHE_STATION_NUMBER + " TEXT NOT NULL, "
            + COLUMN_SCHE_DATA + " TEXT, " + COLUMN_SCHE_TIMESTAMP
            + " DATETIME NOT NULL DEFAULT CURRENT_DATE);";

    public ScheduleSQLite(Activity context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE_SCHEDULE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion,
                          int newVersion) {
        database.execSQL("DROP TABLE IF EXISTS " + TABLE_SOF_SCHE);
        onCreate(database);
    }
}