package com.company.bdd;

import com.company.profils.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CatalogDAO {

    protected Connection connect = null;

    public CatalogDAO(Connection conn) {
        this.connect = conn;
    }

    public boolean create(Catalog obj) {
        return false;
    }

    public boolean delete(Catalog obj) {
        return false;
    }

    public boolean update(Catalog obj) {
        return false;
    }

    public Catalog find(int id) {
        Catalog user = new Catalog();

        try {
            ResultSet result = this.connect.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM listproduct WHERE idProduct = ? ");
            if (result.first())
                user = new Catalog();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
