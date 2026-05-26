package com.app.bean;

import java.io.Serializable;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Student implements Serializable {
	private int id;
	private String firstName;
	private String laststName;
	private int age;
	private String course;

	public Student(String firstName, String laststName, int age, String course) {
		super();
		this.firstName = firstName;
		this.laststName = laststName;
		this.age = age;
		this.course = course;
	}

}
