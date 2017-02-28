package com.nd.whatihave.data.entities;

import android.provider.BaseColumns;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ND on 1/19/2017.
 */

@DatabaseTable(tableName = Thing.TABLE_NAME)
public class Thing {


    public static final String TABLE_NAME = "Things";

    public static final String COLUMN_ID = BaseColumns._ID;
    public static final String COLUMN_THING_NAME = "thingName";
    public static final String COLUMN_CATEGORY_ID = "categoryId";
    public static final String COLUMN_PRICE = "price";



    @DatabaseField(id = true, dataType = DataType.STRING)
    private String id;

    @DatabaseField(dataType = DataType.STRING)
    private String thingName;

    @DatabaseField(dataType = DataType.STRING)
    private String categoryId;

    @DatabaseField(dataType = DataType.INTEGER)
    private Integer price;

    public Thing() {
    }

    public Thing(String id, String thingName, String categoryId, Integer price) {
        this.id = id;
        this.thingName = thingName;
        this.categoryId = categoryId;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPrice() {
        return price;
    }


}
