//package com.app;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.app.entity.Course;
//import com.app.entity.Instructor;
//import com.app.entity.InstructorDetails;
//
//public class App2 {
//
//	public static void main(String[] args) {
//
//		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
//				.addAnnotatedClass(InstructorDetails.class).
//				addAnnotatedClass(Course.class).
//				buildSessionFactory();
//
//		Session session = factory.openSession();
//
//		session.beginTransaction();
//
//		int id = 1;
//		Instructor ins = session.get(Instructor.class,id);
//		
//		Course c1 = new Course("java");
//		
//		Course.add(c1);
//		Course.add(c1);
//		
//		
//
//		session.getTransaction().commit();
//
//		session.close();
//
//		factory.close();
//	}
//}