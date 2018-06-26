package com.company;

public class Marketing extends User {

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
                // TODO displayProduct();

                break;

            case 4:

                // TODO updatePrice();
                break;


        }

    }


}