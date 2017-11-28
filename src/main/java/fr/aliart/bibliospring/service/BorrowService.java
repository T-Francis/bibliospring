package fr.aliart.bibliospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.bibliospring.dao.BorrowDao;
import fr.aliart.bibliospring.model.Borrow;

@Service
public class BorrowService {

	@Autowired
	BorrowDao borrowDao;
	
    public BorrowService() {
    }

	public List<Borrow> getAll() {
		return borrowDao.getAll();
	}

	
}
