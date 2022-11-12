package com.swap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.swap.entity.Contact;
import com.swap.entity.User;
import com.swap.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = userService.getUser(userId);
		List<Contact> contacts = restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
		user.setContactList(contacts);
		return user;
	}
	
	@GetMapping("")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	
	
}
