package com.app.config;

import java.io.IOException;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.app.service.JwtService;
import com.app.service.UsersDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

    //@Autowired
	private final JwtService jwtService;
    private final UsersDetailsService usersDetailsService;
  
    public JwtFilter(JwtService jwtService,
            UsersDetailsService usersDetailsService) {
this.jwtService = jwtService;
this.usersDetailsService = usersDetailsService;
}

	@Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		System.out.println("JWTSrevice: "+jwtService);
        String authHeader = request.getHeader("Authorization");
        System.out.println("AuthHeader = "+authHeader);
        String token = null;
        String userName = null;

        if(authHeader != null && authHeader.startsWith("Bearer ")){
            token = authHeader.substring(7);
            System.out.println("Token: "+token);
            userName = jwtService.extractUserName(token);
            System.out.println("Username: "+userName);
        }

        System.out.println("SC = "+SecurityContextHolder.getContext().getAuthentication()==null);
        if(userName != null && SecurityContextHolder.getContext().getAuthentication()==null){

        	UserDetails userDetails =
        	        usersDetailsService.loadUserByUsername(userName);
        	System.out.println("UserDetails = "+userDetails);
            if(jwtService.validateToken(token, userDetails)){
                UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }
        
        System.out.println("JWT Filter Called : " + request.getRequestURI());
        filterChain.doFilter(request, response);
    }
}