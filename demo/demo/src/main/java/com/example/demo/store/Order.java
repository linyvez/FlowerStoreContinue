package com.example.demo.store;

import java.util.List;

import com.example.demo.delivery.Delivery;
import com.example.demo.payment.Payment;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class Order {
    
    private List<Item> items;

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item: items) {
            price += item.price();
        }
        return price;
    }

    public String processOrder() {
        return "Order is being processed...";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }

}
