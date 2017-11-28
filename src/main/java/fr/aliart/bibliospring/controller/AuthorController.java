package fr.aliart.bibliospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.aliart.bibliospring.service.AuthorService;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/authors")
public class AuthorController {

	@Autowired
	AuthorService authorService; 
	
	@GetMapping("/management")
    public String booksManagement(ModelMap model) {

        model.addAttribute("form", "persons");
        model.addAttribute("type", "authors");
    	 
        return "views/authorsManagement";
    } 
    
}
