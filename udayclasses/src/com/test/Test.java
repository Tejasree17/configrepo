package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add("apple");
		int[] b= {1,2,3};
		ImmutableDemo1 i=new ImmutableDemo1(1,l1,b);
		System.out.println(i.getA());
		System.out.println(i.getB());
		System.out.println(i.getL());
	}

}
