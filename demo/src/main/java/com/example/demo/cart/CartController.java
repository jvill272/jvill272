package com.example.demo.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.persistence.Column;
import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping(path = "cart")
public class CartController {
    @Autowired
    private CartRepository repo;

    @Id
    @Column(name = "fk_cart_user", columnDefinition="text")
    private String name;

    private Cart cart;
    public CartController(){
        cart = new Cart(name);
    }

    @GetMapping("/cart")
    public List<Cart> getCart(){
        System.out.println("GET Request for cart is successful.");

        return repo.findCartByCartUser(name);
    }

    @PostMapping("/cart")
    public void addNewCart(@RequestBody Cart cart){
        System.out.println("\nRequest body: " + cart + "\n");

        //repo.save(cart);
    }
}
