package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
	@GetMapping("/products")
	public String getgetAllProducts() {
		return "Returin all products";
	}
	
	@GetMapping("/products/{id}")
	public String getProductById(@PathVariable int id) {
		return "Returing product with Id : "+ id ;
	}
}
