package com.company.profils;

import com.company.BddConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

//    protected Connection connect = null;

//    public UserDAO(Connection conn) {
//
//
//        this.connect = conn;
//    }

    public static void create(User obj) {
        BddConnection newconnect = new BddConnection();
        Connection connect = newconnect.getInstance();

        create(obj, connect);
    }

    public static void create(User obj, Connection connect) {

        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO listuser (login, password, usertype) VALUES (?, ?, ?)");
            //On paramètre notre requête préparée
            prepare.setString(1,obj.getLogin());
            prepare.setString(2, obj.getPassword());
            prepare.setInt(3, obj.getType());

            prepare.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

        public boolean delete (User obj){
            return false;
        }

        public boolean update (User obj){
            return false;
        }

//    public User find() {
//
//    }


}
