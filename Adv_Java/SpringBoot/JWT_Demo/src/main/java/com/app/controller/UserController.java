package com.app.controller;

import  org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

//	private BCryptPasswordEncoder byBCryptPasswordEncoder2 = new BCryptPasswordEncoder(BCryptVersion.$2A, 12);

	@PostMapping("register")
	public User register(@RequestBody User user) {
		user.setPassword(byBcryptPasswordEncoder.encode(user.getPassword()));

		System.out.println("Password : " + user.getPassword());
		return userService.saveUser(user);
	}
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername() ,user.getPassword()));

		if(authentication.isAuthenticated()) {
			return "Success!!!";
		}
		else {
			return "Failed";
		}
	}
	

}