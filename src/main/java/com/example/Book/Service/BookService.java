package com.example.Book.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Book.Entity.BookEntity;
import com.example.Book.Repository.BookRepository;

@Component
public class BookService {
	
	
	@Autowired
	private BookRepository bookRepository;
//	static ArrayList<BookEntity> book=new ArrayList<BookEntity>();
//	
//	static{
//		try {
//			
//			book.add(new BookEntity(13,"python","this book is for the pythong"));
//			book.add(new BookEntity(14,"react js","this is for the core concept of react"));
//			book.add(new BookEntity(12,"java 1.0","this book will describe the complete details of core java"));
//		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	public List<Integer> getBooks()
	{
		List<Integer>	allId=bookRepository.findAll();
		return allId;
	}
//	public String getByIdint(int id)
//	{
//		String bookDetails = null;
//
//		for(int i=0;i<book.size();i++)
//		{
//			if(book.get(i).getBookId()==id) {
//
//				bookDetails = book.get(i).getBookName();
//			}
//		}
//		return  bookDetails;
//	}
	
//	public BookEntity adddBook(BookEntity bookentity)
//	{
//		book.add(bookentity);
//		return bookentity;
//
//	}
//	public List<BookEntity> deleteById(int id)
//	{
//
//
//		for(int i=0;i<book.size();i++)
//		{
//
//			if(book.get(i).getBookId()==id)
//			{
//			    book.remove(i);
//
////             book.remove(book.get(i));
//
//			}
//
//		}
//		System.out.print(book.toString());
//		return book;
//	
//	}
	
//	public List<BookEntity> updateBook(BookEntity newBook,int bookId)
//	{
//	
//		
//		for(int i=0;i<book.size();i++)
//		{
//			
//			
//			if(book.get(i).getBookId()==bookId)
//			{
//			
//				book.set(i, newBook);
//				
////			book.get(i).setBookId(newBook.getBookId());
////			book.get(i).setBookName(newBook.getBookName());
////			book.get(i).setDescription(newBook.getDescription());
//			}
//		}
//		return book ;
//		
	
		
		
	



}
