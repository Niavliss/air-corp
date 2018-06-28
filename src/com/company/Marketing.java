package com.company;

import java.util.Scanner;

public class Marketing extends User {

    private Catalog catalog;

    public Marketing(String login, String password) {

        super(login, password);
        catalog = new Catalog();

    }

    public void displayMenu() {
        super.displayMenu();
        System.out.println("Choisir 3 pour afficher la liste des produits");
        System.out.println("Choisir 4 pour modifier le prix d'un produit");
        System.out.println("Choisir 9 pour sortir");
    }

    public void exec(int reponse) {
        switch (reponse) {

            case 3:
                displayProduct();

                break;

            case 4:

                updatePrice();
                break;


        }

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