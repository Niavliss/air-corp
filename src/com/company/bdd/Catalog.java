package com.company.bdd;

import java.util.HashMap;

public class Catalog {


    private HashMap<Integer, Product> listProduct;


    public Catalog() {

        listProduct = new HashMap<>();

        Product guitare = new Product(1, 22, 22, "air-guitare");
        Product piano = new Product(2, 22, 22, "air-piano");
        Product violon = new Product(3, 22, 22, "air-violon");
        Product accordeon = new Product(4, 22, 22, "air-accordeon");
        Product flute = new Product(5, 22, 22, "air-flute");
        this.listProduct.put(guitare.getId(), guitare);
        this.listProduct.put(piano.getId(), piano);
        this.listProduct.put(violon.getId(), violon);
        this.listProduct.put(accordeon.getId(), accordeon);
        this.listProduct.put(flute.getId(), flute);


    }

    public HashMap<Integer, Product> getListProduct() {

        return listProduct;

    }

    @Override
    public String toString() {

        String result = "";

        for (Integer id : listProduct.keySet()) {

            Product p = listProduct.get(id);
            result +=  p.toString() + "\n";

        }
        return result;
    }

    public void deleteProduct(int choice) {
        this.listProduct.remove(choice);

    }

    public void addProduct(int idProduct, String nameProduct, float priceProduct ){
        Product newProduct = new Product(idProduct, nameProduct, priceProduct);
        this.listProduct.put(idProduct, newProduct);
    }

    public void updateProduct(int idProduct, String nameProduct, float priceProduct ){
        Product p =this.listProduct.get(idProduct);
        p.setId(idProduct);
        p.setName(nameProduct);
        p.setPrice(priceProduct);

        this.listProduct.replace(idProduct, p);

    }

    public void updatePrice(int idProduct, Float priceProduct) {
        // récupérer l'objet du tableau à partir de l'id de l'article
        Product p =this.listProduct.get(idProduct);

        // défénir un nouveau prix
        p.setPrice(priceProduct);

        // mets à jour le tableau
        this.listProduct.replace(idProduct, p);

    }
}
