package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/login")
	public String login() {
		return "Welcome to spring boot";
	}
	
	@GetMapping("/submit")
	public String add() {
		return "Welcome to Java";
	}

}
