package com.niveus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niveus.model.User;
import com.niveus.repository.UserRepository;

@RestController
@RequestMapping("api/v1")
public class UserController {

	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		
		System.out.println(" ** ----------Entering to API Create USER  Method** --------------  ");
		return userRepository.save(user);
	}
}
