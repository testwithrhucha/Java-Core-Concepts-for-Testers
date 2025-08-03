package com.Abstraction;


interface Shape
	{
		int length=10;   // final and static
		int width=20;  // final and static
		
		void circle();   // abstract method
		
		default void square()
		{
			System.out.println("this is square - default method....");
		}
		
		static void rectangle()
		{
			System.out.println("this is rectangle - static method...");
		}
	}



	public class InterfaceDemo implements Shape
	{

		public void circle()
		{
			System.out.println(" this is circle - abstract method...");
		}
		
		void triangle()
		{
			System.out.println("this is triangle..");
		}
		
		
		public static void main(String[] args) {
			
			//Scenario 1
			InterfaceDemo  idobj=new InterfaceDemo();
			idobj.circle();  // abstract
			idobj.square();  //default
			Shape.rectangle(); // static 
			
			System.out.println(Shape.length+Shape.width);
			//System.out.println(idobj.length+idobj.width);
			
			idobj.triangle();
			
			
			//Scenario 2
			
			Shape sh=new InterfaceDemo();
			
			sh.circle();
			sh.square();
			//sh.rectangle();  //cannot access
			Shape.rectangle();
			//sh.triangle() ; //cannot access
			
		}

	}







