package com.rays.ioc;

public class Order2 {

    private Payment payment;
    private Inventory inventory;

    public Order2(Payment payment, Inventory inventory) {
        this.payment = payment;
        this.inventory = inventory;
    }

    public void bookATicket(int qty) {
        int price = 10;
        double totalAmount = price * qty;

        double updatedBalance = payment.makePayment(totalAmount);

        int updatedStock = inventory.sold(qty);

        System.out.println("Ticket Booked Successfully");
        System.out.println("Total Amount Paid: " + totalAmount);
        System.out.println("Remaining Balance: " + updatedBalance);
        System.out.println("Remaining Stock: " + updatedStock);
    }

}
