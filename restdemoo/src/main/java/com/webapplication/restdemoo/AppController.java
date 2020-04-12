package com.webapplication.restdemoo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping(value="/hello")
    public String text() {
        return "Hi!";
    }


}
