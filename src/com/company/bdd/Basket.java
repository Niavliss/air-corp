package com.company.bdd;

import java.util.*;

public class Basket {


    private ArrayList<Product> listArticles;


    public Basket() {

        listArticles = new ArrayList<Product>();

    }

    public ArrayList<Product> getListProduct() {

        return listArticles;

    }

    @Override
    public String toString() {

        String result = "";

        for (Product article: listArticles) {
            result += article.toString() + "\n";
        }
        return result;
    }

    public void deleteProduct(int choice) {
        this.listArticles.remove(choice);

    }

    public void addProduct(Product product){

        this.listArticles.add(product);
    }

    public void updateProduct(int idProduct, String nameProduct, float priceProduct ){
        Product newProduct = new Product(idProduct, nameProduct, priceProduct);
        this.listArticles.add(idProduct, newProduct);
    }
}