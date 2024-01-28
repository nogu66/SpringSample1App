package com.example.springsample1app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springsample1appApplication {

	String[][] data = {
		{"noname", "no email address", "0"},
		{"taro", "taro@yamada", "39"},
		{"hanako", "hanako@flower", "28"},
		{"sachiko", "sachiko@happy", "17"},
		{"jiro", "jiro@change", "jiro@change", "6"}
	};

	public static void main(String[] args) {
		SpringApplication.run(Springsample1appApplication.class, args);
	}

	@RequestMapping("/{num}")
	public String index(@PathVariable int num) {
		int n = num < 0 ? 0 : num >= data.length ? 0 : num;
		String[] item = data[n];
		String msg = "ID=%s. {name: %s, mail: %s, age: %s}";
		return String.format(msg, num, item[0], item[1], item[2]);
	}
}
