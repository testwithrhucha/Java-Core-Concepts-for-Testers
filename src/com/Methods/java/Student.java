package com.Methods.java;

public class Student {

	

		int sid;
		String sname;
		char grade;
		
		void printStuData()
		{
			System.out.println(sid+"   "+sname+" "+ grade);
		}
		
		
		void setStuData(int id,String name,char g)
		{
			sid=id;
			sname=name;
			grade=g;
		}
		
		Student(int id,String name,char g)
		{
			sid=id;
			sname=name;
			grade=g;
		}
		
		
	}


