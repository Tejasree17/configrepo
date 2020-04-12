package com.ex;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class FirstProj {
	@Autowired
	private MyFirstService xyz;

	/*
	 * @Autowired public FirstProj(MyFirstService m){ this.myFirstService=m; }
	 */
	
    @RequestMapping("/hello")
    public String text(@RequestHeader("Myname") String name) {
        System.out.println(name);
    	xyz.myFirstMethod();
        System.out.println("Get service");
    	return "Hi Teju!";
    }
    
    @RequestMapping(value="/world",method=RequestMethod.POST)
    public String texttwo(@RequestBody Employee e) {
        return "Hi"+e.getEmployee_name();
    }


}
