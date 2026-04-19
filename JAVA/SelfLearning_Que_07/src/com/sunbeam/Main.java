package com.sunbeam;

import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        ShoppingCart cart = new ShoppingCart();
	        OrderHistory history = new OrderHistory();

	        Product p1 = new Product(1, "Laptop", 50000);
	        Product p2 = new Product(2, "Mouse", 500);
	        Product p3 = new Product(3, "Keyboard", 1500);

	        while (true) {
	            System.out.println("\n1. Add Product");
	            System.out.println("2. Remove Product");
	            System.out.println("3. View Cart");
	            System.out.println("4. Checkout");
	            System.out.println("5. Order History");
	            System.out.println("0. Exit");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Select Product: 1.Laptop 2.Mouse 3.Keyboard");
	                    int pid = sc.nextInt();
	                    System.out.print("Enter quantity: ");
	                    int qty = sc.nextInt();

	                    if (pid == 1) cart.addProduct(p1, qty);
	                    else if (pid == 2) cart.addProduct(p2, qty);
	                    else if (pid == 3) cart.addProduct(p3, qty);
	                    break;

	                case 2:
	                    System.out.print("Enter product ID to remove: ");
	                    cart.removeProduct(sc.nextInt());
	                    break;

	                case 3:
	                    cart.displayCart();
	                    break;

	                case 4:
	                    double total = cart.checkout();
	                    history.addOrder(new Order(null, total));
	                    System.out.println("Order placed! Total = ₹" + total);
	                    break;

	                case 5:
	                    history.displayOrders();
	                    break;

	                case 0:
	                    System.exit(0);
	            }
	        }
	    }
}
