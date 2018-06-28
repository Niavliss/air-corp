package com.company;

import java.util.Scanner;

/**
 * class Customer with budjet and baskets attributs
 */

public class Customer extends User {

    /**
     * double budjet and Basket [] baskets
     */
    private double budjet;
    private Basket basket;
    private Catalog catalog;


    public Customer(String login, String password, double budjetCustomer) {

        super(login, password);
        budjet = budjetCustomer;
        // TODO baskets = basketCustomer;
        catalog = new Catalog();
        basket = new Basket();
    }

    public Customer() {

        this.login = "";
        this.password = "";
    }

    public void displayMenu() {
        super.displayMenu();
        System.out.println("Choisir 3 pour afficher les produits");
        System.out.println("Choisir 4 pour ajouter un produit au panier");
        System.out.println("Choisir 5 pour afficher le panier");
        System.out.println("Choisir 9 pour sortir ");
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
                    this.addProductbasket();
                    break;
                case 5:
                    this.displayBasket();
                    break;
            }
            reponse = sc.nextInt();
        } while (reponse != 9);
    }


    public void displayProduct() {

        System.out.println("Voici le catalogue : "+"\n"+ this.catalog);

    }

    public void displayBasket() {

        System.out.println(this.basket);

    }

    public void addProductbasket() {
        // System.out.println(this.catalog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir un article à ajouter au panier parmis un des articles suivant : ");
        System.out.println(this.catalog);
        int choiceProduct = sc.nextInt();


        Product product = catalog.getListProduct().get(choiceProduct);

        basket.addProduct(product);
        System.out.println("Vous avez rajouter au panier : "+ this.basket);


    }

    public void setBudjet(double budjet) {

        this.budjet = budjet;
    }

    public double getBudjet() {

        return budjet;
    }

    @Override
    public String toString() {
        return "Voici " + login + " qui à pour budjet : " + budjet + " euros.";
    }
}