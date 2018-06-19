package com.company;

/**
 * class ItemBasket with id and Quantity attributs
 */



public class ItemBasket {
    /**
     * int id and int Quantity attributs
     */

    private int id ;
    private int Quantity ;


    /**
     *
     * @param idItem
     * @param quantityItem
     */
    public ItemBasket ( int idItem, int quantityItem){

        this.id=idItem;
        this.Quantity=quantityItem;
    }
}