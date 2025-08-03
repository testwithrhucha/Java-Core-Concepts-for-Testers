package com.string;

import java.util.Arrays;

public class ReverseOfString {

	public static void main(String[] args) {
	     // Approach 1 : by using string methods length()+ concat() + CharAt()
		String s="Selenium";
	    String rev=" ";
	    
	    for(int i=s.length()-1;i>=0;i--)
	    {
	    	rev=rev+s.charAt(i);
	    }
	    
	    System.out.println("Reversed Array is :" +rev);

	    
	    
	    // Approach 2  : by converting string to char Array
	    
	    String s1="welcome";
	    
	    String reverse=" ";
	    
	    char a[]=s1.toCharArray();
	    System.out.println(Arrays.toString(a));
	    
	    for(int j=a.length-1;j>=0;j--)
	    {
	    	
	    	reverse=reverse+a[j];
	    	
	    }
	    
	    System.out.println("Reversed array is :"+reverse);
	    
	    
	    // approach 3 using  stringbuffer() builtIn method
	    
	    StringBuffer s3=new StringBuffer ("Rhucha");
	    System.out.println(s3.reverse());
	    
	    // // approach 4 using  stringBuilder() builtIn method
	    
	    StringBuilder s4=new StringBuilder ("Rhucha");
	    System.out.println(s4.reverse());
	    
	    
	    
	}

}
