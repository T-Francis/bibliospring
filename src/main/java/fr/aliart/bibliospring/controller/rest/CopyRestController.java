package fr.aliart.bibliospring.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aliart.bibliospring.model.Copy;
import fr.aliart.bibliospring.service.CopyService;

@RestController
@EnableAutoConfiguration
public class CopyRestController {
		
	@Autowired
	CopyService copyService;
	
    @GetMapping("/copies/all")
    public List<Copy> getAllBookCopies() {
    	return copyService.getAll();
    }
	
}
