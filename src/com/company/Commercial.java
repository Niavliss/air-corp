package com.company;

import java.util.Scanner;

public class Commercial extends User {

    private int moderator;
    private ProductList productList;

    public Commercial(String login, String password, int commercialmoderator) {

        super(login, password);
        moderator = commercialmoderator;
        productList = new ProductList();

    }

    public void displayMenu() {
        super.displayMenu();
        System.out.println("Choisir 3 pour afficher un articles");
        System.out.println("Choisir 4 pour supprimer un articles");
        System.out.println("Choisir 5 pour ajouter un articles");
        System.out.println("Choisir 6 pour modifier un articles");
    }

    public void exec(int reponse) {
        switch (reponse) {

            case 3:
               displayProduct();

                break;

            case 4:

               deleteProduct();
                break;

            case 5:

                addProduct();
                break;

            case 6:

                updateProduct();
                break;

        }


    }


    public void displayProduct() {

        System.out.println(this.productList);

    }

    public void deleteProduct() {

        System.out.println(this.productList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un article à supprimer ");
        int reponse = sc.nextInt();


        productList.deleteProduct(reponse);
        System.out.println(this.productList);

    }

   public void addProduct() {

       Scanner sc = new Scanner(System.in);
       System.out.println("Veuillez saisir l'id de l'article à ajouter");
       int idProduct = sc.nextInt();

       System.out.println("Veuillez saisir le nom de l'article à ajouter");
       String newProduct = sc.next();

       productList.addProduct(idProduct, newProduct);
       System.out.println(this.productList);
   }


    public void updateProduct() {

        System.out.println(this.productList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un article");
        int idProduct = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Veuillez modifier l'article");

        String newProduct = sc1.nextLine();

        productList.updateProduct(idProduct, newProduct);

        System.out.println(this.productList);
    }

    public void setModerator(int moderator) {

        this.moderator = moderator;
    }

    public int getModerator() {

        return moderator;
    }

//    public void deleteProduct(Product[] listarticle) {
//
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Veuillez saisir un article à supprimer");
//        int idProduct = sc.nextInt();
//        System.out.println(listarticle[idProduct - 1].toString());
//
//        listarticle[idProduct-1] = new Product(idProduct, "");
//        System.out.println(listarticle[idProduct - 1].toString());
//    }
}