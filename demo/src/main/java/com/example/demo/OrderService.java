package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.FoodOrder;

@Service

public class OrderService {

		public List<FoodOrder> getOrders() {
			List<FoodOrder>orders = new ArrayList<>();

			orders.add(new FoodOrder("John Doe", "123 Main St", "Pizza"));
			orders.add(new FoodOrder("Jane Smith", "456 Elm St", "Burger"));
			orders.add(new FoodOrder("Mike Johnson", "789 Dak St", "Pasta"));

			return orders;
		}

}




