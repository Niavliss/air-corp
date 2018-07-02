package com.company.bdd;

import java.util.*;

public class Basket {


    private HashMap<Product, Integer> listArticles;
    private float totalprice;


    public Basket() {

        listArticles = new HashMap<>();
        this.totalprice=0;

    }

    @Override
    public String toString() {

        String result = "";

        for (Map.Entry<Product, Integer> article: listArticles.entrySet()) {
            result += article.getKey().toString() + " " + article.getValue() + "\n";
        }
        return result;
    }

    public void deleteProduct(Product choice, int quantity) {
        int currentQuantity = this.listArticles.get(choice);
        int nextQuantity = currentQuantity - quantity;
        listArticles.put(choice, nextQuantity );
        totalprice = totalprice - quantity * choice.getPrice();

    }

    public void addProduct(Product product, int quantity){
        int currentQuantity = this.listArticles.getOrDefault(product, 0);
        int nextQuantity = currentQuantity + quantity;
        this.listArticles.put(product, nextQuantity);
        totalprice = totalprice + quantity * product.getPrice();


    }
}