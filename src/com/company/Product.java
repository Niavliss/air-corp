package com.company;

/**
 *  class Product
 */
public class Product {

    /**
     *   int id,  double Stock, float Price, String Name
     */
    private int id;
    private double stock;
    private float price;
    private String name;

    /**
     * Product constructor int idProduct, double stockProduct, float priceProduct, string nameProduct
     */
    public Product(int idProduct, double stockProduct, float priceProduct, String nameProduct) {

        this.id=idProduct;
        this.stock=stockProduct;
        this.price=priceProduct;
        this.name=nameProduct;
    }
}