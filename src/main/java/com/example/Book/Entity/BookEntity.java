package com.example.Book.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="BookTable")
public class BookEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
