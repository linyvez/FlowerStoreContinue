package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment {
    public String pay(double price) {
        return "Paying with credit card";
    }
}
