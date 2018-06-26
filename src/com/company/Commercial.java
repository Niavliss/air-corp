package com.company;

import java.util.Scanner;

public class Commercial extends Admin {

    private Catalog catalog;

    public Commercial(String login, String password) {

        super(login, password);
        catalog = new Catalog();

    }

    public void displayMenu() {
        super.displayMenu();
        System.out.println("Choisir 3 pour afficher un article");
        System.out.println("Choisir 4 pour supprimer un article");
        System.out.println("Choisir 5 pour ajouter un article");
        System.out.println("Choisir 6 pour modifier un article");
        System.out.println("Choisir 9 pour sortir ");
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

        System.out.println(this.catalog);

    }

    public void deleteProduct() {

        System.out.println(this.catalog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un article à supprimer ");
        int reponse = sc.nextInt();


        catalog.deleteProduct(reponse);
        System.out.println(this.catalog);

    }

   public void addProduct() {

       Scanner sc = new Scanner(System.in);
       System.out.println("Veuillez saisir l'id de l'article à ajouter");
       // TODO ProductId idProduct = new ProductId(sc.nextInt());
       int idProduct = sc.nextInt();

       System.out.println("Veuillez saisir le nom de l'article à ajouter");
       String newProduct = sc.next();

       catalog.addProduct(idProduct, newProduct);
       System.out.println(this.catalog);
   }


    public void updateProduct() {

        System.out.println(this.catalog);
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un article");
        int idProduct = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Veuillez modifier l'article");

        String newProduct = sc1.nextLine();

        catalog.updateProduct(idProduct, newProduct);

        System.out.println(this.catalog);
    }

    public void setCatalog(Catalog catalog) {

        this.catalog = catalog;
    }

    public Catalog getCatalog() {

        return catalog;
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