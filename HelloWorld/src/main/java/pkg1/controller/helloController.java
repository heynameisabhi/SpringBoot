package pkg1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Students")
public class helloController {
	
	@GetMapping("/hello")
	public String sayhello() {
		return "Hello from String boot";
	}
	

}
