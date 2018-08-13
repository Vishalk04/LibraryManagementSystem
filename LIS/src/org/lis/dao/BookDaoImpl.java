package org.lis.dao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.lis.model.Book;

public class BookDaoImpl implements BookDao  {
	
	List<Book> books = Arrays.asList(new Book("1", "ABC", "abc","Action"),
			new Book("2", "ABC", "abc","Action"),
			new Book("3", "ASD", "asd","fiction"),
			new Book("4", "ASD", "asd","fiction"));
	
	@Override
	public List<Book> SearchByTitle(String title) {
		// TODO Auto-generated method stub
		return books.stream().filter(b -> b.getTitle().equals(title)).collect(Collectors.toList());
	}



	@Override
	public List<Book> SearchByAuther(String auther) {
		// TODO Auto-generated method stub
		return books.stream().filter(b -> b.getAuther().equals(auther)).collect(Collectors.toList());
	}

	@Override
	public List<Book> SearchByCatagory(String catagory) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Book searchById(String bookId) {
		// TODO Auto-generated method stub
		 return books.stream().filter(b -> b.getBookId().equals(bookId)).findAny().orElse(null);
				// getClass().map( b -> b.getBookId().equals(bookId)).collect(Collectors.)
	}



	@Override
	public List<Book> getAllBooks(String catagory) {
		// TODO Auto-generated method stub
		return books.stream().filter(p -> p.getCatagory().equalsIgnoreCase(catagory)).collect(Collectors.toList());
	}



	
}
