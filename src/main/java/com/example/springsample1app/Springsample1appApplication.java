package com.example.springsample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springsample1appApplication {


	public static void main(String[] args) {
		SpringApplication.run(Springsample1appApplication.class, args);
	}

	@Bean
	public Post post() {
		return new Post(0, 0, "Dummy", "This is dummy post.");
	}
}