package fr.aliart.bibliospring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.aliart.bibliospring.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}