package com.sunbeam;

public class OrderService {

    public static void processOrder(int stock, boolean paymentOk, boolean addressValid)
            throws PaymentException, InventoryException, ShippingException {

        if (stock <= 0)
            throw new InventoryException("Item out of stock");

        if (!paymentOk)
            throw new PaymentException("Payment failed");

        if (!addressValid)
            throw new ShippingException("Invalid shipping address");

        System.out.println("Order processed successfully");
    }
}