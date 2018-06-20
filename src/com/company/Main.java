package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product[] articles = new Product[6];
        articles[0] = new Product(1,"air-piano");
        articles[1] = new Product(2,"air-guitare");
        articles[2] = new Product(3,"air-violon");
        articles[3] = new Product(4,"air-batterie");
        articles[4] = new Product(5,"air-apéro");
        articles[5] = new Product(6,"air-PS4");

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre login ");
        String login = sc.nextLine();

        System.out.println("Veuillez saisir votre mot de passe ");
        String password = sc.nextLine();

        User user = new User(login, password);


        int reponse;
        do {
            System.out.println("Veuillez faire un choix");
            System.out.println("Choisir 1 pour afficher votre profil");
            System.out.println("Choisir 2 pour modifier le mot de passe");
            System.out.println("Choisir 3 afficher la liste des produits ");
            System.out.println("Choisir 4 choisir un produit ");
            System.out.println("Choisir 5 pour sortir ");
            reponse = sc.nextInt();

            switch (reponse) {

                case 1:
                    displayProfil(user);
                    break;

                case 2:
                    updateProfil(user);
                    break;

                // déconexion
                case 3:
                    displayListproduct(articles);
                    break;

                case 4:
                    choiceProduct(articles);
                    break;

                default:
                    System.out.println("Merci de votre visite !!");
            }
        }
        while (reponse != 5);





    }

    public static void displayProfil(User userconnected) {

        System.out.println(userconnected.getLogin() + userconnected.getPassword());

    }

    public static void updateProfil(User userupdate) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nouveau mot de passe");
        String newpassword = sc.nextLine();
        userupdate.password = newpassword;

        System.out.println(userupdate.getPassword());
    }


    public static void displayListproduct(Product [] listarticle) {

        for (int i = 0; i < listarticle.length; i++) {
            System.out.println("L'article " + listarticle[i].toString());
        }

    }

    public static void choiceProduct(Product [] listarticle) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un article");
        int idProduct = sc.nextInt();

        System.out.println(listarticle[idProduct - 1].toString());

    }

}