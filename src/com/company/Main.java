package com.company;

import com.company.profils.Admin;
import com.company.profils.Customer;
import com.company.profils.Marketing;
import com.company.profils.User;


import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {


        try {

           // Connectionbdd connect = new Connectionbdd();



            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver O.K.");

            String url = "jdbc:mariadb://localhost:3306/aircorp";
            String user = "root";
            String passwd = "root";

            Connection conn = DriverManager.getConnection(url, user, passwd);
            System.out.println("Connexion à la bdd air-corp !!");

            //Affichage de la liste de produits :

            //Création d'un objet Statement
            Statement state = conn.createStatement();
            //L'objet ResultSet contient le résultat de la requête SQL
            ResultSet result = state.executeQuery("SELECT * FROM listproduct");
            //On récupère les MetaData
            ResultSetMetaData resultMeta = result.getMetaData();

            System.out.println("\n**********************************");
            //On affiche le nom des colonnes
            for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");

            System.out.println("\n**********************************");

            while(result.next()){
                for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                    System.out.print("\t" + result.getObject(i).toString() + "\t |");

                System.out.println("\n---------------------------------");

            }


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


            // Update un produit
            PreparedStatement prepare3 = conn.prepareStatement("UPDATE listproduct SET nameProduct= ? WHERE idProduct= ? ") ;
            //On paramètre notre requête préparée
            prepare3.setString(1, "air-Caca");
            prepare3.setInt(2,3);



            // Afficher un produit
            Statement state1 = conn.createStatement();
            ResultSet result1 = state1.executeQuery("SELECT nameProduct, priceProduct FROM listproduct Where idProduct =1");



            // On affiche un produit
            while(result1.next()) {
                String p = result1.getString("nameProduct");
                Float p2 = result1.getFloat("priceProduct");
                System.out.println(p+"   " + p2);
            }

            result.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



        // air-corp sans bdd

        try {

            PreparedStatement prepare = BddConnection.getInstance().prepareStatement("SELECT * FROM userlist WHERE idProduct = ? ");
            Statement state = BddConnection.getInstance().createStatement();

        } catch (Exception e ) {
            e.printStackTrace();
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Utilisateur,  commercial, marketing manager ? u/c/m");
        String type = sc.nextLine();
        User customer;
        if (type.equals("u")) {

            System.out.println("Veuillez saisir votre login ");
            String login = sc.nextLine();

            System.out.println("Veuillez saisir votre mot de passe ");
            String password = sc.nextLine();

            customer = new Customer(login,password);

        }
        else if (type.equals("c")) {
            System.out.println("Veuillez saisir votre login de commercial");
            String login = sc.nextLine();

            System.out.println("Veuillez saisir votre mot de passe commercial");
            String password = sc.nextLine();

            System.out.println("Commercial de niveau 1 ou Commercial de niveau 2 ?");
            String moderator = sc.nextLine();


            if (moderator.equals("1")) {
                customer = new Admin(login, password, "1");
            }
            else if (moderator.equals("2")) {
                customer = new Admin(login, password, "2");
            }
            else {
                customer = new Admin();
            }
        }
        else if (type.equals("m")) {

            System.out.println("Veuillez saisir votre login ");
            String login = sc.nextLine();

            System.out.println("Veuillez saisir votre mot de passe ");
            String password = sc.nextLine();

            customer = new Marketing(login, password);

        }
        else {
            customer = new Customer();
        }

        try {
        customer.displayMenu();
        int reponse = sc.nextInt();

        customer.exec(reponse);

        } catch (InputMismatchException err) {

            System.out.println("Tu n'as pas choisi de Chiffre ! Dehors !!");

        }

    }



}