package com.example.demo.entities;

public class Book {
	private int bookId;
	private String bookName;
	private int bookPages;
	private String bookAutor;
	
	
	
	public Book(int bookId, String bookName, int bookPages, String bookAutor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPages = bookPages;
		this.bookAutor = bookAutor;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPages=" + bookPages + ", bookAutor="
				+ bookAutor + "]";
	}



	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPages() {
		return bookPages;
	}
	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}
	public String getBookAutor() {
		return bookAutor;
	}
	public void setBookAutor(String bookAutor) {
		this.bookAutor = bookAutor;
	}
	
	
	
}
