package com.uday;

public class A {
public int a=10;
private int b=1;
protected int c=3;
int d=9;

public void printName() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}

public static void print() {
	A a1=new A();
	System.out.println(a1.a);
	System.out.println(a1.b);
	System.out.println(a1.c);
	System.out.println(a1.d);
}
}
