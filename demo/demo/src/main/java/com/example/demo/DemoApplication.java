package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.PostDeliveryStrategy;
import com.example.demo.payment.CreditCardPaymentStrategy;
import com.example.demo.payment.PayPalPaymentStrategy;
import com.example.demo.store.Flower;
import com.example.demo.store.FlowerColor;
import com.example.demo.store.FlowerType;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// @GetMapping("/order")
	// public static List<Order> listFlowers() {
	// 	return List.of(
	// 	new Order(List.of(new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50),
	// 	new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50),
	// 	new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50)),
	// 	new DHLDeliveryStrategy(),
	// 	new CreditCardPaymentStrategy()),

	// 	new Order(List.of(new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50),
	// 	new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50),
	// 	new Flower(FlowerType.CHAMOMILE, FlowerColor.BLUE, 50, 50)),
	// 	new PostDeliveryStrategy(),
	// 	new PayPalPaymentStrategy()));
	// }

}
