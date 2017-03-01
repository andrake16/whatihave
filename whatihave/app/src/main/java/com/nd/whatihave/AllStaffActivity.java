package com.nd.whatihave;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.nd.whatihave.data.db.DbHelper;
import com.nd.whatihave.data.entities.Thing;

public class AllStaffActivity extends AppCompatActivity {

    private DbHelper dbHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_staff);

        dbHelper = new DbHelper(this);
        db = dbHelper.getWritableDatabase();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuItem1: {
                Toast.makeText(this, "menu item1", Toast.LENGTH_SHORT).show();
                fillTableThings();
                return true;
            }
            case R.id.menuItem2: {
                Toast.makeText(this, "menu item2", Toast.LENGTH_SHORT).show();
                readTableThingsAndWriteToLog();
                return true;
            }
            default: return true;
        }


    }

    private void fillTableThings(){
        db = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Thing.COLUMN_THING_NAME,"thing001");
        contentValues.put(Thing.COLUMN_CATEGORY_ID,"thingCategory0001");
        contentValues.put(Thing.COLUMN_PRICE,50);
        db.insert(Thing.TABLE_NAME,null,contentValues);

    }

    private void readTableThingsAndWriteToLog() {
        String[] columnsToShow = {
                Thing.COLUMN_ID,
                Thing.COLUMN_THING_NAME,
                Thing.COLUMN_CATEGORY_ID,
                Thing.COLUMN_PRICE};

        Cursor cursor = db.query(Thing.TABLE_NAME, columnsToShow,null,null,null,null,null);
        while(cursor.moveToNext()) {
            Log.i("---info--- ", String.valueOf(cursor.getInt(0)) + cursor.getString(1));
        }

        cursor.close();
    }
}
