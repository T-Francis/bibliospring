package fr.aliart.bibliospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.aliart.bibliospring.service.CopyService;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/copies")
public class CopyController {

	@Autowired
	CopyService copyService; 
	
	@GetMapping("/management")
    public String copyManagement(ModelMap model) {

        model.addAttribute("form", "copy");
    	 
        return "views/copiesManagement";
    }
	
}
