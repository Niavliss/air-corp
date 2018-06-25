package com.company;

import java.util.Scanner;

/**
 * abstract class User with login and password attributs
 */
class User {

    /**
     * String login and String password
     */
    protected String login;
    protected String password;

    /**
     * @param userlogin
     * @param userpassword
     */
    public User(String userlogin, String userpassword) {

        this.login = userlogin;
        this.password = userpassword;
    }
    public User() {
        this.login = "";
        this.password = "";


    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void displayMenu() {
        System.out.println("Veuillez faire un choix");
        System.out.println("Choisir 1 pour afficher votre profil");
        System.out.println("Choisir 2 pour modifier le mot de passe");
        System.out.println("Choisir 99 pour sortir ");
    }

    public void exec(int reponse) {
        switch (reponse) {

            case 1:
                this.displayProfil();
                break;
            case 2:
                this.updateProfil();
                break;
        }
    }

    public void displayProfil() {
        System.out.println(this.getLogin() + this.getPassword());
    }

    public void updateProfil() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nouveau mot de passe");
        String newpassword = sc.nextLine();
        this.password = newpassword;

        System.out.println(this.getPassword());
    }
}