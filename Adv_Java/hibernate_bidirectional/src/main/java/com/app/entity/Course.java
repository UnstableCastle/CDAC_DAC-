package com.app.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class Course {
	private int id;
	private String Title;
	private Instructor instructor;

	public Course(String title, Instructor instructor) {
		super();
		Title = title;
		this.instructor = instructor;
	}

}
