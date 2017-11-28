package fr.aliart.bibliospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.aliart.bibliospring.service.SubscriberService;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/subscribers")
public class SubscriberController {
	
	@Autowired
	SubscriberService subscribersService;
	
	@GetMapping("/management")
    public String subscribersManagement(ModelMap model) {
		
    	model.addAttribute("form", "persons");
        model.addAttribute("type", "subscriber");
    	 
        return "views/subscribersManagement";
    }
	
}
