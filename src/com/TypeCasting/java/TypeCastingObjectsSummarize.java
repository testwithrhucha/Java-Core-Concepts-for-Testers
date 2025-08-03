package com.TypeCasting.java;


//A b=(C) d;

public class TypeCastingObjectsSummarize {

	public static void main(String[] args) {
		
		//Ex1:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o;  //Rule1-yes  Rule2 -yes  Rule3 -failed
		
		//Ex2:
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s; //Rule1 -failed
		
		
		//Ex3:
		//Object o=new String("welcome");
		//StringBuffer sb=(String) o;   //Rule1-passed  Rule2-failed
		
		//Ex4:
		//String s=new String("welcome");
		//StringBuffer sb=(String) s;   //Rule1-passed  Rule2-failed
		
		//EX5:
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o;  //Rule1- passed  Rule2- passed  Rule3-failed
		
		//Ex6:
		Object o=new String("welcome");
		String s=(String) o;  //Rule1-passed  Rules2-passed Rule3-passed
		
		System.out.println(s);
	}

}





