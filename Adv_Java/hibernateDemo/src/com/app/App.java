package com.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		// Add Student
		Student s = new Student();

		System.out.println("Enter First Name");
		s.setFirstName(sc.next());

		System.out.println("Enter Last Name");
		s.setLastName(sc.next());

		System.out.println("Enter Email");
		s.setEmail(sc.next());

		session.persist(s);

		// Get Student
		System.out.println("Enter Student Id");
		int id = sc.nextInt();

		s = session.get(Student.class, id);

		System.out.println(s);

		// Delete Student
		System.out.println("Enter Student Id");
		int id1 = sc.nextInt();

		s = session.get(Student.class, id1);

		session.remove(s);

		// Display All Students
		Query<Student> query = session.createQuery("from Student", Student.class);

		List<Student> list = query.getResultList();

		list.forEach(x -> System.out.println(x));

		session.getTransaction().commit();

		System.out.println("Done");

		session.close();
		factory.close();
		sc.close();
	}
}