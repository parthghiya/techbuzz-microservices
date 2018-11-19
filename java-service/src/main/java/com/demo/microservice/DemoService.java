package com.demo.microservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {

	@GetMapping(value="/java-microservice")
	public String firstString() {
		return "Hello From Java";
	}
	
}
