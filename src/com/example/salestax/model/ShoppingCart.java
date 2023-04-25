package com.example.salestax.model;


import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ShoppingCart {
    private final Map<Product, Integer> shoppingCart;

    public ShoppingCart() {
        shoppingCart = new HashMap<Product, Integer>();
    }

    public void addProduct(Product product, int quantity) {
        assertTrue(quantity > 0);
        shoppingCart.put(product, shoppingCart.get(product) == null ? quantity : shoppingCart.get(product) + quantity);
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public int getQuantity(Product product)  {

        if(shoppingCart.get(product)==null)
            throw new RuntimeException("Product not Present in the cart");
        else
        return shoppingCart.get(product);
    }

    public double getTotalTax() {
        double totalTax = 0.0;
        for (Product product : shoppingCart.keySet()) {
            double tax;
            tax = (product.getSalesTax()) * shoppingCart.get(product);
            totalTax += tax;
        }
        return totalTax;
    }

    public double getTotalBillAmount() {
        double totalBillAmount = 0.0;
        for (Product product : shoppingCart.keySet()) {
            double shelfPriceOfProduct = (product.getShelfPrice());
            totalBillAmount += shelfPriceOfProduct * shoppingCart.get(product);
        }
        return totalBillAmount;

    }
}
