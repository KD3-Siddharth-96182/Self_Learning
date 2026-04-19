package com.sunbeam;


public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void increaseQty(int qty) {
        this.quantity += qty;
    }

    public void decreaseQty(int qty) {
        this.quantity -= qty;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return product.getName() + " x " + quantity + " = ₹" + getTotalPrice();
    }
}