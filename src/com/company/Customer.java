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
    // private Basket [] baskets;
    private ProductList productList;

    /**
     * @param budjetCustomer it is the budjet of customer
     */

    public Customer(String login, String password, double budjetCustomer) {

        super(login, password);
        budjet = budjetCustomer;
        // TODO baskets = basketCustomer;
        productList = new ProductList();
    }


    public void displayMenu() {
        super.displayMenu();
        System.out.println("Choisir 3 pour afficher les produits");
        System.out.println("Choisir 4 pour ajouter un produit au panier");
        System.out.println("Choisir 5 pour afficher le panier");
    }

    public void exec(int reponse) {
        switch (reponse) {

            case 3:
                displayProduct();

                break;
            case 4:
                // TODO this.addProductbasket();
                break;
            case 5:
                // TODO this.displayBasket();
                break;
        }
    }

    public void displayProduct() {

        System.out.println(this.productList);

    }

    public void setBudjet(double budjet) {
        this.budjet = budjet;
    }

    public double getBudjet() {
        return budjet;
    }

}