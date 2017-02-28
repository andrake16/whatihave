package com.nd.whatihave.data.db;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.nd.whatihave.data.entities.Category;
import com.nd.whatihave.data.entities.Thing;

import java.sql.SQLException;

/**
 * Created by ND on 2/20/2017.
 */

public class Daos {


    public static void createAllDAO() throws SQLException {

        String databaseUrl = "jdbc:h2:mem:account";
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);
        Dao<Thing,String> ThingDao = DaoManager.createDao(connectionSource, Thing.class);
        Dao<Category,String> CategoryDao = DaoManager.createDao(connectionSource,Category.class);

    }
}
