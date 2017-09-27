package hackathon.wap.wapsup.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    private static DBHelper mInstance;
    private static SQLiteDatabase db;
    Context context;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    private DBHelper(final Context context) {
        super(context, "FEEDGET", null, 1);
        this.context = context;

    }

    private static void initialize(Context context) {
        if (mInstance == null) {
            mInstance = new DBHelper(context);
            try {
                db = mInstance.getWritableDatabase();
            } catch (SQLiteException se) {

            }
        }
    }

    public static final DBHelper getInstance(Context context) {
        initialize(context);
        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.e("ee", "USER TABLE SUCCESS");
        db.execSQL("CREATE TABLE USER (user_email TEXT PRIMARY KEY, user_password TEXT, user_name TEXT);");
    }



    // DB 업그레이드를 위해 버전이 변경될 때 호출되는 함수
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
