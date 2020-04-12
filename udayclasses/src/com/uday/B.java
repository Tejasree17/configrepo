package com.uday;

public class B extends A{
	
	public void printf() {
		System.out.println(a);
		//System.out.println(b); //private variable is accessed within the class
		System.out.println(c);
		System.out.println(d);
	}

}
