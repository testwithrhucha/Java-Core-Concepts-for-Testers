package com.Methods.java;

public class StudentMain {

	

		public static void main(String[] args) 
		{
			
			//Student stu=new Student();
			
			//1) assign data using using object reference 
			/*stu.sid=101;
			stu.sname="John";
			stu.grade='A';
			*/
			
			//2) assing data by using user defined method
			//stu.setStuData(101,"John",'B');
			
			
			//3) using constructor
			Student stu=new Student(101,"John",'B');
			
			
			
			stu.printStuData();
			
		}

	}


