package com.company.profils;

import com.company.bdd.Catalog;
import com.company.bdd.UserList;

import java.util.Scanner;

enum Admintype {

    moderator1("1"),
    moderator2("2");

    private String name ="";

    Admintype(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}

public class Admin extends User {

    private String moderator;
    private Catalog catalog;
    private UserList userList;


    public Admin(String login, String password, String commercialmoderator) {

        super(login, password);
        moderator = commercialmoderator;
        catalog = new Catalog();
        userList = new UserList();
    }

    public Admin(String login, String password) {

        super(login, password);

    }

    public Admin() {

        this.login = "";
        this.password = "";
    }

    public void displayMenu() {
        super.displayMenu();

        if (moderator.equals("1")) {

            System.out.println("Choisir 3 pour afficher la liste des articles");
            System.out.println("Choisir 4 pour supprimer un article");
            System.out.println("Choisir 5 pour ajouter un article");
            System.out.println("Choisir 6 pour modifier un article");
            System.out.println("Choisir 9 pour sortir ");

        } else if (moderator.equals("2")) {

            System.out.println("Choisir 3 pour aficher la liste des utilisateurs");
            System.out.println("Choisir 4 pour créer un utilisateur");
            System.out.println("Choisir 5 pour supprimer un utilisateur");
            System.out.println("Choisir 9 pour sortir ");

        } else {

            System.out.println("Vous n'êtes pas commercial ? Choisir 9 pour sortir ");

        }

    }

    public void exec(int reponse) {
        Scanner sc = new Scanner(System.in);
        do {
            super.exec(reponse);
            switch (reponse) {

                case 3:
                    if (moderator.equals("1")) {
                        displayProduct();
                    } else if (moderator.equals("2")) {
                        displayUserList();
                    } else {
                    }
                    break;

                case 4:
                    if (moderator.equals("1")) {
                        deleteProduct();
                    } else if (moderator.equals("2")) {
                        createUser();
                    } else {
                    }
                    break;

                case 5:
                    if (moderator.equals("1")) {
                        addProduct();
                    } else if (moderator.equals("2")) {
                        deleteUser();
                    } else {
                    }
                    break;

                case 6:
                    if (moderator.equals("1")) {
                        updateProduct();
                    } else {
                    }
                    break;

            }
            displayMenu();
            reponse = sc.nextInt();
        } while (reponse != 9) ;
    }



    // Methods related to commercial type 1

    public void displayProduct() {

        System.out.println(this.catalog);

    }

    public void deleteProduct() {

        System.out.println(this.catalog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un article à supprimer ");
        int reponse = sc.nextInt();


        catalog.deleteProduct(reponse);
        System.out.println(this.catalog);

    }

    public void addProduct() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir l'id de l'article à ajouter");
        // TODO ProductId idProduct = new ProductId(sc.nextInt());
        int idProduct = sc.nextInt();

        System.out.println("Veuillez saisir le nom de l'article à ajouter");
        String newProduct = sc.next();

        System.out.println("Veuillez saisir le prix de l'article à ajouter");
        Float priceProduct = sc.nextFloat();


        catalog.addProduct(idProduct, newProduct, priceProduct);
        System.out.println(this.catalog);
    }

    public void updateProduct() {

        System.out.println(this.catalog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un article");
        int idProduct = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Veuillez modifier le nom de l'article");
        String nameProduct = sc1.nextLine();

        System.out.println("Veuillez saisir le prix de l'article à ajouter");
        Float priceProduct = sc.nextFloat();

        catalog.updateProduct(idProduct, nameProduct, priceProduct);

        System.out.println(this.catalog);
    }


    // Methods related to commercial type 2

    public void displayUserList() {

        System.out.println(this.userList);

    }

    public void createUser() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le login de l'utilisateur");
        // TODO ProductId idProduct = new ProductId(sc.nextInt());
        String userLogin = sc.next();

        System.out.println("Veuillez saisir le mot de passe de l'utilisateur");
        String userPassword = sc.next();

        userList.addUser(userLogin, userPassword);
        System.out.println(this.userList);
    }

    public void deleteUser() {

        System.out.println(this.userList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le login de l'utilisateur à supprimer ");
        String userLogin = sc.next();


        userList.deleteUser(userLogin);
        System.out.println(this.userList);

    }

    public void setModerator(String moderator) {

        this.moderator = moderator;
    }

    public String getModerator() {

        return moderator;
    }

    public void setCatalog(Catalog catalog) {

        this.catalog = catalog;
    }

    public Catalog getCatalog() {

        return catalog;
    }

    public void setUserList(UserList userList) {

        this.userList = userList;
    }

    public UserList getUserList() {

        return userList;
    }


}
