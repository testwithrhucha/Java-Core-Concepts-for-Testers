package com.ControlStatements;

public class ConditionalStatements {

	public static void main(String[] args) {
		// 1.if statement
		 
		byte age=45;
		
		if(age>18)
		{
			System.out.println("Person is eligible for voting");
		}
		
		// 2. else if 
		// example 1
		byte marks=45;
		 if(marks>90)
		 {
			 System.out.println("student is eligible for Scholarship");
			 
		 }
		 
		 else
		 {
			 System.out.println("Student is not eligible for scholarship");
		 }
		 
		 // Nested if else
		 
		 // example 2 
		  byte num=17;
		  
		  if (num<0)
		  {
			  System.out.println("Number is Negative");
		  }
		  
		  else if(num>0)
		  {
			  System.out.println("Number is positive");
			  
		  }
		  
		  else 
			  
		  {
			  System.out.println("Number is Zero");
		  }
		  /*
		  // example 3 
		  
		  byte a=20,b=45,c=24;
		  
		  if(a>b && a>c)
		  {
			System.out.println("A is a largest Number");  
		  }
		  
		  else if(b>a && b>c)
		  {
			  System.out.println("B is largest number");
		  }
		  
		  else
		  {
			  System.out.println("C is largest number");
		  }
	*/
	
		  
		  // nested if else  : 
		  
		  /*
		   * example 4
		  if(1==1)

		  {

		  if(2==1)

		  {

		  System.out.println("ABC");

		  } 

		  }

		  else

		  {

		  if(3==3)

		  {

		  System.out.println("XYZ");

		  }
		  }
		  
	
	*/
		  
		  // example 5 if else ladder
		  
		  int no = 6;
		  
		  
		  if (no==1)
		  {
			  System.out.println("Monday");
		  }
		  
		  else if(no==2)
		  {
			  System.out.println("Tuesday");
		  }
		  else if(no==3)
		  {
			  System.out.println("Wednesday");
		  }
		  else if(no==4)
		  {
			  System.out.println("Thursday");
		  }
		  
		  else if(no==5)
		  {
			  System.out.println("Friday");
		  }
			  
		else if(no==6)
			  {
				  System.out.println("Saturday");
		  }
		  
		else
		{
			System.out.println("Invalid Number");
		}
		  
		  // switch case example 1 : if numbers
		  byte weekno=3;
		  
		  switch(weekno)
		  {
		  case 1:System.out.println("Sunday");
		    break;
		  case 2: System.out.println("Monday");
		  break;
		  
		  case 3:System.out.println("Tuesday");
		    break;
		  case 4: System.out.println("Wednesday");
		  break;
		  case 5:System.out.println("Thursday");
		    break;
		  case 6: System.out.println("Friday");
		  break;
		  case 7:System.out.println("Saturday");
		    break;
		  default: System.out.println("Invalid choice");
		 
		  
		  }

		 //example 2 : if characters
		  
char ch='W';
		  
		  switch(ch)
		  {
		  case 'S':System.out.println("saturday,Sunday");
		    break;
		  case 'M': System.out.println("Monday");
		  break;
		  
		  case 'T':System.out.println("Tuesday,Thursday");
		    break;
		    
		  case 'W': System.out.println("Wednesday");
		  break;
		  
		  case 'F': System.out.println("Friday");
		  break;
		 
		  default: System.out.println("Invalid choice");
		 
		  
		  }
		//largest of two numbers
			
			int n1=34,n2=56;
			if(n1>n2)
			{
				System.out.println("Number 1 is greater");
			}
			
			else 
			{
				System.out.println("Number 2 is greater");
			}
			
			//smallest number of three number
			
			byte l=45,m=34,s=89;
			if(l<m && l<s)
			{
				System.out.println("l is smallest number");
			}
			
			else if(m<l && m<s)
			{
				System.out.println("m is smallest number");
			}
			
			else 
			{
				System.out.println("s is smallest number");
			}
			
			
		  
	}
	
	
	
}
	