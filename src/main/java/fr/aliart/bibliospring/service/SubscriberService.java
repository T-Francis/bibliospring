package fr.aliart.bibliospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.aliart.bibliospring.dao.SubscriberDao;
import fr.aliart.bibliospring.model.Subscriber;

@Service
public class SubscriberService {
	
	@Autowired
	SubscriberDao subscriberDao;
	
    public SubscriberService() {
    }

	public List<Subscriber> getAll() {
		return subscriberDao.getAll();
	}
	
}
