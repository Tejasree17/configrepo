package com.example.demo;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	 @RequestMapping("/hello")
	    public String Text {
	        System.out.println("Hello");
	    }

}
