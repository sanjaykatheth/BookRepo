package com.example.Book.Controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

	public List<Integer> getBook()
	{
    List<Integer> getBook =this.bookService.getBooks();
		return getBook;
	}
	
	
//	@GetMapping("/books/{id}")
//	public  String getBookById(@PathVariable("id") int id) {
//		
//		return this.bookService.getByIdint(id);
//	}
//	
//	@PostMapping("/books")
//	public BookEntity addBook(@RequestBody BookEntity book)
//	{
//	           BookEntity bookentity = bookService.adddBook(book);
//			
//              return bookentity;
//  
//		
//	}
//	
//	@DeleteMapping("/books/{bookID}")
//	public List<BookEntity> deleteBook(@PathVariable("bookID") int id)
//	{
//		 return bookService.deleteById(id);
//		
//	}
//		
//	@PutMapping("books/{bookId}")
//	public void updateBook(@RequestBody BookEntity book,@PathVariable("bookId") int bookId)
//	{
//		
//		this.bookService.updateBook(book, bookId);
//	
//	}
	
}
