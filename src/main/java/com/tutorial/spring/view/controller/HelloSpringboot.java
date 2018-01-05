package com.tutorial.spring.view.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringboot {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello, Spring Boot!";
	}
}
