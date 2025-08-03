package com.Polymorphism.java;

public class OverloadMainMethod {

	void main(int a)  //1
	{
	
		System.out.println(a);
	}
	
	void main(int a, int b)  //2
	{
		System.out.println("sum:"+(a+b));
	}

	
	public static void main(String[] args) 
	{
		OverloadMainMethod  ov=new OverloadMainMethod();
		
		ov.main(100);
		
		ov.main(100,200);

	}
}