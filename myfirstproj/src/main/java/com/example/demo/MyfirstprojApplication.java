package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.ex")
@SpringBootApplication
public class MyfirstprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstprojApplication.class, args);
	}

}
