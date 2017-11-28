package fr.aliart.bibliospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.aliart.bibliospring.controller.LandingController;


@EnableJpaRepositories(basePackages = "fr.aliart.bibliospring.dao")
@SpringBootApplication(scanBasePackages = "fr.aliart.bibliospring")
public class BibliospringApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BibliospringApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(BibliospringApplication.class, args);
	}



//@EnableJpaRepositories(basePackages = "fr.aliart.bibliospring.dao")
//@SpringBootApplication(scanBasePackages = "fr.aliart.bibliospring")
//public class BibliospringApplication {
//	
//	public static void main(String[] args) {
//		SpringApplication.run(BibliospringApplication.class, args);
//	}

}