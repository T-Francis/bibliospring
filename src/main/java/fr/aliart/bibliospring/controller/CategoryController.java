package fr.aliart.bibliospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.aliart.bibliospring.service.CategoryService;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/categories")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService; 
	
	@GetMapping("/management")
    public String copyManagement(ModelMap model) {

        model.addAttribute("form", "category");
    	 
        return "views/categoriesManagement";
    }
	
}
