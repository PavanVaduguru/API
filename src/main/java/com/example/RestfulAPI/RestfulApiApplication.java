package com.example.RestfulAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulApiApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to CRUD API");
		SpringApplication.run(RestfulApiApplication.class, args);
	}

}
