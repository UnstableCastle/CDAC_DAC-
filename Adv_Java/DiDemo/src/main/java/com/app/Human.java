package com.app;


public class Human {

	private Heart heart;

	public Human() {
		System.out.println("Default Constructor Human");
		this.heart = null;
	}

	public Human(Heart heart) {
		System.out.println("para-contructor of Human ");
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		System.out.println("In Setter");
		this.heart = heart;
	}

	public void pump() {
		if (heart != null) {
			heart.pumping();
		}
		else
		{
			System.out.println("You are Dead");
		}
	}

}
