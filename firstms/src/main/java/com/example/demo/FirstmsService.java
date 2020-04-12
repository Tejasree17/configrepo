package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FirstmsService {

	@Value("${secondms.url}")
	private String secondmsUrl;
	
	public Student returnstring() {
		RestTemplate restTemplate= new RestTemplate();
		ResponseEntity<Student> response=restTemplate.getForEntity(secondmsUrl, Student.class);
		return response.getBody();
		
	}
}
