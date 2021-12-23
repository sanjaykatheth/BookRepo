package com.example.Book.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.Book.Entity.BookEntity;

@Component
public class BookService {



	static List<BookEntity> book=new ArrayList<BookEntity>();

	static{
		try {
			book.add(new BookEntity(13,"python","this book is for the pythong"));
			book.add(new BookEntity(14,"react js","this is for the core concept of react"));
			book.add(new BookEntity(12,"java 1.0","this book will describe the complete details of core java"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<BookEntity> getBook()
	{

		return book;

	}

	public String getByIdint(int id)
	{
		String bookDetails = null;



		for(int i=0;i<book.size();i++)
		{

		
			
		}



		return  bookDetails;

	}

}
