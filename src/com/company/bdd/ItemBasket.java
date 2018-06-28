package com.company.bdd;

/**
 * class ItemBasket with id and Quantity attributs
 */



public class ItemBasket {
    /**
     * int id and int Quantity attributs
     */

    private int id ;
    private int Quantity ;
    private String name;


    /**
     *
     * @param idItem
     * @param quantityItem
     */
    public ItemBasket ( int idItem, String nameProduct, int quantityItem){

        this.id=idItem;
        this.name=nameProduct;
        this.Quantity=quantityItem;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getId() { return id; }
}