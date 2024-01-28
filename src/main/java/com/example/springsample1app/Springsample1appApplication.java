package com.example.springsample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springsample1appApplication {
	public static void main(String[] args) {
		SpringApplication.run(Springsample1appApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "Hello, Spring Boot 3!!!";
	}
}
