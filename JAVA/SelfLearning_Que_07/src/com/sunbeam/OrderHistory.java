package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders yet");
            return;
        }

        for (Order o : orders) {
            System.out.println(o);
        }
    }
}