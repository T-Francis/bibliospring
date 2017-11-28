package fr.aliart.bibliospring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aliart.bibliospring.dao.repository.BiblioUserRepository;
import fr.aliart.bibliospring.model.BiblioUser;

@Component
public class BiblioUserDao {

	@Autowired
	BiblioUserRepository biblioUserRepository;
	
    public BiblioUserDao() {
    }
    
    public List<BiblioUser> getAll() {
    	return biblioUserRepository.findAll();
    }
	
}
