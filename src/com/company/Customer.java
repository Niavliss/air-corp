package com.company;

/**
 *  class Customer with budjet and baskets attributs
 */

public class Customer  {

    /**
     * double budjet and Basket [] baskets
     */
    private double budjet;
    private Basket [] baskets;

    /**
     *
     * @param budjetCust
     */
    public Customer (double budjetCust) {
        this.budjet = budjetCust;
    }

    public void displayMenu() {
        System.out.println("Veuillez faire un choix");
        System.out.println("Choisir 1 pour afficher votre profil");
        System.out.println("Choisir 2 pour modifier le mot de passe");
        System.out.println("Choisir 9 pour sortir ");
    }
}