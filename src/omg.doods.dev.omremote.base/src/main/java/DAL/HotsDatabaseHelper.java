package DAL;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by thiba on 11/10/2016.
 */

public class HotsDatabaseHelper  extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "omvtable.db";
    private static final int DATABASE_VERSION = 2;

    public HotsDatabaseHelper(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        HostsTable.onCreate(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        HostsTable.onUpgrade(sqLiteDatabase, oldVersion, newVersion);
    }
}
