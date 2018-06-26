package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Utilisateur ou commercial ? u/c");
        String type = sc.nextLine();
        User user;
        if (type.equals("u")) {

            System.out.println("Veuillez saisir votre login ");
            String login = sc.nextLine();

            System.out.println("Veuillez saisir votre mot de passe ");
            String password = sc.nextLine();

            System.out.println("Quel budjet avez-vous ? ");
            double budjet = sc.nextDouble();

            user = new Customer(login, password, budjet);

        }
        else if (type.equals("c")) {
            System.out.println("Veuillez saisir votre login de commercial");
            String login = sc.nextLine();

            System.out.println("Veuillez saisir votre mot de passe commercial");
            String password = sc.nextLine();

            System.out.println("Type 1 ou 2");
            int moderator = sc.nextInt();

            if (moderator == 1) {
                user = new Commercial(login, password);
            }
            else if (moderator == 2) {
                user = new Commercial2(login, password);
            }
            else {
                user = new User(); {
                }
            }
        }
        else {
            user = new User();
        }


        user.displayMenu();
        int reponse = sc.nextInt();
        user.exec(reponse);

    }

}