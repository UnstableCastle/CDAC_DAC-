package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Library")
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "Book_name")
	private String name; 
	
	@Column(name = "Author_name")
	private String authorName;
	
	@Column(name = "Price")
	private String price;

	public Library() {
		super();
	}

	public Library(String name, String authorName, String price) {
		super();
		this.name = name; 
		this.authorName = authorName;
		this.price = price;
	}
}