package com.company;

import java.util.Scanner;

public class main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre login ");
        String login = sc.nextLine();

        System.out.println("Veuillez saisir votre mot de passe ");
        String password = sc.nextLine();

        System.out.println("Bienvenue cher " + login);
        System.out.println("Votre mot de passe" + password);

        User user = new User(login,password);




        System.out.println("Veuillez vous modifier votre mot de passe ?" + "o/y");
        String answer = sc.nextLine();
        if (answer.equals("o")) {
            System.out.println("Veuillez saisir votre nouveau mot de passe");
            String password = sc.nextLine();
        }

    }
