package com.nd.whatihave.data.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.nd.whatihave.data.entities.Category;
import com.nd.whatihave.data.entities.Thing;

/**
 * Created by ND on 2/27/2017.
 */

public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "WhatIHaveDataBase";
    private static final int DATABASE_VERSION = 1;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String SQL_CREATE_THING_TABLE = "CREATE TABLE " + Thing.TABLE_NAME + " ("
                                        + Thing.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                                        + Thing.COLUMN_THING_NAME + " STRING NOT NULL,"
                                        + Thing.COLUMN_CATEGORY_ID + " STRING NOT NULL,"
                                        + Thing.COLUMN_PRICE + " INTEGER NOT NULL"
                                        +" );";

        String SQL_CREATE_CATEGORY_TABLE = "CREATE TABLE " + Category.TABLE_NAME + " ( "
                                        + Category.COLUMN_CATEGORY_ID + " INTEGER PIMARY KEY AUTOINCRIMENT, "
                                        + Category.COLUMN_CATEGORY_NAME + " STRING NOT NULL , "
                                        + Category.COLUMN_CATEGORY_ID + " STRING NOT NULL "
                                        + " );";
        sqLiteDatabase.execSQL(SQL_CREATE_THING_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
