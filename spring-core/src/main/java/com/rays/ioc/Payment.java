package com.rays.ioc;

import org.springframework.beans.factory.annotation.Value;

public class Payment {
    @Value(value = "100")
    double balance = 0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double makePayment(double amount) {
        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
}
