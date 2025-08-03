package com.Polymorphism.java;

public class CallByReference {



			public static void main(String[] args) {
				
				Test test=new Test();
				
				test.number=100;

				System.out.println("value before method"+test.number);
				
				test.m2(test);
				
				System.out.println("value of method:"+ test.number);
			}

		

	}


