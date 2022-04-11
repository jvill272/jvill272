package com.example.demo.cart;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;


@Table(name = "cart")
@Entity

public class Cart implements Serializable{

    @Id
    @Column(name = "fk_cart_user", columnDefinition="text")
    private String cartUserName;

    @Id
    @Column(name = "fk_cart_bname", columnDefinition="text")
    private ArrayList<String> cartBookName;

    /*
     Both constructors always have username associated with cart
     */
    public Cart(){
        cartBookName = new ArrayList<String>();
    }
    public Cart(String cartUserName){
        cartBookName = new ArrayList<String>();
}
    public Cart(String cartUserName, String cartBookName){
        this.cartUserName = cartUserName;
        this.cartBookName = new ArrayList<String>();
        this.cartBookName.add(cartBookName);
}

    // getters and setters

    public String getCartUserName() {
        return this.cartUserName;
    }

    public void setCartUserName(String commentText) {
        this.cartUserName = cartUserName;
    }

    public String getCartBookName()
    {
        String bookList = "";
        if (cartBookName.isEmpty())
        {
            return "EMPTY CART";
        }
        else
        {

            return cartBookName.toString();
        }
    }

    public void addBookToCart(String bookName)
    {
        cartBookName.add(bookName);
    }

    public void deleteBookFromCart(String bookName)
    {
        cartBookName.remove(bookName);
    }


    @Override
    public String toString() {
        return "{" +
                " cartUserName='" + getCartUserName() + "'" +
                ", cartBookName='" + getCartBookName() + "'" +
                "}";
    }
}