package com.company.profils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.BddConnection;

public class CustomerDAO {

    protected Connection connect = null;

    public CustomerDAO(Connection conn) {
        this.connect = conn;
    }

    public boolean create(Customer obj) {
        return false;
    }

    public boolean delete(Customer obj) {
        return false;
    }

    public boolean update(Customer obj) {
        return false;
    }

    public Customer find(int id) {
        Customer user = new Customer();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM userlist WHERE idProduct = ? ");
            if (result.first())
                user = new Customer(
                        result.getString("login"),
                        result.getString("password"
                        ));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

}
