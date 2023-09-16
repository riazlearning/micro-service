package com.boot.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	

	
	@GetMapping("/msg")
	public String helloMsg() {
		
		return "Hello World";
	}

}
