package com.uday;

public class Number {

	public static void main(String[] args) {
		int[] a=new int[] {0,77,80,8,4};
		int max = 0;
		int max2=0;
		int i;
		for(i=0; i < 5; i++)
		{
			if(a[i]>max)
			{
			max2=max;
			max=a[i];
		}
			else if(a[i] > max2 && a[i] != max)
			{
				max2=a[i];
			}
	}
System.out.println(max2);
}
}

