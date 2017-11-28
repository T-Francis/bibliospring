package fr.aliart.bibliospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.bibliospring.dao.BiblioUserDao;
import fr.aliart.bibliospring.model.BiblioUser;

@Service
public class BiblioUserService {

	@Autowired
	BiblioUserDao biblioUserDao;
	
    public BiblioUserService() {
    }
	
	public List<BiblioUser> getAll() {
		return biblioUserDao.getAll();
	}
	
}
