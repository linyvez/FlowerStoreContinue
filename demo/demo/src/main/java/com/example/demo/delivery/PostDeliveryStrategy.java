package com.example.demo.delivery;

import java.util.List;

import com.example.demo.store.Item;

public class PostDeliveryStrategy implements Delivery {
    public String deliver(List<Item> items) {
        return "Delivered with simple Post";
    }
}
