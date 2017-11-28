package fr.aliart.bibliospring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aliart.bibliospring.dao.repository.CategoryRepository;
import fr.aliart.bibliospring.model.Category;

@Component
public class CategoryDao {
	
	@Autowired
	CategoryRepository categoryRepository;

	public CategoryDao(){		
	}
	
    public List<Category> getAll() {
    	return categoryRepository.findAll();
    }
    
}
