package com.Polymorphism.java;

public class PassingParamsToMainMethod {

	public static void main(String[] a) 
	{
		
		for(String s:a)
		{
			System.out.println(s);
		}
		
		System.out.println("Number of values in array:"+a.length);
	}
}