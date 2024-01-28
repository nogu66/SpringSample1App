package com.example.springsample1app;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springsample1appApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Springsample1appApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}


	@Override
	public void run(ApplicationArguments args) {
		System.out.println("+--------------------------------------+");
		System.out.println(" | this is CommoandLoine Runner program |");
		System.out.println("+--------------------------------------+");
		System.out.println(args.getOptionNames());
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getSourceArgs());
	}
}
