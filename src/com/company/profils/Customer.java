package com.company.profils;

import com.company.bdd.Basket;
import com.company.bdd.Catalog;
import com.company.bdd.Product;

import java.util.Scanner;

/**
 * class Customer with budjet and baskets attributs
 */

public class Customer extends User {

    /**
     * double budjet and Basket [] baskets
     */
    private double bill;
    private Basket basket;
    private Catalog catalog;


    public Customer(String login, String password, double billCustomer) {

        super(login, password);
        this.bill = billCustomer;
        this.catalog = new Catalog();
        this.basket = new Basket();
    }

    public Customer() {

        this.login = "";
        this.password = "";
        this.basket = new Basket();
        this.catalog = new Catalog();
        this.bill = 0;
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
            displayMenu();
            reponse = sc.nextInt();
        } while (reponse != 9);
    }


    public void displayProduct() {

        System.out.println("Voici le catalogue : " + "\n" + this.catalog);

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

        System.out.println("Nombre d'exemplaires?");
        int quantity = sc.nextInt();

        basket.addProduct(product, quantity);

        System.out.println("Vous avez rajouter au panier " +quantity + " " + this.basket);


    }

    public void displayBill(){



    }

    public void setBillCustomer(double billCustomer) {

        this.bill = billCustomer;
    }

    public double getBillCustomer() {

        return bill;
    }

    @Override
    public String toString() {
        return "Voici " + login + " qui à pour facture : " + bill + " euros.";
    }
}