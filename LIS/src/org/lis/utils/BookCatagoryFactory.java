package org.lis.utils;

import org.lis.books.SearchActionBook;
import org.lis.books.SearchBooks;
import org.lis.books.SearchFictionBook;

//factory for SearchResults


public class BookCatagoryFactory {

	public static SearchBooks getBookCatagory(String catagory) throws Exception{
		
		if(catagory.equalsIgnoreCase("Action")){
			return new SearchActionBook();
		}else if(catagory.equalsIgnoreCase("Fiction")){
			return new SearchFictionBook();
		}else{
			return new SearchFictionBook();
		}
		
	}
}
