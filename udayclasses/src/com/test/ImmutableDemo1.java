package com.test;

import java.util.Collections;
import java.util.List;

public final class ImmutableDemo1 {

	private final int a;
	private final List l;
	private final int[] b;
	
	ImmutableDemo1(int a,List l,int[] b){
		this.a=a;
		this.l=Collections.unmodifiableList(l);
		this.b=b;
	}

	public int getA() {
		return a;
	}

	public List getL() {
		return l;
	}

	public int[] getB() {
		return b;
	}
	
}
