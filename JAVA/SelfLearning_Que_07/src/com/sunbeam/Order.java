package com.sunbeam;


import java.util.Map;

public class Order {
    private Map<Integer, CartItem> items;
    private double totalAmount;

    public Order(Map<Integer, CartItem> items, double totalAmount) {
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Order Total: ₹" + totalAmount;
    }
}