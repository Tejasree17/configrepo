package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Scheduled(fixedDelay = 1000)
	public void scheduleTask() {
	    System.out.println("tast: " + System.currentTimeMillis() / 1000);
	}
	@GetMapping(path="/hello/{name}")
	public String text(@PathVariable ("name") String name) {
		return "Hello "+name;
		
	}

}
