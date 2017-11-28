package fr.aliart.bibliospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.aliart.bibliospring.service.BookService;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/books")
public class BookController {
	
	@Autowired
	BookService bookService; 
	
	@GetMapping("/management")
    public String booksManagement(ModelMap model) {

        model.addAttribute("form", "book");
    	 
        return "views/booksManagement";
    }
}
