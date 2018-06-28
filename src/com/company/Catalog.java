package com.company;

import java.security.PrivateKey;
import java.util.HashMap;

public class Catalog {


    private HashMap<Integer, Product> listProduct;


    public Catalog() {

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