package com.springrestcontroller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class RestControllerDemo {

    @RequestMapping(value="/hello")
    public String text() {
        return "Hi Teju!";
    }
    
    @RequestMapping(value="/world",method=RequestMethod.POST,consumes="application/json")
    public String texttwo(@RequestBody Employee e) {
        return "Hi"+e.getEmployee_name();
        
    }

}
