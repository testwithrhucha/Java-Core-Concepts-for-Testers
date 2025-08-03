package com.Operators.java;

public class DecrementOperator {

	public static void main(String[] args) {
		

	

				
				
				//Example 1
				int a=10;
				//a=a-1;
				//instead of this we can use the decrement operator
				a--;
				System.out.println(a);
				
				//Example 2 
				
				int b=34;
				--b;
				System.out.println(b);
				
				//Example 3
				//When we want to assign the value of one variable to another variable
			    int c=56;
			    int result=c--;
			    System.out.println(result);//output is 56 beacause see the next example
			    
			    // Types of decrement Operator 
			    //1.Post Increment : In this first value is assign to next variable then decrement so it will give the first value 
				
			    int d=56;
			    int res=d--;
			    System.out.println(res);
			    
			    // 2.Pre decrement :In this first value is decrement  then assign to next variable  
				
			    
			    int e=678;
			    int num=--e;
			    System.out.println(num);
			    
			    // Note : pre decrement and Post decrement is decrement the value always but when it times to we store it in another variable it will be different like above
			    
			}
}

		

	


