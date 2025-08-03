package com.OOPsConcepts.java;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(); // object 1
		
		emp1.EmpId=101;
		emp1.EmpAge=23;
		
		emp1.EmpName="John";
		emp1.Position="HR";
		emp1.salary=200000;
		
		emp1.display();
		
		
		
	       Employee emp2 =new Employee();    // object 2
		
		emp2.EmpId=102;
		emp2.EmpName="Bob";
		emp2.EmpAge=27;
		emp2.Position="Engineer";
		emp2.salary=100000;
		
		emp2.display(); // calling the method in main method 
		

}
}
