package com.example.salestax.UnitTest;

import com.example.salestax.model.Product;
import com.example.salestax.model.ShoppingCart;

import static com.example.salestax.model.ProductType.*;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    ShoppingCart shoppingCart = new ShoppingCart();

    @org.junit.jupiter.api.Test
    void addProduct() {

        Product product1, product2, product3, product4;
        product1 = new Product("Book1", 12.49, BOOK, Boolean.FALSE);
        product2 = new Product("CD", 14.99, OTHER, Boolean.FALSE);
        product3 = new Product("Chocolate Bar1", 0.85, FOOD, Boolean.FALSE);
        product4 = new Product("CD", 14.99, OTHER, Boolean.FALSE);

        shoppingCart.addProduct(product1, 2);
        assertEquals(2, shoppingCart.getQuantity(product1));
        shoppingCart.addProduct(product1, 2);
        assertEquals(4, shoppingCart.getQuantity(product1));

        shoppingCart.addProduct(product2, 0);

    }
    @org.junit.jupiter.api.Test
    void getQuantity(){

        Product product=new Product("Book1", 12.49, BOOK, Boolean.FALSE);
        shoppingCart.addProduct(product,10);
        assertEquals(10,shoppingCart.getQuantity(product));

        Product newProduct=new Product("Book2", 12.49, BOOK, Boolean.FALSE);
        System.out.println(shoppingCart.getQuantity(newProduct));

    }

    @org.junit.jupiter.api.Test
    void getTotalTax() {
        Product product1, product2, product3, product4;
        product1 = new Product("Book1", 12.49, BOOK, Boolean.FALSE);
        product2 = new Product("CD", 14.99, OTHER, Boolean.FALSE);
        product3 = new Product("Chocolate Bar1", 0.85, FOOD, Boolean.FALSE);
        product4 = new Product("Chocolate Bar3", 11.25, FOOD, Boolean.TRUE);

        shoppingCart.addProduct(product1, 2);
        shoppingCart.addProduct(product2, 3);
        shoppingCart.addProduct(product3, 3);
        shoppingCart.addProduct(product4, 8);
        assertEquals(9.3, shoppingCart.getTotalTax());

    }

    @org.junit.jupiter.api.Test
    void getTotalBillAmount() {
        Product product1, product2, product3, product4;
        product1 = new Product("Book1", 12.49, BOOK, Boolean.FALSE);
        product2 = new Product("CD", 14.99, OTHER, Boolean.FALSE);
        product3 = new Product("Chocolate Bar1", 0.85, FOOD, Boolean.FALSE);
        product4 = new Product("Chocolate Bar3", 11.25, FOOD, Boolean.TRUE);

        shoppingCart.addProduct(product1, 2);
        shoppingCart.addProduct(product2, 3);
        shoppingCart.addProduct(product3, 3);
        shoppingCart.addProduct(product4, 8);
        assertEquals(171.8, shoppingCart.getTotalBillAmount());
    }
}