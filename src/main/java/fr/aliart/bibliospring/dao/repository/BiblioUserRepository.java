package fr.aliart.bibliospring.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.aliart.bibliospring.model.BiblioUser;

@Repository
public interface BiblioUserRepository extends JpaRepository<BiblioUser, Integer> {

	//Syntax Example
	//BiblioUser findByIdPerson(Integer idPerson);	
	//BiblioUser findByFirstName(String authorName);
}
