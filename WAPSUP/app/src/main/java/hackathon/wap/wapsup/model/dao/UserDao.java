package hackathon.wap.wapsup.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import hackathon.wap.wapsup.model.DBHelper;
import hackathon.wap.wapsup.model.dto.UserDto;

public class UserDao {
    public DBHelper dbHelper;

    public UserDao(Context context) {
        dbHelper = DBHelper.getInstance(context);
    }

    public void insert(UserDto userDto) {
        ContentValues values = new ContentValues();
        values.put("user_name", userDto.getUserEmail());
        values.put("user_password", userDto.getUserPassword());
        values.put("user_email", userDto.getUserEmail());

        dbHelper.getWritableDatabase().insert("USER", null, values);
    }


    public void delete(UserDto userDto) {
        String[] where = new String[]{
                userDto.getUserEmail()
        };

        dbHelper.getWritableDatabase().delete("USER", null, where);
    }

    public void update(UserDto userDto) {
        ContentValues values = new ContentValues();

        values.put("user_email", userDto.getUserEmail());
        values.put("user_password", userDto.getUserPassword());
        values.put("user_name", userDto.getUserName());

        String[] where = new String[]{userDto.getUserEmail()
        };
        dbHelper.getWritableDatabase().update("USER", values, "user_email = ?", where);
    }

    public UserDto read(String Email) {
        String[] where = new String[]{Email};
        Log.e("aa", dbHelper.getDatabaseName());
        Cursor cursor = dbHelper.getReadableDatabase().query("USER", null, "user_email = ?", where, null, null, null);

        if (cursor.getCount()==0)
            return null;

        Log.e("read: ", cursor.getCount() + "");
        cursor.moveToFirst();
        UserDto dto = new UserDto(cursor.getString(0), cursor.getString(1), cursor.getString(2));
        return dto;
    }

}