package org.lis.books;

import java.util.List;

import org.lis.dao.BookDao;
import org.lis.dao.BookDaoImpl;
import org.lis.model.Book;

public abstract class SearchBooks implements IBook {
	
	BookDao dao = new BookDaoImpl();
	
	@Override
	public List<Book> SearchByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.SearchByTitle(title);
	}

	@Override
	public List<Book> SearchByAuther(String auther) {
		// TODO Auto-generated method stub
		return dao.SearchByAuther(auther);
	}

	/*@Override
	public List<Book> SearchByCatagory(String catagory) {
		// TODO Auto-generated method stub
		return dao.SearchByCatagory(catagory);
	}*/

	@Override
	public Book SearchById(String bookId) {
		// TODO Auto-generated method stub
		return dao.searchById(bookId);
	}

	public abstract List<Book> getAllBooks(String catagory);
}
