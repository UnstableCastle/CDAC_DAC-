package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder.BCryptVersion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;

	private BCryptPasswordEncoder byBcryptPasswordEncoder = new BCryptPasswordEncoder(12);

	private BCryptPasswordEncoder byBCryptPasswordEncoder2 = new BCryptPasswordEncoder(BCryptVersion.$2A, 12);

	@PostMapping("register")
	public User register(@RequestBody User user) {
		user.setPassword(byBcryptPasswordEncoder.encode(user.getPassword()));

		System.out.println("Password : " + user.getPassword());
		return userService.saveUser(user);
	}

}