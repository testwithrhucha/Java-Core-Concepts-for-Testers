package com.OOPsConcepts.java;

public class ObjectAndClass {  // ObjectAndClass is a class which is blueprint and collection of objects
	
	
	int EmpId;
	String EmpName;
	String Position;
	int salary;
	
	void display() // void method()
	{
		System.out.println(EmpId);
		System.out.println(EmpName);
		System.out.println(Position);
		System.out.println(salary);
	}
	
	
public static void main(String[] args) {
		
	ObjectAndClass emp1=new ObjectAndClass(); // object 1
	
	emp1.EmpId=101;
	emp1.EmpName="John";
	emp1.Position="HR";
	emp1.salary=200000;
	
	emp1.display();
	
	
	
ObjectAndClass emp2=new ObjectAndClass();   // object 2
	
	emp2.EmpId=102;
	emp2.EmpName="Bob";
	emp2.Position="Engineer";
	emp2.salary=100000;
	
	emp2.display(); // calling the method in main method 
	
	

	}

}
