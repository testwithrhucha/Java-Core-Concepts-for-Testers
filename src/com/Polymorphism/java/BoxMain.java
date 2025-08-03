package com.Polymorphism.java;

public class BoxMain {

public static void main(String[] args) {
		
		//Box b=new Box(); //1
			
		Box b=new Box(5.0,5.5,5.7);//2
	
		//Box b=new Box(10.5); //3
		
		System.out.println(b.volume());
		
		

	}


}
