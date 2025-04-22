package com.webapp.beematiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/spring-boot")
@RestController
public class BeematizApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeematizApplication.class, args);
	}

	@GetMapping("/hello")
	public String firstApp(@RequestParam(value = "name", defaultValue = "Coder") String name) {
		return String.format("Congratulations  %s, you've built your first Spring Boot Application from Scratch!!", name);
	}

}


