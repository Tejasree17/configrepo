package com.ex;

import org.springframework.stereotype.Service;

@Service("xyz")
public class MyFirstService {

	public void myFirstMethod() {
		System.out.println("serviceee");
		System.out.println("Service annotation");
	}

}
