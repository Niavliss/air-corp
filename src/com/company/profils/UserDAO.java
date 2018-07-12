package com.company.profils;

import com.company.BddConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    protected Connection connect = null;

    public UserDAO(Connection conn) {


        this.connect = conn;
    }


    public void create(User obj) {

        try {
            PreparedStatement prepare = connect.prepareStatement("INSERT INTO listuser (login, password, usertype) VALUES (?, ?, ?)");
            //On paramètre notre requête préparée
            prepare.setString(1, obj.getLogin());
            prepare.setString(2, obj.getPassword());
            prepare.setInt(3, obj.getType());

            prepare.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean delete(User obj) {

        return false;
    }

    public void update(User obj) {

        try {
            PreparedStatement prepare = connect.prepareStatement("UPDATE listuser (login, password, usertype) VALUES (?, ?, ?)");
            //On paramètre notre requête préparée
            prepare.setString(1, obj.getLogin());
            prepare.setString(2, obj.getPassword());
            prepare.setInt(3, obj.getType());

            prepare.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List <User> findAll() {

        List <User> list = new ArrayList<>();

        try {

            //Affichage de la liste de produits :

            //Création d'un objet Statement
            Statement state = connect.createStatement();
            //L'objet ResultSet contient le résultat de la requête SQL
            ResultSet result = state.executeQuery("SELECT * FROM listuser");
            //On récupère les MetaData
            ResultSetMetaData resultMeta = result.getMetaData();


            System.out.println("\n**********************************");
//            On affiche le nom des colonnes
            for (int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

            System.out.println("\n**********************************");

            while (result.next()) {
                for (int i = 1; i <= resultMeta.getColumnCount(); i++)
                    System.out.print("\t" + result.getObject(i).toString() + "\t |");

                System.out.println("\n---------------------------------");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

//    public User find() {
//
//    }


    }
}
