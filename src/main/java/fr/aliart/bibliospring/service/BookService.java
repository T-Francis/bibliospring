package fr.aliart.bibliospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.bibliospring.dao.BookDao;
import fr.aliart.bibliospring.model.Book;

@Service
public class BookService {

	@Autowired
	BookDao bookDao;
	
    public BookService() {
    }

	public List<Book> getAll() {
		return bookDao.getAll();
	}
	
}
