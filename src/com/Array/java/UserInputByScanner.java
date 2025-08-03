package com.Array.java;

import java.util.Scanner;

public class UserInputByScanner {
	
	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		/*System.out.println("Enter a number:");
		// for integer
		int num=sc.nextInt();
		
		System.out.println("The number from user is :" +num);
		
		// for float
		System.out.println("Enter a float number:");
		float no=sc.nextFloat();
		System.out.println("The number is :"+ no);
		 // for string
		
		System.out.println("Enter your name:");
		
		String name=sc.next();
		System.out.println("My name is :"+name);
		
		// Taking multiple values
		// Example 1
		System.out.println("Enter First Number :");
		int num1=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2=sc.nextInt();
		
		System.out.println("Sum of two numbers is :"+ (num1+num2));
		*/
		//Example 2
		
		System.out.println("Enter First Name :");
		String name =sc.next();
		
		System.out.println("Enter Surname:");
	 String srname=sc.next();
		
		System.out.println("Your name  is :"+ (name+srname));

	}

}
