package com.Array.java;

import java.util.Arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];// declaration or syntax of an array
		a[0]=34;//assign value to each index or add value in array
		a[1]=45;
		a[2]=73;
		a[3]=93;
		a[4]=29;
		System.out.println(a[0]);// Retrieve single value from array
		
		
		int arr[]= {34,56,38,56,89};// another approach of declaring array
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		// retrieve multiple values from array 
		
		// method 1 ;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//method 2 
		
		System.out.println(Arrays.toString(a));
		
		// method 3 ----------> Enhanced for loop or for each loop
		
		for (int x:a)
		{
			System.out.println(x);
		}

	}

}
