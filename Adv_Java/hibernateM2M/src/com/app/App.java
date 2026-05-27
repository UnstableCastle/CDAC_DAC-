//package com.app;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.app.entity.Course;
//import com.app.entity.Student;
//
//public class App {
//
//	public static void main(String[] args) {
//
//		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
//				.addAnnotatedClass(Course.class).buildSessionFactory();
//
//		Session session = factory.openSession();
//
//		Transaction tx = session.beginTransaction();
//
//		
//		Student student = new Student("Amaan", "Sayyed", "aman@gmail.com");
//
//	
//		Course c1 = new Course("Microservice");
//		Course c2 = new Course("C++");
//
//		Set<Course> courses = new HashSet<>();
//
//		courses.add(c1);
//		courses.add(c2);
//
//		student.setCourses(courses);
//
//
//		Set<Student> students = new HashSet<>();
//
//		students.add(student);
//
//		c1.setStudents(students);
//		c2.setStudents(students);
//
//
//		session.persist(student);
//		session.persist(c1);
//		session.persist(c2);
//		
//		
//		tx.commit();
////		session.persist(c1);
////		session.persist(c2);
//		
//		session.close();
//		factory.close();
//
//		System.out.println("Saved Successfully 🚀");
//	}
//}

package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Student;

public class App {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        Student student = new Student("Amaan", "Sayyed", "aman@gmail.com");

        Course c1 = new Course("Microservice");
        Course c2 = new Course("C++");

        student.add(c1);
        student.add(c2);

        c1.add(student);
        c2.add(student);


        session.persist(student);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Saved Successfully");
    }
}