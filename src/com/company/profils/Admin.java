package com.company.profils;

import com.company.BddConnection;
import com.company.bdd.Catalog;
import com.company.bdd.UserList;

import java.util.List;
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

    private int type;
    private Catalog catalog;
    private UserList userList;


    public Admin(String login, String password, int usertype) {

        super(login, password, usertype);
        type = usertype;
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

        if (type == 2) {

            System.out.println("Choisir 3 pour afficher la liste des articles");
            System.out.println("Choisir 4 pour supprimer un article");
            System.out.println("Choisir 5 pour ajouter un article");
            System.out.println("Choisir 6 pour modifier un article");
            System.out.println("Choisir 9 pour sortir ");

        } else if (type == 3) {

            System.out.println("Choisir 3 pour aficher la liste des utilisateurs");
            System.out.println("Choisir 4 pour créer un utilisateur");
            System.out.println("Choisir 5 pour supprimer un utilisateur");
            System.out.println("Choisir 6 pour modifier un utilisateur");
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
                    if (type == 2) {
                        displayProduct();
                    } else if (type == 3) {
                        displayUserList();
                    } else {
                    }
                    break;

                case 4:
                    if (type == 2) {
                        deleteProduct();
                    } else if (type == 3) {
                        createUser();
                    } else {
                    }
                    break;

                case 5:
                    if (type == 2) {
                        addProduct();
                    } else if (type == 3) {
                        deleteUser();
                    } else {
                    }
                    break;

                case 6:
                    if (type == 2) {
                        updateProduct();
                    } else if (type == 3){
                        updateUser();
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

        UserDAO userDao = new UserDAO(BddConnection.getInstance());
        List <User> list = userDao.findAll();

        for (User u : list) {
            System.out.println(u.toString());

        }


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

    private void updateUser() {

        System.out.println(this.userList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un utilisateur");
        String login = sc.next();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Veuillez modifier le mot de passe");
        String password = sc1.nextLine();

        System.out.println("Veuillez modifier le type d'utilisateur");
        int usertype = sc.nextInt();

        userList.updateUser(login, password, usertype);

        System.out.println(this.userList);

    }

    public void setType(int usertype) {

        this.type = usertype;
    }

    public int getType() {

        return type;
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
