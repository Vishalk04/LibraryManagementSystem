package org.lis;

import java.util.List;
import java.util.Scanner;

import org.lis.books.IBook;
import org.lis.books.SearchBooks;
import org.lis.model.Book;
import org.lis.utils.BookCatagoryFactory;

public class LISApp {
	
	 Scanner scan; 
	 
	public static void  run(){
		try{
		new LISApp().start();
		
		}catch(Exception e){
			
			System.out.println("oops! somethidn went Wrong");
		}
	}
	public void start(){
		System.out.println("Welcome to LIS app!");
		search();
	}
	
	public void search(){
		//factory
		SearchBooks book = null;
		
		try{
		scan = new Scanner(System.in);
		
		 
		List<Book> result;
		String input;
		Book bk;
		
		 
	
	while(true){
		System.out.println("enter 1 for search by catagory, 2 - title , 3 - Auther, 4 - id");

String option = scan.nextLine();
		
		switch (option) {
		
		case "1":
			System.out.println("Enter Book catagory");
			input = scan.nextLine();
			book = BookCatagoryFactory.getBookCatagory(input);
			result = book.getAllBooks(input);
			System.out.println("Books available are : ");
			for (Book book2 : result) {
				System.out.println(book2);
			}
			//System.out.println("Enter Bood id");
			break;
			
		case "2":
			System.out.println("Enter Book Title ");
			input = scan.nextLine();
			book = BookCatagoryFactory.getBookCatagory(input);
			result = book.SearchByTitle(input);
			System.out.println("Books available are : ");
			for (Book book2 : result) {
				System.out.println(book2);
			}
			break;
			
		case "3":
			System.out.println("Enter Book Auther");
			input = scan.nextLine();
			book = BookCatagoryFactory.getBookCatagory(input);
			result = book.SearchByAuther(input);
			System.out.println("Books available are : ");
			for (Book book2 : result) {
				System.out.println(book2);
			}
			break;
			
		case "4":
			System.out.println("Enter Book id");
			input = scan.nextLine();
			book = BookCatagoryFactory.getBookCatagory(input);
			bk = book.SearchById(input);
			System.out.println("Books available are : ");
			System.out.println(bk);
			break;
		
		default:
			System.out.println("Enter valid option");
			
		}
	}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
