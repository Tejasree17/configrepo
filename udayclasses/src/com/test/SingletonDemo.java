package com.test;

public class SingletonDemo {
	static SingletonDemo s;

	private SingletonDemo() {

	}

	public static SingletonDemo getInstance() {
		if (s == null) {
			s = new SingletonDemo();
		}

		return s;

	}
}
