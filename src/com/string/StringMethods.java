package com.string;

public class StringMethods {

	public static void main(String[] args) {
	//Define a String
		
		//1
		String s="Welcome";
		//2 
		
		String s1=new String("java");
		
		//String methods
		// 1. length()
		
		System.out.println("Length of string is :"+s.length());
		System.out.println("Length of string is :"+s1.length());
		
		// 2. Concat() - join strings
		
		System.out.println(s+s1); // using + operator 
		
		System.out.println(s.concat(s1));// using concat() method
		
		String s2="Tutorial";
		
		System.out.println(s.concat(s1).concat(s2));
		
		// 3.trim()  it remove left and right empty spaces from the string but not remove middle spaces
		
		String s3="    Its Java   ";
		
		System.out.println("Before Trimming length of string:" +s3.length());
		
		String s4=s3.trim();
		
		System.out.println("After trimming the length of string :" +s4.length());
		
		// 4.charAt() returns the character based on index
		
		System.out.println(s1.charAt(3));
		
		// 5.contains()  it checks the substring is part of main string or not 
		// it gives output in true or false
		
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("seme"));
		System.out.println(s.contains("wel")); // false because it is case sensitive
		
		// 6.equal() and equalIgnoreCase()

		String name="rhucha";
		String Name="Rhucha";
		
		// equal() don't support case sensitivity where 
		
		System.out.println(name.equals(Name));// returns true or false // return false 
		
		System.out.println(name.equalsIgnoreCase(Name));// return true
		
		// 7.replace()   it replace single char in string or sequence of char in string 
		
		String s5="Welcome to Automation Testing ";
		
		 System.out.println(s5.replace('e', 'X'));
		 
		 System.out.println(s5.replace("to", "To"));
		 
		 
		 String amount="$345,8923,56";
		 
		 System.out.println(amount.replace("$", "").replace(",", ""));
		 
		 // 8.substring        extract substring from main string 
		 
		 
		 String j="Autoamtion Engineering";
		 
		System.out.println(j.substring(2,6));  
		//first index is beginning and then next index is ending 
		// first index is starting from 0 and then next index is starting from 1 
		
		
		//9. toUppercase      toLowercase  - converting case
		
		String k="Testing";
		System.out.println(k.toLowerCase());
		
		String l="Testing";
		
		System.out.println(l.toUpperCase());
		
		
		//split()  split and divides the string by providing delimiter
		// * % ( ) ^ & - we not use as a delimiter
		
		
		//ex 1 
		String gmail="xyz@gmail.com";
		String m []=gmail.split("@");
		System.out.println(m[0]);
		System.out.println(m[1]);
		
		// ex 2 
		
		String a1="abc,xyz@gmail";
		
		String a2[]=a1.split(",");
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		String a3[]=a2[1].split("@");
		
		System.out.println(a3[0]);
		System.out.println(a3[1]);
		
		// ex 3 
		
		String str="xyz@gmail.com";
		
		String arr[]=str.split("@");
		System.out.println(arr[0]);
		System.out.println(arr[1].split(".") );
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
