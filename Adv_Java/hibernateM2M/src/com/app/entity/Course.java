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
//@Table(name = "Course")
//@Data
//@NoArgsConstructor
//public class Course {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//
//	@Column
//	private String title;
//
//	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
//	private Set<Student> students;
//
//	public Course(String title) {
//		this.title = title;
//	}
//	
//	public void add(Student tempStud) {
//		if(students==null) {
//			Set<Course> courses;
//			
//		}
//		students.add(tempStud);
//		
//		
//	}
//	
//	
//}

package com.app.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Course")

@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @ManyToMany(mappedBy = "courses",
                cascade = CascadeType.ALL,
                fetch = FetchType.EAGER)
    private Set<Student> students;

    public Course(String title) {
        this.title = title;
    }

    public void add(Student tempStud) {

        if (students == null) {
            students = new HashSet<>();
        }

        students.add(tempStud);
    }
}