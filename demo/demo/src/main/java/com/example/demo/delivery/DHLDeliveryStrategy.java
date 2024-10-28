package com.example.demo.delivery;

import java.util.List;

import com.example.demo.store.Item;

public class DHLDeliveryStrategy implements Delivery {
    public String deliver(List<Item> items) {
        return "Delivered with DHL";
    }
}
