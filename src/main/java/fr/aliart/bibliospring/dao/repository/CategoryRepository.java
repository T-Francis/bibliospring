package fr.aliart.bibliospring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.aliart.bibliospring.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	
}
