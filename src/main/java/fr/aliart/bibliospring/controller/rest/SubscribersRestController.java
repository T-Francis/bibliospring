package fr.aliart.bibliospring.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aliart.bibliospring.model.Subscriber;
import fr.aliart.bibliospring.service.SubscriberService;

@RestController
@EnableAutoConfiguration
public class SubscribersRestController {

	@Autowired
	SubscriberService subscriberService;

    @GetMapping("/subscribers/all")
    public List<Subscriber> getAllSubscribers() {
        return (List<Subscriber>) subscriberService.getAll();
    }
    
}
