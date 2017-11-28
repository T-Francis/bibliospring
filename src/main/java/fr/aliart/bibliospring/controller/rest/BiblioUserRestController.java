package fr.aliart.bibliospring.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aliart.bibliospring.model.BiblioUser;
import fr.aliart.bibliospring.service.BiblioUserService;

@RestController
@EnableAutoConfiguration
public class BiblioUserRestController {

	@Autowired
	BiblioUserService biblioUserService;

    @GetMapping("/bibliousers/all")
    public List<BiblioUser> getAllBiblioUsers() {
        return (List<BiblioUser>) biblioUserService.getAll();
    }
	
}
