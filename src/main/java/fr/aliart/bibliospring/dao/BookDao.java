package fr.aliart.bibliospring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aliart.bibliospring.dao.repository.BookRepository;
import fr.aliart.bibliospring.model.Book;

@Component
public class BookDao {
	
	@Autowired
	BookRepository bookRepository;

    public BookDao() {
    }
    
    public List<Book> getAll() {
    	return bookRepository.findAll();
    }
	
}
