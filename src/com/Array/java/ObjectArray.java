package com.Array.java;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		
		// Object Array can stores multiple heterogeneous data
		// In object array the object variable can stores multiple type of data in single array
		
		Object a[]=new Object [5];
		
		a[0]=45;
		
		a[1]="welcome";
		
		a[2]='A';
		
		a[3]=true;
		
		a[4]=4.67;
		
		System.out.println(Arrays.toString(a));
		
		
		// By using the enhance for loop
		
		for(Object x:a)
		{
			System.out.println(x);
		}
		

	}

}
