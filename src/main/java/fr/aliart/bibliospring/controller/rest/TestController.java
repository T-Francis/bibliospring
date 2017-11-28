package fr.aliart.bibliospring.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.aliart.bibliospring.model.Author;
import fr.aliart.bibliospring.model.BiblioUser;
import fr.aliart.bibliospring.model.Book;
import fr.aliart.bibliospring.model.Subscriber;
import fr.aliart.bibliospring.model.Category;
import fr.aliart.bibliospring.model.Copy;
import fr.aliart.bibliospring.model.Borrow;
import fr.aliart.bibliospring.service.AuthorService;
import fr.aliart.bibliospring.service.BiblioUserService;
import fr.aliart.bibliospring.service.SubscriberService;
import fr.aliart.bibliospring.service.CategoryService;
import fr.aliart.bibliospring.service.BookService;
import fr.aliart.bibliospring.service.BorrowService;
import fr.aliart.bibliospring.service.CopyService;

@RestController
@EnableAutoConfiguration
public class TestController {

}
