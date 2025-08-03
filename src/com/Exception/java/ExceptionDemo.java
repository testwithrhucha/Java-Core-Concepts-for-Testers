package com.Exception.java;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		/*
		 * // Example 1
		 *  
		 * System.out.println("Enter a number :"); 
		 * int num=sc.nextInt();
		 * 
		 * System.out.println(100/num); // if user enter the invalid input which is 0
		 * then exception occurs // 100/0 -----------> ArithmeticException
		 */
		
		/*
		 * //Example 2 
		 * int arr[]=new int[5];
		 * 
		 * System.out.println("Enter a postion(0-4):"); 
		 * int pos=sc.nextInt();
		 * 
		 * System.out.println("Enter value of position");
		 * 
		 * int value=sc.nextInt(); 
		 * arr[pos]=value; 
		 * // if out of range input is enter by
		 * user eg. 5 then ------> ArrayIndexOutOfBoundsException
		 * System.out.println(arr[pos]);
		 */
		
		//Example 3 
		
		//String s=null; // NullPointerException
		//System.out.println(s.length());
		
		//Example 4 
		
		//String s="welocme"; // here the input type is string but we want to convert it into the number then --------> NumberFormatException
		String s="11334";
		Integer.parseInt(s);
		System.out.println(s);
		
		
		
		
		
		
		
		
	

	}

}
