package com.restexampledemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDemo {

	@RequestMapping("/hello")
	public String getName() {
		return "Hello";
	}
	
}
