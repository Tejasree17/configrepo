package com.test;

import java.util.Collections;
import java.util.List;

public final class ImmutableDemo {

	final private int a;
	private final int b;
	private final String s;
	private final List l; 
	
	@SuppressWarnings("unchecked")
	ImmutableDemo(int a,int b,String s,List l){
		this.a=a;
		this.b=b;
		this.s=s;
		this.l=Collections.unmodifiableList(l);
	}

	public int getA() {
		return a;
	}

	public List getL() {
		return l;
	}

	public int getB() {
		return b;
	}

	public String getS() {
		return s;
	}
	
	
}
