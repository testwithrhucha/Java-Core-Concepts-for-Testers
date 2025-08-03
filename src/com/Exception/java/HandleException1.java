package com.Exception.java;

import java.util.Scanner;

public class HandleException1 {

	public static void main(String[] args) {
	
		
		Scanner sc= new Scanner (System.in);
		
		  // Arithmetic Exception
		   
		  System.out.println("Enter a number :"); 
		  int num=sc.nextInt();
		  try
		  {
		  System.out.println(100/num);
		  }
		  
		  catch(Exception e)
		  {
			  System.out.println("invalid input");
			  System.out.println(e.getMessage());
			  
		  }
		  
		  System.out.println("Program is completed");

	}

}
