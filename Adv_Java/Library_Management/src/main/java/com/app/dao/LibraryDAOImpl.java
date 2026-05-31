package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Library;

@Repository
public class LibraryDAOImpl implements LibraryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Library> getLibrary() {
		Session session = sessionFactory.getCurrentSession();
		Query<Library> query = session.createQuery("from Library", Library.class);
		List<Library> list = query.list();
		return list;
	}

	@Override
	public void saveLibrary(Library library) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(library);
	}

	@Override
	public Library getLibrary(int theId) {
		Session session = sessionFactory.getCurrentSession();
		Library theLibrary = session.get(Library.class, theId);
		return theLibrary;
	}

	@Override
	public void deleteLibrary(int theId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
	    Library book = session.get(Library.class, theId);
	    if (book != null) {
	        session.remove(book);
	}


	}
	
}
