package fr.aliart.bibliospring.controller.rest;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aliart.bibliospring.model.Category;
import fr.aliart.bibliospring.service.CategoryService;

@RestController
@EnableAutoConfiguration
public class CategoryRestController {

	@Autowired
	CategoryService categoryService;
	
    @GetMapping("/categories/all")
    public List<Category> getAllCategories() {
        return (List<Category>) categoryService.getAll();
    }
	
    @GetMapping("/categories/allForAutocomplete")
    public HashSet<String> getAllCategoriesForSuggest() {
    	List<Category> test = categoryService.getAll();
    	HashSet<String> categoryListName =  new HashSet<String>();
    	
    	for (Category category : test) {
    		categoryListName.add(category.getName());
		}
    	
     	return (HashSet<String>) categoryListName;
    }
   
}
