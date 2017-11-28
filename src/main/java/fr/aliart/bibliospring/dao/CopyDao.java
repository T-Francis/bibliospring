package fr.aliart.bibliospring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aliart.bibliospring.dao.repository.CopyRepository;
import fr.aliart.bibliospring.model.Copy;

@Component
public class CopyDao {

	@Autowired
	CopyRepository bookCopyRepository;
	
	public CopyDao() {
	}
	
    public List<Copy> getAll() {
    	return bookCopyRepository.findAll();
    }
	
}
