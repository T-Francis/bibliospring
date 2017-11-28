package fr.aliart.bibliospring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.aliart.bibliospring.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}