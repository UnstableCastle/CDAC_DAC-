//package com.app.entity;
//
//import java.util.Set;
//
//import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.JoinTable;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.Table;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "Student1")
//@Data
//@NoArgsConstructor
//public class Student {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//
//	@Column
//	private String firstName;
//
//	@Column
//	private String lasttName;
//
//	@Column
//	private String email;
//
//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
//	private Set<Course> courses;
//
//	public Student(String firstName, String lasttName, String email) {
//		this.firstName = firstName;
//		this.lasttName = lasttName;
//		this.email = email;
//	}
//
//	public Student(String firstName, String lasttName, String email, Set<Course> courses) {
//		this.firstName = firstName;
//		this.lasttName = lasttName;
//		this.email = email;
//		this.courses = courses;
//	}
//	
//	
//	public void add(Course tempCourse) {
//		if(courses==null) {
//			Set<Course> courses;
//			
//		}
//		courses.add(tempCourse);
//		
//		
//	}
//	
//}

package com.app.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student1")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lasttName;

    @Column
    private String email;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses;

    public Student(String firstName, String lasttName, String email) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.email = email;
    }

    public Student(String firstName, String lasttName,
                   String email, Set<Course> courses) {

        this.firstName = firstName;
        this.lasttName = lasttName;
        this.email = email;
        this.courses = courses;
    }

    public void add(Course tempCourse) {

        if (courses == null) {
            courses = new HashSet<>();
        }

        courses.add(tempCourse);
    }
}