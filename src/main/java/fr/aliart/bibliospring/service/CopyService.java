package fr.aliart.bibliospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.bibliospring.dao.CopyDao;
import fr.aliart.bibliospring.model.Copy;

@Service
public class CopyService {
	
	@Autowired
	CopyDao copydao;
	
	public CopyService() {		
	}

	public List<Copy> getAll() {
		return copydao.getAll();
	}
		
}
