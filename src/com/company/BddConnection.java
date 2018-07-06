package com.company;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BddConnection {

//    Class.forName("org.mariadb.jdbcDriver");
    private static String url = "jdbc:mariadb://localhost:3306";
    private static String user = "root";
    private static String passwd = "root";
    private static Connection connect;

    private BddConnection() {

        try {
            java.sql.Connection connect = DriverManager.getConnection(url, user, passwd);
            Statement state = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance() {
        if (connect == null) {
            try {
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connect;
    }


}
