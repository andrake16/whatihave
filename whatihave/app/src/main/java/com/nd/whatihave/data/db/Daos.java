package com.nd.whatihave.data.db;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.nd.whatihave.data.entities.Category;
import com.nd.whatihave.data.entities.Thing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by ND on 2/20/2017.
 */

public class Daos {


    public static void createAllDAO() throws SQLException {

        String databaseUrl = "jdbc:h2:mem:account";

        //jdbc example witout ORMLite
        //Connection connection = DriverManager.getConnection(databaseUrl);
        //Statement statement = connection.createStatement();
        //statement.execute("");

        //jdbc example with ORMLite
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        Dao<Thing,String> daoThing = DaoManager.createDao(connectionSource,Thing.class);

        Thing thing = new Thing();
        thing.setThingName("Teapot ");
        daoThing.create(thing);

        TableUtils.createTable(connectionSource,Thing.class);

        //android SQLite with ORM






        Dao<Thing,String> thingDao = DaoManager.createDao(connectionSource, Thing.class);
        Dao<Category,String> categoryDao = DaoManager.createDao(connectionSource,Category.class);


    }
}
