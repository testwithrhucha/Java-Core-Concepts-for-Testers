package com.Encapsulation.java;

public class StaticKeyword {


	static int a = 30; // static variable
	int b = 45; // nonstatic variable

	static void m1() {
		System.out.println("this is static method ");
	}

	void m2() {
		System.out.println("This is non static method ");
	}
	
	
	
	void m3()
	{
		System.out.println(a); // non static method can access static and non static methods and variables directly 
		System.out.println(b);
		m1();
		m2();
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(a); m1(); // we can access direct static variable and
	 * method inside the main method without create object
	 * 
	 * System.out.println(b); m2(); we cannot access without object b coz this are
	 * not static variable and method }
	 * 
	 * // we have to create object  for non static variable and method 
	 * 
	 * StaticKeyword s=new StaticKeyword();
	 * s.a;
	 * s.m2();
	 * 
	 * 
	 * 
	 * note : main method is static 
	 */

}
