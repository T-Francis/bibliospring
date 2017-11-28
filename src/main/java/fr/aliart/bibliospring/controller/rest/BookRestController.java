package fr.aliart.bibliospring.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aliart.bibliospring.model.Book;
import fr.aliart.bibliospring.service.BookService;

@RestController
@EnableAutoConfiguration
public class BookRestController {

	@Autowired
	BookService bookService;
	
    @GetMapping("/books/all")
    public List<Book> getAllBooks() {
    	return bookService.getAll();
    }
	
}
