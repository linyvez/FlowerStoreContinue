package com.example.demo.flowerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;
import com.example.demo.store.Flower;
import com.example.demo.store.FlowerColor;
import com.example.demo.store.FlowerType;
import com.example.demo.store.Order;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    // private final FlowerService flowerService;

    // @Autowired
    // public FlowerController(FlowerService flowerService) {
    //     this.flowerService = flowerService;
    // }

    @GetMapping
	public static List<Order> listFlowers() {
		return List.of(
		new Order(List.of(new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50),
		new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50),
		new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50))),

		new Order(List.of(new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50),
		new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50),
		new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50))));
	}
}