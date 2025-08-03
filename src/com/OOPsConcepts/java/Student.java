package com.OOPsConcepts.java;

public class Student {
       int Sid;
	String Stu_Name;
	int Stu_age;
	 char grade;
	 
	 void StuDetails()
	 {
		System.out.println(Sid+" "+Stu_Name+" "+Stu_age+" "+grade);
	 
	 }
	 
	

	public static void main(String[] args) {

      Student s=new Student();
      s.Stu_Name="John";
      s.Sid=212;
      s.Stu_age=21;
      s.grade='A';
      s.StuDetails();
      
      
		
	}

}
