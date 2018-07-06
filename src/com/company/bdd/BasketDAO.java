package com.company.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.BddConnection;

public class BasketDAO {

    protected Connection connect = null;

    public BasketDAO(Connection conn) {
        this.connect = conn;
    }

    public boolean create(Basket obj) {
        return false;
    }

    public boolean delete(Basket obj) {
        return false;
    }

    public boolean update(Basket obj) {
        return false;
    }

    public Basket find(int id) {
        Basket user = new Basket();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM listuser WHERE idProduct = ? ");
            if (result.first())
                user = new Basket();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}