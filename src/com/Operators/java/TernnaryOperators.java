package com.Operators.java;

public class TernnaryOperators {

	public static void main(String[] args) {
		
		// Syntax : variable= (expression)? res1:res2  --> if the exp is true res1 is assign to variable if exp is false res2 is assign to variable 
		
		// Example 1 :
		
		byte person_age=34;
		
		String res=(person_age>18)? "Eligible for vote" : "Not Eligible for vote";
		
		System.out.println(res);
		
		// Example 2 :
		
		byte n1=30,n2=78;
		
		 int ress=(n1>n2)? n1:n2 ;
		 
		 System.out.println(ress); 
		 
		//Task 1 : Swapping number using arithmetic expression and variable 
		 
		 int k=10,j=30;
		 
		 k=k+j;
		 j=k-j;
		 k=k-j;
		 
		 System.out.println("after Swapping k is"+k);
		 System.out.println("after swapping j is ;"+j);
		 
		
		
		
		
		
		
		
 
	}

}
