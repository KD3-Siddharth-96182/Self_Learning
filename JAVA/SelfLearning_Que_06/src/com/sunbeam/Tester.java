package com.sunbeam;

public class Tester {
	 public static void main(String[] args) {

	        try {
	            OrderService.processOrder(0, true, true);
	        } catch (PaymentException e) {
	            System.out.println("Payment Error: " + e.getMessage());
	        } catch (InventoryException e) {
	            System.out.println("Inventory Error: " + e.getMessage());
	        } catch (ShippingException e) {
	            System.out.println("Shipping Error: " + e.getMessage());
	        } catch (ECommerceException e) {
	            System.out.println("General Error: " + e.getMessage());
	        }
	    }
}
