package com.company;

import com.company.profils.*;


import java.sql.*;
import java.util.InputMismatchException;
import java.sql.SQLException;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {


//        try {

//            //Affichage de la liste de produits :
//
//            //Création d'un objet Statement
//            Statement state = conn.createStatement();
//            //L'objet ResultSet contient le résultat de la requête SQL
//            ResultSet result = state.executeQuery("SELECT * FROM listproduct");
//            //On récupère les MetaData
//            ResultSetMetaData resultMeta = result.getMetaData();
//
//            System.out.println("\n**********************************");
//            //On affiche le nom des colonnes
//            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
//                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
//
//            System.out.println("\n**********************************");
//
//            while(result.next()){
//                for(int i = 1; i <= resultMeta.getColumnCount(); i++)
//                    System.out.print("\t" + result.getObject(i).toString() + "\t |");
//
//                System.out.println("\n---------------------------------");
//
//            }


        // Ajout d'un produit

//
//            PreparedStatement prepare = conn.prepareStatement("INSERT INTO listproduct (idProduct, stockProduit, priceProduct, nameProduct) VALUES (?, ?, ?, ?)") ;
//            //On paramètre notre requête préparée
//            prepare.setInt(1,8);
//            prepare.setInt(2, 12);
//            prepare.setFloat(3, 1102);
//            prepare.setString(4, "air-Bouteille");
//
//
//            prepare.execute();
//            System.out.println(prepare.toString());

        // Enlève un produit

//            PreparedStatement prepare2 = conn.prepareStatement("DELETE FROM listproduct WHERE idProduct = ?") ;
//            //On paramètre notre requête préparée
//            prepare2.setInt(1,4);
//
//            prepare2.execute();


//            // Update un produit
//            PreparedStatement prepare3 = conn.prepareStatement("UPDATE listproduct SET nameProduct= ? WHERE idProduct= ? ") ;
//            //On paramètre notre requête préparée
//            prepare3.setString(1, "air-Caca");
//            prepare3.setInt(2,3);
//
//
//
//            // Afficher un produit
//            Statement state1 = conn.createStatement();
//            ResultSet result1 = state1.executeQuery("SELECT nameProduct, priceProduct FROM listproduct Where idProduct =1");
//
//
//
//            // On affiche un produit
//            while(result1.next()) {
//                String p = result1.getString("nameProduct");
//                Float p2 = result1.getFloat("priceProduct");
//                System.out.println(p+"   " + p2);
//            }
//
//            result.close();
//            conn.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        // air-corp sans bdd



        try {

            UserDAO userDao = new UserDAO(BddConnection.getInstance());
//            userDao.find();


//            ResultSet result = this.connect.createStatement(
//                    ResultSet.TYPE_SCROLL_INSENSITIVE,
//                    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM listuser WHERE idUser = '?' ");

            Scanner sc = new Scanner(System.in);
            System.out.println("Utilisateur,  commercial, marketing manager ? u/c/m");
            String type = sc.nextLine();

//            if (result.first())

            // si l'utilisateur choisi u:
            if (type.equals("u")) {

                int usertype = 1;

                System.out.println("Veuillez saisir votre login ");
                String login = sc.nextLine();

                System.out.println("Veuillez saisir votre mot de passe ");
                String password = sc.nextLine();

                User user = new Customer(login, password, usertype);

                userDao.create(user);
            }

            // si l'utilisateur choisi c
            else if (type.equals("c")) {

                int usertype = 2;

                System.out.println("Veuillez saisir votre login de commercial");
                String login = sc.nextLine();

                System.out.println("Veuillez saisir votre mot de passe commercial");
                String password = sc.nextLine();

                System.out.println("Commercial de niveau 1 ou Commercial de niveau 2 ?");
                String moderator = sc.nextLine();

                // si l'utilisateur choisi 1
                if (moderator.equals("1")) {

//                    UserDAO userDao = new UserDAO(BddConnection.getInstance());
                    User user = new Admin(login, password, "1");

//                    userDao.create(user);

                }
                // si l'utilisateur choisi 2
                else if (moderator.equals("2")) {

//                    UserDAO userDao = new UserDAO(BddConnection.getInstance());
                    User user = new Admin(login, password, "2");

//                    userDao.create(user);

                }
            }

            // si l'utilisateur choisi m
            else if (type.equals("m")) {

                int usertype = 4;

                System.out.println("Veuillez saisir votre login ");
                String login = sc.nextLine();

                System.out.println("Veuillez saisir votre mot de passe ");
                String password = sc.nextLine();

                User user = new Marketing(login, password, usertype);

                userDao.create(user);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

//        return user;

    }

//             catch (InputMismatchException err) {
//
//                System.out.println("Tu n'as pas choisi de Chiffre ! Dehors !!");
//
//            }


}
