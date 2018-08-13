package org.lis.dao;

import java.util.List;

import org.lis.model.Book;

public interface BookDao {
	

	public List<Book> SearchByTitle(String title);
	
	public List<Book> SearchByAuther(String auther);
	
	public List<Book> SearchByCatagory(String catagory);

	public Book searchById(String bookId);

	public List<Book> getAllBooks(String catagory);

}
