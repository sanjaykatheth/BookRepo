package com.example.Book.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Book.Entity.BookEntity;
import com.example.Book.Service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	@GetMapping("books")
	public List<BookEntity> getBook()
	{
    List<BookEntity> getBook =this.bookService.getBook();
		return getBook;
	}
	
	@GetMapping("/books/{id}")
	public  String getBookById(@PathVariable("id") int id) {
		
		return this.bookService.getByIdint(id);
	}
	
}
