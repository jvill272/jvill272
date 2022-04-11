package com.example.demo.cart;

import java.io.Serializable;

public class CartId implements Serializable {
    private String cartUserName;
    private String cartBookName;

    public CartId(){

    }

    public CartId(String cartUserName, String cartBookName){
        this.cartUserName = cartUserName;
        this.cartBookName = cartBookName;
    }
}
