package com.app.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

//	@Bean
//	InMemoryUserDetailsManager userDetailsManager() {
//
//		UserDetails user1 = User.builder().username("A").password("{noop}123").roles("EMPLOYEE").build();
//		UserDetails user2 = User.builder().username("B").password("{noop}123").roles("EMPLOYEE", "MANAGER").build();
//		UserDetails user3 = User.builder().username("CASTLE").password("{noop}123").roles("EMPLOYEE", "MANAGER", "ADMIN").build();
//
//		return new InMemoryUserDetailsManager(user1, user2, user3);
//	}
	
	
	  @Bean
	    UserDetailsManager userDetailsManager(DataSource dataSource) {
		  
//		  JdbcUserDetailsManager.setUsersByUsernameQuery("");
//		  JdbcUserDetailsManager.setAuthoritiesByUsernameQuery("");
//		  return JdbcUserDetailsManager;
		  
		  
	        return new JdbcUserDetailsManager(dataSource);
	    }
	

	  @Bean
	  SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

	      http.authorizeHttpRequests(configurer -> configurer

	              .requestMatchers("/").hasRole("EMPLOYEE")
	              .requestMatchers("/leaders/**").hasRole("MANAGER")
	              .requestMatchers("/systems/**").hasRole("ADMIN")

	              .anyRequest().authenticated())

	          .formLogin(form -> form
	                  .loginPage("/showMyLoginPage")
	                  .loginProcessingUrl("/authenticateTheUser")
	                  .permitAll())

	          .logout(logout -> logout.permitAll())

	          .exceptionHandling(configurer ->
	                  configurer.accessDeniedPage("/access-denied"));

	      return http.build();
	  }
}