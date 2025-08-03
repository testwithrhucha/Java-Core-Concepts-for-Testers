package com.Inhertance;

 class parent
 {
	int a;
	
	
	void print()
	{
		System.out.println(a);
	}
	
 }
 
 
 
	class child extends parent
	{
	int b;
	
	void data() 
	{
		System.out.println(b);
	}
		
	}
	
     public class SingleInheritance{
	public static void main(String[] args) {
		
		
		child c=new child();
		int a=23;
		int b=34;
		

	}
     }


