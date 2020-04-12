package com.test;

public class SingletonDemo1 {

	static SingletonDemo1 ss;
	
	private SingletonDemo1() {
		
	}
	public static SingletonDemo1 getInstance() {
		if(ss==null) {
		ss=new SingletonDemo1();
		}
		return ss;
		
	}
}
