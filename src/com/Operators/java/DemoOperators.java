package com.Operators.java;

public class DemoOperators {

	public static void main(String[] args) {
		// Arithmetic operators + , - , * , /, % etc
		
		// 1. + addition
        byte a=10;
        byte b=30;
        System.out.println("Sum of a and b is: "+(a+b));
        
        // 2. - Subtraction
        byte c=10;
        byte d=30;
        System.out.println("Sub of c and d is: "+(c-d));
        
        // 3. * multiplication
        
        byte num1=100;
        byte num2=37;
        System.out.println("Mul of num1 and num2 is: "+(num1*num2));
        
        // 4. / div 
        
        byte n1=25;
        byte n2=5;
        System.out.println("div of two numbers is :"+(n1/n2));
        
        // 5. % modulo 
        
        short f=356;
        short h=134;
        System.out.println("Modulo div of f and h is :"+(f%h));
        
        // Relational Operators or comparison operators 
        // Returns boolean values always -- true or false
        
        // 1.> greater than
        System.out.println(a>b);
        
        // 2.< smaller than
        System.out.println(a<b);
        
        // 3.<= smaller than equal to
        System.out.println(c<=d);
        
        // 4.< greater than eqaul to 
        System.out.println(a>=b);
        
        // 5.== equal to ---> here = is a assign operator which assign the value to the variable
        System.out.println(a==b);
        
        // 6.!= not equal to
        System.out.println(a!=b);
        
        // Logical operator  && , \\, !
        // works only boolean values 
        
        boolean x=true,y=false;
        // && 
        System.out.println(x&&y);
        // || 
        System.out.println(x || y);
        // ! 
        System.out.println(!x);
        System.out.println(!y);
        
        
        boolean j=true,k=true;
        // && 
        System.out.println(j&&k);
        // || 
        System.out.println(j || k);
        // ! 
        System.out.println(!j);
        System.out.println(!k);
        
        // another example 
        
        boolean b1=25>4;
        System.out.println(b1);
        boolean b2= 45<23;
        System.out.println(b2);
        
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        
        System.out.println(!(b1));
        
        System.out.println(!(b2));
        
        
        
        
        
 
        
	}

}
