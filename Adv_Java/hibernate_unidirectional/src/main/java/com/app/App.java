package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class)
				.buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		InstructorDetails insD = new InstructorDetails("Football", "cricket");
		Instructor ins = new Instructor("Amaan", "Sayyed", "a@gmail.com", insD);
		session.persist(ins);
		
	
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
}
