package com.Exception.java;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		  // Arithmetic Exception
		   
		  System.out.println("Enter a number :"); 
		  int num=sc.nextInt();
		  try
		  {
		  System.out.println(100/num);
		  }
		  
		  
		  // instead of using multiple catch block there is Exception class in java which is parent of all exceptions and it include all the exceptions 
		  
		  
		  catch (Exception e)
		  {
			System.out.println("Invalid input "); 
			System.out.println(e.getMessage());
			  
		  }
		  
			  
		  /*catch(ArithmeticException e)
		  {
			  System.out.println("Arithmetic Exception Handled");
			 
		  }
		  
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  System.out.println("ArrayIndexOutOfBoundsException Handled");
			  
		  }
		  
		  catch(NullPointerException e)
		  {
			  System.out.println("NullPointerException Handled");
			   
		  }
		  
		  catch(NumberFormatException e)
		  {
			  System.out.println("NumberFormatException  Handled");
			  }
			   */
		 
		  
		
		  
		  
		  
		

	}

}
