package com.nd.whatihave.data.entities;

import android.provider.BaseColumns;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ND on 1/19/2017.
 */

@DatabaseTable(tableName = Category.TABLE_NAME)
public class Category {

    public static final String TABLE_NAME = "Category";

    public static final String COLUMN_ID = BaseColumns._ID;
    public static final String COLUMN_CATEGORY_ID = "categoryId";
    public static final String COLUMN_CATEGORY_NAME = "categoryName";



    @DatabaseField(id = true, dataType = DataType.STRING)
    private String categoryId;

    @DatabaseField(dataType = DataType.STRING)
    private String categoryName;


    public Category() {
    }

    public Category(String categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
