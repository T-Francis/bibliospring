package fr.aliart.bibliospring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/")
public class LandingController {

	@GetMapping("")
    public String index(ModelMap model) {    	 
        return "views/landing";
    }

	
	/**
	 * TESTING FUNCTION
	 * @param model
	 * @param name
	 * @return
	 */
	@GetMapping("/sayhello/{name}")
    public String subscribersManagement(ModelMap model, @PathVariable("name") String name) {
		
        model.addAttribute("name", name);
        
        return "views/landing";
    }
	
	/**
	 * TESTING FUNCTION
	 * @param model
	 * @param name
	 * @return
	 */
    @GetMapping("/geturl")
    public String getUrl(HttpServletRequest request, ModelMap model) {
    	
        String test = request.getRequestURI();        
        model.addAttribute("url", test);

        return "/landing";
    }
	
}
