package com.TypeCasting.java;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//Type casting is converting one type of data into another
		// 1. Up Casting /widening------smaller to larger
		// Example 1  int ------long
		int invalue=200;
		long longvalue =invalue;
		System.out.println(longvalue);
		
		float floatvalue=45.6f;
		double doublevalue=floatvalue;
		System.out.println(doublevalue); // it is automatic we dont have to change manually
		
		
		// 2. Down Casting /narrowing        larger-------smaller
		// Example 1   long to int 
		
		long l=34510;
		int i=(int)l; 
		System.out.println(i);// it is manual process first we have to convert large data into small then store it into smaller 
		
		// Example 2
		double d=45.6734;
		float f=(float)d;
		System.out.println(f);
		
		
		// int to double 
		
		int i1=56;
		double db=i1;
		System.out.println(db);
		
		
		// double to int 
		
		double d1=56.78334;
		int i2=(int)d1;
		System.out.println(i2);
		
		
		
		
		
		

	}

}
