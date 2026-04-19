package com.sunbeam;


import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Integer, CartItem> cart = new HashMap<>();

    // Add product
    public void addProduct(Product p, int qty) {
        if (cart.containsKey(p.getId())) {
            cart.get(p.getId()).increaseQty(qty);
        } else {
            cart.put(p.getId(), new CartItem(p, qty));
        }
    }

    
    public void removeProduct(int productId) {
        cart.remove(productId);
    }

   
    public void updateQuantity(int productId, int qty) {
        if (cart.containsKey(productId)) {
            cart.get(productId).increaseQty(qty);
        }
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        double total = 0;
        for (CartItem item : cart.values()) {
            System.out.println(item);
            total += item.getTotalPrice();
        }

        System.out.println("Total = ₹" + total);
    }

    public double checkout() {
        double total = 0;
        for (CartItem item : cart.values()) {
            total += item.getTotalPrice();
        }
        cart.clear();
        return total;
    }
}