package com.nayemtech.javamasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@SpringBootApplication
@RestController
public class JavamasterclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavamasterclassApplication.class, args);
	}

	@GetMapping("/")
	public greetResponse greet() {
		ArrayList<String> names = new ArrayList<>(List.of("what", "Nayem", "Jim", "Alif"));
		String s = "Hello from record greetResponse, return type = record name";
		return new greetResponse(s, names);
	}

	public class greetResponse {
		private String greetMessage;
		private ArrayList<String> names;

		public greetResponse(String greetMessage, ArrayList<String> names) {
			this.greetMessage = greetMessage;
			this.names = names;
		}

		public String getGreetMessage() {
			return greetMessage;
		}

		public ArrayList<String> getNames() {
			return names;
		}
	}
}
