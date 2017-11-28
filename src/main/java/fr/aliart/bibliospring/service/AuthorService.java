package fr.aliart.bibliospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.bibliospring.dao.AuthorDao;
import fr.aliart.bibliospring.model.Author;

@Service
public class AuthorService {

	@Autowired
	AuthorDao authorDao;
	
	public AuthorService() {		
	}
	
	public List<Author> getAll() {
		return authorDao.getAll();
	}
}
