package fr.aliart.bibliospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.bibliospring.dao.CategoryDao;
import fr.aliart.bibliospring.model.Category;

@Service
public class CategoryService {

	@Autowired
	CategoryDao categoryDao;
	
	public  CategoryService() {
	}
	
	public List<Category> getAll() {
		return categoryDao.getAll();
	}
}
