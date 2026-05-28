package com.app.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Book;
import com.app.entity.Shop;
public class BookDAO {

	private static SessionFactory factory = null;
	private static Session session = null;
	
	public static Session getSession() {
	
	 factory = new Configuration()
	        .configure("hibernate.cfg.xml")
	        .addAnnotatedClass(Book.class)
	        .addAnnotatedClass(Shop.class)
	        .buildSessionFactory();

	Session session = factory.openSession();
	
	return session;
	}
	
	
	public static boolean save(Book b) {
		if(b==null) {
		return false;
		}
		try {
	        session = getSession();
	        session.beginTransaction();
	        session.persist(b);
	        session.getTransaction().commit();
	        session.close();
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}
		
	public static  List<Book> getAllBooks(){

	List<Book> books = null;
	
	session = getSession();
	session.beginTransaction();
	books = session.createQuery("from Book",Book.class).list();
	session.getTransaction().commit();	
	session.close();
	return books;	
	}


	public static Book getBookById(int id)
	{
		session = getSession();
		session.beginTransaction();
		Book book = session.get(Book.class,id);
		System.out.println(book);
		session.getTransaction().commit();	
		session.close();
		return book;
	}


	public static boolean updateBook(Book b) {
		  session = getSession();

	        session.beginTransaction();

	        session.merge(b);

	        session.getTransaction().commit();
	        session.close();
	        return true;

	}


	public static int deleteBook(Book b)
	{	
		if( b == null) {
			
			return 0; 
		}
		session = getSession();
		session.beginTransaction();
		
		Book book=session.get(Book.class, b.getId());
		
		if(book !=null) {
			System.out.println("deleted -"+book);
		
		
		session.remove(book);
		System.out.println("Update - "+book);
		session.getTransaction().commit();
        session.close();
		
	}
	
		return book.getId();
	
	}

}