package com.example.WebappSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication

public class WebAppSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppSpringBootApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "<h1>Hello Tilek and All students!</h1>";
	}

}
