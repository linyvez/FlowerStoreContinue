package com.example.demo.payment;

public class PayPalPaymentStrategy implements Payment {
    public String pay(double price) {
        return "Paying with PayPal";
    }
}
