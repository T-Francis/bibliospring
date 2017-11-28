package fr.aliart.bibliospring.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aliart.bibliospring.model.Borrow;
import fr.aliart.bibliospring.service.BorrowService;

@RestController
@EnableAutoConfiguration
public class BorrowRestController {

	@Autowired
	BorrowService borrowService;

    @GetMapping("/borrows/all")
    public List<Borrow> getAllBorrow() {
    	return borrowService.getAll();
    }
	
}
