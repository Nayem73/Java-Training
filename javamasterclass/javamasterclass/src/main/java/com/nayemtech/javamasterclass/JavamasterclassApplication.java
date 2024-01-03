package com.nayemtech.javamasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavamasterclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavamasterclassApplication.class, args);
	}

	@GetMapping
	public String greet() {
		String s = "Hello";
		return s;
	}

}
