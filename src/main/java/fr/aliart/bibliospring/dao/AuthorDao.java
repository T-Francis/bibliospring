package fr.aliart.bibliospring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aliart.bibliospring.dao.repository.AuthorRepository;
import fr.aliart.bibliospring.model.Author;

@Component
public class AuthorDao {

	@Autowired
	AuthorRepository authorRepository;

    public AuthorDao() {
    }
    
    public List<Author> getAll() {
    	return authorRepository.findAll();
    }

}
