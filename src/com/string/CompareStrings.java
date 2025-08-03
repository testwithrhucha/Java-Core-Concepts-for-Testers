package com.string;

public class CompareStrings {

	public static void main(String[] args) {
	
		
		//Example 1 
		
		String s1="welcome";           // this is variables 
		String s2="welcome";
		
		System.out.println(s1==s2);             
		System.out.println(s1.equals(s2));
		
		// Example 2 
		
		String s3= new String("welcome");           // this create objects
		String s4=new String ("welcome");
		
		System.out.println(s3==s4);              // == used to compare the objects ----->false--> s3 not equal to s4         
		System.out.println(s3.equals(s4));     // equals() method used to compare values in objects----> true----> welcome equals to welcome
		
		// Example 3 
		
		

		String s5= "welcome" ;          
		String s6=new String ("welcome"); // this create objects
		
		System.out.println(s5==s6);              // == used to compare the objects ----->false--> s3 not equal to s4         
		System.out.println(s5.equals(s6));     // equals() method used to compare values in objects----> true----> welcome equals to welcome
		
		
		

	}

}
