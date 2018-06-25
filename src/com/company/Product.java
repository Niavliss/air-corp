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
    public Product(int idProduct, String nameProduct) {

        this.stock = 0;
        this.price= 20;
        this.name=nameProduct;
        this.id=idProduct;
    }



    @Override
    public String toString() {
        return name+" "+stock+" "+price;
    }
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(float price) { this.price = price; }
    public void setStock(double stock) { this.stock = stock; }
    public int getId() { return id; }
    public String getName() { return name; }
    public float getPrice() { return price; }
    public double getStock() { return stock; }

}