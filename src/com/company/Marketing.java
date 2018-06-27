package com.company;

import java.util.Scanner;

public class Marketing extends User {

    private Catalog catalog;

    public Marketing(String login, String password) {

        super(login, password);

    }

    public void displayMenu() {
        super.displayMenu();
        System.out.println("Choisir 3 pour afficher la liste des produits");
        System.out.println("Choisir 4 pour modifier le prix d'un produit");
        System.out.println("Choisir 9 pour sortir ");
    }

    public void exec(int reponse) {
        switch (reponse) {

            case 3:
                displayProduct();

                break;

            case 4:

                // TODO updatePrice();
                break;


        }

    }

    public void displayProduct() {

        System.out.println(this.catalog);

    }

}