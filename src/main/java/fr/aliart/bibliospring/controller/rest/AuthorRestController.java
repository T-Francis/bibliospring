package fr.aliart.bibliospring.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aliart.bibliospring.model.Author;
import fr.aliart.bibliospring.service.AuthorService;

@RestController
@EnableAutoConfiguration
public class AuthorRestController {

	@Autowired
	AuthorService authorService;
	
    @GetMapping("/authors/all")
    public List<Author> getAllAuthors() {
        return (List<Author>) authorService.getAll();
    }
	
}
