package com.company.profils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.lang.Exception;
import java.lang.ClassNotFoundException;
import java.util.Scanner;

/**
 * abstract class User with login and password attributs
 */
public abstract class User {

    /**
     * String login and String password
     */
    protected int idUser = 0;
    protected String login;
    protected String password;
    protected int Type = 0;


    public User(String userlogin, String userpassword, int usertype) {

        this.login = userlogin;
        this.password = userpassword;
        this.Type = usertype;
    }

    public User(String userlogin, String userpassword) {

        this.login = userlogin;
        this.password = userpassword;

    }

    public User() {
        this.login = "";
        this.password = "";

    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setType(int type) {
        Type = type;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getType() {
        return Type;
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
        // System.out.println("Choisir 9 pour sortir ");
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

        System.out.println("Voici votre login : " + this.getLogin() + " ainsi que votre mot de passe : " + this.getPassword());
    }

    public void updateProfil() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nouveau mot de passe");
        String newpassword = sc.nextLine();
        this.password = newpassword;

        System.out.println("Votre nouveau mot de passe est : " + this.getPassword());
    }
}