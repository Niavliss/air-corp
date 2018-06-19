package com.company;

import java.util.Scanner;

/**
 * abstract class User with login and password attributs
 */
class User {

    /**
     * String login and String password
     */
    private String login;
    private String password;


    /**
     * @param userlogin
     * @param userpassword
     */
    public User(String userlogin, String userpassword) {

        this.login = userlogin;
        this.password = userpassword;
    }

    public static void main (String [] args) {

        String login = "air";
        String password = "guitare";

        Scanner sc = new Scanner(System.in);
        System.out.println("Veullez saisir votre login ");
        String str = sc.nextLine();
        System.out.println("Votre login est : " + str);

        if (str.equals(login)) {
            System.out.println("C'est le bon login");
        } else {
            System.out.println("Ce n'est pas  le bon login"); }

        System.out.println("Veullez saisir votre mot de passe ");
        String str2 = sc.nextLine();
        System.out.println("Votre mot de passe est : " + str2);

        if (str2.equals(password)) {
            System.out.println("C'est le bon mot de passe");
        } else {
            System.out.println("Ce n'est pas le bon mot de passe"); }

       // return expected
    }

}