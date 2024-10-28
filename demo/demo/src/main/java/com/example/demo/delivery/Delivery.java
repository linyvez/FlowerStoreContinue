package com.example.demo.delivery;

import java.util.List;

import com.example.demo.store.Item;

public interface Delivery {
    public String deliver(List<Item> items);
}
