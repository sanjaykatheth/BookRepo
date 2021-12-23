package com.example.Book.Entity;

import org.springframework.stereotype.Component;


public class BookEntity {
	
	private int bookId;
	
	private String BookName;

	private String Description;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "BookEntity [bookId=" + bookId + ", BookName=" + BookName + ", Description=" + Description + "]";
	}

	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookEntity(int bookId, String bookName, String description) {
		super();
		this.bookId = bookId;
		BookName = bookName;
		Description = description;
	}
	
}
