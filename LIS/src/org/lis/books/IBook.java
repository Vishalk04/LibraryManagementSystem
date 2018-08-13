package org.lis.books;

import java.util.List;

import org.lis.model.Book;

public interface IBook {
	
	public Book SearchById(String bookId);
	
	public List<Book> SearchByTitle(String title);
	
	public List<Book> SearchByAuther(String auther);
	
	//public List<Book> SearchByCatagory(String catagory);
	
	

}
