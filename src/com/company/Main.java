package com.company;

import com.company.profils.Admin;
import com.company.profils.Customer;
import com.company.profils.Marketing;
import com.company.profils.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Window fence = new Window();

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

        customer.displayMenu();
        int reponse = sc.nextInt();
        customer.exec(reponse);

    }

}