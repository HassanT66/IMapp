package com.hassan.app.hassanapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HassanappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HassanappApplication.class, args);
	}

	@Bean
	CommandLineRunner run(NameRepository nameRepository) {
		return args -> {
			nameRepository.save(new Name(null, "Hassan", "Tanveer", "2"));
		};
	}
}
