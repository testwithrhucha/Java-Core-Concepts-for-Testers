package com.TypeCasting.java;

class Parent
{
	String name="John";
	
	void m1()
	{
		System.out.println("this is m1 from Parent..");
	}
}

class Child extends Parent
{
	int id=101;
	
	void m2()
	{
		System.out.println("this is m2 from Child...");
	}
}



public class UpAndDownCastingObjects {

	public static void main(String[] args) {

		//Scenario 1
		/*Child c=new Child();
		System.out.println(c.name); //Parent
		c.m1();  //Parent
		System.out.println(c.id);  //Child
		c.m2(); //Child
		*/
		
		//Scenario 2
		/*Parent p=new Child();  //upcasting
		System.out.println(p.name); //Parent
		p.m1();  //Parent
		
		System.out.println(p.id);  //we cannot access
		p.m2(); //we cannot access
		*/
		
		//Scenario 3
		/*Child c=(Child) new Parent(); //Invalid casting as per Rule3 of type casting.Throws run time exception.
		System.out.println(c.name);
		System.out.println(c.id);
		*/
		
	}

}
