package com.app.bean;

import java.io.Serializable;

//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
public class Employee implements Serializable{
	private int id;
	private String firstName;
	private String password;
	private String email;
	private String gender;
	private String age;
	
	public Employee(String firstName, String password, String email, String gender, String age) {
		super();
		this.firstName = firstName;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	
	
}
