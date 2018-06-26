package com.company;

public class ProductId {

    private int id;

    public ProductId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ProductId{" +
                "id=" + id +
                '}';
    }
}
