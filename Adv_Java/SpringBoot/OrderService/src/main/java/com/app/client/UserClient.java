package com.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="user-service")
public interface UserClient {
	
	@GetMapping("/user")
	String getUser();
}