package com.company;
import java.util.List;

/**
 *  class Basket with ItemBasket []  Status attributs
 */

public class Basket {

    /**
     * List ItemBasket and int Status
     */
    private List ItemBasket;
    private int Status;

    /**
     * BasketItemBasket and Basketstatus
     *
     */
    public Basket (List BasketItemBasket, int Basketstatus) {
        this.ItemBasket = BasketItemBasket;
        this.Status = Basketstatus;

    }
}