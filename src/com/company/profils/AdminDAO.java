package com.company.profils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.BddConnection;

public class AdminDAO {

    protected Connection connect = null;

    public AdminDAO(Connection conn) {
        this.connect = conn;
    }

    public boolean create(Admin obj) {
        return false;
    }

    public boolean delete(Admin obj) {
        return false;
    }

    public boolean update(Admin obj) {
        return false;
    }

    public Admin find(int id) {
        Admin user = new Admin();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM listuser WHERE idProduct = ? ");
            if (result.first())
                user = new Admin(
                        result.getString("login"),
                        result.getString("password"
                        ));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

}

