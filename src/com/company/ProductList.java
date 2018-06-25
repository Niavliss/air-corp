package com.company;

import java.security.PrivateKey;
import java.util.HashMap;

public class ProductList {


    private HashMap<Integer, Product> listProduct;


    public ProductList() {

        listProduct = new HashMap<>();

        Product tomate = new Product(1, 22, 22, "SuperTomate");
        Product poireaux = new Product(2, 22, 22, "SuperPoireaux");
        Product carotte = new Product(3, 22, 22, "SuperCarotte");
        Product radis = new Product(4, 22, 22, "SuperRadis");
        Product salade = new Product(5, 22, 22, "SuperSalade");
        this.listProduct.put(tomate.getId(), tomate);
        this.listProduct.put(poireaux.getId(), poireaux);
        this.listProduct.put(carotte.getId(), carotte);
        this.listProduct.put(radis.getId(), radis);
        this.listProduct.put(salade.getId(), salade);


    }

    public HashMap<Integer, Product> getListProduct() {

        return listProduct;

    }

    @Override
    public String toString() {

        String result = "";

        for (Integer id : listProduct.keySet()) {
            Product p = listProduct.get(id);
            result += p.toString() + "\n";

        }
        return result;
    }

    public void deleteProduct(int choice) {
        this.listProduct.remove(choice);

    }

    public void addProduct(int idProduct, String nameProduct ){
        Product newProduct = new Product(idProduct, nameProduct);
        this.listProduct.put(idProduct, newProduct);
    }

    public void updateProduct(int idProduct, String nameProduct ){
        Product newProduct = new Product(idProduct, nameProduct);
        this.listProduct.replace(idProduct, newProduct);
    }
}
