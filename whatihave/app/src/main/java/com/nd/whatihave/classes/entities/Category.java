package com.nd.whatihave.classes.entities;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ND on 1/19/2017.
 */

@DatabaseTable(tableName = Category.TABLE_NAME)
public class Category {

    public static final String TABLE_NAME = "Category";


    @DatabaseField(id = true, dataType = DataType.STRING)
    public String categoryId;

    @DatabaseField(dataType = DataType.STRING)
    private String categoryName;
}
