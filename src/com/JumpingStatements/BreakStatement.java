package com.JumpingStatements;

public class BreakStatement {

	public static void main(String[] args) {
		//example 1 
		 for(byte i=1;i<=10;i++)
		 {
			 if(i==3)
			 {
				 break;
			 }
			 System.out.println(i);
		 }
		 
		 System.out.println("___________________________");
		 //example 2
		 for(byte i=2;i<=100;i+=2)
		 {
			 if(i==78)
			 {
				 break;
			 }
			 System.out.println(i);
		 }
	}

}
