package com.string;

public class StringVsStringBuilderVsStringBuffer {

	public static void main(String[] args) {
          
		
		//string   string are immutable  can not be change
		// ex 1 
		String s1="welcome";
		
		s1.concat("to java");
		
		System.out.println(s1);
		// ex 2
		String s="welcome";
		String s2= s.concat("To java");//when we want to change the value of string we cant directly change it we have to create another variBLE TO store the value after changing
		// we cant directly write like this   s.concat("To java");
		 System.out.println(s2);  
		 
		 
		 //stringBuilder  mutable
		 
		 StringBuilder str=new StringBuilder ("welcome");
		 
		 str.append("To java");
		 
		 System.out.println(str); // it is mutable can be change // in this we dont have to use another variable to store new string it it change at the same location in the memory 
		
		 // StringBuffer      mutable
		 
         StringBuffer str1=new StringBuffer ("welcome");
		 
		 str1.append("To java");
		 
		 System.out.println(str);
		 

	}

}
