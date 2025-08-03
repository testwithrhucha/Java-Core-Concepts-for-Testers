package com.MethodOverLoadingVsOverRiding_SuperKeyword_FinalKeyword;


class a{
	 
   final int x=100;
}



public class FinalKeyword {

	public static void main(String[] args) {
		
		a a1=new a();
		
		//a1.x=200;  we cannot change the value of x due to final keyword
		System.out.println(a1.x);
		

	}

}
