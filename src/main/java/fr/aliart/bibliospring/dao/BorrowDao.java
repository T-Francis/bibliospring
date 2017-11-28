package fr.aliart.bibliospring.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aliart.bibliospring.dao.repository.BorrowRepository;
import fr.aliart.bibliospring.model.Borrow;

@Component
public class BorrowDao {
	
	@Autowired
	BorrowRepository borrowRepository;

    public BorrowDao() {
    }
    
    public List<Borrow> getAll() {
    	return borrowRepository.findAll();
    }
		
}
