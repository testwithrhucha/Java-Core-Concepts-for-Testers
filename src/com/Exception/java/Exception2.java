package com.Exception.java;

import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {

           Scanner sc=new Scanner(System.in);
		
		
		int arr[]=new int[5];
		  
		  System.out.println("Enter a postion(0-4):"); 
		  int pos=sc.nextInt();
		  
		  System.out.println("Enter value of position");
		  
		  int value=sc.nextInt(); 
		  try
		  {
		  arr[pos]=value; 
		  System.out.println(arr[pos]);
		  }
		  
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  System.out.println("Invalid position");
			  e.getMessage();
		  }
		  System.out.println("Program finished "); // after exception handle rest of code will be executed
	}

}
