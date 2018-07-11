package com.company;

import java.sql.Connection;

import java.sql.DriverManager;

public class BddConnection {

    //    Class.forName("org.mariadb.jdbcDriver");
    private static String url = "jdbc:mariadb://localhost:3306/aircorp";
    private static String user = "root";
    private static String passwd = "root";
    private static Connection connect;

    public BddConnection() {

        try {
            connect = DriverManager.getConnection(url, user, passwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getInstance() {
        if (connect == null) {

            new BddConnection();

        }

        return connect;
    }


}
