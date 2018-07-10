package com.company.profils;

import com.company.bdd.Catalog;
import java.util.Scanner;

public class Marketing extends User {

    private Catalog catalog;

    public Marketing(int userid, String login, String password, int type) {

        super(userid, login, password, type);
        this.catalog = new Catalog();

    }


    public Marketing(String login, String password) {

        super(login, password);
        this.catalog = new Catalog();

    }

    public Marketing () {

        this.login = "";
        this.password = "";
        this.catalog = new Catalog();

    }

    public void displayMenu() {
        super.displayMenu();
        System.out.println("Choisir 3 pour afficher la liste des produits");
        System.out.println("Choisir 4 pour modifier le prix d'un produit");
        System.out.println("Choisir 9 pour sortir");
    }

    public void exec(int reponse) {
        Scanner sc = new Scanner(System.in);
        do {
            super.exec(reponse);
        switch (reponse) {

                case 3:
                    displayProduct();

                    break;

                case 4:

                    updatePrice();
                    break;


        }
            displayMenu();
            reponse = sc.nextInt();
        } while (reponse != 9) ;

    }

    public void displayProduct() {

        System.out.println(this.catalog);

    }

    public void updatePrice() {

        System.out.println(this.catalog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez selectionner un article pour modification de prix");
        int idProduct = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Veuillez modifier le prix de l'article");

        Float priceProduct = sc1.nextFloat();
        catalog.updatePrice(idProduct,priceProduct);

        System.out.println(this.catalog);

    }

}