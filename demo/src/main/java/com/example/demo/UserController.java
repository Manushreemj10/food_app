package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<User> getAllUsers(){
		//Dummy user data
		return Arrays.asList(
				new User(1,"Alice","alice@example.com"),
				new User(2,"Bob","bob@example.com"),
				new User(3,"Charlie","charlie@example.com"));
	}

}
