package com.Array.java;

import java.util.Arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		//sorting numbers in array
		int a[]= {34,8,29,30,89,91,20,49};
		
		System.out.println("Before sorting an array:"+Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After Sorting an array:"+Arrays.toString(a));
		
		
		//sorting string in array
		
		String arr[]= {"A","K","L","Z","P","Q","U"};
		
		System.out.println("Array before sorting:"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Array After sorting:"+Arrays.toString(arr));
		
		

	}

}
