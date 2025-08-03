package com.LoopingStatement;

public class WhileLoop {

	public static void main(String[] args) {
	
		//example 1
      int i=1; // initialization
      while(i<=10)// condition
      {
    	  System.out.println(i);
    	  i++; //increment
    	  
    	  
      }
      
      //example 2 
      int j=1;
      while(j<=15)
      {
    	System.out.println("hello world"); 
    	j++;
      }
      
      // print even numbers
      
      int s=2;
      while(s<=10)
      {
    	  System.out.println(s);
    	  s+=2;
      }
      
      
		/*
		 * int k=1; while(k<=10) 
		 * {
		 *  if(k%2==0)  //for odd if(k%2==1)
		 *  {
		 *   System.out.println(k);
		 *    }
		 *     k++;
		 * }
		 */
      
      // print odd number
      
      int k=1;
      while(k<=10)
      {
    	  System.out.println(k);
    	  k+=2;
    	  
      }
      
      // 1 to numbers in descending order
      
      byte a=10;
      while(a>=1)
      {
    	  System.out.println(a);
    	  a--;
      }
      
		/*
		 * while(2==2) { System.out.println("Heloo"); this will print hello infinite
		 * time so we have to make the condition false after certain point by adding
		 * increment and decrement }
		 */

	}

}
