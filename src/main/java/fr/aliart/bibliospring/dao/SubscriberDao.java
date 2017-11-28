package fr.aliart.bibliospring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.aliart.bibliospring.dao.repository.SubscriberRepository;
import fr.aliart.bibliospring.model.Subscriber;

@Component
public class SubscriberDao {

	@Autowired
	SubscriberRepository subscriberRepository;

    public SubscriberDao() {
    }
    
    public List<Subscriber> getAll() {
    	return subscriberRepository.findAll();
    }

}
