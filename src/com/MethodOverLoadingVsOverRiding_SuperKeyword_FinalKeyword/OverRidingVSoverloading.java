package com.MethodOverLoadingVsOverRiding_SuperKeyword_FinalKeyword;

class abc

{
	void data(int a)
	{
	System.out.println(a);	
	}
	
	
	void data2(int b)
	{
	System.out.println(b);	
	}
}



class xyz extends abc
{
	
	void data(int a)
	{
		System.out.println(a*a);
	}
	
	void data2(int b)
	{
		System.out.println(b*b);// method overriding 
	}
	
	void data(int a,int b)
	{
		System.out.println(a*b);// method overloading
	}
}

public class OverRidingVSoverloading {

	public static void main(String[] args) {
		
		
		xyz a=new xyz();
		a.data(4);
		a.data2(3);
		a.data(5, 8);
		

	}

}
