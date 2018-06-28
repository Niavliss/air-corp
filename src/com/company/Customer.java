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

    /**
     * @param budjetCustomer it is the budjet of customer
     */

    public Customer(String login, String password, double budjetCustomer) {

        super(login, password);
        budjet = budjetCustomer;
        // TODO baskets = basketCustomer;
        catalog = new Catalog();
        basket = new Basket();
    }

    public Customer () {

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
    }

    public void displayProduct() {

        System.out.println(this.catalog);

    }

    public void displayBasket() {

        System.out.println(this.basket);

    }

    public void addProductbasket(){
        System.out.println(this.catalog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez choisir un article à ajouter au panier");
        int choiceProduct = sc.nextInt();

        Product product= catalog.getListProduct().get(choiceProduct);

        basket.addProduct(product);
        System.out.println(this.basket);




    }

    public void setBudjet(double budjet) {

        this.budjet = budjet;
    }

    public double getBudjet() {

        return budjet;
    }

}