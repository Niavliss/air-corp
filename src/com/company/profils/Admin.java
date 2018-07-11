package com.company.profils;

import com.company.bdd.Catalog;
import com.company.bdd.UserList;

import java.util.Scanner;

enum Admintype {

    usertype1(2),
    usertype2(3);

    private int value;

    Admintype(int value) {

        this.value = value;
    }

    public int getValue() {

        return value;
    }

}

public class Admin extends User {

    private int usertype;
    private Catalog catalog;
    private UserList userList;


    public Admin(String login, String password, int usertype) {

        super(login, password, usertype);
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

        if (usertype == 2) {

            System.out.println("Choisir 3 pour afficher la liste des articles");
            System.out.println("Choisir 4 pour supprimer un article");
            System.out.println("Choisir 5 pour ajouter un article");
            System.out.println("Choisir 6 pour modifier un article");
            System.out.println("Choisir 9 pour sortir ");

        } else if (usertype == 3) {

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
                    if (usertype == 2) {
                        displayProduct();
                    } else if (usertype == 3) {
                        displayUserList();
                    } else {
                    }
                    break;

                case 4:
                    if (usertype == 2) {
                        deleteProduct();
                    } else if (usertype == 3) {
                        createUser();
                    } else {
                    }
                    break;

                case 5:
                    if (usertype == 2) {
                        addProduct();
                    } else if (usertype == 3) {
                        deleteUser();
                    } else {
                    }
                    break;

                case 6:
                    if (usertype == 2) {
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

    public void setUsertype(int usertype) {

        this.usertype = usertype;
    }

    public int getUertype() {

        return usertype;
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
