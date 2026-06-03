package com.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

	@Bean
	InMemoryUserDetailsManager userDetailsManager() {

		UserDetails user1 = User.builder().username("CASTLE").password("{noop}123").roles("EMPLOYEE").build();

		UserDetails user2 = User.builder().username("Amaan").password("{noop}123").roles("EMPLOYEE", "MANAGER").build();

		UserDetails user3 = User.builder().username("ABC").password("{noop}123").roles("EMPLOYEE", "MANAGER", "ADMIN")
				.build();

		return new InMemoryUserDetailsManager(user1, user2, user3);

	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(configurer -> configurer.anyRequest().authenticated()).formLogin(
				form -> form.loginPage("/showMyLoginPage").loginProcessingUrl("/authenticateTheUser").permitAll())
				.logout(logout -> logout.permitAll());
		return http.build();
	}
}
