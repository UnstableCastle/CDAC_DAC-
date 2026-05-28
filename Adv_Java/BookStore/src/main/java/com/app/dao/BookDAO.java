package com.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.app.entity.Book;
import com.app.entity.Shop;

public class BookDAO {

    private static SessionFactory factory = null;
    
   
    public static Session getSession() {
    
        if (factory == null) {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Book.class)
                    .addAnnotatedClass(Shop.class)
                    .buildSessionFactory();
        }
        return factory.openSession();
    }
    
    public static boolean save(Book b) {
        if (b == null) return false;
        Session session = getSession();
        try {
            session.beginTransaction();
            session.persist(b);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            if (session.getTransaction() != null) session.getTransaction().rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }
        
    public static List<Book> getAllBooks() {
        Session session = getSession();
        List<Book> books = null;
        try {
            session.beginTransaction();
            books = session.createQuery("from Book", Book.class).list();
            session.getTransaction().commit(); 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return books;    
    }

    public static Book getBookById(int id) {
        Session session = getSession();
        Book book = null;
        try {
            session.beginTransaction();
            book = session.get(Book.class, id);
            
           
            if (book != null && book.getShop() != null) {
                book.getShop().getCopies(); 
            }
            
            session.getTransaction().commit();  
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return book;
    }

    
    public static boolean updateBook(Book b) {
        if (b == null) return false;
        Session session = getSession();
        try {
            session.beginTransaction();

         
            session.merge(b);
            
          
            if (b.getShop() != null) {
                session.merge(b.getShop());
            }

            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            if (session.getTransaction() != null) session.getTransaction().rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public static int deleteBook(Book b) {    
        if (b == null) return 0; 
        
        Session session = getSession();
        int deletedId = 0;
        try {
            session.beginTransaction();
            
            Book book = session.get(Book.class, b.getId());
            if (book != null) {
                deletedId = book.getId();
                session.remove(book);
                System.out.println("Deleted successfully: " + book);
            }
            
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session.getTransaction() != null) session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return deletedId;
    }
}