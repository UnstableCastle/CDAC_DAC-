package com.app.aopdemo.service;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;
@Component
public class TrafficFortuneService {
	
	public String getFortune() 
	{
		System.out.println("In getFortune()");
		//simulate a delay
		try {
			TimeUnit.SECONDS.sleep(5);//sleep for 5sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//return a fortune
		return "Expect heavy traffic this morning";
	}
}
