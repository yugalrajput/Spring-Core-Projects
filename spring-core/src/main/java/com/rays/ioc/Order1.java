package com.rays.ioc;

public class Order1 {

    private Payment payment;

    private Inventory inventory;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void bookATicket(int qty) {
        int price = 10;
        double totalAmount = price * qty;
        double updatedBalance = payment.makePayment(totalAmount);
        int updatedStock = inventory.sold(qty);
        System.out.println("Ticket booked successfully!");
        System.out.println("Total amount paid: " + totalAmount);
        System.out.println("Updated balance: " + updatedBalance);
        System.out.println("Updated stock: " + updatedStock);


    }
}
