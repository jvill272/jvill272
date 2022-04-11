package com.example.demo.cart;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, CartId> {

    List<Cart> findCartByCartUser(String fk_cart_user);

}