package com.app.dao;

import java.util.List;

import com.app.entity.Library;

public interface LibraryDAO {

	public List<Library> getLibrary();

	public void saveLibrary(Library customer);

	public Library getLibrary(int theId);

	public void deleteLibrary(int theId);
}
