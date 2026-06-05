package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.client.UserClient;

@RestController
public class OrderController {
	
	@Autowired
	private UserClient userClient;
	
	@GetMapping("/order")
	public String getOrder()
	{
		return "Order Service -> "+ userClient.getUser();
	}
}