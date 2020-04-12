package com.udayclasses;

public class DemoThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t= Thread.currentThread();
		System.out.println(t.getName());
		
		ChildThread c= new ChildThread();
		
		c.start();
	}

}
