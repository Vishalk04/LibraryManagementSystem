package org.lis.model;

//public abstract class Book {
	public  class Book {

	private String bookId;
	private String title;
	private String auther;
	private String catagory;

	//private String catagory;
	public Book(){}
	public Book(String bookId, String title, String auther,String catagory) {
		// TODO Auto-generated constructor stub
		this.bookId = bookId;
		this.title = title;
		this.auther = auther;
		this.catagory = catagory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}



	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookId+" "+title+" "+auther;
	}

}
