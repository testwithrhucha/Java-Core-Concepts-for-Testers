package com.Collections.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration 
		// For Heterogeneous data 
		
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		
		//For Homogeneous data
		
		//ArrayList <Integer>mylist=new ArrayList<Integer>();// it stores same type of data which is integer
		//ArrayList<String>mylist=new Arraylist<String>();
		
		
		// Adding Data into ArrayList
		
		mylist.add(100);
		mylist.add(23.45);
		mylist.add("John");
		mylist.add('A');
		mylist.add(500);
		mylist.add(true);
		mylist.add(100);// multiple duplicate value allowed
		mylist.add(null);// multiple null value allowed
		
		// printing arrayList
		
		System.out.println("data in ArrayList is :" +mylist);
		
		// size or length of ArrayList
		
		System.out.println("Length of ArrayList is : "+mylist.size());
		
           // remove object from ArrayList
		
		mylist.remove(6);
		System.out.println("Arraylist after removing object from index 6:"+mylist);
	}

}
