package com.company;

import com.company.profils.*;

import java.sql.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {

        // Window fence = new Window();

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

            customer = new Customer(login, password);
//            CustomerDAO user= new CustomerDAO(Connection.getInstance());

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