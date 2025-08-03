package com.JumpingStatements;

public class Continuestatement {

	public static void main(String[] args) {
		
		//example 1 
		 /*for(byte i=1;i<=10;i++)
		 {
			 if(i==3)
			 {
				 continue;// it skips the condition and execute remaining statements 
			 }
			 System.out.println(i);
			 */
			 // example 2 
			/* for(byte j=1;j<=10;j++)
			 {
				 if(j==3 || j==4||j==7)// here we can't use and operator because the condition of if statement will be false 
				 {
					 continue;// it skips the condition and execute remaining statements 
				 }
				 System.out.println(i);*/
				 
				 // Task 1 : Reverse a number -----------> input: 1234 output: 4321
			       
					/*
					 * int num=1234; int res; int reversedNumber=0; while (num!=0) {
					 * 
					 * res=num%10; reversedNumber=reversedNumber*10+res; num/=10;
					 * 
					 * } System.out.println("ReversedNumber:"+reversedNumber);
					 */
				 // task 2 : Number is Palindrome or not 
				 
				 int no=121;
				 int OriginalNumber=no;
				 int remainder;
				 int reverseNumber=0;
				 while (no!=0)
				 {
					 
					   remainder= no%10;
					  reverseNumber=reverseNumber*10+remainder;
					  no/=10;
					  	 
				 }
				 System.out.println("ReversedNumber:"+reverseNumber);
				 
				 if(reverseNumber==OriginalNumber)
				 {
					 System.out.println("Number is palindrome");
				 }
				 
				 else {
					 System.out.println("Number is not palindrome");
				 }
				 
				 
		 }
	}



