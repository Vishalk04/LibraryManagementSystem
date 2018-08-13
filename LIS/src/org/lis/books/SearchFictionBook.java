package org.lis.books;

import java.util.List;

import org.lis.model.Book;

public class SearchFictionBook extends SearchBooks {

	@Override
	public List<Book> getAllBooks(String catagory) {
		// TODO Auto-generated method stub
		return dao.getAllBooks(catagory);
	}



}
