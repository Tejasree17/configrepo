package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class Controller {
	
	private static Logger logger=LoggerFactory.getLogger(Controller.class);
	
	@Autowired
	private FirstmsService firstmsService;
	
	@GetMapping("/first")
	public Student first() {
		logger.info("Logger used : set to trace");
		return firstmsService.returnstring();
	}
}
