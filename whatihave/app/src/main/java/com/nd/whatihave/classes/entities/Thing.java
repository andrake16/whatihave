package com.nd.whatihave.classes.entities;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by ND on 1/19/2017.
 */

@DatabaseTable(tableName = Thing.TABLE_NAME)
public class Thing {


    public static final String TABLE_NAME = "Things";


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
